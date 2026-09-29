package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import p000.en2;
import p000.f12;
import p000.q32;
import p000.xwc;

/* JADX INFO: renamed from: org.joda.time.chrono.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3430f extends q32 {

    /* JADX INFO: renamed from: c */
    public final GregorianChronology f54919c;

    public C3430f(C3427c c3427c, GregorianChronology gregorianChronology) {
        super(c3427c, DateTimeFieldType.f54817b);
        this.f54919c = gregorianChronology;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        f12 f12Var = this.f57184b;
        xwc.m24769h0(this, i, 1, f12Var.mo3735l());
        if (this.f54919c.m18428Z(j) <= 0) {
            i = 1 - i;
        }
        return f12Var.mo3733B(i, j);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: a */
    public final long mo11031a(int i, long j) {
        return this.f57184b.mo11031a(i, j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        int iMo3734b = this.f57184b.mo3734b(j);
        return iMo3734b <= 0 ? 1 - iMo3734b : iMo3734b;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        return this.f57184b.mo3735l();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        return 1;
    }

    @Override // p000.q32, p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        return this.f54919c.f54883l;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: v */
    public final long mo4685v(long j) {
        return this.f57184b.mo4685v(j);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: w */
    public final long mo4686w(long j) {
        return this.f57184b.mo4686w(j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: x */
    public final long mo4687x(long j) {
        return this.f57184b.mo4687x(j);
    }
}
