package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultSkritterExportError {
    public static final C1748v3 Companion = new C1748v3();

    /* JADX INFO: renamed from: a */
    public final String f21515a;

    public /* synthetic */ ResultSkritterExportError(int i, String str) {
        if ((i & 1) == 0) {
            this.f21515a = null;
        } else {
            this.f21515a = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8393a() {
        return this.f21515a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultSkritterExportError) && fa4.m11650l(this.f21515a, ((ResultSkritterExportError) obj).f21515a);
    }

    public final int hashCode() {
        String str = this.f21515a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultSkritterExportError(error=", this.f21515a, ")");
    }
}
