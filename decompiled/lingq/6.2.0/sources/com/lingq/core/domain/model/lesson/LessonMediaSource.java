package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonMediaSource {
    public static final C1442g Companion = new C1442g();

    /* JADX INFO: renamed from: a */
    public final String f19231a;

    /* JADX INFO: renamed from: b */
    public final String f19232b;

    /* JADX INFO: renamed from: c */
    public final String f19233c;

    public /* synthetic */ LessonMediaSource(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f19231a = null;
        } else {
            this.f19231a = str;
        }
        if ((i & 2) == 0) {
            this.f19232b = null;
        } else {
            this.f19232b = str2;
        }
        if ((i & 4) == 0) {
            this.f19233c = null;
        } else {
            this.f19233c = str3;
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
        return fa4.m11650l(this.f19231a, lessonMediaSource.f19231a) && fa4.m11650l(this.f19232b, lessonMediaSource.f19232b) && fa4.m11650l(this.f19233c, lessonMediaSource.f19233c);
    }

    public final int hashCode() {
        String str = this.f19231a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19232b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19233c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("LessonMediaSource(type=", this.f19231a, ", name=", this.f19232b, ", url="), this.f19233c, ")");
    }
}
