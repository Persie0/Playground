package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultPreferredTtsVoice {
    public static final C1670i3 Companion = new C1670i3();

    /* JADX INFO: renamed from: a */
    public final String f21464a;

    /* JADX INFO: renamed from: b */
    public final String f21465b;

    public /* synthetic */ ResultPreferredTtsVoice(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f21464a = null;
        } else {
            this.f21464a = str;
        }
        if ((i & 2) == 0) {
            this.f21465b = null;
        } else {
            this.f21465b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8384a() {
        return this.f21464a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8385b() {
        return this.f21465b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultPreferredTtsVoice)) {
            return false;
        }
        ResultPreferredTtsVoice resultPreferredTtsVoice = (ResultPreferredTtsVoice) obj;
        return fa4.m11650l(this.f21464a, resultPreferredTtsVoice.f21464a) && fa4.m11650l(this.f21465b, resultPreferredTtsVoice.f21465b);
    }

    public final int hashCode() {
        String str = this.f21464a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21465b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("ResultPreferredTtsVoice(url=", this.f21464a, ", voice=", this.f21465b, ")");
    }
}
