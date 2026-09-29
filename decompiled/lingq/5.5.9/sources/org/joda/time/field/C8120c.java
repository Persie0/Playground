package org.joda.time.field;

import ae.C0062b;
import org.joda.time.DateTimeFieldType;
import p163hp.AbstractC6095b;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.field.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8120c extends AbstractC8119b {

    /* JADX INFO: renamed from: c */
    public final int f44108c;

    /* JADX INFO: renamed from: d */
    public final ScaledDurationField f44109d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6097d f44110e;

    /* JADX INFO: renamed from: f */
    public final int f44111f;

    /* JADX INFO: renamed from: g */
    public final int f44112g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8120c(AbstractC8119b abstractC8119b) {
        DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f43938c;
        AbstractC6097d abstractC6097dMo12584t = abstractC8119b.mo12584t();
        super(abstractC8119b, dateTimeFieldType);
        AbstractC6097d abstractC6097dMo12577j = abstractC8119b.mo12577j();
        if (abstractC6097dMo12577j == null) {
            this.f44109d = null;
        } else {
            this.f44109d = new ScaledDurationField(abstractC6097dMo12577j, dateTimeFieldType.mo16009a());
        }
        this.f44110e = abstractC6097dMo12584t;
        this.f44108c = 100;
        int iMo12582r = abstractC8119b.mo12582r();
        int i10 = iMo12582r >= 0 ? iMo12582r / 100 : ((iMo12582r + 1) / 100) - 1;
        int iMo12580n = abstractC8119b.mo12580n();
        int i11 = iMo12580n >= 0 ? iMo12580n / 100 : ((iMo12580n + 1) / 100) - 1;
        this.f44111f = i10;
        this.f44112g = i11;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: A */
    public final long mo12562A(long j10) {
        return mo12568J(mo12572b(this.f44107b.mo12562A(j10)), j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: D */
    public final long mo12564D(long j10) {
        int iMo12572b = mo12572b(j10) * this.f44108c;
        AbstractC6095b abstractC6095b = this.f44107b;
        return abstractC6095b.mo12564D(abstractC6095b.mo12568J(iMo12572b, j10));
    }

    @Override // org.joda.time.field.AbstractC8119b, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public final long mo12568J(int i10, long j10) {
        int i11;
        C0062b.m419y2(this, i10, this.f44111f, this.f44112g);
        AbstractC6095b abstractC6095b = this.f44107b;
        int iMo12572b = abstractC6095b.mo12572b(j10);
        int i12 = this.f44108c;
        if (iMo12572b >= 0) {
            i11 = iMo12572b % i12;
        } else {
            i11 = ((iMo12572b + 1) % i12) + (i12 - 1);
        }
        return abstractC6095b.mo12568J((i10 * i12) + i11, j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: a */
    public final long mo12571a(int i10, long j10) {
        return this.f44107b.mo12571a(i10 * this.f44108c, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        int iMo12572b = this.f44107b.mo12572b(j10);
        int i10 = this.f44108c;
        return iMo12572b >= 0 ? iMo12572b / i10 : ((iMo12572b + 1) / i10) - 1;
    }

    @Override // org.joda.time.field.AbstractC8119b, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: j */
    public final AbstractC6097d mo12577j() {
        return this.f44109d;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return this.f44112g;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return this.f44111f;
    }

    @Override // org.joda.time.field.AbstractC8119b, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        AbstractC6097d abstractC6097d = this.f44110e;
        return abstractC6097d != null ? abstractC6097d : super.mo12584t();
    }
}
