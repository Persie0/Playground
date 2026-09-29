package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class MoreLesson {
    public static final C1690m Companion = new C1690m();

    /* JADX INFO: renamed from: a */
    public final Integer f20564a;

    /* JADX INFO: renamed from: b */
    public final String f20565b;

    /* JADX INFO: renamed from: c */
    public final ResultLessonMediaSource f20566c;

    /* JADX INFO: renamed from: d */
    public final String f20567d;

    /* JADX INFO: renamed from: e */
    public final String f20568e;

    public /* synthetic */ MoreLesson(int i, Integer num, String str, ResultLessonMediaSource resultLessonMediaSource, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20564a = null;
        } else {
            this.f20564a = num;
        }
        if ((i & 2) == 0) {
            this.f20565b = null;
        } else {
            this.f20565b = str;
        }
        if ((i & 4) == 0) {
            this.f20566c = null;
        } else {
            this.f20566c = resultLessonMediaSource;
        }
        if ((i & 8) == 0) {
            this.f20567d = null;
        } else {
            this.f20567d = str2;
        }
        if ((i & 16) == 0) {
            this.f20568e = null;
        } else {
            this.f20568e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreLesson)) {
            return false;
        }
        MoreLesson moreLesson = (MoreLesson) obj;
        return fa4.m11650l(this.f20564a, moreLesson.f20564a) && fa4.m11650l(this.f20565b, moreLesson.f20565b) && fa4.m11650l(this.f20566c, moreLesson.f20566c) && fa4.m11650l(this.f20567d, moreLesson.f20567d) && fa4.m11650l(this.f20568e, moreLesson.f20568e);
    }

    public final int hashCode() {
        Integer num = this.f20564a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f20565b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ResultLessonMediaSource resultLessonMediaSource = this.f20566c;
        int iHashCode3 = (iHashCode2 + (resultLessonMediaSource == null ? 0 : resultLessonMediaSource.hashCode())) * 31;
        String str2 = this.f20567d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20568e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoreLesson(id=");
        sb.append(this.f20564a);
        sb.append(", image=");
        sb.append(this.f20565b);
        sb.append(", source=");
        sb.append(this.f20566c);
        sb.append(", status=");
        sb.append(this.f20567d);
        sb.append(", title=");
        return AbstractC3393o1.m17738m(sb, this.f20568e, ")");
    }
}
