package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import ga.C5736s;
import ga.InterfaceC5731n;
import java.io.IOException;
import p150h9.C5930o0;
import p290o6.C7968m;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10147p;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2474b implements InterfaceC2480h, InterfaceC2480h.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2480h f13063a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2480h.a f13064b;

    /* JADX INFO: renamed from: c */
    public a[] f13065c = new a[0];

    /* JADX INFO: renamed from: d */
    public long f13066d;

    /* JADX INFO: renamed from: e */
    public long f13067e;

    /* JADX INFO: renamed from: f */
    public long f13068f;

    /* JADX INFO: renamed from: g */
    public ClippingMediaSource.IllegalClippingException f13069g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.b$a */
    public final class a implements InterfaceC5731n {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5731n f13070a;

        /* JADX INFO: renamed from: b */
        public boolean f13071b;

        public a(InterfaceC5731n interfaceC5731n) {
            this.f13070a = interfaceC5731n;
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: c */
        public final void mo425c() throws IOException {
            this.f13070a.mo425c();
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: d */
        public final int mo426d(long j10) {
            if (C2474b.this.m7250c()) {
                return -3;
            }
            return this.f13070a.mo426d(j10);
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: e */
        public final boolean mo427e() {
            return !C2474b.this.m7250c() && this.f13070a.mo427e();
        }

        @Override // ga.InterfaceC5731n
        /* JADX INFO: renamed from: h */
        public final int mo430h(C7968m c7968m, DecoderInputBuffer decoderInputBuffer, int i10) {
            C2474b c2474b = C2474b.this;
            if (c2474b.m7250c()) {
                return -3;
            }
            if (this.f13071b) {
                decoderInputBuffer.f37591a = 4;
                return -4;
            }
            int iMo430h = this.f13070a.mo430h(c7968m, decoderInputBuffer, i10);
            if (iMo430h != -5) {
                long j10 = c2474b.f13068f;
                if (j10 != Long.MIN_VALUE) {
                    if (iMo430h != -4 || decoderInputBuffer.f12118e < j10) {
                        if (iMo430h == -3 && c2474b.mo7261r() == Long.MIN_VALUE && !decoderInputBuffer.f12117d) {
                        }
                    }
                    decoderInputBuffer.mo6927p();
                    decoderInputBuffer.f37591a = 4;
                    this.f13071b = true;
                    return -4;
                }
                return iMo430h;
            }
            C2416m c2416m = (C2416m) c7968m.f43384b;
            c2416m.getClass();
            int i11 = c2416m.f12466W;
            int i12 = c2416m.f12467X;
            if (i11 != 0 || i12 != 0) {
                if (c2474b.f13067e != 0) {
                    i11 = 0;
                }
                if (c2474b.f13068f != Long.MIN_VALUE) {
                    i12 = 0;
                }
                C2416m.a aVarM7125a = c2416m.m7125a();
                aVarM7125a.f12485A = i11;
                aVarM7125a.f12486B = i12;
                c7968m.f43384b = aVarM7125a.m7128a();
            }
            return -5;
        }
    }

    public C2474b(InterfaceC2480h interfaceC2480h, boolean z10, long j10, long j11) {
        this.f13063a = interfaceC2480h;
        this.f13066d = z10 ? j10 : -9223372036854775807L;
        this.f13067e = j10;
        this.f13068f = j11;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q.a
    /* JADX INFO: renamed from: a */
    public final void mo7091a(InterfaceC2500q interfaceC2500q) {
        InterfaceC2480h.a aVar = this.f13064b;
        aVar.getClass();
        aVar.mo7091a(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h.a
    /* JADX INFO: renamed from: b */
    public final void mo7093b(InterfaceC2480h interfaceC2480h) {
        if (this.f13069g != null) {
            return;
        }
        InterfaceC2480h.a aVar = this.f13064b;
        aVar.getClass();
        aVar.mo7093b(this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7250c() {
        return this.f13066d != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: d */
    public final long mo7251d() {
        long jMo7251d = this.f13063a.mo7251d();
        if (jMo7251d != Long.MIN_VALUE) {
            long j10 = this.f13068f;
            if (j10 == Long.MIN_VALUE || jMo7251d < j10) {
                return jMo7251d;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: f */
    public final void mo7252f() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f13069g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f13063a.mo7252f();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: g */
    public final long mo7253g(long j10) {
        this.f13066d = -9223372036854775807L;
        boolean z10 = false;
        for (a aVar : this.f13065c) {
            if (aVar != null) {
                aVar.f13071b = false;
            }
        }
        long jMo7253g = this.f13063a.mo7253g(j10);
        if (jMo7253g == j10) {
            z10 = true;
        } else if (jMo7253g >= this.f13067e) {
            long j11 = this.f13068f;
            if (j11 == Long.MIN_VALUE || jMo7253g <= j11) {
                z10 = true;
            }
        }
        C10129a.m18992d(z10);
        return jMo7253g;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: h */
    public final boolean mo7254h(long j10) {
        return this.f13063a.mo7254h(j10);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    public final boolean isLoading() {
        return this.f13063a.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: j */
    public final void mo7255j(boolean z10, long j10) {
        this.f13063a.mo7255j(z10, j10);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: k */
    public final long mo7256k() {
        if (m7250c()) {
            long j10 = this.f13066d;
            this.f13066d = -9223372036854775807L;
            long jMo7256k = mo7256k();
            return jMo7256k != -9223372036854775807L ? jMo7256k : j10;
        }
        long jMo7256k2 = this.f13063a.mo7256k();
        if (jMo7256k2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        C10129a.m18992d(jMo7256k2 >= this.f13067e);
        long j11 = this.f13068f;
        if (j11 != Long.MIN_VALUE && jMo7256k2 > j11) {
            z10 = false;
        }
        C10129a.m18992d(z10);
        return jMo7256k2;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: l */
    public final void mo7257l(InterfaceC2480h.a aVar, long j10) {
        this.f13064b = aVar;
        this.f13063a.mo7257l(this, j10);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: m */
    public final C5736s mo7258m() {
        return this.f13063a.mo7258m();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: n */
    public final long mo7259n(long j10, C5930o0 c5930o0) {
        long j11 = this.f13067e;
        if (j10 == j11) {
            return j11;
        }
        long jM19042i = C10134c0.m19042i(c5930o0.f35350a, 0L, j10 - j11);
        long j12 = c5930o0.f35351b;
        long j13 = this.f13068f;
        long jM19042i2 = C10134c0.m19042i(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (jM19042i != c5930o0.f35350a || jM19042i2 != c5930o0.f35351b) {
            c5930o0 = new C5930o0(jM19042i, jM19042i2);
        }
        return this.f13063a.mo7259n(j10, c5930o0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: o */
    public final long mo7260o(InterfaceC9502k[] interfaceC9502kArr, boolean[] zArr, InterfaceC5731n[] interfaceC5731nArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.f13065c = new a[interfaceC5731nArr.length];
        InterfaceC5731n[] interfaceC5731nArr2 = new InterfaceC5731n[interfaceC5731nArr.length];
        int i10 = 0;
        while (true) {
            InterfaceC5731n interfaceC5731n = null;
            if (i10 >= interfaceC5731nArr.length) {
                break;
            }
            a[] aVarArr = this.f13065c;
            a aVar = (a) interfaceC5731nArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                interfaceC5731n = aVar.f13070a;
            }
            interfaceC5731nArr2[i10] = interfaceC5731n;
            i10++;
        }
        long jMo7260o = this.f13063a.mo7260o(interfaceC9502kArr, zArr, interfaceC5731nArr2, zArr2, j10);
        boolean z11 = true;
        if (m7250c()) {
            long j12 = this.f13067e;
            if (j10 != j12) {
                j11 = -9223372036854775807L;
            } else {
                if (j12 == 0) {
                    z10 = false;
                    break;
                }
                int length = interfaceC9502kArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        break;
                    }
                    InterfaceC9502k interfaceC9502k = interfaceC9502kArr[i11];
                    if (interfaceC9502k != null) {
                        C2416m c2416mMo7350l = interfaceC9502k.mo7350l();
                        if (!C10147p.m19101a(c2416mMo7350l.f12484l, c2416mMo7350l.f12481i)) {
                            z10 = true;
                            break;
                        }
                    }
                    i11++;
                }
                if (z10) {
                    j11 = jMo7260o;
                } else {
                    j11 = -9223372036854775807L;
                }
            }
        } else {
            j11 = -9223372036854775807L;
        }
        this.f13066d = j11;
        if (jMo7260o != j10) {
            if (jMo7260o >= this.f13067e) {
                long j13 = this.f13068f;
                if (j13 != Long.MIN_VALUE && jMo7260o > j13) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        }
        C10129a.m18992d(z11);
        for (int i12 = 0; i12 < interfaceC5731nArr.length; i12++) {
            InterfaceC5731n interfaceC5731n2 = interfaceC5731nArr2[i12];
            if (interfaceC5731n2 == null) {
                this.f13065c[i12] = null;
            } else {
                a[] aVarArr2 = this.f13065c;
                a aVar2 = aVarArr2[i12];
                if (aVar2 == null || aVar2.f13070a != interfaceC5731n2) {
                    aVarArr2[i12] = new a(interfaceC5731n2);
                }
            }
            interfaceC5731nArr[i12] = this.f13065c[i12];
        }
        return jMo7260o;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: r */
    public final long mo7261r() {
        long jMo7261r = this.f13063a.mo7261r();
        if (jMo7261r != Long.MIN_VALUE) {
            long j10 = this.f13068f;
            if (j10 == Long.MIN_VALUE || jMo7261r < j10) {
                return jMo7261r;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: t */
    public final void mo7262t(long j10) {
        this.f13063a.mo7262t(j10);
    }
}
