package org.joda.time.field;

import ae.C0062b;
import org.joda.time.DateTimeFieldType;
import p163hp.AbstractC6095b;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.field.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C8124g extends AbstractC8119b {

    /* JADX INFO: renamed from: c */
    public final int f44120c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6097d f44121d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6097d f44122e;

    public C8124g(AbstractC6095b abstractC6095b, AbstractC6097d abstractC6097d) {
        super(abstractC6095b, DateTimeFieldType.f43944i);
        this.f44122e = abstractC6097d;
        this.f44121d = abstractC6095b.mo12577j();
        this.f44120c = 100;
    }

    public C8124g(C8120c c8120c, AbstractC6097d abstractC6097d, DateTimeFieldType dateTimeFieldType) {
        super(c8120c.f44107b, dateTimeFieldType);
        this.f44120c = c8120c.f44108c;
        this.f44121d = abstractC6097d;
        this.f44122e = c8120c.f44109d;
    }

    public C8124g(C8120c c8120c, DateTimeFieldType dateTimeFieldType) {
        this(c8120c, c8120c.f44107b.mo12577j(), dateTimeFieldType);
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

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: E */
    public final long mo12565E(long j10) {
        return this.f44107b.mo12565E(j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: G */
    public final long mo12566G(long j10) {
        return this.f44107b.mo12566G(j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: I */
    public final long mo12567I(long j10) {
        return this.f44107b.mo12567I(j10);
    }

    @Override // org.joda.time.field.AbstractC8119b, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public final long mo12568J(int i10, long j10) {
        int i11 = this.f44120c;
        C0062b.m419y2(this, i10, 0, i11 - 1);
        AbstractC6095b abstractC6095b = this.f44107b;
        int iMo12572b = abstractC6095b.mo12572b(j10);
        return abstractC6095b.mo12568J(((iMo12572b >= 0 ? iMo12572b / i11 : ((iMo12572b + 1) / i11) - 1) * i11) + i10, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        int iMo12572b = this.f44107b.mo12572b(j10);
        int i10 = this.f44120c;
        if (iMo12572b >= 0) {
            return iMo12572b % i10;
        }
        return ((iMo12572b + 1) % i10) + (i10 - 1);
    }

    @Override // org.joda.time.field.AbstractC8119b, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: j */
    public final AbstractC6097d mo12577j() {
        return this.f44121d;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return this.f44120c - 1;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return 0;
    }

    @Override // org.joda.time.field.AbstractC8119b, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return this.f44122e;
    }
}
