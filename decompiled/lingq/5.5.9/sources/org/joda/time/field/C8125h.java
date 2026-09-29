package org.joda.time.field;

import ae.C0062b;
import org.joda.time.DateTimeFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.field.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C8125h extends AbstractC8119b {
    public C8125h(C8122e c8122e, DateTimeFieldType dateTimeFieldType) {
        super(c8122e, dateTimeFieldType);
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
        int iMo12580n = mo12580n();
        C0062b.m419y2(this, i10, 1, iMo12580n);
        if (i10 == iMo12580n) {
            i10 = 0;
        }
        return this.f44107b.mo12568J(i10, j10);
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
        return iMo12572b == 0 ? mo12580n() : iMo12572b;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: k */
    public final AbstractC6097d mo12578k() {
        return this.f44107b.mo12578k();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return this.f44107b.mo12580n() + 1;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return 1;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: x */
    public final boolean mo12586x(long j10) {
        return this.f44107b.mo12586x(j10);
    }
}
