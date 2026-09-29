package p175ia;

import android.net.Uri;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import androidx.activity.result.C0204c;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.drm.InterfaceC2399c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC2480h;
import com.google.android.exoplayer2.source.InterfaceC2493j;
import com.google.android.exoplayer2.source.InterfaceC2500q;
import com.google.android.exoplayer2.source.hls.playlist.C2490c;
import com.google.android.exoplayer2.source.hls.playlist.C2491d;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import dm.C5206f;
import ga.C5735r;
import ga.C5736s;
import ga.InterfaceC5720c;
import ga.InterfaceC5731n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p105f0.C5457e;
import p150h9.C5930o0;
import p174i9.C6215e0;
import p387t0.C9166r;
import p392t5.C9203i;
import p454wa.InterfaceC9877b;
import p454wa.InterfaceC9894s;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10147p;
import ua.C9509r;

/* JADX INFO: renamed from: ia.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6247k implements InterfaceC2480h, HlsPlaylistTracker.InterfaceC2486a {

    /* JADX INFO: renamed from: H */
    public final boolean f36302H;

    /* JADX INFO: renamed from: I */
    public final int f36303I;

    /* JADX INFO: renamed from: J */
    public final boolean f36304J;

    /* JADX INFO: renamed from: K */
    public final C6215e0 f36305K;

    /* JADX INFO: renamed from: L */
    public final a f36306L = new a();

    /* JADX INFO: renamed from: M */
    public InterfaceC2480h.a f36307M;

    /* JADX INFO: renamed from: N */
    public int f36308N;

    /* JADX INFO: renamed from: O */
    public C5736s f36309O;

    /* JADX INFO: renamed from: P */
    public C6249m[] f36310P;

    /* JADX INFO: renamed from: Q */
    public C6249m[] f36311Q;

    /* JADX INFO: renamed from: R */
    public int f36312R;

    /* JADX INFO: renamed from: S */
    public C9166r f36313S;

    /* JADX INFO: renamed from: a */
    public final InterfaceC6243g f36314a;

    /* JADX INFO: renamed from: b */
    public final HlsPlaylistTracker f36315b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6242f f36316c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9894s f36317d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2399c f36318e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2398b.a f36319f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2528b f36320g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2493j.a f36321h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC9877b f36322i;

    /* JADX INFO: renamed from: j */
    public final IdentityHashMap<InterfaceC5731n, Integer> f36323j;

    /* JADX INFO: renamed from: k */
    public final C5457e f36324k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5720c f36325l;

    /* JADX INFO: renamed from: ia.k$a */
    public class a implements C6249m.a {
        public a() {
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2500q.a
        /* JADX INFO: renamed from: a */
        public final void mo7091a(InterfaceC2500q interfaceC2500q) {
            C6247k c6247k = C6247k.this;
            c6247k.f36307M.mo7091a(c6247k);
        }

        /* JADX INFO: renamed from: c */
        public final void m12849c() {
            C6247k c6247k = C6247k.this;
            int i10 = c6247k.f36308N - 1;
            c6247k.f36308N = i10;
            if (i10 > 0) {
                return;
            }
            int i11 = 0;
            for (C6249m c6249m : c6247k.f36310P) {
                c6249m.m12860u();
                i11 += c6249m.f36357d0.f34808a;
            }
            C5735r[] c5735rArr = new C5735r[i11];
            int i12 = 0;
            for (C6249m c6249m2 : c6247k.f36310P) {
                c6249m2.m12860u();
                int i13 = c6249m2.f36357d0.f34808a;
                int i14 = 0;
                while (i14 < i13) {
                    c6249m2.m12860u();
                    c5735rArr[i12] = c6249m2.f36357d0.m12091a(i14);
                    i14++;
                    i12++;
                }
            }
            c6247k.f36309O = new C5736s(c5735rArr);
            c6247k.f36307M.mo7093b(c6247k);
        }
    }

    public C6247k(InterfaceC6243g interfaceC6243g, HlsPlaylistTracker hlsPlaylistTracker, InterfaceC6242f interfaceC6242f, InterfaceC9894s interfaceC9894s, InterfaceC2399c interfaceC2399c, InterfaceC2398b.a aVar, InterfaceC2528b interfaceC2528b, InterfaceC2493j.a aVar2, InterfaceC9877b interfaceC9877b, InterfaceC5720c interfaceC5720c, boolean z10, int i10, boolean z11, C6215e0 c6215e0) {
        this.f36314a = interfaceC6243g;
        this.f36315b = hlsPlaylistTracker;
        this.f36316c = interfaceC6242f;
        this.f36317d = interfaceC9894s;
        this.f36318e = interfaceC2399c;
        this.f36319f = aVar;
        this.f36320g = interfaceC2528b;
        this.f36321h = aVar2;
        this.f36322i = interfaceC9877b;
        this.f36325l = interfaceC5720c;
        this.f36302H = z10;
        this.f36303I = i10;
        this.f36304J = z11;
        this.f36305K = c6215e0;
        ((C9203i) interfaceC5720c).getClass();
        this.f36313S = new C9166r(new InterfaceC2500q[0]);
        this.f36323j = new IdentityHashMap<>();
        this.f36324k = new C5457e();
        this.f36310P = new C6249m[0];
        this.f36311Q = new C6249m[0];
    }

    /* JADX INFO: renamed from: e */
    public static C2416m m12847e(C2416m c2416m, C2416m c2416m2, boolean z10) {
        String strM19048o;
        Metadata metadata;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        int i13 = -1;
        if (c2416m2 != null) {
            strM19048o = c2416m2.f12481i;
            metadata = c2416m2.f12482j;
            i11 = c2416m2.f12463T;
            i10 = c2416m2.f12476d;
            i12 = c2416m2.f12477e;
            str = c2416m2.f12474c;
            str2 = c2416m2.f12472b;
        } else {
            strM19048o = C10134c0.m19048o(c2416m.f12481i, 1);
            metadata = c2416m.f12482j;
            if (z10) {
                i11 = c2416m.f12463T;
                i10 = c2416m.f12476d;
                i12 = c2416m.f12477e;
                str = c2416m.f12474c;
                str2 = c2416m.f12472b;
            } else {
                i10 = 0;
                str = null;
                i11 = -1;
                i12 = 0;
                str2 = null;
            }
        }
        String strM19104d = C10147p.m19104d(strM19048o);
        int i14 = z10 ? c2416m.f12478f : -1;
        if (z10) {
            i13 = c2416m.f12479g;
        }
        C2416m.a aVar = new C2416m.a();
        aVar.f12491a = c2416m.f12470a;
        aVar.f12492b = str2;
        aVar.f12500j = c2416m.f12483k;
        aVar.f12501k = strM19104d;
        aVar.f12498h = strM19048o;
        aVar.f12499i = metadata;
        aVar.f12496f = i14;
        aVar.f12497g = i13;
        aVar.f12514x = i11;
        aVar.f12494d = i10;
        aVar.f12495e = i12;
        aVar.f12493c = str;
        return aVar.m7128a();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC2486a
    /* JADX INFO: renamed from: a */
    public final void mo7311a() {
        for (C6249m c6249m : this.f36310P) {
            ArrayList<C6245i> arrayList = c6249m.f36332I;
            if (!arrayList.isEmpty()) {
                C6245i c6245i = (C6245i) C5206f.m11002X0(arrayList);
                int iM12840b = c6249m.f36356d.m12840b(c6245i);
                if (iM12840b == 1) {
                    c6245i.f36285K = true;
                } else if (iM12840b == 2 && !c6249m.f36376o0) {
                    Loader loader = c6249m.f36368j;
                    if (loader.m7467b()) {
                        loader.m7466a();
                    }
                }
            }
        }
        this.f36307M.mo7091a(this);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f A[LOOP:1: B:17:0x0040->B:22:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0053 A[EDGE_INSN: B:50:0x0053->B:24:0x0053 BREAK  A[LOOP:1: B:17:0x0040->B:22:0x004f], SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC2486a
    /* JADX INFO: renamed from: b */
    public final boolean mo7312b(Uri uri, InterfaceC2528b.c cVar, boolean z10) {
        long j10;
        int i10;
        Uri[] uriArr;
        boolean z11;
        int iMo7358t;
        boolean z12 = true;
        for (C6249m c6249m : this.f36310P) {
            C6241e c6241e = c6249m.f36356d;
            if (C10134c0.m19043j(uri, c6241e.f36247e)) {
                if (!z10) {
                    InterfaceC2528b.b bVarMo7473b = c6249m.f36366i.mo7473b(C9509r.m17975a(c6241e.f36259q), cVar);
                    if (bVarMo7473b != null && bVarMo7473b.f13731a == 2) {
                        j10 = bVarMo7473b.f13732b;
                    }
                    i10 = 0;
                    while (true) {
                        uriArr = c6241e.f36247e;
                        if (i10 < uriArr.length) {
                            i10 = -1;
                            break;
                        }
                        if (uriArr[i10].equals(uri)) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 == -1 && (iMo7358t = c6241e.f36259q.mo7358t(i10)) != -1) {
                        c6241e.f36261s |= uri.equals(c6241e.f36257o);
                        if (j10 != -9223372036854775807L || (c6241e.f36259q.mo7342d(iMo7358t, j10) && c6241e.f36249g.mo7305i(uri, j10))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = true;
                    }
                    boolean z13 = (z11 || j10 == -9223372036854775807L) ? false : true;
                    z12 &= z13;
                }
                j10 = -9223372036854775807L;
                i10 = 0;
                while (true) {
                    uriArr = c6241e.f36247e;
                    if (i10 < uriArr.length) {
                        i10 = -1;
                        break;
                    }
                    if (uriArr[i10].equals(uri)) {
                        break;
                        break;
                    }
                    i10++;
                }
                if (i10 == -1) {
                    z11 = true;
                } else {
                    c6241e.f36261s |= uri.equals(c6241e.f36257o);
                    if (j10 != -9223372036854775807L) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                }
                if (z11) {
                }
                z12 &= z13;
            }
            z12 &= z13;
        }
        this.f36307M.mo7091a(this);
        return z12;
    }

    /* JADX INFO: renamed from: c */
    public final C6249m m12848c(String str, int i10, Uri[] uriArr, C2416m[] c2416mArr, C2416m c2416m, List<C2416m> list, Map<String, DrmInitData> map, long j10) {
        return new C6249m(str, i10, this.f36306L, new C6241e(this.f36314a, this.f36315b, uriArr, c2416mArr, this.f36316c, this.f36317d, this.f36324k, list, this.f36305K), map, this.f36322i, j10, c2416m, this.f36318e, this.f36319f, this.f36320g, this.f36321h, this.f36303I);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: d */
    public final long mo7251d() {
        return this.f36313S.mo7251d();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: f */
    public final void mo7252f() throws IOException {
        for (C6249m c6249m : this.f36310P) {
            c6249m.m12856D();
            if (c6249m.f36376o0 && !c6249m.f36348Y) {
                throw ParserException.m6770a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: g */
    public final long mo7253g(long j10) {
        C6249m[] c6249mArr = this.f36311Q;
        if (c6249mArr.length > 0) {
            boolean zM12859G = c6249mArr[0].m12859G(false, j10);
            int i10 = 1;
            while (true) {
                C6249m[] c6249mArr2 = this.f36311Q;
                if (i10 >= c6249mArr2.length) {
                    break;
                }
                c6249mArr2[i10].m12859G(zM12859G, j10);
                i10++;
            }
            if (zM12859G) {
                this.f36324k.f34016a.clear();
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: h */
    public final boolean mo7254h(long j10) {
        if (this.f36309O != null) {
            return this.f36313S.mo7254h(j10);
        }
        for (C6249m c6249m : this.f36310P) {
            if (!c6249m.f36348Y) {
                c6249m.mo7254h(c6249m.f36371k0);
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    public final boolean isLoading() {
        return this.f36313S.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: j */
    public final void mo7255j(boolean z10, long j10) {
        for (C6249m c6249m : this.f36311Q) {
            if (c6249m.f36347X && !c6249m.m12854B()) {
                int length = c6249m.f36340Q.length;
                for (int i10 = 0; i10 < length; i10++) {
                    c6249m.f36340Q[i10].m7390h(j10, z10, c6249m.f36367i0[i10]);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: k */
    public final long mo7256k() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0251 A[LOOP:6: B:99:0x024f->B:100:0x0251, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:76:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6 A[LOOP:4: B:83:0x01a4->B:84:0x01a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0221  */
    /* JADX WARN: Code duplicated, block: B:96:0x0228 A[LOOP:5: B:94:0x0222->B:96:0x0228, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a, ia.k] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map] */
    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: l */
    public final void mo7257l(InterfaceC2480h.a aVar, long j10) {
        ?? EmptyMap;
        List<C2491d.a> list;
        ?? r25;
        List<C2491d.a> list2;
        int i10;
        ArrayList arrayList;
        HashSet hashSet;
        boolean z10;
        boolean z11;
        int i11;
        Uri[] uriArr;
        C2416m[] c2416mArr;
        int[] iArr;
        int i12;
        int i13;
        int iM19047n;
        int iM19047n2;
        int i14;
        ?? r26;
        C6249m c6249mM12848c;
        ArrayList arrayList2;
        C2416m c2416m;
        C2416m[] c2416mArr2;
        int i15;
        int i16;
        C2416m[] c2416mArr3;
        int i17;
        List<C2416m> list3;
        int i18;
        this.f36307M = aVar;
        HlsPlaylistTracker hlsPlaylistTracker = this.f36315b;
        hlsPlaylistTracker.mo7309m(this);
        C2491d c2491dMo7304h = hlsPlaylistTracker.mo7304h();
        c2491dMo7304h.getClass();
        if (this.f36304J) {
            List<DrmInitData> list4 = c2491dMo7304h.f13279m;
            ArrayList arrayList3 = new ArrayList(list4);
            EmptyMap = new HashMap();
            int i19 = 0;
            while (i19 < arrayList3.size()) {
                DrmInitData drmInitData = list4.get(i19);
                String str = drmInitData.f12188c;
                i19++;
                int i20 = i19;
                while (i20 < arrayList3.size()) {
                    DrmInitData drmInitData2 = (DrmInitData) arrayList3.get(i20);
                    if (TextUtils.equals(drmInitData2.f12188c, str)) {
                        String str2 = drmInitData.f12188c;
                        String str3 = drmInitData2.f12188c;
                        C10129a.m18992d(str2 == null || str3 == null || TextUtils.equals(str2, str3));
                        if (str2 == null) {
                            str2 = str3;
                        }
                        int i21 = C10134c0.f51354a;
                        DrmInitData.SchemeData[] schemeDataArr = drmInitData.f12186a;
                        int length = schemeDataArr.length;
                        DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.f12186a;
                        Object[] objArrCopyOf = Arrays.copyOf(schemeDataArr, length + schemeDataArr2.length);
                        System.arraycopy(schemeDataArr2, 0, objArrCopyOf, schemeDataArr.length, schemeDataArr2.length);
                        drmInitData = new DrmInitData(str2, true, (DrmInitData.SchemeData[]) objArrCopyOf);
                        arrayList3.remove(i20);
                    } else {
                        i20++;
                    }
                }
                EmptyMap.put(str, drmInitData);
            }
        } else {
            EmptyMap = Collections.emptyMap();
        }
        ?? r12 = EmptyMap;
        List<C2491d.b> list5 = c2491dMo7304h.f13271e;
        boolean zIsEmpty = true ^ list5.isEmpty();
        this.f36308N = 0;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean z12 = this.f36302H;
        List<C2491d.a> list6 = c2491dMo7304h.f13273g;
        if (zIsEmpty) {
            int size = list5.size();
            int[] iArr2 = new int[size];
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < list5.size(); i24++) {
                C2416m c2416m2 = list5.get(i24).f13284b;
                if (c2416m2.f12456M <= 0) {
                    String str4 = c2416m2.f12481i;
                    if (C10134c0.m19048o(str4, 2) != null) {
                        iArr2[i24] = 2;
                        i22++;
                    } else if (C10134c0.m19048o(str4, 1) != null) {
                        iArr2[i24] = 1;
                        i23++;
                    } else {
                        iArr2[i24] = -1;
                    }
                } else {
                    iArr2[i24] = 2;
                    i22++;
                }
            }
            if (i22 > 0) {
                z10 = true;
                size = i22;
            } else {
                if (i23 < size) {
                    size -= i23;
                    z10 = false;
                    z11 = true;
                } else {
                    z10 = false;
                }
                i11 = size;
                uriArr = new Uri[i11];
                c2416mArr = new C2416m[i11];
                iArr = new int[i11];
                i13 = 0;
                for (i12 = 0; i12 < list5.size(); i12++) {
                    if ((z10 || iArr2[i12] == 2) && (!z11 || iArr2[i12] != 1)) {
                        C2491d.b bVar = list5.get(i12);
                        uriArr[i13] = bVar.f13283a;
                        c2416mArr[i13] = bVar.f13284b;
                        iArr[i13] = i12;
                        i13++;
                    }
                }
                String str5 = c2416mArr[0].f12481i;
                iM19047n = C10134c0.m19047n(str5, 2);
                iM19047n2 = C10134c0.m19047n(str5, 1);
                boolean z13 = (iM19047n2 != 1 || (iM19047n2 == 0 && list6.isEmpty())) && iM19047n <= 1 && iM19047n2 + iM19047n > 0;
                if (!z10 || iM19047n2 <= 0) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
                list = list6;
                r26 = r12;
                c6249mM12848c = m12848c("main", i14, uriArr, c2416mArr, c2491dMo7304h.f13276j, c2491dMo7304h.f13277k, r12, j10);
                arrayList4.add(c6249mM12848c);
                arrayList5.add(iArr);
                r25 = r26;
                r25 = r26;
                if (z12 && z13) {
                    arrayList2 = new ArrayList();
                    c2416m = c2491dMo7304h.f13276j;
                    if (iM19047n > 0) {
                        c2416mArr3 = new C2416m[i11];
                        for (i17 = 0; i17 < i11; i17++) {
                            C2416m c2416m3 = c2416mArr[i17];
                            String strM19048o = C10134c0.m19048o(c2416m3.f12481i, 2);
                            String strM19104d = C10147p.m19104d(strM19048o);
                            C2416m.a aVar2 = new C2416m.a();
                            aVar2.f12491a = c2416m3.f12470a;
                            aVar2.f12492b = c2416m3.f12472b;
                            aVar2.f12500j = c2416m3.f12483k;
                            aVar2.f12501k = strM19104d;
                            aVar2.f12498h = strM19048o;
                            aVar2.f12499i = c2416m3.f12482j;
                            aVar2.f12496f = c2416m3.f12478f;
                            aVar2.f12497g = c2416m3.f12479g;
                            aVar2.f12506p = c2416m3.f12455L;
                            aVar2.f12507q = c2416m3.f12456M;
                            aVar2.f12508r = c2416m3.f12457N;
                            aVar2.f12494d = c2416m3.f12476d;
                            aVar2.f12495e = c2416m3.f12477e;
                            c2416mArr3[i17] = new C2416m(aVar2);
                        }
                        arrayList2.add(new C5735r("main", c2416mArr3));
                        if (iM19047n2 > 0 && (c2416m != null || list.isEmpty())) {
                            arrayList2.add(new C5735r("main:audio", m12847e(c2416mArr[0], c2416m, false)));
                        }
                        list3 = c2491dMo7304h.f13277k;
                        if (list3 != null) {
                            for (i18 = 0; i18 < list3.size(); i18++) {
                                arrayList2.add(new C5735r(C0166e.m761g("main:cc:", i18), list3.get(i18)));
                            }
                        }
                        i16 = 1;
                    } else {
                        c2416mArr2 = new C2416m[i11];
                        for (i15 = 0; i15 < i11; i15++) {
                            c2416mArr2[i15] = m12847e(c2416mArr[i15], c2416m, true);
                        }
                        i16 = 1;
                        arrayList2.add(new C5735r("main", c2416mArr2));
                    }
                    C2416m[] c2416mArr4 = new C2416m[i16];
                    C2416m.a aVar3 = new C2416m.a();
                    aVar3.f12491a = "ID3";
                    aVar3.f12501k = "application/id3";
                    c2416mArr4[0] = new C2416m(aVar3);
                    C5735r c5735r = new C5735r("main:id3", c2416mArr4);
                    arrayList2.add(c5735r);
                    c6249mM12848c.m12857E((C5735r[]) arrayList2.toArray(new C5735r[0]), arrayList2.indexOf(c5735r));
                    r25 = r26;
                }
            }
            z11 = false;
            i11 = size;
            uriArr = new Uri[i11];
            c2416mArr = new C2416m[i11];
            iArr = new int[i11];
            i13 = 0;
            while (i12 < list5.size()) {
                if (z10) {
                    C2491d.b bVar2 = list5.get(i12);
                    uriArr[i13] = bVar2.f13283a;
                    c2416mArr[i13] = bVar2.f13284b;
                    iArr[i13] = i12;
                    i13++;
                } else {
                    C2491d.b bVar3 = list5.get(i12);
                    uriArr[i13] = bVar3.f13283a;
                    c2416mArr[i13] = bVar3.f13284b;
                    iArr[i13] = i12;
                    i13++;
                }
            }
            String str6 = c2416mArr[0].f12481i;
            iM19047n = C10134c0.m19047n(str6, 2);
            iM19047n2 = C10134c0.m19047n(str6, 1);
            boolean z14 = (iM19047n2 != 1 || (iM19047n2 == 0 && list6.isEmpty())) && iM19047n <= 1 && iM19047n2 + iM19047n > 0;
            if (z10) {
                i14 = 0;
            } else {
                i14 = 0;
            }
            list = list6;
            r26 = r12;
            c6249mM12848c = m12848c("main", i14, uriArr, c2416mArr, c2491dMo7304h.f13276j, c2491dMo7304h.f13277k, r12, j10);
            arrayList4.add(c6249mM12848c);
            arrayList5.add(iArr);
            r25 = r26;
            r25 = r26;
            if (z12) {
                arrayList2 = new ArrayList();
                c2416m = c2491dMo7304h.f13276j;
                if (iM19047n > 0) {
                    c2416mArr3 = new C2416m[i11];
                    while (i17 < i11) {
                        C2416m c2416m4 = c2416mArr[i17];
                        String strM19048o2 = C10134c0.m19048o(c2416m4.f12481i, 2);
                        String strM19104d2 = C10147p.m19104d(strM19048o2);
                        C2416m.a aVar4 = new C2416m.a();
                        aVar4.f12491a = c2416m4.f12470a;
                        aVar4.f12492b = c2416m4.f12472b;
                        aVar4.f12500j = c2416m4.f12483k;
                        aVar4.f12501k = strM19104d2;
                        aVar4.f12498h = strM19048o2;
                        aVar4.f12499i = c2416m4.f12482j;
                        aVar4.f12496f = c2416m4.f12478f;
                        aVar4.f12497g = c2416m4.f12479g;
                        aVar4.f12506p = c2416m4.f12455L;
                        aVar4.f12507q = c2416m4.f12456M;
                        aVar4.f12508r = c2416m4.f12457N;
                        aVar4.f12494d = c2416m4.f12476d;
                        aVar4.f12495e = c2416m4.f12477e;
                        c2416mArr3[i17] = new C2416m(aVar4);
                    }
                    arrayList2.add(new C5735r("main", c2416mArr3));
                    if (iM19047n2 > 0) {
                        arrayList2.add(new C5735r("main:audio", m12847e(c2416mArr[0], c2416m, false)));
                    }
                    list3 = c2491dMo7304h.f13277k;
                    if (list3 != null) {
                        while (i18 < list3.size()) {
                            arrayList2.add(new C5735r(C0166e.m761g("main:cc:", i18), list3.get(i18)));
                        }
                    }
                    i16 = 1;
                } else {
                    c2416mArr2 = new C2416m[i11];
                    while (i15 < i11) {
                        c2416mArr2[i15] = m12847e(c2416mArr[i15], c2416m, true);
                    }
                    i16 = 1;
                    arrayList2.add(new C5735r("main", c2416mArr2));
                }
                C2416m[] c2416mArr5 = new C2416m[i16];
                C2416m.a aVar5 = new C2416m.a();
                aVar5.f12491a = "ID3";
                aVar5.f12501k = "application/id3";
                c2416mArr5[0] = new C2416m(aVar5);
                C5735r c5735r2 = new C5735r("main:id3", c2416mArr5);
                arrayList2.add(c5735r2);
                c6249mM12848c.m12857E((C5735r[]) arrayList2.toArray(new C5735r[0]), arrayList2.indexOf(c5735r2));
                r25 = r26;
            }
        } else {
            list = list6;
            r25 = r12;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        ArrayList arrayList8 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i25 = 0;
        while (i25 < list.size()) {
            List<C2491d.a> list7 = list;
            String str7 = list7.get(i25).f13282c;
            if (hashSet2.add(str7)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z15 = true;
                for (int i26 = 0; i26 < list7.size(); i26++) {
                    if (C10134c0.m19034a(str7, list7.get(i26).f13282c)) {
                        C2491d.a aVar6 = list7.get(i26);
                        arrayList8.add(Integer.valueOf(i26));
                        arrayList6.add(aVar6.f13280a);
                        C2416m c2416m5 = aVar6.f13281b;
                        arrayList7.add(c2416m5);
                        z15 &= C10134c0.m19047n(c2416m5.f12481i, 1) == 1;
                    }
                }
                String strM852k = C0204c.m852k("audio:", str7);
                int i27 = C10134c0.f51354a;
                list2 = list7;
                i10 = i25;
                arrayList = arrayList8;
                hashSet = hashSet2;
                C6249m c6249mM12848c2 = m12848c(strM852k, 1, (Uri[]) arrayList6.toArray(new Uri[0]), (C2416m[]) arrayList7.toArray(new C2416m[0]), null, Collections.emptyList(), r25, j10);
                arrayList5.add(Ints.m9145o0(arrayList));
                arrayList4.add(c6249mM12848c2);
                if (z12 && z15) {
                    c6249mM12848c2.m12857E(new C5735r[]{new C5735r(strM852k, (C2416m[]) arrayList7.toArray(new C2416m[0]))}, new int[0]);
                }
            } else {
                list2 = list7;
                i10 = i25;
                arrayList = arrayList8;
                hashSet = hashSet2;
            }
            i25 = i10 + 1;
            arrayList8 = arrayList;
            hashSet2 = hashSet;
            list = list2;
        }
        this.f36312R = arrayList4.size();
        int i28 = 0;
        while (true) {
            List<C2491d.a> list8 = c2491dMo7304h.f13274h;
            if (i28 >= list8.size()) {
                break;
            }
            C2491d.a aVar7 = list8.get(i28);
            StringBuilder sbM614j = C0141b.m614j("subtitle:", i28, ":");
            sbM614j.append(aVar7.f13282c);
            String string = sbM614j.toString();
            Uri[] uriArr2 = {aVar7.f13280a};
            C2416m c2416m6 = aVar7.f13281b;
            C6249m c6249mM12848c3 = m12848c(string, 3, uriArr2, new C2416m[]{c2416m6}, null, Collections.emptyList(), r25, j10);
            arrayList5.add(new int[]{i28});
            arrayList4.add(c6249mM12848c3);
            c6249mM12848c3.m12857E(new C5735r[]{new C5735r(string, c2416m6)}, new int[0]);
            i28++;
        }
        this.f36310P = (C6249m[]) arrayList4.toArray(new C6249m[0]);
        this.f36308N = this.f36310P.length;
        for (int i29 = 0; i29 < this.f36312R; i29++) {
            this.f36310P[i29].f36356d.f36254l = true;
        }
        for (C6249m c6249m : this.f36310P) {
            if (!c6249m.f36348Y) {
                c6249m.mo7254h(c6249m.f36371k0);
            }
        }
        this.f36311Q = this.f36310P;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: m */
    public final C5736s mo7258m() {
        C5736s c5736s = this.f36309O;
        c5736s.getClass();
        return c5736s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: n */
    public final long mo7259n(long j10, C5930o0 c5930o0) {
        for (C6249m c6249m : this.f36311Q) {
            if (c6249m.f36345V == 2) {
                C6241e c6241e = c6249m.f36356d;
                int iMo7340b = c6241e.f36259q.mo7340b();
                Uri[] uriArr = c6241e.f36247e;
                int length = uriArr.length;
                HlsPlaylistTracker hlsPlaylistTracker = c6241e.f36249g;
                C2490c c2490cMo7310n = (iMo7340b >= length || iMo7340b == -1) ? null : hlsPlaylistTracker.mo7310n(true, uriArr[c6241e.f36259q.mo7349k()]);
                if (c2490cMo7310n == null) {
                    break;
                }
                ImmutableList immutableList = c2490cMo7310n.f13241r;
                if (immutableList.isEmpty() || !c2490cMo7310n.f36991c) {
                    break;
                    break;
                }
                long jMo7302f = c2490cMo7310n.f13231h - hlsPlaylistTracker.mo7302f();
                long j11 = j10 - jMo7302f;
                int iM19037d = C10134c0.m19037d(immutableList, Long.valueOf(j11), true);
                long j12 = ((C2490c.c) immutableList.get(iM19037d)).f13257e;
                return c5930o0.m12345a(j11, j12, iM19037d != immutableList.size() - 1 ? ((C2490c.c) immutableList.get(iM19037d + 1)).f13257e : j12) + jMo7302f;
            }
        }
        return j10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8491. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: o */
    public final long mo7260o(ua.InterfaceC9502k[] r37, boolean[] r38, ga.InterfaceC5731n[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p175ia.C6247k.mo7260o(ua.k[], boolean[], ga.n[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: r */
    public final long mo7261r() {
        return this.f36313S.mo7261r();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: t */
    public final void mo7262t(long j10) {
        this.f36313S.mo7262t(j10);
    }
}
