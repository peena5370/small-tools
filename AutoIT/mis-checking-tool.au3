#include <ButtonConstants.au3>
#include <ComboConstants.au3>
#include <EditConstants.au3>
#include <GUIConstantsEx.au3>
#include <GuiComboBoxEx.au3>
#include <StaticConstants.au3>
#include <WindowsConstants.au3>
#include <MsgBoxConstants.au3>
#include <StringConstants.au3>
#include <File.au3>
#include <Date.au3>

Global $x, $cus, $SN, $pn, $Tester, $Process, $mdate, $mtime

##Region ### START Koda GUI section ###

$Form1 = GUICreate("MES TIS", 400, 160, 860, 350)
$Label1 = GUICtrlCreateLabel("Customer : ", 15, 8, 100, 28, $SS_RIGHT)
GUICtrlSetFont(-1, 14, "MS Sans Serif")
$Combo1 = GUICtrlCreateCombo("Avigilon", 115, 8, 165, 25)
GUICtrlSetFont(-1, 12, "MS Sans Serif")
$Label2 = GUICtrlCreateLabel("P/N : ", 15, 46, 100, 28, $SS_RIGHT)
GUICtrlSetFont(-1, 14, "MS Sans Serif")
$Combo2 = GUICtrlCreateCombo("PHC215001E0-N", 115, 46, 165, 25)
GUICtrlSetFont(-1, 12, "MS Sans Serif")
$Label3 = GUICtrlCreateLabel("Serial : ", 15, 84, 100, 28, $SS_RIGHT)
GUICtrlSetFont(-1, 14, "MS Sans Serif")
$Input1 = GUICtrlCreateInput("", 115, 84, 165, 28) 
GUICtrlSetFont(-1, 12, 400, 0, "MS Sans Serif")
$Label4 = GUICtrlCreateLabel("Process : ", 15, 122, 100, 28, $SS_RIGHT)
GUICtrlSetFont(-1, 14, "MS Sans Serif")
$Combo3 = GUICtrlCreateCombo("AOI_B", 115, 122, 75, 25)
GUICtrlSetFont(-1, 12, "MS Sans Serif")
$Combo4 = GUICtrlCreateCombo("", 195, 122, 40, 25)
GUICtrlSetFont(-1, 12, "MS Sans Serif")
$Input3 = GUICtrlCreateInput("", 240, 122, 40, 25)
GUICtrlSetFont(-1, 12, "MS Sans Serif")

$Button1 = GUICtrlCreateButton("TIS", 290, 8, 100, 65)
GUICtrlSetFont(-1, 18, 800, 0, "Ravie")
GUICtrlSetBkColor(-1, 0x0080FF)
$Button2 = GUICtrlCreateButton("PASS", 290, 83, 100, 65)
GUICtrlSetFont(-1, 18, 800, 0, "Ravie")
GUICtrlSetBkColor(-1, 0x00FF00)
GUISetState(@SW_SHOW)

#EndRegion ### END Koda GUI section ###




addCus()
divNumb()
addRoute()

While 1
	$nMsg = GUIGetMsg()
		Switch $nMsg
		Case $Button1
			$x += 1
			$SN = GUICtrlRead($Input1)
				If $SN = "1" Then
					GUICtrlSetState($Input1, $GUI_FOCUS)
					result_status()
				Else
					checkTIS()
				EndIf
			Case $Combo2
				updateVal()
			Case $GUI_EVENT_CLOSE
				Exit
		EndSwitch
	WEnd

;~ ******************************************************************
;~ *	Adding data list to GUI boxes
;~ *	Function name : addCus(), addRoute(), divNumb()
;~ *
;~ ******************************************************************

Func addCus()
	Local $custFile = FileOpen(@ScriptDir & "\customer.txt", 0)
	For $i = 1 To _FileCountLines($custFile)
		$line = FileReadLine($custFile, $i)
		GUICtrlSetData($Combo1, $line)
	Next
EndFunc

Func addRoute()
	Local $routeFile = FileOpen(@ScriptDir & "\process.txt", 0)
	For $i = 1 To _FileCountLines($routeFile)
		$line = FileReadLine($routeFile, $i)
		GUICtrlSetData($Combo3, $line)
	Next
EndFunc

Func divNumb()
	Local $routeFile = FileOpen(@ScriptDir & "\divNumb.txt", 0)
	For $i = 1 To _FileCountLines($routeFile)
		$line = FileReadLine($routeFile, $i)
		GUICtrlSetData($Combo2, $line)
	Next
EndFunc

;~ ******************************************************************
;~ *	Functional for reset, read and update GUI info
;~ *	Function name : resetPanel(), resetSN(), updateVal()
;~ *
;~ ******************************************************************

Func resetPanel()
	$x = 0
	GUICtrlSetData($Input3,$x)
EndFunc

Func resetSN()
	$x -= 1
EndFunc

;~ A little bit buggy, need to select all combobox then the value will be correct
Func updateVal()
	Local $sPartNum = FileReadToArray(@ScriptDir & "\config.txt")
	If @error Then
		MsgBox($MB_SYSTEMMODAL, "", "There was an error reading the file. @error: " & @error)
	Else
		$pn = GUICtrlRead($Combo2)
		For $i = 0 To UBound($sPartNum) -1
			Local $aArray = StringRegExp($sPartNum[$i], '(.+)\=(\d+)', $STR_REGEXPARRAYFULLMATCH)
			If $pn = $aArray[1] Then
				GUICtrlSetData($Combo4, $aArray[2])
			EndIf
		Next
	EndIf
EndFunc

;~ ******************************************************************
;~ *	Functional for check barcode, output messages/barcode
;~ *	Function name : checkTIS(), mesStatus()
;~ *
;~ ******************************************************************

Func checkTIS()
	$cus = GUICtrlRead($Combo1)
	$SN = GUICtrlRead($Input1)
	$pn = GUICtrlRead($Combo2)
	$Tester = @ComputerName
	$Process = GUICtrlRead($Combo3)
	Local $idTestFile = FileOpen(@ScriptDir & "\CheckOkToTest.txt", 2)
	FileWriteLine($idTestFile, "[CheckOkToTest]")
	FileWriteLine($idTestFile, "SOAP address goes here")
	FileWriteLine($idTestFile, $cus)
	FileWriteLine($idTestFile, $cus)
	FileWriteLine($idTestFile, $SN)
	FileWriteLine($idTestFile, $pn)
	FileWriteLine($idTestFile, $Tester)
	FileWriteLine($idTestFile, $Process)
	FileClose($idTestFile)
	Run("CheckOkToTest.bat", @ScriptDir)
	Sleep(1200)
	GUICtrlSetState($Input1, $GUI_FOCUS)
	mesStatus()
EndFunc

Func mesStatus()
	Local $idOutputFile, $lineRevCheck1, $lineRevCheck2, $lineRevCheck3
	$idOutputFile = FileOpen(@ScriptDir & "\mesoutput.txt", 0)
	$lineRevCheck1 = FileReadLine($idOutputFile, 1)
	$lineRevCheck2 = FileReadLine($idOutputFile, 2)
	$lineRevCheck3 = FileReadLine($idOutputFile, 4)

	If $lineRevCheck3 = "PASS" Then
		GUICtrlSetBkColor($Button2, 0x00FF00)
		GUICtrlSetData($Button2, "PASS")
		result_status()
	Else
		GUICtrlSetBkColor($Button2, 0xFF0000)
		GUICtrlSetData($Button2, "FAIL")
		MsgBox("48", "MES Error!", "MES error message : " & $lineRevCheck3 & @CRLF & _
			@CRLF & "This Unit not belong to " & $Process & " !" & @CRLF)
		resetSN()
		EndIf

	FileClose($idOutputFile)
	GUICtrlSetState($Input1, $GUI_FOCUS)
EndFunc

; ************************
; barcodelist.bar creation
; ************************

Func result_status()
	$mdate = _DateTimeFormat(_NowCalc(), 2)
	$mtime = _DateTimeFormat(_NowCalc(), 3)
	$panel = GUICtrlRead($Combo4)

;~ add if...else for $x +1 if result = PASS and $x -1 if result = FAIL
		If $x < $panel + 1 Then
			If $x = 1 Then
				Local $hFileOpen = FileOpen("C:\cpi\barcode\barcodelist.bar", 2)

				FileWriteLine($hFileOpen, "#Board: " & $pn & ", " & $mdate & " " & $mtime)
				FileWriteLine($hFileOpen, " ")
				FileWriteLine($hFileOpen, "#Number Of Panel" & @TAB & "Barcode")
				FileWriteLine($hFileOpen, "Barcode#" & $x & @TAB & "*" & $SN)
				GUICtrlSetData($Input3, $x)
				FileClose($hFileOpen)
			Else
				Local $hFileOpen = FileOpen("C:\cpi\barcode\barcodelist.bar", 1)
				FileWriteLine($hFileOpen, "Barcode#" & $x & @TAB & "*" & $SN)
				GUICtrlSetData($Input3, $x)
				FileClose($hFileOpen)
			$panel = GUICtrlRead($Combo4)
			$count = GUICtrlRead($Input3)
				If  $panel= $count Then
					resetPanel()
				EndIf
			EndIf
		EndIf
	EndFunc   ;==>result_status




