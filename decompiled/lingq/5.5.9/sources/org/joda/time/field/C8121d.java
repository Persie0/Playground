package org.joda.time.field;

import ae.C0062b;
import org.joda.time.DateTimeFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.field.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8121d extends AbstractC8119b {

    /* JADX INFO: renamed from: c */
    public final int f44113c;

    /* JADX INFO: renamed from: d */
    public final int f44114d;

    /* JADX INFO: renamed from: e */
    public final int f44115e;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C8121d(AbstractC8119b abstractC8119b, DateTimeFieldType dateTimeFieldType, int i10) {
        super(abstractC8119b, dateTimeFieldType);
        if (i10 == 0) {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        this.f44113c = i10;
        if (Integer.MIN_VALUE < abstractC8119b.mo12582r() + i10) {
            this.f44114d = abstractC8119b.mo12582r() + i10;
        } else {
            this.f44114d = Integer.MIN_VALUE;
        }
        if (Integer.MAX_VALUE > abstractC8119b.mo12580n() + i10) {
            this.f44115e = abstractC8119b.mo12580n() + i10;
        } else {
            this.f44115e = Integer.MAX_VALUE;
        }
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
        C0062b.m419y2(this, i10, this.f44114d, this.f44115e);
        return super.mo12568J(i10 - this.f44113c, j10);
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: a */
    public final long mo12571a(int i10, long j10) {
        long jMo12571a = super.mo12571a(i10, j10);
        C0062b.m419y2(this, mo12572b(jMo12571a), this.f44114d, this.f44115e);
        return jMo12571a;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        return this.f44107b.mo12572b(j10) + this.f44113c;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: k */
    public final AbstractC6097d mo12578k() {
        return this.f44107b.mo12578k();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return this.f44115e;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return this.f44114d;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: x */
    public final boolean mo12586x(long j10) {
        return this.f44107b.mo12586x(j10);
    }
}
