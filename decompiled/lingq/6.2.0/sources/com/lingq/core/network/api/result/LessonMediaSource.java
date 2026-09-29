package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonMediaSource {
    public static final C1672j Companion = new C1672j();

    /* JADX INFO: renamed from: a */
    public final String f20553a;

    /* JADX INFO: renamed from: b */
    public final String f20554b;

    /* JADX INFO: renamed from: c */
    public final String f20555c;

    public /* synthetic */ LessonMediaSource(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20553a = null;
        } else {
            this.f20553a = str;
        }
        if ((i & 2) == 0) {
            this.f20554b = null;
        } else {
            this.f20554b = str2;
        }
        if ((i & 4) == 0) {
            this.f20555c = null;
        } else {
            this.f20555c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonMediaSource)) {
            return false;
        }
        LessonMediaSource lessonMediaSource = (LessonMediaSource) obj;
        return fa4.m11650l(this.f20553a, lessonMediaSource.f20553a) && fa4.m11650l(this.f20554b, lessonMediaSource.f20554b) && fa4.m11650l(this.f20555c, lessonMediaSource.f20555c);
    }

    public final int hashCode() {
        String str = this.f20553a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20554b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20555c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("LessonMediaSource(type=", this.f20553a, ", name=", this.f20554b, ", url="), this.f20555c, ")");
    }
}
