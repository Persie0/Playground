package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.g9a;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLanguageProgressChartEntry {
    public static final C1728s1 Companion = new C1728s1();

    /* JADX INFO: renamed from: a */
    public final String f20911a;

    /* JADX INFO: renamed from: b */
    public final double f20912b;

    /* JADX INFO: renamed from: c */
    public final double f20913c;

    public /* synthetic */ ResultLanguageProgressChartEntry(double d, double d2, int i, String str) {
        this.f20911a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f20912b = 0.0d;
        } else {
            this.f20912b = d;
        }
        if ((i & 4) == 0) {
            this.f20913c = 0.0d;
        } else {
            this.f20913c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguageProgressChartEntry)) {
            return false;
        }
        ResultLanguageProgressChartEntry resultLanguageProgressChartEntry = (ResultLanguageProgressChartEntry) obj;
        return fa4.m11650l(this.f20911a, resultLanguageProgressChartEntry.f20911a) && Double.compare(this.f20912b, resultLanguageProgressChartEntry.f20912b) == 0 && Double.compare(this.f20913c, resultLanguageProgressChartEntry.f20913c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f20913c) + g9a.m12424a(this.f20912b, this.f20911a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ResultLanguageProgressChartEntry(name=" + this.f20911a + ", daily=" + this.f20912b + ", cumulative=" + this.f20913c + ")";
    }
}
