package com.lingq.core.domain.model.offer;

import kotlin.enums.AbstractC3201a;
import p000.cq6;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum OfferType {
    SPECIAL_OFFER,
    EXTENDED_SALE,
    LIMITED_TIME_OFFER,
    UNKNOWN;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final cq6 Companion = new cq6();

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
