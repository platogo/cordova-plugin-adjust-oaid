var exec = require("cordova/exec");

exports.readOaid = function () {
  exec(
    function callback(data) {},
    function errorHandler(err) {},
    "AdjustOAID",
    "readOaid"
  );
};
