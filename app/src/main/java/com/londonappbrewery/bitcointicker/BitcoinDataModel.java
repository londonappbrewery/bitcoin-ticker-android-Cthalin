package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by eslowikowski on 22.06.2017.
 */

public class BitcoinDataModel {

    private String price;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){
        try{
            BitcoinDataModel bitcoinData = new BitcoinDataModel();
            bitcoinData.price = jsonObject.getString("ask");

            return bitcoinData;

        } catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public String getPrice() {
        return price;
    }
}
