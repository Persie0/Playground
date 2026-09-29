package p175ia;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.hls.C2484a;
import com.google.android.exoplayer2.source.hls.playlist.C2490c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import ga.C5735r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p105f0.C5457e;
import p151ha.AbstractC5944a;
import p151ha.AbstractC5945b;
import p151ha.AbstractC5946c;
import p151ha.AbstractC5947d;
import p151ha.InterfaceC5948e;
import p174i9.C6215e0;
import p454wa.C9884i;
import p454wa.InterfaceC9882g;
import p454wa.InterfaceC9894s;
import p479xa.C10132b0;
import p479xa.C10134c0;
import ua.AbstractC9493b;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: ia.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6241e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6243g f36243a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9882g f36244b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9882g f36245c;

    /* JADX INFO: renamed from: d */
    public final C5457e f36246d;

    /* JADX INFO: renamed from: e */
    public final Uri[] f36247e;

    /* JADX INFO: renamed from: f */
    public final C2416m[] f36248f;

    /* JADX INFO: renamed from: g */
    public final HlsPlaylistTracker f36249g;

    /* JADX INFO: renamed from: h */
    public final C5735r f36250h;

    /* JADX INFO: renamed from: i */
    public final List<C2416m> f36251i;

    /* JADX INFO: renamed from: k */
    public final C6215e0 f36253k;

    /* JADX INFO: renamed from: l */
    public boolean f36254l;

    /* JADX INFO: renamed from: n */
    public BehindLiveWindowException f36256n;

    /* JADX INFO: renamed from: o */
    public Uri f36257o;

    /* JADX INFO: renamed from: p */
    public boolean f36258p;

    /* JADX INFO: renamed from: q */
    public InterfaceC9502k f36259q;

    /* JADX INFO: renamed from: s */
    public boolean f36261s;

    /* JADX INFO: renamed from: j */
    public final C2484a f36252j = new C2484a();

    /* JADX INFO: renamed from: m */
    public byte[] f36255m = C10134c0.f51359f;

    /* JADX INFO: renamed from: r */
    public long f36260r = -9223372036854775807L;

    /* JADX INFO: renamed from: ia.e$a */
    public static final class a extends AbstractC5946c {

        /* JADX INFO: renamed from: l */
        public byte[] f36262l;

        public a(InterfaceC9882g interfaceC9882g, C9884i c9884i, C2416m c2416m, int i10, Object obj, byte[] bArr) {
            super(interfaceC9882g, c9884i, c2416m, i10, obj, bArr);
        }
    }

    /* JADX INFO: renamed from: ia.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public AbstractC5945b f36263a = null;

        /* JADX INFO: renamed from: b */
        public boolean f36264b = false;

        /* JADX INFO: renamed from: c */
        public Uri f36265c = null;
    }

    /* JADX INFO: renamed from: ia.e$c */
    public static final class c extends AbstractC5944a {

        /* JADX INFO: renamed from: e */
        public final List<C2490c.d> f36266e;

        /* JADX INFO: renamed from: f */
        public final long f36267f;

        public c(long j10, List list) {
            super(list.size() - 1);
            this.f36267f = j10;
            this.f36266e = list;
        }

        @Override // p151ha.InterfaceC5948e
        /* JADX INFO: renamed from: a */
        public final long mo12383a() {
            long j10 = this.f35393d;
            if (j10 < this.f35391b || j10 > this.f35392c) {
                throw new NoSuchElementException();
            }
            return this.f36267f + this.f36266e.get((int) j10).f13257e;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p151ha.InterfaceC5948e
        /* JADX INFO: renamed from: b */
        public final long mo12384b() {
            long j10 = this.f35393d;
            if (j10 < this.f35391b || j10 > this.f35392c) {
                throw new NoSuchElementException();
            }
            C2490c.d dVar = this.f36266e.get((int) j10);
            return this.f36267f + dVar.f13257e + dVar.f13255c;
        }
    }

    /* JADX INFO: renamed from: ia.e$d */
    public static final class d extends AbstractC9493b {

        /* JADX INFO: renamed from: g */
        public int f36268g;

        public d(C5735r c5735r, int[] iArr) {
            super(c5735r, iArr);
            int i10 = 0;
            C2416m c2416m = c5735r.f34803d[iArr[0]];
            while (i10 < this.f48788b) {
                if (this.f48790d[i10] == c2416m) {
                    this.f36268g = i10;
                }
                i10++;
            }
            i10 = -1;
            this.f36268g = i10;
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: b */
        public final int mo7340b() {
            return this.f36268g;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: c */
        public final void mo7341c(long j10, long j11, long j12, List<? extends AbstractC5947d> list, InterfaceC5948e[] interfaceC5948eArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (mo7343e(this.f36268g, jElapsedRealtime)) {
                int i10 = this.f48788b;
                do {
                    i10--;
                    if (i10 < 0) {
                        throw new IllegalStateException();
                    }
                } while (mo7343e(i10, jElapsedRealtime));
                this.f36268g = i10;
            }
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: m */
        public final int mo7351m() {
            return 0;
        }

        @Override // ua.InterfaceC9502k
        /* JADX INFO: renamed from: o */
        public final Object mo7353o() {
            return null;
        }
    }

    /* JADX INFO: renamed from: ia.e$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final C2490c.d f36269a;

        /* JADX INFO: renamed from: b */
        public final long f36270b;

        /* JADX INFO: renamed from: c */
        public final int f36271c;

        /* JADX INFO: renamed from: d */
        public final boolean f36272d;

        public e(C2490c.d dVar, long j10, int i10) {
            this.f36269a = dVar;
            this.f36270b = j10;
            this.f36271c = i10;
            this.f36272d = (dVar instanceof C2490c.a) && ((C2490c.a) dVar).f13246H;
        }
    }

    public C6241e(InterfaceC6243g interfaceC6243g, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, C2416m[] c2416mArr, InterfaceC6242f interfaceC6242f, InterfaceC9894s interfaceC9894s, C5457e c5457e, List<C2416m> list, C6215e0 c6215e0) {
        this.f36243a = interfaceC6243g;
        this.f36249g = hlsPlaylistTracker;
        this.f36247e = uriArr;
        this.f36248f = c2416mArr;
        this.f36246d = c5457e;
        this.f36251i = list;
        this.f36253k = c6215e0;
        InterfaceC9882g interfaceC9882gMo12837a = interfaceC6242f.mo12837a();
        this.f36244b = interfaceC9882gMo12837a;
        if (interfaceC9894s != null) {
            interfaceC9882gMo12837a.mo7274g(interfaceC9894s);
        }
        this.f36245c = interfaceC6242f.mo12837a();
        this.f36250h = new C5735r("", c2416mArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((c2416mArr[i10].f12477e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f36259q = new d(this.f36250h, Ints.m9145o0(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final InterfaceC5948e[] m12839a(C6245i c6245i, long j10) {
        List listM9062Y;
        int iM12090a = c6245i == null ? -1 : this.f36250h.m12090a(c6245i.f35397d);
        int length = this.f36259q.length();
        InterfaceC5948e[] interfaceC5948eArr = new InterfaceC5948e[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int iMo7348j = this.f36259q.mo7348j(i10);
            Uri uri = this.f36247e[iMo7348j];
            HlsPlaylistTracker hlsPlaylistTracker = this.f36249g;
            if (hlsPlaylistTracker.mo7299a(uri)) {
                C2490c c2490cMo7310n = hlsPlaylistTracker.mo7310n(z10, uri);
                c2490cMo7310n.getClass();
                long jMo7302f = c2490cMo7310n.f13231h - hlsPlaylistTracker.mo7302f();
                Pair<Long, Integer> pairM12841c = m12841c(c6245i, iMo7348j != iM12090a ? true : z10, c2490cMo7310n, jMo7302f, j10);
                long jLongValue = ((Long) pairM12841c.first).longValue();
                int iIntValue = ((Integer) pairM12841c.second).intValue();
                int i11 = (int) (jLongValue - c2490cMo7310n.f13234k);
                if (i11 >= 0) {
                    ImmutableList immutableList = c2490cMo7310n.f13241r;
                    if (immutableList.size() < i11) {
                        listM9062Y = ImmutableList.m9062Y();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        if (i11 < immutableList.size()) {
                            if (iIntValue != -1) {
                                C2490c.c cVar = (C2490c.c) immutableList.get(i11);
                                if (iIntValue == 0) {
                                    arrayList.add(cVar);
                                } else if (iIntValue < cVar.f13251H.size()) {
                                    ImmutableList immutableList2 = cVar.f13251H;
                                    arrayList.addAll(immutableList2.subList(iIntValue, immutableList2.size()));
                                }
                                i11++;
                            }
                            arrayList.addAll(immutableList.subList(i11, immutableList.size()));
                            iIntValue = 0;
                        }
                        if (c2490cMo7310n.f13237n != -9223372036854775807L) {
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            ImmutableList immutableList3 = c2490cMo7310n.f13242s;
                            if (iIntValue < immutableList3.size()) {
                                arrayList.addAll(immutableList3.subList(iIntValue, immutableList3.size()));
                            }
                        }
                        listM9062Y = Collections.unmodifiableList(arrayList);
                    }
                } else {
                    listM9062Y = ImmutableList.m9062Y();
                }
                interfaceC5948eArr[i10] = new c(jMo7302f, listM9062Y);
            } else {
                interfaceC5948eArr[i10] = InterfaceC5948e.f35406a;
            }
            i10++;
            z10 = false;
        }
        return interfaceC5948eArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final int m12840b(C6245i c6245i) {
        if (c6245i.f36290o == -1) {
            return 1;
        }
        C2490c c2490cMo7310n = this.f36249g.mo7310n(false, this.f36247e[this.f36250h.m12090a(c6245i.f35397d)]);
        c2490cMo7310n.getClass();
        int i10 = (int) (c6245i.f35405j - c2490cMo7310n.f13234k);
        if (i10 < 0) {
            return 1;
        }
        ImmutableList immutableList = c2490cMo7310n.f13241r;
        ImmutableList immutableList2 = i10 < immutableList.size() ? ((C2490c.c) immutableList.get(i10)).f13251H : c2490cMo7310n.f13242s;
        int size = immutableList2.size();
        int i11 = c6245i.f36290o;
        if (i11 >= size) {
            return 2;
        }
        C2490c.a aVar = (C2490c.a) immutableList2.get(i11);
        if (aVar.f13246H) {
            return 0;
        }
        return C10134c0.m19034a(Uri.parse(C10132b0.m19010c(c2490cMo7310n.f36989a, aVar.f13253a)), c6245i.f35395b.f50436a) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final Pair<Long, Integer> m12841c(C6245i c6245i, boolean z10, C2490c c2490c, long j10, long j11) {
        boolean z11 = true;
        int i10 = -1;
        if (c6245i != null && !z10) {
            boolean z12 = c6245i.f36282H;
            int i11 = c6245i.f36290o;
            long j12 = c6245i.f35405j;
            if (!z12) {
                return new Pair<>(Long.valueOf(j12), Integer.valueOf(i11));
            }
            if (i11 == -1) {
                j12 = j12 != -1 ? j12 + 1 : -1L;
            }
            return new Pair<>(Long.valueOf(j12), Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
        }
        long j13 = j10 + c2490c.f13244u;
        long j14 = (c6245i == null || this.f36258p) ? j11 : c6245i.f35400g;
        boolean z13 = c2490c.f13238o;
        long j15 = c2490c.f13234k;
        ImmutableList immutableList = c2490c.f13241r;
        if (!z13 && j14 >= j13) {
            return new Pair<>(Long.valueOf(j15 + ((long) immutableList.size())), -1);
        }
        long j16 = j14 - j10;
        Long lValueOf = Long.valueOf(j16);
        if (this.f36249g.mo7303g() && c6245i != null) {
            z11 = false;
        }
        int iM19037d = C10134c0.m19037d(immutableList, lValueOf, z11);
        long j17 = ((long) iM19037d) + j15;
        if (iM19037d >= 0) {
            C2490c.c cVar = (C2490c.c) immutableList.get(iM19037d);
            long j18 = cVar.f13257e + cVar.f13255c;
            ImmutableList immutableList2 = c2490c.f13242s;
            ImmutableList immutableList3 = j16 < j18 ? cVar.f13251H : immutableList2;
            for (int i12 = 0; i12 < immutableList3.size(); i12++) {
                C2490c.a aVar = (C2490c.a) immutableList3.get(i12);
                if (j16 < aVar.f13257e + aVar.f13255c) {
                    if (!aVar.f13247l) {
                        break;
                    }
                    j17 += immutableList3 != immutableList2 ? 0L : 1L;
                    i10 = i12;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j17), Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: d */
    public final a m12842d(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        C2484a c2484a = this.f36252j;
        byte[] bArrRemove = c2484a.f13142a.remove(uri);
        if (bArrRemove != null) {
            c2484a.f13142a.put(uri, bArrRemove);
            return null;
        }
        return new a(this.f36245c, new C9884i(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1, null), this.f36248f[i10], this.f36259q.mo7351m(), this.f36259q.mo7353o(), this.f36255m);
    }
}
