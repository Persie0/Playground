package p150h9;

import ae.C0062b;
import android.util.Pair;
import com.google.android.exoplayer2.AbstractC2352a;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.AbstractC2406e;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.C2474b;
import com.google.android.exoplayer2.source.InterfaceC2480h;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import ga.C5736s;
import ga.InterfaceC5731n;
import p454wa.InterfaceC9877b;
import p479xa.C10129a;
import p479xa.C10145n;
import ua.AbstractC9510s;
import ua.C9511t;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: h9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C5943z {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2480h f35376a;

    /* JADX INFO: renamed from: b */
    public final Object f35377b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5731n[] f35378c;

    /* JADX INFO: renamed from: d */
    public boolean f35379d;

    /* JADX INFO: renamed from: e */
    public boolean f35380e;

    /* JADX INFO: renamed from: f */
    public C5902a0 f35381f;

    /* JADX INFO: renamed from: g */
    public boolean f35382g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f35383h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5924l0[] f35384i;

    /* JADX INFO: renamed from: j */
    public final AbstractC9510s f35385j;

    /* JADX INFO: renamed from: k */
    public final C2469s f35386k;

    /* JADX INFO: renamed from: l */
    public C5943z f35387l;

    /* JADX INFO: renamed from: m */
    public C5736s f35388m;

    /* JADX INFO: renamed from: n */
    public C9511t f35389n;

    /* JADX INFO: renamed from: o */
    public long f35390o;

    public C5943z(InterfaceC5924l0[] interfaceC5924l0Arr, long j10, AbstractC9510s abstractC9510s, InterfaceC9877b interfaceC9877b, C2469s c2469s, C5902a0 c5902a0, C9511t c9511t) {
        this.f35384i = interfaceC5924l0Arr;
        this.f35390o = j10;
        this.f35385j = abstractC9510s;
        this.f35386k = c2469s;
        InterfaceC2492i.b bVar = c5902a0.f35249a;
        this.f35377b = bVar.f34757a;
        this.f35381f = c5902a0;
        this.f35388m = C5736s.f34805d;
        this.f35389n = c9511t;
        this.f35378c = new InterfaceC5731n[interfaceC5924l0Arr.length];
        this.f35383h = new boolean[interfaceC5924l0Arr.length];
        long j11 = c5902a0.f35252d;
        c2469s.getClass();
        int i10 = AbstractC2352a.f11821e;
        Pair pair = (Pair) bVar.f34757a;
        Object obj = pair.first;
        InterfaceC2492i.b bVarM7324b = bVar.m7324b(pair.second);
        C2469s.c cVar = (C2469s.c) c2469s.f12989d.get(obj);
        cVar.getClass();
        c2469s.f12992g.add(cVar);
        C2469s.b bVar2 = c2469s.f12991f.get(cVar);
        if (bVar2 != null) {
            bVar2.f13000a.enable(bVar2.f13001b);
        }
        cVar.f13005c.add(bVarM7324b);
        InterfaceC2480h interfaceC2480hCreatePeriod = cVar.f13003a.createPeriod(bVarM7324b, interfaceC9877b, c5902a0.f35250b);
        c2469s.f12988c.put(interfaceC2480hCreatePeriod, cVar);
        c2469s.m7232c();
        this.f35376a = j11 != -9223372036854775807L ? new C2474b(interfaceC2480hCreatePeriod, true, 0L, j11) : interfaceC2480hCreatePeriod;
    }

    /* JADX INFO: renamed from: a */
    public final long m12375a(C9511t c9511t, long j10, boolean z10, boolean[] zArr) {
        InterfaceC5924l0[] interfaceC5924l0Arr;
        InterfaceC5731n[] interfaceC5731nArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c9511t.f49011a) {
                break;
            }
            if (z10 || !c9511t.m17976a(this.f35389n, i10)) {
                z11 = false;
            }
            this.f35383h[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            interfaceC5924l0Arr = this.f35384i;
            int length = interfaceC5924l0Arr.length;
            interfaceC5731nArr = this.f35378c;
            if (i11 >= length) {
                break;
            }
            if (((AbstractC2406e) interfaceC5924l0Arr[i11]).f12220a == -2) {
                interfaceC5731nArr[i11] = null;
            }
            i11++;
        }
        m12376b();
        this.f35389n = c9511t;
        m12377c();
        long jMo7260o = this.f35376a.mo7260o(c9511t.f49013c, this.f35383h, this.f35378c, zArr, j10);
        for (int i12 = 0; i12 < interfaceC5924l0Arr.length; i12++) {
            if (((AbstractC2406e) interfaceC5924l0Arr[i12]).f12220a == -2 && this.f35389n.m17977b(i12)) {
                interfaceC5731nArr[i12] = new C0062b();
            }
        }
        this.f35380e = false;
        for (int i13 = 0; i13 < interfaceC5731nArr.length; i13++) {
            if (interfaceC5731nArr[i13] != null) {
                C10129a.m18992d(c9511t.m17977b(i13));
                if (((AbstractC2406e) interfaceC5924l0Arr[i13]).f12220a != -2) {
                    this.f35380e = true;
                }
            } else {
                C10129a.m18992d(c9511t.f49013c[i13] == null);
            }
        }
        return jMo7260o;
    }

    /* JADX INFO: renamed from: b */
    public final void m12376b() {
        int i10 = 0;
        if (!(this.f35387l == null)) {
            return;
        }
        while (true) {
            C9511t c9511t = this.f35389n;
            if (i10 >= c9511t.f49011a) {
                return;
            }
            boolean zM17977b = c9511t.m17977b(i10);
            InterfaceC9502k interfaceC9502k = this.f35389n.f49013c[i10];
            if (zM17977b && interfaceC9502k != null) {
                interfaceC9502k.mo7344f();
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12377c() {
        int i10 = 0;
        if (!(this.f35387l == null)) {
            return;
        }
        while (true) {
            C9511t c9511t = this.f35389n;
            if (i10 >= c9511t.f49011a) {
                return;
            }
            boolean zM17977b = c9511t.m17977b(i10);
            InterfaceC9502k interfaceC9502k = this.f35389n.f49013c[i10];
            if (zM17977b && interfaceC9502k != null) {
                interfaceC9502k.mo7347i();
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m12378d() {
        if (!this.f35379d) {
            return this.f35381f.f35250b;
        }
        long jMo7261r = this.f35380e ? this.f35376a.mo7261r() : Long.MIN_VALUE;
        if (jMo7261r == Long.MIN_VALUE) {
            jMo7261r = this.f35381f.f35253e;
        }
        return jMo7261r;
    }

    /* JADX INFO: renamed from: e */
    public final long m12379e() {
        return this.f35381f.f35250b + this.f35390o;
    }

    /* JADX INFO: renamed from: f */
    public final void m12380f() {
        m12376b();
        InterfaceC2480h interfaceC2480h = this.f35376a;
        try {
            boolean z10 = interfaceC2480h instanceof C2474b;
            C2469s c2469s = this.f35386k;
            if (z10) {
                c2469s.m7235f(((C2474b) interfaceC2480h).f13063a);
            } else {
                c2469s.m7235f(interfaceC2480h);
            }
        } catch (RuntimeException e10) {
            C10145n.m19096d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C9511t m12381g(float f3, AbstractC2382c0 abstractC2382c0) throws ExoPlaybackException {
        C5736s c5736s = this.f35388m;
        InterfaceC2492i.b bVar = this.f35381f.f35249a;
        C9511t c9511tMo17972d = this.f35385j.mo17972d(this.f35384i, c5736s);
        for (InterfaceC9502k interfaceC9502k : c9511tMo17972d.f49013c) {
            if (interfaceC9502k != null) {
                interfaceC9502k.mo7352n(f3);
            }
        }
        return c9511tMo17972d;
    }

    /* JADX INFO: renamed from: h */
    public final void m12382h() {
        InterfaceC2480h interfaceC2480h = this.f35376a;
        if (interfaceC2480h instanceof C2474b) {
            long j10 = this.f35381f.f35252d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            C2474b c2474b = (C2474b) interfaceC2480h;
            c2474b.f13067e = 0L;
            c2474b.f13068f = j10;
        }
    }
}
