package p175ia;

import android.net.Uri;
import android.os.Handler;
import android.support.v4.media.session.C0166e;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.activity.RunnableC0183b;
import androidx.activity.RunnableC0190i;
import androidx.activity.RunnableC0193l;
import ba.C1348a;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.drm.InterfaceC2399c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.C2498o;
import com.google.android.exoplayer2.source.C2499p;
import com.google.android.exoplayer2.source.InterfaceC2493j;
import com.google.android.exoplayer2.source.InterfaceC2500q;
import com.google.android.exoplayer2.source.hls.C2484a;
import com.google.android.exoplayer2.source.hls.playlist.C2490c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import dm.C5206f;
import ga.C5725h;
import ga.C5726i;
import ga.C5735r;
import ga.C5736s;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p003a2.C0009a;
import p069da.C5112a;
import p151ha.AbstractC5945b;
import p174i9.C6215e0;
import p261m9.C7506g;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p454wa.C9884i;
import p454wa.C9893r;
import p454wa.InterfaceC9877b;
import p454wa.InterfaceC9880e;
import p454wa.InterfaceC9882g;
import p479xa.C10129a;
import p479xa.C10130a0;
import p479xa.C10132b0;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;
import p479xa.C10151t;
import ua.C9509r;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: ia.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6249m implements Loader.InterfaceC2521a<AbstractC5945b>, Loader.InterfaceC2525e, InterfaceC2500q, InterfaceC7509j, C2499p.c {

    /* JADX INFO: renamed from: t0 */
    public static final Set<Integer> f36330t0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: I */
    public final ArrayList<C6245i> f36332I;

    /* JADX INFO: renamed from: J */
    public final List<C6245i> f36333J;

    /* JADX INFO: renamed from: K */
    public final RunnableC0183b f36334K;

    /* JADX INFO: renamed from: L */
    public final RunnableC0190i f36335L;

    /* JADX INFO: renamed from: M */
    public final Handler f36336M;

    /* JADX INFO: renamed from: N */
    public final ArrayList<C6248l> f36337N;

    /* JADX INFO: renamed from: O */
    public final Map<String, DrmInitData> f36338O;

    /* JADX INFO: renamed from: P */
    public AbstractC5945b f36339P;

    /* JADX INFO: renamed from: Q */
    public c[] f36340Q;

    /* JADX INFO: renamed from: S */
    public final HashSet f36342S;

    /* JADX INFO: renamed from: T */
    public final SparseIntArray f36343T;

    /* JADX INFO: renamed from: U */
    public b f36344U;

    /* JADX INFO: renamed from: V */
    public int f36345V;

    /* JADX INFO: renamed from: W */
    public int f36346W;

    /* JADX INFO: renamed from: X */
    public boolean f36347X;

    /* JADX INFO: renamed from: Y */
    public boolean f36348Y;

    /* JADX INFO: renamed from: Z */
    public int f36349Z;

    /* JADX INFO: renamed from: a */
    public final String f36350a;

    /* JADX INFO: renamed from: a0 */
    public C2416m f36351a0;

    /* JADX INFO: renamed from: b */
    public final int f36352b;

    /* JADX INFO: renamed from: b0 */
    public C2416m f36353b0;

    /* JADX INFO: renamed from: c */
    public final a f36354c;

    /* JADX INFO: renamed from: c0 */
    public boolean f36355c0;

    /* JADX INFO: renamed from: d */
    public final C6241e f36356d;

    /* JADX INFO: renamed from: d0 */
    public C5736s f36357d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9877b f36358e;

    /* JADX INFO: renamed from: e0 */
    public Set<C5735r> f36359e0;

    /* JADX INFO: renamed from: f */
    public final C2416m f36360f;

    /* JADX INFO: renamed from: f0 */
    public int[] f36361f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2399c f36362g;

    /* JADX INFO: renamed from: g0 */
    public int f36363g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2398b.a f36364h;

    /* JADX INFO: renamed from: h0 */
    public boolean f36365h0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2528b f36366i;

    /* JADX INFO: renamed from: i0 */
    public boolean[] f36367i0;

    /* JADX INFO: renamed from: j0 */
    public boolean[] f36369j0;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2493j.a f36370k;

    /* JADX INFO: renamed from: k0 */
    public long f36371k0;

    /* JADX INFO: renamed from: l */
    public final int f36372l;

    /* JADX INFO: renamed from: l0 */
    public long f36373l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f36374m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f36375n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f36376o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f36377p0;

    /* JADX INFO: renamed from: q0 */
    public long f36378q0;

    /* JADX INFO: renamed from: r0 */
    public DrmInitData f36379r0;

    /* JADX INFO: renamed from: s0 */
    public C6245i f36380s0;

    /* JADX INFO: renamed from: j */
    public final Loader f36368j = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: H */
    public final C6241e.b f36331H = new C6241e.b();

    /* JADX INFO: renamed from: R */
    public int[] f36341R = new int[0];

    /* JADX INFO: renamed from: ia.m$a */
    public interface a extends InterfaceC2500q.a<C6249m> {
    }

    /* JADX INFO: renamed from: ia.m$b */
    public static class b implements InterfaceC7522w {

        /* JADX INFO: renamed from: g */
        public static final C2416m f36381g;

        /* JADX INFO: renamed from: h */
        public static final C2416m f36382h;

        /* JADX INFO: renamed from: a */
        public final C1348a f36383a = new C1348a();

        /* JADX INFO: renamed from: b */
        public final InterfaceC7522w f36384b;

        /* JADX INFO: renamed from: c */
        public final C2416m f36385c;

        /* JADX INFO: renamed from: d */
        public C2416m f36386d;

        /* JADX INFO: renamed from: e */
        public byte[] f36387e;

        /* JADX INFO: renamed from: f */
        public int f36388f;

        static {
            C2416m.a aVar = new C2416m.a();
            aVar.f12501k = "application/id3";
            f36381g = aVar.m7128a();
            C2416m.a aVar2 = new C2416m.a();
            aVar2.f12501k = "application/x-emsg";
            f36382h = aVar2.m7128a();
        }

        public b(InterfaceC7522w interfaceC7522w, int i10) {
            this.f36384b = interfaceC7522w;
            if (i10 == 1) {
                this.f36385c = f36381g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException(C0166e.m761g("Unknown metadataType: ", i10));
                }
                this.f36385c = f36382h;
            }
            this.f36387e = new byte[0];
            this.f36388f = 0;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p261m9.InterfaceC7522w
        /* JADX INFO: renamed from: a */
        public final int mo7385a(InterfaceC9880e interfaceC9880e, int i10, boolean z10) throws IOException {
            int i11 = this.f36388f + i10;
            byte[] bArr = this.f36387e;
            if (bArr.length < i11) {
                this.f36387e = Arrays.copyOf(bArr, (i11 / 2) + i11);
            }
            int i12 = interfaceC9880e.read(this.f36387e, this.f36388f, i10);
            if (i12 != -1) {
                this.f36388f += i12;
                return i12;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // p261m9.InterfaceC7522w
        /* JADX INFO: renamed from: b */
        public final void mo7386b(int i10, C10151t c10151t) {
            int i11 = this.f36388f + i10;
            byte[] bArr = this.f36387e;
            if (bArr.length < i11) {
                this.f36387e = Arrays.copyOf(bArr, (i11 / 2) + i11);
            }
            c10151t.m19127b(this.f36387e, this.f36388f, i10);
            this.f36388f += i10;
        }

        @Override // p261m9.InterfaceC7522w
        /* JADX INFO: renamed from: e */
        public final void mo7387e(long j10, int i10, int i11, int i12, InterfaceC7522w.a aVar) {
            this.f36386d.getClass();
            int i13 = this.f36388f - i12;
            C10151t c10151t = new C10151t(Arrays.copyOfRange(this.f36387e, i13 - i11, i13));
            byte[] bArr = this.f36387e;
            System.arraycopy(bArr, i13, bArr, 0, i12);
            this.f36388f = i12;
            String str = this.f36386d.f12484l;
            C2416m c2416m = this.f36385c;
            if (!C10134c0.m19034a(str, c2416m.f12484l)) {
                if (!"application/x-emsg".equals(this.f36386d.f12484l)) {
                    C10145n.m19099g("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f36386d.f12484l);
                    return;
                }
                this.f36383a.getClass();
                EventMessage eventMessageM4927k0 = C1348a.m4927k0(c10151t);
                C2416m c2416mMo7204G = eventMessageM4927k0.mo7204G();
                String str2 = c2416m.f12484l;
                if (!(c2416mMo7204G != null && C10134c0.m19034a(str2, c2416mMo7204G.f12484l))) {
                    C10145n.m19099g("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", str2, eventMessageM4927k0.mo7204G()));
                    return;
                } else {
                    byte[] bArrMo7205h0 = eventMessageM4927k0.mo7205h0();
                    bArrMo7205h0.getClass();
                    c10151t = new C10151t(bArrMo7205h0);
                }
            }
            int i14 = c10151t.f51440c - c10151t.f51439b;
            this.f36384b.m15021c(i14, c10151t);
            this.f36384b.mo7387e(j10, i10, i14, i12, aVar);
        }

        @Override // p261m9.InterfaceC7522w
        /* JADX INFO: renamed from: f */
        public final void mo7388f(C2416m c2416m) {
            this.f36386d = c2416m;
            this.f36384b.mo7388f(this.f36385c);
        }
    }

    /* JADX INFO: renamed from: ia.m$c */
    public static final class c extends C2499p {

        /* JADX INFO: renamed from: H */
        public final Map<String, DrmInitData> f36389H;

        /* JADX INFO: renamed from: I */
        public DrmInitData f36390I;

        public c() {
            throw null;
        }

        public c(InterfaceC9877b interfaceC9877b, InterfaceC2399c interfaceC2399c, InterfaceC2398b.a aVar, Map map) {
            super(interfaceC9877b, interfaceC2399c, aVar);
            this.f36389H = map;
        }

        @Override // com.google.android.exoplayer2.source.C2499p, p261m9.InterfaceC7522w
        /* JADX INFO: renamed from: e */
        public final void mo7387e(long j10, int i10, int i11, int i12, InterfaceC7522w.a aVar) {
            super.mo7387e(j10, i10, i11, i12, aVar);
        }

        @Override // com.google.android.exoplayer2.source.C2499p
        /* JADX INFO: renamed from: l */
        public final C2416m mo7394l(C2416m c2416m) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.f36390I;
            if (drmInitData2 == null) {
                drmInitData2 = c2416m.f12453J;
            }
            if (drmInitData2 != null && (drmInitData = this.f36389H.get(drmInitData2.f12188c)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadata = c2416m.f12482j;
            Metadata metadata2 = null;
            if (metadata == null) {
                metadata = metadata2;
            } else {
                Metadata.Entry[] entryArr = metadata.f12627a;
                int length = entryArr.length;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    }
                    Metadata.Entry entry = entryArr[i11];
                    if ((entry instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entry).f12700b)) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1) {
                    if (length != 1) {
                        Metadata.Entry[] entryArr2 = new Metadata.Entry[length - 1];
                        while (i10 < length) {
                            if (i10 != i11) {
                                entryArr2[i10 < i11 ? i10 : i10 - 1] = entryArr[i10];
                            }
                            i10++;
                        }
                        metadata2 = new Metadata(entryArr2);
                    }
                    metadata = metadata2;
                }
            }
            if (drmInitData2 != c2416m.f12453J || metadata != c2416m.f12482j) {
                C2416m.a aVarM7125a = c2416m.m7125a();
                aVarM7125a.f12504n = drmInitData2;
                aVarM7125a.f12499i = metadata;
                c2416m = aVarM7125a.m7128a();
            }
            return super.mo7394l(c2416m);
        }
    }

    public C6249m(String str, int i10, C6247k.a aVar, C6241e c6241e, Map map, InterfaceC9877b interfaceC9877b, long j10, C2416m c2416m, InterfaceC2399c interfaceC2399c, InterfaceC2398b.a aVar2, InterfaceC2528b interfaceC2528b, InterfaceC2493j.a aVar3, int i11) {
        this.f36350a = str;
        this.f36352b = i10;
        this.f36354c = aVar;
        this.f36356d = c6241e;
        this.f36338O = map;
        this.f36358e = interfaceC9877b;
        this.f36360f = c2416m;
        this.f36362g = interfaceC2399c;
        this.f36364h = aVar2;
        this.f36366i = interfaceC2528b;
        this.f36370k = aVar3;
        this.f36372l = i11;
        Set<Integer> set = f36330t0;
        this.f36342S = new HashSet(set.size());
        this.f36343T = new SparseIntArray(set.size());
        this.f36340Q = new c[0];
        this.f36369j0 = new boolean[0];
        this.f36367i0 = new boolean[0];
        ArrayList<C6245i> arrayList = new ArrayList<>();
        this.f36332I = arrayList;
        this.f36333J = Collections.unmodifiableList(arrayList);
        this.f36337N = new ArrayList<>();
        this.f36334K = new RunnableC0183b(13, this);
        this.f36335L = new RunnableC0190i(14, this);
        this.f36336M = C10134c0.m19044k(null);
        this.f36371k0 = j10;
        this.f36373l0 = j10;
    }

    /* JADX INFO: renamed from: A */
    public static int m12851A(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: v */
    public static C7506g m12852v(int i10, int i11) {
        C10145n.m19099g("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new C7506g();
    }

    /* JADX INFO: renamed from: x */
    public static C2416m m12853x(C2416m c2416m, C2416m c2416m2, boolean z10) {
        String strM19104d;
        String strM19048o;
        if (c2416m == null) {
            return c2416m2;
        }
        String str = c2416m2.f12484l;
        int iM19108h = C10147p.m19108h(str);
        String str2 = c2416m.f12481i;
        if (C10134c0.m19047n(str2, iM19108h) == 1) {
            strM19048o = C10134c0.m19048o(str2, iM19108h);
            strM19104d = C10147p.m19104d(strM19048o);
        } else {
            String strM19102b = C10147p.m19102b(str2, str);
            strM19104d = str;
            strM19048o = strM19102b;
        }
        C2416m.a aVar = new C2416m.a(c2416m2);
        aVar.f12491a = c2416m.f12470a;
        aVar.f12492b = c2416m.f12472b;
        aVar.f12493c = c2416m.f12474c;
        aVar.f12494d = c2416m.f12476d;
        aVar.f12495e = c2416m.f12477e;
        aVar.f12496f = z10 ? c2416m.f12478f : -1;
        aVar.f12497g = z10 ? c2416m.f12479g : -1;
        aVar.f12498h = strM19048o;
        if (iM19108h == 2) {
            aVar.f12506p = c2416m.f12455L;
            aVar.f12507q = c2416m.f12456M;
            aVar.f12508r = c2416m.f12457N;
        }
        if (strM19104d != null) {
            aVar.f12501k = strM19104d;
        }
        int i10 = c2416m.f12463T;
        if (i10 != -1 && iM19108h == 1) {
            aVar.f12514x = i10;
        }
        Metadata metadata = c2416m.f12482j;
        if (metadata != null) {
            Metadata metadata2 = c2416m2.f12482j;
            if (metadata2 != null) {
                Metadata.Entry[] entryArr = metadata.f12627a;
                if (entryArr.length == 0) {
                    metadata = metadata2;
                } else {
                    Metadata.Entry[] entryArr2 = metadata2.f12627a;
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata = new Metadata(metadata2.f12628b, (Metadata.Entry[]) objArrCopyOf);
                }
            }
            aVar.f12499i = metadata;
        }
        return new C2416m(aVar);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m12854B() {
        return this.f36373l0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final void m12855C() {
        int i10;
        int i11;
        if (!this.f36355c0 && this.f36361f0 == null && this.f36347X) {
            int i12 = 0;
            for (c cVar : this.f36340Q) {
                if (cVar.m7398p() == null) {
                    return;
                }
            }
            C5736s c5736s = this.f36357d0;
            if (c5736s != null) {
                int i13 = c5736s.f34808a;
                int[] iArr = new int[i13];
                this.f36361f0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i14 = 0; i14 < i13; i14++) {
                    int i15 = 0;
                    while (true) {
                        c[] cVarArr = this.f36340Q;
                        if (i15 >= cVarArr.length) {
                            break;
                        }
                        C2416m c2416mM7398p = cVarArr[i15].m7398p();
                        C10129a.m18993e(c2416mM7398p);
                        C2416m c2416m = this.f36357d0.m12091a(i14).f34803d[0];
                        String str = c2416m.f12484l;
                        String str2 = c2416mM7398p.f12484l;
                        int iM19108h = C10147p.m19108h(str2);
                        if (iM19108h == 3 ? C10134c0.m19034a(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || c2416mM7398p.f12468Y == c2416m.f12468Y) : iM19108h == C10147p.m19108h(str)) {
                            this.f36361f0[i14] = i15;
                            break;
                        }
                        i15++;
                    }
                }
                Iterator<C6248l> it = this.f36337N.iterator();
                while (it.hasNext()) {
                    it.next().m12850a();
                }
                return;
            }
            int length = this.f36340Q.length;
            int i16 = -1;
            int i17 = 0;
            int i18 = -2;
            while (true) {
                int i19 = 2;
                if (i17 >= length) {
                    break;
                }
                C2416m c2416mM7398p2 = this.f36340Q[i17].m7398p();
                C10129a.m18993e(c2416mM7398p2);
                String str3 = c2416mM7398p2.f12484l;
                if (!C10147p.m19111k(str3)) {
                    i19 = C10147p.m19109i(str3) ? 1 : C10147p.m19110j(str3) ? 3 : -2;
                }
                if (m12851A(i19) > m12851A(i18)) {
                    i16 = i17;
                    i18 = i19;
                } else if (i19 == i18 && i16 != -1) {
                    i16 = -1;
                }
                i17++;
            }
            C5735r c5735r = this.f36356d.f36250h;
            int i20 = c5735r.f34800a;
            this.f36363g0 = -1;
            this.f36361f0 = new int[length];
            for (int i21 = 0; i21 < length; i21++) {
                this.f36361f0[i21] = i21;
            }
            C5735r[] c5735rArr = new C5735r[length];
            int i22 = 0;
            while (i12 < length) {
                C2416m c2416mM7398p3 = this.f36340Q[i12].m7398p();
                C10129a.m18993e(c2416mM7398p3);
                C2416m c2416m2 = this.f36360f;
                String str4 = this.f36350a;
                if (i12 == i16) {
                    C2416m[] c2416mArr = new C2416m[i20];
                    while (i11 < i20) {
                        C2416m c2416mM7127e = c5735r.f34803d[i11];
                        if (i18 == 1 && c2416m2 != null) {
                            c2416mM7127e = c2416mM7127e.m7127e(c2416m2);
                        }
                        c2416mArr[i11] = i20 == 1 ? c2416mM7398p3.m7127e(c2416mM7127e) : m12853x(c2416mM7127e, c2416mM7398p3, true);
                        i11++;
                    }
                    i11 = i22;
                    c5735rArr[i12] = new C5735r(str4, c2416mArr);
                    this.f36363g0 = i12;
                    i10 = 0;
                } else {
                    if (i18 != 2 || !C10147p.m19109i(c2416mM7398p3.f12484l)) {
                        c2416m2 = null;
                    }
                    StringBuilder sbM26o = C0009a.m26o(str4, ":muxed:");
                    sbM26o.append(i12 < i16 ? i12 : i12 - 1);
                    c5735rArr[i12] = new C5735r(sbM26o.toString(), m12853x(c2416m2, c2416mM7398p3, false));
                    i10 = 0;
                }
                i12++;
                i22 = i10;
            }
            this.f36357d0 = m12861w(c5735rArr);
            boolean z10 = i22;
            if (this.f36359e0 == null) {
                z10 = 1;
            }
            C10129a.m18992d(z10);
            this.f36359e0 = Collections.emptySet();
            this.f36348Y = true;
            ((C6247k.a) this.f36354c).m12849c();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: D */
    public final void m12856D() throws IOException {
        IOException iOException;
        Loader loader = this.f36368j;
        IOException iOException2 = loader.f13699c;
        if (iOException2 != null) {
            throw iOException2;
        }
        Loader.HandlerC2523c<? extends Loader.InterfaceC2524d> handlerC2523c = loader.f13698b;
        if (handlerC2523c != null && (iOException = handlerC2523c.f13706e) != null && handlerC2523c.f13707f > handlerC2523c.f13702a) {
            throw iOException;
        }
        C6241e c6241e = this.f36356d;
        BehindLiveWindowException behindLiveWindowException = c6241e.f36256n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = c6241e.f36257o;
        if (uri != null && c6241e.f36261s) {
            c6241e.f36249g.mo7301d(uri);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m12857E(C5735r[] c5735rArr, int... iArr) {
        this.f36357d0 = m12861w(c5735rArr);
        this.f36359e0 = new HashSet();
        for (int i10 : iArr) {
            this.f36359e0.add(this.f36357d0.m12091a(i10));
        }
        this.f36363g0 = 0;
        Handler handler = this.f36336M;
        a aVar = this.f36354c;
        Objects.requireNonNull(aVar);
        handler.post(new RunnableC0193l(9, aVar));
        this.f36348Y = true;
    }

    /* JADX INFO: renamed from: F */
    public final void m12858F() {
        for (c cVar : this.f36340Q) {
            cVar.m7403u(this.f36374m0);
        }
        this.f36374m0 = false;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m12859G(boolean z10, long j10) {
        boolean z11;
        this.f36371k0 = j10;
        if (m12854B()) {
            this.f36373l0 = j10;
            return true;
        }
        if (this.f36347X && !z10) {
            int length = this.f36340Q.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z11 = true;
                    break;
                }
                if (!this.f36340Q[i10].m7404v(false, j10) && (this.f36369j0[i10] || !this.f36365h0)) {
                    z11 = false;
                    break;
                }
                i10++;
            }
            if (z11) {
                return false;
            }
        }
        this.f36373l0 = j10;
        this.f36376o0 = false;
        this.f36332I.clear();
        Loader loader = this.f36368j;
        if (loader.m7467b()) {
            if (this.f36347X) {
                for (c cVar : this.f36340Q) {
                    cVar.m7391i();
                }
            }
            loader.m7466a();
        } else {
            loader.f13699c = null;
            m12858F();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2525e
    /* JADX INFO: renamed from: a */
    public final void mo7363a() {
        for (c cVar : this.f36340Q) {
            cVar.m7403u(true);
            DrmSession drmSession = cVar.f13415h;
            if (drmSession != null) {
                drmSession.mo6938h(cVar.f13412e);
                cVar.f13415h = null;
                cVar.f13414g = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: b */
    public final void mo7313b(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, boolean z10) {
        AbstractC5945b abstractC5945b = (AbstractC5945b) interfaceC2524d;
        this.f36339P = null;
        long j12 = abstractC5945b.f35394a;
        C9893r c9893r = abstractC5945b.f35402i;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        this.f36366i.getClass();
        this.f36370k.m7329d(c5725h, abstractC5945b.f35396c, this.f36352b, abstractC5945b.f35397d, abstractC5945b.f35398e, abstractC5945b.f35399f, abstractC5945b.f35400g, abstractC5945b.f35401h);
        if (z10) {
            return;
        }
        if (m12854B() || this.f36349Z == 0) {
            m12858F();
        }
        if (this.f36349Z > 0) {
            ((C6247k.a) this.f36354c).mo7091a(this);
        }
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: c */
    public final void mo7364c(InterfaceC7520u interfaceC7520u) {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: d */
    public final long mo7251d() {
        if (m12854B()) {
            return this.f36373l0;
        }
        if (this.f36376o0) {
            return Long.MIN_VALUE;
        }
        return m12863z().f35401h;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: e */
    public final void mo7314e(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11) {
        AbstractC5945b abstractC5945b = (AbstractC5945b) interfaceC2524d;
        this.f36339P = null;
        C6241e c6241e = this.f36356d;
        c6241e.getClass();
        if (abstractC5945b instanceof C6241e.a) {
            C6241e.a aVar = (C6241e.a) abstractC5945b;
            c6241e.f36255m = aVar.f35403j;
            Uri uri = aVar.f35395b.f50436a;
            byte[] bArr = aVar.f36262l;
            bArr.getClass();
            LinkedHashMap<Uri, byte[]> linkedHashMap = c6241e.f36252j.f13142a;
            uri.getClass();
            linkedHashMap.put(uri, bArr);
        }
        long j12 = abstractC5945b.f35394a;
        C9893r c9893r = abstractC5945b.f35402i;
        Uri uri2 = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        this.f36366i.getClass();
        this.f36370k.m7331f(c5725h, abstractC5945b.f35396c, this.f36352b, abstractC5945b.f35397d, abstractC5945b.f35398e, abstractC5945b.f35399f, abstractC5945b.f35400g, abstractC5945b.f35401h);
        if (this.f36348Y) {
            ((C6247k.a) this.f36354c).mo7091a(this);
        } else {
            mo7254h(this.f36371k0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0245  */
    /* JADX WARN: Code duplicated, block: B:106:0x026a A[PHI: r1
      0x026a: PHI (r1v41 ia.e$e) = (r1v40 ia.e$e), (r1v45 ia.e$e) binds: [B:96:0x022e, B:104:0x024e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x0278  */
    /* JADX WARN: Code duplicated, block: B:112:0x0282  */
    /* JADX WARN: Code duplicated, block: B:116:0x028e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0292  */
    /* JADX WARN: Code duplicated, block: B:122:0x029c  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0310  */
    /* JADX WARN: Code duplicated, block: B:158:0x0317  */
    /* JADX WARN: Code duplicated, block: B:160:0x0323  */
    /* JADX WARN: Code duplicated, block: B:161:0x0326  */
    /* JADX WARN: Code duplicated, block: B:164:0x0351  */
    /* JADX WARN: Code duplicated, block: B:165:0x0358  */
    /* JADX WARN: Code duplicated, block: B:168:0x0376  */
    /* JADX WARN: Code duplicated, block: B:169:0x037b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0381  */
    /* JADX WARN: Code duplicated, block: B:172:0x038b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0391  */
    /* JADX WARN: Code duplicated, block: B:176:0x039c  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:184:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:187:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:190:0x03de  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:195:0x03f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x0413  */
    /* JADX WARN: Code duplicated, block: B:206:0x041c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0422  */
    /* JADX WARN: Code duplicated, block: B:211:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x0435  */
    /* JADX WARN: Code duplicated, block: B:219:0x0444  */
    /* JADX WARN: Code duplicated, block: B:222:0x046e  */
    /* JADX WARN: Code duplicated, block: B:226:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:228:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:230:0x04b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:231:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:234:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:236:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:238:0x04ed A[LOOP:1: B:237:0x04eb->B:238:0x04ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x050c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0519  */
    /* JADX WARN: Code duplicated, block: B:253:0x051c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:92:0x0216  */
    /* JADX WARN: Code duplicated, block: B:94:0x021c  */
    /* JADX WARN: Code duplicated, block: B:95:0x022c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0230  */
    /* JADX WARN: Code duplicated, block: B:99:0x0234  */
    /* JADX WARN: Instruction removed from duplicated block: B:236:0x04ca, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: h */
    public final boolean mo7254h(long j10) {
        long jMax;
        List<C6245i> listEmptyList;
        C6241e.b bVar;
        long jMax2;
        C6245i c6245i;
        int iMo7349k;
        boolean z10;
        Uri[] uriArr;
        Uri uri;
        HlsPlaylistTracker hlsPlaylistTracker;
        C2490c c2490cMo7310n;
        boolean z11;
        long j11;
        long jMo7302f;
        long jMo7302f2;
        C6241e.b bVar2;
        long jLongValue;
        int iIntValue;
        C6245i c6245i2;
        long j12;
        int i10;
        ImmutableList immutableList;
        int size;
        ImmutableList immutableList2;
        C2490c.c cVar;
        int i11;
        C6241e.e eVar;
        C2490c.c cVar2;
        String str;
        Uri uriM19011d;
        C6241e.a aVarM12842d;
        C2490c.d dVar;
        Uri uriM19011d2;
        C6241e.a aVarM12842d2;
        long j13;
        boolean z12;
        boolean z13;
        C2490c c2490c;
        boolean z14;
        boolean z15;
        boolean z16;
        C2484a c2484a;
        byte[] bArr;
        byte[] bArr2;
        C6245i c6245i3;
        int i12;
        boolean z17;
        byte[] bArrM12843d;
        InterfaceC9882g interfaceC9882g;
        InterfaceC9882g c6237a;
        C2490c.c cVar3;
        C9884i c9884i;
        InterfaceC9882g interfaceC9882g2;
        boolean z18;
        int i13;
        C5112a c5112a;
        InterfaceC6246j interfaceC6246j;
        C10151t c10151t;
        SparseArray sparseArray;
        C10130a0 c10130a0;
        C6241e.b bVar3;
        C9884i c9884i2;
        boolean z19;
        boolean z20;
        InterfaceC6246j interfaceC6246j2;
        boolean z21;
        byte[] bArrM12843d2;
        InterfaceC9882g c6237a2;
        String str2;
        String str3;
        boolean z22;
        AbstractC5945b abstractC5945b;
        Uri uri2;
        C6245i c6245i4;
        ImmutableList.C3146a c3146a;
        int i14;
        int i15;
        if (!this.f36376o0) {
            Loader loader = this.f36368j;
            if (!loader.m7467b()) {
                if (!(loader.f13699c != null)) {
                    if (m12854B()) {
                        listEmptyList = Collections.emptyList();
                        jMax = this.f36373l0;
                        for (c cVar4 : this.f36340Q) {
                            cVar4.f13427t = this.f36373l0;
                        }
                    } else {
                        C6245i c6245iM12863z = m12863z();
                        jMax = c6245iM12863z.f36282H ? c6245iM12863z.f35401h : Math.max(this.f36371k0, c6245iM12863z.f35400g);
                        listEmptyList = this.f36333J;
                    }
                    List<C6245i> list = listEmptyList;
                    long j14 = jMax;
                    C6241e.b bVar4 = this.f36331H;
                    bVar4.f36263a = null;
                    bVar4.f36264b = false;
                    bVar4.f36265c = null;
                    boolean z23 = this.f36348Y || !list.isEmpty();
                    C6241e c6241e = this.f36356d;
                    c6241e.getClass();
                    C6245i c6245i5 = list.isEmpty() ? null : (C6245i) C5206f.m11002X0(list);
                    long jMax3 = j14 - j10;
                    int iM12090a = c6245i5 == null ? -1 : c6241e.f36250h.m12090a(c6245i5.f35397d);
                    long j15 = c6241e.f36260r;
                    long j16 = (j15 > (-9223372036854775807L) ? 1 : (j15 == (-9223372036854775807L) ? 0 : -1)) != 0 ? j15 - j10 : -9223372036854775807L;
                    if (c6245i5 != null && !c6241e.f36258p) {
                        bVar = bVar4;
                        long j17 = c6245i5.f35401h - c6245i5.f35400g;
                        jMax3 = Math.max(0L, jMax3 - j17);
                        if (j16 != -9223372036854775807L) {
                            jMax2 = Math.max(0L, j16 - j17);
                        }
                        c6245i = c6245i5;
                        c6241e.f36259q.mo7341c(j10, jMax3, jMax2, list, c6241e.m12839a(c6245i5, j14));
                        iMo7349k = c6241e.f36259q.mo7349k();
                        if (iM12090a != iMo7349k) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        uriArr = c6241e.f36247e;
                        uri = uriArr[iMo7349k];
                        hlsPlaylistTracker = c6241e.f36249g;
                        if (hlsPlaylistTracker.mo7299a(uri)) {
                            C6241e.b bVar5 = bVar;
                            c2490cMo7310n = hlsPlaylistTracker.mo7310n(true, uri);
                            c2490cMo7310n.getClass();
                            c6241e.f36258p = c2490cMo7310n.f36991c;
                            z11 = c2490cMo7310n.f13238o;
                            j11 = c2490cMo7310n.f13231h;
                            if (z11) {
                                jMo7302f = -9223372036854775807L;
                            } else {
                                jMo7302f = (c2490cMo7310n.f13244u + j11) - hlsPlaylistTracker.mo7302f();
                            }
                            c6241e.f36260r = jMo7302f;
                            jMo7302f2 = j11 - hlsPlaylistTracker.mo7302f();
                            bVar2 = bVar5;
                            Pair<Long, Integer> pairM12841c = c6241e.m12841c(c6245i, z10, c2490cMo7310n, jMo7302f2, j14);
                            jLongValue = ((Long) pairM12841c.first).longValue();
                            iIntValue = ((Integer) pairM12841c.second).intValue();
                            if (jLongValue < c2490cMo7310n.f13234k) {
                                c6245i2 = c6245i;
                                if (c6245i2 != null && z10) {
                                    uri = uriArr[iM12090a];
                                    c2490cMo7310n = hlsPlaylistTracker.mo7310n(true, uri);
                                    c2490cMo7310n.getClass();
                                    jMo7302f2 = c2490cMo7310n.f13231h - hlsPlaylistTracker.mo7302f();
                                    Pair<Long, Integer> pairM12841c2 = c6241e.m12841c(c6245i2, false, c2490cMo7310n, jMo7302f2, j14);
                                    jLongValue = ((Long) pairM12841c2.first).longValue();
                                    iIntValue = ((Integer) pairM12841c2.second).intValue();
                                    iMo7349k = iM12090a;
                                }
                            } else {
                                c6245i2 = c6245i;
                            }
                            j12 = c2490cMo7310n.f13234k;
                            if (jLongValue < j12) {
                                c6241e.f36256n = new BehindLiveWindowException();
                            } else {
                                i10 = (int) (jLongValue - j12);
                                immutableList = c2490cMo7310n.f13241r;
                                size = immutableList.size();
                                immutableList2 = c2490cMo7310n.f13242s;
                                if (i10 == size) {
                                    if (iIntValue == -1) {
                                        iIntValue = 0;
                                    }
                                    if (iIntValue < immutableList2.size()) {
                                        eVar = new C6241e.e((C2490c.d) immutableList2.get(iIntValue), jLongValue, iIntValue);
                                    } else {
                                        eVar = null;
                                    }
                                } else {
                                    cVar = (C2490c.c) immutableList.get(i10);
                                    if (iIntValue == -1) {
                                        eVar = new C6241e.e(cVar, jLongValue, -1);
                                    } else if (iIntValue < cVar.f13251H.size()) {
                                        eVar = new C6241e.e((C2490c.d) cVar.f13251H.get(iIntValue), jLongValue, iIntValue);
                                    } else {
                                        i11 = i10 + 1;
                                        if (i11 < immutableList.size()) {
                                            eVar = new C6241e.e((C2490c.d) immutableList.get(i11), jLongValue + 1, -1);
                                        } else if (immutableList2.isEmpty()) {
                                            eVar = null;
                                        } else {
                                            eVar = new C6241e.e((C2490c.d) immutableList2.get(0), jLongValue + 1, 0);
                                        }
                                    }
                                }
                                if (eVar != null) {
                                    c6241e.f36261s = false;
                                    c6241e.f36257o = null;
                                    cVar2 = eVar.f36269a.f13254b;
                                    str = c2490cMo7310n.f36989a;
                                    if (cVar2 != null || (str3 = cVar2.f13259g) == null) {
                                        uriM19011d = null;
                                    } else {
                                        uriM19011d = C10132b0.m19011d(str, str3);
                                    }
                                    aVarM12842d = c6241e.m12842d(uriM19011d, iMo7349k);
                                    bVar2.f36263a = aVarM12842d;
                                    if (aVarM12842d == null) {
                                        dVar = eVar.f36269a;
                                        if (dVar != null || (str2 = dVar.f13259g) == null) {
                                            uriM19011d2 = null;
                                        } else {
                                            uriM19011d2 = C10132b0.m19011d(str, str2);
                                        }
                                        aVarM12842d2 = c6241e.m12842d(uriM19011d2, iMo7349k);
                                        bVar2.f36263a = aVarM12842d2;
                                        if (aVarM12842d2 == null) {
                                            if (c6245i2 == null) {
                                                AtomicInteger atomicInteger = C6245i.f36274L;
                                            } else {
                                                if (uri.equals(c6245i2.f36288m) || !c6245i2.f36282H) {
                                                    j13 = dVar.f13257e + jMo7302f2;
                                                    z12 = dVar instanceof C2490c.a;
                                                    z13 = c2490cMo7310n.f36991c;
                                                    if (z12) {
                                                        if (!((C2490c.a) dVar).f13247l || (eVar.f36271c == 0 && z13)) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                    }
                                                    if (z13) {
                                                        c2490c = c2490cMo7310n;
                                                        if (j13 >= c6245i2.f35401h) {
                                                            z14 = false;
                                                        }
                                                        z15 = z14;
                                                    } else {
                                                        c2490c = c2490cMo7310n;
                                                    }
                                                    z14 = true;
                                                    z15 = z14;
                                                }
                                                z16 = eVar.f36272d;
                                                if (z15 || !z16) {
                                                    InterfaceC6243g interfaceC6243g = c6241e.f36243a;
                                                    C2416m c2416m = c6241e.f36248f[iMo7349k];
                                                    List<C2416m> list2 = c6241e.f36251i;
                                                    int iMo7351m = c6241e.f36259q.mo7351m();
                                                    Object objMo7353o = c6241e.f36259q.mo7353o();
                                                    boolean z24 = c6241e.f36254l;
                                                    c2484a = c6241e.f36252j;
                                                    if (uriM19011d2 == null) {
                                                        c2484a.getClass();
                                                        bArr = null;
                                                    } else {
                                                        bArr = c2484a.f13142a.get(uriM19011d2);
                                                    }
                                                    if (uriM19011d == null) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = c2484a.f13142a.get(uriM19011d);
                                                    }
                                                    C6215e0 c6215e0 = c6241e.f36253k;
                                                    AtomicInteger atomicInteger2 = C6245i.f36274L;
                                                    Map mapEmptyMap = Collections.emptyMap();
                                                    Uri uriM19011d3 = C10132b0.m19011d(str, dVar.f13253a);
                                                    c6245i3 = c6245i2;
                                                    long j18 = dVar.f13261i;
                                                    long j19 = jMo7302f2;
                                                    long j20 = dVar.f13262j;
                                                    if (z16) {
                                                        i12 = 8;
                                                    } else {
                                                        i12 = 0;
                                                    }
                                                    C10129a.m18994f(uriM19011d3, "The uri must be set.");
                                                    C9884i c9884i3 = new C9884i(uriM19011d3, 0L, 1, null, mapEmptyMap, j18, j20, null, i12, null);
                                                    if (bArr != null) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        String str4 = dVar.f13260h;
                                                        str4.getClass();
                                                        bArrM12843d = C6245i.m12843d(str4);
                                                    } else {
                                                        bArrM12843d = null;
                                                    }
                                                    interfaceC9882g = c6241e.f36244b;
                                                    if (bArr != null) {
                                                        bArrM12843d.getClass();
                                                        c6237a = new C6237a(interfaceC9882g, bArr, bArrM12843d);
                                                    } else {
                                                        c6237a = interfaceC9882g;
                                                    }
                                                    cVar3 = dVar.f13254b;
                                                    if (cVar3 != null) {
                                                        if (bArr2 != null) {
                                                            z21 = true;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                        if (z21) {
                                                            String str5 = cVar3.f13260h;
                                                            str5.getClass();
                                                            bArrM12843d2 = C6245i.m12843d(str5);
                                                        } else {
                                                            bArrM12843d2 = null;
                                                        }
                                                        c9884i = new C9884i(C10132b0.m19011d(str, cVar3.f13253a), cVar3.f13261i, cVar3.f13262j);
                                                        if (bArr2 != null) {
                                                            bArrM12843d2.getClass();
                                                            c6237a2 = new C6237a(interfaceC9882g, bArr2, bArrM12843d2);
                                                        } else {
                                                            c6237a2 = interfaceC9882g;
                                                        }
                                                        z18 = z21;
                                                        interfaceC9882g2 = c6237a2;
                                                    } else {
                                                        c9884i = null;
                                                        interfaceC9882g2 = null;
                                                        z18 = false;
                                                    }
                                                    long j21 = j19 + dVar.f13257e;
                                                    long j22 = j21 + dVar.f13255c;
                                                    i13 = c2490c.f13233j + dVar.f13256d;
                                                    if (c6245i3 != null) {
                                                        c9884i2 = c6245i3.f36292q;
                                                        if (c9884i != c9884i2 || (c9884i != null && c9884i2 != null && c9884i.f50436a.equals(c9884i2.f50436a) && c9884i.f50441f == c9884i2.f50441f)) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = false;
                                                        }
                                                        if (uri.equals(c6245i3.f36288m) || !c6245i3.f36282H) {
                                                            z20 = false;
                                                        } else {
                                                            z20 = true;
                                                        }
                                                        if (z19 || !z20 || c6245i3.f36284J || c6245i3.f36287l != i13) {
                                                            interfaceC6246j2 = null;
                                                        } else {
                                                            interfaceC6246j2 = c6245i3.f36277C;
                                                        }
                                                        c5112a = c6245i3.f36300y;
                                                        c10151t = c6245i3.f36301z;
                                                        interfaceC6246j = interfaceC6246j2;
                                                    } else {
                                                        c5112a = new C5112a(null);
                                                        interfaceC6246j = null;
                                                        c10151t = new C10151t(10);
                                                    }
                                                    long j23 = eVar.f36270b;
                                                    int i16 = eVar.f36271c;
                                                    boolean z25 = !z16;
                                                    boolean z26 = dVar.f13263k;
                                                    sparseArray = c6241e.f36246d.f34016a;
                                                    c10130a0 = (C10130a0) sparseArray.get(i13);
                                                    if (c10130a0 == null) {
                                                        c10130a0 = new C10130a0(9223372036854775806L);
                                                        sparseArray.put(i13, c10130a0);
                                                    }
                                                    bVar3 = bVar2;
                                                    bVar3.f36263a = new C6245i(interfaceC6243g, c6237a, c9884i3, c2416m, z17, interfaceC9882g2, c9884i, z18, uri, list2, iMo7351m, objMo7353o, j21, j22, j23, i16, z25, i13, z26, z24, c10130a0, dVar.f13258f, interfaceC6246j, c5112a, c10151t, z15, c6215e0);
                                                }
                                            }
                                            z15 = false;
                                            c2490c = c2490cMo7310n;
                                            z16 = eVar.f36272d;
                                            if (z15) {
                                            }
                                            InterfaceC6243g interfaceC6243g2 = c6241e.f36243a;
                                            C2416m c2416m2 = c6241e.f36248f[iMo7349k];
                                            List<C2416m> list3 = c6241e.f36251i;
                                            int iMo7351m2 = c6241e.f36259q.mo7351m();
                                            Object objMo7353o2 = c6241e.f36259q.mo7353o();
                                            boolean z27 = c6241e.f36254l;
                                            c2484a = c6241e.f36252j;
                                            if (uriM19011d2 == null) {
                                                c2484a.getClass();
                                                bArr = null;
                                            } else {
                                                bArr = c2484a.f13142a.get(uriM19011d2);
                                            }
                                            if (uriM19011d == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = c2484a.f13142a.get(uriM19011d);
                                            }
                                            C6215e0 c6215e1 = c6241e.f36253k;
                                            AtomicInteger atomicInteger3 = C6245i.f36274L;
                                            Map mapEmptyMap2 = Collections.emptyMap();
                                            Uri uriM19011d4 = C10132b0.m19011d(str, dVar.f13253a);
                                            c6245i3 = c6245i2;
                                            long j110 = dVar.f13261i;
                                            long j111 = jMo7302f2;
                                            long j24 = dVar.f13262j;
                                            if (z16) {
                                                i12 = 8;
                                            } else {
                                                i12 = 0;
                                            }
                                            C10129a.m18994f(uriM19011d4, "The uri must be set.");
                                            C9884i c9884i4 = new C9884i(uriM19011d4, 0L, 1, null, mapEmptyMap2, j110, j24, null, i12, null);
                                            if (bArr != null) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z17) {
                                                String str6 = dVar.f13260h;
                                                str6.getClass();
                                                bArrM12843d = C6245i.m12843d(str6);
                                            } else {
                                                bArrM12843d = null;
                                            }
                                            interfaceC9882g = c6241e.f36244b;
                                            if (bArr != null) {
                                                bArrM12843d.getClass();
                                                c6237a = new C6237a(interfaceC9882g, bArr, bArrM12843d);
                                            } else {
                                                c6237a = interfaceC9882g;
                                            }
                                            cVar3 = dVar.f13254b;
                                            if (cVar3 != null) {
                                                if (bArr2 != null) {
                                                    z21 = true;
                                                } else {
                                                    z21 = false;
                                                }
                                                if (z21) {
                                                    String str7 = cVar3.f13260h;
                                                    str7.getClass();
                                                    bArrM12843d2 = C6245i.m12843d(str7);
                                                } else {
                                                    bArrM12843d2 = null;
                                                }
                                                c9884i = new C9884i(C10132b0.m19011d(str, cVar3.f13253a), cVar3.f13261i, cVar3.f13262j);
                                                if (bArr2 != null) {
                                                    bArrM12843d2.getClass();
                                                    c6237a2 = new C6237a(interfaceC9882g, bArr2, bArrM12843d2);
                                                } else {
                                                    c6237a2 = interfaceC9882g;
                                                }
                                                z18 = z21;
                                                interfaceC9882g2 = c6237a2;
                                            } else {
                                                c9884i = null;
                                                interfaceC9882g2 = null;
                                                z18 = false;
                                            }
                                            long j25 = j111 + dVar.f13257e;
                                            long j26 = j25 + dVar.f13255c;
                                            i13 = c2490c.f13233j + dVar.f13256d;
                                            if (c6245i3 != null) {
                                                c9884i2 = c6245i3.f36292q;
                                                if (c9884i != c9884i2) {
                                                    z19 = true;
                                                } else {
                                                    z19 = true;
                                                }
                                                if (uri.equals(c6245i3.f36288m)) {
                                                    z20 = false;
                                                } else {
                                                    z20 = false;
                                                }
                                                if (z19) {
                                                    interfaceC6246j2 = null;
                                                } else {
                                                    interfaceC6246j2 = null;
                                                }
                                                c5112a = c6245i3.f36300y;
                                                c10151t = c6245i3.f36301z;
                                                interfaceC6246j = interfaceC6246j2;
                                            } else {
                                                c5112a = new C5112a(null);
                                                interfaceC6246j = null;
                                                c10151t = new C10151t(10);
                                            }
                                            long j27 = eVar.f36270b;
                                            int i17 = eVar.f36271c;
                                            boolean z28 = !z16;
                                            boolean z29 = dVar.f13263k;
                                            sparseArray = c6241e.f36246d.f34016a;
                                            c10130a0 = (C10130a0) sparseArray.get(i13);
                                            if (c10130a0 == null) {
                                                c10130a0 = new C10130a0(9223372036854775806L);
                                                sparseArray.put(i13, c10130a0);
                                            }
                                            bVar3 = bVar2;
                                            bVar3.f36263a = new C6245i(interfaceC6243g2, c6237a, c9884i4, c2416m2, z17, interfaceC9882g2, c9884i, z18, uri, list3, iMo7351m2, objMo7353o2, j25, j26, j27, i17, z28, i13, z29, z27, c10130a0, dVar.f13258f, interfaceC6246j, c5112a, c10151t, z15, c6215e1);
                                        }
                                        bVar3 = bVar2;
                                    }
                                } else if (!c2490cMo7310n.f13238o) {
                                    bVar2.f36265c = uri;
                                    c6241e.f36261s &= uri.equals(c6241e.f36257o);
                                    c6241e.f36257o = uri;
                                } else if (!z23 || immutableList.isEmpty()) {
                                    bVar2.f36264b = true;
                                } else {
                                    eVar = new C6241e.e((C2490c.d) C5206f.m11002X0(immutableList), (c2490cMo7310n.f13234k + ((long) immutableList.size())) - 1, -1);
                                    c6241e.f36261s = false;
                                    c6241e.f36257o = null;
                                    cVar2 = eVar.f36269a.f13254b;
                                    str = c2490cMo7310n.f36989a;
                                    if (cVar2 != null) {
                                        uriM19011d = null;
                                    } else {
                                        uriM19011d = null;
                                    }
                                    aVarM12842d = c6241e.m12842d(uriM19011d, iMo7349k);
                                    bVar2.f36263a = aVarM12842d;
                                    if (aVarM12842d == null) {
                                        dVar = eVar.f36269a;
                                        if (dVar != null) {
                                            uriM19011d2 = null;
                                        } else {
                                            uriM19011d2 = null;
                                        }
                                        aVarM12842d2 = c6241e.m12842d(uriM19011d2, iMo7349k);
                                        bVar2.f36263a = aVarM12842d2;
                                        if (aVarM12842d2 == null) {
                                            if (c6245i2 == null) {
                                                AtomicInteger atomicInteger4 = C6245i.f36274L;
                                            } else {
                                                if (uri.equals(c6245i2.f36288m)) {
                                                }
                                                j13 = dVar.f13257e + jMo7302f2;
                                                z12 = dVar instanceof C2490c.a;
                                                z13 = c2490cMo7310n.f36991c;
                                                if (z12) {
                                                    if (((C2490c.a) dVar).f13247l) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = true;
                                                    }
                                                }
                                                if (z13) {
                                                    c2490c = c2490cMo7310n;
                                                    if (j13 >= c6245i2.f35401h) {
                                                        z14 = false;
                                                    }
                                                    z15 = z14;
                                                    z16 = eVar.f36272d;
                                                    if (z15) {
                                                    }
                                                    InterfaceC6243g interfaceC6243g3 = c6241e.f36243a;
                                                    C2416m c2416m3 = c6241e.f36248f[iMo7349k];
                                                    List<C2416m> list4 = c6241e.f36251i;
                                                    int iMo7351m3 = c6241e.f36259q.mo7351m();
                                                    Object objMo7353o3 = c6241e.f36259q.mo7353o();
                                                    boolean z210 = c6241e.f36254l;
                                                    c2484a = c6241e.f36252j;
                                                    if (uriM19011d2 == null) {
                                                        c2484a.getClass();
                                                        bArr = null;
                                                    } else {
                                                        bArr = c2484a.f13142a.get(uriM19011d2);
                                                    }
                                                    if (uriM19011d == null) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = c2484a.f13142a.get(uriM19011d);
                                                    }
                                                    C6215e0 c6215e2 = c6241e.f36253k;
                                                    AtomicInteger atomicInteger5 = C6245i.f36274L;
                                                    Map mapEmptyMap3 = Collections.emptyMap();
                                                    Uri uriM19011d5 = C10132b0.m19011d(str, dVar.f13253a);
                                                    c6245i3 = c6245i2;
                                                    long j112 = dVar.f13261i;
                                                    long j113 = jMo7302f2;
                                                    long j28 = dVar.f13262j;
                                                    if (z16) {
                                                        i12 = 8;
                                                    } else {
                                                        i12 = 0;
                                                    }
                                                    C10129a.m18994f(uriM19011d5, "The uri must be set.");
                                                    C9884i c9884i5 = new C9884i(uriM19011d5, 0L, 1, null, mapEmptyMap3, j112, j28, null, i12, null);
                                                    if (bArr != null) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        String str8 = dVar.f13260h;
                                                        str8.getClass();
                                                        bArrM12843d = C6245i.m12843d(str8);
                                                    } else {
                                                        bArrM12843d = null;
                                                    }
                                                    interfaceC9882g = c6241e.f36244b;
                                                    if (bArr != null) {
                                                        bArrM12843d.getClass();
                                                        c6237a = new C6237a(interfaceC9882g, bArr, bArrM12843d);
                                                    } else {
                                                        c6237a = interfaceC9882g;
                                                    }
                                                    cVar3 = dVar.f13254b;
                                                    if (cVar3 != null) {
                                                        if (bArr2 != null) {
                                                            z21 = true;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                        if (z21) {
                                                            String str9 = cVar3.f13260h;
                                                            str9.getClass();
                                                            bArrM12843d2 = C6245i.m12843d(str9);
                                                        } else {
                                                            bArrM12843d2 = null;
                                                        }
                                                        c9884i = new C9884i(C10132b0.m19011d(str, cVar3.f13253a), cVar3.f13261i, cVar3.f13262j);
                                                        if (bArr2 != null) {
                                                            bArrM12843d2.getClass();
                                                            c6237a2 = new C6237a(interfaceC9882g, bArr2, bArrM12843d2);
                                                        } else {
                                                            c6237a2 = interfaceC9882g;
                                                        }
                                                        z18 = z21;
                                                        interfaceC9882g2 = c6237a2;
                                                    } else {
                                                        c9884i = null;
                                                        interfaceC9882g2 = null;
                                                        z18 = false;
                                                    }
                                                    long j29 = j113 + dVar.f13257e;
                                                    long j210 = j29 + dVar.f13255c;
                                                    i13 = c2490c.f13233j + dVar.f13256d;
                                                    if (c6245i3 != null) {
                                                        c9884i2 = c6245i3.f36292q;
                                                        if (c9884i != c9884i2) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = true;
                                                        }
                                                        if (uri.equals(c6245i3.f36288m)) {
                                                            z20 = false;
                                                        } else {
                                                            z20 = false;
                                                        }
                                                        if (z19) {
                                                            interfaceC6246j2 = null;
                                                        } else {
                                                            interfaceC6246j2 = null;
                                                        }
                                                        c5112a = c6245i3.f36300y;
                                                        c10151t = c6245i3.f36301z;
                                                        interfaceC6246j = interfaceC6246j2;
                                                    } else {
                                                        c5112a = new C5112a(null);
                                                        interfaceC6246j = null;
                                                        c10151t = new C10151t(10);
                                                    }
                                                    long j211 = eVar.f36270b;
                                                    int i18 = eVar.f36271c;
                                                    boolean z211 = !z16;
                                                    boolean z212 = dVar.f13263k;
                                                    sparseArray = c6241e.f36246d.f34016a;
                                                    c10130a0 = (C10130a0) sparseArray.get(i13);
                                                    if (c10130a0 == null) {
                                                        c10130a0 = new C10130a0(9223372036854775806L);
                                                        sparseArray.put(i13, c10130a0);
                                                    }
                                                    bVar3 = bVar2;
                                                    bVar3.f36263a = new C6245i(interfaceC6243g3, c6237a, c9884i5, c2416m3, z17, interfaceC9882g2, c9884i, z18, uri, list4, iMo7351m3, objMo7353o3, j29, j210, j211, i18, z211, i13, z212, z210, c10130a0, dVar.f13258f, interfaceC6246j, c5112a, c10151t, z15, c6215e2);
                                                } else {
                                                    c2490c = c2490cMo7310n;
                                                }
                                                z14 = true;
                                                z15 = z14;
                                                z16 = eVar.f36272d;
                                                if (z15) {
                                                }
                                                InterfaceC6243g interfaceC6243g4 = c6241e.f36243a;
                                                C2416m c2416m4 = c6241e.f36248f[iMo7349k];
                                                List<C2416m> list5 = c6241e.f36251i;
                                                int iMo7351m4 = c6241e.f36259q.mo7351m();
                                                Object objMo7353o4 = c6241e.f36259q.mo7353o();
                                                boolean z213 = c6241e.f36254l;
                                                c2484a = c6241e.f36252j;
                                                if (uriM19011d2 == null) {
                                                    c2484a.getClass();
                                                    bArr = null;
                                                } else {
                                                    bArr = c2484a.f13142a.get(uriM19011d2);
                                                }
                                                if (uriM19011d == null) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = c2484a.f13142a.get(uriM19011d);
                                                }
                                                C6215e0 c6215e3 = c6241e.f36253k;
                                                AtomicInteger atomicInteger6 = C6245i.f36274L;
                                                Map mapEmptyMap4 = Collections.emptyMap();
                                                Uri uriM19011d6 = C10132b0.m19011d(str, dVar.f13253a);
                                                c6245i3 = c6245i2;
                                                long j114 = dVar.f13261i;
                                                long j115 = jMo7302f2;
                                                long j212 = dVar.f13262j;
                                                if (z16) {
                                                    i12 = 8;
                                                } else {
                                                    i12 = 0;
                                                }
                                                C10129a.m18994f(uriM19011d6, "The uri must be set.");
                                                C9884i c9884i6 = new C9884i(uriM19011d6, 0L, 1, null, mapEmptyMap4, j114, j212, null, i12, null);
                                                if (bArr != null) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    String str10 = dVar.f13260h;
                                                    str10.getClass();
                                                    bArrM12843d = C6245i.m12843d(str10);
                                                } else {
                                                    bArrM12843d = null;
                                                }
                                                interfaceC9882g = c6241e.f36244b;
                                                if (bArr != null) {
                                                    bArrM12843d.getClass();
                                                    c6237a = new C6237a(interfaceC9882g, bArr, bArrM12843d);
                                                } else {
                                                    c6237a = interfaceC9882g;
                                                }
                                                cVar3 = dVar.f13254b;
                                                if (cVar3 != null) {
                                                    if (bArr2 != null) {
                                                        z21 = true;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    if (z21) {
                                                        String str11 = cVar3.f13260h;
                                                        str11.getClass();
                                                        bArrM12843d2 = C6245i.m12843d(str11);
                                                    } else {
                                                        bArrM12843d2 = null;
                                                    }
                                                    c9884i = new C9884i(C10132b0.m19011d(str, cVar3.f13253a), cVar3.f13261i, cVar3.f13262j);
                                                    if (bArr2 != null) {
                                                        bArrM12843d2.getClass();
                                                        c6237a2 = new C6237a(interfaceC9882g, bArr2, bArrM12843d2);
                                                    } else {
                                                        c6237a2 = interfaceC9882g;
                                                    }
                                                    z18 = z21;
                                                    interfaceC9882g2 = c6237a2;
                                                } else {
                                                    c9884i = null;
                                                    interfaceC9882g2 = null;
                                                    z18 = false;
                                                }
                                                long j213 = j115 + dVar.f13257e;
                                                long j214 = j213 + dVar.f13255c;
                                                i13 = c2490c.f13233j + dVar.f13256d;
                                                if (c6245i3 != null) {
                                                    c9884i2 = c6245i3.f36292q;
                                                    if (c9884i != c9884i2) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = true;
                                                    }
                                                    if (uri.equals(c6245i3.f36288m)) {
                                                        z20 = false;
                                                    } else {
                                                        z20 = false;
                                                    }
                                                    if (z19) {
                                                        interfaceC6246j2 = null;
                                                    } else {
                                                        interfaceC6246j2 = null;
                                                    }
                                                    c5112a = c6245i3.f36300y;
                                                    c10151t = c6245i3.f36301z;
                                                    interfaceC6246j = interfaceC6246j2;
                                                } else {
                                                    c5112a = new C5112a(null);
                                                    interfaceC6246j = null;
                                                    c10151t = new C10151t(10);
                                                }
                                                long j215 = eVar.f36270b;
                                                int i19 = eVar.f36271c;
                                                boolean z214 = !z16;
                                                boolean z215 = dVar.f13263k;
                                                sparseArray = c6241e.f36246d.f34016a;
                                                c10130a0 = (C10130a0) sparseArray.get(i13);
                                                if (c10130a0 == null) {
                                                    c10130a0 = new C10130a0(9223372036854775806L);
                                                    sparseArray.put(i13, c10130a0);
                                                }
                                                bVar3 = bVar2;
                                                bVar3.f36263a = new C6245i(interfaceC6243g4, c6237a, c9884i6, c2416m4, z17, interfaceC9882g2, c9884i, z18, uri, list5, iMo7351m4, objMo7353o4, j213, j214, j215, i19, z214, i13, z215, z213, c10130a0, dVar.f13258f, interfaceC6246j, c5112a, c10151t, z15, c6215e3);
                                            }
                                            z15 = false;
                                            c2490c = c2490cMo7310n;
                                            z16 = eVar.f36272d;
                                            if (z15) {
                                            }
                                            InterfaceC6243g interfaceC6243g5 = c6241e.f36243a;
                                            C2416m c2416m5 = c6241e.f36248f[iMo7349k];
                                            List<C2416m> list6 = c6241e.f36251i;
                                            int iMo7351m5 = c6241e.f36259q.mo7351m();
                                            Object objMo7353o5 = c6241e.f36259q.mo7353o();
                                            boolean z216 = c6241e.f36254l;
                                            c2484a = c6241e.f36252j;
                                            if (uriM19011d2 == null) {
                                                c2484a.getClass();
                                                bArr = null;
                                            } else {
                                                bArr = c2484a.f13142a.get(uriM19011d2);
                                            }
                                            if (uriM19011d == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = c2484a.f13142a.get(uriM19011d);
                                            }
                                            C6215e0 c6215e4 = c6241e.f36253k;
                                            AtomicInteger atomicInteger7 = C6245i.f36274L;
                                            Map mapEmptyMap5 = Collections.emptyMap();
                                            Uri uriM19011d7 = C10132b0.m19011d(str, dVar.f13253a);
                                            c6245i3 = c6245i2;
                                            long j116 = dVar.f13261i;
                                            long j117 = jMo7302f2;
                                            long j216 = dVar.f13262j;
                                            if (z16) {
                                                i12 = 8;
                                            } else {
                                                i12 = 0;
                                            }
                                            C10129a.m18994f(uriM19011d7, "The uri must be set.");
                                            C9884i c9884i7 = new C9884i(uriM19011d7, 0L, 1, null, mapEmptyMap5, j116, j216, null, i12, null);
                                            if (bArr != null) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z17) {
                                                String str12 = dVar.f13260h;
                                                str12.getClass();
                                                bArrM12843d = C6245i.m12843d(str12);
                                            } else {
                                                bArrM12843d = null;
                                            }
                                            interfaceC9882g = c6241e.f36244b;
                                            if (bArr != null) {
                                                bArrM12843d.getClass();
                                                c6237a = new C6237a(interfaceC9882g, bArr, bArrM12843d);
                                            } else {
                                                c6237a = interfaceC9882g;
                                            }
                                            cVar3 = dVar.f13254b;
                                            if (cVar3 != null) {
                                                if (bArr2 != null) {
                                                    z21 = true;
                                                } else {
                                                    z21 = false;
                                                }
                                                if (z21) {
                                                    String str13 = cVar3.f13260h;
                                                    str13.getClass();
                                                    bArrM12843d2 = C6245i.m12843d(str13);
                                                } else {
                                                    bArrM12843d2 = null;
                                                }
                                                c9884i = new C9884i(C10132b0.m19011d(str, cVar3.f13253a), cVar3.f13261i, cVar3.f13262j);
                                                if (bArr2 != null) {
                                                    bArrM12843d2.getClass();
                                                    c6237a2 = new C6237a(interfaceC9882g, bArr2, bArrM12843d2);
                                                } else {
                                                    c6237a2 = interfaceC9882g;
                                                }
                                                z18 = z21;
                                                interfaceC9882g2 = c6237a2;
                                            } else {
                                                c9884i = null;
                                                interfaceC9882g2 = null;
                                                z18 = false;
                                            }
                                            long j217 = j117 + dVar.f13257e;
                                            long j218 = j217 + dVar.f13255c;
                                            i13 = c2490c.f13233j + dVar.f13256d;
                                            if (c6245i3 != null) {
                                                c9884i2 = c6245i3.f36292q;
                                                if (c9884i != c9884i2) {
                                                    z19 = true;
                                                } else {
                                                    z19 = true;
                                                }
                                                if (uri.equals(c6245i3.f36288m)) {
                                                    z20 = false;
                                                } else {
                                                    z20 = false;
                                                }
                                                if (z19) {
                                                    interfaceC6246j2 = null;
                                                } else {
                                                    interfaceC6246j2 = null;
                                                }
                                                c5112a = c6245i3.f36300y;
                                                c10151t = c6245i3.f36301z;
                                                interfaceC6246j = interfaceC6246j2;
                                            } else {
                                                c5112a = new C5112a(null);
                                                interfaceC6246j = null;
                                                c10151t = new C10151t(10);
                                            }
                                            long j219 = eVar.f36270b;
                                            int i110 = eVar.f36271c;
                                            boolean z217 = !z16;
                                            boolean z218 = dVar.f13263k;
                                            sparseArray = c6241e.f36246d.f34016a;
                                            c10130a0 = (C10130a0) sparseArray.get(i13);
                                            if (c10130a0 == null) {
                                                c10130a0 = new C10130a0(9223372036854775806L);
                                                sparseArray.put(i13, c10130a0);
                                            }
                                            bVar3 = bVar2;
                                            bVar3.f36263a = new C6245i(interfaceC6243g5, c6237a, c9884i7, c2416m5, z17, interfaceC9882g2, c9884i, z18, uri, list6, iMo7351m5, objMo7353o5, j217, j218, j219, i110, z217, i13, z218, z216, c10130a0, dVar.f13258f, interfaceC6246j, c5112a, c10151t, z15, c6215e4);
                                        }
                                        bVar3 = bVar2;
                                    }
                                }
                            }
                            bVar2 = bVar2;
                            bVar3 = bVar2;
                        } else {
                            C6241e.b bVar6 = bVar;
                            bVar6.f36265c = uri;
                            c6241e.f36261s &= uri.equals(c6241e.f36257o);
                            c6241e.f36257o = uri;
                            bVar3 = bVar6;
                        }
                        z22 = bVar3.f36264b;
                        abstractC5945b = bVar3.f36263a;
                        uri2 = bVar3.f36265c;
                        if (z22) {
                            this.f36373l0 = -9223372036854775807L;
                            this.f36376o0 = true;
                            return true;
                        }
                        if (abstractC5945b == null) {
                            if (uri2 != null) {
                                return false;
                            }
                            C6247k.this.f36315b.mo7308l(uri2);
                            return false;
                        }
                        if (abstractC5945b instanceof C6245i) {
                            c6245i4 = (C6245i) abstractC5945b;
                            this.f36380s0 = c6245i4;
                            this.f36351a0 = c6245i4.f35397d;
                            this.f36373l0 = -9223372036854775807L;
                            this.f36332I.add(c6245i4);
                            ImmutableList.C3147b c3147b = ImmutableList.f16043b;
                            c3146a = new ImmutableList.C3146a();
                            for (c cVar5 : this.f36340Q) {
                                c3146a.m9055b(Integer.valueOf(cVar5.f13424q + cVar5.f13423p));
                            }
                            ImmutableList<Integer> immutableListM9068e = c3146a.m9068e();
                            c6245i4.f36278D = this;
                            c6245i4.f36283I = immutableListM9068e;
                            for (c cVar6 : this.f36340Q) {
                                cVar6.getClass();
                                cVar6.f13403C = c6245i4.f36286k;
                                if (c6245i4.f36289n) {
                                    cVar6.f13407G = true;
                                }
                            }
                        }
                        this.f36339P = abstractC5945b;
                        this.f36370k.m7336k(new C5725h(abstractC5945b.f35394a, abstractC5945b.f35395b, loader.m7469d(abstractC5945b, this, this.f36366i.mo7474c(abstractC5945b.f35396c))), abstractC5945b.f35396c, this.f36352b, abstractC5945b.f35397d, abstractC5945b.f35398e, abstractC5945b.f35399f, abstractC5945b.f35400g, abstractC5945b.f35401h);
                        return true;
                    }
                    bVar = bVar4;
                    jMax2 = j16;
                    c6245i = c6245i5;
                    c6241e.f36259q.mo7341c(j10, jMax3, jMax2, list, c6241e.m12839a(c6245i5, j14));
                    iMo7349k = c6241e.f36259q.mo7349k();
                    if (iM12090a != iMo7349k) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    uriArr = c6241e.f36247e;
                    uri = uriArr[iMo7349k];
                    hlsPlaylistTracker = c6241e.f36249g;
                    if (hlsPlaylistTracker.mo7299a(uri)) {
                        C6241e.b bVar7 = bVar;
                        bVar7.f36265c = uri;
                        c6241e.f36261s &= uri.equals(c6241e.f36257o);
                        c6241e.f36257o = uri;
                        bVar3 = bVar7;
                    } else {
                        C6241e.b bVar8 = bVar;
                        c2490cMo7310n = hlsPlaylistTracker.mo7310n(true, uri);
                        c2490cMo7310n.getClass();
                        c6241e.f36258p = c2490cMo7310n.f36991c;
                        z11 = c2490cMo7310n.f13238o;
                        j11 = c2490cMo7310n.f13231h;
                        if (z11) {
                            jMo7302f = -9223372036854775807L;
                        } else {
                            jMo7302f = (c2490cMo7310n.f13244u + j11) - hlsPlaylistTracker.mo7302f();
                        }
                        c6241e.f36260r = jMo7302f;
                        jMo7302f2 = j11 - hlsPlaylistTracker.mo7302f();
                        bVar2 = bVar8;
                        Pair<Long, Integer> pairM12841c3 = c6241e.m12841c(c6245i, z10, c2490cMo7310n, jMo7302f2, j14);
                        jLongValue = ((Long) pairM12841c3.first).longValue();
                        iIntValue = ((Integer) pairM12841c3.second).intValue();
                        if (jLongValue < c2490cMo7310n.f13234k) {
                            c6245i2 = c6245i;
                            if (c6245i2 != null) {
                                uri = uriArr[iM12090a];
                                c2490cMo7310n = hlsPlaylistTracker.mo7310n(true, uri);
                                c2490cMo7310n.getClass();
                                jMo7302f2 = c2490cMo7310n.f13231h - hlsPlaylistTracker.mo7302f();
                                Pair<Long, Integer> pairM12841c4 = c6241e.m12841c(c6245i2, false, c2490cMo7310n, jMo7302f2, j14);
                                jLongValue = ((Long) pairM12841c4.first).longValue();
                                iIntValue = ((Integer) pairM12841c4.second).intValue();
                                iMo7349k = iM12090a;
                            }
                        } else {
                            c6245i2 = c6245i;
                        }
                        j12 = c2490cMo7310n.f13234k;
                        if (jLongValue < j12) {
                            c6241e.f36256n = new BehindLiveWindowException();
                        } else {
                            i10 = (int) (jLongValue - j12);
                            immutableList = c2490cMo7310n.f13241r;
                            size = immutableList.size();
                            immutableList2 = c2490cMo7310n.f13242s;
                            if (i10 == size) {
                                if (iIntValue == -1) {
                                    iIntValue = 0;
                                }
                                if (iIntValue < immutableList2.size()) {
                                    eVar = new C6241e.e((C2490c.d) immutableList2.get(iIntValue), jLongValue, iIntValue);
                                } else {
                                    eVar = null;
                                }
                            } else {
                                cVar = (C2490c.c) immutableList.get(i10);
                                if (iIntValue == -1) {
                                    eVar = new C6241e.e(cVar, jLongValue, -1);
                                } else if (iIntValue < cVar.f13251H.size()) {
                                    eVar = new C6241e.e((C2490c.d) cVar.f13251H.get(iIntValue), jLongValue, iIntValue);
                                } else {
                                    i11 = i10 + 1;
                                    if (i11 < immutableList.size()) {
                                        eVar = new C6241e.e((C2490c.d) immutableList.get(i11), jLongValue + 1, -1);
                                    } else if (immutableList2.isEmpty()) {
                                        eVar = new C6241e.e((C2490c.d) immutableList2.get(0), jLongValue + 1, 0);
                                    } else {
                                        eVar = null;
                                    }
                                }
                            }
                            if (eVar != null) {
                                c6241e.f36261s = false;
                                c6241e.f36257o = null;
                                cVar2 = eVar.f36269a.f13254b;
                                str = c2490cMo7310n.f36989a;
                                if (cVar2 != null) {
                                    uriM19011d = null;
                                } else {
                                    uriM19011d = null;
                                }
                                aVarM12842d = c6241e.m12842d(uriM19011d, iMo7349k);
                                bVar2.f36263a = aVarM12842d;
                                if (aVarM12842d == null) {
                                    dVar = eVar.f36269a;
                                    if (dVar != null) {
                                        uriM19011d2 = null;
                                    } else {
                                        uriM19011d2 = null;
                                    }
                                    aVarM12842d2 = c6241e.m12842d(uriM19011d2, iMo7349k);
                                    bVar2.f36263a = aVarM12842d2;
                                    if (aVarM12842d2 == null) {
                                        if (c6245i2 == null) {
                                            AtomicInteger atomicInteger8 = C6245i.f36274L;
                                        } else {
                                            if (uri.equals(c6245i2.f36288m)) {
                                            }
                                            j13 = dVar.f13257e + jMo7302f2;
                                            z12 = dVar instanceof C2490c.a;
                                            z13 = c2490cMo7310n.f36991c;
                                            if (z12) {
                                                if (((C2490c.a) dVar).f13247l) {
                                                    z13 = true;
                                                } else {
                                                    z13 = true;
                                                }
                                            }
                                            if (z13) {
                                                c2490c = c2490cMo7310n;
                                                if (j13 >= c6245i2.f35401h) {
                                                    z14 = false;
                                                }
                                                z15 = z14;
                                                z16 = eVar.f36272d;
                                                if (z15) {
                                                }
                                                InterfaceC6243g interfaceC6243g6 = c6241e.f36243a;
                                                C2416m c2416m6 = c6241e.f36248f[iMo7349k];
                                                List<C2416m> list7 = c6241e.f36251i;
                                                int iMo7351m6 = c6241e.f36259q.mo7351m();
                                                Object objMo7353o6 = c6241e.f36259q.mo7353o();
                                                boolean z219 = c6241e.f36254l;
                                                c2484a = c6241e.f36252j;
                                                if (uriM19011d2 == null) {
                                                    c2484a.getClass();
                                                    bArr = null;
                                                } else {
                                                    bArr = c2484a.f13142a.get(uriM19011d2);
                                                }
                                                if (uriM19011d == null) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = c2484a.f13142a.get(uriM19011d);
                                                }
                                                C6215e0 c6215e5 = c6241e.f36253k;
                                                AtomicInteger atomicInteger9 = C6245i.f36274L;
                                                Map mapEmptyMap6 = Collections.emptyMap();
                                                Uri uriM19011d8 = C10132b0.m19011d(str, dVar.f13253a);
                                                c6245i3 = c6245i2;
                                                long j118 = dVar.f13261i;
                                                long j119 = jMo7302f2;
                                                long j2110 = dVar.f13262j;
                                                if (z16) {
                                                    i12 = 8;
                                                } else {
                                                    i12 = 0;
                                                }
                                                C10129a.m18994f(uriM19011d8, "The uri must be set.");
                                                C9884i c9884i8 = new C9884i(uriM19011d8, 0L, 1, null, mapEmptyMap6, j118, j2110, null, i12, null);
                                                if (bArr != null) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    String str14 = dVar.f13260h;
                                                    str14.getClass();
                                                    bArrM12843d = C6245i.m12843d(str14);
                                                } else {
                                                    bArrM12843d = null;
                                                }
                                                interfaceC9882g = c6241e.f36244b;
                                                if (bArr != null) {
                                                    bArrM12843d.getClass();
                                                    c6237a = new C6237a(interfaceC9882g, bArr, bArrM12843d);
                                                } else {
                                                    c6237a = interfaceC9882g;
                                                }
                                                cVar3 = dVar.f13254b;
                                                if (cVar3 != null) {
                                                    if (bArr2 != null) {
                                                        z21 = true;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    if (z21) {
                                                        String str15 = cVar3.f13260h;
                                                        str15.getClass();
                                                        bArrM12843d2 = C6245i.m12843d(str15);
                                                    } else {
                                                        bArrM12843d2 = null;
                                                    }
                                                    c9884i = new C9884i(C10132b0.m19011d(str, cVar3.f13253a), cVar3.f13261i, cVar3.f13262j);
                                                    if (bArr2 != null) {
                                                        bArrM12843d2.getClass();
                                                        c6237a2 = new C6237a(interfaceC9882g, bArr2, bArrM12843d2);
                                                    } else {
                                                        c6237a2 = interfaceC9882g;
                                                    }
                                                    z18 = z21;
                                                    interfaceC9882g2 = c6237a2;
                                                } else {
                                                    c9884i = null;
                                                    interfaceC9882g2 = null;
                                                    z18 = false;
                                                }
                                                long j2111 = j119 + dVar.f13257e;
                                                long j2112 = j2111 + dVar.f13255c;
                                                i13 = c2490c.f13233j + dVar.f13256d;
                                                if (c6245i3 != null) {
                                                    c9884i2 = c6245i3.f36292q;
                                                    if (c9884i != c9884i2) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = true;
                                                    }
                                                    if (uri.equals(c6245i3.f36288m)) {
                                                        z20 = false;
                                                    } else {
                                                        z20 = false;
                                                    }
                                                    if (z19) {
                                                        interfaceC6246j2 = null;
                                                    } else {
                                                        interfaceC6246j2 = null;
                                                    }
                                                    c5112a = c6245i3.f36300y;
                                                    c10151t = c6245i3.f36301z;
                                                    interfaceC6246j = interfaceC6246j2;
                                                } else {
                                                    c5112a = new C5112a(null);
                                                    interfaceC6246j = null;
                                                    c10151t = new C10151t(10);
                                                }
                                                long j2113 = eVar.f36270b;
                                                int i111 = eVar.f36271c;
                                                boolean z2110 = !z16;
                                                boolean z2111 = dVar.f13263k;
                                                sparseArray = c6241e.f36246d.f34016a;
                                                c10130a0 = (C10130a0) sparseArray.get(i13);
                                                if (c10130a0 == null) {
                                                    c10130a0 = new C10130a0(9223372036854775806L);
                                                    sparseArray.put(i13, c10130a0);
                                                }
                                                bVar3 = bVar2;
                                                bVar3.f36263a = new C6245i(interfaceC6243g6, c6237a, c9884i8, c2416m6, z17, interfaceC9882g2, c9884i, z18, uri, list7, iMo7351m6, objMo7353o6, j2111, j2112, j2113, i111, z2110, i13, z2111, z219, c10130a0, dVar.f13258f, interfaceC6246j, c5112a, c10151t, z15, c6215e5);
                                            } else {
                                                c2490c = c2490cMo7310n;
                                            }
                                            z14 = true;
                                            z15 = z14;
                                            z16 = eVar.f36272d;
                                            if (z15) {
                                            }
                                            InterfaceC6243g interfaceC6243g7 = c6241e.f36243a;
                                            C2416m c2416m7 = c6241e.f36248f[iMo7349k];
                                            List<C2416m> list8 = c6241e.f36251i;
                                            int iMo7351m7 = c6241e.f36259q.mo7351m();
                                            Object objMo7353o7 = c6241e.f36259q.mo7353o();
                                            boolean z2112 = c6241e.f36254l;
                                            c2484a = c6241e.f36252j;
                                            if (uriM19011d2 == null) {
                                                c2484a.getClass();
                                                bArr = null;
                                            } else {
                                                bArr = c2484a.f13142a.get(uriM19011d2);
                                            }
                                            if (uriM19011d == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = c2484a.f13142a.get(uriM19011d);
                                            }
                                            C6215e0 c6215e6 = c6241e.f36253k;
                                            AtomicInteger atomicInteger10 = C6245i.f36274L;
                                            Map mapEmptyMap7 = Collections.emptyMap();
                                            Uri uriM19011d9 = C10132b0.m19011d(str, dVar.f13253a);
                                            c6245i3 = c6245i2;
                                            long j1110 = dVar.f13261i;
                                            long j1111 = jMo7302f2;
                                            long j2114 = dVar.f13262j;
                                            if (z16) {
                                                i12 = 8;
                                            } else {
                                                i12 = 0;
                                            }
                                            C10129a.m18994f(uriM19011d9, "The uri must be set.");
                                            C9884i c9884i9 = new C9884i(uriM19011d9, 0L, 1, null, mapEmptyMap7, j1110, j2114, null, i12, null);
                                            if (bArr != null) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z17) {
                                                String str16 = dVar.f13260h;
                                                str16.getClass();
                                                bArrM12843d = C6245i.m12843d(str16);
                                            } else {
                                                bArrM12843d = null;
                                            }
                                            interfaceC9882g = c6241e.f36244b;
                                            if (bArr != null) {
                                                bArrM12843d.getClass();
                                                c6237a = new C6237a(interfaceC9882g, bArr, bArrM12843d);
                                            } else {
                                                c6237a = interfaceC9882g;
                                            }
                                            cVar3 = dVar.f13254b;
                                            if (cVar3 != null) {
                                                if (bArr2 != null) {
                                                    z21 = true;
                                                } else {
                                                    z21 = false;
                                                }
                                                if (z21) {
                                                    String str17 = cVar3.f13260h;
                                                    str17.getClass();
                                                    bArrM12843d2 = C6245i.m12843d(str17);
                                                } else {
                                                    bArrM12843d2 = null;
                                                }
                                                c9884i = new C9884i(C10132b0.m19011d(str, cVar3.f13253a), cVar3.f13261i, cVar3.f13262j);
                                                if (bArr2 != null) {
                                                    bArrM12843d2.getClass();
                                                    c6237a2 = new C6237a(interfaceC9882g, bArr2, bArrM12843d2);
                                                } else {
                                                    c6237a2 = interfaceC9882g;
                                                }
                                                z18 = z21;
                                                interfaceC9882g2 = c6237a2;
                                            } else {
                                                c9884i = null;
                                                interfaceC9882g2 = null;
                                                z18 = false;
                                            }
                                            long j2115 = j1111 + dVar.f13257e;
                                            long j2116 = j2115 + dVar.f13255c;
                                            i13 = c2490c.f13233j + dVar.f13256d;
                                            if (c6245i3 != null) {
                                                c9884i2 = c6245i3.f36292q;
                                                if (c9884i != c9884i2) {
                                                    z19 = true;
                                                } else {
                                                    z19 = true;
                                                }
                                                if (uri.equals(c6245i3.f36288m)) {
                                                    z20 = false;
                                                } else {
                                                    z20 = false;
                                                }
                                                if (z19) {
                                                    interfaceC6246j2 = null;
                                                } else {
                                                    interfaceC6246j2 = null;
                                                }
                                                c5112a = c6245i3.f36300y;
                                                c10151t = c6245i3.f36301z;
                                                interfaceC6246j = interfaceC6246j2;
                                            } else {
                                                c5112a = new C5112a(null);
                                                interfaceC6246j = null;
                                                c10151t = new C10151t(10);
                                            }
                                            long j2117 = eVar.f36270b;
                                            int i112 = eVar.f36271c;
                                            boolean z2113 = !z16;
                                            boolean z2114 = dVar.f13263k;
                                            sparseArray = c6241e.f36246d.f34016a;
                                            c10130a0 = (C10130a0) sparseArray.get(i13);
                                            if (c10130a0 == null) {
                                                c10130a0 = new C10130a0(9223372036854775806L);
                                                sparseArray.put(i13, c10130a0);
                                            }
                                            bVar3 = bVar2;
                                            bVar3.f36263a = new C6245i(interfaceC6243g7, c6237a, c9884i9, c2416m7, z17, interfaceC9882g2, c9884i, z18, uri, list8, iMo7351m7, objMo7353o7, j2115, j2116, j2117, i112, z2113, i13, z2114, z2112, c10130a0, dVar.f13258f, interfaceC6246j, c5112a, c10151t, z15, c6215e6);
                                        }
                                        z15 = false;
                                        c2490c = c2490cMo7310n;
                                        z16 = eVar.f36272d;
                                        if (z15) {
                                        }
                                        InterfaceC6243g interfaceC6243g8 = c6241e.f36243a;
                                        C2416m c2416m8 = c6241e.f36248f[iMo7349k];
                                        List<C2416m> list9 = c6241e.f36251i;
                                        int iMo7351m8 = c6241e.f36259q.mo7351m();
                                        Object objMo7353o8 = c6241e.f36259q.mo7353o();
                                        boolean z2115 = c6241e.f36254l;
                                        c2484a = c6241e.f36252j;
                                        if (uriM19011d2 == null) {
                                            c2484a.getClass();
                                            bArr = null;
                                        } else {
                                            bArr = c2484a.f13142a.get(uriM19011d2);
                                        }
                                        if (uriM19011d == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = c2484a.f13142a.get(uriM19011d);
                                        }
                                        C6215e0 c6215e7 = c6241e.f36253k;
                                        AtomicInteger atomicInteger11 = C6245i.f36274L;
                                        Map mapEmptyMap8 = Collections.emptyMap();
                                        Uri uriM19011d10 = C10132b0.m19011d(str, dVar.f13253a);
                                        c6245i3 = c6245i2;
                                        long j1112 = dVar.f13261i;
                                        long j1113 = jMo7302f2;
                                        long j2118 = dVar.f13262j;
                                        if (z16) {
                                            i12 = 8;
                                        } else {
                                            i12 = 0;
                                        }
                                        C10129a.m18994f(uriM19011d10, "The uri must be set.");
                                        C9884i c9884i10 = new C9884i(uriM19011d10, 0L, 1, null, mapEmptyMap8, j1112, j2118, null, i12, null);
                                        if (bArr != null) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if (z17) {
                                            String str18 = dVar.f13260h;
                                            str18.getClass();
                                            bArrM12843d = C6245i.m12843d(str18);
                                        } else {
                                            bArrM12843d = null;
                                        }
                                        interfaceC9882g = c6241e.f36244b;
                                        if (bArr != null) {
                                            bArrM12843d.getClass();
                                            c6237a = new C6237a(interfaceC9882g, bArr, bArrM12843d);
                                        } else {
                                            c6237a = interfaceC9882g;
                                        }
                                        cVar3 = dVar.f13254b;
                                        if (cVar3 != null) {
                                            if (bArr2 != null) {
                                                z21 = true;
                                            } else {
                                                z21 = false;
                                            }
                                            if (z21) {
                                                String str19 = cVar3.f13260h;
                                                str19.getClass();
                                                bArrM12843d2 = C6245i.m12843d(str19);
                                            } else {
                                                bArrM12843d2 = null;
                                            }
                                            c9884i = new C9884i(C10132b0.m19011d(str, cVar3.f13253a), cVar3.f13261i, cVar3.f13262j);
                                            if (bArr2 != null) {
                                                bArrM12843d2.getClass();
                                                c6237a2 = new C6237a(interfaceC9882g, bArr2, bArrM12843d2);
                                            } else {
                                                c6237a2 = interfaceC9882g;
                                            }
                                            z18 = z21;
                                            interfaceC9882g2 = c6237a2;
                                        } else {
                                            c9884i = null;
                                            interfaceC9882g2 = null;
                                            z18 = false;
                                        }
                                        long j2119 = j1113 + dVar.f13257e;
                                        long j21110 = j2119 + dVar.f13255c;
                                        i13 = c2490c.f13233j + dVar.f13256d;
                                        if (c6245i3 != null) {
                                            c9884i2 = c6245i3.f36292q;
                                            if (c9884i != c9884i2) {
                                                z19 = true;
                                            } else {
                                                z19 = true;
                                            }
                                            if (uri.equals(c6245i3.f36288m)) {
                                                z20 = false;
                                            } else {
                                                z20 = false;
                                            }
                                            if (z19) {
                                                interfaceC6246j2 = null;
                                            } else {
                                                interfaceC6246j2 = null;
                                            }
                                            c5112a = c6245i3.f36300y;
                                            c10151t = c6245i3.f36301z;
                                            interfaceC6246j = interfaceC6246j2;
                                        } else {
                                            c5112a = new C5112a(null);
                                            interfaceC6246j = null;
                                            c10151t = new C10151t(10);
                                        }
                                        long j21111 = eVar.f36270b;
                                        int i113 = eVar.f36271c;
                                        boolean z2116 = !z16;
                                        boolean z2117 = dVar.f13263k;
                                        sparseArray = c6241e.f36246d.f34016a;
                                        c10130a0 = (C10130a0) sparseArray.get(i13);
                                        if (c10130a0 == null) {
                                            c10130a0 = new C10130a0(9223372036854775806L);
                                            sparseArray.put(i13, c10130a0);
                                        }
                                        bVar3 = bVar2;
                                        bVar3.f36263a = new C6245i(interfaceC6243g8, c6237a, c9884i10, c2416m8, z17, interfaceC9882g2, c9884i, z18, uri, list9, iMo7351m8, objMo7353o8, j2119, j21110, j21111, i113, z2116, i13, z2117, z2115, c10130a0, dVar.f13258f, interfaceC6246j, c5112a, c10151t, z15, c6215e7);
                                    }
                                    bVar3 = bVar2;
                                }
                            } else if (!c2490cMo7310n.f13238o) {
                                bVar2.f36265c = uri;
                                c6241e.f36261s &= uri.equals(c6241e.f36257o);
                                c6241e.f36257o = uri;
                            } else {
                                if (z23) {
                                }
                                bVar2.f36264b = true;
                            }
                        }
                        bVar2 = bVar2;
                        bVar3 = bVar2;
                    }
                    z22 = bVar3.f36264b;
                    abstractC5945b = bVar3.f36263a;
                    uri2 = bVar3.f36265c;
                    if (z22) {
                        this.f36373l0 = -9223372036854775807L;
                        this.f36376o0 = true;
                        return true;
                    }
                    if (abstractC5945b == null) {
                        if (uri2 != null) {
                            return false;
                        }
                        C6247k.this.f36315b.mo7308l(uri2);
                        return false;
                    }
                    if (abstractC5945b instanceof C6245i) {
                        c6245i4 = (C6245i) abstractC5945b;
                        this.f36380s0 = c6245i4;
                        this.f36351a0 = c6245i4.f35397d;
                        this.f36373l0 = -9223372036854775807L;
                        this.f36332I.add(c6245i4);
                        ImmutableList.C3147b c3147b2 = ImmutableList.f16043b;
                        c3146a = new ImmutableList.C3146a();
                        while (i14 < r5) {
                            c3146a.m9055b(Integer.valueOf(cVar5.f13424q + cVar5.f13423p));
                        }
                        ImmutableList<Integer> immutableListM9068e2 = c3146a.m9068e();
                        c6245i4.f36278D = this;
                        c6245i4.f36283I = immutableListM9068e2;
                        while (i15 < r4) {
                            cVar6.getClass();
                            cVar6.f13403C = c6245i4.f36286k;
                            if (c6245i4.f36289n) {
                                cVar6.f13407G = true;
                            }
                        }
                    }
                    this.f36339P = abstractC5945b;
                    this.f36370k.m7336k(new C5725h(abstractC5945b.f35394a, abstractC5945b.f35395b, loader.m7469d(abstractC5945b, this, this.f36366i.mo7474c(abstractC5945b.f35396c))), abstractC5945b.f35396c, this.f36352b, abstractC5945b.f35397d, abstractC5945b.f35398e, abstractC5945b.f35399f, abstractC5945b.f35400g, abstractC5945b.f35401h);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: i */
    public final void mo7365i() {
        this.f36377p0 = true;
        this.f36336M.post(this.f36335L);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    public final boolean isLoading() {
        return this.f36368j.m7467b();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: p */
    public final Loader.C2522b mo7316p(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, IOException iOException, int i10) {
        boolean zMo7342d;
        Loader.C2522b c2522b;
        Loader.C2522b c2522b2;
        boolean z10;
        int i11;
        AbstractC5945b abstractC5945b = (AbstractC5945b) interfaceC2524d;
        boolean z11 = abstractC5945b instanceof C6245i;
        if (z11 && !((C6245i) abstractC5945b).f36285K && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i11 = ((HttpDataSource$InvalidResponseCodeException) iOException).f13692d) == 410 || i11 == 404)) {
            return Loader.f13694d;
        }
        long j12 = abstractC5945b.f35402i.f50526b;
        C9893r c9893r = abstractC5945b.f35402i;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        C10134c0.m19033R(abstractC5945b.f35400g);
        C10134c0.m19033R(abstractC5945b.f35401h);
        InterfaceC2528b.c cVar = new InterfaceC2528b.c(iOException, i10);
        C6241e c6241e = this.f36356d;
        InterfaceC2528b.a aVarM17975a = C9509r.m17975a(c6241e.f36259q);
        InterfaceC2528b interfaceC2528b = this.f36366i;
        InterfaceC2528b.b bVarMo7473b = interfaceC2528b.mo7473b(aVarM17975a, cVar);
        if (bVarMo7473b == null || bVarMo7473b.f13731a != 2) {
            zMo7342d = false;
        } else {
            InterfaceC9502k interfaceC9502k = c6241e.f36259q;
            zMo7342d = interfaceC9502k.mo7342d(interfaceC9502k.mo7358t(c6241e.f36250h.m12090a(abstractC5945b.f35397d)), bVarMo7473b.f13732b);
        }
        if (!zMo7342d) {
            long jMo7472a = interfaceC2528b.mo7472a(cVar);
            if (jMo7472a != -9223372036854775807L) {
                c2522b2 = new Loader.C2522b(0, jMo7472a);
            } else {
                c2522b = Loader.f13696f;
            }
            int i12 = c2522b2.f13700a;
            z10 = !(i12 != 0 || i12 == 1);
            this.f36370k.m7333h(c5725h, abstractC5945b.f35396c, this.f36352b, abstractC5945b.f35397d, abstractC5945b.f35398e, abstractC5945b.f35399f, abstractC5945b.f35400g, abstractC5945b.f35401h, iOException, z10);
            if (z10) {
                this.f36339P = null;
            }
            if (zMo7342d) {
                if (this.f36348Y) {
                    ((C6247k.a) this.f36354c).mo7091a(this);
                } else {
                    mo7254h(this.f36371k0);
                }
            }
            return c2522b2;
        }
        if (z11 && j12 == 0) {
            ArrayList<C6245i> arrayList = this.f36332I;
            C10129a.m18992d(arrayList.remove(arrayList.size() - 1) == abstractC5945b);
            if (arrayList.isEmpty()) {
                this.f36373l0 = this.f36371k0;
            } else {
                ((C6245i) C5206f.m11002X0(arrayList)).f36284J = true;
            }
        }
        c2522b = Loader.f13695e;
        c2522b2 = c2522b;
        int i13 = c2522b2.f13700a;
        z10 = !(i13 != 0 || i13 == 1);
        this.f36370k.m7333h(c5725h, abstractC5945b.f35396c, this.f36352b, abstractC5945b.f35397d, abstractC5945b.f35398e, abstractC5945b.f35399f, abstractC5945b.f35400g, abstractC5945b.f35401h, iOException, z10);
        if (z10) {
            this.f36339P = null;
        }
        if (zMo7342d) {
            if (this.f36348Y) {
                mo7254h(this.f36371k0);
            } else {
                ((C6247k.a) this.f36354c).mo7091a(this);
            }
        }
        return c2522b2;
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: q */
    public final InterfaceC7522w mo7366q(int i10, int i11) {
        InterfaceC7522w interfaceC7522wM12852v;
        Integer numValueOf = Integer.valueOf(i11);
        Set<Integer> set = f36330t0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f36342S;
        SparseIntArray sparseIntArray = this.f36343T;
        if (!zContains) {
            int i12 = 0;
            while (true) {
                InterfaceC7522w[] interfaceC7522wArr = this.f36340Q;
                if (i12 >= interfaceC7522wArr.length) {
                    interfaceC7522wM12852v = null;
                    break;
                }
                if (this.f36341R[i12] == i10) {
                    interfaceC7522wM12852v = interfaceC7522wArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            C10129a.m18990b(set.contains(Integer.valueOf(i11)));
            int i13 = sparseIntArray.get(i11, -1);
            if (i13 == -1) {
                interfaceC7522wM12852v = null;
                break;
            }
            if (hashSet.add(Integer.valueOf(i11))) {
                this.f36341R[i13] = i10;
            }
            interfaceC7522wM12852v = this.f36341R[i13] == i10 ? this.f36340Q[i13] : m12852v(i10, i11);
        }
        if (interfaceC7522wM12852v == null) {
            if (this.f36377p0) {
                return m12852v(i10, i11);
            }
            int length = this.f36340Q.length;
            boolean z10 = i11 == 1 || i11 == 2;
            c cVar = new c(this.f36358e, this.f36362g, this.f36364h, this.f36338O);
            cVar.f13427t = this.f36371k0;
            if (z10) {
                cVar.f36390I = this.f36379r0;
                cVar.f13433z = true;
            }
            long j10 = this.f36378q0;
            if (cVar.f13406F != j10) {
                cVar.f13406F = j10;
                cVar.f13433z = true;
            }
            C6245i c6245i = this.f36380s0;
            if (c6245i != null) {
                cVar.f13403C = c6245i.f36286k;
            }
            cVar.f13413f = this;
            int i14 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f36341R, i14);
            this.f36341R = iArrCopyOf;
            iArrCopyOf[length] = i10;
            c[] cVarArr = this.f36340Q;
            int i15 = C10134c0.f51354a;
            Object[] objArrCopyOf = Arrays.copyOf(cVarArr, cVarArr.length + 1);
            objArrCopyOf[cVarArr.length] = cVar;
            this.f36340Q = (c[]) objArrCopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f36369j0, i14);
            this.f36369j0 = zArrCopyOf;
            zArrCopyOf[length] = z10;
            this.f36365h0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (m12851A(i11) > m12851A(this.f36345V)) {
                this.f36346W = length;
                this.f36345V = i11;
            }
            this.f36367i0 = Arrays.copyOf(this.f36367i0, i14);
            interfaceC7522wM12852v = cVar;
        }
        if (i11 != 5) {
            return interfaceC7522wM12852v;
        }
        if (this.f36344U == null) {
            this.f36344U = new b(interfaceC7522wM12852v, this.f36372l);
        }
        return this.f36344U;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: r */
    public final long mo7261r() {
        long j10;
        if (this.f36376o0) {
            return Long.MIN_VALUE;
        }
        if (m12854B()) {
            return this.f36373l0;
        }
        long jMax = this.f36371k0;
        C6245i c6245iM12863z = m12863z();
        if (!c6245iM12863z.f36282H) {
            ArrayList<C6245i> arrayList = this.f36332I;
            c6245iM12863z = arrayList.size() > 1 ? arrayList.get(arrayList.size() - 2) : null;
        }
        if (c6245iM12863z != null) {
            jMax = Math.max(jMax, c6245iM12863z.f35401h);
        }
        if (this.f36347X) {
            for (c cVar : this.f36340Q) {
                synchronized (cVar) {
                    j10 = cVar.f13429v;
                }
                jMax = Math.max(jMax, j10);
            }
        }
        return jMax;
    }

    @Override // com.google.android.exoplayer2.source.C2499p.c
    /* JADX INFO: renamed from: s */
    public final void mo7367s() {
        this.f36336M.post(this.f36334K);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: t */
    public final void mo7262t(long j10) {
        Loader loader = this.f36368j;
        if ((loader.f13699c != null) || m12854B()) {
            return;
        }
        boolean zM7467b = loader.m7467b();
        C6241e c6241e = this.f36356d;
        List<C6245i> list = this.f36333J;
        if (zM7467b) {
            this.f36339P.getClass();
            if (c6241e.f36256n == null ? c6241e.f36259q.mo7355q(j10, this.f36339P, list) : false) {
                loader.m7466a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0) {
            int i10 = size - 1;
            if (c6241e.m12840b(list.get(i10)) != 2) {
                break;
            } else {
                size = i10;
            }
        }
        if (size < list.size()) {
            m12862y(size);
        }
        int size2 = (c6241e.f36256n != null || c6241e.f36259q.length() < 2) ? list.size() : c6241e.f36259q.mo7357s(list, j10);
        if (size2 < this.f36332I.size()) {
            m12862y(size2);
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* JADX INFO: renamed from: u */
    public final void m12860u() {
        C10129a.m18992d(this.f36348Y);
        this.f36357d0.getClass();
        this.f36359e0.getClass();
    }

    /* JADX INFO: renamed from: w */
    public final C5736s m12861w(C5735r[] c5735rArr) {
        for (int i10 = 0; i10 < c5735rArr.length; i10++) {
            C5735r c5735r = c5735rArr[i10];
            C2416m[] c2416mArr = new C2416m[c5735r.f34800a];
            for (int i11 = 0; i11 < c5735r.f34800a; i11++) {
                C2416m c2416m = c5735r.f34803d[i11];
                int iMo6947a = this.f36362g.mo6947a(c2416m);
                C2416m.a aVarM7125a = c2416m.m7125a();
                aVarM7125a.f12490F = iMo6947a;
                c2416mArr[i11] = aVarM7125a.m7128a();
            }
            c5735rArr[i10] = new C5735r(c5735r.f34801b, c2416mArr);
        }
        return new C5736s(c5735rArr);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX INFO: renamed from: y */
    public final void m12862y(int i10) {
        ArrayList<C6245i> arrayList;
        boolean z10;
        C10129a.m18992d(!this.f36368j.m7467b());
        int i11 = i10;
        while (true) {
            arrayList = this.f36332I;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            }
            int i12 = i11;
            while (true) {
                if (i12 >= arrayList.size()) {
                    C6245i c6245i = arrayList.get(i11);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= this.f36340Q.length) {
                            z10 = true;
                            break;
                        }
                        int iM12845e = c6245i.m12845e(i13);
                        c cVar = this.f36340Q[i13];
                        if (cVar.f13424q + cVar.f13426s <= iM12845e) {
                            i13++;
                        }
                    }
                } else if (!arrayList.get(i12).f36289n) {
                    i12++;
                }
                z10 = false;
                break;
            }
            if (z10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j10 = m12863z().f35401h;
        C6245i c6245i2 = arrayList.get(i11);
        int size = arrayList.size();
        int i14 = C10134c0.f51354a;
        if (i11 < 0 || size > arrayList.size() || i11 > size) {
            throw new IllegalArgumentException();
        }
        if (i11 != size) {
            arrayList.subList(i11, size).clear();
        }
        for (int i15 = 0; i15 < this.f36340Q.length; i15++) {
            int iM12845e2 = c6245i2.m12845e(i15);
            c cVar2 = this.f36340Q[i15];
            long jM7392j = cVar2.m7392j(iM12845e2);
            C2498o c2498o = cVar2.f13408a;
            C10129a.m18990b(jM7392j <= c2498o.f13396g);
            c2498o.f13396g = jM7392j;
            int i16 = c2498o.f13391b;
            if (jM7392j != 0) {
                C2498o.a aVar = c2498o.f13393d;
                if (jM7392j == aVar.f13397a) {
                    c2498o.m7382a(c2498o.f13393d);
                    C2498o.a aVar2 = new C2498o.a(i16, c2498o.f13396g);
                    c2498o.f13393d = aVar2;
                    c2498o.f13394e = aVar2;
                    c2498o.f13395f = aVar2;
                } else {
                    while (c2498o.f13396g > aVar.f13398b) {
                        aVar = aVar.f13400d;
                    }
                    C2498o.a aVar3 = aVar.f13400d;
                    aVar3.getClass();
                    c2498o.m7382a(aVar3);
                    C2498o.a aVar4 = new C2498o.a(i16, aVar.f13398b);
                    aVar.f13400d = aVar4;
                    if (c2498o.f13396g == aVar.f13398b) {
                        aVar = aVar4;
                    }
                    c2498o.f13395f = aVar;
                    if (c2498o.f13394e == aVar3) {
                        c2498o.f13394e = aVar4;
                    }
                }
            } else {
                c2498o.m7382a(c2498o.f13393d);
                C2498o.a aVar5 = new C2498o.a(i16, c2498o.f13396g);
                c2498o.f13393d = aVar5;
                c2498o.f13394e = aVar5;
                c2498o.f13395f = aVar5;
            }
        }
        if (arrayList.isEmpty()) {
            this.f36373l0 = this.f36371k0;
        } else {
            ((C6245i) C5206f.m11002X0(arrayList)).f36284J = true;
        }
        this.f36376o0 = false;
        int i17 = this.f36345V;
        long j11 = c6245i2.f35400g;
        InterfaceC2493j.a aVar6 = this.f36370k;
        aVar6.m7338m(new C5726i(1, i17, null, 3, null, aVar6.m7326a(j11), aVar6.m7326a(j10)));
    }

    /* JADX INFO: renamed from: z */
    public final C6245i m12863z() {
        ArrayList<C6245i> arrayList = this.f36332I;
        return arrayList.get(arrayList.size() - 1);
    }
}
