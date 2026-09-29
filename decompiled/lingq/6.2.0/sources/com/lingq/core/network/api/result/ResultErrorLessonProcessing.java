package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultErrorLessonProcessing {
    public static final C1662h1 Companion = new C1662h1();

    /* JADX INFO: renamed from: a */
    public final String f20842a;

    /* JADX INFO: renamed from: b */
    public final String f20843b;

    /* JADX INFO: renamed from: c */
    public final String f20844c;

    public /* synthetic */ ResultErrorLessonProcessing(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20842a = null;
        } else {
            this.f20842a = str;
        }
        if ((i & 2) == 0) {
            this.f20843b = null;
        } else {
            this.f20843b = str2;
        }
        if ((i & 4) == 0) {
            this.f20844c = null;
        } else {
            this.f20844c = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8356a() {
        return this.f20844c;
    }

    /* JADX INFO: renamed from: b */
    public final String m8357b() {
        return this.f20842a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultErrorLessonProcessing)) {
            return false;
        }
        ResultErrorLessonProcessing resultErrorLessonProcessing = (ResultErrorLessonProcessing) obj;
        return fa4.m11650l(this.f20842a, resultErrorLessonProcessing.f20842a) && fa4.m11650l(this.f20843b, resultErrorLessonProcessing.f20843b) && fa4.m11650l(this.f20844c, resultErrorLessonProcessing.f20844c);
    }

    public final int hashCode() {
        String str = this.f20842a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20843b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20844c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultErrorLessonProcessing(isLocked=", this.f20842a, ", status=", this.f20843b, ", errorType="), this.f20844c, ")");
    }
}
