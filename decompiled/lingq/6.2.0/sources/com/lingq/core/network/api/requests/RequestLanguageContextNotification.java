package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestLanguageContextNotification {
    public static final C1608x Companion = new C1608x();

    /* JADX INFO: renamed from: a */
    public String f20372a;

    /* JADX INFO: renamed from: b */
    public final String f20373b;

    public /* synthetic */ RequestLanguageContextNotification(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f20372a = null;
        } else {
            this.f20372a = str;
        }
        if ((i & 2) == 0) {
            this.f20373b = null;
        } else {
            this.f20373b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8251a(String str) {
        this.f20372a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestLanguageContextNotification)) {
            return false;
        }
        RequestLanguageContextNotification requestLanguageContextNotification = (RequestLanguageContextNotification) obj;
        return fa4.m11650l(this.f20372a, requestLanguageContextNotification.f20372a) && fa4.m11650l(this.f20373b, requestLanguageContextNotification.f20373b);
    }

    public final int hashCode() {
        String str = this.f20372a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20373b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("RequestLanguageContextNotification(lotd=", this.f20372a, ", weekly=", this.f20373b, ")");
    }

    public RequestLanguageContextNotification() {
        this.f20372a = null;
        this.f20373b = null;
    }
}
