package org.joda.time.chrono;

import ae.C0062b;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.AbstractC8119b;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.chrono.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C8117j extends AbstractC8119b {

    /* JADX INFO: renamed from: c */
    public static final C8117j f44100c = new C8117j();

    public C8117j() {
        super(GregorianChronology.f44064B0.f43987Z, DateTimeFieldType.f43937b);
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
        C0062b.m419y2(this, i10, 0, mo12580n());
        if (this.f44107b.mo12572b(j10) < 0) {
            i10 = -i10;
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
        return iMo12572b < 0 ? -iMo12572b : iMo12572b;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return this.f44107b.mo12580n();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return 0;
    }

    @Override // org.joda.time.field.AbstractC8119b, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return GregorianChronology.f44064B0.f44003l;
    }
}
