#include <MsgBoxConstants.au3>
#include <FileConstants.au3>

;create backup folder path
Local $sFileLocation = InputBox("Input", "Please input file location: ", "C:\XML_Backup\", "", _  
			 -1, -1, 540, 200)
Local $sFolderPath = $sFileLocation
Local $bStatus = DirCreate($sFolderPath)

;moving xml's to backup location
Local $iMoveStatus = FileMove("C:\XML\*.xml", $sFolderPath, 1)

;Display the status
If $iMoveStatus Then
	MsgBox(0, "Status", "Successful.")
Else
	MsgBox(0,"Status", "Move Failed.")
EndIf
