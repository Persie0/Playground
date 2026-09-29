package com.lingq.core.network.api.result;

import p000.ey8;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultCollectionSubscription {
    public static final C1790z0 Companion = new C1790z0();

    /* JADX INFO: renamed from: a */
    public final int f20783a;

    public /* synthetic */ ResultCollectionSubscription(int i, int i2) {
        if ((i & 1) == 0) {
            this.f20783a = 0;
        } else {
            this.f20783a = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultCollectionSubscription) && this.f20783a == ((ResultCollectionSubscription) obj).f20783a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20783a);
    }

    public final String toString() {
        return ux5.m22989l("ResultCollectionSubscription(id=", this.f20783a, ")");
    }
}
