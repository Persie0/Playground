package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultErrorUpgrade {
    public static final C1674j1 Companion = new C1674j1();

    /* JADX INFO: renamed from: a */
    public final String f20848a;

    public /* synthetic */ ResultErrorUpgrade(int i, String str) {
        if ((i & 1) == 0) {
            this.f20848a = "";
        } else {
            this.f20848a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultErrorUpgrade) && fa4.m11650l(this.f20848a, ((ResultErrorUpgrade) obj).f20848a);
    }

    public final int hashCode() {
        return this.f20848a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultErrorUpgrade(detail=", this.f20848a, ")");
    }
}
