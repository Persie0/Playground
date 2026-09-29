package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.InterfaceC2493j;
import com.google.android.exoplayer2.upstream.C2529c;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import dm.C5206f;
import ga.C5725h;
import ge.C5789m;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p080e.RunnableC5286r;
import p175ia.InterfaceC6242f;
import p196ja.AbstractC6440c;
import p196ja.InterfaceC6441d;
import p454wa.C9893r;
import p454wa.InterfaceC9882g;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2488a implements HlsPlaylistTracker, Loader.InterfaceC2521a<C2529c<AbstractC6440c>> {

    /* JADX INFO: renamed from: J */
    public static final C5789m f13200J = new C5789m(17);

    /* JADX INFO: renamed from: H */
    public boolean f13201H;

    /* JADX INFO: renamed from: a */
    public final InterfaceC6242f f13203a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6441d f13204b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2528b f13205c;

    /* JADX INFO: renamed from: f */
    public InterfaceC2493j.a f13208f;

    /* JADX INFO: renamed from: g */
    public Loader f13209g;

    /* JADX INFO: renamed from: h */
    public Handler f13210h;

    /* JADX INFO: renamed from: i */
    public HlsPlaylistTracker.InterfaceC2487b f13211i;

    /* JADX INFO: renamed from: j */
    public C2491d f13212j;

    /* JADX INFO: renamed from: k */
    public Uri f13213k;

    /* JADX INFO: renamed from: l */
    public C2490c f13214l;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList<HlsPlaylistTracker.InterfaceC2486a> f13207e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    public final HashMap<Uri, b> f13206d = new HashMap<>();

    /* JADX INFO: renamed from: I */
    public long f13202I = -9223372036854775807L;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a$a */
    public class a implements HlsPlaylistTracker.InterfaceC2486a {
        public a() {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC2486a
        /* JADX INFO: renamed from: a */
        public final void mo7311a() {
            C2488a.this.f13207e.remove(this);
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC2486a
        /* JADX INFO: renamed from: b */
        public final boolean mo7312b(Uri uri, InterfaceC2528b.c cVar, boolean z10) {
            HashMap<Uri, b> map;
            b bVar;
            C2488a c2488a = C2488a.this;
            if (c2488a.f13214l == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C2491d c2491d = c2488a.f13212j;
                int i10 = C10134c0.f51354a;
                List<C2491d.b> list = c2491d.f13271e;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int size = list.size();
                    map = c2488a.f13206d;
                    if (i11 >= size) {
                        break;
                    }
                    b bVar2 = map.get(list.get(i11).f13283a);
                    if (bVar2 != null && jElapsedRealtime < bVar2.f13223h) {
                        i12++;
                    }
                    i11++;
                }
                InterfaceC2528b.b bVarMo7473b = c2488a.f13205c.mo7473b(new InterfaceC2528b.a(c2488a.f13212j.f13271e.size(), i12), cVar);
                if (bVarMo7473b != null && bVarMo7473b.f13731a == 2 && (bVar = map.get(uri)) != null) {
                    b.m7317a(bVar, bVarMo7473b.f13732b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a$b */
    public final class b implements Loader.InterfaceC2521a<C2529c<AbstractC6440c>> {

        /* JADX INFO: renamed from: a */
        public final Uri f13216a;

        /* JADX INFO: renamed from: b */
        public final Loader f13217b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c */
        public final InterfaceC9882g f13218c;

        /* JADX INFO: renamed from: d */
        public C2490c f13219d;

        /* JADX INFO: renamed from: e */
        public long f13220e;

        /* JADX INFO: renamed from: f */
        public long f13221f;

        /* JADX INFO: renamed from: g */
        public long f13222g;

        /* JADX INFO: renamed from: h */
        public long f13223h;

        /* JADX INFO: renamed from: i */
        public boolean f13224i;

        /* JADX INFO: renamed from: j */
        public IOException f13225j;

        public b(Uri uri) {
            this.f13216a = uri;
            this.f13218c = C2488a.this.f13203a.mo12837a();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005c  */
        /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public static boolean m7317a(b bVar, long j10) {
            boolean z10;
            bVar.f13223h = SystemClock.elapsedRealtime() + j10;
            C2488a c2488a = C2488a.this;
            if (!bVar.f13216a.equals(c2488a.f13213k)) {
                return false;
            }
            List<C2491d.b> list = c2488a.f13212j.f13271e;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar2 = c2488a.f13206d.get(list.get(i10).f13283a);
                bVar2.getClass();
                if (jElapsedRealtime > bVar2.f13223h) {
                    Uri uri = bVar2.f13216a;
                    c2488a.f13213k = uri;
                    bVar2.m7319d(c2488a.m7315o(uri));
                    z10 = true;
                    if (z10) {
                        return false;
                    }
                    return true;
                }
            }
            z10 = false;
            if (z10) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
        /* JADX INFO: renamed from: b */
        public final void mo7313b(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, boolean z10) {
            C2529c c2529c = (C2529c) interfaceC2524d;
            long j12 = c2529c.f13735a;
            C9893r c9893r = c2529c.f13738d;
            Uri uri = c9893r.f50527c;
            C5725h c5725h = new C5725h(c9893r.f50528d);
            C2488a c2488a = C2488a.this;
            c2488a.f13205c.getClass();
            c2488a.f13208f.m7329d(c5725h, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: c */
        public final void m7318c(Uri uri) {
            C2488a c2488a = C2488a.this;
            C2529c c2529c = new C2529c(this.f13218c, uri, c2488a.f13204b.mo13066a(c2488a.f13212j, this.f13219d));
            int i10 = c2529c.f13737c;
            c2488a.f13208f.m7336k(new C5725h(c2529c.f13735a, c2529c.f13736b, this.f13217b.m7469d(c2529c, this, c2488a.f13205c.mo7474c(i10))), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* JADX INFO: renamed from: d */
        public final void m7319d(Uri uri) {
            this.f13223h = 0L;
            if (!this.f13224i) {
                Loader loader = this.f13217b;
                if (!loader.m7467b()) {
                    if (loader.f13699c != null) {
                        return;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = this.f13222g;
                    if (jElapsedRealtime < j10) {
                        this.f13224i = true;
                        C2488a.this.f13210h.postDelayed(new RunnableC5286r(this, 15, uri), j10 - jElapsedRealtime);
                        return;
                    }
                    m7318c(uri);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
        /* JADX INFO: renamed from: e */
        public final void mo7314e(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11) {
            C2529c c2529c = (C2529c) interfaceC2524d;
            AbstractC6440c abstractC6440c = (AbstractC6440c) c2529c.f13740f;
            C9893r c9893r = c2529c.f13738d;
            Uri uri = c9893r.f50527c;
            C5725h c5725h = new C5725h(c9893r.f50528d);
            if (abstractC6440c instanceof C2490c) {
                m7320f((C2490c) abstractC6440c);
                C2488a.this.f13208f.m7331f(c5725h, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            } else {
                ParserException parserExceptionM6771b = ParserException.m6771b("Loaded playlist has unexpected type.");
                this.f13225j = parserExceptionM6771b;
                C2488a.this.f13208f.m7334i(c5725h, 4, parserExceptionM6771b, true);
            }
            C2488a.this.f13205c.getClass();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x022e  */
        /* JADX WARN: Code duplicated, block: B:103:0x0232  */
        /* JADX WARN: Code duplicated, block: B:104:0x0234  */
        /* JADX WARN: Code duplicated, block: B:105:0x0239  */
        /* JADX WARN: Code duplicated, block: B:108:0x024f  */
        /* JADX WARN: Code duplicated, block: B:112:0x025a  */
        /* JADX WARN: Code duplicated, block: B:114:0x025d  */
        /* JADX WARN: Code duplicated, block: B:116:0x0263  */
        /* JADX WARN: Code duplicated, block: B:118:0x026b  */
        /* JADX WARN: Code duplicated, block: B:121:0x0270  */
        /* JADX WARN: Code duplicated, block: B:123:0x027c  */
        /* JADX WARN: Code duplicated, block: B:125:0x0297  */
        /* JADX WARN: Code duplicated, block: B:127:0x02a3  */
        /* JADX WARN: Code duplicated, block: B:133:0x02c2  */
        /* JADX WARN: Code duplicated, block: B:135:0x02c6  */
        /* JADX WARN: Code duplicated, block: B:136:0x02c9  */
        /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x0054  */
        /* JADX WARN: Code duplicated, block: B:31:0x00af  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:55:0x0104  */
        /* JADX WARN: Code duplicated, block: B:56:0x010a  */
        /* JADX WARN: Code duplicated, block: B:58:0x010e  */
        /* JADX WARN: Code duplicated, block: B:59:0x0111  */
        /* JADX WARN: Code duplicated, block: B:62:0x0115  */
        /* JADX WARN: Code duplicated, block: B:64:0x0121  */
        /* JADX WARN: Code duplicated, block: B:65:0x0128  */
        /* JADX WARN: Code duplicated, block: B:67:0x012b  */
        /* JADX WARN: Code duplicated, block: B:68:0x013c  */
        /* JADX WARN: Code duplicated, block: B:73:0x0193  */
        /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:77:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:82:0x01c0 A[LOOP:0: B:80:0x01ba->B:82:0x01c0, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:87:0x01e1  */
        /* JADX WARN: Code duplicated, block: B:88:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:90:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:91:0x0203  */
        /* JADX WARN: Code duplicated, block: B:94:0x0208  */
        /* JADX WARN: Code duplicated, block: B:97:0x021a A[LOOP:1: B:95:0x0214->B:97:0x021a, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public final void m7320f(C2490c c2490c) {
            boolean z10;
            boolean z11;
            long j10;
            C2490c c2490c2;
            long j11;
            ImmutableList immutableList;
            int size;
            long j12;
            int i10;
            C2490c.c cVar;
            long j13;
            long j14;
            ImmutableList immutableList2;
            C2490c c2490c3;
            int i11;
            boolean z12;
            int i12;
            int i13;
            ImmutableList immutableList3;
            C2490c.c cVar2;
            C2490c c2490c4;
            CopyOnWriteArrayList<HlsPlaylistTracker.InterfaceC2486a> copyOnWriteArrayList;
            Uri uriBuild;
            long size2;
            C2490c c2490c5;
            HlsPlaylistTracker.PlaylistStuckException playlistStuckException;
            boolean z13;
            IOException playlistResetException;
            InterfaceC2528b.c cVar3;
            boolean z14;
            Iterator<HlsPlaylistTracker.InterfaceC2486a> it;
            C2490c c2490c6;
            long j15;
            boolean z15;
            C2490c c2490c7;
            C2490c.e eVar;
            Uri.Builder builderBuildUpon;
            C2490c c2490c8;
            C2490c.e eVar2;
            String str;
            C2490c c2490c9;
            ImmutableList immutableList4;
            int size3;
            long j16;
            Iterator<HlsPlaylistTracker.InterfaceC2486a> it2;
            int size4;
            int size5;
            int size6;
            C2490c c2490c10 = this.f13219d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f13220e = jElapsedRealtime;
            C2488a c2488a = C2488a.this;
            c2488a.getClass();
            if (c2490c10 != null) {
                long j17 = c2490c.f13234k;
                long j18 = c2490c10.f13234k;
                z10 = j17 > j18 || (j17 >= j18 && ((size4 = c2490c.f13241r.size() - c2490c10.f13241r.size()) == 0 ? (size5 = c2490c.f13242s.size()) > (size6 = c2490c10.f13242s.size()) || (size5 == size6 && c2490c.f13238o && !c2490c10.f13238o) : size4 > 0));
                if (z10) {
                    z11 = c2490c.f13239p;
                    j10 = c2490c.f13234k;
                    if (z11) {
                        j14 = c2490c.f13231h;
                    } else {
                        c2490c2 = c2488a.f13214l;
                        if (c2490c2 != null) {
                            j11 = c2490c2.f13231h;
                        } else {
                            j11 = 0;
                        }
                        if (c2490c10 == null) {
                            immutableList = c2490c10.f13241r;
                            size = immutableList.size();
                            j12 = c2490c10.f13234k;
                            i10 = (int) (j10 - j12);
                            if (i10 < immutableList.size()) {
                                cVar = (C2490c.c) immutableList.get(i10);
                            } else {
                                cVar = null;
                            }
                            if (cVar != null) {
                                j13 = cVar.f13257e;
                            } else if (size == j10 - j12) {
                                j13 = c2490c10.f13244u;
                            }
                            j14 = j13 + c2490c10.f13231h;
                        }
                        j14 = j11;
                    }
                    immutableList2 = c2490c.f13241r;
                    if (c2490c.f13232i) {
                        i12 = c2490c.f13233j;
                        z12 = false;
                    } else {
                        c2490c3 = c2488a.f13214l;
                        if (c2490c3 != null) {
                            i11 = c2490c3.f13233j;
                        } else {
                            i11 = 0;
                        }
                        if (c2490c10 == null) {
                            z12 = false;
                        } else {
                            i13 = (int) (j10 - c2490c10.f13234k);
                            immutableList3 = c2490c10.f13241r;
                            if (i13 < immutableList3.size()) {
                                cVar2 = (C2490c.c) immutableList3.get(i13);
                            } else {
                                cVar2 = null;
                            }
                            if (cVar2 != null) {
                                int i14 = c2490c10.f13233j + cVar2.f13256d;
                                z12 = false;
                                i11 = i14 - ((C2490c.c) immutableList2.get(0)).f13256d;
                            } else {
                                z12 = false;
                            }
                        }
                        i12 = i11;
                    }
                    c2490c4 = new C2490c(c2490c.f13227d, c2490c.f36989a, c2490c.f36990b, c2490c.f13228e, c2490c.f13230g, j14, true, i12, c2490c.f13234k, c2490c.f13235l, c2490c.f13236m, c2490c.f13237n, c2490c.f36991c, c2490c.f13238o, c2490c.f13239p, c2490c.f13240q, immutableList2, c2490c.f13242s, c2490c.f13245v, c2490c.f13243t);
                } else {
                    if (c2490c.f13238o || c2490c10.f13238o) {
                        c2490c4 = c2490c10;
                    } else {
                        c2490c4 = new C2490c(c2490c10.f13227d, c2490c10.f36989a, c2490c10.f36990b, c2490c10.f13228e, c2490c10.f13230g, c2490c10.f13231h, c2490c10.f13232i, c2490c10.f13233j, c2490c10.f13234k, c2490c10.f13235l, c2490c10.f13236m, c2490c10.f13237n, c2490c10.f36991c, true, c2490c10.f13239p, c2490c10.f13240q, c2490c10.f13241r, c2490c10.f13242s, c2490c10.f13245v, c2490c10.f13243t);
                    }
                    z12 = false;
                }
                this.f13219d = c2490c4;
                copyOnWriteArrayList = c2488a.f13207e;
                uriBuild = this.f13216a;
                if (c2490c4 != c2490c10) {
                    if (!c2490c4.f13238o) {
                        size2 = c2490c.f13234k + ((long) c2490c.f13241r.size());
                        c2490c5 = this.f13219d;
                        if (size2 < c2490c5.f13234k) {
                            playlistResetException = new HlsPlaylistTracker.PlaylistResetException();
                            z13 = true;
                        } else {
                            if (jElapsedRealtime - this.f13221f > C10134c0.m19033R(c2490c5.f13236m) * 3.5d) {
                                playlistStuckException = new HlsPlaylistTracker.PlaylistStuckException();
                            } else {
                                playlistStuckException = null;
                            }
                            z13 = z12;
                            playlistResetException = playlistStuckException;
                        }
                        if (playlistResetException != null) {
                            this.f13225j = playlistResetException;
                            z14 = true;
                            cVar3 = new InterfaceC2528b.c(playlistResetException, 1);
                            it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                it.next().mo7312b(uriBuild, cVar3, z13);
                            }
                        }
                    }
                    c2490c6 = this.f13219d;
                    if (c2490c6.f13245v.f13268e) {
                        j15 = 0;
                    } else {
                        j16 = c2490c6.f13236m;
                        if (c2490c6 != c2490c10) {
                            j15 = j16;
                        } else {
                            j15 = j16 / 2;
                        }
                    }
                    this.f13222g = C10134c0.m19033R(j15) + jElapsedRealtime;
                    if (this.f13219d.f13237n == -9223372036854775807L || uriBuild.equals(c2488a.f13213k)) {
                        z15 = z14;
                    } else {
                        z15 = z12;
                    }
                    if (z15) {
                        c2490c7 = this.f13219d;
                        if (c2490c7.f13238o) {
                        }
                        eVar = c2490c7.f13245v;
                        if (eVar.f13264a == -9223372036854775807L || eVar.f13268e) {
                            builderBuildUpon = uriBuild.buildUpon();
                            c2490c8 = this.f13219d;
                            if (c2490c8.f13245v.f13268e) {
                                builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2490c8.f13234k + ((long) c2490c8.f13241r.size())));
                                c2490c9 = this.f13219d;
                                if (c2490c9.f13237n != -9223372036854775807L) {
                                    immutableList4 = c2490c9.f13242s;
                                    size3 = immutableList4.size();
                                    if (!immutableList4.isEmpty() && ((C2490c.a) C5206f.m11002X0(immutableList4)).f13246H) {
                                        size3--;
                                    }
                                    builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                                }
                            }
                            eVar2 = this.f13219d.f13245v;
                            if (eVar2.f13264a != -9223372036854775807L) {
                                if (eVar2.f13265b) {
                                    str = "v2";
                                } else {
                                    str = "YES";
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                            }
                            uriBuild = builderBuildUpon.build();
                        }
                        m7319d(uriBuild);
                    }
                }
                this.f13225j = null;
                this.f13221f = jElapsedRealtime;
                if (uriBuild.equals(c2488a.f13213k)) {
                    if (c2488a.f13214l == null) {
                        c2488a.f13201H = !c2490c4.f13238o;
                        c2488a.f13202I = c2490c4.f13231h;
                    }
                    c2488a.f13214l = c2490c4;
                    c2488a.f13211i.onPrimaryPlaylistRefreshed(c2490c4);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().mo7311a();
                }
                z14 = true;
                c2490c6 = this.f13219d;
                if (c2490c6.f13245v.f13268e) {
                    j16 = c2490c6.f13236m;
                    if (c2490c6 != c2490c10) {
                        j15 = j16;
                    } else {
                        j15 = j16 / 2;
                    }
                } else {
                    j15 = 0;
                }
                this.f13222g = C10134c0.m19033R(j15) + jElapsedRealtime;
                if (this.f13219d.f13237n == -9223372036854775807L) {
                    z15 = z14;
                } else {
                    z15 = z14;
                }
                if (z15) {
                    c2490c7 = this.f13219d;
                    if (c2490c7.f13238o) {
                        eVar = c2490c7.f13245v;
                        if (eVar.f13264a == -9223372036854775807L) {
                            builderBuildUpon = uriBuild.buildUpon();
                            c2490c8 = this.f13219d;
                            if (c2490c8.f13245v.f13268e) {
                                builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2490c8.f13234k + ((long) c2490c8.f13241r.size())));
                                c2490c9 = this.f13219d;
                                if (c2490c9.f13237n != -9223372036854775807L) {
                                    immutableList4 = c2490c9.f13242s;
                                    size3 = immutableList4.size();
                                    if (!immutableList4.isEmpty()) {
                                        size3--;
                                    }
                                    builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                                }
                            }
                            eVar2 = this.f13219d.f13245v;
                            if (eVar2.f13264a != -9223372036854775807L) {
                                if (eVar2.f13265b) {
                                    str = "v2";
                                } else {
                                    str = "YES";
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                            }
                            uriBuild = builderBuildUpon.build();
                        } else {
                            builderBuildUpon = uriBuild.buildUpon();
                            c2490c8 = this.f13219d;
                            if (c2490c8.f13245v.f13268e) {
                                builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2490c8.f13234k + ((long) c2490c8.f13241r.size())));
                                c2490c9 = this.f13219d;
                                if (c2490c9.f13237n != -9223372036854775807L) {
                                    immutableList4 = c2490c9.f13242s;
                                    size3 = immutableList4.size();
                                    if (!immutableList4.isEmpty()) {
                                        size3--;
                                    }
                                    builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                                }
                            }
                            eVar2 = this.f13219d.f13245v;
                            if (eVar2.f13264a != -9223372036854775807L) {
                                if (eVar2.f13265b) {
                                    str = "v2";
                                } else {
                                    str = "YES";
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                            }
                            uriBuild = builderBuildUpon.build();
                        }
                        m7319d(uriBuild);
                    }
                }
            }
            c2490c.getClass();
            if (z10) {
                if (c2490c.f13238o) {
                    c2490c4 = c2490c10;
                } else {
                    c2490c4 = c2490c10;
                }
                z12 = false;
            } else {
                z11 = c2490c.f13239p;
                j10 = c2490c.f13234k;
                if (z11) {
                    j14 = c2490c.f13231h;
                } else {
                    c2490c2 = c2488a.f13214l;
                    if (c2490c2 != null) {
                        j11 = c2490c2.f13231h;
                    } else {
                        j11 = 0;
                    }
                    if (c2490c10 == null) {
                        immutableList = c2490c10.f13241r;
                        size = immutableList.size();
                        j12 = c2490c10.f13234k;
                        i10 = (int) (j10 - j12);
                        if (i10 < immutableList.size()) {
                            cVar = (C2490c.c) immutableList.get(i10);
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            j13 = cVar.f13257e;
                        } else if (size == j10 - j12) {
                            j13 = c2490c10.f13244u;
                        }
                        j14 = j13 + c2490c10.f13231h;
                    }
                    j14 = j11;
                }
                immutableList2 = c2490c.f13241r;
                if (c2490c.f13232i) {
                    i12 = c2490c.f13233j;
                    z12 = false;
                } else {
                    c2490c3 = c2488a.f13214l;
                    if (c2490c3 != null) {
                        i11 = c2490c3.f13233j;
                    } else {
                        i11 = 0;
                    }
                    if (c2490c10 == null) {
                        z12 = false;
                    } else {
                        i13 = (int) (j10 - c2490c10.f13234k);
                        immutableList3 = c2490c10.f13241r;
                        if (i13 < immutableList3.size()) {
                            cVar2 = (C2490c.c) immutableList3.get(i13);
                        } else {
                            cVar2 = null;
                        }
                        if (cVar2 != null) {
                            int i15 = c2490c10.f13233j + cVar2.f13256d;
                            z12 = false;
                            i11 = i15 - ((C2490c.c) immutableList2.get(0)).f13256d;
                        } else {
                            z12 = false;
                        }
                    }
                    i12 = i11;
                }
                c2490c4 = new C2490c(c2490c.f13227d, c2490c.f36989a, c2490c.f36990b, c2490c.f13228e, c2490c.f13230g, j14, true, i12, c2490c.f13234k, c2490c.f13235l, c2490c.f13236m, c2490c.f13237n, c2490c.f36991c, c2490c.f13238o, c2490c.f13239p, c2490c.f13240q, immutableList2, c2490c.f13242s, c2490c.f13245v, c2490c.f13243t);
            }
            this.f13219d = c2490c4;
            copyOnWriteArrayList = c2488a.f13207e;
            uriBuild = this.f13216a;
            if (c2490c4 != c2490c10) {
                if (!c2490c4.f13238o) {
                    size2 = c2490c.f13234k + ((long) c2490c.f13241r.size());
                    c2490c5 = this.f13219d;
                    if (size2 < c2490c5.f13234k) {
                        playlistResetException = new HlsPlaylistTracker.PlaylistResetException();
                        z13 = true;
                    } else {
                        if (jElapsedRealtime - this.f13221f > C10134c0.m19033R(c2490c5.f13236m) * 3.5d) {
                            playlistStuckException = new HlsPlaylistTracker.PlaylistStuckException();
                        } else {
                            playlistStuckException = null;
                        }
                        z13 = z12;
                        playlistResetException = playlistStuckException;
                    }
                    if (playlistResetException != null) {
                        this.f13225j = playlistResetException;
                        z14 = true;
                        cVar3 = new InterfaceC2528b.c(playlistResetException, 1);
                        it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            it.next().mo7312b(uriBuild, cVar3, z13);
                        }
                    }
                }
                c2490c6 = this.f13219d;
                if (c2490c6.f13245v.f13268e) {
                    j16 = c2490c6.f13236m;
                    if (c2490c6 != c2490c10) {
                        j15 = j16;
                    } else {
                        j15 = j16 / 2;
                    }
                } else {
                    j15 = 0;
                }
                this.f13222g = C10134c0.m19033R(j15) + jElapsedRealtime;
                if (this.f13219d.f13237n == -9223372036854775807L) {
                    z15 = z14;
                } else {
                    z15 = z14;
                }
                if (z15) {
                    c2490c7 = this.f13219d;
                    if (c2490c7.f13238o) {
                        eVar = c2490c7.f13245v;
                        if (eVar.f13264a == -9223372036854775807L) {
                            builderBuildUpon = uriBuild.buildUpon();
                            c2490c8 = this.f13219d;
                            if (c2490c8.f13245v.f13268e) {
                                builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2490c8.f13234k + ((long) c2490c8.f13241r.size())));
                                c2490c9 = this.f13219d;
                                if (c2490c9.f13237n != -9223372036854775807L) {
                                    immutableList4 = c2490c9.f13242s;
                                    size3 = immutableList4.size();
                                    if (!immutableList4.isEmpty()) {
                                        size3--;
                                    }
                                    builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                                }
                            }
                            eVar2 = this.f13219d.f13245v;
                            if (eVar2.f13264a != -9223372036854775807L) {
                                if (eVar2.f13265b) {
                                    str = "v2";
                                } else {
                                    str = "YES";
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                            }
                            uriBuild = builderBuildUpon.build();
                        } else {
                            builderBuildUpon = uriBuild.buildUpon();
                            c2490c8 = this.f13219d;
                            if (c2490c8.f13245v.f13268e) {
                                builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2490c8.f13234k + ((long) c2490c8.f13241r.size())));
                                c2490c9 = this.f13219d;
                                if (c2490c9.f13237n != -9223372036854775807L) {
                                    immutableList4 = c2490c9.f13242s;
                                    size3 = immutableList4.size();
                                    if (!immutableList4.isEmpty()) {
                                        size3--;
                                    }
                                    builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                                }
                            }
                            eVar2 = this.f13219d.f13245v;
                            if (eVar2.f13264a != -9223372036854775807L) {
                                if (eVar2.f13265b) {
                                    str = "v2";
                                } else {
                                    str = "YES";
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                            }
                            uriBuild = builderBuildUpon.build();
                        }
                        m7319d(uriBuild);
                    }
                }
            }
            this.f13225j = null;
            this.f13221f = jElapsedRealtime;
            if (uriBuild.equals(c2488a.f13213k)) {
                if (c2488a.f13214l == null) {
                    c2488a.f13201H = !c2490c4.f13238o;
                    c2488a.f13202I = c2490c4.f13231h;
                }
                c2488a.f13214l = c2490c4;
                c2488a.f13211i.onPrimaryPlaylistRefreshed(c2490c4);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().mo7311a();
            }
            z14 = true;
            c2490c6 = this.f13219d;
            if (c2490c6.f13245v.f13268e) {
                j16 = c2490c6.f13236m;
                if (c2490c6 != c2490c10) {
                    j15 = j16;
                } else {
                    j15 = j16 / 2;
                }
            } else {
                j15 = 0;
            }
            this.f13222g = C10134c0.m19033R(j15) + jElapsedRealtime;
            if (this.f13219d.f13237n == -9223372036854775807L) {
                z15 = z14;
            } else {
                z15 = z14;
            }
            if (z15) {
                c2490c7 = this.f13219d;
                if (c2490c7.f13238o) {
                    eVar = c2490c7.f13245v;
                    if (eVar.f13264a == -9223372036854775807L) {
                        builderBuildUpon = uriBuild.buildUpon();
                        c2490c8 = this.f13219d;
                        if (c2490c8.f13245v.f13268e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2490c8.f13234k + ((long) c2490c8.f13241r.size())));
                            c2490c9 = this.f13219d;
                            if (c2490c9.f13237n != -9223372036854775807L) {
                                immutableList4 = c2490c9.f13242s;
                                size3 = immutableList4.size();
                                if (!immutableList4.isEmpty()) {
                                    size3--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                            }
                        }
                        eVar2 = this.f13219d.f13245v;
                        if (eVar2.f13264a != -9223372036854775807L) {
                            if (eVar2.f13265b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    } else {
                        builderBuildUpon = uriBuild.buildUpon();
                        c2490c8 = this.f13219d;
                        if (c2490c8.f13245v.f13268e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c2490c8.f13234k + ((long) c2490c8.f13241r.size())));
                            c2490c9 = this.f13219d;
                            if (c2490c9.f13237n != -9223372036854775807L) {
                                immutableList4 = c2490c9.f13242s;
                                size3 = immutableList4.size();
                                if (!immutableList4.isEmpty()) {
                                    size3--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                            }
                        }
                        eVar2 = this.f13219d.f13245v;
                        if (eVar2.f13264a != -9223372036854775807L) {
                            if (eVar2.f13265b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    }
                    m7319d(uriBuild);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0052  */
        /* JADX WARN: Code duplicated, block: B:22:0x0067 A[LOOP:0: B:20:0x0061->B:22:0x0067, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:25:0x007c  */
        /* JADX WARN: Code duplicated, block: B:27:0x008a  */
        /* JADX WARN: Code duplicated, block: B:28:0x0093  */
        /* JADX WARN: Code duplicated, block: B:29:0x0096 A[PHI: r1
          0x0096: PHI (r1v3 com.google.android.exoplayer2.upstream.Loader$b) = (r1v0 com.google.android.exoplayer2.upstream.Loader$b), (r1v5 com.google.android.exoplayer2.upstream.Loader$b) binds: [B:24:0x007a, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:34:0x009e  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
        /* JADX INFO: renamed from: p */
        public final Loader.C2522b mo7316p(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, IOException iOException, int i10) {
            InterfaceC2528b.c cVar;
            Iterator<HlsPlaylistTracker.InterfaceC2486a> it;
            boolean z10;
            InterfaceC2528b interfaceC2528b;
            int i11;
            boolean z11;
            long jMo7472a;
            C2529c c2529c = (C2529c) interfaceC2524d;
            long j12 = c2529c.f13735a;
            C9893r c9893r = c2529c.f13738d;
            Uri uri = c9893r.f50527c;
            C5725h c5725h = new C5725h(c9893r.f50528d);
            boolean z12 = false;
            boolean z13 = uri.getQueryParameter("_HLS_msn") != null;
            boolean z14 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            Loader.C2522b c2522b = Loader.f13695e;
            Uri uri2 = this.f13216a;
            C2488a c2488a = C2488a.this;
            int i12 = c2529c.f13737c;
            if (z13 || z14) {
                int i13 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).f13692d : Integer.MAX_VALUE;
                if (!z14 && i13 != 400) {
                    if (i13 != 503) {
                        cVar = new InterfaceC2528b.c(iOException, i10);
                        it = c2488a.f13207e.iterator();
                        z10 = false;
                        while (it.hasNext()) {
                            z10 |= !it.next().mo7312b(uri2, cVar, false);
                        }
                        interfaceC2528b = c2488a.f13205c;
                        if (z10) {
                            jMo7472a = interfaceC2528b.mo7472a(cVar);
                            if (jMo7472a != -9223372036854775807L) {
                                c2522b = new Loader.C2522b(0, jMo7472a);
                            } else {
                                c2522b = Loader.f13696f;
                            }
                        }
                        i11 = c2522b.f13700a;
                        if (i11 != 0 || i11 == 1) {
                            z12 = true;
                        }
                        z11 = true ^ z12;
                        c2488a.f13208f.m7334i(c5725h, i12, iOException, z11);
                        if (z11) {
                            interfaceC2528b.getClass();
                        }
                    }
                }
                this.f13222g = SystemClock.elapsedRealtime();
                m7319d(uri2);
                InterfaceC2493j.a aVar = c2488a.f13208f;
                int i14 = C10134c0.f51354a;
                aVar.m7334i(c5725h, i12, iOException, true);
            } else {
                cVar = new InterfaceC2528b.c(iOException, i10);
                it = c2488a.f13207e.iterator();
                z10 = false;
                while (it.hasNext()) {
                    z10 |= !it.next().mo7312b(uri2, cVar, false);
                }
                interfaceC2528b = c2488a.f13205c;
                if (z10) {
                    jMo7472a = interfaceC2528b.mo7472a(cVar);
                    if (jMo7472a != -9223372036854775807L) {
                        c2522b = new Loader.C2522b(0, jMo7472a);
                    } else {
                        c2522b = Loader.f13696f;
                    }
                }
                i11 = c2522b.f13700a;
                if (i11 != 0) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                z11 = true ^ z12;
                c2488a.f13208f.m7334i(c5725h, i12, iOException, z11);
                if (z11) {
                    interfaceC2528b.getClass();
                }
            }
            return c2522b;
        }
    }

    public C2488a(InterfaceC6242f interfaceC6242f, InterfaceC2528b interfaceC2528b, InterfaceC6441d interfaceC6441d) {
        this.f13203a = interfaceC6242f;
        this.f13204b = interfaceC6441d;
        this.f13205c = interfaceC2528b;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: a */
    public final boolean mo7299a(Uri uri) {
        int i10;
        b bVar = this.f13206d.get(uri);
        if (bVar.f13219d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, C10134c0.m19033R(bVar.f13219d.f13244u));
        C2490c c2490c = bVar.f13219d;
        return c2490c.f13238o || (i10 = c2490c.f13227d) == 2 || i10 == 1 || bVar.f13220e + jMax > jElapsedRealtime;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: b */
    public final void mo7313b(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, boolean z10) {
        C2529c c2529c = (C2529c) interfaceC2524d;
        long j12 = c2529c.f13735a;
        C9893r c9893r = c2529c.f13738d;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        this.f13205c.getClass();
        this.f13208f.m7329d(c5725h, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: c */
    public final void mo7300c(HlsPlaylistTracker.InterfaceC2486a interfaceC2486a) {
        this.f13207e.remove(interfaceC2486a);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: d */
    public final void mo7301d(Uri uri) throws IOException {
        IOException iOException;
        b bVar = this.f13206d.get(uri);
        Loader loader = bVar.f13217b;
        IOException iOException2 = loader.f13699c;
        if (iOException2 != null) {
            throw iOException2;
        }
        Loader.HandlerC2523c<? extends Loader.InterfaceC2524d> handlerC2523c = loader.f13698b;
        if (handlerC2523c != null && (iOException = handlerC2523c.f13706e) != null && handlerC2523c.f13707f > handlerC2523c.f13702a) {
            throw iOException;
        }
        IOException iOException3 = bVar.f13225j;
        if (iOException3 != null) {
            throw iOException3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: e */
    public final void mo7314e(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11) {
        C2491d c2491d;
        C2529c c2529c = (C2529c) interfaceC2524d;
        AbstractC6440c abstractC6440c = (AbstractC6440c) c2529c.f13740f;
        boolean z10 = abstractC6440c instanceof C2490c;
        if (z10) {
            String str = abstractC6440c.f36989a;
            C2491d c2491d2 = C2491d.f13269n;
            Uri uri = Uri.parse(str);
            C2416m.a aVar = new C2416m.a();
            aVar.f12491a = "0";
            aVar.f12500j = "application/x-mpegURL";
            c2491d = new C2491d("", Collections.emptyList(), Collections.singletonList(new C2491d.b(uri, new C2416m(aVar), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            c2491d = (C2491d) abstractC6440c;
        }
        this.f13212j = c2491d;
        this.f13213k = c2491d.f13271e.get(0).f13283a;
        this.f13207e.add(new a());
        List<Uri> list = c2491d.f13270d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri2 = list.get(i10);
            this.f13206d.put(uri2, new b(uri2));
        }
        C9893r c9893r = c2529c.f13738d;
        Uri uri3 = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        b bVar = this.f13206d.get(this.f13213k);
        if (z10) {
            bVar.m7320f((C2490c) abstractC6440c);
        } else {
            bVar.m7319d(bVar.f13216a);
        }
        this.f13205c.getClass();
        this.f13208f.m7331f(c5725h, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: f */
    public final long mo7302f() {
        return this.f13202I;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: g */
    public final boolean mo7303g() {
        return this.f13201H;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: h */
    public final C2491d mo7304h() {
        return this.f13212j;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: i */
    public final boolean mo7305i(Uri uri, long j10) {
        b bVar = this.f13206d.get(uri);
        if (bVar != null) {
            return !b.m7317a(bVar, j10);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: j */
    public final void mo7306j(Uri uri, InterfaceC2493j.a aVar, HlsPlaylistTracker.InterfaceC2487b interfaceC2487b) {
        this.f13210h = C10134c0.m19044k(null);
        this.f13208f = aVar;
        this.f13211i = interfaceC2487b;
        C2529c c2529c = new C2529c(this.f13203a.mo12837a(), uri, this.f13204b.mo13067b());
        C10129a.m18992d(this.f13209g == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f13209g = loader;
        int i10 = c2529c.f13737c;
        aVar.m7336k(new C5725h(c2529c.f13735a, c2529c.f13736b, loader.m7469d(c2529c, this, this.f13205c.mo7474c(i10))), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: k */
    public final void mo7307k() throws IOException {
        IOException iOException;
        Loader loader = this.f13209g;
        if (loader != null) {
            IOException iOException2 = loader.f13699c;
            if (iOException2 != null) {
                throw iOException2;
            }
            Loader.HandlerC2523c<? extends Loader.InterfaceC2524d> handlerC2523c = loader.f13698b;
            if (handlerC2523c != null && (iOException = handlerC2523c.f13706e) != null && handlerC2523c.f13707f > handlerC2523c.f13702a) {
                throw iOException;
            }
        }
        Uri uri = this.f13213k;
        if (uri != null) {
            mo7301d(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: l */
    public final void mo7308l(Uri uri) {
        b bVar = this.f13206d.get(uri);
        bVar.m7319d(bVar.f13216a);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: m */
    public final void mo7309m(HlsPlaylistTracker.InterfaceC2486a interfaceC2486a) {
        interfaceC2486a.getClass();
        this.f13207e.add(interfaceC2486a);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* JADX INFO: renamed from: n */
    public final C2490c mo7310n(boolean z10, Uri uri) {
        C2490c c2490c;
        HashMap<Uri, b> map = this.f13206d;
        C2490c c2490c2 = map.get(uri).f13219d;
        if (c2490c2 != null && z10 && !uri.equals(this.f13213k)) {
            List<C2491d.b> list = this.f13212j.f13271e;
            boolean z11 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(list.get(i10).f13283a)) {
                    z11 = true;
                    break;
                }
            }
            if (z11 && ((c2490c = this.f13214l) == null || !c2490c.f13238o)) {
                this.f13213k = uri;
                b bVar = map.get(uri);
                C2490c c2490c3 = bVar.f13219d;
                if (c2490c3 == null || !c2490c3.f13238o) {
                    bVar.m7319d(m7315o(uri));
                } else {
                    this.f13214l = c2490c3;
                    this.f13211i.onPrimaryPlaylistRefreshed(c2490c3);
                }
            }
        }
        return c2490c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final Uri m7315o(Uri uri) {
        C2490c.b bVar;
        C2490c c2490c = this.f13214l;
        if (c2490c == null || !c2490c.f13245v.f13268e || (bVar = (C2490c.b) c2490c.f13243t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bVar.f13249b));
        int i10 = bVar.f13250c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2521a
    /* JADX INFO: renamed from: p */
    public final Loader.C2522b mo7316p(Loader.InterfaceC2524d interfaceC2524d, long j10, long j11, IOException iOException, int i10) {
        C2529c c2529c = (C2529c) interfaceC2524d;
        long j12 = c2529c.f13735a;
        C9893r c9893r = c2529c.f13738d;
        Uri uri = c9893r.f50527c;
        C5725h c5725h = new C5725h(c9893r.f50528d);
        long jMo7472a = this.f13205c.mo7472a(new InterfaceC2528b.c(iOException, i10));
        boolean z10 = jMo7472a == -9223372036854775807L;
        this.f13208f.m7334i(c5725h, c2529c.f13737c, iOException, z10);
        return z10 ? Loader.f13696f : new Loader.C2522b(0, jMo7472a);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public final void stop() {
        this.f13213k = null;
        this.f13214l = null;
        this.f13212j = null;
        this.f13202I = -9223372036854775807L;
        this.f13209g.m7468c(null);
        this.f13209g = null;
        HashMap<Uri, b> map = this.f13206d;
        Iterator<b> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().f13217b.m7468c(null);
        }
        this.f13210h.removeCallbacksAndMessages(null);
        this.f13210h = null;
        map.clear();
    }
}
