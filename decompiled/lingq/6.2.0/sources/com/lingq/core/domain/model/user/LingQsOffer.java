package com.lingq.core.domain.model.user;

import kotlin.enums.AbstractC3201a;
import p000.gm5;
import p000.ys2;
import p000.zd5;

/* JADX INFO: loaded from: classes2.dex */
public enum LingQsOffer {
    LimitOffer,
    Day;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int amount() {
        int i = zd5.f71387a[ordinal()];
        if (i == 1) {
            return 20;
        }
        if (i == 2) {
            return 5;
        }
        gm5.m12750e();
        return 0;
    }
}
