package org.joda.time.chrono;

import ae.C0062b;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.AbstractC8119b;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.chrono.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C8116i extends AbstractC8119b {

    /* JADX INFO: renamed from: c */
    public final BasicChronology f44099c;

    public C8116i(C8112e c8112e, BasicChronology basicChronology) {
        super(c8112e, DateTimeFieldType.f43937b);
        this.f44099c = basicChronology;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: A */
    public final long mo12562A(long j10) {
        return this.f44107b.mo12562A(j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: C */
    public final long mo12563C(long j10) {
        return this.f44107b.mo12563C(j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: D */
    public final long mo12564D(long j10) {
        return this.f44107b.mo12564D(j10);
    }

    @Override // org.joda.time.field.AbstractC8119b, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public final long mo12568J(int i10, long j10) {
        C0062b.m419y2(this, i10, 1, mo12580n());
        if (this.f44099c.m16053D0(j10) <= 0) {
            i10 = 1 - i10;
        }
        return super.mo12568J(i10, j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: a */
    public final long mo12571a(int i10, long j10) {
        return this.f44107b.mo12571a(i10, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        int iMo12572b = this.f44107b.mo12572b(j10);
        return iMo12572b <= 0 ? 1 - iMo12572b : iMo12572b;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return this.f44107b.mo12580n();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return 1;
    }

    @Override // org.joda.time.field.AbstractC8119b, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return this.f44099c.f44003l;
    }
}
