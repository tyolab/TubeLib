package com.tyolab.tubelib;

/**
 * Created by "Eric Tang (dev@tyo.com.au)" on 21/1/17.
 */

public class ItemBase {

    protected String bgImageUrl;

    protected String cardImageUrl;

    public String getBackgroundImageUrl() {
        return bgImageUrl;
    }

    public void setBackgroundImageUrl(String bgImageUrl) {
        this.bgImageUrl = bgImageUrl;
    }

    public String getCardImageUrl() {
        return cardImageUrl;
    }

    public void setCardImageUrl(String cardImageUrl) {
        this.cardImageUrl = cardImageUrl;
    }

}