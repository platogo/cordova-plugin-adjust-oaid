package com.platogo.adjust.oaid;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

public class AdjustOAID extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("readOaid")) {
            this.readOaid(callbackContext);
            return true;
        }
        return false;
    }

    private void readOaid(CallbackContext callbackContext) {
        try {
            com.adjust.sdk.oaid.AdjustOaid.readOaid(this.cordova.getActivity().getApplicationContext());
            callbackContext.success("success");
        } catch (Exception e) {
            callbackContext.error(e.getMessage());
        }
    }
}
