package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonBookmark {
    public static final C1437b Companion = new C1437b();

    /* JADX INFO: renamed from: a */
    public final int f19168a;

    /* JADX INFO: renamed from: b */
    public final Integer f19169b;

    /* JADX INFO: renamed from: c */
    public final Integer f19170c;

    /* JADX INFO: renamed from: d */
    public final String f19171d;

    /* JADX INFO: renamed from: e */
    public final String f19172e;

    /* JADX INFO: renamed from: f */
    public final String f19173f;

    /* JADX INFO: renamed from: g */
    public final Double f19174g;

    public /* synthetic */ LessonBookmark(int i, int i2, Double d, Integer num, Integer num2, String str, String str2, String str3) {
        this.f19168a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f19169b = null;
        } else {
            this.f19169b = num;
        }
        if ((i & 4) == 0) {
            this.f19170c = null;
        } else {
            this.f19170c = num2;
        }
        if ((i & 8) == 0) {
            this.f19171d = null;
        } else {
            this.f19171d = str;
        }
        if ((i & 16) == 0) {
            this.f19172e = null;
        } else {
            this.f19172e = str2;
        }
        if ((i & 32) == 0) {
            this.f19173f = null;
        } else {
            this.f19173f = str3;
        }
        if ((i & 64) == 0) {
            this.f19174g = null;
        } else {
            this.f19174g = d;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Double m8028a() {
        return this.f19174g;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m8029b() {
        return this.f19170c;
    }

    /* JADX INFO: renamed from: c */
    public final String m8030c() {
        return this.f19173f;
    }

    /* JADX INFO: renamed from: d */
    public final String m8031d() {
        return this.f19172e;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m8032e() {
        return this.f19169b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonBookmark)) {
            return false;
        }
        LessonBookmark lessonBookmark = (LessonBookmark) obj;
        return this.f19168a == lessonBookmark.f19168a && fa4.m11650l(this.f19169b, lessonBookmark.f19169b) && fa4.m11650l(this.f19170c, lessonBookmark.f19170c) && fa4.m11650l(this.f19171d, lessonBookmark.f19171d) && fa4.m11650l(this.f19172e, lessonBookmark.f19172e) && fa4.m11650l(this.f19173f, lessonBookmark.f19173f) && fa4.m11650l(this.f19174g, lessonBookmark.f19174g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19168a) * 31;
        Integer num = this.f19169b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f19170c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f19171d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19172e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19173f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.f19174g;
        return iHashCode6 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonBookmark(contentId=");
        sb.append(this.f19168a);
        sb.append(", wordIndex=");
        sb.append(this.f19169b);
        sb.append(", completedWordIndex=");
        sb.append(this.f19170c);
        sb.append(", client=");
        sb.append(this.f19171d);
        sb.append(", timestamp=");
        AbstractC3393o1.m17725C(sb, this.f19172e, ", languageTimestamp=", this.f19173f, ", audioPosition=");
        sb.append(this.f19174g);
        sb.append(")");
        return sb.toString();
    }

    public LessonBookmark(int i, Double d, Integer num, Integer num2, String str, String str2, String str3) {
        this.f19168a = i;
        this.f19169b = num;
        this.f19170c = num2;
        this.f19171d = str;
        this.f19172e = str2;
        this.f19173f = str3;
        this.f19174g = d;
    }

    public /* synthetic */ LessonBookmark(int i, Integer num, String str, String str2, int i2) {
        this(i, null, (i2 & 2) != 0 ? null : num, null, (i2 & 8) != 0 ? null : "Android", (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2);
    }
}
