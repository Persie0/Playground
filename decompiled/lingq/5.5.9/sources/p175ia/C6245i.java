package p175ia;

import ae.C0062b;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p069da.C5112a;
import p151ha.AbstractC5947d;
import p174i9.C6215e0;
import p261m9.C7504e;
import p261m9.InterfaceC7507h;
import p338qd.C8573r0;
import p396t9.C9229d;
import p411u9.C9482e;
import p453w9.C9845a;
import p453w9.C9849c;
import p453w9.C9850c0;
import p453w9.C9853e;
import p453w9.C9856g;
import p454wa.C9884i;
import p454wa.InterfaceC9882g;
import p479xa.C10129a;
import p479xa.C10130a0;
import p479xa.C10134c0;
import p479xa.C10147p;
import p479xa.C10151t;

/* JADX INFO: renamed from: ia.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6245i extends AbstractC5947d {

    /* JADX INFO: renamed from: L */
    public static final AtomicInteger f36274L = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public final boolean f36275A;

    /* JADX INFO: renamed from: B */
    public final boolean f36276B;

    /* JADX INFO: renamed from: C */
    public InterfaceC6246j f36277C;

    /* JADX INFO: renamed from: D */
    public C6249m f36278D;

    /* JADX INFO: renamed from: E */
    public int f36279E;

    /* JADX INFO: renamed from: F */
    public boolean f36280F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f36281G;

    /* JADX INFO: renamed from: H */
    public boolean f36282H;

    /* JADX INFO: renamed from: I */
    public ImmutableList<Integer> f36283I;

    /* JADX INFO: renamed from: J */
    public boolean f36284J;

    /* JADX INFO: renamed from: K */
    public boolean f36285K;

    /* JADX INFO: renamed from: k */
    public final int f36286k;

    /* JADX INFO: renamed from: l */
    public final int f36287l;

    /* JADX INFO: renamed from: m */
    public final Uri f36288m;

    /* JADX INFO: renamed from: n */
    public final boolean f36289n;

    /* JADX INFO: renamed from: o */
    public final int f36290o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC9882g f36291p;

    /* JADX INFO: renamed from: q */
    public final C9884i f36292q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC6246j f36293r;

    /* JADX INFO: renamed from: s */
    public final boolean f36294s;

    /* JADX INFO: renamed from: t */
    public final boolean f36295t;

    /* JADX INFO: renamed from: u */
    public final C10130a0 f36296u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC6243g f36297v;

    /* JADX INFO: renamed from: w */
    public final List<C2416m> f36298w;

    /* JADX INFO: renamed from: x */
    public final DrmInitData f36299x;

    /* JADX INFO: renamed from: y */
    public final C5112a f36300y;

    /* JADX INFO: renamed from: z */
    public final C10151t f36301z;

    public C6245i(InterfaceC6243g interfaceC6243g, InterfaceC9882g interfaceC9882g, C9884i c9884i, C2416m c2416m, boolean z10, InterfaceC9882g interfaceC9882g2, C9884i c9884i2, boolean z11, Uri uri, List<C2416m> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, C10130a0 c10130a0, DrmInitData drmInitData, InterfaceC6246j interfaceC6246j, C5112a c5112a, C10151t c10151t, boolean z15, C6215e0 c6215e0) {
        super(interfaceC9882g, c9884i, c2416m, i10, obj, j10, j11, j12);
        this.f36275A = z10;
        this.f36290o = i11;
        this.f36285K = z12;
        this.f36287l = i12;
        this.f36292q = c9884i2;
        this.f36291p = interfaceC9882g2;
        this.f36280F = c9884i2 != null;
        this.f36276B = z11;
        this.f36288m = uri;
        this.f36294s = z14;
        this.f36296u = c10130a0;
        this.f36295t = z13;
        this.f36297v = interfaceC6243g;
        this.f36298w = list;
        this.f36299x = drmInitData;
        this.f36293r = interfaceC6246j;
        this.f36300y = c5112a;
        this.f36301z = c10151t;
        this.f36289n = z15;
        this.f36283I = ImmutableList.m9062Y();
        this.f36286k = f36274L.getAndIncrement();
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m12843d(String str) {
        if (C0062b.m383p2(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
    /* JADX INFO: renamed from: a */
    public final void mo7374a() throws IOException {
        InterfaceC6246j interfaceC6246j;
        this.f36278D.getClass();
        if (this.f36277C == null && (interfaceC6246j = this.f36293r) != null) {
            InterfaceC7507h interfaceC7507h = ((C6238b) interfaceC6246j).f36238a;
            if ((interfaceC7507h instanceof C9850c0) || (interfaceC7507h instanceof C9482e)) {
                this.f36277C = interfaceC6246j;
                this.f36280F = false;
            }
        }
        if (this.f36280F) {
            InterfaceC9882g interfaceC9882g = this.f36291p;
            interfaceC9882g.getClass();
            C9884i c9884i = this.f36292q;
            c9884i.getClass();
            m12844c(interfaceC9882g, c9884i, this.f36276B, false);
            this.f36279E = 0;
            this.f36280F = false;
        }
        if (this.f36281G) {
            return;
        }
        if (!this.f36295t) {
            m12844c(this.f35402i, this.f35395b, this.f36275A, true);
        }
        this.f36282H = !this.f36281G;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
    /* JADX INFO: renamed from: b */
    public final void mo7375b() {
        this.f36281G = true;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: c */
    public final void m12844c(InterfaceC9882g interfaceC9882g, C9884i c9884i, boolean z10, boolean z11) throws IOException {
        C9884i c9884i2;
        boolean z12;
        long j10;
        long j11;
        if (z10) {
            z12 = this.f36279E != 0;
            c9884i2 = c9884i;
        } else {
            long j12 = this.f36279E;
            long j13 = c9884i.f50442g;
            long j14 = j13 != -1 ? j13 - j12 : -1L;
            c9884i2 = (j12 == 0 && j13 == j14) ? c9884i : new C9884i(c9884i.f50436a, c9884i.f50437b, c9884i.f50438c, c9884i.f50439d, c9884i.f50440e, c9884i.f50441f + j12, j14, c9884i.f50443h, c9884i.f50444i, c9884i.f50445j);
            z12 = false;
        }
        try {
            C7504e c7504eM12846f = m12846f(interfaceC9882g, c9884i2, z11);
            if (z12) {
                c7504eM12846f.mo14998j(this.f36279E);
            }
            while (!this.f36281G) {
                try {
                    try {
                        if (!(((C6238b) this.f36277C).f36238a.mo12865d(c7504eM12846f, C6238b.f36237d) == 0)) {
                            break;
                        }
                    } catch (Throwable th2) {
                        this.f36279E = (int) (c7504eM12846f.f41477d - c9884i.f50441f);
                        throw th2;
                    }
                } catch (EOFException e10) {
                    if ((this.f35397d.f12477e & 16384) == 0) {
                        throw e10;
                    }
                    ((C6238b) this.f36277C).f36238a.mo12866e(0L, 0L);
                    j10 = c7504eM12846f.f41477d;
                    j11 = c9884i.f50441f;
                }
            }
            j10 = c7504eM12846f.f41477d;
            j11 = c9884i.f50441f;
            this.f36279E = (int) (j10 - j11);
            C8573r0.m16705W(interfaceC9882g);
        } catch (Throwable th3) {
            C8573r0.m16705W(interfaceC9882g);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m12845e(int i10) {
        C10129a.m18992d(!this.f36289n);
        if (i10 >= this.f36283I.size()) {
            return 0;
        }
        return this.f36283I.get(i10).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: f */
    public final C7504e m12846f(InterfaceC9882g interfaceC9882g, C9884i c9884i, boolean z10) throws IOException {
        int i10;
        long jM19138m;
        long j10;
        C6238b c6238b;
        C6238b c6238b2;
        InterfaceC7507h c9845a;
        boolean zMo12868g;
        boolean z11;
        List<C2416m> listSingletonList;
        int i11;
        InterfaceC7507h c9229d;
        long jMo7273e = interfaceC9882g.mo7273e(c9884i);
        int i12 = 1;
        int i13 = 0;
        if (z10) {
            try {
                C10130a0 c10130a0 = this.f36296u;
                boolean z12 = this.f36294s;
                long j11 = this.f35400g;
                synchronized (c10130a0) {
                    C10129a.m18992d(c10130a0.f51349a == 9223372036854775806L);
                    if (c10130a0.f51350b == -9223372036854775807L) {
                        if (z12) {
                            c10130a0.f51352d.set(Long.valueOf(j11));
                        } else {
                            while (c10130a0.f51350b == -9223372036854775807L) {
                                c10130a0.wait();
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        C7504e c7504e = new C7504e(interfaceC9882g, c9884i.f50441f, jMo7273e);
        if (this.f36277C == null) {
            C10151t c10151t = this.f36301z;
            c7504e.f41479f = 0;
            try {
                c10151t.m19121B(10);
                c7504e.mo14994c(c10151t.f51438a, 0, 10, false);
                if (c10151t.m19147v() != 4801587) {
                    jM19138m = -9223372036854775807L;
                    break;
                }
                c10151t.m19125F(3);
                int iM19144s = c10151t.m19144s();
                int i14 = iM19144s + 10;
                byte[] bArr = c10151t.f51438a;
                if (i14 > bArr.length) {
                    c10151t.m19121B(i14);
                    System.arraycopy(bArr, 0, c10151t.f51438a, 0, 10);
                }
                c7504e.mo14994c(c10151t.f51438a, 10, iM19144s, false);
                Metadata metadataM10891k0 = this.f36300y.m10891k0(c10151t.f51438a, iM19144s);
                if (metadataM10891k0 == null) {
                    jM19138m = -9223372036854775807L;
                    break;
                }
                Metadata.Entry[] entryArr = metadataM10891k0.f12627a;
                int length = entryArr.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        jM19138m = -9223372036854775807L;
                        break;
                    }
                    Metadata.Entry entry = entryArr[i15];
                    if (entry instanceof PrivFrame) {
                        PrivFrame privFrame = (PrivFrame) entry;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f12700b)) {
                            System.arraycopy(privFrame.f12701c, 0, c10151t.f51438a, 0, 8);
                            c10151t.m19124E(0);
                            c10151t.m19123D(8);
                            jM19138m = c10151t.m19138m() & 8589934591L;
                            break;
                        }
                    }
                    i15++;
                }
            } catch (EOFException unused2) {
            }
            c7504e.f41479f = 0;
            InterfaceC6246j interfaceC6246j = this.f36293r;
            if (interfaceC6246j != null) {
                C6238b c6238b3 = (C6238b) interfaceC6246j;
                InterfaceC7507h interfaceC7507h = c6238b3.f36238a;
                C10129a.m18992d(!((interfaceC7507h instanceof C9850c0) || (interfaceC7507h instanceof C9482e)));
                InterfaceC7507h interfaceC7507h2 = c6238b3.f36238a;
                boolean z13 = interfaceC7507h2 instanceof C6250n;
                C10130a0 c10130a1 = c6238b3.f36240c;
                C2416m c2416m = c6238b3.f36239b;
                if (z13) {
                    c9229d = new C6250n(c2416m.f12474c, c10130a1);
                } else if (interfaceC7507h2 instanceof C9853e) {
                    c9229d = new C9853e(0);
                } else if (interfaceC7507h2 instanceof C9845a) {
                    c9229d = new C9845a();
                } else if (interfaceC7507h2 instanceof C9849c) {
                    c9229d = new C9849c();
                } else {
                    if (!(interfaceC7507h2 instanceof C9229d)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC7507h2.getClass().getSimpleName()));
                    }
                    c9229d = new C9229d();
                }
                c6238b2 = new C6238b(c9229d, c2416m, c10130a1);
                j10 = jM19138m;
                i10 = 0;
            } else {
                InterfaceC6243g interfaceC6243g = this.f36297v;
                Uri uri = c9884i.f50436a;
                C2416m c2416m2 = this.f35397d;
                List<C2416m> list = this.f36298w;
                C10130a0 c10130a2 = this.f36296u;
                Map<String, List<String>> mapMo7275h = interfaceC9882g.mo7275h();
                ((C6240d) interfaceC6243g).getClass();
                int iM18996h = C10129a.m18996h(c2416m2.f12484l);
                int iM18997i = C10129a.m18997i(mapMo7275h);
                int iM18998j = C10129a.m18998j(uri);
                ArrayList arrayList = new ArrayList(7);
                C6240d.m12838a(iM18996h, arrayList);
                C6240d.m12838a(iM18997i, arrayList);
                C6240d.m12838a(iM18998j, arrayList);
                int[] iArr = C6240d.f36242b;
                int i16 = 0;
                for (int i17 = 7; i16 < i17; i17 = 7) {
                    C6240d.m12838a(iArr[i16], arrayList);
                    i16++;
                }
                c7504e.f41479f = 0;
                int i18 = 0;
                InterfaceC7507h interfaceC7507h3 = null;
                while (true) {
                    if (i18 >= arrayList.size()) {
                        j10 = jM19138m;
                        i10 = i13;
                        interfaceC7507h3.getClass();
                        c6238b = new C6238b(interfaceC7507h3, c2416m2, c10130a2);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i18)).intValue();
                    if (iIntValue == 0) {
                        j10 = jM19138m;
                        arrayList = arrayList;
                        c9845a = new C9845a();
                    } else if (iIntValue == i12) {
                        j10 = jM19138m;
                        arrayList = arrayList;
                        c9845a = new C9849c();
                    } else if (iIntValue == 2) {
                        j10 = jM19138m;
                        arrayList = arrayList;
                        c9845a = new C9853e(0);
                    } else if (iIntValue == 7) {
                        j10 = jM19138m;
                        arrayList = arrayList;
                        c9845a = new C9229d(0, 0L);
                    } else if (iIntValue == 8) {
                        j10 = jM19138m;
                        arrayList = arrayList;
                        Metadata metadata = c2416m2.f12482j;
                        if (metadata == null) {
                            z11 = false;
                            break;
                        }
                        int i19 = 0;
                        while (true) {
                            Metadata.Entry[] entryArr2 = metadata.f12627a;
                            if (i19 >= entryArr2.length) {
                                z11 = false;
                                break;
                            }
                            Metadata.Entry entry2 = entryArr2[i19];
                            if (entry2 instanceof HlsTrackMetadataEntry) {
                                z11 = !((HlsTrackMetadataEntry) entry2).f13135c.isEmpty();
                                break;
                            }
                            i19++;
                        }
                        c9845a = new C9482e(z11 ? 4 : 0, c10130a2, list != null ? list : Collections.emptyList());
                    } else if (iIntValue == 11) {
                        if (list != null) {
                            i11 = 48;
                            listSingletonList = list;
                        } else {
                            C2416m.a aVar = new C2416m.a();
                            aVar.f12501k = "application/cea-608";
                            listSingletonList = Collections.singletonList(new C2416m(aVar));
                            i11 = 16;
                        }
                        String str = c2416m2.f12481i;
                        if (TextUtils.isEmpty(str)) {
                            j10 = jM19138m;
                        } else {
                            j10 = jM19138m;
                            if (!(C10147p.m19102b(str, "audio/mp4a-latm") != null)) {
                                i11 |= 2;
                            }
                            if (!(C10147p.m19102b(str, "video/avc") != null)) {
                                i11 |= 4;
                            }
                        }
                        c9845a = new C9850c0(2, c10130a2, new C9856g(i11, listSingletonList));
                    } else if (iIntValue != 13) {
                        j10 = jM19138m;
                        arrayList = arrayList;
                        c9845a = null;
                    } else {
                        c9845a = new C6250n(c2416m2.f12474c, c10130a2);
                        j10 = jM19138m;
                        arrayList = arrayList;
                    }
                    c9845a.getClass();
                    try {
                        zMo12868g = c9845a.mo12868g(c7504e);
                        i10 = 0;
                        c7504e.f41479f = 0;
                    } catch (EOFException unused3) {
                        i10 = 0;
                        c7504e.f41479f = 0;
                        zMo12868g = false;
                    } catch (Throwable th2) {
                        c7504e.f41479f = 0;
                        throw th2;
                    }
                    if (zMo12868g) {
                        c6238b = new C6238b(c9845a, c2416m2, c10130a2);
                        break;
                    }
                    if (interfaceC7507h3 == null && (iIntValue == iM18996h || iIntValue == iM18997i || iIntValue == iM18998j || iIntValue == 11)) {
                        interfaceC7507h3 = c9845a;
                    }
                    i18++;
                    i13 = i10;
                    arrayList = arrayList;
                    jM19138m = j10;
                    i12 = 1;
                }
                c6238b2 = c6238b;
            }
            this.f36277C = c6238b2;
            InterfaceC7507h interfaceC7507h4 = c6238b2.f36238a;
            if ((((interfaceC7507h4 instanceof C9853e) || (interfaceC7507h4 instanceof C9845a) || (interfaceC7507h4 instanceof C9849c) || (interfaceC7507h4 instanceof C9229d)) ? 1 : i10) != 0) {
                C6249m c6249m = this.f36278D;
                long jM19004b = j10 != -9223372036854775807L ? this.f36296u.m19004b(j10) : this.f35400g;
                if (c6249m.f36378q0 != jM19004b) {
                    c6249m.f36378q0 = jM19004b;
                    C6249m.c[] cVarArr = c6249m.f36340Q;
                    int length2 = cVarArr.length;
                    for (int i20 = i10; i20 < length2; i20++) {
                        C6249m.c cVar = cVarArr[i20];
                        if (cVar.f13406F != jM19004b) {
                            cVar.f13406F = jM19004b;
                            cVar.f13433z = true;
                        }
                    }
                }
            } else {
                C6249m c6249m2 = this.f36278D;
                if (c6249m2.f36378q0 != 0) {
                    c6249m2.f36378q0 = 0L;
                    C6249m.c[] cVarArr2 = c6249m2.f36340Q;
                    int length3 = cVarArr2.length;
                    for (int i21 = i10; i21 < length3; i21++) {
                        C6249m.c cVar2 = cVarArr2[i21];
                        if (cVar2.f13406F != 0) {
                            cVar2.f13406F = 0L;
                            cVar2.f13433z = true;
                        }
                    }
                }
            }
            this.f36278D.f36342S.clear();
            ((C6238b) this.f36277C).f36238a.mo12867f(this.f36278D);
        } else {
            i10 = 0;
        }
        C6249m c6249m3 = this.f36278D;
        DrmInitData drmInitData = this.f36299x;
        if (!C10134c0.m19034a(c6249m3.f36379r0, drmInitData)) {
            c6249m3.f36379r0 = drmInitData;
            int i22 = i10;
            while (true) {
                C6249m.c[] cVarArr3 = c6249m3.f36340Q;
                if (i22 >= cVarArr3.length) {
                    break;
                }
                if (c6249m3.f36369j0[i22]) {
                    C6249m.c cVar3 = cVarArr3[i22];
                    cVar3.f36390I = drmInitData;
                    cVar3.f13433z = true;
                }
                i22++;
            }
        }
        return c7504e;
    }
}
