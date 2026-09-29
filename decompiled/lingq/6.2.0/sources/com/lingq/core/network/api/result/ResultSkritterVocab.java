package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultSkritterVocab {
    public static final C1754w3 Companion = new C1754w3();

    /* JADX INFO: renamed from: a */
    public final String f21516a;

    public /* synthetic */ ResultSkritterVocab(int i, String str) {
        if ((i & 1) == 0) {
            this.f21516a = null;
        } else {
            this.f21516a = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8394a() {
        return this.f21516a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultSkritterVocab) && fa4.m11650l(this.f21516a, ((ResultSkritterVocab) obj).f21516a);
    }

    public final int hashCode() {
        String str = this.f21516a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultSkritterVocab(status=", this.f21516a, ")");
    }
}
