package ga;

import android.net.Uri;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.source.ads.C2473a;
import p479xa.C10129a;

/* JADX INFO: renamed from: ga.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5733p extends AbstractC2382c0 {

    /* JADX INFO: renamed from: J */
    public static final Object f34780J = new Object();

    /* JADX INFO: renamed from: H */
    public final C2466p f34781H;

    /* JADX INFO: renamed from: I */
    public final C2466p.e f34782I;

    /* JADX INFO: renamed from: b */
    public final long f34783b;

    /* JADX INFO: renamed from: c */
    public final long f34784c;

    /* JADX INFO: renamed from: d */
    public final long f34785d;

    /* JADX INFO: renamed from: e */
    public final long f34786e;

    /* JADX INFO: renamed from: f */
    public final long f34787f;

    /* JADX INFO: renamed from: g */
    public final long f34788g;

    /* JADX INFO: renamed from: h */
    public final long f34789h;

    /* JADX INFO: renamed from: i */
    public final boolean f34790i;

    /* JADX INFO: renamed from: j */
    public final boolean f34791j;

    /* JADX INFO: renamed from: k */
    public final boolean f34792k;

    /* JADX INFO: renamed from: l */
    public final Object f34793l;

    static {
        C2466p.a aVar = new C2466p.a();
        aVar.f12777a = "SinglePeriodTimeline";
        aVar.f12778b = Uri.EMPTY;
        aVar.m7213a();
    }

    public C5733p(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, Object obj, C2466p c2466p, C2466p.e eVar) {
        this.f34783b = j10;
        this.f34784c = j11;
        this.f34785d = -9223372036854775807L;
        this.f34786e = j12;
        this.f34787f = j13;
        this.f34788g = j14;
        this.f34789h = j15;
        this.f34790i = z10;
        this.f34791j = z11;
        this.f34792k = z12;
        this.f34793l = obj;
        c2466p.getClass();
        this.f34781H = c2466p;
        this.f34782I = eVar;
    }

    public C5733p(long j10, boolean z10, boolean z11, C2466p c2466p) {
        this(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, c2466p, z11 ? c2466p.f12773c : null);
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: b */
    public final int mo6774b(Object obj) {
        return f34780J.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: f */
    public final AbstractC2382c0.b mo6777f(int i10, AbstractC2382c0.b bVar, boolean z10) {
        C10129a.m18991c(i10, 1);
        Object obj = z10 ? f34780J : null;
        long j10 = this.f34786e;
        long j11 = -this.f34788g;
        bVar.getClass();
        bVar.m6918h(null, obj, 0, j10, j11, C2473a.f13034g, false);
        return bVar;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: h */
    public final int mo6905h() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: l */
    public final Object mo6780l(int i10) {
        C10129a.m18991c(i10, 1);
        return f34780J;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v3 long) = (r1v2 long), (r1v2 long), (r1v2 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: n */
    public final AbstractC2382c0.c mo6781n(int i10, AbstractC2382c0.c cVar, long j10) {
        long j11;
        C10129a.m18991c(i10, 1);
        boolean z10 = this.f34791j;
        long j12 = this.f34789h;
        if (!z10 || this.f34792k || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f34787f;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        cVar.m6920b(AbstractC2382c0.c.f12070M, this.f34781H, this.f34793l, this.f34783b, this.f34784c, this.f34785d, this.f34790i, z10, this.f34782I, j11, this.f34787f, 0, 0, this.f34788g);
        return cVar;
    }

    @Override // com.google.android.exoplayer2.AbstractC2382c0
    /* JADX INFO: renamed from: o */
    public final int mo6909o() {
        return 1;
    }
}
