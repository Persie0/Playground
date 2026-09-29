package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonMetadata {
    public static final C1617a2 Companion = new C1617a2();

    /* JADX INFO: renamed from: a */
    public final String f21093a;

    /* JADX INFO: renamed from: b */
    public final String f21094b;

    /* JADX INFO: renamed from: c */
    public final String f21095c;

    public /* synthetic */ ResultLessonMetadata(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21093a = null;
        } else {
            this.f21093a = str;
        }
        if ((i & 2) == 0) {
            this.f21094b = null;
        } else {
            this.f21094b = str2;
        }
        if ((i & 4) == 0) {
            this.f21095c = null;
        } else {
            this.f21095c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonMetadata)) {
            return false;
        }
        ResultLessonMetadata resultLessonMetadata = (ResultLessonMetadata) obj;
        return fa4.m11650l(this.f21093a, resultLessonMetadata.f21093a) && fa4.m11650l(this.f21094b, resultLessonMetadata.f21094b) && fa4.m11650l(this.f21095c, resultLessonMetadata.f21095c);
    }

    public final int hashCode() {
        String str = this.f21093a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21094b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21095c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultLessonMetadata(importLesson=", this.f21093a, ", importMethod=", this.f21094b, ", splittingMethod="), this.f21095c, ")");
    }
}
