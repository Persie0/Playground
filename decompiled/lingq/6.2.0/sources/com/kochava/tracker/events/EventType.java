package com.kochava.tracker.events;

/* JADX INFO: loaded from: classes2.dex */
public enum EventType {
    ACHIEVEMENT("Achievement"),
    AD_CLICK("Ad Click"),
    ADD_TO_CART("Add to Cart"),
    ADD_TO_WISH_LIST("Add to Wish List"),
    AD_VIEW("Ad View"),
    CHECKOUT_START("Checkout Start"),
    CONSENT_GRANTED("Consent Granted"),
    DEEPLINK("_Deeplink"),
    LEVEL_COMPLETE("Level Complete"),
    PURCHASE("Purchase"),
    PUSH_OPENED("Push Opened"),
    PUSH_RECEIVED("Push Received"),
    RATING("Rating"),
    REGISTRATION_COMPLETE("Registration Complete"),
    SEARCH("Search"),
    START_TRIAL("Start Trial"),
    SUBSCRIBE("Subscribe"),
    TUTORIAL_COMPLETE("Tutorial Complete"),
    VIEW("View");


    /* JADX INFO: renamed from: a */
    private final String f14114a;

    EventType(String str) {
        this.f14114a = str;
    }

    public final String getEventName() {
        return this.f14114a;
    }
}
