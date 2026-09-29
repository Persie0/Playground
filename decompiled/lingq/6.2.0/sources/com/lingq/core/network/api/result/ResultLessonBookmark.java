package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonBookmark {
    public static final C1752w1 Companion = new C1752w1();

    /* JADX INFO: renamed from: a */
    public final Integer f21016a;

    /* JADX INFO: renamed from: b */
    public final Integer f21017b;

    /* JADX INFO: renamed from: c */
    public final String f21018c;

    /* JADX INFO: renamed from: d */
    public final Double f21019d;

    /* JADX INFO: renamed from: e */
    public final String f21020e;

    /* JADX INFO: renamed from: f */
    public final String f21021f;

    public /* synthetic */ ResultLessonBookmark(int i, Double d, Integer num, Integer num2, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21016a = null;
        } else {
            this.f21016a = num;
        }
        if ((i & 2) == 0) {
            this.f21017b = null;
        } else {
            this.f21017b = num2;
        }
        if ((i & 4) == 0) {
            this.f21018c = null;
        } else {
            this.f21018c = str;
        }
        if ((i & 8) == 0) {
            this.f21019d = null;
        } else {
            this.f21019d = d;
        }
        if ((i & 16) == 0) {
            this.f21020e = null;
        } else {
            this.f21020e = str2;
        }
        if ((i & 32) == 0) {
            this.f21021f = null;
        } else {
            this.f21021f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonBookmark)) {
            return false;
        }
        ResultLessonBookmark resultLessonBookmark = (ResultLessonBookmark) obj;
        return fa4.m11650l(this.f21016a, resultLessonBookmark.f21016a) && fa4.m11650l(this.f21017b, resultLessonBookmark.f21017b) && fa4.m11650l(this.f21018c, resultLessonBookmark.f21018c) && fa4.m11650l(this.f21019d, resultLessonBookmark.f21019d) && fa4.m11650l(this.f21020e, resultLessonBookmark.f21020e) && fa4.m11650l(this.f21021f, resultLessonBookmark.f21021f);
    }

    public final int hashCode() {
        Integer num = this.f21016a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f21017b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f21018c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f21019d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f21020e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21021f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultLessonBookmark(wordIndex=");
        sb.append(this.f21016a);
        sb.append(", completedWordIndex=");
        sb.append(this.f21017b);
        sb.append(", client=");
        sb.append(this.f21018c);
        sb.append(", audioPosition=");
        sb.append(this.f21019d);
        sb.append(", timestamp=");
        return wq1.m24125u(sb, this.f21020e, ", languageTimestamp=", this.f21021f, ")");
    }
}
