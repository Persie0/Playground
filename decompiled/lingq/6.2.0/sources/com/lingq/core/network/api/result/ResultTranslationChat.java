package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTranslationChat {
    public static final C1677j4 Companion = new C1677j4();

    /* JADX INFO: renamed from: a */
    public final String f21607a;

    public /* synthetic */ ResultTranslationChat(int i, String str) {
        if ((i & 1) == 0) {
            this.f21607a = "";
        } else {
            this.f21607a = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8395a() {
        return this.f21607a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultTranslationChat) && fa4.m11650l(this.f21607a, ((ResultTranslationChat) obj).f21607a);
    }

    public final int hashCode() {
        return this.f21607a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultTranslationChat(translation=", this.f21607a, ")");
    }
}
