function doGet() {
  var html = HtmlService.createHtmlOutputFromFile('index');
  return html.setXFrameOptionsMode(HtmlService.XFrameOptionsMode.ALLOWALL);
}


function uploadFiles(data)
{
 var file = data.myFile;
 var folder = DriveApp.getFolderById('1PA2iwq01QCHAXqyXEC7Xp9poRscRvsvU');
 var createFile = folder.createFile(file);
 return createFile.getUrl();
}
