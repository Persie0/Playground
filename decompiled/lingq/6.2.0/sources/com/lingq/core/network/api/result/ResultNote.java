package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultNote {
    public static final C1747v2 Companion = new C1747v2();

    /* JADX INFO: renamed from: a */
    public final String f21336a;

    /* JADX INFO: renamed from: b */
    public final String f21337b;

    public /* synthetic */ ResultNote(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f21336a = "";
        } else {
            this.f21336a = str;
        }
        if ((i & 2) == 0) {
            this.f21337b = "";
        } else {
            this.f21337b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultNote)) {
            return false;
        }
        ResultNote resultNote = (ResultNote) obj;
        return fa4.m11650l(this.f21336a, resultNote.f21336a) && fa4.m11650l(this.f21337b, resultNote.f21337b);
    }

    public final int hashCode() {
        return this.f21337b.hashCode() + (this.f21336a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ResultNote(language=", this.f21336a, ", text=", this.f21337b, ")");
    }
}
