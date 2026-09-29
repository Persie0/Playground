package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultLanguageContextNotification {
    public static final C1716q1 Companion = new C1716q1();

    /* JADX INFO: renamed from: a */
    public final String f20886a;

    /* JADX INFO: renamed from: b */
    public final String f20887b;

    public /* synthetic */ ResultLanguageContextNotification(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f20886a = "";
        } else {
            this.f20886a = str;
        }
        if ((i & 2) == 0) {
            this.f20887b = "";
        } else {
            this.f20887b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguageContextNotification)) {
            return false;
        }
        ResultLanguageContextNotification resultLanguageContextNotification = (ResultLanguageContextNotification) obj;
        return fa4.m11650l(this.f20886a, resultLanguageContextNotification.f20886a) && fa4.m11650l(this.f20887b, resultLanguageContextNotification.f20887b);
    }

    public final int hashCode() {
        return this.f20887b.hashCode() + (this.f20886a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ResultLanguageContextNotification(lotd=", this.f20886a, ", weekly=", this.f20887b, ")");
    }
}
