var express = require('express');
var app = express();
var path = require('path');

//app.get('/', function (req, res) {
//  res.send('Hello World!');
//});
//

app.get('/', function(req, res) {
    res.sendFile(path.join(__dirname + '/index.html'));
});

app.listen(4200, function () {
  console.log('Example app listening on port 4200!');
});