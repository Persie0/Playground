package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import ga.C5735r;
import ga.C5736s;
import ga.InterfaceC5720c;
import ga.InterfaceC5731n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import p150h9.C5930o0;
import p151ha.AbstractC5945b;
import p151ha.AbstractC5947d;
import p151ha.InterfaceC5948e;
import p290o6.C7968m;
import p387t0.C9166r;
import p392t5.C9203i;
import p479xa.C10129a;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2494k implements InterfaceC2480h, InterfaceC2480h.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2480h[] f13295a;

    /* JADX INFO: renamed from: b */
    public final IdentityHashMap<InterfaceC5731n, Integer> f13296b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5720c f13297c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<InterfaceC2480h> f13298d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final HashMap<C5735r, C5735r> f13299e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public InterfaceC2480h.a f13300f;

    /* JADX INFO: renamed from: g */
    public C5736s f13301g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2480h[] f13302h;

    /* JADX INFO: renamed from: i */
    public C9166r f13303i;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.k$a */
    public static final class a implements InterfaceC9502k {

        /* JADX INFO: renamed from: a */
        public final InterfaceC9502k f13304a;

        /* JADX INFO: renamed from: b */
        public final C5735r f13305b;

        public a(InterfaceC9502k interfaceC9502k, C5735r c5735r) {
            this.f13304a = interfaceC9502k;
            this.f13305b = c5735r;
        }

        @Override // ua.InterfaceC9505n
        /* JADX INFO: renamed from: a */
        public final C5735r mo7339a() {
            return this.f13305b;
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: b */
        public final int mo7340b() {
            return this.f13304a.mo7340b();
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: c */
        public final void mo7341c(long j10, long j11, long j12, List<? extends AbstractC5947d> list, InterfaceC5948e[] interfaceC5948eArr) {
            this.f13304a.mo7341c(j10, j11, j12, list, interfaceC5948eArr);
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: d */
        public final boolean mo7342d(int i10, long j10) {
            return this.f13304a.mo7342d(i10, j10);
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: e */
        public final boolean mo7343e(int i10, long j10) {
            return this.f13304a.mo7343e(i10, j10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13304a.equals(aVar.f13304a) && this.f13305b.equals(aVar.f13305b);
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: f */
        public final void mo7344f() {
            this.f13304a.mo7344f();
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: g */
        public final void mo7345g(boolean z10) {
            this.f13304a.mo7345g(z10);
        }

        @Override // ua.InterfaceC9505n
        /* JADX INFO: renamed from: h */
        public final C2416m mo7346h(int i10) {
            return this.f13304a.mo7346h(i10);
        }

        public final int hashCode() {
            return this.f13304a.hashCode() + ((this.f13305b.hashCode() + 527) * 31);
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: i */
        public final void mo7347i() {
            this.f13304a.mo7347i();
        }

        @Override // ua.InterfaceC9505n
        /* JADX INFO: renamed from: j */
        public final int mo7348j(int i10) {
            return this.f13304a.mo7348j(i10);
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: k */
        public final int mo7349k() {
            return this.f13304a.mo7349k();
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: l */
        public final C2416m mo7350l() {
            return this.f13304a.mo7350l();
        }

        @Override // ua.InterfaceC9505n
        public final int length() {
            return this.f13304a.length();
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: m */
        public final int mo7351m() {
            return this.f13304a.mo7351m();
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: n */
        public final void mo7352n(float f3) {
            this.f13304a.mo7352n(f3);
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: o */
        public final Object mo7353o() {
            return this.f13304a.mo7353o();
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: p */
        public final void mo7354p() {
            this.f13304a.mo7354p();
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: q */
        public final boolean mo7355q(long j10, AbstractC5945b abstractC5945b, List<? extends AbstractC5947d> list) {
            return this.f13304a.mo7355q(j10, abstractC5945b, list);
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: r */
        public final void mo7356r() {
            this.f13304a.mo7356r();
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: s */
        public final int mo7357s(List list, long j10) {
            return this.f13304a.mo7357s(list, j10);
        }

        @Override // ua.InterfaceC9505n
        /* JADX INFO: renamed from: t */
        public final int mo7358t(int i10) {
            return this.f13304a.mo7358t(i10);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.k$b */
    public static final class b implements InterfaceC2480h, InterfaceC2480h.a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2480h f13306a;

        /* JADX INFO: renamed from: b */
        public final long f13307b;

        /* JADX INFO: renamed from: c */
        public InterfaceC2480h.a f13308c;

        public b(InterfaceC2480h interfaceC2480h, long j10) {
            this.f13306a = interfaceC2480h;
            this.f13307b = j10;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2500q.a
        /* JADX INFO: renamed from: a */
        public final void mo7091a(InterfaceC2500q interfaceC2500q) {
            InterfaceC2480h.a aVar = this.f13308c;
            aVar.getClass();
            aVar.mo7091a(this);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2480h.a
        /* JADX INFO: renamed from: b */
        public final void mo7093b(InterfaceC2480h interfaceC2480h) {
            InterfaceC2480h.a aVar = this.f13308c;
            aVar.getClass();
            aVar.mo7093b(this);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2500q
        /* JADX INFO: renamed from: d */
        public final long mo7251d() {
            long jMo7251d = this.f13306a.mo7251d();
            if (jMo7251d == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f13307b + jMo7251d;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2480h
        /* JADX INFO: renamed from: f */
        public final void mo7252f() throws IOException {
            this.f13306a.mo7252f();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2480h
        /* JADX INFO: renamed from: g */
        public final long mo7253g(long j10) {
            long j11 = this.f13307b;
            return this.f13306a.mo7253g(j10 - j11) + j11;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2500q
        /* JADX INFO: renamed from: h */
        public final boolean mo7254h(long j10) {
            return this.f13306a.mo7254h(j10 - this.f13307b);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2500q
        public final boolean isLoading() {
            return this.f13306a.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2480h
        /* JADX INFO: renamed from: j */
        public final void mo7255j(boolean z10, long j10) {
            this.f13306a.mo7255j(z10, j10 - this.f13307b);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2480h
        /* JADX INFO: renamed from: k */
        public final long mo7256k() {
            long jMo7256k = this.f13306a.mo7256k();
            if (jMo7256k == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f13307b + jMo7256k;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2480h
        /* JADX INFO: renamed from: l */
        public final void mo7257l(InterfaceC2480h.a aVar, long j10) {
            this.f13308c = aVar;
            this.f13306a.mo7257l(this, j10 - this.f13307b);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2480h
        /* JADX INFO: renamed from: m */
        public final C5736s mo7258m() {
            return this.f13306a.mo7258m();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2480h
        /* JADX INFO: renamed from: n */
        public final long mo7259n(long j10, C5930o0 c5930o0) {
            long j11 = this.f13307b;
            return this.f13306a.mo7259n(j10 - j11, c5930o0) + j11;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2480h
        /* JADX INFO: renamed from: o */
        public final long mo7260o(InterfaceC9502k[] interfaceC9502kArr, boolean[] zArr, InterfaceC5731n[] interfaceC5731nArr, boolean[] zArr2, long j10) {
            InterfaceC5731n[] interfaceC5731nArr2 = new InterfaceC5731n[interfaceC5731nArr.length];
            int i10 = 0;
            while (true) {
                InterfaceC5731n interfaceC5731n = null;
                if (i10 >= interfaceC5731nArr.length) {
                    break;
                }
                c cVar = (c) interfaceC5731nArr[i10];
                if (cVar != null) {
                    interfaceC5731n = cVar.f13309a;
                }
                interfaceC5731nArr2[i10] = interfaceC5731n;
                i10++;
            }
            InterfaceC2480h interfaceC2480h = this.f13306a;
            long j11 = this.f13307b;
            long jMo7260o = interfaceC2480h.mo7260o(interfaceC9502kArr, zArr, interfaceC5731nArr2, zArr2, j10 - j11);
            for (int i11 = 0; i11 < interfaceC5731nArr.length; i11++) {
                InterfaceC5731n interfaceC5731n2 = interfaceC5731nArr2[i11];
                if (interfaceC5731n2 == null) {
                    interfaceC5731nArr[i11] = null;
                } else {
                    InterfaceC5731n interfaceC5731n3 = interfaceC5731nArr[i11];
                    if (interfaceC5731n3 == null || ((c) interfaceC5731n3).f13309a != interfaceC5731n2) {
                        interfaceC5731nArr[i11] = new c(interfaceC5731n2, j11);
                    }
                }
            }
            return jMo7260o + j11;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2500q
        /* JADX INFO: renamed from: r */
        public final long mo7261r() {
            long jMo7261r = this.f13306a.mo7261r();
            if (jMo7261r == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f13307b + jMo7261r;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2500q
        /* JADX INFO: renamed from: t */
        public final void mo7262t(long j10) {
            this.f13306a.mo7262t(j10 - this.f13307b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.k$c */
    public static final class c implements InterfaceC5731n {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5731n f13309a;

        /* JADX INFO: renamed from: b */
        public final long f13310b;

        public c(InterfaceC5731n interfaceC5731n, long j10) {
            this.f13309a = interfaceC5731n;
            this.f13310b = j10;
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: c */
        public final void mo425c() throws IOException {
            this.f13309a.mo425c();
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: d */
        public final int mo426d(long j10) {
            return this.f13309a.mo426d(j10 - this.f13310b);
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: e */
        public final boolean mo427e() {
            return this.f13309a.mo427e();
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: h */
        public final int mo430h(C7968m c7968m, DecoderInputBuffer decoderInputBuffer, int i10) {
            int iMo430h = this.f13309a.mo430h(c7968m, decoderInputBuffer, i10);
            if (iMo430h == -4) {
                decoderInputBuffer.f12118e = Math.max(0L, decoderInputBuffer.f12118e + this.f13310b);
            }
            return iMo430h;
        }
    }

    public C2494k(InterfaceC5720c interfaceC5720c, long[] jArr, InterfaceC2480h... interfaceC2480hArr) {
        this.f13297c = interfaceC5720c;
        this.f13295a = interfaceC2480hArr;
        ((C9203i) interfaceC5720c).getClass();
        this.f13303i = new C9166r(new InterfaceC2500q[0]);
        this.f13296b = new IdentityHashMap<>();
        this.f13302h = new InterfaceC2480h[0];
        for (int i10 = 0; i10 < interfaceC2480hArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f13295a[i10] = new b(interfaceC2480hArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q.a
    /* JADX INFO: renamed from: a */
    public final void mo7091a(InterfaceC2500q interfaceC2500q) {
        InterfaceC2480h.a aVar = this.f13300f;
        aVar.getClass();
        aVar.mo7091a(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h.a
    /* JADX INFO: renamed from: b */
    public final void mo7093b(InterfaceC2480h interfaceC2480h) {
        ArrayList<InterfaceC2480h> arrayList = this.f13298d;
        arrayList.remove(interfaceC2480h);
        if (arrayList.isEmpty()) {
            InterfaceC2480h[] interfaceC2480hArr = this.f13295a;
            int i10 = 0;
            for (InterfaceC2480h interfaceC2480h2 : interfaceC2480hArr) {
                i10 += interfaceC2480h2.mo7258m().f34808a;
            }
            C5735r[] c5735rArr = new C5735r[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < interfaceC2480hArr.length; i12++) {
                C5736s c5736sMo7258m = interfaceC2480hArr[i12].mo7258m();
                int i13 = c5736sMo7258m.f34808a;
                int i14 = 0;
                while (i14 < i13) {
                    C5735r c5735rM12091a = c5736sMo7258m.m12091a(i14);
                    C5735r c5735r = new C5735r(i12 + ":" + c5735rM12091a.f34801b, c5735rM12091a.f34803d);
                    this.f13299e.put(c5735r, c5735rM12091a);
                    c5735rArr[i11] = c5735r;
                    i14++;
                    i11++;
                }
            }
            this.f13301g = new C5736s(c5735rArr);
            InterfaceC2480h.a aVar = this.f13300f;
            aVar.getClass();
            aVar.mo7093b(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: d */
    public final long mo7251d() {
        return this.f13303i.mo7251d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: f */
    public final void mo7252f() throws IOException {
        for (InterfaceC2480h interfaceC2480h : this.f13295a) {
            interfaceC2480h.mo7252f();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: g */
    public final long mo7253g(long j10) {
        long jMo7253g = this.f13302h[0].mo7253g(j10);
        int i10 = 1;
        while (true) {
            InterfaceC2480h[] interfaceC2480hArr = this.f13302h;
            if (i10 >= interfaceC2480hArr.length) {
                return jMo7253g;
            }
            if (interfaceC2480hArr[i10].mo7253g(jMo7253g) != jMo7253g) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: h */
    public final boolean mo7254h(long j10) {
        ArrayList<InterfaceC2480h> arrayList = this.f13298d;
        if (arrayList.isEmpty()) {
            return this.f13303i.mo7254h(j10);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).mo7254h(j10);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    public final boolean isLoading() {
        return this.f13303i.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: j */
    public final void mo7255j(boolean z10, long j10) {
        for (InterfaceC2480h interfaceC2480h : this.f13302h) {
            interfaceC2480h.mo7255j(z10, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: k */
    public final long mo7256k() {
        long j10 = -9223372036854775807L;
        for (InterfaceC2480h interfaceC2480h : this.f13302h) {
            long jMo7256k = interfaceC2480h.mo7256k();
            if (jMo7256k == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && interfaceC2480h.mo7253g(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (InterfaceC2480h interfaceC2480h2 : this.f13302h) {
                    if (interfaceC2480h2 == interfaceC2480h) {
                        break;
                    }
                    if (interfaceC2480h2.mo7253g(jMo7256k) != jMo7256k) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jMo7256k;
            } else if (jMo7256k != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: l */
    public final void mo7257l(InterfaceC2480h.a aVar, long j10) {
        this.f13300f = aVar;
        ArrayList<InterfaceC2480h> arrayList = this.f13298d;
        InterfaceC2480h[] interfaceC2480hArr = this.f13295a;
        Collections.addAll(arrayList, interfaceC2480hArr);
        for (InterfaceC2480h interfaceC2480h : interfaceC2480hArr) {
            interfaceC2480h.mo7257l(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: m */
    public final C5736s mo7258m() {
        C5736s c5736s = this.f13301g;
        c5736s.getClass();
        return c5736s;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: n */
    public final long mo7259n(long j10, C5930o0 c5930o0) {
        InterfaceC2480h[] interfaceC2480hArr = this.f13302h;
        return (interfaceC2480hArr.length > 0 ? interfaceC2480hArr[0] : this.f13295a[0]).mo7259n(j10, c5930o0);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: o */
    public final long mo7260o(InterfaceC9502k[] interfaceC9502kArr, boolean[] zArr, InterfaceC5731n[] interfaceC5731nArr, boolean[] zArr2, long j10) {
        IdentityHashMap<InterfaceC5731n, Integer> identityHashMap;
        int[] iArr = new int[interfaceC9502kArr.length];
        int[] iArr2 = new int[interfaceC9502kArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = interfaceC9502kArr.length;
            identityHashMap = this.f13296b;
            if (i11 >= length) {
                break;
            }
            InterfaceC5731n interfaceC5731n = interfaceC5731nArr[i11];
            Integer num = interfaceC5731n == null ? null : identityHashMap.get(interfaceC5731n);
            iArr[i11] = num == null ? -1 : num.intValue();
            InterfaceC9502k interfaceC9502k = interfaceC9502kArr[i11];
            if (interfaceC9502k != null) {
                String str = interfaceC9502k.mo7339a().f34801b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = interfaceC9502kArr.length;
        InterfaceC5731n[] interfaceC5731nArr2 = new InterfaceC5731n[length2];
        InterfaceC5731n[] interfaceC5731nArr3 = new InterfaceC5731n[interfaceC9502kArr.length];
        InterfaceC9502k[] interfaceC9502kArr2 = new InterfaceC9502k[interfaceC9502kArr.length];
        InterfaceC2480h[] interfaceC2480hArr = this.f13295a;
        ArrayList arrayList = new ArrayList(interfaceC2480hArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < interfaceC2480hArr.length) {
            int i13 = i10;
            while (i13 < interfaceC9502kArr.length) {
                interfaceC5731nArr3[i13] = iArr[i13] == i12 ? interfaceC5731nArr[i13] : null;
                if (iArr2[i13] == i12) {
                    InterfaceC9502k interfaceC9502k2 = interfaceC9502kArr[i13];
                    interfaceC9502k2.getClass();
                    C5735r c5735r = this.f13299e.get(interfaceC9502k2.mo7339a());
                    c5735r.getClass();
                    interfaceC9502kArr2[i13] = new a(interfaceC9502k2, c5735r);
                } else {
                    interfaceC9502kArr2[i13] = null;
                }
                i13++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i14 = i12;
            InterfaceC2480h[] interfaceC2480hArr2 = interfaceC2480hArr;
            InterfaceC9502k[] interfaceC9502kArr3 = interfaceC9502kArr2;
            long jMo7260o = interfaceC2480hArr[i12].mo7260o(interfaceC9502kArr2, zArr, interfaceC5731nArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jMo7260o;
            } else if (jMo7260o != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < interfaceC9502kArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    InterfaceC5731n interfaceC5731n2 = interfaceC5731nArr3[i15];
                    interfaceC5731n2.getClass();
                    interfaceC5731nArr2[i15] = interfaceC5731nArr3[i15];
                    identityHashMap.put(interfaceC5731n2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    C10129a.m18992d(interfaceC5731nArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(interfaceC2480hArr2[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            interfaceC2480hArr = interfaceC2480hArr2;
            interfaceC9502kArr2 = interfaceC9502kArr3;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(interfaceC5731nArr2, i16, interfaceC5731nArr, i16, length2);
        InterfaceC2480h[] interfaceC2480hArr3 = (InterfaceC2480h[]) arrayList.toArray(new InterfaceC2480h[i16]);
        this.f13302h = interfaceC2480hArr3;
        ((C9203i) this.f13297c).getClass();
        this.f13303i = new C9166r(interfaceC2480hArr3);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: r */
    public final long mo7261r() {
        return this.f13303i.mo7261r();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: t */
    public final void mo7262t(long j10) {
        this.f13303i.mo7262t(j10);
    }
}
