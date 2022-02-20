function doGet() {
  var html = HtmlService.createHtmlOutputFromFile('index');
  return html.setXFrameOptionsMode(HtmlService.XFrameOptionsMode.ALLOWALL);
}


function uploadFiles(data)
{
 var file = data.myFile;
 var folder = DriveApp.getFolderById('1Ac77-Y2mCPxd4mgTW0IWpqX3lepl0pRE');
 var createFile = folder.createFile(file);
 return createFile.getUrl();
}
