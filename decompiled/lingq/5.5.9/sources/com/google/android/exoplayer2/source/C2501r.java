package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.android.exoplayer2.upstream.Loader;
import ga.C5725h;
import ga.C5735r;
import ga.C5736s;
import ga.InterfaceC5731n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p150h9.C5930o0;
import p290o6.C7968m;
import p338qd.C8573r0;
import p454wa.C9884i;
import p454wa.C9893r;
import p454wa.InterfaceC9882g;
import p454wa.InterfaceC9894s;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2501r implements InterfaceC2480h, Loader.InterfaceC2521a<b> {

    /* JADX INFO: renamed from: H */
    public byte[] f13439H;

    /* JADX INFO: renamed from: I */
    public int f13440I;

    /* JADX INFO: renamed from: a */
    public final C9884i f13441a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9882g.a f13442b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9894s f13443c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2528b f13444d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2493j.a f13445e;

    /* JADX INFO: renamed from: f */
    public final C5736s f13446f;

    /* JADX INFO: renamed from: h */
    public final long f13448h;

    /* JADX INFO: renamed from: j */
    public final C2416m f13450j;

    /* JADX INFO: renamed from: k */
    public final boolean f13451k;

    /* JADX INFO: renamed from: l */
    public boolean f13452l;

    /* JADX INFO: renamed from: g */
    public final ArrayList<a> f13447g = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public final Loader f13449i = new Loader("SingleSampleMediaPeriod");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.r$a */
    public final class a implements InterfaceC5731n {

        /* JADX INFO: renamed from: a */
        public int f13453a;

        /* JADX INFO: renamed from: b */
        public boolean f13454b;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m7405a() {
            if (!this.f13454b) {
                C2501r c2501r = C2501r.this;
                c2501r.f13445e.m7327b(C10147p.m19108h(c2501r.f13450j.f12484l), c2501r.f13450j, 0, null, 0L);
                this.f13454b = true;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: c */
        public final void mo425c() throws IOException {
            IOException iOException;
            C2501r c2501r = C2501r.this;
            if (c2501r.f13451k) {
                return;
            }
            Loader loader = c2501r.f13449i;
            IOException iOException2 = loader.f13699c;
            if (iOException2 != null) {
                throw iOException2;
            }
            Loader.HandlerC2523c<? extends Loader.InterfaceC2524d> handlerC2523c = loader.f13698b;
            if (handlerC2523c != null && (iOException = handlerC2523c.f13706e) != null && handlerC2523c.f13707f > handlerC2523c.f13702a) {
                throw iOException;
            }
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: d */
        public final int mo426d(long j10) {
            m7405a();
            if (j10 <= 0 || this.f13453a == 2) {
                return 0;
            }
            this.f13453a = 2;
            return 1;
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: e */
        public final boolean mo427e() {
            return C2501r.this.f13452l;
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: h */
        public final int mo430h(C7968m c7968m, DecoderInputBuffer decoderInputBuffer, int i10) {
            m7405a();
            C2501r c2501r = C2501r.this;
            boolean z10 = c2501r.f13452l;
            if (z10 && c2501r.f13439H == null) {
                this.f13453a = 2;
            }
            int i11 = this.f13453a;
            if (i11 == 2) {
                decoderInputBuffer.m13268l(4);
                return -4;
            }
            if ((i10 & 2) == 0 && i11 != 0) {
                if (!z10) {
                    return -3;
                }
                c2501r.f13439H.getClass();
                decoderInputBuffer.m13268l(1);
                decoderInputBuffer.f12118e = 0L;
                if ((i10 & 4) == 0) {
                    decoderInputBuffer.m6929s(c2501r.f13440I);
                    decoderInputBuffer.f12116c.put(c2501r.f13439H, 0, c2501r.f13440I);
                }
                if ((i10 & 1) == 0) {
                    this.f13453a = 2;
                }
                return -4;
            }
            c7968m.f43384b = c2501r.f13450j;
            this.f13453a = 1;
            return -5;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.r$b */
    public static final class b implements Loader.InterfaceC2524d {

        /* JADX INFO: renamed from: a */
        public final long f13456a = C5725h.f34748b.getAndIncrement();

        /* JADX INFO: renamed from: b */
        public final C9884i f13457b;

        /* JADX INFO: renamed from: c */
        public final C9893r f13458c;

        /* JADX INFO: renamed from: d */
        public byte[] f13459d;

        public b(InterfaceC9882g interfaceC9882g, C9884i c9884i) {
            this.f13457b = c9884i;
            this.f13458c = new C9893r(interfaceC9882g);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
        /* JADX INFO: renamed from: a */
        public final void mo7374a() throws IOException {
            C9893r c9893r = this.f13458c;
            c9893r.f50526b = 0L;
            try {
                c9893r.mo7273e(this.f13457b);
                int i10 = 0;
                while (i10 != -1) {
                    int i11 = (int) c9893r.f50526b;
                    byte[] bArr = this.f13459d;
                    if (bArr == null) {
                        this.f13459d = new byte[1024];
                    } else if (i11 == bArr.length) {
                        this.f13459d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f13459d;
                    i10 = c9893r.read(bArr2, i11, bArr2.length - i11);
                }
                C8573r0.m16705W(c9893r);
            } catch (Throwable th2) {
                C8573r0.m16705W(c9893r);
                throw th2;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
        /* JADX INFO: renamed from: b */
        public final void mo7375b() {
        }
    }

    public C2501r(C9884i c9884i, InterfaceC9882g.a aVar, InterfaceC9894s interfaceC9894s, C2416m c2416m, long j10, InterfaceC2528b interfaceC2528b, InterfaceC2493j.a aVar2, boolean z10) {
        this.f13441a = c9884i;
        this.f13442b = aVar;
        this.f13443c = interfaceC9894s;
        this.f13450j = c2416m;
        this.f13448h = j10;
        this.f13444d = interfaceC2528b;
        this.f13445e = aVar2;
        this.f13451k = z10;
        this.f13446f = new C5736s(new C5735r("", c2416m));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: b */
    public final void mo7313b(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, boolean z10) {
        C9893r c9893r = ((b) interfaceC2524d).f13458c;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        this.f13444d.getClass();
        this.f13445e.m7329d(c5725h, 1, -1, null, 0, null, 0L, this.f13448h);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: d */
    public final long mo7251d() {
        return (this.f13452l || this.f13449i.m7467b()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: e */
    public final void mo7314e(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11) {
        b bVar = (b) interfaceC2524d;
        this.f13440I = (int) bVar.f13458c.f50526b;
        byte[] bArr = bVar.f13459d;
        bArr.getClass();
        this.f13439H = bArr;
        this.f13452l = true;
        C9893r c9893r = bVar.f13458c;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        this.f13444d.getClass();
        this.f13445e.m7331f(c5725h, 1, -1, this.f13450j, 0, null, 0L, this.f13448h);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: f */
    public final void mo7252f() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: g */
    public final long mo7253g(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList<a> arrayList = this.f13447g;
            if (i10 >= arrayList.size()) {
                return j10;
            }
            a aVar = arrayList.get(i10);
            if (aVar.f13453a == 2) {
                aVar.f13453a = 1;
            }
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: h */
    public final boolean mo7254h(long j10) {
        if (!this.f13452l) {
            Loader loader = this.f13449i;
            if (!loader.m7467b()) {
                if (!(loader.f13699c != null)) {
                    InterfaceC9882g interfaceC9882gMo14771a = this.f13442b.mo14771a();
                    InterfaceC9894s interfaceC9894s = this.f13443c;
                    if (interfaceC9894s != null) {
                        interfaceC9882gMo14771a.mo7274g(interfaceC9894s);
                    }
                    b bVar = new b(interfaceC9882gMo14771a, this.f13441a);
                    this.f13445e.m7336k(new C5725h(bVar.f13456a, this.f13441a, loader.m7469d(bVar, this, this.f13444d.mo7474c(1))), 1, -1, this.f13450j, 0, null, 0L, this.f13448h);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    public final boolean isLoading() {
        return this.f13449i.m7467b();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: j */
    public final void mo7255j(boolean z10, long j10) {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: k */
    public final long mo7256k() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: l */
    public final void mo7257l(InterfaceC2480h.a aVar, long j10) {
        aVar.mo7093b(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: m */
    public final C5736s mo7258m() {
        return this.f13446f;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: n */
    public final long mo7259n(long j10, C5930o0 c5930o0) {
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: o */
    public final long mo7260o(InterfaceC9502k[] interfaceC9502kArr, boolean[] zArr, InterfaceC5731n[] interfaceC5731nArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < interfaceC9502kArr.length; i10++) {
            InterfaceC5731n interfaceC5731n = interfaceC5731nArr[i10];
            ArrayList<a> arrayList = this.f13447g;
            if (interfaceC5731n != null && (interfaceC9502kArr[i10] == null || !zArr[i10])) {
                arrayList.remove(interfaceC5731n);
                interfaceC5731nArr[i10] = null;
            }
            if (interfaceC5731nArr[i10] == null && interfaceC9502kArr[i10] != null) {
                a aVar = new a();
                arrayList.add(aVar);
                interfaceC5731nArr[i10] = aVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: p */
    public final Loader.C2522b mo7316p(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, IOException iOException, int i10) {
        Loader.C2522b c2522b;
        C9893r c9893r = ((b) interfaceC2524d).f13458c;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        C10134c0.m19033R(this.f13448h);
        InterfaceC2528b.c cVar = new InterfaceC2528b.c(iOException, i10);
        InterfaceC2528b interfaceC2528b = this.f13444d;
        long jMo7472a = interfaceC2528b.mo7472a(cVar);
        boolean z10 = jMo7472a == -9223372036854775807L || i10 >= interfaceC2528b.mo7474c(1);
        if (this.f13451k && z10) {
            C10145n.m19100h("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f13452l = true;
            c2522b = Loader.f13695e;
        } else {
            c2522b = jMo7472a != -9223372036854775807L ? new Loader.C2522b(0, jMo7472a) : Loader.f13696f;
        }
        Loader.C2522b c2522b2 = c2522b;
        int i11 = c2522b2.f13700a;
        this.f13445e.m7333h(c5725h, 1, -1, this.f13450j, 0, null, 0L, this.f13448h, iOException, !(i11 == 0 || i11 == 1));
        return c2522b2;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: r */
    public final long mo7261r() {
        return this.f13452l ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: t */
    public final void mo7262t(long j10) {
    }
}
