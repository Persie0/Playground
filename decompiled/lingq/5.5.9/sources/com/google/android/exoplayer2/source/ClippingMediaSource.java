package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.source.ads.C2473a;
import ga.AbstractC5724g;
import java.io.IOException;
import java.util.ArrayList;
import p454wa.InterfaceC9877b;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource extends AbstractC2503t {

    /* JADX INFO: renamed from: e */
    public final long f13008e;

    /* JADX INFO: renamed from: f */
    public final long f13009f;

    /* JADX INFO: renamed from: g */
    public final boolean f13010g;

    /* JADX INFO: renamed from: h */
    public final boolean f13011h;

    /* JADX INFO: renamed from: i */
    public final boolean f13012i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<C2474b> f13013j;

    /* JADX INFO: renamed from: k */
    public final AbstractC2382c0.c f13014k;

    /* JADX INFO: renamed from: l */
    public C2470a f13015l;

    /* JADX INFO: renamed from: m */
    public IllegalClippingException f13016m;

    /* JADX INFO: renamed from: n */
    public long f13017n;

    /* JADX INFO: renamed from: o */
    public long f13018o;

    public static final class IllegalClippingException extends IOException {
        public IllegalClippingException(int i10) {
            super("Illegal clipping: ".concat(i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ClippingMediaSource$a */
    public static final class C2470a extends AbstractC5724g {

        /* JADX INFO: renamed from: c */
        public final long f13019c;

        /* JADX INFO: renamed from: d */
        public final long f13020d;

        /* JADX INFO: renamed from: e */
        public final long f13021e;

        /* JADX INFO: renamed from: f */
        public final boolean f13022f;

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        public C2470a(AbstractC2382c0 abstractC2382c0, long j10, long j11) throws IllegalClippingException {
            super(abstractC2382c0);
            boolean z10 = false;
            if (abstractC2382c0.mo6905h() != 1) {
                throw new IllegalClippingException(0);
            }
            AbstractC2382c0.c cVarM6908m = abstractC2382c0.m6908m(0, new AbstractC2382c0.c());
            long jMax = Math.max(0L, j10);
            if (!cVarM6908m.f12102l && jMax != 0 && !cVarM6908m.f12098h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? cVarM6908m.f12087I : Math.max(0L, j11);
            long j12 = cVarM6908m.f12087I;
            if (j12 != -9223372036854775807L) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f13019c = jMax;
            this.f13020d = jMax2;
            this.f13021e = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (cVarM6908m.f12099i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
                z10 = true;
            }
            this.f13022f = z10;
        }

        @Override // ga.AbstractC5724g, com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: f */
        public final AbstractC2382c0.b mo6777f(int i10, AbstractC2382c0.b bVar, boolean z10) {
            this.f34747b.mo6777f(0, bVar, z10);
            long j10 = bVar.f12067e - this.f13019c;
            long j11 = this.f13021e;
            bVar.m6918h(bVar.f12063a, bVar.f12064b, 0, j11 == -9223372036854775807L ? -9223372036854775807L : j11 - j10, j10, C2473a.f13034g, false);
            return bVar;
        }

        @Override // ga.AbstractC5724g, com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: n */
        public final AbstractC2382c0.c mo6781n(int i10, AbstractC2382c0.c cVar, long j10) {
            this.f34747b.mo6781n(0, cVar, 0L);
            long j11 = cVar.f12090L;
            long j12 = this.f13019c;
            cVar.f12090L = j11 + j12;
            cVar.f12087I = this.f13021e;
            cVar.f12099i = this.f13022f;
            long j13 = cVar.f12086H;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                cVar.f12086H = jMax;
                long j14 = this.f13020d;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                cVar.f12086H = jMax - j12;
            }
            long jM19033R = C10134c0.m19033R(j12);
            long j15 = cVar.f12095e;
            if (j15 != -9223372036854775807L) {
                cVar.f12095e = j15 + jM19033R;
            }
            long j16 = cVar.f12096f;
            if (j16 != -9223372036854775807L) {
                cVar.f12096f = j16 + jM19033R;
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippingMediaSource(InterfaceC2492i interfaceC2492i, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super(interfaceC2492i);
        interfaceC2492i.getClass();
        C10129a.m18990b(j10 >= 0);
        this.f13008e = j10;
        this.f13009f = j11;
        this.f13010g = z10;
        this.f13011h = z11;
        this.f13012i = z12;
        this.f13013j = new ArrayList<>();
        this.f13014k = new AbstractC2382c0.c();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final InterfaceC2480h createPeriod(InterfaceC2492i.b bVar, InterfaceC9877b interfaceC9877b, long j10) {
        C2474b c2474b = new C2474b(this.f13469d.createPeriod(bVar, interfaceC9877b, j10), this.f13010g, this.f13017n, this.f13018o);
        this.f13013j.add(c2474b);
        return c2474b;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2503t
    /* JADX INFO: renamed from: g */
    public final void mo7244g(AbstractC2382c0 abstractC2382c0) {
        if (this.f13016m != null) {
            return;
        }
        m7245i(abstractC2382c0);
    }

    /* JADX INFO: renamed from: i */
    public final void m7245i(AbstractC2382c0 abstractC2382c0) {
        long j10;
        long j11;
        long j12;
        AbstractC2382c0.c cVar = this.f13014k;
        abstractC2382c0.m6908m(0, cVar);
        long j13 = cVar.f12090L;
        C2470a c2470a = this.f13015l;
        long j14 = this.f13009f;
        ArrayList<C2474b> arrayList = this.f13013j;
        if (c2470a == null || arrayList.isEmpty() || this.f13011h) {
            boolean z10 = this.f13012i;
            long j15 = this.f13008e;
            if (z10) {
                long j16 = cVar.f12086H;
                j15 += j16;
                j10 = j16 + j14;
            } else {
                j10 = j14;
            }
            this.f13017n = j13 + j15;
            this.f13018o = j14 != Long.MIN_VALUE ? j13 + j10 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2474b c2474b = arrayList.get(i10);
                long j17 = this.f13017n;
                long j18 = this.f13018o;
                c2474b.f13067e = j17;
                c2474b.f13068f = j18;
            }
            j11 = j15;
            j12 = j10;
        } else {
            long j19 = this.f13017n - j13;
            j12 = j14 != Long.MIN_VALUE ? this.f13018o - j13 : Long.MIN_VALUE;
            j11 = j19;
        }
        try {
            C2470a c2470a2 = new C2470a(abstractC2382c0, j11, j12);
            this.f13015l = c2470a2;
            refreshSourceInfo(c2470a2);
        } catch (IllegalClippingException e10) {
            this.f13016m = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList.get(i11).f13069g = this.f13016m;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.source.AbstractC2475c, com.google.android.exoplayer2.source.InterfaceC2492i
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.f13016m;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void releasePeriod(InterfaceC2480h interfaceC2480h) {
        ArrayList<C2474b> arrayList = this.f13013j;
        C10129a.m18992d(arrayList.remove(interfaceC2480h));
        this.f13469d.releasePeriod(((C2474b) interfaceC2480h).f13063a);
        if (arrayList.isEmpty() && !this.f13011h) {
            C2470a c2470a = this.f13015l;
            c2470a.getClass();
            m7245i(c2470a.f34747b);
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c, com.google.android.exoplayer2.source.AbstractC2471a
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f13016m = null;
        this.f13015l = null;
    }
}
