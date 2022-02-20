function doGet() {
  var html = HtmlService.createHtmlOutputFromFile('index');
  return html.setXFrameOptionsMode(HtmlService.XFrameOptionsMode.ALLOWALL);
}


function uploadFiles(data)
{
 var file = data.myFile;
 var folder = DriveApp.getFolderById('1IxMiswEfi67ovoBf8ZH1RV7qVPx1Ks6l');
 var createFile = folder.createFile(file);
 return createFile.getUrl();
}
