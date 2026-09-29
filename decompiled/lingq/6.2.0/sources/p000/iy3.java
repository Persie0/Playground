package p000;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.GregorianChronology;

/* JADX INFO: loaded from: classes.dex */
public final class iy3 extends q32 {

    /* JADX INFO: renamed from: c */
    public static final iy3 f44757c = new iy3(GregorianChronology.f54906A0.f54867Z, DateTimeFieldType.f54817b);

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        f12 f12Var = this.f57184b;
        xwc.m24769h0(this, i, 0, f12Var.mo3735l());
        if (f12Var.mo3734b(j) < 0) {
            i = -i;
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
        return iMo3734b < 0 ? -iMo3734b : iMo3734b;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        return this.f57184b.mo3735l();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        return 0;
    }

    @Override // p000.q32, p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        return GregorianChronology.f54906A0.f54883l;
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
