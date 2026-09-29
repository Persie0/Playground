package com.lingq.core.domain.model.language;

import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LanguageProgressChartEntry {
    public static final C1428h Companion = new C1428h();

    /* JADX INFO: renamed from: a */
    public final String f19071a;

    /* JADX INFO: renamed from: b */
    public final String f19072b;

    /* JADX INFO: renamed from: c */
    public final String f19073c;

    /* JADX INFO: renamed from: d */
    public final double f19074d;

    /* JADX INFO: renamed from: e */
    public final double f19075e;

    public /* synthetic */ LanguageProgressChartEntry(int i, String str, String str2, String str3, double d, double d2) {
        if (31 != (i & 31)) {
            n3c.m17204b(i, 31, LanguageProgressChartEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19071a = str;
        this.f19072b = str2;
        this.f19073c = str3;
        this.f19074d = d;
        this.f19075e = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageProgressChartEntry)) {
            return false;
        }
        LanguageProgressChartEntry languageProgressChartEntry = (LanguageProgressChartEntry) obj;
        return fa4.m11650l(this.f19071a, languageProgressChartEntry.f19071a) && fa4.m11650l(this.f19072b, languageProgressChartEntry.f19072b) && fa4.m11650l(this.f19073c, languageProgressChartEntry.f19073c) && Double.compare(this.f19074d, languageProgressChartEntry.f19074d) == 0 && Double.compare(this.f19075e, languageProgressChartEntry.f19075e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f19075e) + g9a.m12424a(this.f19074d, ux5.m22980c(ux5.m22980c(this.f19071a.hashCode() * 31, this.f19072b, 31), this.f19073c, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LanguageProgressChartEntry(metric=", this.f19071a, ", languageCode=", this.f19072b, ", name=");
        sbM23000w.append(this.f19073c);
        sbM23000w.append(", daily=");
        sbM23000w.append(this.f19074d);
        sbM23000w.append(", cumulative=");
        sbM23000w.append(this.f19075e);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public LanguageProgressChartEntry(String str, String str2, String str3, double d, double d2) {
        ux5.m22974A(str, str2, str3);
        this.f19071a = str;
        this.f19072b = str2;
        this.f19073c = str3;
        this.f19074d = d;
        this.f19075e = d2;
    }
}
