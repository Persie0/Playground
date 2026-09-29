package p150h9;

import com.google.android.exoplayer2.source.InterfaceC2492i;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: h9.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5902a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2492i.b f35249a;

    /* JADX INFO: renamed from: b */
    public final long f35250b;

    /* JADX INFO: renamed from: c */
    public final long f35251c;

    /* JADX INFO: renamed from: d */
    public final long f35252d;

    /* JADX INFO: renamed from: e */
    public final long f35253e;

    /* JADX INFO: renamed from: f */
    public final boolean f35254f;

    /* JADX INFO: renamed from: g */
    public final boolean f35255g;

    /* JADX INFO: renamed from: h */
    public final boolean f35256h;

    /* JADX INFO: renamed from: i */
    public final boolean f35257i;

    public C5902a0(InterfaceC2492i.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        C10129a.m18990b(!z13 || z11);
        C10129a.m18990b(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        C10129a.m18990b(z14);
        this.f35249a = bVar;
        this.f35250b = j10;
        this.f35251c = j11;
        this.f35252d = j12;
        this.f35253e = j13;
        this.f35254f = z10;
        this.f35255g = z11;
        this.f35256h = z12;
        this.f35257i = z13;
    }

    /* JADX INFO: renamed from: a */
    public final C5902a0 m12321a(long j10) {
        return j10 == this.f35251c ? this : new C5902a0(this.f35249a, this.f35250b, j10, this.f35252d, this.f35253e, this.f35254f, this.f35255g, this.f35256h, this.f35257i);
    }

    /* JADX INFO: renamed from: b */
    public final C5902a0 m12322b(long j10) {
        return j10 == this.f35250b ? this : new C5902a0(this.f35249a, j10, this.f35251c, this.f35252d, this.f35253e, this.f35254f, this.f35255g, this.f35256h, this.f35257i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5902a0.class != obj.getClass()) {
            return false;
        }
        C5902a0 c5902a0 = (C5902a0) obj;
        return this.f35250b == c5902a0.f35250b && this.f35251c == c5902a0.f35251c && this.f35252d == c5902a0.f35252d && this.f35253e == c5902a0.f35253e && this.f35254f == c5902a0.f35254f && this.f35255g == c5902a0.f35255g && this.f35256h == c5902a0.f35256h && this.f35257i == c5902a0.f35257i && C10134c0.m19034a(this.f35249a, c5902a0.f35249a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f35249a.hashCode() + 527) * 31) + ((int) this.f35250b)) * 31) + ((int) this.f35251c)) * 31) + ((int) this.f35252d)) * 31) + ((int) this.f35253e)) * 31) + (this.f35254f ? 1 : 0)) * 31) + (this.f35255g ? 1 : 0)) * 31) + (this.f35256h ? 1 : 0)) * 31) + (this.f35257i ? 1 : 0);
    }
}
