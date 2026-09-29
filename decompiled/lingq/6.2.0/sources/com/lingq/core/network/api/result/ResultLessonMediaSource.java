package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultLessonMediaSource {
    public static final C1791z1 Companion = new C1791z1();

    /* JADX INFO: renamed from: a */
    public final String f21090a;

    /* JADX INFO: renamed from: b */
    public final String f21091b;

    /* JADX INFO: renamed from: c */
    public final String f21092c;

    public /* synthetic */ ResultLessonMediaSource(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21090a = null;
        } else {
            this.f21090a = str;
        }
        if ((i & 2) == 0) {
            this.f21091b = null;
        } else {
            this.f21091b = str2;
        }
        if ((i & 4) == 0) {
            this.f21092c = null;
        } else {
            this.f21092c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonMediaSource)) {
            return false;
        }
        ResultLessonMediaSource resultLessonMediaSource = (ResultLessonMediaSource) obj;
        return fa4.m11650l(this.f21090a, resultLessonMediaSource.f21090a) && fa4.m11650l(this.f21091b, resultLessonMediaSource.f21091b) && fa4.m11650l(this.f21092c, resultLessonMediaSource.f21092c);
    }

    public final int hashCode() {
        String str = this.f21090a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21091b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21092c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultLessonMediaSource(type=", this.f21090a, ", name=", this.f21091b, ", url="), this.f21092c, ")");
    }
}
