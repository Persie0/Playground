package p000;

import androidx.compose.animation.core.RepeatMode;

/* JADX INFO: loaded from: classes.dex */
public final class cpa implements yoa {

    /* JADX INFO: renamed from: a */
    public final xoa f34359a;

    /* JADX INFO: renamed from: b */
    public final RepeatMode f34360b;

    /* JADX INFO: renamed from: c */
    public final long f34361c;

    /* JADX INFO: renamed from: d */
    public final long f34362d;

    public cpa(xoa xoaVar, RepeatMode repeatMode, long j) {
        this.f34359a = xoaVar;
        this.f34360b = repeatMode;
        this.f34361c = ((long) (xoaVar.mo4035q() + xoaVar.mo4034o())) * 1000000;
        this.f34362d = j * 1000000;
    }

    /* JADX INFO: renamed from: a */
    public final long m9840a(long j) {
        long j2 = j + this.f34362d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.f34361c;
        long jMin = Math.min(j2 / j3, 2L);
        return (this.f34360b == RepeatMode.Restart || jMin % 2 == 0) ? j2 - (jMin * j3) : ((jMin + 1) * j3) - j2;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC3081hn m9841c(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        long j2 = this.f34362d;
        long j3 = j + j2;
        long j4 = this.f34361c;
        return j3 > j4 ? mo4033i(j4 - j2, abstractC3081hn, abstractC3081hn2, abstractC3081hn3) : abstractC3081hn2;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: d */
    public final long mo9842d(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return (3 * this.f34361c) - this.f34362d;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: i */
    public final AbstractC3081hn mo4033i(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return this.f34359a.mo4033i(m9840a(j), abstractC3081hn, abstractC3081hn2, m9841c(j, abstractC3081hn, abstractC3081hn3, abstractC3081hn2));
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: r */
    public final AbstractC3081hn mo4036r(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return this.f34359a.mo4036r(m9840a(j), abstractC3081hn, abstractC3081hn2, m9841c(j, abstractC3081hn, abstractC3081hn3, abstractC3081hn2));
    }
}
