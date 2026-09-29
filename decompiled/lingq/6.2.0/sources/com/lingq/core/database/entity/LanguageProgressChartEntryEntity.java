package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LanguageProgressChartEntryEntity {
    public static final C1348m Companion = new C1348m();

    /* JADX INFO: renamed from: a */
    public final String f17168a;

    /* JADX INFO: renamed from: b */
    public final String f17169b;

    /* JADX INFO: renamed from: c */
    public final String f17170c;

    /* JADX INFO: renamed from: d */
    public final String f17171d;

    /* JADX INFO: renamed from: e */
    public final double f17172e;

    /* JADX INFO: renamed from: f */
    public final double f17173f;

    /* JADX INFO: renamed from: g */
    public final int f17174g;

    public /* synthetic */ LanguageProgressChartEntryEntity(int i, String str, String str2, String str3, String str4, double d, double d2, int i2) {
        if (127 != (i & 127)) {
            n3c.m17204b(i, 127, LanguageProgressChartEntryEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17168a = str;
        this.f17169b = str2;
        this.f17170c = str3;
        this.f17171d = str4;
        this.f17172e = d;
        this.f17173f = d2;
        this.f17174g = i2;
    }

    /* JADX INFO: renamed from: a */
    public final double m7596a() {
        return this.f17173f;
    }

    /* JADX INFO: renamed from: b */
    public final double m7597b() {
        return this.f17172e;
    }

    /* JADX INFO: renamed from: c */
    public final String m7598c() {
        return this.f17169b;
    }

    /* JADX INFO: renamed from: d */
    public final String m7599d() {
        return this.f17168a;
    }

    /* JADX INFO: renamed from: e */
    public final String m7600e() {
        return this.f17171d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageProgressChartEntryEntity)) {
            return false;
        }
        LanguageProgressChartEntryEntity languageProgressChartEntryEntity = (LanguageProgressChartEntryEntity) obj;
        return fa4.m11650l(this.f17168a, languageProgressChartEntryEntity.f17168a) && fa4.m11650l(this.f17169b, languageProgressChartEntryEntity.f17169b) && fa4.m11650l(this.f17170c, languageProgressChartEntryEntity.f17170c) && fa4.m11650l(this.f17171d, languageProgressChartEntryEntity.f17171d) && Double.compare(this.f17172e, languageProgressChartEntryEntity.f17172e) == 0 && Double.compare(this.f17173f, languageProgressChartEntryEntity.f17173f) == 0 && this.f17174g == languageProgressChartEntryEntity.f17174g;
    }

    /* JADX INFO: renamed from: f */
    public final String m7601f() {
        return this.f17170c;
    }

    /* JADX INFO: renamed from: g */
    public final int m7602g() {
        return this.f17174g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17174g) + g9a.m12424a(this.f17173f, g9a.m12424a(this.f17172e, ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f17168a.hashCode() * 31, this.f17169b, 31), this.f17170c, 31), this.f17171d, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LanguageProgressChartEntryEntity(metric=", this.f17168a, ", languageCode=", this.f17169b, ", period=");
        AbstractC3393o1.m17725C(sbM23000w, this.f17170c, ", name=", this.f17171d, ", daily=");
        sbM23000w.append(this.f17172e);
        hn1.m13370t(sbM23000w, ", cumulative=", this.f17173f, ", position=");
        return wq1.m24123s(sbM23000w, this.f17174g, ")");
    }

    public LanguageProgressChartEntryEntity(String str, String str2, String str3, String str4, double d, double d2, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f17168a = str;
        this.f17169b = str2;
        this.f17170c = str3;
        this.f17171d = str4;
        this.f17172e = d;
        this.f17173f = d2;
        this.f17174g = i;
    }
}
