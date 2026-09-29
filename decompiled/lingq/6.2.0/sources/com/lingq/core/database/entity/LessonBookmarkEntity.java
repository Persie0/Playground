package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonBookmarkEntity {
    public static final C1358r Companion = new C1358r();

    /* JADX INFO: renamed from: a */
    public final int f17232a;

    /* JADX INFO: renamed from: b */
    public final Integer f17233b;

    /* JADX INFO: renamed from: c */
    public final Integer f17234c;

    /* JADX INFO: renamed from: d */
    public final Double f17235d;

    /* JADX INFO: renamed from: e */
    public final String f17236e;

    /* JADX INFO: renamed from: f */
    public final String f17237f;

    /* JADX INFO: renamed from: g */
    public final String f17238g;

    public /* synthetic */ LessonBookmarkEntity(int i, int i2, Double d, Integer num, Integer num2, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, LessonBookmarkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17232a = i2;
        if ((i & 2) == 0) {
            this.f17233b = null;
        } else {
            this.f17233b = num;
        }
        if ((i & 4) == 0) {
            this.f17234c = null;
        } else {
            this.f17234c = num2;
        }
        if ((i & 8) == 0) {
            this.f17235d = null;
        } else {
            this.f17235d = d;
        }
        if ((i & 16) == 0) {
            this.f17236e = null;
        } else {
            this.f17236e = str;
        }
        if ((i & 32) == 0) {
            this.f17237f = null;
        } else {
            this.f17237f = str2;
        }
        if ((i & 64) == 0) {
            this.f17238g = null;
        } else {
            this.f17238g = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Double m7635a() {
        return this.f17235d;
    }

    /* JADX INFO: renamed from: b */
    public final String m7636b() {
        return this.f17236e;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m7637c() {
        return this.f17234c;
    }

    /* JADX INFO: renamed from: d */
    public final int m7638d() {
        return this.f17232a;
    }

    /* JADX INFO: renamed from: e */
    public final String m7639e() {
        return this.f17238g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonBookmarkEntity)) {
            return false;
        }
        LessonBookmarkEntity lessonBookmarkEntity = (LessonBookmarkEntity) obj;
        return this.f17232a == lessonBookmarkEntity.f17232a && fa4.m11650l(this.f17233b, lessonBookmarkEntity.f17233b) && fa4.m11650l(this.f17234c, lessonBookmarkEntity.f17234c) && fa4.m11650l(this.f17235d, lessonBookmarkEntity.f17235d) && fa4.m11650l(this.f17236e, lessonBookmarkEntity.f17236e) && fa4.m11650l(this.f17237f, lessonBookmarkEntity.f17237f) && fa4.m11650l(this.f17238g, lessonBookmarkEntity.f17238g);
    }

    /* JADX INFO: renamed from: f */
    public final String m7640f() {
        return this.f17237f;
    }

    /* JADX INFO: renamed from: g */
    public final Integer m7641g() {
        return this.f17233b;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17232a) * 31;
        Integer num = this.f17233b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17234c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.f17235d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f17236e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17237f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17238g;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonBookmarkEntity(contentId=");
        sb.append(this.f17232a);
        sb.append(", wordIndex=");
        sb.append(this.f17233b);
        sb.append(", completedWordIndex=");
        sb.append(this.f17234c);
        sb.append(", audioPosition=");
        sb.append(this.f17235d);
        sb.append(", client=");
        AbstractC3393o1.m17725C(sb, this.f17236e, ", timestamp=", this.f17237f, ", languageTimestamp=");
        return AbstractC3393o1.m17738m(sb, this.f17238g, ")");
    }

    public LessonBookmarkEntity(int i, Double d, Integer num, Integer num2, String str, String str2, String str3) {
        this.f17232a = i;
        this.f17233b = num;
        this.f17234c = num2;
        this.f17235d = d;
        this.f17236e = str;
        this.f17237f = str2;
        this.f17238g = str3;
    }
}
