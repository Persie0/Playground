package p150h9;

import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.common.collect.ImmutableList;
import ga.C5736s;
import java.util.List;
import ua.C9511t;

/* JADX INFO: renamed from: h9.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5920j0 {

    /* JADX INFO: renamed from: s */
    public static final InterfaceC2492i.b f35312s = new InterfaceC2492i.b(new Object());

    /* JADX INFO: renamed from: a */
    public final AbstractC2382c0 f35313a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2492i.b f35314b;

    /* JADX INFO: renamed from: c */
    public final long f35315c;

    /* JADX INFO: renamed from: d */
    public final long f35316d;

    /* JADX INFO: renamed from: e */
    public final int f35317e;

    /* JADX INFO: renamed from: f */
    public final ExoPlaybackException f35318f;

    /* JADX INFO: renamed from: g */
    public final boolean f35319g;

    /* JADX INFO: renamed from: h */
    public final C5736s f35320h;

    /* JADX INFO: renamed from: i */
    public final C9511t f35321i;

    /* JADX INFO: renamed from: j */
    public final List<Metadata> f35322j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2492i.b f35323k;

    /* JADX INFO: renamed from: l */
    public final boolean f35324l;

    /* JADX INFO: renamed from: m */
    public final int f35325m;

    /* JADX INFO: renamed from: n */
    public final C2505u f35326n;

    /* JADX INFO: renamed from: o */
    public final boolean f35327o;

    /* JADX INFO: renamed from: p */
    public volatile long f35328p;

    /* JADX INFO: renamed from: q */
    public volatile long f35329q;

    /* JADX INFO: renamed from: r */
    public volatile long f35330r;

    public C5920j0(AbstractC2382c0 abstractC2382c0, InterfaceC2492i.b bVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, C5736s c5736s, C9511t c9511t, List<Metadata> list, InterfaceC2492i.b bVar2, boolean z11, int i11, C2505u c2505u, long j12, long j13, long j14, boolean z12) {
        this.f35313a = abstractC2382c0;
        this.f35314b = bVar;
        this.f35315c = j10;
        this.f35316d = j11;
        this.f35317e = i10;
        this.f35318f = exoPlaybackException;
        this.f35319g = z10;
        this.f35320h = c5736s;
        this.f35321i = c9511t;
        this.f35322j = list;
        this.f35323k = bVar2;
        this.f35324l = z11;
        this.f35325m = i11;
        this.f35326n = c2505u;
        this.f35328p = j12;
        this.f35329q = j13;
        this.f35330r = j14;
        this.f35327o = z12;
    }

    /* JADX INFO: renamed from: h */
    public static C5920j0 m12335h(C9511t c9511t) {
        AbstractC2382c0.a aVar = AbstractC2382c0.f12057a;
        InterfaceC2492i.b bVar = f35312s;
        return new C5920j0(aVar, bVar, -9223372036854775807L, 0L, 1, null, false, C5736s.f34805d, c9511t, ImmutableList.m9062Y(), bVar, false, 0, C2505u.f13473d, 0L, 0L, 0L, false);
    }

    /* JADX INFO: renamed from: a */
    public final C5920j0 m12336a(InterfaceC2492i.b bVar) {
        return new C5920j0(this.f35313a, this.f35314b, this.f35315c, this.f35316d, this.f35317e, this.f35318f, this.f35319g, this.f35320h, this.f35321i, this.f35322j, bVar, this.f35324l, this.f35325m, this.f35326n, this.f35328p, this.f35329q, this.f35330r, this.f35327o);
    }

    /* JADX INFO: renamed from: b */
    public final C5920j0 m12337b(InterfaceC2492i.b bVar, long j10, long j11, long j12, long j13, C5736s c5736s, C9511t c9511t, List<Metadata> list) {
        return new C5920j0(this.f35313a, bVar, j11, j12, this.f35317e, this.f35318f, this.f35319g, c5736s, c9511t, list, this.f35323k, this.f35324l, this.f35325m, this.f35326n, this.f35328p, j13, j10, this.f35327o);
    }

    /* JADX INFO: renamed from: c */
    public final C5920j0 m12338c(int i10, boolean z10) {
        return new C5920j0(this.f35313a, this.f35314b, this.f35315c, this.f35316d, this.f35317e, this.f35318f, this.f35319g, this.f35320h, this.f35321i, this.f35322j, this.f35323k, z10, i10, this.f35326n, this.f35328p, this.f35329q, this.f35330r, this.f35327o);
    }

    /* JADX INFO: renamed from: d */
    public final C5920j0 m12339d(ExoPlaybackException exoPlaybackException) {
        return new C5920j0(this.f35313a, this.f35314b, this.f35315c, this.f35316d, this.f35317e, exoPlaybackException, this.f35319g, this.f35320h, this.f35321i, this.f35322j, this.f35323k, this.f35324l, this.f35325m, this.f35326n, this.f35328p, this.f35329q, this.f35330r, this.f35327o);
    }

    /* JADX INFO: renamed from: e */
    public final C5920j0 m12340e(C2505u c2505u) {
        return new C5920j0(this.f35313a, this.f35314b, this.f35315c, this.f35316d, this.f35317e, this.f35318f, this.f35319g, this.f35320h, this.f35321i, this.f35322j, this.f35323k, this.f35324l, this.f35325m, c2505u, this.f35328p, this.f35329q, this.f35330r, this.f35327o);
    }

    /* JADX INFO: renamed from: f */
    public final C5920j0 m12341f(int i10) {
        return new C5920j0(this.f35313a, this.f35314b, this.f35315c, this.f35316d, i10, this.f35318f, this.f35319g, this.f35320h, this.f35321i, this.f35322j, this.f35323k, this.f35324l, this.f35325m, this.f35326n, this.f35328p, this.f35329q, this.f35330r, this.f35327o);
    }

    /* JADX INFO: renamed from: g */
    public final C5920j0 m12342g(AbstractC2382c0 abstractC2382c0) {
        return new C5920j0(abstractC2382c0, this.f35314b, this.f35315c, this.f35316d, this.f35317e, this.f35318f, this.f35319g, this.f35320h, this.f35321i, this.f35322j, this.f35323k, this.f35324l, this.f35325m, this.f35326n, this.f35328p, this.f35329q, this.f35330r, this.f35327o);
    }
}
