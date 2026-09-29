package p000;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public final class u48 extends q32 {

    /* JADX INFO: renamed from: c */
    public final int f63403c;

    /* JADX INFO: renamed from: d */
    public final en2 f63404d;

    /* JADX INFO: renamed from: e */
    public final en2 f63405e;

    public u48(f12 f12Var, en2 en2Var) {
        super(f12Var, DateTimeFieldType.f54824i);
        this.f63405e = en2Var;
        this.f63404d = f12Var.mo4682i();
        this.f63403c = 100;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: A */
    public final long mo11484A(long j) {
        return this.f57184b.mo11484A(j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        int i2 = this.f63403c;
        xwc.m24769h0(this, i, 0, i2 - 1);
        f12 f12Var = this.f57184b;
        int iMo3734b = f12Var.mo3734b(j);
        return f12Var.mo3733B(((iMo3734b >= 0 ? iMo3734b / i2 : ((iMo3734b + 1) / i2) - 1) * i2) + i, j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        int iMo3734b = this.f57184b.mo3734b(j);
        int i = this.f63403c;
        if (iMo3734b >= 0) {
            return iMo3734b % i;
        }
        return ((iMo3734b + 1) % i) + (i - 1);
    }

    @Override // p000.q32, p000.f12
    /* JADX INFO: renamed from: i */
    public final en2 mo4682i() {
        return this.f63404d;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        return this.f63403c - 1;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        return 0;
    }

    @Override // p000.q32, p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        return this.f63405e;
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

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: y */
    public final long mo11493y(long j) {
        return this.f57184b.mo11493y(j);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: z */
    public final long mo11494z(long j) {
        return this.f57184b.mo11494z(j);
    }

    public u48(gi2 gi2Var, en2 en2Var, DateTimeFieldType dateTimeFieldType) {
        super(gi2Var.f57184b, dateTimeFieldType);
        this.f63403c = gi2Var.f40846c;
        this.f63404d = en2Var;
        this.f63405e = gi2Var.f40847d;
    }
}
