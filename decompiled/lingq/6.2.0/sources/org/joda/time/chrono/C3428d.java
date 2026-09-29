package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.UnsupportedDurationField;
import p000.en2;
import p000.nj3;
import p000.w80;
import p000.xwc;

/* JADX INFO: renamed from: org.joda.time.chrono.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3428d extends w80 {

    /* JADX INFO: renamed from: b */
    public final GregorianChronology f54915b;

    public C3428d(GregorianChronology gregorianChronology) {
        super(DateTimeFieldType.f54816a);
        this.f54915b = gregorianChronology;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: A */
    public final long mo11484A(long j) {
        return mo4687x(j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        xwc.m24769h0(this, i, 0, 1);
        if (mo3734b(j) == i) {
            return j;
        }
        GregorianChronology gregorianChronology = this.f54915b;
        return gregorianChronology.m18435g0(-gregorianChronology.m18428Z(j), j);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: C */
    public final long mo11029C(long j, String str, Locale locale) {
        return mo3733B(nj3.m17460g(locale).m17465e(str), j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        return this.f54915b.m18428Z(j) <= 0 ? 0 : 1;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: f */
    public final String mo11034f(int i, Locale locale) {
        return nj3.m17460g(locale).m17466f(i);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: i */
    public final en2 mo4682i() {
        return UnsupportedDurationField.m18450h(DurationFieldType.f54834a);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: k */
    public final int mo11037k(Locale locale) {
        return nj3.m17460g(locale).m17468i();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        return 1;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        return 0;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        return null;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: t */
    public final boolean mo4684t() {
        return false;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: w */
    public final long mo4686w(long j) {
        if (mo3734b(j) == 0) {
            return this.f54915b.m18435g0(1, 0L);
        }
        return Long.MAX_VALUE;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: x */
    public final long mo4687x(long j) {
        if (mo3734b(j) == 1) {
            return this.f54915b.m18435g0(1, 0L);
        }
        return Long.MIN_VALUE;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: y */
    public final long mo11493y(long j) {
        return mo4687x(j);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: z */
    public final long mo11494z(long j) {
        return mo4687x(j);
    }
}
