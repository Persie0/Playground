package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.hn1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCourseForImport {
    public static final C1623b1 Companion = new C1623b1();

    /* JADX INFO: renamed from: a */
    public final int f20817a;

    /* JADX INFO: renamed from: b */
    public final String f20818b;

    public /* synthetic */ ResultCourseForImport(int i, String str, int i2) {
        this.f20817a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f20818b = null;
        } else {
            this.f20818b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCourseForImport)) {
            return false;
        }
        ResultCourseForImport resultCourseForImport = (ResultCourseForImport) obj;
        return this.f20817a == resultCourseForImport.f20817a && fa4.m11650l(this.f20818b, resultCourseForImport.f20818b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20817a) * 31;
        String str = this.f20818b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hn1.m13354d(this.f20817a, "ResultCourseForImport(id=", ", title=", this.f20818b, ")");
    }
}
