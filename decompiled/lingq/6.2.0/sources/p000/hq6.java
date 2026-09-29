package p000;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public final class hq6 extends q32 {

    /* JADX INFO: renamed from: c */
    public final int f42779c;

    /* JADX INFO: renamed from: d */
    public final int f42780d;

    /* JADX INFO: renamed from: e */
    public final int f42781e;

    public hq6(q32 q32Var, DateTimeFieldType dateTimeFieldType, int i) {
        super(q32Var, dateTimeFieldType);
        if (i == 0) {
            C3386nv.m17626m("The offset cannot be zero");
            throw null;
        }
        this.f42779c = i;
        if (Integer.MIN_VALUE < q32Var.mo4683o() + i) {
            this.f42780d = q32Var.mo4683o() + i;
        } else {
            this.f42780d = Integer.MIN_VALUE;
        }
        if (Integer.MAX_VALUE > q32Var.mo3735l() + i) {
            this.f42781e = q32Var.mo3735l() + i;
        } else {
            this.f42781e = Integer.MAX_VALUE;
        }
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: A */
    public final long mo11484A(long j) {
        return this.f57184b.mo11484A(j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        xwc.m24769h0(this, i, this.f42780d, this.f42781e);
        return this.f57184b.mo3733B(i - this.f42779c, j);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: a */
    public final long mo11031a(int i, long j) {
        long jMo11031a = super.mo11031a(i, j);
        xwc.m24769h0(this, mo3734b(jMo11031a), this.f42780d, this.f42781e);
        return jMo11031a;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        return this.f57184b.mo3734b(j) + this.f42779c;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: j */
    public final en2 mo11036j() {
        return this.f57184b.mo11036j();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        return this.f42781e;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        return this.f42780d;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: s */
    public final boolean mo11038s(long j) {
        return this.f57184b.mo11038s(j);
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
}
