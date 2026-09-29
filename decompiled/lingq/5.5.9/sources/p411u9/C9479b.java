package p411u9;

import android.util.Pair;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.kochava.tracker.BuildConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p195j9.C6424a;
import p195j9.C6425b;
import p261m9.C7510k;
import p261m9.C7516q;
import p338qd.C8573r0;
import p357r6.C8739a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;
import p479xa.C10151t;
import p482xd.InterfaceC10171c;
import p505ya.C10319a;
import p505ya.C10320b;
import p505ya.C10321c;
import p505ya.C10323e;

/* JADX INFO: renamed from: u9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9479b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f48608a = C10134c0.m19018C("OpusHead");

    /* JADX INFO: renamed from: u9.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f48609a;

        /* JADX INFO: renamed from: b */
        public int f48610b;

        /* JADX INFO: renamed from: c */
        public int f48611c;

        /* JADX INFO: renamed from: d */
        public long f48612d;

        /* JADX INFO: renamed from: e */
        public final boolean f48613e;

        /* JADX INFO: renamed from: f */
        public final C10151t f48614f;

        /* JADX INFO: renamed from: g */
        public final C10151t f48615g;

        /* JADX INFO: renamed from: h */
        public int f48616h;

        /* JADX INFO: renamed from: i */
        public int f48617i;

        public a(C10151t c10151t, C10151t c10151t2, boolean z10) throws ParserException {
            this.f48615g = c10151t;
            this.f48614f = c10151t2;
            this.f48613e = z10;
            c10151t2.m19124E(12);
            this.f48609a = c10151t2.m19148w();
            c10151t.m19124E(12);
            this.f48617i = c10151t.m19148w();
            C7510k.m15010a("first_chunk must be 1", c10151t.m19129d() == 1);
            this.f48610b = -1;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m17909a() {
            int i10 = this.f48610b + 1;
            this.f48610b = i10;
            if (i10 == this.f48609a) {
                return false;
            }
            boolean z10 = this.f48613e;
            C10151t c10151t = this.f48614f;
            this.f48612d = z10 ? c10151t.m19149x() : c10151t.m19146u();
            if (this.f48610b == this.f48616h) {
                C10151t c10151t2 = this.f48615g;
                this.f48611c = c10151t2.m19148w();
                c10151t2.m19125F(4);
                int i11 = this.f48617i - 1;
                this.f48617i = i11;
                this.f48616h = i11 > 0 ? c10151t2.m19148w() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: u9.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f48618a;

        /* JADX INFO: renamed from: b */
        public final byte[] f48619b;

        /* JADX INFO: renamed from: c */
        public final long f48620c;

        /* JADX INFO: renamed from: d */
        public final long f48621d;

        public b(String str, byte[] bArr, long j10, long j11) {
            this.f48618a = str;
            this.f48619b = bArr;
            this.f48620c = j10;
            this.f48621d = j11;
        }
    }

    /* JADX INFO: renamed from: u9.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        int mo17910a();

        /* JADX INFO: renamed from: b */
        int mo17911b();

        /* JADX INFO: renamed from: c */
        int mo17912c();
    }

    /* JADX INFO: renamed from: u9.b$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final C9489l[] f48622a;

        /* JADX INFO: renamed from: b */
        public C2416m f48623b;

        /* JADX INFO: renamed from: c */
        public int f48624c;

        /* JADX INFO: renamed from: d */
        public int f48625d = 0;

        public d(int i10) {
            this.f48622a = new C9489l[i10];
        }
    }

    /* JADX INFO: renamed from: u9.b$e */
    public static final class e implements c {

        /* JADX INFO: renamed from: a */
        public final int f48626a;

        /* JADX INFO: renamed from: b */
        public final int f48627b;

        /* JADX INFO: renamed from: c */
        public final C10151t f48628c;

        public e(AbstractC9478a.b bVar, C2416m c2416m) {
            C10151t c10151t = bVar.f48607b;
            this.f48628c = c10151t;
            c10151t.m19124E(12);
            int iM19148w = c10151t.m19148w();
            if ("audio/raw".equals(c2416m.f12484l)) {
                int iM19055v = C10134c0.m19055v(c2416m.f12465V, c2416m.f12463T);
                if (iM19148w == 0 || iM19148w % iM19055v != 0) {
                    C10145n.m19099g("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iM19055v + ", stsz sample size: " + iM19148w);
                    iM19148w = iM19055v;
                }
            }
            this.f48626a = iM19148w == 0 ? -1 : iM19148w;
            this.f48627b = c10151t.m19148w();
        }

        @Override // p411u9.C9479b.c
        /* JADX INFO: renamed from: a */
        public final int mo17910a() {
            return this.f48626a;
        }

        @Override // p411u9.C9479b.c
        /* JADX INFO: renamed from: b */
        public final int mo17911b() {
            return this.f48627b;
        }

        @Override // p411u9.C9479b.c
        /* JADX INFO: renamed from: c */
        public final int mo17912c() {
            int iM19148w = this.f48626a;
            if (iM19148w == -1) {
                iM19148w = this.f48628c.m19148w();
            }
            return iM19148w;
        }
    }

    /* JADX INFO: renamed from: u9.b$f */
    public static final class f implements c {

        /* JADX INFO: renamed from: a */
        public final C10151t f48629a;

        /* JADX INFO: renamed from: b */
        public final int f48630b;

        /* JADX INFO: renamed from: c */
        public final int f48631c;

        /* JADX INFO: renamed from: d */
        public int f48632d;

        /* JADX INFO: renamed from: e */
        public int f48633e;

        public f(AbstractC9478a.b bVar) {
            C10151t c10151t = bVar.f48607b;
            this.f48629a = c10151t;
            c10151t.m19124E(12);
            this.f48631c = c10151t.m19148w() & 255;
            this.f48630b = c10151t.m19148w();
        }

        @Override // p411u9.C9479b.c
        /* JADX INFO: renamed from: a */
        public final int mo17910a() {
            return -1;
        }

        @Override // p411u9.C9479b.c
        /* JADX INFO: renamed from: b */
        public final int mo17911b() {
            return this.f48630b;
        }

        @Override // p411u9.C9479b.c
        /* JADX INFO: renamed from: c */
        public final int mo17912c() {
            C10151t c10151t = this.f48629a;
            int i10 = this.f48631c;
            if (i10 == 8) {
                return c10151t.m19145t();
            }
            if (i10 == 16) {
                return c10151t.m19150y();
            }
            int i11 = this.f48632d;
            this.f48632d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f48633e & 15;
            }
            int iM19145t = c10151t.m19145t();
            this.f48633e = iM19145t;
            return (iM19145t & 240) >> 4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m17904a(int i10, C10151t c10151t) {
        c10151t.m19124E(i10 + 8 + 4);
        c10151t.m19125F(1);
        m17905b(c10151t);
        c10151t.m19125F(2);
        int iM19145t = c10151t.m19145t();
        if ((iM19145t & BuildConfig.SDK_TRUNCATE_LENGTH) != 0) {
            c10151t.m19125F(2);
        }
        if ((iM19145t & 64) != 0) {
            c10151t.m19125F(c10151t.m19145t());
        }
        if ((iM19145t & 32) != 0) {
            c10151t.m19125F(2);
        }
        c10151t.m19125F(1);
        m17905b(c10151t);
        String strM19105e = C10147p.m19105e(c10151t.m19145t());
        if ("audio/mpeg".equals(strM19105e) || "audio/vnd.dts".equals(strM19105e) || "audio/vnd.dts.hd".equals(strM19105e)) {
            return new b(strM19105e, null, -1L, -1L);
        }
        c10151t.m19125F(4);
        long jM19146u = c10151t.m19146u();
        long jM19146u2 = c10151t.m19146u();
        c10151t.m19125F(1);
        int iM17905b = m17905b(c10151t);
        byte[] bArr = new byte[iM17905b];
        c10151t.m19127b(bArr, 0, iM17905b);
        return new b(strM19105e, bArr, jM19146u2 > 0 ? jM19146u2 : -1L, jM19146u > 0 ? jM19146u : -1L);
    }

    /* JADX INFO: renamed from: b */
    public static int m17905b(C10151t c10151t) {
        int iM19145t = c10151t.m19145t();
        int i10 = iM19145t & 127;
        while ((iM19145t & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            iM19145t = c10151t.m19145t();
            i10 = (i10 << 7) | (iM19145t & 127);
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static Pair m17906c(int i10, int i11, C10151t c10151t) throws ParserException {
        C9489l c9489l;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = c10151t.f51439b;
        while (i14 - i10 < i11) {
            c10151t.m19124E(i14);
            int iM19129d = c10151t.m19129d();
            C7510k.m15010a("childAtomSize must be positive", iM19129d > 0);
            if (c10151t.m19129d() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String strM19142q = null;
                Integer numValueOf = null;
                while (i15 - i14 < iM19129d) {
                    c10151t.m19124E(i15);
                    int iM19129d2 = c10151t.m19129d();
                    int iM19129d3 = c10151t.m19129d();
                    if (iM19129d3 == 1718775137) {
                        numValueOf = Integer.valueOf(c10151t.m19129d());
                    } else if (iM19129d3 == 1935894637) {
                        c10151t.m19125F(4);
                        strM19142q = c10151t.m19142q(4);
                    } else if (iM19129d3 == 1935894633) {
                        i17 = i15;
                        i16 = iM19129d2;
                    }
                    i15 += iM19129d2;
                }
                if ("cenc".equals(strM19142q) || "cbc1".equals(strM19142q) || "cens".equals(strM19142q) || "cbcs".equals(strM19142q)) {
                    C7510k.m15010a("frma atom is mandatory", numValueOf != null);
                    C7510k.m15010a("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            c9489l = null;
                            break;
                        }
                        c10151t.m19124E(i18);
                        int iM19129d4 = c10151t.m19129d();
                        if (c10151t.m19129d() == 1952804451) {
                            int iM19129d5 = (c10151t.m19129d() >> 24) & 255;
                            c10151t.m19125F(1);
                            if (iM19129d5 == 0) {
                                c10151t.m19125F(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iM19145t = c10151t.m19145t();
                                int i19 = (iM19145t & 240) >> 4;
                                i12 = iM19145t & 15;
                                i13 = i19;
                            }
                            boolean z10 = c10151t.m19145t() == 1;
                            int iM19145t2 = c10151t.m19145t();
                            byte[] bArr2 = new byte[16];
                            c10151t.m19127b(bArr2, 0, 16);
                            if (z10 && iM19145t2 == 0) {
                                int iM19145t3 = c10151t.m19145t();
                                byte[] bArr3 = new byte[iM19145t3];
                                c10151t.m19127b(bArr3, 0, iM19145t3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            c9489l = new C9489l(z10, strM19142q, iM19145t2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i18 += iM19129d4;
                    }
                    C7510k.m15010a("tenc atom is mandatory", c9489l != null);
                    int i20 = C10134c0.f51354a;
                    pairCreate = Pair.create(numValueOf, c9489l);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iM19129d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x0380  */
    /* JADX WARN: Code duplicated, block: B:232:0x038b  */
    /* JADX WARN: Code duplicated, block: B:233:0x038e  */
    /* JADX WARN: Code duplicated, block: B:236:0x039e  */
    /* JADX WARN: Code duplicated, block: B:237:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:266:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:302:0x0655  */
    /* JADX WARN: Code duplicated, block: B:303:0x065d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0661  */
    /* JADX WARN: Code duplicated, block: B:306:0x0664  */
    /* JADX WARN: Code duplicated, block: B:310:0x0671  */
    /* JADX WARN: Code duplicated, block: B:312:0x067e  */
    /* JADX WARN: Code duplicated, block: B:313:0x0680  */
    /* JADX WARN: Code duplicated, block: B:317:0x068e A[LOOP:2: B:308:0x066b->B:317:0x068e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:321:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:323:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:325:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:326:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:328:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:330:0x06da  */
    /* JADX WARN: Code duplicated, block: B:337:0x0718  */
    /* JADX WARN: Code duplicated, block: B:518:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:547:0x0b9a  */
    /* JADX WARN: Code duplicated, block: B:563:0x069b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x06a1 A[EDGE_INSN: B:564:0x06a1->B:319:0x06a1 BREAK  A[LOOP:2: B:308:0x066b->B:317:0x068e], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static d m17907d(C10151t c10151t, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws ParserException {
        int i12;
        int i13;
        int i14;
        DrmInitData drmInitDataM6956a;
        String str2;
        int i15;
        byte[] bArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        d dVar;
        float fM19148w;
        int i21;
        int i22;
        int i23;
        byte[] bArrCopyOfRange;
        List<byte[]> listM9064b0;
        List<byte[]> list;
        String str3;
        List<byte[]> list2;
        String str4;
        int iM19150y;
        int iM19150y2;
        int iM19129d;
        int iRound;
        int i24;
        int i25;
        DrmInitData drmInitDataM6956a2;
        String str5;
        int i26;
        String str6;
        int i27;
        int i28;
        String str7;
        List<byte[]> listM9064b1;
        b bVar;
        int i29;
        int i30;
        int i31;
        int i32;
        C2416m.a aVar;
        b bVar2;
        int iM19129d2;
        boolean z11;
        int iM19129d3;
        String str8;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z12;
        int i37;
        String str9;
        int iM19129d4;
        boolean z13;
        byte[] bArr2;
        int i38;
        int i39;
        int i40;
        int i41;
        int iIntValue;
        int i42;
        String str10;
        String str11;
        ImmutableList immutableListM9064b0;
        c10151t.m19124E(12);
        int iM19129d5 = c10151t.m19129d();
        d dVar2 = new d(iM19129d5);
        int i43 = 0;
        while (i43 < iM19129d5) {
            int i44 = c10151t.f51439b;
            int iM19129d6 = c10151t.m19129d();
            String str12 = "childAtomSize must be positive";
            C7510k.m15010a("childAtomSize must be positive", iM19129d6 > 0);
            int iM19129d7 = c10151t.m19129d();
            C9489l[] c9489lArr = dVar2.f48622a;
            if (iM19129d7 == 1635148593 || iM19129d7 == 1635148595 || iM19129d7 == 1701733238 || iM19129d7 == 1831958048 || iM19129d7 == 1836070006 || iM19129d7 == 1752589105 || iM19129d7 == 1751479857 || iM19129d7 == 1932670515 || iM19129d7 == 1211250227 || iM19129d7 == 1987063864 || iM19129d7 == 1987063865 || iM19129d7 == 1635135537 || iM19129d7 == 1685479798 || iM19129d7 == 1685479729 || iM19129d7 == 1685481573 || iM19129d7 == 1685481521) {
                iM19129d5 = iM19129d5;
                i12 = i43;
                String str13 = "childAtomSize must be positive";
                c10151t.m19124E(i44 + 8 + 8);
                c10151t.m19125F(16);
                int iM19150y3 = c10151t.m19150y();
                int iM19150y4 = c10151t.m19150y();
                c10151t.m19125F(50);
                int i45 = c10151t.f51439b;
                if (iM19129d7 == 1701733238) {
                    i13 = iM19129d6;
                    i14 = i44;
                    Pair pairM17906c = m17906c(i14, i13, c10151t);
                    if (pairM17906c != null) {
                        iM19129d7 = ((Integer) pairM17906c.first).intValue();
                        drmInitDataM6956a = drmInitData == null ? null : drmInitData.m6956a(((C9489l) pairM17906c.second).f48741b);
                        c9489lArr[i12] = (C9489l) pairM17906c.second;
                    } else {
                        drmInitDataM6956a = drmInitData;
                    }
                    c10151t.m19124E(i45);
                } else {
                    i13 = iM19129d6;
                    i14 = i44;
                    drmInitDataM6956a = drmInitData;
                }
                if (iM19129d7 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM19129d7 == 1211250227 ? "video/3gpp" : null;
                }
                String str14 = str2;
                DrmInitData drmInitData2 = drmInitDataM6956a;
                float f3 = 1.0f;
                int i46 = -1;
                byte[] bArr3 = null;
                ByteBuffer byteBufferOrder = null;
                b bVar3 = null;
                int i47 = -1;
                int i48 = -1;
                int i49 = -1;
                boolean z14 = false;
                List<byte[]> list3 = null;
                int i50 = i45;
                String str15 = null;
                while (true) {
                    if (i50 - i14 >= i13) {
                        i15 = i46;
                        bArr = bArr3;
                        break;
                    }
                    c10151t.m19124E(i50);
                    int i51 = c10151t.f51439b;
                    i15 = i46;
                    int iM19129d8 = c10151t.m19129d();
                    bArr = bArr3;
                    if (iM19129d8 == 0 && c10151t.f51439b - i14 == i13) {
                        break;
                    }
                    C7510k.m15010a(str13, iM19129d8 > 0);
                    int iM19129d9 = c10151t.m19129d();
                    String str16 = str13;
                    if (iM19129d9 == 1635148611) {
                        C7510k.m15010a(null, str14 == null);
                        c10151t.m19124E(i51 + 8);
                        C10319a c10319aM19319a = C10319a.m19319a(c10151t);
                        dVar2.f48624c = c10319aM19319a.f51886b;
                        if (!z14) {
                            f3 = c10319aM19319a.f51889e;
                        }
                        str3 = "video/avc";
                        list2 = c10319aM19319a.f51885a;
                        str4 = c10319aM19319a.f51890f;
                    } else {
                        if (iM19129d9 == 1752589123) {
                            C7510k.m15010a(null, str14 == null);
                            c10151t.m19124E(i51 + 8);
                            C10323e c10323eM19325a = C10323e.m19325a(c10151t);
                            dVar2.f48624c = c10323eM19325a.f51916b;
                            if (!z14) {
                                f3 = c10323eM19325a.f51917c;
                            }
                            str3 = "video/hevc";
                            list2 = c10323eM19325a.f51915a;
                            str4 = c10323eM19325a.f51918d;
                        } else {
                            if (iM19129d9 == 1685480259 || iM19129d9 == 1685485123) {
                                iM19150y3 = iM19150y3;
                                dVar2 = dVar2;
                                iM19150y4 = iM19150y4;
                                i14 = i14;
                                i13 = i13;
                                iM19129d7 = iM19129d7;
                                fM19148w = f3;
                                C10321c c10321cM19320a = C10321c.m19320a(c10151t);
                                if (c10321cM19320a != null) {
                                    str14 = "video/dolby-vision";
                                    str15 = c10321cM19320a.f51901a;
                                }
                            } else {
                                if (iM19129d9 == 1987076931) {
                                    C7510k.m15010a(null, str14 == null);
                                    str14 = iM19129d7 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                } else if (iM19129d9 == 1635135811) {
                                    C7510k.m15010a(null, str14 == null);
                                    str14 = "video/av01";
                                } else if (iM19129d9 == 1668050025) {
                                    ByteBuffer byteBufferOrder2 = byteBufferOrder == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBufferOrder;
                                    byteBufferOrder2.position(21);
                                    byteBufferOrder2.putShort(c10151t.m19141p());
                                    byteBufferOrder2.putShort(c10151t.m19141p());
                                    byteBufferOrder = byteBufferOrder2;
                                } else if (iM19129d9 == 1835295606) {
                                    if (byteBufferOrder == null) {
                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer = byteBufferOrder;
                                    short sM19141p = c10151t.m19141p();
                                    short sM19141p2 = c10151t.m19141p();
                                    short sM19141p3 = c10151t.m19141p();
                                    short sM19141p4 = c10151t.m19141p();
                                    short sM19141p5 = c10151t.m19141p();
                                    short sM19141p6 = c10151t.m19141p();
                                    float f10 = f3;
                                    short sM19141p7 = c10151t.m19141p();
                                    short sM19141p8 = c10151t.m19141p();
                                    long jM19146u = c10151t.m19146u();
                                    long jM19146u2 = c10151t.m19146u();
                                    byteBuffer.position(1);
                                    byteBuffer.putShort(sM19141p5);
                                    byteBuffer.putShort(sM19141p6);
                                    byteBuffer.putShort(sM19141p);
                                    byteBuffer.putShort(sM19141p2);
                                    byteBuffer.putShort(sM19141p3);
                                    byteBuffer.putShort(sM19141p4);
                                    byteBuffer.putShort(sM19141p7);
                                    byteBuffer.putShort(sM19141p8);
                                    byteBuffer.putShort((short) (jM19146u / 10000));
                                    byteBuffer.putShort((short) (jM19146u2 / 10000));
                                    byteBufferOrder = byteBuffer;
                                    list = list3;
                                    f3 = f10;
                                    fM19148w = f3;
                                    list3 = list;
                                    bArr3 = bArr;
                                } else {
                                    iM19150y3 = iM19150y3;
                                    dVar2 = dVar2;
                                    iM19150y4 = iM19150y4;
                                    i14 = i14;
                                    i13 = i13;
                                    iM19129d7 = iM19129d7;
                                    fM19148w = f3;
                                    if (iM19129d9 == 1681012275) {
                                        C7510k.m15010a(null, str14 == null);
                                        str14 = "video/3gpp";
                                        i21 = i15;
                                    } else {
                                        if (iM19129d9 == 1702061171) {
                                            C7510k.m15010a(null, str14 == null);
                                            b bVarM17904a = m17904a(i51, c10151t);
                                            byte[] bArr4 = bVarM17904a.f48619b;
                                            listM9064b0 = bArr4 != null ? ImmutableList.m9064b0(bArr4) : list3;
                                            str14 = bVarM17904a.f48618a;
                                            bVar3 = bVarM17904a;
                                            bArr3 = bArr;
                                        } else if (iM19129d9 == 1885434736) {
                                            c10151t.m19124E(i51 + 8);
                                            fM19148w = c10151t.m19148w() / c10151t.m19148w();
                                            bArr3 = bArr;
                                            z14 = true;
                                        } else if (iM19129d9 == 1937126244) {
                                            int i52 = i51 + 8;
                                            while (true) {
                                                if (i52 - i51 >= iM19129d8) {
                                                    bArrCopyOfRange = null;
                                                    break;
                                                }
                                                c10151t.m19124E(i52);
                                                int iM19129d10 = c10151t.m19129d();
                                                if (c10151t.m19129d() == 1886547818) {
                                                    bArrCopyOfRange = Arrays.copyOfRange(c10151t.f51438a, i52, iM19129d10 + i52);
                                                    break;
                                                }
                                                i52 += iM19129d10;
                                            }
                                            bArr3 = bArrCopyOfRange;
                                            listM9064b0 = list3;
                                        } else if (iM19129d9 == 1936995172) {
                                            int iM19145t = c10151t.m19145t();
                                            c10151t.m19125F(3);
                                            if (iM19145t == 0) {
                                                int iM19145t2 = c10151t.m19145t();
                                                if (iM19145t2 == 0) {
                                                    i21 = 0;
                                                } else if (iM19145t2 == 1) {
                                                    i21 = 1;
                                                } else if (iM19145t2 == 2) {
                                                    i21 = 2;
                                                } else if (iM19145t2 == 3) {
                                                    i21 = 3;
                                                }
                                            }
                                        } else if (iM19129d9 == 1668246642) {
                                            int iM19129d11 = c10151t.m19129d();
                                            if (iM19129d11 == 1852009592 || iM19129d11 == 1852009571) {
                                                int iM19150y5 = c10151t.m19150y();
                                                int iM19150y6 = c10151t.m19150y();
                                                c10151t.m19125F(2);
                                                boolean z15 = iM19129d8 == 19 && (c10151t.m19145t() & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
                                                String str17 = C10320b.f51891f;
                                                if (iM19150y5 == 1) {
                                                    i22 = 1;
                                                } else if (iM19150y5 != 9) {
                                                    i22 = (iM19150y5 == 4 || iM19150y5 == 5 || iM19150y5 == 6 || iM19150y5 == 7) ? 2 : -1;
                                                } else {
                                                    i22 = 6;
                                                }
                                                int i53 = z15 ? 1 : 2;
                                                if (iM19150y6 == 1) {
                                                    i23 = 3;
                                                } else if (iM19150y6 == 16) {
                                                    i23 = 6;
                                                } else if (iM19150y6 != 18) {
                                                    if (iM19150y6 != 6) {
                                                        if (iM19150y6 != 7) {
                                                            i23 = -1;
                                                        }
                                                    }
                                                    i23 = 3;
                                                } else {
                                                    i23 = 7;
                                                }
                                                i49 = i22;
                                                i47 = i23;
                                                i48 = i53;
                                            } else {
                                                C10145n.m19099g("AtomParsers", "Unsupported color type: " + AbstractC9478a.m17901a(iM19129d11));
                                            }
                                        }
                                        list3 = listM9064b0;
                                        i21 = i15;
                                        i15 = i21;
                                    }
                                    bArr3 = bArr;
                                    i15 = i21;
                                }
                                list = list3;
                                fM19148w = f3;
                                list3 = list;
                                bArr3 = bArr;
                            }
                            i21 = i15;
                            bArr3 = bArr;
                            i15 = i21;
                        }
                        i50 += iM19129d8;
                        i46 = i15;
                        str13 = str16;
                        iM19129d7 = iM19129d7;
                        i14 = i14;
                        i13 = i13;
                        dVar2 = dVar2;
                        f3 = fM19148w;
                        iM19150y4 = iM19150y4;
                        iM19150y3 = iM19150y3;
                    }
                    str14 = str3;
                    list = list2;
                    str15 = str4;
                    fM19148w = f3;
                    list3 = list;
                    bArr3 = bArr;
                    i50 += iM19129d8;
                    i46 = i15;
                    str13 = str16;
                    iM19129d7 = iM19129d7;
                    i14 = i14;
                    i13 = i13;
                    dVar2 = dVar2;
                    f3 = fM19148w;
                    iM19150y4 = iM19150y4;
                    iM19150y3 = iM19150y3;
                }
                int i54 = iM19150y4;
                i16 = i14;
                i17 = i13;
                float f11 = f3;
                if (str14 == null) {
                    dVar = dVar2;
                } else {
                    C2416m.a aVar2 = new C2416m.a();
                    aVar2.m7129b(i10);
                    aVar2.f12501k = str14;
                    aVar2.f12498h = str15;
                    aVar2.f12506p = i18;
                    aVar2.f12507q = i54;
                    aVar2.f12510t = f11;
                    aVar2.f12509s = i11;
                    aVar2.f12511u = bArr;
                    aVar2.f12512v = i15;
                    aVar2.f12503m = list3;
                    aVar2.f12504n = drmInitData2;
                    int i55 = i49;
                    if (i55 == -1) {
                        i20 = i48;
                        i19 = i47;
                        if (i20 != -1 || i19 != -1 || byteBufferOrder != null) {
                        }
                        if (bVar3 != null) {
                            b bVar4 = bVar3;
                            aVar2.f12496f = Ints.m9144n0(bVar4.f48620c);
                            aVar2.f12497g = Ints.m9144n0(bVar4.f48621d);
                        }
                        C2416m c2416m = new C2416m(aVar2);
                        dVar = dVar2;
                        dVar.f48623b = c2416m;
                    } else {
                        i18 = iM19150y3;
                        i19 = i47;
                        i20 = i48;
                    }
                    i18 = iM19150y3;
                    aVar2.f12513w = new C10320b(i55, i20, i19, byteBufferOrder != null ? byteBufferOrder.array() : null);
                    if (bVar3 != null) {
                        b bVar5 = bVar3;
                        aVar2.f12496f = Ints.m9144n0(bVar5.f48620c);
                        aVar2.f12497g = Ints.m9144n0(bVar5.f48621d);
                    }
                    C2416m c2416m2 = new C2416m(aVar2);
                    dVar = dVar2;
                    dVar.f48623b = c2416m2;
                }
            } else if (iM19129d7 == 1836069985 || iM19129d7 == 1701733217 || iM19129d7 == 1633889587 || iM19129d7 == 1700998451 || iM19129d7 == 1633889588 || iM19129d7 == 1835823201 || iM19129d7 == 1685353315 || iM19129d7 == 1685353317 || iM19129d7 == 1685353320 || iM19129d7 == 1685353324 || iM19129d7 == 1685353336 || iM19129d7 == 1935764850 || iM19129d7 == 1935767394 || iM19129d7 == 1819304813 || iM19129d7 == 1936684916 || iM19129d7 == 1953984371 || iM19129d7 == 778924082 || iM19129d7 == 778924083 || iM19129d7 == 1835557169 || iM19129d7 == 1835560241 || iM19129d7 == 1634492771 || iM19129d7 == 1634492791 || iM19129d7 == 1970037111 || iM19129d7 == 1332770163 || iM19129d7 == 1716281667) {
                c10151t.m19124E(i44 + 8 + 8);
                if (z10) {
                    iM19150y = c10151t.m19150y();
                    c10151t.m19125F(6);
                } else {
                    c10151t.m19125F(8);
                    iM19150y = 0;
                }
                if (iM19150y == 0 || iM19150y == 1) {
                    iM19150y2 = c10151t.m19150y();
                    c10151t.m19125F(6);
                    byte[] bArr5 = c10151t.f51438a;
                    int i56 = c10151t.f51439b;
                    int i57 = i56 + 1;
                    int i58 = ((bArr5[i56] & 255) << 8) | (bArr5[i57] & 255);
                    int i59 = i57 + 1 + 2;
                    c10151t.f51439b = i59;
                    c10151t.m19124E(i59 - 4);
                    iM19129d = c10151t.m19129d();
                    if (iM19150y == 1) {
                        c10151t.m19125F(16);
                    }
                    iRound = i58;
                } else {
                    if (iM19150y == 2) {
                        c10151t.m19125F(16);
                        iRound = (int) Math.round(Double.longBitsToDouble(c10151t.m19138m()));
                        iM19150y2 = c10151t.m19148w();
                        c10151t.m19125F(20);
                        iM19129d = 0;
                    } else {
                        iM19129d5 = iM19129d5;
                        i12 = i43;
                        i24 = i44;
                        i25 = iM19129d6;
                    }
                    dVar = dVar2;
                    i17 = i25;
                    i16 = i24;
                }
                int i60 = c10151t.f51439b;
                if (iM19129d7 == 1701733217) {
                    Pair pairM17906c2 = m17906c(i44, iM19129d6, c10151t);
                    if (pairM17906c2 != null) {
                        iM19129d7 = ((Integer) pairM17906c2.first).intValue();
                        drmInitDataM6956a2 = drmInitData == 0 ? null : drmInitData.m6956a(((C9489l) pairM17906c2.second).f48741b);
                        c9489lArr[i43] = (C9489l) pairM17906c2.second;
                    } else {
                        iRound = iRound;
                        drmInitDataM6956a2 = drmInitData;
                    }
                    c10151t.m19124E(i60);
                } else {
                    iRound = iRound;
                    drmInitDataM6956a2 = drmInitData;
                }
                String str18 = "audio/ac3";
                int i61 = iM19150y2;
                if (iM19129d7 == 1633889587) {
                    str5 = "audio/ac3";
                } else if (iM19129d7 == 1700998451) {
                    str5 = "audio/eac3";
                } else if (iM19129d7 == 1633889588) {
                    str5 = "audio/ac4";
                } else if (iM19129d7 == 1685353315) {
                    str5 = "audio/vnd.dts";
                } else if (iM19129d7 == 1685353320 || iM19129d7 == 1685353324) {
                    str5 = "audio/vnd.dts.hd";
                } else if (iM19129d7 == 1685353317) {
                    str5 = "audio/vnd.dts.hd;profile=lbr";
                } else if (iM19129d7 == 1685353336) {
                    str5 = "audio/vnd.dts.uhd;profile=p2";
                } else if (iM19129d7 == 1935764850) {
                    str5 = "audio/3gpp";
                } else if (iM19129d7 == 1935767394) {
                    str5 = "audio/amr-wb";
                } else {
                    if (iM19129d7 == 1819304813 || iM19129d7 == 1936684916) {
                        str5 = "audio/raw";
                        i26 = 2;
                    } else if (iM19129d7 == 1953984371) {
                        str5 = "audio/raw";
                        i26 = 268435456;
                    } else if (iM19129d7 == 778924082 || iM19129d7 == 778924083) {
                        str5 = "audio/mpeg";
                    } else if (iM19129d7 == 1835557169) {
                        str5 = "audio/mha1";
                    } else if (iM19129d7 == 1835560241) {
                        str5 = "audio/mhm1";
                    } else if (iM19129d7 == 1634492771) {
                        str5 = "audio/alac";
                    } else if (iM19129d7 == 1634492791) {
                        str5 = "audio/g711-alaw";
                    } else if (iM19129d7 == 1970037111) {
                        str5 = "audio/g711-mlaw";
                    } else if (iM19129d7 == 1332770163) {
                        str5 = "audio/opus";
                    } else if (iM19129d7 == 1716281667) {
                        str5 = "audio/flac";
                    } else {
                        str5 = iM19129d7 == 1835823201 ? "audio/true-hd" : null;
                    }
                    i12 = i43;
                    str6 = str5;
                    i27 = iRound;
                    i28 = i61;
                    str7 = null;
                    listM9064b1 = null;
                    bVar = null;
                    i29 = i60;
                    i30 = i26;
                    while (i29 - i44 < iM19129d6) {
                        c10151t.m19124E(i29);
                        iM19129d2 = c10151t.m19129d();
                        int i62 = iM19129d6;
                        if (iM19129d2 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        C7510k.m15010a(str12, z11);
                        iM19129d3 = c10151t.m19129d();
                        int i63 = i44;
                        if (iM19129d3 == 1835557187) {
                            int i64 = iM19129d2 - 13;
                            byte[] bArr6 = new byte[i64];
                            str8 = str12;
                            c10151t.m19124E(i29 + 13);
                            c10151t.m19127b(bArr6, 0, i64);
                            listM9064b1 = ImmutableList.m9064b0(bArr6);
                            str18 = str18;
                            iIntValue = i27;
                            i39 = iM19129d2;
                            i42 = i28;
                        } else {
                            str8 = str12;
                            if (iM19129d3 != 1702061171 || (z10 && iM19129d3 == 2002876005)) {
                                i33 = i28;
                                str18 = str18;
                                i34 = i27;
                                i35 = iM19129d2;
                                if (iM19129d3 == 1702061171) {
                                    i36 = c10151t.f51439b;
                                    if (i36 >= i29) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    C7510k.m15010a(null, z12);
                                    while (true) {
                                        i37 = i35;
                                        if (i36 - i29 < i37) {
                                            iM19129d = iM19129d;
                                            str9 = str8;
                                            i36 = -1;
                                            break;
                                        }
                                        c10151t.m19124E(i36);
                                        iM19129d4 = c10151t.m19129d();
                                        iM19129d = iM19129d;
                                        str9 = str8;
                                        if (iM19129d4 > 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        C7510k.m15010a(str9, z13);
                                        if (c10151t.m19129d() == 1702061171) {
                                            break;
                                        }
                                        i36 += iM19129d4;
                                        str8 = str9;
                                        i35 = i37;
                                        iM19129d = iM19129d;
                                    }
                                } else {
                                    iM19129d = iM19129d;
                                    i36 = i29;
                                    str9 = str8;
                                    i37 = i35;
                                }
                                if (i36 != -1) {
                                    b bVarM17904a2 = m17904a(i36, c10151t);
                                    str6 = bVarM17904a2.f48618a;
                                    bArr2 = bVarM17904a2.f48619b;
                                    if (bArr2 != null) {
                                        if ("audio/mp4a-latm".equals(str6)) {
                                            C6424a.a aVarM13046b = C6424a.m13046b(new C8739a(bArr2, bArr2.length), false);
                                            i27 = aVarM13046b.f36903a;
                                            i38 = aVarM13046b.f36904b;
                                            str7 = aVarM13046b.f36905c;
                                        } else {
                                            i27 = i34;
                                            i38 = i33;
                                        }
                                        listM9064b1 = ImmutableList.m9064b0(bArr2);
                                    } else {
                                        i27 = i34;
                                        i38 = i33;
                                    }
                                    bVar = bVarM17904a2;
                                    i28 = i38;
                                } else {
                                    i28 = i33;
                                    i27 = i34;
                                }
                            } else {
                                int[] iArr = C6425b.f36909d;
                                int[] iArr2 = C6425b.f36907b;
                                i39 = iM19129d2;
                                if (iM19129d3 == 1684103987) {
                                    c10151t.m19124E(i29 + 8);
                                    String string = Integer.toString(i10);
                                    C8739a c8739a = new C8739a();
                                    i41 = i27;
                                    i40 = i28;
                                    c8739a.m16973j(c10151t.f51438a, c10151t.f51440c);
                                    c8739a.m16974k(c10151t.f51439b * 8);
                                    int i65 = iArr2[c8739a.m16970g(2)];
                                    c8739a.m16976m(8);
                                    int i66 = iArr[c8739a.m16970g(3)];
                                    if (c8739a.m16970g(1) != 0) {
                                        i66++;
                                    }
                                    int i67 = C6425b.f36910e[c8739a.m16970g(5)] * 1000;
                                    c8739a.m16966c();
                                    c10151t.m19124E(c8739a.m16967d());
                                    C2416m.a aVar3 = new C2416m.a();
                                    aVar3.f12491a = string;
                                    aVar3.f12501k = str18;
                                    aVar3.f12514x = i66;
                                    aVar3.f12515y = i65;
                                    aVar3.f12504n = drmInitDataM6956a2;
                                    aVar3.f12493c = str;
                                    aVar3.f12496f = i67;
                                    aVar3.f12497g = i67;
                                    dVar2.f48623b = new C2416m(aVar3);
                                    str18 = str18;
                                } else {
                                    i40 = i28;
                                    i41 = i27;
                                    if (iM19129d3 == 1684366131) {
                                        c10151t.m19124E(i29 + 8);
                                        String string2 = Integer.toString(i10);
                                        C8739a c8739a2 = new C8739a();
                                        c8739a2.m16973j(c10151t.f51438a, c10151t.f51440c);
                                        c8739a2.m16974k(c10151t.f51439b * 8);
                                        int iM16970g = c8739a2.m16970g(13) * 1000;
                                        c8739a2.m16976m(3);
                                        int i68 = iArr2[c8739a2.m16970g(2)];
                                        c8739a2.m16976m(10);
                                        int i69 = iArr[c8739a2.m16970g(3)];
                                        if (c8739a2.m16970g(1) != 0) {
                                            i69++;
                                        }
                                        c8739a2.m16976m(3);
                                        int iM16970g2 = c8739a2.m16970g(4);
                                        c8739a2.m16976m(1);
                                        if (iM16970g2 > 0) {
                                            c8739a2.m16977n(6);
                                            if (c8739a2.m16970g(1) != 0) {
                                                i69 += 2;
                                            }
                                            c8739a2.m16976m(1);
                                        }
                                        if (c8739a2.m16965b() > 7) {
                                            c8739a2.m16976m(7);
                                            if (c8739a2.m16970g(1) != 0) {
                                                str10 = "audio/eac3-joc";
                                            } else {
                                                str10 = "audio/eac3";
                                            }
                                        } else {
                                            str10 = "audio/eac3";
                                        }
                                        c8739a2.m16966c();
                                        c10151t.m19124E(c8739a2.m16967d());
                                        C2416m.a aVar4 = new C2416m.a();
                                        aVar4.f12491a = string2;
                                        aVar4.f12501k = str10;
                                        aVar4.f12514x = i69;
                                        aVar4.f12515y = i68;
                                        aVar4.f12504n = drmInitDataM6956a2;
                                        aVar4.f12493c = str;
                                        aVar4.f12497g = iM16970g;
                                        dVar2.f48623b = new C2416m(aVar4);
                                    } else {
                                        str18 = str18;
                                        if (iM19129d3 == 1684103988) {
                                            c10151t.m19124E(i29 + 8);
                                            String string3 = Integer.toString(i10);
                                            c10151t.m19125F(1);
                                            int i70 = ((c10151t.m19145t() & 32) >> 5) == 1 ? 48000 : 44100;
                                            C2416m.a aVar5 = new C2416m.a();
                                            aVar5.f12491a = string3;
                                            aVar5.f12501k = "audio/ac4";
                                            aVar5.f12514x = 2;
                                            aVar5.f12515y = i70;
                                            aVar5.f12504n = drmInitDataM6956a2;
                                            aVar5.f12493c = str;
                                            dVar2.f48623b = new C2416m(aVar5);
                                        } else {
                                            if (iM19129d3 == 1684892784) {
                                                if (iM19129d <= 0) {
                                                    throw ParserException.m6770a("Invalid sample rate for Dolby TrueHD MLP stream: " + iM19129d, null);
                                                }
                                                i27 = iM19129d;
                                                i42 = 2;
                                            } else if (iM19129d3 == 1684305011) {
                                                C2416m.a aVar6 = new C2416m.a();
                                                aVar6.m7129b(i10);
                                                aVar6.f12501k = str6;
                                                i42 = i40;
                                                aVar6.f12514x = i42;
                                                iIntValue = i41;
                                                aVar6.f12515y = iIntValue;
                                                aVar6.f12504n = drmInitDataM6956a2;
                                                aVar6.f12493c = str;
                                                dVar2.f48623b = new C2416m(aVar6);
                                            } else {
                                                iIntValue = i41;
                                                i42 = i40;
                                                if (iM19129d3 == 1682927731) {
                                                    int i71 = i39 - 8;
                                                    byte[] bArr7 = f48608a;
                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr7, bArr7.length + i71);
                                                    c10151t.m19124E(i29 + 8);
                                                    c10151t.m19127b(bArrCopyOf, bArr7.length, i71);
                                                    listM9064b1 = C8573r0.m16669E(bArrCopyOf);
                                                } else if (iM19129d3 == 1684425825) {
                                                    int i72 = i39 - 12;
                                                    byte[] bArr8 = new byte[i72 + 4];
                                                    bArr8[0] = 102;
                                                    bArr8[1] = 76;
                                                    bArr8[2] = 97;
                                                    bArr8[3] = 67;
                                                    c10151t.m19124E(i29 + 12);
                                                    c10151t.m19127b(bArr8, 4, i72);
                                                    listM9064b1 = ImmutableList.m9064b0(bArr8);
                                                } else if (iM19129d3 == 1634492771) {
                                                    int i73 = i39 - 12;
                                                    byte[] bArr9 = new byte[i73];
                                                    c10151t.m19124E(i29 + 12);
                                                    c10151t.m19127b(bArr9, 0, i73);
                                                    C10151t c10151t2 = new C10151t(bArr9);
                                                    c10151t2.m19124E(9);
                                                    int iM19145t3 = c10151t2.m19145t();
                                                    c10151t2.m19124E(20);
                                                    Pair pairCreate = Pair.create(Integer.valueOf(c10151t2.m19148w()), Integer.valueOf(iM19145t3));
                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                    int iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                    listM9064b1 = ImmutableList.m9064b0(bArr9);
                                                    i42 = iIntValue2;
                                                }
                                            }
                                            i28 = i42;
                                            str9 = str8;
                                            i37 = i39;
                                        }
                                        i28 = i42;
                                        i27 = iIntValue;
                                        str9 = str8;
                                        i37 = i39;
                                    }
                                }
                                iIntValue = i41;
                                i42 = i40;
                                i28 = i42;
                                i27 = iIntValue;
                                str9 = str8;
                                i37 = i39;
                            }
                            i29 += i37;
                            str12 = str9;
                            iM19129d = iM19129d;
                            iM19129d6 = i62;
                            i44 = i63;
                            str18 = str18;
                        }
                        i27 = iIntValue;
                        i28 = i42;
                        str9 = str8;
                        i37 = i39;
                        i29 += i37;
                        str12 = str9;
                        iM19129d = iM19129d;
                        iM19129d6 = i62;
                        i44 = i63;
                        str18 = str18;
                    }
                    i24 = i44;
                    i25 = iM19129d6;
                    i31 = i27;
                    i32 = i28;
                    if (dVar2.f48623b == null && str6 != null) {
                        aVar = new C2416m.a();
                        aVar.m7129b(i10);
                        aVar.f12501k = str6;
                        aVar.f12498h = str7;
                        aVar.f12514x = i32;
                        aVar.f12515y = i31;
                        aVar.f12516z = i30;
                        aVar.f12503m = listM9064b1;
                        aVar.f12504n = drmInitDataM6956a2;
                        aVar.f12493c = str;
                        bVar2 = bVar;
                        if (bVar2 != null) {
                            aVar.f12496f = Ints.m9144n0(bVar2.f48620c);
                            aVar.f12497g = Ints.m9144n0(bVar2.f48621d);
                        }
                        dVar2.f48623b = new C2416m(aVar);
                    }
                    dVar = dVar2;
                    i17 = i25;
                    i16 = i24;
                }
                i26 = -1;
                i12 = i43;
                str6 = str5;
                i27 = iRound;
                i28 = i61;
                str7 = null;
                listM9064b1 = null;
                bVar = null;
                i29 = i60;
                i30 = i26;
                while (i29 - i44 < iM19129d6) {
                    c10151t.m19124E(i29);
                    iM19129d2 = c10151t.m19129d();
                    int i610 = iM19129d6;
                    if (iM19129d2 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C7510k.m15010a(str12, z11);
                    iM19129d3 = c10151t.m19129d();
                    int i611 = i44;
                    if (iM19129d3 == 1835557187) {
                        int i612 = iM19129d2 - 13;
                        byte[] bArr10 = new byte[i612];
                        str8 = str12;
                        c10151t.m19124E(i29 + 13);
                        c10151t.m19127b(bArr10, 0, i612);
                        listM9064b1 = ImmutableList.m9064b0(bArr10);
                        str18 = str18;
                        iIntValue = i27;
                        i39 = iM19129d2;
                        i42 = i28;
                    } else {
                        str8 = str12;
                        if (iM19129d3 != 1702061171) {
                        }
                        i33 = i28;
                        str18 = str18;
                        i34 = i27;
                        i35 = iM19129d2;
                        if (iM19129d3 == 1702061171) {
                            i36 = c10151t.f51439b;
                            if (i36 >= i29) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            C7510k.m15010a(null, z12);
                            while (true) {
                                i37 = i35;
                                if (i36 - i29 < i37) {
                                    iM19129d = iM19129d;
                                    str9 = str8;
                                    i36 = -1;
                                    break;
                                }
                                c10151t.m19124E(i36);
                                iM19129d4 = c10151t.m19129d();
                                iM19129d = iM19129d;
                                str9 = str8;
                                if (iM19129d4 > 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                C7510k.m15010a(str9, z13);
                                if (c10151t.m19129d() == 1702061171) {
                                    break;
                                    break;
                                }
                                i36 += iM19129d4;
                                str8 = str9;
                                i35 = i37;
                                iM19129d = iM19129d;
                            }
                        } else {
                            iM19129d = iM19129d;
                            i36 = i29;
                            str9 = str8;
                            i37 = i35;
                        }
                        if (i36 != -1) {
                            b bVarM17904a3 = m17904a(i36, c10151t);
                            str6 = bVarM17904a3.f48618a;
                            bArr2 = bVarM17904a3.f48619b;
                            if (bArr2 != null) {
                                if ("audio/mp4a-latm".equals(str6)) {
                                    C6424a.a aVarM13046b2 = C6424a.m13046b(new C8739a(bArr2, bArr2.length), false);
                                    i27 = aVarM13046b2.f36903a;
                                    i38 = aVarM13046b2.f36904b;
                                    str7 = aVarM13046b2.f36905c;
                                } else {
                                    i27 = i34;
                                    i38 = i33;
                                }
                                listM9064b1 = ImmutableList.m9064b0(bArr2);
                            } else {
                                i27 = i34;
                                i38 = i33;
                            }
                            bVar = bVarM17904a3;
                            i28 = i38;
                        } else {
                            i28 = i33;
                            i27 = i34;
                        }
                        i29 += i37;
                        str12 = str9;
                        iM19129d = iM19129d;
                        iM19129d6 = i610;
                        i44 = i611;
                        str18 = str18;
                    }
                    i27 = iIntValue;
                    i28 = i42;
                    str9 = str8;
                    i37 = i39;
                    i29 += i37;
                    str12 = str9;
                    iM19129d = iM19129d;
                    iM19129d6 = i610;
                    i44 = i611;
                    str18 = str18;
                }
                i24 = i44;
                i25 = iM19129d6;
                i31 = i27;
                i32 = i28;
                if (dVar2.f48623b == null) {
                    aVar = new C2416m.a();
                    aVar.m7129b(i10);
                    aVar.f12501k = str6;
                    aVar.f12498h = str7;
                    aVar.f12514x = i32;
                    aVar.f12515y = i31;
                    aVar.f12516z = i30;
                    aVar.f12503m = listM9064b1;
                    aVar.f12504n = drmInitDataM6956a2;
                    aVar.f12493c = str;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        aVar.f12496f = Ints.m9144n0(bVar2.f48620c);
                        aVar.f12497g = Ints.m9144n0(bVar2.f48621d);
                    }
                    dVar2.f48623b = new C2416m(aVar);
                }
                dVar = dVar2;
                i17 = i25;
                i16 = i24;
            } else {
                if (iM19129d7 == 1414810956 || iM19129d7 == 1954034535 || iM19129d7 == 2004251764 || iM19129d7 == 1937010800 || iM19129d7 == 1664495672) {
                    c10151t.m19124E(i44 + 8 + 8);
                    String str19 = "application/ttml+xml";
                    long j10 = Long.MAX_VALUE;
                    if (iM19129d7 == 1414810956) {
                        str11 = str19;
                        immutableListM9064b0 = null;
                    } else if (iM19129d7 == 1954034535) {
                        int i74 = (iM19129d6 - 8) - 8;
                        byte[] bArr11 = new byte[i74];
                        c10151t.m19127b(bArr11, 0, i74);
                        immutableListM9064b0 = ImmutableList.m9064b0(bArr11);
                        str11 = "application/x-quicktime-tx3g";
                    } else {
                        if (iM19129d7 == 2004251764) {
                            str19 = "application/x-mp4-vtt";
                        } else if (iM19129d7 == 1937010800) {
                            j10 = 0;
                        } else {
                            if (iM19129d7 != 1664495672) {
                                throw new IllegalStateException();
                            }
                            dVar2.f48625d = 1;
                            str19 = "application/x-mp4-cea-608";
                        }
                        str11 = str19;
                        immutableListM9064b0 = null;
                    }
                    C2416m.a aVar7 = new C2416m.a();
                    aVar7.m7129b(i10);
                    aVar7.f12501k = str11;
                    aVar7.f12493c = str;
                    aVar7.f12505o = j10;
                    aVar7.f12503m = immutableListM9064b0;
                    dVar2.f48623b = new C2416m(aVar7);
                } else if (iM19129d7 == 1835365492) {
                    c10151t.m19124E(i44 + 8 + 8);
                    if (iM19129d7 == 1835365492) {
                        c10151t.m19139n();
                        String strM19139n = c10151t.m19139n();
                        if (strM19139n != null) {
                            C2416m.a aVar8 = new C2416m.a();
                            aVar8.m7129b(i10);
                            aVar8.f12501k = strM19139n;
                            dVar2.f48623b = new C2416m(aVar8);
                        }
                    }
                } else if (iM19129d7 == 1667329389) {
                    C2416m.a aVar9 = new C2416m.a();
                    aVar9.m7129b(i10);
                    aVar9.f12501k = "application/x-camera-motion";
                    dVar2.f48623b = new C2416m(aVar9);
                }
                iM19129d5 = iM19129d5;
                dVar = dVar2;
                i12 = i43;
                i16 = i44;
                i17 = iM19129d6;
            }
            c10151t.m19124E(i16 + i17);
            i43 = i12 + 1;
            dVar2 = dVar;
            iM19129d5 = iM19129d5;
        }
        return dVar2;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x029b  */
    /* JADX WARN: Code duplicated, block: B:124:0x02af  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:130:0x030a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0310  */
    /* JADX WARN: Code duplicated, block: B:133:0x0319  */
    /* JADX WARN: Code duplicated, block: B:136:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x033c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0345  */
    /* JADX WARN: Code duplicated, block: B:140:0x0351  */
    /* JADX WARN: Code duplicated, block: B:143:0x0370  */
    /* JADX WARN: Code duplicated, block: B:144:0x0373  */
    /* JADX WARN: Code duplicated, block: B:147:0x037e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0381  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:154:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:157:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:158:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:162:0x03df  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x0402  */
    /* JADX WARN: Code duplicated, block: B:177:0x040e A[LOOP:1: B:175:0x0408->B:177:0x040e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x0424 A[LOOP:2: B:179:0x0422->B:180:0x0424, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x044a  */
    /* JADX WARN: Code duplicated, block: B:185:0x045a A[LOOP:4: B:184:0x0458->B:185:0x045a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x049d  */
    /* JADX WARN: Code duplicated, block: B:191:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:193:0x04df  */
    /* JADX WARN: Code duplicated, block: B:195:0x04e5 A[LOOP:11: B:192:0x04dd->B:195:0x04e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x0514 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x0516 A[ADDED_TO_REGION, LOOP:12: B:200:0x0516->B:202:0x051a, LOOP_START, PHI: r17 r30 r31
      0x0516: PHI (r17v19 int) = (r17v12 int), (r17v20 int) binds: [B:199:0x0514, B:202:0x051a] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r30v4 int) = (r30v1 int), (r30v5 int) binds: [B:199:0x0514, B:202:0x051a] A[DONT_GENERATE, DONT_INLINE]
      0x0516: PHI (r31v3 int) = (r31v1 int), (r31v5 int) binds: [B:199:0x0514, B:202:0x051a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:201:0x0518 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0533  */
    /* JADX WARN: Code duplicated, block: B:207:0x0536  */
    /* JADX WARN: Code duplicated, block: B:210:0x053f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0542  */
    /* JADX WARN: Code duplicated, block: B:214:0x0548  */
    /* JADX WARN: Code duplicated, block: B:216:0x0550  */
    /* JADX WARN: Code duplicated, block: B:219:0x0564 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x0591 A[DONT_INVERT, LOOP:13: B:225:0x0591->B:229:0x059b, LOOP_START, PHI: r17
      0x0591: PHI (r17v16 int) = (r17v12 int), (r17v17 int) binds: [B:224:0x058f, B:229:0x059b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:226:0x0593  */
    /* JADX WARN: Code duplicated, block: B:229:0x059b A[LOOP:13: B:225:0x0591->B:229:0x059b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:230:0x05a1 A[EDGE_INSN: B:230:0x05a1->B:231:0x05a2 BREAK  A[LOOP:13: B:225:0x0591->B:229:0x059b]] */
    /* JADX WARN: Code duplicated, block: B:232:0x05a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:243:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:244:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:249:0x0618  */
    /* JADX WARN: Code duplicated, block: B:250:0x062a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0633 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:281:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:283:0x0707  */
    /* JADX WARN: Code duplicated, block: B:286:0x070f A[LOOP:5: B:284:0x070c->B:286:0x070f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:288:0x073e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0740  */
    /* JADX WARN: Code duplicated, block: B:292:0x0746  */
    /* JADX WARN: Code duplicated, block: B:293:0x0748  */
    /* JADX WARN: Code duplicated, block: B:297:0x0758  */
    /* JADX WARN: Code duplicated, block: B:299:0x0761  */
    /* JADX WARN: Code duplicated, block: B:302:0x078b  */
    /* JADX WARN: Code duplicated, block: B:308:0x079c  */
    /* JADX WARN: Code duplicated, block: B:310:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:315:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:318:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:319:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:321:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:322:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:324:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:326:0x07db  */
    /* JADX WARN: Code duplicated, block: B:327:0x07de  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:331:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:333:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:334:0x0810  */
    /* JADX WARN: Code duplicated, block: B:337:0x081e  */
    /* JADX WARN: Code duplicated, block: B:339:0x084f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:354:0x08b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x08b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0795 A[ADDED_TO_REGION, EDGE_INSN: B:367:0x0795->B:305:0x0795 BREAK  A[LOOP:7: B:300:0x0785->B:304:0x0790], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x0856 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0572 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:380:0x04f6 A[EDGE_INSN: B:380:0x04f6->B:196:0x04f6 BREAK  A[LOOP:11: B:192:0x04dd->B:195:0x04e5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x05a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0599 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca A[LOOP:14: B:40:0x00bd->B:44:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x013e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0151  */
    /* JADX WARN: Code duplicated, block: B:79:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Code duplicated, block: B:83:0x016b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0210  */
    /* JADX WARN: Instruction removed from duplicated block: B:299:0x0761, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static ArrayList m17908e(AbstractC9478a.a aVar, C7516q c7516q, long j10, DrmInitData drmInitData, boolean z10, boolean z11, InterfaceC10171c interfaceC10171c) throws ParserException {
        int i10;
        int i11;
        String str;
        C10151t c10151t;
        int iM19129d;
        int iM19129d2;
        int i12;
        int i13;
        int i14;
        boolean z12;
        long jM19149x;
        int i15;
        int iM19129d3;
        long j11;
        int i16;
        long j12;
        C10151t c10151t2;
        int i17;
        long jM19146u;
        long jM19030O;
        int iM19129d4;
        int i18;
        int i19;
        Pair pairCreate;
        AbstractC9478a.b bVarM17903c;
        d dVarM17907d;
        long[] jArr;
        long[] jArr2;
        C9488k c9488k;
        int i20;
        AbstractC9478a.a aVarM17902b;
        Pair pairCreate2;
        C9488k c9488k2;
        AbstractC9478a.a aVarM17902b2;
        AbstractC9478a.b bVarM17903c2;
        C2416m c2416m;
        AbstractC9478a.b bVarM17903c3;
        c fVar;
        int iMo17911b;
        AbstractC9478a.b bVarM17903c4;
        boolean z13;
        AbstractC9478a.b bVarM17903c5;
        C10151t c10151t3;
        AbstractC9478a.b bVarM17903c6;
        C10151t c10151t4;
        a aVar2;
        int iM19148w;
        int iM19148w2;
        int iM19148w3;
        int iM19148w4;
        int i21;
        int iM19148w5;
        int i22;
        int iM19148w6;
        int iMo17910a;
        int i23;
        boolean z14;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i24;
        long j13;
        long j14;
        int iM19129d5;
        int iM19148w7;
        int i25;
        int i26;
        int iM19148w8;
        int iM19148w9;
        int i27;
        int i28;
        boolean z15;
        int i29;
        C9488k c9488k3;
        String str2;
        long[] jArr3;
        int[] iArr;
        long j15;
        long[] jArr4;
        boolean zM17909a;
        int i30;
        int i31;
        int iMo17912c;
        int i32;
        int i33;
        long jM19030O2;
        long j16;
        long[] jArr5;
        int length;
        int i34;
        long[] jArr6;
        int i35;
        int i36;
        long[] jArr7;
        int[] iArr2;
        C9491n c9491n;
        C9491n c9491n2;
        int i37;
        int i38;
        boolean z16;
        int[] iArr3;
        int[] iArr4;
        int i39;
        int i40;
        int i41;
        int[] iArr5;
        long[] jArr8;
        int i42;
        long[] jArr9;
        int[] iArr6;
        int[] iArr7;
        long[] jArr10;
        int i43;
        long j17;
        int i44;
        long[] jArr11;
        long j18;
        int i45;
        int i46;
        int[] iArr8;
        int[] iArr9;
        long j19;
        int i47;
        int i48;
        long j20;
        int i49;
        long[] jArr12;
        int[] iArr10;
        long j21;
        int i50;
        int i51;
        int i52;
        int[] iArr11;
        long[] jArr13;
        int i53;
        int i54;
        int i55;
        int i56;
        long j22;
        int iMax;
        int i57;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i58 = 0;
        while (true) {
            ArrayList arrayList3 = aVar.f48606d;
            if (i58 >= arrayList3.size()) {
                return arrayList2;
            }
            AbstractC9478a.a aVar3 = (AbstractC9478a.a) arrayList3.get(i58);
            if (aVar3.f48603a != 1953653099) {
                arrayList = arrayList2;
                i23 = i58;
            } else {
                AbstractC9478a.b bVarM17903c7 = aVar.m17903c(1836476516);
                bVarM17903c7.getClass();
                AbstractC9478a.a aVarM17902b3 = aVar3.m17902b(1835297121);
                aVarM17902b3.getClass();
                AbstractC9478a.b bVarM17903c8 = aVarM17902b3.m17903c(1751411826);
                bVarM17903c8.getClass();
                C10151t c10151t5 = bVarM17903c8.f48607b;
                c10151t5.m19124E(16);
                int iM19129d6 = c10151t5.m19129d();
                if (iM19129d6 == 1936684398) {
                    i10 = 1;
                } else if (iM19129d6 == 1986618469) {
                    i10 = 2;
                } else if (iM19129d6 == 1952807028 || iM19129d6 == 1935832172 || iM19129d6 == 1937072756 || iM19129d6 == 1668047728) {
                    i10 = 3;
                } else {
                    if (iM19129d6 == 1835365473) {
                        i10 = 5;
                    } else {
                        i11 = -1;
                    }
                    str = "";
                    if (i11 == -1) {
                        str = "";
                    } else {
                        AbstractC9478a.b bVarM17903c9 = aVar3.m17903c(1953196132);
                        bVarM17903c9.getClass();
                        c10151t = bVarM17903c9.f48607b;
                        c10151t.m19124E(8);
                        iM19129d = (c10151t.m19129d() >> 24) & 255;
                        c10151t.m19125F(iM19129d == 0 ? 8 : 16);
                        iM19129d2 = c10151t.m19129d();
                        c10151t.m19125F(4);
                        i12 = c10151t.f51439b;
                        if (iM19129d == 0) {
                            i13 = 4;
                        } else {
                            i13 = 8;
                        }
                        i14 = 0;
                        while (true) {
                            if (i14 < i13) {
                                z12 = true;
                                break;
                            }
                            if (c10151t.f51438a[i12 + i14] != -1) {
                                z12 = false;
                                break;
                            }
                            i14++;
                        }
                        if (z12) {
                            c10151t.m19125F(i13);
                        } else {
                            if (iM19129d == 0) {
                                jM19149x = c10151t.m19146u();
                            } else {
                                jM19149x = c10151t.m19149x();
                            }
                            if (jM19149x == 0) {
                                i15 = 16;
                            }
                            c10151t.m19125F(i15);
                            iM19129d3 = c10151t.m19129d();
                            int iM19129d7 = c10151t.m19129d();
                            c10151t.m19125F(4);
                            int iM19129d8 = c10151t.m19129d();
                            int iM19129d9 = c10151t.m19129d();
                            j11 = jM19149x;
                            if (iM19129d3 != 0 && iM19129d7 == 65536 && iM19129d8 == -65536 && iM19129d9 == 0) {
                                i16 = 90;
                            } else if (iM19129d3 != 0 && iM19129d7 == -65536 && iM19129d8 == 65536 && iM19129d9 == 0) {
                                i16 = 270;
                            } else if (iM19129d3 != -65536 && iM19129d7 == 0 && iM19129d8 == 0 && iM19129d9 == -65536) {
                                i16 = 180;
                            } else {
                                i16 = 0;
                            }
                            if (j10 == -9223372036854775807L) {
                                j12 = j11;
                            } else {
                                j12 = j10;
                            }
                            c10151t2 = bVarM17903c7.f48607b;
                            c10151t2.m19124E(8);
                            if (((c10151t2.m19129d() >> 24) & 255) == 0) {
                                i17 = 8;
                            } else {
                                i17 = 16;
                            }
                            c10151t2.m19125F(i17);
                            jM19146u = c10151t2.m19146u();
                            jM19030O = j12 != -9223372036854775807L ? C10134c0.m19030O(j12, 1000000L, jM19146u) : -9223372036854775807L;
                            AbstractC9478a.a aVarM17902b4 = aVarM17902b3.m17902b(1835626086);
                            aVarM17902b4.getClass();
                            AbstractC9478a.a aVarM17902b5 = aVarM17902b4.m17902b(1937007212);
                            aVarM17902b5.getClass();
                            AbstractC9478a.b bVarM17903c10 = aVarM17902b3.m17903c(1835296868);
                            bVarM17903c10.getClass();
                            C10151t c10151t6 = bVarM17903c10.f48607b;
                            c10151t6.m19124E(8);
                            iM19129d4 = (c10151t6.m19129d() >> 24) & 255;
                            if (iM19129d4 == 0) {
                                i18 = 8;
                            } else {
                                i18 = 16;
                            }
                            c10151t6.m19125F(i18);
                            long jM19146u2 = c10151t6.m19146u();
                            if (iM19129d4 == 0) {
                                i19 = 4;
                            } else {
                                i19 = 8;
                            }
                            c10151t6.m19125F(i19);
                            int iM19150y = c10151t6.m19150y();
                            pairCreate = Pair.create(Long.valueOf(jM19146u2), "" + ((char) (((iM19150y >> 10) & 31) + 96)) + ((char) (((iM19150y >> 5) & 31) + 96)) + ((char) ((iM19150y & 31) + 96)));
                            bVarM17903c = aVarM17902b5.m17903c(1937011556);
                            if (bVarM17903c != null) {
                                throw ParserException.m6770a("Malformed sample table (stbl) missing sample description (stsd)", null);
                            }
                            dVarM17907d = m17907d(bVarM17903c.f48607b, iM19129d2, i16, (String) pairCreate.second, drmInitData, z11);
                            if (!z10 || (aVarM17902b = aVar3.m17902b(1701082227)) == null) {
                                str = "";
                            } else {
                                AbstractC9478a.b bVarM17903c11 = aVarM17902b.m17903c(1701606260);
                                if (bVarM17903c11 == null) {
                                    pairCreate2 = null;
                                } else {
                                    C10151t c10151t7 = bVarM17903c11.f48607b;
                                    c10151t7.m19124E(8);
                                    int iM19129d10 = (c10151t7.m19129d() >> 24) & 255;
                                    int iM19148w10 = c10151t7.m19148w();
                                    long[] jArr14 = new long[iM19148w10];
                                    long[] jArr15 = new long[iM19148w10];
                                    int i59 = 0;
                                    while (i59 < iM19148w10) {
                                        int i60 = iM19148w10;
                                        jArr14[i59] = iM19129d10 == 1 ? c10151t7.m19149x() : c10151t7.m19146u();
                                        jArr15[i59] = iM19129d10 == 1 ? c10151t7.m19138m() : c10151t7.m19129d();
                                        if (c10151t7.m19141p() != 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        c10151t7.m19125F(2);
                                        i59++;
                                        iM19148w10 = i60;
                                        iM19129d10 = iM19129d10;
                                    }
                                    pairCreate2 = Pair.create(jArr14, jArr15);
                                }
                                if (pairCreate2 != null) {
                                    long[] jArr16 = (long[]) pairCreate2.first;
                                    jArr2 = (long[]) pairCreate2.second;
                                    jArr = jArr16;
                                }
                                if (dVarM17907d.f48623b != null) {
                                    c9488k = new C9488k(iM19129d2, i11, ((Long) pairCreate.first).longValue(), jM19146u, jM19030O, dVarM17907d.f48623b, dVarM17907d.f48625d, dVarM17907d.f48622a, dVarM17907d.f48624c, jArr, jArr2);
                                    i20 = 1835626086;
                                }
                                c9488k2 = (C9488k) interfaceC10171c.apply(c9488k);
                                if (c9488k2 == null) {
                                    arrayList = arrayList2;
                                    i23 = i58;
                                } else {
                                    AbstractC9478a.a aVarM17902b6 = aVar3.m17902b(1835297121);
                                    aVarM17902b6.getClass();
                                    AbstractC9478a.a aVarM17902b7 = aVarM17902b6.m17902b(i20);
                                    aVarM17902b7.getClass();
                                    aVarM17902b2 = aVarM17902b7.m17902b(1937007212);
                                    aVarM17902b2.getClass();
                                    bVarM17903c2 = aVarM17902b2.m17903c(1937011578);
                                    c2416m = c9488k2.f48734f;
                                    if (bVarM17903c2 != null) {
                                        fVar = new e(bVarM17903c2, c2416m);
                                    } else {
                                        bVarM17903c3 = aVarM17902b2.m17903c(1937013298);
                                        if (bVarM17903c3 == null) {
                                            throw ParserException.m6770a("Track has no sample table size information", null);
                                        }
                                        fVar = new f(bVarM17903c3);
                                    }
                                    iMo17911b = fVar.mo17911b();
                                    if (iMo17911b == 0) {
                                        c9491n2 = new C9491n(c9488k2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                        arrayList2 = arrayList2;
                                        i23 = i58;
                                    } else {
                                        bVarM17903c4 = aVarM17902b2.m17903c(1937007471);
                                        if (bVarM17903c4 == null) {
                                            bVarM17903c4 = aVarM17902b2.m17903c(1668232756);
                                            bVarM17903c4.getClass();
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        AbstractC9478a.b bVarM17903c12 = aVarM17902b2.m17903c(1937011555);
                                        bVarM17903c12.getClass();
                                        AbstractC9478a.b bVarM17903c13 = aVarM17902b2.m17903c(1937011827);
                                        bVarM17903c13.getClass();
                                        bVarM17903c5 = aVarM17902b2.m17903c(1937011571);
                                        if (bVarM17903c5 != null) {
                                            c10151t3 = bVarM17903c5.f48607b;
                                        } else {
                                            c10151t3 = null;
                                        }
                                        bVarM17903c6 = aVarM17902b2.m17903c(1668576371);
                                        if (bVarM17903c6 != null) {
                                            c10151t4 = bVarM17903c6.f48607b;
                                        } else {
                                            c10151t4 = null;
                                        }
                                        aVar2 = new a(bVarM17903c12.f48607b, bVarM17903c4.f48607b, z13);
                                        C10151t c10151t8 = bVarM17903c13.f48607b;
                                        c10151t8.m19124E(12);
                                        iM19148w = c10151t8.m19148w() - 1;
                                        iM19148w2 = c10151t8.m19148w();
                                        iM19148w3 = c10151t8.m19148w();
                                        if (c10151t4 != null) {
                                            c10151t4.m19124E(12);
                                            iM19148w4 = c10151t4.m19148w();
                                        } else {
                                            iM19148w4 = 0;
                                        }
                                        if (c10151t3 != null) {
                                            c10151t3.m19124E(12);
                                            iM19148w5 = c10151t3.m19148w();
                                            if (iM19148w5 > 0) {
                                                iM19148w6 = c10151t3.m19148w() - 1;
                                                i22 = -1;
                                            } else {
                                                i21 = -1;
                                                c10151t3 = null;
                                            }
                                            iMo17910a = fVar.mo17910a();
                                            i23 = i58;
                                            String str3 = c2416m.f12484l;
                                            if (iMo17910a == i22 && (("audio/raw".equals(str3) || "audio/g711-mlaw".equals(str3) || "audio/g711-alaw".equals(str3)) && iM19148w == 0 && iM19148w4 == 0 && iM19148w5 == 0)) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                i49 = aVar2.f48609a;
                                                jArr12 = new long[i49];
                                                iArr10 = new int[i49];
                                                while (aVar2.m17909a()) {
                                                    int i61 = aVar2.f48610b;
                                                    jArr12[i61] = aVar2.f48612d;
                                                    iArr10[i61] = aVar2.f48611c;
                                                }
                                                j21 = iM19148w3;
                                                i50 = 8192 / iMo17910a;
                                                i52 = 0;
                                                for (i51 = 0; i51 < i49; i51++) {
                                                    int i62 = iArr10[i51];
                                                    int i63 = C10134c0.f51354a;
                                                    i52 += ((i62 + i50) - 1) / i50;
                                                }
                                                jArr4 = new long[i52];
                                                iArr11 = new int[i52];
                                                jArr13 = new long[i52];
                                                iArr = new int[i52];
                                                i53 = 0;
                                                i54 = 0;
                                                i55 = 0;
                                                i56 = 0;
                                                while (i56 < i49) {
                                                    int i64 = iArr10[i56];
                                                    j22 = jArr12[i56];
                                                    long[] jArr17 = jArr12;
                                                    iMax = i53;
                                                    int i65 = i49;
                                                    i57 = i64;
                                                    while (i57 > 0) {
                                                        int iMin = Math.min(i50, i57);
                                                        jArr4[i54] = j22;
                                                        int[] iArr12 = iArr10;
                                                        int i66 = iMo17910a * iMin;
                                                        iArr11[i54] = i66;
                                                        iMax = Math.max(iMax, i66);
                                                        jArr13[i54] = ((long) i55) * j21;
                                                        iArr[i54] = 1;
                                                        j22 += (long) iArr11[i54];
                                                        i55 += iMin;
                                                        i57 -= iMin;
                                                        i54++;
                                                        iArr10 = iArr12;
                                                        i50 = i50;
                                                    }
                                                    i56++;
                                                    i53 = iMax;
                                                    i49 = i65;
                                                    jArr12 = jArr17;
                                                }
                                                j15 = j21 * ((long) i55);
                                                iArrCopyOf = iArr11;
                                                jArr3 = jArr13;
                                                i26 = i53;
                                                c9488k3 = c9488k2;
                                            } else {
                                                jArrCopyOf = new long[iMo17911b];
                                                iArrCopyOf = new int[iMo17911b];
                                                jArrCopyOf2 = new long[iMo17911b];
                                                iArrCopyOf2 = new int[iMo17911b];
                                                i24 = 0;
                                                j13 = 0;
                                                j14 = 0;
                                                iM19129d5 = 0;
                                                iM19148w7 = 0;
                                                int i67 = iM19148w;
                                                i25 = iM19148w3;
                                                i26 = 0;
                                                iM19148w8 = iM19148w2;
                                                iM19148w9 = iM19148w6;
                                                i27 = iM19148w4;
                                                i28 = 0;
                                                while (i28 < iMo17911b) {
                                                    zM17909a = true;
                                                    while (i24 == 0) {
                                                        zM17909a = aVar2.m17909a();
                                                        if (zM17909a) {
                                                            break;
                                                        }
                                                        j14 = aVar2.f48612d;
                                                        i24 = aVar2.f48611c;
                                                        iMo17911b = iMo17911b;
                                                        i25 = i25;
                                                    }
                                                    i30 = iMo17911b;
                                                    i31 = i25;
                                                    if (!zM17909a) {
                                                        C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                                        iMo17911b = i28;
                                                        break;
                                                    }
                                                    if (c10151t4 != null) {
                                                        while (iM19148w7 == 0 && i27 > 0) {
                                                            iM19148w7 = c10151t4.m19148w();
                                                            iM19129d5 = c10151t4.m19129d();
                                                            i27--;
                                                        }
                                                        iM19148w7--;
                                                    }
                                                    int i68 = iM19129d5;
                                                    jArrCopyOf[i28] = j14;
                                                    iMo17912c = fVar.mo17912c();
                                                    iArrCopyOf[i28] = iMo17912c;
                                                    if (iMo17912c > i26) {
                                                        i32 = iMo17912c;
                                                    } else {
                                                        i32 = i26;
                                                    }
                                                    jArrCopyOf2[i28] = j13 + ((long) i68);
                                                    if (c10151t3 == null) {
                                                        i33 = 1;
                                                    } else {
                                                        i33 = 0;
                                                    }
                                                    iArrCopyOf2[i28] = i33;
                                                    if (i28 == iM19148w9) {
                                                        iArrCopyOf2[i28] = 1;
                                                        iM19148w5--;
                                                        if (iM19148w5 > 0) {
                                                            c10151t3.getClass();
                                                            iM19148w9 = c10151t3.m19148w() - 1;
                                                        }
                                                    }
                                                    long[] jArr18 = jArrCopyOf2;
                                                    int iM19129d11 = i31;
                                                    j13 += (long) iM19129d11;
                                                    iM19148w8--;
                                                    if (iM19148w8 != 0 && i67 > 0) {
                                                        i67--;
                                                        iM19148w8 = c10151t8.m19148w();
                                                        iM19129d11 = c10151t8.m19129d();
                                                    }
                                                    j14 += (long) iArrCopyOf[i28];
                                                    i24--;
                                                    i28++;
                                                    jArrCopyOf2 = jArr18;
                                                    iM19129d5 = i68;
                                                    iMo17911b = i30;
                                                    aVar2 = aVar2;
                                                    i25 = iM19129d11;
                                                    i26 = i32;
                                                }
                                                int i69 = i24;
                                                long j23 = j13 + ((long) iM19129d5);
                                                if (c10151t4 != null) {
                                                    z15 = true;
                                                    break;
                                                }
                                                while (true) {
                                                    if (i27 > 0) {
                                                        z15 = true;
                                                        break;
                                                    }
                                                    if (c10151t4.m19148w() != 0) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    c10151t4.m19129d();
                                                    i27--;
                                                }
                                                if (iM19148w5 != 0 && iM19148w8 == 0 && i69 == 0 && i67 == 0) {
                                                    i29 = iM19148w7;
                                                    if (i29 == 0 && z15) {
                                                        c9488k3 = c9488k2;
                                                    }
                                                    jArr3 = jArrCopyOf2;
                                                    iArr = iArrCopyOf2;
                                                    j15 = j23;
                                                    jArr4 = jArrCopyOf;
                                                } else {
                                                    i29 = iM19148w7;
                                                }
                                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                                c9488k3 = c9488k2;
                                                sb2.append(c9488k3.f48729a);
                                                sb2.append(": remainingSynchronizationSamples ");
                                                sb2.append(iM19148w5);
                                                sb2.append(", remainingSamplesAtTimestampDelta ");
                                                sb2.append(iM19148w8);
                                                sb2.append(", remainingSamplesInChunk ");
                                                sb2.append(i69);
                                                sb2.append(", remainingTimestampDeltaChanges ");
                                                sb2.append(i67);
                                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                                sb2.append(i29);
                                                if (z15) {
                                                    str2 = str;
                                                } else {
                                                    str2 = ", ctts invalid";
                                                }
                                                sb2.append(str2);
                                                C10145n.m19099g("AtomParsers", sb2.toString());
                                                jArr3 = jArrCopyOf2;
                                                iArr = iArrCopyOf2;
                                                j15 = j23;
                                                jArr4 = jArrCopyOf;
                                            }
                                            jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                            j16 = c9488k3.f48731c;
                                            jArr5 = c9488k3.f48736h;
                                            if (jArr5 == null) {
                                                C10134c0.m19031P(jArr3, j16);
                                                c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                            } else {
                                                length = jArr5.length;
                                                i34 = c9488k3.f48730b;
                                                jArr6 = c9488k3.f48737i;
                                                if (length == 1 || i34 != 1 || jArr3.length < 2) {
                                                    i35 = iMo17911b;
                                                    i36 = i34;
                                                    jArr7 = jArr6;
                                                    iArr2 = iArr;
                                                } else {
                                                    jArr6.getClass();
                                                    long j24 = jArr6[0];
                                                    jArr7 = jArr6;
                                                    i35 = iMo17911b;
                                                    long jM19030O3 = C10134c0.m19030O(jArr5[0], c9488k3.f48731c, c9488k3.f48732d) + j24;
                                                    int length2 = jArr3.length - 1;
                                                    i36 = i34;
                                                    int iM19041h = C10134c0.m19041h(4, 0, length2);
                                                    iArr2 = iArr;
                                                    int iM19041h2 = C10134c0.m19041h(jArr3.length - 4, 0, length2);
                                                    long j25 = jArr3[0];
                                                    if (j25 <= j24 && j24 < jArr3[iM19041h] && jArr3[iM19041h2] < jM19030O3 && jM19030O3 <= j15) {
                                                        long j26 = j15 - jM19030O3;
                                                        int i70 = c2416m.f12464U;
                                                        long jM19030O4 = C10134c0.m19030O(j24 - j25, i70, c9488k3.f48731c);
                                                        long jM19030O5 = C10134c0.m19030O(j26, i70, c9488k3.f48731c);
                                                        if ((jM19030O4 != 0 || jM19030O5 != 0) && jM19030O4 <= 2147483647L && jM19030O5 <= 2147483647L) {
                                                            c7516q.f41509a = (int) jM19030O4;
                                                            c7516q.f41510b = (int) jM19030O5;
                                                            C10134c0.m19031P(jArr3, j16);
                                                            c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(jArr5[0], 1000000L, c9488k3.f48732d));
                                                        }
                                                        c9491n2 = c9491n;
                                                    }
                                                }
                                                i37 = 1;
                                                if (jArr5.length == 1) {
                                                    i38 = 0;
                                                    if (jArr5[0] == 0) {
                                                        jArr7.getClass();
                                                        j20 = jArr7[0];
                                                        while (i38 < jArr3.length) {
                                                            jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                            i38++;
                                                        }
                                                        c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                        c9491n2 = c9491n;
                                                    } else {
                                                        i37 = 1;
                                                    }
                                                } else {
                                                    i38 = 0;
                                                }
                                                if (i36 == i37) {
                                                    z16 = 1;
                                                } else {
                                                    z16 = i38;
                                                }
                                                iArr3 = new int[jArr5.length];
                                                iArr4 = new int[jArr5.length];
                                                jArr7.getClass();
                                                i39 = i38;
                                                i40 = i39;
                                                i41 = i40;
                                                while (i38 < jArr5.length) {
                                                    long[] jArr19 = jArr4;
                                                    j19 = jArr7[i38];
                                                    if (j19 != -1) {
                                                        int i71 = i39;
                                                        int i72 = i40;
                                                        long jM19030O6 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                        iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                        iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O6, z16);
                                                        while (true) {
                                                            i47 = iArr3[i38];
                                                            i48 = iArr4[i38];
                                                            if (i47 < i48 || (iArr2[i47] & 1) != 0) {
                                                                break;
                                                            }
                                                            iArr3[i38] = i47 + 1;
                                                        }
                                                        i40 = (i48 - i47) + i72;
                                                        i39 = i71 | (i41 == i47 ? 0 : 1);
                                                        i41 = i48;
                                                    }
                                                    i38++;
                                                    jArr4 = jArr19;
                                                    jArr5 = jArr5;
                                                    iArrCopyOf = iArrCopyOf;
                                                }
                                                iArr5 = iArrCopyOf;
                                                long[] jArr20 = jArr5;
                                                jArr8 = jArr4;
                                                i42 = i39 | (i40 == i35 ? 0 : 1);
                                                if (i42 != 0) {
                                                    jArr9 = new long[i40];
                                                } else {
                                                    jArr9 = jArr8;
                                                }
                                                if (i42 != 0) {
                                                    iArr6 = new int[i40];
                                                } else {
                                                    iArr6 = iArr5;
                                                }
                                                if (i42 != 0) {
                                                    i26 = 0;
                                                }
                                                if (i42 != 0) {
                                                    iArr7 = new int[i40];
                                                } else {
                                                    iArr7 = iArr2;
                                                }
                                                jArr10 = new long[i40];
                                                i43 = 0;
                                                j17 = 0;
                                                i44 = 0;
                                                jArr11 = jArr20;
                                                while (i44 < jArr11.length) {
                                                    j18 = jArr7[i44];
                                                    i45 = iArr3[i44];
                                                    int[] iArr13 = iArr3;
                                                    i46 = iArr4[i44];
                                                    if (i42 != 0) {
                                                        int i73 = i46 - i45;
                                                        System.arraycopy(jArr8, i45, jArr9, i43, i73);
                                                        iArr8 = iArr5;
                                                        System.arraycopy(iArr8, i45, iArr6, i43, i73);
                                                        iArr9 = iArr2;
                                                        System.arraycopy(iArr9, i45, iArr7, i43, i73);
                                                    } else {
                                                        iArr8 = iArr5;
                                                        iArr9 = iArr2;
                                                    }
                                                    int i74 = i26;
                                                    while (i45 < i46) {
                                                        int i75 = i46;
                                                        long[] jArr21 = jArr11;
                                                        long j27 = j17;
                                                        int i76 = i44;
                                                        long[] jArr22 = jArr3;
                                                        jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                        if (i42 == 0 && iArr6[i43] > i74) {
                                                            i74 = iArr8[i45];
                                                        }
                                                        i43++;
                                                        i45++;
                                                        jArr11 = jArr21;
                                                        jArr3 = jArr22;
                                                        i44 = i76;
                                                        j17 = j27;
                                                        i46 = i75;
                                                    }
                                                    long[] jArr23 = jArr11;
                                                    int i77 = i44;
                                                    j17 += jArr23[i77];
                                                    i44 = i77 + 1;
                                                    iArr3 = iArr13;
                                                    jArr11 = jArr23;
                                                    iArr2 = iArr9;
                                                    jArr9 = jArr9;
                                                    iArr5 = iArr8;
                                                    i26 = i74;
                                                    iArr4 = iArr4;
                                                }
                                                c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                            }
                                        } else {
                                            i21 = -1;
                                            iM19148w5 = 0;
                                        }
                                        i22 = i21;
                                        iM19148w6 = i22;
                                        iMo17910a = fVar.mo17910a();
                                        i23 = i58;
                                        String str4 = c2416m.f12484l;
                                        if (iMo17910a == i22) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            i49 = aVar2.f48609a;
                                            jArr12 = new long[i49];
                                            iArr10 = new int[i49];
                                            while (aVar2.m17909a()) {
                                                int i610 = aVar2.f48610b;
                                                jArr12[i610] = aVar2.f48612d;
                                                iArr10[i610] = aVar2.f48611c;
                                            }
                                            j21 = iM19148w3;
                                            i50 = 8192 / iMo17910a;
                                            i52 = 0;
                                            while (i51 < i49) {
                                                int i611 = iArr10[i51];
                                                int i612 = C10134c0.f51354a;
                                                i52 += ((i611 + i50) - 1) / i50;
                                            }
                                            jArr4 = new long[i52];
                                            iArr11 = new int[i52];
                                            jArr13 = new long[i52];
                                            iArr = new int[i52];
                                            i53 = 0;
                                            i54 = 0;
                                            i55 = 0;
                                            i56 = 0;
                                            while (i56 < i49) {
                                                int i613 = iArr10[i56];
                                                j22 = jArr12[i56];
                                                long[] jArr110 = jArr12;
                                                iMax = i53;
                                                int i614 = i49;
                                                i57 = i613;
                                                while (i57 > 0) {
                                                    int iMin2 = Math.min(i50, i57);
                                                    jArr4[i54] = j22;
                                                    int[] iArr14 = iArr10;
                                                    int i615 = iMo17910a * iMin2;
                                                    iArr11[i54] = i615;
                                                    iMax = Math.max(iMax, i615);
                                                    jArr13[i54] = ((long) i55) * j21;
                                                    iArr[i54] = 1;
                                                    j22 += (long) iArr11[i54];
                                                    i55 += iMin2;
                                                    i57 -= iMin2;
                                                    i54++;
                                                    iArr10 = iArr14;
                                                    i50 = i50;
                                                }
                                                i56++;
                                                i53 = iMax;
                                                i49 = i614;
                                                jArr12 = jArr110;
                                            }
                                            j15 = j21 * ((long) i55);
                                            iArrCopyOf = iArr11;
                                            jArr3 = jArr13;
                                            i26 = i53;
                                            c9488k3 = c9488k2;
                                        } else {
                                            jArrCopyOf = new long[iMo17911b];
                                            iArrCopyOf = new int[iMo17911b];
                                            jArrCopyOf2 = new long[iMo17911b];
                                            iArrCopyOf2 = new int[iMo17911b];
                                            i24 = 0;
                                            j13 = 0;
                                            j14 = 0;
                                            iM19129d5 = 0;
                                            iM19148w7 = 0;
                                            int i616 = iM19148w;
                                            i25 = iM19148w3;
                                            i26 = 0;
                                            iM19148w8 = iM19148w2;
                                            iM19148w9 = iM19148w6;
                                            i27 = iM19148w4;
                                            i28 = 0;
                                            while (i28 < iMo17911b) {
                                                zM17909a = true;
                                                while (i24 == 0) {
                                                    zM17909a = aVar2.m17909a();
                                                    if (zM17909a) {
                                                        break;
                                                        break;
                                                    }
                                                    j14 = aVar2.f48612d;
                                                    i24 = aVar2.f48611c;
                                                    iMo17911b = iMo17911b;
                                                    i25 = i25;
                                                }
                                                i30 = iMo17911b;
                                                i31 = i25;
                                                if (!zM17909a) {
                                                    C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                                    iMo17911b = i28;
                                                    break;
                                                }
                                                if (c10151t4 != null) {
                                                    while (iM19148w7 == 0) {
                                                        iM19148w7 = c10151t4.m19148w();
                                                        iM19129d5 = c10151t4.m19129d();
                                                        i27--;
                                                    }
                                                    iM19148w7--;
                                                }
                                                int i617 = iM19129d5;
                                                jArrCopyOf[i28] = j14;
                                                iMo17912c = fVar.mo17912c();
                                                iArrCopyOf[i28] = iMo17912c;
                                                if (iMo17912c > i26) {
                                                    i32 = iMo17912c;
                                                } else {
                                                    i32 = i26;
                                                }
                                                jArrCopyOf2[i28] = j13 + ((long) i617);
                                                if (c10151t3 == null) {
                                                    i33 = 1;
                                                } else {
                                                    i33 = 0;
                                                }
                                                iArrCopyOf2[i28] = i33;
                                                if (i28 == iM19148w9) {
                                                    iArrCopyOf2[i28] = 1;
                                                    iM19148w5--;
                                                    if (iM19148w5 > 0) {
                                                        c10151t3.getClass();
                                                        iM19148w9 = c10151t3.m19148w() - 1;
                                                    }
                                                }
                                                long[] jArr111 = jArrCopyOf2;
                                                int iM19129d12 = i31;
                                                j13 += (long) iM19129d12;
                                                iM19148w8--;
                                                if (iM19148w8 != 0) {
                                                }
                                                j14 += (long) iArrCopyOf[i28];
                                                i24--;
                                                i28++;
                                                jArrCopyOf2 = jArr111;
                                                iM19129d5 = i617;
                                                iMo17911b = i30;
                                                aVar2 = aVar2;
                                                i25 = iM19129d12;
                                                i26 = i32;
                                            }
                                            int i618 = i24;
                                            long j28 = j13 + ((long) iM19129d5);
                                            if (c10151t4 != null) {
                                                z15 = true;
                                                break;
                                            }
                                            while (true) {
                                                if (i27 > 0) {
                                                    z15 = true;
                                                    break;
                                                }
                                                if (c10151t4.m19148w() != 0) {
                                                    z15 = false;
                                                    break;
                                                }
                                                c10151t4.m19129d();
                                                i27--;
                                            }
                                            if (iM19148w5 != 0) {
                                                i29 = iM19148w7;
                                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                                c9488k3 = c9488k2;
                                                sb3.append(c9488k3.f48729a);
                                                sb3.append(": remainingSynchronizationSamples ");
                                                sb3.append(iM19148w5);
                                                sb3.append(", remainingSamplesAtTimestampDelta ");
                                                sb3.append(iM19148w8);
                                                sb3.append(", remainingSamplesInChunk ");
                                                sb3.append(i618);
                                                sb3.append(", remainingTimestampDeltaChanges ");
                                                sb3.append(i616);
                                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                                sb3.append(i29);
                                                if (z15) {
                                                    str2 = ", ctts invalid";
                                                } else {
                                                    str2 = str;
                                                }
                                                sb3.append(str2);
                                                C10145n.m19099g("AtomParsers", sb3.toString());
                                            } else {
                                                i29 = iM19148w7;
                                                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                                c9488k3 = c9488k2;
                                                sb4.append(c9488k3.f48729a);
                                                sb4.append(": remainingSynchronizationSamples ");
                                                sb4.append(iM19148w5);
                                                sb4.append(", remainingSamplesAtTimestampDelta ");
                                                sb4.append(iM19148w8);
                                                sb4.append(", remainingSamplesInChunk ");
                                                sb4.append(i618);
                                                sb4.append(", remainingTimestampDeltaChanges ");
                                                sb4.append(i616);
                                                sb4.append(", remainingSamplesAtTimestampOffset ");
                                                sb4.append(i29);
                                                if (z15) {
                                                    str2 = ", ctts invalid";
                                                } else {
                                                    str2 = str;
                                                }
                                                sb4.append(str2);
                                                C10145n.m19099g("AtomParsers", sb4.toString());
                                            }
                                            jArr3 = jArrCopyOf2;
                                            iArr = iArrCopyOf2;
                                            j15 = j28;
                                            jArr4 = jArrCopyOf;
                                        }
                                        jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                        j16 = c9488k3.f48731c;
                                        jArr5 = c9488k3.f48736h;
                                        if (jArr5 == null) {
                                            C10134c0.m19031P(jArr3, j16);
                                            c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                        } else {
                                            length = jArr5.length;
                                            i34 = c9488k3.f48730b;
                                            jArr6 = c9488k3.f48737i;
                                            if (length == 1) {
                                                i35 = iMo17911b;
                                                i36 = i34;
                                                jArr7 = jArr6;
                                                iArr2 = iArr;
                                                i37 = 1;
                                                if (jArr5.length == 1) {
                                                    i38 = 0;
                                                    if (jArr5[0] == 0) {
                                                        jArr7.getClass();
                                                        j20 = jArr7[0];
                                                        while (i38 < jArr3.length) {
                                                            jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                            i38++;
                                                        }
                                                        c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                    } else {
                                                        i37 = 1;
                                                    }
                                                } else {
                                                    i38 = 0;
                                                }
                                                if (i36 == i37) {
                                                    z16 = 1;
                                                } else {
                                                    z16 = i38;
                                                }
                                                iArr3 = new int[jArr5.length];
                                                iArr4 = new int[jArr5.length];
                                                jArr7.getClass();
                                                i39 = i38;
                                                i40 = i39;
                                                i41 = i40;
                                                while (i38 < jArr5.length) {
                                                    long[] jArr112 = jArr4;
                                                    j19 = jArr7[i38];
                                                    if (j19 != -1) {
                                                        int i78 = i39;
                                                        int i79 = i40;
                                                        long jM19030O7 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                        iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                        iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O7, z16);
                                                        while (true) {
                                                            i47 = iArr3[i38];
                                                            i48 = iArr4[i38];
                                                            if (i47 < i48) {
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                            iArr3[i38] = i47 + 1;
                                                        }
                                                        i40 = (i48 - i47) + i79;
                                                        i39 = i78 | (i41 == i47 ? 0 : 1);
                                                        i41 = i48;
                                                    }
                                                    i38++;
                                                    jArr4 = jArr112;
                                                    jArr5 = jArr5;
                                                    iArrCopyOf = iArrCopyOf;
                                                }
                                                iArr5 = iArrCopyOf;
                                                long[] jArr24 = jArr5;
                                                jArr8 = jArr4;
                                                i42 = i39 | (i40 == i35 ? 0 : 1);
                                                if (i42 != 0) {
                                                    jArr9 = new long[i40];
                                                } else {
                                                    jArr9 = jArr8;
                                                }
                                                if (i42 != 0) {
                                                    iArr6 = new int[i40];
                                                } else {
                                                    iArr6 = iArr5;
                                                }
                                                if (i42 != 0) {
                                                    i26 = 0;
                                                }
                                                if (i42 != 0) {
                                                    iArr7 = new int[i40];
                                                } else {
                                                    iArr7 = iArr2;
                                                }
                                                jArr10 = new long[i40];
                                                i43 = 0;
                                                j17 = 0;
                                                i44 = 0;
                                                jArr11 = jArr24;
                                                while (i44 < jArr11.length) {
                                                    j18 = jArr7[i44];
                                                    i45 = iArr3[i44];
                                                    int[] iArr15 = iArr3;
                                                    i46 = iArr4[i44];
                                                    if (i42 != 0) {
                                                        int i710 = i46 - i45;
                                                        System.arraycopy(jArr8, i45, jArr9, i43, i710);
                                                        iArr8 = iArr5;
                                                        System.arraycopy(iArr8, i45, iArr6, i43, i710);
                                                        iArr9 = iArr2;
                                                        System.arraycopy(iArr9, i45, iArr7, i43, i710);
                                                    } else {
                                                        iArr8 = iArr5;
                                                        iArr9 = iArr2;
                                                    }
                                                    int i711 = i26;
                                                    while (i45 < i46) {
                                                        int i712 = i46;
                                                        long[] jArr25 = jArr11;
                                                        long j29 = j17;
                                                        int i713 = i44;
                                                        long[] jArr26 = jArr3;
                                                        jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                        if (i42 == 0) {
                                                        }
                                                        i43++;
                                                        i45++;
                                                        jArr11 = jArr25;
                                                        jArr3 = jArr26;
                                                        i44 = i713;
                                                        j17 = j29;
                                                        i46 = i712;
                                                    }
                                                    long[] jArr27 = jArr11;
                                                    int i714 = i44;
                                                    j17 += jArr27[i714];
                                                    i44 = i714 + 1;
                                                    iArr3 = iArr15;
                                                    jArr11 = jArr27;
                                                    iArr2 = iArr9;
                                                    jArr9 = jArr9;
                                                    iArr5 = iArr8;
                                                    i26 = i711;
                                                    iArr4 = iArr4;
                                                }
                                                c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                            } else {
                                                i35 = iMo17911b;
                                                i36 = i34;
                                                jArr7 = jArr6;
                                                iArr2 = iArr;
                                                i37 = 1;
                                                if (jArr5.length == 1) {
                                                    i38 = 0;
                                                    if (jArr5[0] == 0) {
                                                        jArr7.getClass();
                                                        j20 = jArr7[0];
                                                        while (i38 < jArr3.length) {
                                                            jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                            i38++;
                                                        }
                                                        c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                    } else {
                                                        i37 = 1;
                                                    }
                                                } else {
                                                    i38 = 0;
                                                }
                                                if (i36 == i37) {
                                                    z16 = 1;
                                                } else {
                                                    z16 = i38;
                                                }
                                                iArr3 = new int[jArr5.length];
                                                iArr4 = new int[jArr5.length];
                                                jArr7.getClass();
                                                i39 = i38;
                                                i40 = i39;
                                                i41 = i40;
                                                while (i38 < jArr5.length) {
                                                    long[] jArr113 = jArr4;
                                                    j19 = jArr7[i38];
                                                    if (j19 != -1) {
                                                        int i715 = i39;
                                                        int i716 = i40;
                                                        long jM19030O8 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                        iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                        iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O8, z16);
                                                        while (true) {
                                                            i47 = iArr3[i38];
                                                            i48 = iArr4[i38];
                                                            if (i47 < i48) {
                                                                break;
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                            iArr3[i38] = i47 + 1;
                                                        }
                                                        i40 = (i48 - i47) + i716;
                                                        i39 = i715 | (i41 == i47 ? 0 : 1);
                                                        i41 = i48;
                                                    }
                                                    i38++;
                                                    jArr4 = jArr113;
                                                    jArr5 = jArr5;
                                                    iArrCopyOf = iArrCopyOf;
                                                }
                                                iArr5 = iArrCopyOf;
                                                long[] jArr28 = jArr5;
                                                jArr8 = jArr4;
                                                i42 = i39 | (i40 == i35 ? 0 : 1);
                                                if (i42 != 0) {
                                                    jArr9 = new long[i40];
                                                } else {
                                                    jArr9 = jArr8;
                                                }
                                                if (i42 != 0) {
                                                    iArr6 = new int[i40];
                                                } else {
                                                    iArr6 = iArr5;
                                                }
                                                if (i42 != 0) {
                                                    i26 = 0;
                                                }
                                                if (i42 != 0) {
                                                    iArr7 = new int[i40];
                                                } else {
                                                    iArr7 = iArr2;
                                                }
                                                jArr10 = new long[i40];
                                                i43 = 0;
                                                j17 = 0;
                                                i44 = 0;
                                                jArr11 = jArr28;
                                                while (i44 < jArr11.length) {
                                                    j18 = jArr7[i44];
                                                    i45 = iArr3[i44];
                                                    int[] iArr16 = iArr3;
                                                    i46 = iArr4[i44];
                                                    if (i42 != 0) {
                                                        int i717 = i46 - i45;
                                                        System.arraycopy(jArr8, i45, jArr9, i43, i717);
                                                        iArr8 = iArr5;
                                                        System.arraycopy(iArr8, i45, iArr6, i43, i717);
                                                        iArr9 = iArr2;
                                                        System.arraycopy(iArr9, i45, iArr7, i43, i717);
                                                    } else {
                                                        iArr8 = iArr5;
                                                        iArr9 = iArr2;
                                                    }
                                                    int i718 = i26;
                                                    while (i45 < i46) {
                                                        int i719 = i46;
                                                        long[] jArr29 = jArr11;
                                                        long j210 = j17;
                                                        int i7110 = i44;
                                                        long[] jArr210 = jArr3;
                                                        jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                        if (i42 == 0) {
                                                        }
                                                        i43++;
                                                        i45++;
                                                        jArr11 = jArr29;
                                                        jArr3 = jArr210;
                                                        i44 = i7110;
                                                        j17 = j210;
                                                        i46 = i719;
                                                    }
                                                    long[] jArr211 = jArr11;
                                                    int i7111 = i44;
                                                    j17 += jArr211[i7111];
                                                    i44 = i7111 + 1;
                                                    iArr3 = iArr16;
                                                    jArr11 = jArr211;
                                                    iArr2 = iArr9;
                                                    jArr9 = jArr9;
                                                    iArr5 = iArr8;
                                                    i26 = i718;
                                                    iArr4 = iArr4;
                                                }
                                                c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                            }
                                            c9491n2 = c9491n;
                                        }
                                    }
                                    arrayList = arrayList2;
                                    arrayList.add(c9491n2);
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            if (dVarM17907d.f48623b != null) {
                                c9488k = new C9488k(iM19129d2, i11, ((Long) pairCreate.first).longValue(), jM19146u, jM19030O, dVarM17907d.f48623b, dVarM17907d.f48625d, dVarM17907d.f48622a, dVarM17907d.f48624c, jArr, jArr2);
                                i20 = 1835626086;
                            }
                            c9488k2 = (C9488k) interfaceC10171c.apply(c9488k);
                            if (c9488k2 == null) {
                                arrayList = arrayList2;
                                i23 = i58;
                            } else {
                                AbstractC9478a.a aVarM17902b8 = aVar3.m17902b(1835297121);
                                aVarM17902b8.getClass();
                                AbstractC9478a.a aVarM17902b9 = aVarM17902b8.m17902b(i20);
                                aVarM17902b9.getClass();
                                aVarM17902b2 = aVarM17902b9.m17902b(1937007212);
                                aVarM17902b2.getClass();
                                bVarM17903c2 = aVarM17902b2.m17903c(1937011578);
                                c2416m = c9488k2.f48734f;
                                if (bVarM17903c2 != null) {
                                    fVar = new e(bVarM17903c2, c2416m);
                                } else {
                                    bVarM17903c3 = aVarM17902b2.m17903c(1937013298);
                                    if (bVarM17903c3 == null) {
                                        throw ParserException.m6770a("Track has no sample table size information", null);
                                    }
                                    fVar = new f(bVarM17903c3);
                                }
                                iMo17911b = fVar.mo17911b();
                                if (iMo17911b == 0) {
                                    c9491n2 = new C9491n(c9488k2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                    arrayList2 = arrayList2;
                                    i23 = i58;
                                } else {
                                    bVarM17903c4 = aVarM17902b2.m17903c(1937007471);
                                    if (bVarM17903c4 == null) {
                                        bVarM17903c4 = aVarM17902b2.m17903c(1668232756);
                                        bVarM17903c4.getClass();
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    AbstractC9478a.b bVarM17903c14 = aVarM17902b2.m17903c(1937011555);
                                    bVarM17903c14.getClass();
                                    AbstractC9478a.b bVarM17903c15 = aVarM17902b2.m17903c(1937011827);
                                    bVarM17903c15.getClass();
                                    bVarM17903c5 = aVarM17902b2.m17903c(1937011571);
                                    if (bVarM17903c5 != null) {
                                        c10151t3 = bVarM17903c5.f48607b;
                                    } else {
                                        c10151t3 = null;
                                    }
                                    bVarM17903c6 = aVarM17902b2.m17903c(1668576371);
                                    if (bVarM17903c6 != null) {
                                        c10151t4 = bVarM17903c6.f48607b;
                                    } else {
                                        c10151t4 = null;
                                    }
                                    aVar2 = new a(bVarM17903c14.f48607b, bVarM17903c4.f48607b, z13);
                                    C10151t c10151t9 = bVarM17903c15.f48607b;
                                    c10151t9.m19124E(12);
                                    iM19148w = c10151t9.m19148w() - 1;
                                    iM19148w2 = c10151t9.m19148w();
                                    iM19148w3 = c10151t9.m19148w();
                                    if (c10151t4 != null) {
                                        c10151t4.m19124E(12);
                                        iM19148w4 = c10151t4.m19148w();
                                    } else {
                                        iM19148w4 = 0;
                                    }
                                    if (c10151t3 != null) {
                                        c10151t3.m19124E(12);
                                        iM19148w5 = c10151t3.m19148w();
                                        if (iM19148w5 > 0) {
                                            iM19148w6 = c10151t3.m19148w() - 1;
                                            i22 = -1;
                                        } else {
                                            i21 = -1;
                                            c10151t3 = null;
                                        }
                                        iMo17910a = fVar.mo17910a();
                                        i23 = i58;
                                        String str5 = c2416m.f12484l;
                                        if (iMo17910a == i22) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            i49 = aVar2.f48609a;
                                            jArr12 = new long[i49];
                                            iArr10 = new int[i49];
                                            while (aVar2.m17909a()) {
                                                int i619 = aVar2.f48610b;
                                                jArr12[i619] = aVar2.f48612d;
                                                iArr10[i619] = aVar2.f48611c;
                                            }
                                            j21 = iM19148w3;
                                            i50 = 8192 / iMo17910a;
                                            i52 = 0;
                                            while (i51 < i49) {
                                                int i6110 = iArr10[i51];
                                                int i6111 = C10134c0.f51354a;
                                                i52 += ((i6110 + i50) - 1) / i50;
                                            }
                                            jArr4 = new long[i52];
                                            iArr11 = new int[i52];
                                            jArr13 = new long[i52];
                                            iArr = new int[i52];
                                            i53 = 0;
                                            i54 = 0;
                                            i55 = 0;
                                            i56 = 0;
                                            while (i56 < i49) {
                                                int i6112 = iArr10[i56];
                                                j22 = jArr12[i56];
                                                long[] jArr114 = jArr12;
                                                iMax = i53;
                                                int i6113 = i49;
                                                i57 = i6112;
                                                while (i57 > 0) {
                                                    int iMin3 = Math.min(i50, i57);
                                                    jArr4[i54] = j22;
                                                    int[] iArr17 = iArr10;
                                                    int i6114 = iMo17910a * iMin3;
                                                    iArr11[i54] = i6114;
                                                    iMax = Math.max(iMax, i6114);
                                                    jArr13[i54] = ((long) i55) * j21;
                                                    iArr[i54] = 1;
                                                    j22 += (long) iArr11[i54];
                                                    i55 += iMin3;
                                                    i57 -= iMin3;
                                                    i54++;
                                                    iArr10 = iArr17;
                                                    i50 = i50;
                                                }
                                                i56++;
                                                i53 = iMax;
                                                i49 = i6113;
                                                jArr12 = jArr114;
                                            }
                                            j15 = j21 * ((long) i55);
                                            iArrCopyOf = iArr11;
                                            jArr3 = jArr13;
                                            i26 = i53;
                                            c9488k3 = c9488k2;
                                        } else {
                                            jArrCopyOf = new long[iMo17911b];
                                            iArrCopyOf = new int[iMo17911b];
                                            jArrCopyOf2 = new long[iMo17911b];
                                            iArrCopyOf2 = new int[iMo17911b];
                                            i24 = 0;
                                            j13 = 0;
                                            j14 = 0;
                                            iM19129d5 = 0;
                                            iM19148w7 = 0;
                                            int i6115 = iM19148w;
                                            i25 = iM19148w3;
                                            i26 = 0;
                                            iM19148w8 = iM19148w2;
                                            iM19148w9 = iM19148w6;
                                            i27 = iM19148w4;
                                            i28 = 0;
                                            while (i28 < iMo17911b) {
                                                zM17909a = true;
                                                while (i24 == 0) {
                                                    zM17909a = aVar2.m17909a();
                                                    if (zM17909a) {
                                                        break;
                                                        break;
                                                    }
                                                    j14 = aVar2.f48612d;
                                                    i24 = aVar2.f48611c;
                                                    iMo17911b = iMo17911b;
                                                    i25 = i25;
                                                }
                                                i30 = iMo17911b;
                                                i31 = i25;
                                                if (!zM17909a) {
                                                    C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                                    iMo17911b = i28;
                                                    break;
                                                }
                                                if (c10151t4 != null) {
                                                    while (iM19148w7 == 0) {
                                                        iM19148w7 = c10151t4.m19148w();
                                                        iM19129d5 = c10151t4.m19129d();
                                                        i27--;
                                                    }
                                                    iM19148w7--;
                                                }
                                                int i6116 = iM19129d5;
                                                jArrCopyOf[i28] = j14;
                                                iMo17912c = fVar.mo17912c();
                                                iArrCopyOf[i28] = iMo17912c;
                                                if (iMo17912c > i26) {
                                                    i32 = iMo17912c;
                                                } else {
                                                    i32 = i26;
                                                }
                                                jArrCopyOf2[i28] = j13 + ((long) i6116);
                                                if (c10151t3 == null) {
                                                    i33 = 1;
                                                } else {
                                                    i33 = 0;
                                                }
                                                iArrCopyOf2[i28] = i33;
                                                if (i28 == iM19148w9) {
                                                    iArrCopyOf2[i28] = 1;
                                                    iM19148w5--;
                                                    if (iM19148w5 > 0) {
                                                        c10151t3.getClass();
                                                        iM19148w9 = c10151t3.m19148w() - 1;
                                                    }
                                                }
                                                long[] jArr115 = jArrCopyOf2;
                                                int iM19129d13 = i31;
                                                j13 += (long) iM19129d13;
                                                iM19148w8--;
                                                if (iM19148w8 != 0) {
                                                }
                                                j14 += (long) iArrCopyOf[i28];
                                                i24--;
                                                i28++;
                                                jArrCopyOf2 = jArr115;
                                                iM19129d5 = i6116;
                                                iMo17911b = i30;
                                                aVar2 = aVar2;
                                                i25 = iM19129d13;
                                                i26 = i32;
                                            }
                                            int i6117 = i24;
                                            long j211 = j13 + ((long) iM19129d5);
                                            if (c10151t4 != null) {
                                                z15 = true;
                                                break;
                                            }
                                            while (true) {
                                                if (i27 > 0) {
                                                    z15 = true;
                                                    break;
                                                }
                                                if (c10151t4.m19148w() != 0) {
                                                    z15 = false;
                                                    break;
                                                }
                                                c10151t4.m19129d();
                                                i27--;
                                            }
                                            if (iM19148w5 != 0) {
                                                i29 = iM19148w7;
                                                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                                c9488k3 = c9488k2;
                                                sb5.append(c9488k3.f48729a);
                                                sb5.append(": remainingSynchronizationSamples ");
                                                sb5.append(iM19148w5);
                                                sb5.append(", remainingSamplesAtTimestampDelta ");
                                                sb5.append(iM19148w8);
                                                sb5.append(", remainingSamplesInChunk ");
                                                sb5.append(i6117);
                                                sb5.append(", remainingTimestampDeltaChanges ");
                                                sb5.append(i6115);
                                                sb5.append(", remainingSamplesAtTimestampOffset ");
                                                sb5.append(i29);
                                                if (z15) {
                                                    str2 = ", ctts invalid";
                                                } else {
                                                    str2 = str;
                                                }
                                                sb5.append(str2);
                                                C10145n.m19099g("AtomParsers", sb5.toString());
                                            } else {
                                                i29 = iM19148w7;
                                                StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                                                c9488k3 = c9488k2;
                                                sb6.append(c9488k3.f48729a);
                                                sb6.append(": remainingSynchronizationSamples ");
                                                sb6.append(iM19148w5);
                                                sb6.append(", remainingSamplesAtTimestampDelta ");
                                                sb6.append(iM19148w8);
                                                sb6.append(", remainingSamplesInChunk ");
                                                sb6.append(i6117);
                                                sb6.append(", remainingTimestampDeltaChanges ");
                                                sb6.append(i6115);
                                                sb6.append(", remainingSamplesAtTimestampOffset ");
                                                sb6.append(i29);
                                                if (z15) {
                                                    str2 = ", ctts invalid";
                                                } else {
                                                    str2 = str;
                                                }
                                                sb6.append(str2);
                                                C10145n.m19099g("AtomParsers", sb6.toString());
                                            }
                                            jArr3 = jArrCopyOf2;
                                            iArr = iArrCopyOf2;
                                            j15 = j211;
                                            jArr4 = jArrCopyOf;
                                        }
                                        jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                        j16 = c9488k3.f48731c;
                                        jArr5 = c9488k3.f48736h;
                                        if (jArr5 == null) {
                                            C10134c0.m19031P(jArr3, j16);
                                            c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                        } else {
                                            length = jArr5.length;
                                            i34 = c9488k3.f48730b;
                                            jArr6 = c9488k3.f48737i;
                                            if (length == 1) {
                                                i35 = iMo17911b;
                                                i36 = i34;
                                                jArr7 = jArr6;
                                                iArr2 = iArr;
                                                i37 = 1;
                                                if (jArr5.length == 1) {
                                                    i38 = 0;
                                                    if (jArr5[0] == 0) {
                                                        jArr7.getClass();
                                                        j20 = jArr7[0];
                                                        while (i38 < jArr3.length) {
                                                            jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                            i38++;
                                                        }
                                                        c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                    } else {
                                                        i37 = 1;
                                                    }
                                                } else {
                                                    i38 = 0;
                                                }
                                                if (i36 == i37) {
                                                    z16 = 1;
                                                } else {
                                                    z16 = i38;
                                                }
                                                iArr3 = new int[jArr5.length];
                                                iArr4 = new int[jArr5.length];
                                                jArr7.getClass();
                                                i39 = i38;
                                                i40 = i39;
                                                i41 = i40;
                                                while (i38 < jArr5.length) {
                                                    long[] jArr116 = jArr4;
                                                    j19 = jArr7[i38];
                                                    if (j19 != -1) {
                                                        int i7112 = i39;
                                                        int i7113 = i40;
                                                        long jM19030O9 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                        iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                        iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O9, z16);
                                                        while (true) {
                                                            i47 = iArr3[i38];
                                                            i48 = iArr4[i38];
                                                            if (i47 < i48) {
                                                                break;
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                            iArr3[i38] = i47 + 1;
                                                        }
                                                        i40 = (i48 - i47) + i7113;
                                                        i39 = i7112 | (i41 == i47 ? 0 : 1);
                                                        i41 = i48;
                                                    }
                                                    i38++;
                                                    jArr4 = jArr116;
                                                    jArr5 = jArr5;
                                                    iArrCopyOf = iArrCopyOf;
                                                }
                                                iArr5 = iArrCopyOf;
                                                long[] jArr212 = jArr5;
                                                jArr8 = jArr4;
                                                i42 = i39 | (i40 == i35 ? 0 : 1);
                                                if (i42 != 0) {
                                                    jArr9 = new long[i40];
                                                } else {
                                                    jArr9 = jArr8;
                                                }
                                                if (i42 != 0) {
                                                    iArr6 = new int[i40];
                                                } else {
                                                    iArr6 = iArr5;
                                                }
                                                if (i42 != 0) {
                                                    i26 = 0;
                                                }
                                                if (i42 != 0) {
                                                    iArr7 = new int[i40];
                                                } else {
                                                    iArr7 = iArr2;
                                                }
                                                jArr10 = new long[i40];
                                                i43 = 0;
                                                j17 = 0;
                                                i44 = 0;
                                                jArr11 = jArr212;
                                                while (i44 < jArr11.length) {
                                                    j18 = jArr7[i44];
                                                    i45 = iArr3[i44];
                                                    int[] iArr18 = iArr3;
                                                    i46 = iArr4[i44];
                                                    if (i42 != 0) {
                                                        int i7114 = i46 - i45;
                                                        System.arraycopy(jArr8, i45, jArr9, i43, i7114);
                                                        iArr8 = iArr5;
                                                        System.arraycopy(iArr8, i45, iArr6, i43, i7114);
                                                        iArr9 = iArr2;
                                                        System.arraycopy(iArr9, i45, iArr7, i43, i7114);
                                                    } else {
                                                        iArr8 = iArr5;
                                                        iArr9 = iArr2;
                                                    }
                                                    int i7115 = i26;
                                                    while (i45 < i46) {
                                                        int i7116 = i46;
                                                        long[] jArr213 = jArr11;
                                                        long j212 = j17;
                                                        int i7117 = i44;
                                                        long[] jArr214 = jArr3;
                                                        jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                        if (i42 == 0) {
                                                        }
                                                        i43++;
                                                        i45++;
                                                        jArr11 = jArr213;
                                                        jArr3 = jArr214;
                                                        i44 = i7117;
                                                        j17 = j212;
                                                        i46 = i7116;
                                                    }
                                                    long[] jArr215 = jArr11;
                                                    int i7118 = i44;
                                                    j17 += jArr215[i7118];
                                                    i44 = i7118 + 1;
                                                    iArr3 = iArr18;
                                                    jArr11 = jArr215;
                                                    iArr2 = iArr9;
                                                    jArr9 = jArr9;
                                                    iArr5 = iArr8;
                                                    i26 = i7115;
                                                    iArr4 = iArr4;
                                                }
                                                c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                            } else {
                                                i35 = iMo17911b;
                                                i36 = i34;
                                                jArr7 = jArr6;
                                                iArr2 = iArr;
                                                i37 = 1;
                                                if (jArr5.length == 1) {
                                                    i38 = 0;
                                                    if (jArr5[0] == 0) {
                                                        jArr7.getClass();
                                                        j20 = jArr7[0];
                                                        while (i38 < jArr3.length) {
                                                            jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                            i38++;
                                                        }
                                                        c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                    } else {
                                                        i37 = 1;
                                                    }
                                                } else {
                                                    i38 = 0;
                                                }
                                                if (i36 == i37) {
                                                    z16 = 1;
                                                } else {
                                                    z16 = i38;
                                                }
                                                iArr3 = new int[jArr5.length];
                                                iArr4 = new int[jArr5.length];
                                                jArr7.getClass();
                                                i39 = i38;
                                                i40 = i39;
                                                i41 = i40;
                                                while (i38 < jArr5.length) {
                                                    long[] jArr117 = jArr4;
                                                    j19 = jArr7[i38];
                                                    if (j19 != -1) {
                                                        int i7119 = i39;
                                                        int i71110 = i40;
                                                        long jM19030O10 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                        iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                        iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O10, z16);
                                                        while (true) {
                                                            i47 = iArr3[i38];
                                                            i48 = iArr4[i38];
                                                            if (i47 < i48) {
                                                                break;
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                            iArr3[i38] = i47 + 1;
                                                        }
                                                        i40 = (i48 - i47) + i71110;
                                                        i39 = i7119 | (i41 == i47 ? 0 : 1);
                                                        i41 = i48;
                                                    }
                                                    i38++;
                                                    jArr4 = jArr117;
                                                    jArr5 = jArr5;
                                                    iArrCopyOf = iArrCopyOf;
                                                }
                                                iArr5 = iArrCopyOf;
                                                long[] jArr216 = jArr5;
                                                jArr8 = jArr4;
                                                i42 = i39 | (i40 == i35 ? 0 : 1);
                                                if (i42 != 0) {
                                                    jArr9 = new long[i40];
                                                } else {
                                                    jArr9 = jArr8;
                                                }
                                                if (i42 != 0) {
                                                    iArr6 = new int[i40];
                                                } else {
                                                    iArr6 = iArr5;
                                                }
                                                if (i42 != 0) {
                                                    i26 = 0;
                                                }
                                                if (i42 != 0) {
                                                    iArr7 = new int[i40];
                                                } else {
                                                    iArr7 = iArr2;
                                                }
                                                jArr10 = new long[i40];
                                                i43 = 0;
                                                j17 = 0;
                                                i44 = 0;
                                                jArr11 = jArr216;
                                                while (i44 < jArr11.length) {
                                                    j18 = jArr7[i44];
                                                    i45 = iArr3[i44];
                                                    int[] iArr19 = iArr3;
                                                    i46 = iArr4[i44];
                                                    if (i42 != 0) {
                                                        int i71111 = i46 - i45;
                                                        System.arraycopy(jArr8, i45, jArr9, i43, i71111);
                                                        iArr8 = iArr5;
                                                        System.arraycopy(iArr8, i45, iArr6, i43, i71111);
                                                        iArr9 = iArr2;
                                                        System.arraycopy(iArr9, i45, iArr7, i43, i71111);
                                                    } else {
                                                        iArr8 = iArr5;
                                                        iArr9 = iArr2;
                                                    }
                                                    int i71112 = i26;
                                                    while (i45 < i46) {
                                                        int i71113 = i46;
                                                        long[] jArr217 = jArr11;
                                                        long j213 = j17;
                                                        int i71114 = i44;
                                                        long[] jArr218 = jArr3;
                                                        jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                        if (i42 == 0) {
                                                        }
                                                        i43++;
                                                        i45++;
                                                        jArr11 = jArr217;
                                                        jArr3 = jArr218;
                                                        i44 = i71114;
                                                        j17 = j213;
                                                        i46 = i71113;
                                                    }
                                                    long[] jArr219 = jArr11;
                                                    int i71115 = i44;
                                                    j17 += jArr219[i71115];
                                                    i44 = i71115 + 1;
                                                    iArr3 = iArr19;
                                                    jArr11 = jArr219;
                                                    iArr2 = iArr9;
                                                    jArr9 = jArr9;
                                                    iArr5 = iArr8;
                                                    i26 = i71112;
                                                    iArr4 = iArr4;
                                                }
                                                c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                            }
                                            c9491n2 = c9491n;
                                        }
                                    } else {
                                        i21 = -1;
                                        iM19148w5 = 0;
                                    }
                                    i22 = i21;
                                    iM19148w6 = i22;
                                    iMo17910a = fVar.mo17910a();
                                    i23 = i58;
                                    String str6 = c2416m.f12484l;
                                    if (iMo17910a == i22) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        i49 = aVar2.f48609a;
                                        jArr12 = new long[i49];
                                        iArr10 = new int[i49];
                                        while (aVar2.m17909a()) {
                                            int i6118 = aVar2.f48610b;
                                            jArr12[i6118] = aVar2.f48612d;
                                            iArr10[i6118] = aVar2.f48611c;
                                        }
                                        j21 = iM19148w3;
                                        i50 = 8192 / iMo17910a;
                                        i52 = 0;
                                        while (i51 < i49) {
                                            int i6119 = iArr10[i51];
                                            int i61110 = C10134c0.f51354a;
                                            i52 += ((i6119 + i50) - 1) / i50;
                                        }
                                        jArr4 = new long[i52];
                                        iArr11 = new int[i52];
                                        jArr13 = new long[i52];
                                        iArr = new int[i52];
                                        i53 = 0;
                                        i54 = 0;
                                        i55 = 0;
                                        i56 = 0;
                                        while (i56 < i49) {
                                            int i61111 = iArr10[i56];
                                            j22 = jArr12[i56];
                                            long[] jArr118 = jArr12;
                                            iMax = i53;
                                            int i61112 = i49;
                                            i57 = i61111;
                                            while (i57 > 0) {
                                                int iMin4 = Math.min(i50, i57);
                                                jArr4[i54] = j22;
                                                int[] iArr110 = iArr10;
                                                int i61113 = iMo17910a * iMin4;
                                                iArr11[i54] = i61113;
                                                iMax = Math.max(iMax, i61113);
                                                jArr13[i54] = ((long) i55) * j21;
                                                iArr[i54] = 1;
                                                j22 += (long) iArr11[i54];
                                                i55 += iMin4;
                                                i57 -= iMin4;
                                                i54++;
                                                iArr10 = iArr110;
                                                i50 = i50;
                                            }
                                            i56++;
                                            i53 = iMax;
                                            i49 = i61112;
                                            jArr12 = jArr118;
                                        }
                                        j15 = j21 * ((long) i55);
                                        iArrCopyOf = iArr11;
                                        jArr3 = jArr13;
                                        i26 = i53;
                                        c9488k3 = c9488k2;
                                    } else {
                                        jArrCopyOf = new long[iMo17911b];
                                        iArrCopyOf = new int[iMo17911b];
                                        jArrCopyOf2 = new long[iMo17911b];
                                        iArrCopyOf2 = new int[iMo17911b];
                                        i24 = 0;
                                        j13 = 0;
                                        j14 = 0;
                                        iM19129d5 = 0;
                                        iM19148w7 = 0;
                                        int i61114 = iM19148w;
                                        i25 = iM19148w3;
                                        i26 = 0;
                                        iM19148w8 = iM19148w2;
                                        iM19148w9 = iM19148w6;
                                        i27 = iM19148w4;
                                        i28 = 0;
                                        while (i28 < iMo17911b) {
                                            zM17909a = true;
                                            while (i24 == 0) {
                                                zM17909a = aVar2.m17909a();
                                                if (zM17909a) {
                                                    break;
                                                    break;
                                                }
                                                j14 = aVar2.f48612d;
                                                i24 = aVar2.f48611c;
                                                iMo17911b = iMo17911b;
                                                i25 = i25;
                                            }
                                            i30 = iMo17911b;
                                            i31 = i25;
                                            if (!zM17909a) {
                                                C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                                iMo17911b = i28;
                                                break;
                                            }
                                            if (c10151t4 != null) {
                                                while (iM19148w7 == 0) {
                                                    iM19148w7 = c10151t4.m19148w();
                                                    iM19129d5 = c10151t4.m19129d();
                                                    i27--;
                                                }
                                                iM19148w7--;
                                            }
                                            int i61115 = iM19129d5;
                                            jArrCopyOf[i28] = j14;
                                            iMo17912c = fVar.mo17912c();
                                            iArrCopyOf[i28] = iMo17912c;
                                            if (iMo17912c > i26) {
                                                i32 = iMo17912c;
                                            } else {
                                                i32 = i26;
                                            }
                                            jArrCopyOf2[i28] = j13 + ((long) i61115);
                                            if (c10151t3 == null) {
                                                i33 = 1;
                                            } else {
                                                i33 = 0;
                                            }
                                            iArrCopyOf2[i28] = i33;
                                            if (i28 == iM19148w9) {
                                                iArrCopyOf2[i28] = 1;
                                                iM19148w5--;
                                                if (iM19148w5 > 0) {
                                                    c10151t3.getClass();
                                                    iM19148w9 = c10151t3.m19148w() - 1;
                                                }
                                            }
                                            long[] jArr119 = jArrCopyOf2;
                                            int iM19129d14 = i31;
                                            j13 += (long) iM19129d14;
                                            iM19148w8--;
                                            if (iM19148w8 != 0) {
                                            }
                                            j14 += (long) iArrCopyOf[i28];
                                            i24--;
                                            i28++;
                                            jArrCopyOf2 = jArr119;
                                            iM19129d5 = i61115;
                                            iMo17911b = i30;
                                            aVar2 = aVar2;
                                            i25 = iM19129d14;
                                            i26 = i32;
                                        }
                                        int i61116 = i24;
                                        long j214 = j13 + ((long) iM19129d5);
                                        if (c10151t4 != null) {
                                            z15 = true;
                                            break;
                                        }
                                        while (true) {
                                            if (i27 > 0) {
                                                z15 = true;
                                                break;
                                            }
                                            if (c10151t4.m19148w() != 0) {
                                                z15 = false;
                                                break;
                                            }
                                            c10151t4.m19129d();
                                            i27--;
                                        }
                                        if (iM19148w5 != 0) {
                                            i29 = iM19148w7;
                                            StringBuilder sb7 = new StringBuilder("Inconsistent stbl box for track ");
                                            c9488k3 = c9488k2;
                                            sb7.append(c9488k3.f48729a);
                                            sb7.append(": remainingSynchronizationSamples ");
                                            sb7.append(iM19148w5);
                                            sb7.append(", remainingSamplesAtTimestampDelta ");
                                            sb7.append(iM19148w8);
                                            sb7.append(", remainingSamplesInChunk ");
                                            sb7.append(i61116);
                                            sb7.append(", remainingTimestampDeltaChanges ");
                                            sb7.append(i61114);
                                            sb7.append(", remainingSamplesAtTimestampOffset ");
                                            sb7.append(i29);
                                            if (z15) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = str;
                                            }
                                            sb7.append(str2);
                                            C10145n.m19099g("AtomParsers", sb7.toString());
                                        } else {
                                            i29 = iM19148w7;
                                            StringBuilder sb8 = new StringBuilder("Inconsistent stbl box for track ");
                                            c9488k3 = c9488k2;
                                            sb8.append(c9488k3.f48729a);
                                            sb8.append(": remainingSynchronizationSamples ");
                                            sb8.append(iM19148w5);
                                            sb8.append(", remainingSamplesAtTimestampDelta ");
                                            sb8.append(iM19148w8);
                                            sb8.append(", remainingSamplesInChunk ");
                                            sb8.append(i61116);
                                            sb8.append(", remainingTimestampDeltaChanges ");
                                            sb8.append(i61114);
                                            sb8.append(", remainingSamplesAtTimestampOffset ");
                                            sb8.append(i29);
                                            if (z15) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = str;
                                            }
                                            sb8.append(str2);
                                            C10145n.m19099g("AtomParsers", sb8.toString());
                                        }
                                        jArr3 = jArrCopyOf2;
                                        iArr = iArrCopyOf2;
                                        j15 = j214;
                                        jArr4 = jArrCopyOf;
                                    }
                                    jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                    j16 = c9488k3.f48731c;
                                    jArr5 = c9488k3.f48736h;
                                    if (jArr5 == null) {
                                        C10134c0.m19031P(jArr3, j16);
                                        c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                    } else {
                                        length = jArr5.length;
                                        i34 = c9488k3.f48730b;
                                        jArr6 = c9488k3.f48737i;
                                        if (length == 1) {
                                            i35 = iMo17911b;
                                            i36 = i34;
                                            jArr7 = jArr6;
                                            iArr2 = iArr;
                                            i37 = 1;
                                            if (jArr5.length == 1) {
                                                i38 = 0;
                                                if (jArr5[0] == 0) {
                                                    jArr7.getClass();
                                                    j20 = jArr7[0];
                                                    while (i38 < jArr3.length) {
                                                        jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                        i38++;
                                                    }
                                                    c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                } else {
                                                    i37 = 1;
                                                }
                                            } else {
                                                i38 = 0;
                                            }
                                            if (i36 == i37) {
                                                z16 = 1;
                                            } else {
                                                z16 = i38;
                                            }
                                            iArr3 = new int[jArr5.length];
                                            iArr4 = new int[jArr5.length];
                                            jArr7.getClass();
                                            i39 = i38;
                                            i40 = i39;
                                            i41 = i40;
                                            while (i38 < jArr5.length) {
                                                long[] jArr1110 = jArr4;
                                                j19 = jArr7[i38];
                                                if (j19 != -1) {
                                                    int i71116 = i39;
                                                    int i71117 = i40;
                                                    long jM19030O11 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                    iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                    iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O11, z16);
                                                    while (true) {
                                                        i47 = iArr3[i38];
                                                        i48 = iArr4[i38];
                                                        if (i47 < i48) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr3[i38] = i47 + 1;
                                                    }
                                                    i40 = (i48 - i47) + i71117;
                                                    i39 = i71116 | (i41 == i47 ? 0 : 1);
                                                    i41 = i48;
                                                }
                                                i38++;
                                                jArr4 = jArr1110;
                                                jArr5 = jArr5;
                                                iArrCopyOf = iArrCopyOf;
                                            }
                                            iArr5 = iArrCopyOf;
                                            long[] jArr2110 = jArr5;
                                            jArr8 = jArr4;
                                            i42 = i39 | (i40 == i35 ? 0 : 1);
                                            if (i42 != 0) {
                                                jArr9 = new long[i40];
                                            } else {
                                                jArr9 = jArr8;
                                            }
                                            if (i42 != 0) {
                                                iArr6 = new int[i40];
                                            } else {
                                                iArr6 = iArr5;
                                            }
                                            if (i42 != 0) {
                                                i26 = 0;
                                            }
                                            if (i42 != 0) {
                                                iArr7 = new int[i40];
                                            } else {
                                                iArr7 = iArr2;
                                            }
                                            jArr10 = new long[i40];
                                            i43 = 0;
                                            j17 = 0;
                                            i44 = 0;
                                            jArr11 = jArr2110;
                                            while (i44 < jArr11.length) {
                                                j18 = jArr7[i44];
                                                i45 = iArr3[i44];
                                                int[] iArr111 = iArr3;
                                                i46 = iArr4[i44];
                                                if (i42 != 0) {
                                                    int i71118 = i46 - i45;
                                                    System.arraycopy(jArr8, i45, jArr9, i43, i71118);
                                                    iArr8 = iArr5;
                                                    System.arraycopy(iArr8, i45, iArr6, i43, i71118);
                                                    iArr9 = iArr2;
                                                    System.arraycopy(iArr9, i45, iArr7, i43, i71118);
                                                } else {
                                                    iArr8 = iArr5;
                                                    iArr9 = iArr2;
                                                }
                                                int i71119 = i26;
                                                while (i45 < i46) {
                                                    int i711110 = i46;
                                                    long[] jArr2111 = jArr11;
                                                    long j215 = j17;
                                                    int i711111 = i44;
                                                    long[] jArr2112 = jArr3;
                                                    jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                    if (i42 == 0) {
                                                    }
                                                    i43++;
                                                    i45++;
                                                    jArr11 = jArr2111;
                                                    jArr3 = jArr2112;
                                                    i44 = i711111;
                                                    j17 = j215;
                                                    i46 = i711110;
                                                }
                                                long[] jArr2113 = jArr11;
                                                int i711112 = i44;
                                                j17 += jArr2113[i711112];
                                                i44 = i711112 + 1;
                                                iArr3 = iArr111;
                                                jArr11 = jArr2113;
                                                iArr2 = iArr9;
                                                jArr9 = jArr9;
                                                iArr5 = iArr8;
                                                i26 = i71119;
                                                iArr4 = iArr4;
                                            }
                                            c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                        } else {
                                            i35 = iMo17911b;
                                            i36 = i34;
                                            jArr7 = jArr6;
                                            iArr2 = iArr;
                                            i37 = 1;
                                            if (jArr5.length == 1) {
                                                i38 = 0;
                                                if (jArr5[0] == 0) {
                                                    jArr7.getClass();
                                                    j20 = jArr7[0];
                                                    while (i38 < jArr3.length) {
                                                        jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                        i38++;
                                                    }
                                                    c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                } else {
                                                    i37 = 1;
                                                }
                                            } else {
                                                i38 = 0;
                                            }
                                            if (i36 == i37) {
                                                z16 = 1;
                                            } else {
                                                z16 = i38;
                                            }
                                            iArr3 = new int[jArr5.length];
                                            iArr4 = new int[jArr5.length];
                                            jArr7.getClass();
                                            i39 = i38;
                                            i40 = i39;
                                            i41 = i40;
                                            while (i38 < jArr5.length) {
                                                long[] jArr1111 = jArr4;
                                                j19 = jArr7[i38];
                                                if (j19 != -1) {
                                                    int i711113 = i39;
                                                    int i711114 = i40;
                                                    long jM19030O12 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                    iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                    iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O12, z16);
                                                    while (true) {
                                                        i47 = iArr3[i38];
                                                        i48 = iArr4[i38];
                                                        if (i47 < i48) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr3[i38] = i47 + 1;
                                                    }
                                                    i40 = (i48 - i47) + i711114;
                                                    i39 = i711113 | (i41 == i47 ? 0 : 1);
                                                    i41 = i48;
                                                }
                                                i38++;
                                                jArr4 = jArr1111;
                                                jArr5 = jArr5;
                                                iArrCopyOf = iArrCopyOf;
                                            }
                                            iArr5 = iArrCopyOf;
                                            long[] jArr2114 = jArr5;
                                            jArr8 = jArr4;
                                            i42 = i39 | (i40 == i35 ? 0 : 1);
                                            if (i42 != 0) {
                                                jArr9 = new long[i40];
                                            } else {
                                                jArr9 = jArr8;
                                            }
                                            if (i42 != 0) {
                                                iArr6 = new int[i40];
                                            } else {
                                                iArr6 = iArr5;
                                            }
                                            if (i42 != 0) {
                                                i26 = 0;
                                            }
                                            if (i42 != 0) {
                                                iArr7 = new int[i40];
                                            } else {
                                                iArr7 = iArr2;
                                            }
                                            jArr10 = new long[i40];
                                            i43 = 0;
                                            j17 = 0;
                                            i44 = 0;
                                            jArr11 = jArr2114;
                                            while (i44 < jArr11.length) {
                                                j18 = jArr7[i44];
                                                i45 = iArr3[i44];
                                                int[] iArr112 = iArr3;
                                                i46 = iArr4[i44];
                                                if (i42 != 0) {
                                                    int i711115 = i46 - i45;
                                                    System.arraycopy(jArr8, i45, jArr9, i43, i711115);
                                                    iArr8 = iArr5;
                                                    System.arraycopy(iArr8, i45, iArr6, i43, i711115);
                                                    iArr9 = iArr2;
                                                    System.arraycopy(iArr9, i45, iArr7, i43, i711115);
                                                } else {
                                                    iArr8 = iArr5;
                                                    iArr9 = iArr2;
                                                }
                                                int i711116 = i26;
                                                while (i45 < i46) {
                                                    int i711117 = i46;
                                                    long[] jArr2115 = jArr11;
                                                    long j216 = j17;
                                                    int i711118 = i44;
                                                    long[] jArr2116 = jArr3;
                                                    jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                    if (i42 == 0) {
                                                    }
                                                    i43++;
                                                    i45++;
                                                    jArr11 = jArr2115;
                                                    jArr3 = jArr2116;
                                                    i44 = i711118;
                                                    j17 = j216;
                                                    i46 = i711117;
                                                }
                                                long[] jArr2117 = jArr11;
                                                int i711119 = i44;
                                                j17 += jArr2117[i711119];
                                                i44 = i711119 + 1;
                                                iArr3 = iArr112;
                                                jArr11 = jArr2117;
                                                iArr2 = iArr9;
                                                jArr9 = jArr9;
                                                iArr5 = iArr8;
                                                i26 = i711116;
                                                iArr4 = iArr4;
                                            }
                                            c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                        }
                                        c9491n2 = c9491n;
                                    }
                                }
                                arrayList = arrayList2;
                                arrayList.add(c9491n2);
                            }
                        }
                        i15 = 16;
                        jM19149x = -9223372036854775807L;
                        c10151t.m19125F(i15);
                        iM19129d3 = c10151t.m19129d();
                        int iM19129d15 = c10151t.m19129d();
                        c10151t.m19125F(4);
                        int iM19129d16 = c10151t.m19129d();
                        int iM19129d17 = c10151t.m19129d();
                        j11 = jM19149x;
                        if (iM19129d3 != 0) {
                            if (iM19129d3 != 0) {
                                if (iM19129d3 != -65536) {
                                    i16 = 0;
                                } else {
                                    i16 = 0;
                                }
                            } else if (iM19129d3 != -65536) {
                                i16 = 0;
                            } else {
                                i16 = 0;
                            }
                        } else if (iM19129d3 != 0) {
                            if (iM19129d3 != -65536) {
                                i16 = 0;
                            } else {
                                i16 = 0;
                            }
                        } else if (iM19129d3 != -65536) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                        if (j10 == -9223372036854775807L) {
                            j12 = j11;
                        } else {
                            j12 = j10;
                        }
                        c10151t2 = bVarM17903c7.f48607b;
                        c10151t2.m19124E(8);
                        if (((c10151t2.m19129d() >> 24) & 255) == 0) {
                            i17 = 8;
                        } else {
                            i17 = 16;
                        }
                        c10151t2.m19125F(i17);
                        jM19146u = c10151t2.m19146u();
                        jM19030O = j12 != -9223372036854775807L ? C10134c0.m19030O(j12, 1000000L, jM19146u) : -9223372036854775807L;
                        AbstractC9478a.a aVarM17902b10 = aVarM17902b3.m17902b(1835626086);
                        aVarM17902b10.getClass();
                        AbstractC9478a.a aVarM17902b11 = aVarM17902b10.m17902b(1937007212);
                        aVarM17902b11.getClass();
                        AbstractC9478a.b bVarM17903c16 = aVarM17902b3.m17903c(1835296868);
                        bVarM17903c16.getClass();
                        C10151t c10151t10 = bVarM17903c16.f48607b;
                        c10151t10.m19124E(8);
                        iM19129d4 = (c10151t10.m19129d() >> 24) & 255;
                        if (iM19129d4 == 0) {
                            i18 = 8;
                        } else {
                            i18 = 16;
                        }
                        c10151t10.m19125F(i18);
                        long jM19146u3 = c10151t10.m19146u();
                        if (iM19129d4 == 0) {
                            i19 = 4;
                        } else {
                            i19 = 8;
                        }
                        c10151t10.m19125F(i19);
                        int iM19150y2 = c10151t10.m19150y();
                        pairCreate = Pair.create(Long.valueOf(jM19146u3), "" + ((char) (((iM19150y2 >> 10) & 31) + 96)) + ((char) (((iM19150y2 >> 5) & 31) + 96)) + ((char) ((iM19150y2 & 31) + 96)));
                        bVarM17903c = aVarM17902b11.m17903c(1937011556);
                        if (bVarM17903c != null) {
                            throw ParserException.m6770a("Malformed sample table (stbl) missing sample description (stsd)", null);
                        }
                        dVarM17907d = m17907d(bVarM17903c.f48607b, iM19129d2, i16, (String) pairCreate.second, drmInitData, z11);
                        if (z10) {
                            str = "";
                            jArr = null;
                            jArr2 = null;
                        } else {
                            str = "";
                            jArr = null;
                            jArr2 = null;
                        }
                        if (dVarM17907d.f48623b != null) {
                            c9488k = new C9488k(iM19129d2, i11, ((Long) pairCreate.first).longValue(), jM19146u, jM19030O, dVarM17907d.f48623b, dVarM17907d.f48625d, dVarM17907d.f48622a, dVarM17907d.f48624c, jArr, jArr2);
                            i20 = 1835626086;
                        }
                        c9488k2 = (C9488k) interfaceC10171c.apply(c9488k);
                        if (c9488k2 == null) {
                            arrayList = arrayList2;
                            i23 = i58;
                        } else {
                            AbstractC9478a.a aVarM17902b12 = aVar3.m17902b(1835297121);
                            aVarM17902b12.getClass();
                            AbstractC9478a.a aVarM17902b13 = aVarM17902b12.m17902b(i20);
                            aVarM17902b13.getClass();
                            aVarM17902b2 = aVarM17902b13.m17902b(1937007212);
                            aVarM17902b2.getClass();
                            bVarM17903c2 = aVarM17902b2.m17903c(1937011578);
                            c2416m = c9488k2.f48734f;
                            if (bVarM17903c2 != null) {
                                fVar = new e(bVarM17903c2, c2416m);
                            } else {
                                bVarM17903c3 = aVarM17902b2.m17903c(1937013298);
                                if (bVarM17903c3 == null) {
                                    throw ParserException.m6770a("Track has no sample table size information", null);
                                }
                                fVar = new f(bVarM17903c3);
                            }
                            iMo17911b = fVar.mo17911b();
                            if (iMo17911b == 0) {
                                c9491n2 = new C9491n(c9488k2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                arrayList2 = arrayList2;
                                i23 = i58;
                            } else {
                                bVarM17903c4 = aVarM17902b2.m17903c(1937007471);
                                if (bVarM17903c4 == null) {
                                    bVarM17903c4 = aVarM17902b2.m17903c(1668232756);
                                    bVarM17903c4.getClass();
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                AbstractC9478a.b bVarM17903c17 = aVarM17902b2.m17903c(1937011555);
                                bVarM17903c17.getClass();
                                AbstractC9478a.b bVarM17903c18 = aVarM17902b2.m17903c(1937011827);
                                bVarM17903c18.getClass();
                                bVarM17903c5 = aVarM17902b2.m17903c(1937011571);
                                if (bVarM17903c5 != null) {
                                    c10151t3 = bVarM17903c5.f48607b;
                                } else {
                                    c10151t3 = null;
                                }
                                bVarM17903c6 = aVarM17902b2.m17903c(1668576371);
                                if (bVarM17903c6 != null) {
                                    c10151t4 = bVarM17903c6.f48607b;
                                } else {
                                    c10151t4 = null;
                                }
                                aVar2 = new a(bVarM17903c17.f48607b, bVarM17903c4.f48607b, z13);
                                C10151t c10151t11 = bVarM17903c18.f48607b;
                                c10151t11.m19124E(12);
                                iM19148w = c10151t11.m19148w() - 1;
                                iM19148w2 = c10151t11.m19148w();
                                iM19148w3 = c10151t11.m19148w();
                                if (c10151t4 != null) {
                                    c10151t4.m19124E(12);
                                    iM19148w4 = c10151t4.m19148w();
                                } else {
                                    iM19148w4 = 0;
                                }
                                if (c10151t3 != null) {
                                    c10151t3.m19124E(12);
                                    iM19148w5 = c10151t3.m19148w();
                                    if (iM19148w5 > 0) {
                                        iM19148w6 = c10151t3.m19148w() - 1;
                                        i22 = -1;
                                    } else {
                                        i21 = -1;
                                        c10151t3 = null;
                                    }
                                    iMo17910a = fVar.mo17910a();
                                    i23 = i58;
                                    String str7 = c2416m.f12484l;
                                    if (iMo17910a == i22) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        i49 = aVar2.f48609a;
                                        jArr12 = new long[i49];
                                        iArr10 = new int[i49];
                                        while (aVar2.m17909a()) {
                                            int i61117 = aVar2.f48610b;
                                            jArr12[i61117] = aVar2.f48612d;
                                            iArr10[i61117] = aVar2.f48611c;
                                        }
                                        j21 = iM19148w3;
                                        i50 = 8192 / iMo17910a;
                                        i52 = 0;
                                        while (i51 < i49) {
                                            int i61118 = iArr10[i51];
                                            int i61119 = C10134c0.f51354a;
                                            i52 += ((i61118 + i50) - 1) / i50;
                                        }
                                        jArr4 = new long[i52];
                                        iArr11 = new int[i52];
                                        jArr13 = new long[i52];
                                        iArr = new int[i52];
                                        i53 = 0;
                                        i54 = 0;
                                        i55 = 0;
                                        i56 = 0;
                                        while (i56 < i49) {
                                            int i611110 = iArr10[i56];
                                            j22 = jArr12[i56];
                                            long[] jArr1112 = jArr12;
                                            iMax = i53;
                                            int i611111 = i49;
                                            i57 = i611110;
                                            while (i57 > 0) {
                                                int iMin5 = Math.min(i50, i57);
                                                jArr4[i54] = j22;
                                                int[] iArr113 = iArr10;
                                                int i611112 = iMo17910a * iMin5;
                                                iArr11[i54] = i611112;
                                                iMax = Math.max(iMax, i611112);
                                                jArr13[i54] = ((long) i55) * j21;
                                                iArr[i54] = 1;
                                                j22 += (long) iArr11[i54];
                                                i55 += iMin5;
                                                i57 -= iMin5;
                                                i54++;
                                                iArr10 = iArr113;
                                                i50 = i50;
                                            }
                                            i56++;
                                            i53 = iMax;
                                            i49 = i611111;
                                            jArr12 = jArr1112;
                                        }
                                        j15 = j21 * ((long) i55);
                                        iArrCopyOf = iArr11;
                                        jArr3 = jArr13;
                                        i26 = i53;
                                        c9488k3 = c9488k2;
                                    } else {
                                        jArrCopyOf = new long[iMo17911b];
                                        iArrCopyOf = new int[iMo17911b];
                                        jArrCopyOf2 = new long[iMo17911b];
                                        iArrCopyOf2 = new int[iMo17911b];
                                        i24 = 0;
                                        j13 = 0;
                                        j14 = 0;
                                        iM19129d5 = 0;
                                        iM19148w7 = 0;
                                        int i611113 = iM19148w;
                                        i25 = iM19148w3;
                                        i26 = 0;
                                        iM19148w8 = iM19148w2;
                                        iM19148w9 = iM19148w6;
                                        i27 = iM19148w4;
                                        i28 = 0;
                                        while (i28 < iMo17911b) {
                                            zM17909a = true;
                                            while (i24 == 0) {
                                                zM17909a = aVar2.m17909a();
                                                if (zM17909a) {
                                                    break;
                                                    break;
                                                }
                                                j14 = aVar2.f48612d;
                                                i24 = aVar2.f48611c;
                                                iMo17911b = iMo17911b;
                                                i25 = i25;
                                            }
                                            i30 = iMo17911b;
                                            i31 = i25;
                                            if (!zM17909a) {
                                                C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                                iMo17911b = i28;
                                                break;
                                            }
                                            if (c10151t4 != null) {
                                                while (iM19148w7 == 0) {
                                                    iM19148w7 = c10151t4.m19148w();
                                                    iM19129d5 = c10151t4.m19129d();
                                                    i27--;
                                                }
                                                iM19148w7--;
                                            }
                                            int i611114 = iM19129d5;
                                            jArrCopyOf[i28] = j14;
                                            iMo17912c = fVar.mo17912c();
                                            iArrCopyOf[i28] = iMo17912c;
                                            if (iMo17912c > i26) {
                                                i32 = iMo17912c;
                                            } else {
                                                i32 = i26;
                                            }
                                            jArrCopyOf2[i28] = j13 + ((long) i611114);
                                            if (c10151t3 == null) {
                                                i33 = 1;
                                            } else {
                                                i33 = 0;
                                            }
                                            iArrCopyOf2[i28] = i33;
                                            if (i28 == iM19148w9) {
                                                iArrCopyOf2[i28] = 1;
                                                iM19148w5--;
                                                if (iM19148w5 > 0) {
                                                    c10151t3.getClass();
                                                    iM19148w9 = c10151t3.m19148w() - 1;
                                                }
                                            }
                                            long[] jArr1113 = jArrCopyOf2;
                                            int iM19129d18 = i31;
                                            j13 += (long) iM19129d18;
                                            iM19148w8--;
                                            if (iM19148w8 != 0) {
                                            }
                                            j14 += (long) iArrCopyOf[i28];
                                            i24--;
                                            i28++;
                                            jArrCopyOf2 = jArr1113;
                                            iM19129d5 = i611114;
                                            iMo17911b = i30;
                                            aVar2 = aVar2;
                                            i25 = iM19129d18;
                                            i26 = i32;
                                        }
                                        int i611115 = i24;
                                        long j217 = j13 + ((long) iM19129d5);
                                        if (c10151t4 != null) {
                                            z15 = true;
                                            break;
                                        }
                                        while (true) {
                                            if (i27 > 0) {
                                                z15 = true;
                                                break;
                                            }
                                            if (c10151t4.m19148w() != 0) {
                                                z15 = false;
                                                break;
                                            }
                                            c10151t4.m19129d();
                                            i27--;
                                        }
                                        if (iM19148w5 != 0) {
                                            i29 = iM19148w7;
                                            StringBuilder sb9 = new StringBuilder("Inconsistent stbl box for track ");
                                            c9488k3 = c9488k2;
                                            sb9.append(c9488k3.f48729a);
                                            sb9.append(": remainingSynchronizationSamples ");
                                            sb9.append(iM19148w5);
                                            sb9.append(", remainingSamplesAtTimestampDelta ");
                                            sb9.append(iM19148w8);
                                            sb9.append(", remainingSamplesInChunk ");
                                            sb9.append(i611115);
                                            sb9.append(", remainingTimestampDeltaChanges ");
                                            sb9.append(i611113);
                                            sb9.append(", remainingSamplesAtTimestampOffset ");
                                            sb9.append(i29);
                                            if (z15) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = str;
                                            }
                                            sb9.append(str2);
                                            C10145n.m19099g("AtomParsers", sb9.toString());
                                        } else {
                                            i29 = iM19148w7;
                                            StringBuilder sb10 = new StringBuilder("Inconsistent stbl box for track ");
                                            c9488k3 = c9488k2;
                                            sb10.append(c9488k3.f48729a);
                                            sb10.append(": remainingSynchronizationSamples ");
                                            sb10.append(iM19148w5);
                                            sb10.append(", remainingSamplesAtTimestampDelta ");
                                            sb10.append(iM19148w8);
                                            sb10.append(", remainingSamplesInChunk ");
                                            sb10.append(i611115);
                                            sb10.append(", remainingTimestampDeltaChanges ");
                                            sb10.append(i611113);
                                            sb10.append(", remainingSamplesAtTimestampOffset ");
                                            sb10.append(i29);
                                            if (z15) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = str;
                                            }
                                            sb10.append(str2);
                                            C10145n.m19099g("AtomParsers", sb10.toString());
                                        }
                                        jArr3 = jArrCopyOf2;
                                        iArr = iArrCopyOf2;
                                        j15 = j217;
                                        jArr4 = jArrCopyOf;
                                    }
                                    jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                    j16 = c9488k3.f48731c;
                                    jArr5 = c9488k3.f48736h;
                                    if (jArr5 == null) {
                                        C10134c0.m19031P(jArr3, j16);
                                        c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                    } else {
                                        length = jArr5.length;
                                        i34 = c9488k3.f48730b;
                                        jArr6 = c9488k3.f48737i;
                                        if (length == 1) {
                                            i35 = iMo17911b;
                                            i36 = i34;
                                            jArr7 = jArr6;
                                            iArr2 = iArr;
                                            i37 = 1;
                                            if (jArr5.length == 1) {
                                                i38 = 0;
                                                if (jArr5[0] == 0) {
                                                    jArr7.getClass();
                                                    j20 = jArr7[0];
                                                    while (i38 < jArr3.length) {
                                                        jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                        i38++;
                                                    }
                                                    c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                } else {
                                                    i37 = 1;
                                                }
                                            } else {
                                                i38 = 0;
                                            }
                                            if (i36 == i37) {
                                                z16 = 1;
                                            } else {
                                                z16 = i38;
                                            }
                                            iArr3 = new int[jArr5.length];
                                            iArr4 = new int[jArr5.length];
                                            jArr7.getClass();
                                            i39 = i38;
                                            i40 = i39;
                                            i41 = i40;
                                            while (i38 < jArr5.length) {
                                                long[] jArr1114 = jArr4;
                                                j19 = jArr7[i38];
                                                if (j19 != -1) {
                                                    int i7111110 = i39;
                                                    int i7111111 = i40;
                                                    long jM19030O13 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                    iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                    iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O13, z16);
                                                    while (true) {
                                                        i47 = iArr3[i38];
                                                        i48 = iArr4[i38];
                                                        if (i47 < i48) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr3[i38] = i47 + 1;
                                                    }
                                                    i40 = (i48 - i47) + i7111111;
                                                    i39 = i7111110 | (i41 == i47 ? 0 : 1);
                                                    i41 = i48;
                                                }
                                                i38++;
                                                jArr4 = jArr1114;
                                                jArr5 = jArr5;
                                                iArrCopyOf = iArrCopyOf;
                                            }
                                            iArr5 = iArrCopyOf;
                                            long[] jArr2118 = jArr5;
                                            jArr8 = jArr4;
                                            i42 = i39 | (i40 == i35 ? 0 : 1);
                                            if (i42 != 0) {
                                                jArr9 = new long[i40];
                                            } else {
                                                jArr9 = jArr8;
                                            }
                                            if (i42 != 0) {
                                                iArr6 = new int[i40];
                                            } else {
                                                iArr6 = iArr5;
                                            }
                                            if (i42 != 0) {
                                                i26 = 0;
                                            }
                                            if (i42 != 0) {
                                                iArr7 = new int[i40];
                                            } else {
                                                iArr7 = iArr2;
                                            }
                                            jArr10 = new long[i40];
                                            i43 = 0;
                                            j17 = 0;
                                            i44 = 0;
                                            jArr11 = jArr2118;
                                            while (i44 < jArr11.length) {
                                                j18 = jArr7[i44];
                                                i45 = iArr3[i44];
                                                int[] iArr114 = iArr3;
                                                i46 = iArr4[i44];
                                                if (i42 != 0) {
                                                    int i7111112 = i46 - i45;
                                                    System.arraycopy(jArr8, i45, jArr9, i43, i7111112);
                                                    iArr8 = iArr5;
                                                    System.arraycopy(iArr8, i45, iArr6, i43, i7111112);
                                                    iArr9 = iArr2;
                                                    System.arraycopy(iArr9, i45, iArr7, i43, i7111112);
                                                } else {
                                                    iArr8 = iArr5;
                                                    iArr9 = iArr2;
                                                }
                                                int i7111113 = i26;
                                                while (i45 < i46) {
                                                    int i7111114 = i46;
                                                    long[] jArr2119 = jArr11;
                                                    long j218 = j17;
                                                    int i7111115 = i44;
                                                    long[] jArr21110 = jArr3;
                                                    jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                    if (i42 == 0) {
                                                    }
                                                    i43++;
                                                    i45++;
                                                    jArr11 = jArr2119;
                                                    jArr3 = jArr21110;
                                                    i44 = i7111115;
                                                    j17 = j218;
                                                    i46 = i7111114;
                                                }
                                                long[] jArr21111 = jArr11;
                                                int i7111116 = i44;
                                                j17 += jArr21111[i7111116];
                                                i44 = i7111116 + 1;
                                                iArr3 = iArr114;
                                                jArr11 = jArr21111;
                                                iArr2 = iArr9;
                                                jArr9 = jArr9;
                                                iArr5 = iArr8;
                                                i26 = i7111113;
                                                iArr4 = iArr4;
                                            }
                                            c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                        } else {
                                            i35 = iMo17911b;
                                            i36 = i34;
                                            jArr7 = jArr6;
                                            iArr2 = iArr;
                                            i37 = 1;
                                            if (jArr5.length == 1) {
                                                i38 = 0;
                                                if (jArr5[0] == 0) {
                                                    jArr7.getClass();
                                                    j20 = jArr7[0];
                                                    while (i38 < jArr3.length) {
                                                        jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                        i38++;
                                                    }
                                                    c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                } else {
                                                    i37 = 1;
                                                }
                                            } else {
                                                i38 = 0;
                                            }
                                            if (i36 == i37) {
                                                z16 = 1;
                                            } else {
                                                z16 = i38;
                                            }
                                            iArr3 = new int[jArr5.length];
                                            iArr4 = new int[jArr5.length];
                                            jArr7.getClass();
                                            i39 = i38;
                                            i40 = i39;
                                            i41 = i40;
                                            while (i38 < jArr5.length) {
                                                long[] jArr1115 = jArr4;
                                                j19 = jArr7[i38];
                                                if (j19 != -1) {
                                                    int i7111117 = i39;
                                                    int i7111118 = i40;
                                                    long jM19030O14 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                    iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                    iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O14, z16);
                                                    while (true) {
                                                        i47 = iArr3[i38];
                                                        i48 = iArr4[i38];
                                                        if (i47 < i48) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr3[i38] = i47 + 1;
                                                    }
                                                    i40 = (i48 - i47) + i7111118;
                                                    i39 = i7111117 | (i41 == i47 ? 0 : 1);
                                                    i41 = i48;
                                                }
                                                i38++;
                                                jArr4 = jArr1115;
                                                jArr5 = jArr5;
                                                iArrCopyOf = iArrCopyOf;
                                            }
                                            iArr5 = iArrCopyOf;
                                            long[] jArr21112 = jArr5;
                                            jArr8 = jArr4;
                                            i42 = i39 | (i40 == i35 ? 0 : 1);
                                            if (i42 != 0) {
                                                jArr9 = new long[i40];
                                            } else {
                                                jArr9 = jArr8;
                                            }
                                            if (i42 != 0) {
                                                iArr6 = new int[i40];
                                            } else {
                                                iArr6 = iArr5;
                                            }
                                            if (i42 != 0) {
                                                i26 = 0;
                                            }
                                            if (i42 != 0) {
                                                iArr7 = new int[i40];
                                            } else {
                                                iArr7 = iArr2;
                                            }
                                            jArr10 = new long[i40];
                                            i43 = 0;
                                            j17 = 0;
                                            i44 = 0;
                                            jArr11 = jArr21112;
                                            while (i44 < jArr11.length) {
                                                j18 = jArr7[i44];
                                                i45 = iArr3[i44];
                                                int[] iArr115 = iArr3;
                                                i46 = iArr4[i44];
                                                if (i42 != 0) {
                                                    int i7111119 = i46 - i45;
                                                    System.arraycopy(jArr8, i45, jArr9, i43, i7111119);
                                                    iArr8 = iArr5;
                                                    System.arraycopy(iArr8, i45, iArr6, i43, i7111119);
                                                    iArr9 = iArr2;
                                                    System.arraycopy(iArr9, i45, iArr7, i43, i7111119);
                                                } else {
                                                    iArr8 = iArr5;
                                                    iArr9 = iArr2;
                                                }
                                                int i71111110 = i26;
                                                while (i45 < i46) {
                                                    int i71111111 = i46;
                                                    long[] jArr21113 = jArr11;
                                                    long j219 = j17;
                                                    int i71111112 = i44;
                                                    long[] jArr21114 = jArr3;
                                                    jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                    if (i42 == 0) {
                                                    }
                                                    i43++;
                                                    i45++;
                                                    jArr11 = jArr21113;
                                                    jArr3 = jArr21114;
                                                    i44 = i71111112;
                                                    j17 = j219;
                                                    i46 = i71111111;
                                                }
                                                long[] jArr21115 = jArr11;
                                                int i71111113 = i44;
                                                j17 += jArr21115[i71111113];
                                                i44 = i71111113 + 1;
                                                iArr3 = iArr115;
                                                jArr11 = jArr21115;
                                                iArr2 = iArr9;
                                                jArr9 = jArr9;
                                                iArr5 = iArr8;
                                                i26 = i71111110;
                                                iArr4 = iArr4;
                                            }
                                            c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                        }
                                        c9491n2 = c9491n;
                                    }
                                } else {
                                    i21 = -1;
                                    iM19148w5 = 0;
                                }
                                i22 = i21;
                                iM19148w6 = i22;
                                iMo17910a = fVar.mo17910a();
                                i23 = i58;
                                String str8 = c2416m.f12484l;
                                if (iMo17910a == i22) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i49 = aVar2.f48609a;
                                    jArr12 = new long[i49];
                                    iArr10 = new int[i49];
                                    while (aVar2.m17909a()) {
                                        int i611116 = aVar2.f48610b;
                                        jArr12[i611116] = aVar2.f48612d;
                                        iArr10[i611116] = aVar2.f48611c;
                                    }
                                    j21 = iM19148w3;
                                    i50 = 8192 / iMo17910a;
                                    i52 = 0;
                                    while (i51 < i49) {
                                        int i611117 = iArr10[i51];
                                        int i611118 = C10134c0.f51354a;
                                        i52 += ((i611117 + i50) - 1) / i50;
                                    }
                                    jArr4 = new long[i52];
                                    iArr11 = new int[i52];
                                    jArr13 = new long[i52];
                                    iArr = new int[i52];
                                    i53 = 0;
                                    i54 = 0;
                                    i55 = 0;
                                    i56 = 0;
                                    while (i56 < i49) {
                                        int i611119 = iArr10[i56];
                                        j22 = jArr12[i56];
                                        long[] jArr1116 = jArr12;
                                        iMax = i53;
                                        int i6111110 = i49;
                                        i57 = i611119;
                                        while (i57 > 0) {
                                            int iMin6 = Math.min(i50, i57);
                                            jArr4[i54] = j22;
                                            int[] iArr116 = iArr10;
                                            int i6111111 = iMo17910a * iMin6;
                                            iArr11[i54] = i6111111;
                                            iMax = Math.max(iMax, i6111111);
                                            jArr13[i54] = ((long) i55) * j21;
                                            iArr[i54] = 1;
                                            j22 += (long) iArr11[i54];
                                            i55 += iMin6;
                                            i57 -= iMin6;
                                            i54++;
                                            iArr10 = iArr116;
                                            i50 = i50;
                                        }
                                        i56++;
                                        i53 = iMax;
                                        i49 = i6111110;
                                        jArr12 = jArr1116;
                                    }
                                    j15 = j21 * ((long) i55);
                                    iArrCopyOf = iArr11;
                                    jArr3 = jArr13;
                                    i26 = i53;
                                    c9488k3 = c9488k2;
                                } else {
                                    jArrCopyOf = new long[iMo17911b];
                                    iArrCopyOf = new int[iMo17911b];
                                    jArrCopyOf2 = new long[iMo17911b];
                                    iArrCopyOf2 = new int[iMo17911b];
                                    i24 = 0;
                                    j13 = 0;
                                    j14 = 0;
                                    iM19129d5 = 0;
                                    iM19148w7 = 0;
                                    int i6111112 = iM19148w;
                                    i25 = iM19148w3;
                                    i26 = 0;
                                    iM19148w8 = iM19148w2;
                                    iM19148w9 = iM19148w6;
                                    i27 = iM19148w4;
                                    i28 = 0;
                                    while (i28 < iMo17911b) {
                                        zM17909a = true;
                                        while (i24 == 0) {
                                            zM17909a = aVar2.m17909a();
                                            if (zM17909a) {
                                                break;
                                                break;
                                            }
                                            j14 = aVar2.f48612d;
                                            i24 = aVar2.f48611c;
                                            iMo17911b = iMo17911b;
                                            i25 = i25;
                                        }
                                        i30 = iMo17911b;
                                        i31 = i25;
                                        if (!zM17909a) {
                                            C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                            iMo17911b = i28;
                                            break;
                                        }
                                        if (c10151t4 != null) {
                                            while (iM19148w7 == 0) {
                                                iM19148w7 = c10151t4.m19148w();
                                                iM19129d5 = c10151t4.m19129d();
                                                i27--;
                                            }
                                            iM19148w7--;
                                        }
                                        int i6111113 = iM19129d5;
                                        jArrCopyOf[i28] = j14;
                                        iMo17912c = fVar.mo17912c();
                                        iArrCopyOf[i28] = iMo17912c;
                                        if (iMo17912c > i26) {
                                            i32 = iMo17912c;
                                        } else {
                                            i32 = i26;
                                        }
                                        jArrCopyOf2[i28] = j13 + ((long) i6111113);
                                        if (c10151t3 == null) {
                                            i33 = 1;
                                        } else {
                                            i33 = 0;
                                        }
                                        iArrCopyOf2[i28] = i33;
                                        if (i28 == iM19148w9) {
                                            iArrCopyOf2[i28] = 1;
                                            iM19148w5--;
                                            if (iM19148w5 > 0) {
                                                c10151t3.getClass();
                                                iM19148w9 = c10151t3.m19148w() - 1;
                                            }
                                        }
                                        long[] jArr1117 = jArrCopyOf2;
                                        int iM19129d19 = i31;
                                        j13 += (long) iM19129d19;
                                        iM19148w8--;
                                        if (iM19148w8 != 0) {
                                        }
                                        j14 += (long) iArrCopyOf[i28];
                                        i24--;
                                        i28++;
                                        jArrCopyOf2 = jArr1117;
                                        iM19129d5 = i6111113;
                                        iMo17911b = i30;
                                        aVar2 = aVar2;
                                        i25 = iM19129d19;
                                        i26 = i32;
                                    }
                                    int i6111114 = i24;
                                    long j2110 = j13 + ((long) iM19129d5);
                                    if (c10151t4 != null) {
                                        z15 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i27 > 0) {
                                            z15 = true;
                                            break;
                                        }
                                        if (c10151t4.m19148w() != 0) {
                                            z15 = false;
                                            break;
                                        }
                                        c10151t4.m19129d();
                                        i27--;
                                    }
                                    if (iM19148w5 != 0) {
                                        i29 = iM19148w7;
                                        StringBuilder sb11 = new StringBuilder("Inconsistent stbl box for track ");
                                        c9488k3 = c9488k2;
                                        sb11.append(c9488k3.f48729a);
                                        sb11.append(": remainingSynchronizationSamples ");
                                        sb11.append(iM19148w5);
                                        sb11.append(", remainingSamplesAtTimestampDelta ");
                                        sb11.append(iM19148w8);
                                        sb11.append(", remainingSamplesInChunk ");
                                        sb11.append(i6111114);
                                        sb11.append(", remainingTimestampDeltaChanges ");
                                        sb11.append(i6111112);
                                        sb11.append(", remainingSamplesAtTimestampOffset ");
                                        sb11.append(i29);
                                        if (z15) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = str;
                                        }
                                        sb11.append(str2);
                                        C10145n.m19099g("AtomParsers", sb11.toString());
                                    } else {
                                        i29 = iM19148w7;
                                        StringBuilder sb12 = new StringBuilder("Inconsistent stbl box for track ");
                                        c9488k3 = c9488k2;
                                        sb12.append(c9488k3.f48729a);
                                        sb12.append(": remainingSynchronizationSamples ");
                                        sb12.append(iM19148w5);
                                        sb12.append(", remainingSamplesAtTimestampDelta ");
                                        sb12.append(iM19148w8);
                                        sb12.append(", remainingSamplesInChunk ");
                                        sb12.append(i6111114);
                                        sb12.append(", remainingTimestampDeltaChanges ");
                                        sb12.append(i6111112);
                                        sb12.append(", remainingSamplesAtTimestampOffset ");
                                        sb12.append(i29);
                                        if (z15) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = str;
                                        }
                                        sb12.append(str2);
                                        C10145n.m19099g("AtomParsers", sb12.toString());
                                    }
                                    jArr3 = jArrCopyOf2;
                                    iArr = iArrCopyOf2;
                                    j15 = j2110;
                                    jArr4 = jArrCopyOf;
                                }
                                jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                j16 = c9488k3.f48731c;
                                jArr5 = c9488k3.f48736h;
                                if (jArr5 == null) {
                                    C10134c0.m19031P(jArr3, j16);
                                    c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                } else {
                                    length = jArr5.length;
                                    i34 = c9488k3.f48730b;
                                    jArr6 = c9488k3.f48737i;
                                    if (length == 1) {
                                        i35 = iMo17911b;
                                        i36 = i34;
                                        jArr7 = jArr6;
                                        iArr2 = iArr;
                                        i37 = 1;
                                        if (jArr5.length == 1) {
                                            i38 = 0;
                                            if (jArr5[0] == 0) {
                                                jArr7.getClass();
                                                j20 = jArr7[0];
                                                while (i38 < jArr3.length) {
                                                    jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                    i38++;
                                                }
                                                c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                            } else {
                                                i37 = 1;
                                            }
                                        } else {
                                            i38 = 0;
                                        }
                                        if (i36 == i37) {
                                            z16 = 1;
                                        } else {
                                            z16 = i38;
                                        }
                                        iArr3 = new int[jArr5.length];
                                        iArr4 = new int[jArr5.length];
                                        jArr7.getClass();
                                        i39 = i38;
                                        i40 = i39;
                                        i41 = i40;
                                        while (i38 < jArr5.length) {
                                            long[] jArr1118 = jArr4;
                                            j19 = jArr7[i38];
                                            if (j19 != -1) {
                                                int i71111114 = i39;
                                                int i71111115 = i40;
                                                long jM19030O15 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O15, z16);
                                                while (true) {
                                                    i47 = iArr3[i38];
                                                    i48 = iArr4[i38];
                                                    if (i47 < i48) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i38] = i47 + 1;
                                                }
                                                i40 = (i48 - i47) + i71111115;
                                                i39 = i71111114 | (i41 == i47 ? 0 : 1);
                                                i41 = i48;
                                            }
                                            i38++;
                                            jArr4 = jArr1118;
                                            jArr5 = jArr5;
                                            iArrCopyOf = iArrCopyOf;
                                        }
                                        iArr5 = iArrCopyOf;
                                        long[] jArr21116 = jArr5;
                                        jArr8 = jArr4;
                                        i42 = i39 | (i40 == i35 ? 0 : 1);
                                        if (i42 != 0) {
                                            jArr9 = new long[i40];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (i42 != 0) {
                                            iArr6 = new int[i40];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i42 != 0) {
                                            i26 = 0;
                                        }
                                        if (i42 != 0) {
                                            iArr7 = new int[i40];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        jArr10 = new long[i40];
                                        i43 = 0;
                                        j17 = 0;
                                        i44 = 0;
                                        jArr11 = jArr21116;
                                        while (i44 < jArr11.length) {
                                            j18 = jArr7[i44];
                                            i45 = iArr3[i44];
                                            int[] iArr117 = iArr3;
                                            i46 = iArr4[i44];
                                            if (i42 != 0) {
                                                int i71111116 = i46 - i45;
                                                System.arraycopy(jArr8, i45, jArr9, i43, i71111116);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i45, iArr6, i43, i71111116);
                                                iArr9 = iArr2;
                                                System.arraycopy(iArr9, i45, iArr7, i43, i71111116);
                                            } else {
                                                iArr8 = iArr5;
                                                iArr9 = iArr2;
                                            }
                                            int i71111117 = i26;
                                            while (i45 < i46) {
                                                int i71111118 = i46;
                                                long[] jArr21117 = jArr11;
                                                long j2111 = j17;
                                                int i71111119 = i44;
                                                long[] jArr21118 = jArr3;
                                                jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                if (i42 == 0) {
                                                }
                                                i43++;
                                                i45++;
                                                jArr11 = jArr21117;
                                                jArr3 = jArr21118;
                                                i44 = i71111119;
                                                j17 = j2111;
                                                i46 = i71111118;
                                            }
                                            long[] jArr21119 = jArr11;
                                            int i711111110 = i44;
                                            j17 += jArr21119[i711111110];
                                            i44 = i711111110 + 1;
                                            iArr3 = iArr117;
                                            jArr11 = jArr21119;
                                            iArr2 = iArr9;
                                            jArr9 = jArr9;
                                            iArr5 = iArr8;
                                            i26 = i71111117;
                                            iArr4 = iArr4;
                                        }
                                        c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                    } else {
                                        i35 = iMo17911b;
                                        i36 = i34;
                                        jArr7 = jArr6;
                                        iArr2 = iArr;
                                        i37 = 1;
                                        if (jArr5.length == 1) {
                                            i38 = 0;
                                            if (jArr5[0] == 0) {
                                                jArr7.getClass();
                                                j20 = jArr7[0];
                                                while (i38 < jArr3.length) {
                                                    jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                    i38++;
                                                }
                                                c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                            } else {
                                                i37 = 1;
                                            }
                                        } else {
                                            i38 = 0;
                                        }
                                        if (i36 == i37) {
                                            z16 = 1;
                                        } else {
                                            z16 = i38;
                                        }
                                        iArr3 = new int[jArr5.length];
                                        iArr4 = new int[jArr5.length];
                                        jArr7.getClass();
                                        i39 = i38;
                                        i40 = i39;
                                        i41 = i40;
                                        while (i38 < jArr5.length) {
                                            long[] jArr1119 = jArr4;
                                            j19 = jArr7[i38];
                                            if (j19 != -1) {
                                                int i711111111 = i39;
                                                int i711111112 = i40;
                                                long jM19030O16 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O16, z16);
                                                while (true) {
                                                    i47 = iArr3[i38];
                                                    i48 = iArr4[i38];
                                                    if (i47 < i48) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i38] = i47 + 1;
                                                }
                                                i40 = (i48 - i47) + i711111112;
                                                i39 = i711111111 | (i41 == i47 ? 0 : 1);
                                                i41 = i48;
                                            }
                                            i38++;
                                            jArr4 = jArr1119;
                                            jArr5 = jArr5;
                                            iArrCopyOf = iArrCopyOf;
                                        }
                                        iArr5 = iArrCopyOf;
                                        long[] jArr211110 = jArr5;
                                        jArr8 = jArr4;
                                        i42 = i39 | (i40 == i35 ? 0 : 1);
                                        if (i42 != 0) {
                                            jArr9 = new long[i40];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (i42 != 0) {
                                            iArr6 = new int[i40];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i42 != 0) {
                                            i26 = 0;
                                        }
                                        if (i42 != 0) {
                                            iArr7 = new int[i40];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        jArr10 = new long[i40];
                                        i43 = 0;
                                        j17 = 0;
                                        i44 = 0;
                                        jArr11 = jArr211110;
                                        while (i44 < jArr11.length) {
                                            j18 = jArr7[i44];
                                            i45 = iArr3[i44];
                                            int[] iArr118 = iArr3;
                                            i46 = iArr4[i44];
                                            if (i42 != 0) {
                                                int i711111113 = i46 - i45;
                                                System.arraycopy(jArr8, i45, jArr9, i43, i711111113);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i45, iArr6, i43, i711111113);
                                                iArr9 = iArr2;
                                                System.arraycopy(iArr9, i45, iArr7, i43, i711111113);
                                            } else {
                                                iArr8 = iArr5;
                                                iArr9 = iArr2;
                                            }
                                            int i711111114 = i26;
                                            while (i45 < i46) {
                                                int i711111115 = i46;
                                                long[] jArr211111 = jArr11;
                                                long j2112 = j17;
                                                int i711111116 = i44;
                                                long[] jArr211112 = jArr3;
                                                jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                if (i42 == 0) {
                                                }
                                                i43++;
                                                i45++;
                                                jArr11 = jArr211111;
                                                jArr3 = jArr211112;
                                                i44 = i711111116;
                                                j17 = j2112;
                                                i46 = i711111115;
                                            }
                                            long[] jArr211113 = jArr11;
                                            int i711111117 = i44;
                                            j17 += jArr211113[i711111117];
                                            i44 = i711111117 + 1;
                                            iArr3 = iArr118;
                                            jArr11 = jArr211113;
                                            iArr2 = iArr9;
                                            jArr9 = jArr9;
                                            iArr5 = iArr8;
                                            i26 = i711111114;
                                            iArr4 = iArr4;
                                        }
                                        c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                    }
                                    c9491n2 = c9491n;
                                }
                            }
                            arrayList = arrayList2;
                            arrayList.add(c9491n2);
                        }
                    }
                    c9488k = null;
                    i20 = 1835626086;
                    c9488k2 = (C9488k) interfaceC10171c.apply(c9488k);
                    if (c9488k2 == null) {
                        arrayList = arrayList2;
                        i23 = i58;
                    } else {
                        AbstractC9478a.a aVarM17902b14 = aVar3.m17902b(1835297121);
                        aVarM17902b14.getClass();
                        AbstractC9478a.a aVarM17902b15 = aVarM17902b14.m17902b(i20);
                        aVarM17902b15.getClass();
                        aVarM17902b2 = aVarM17902b15.m17902b(1937007212);
                        aVarM17902b2.getClass();
                        bVarM17903c2 = aVarM17902b2.m17903c(1937011578);
                        c2416m = c9488k2.f48734f;
                        if (bVarM17903c2 != null) {
                            fVar = new e(bVarM17903c2, c2416m);
                        } else {
                            bVarM17903c3 = aVarM17902b2.m17903c(1937013298);
                            if (bVarM17903c3 == null) {
                                throw ParserException.m6770a("Track has no sample table size information", null);
                            }
                            fVar = new f(bVarM17903c3);
                        }
                        iMo17911b = fVar.mo17911b();
                        if (iMo17911b == 0) {
                            c9491n2 = new C9491n(c9488k2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                            arrayList2 = arrayList2;
                            i23 = i58;
                        } else {
                            bVarM17903c4 = aVarM17902b2.m17903c(1937007471);
                            if (bVarM17903c4 == null) {
                                bVarM17903c4 = aVarM17902b2.m17903c(1668232756);
                                bVarM17903c4.getClass();
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            AbstractC9478a.b bVarM17903c19 = aVarM17902b2.m17903c(1937011555);
                            bVarM17903c19.getClass();
                            AbstractC9478a.b bVarM17903c110 = aVarM17902b2.m17903c(1937011827);
                            bVarM17903c110.getClass();
                            bVarM17903c5 = aVarM17902b2.m17903c(1937011571);
                            if (bVarM17903c5 != null) {
                                c10151t3 = bVarM17903c5.f48607b;
                            } else {
                                c10151t3 = null;
                            }
                            bVarM17903c6 = aVarM17902b2.m17903c(1668576371);
                            if (bVarM17903c6 != null) {
                                c10151t4 = bVarM17903c6.f48607b;
                            } else {
                                c10151t4 = null;
                            }
                            aVar2 = new a(bVarM17903c19.f48607b, bVarM17903c4.f48607b, z13);
                            C10151t c10151t12 = bVarM17903c110.f48607b;
                            c10151t12.m19124E(12);
                            iM19148w = c10151t12.m19148w() - 1;
                            iM19148w2 = c10151t12.m19148w();
                            iM19148w3 = c10151t12.m19148w();
                            if (c10151t4 != null) {
                                c10151t4.m19124E(12);
                                iM19148w4 = c10151t4.m19148w();
                            } else {
                                iM19148w4 = 0;
                            }
                            if (c10151t3 != null) {
                                c10151t3.m19124E(12);
                                iM19148w5 = c10151t3.m19148w();
                                if (iM19148w5 > 0) {
                                    iM19148w6 = c10151t3.m19148w() - 1;
                                    i22 = -1;
                                } else {
                                    i21 = -1;
                                    c10151t3 = null;
                                }
                                iMo17910a = fVar.mo17910a();
                                i23 = i58;
                                String str9 = c2416m.f12484l;
                                if (iMo17910a == i22) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i49 = aVar2.f48609a;
                                    jArr12 = new long[i49];
                                    iArr10 = new int[i49];
                                    while (aVar2.m17909a()) {
                                        int i6111115 = aVar2.f48610b;
                                        jArr12[i6111115] = aVar2.f48612d;
                                        iArr10[i6111115] = aVar2.f48611c;
                                    }
                                    j21 = iM19148w3;
                                    i50 = 8192 / iMo17910a;
                                    i52 = 0;
                                    while (i51 < i49) {
                                        int i6111116 = iArr10[i51];
                                        int i6111117 = C10134c0.f51354a;
                                        i52 += ((i6111116 + i50) - 1) / i50;
                                    }
                                    jArr4 = new long[i52];
                                    iArr11 = new int[i52];
                                    jArr13 = new long[i52];
                                    iArr = new int[i52];
                                    i53 = 0;
                                    i54 = 0;
                                    i55 = 0;
                                    i56 = 0;
                                    while (i56 < i49) {
                                        int i6111118 = iArr10[i56];
                                        j22 = jArr12[i56];
                                        long[] jArr11110 = jArr12;
                                        iMax = i53;
                                        int i6111119 = i49;
                                        i57 = i6111118;
                                        while (i57 > 0) {
                                            int iMin7 = Math.min(i50, i57);
                                            jArr4[i54] = j22;
                                            int[] iArr119 = iArr10;
                                            int i61111110 = iMo17910a * iMin7;
                                            iArr11[i54] = i61111110;
                                            iMax = Math.max(iMax, i61111110);
                                            jArr13[i54] = ((long) i55) * j21;
                                            iArr[i54] = 1;
                                            j22 += (long) iArr11[i54];
                                            i55 += iMin7;
                                            i57 -= iMin7;
                                            i54++;
                                            iArr10 = iArr119;
                                            i50 = i50;
                                        }
                                        i56++;
                                        i53 = iMax;
                                        i49 = i6111119;
                                        jArr12 = jArr11110;
                                    }
                                    j15 = j21 * ((long) i55);
                                    iArrCopyOf = iArr11;
                                    jArr3 = jArr13;
                                    i26 = i53;
                                    c9488k3 = c9488k2;
                                } else {
                                    jArrCopyOf = new long[iMo17911b];
                                    iArrCopyOf = new int[iMo17911b];
                                    jArrCopyOf2 = new long[iMo17911b];
                                    iArrCopyOf2 = new int[iMo17911b];
                                    i24 = 0;
                                    j13 = 0;
                                    j14 = 0;
                                    iM19129d5 = 0;
                                    iM19148w7 = 0;
                                    int i61111111 = iM19148w;
                                    i25 = iM19148w3;
                                    i26 = 0;
                                    iM19148w8 = iM19148w2;
                                    iM19148w9 = iM19148w6;
                                    i27 = iM19148w4;
                                    i28 = 0;
                                    while (i28 < iMo17911b) {
                                        zM17909a = true;
                                        while (i24 == 0) {
                                            zM17909a = aVar2.m17909a();
                                            if (zM17909a) {
                                                break;
                                                break;
                                            }
                                            j14 = aVar2.f48612d;
                                            i24 = aVar2.f48611c;
                                            iMo17911b = iMo17911b;
                                            i25 = i25;
                                        }
                                        i30 = iMo17911b;
                                        i31 = i25;
                                        if (!zM17909a) {
                                            C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                            iMo17911b = i28;
                                            break;
                                        }
                                        if (c10151t4 != null) {
                                            while (iM19148w7 == 0) {
                                                iM19148w7 = c10151t4.m19148w();
                                                iM19129d5 = c10151t4.m19129d();
                                                i27--;
                                            }
                                            iM19148w7--;
                                        }
                                        int i61111112 = iM19129d5;
                                        jArrCopyOf[i28] = j14;
                                        iMo17912c = fVar.mo17912c();
                                        iArrCopyOf[i28] = iMo17912c;
                                        if (iMo17912c > i26) {
                                            i32 = iMo17912c;
                                        } else {
                                            i32 = i26;
                                        }
                                        jArrCopyOf2[i28] = j13 + ((long) i61111112);
                                        if (c10151t3 == null) {
                                            i33 = 1;
                                        } else {
                                            i33 = 0;
                                        }
                                        iArrCopyOf2[i28] = i33;
                                        if (i28 == iM19148w9) {
                                            iArrCopyOf2[i28] = 1;
                                            iM19148w5--;
                                            if (iM19148w5 > 0) {
                                                c10151t3.getClass();
                                                iM19148w9 = c10151t3.m19148w() - 1;
                                            }
                                        }
                                        long[] jArr11111 = jArrCopyOf2;
                                        int iM19129d110 = i31;
                                        j13 += (long) iM19129d110;
                                        iM19148w8--;
                                        if (iM19148w8 != 0) {
                                        }
                                        j14 += (long) iArrCopyOf[i28];
                                        i24--;
                                        i28++;
                                        jArrCopyOf2 = jArr11111;
                                        iM19129d5 = i61111112;
                                        iMo17911b = i30;
                                        aVar2 = aVar2;
                                        i25 = iM19129d110;
                                        i26 = i32;
                                    }
                                    int i61111113 = i24;
                                    long j2113 = j13 + ((long) iM19129d5);
                                    if (c10151t4 != null) {
                                        z15 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i27 > 0) {
                                            z15 = true;
                                            break;
                                        }
                                        if (c10151t4.m19148w() != 0) {
                                            z15 = false;
                                            break;
                                        }
                                        c10151t4.m19129d();
                                        i27--;
                                    }
                                    if (iM19148w5 != 0) {
                                        i29 = iM19148w7;
                                        StringBuilder sb13 = new StringBuilder("Inconsistent stbl box for track ");
                                        c9488k3 = c9488k2;
                                        sb13.append(c9488k3.f48729a);
                                        sb13.append(": remainingSynchronizationSamples ");
                                        sb13.append(iM19148w5);
                                        sb13.append(", remainingSamplesAtTimestampDelta ");
                                        sb13.append(iM19148w8);
                                        sb13.append(", remainingSamplesInChunk ");
                                        sb13.append(i61111113);
                                        sb13.append(", remainingTimestampDeltaChanges ");
                                        sb13.append(i61111111);
                                        sb13.append(", remainingSamplesAtTimestampOffset ");
                                        sb13.append(i29);
                                        if (z15) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = str;
                                        }
                                        sb13.append(str2);
                                        C10145n.m19099g("AtomParsers", sb13.toString());
                                    } else {
                                        i29 = iM19148w7;
                                        StringBuilder sb14 = new StringBuilder("Inconsistent stbl box for track ");
                                        c9488k3 = c9488k2;
                                        sb14.append(c9488k3.f48729a);
                                        sb14.append(": remainingSynchronizationSamples ");
                                        sb14.append(iM19148w5);
                                        sb14.append(", remainingSamplesAtTimestampDelta ");
                                        sb14.append(iM19148w8);
                                        sb14.append(", remainingSamplesInChunk ");
                                        sb14.append(i61111113);
                                        sb14.append(", remainingTimestampDeltaChanges ");
                                        sb14.append(i61111111);
                                        sb14.append(", remainingSamplesAtTimestampOffset ");
                                        sb14.append(i29);
                                        if (z15) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = str;
                                        }
                                        sb14.append(str2);
                                        C10145n.m19099g("AtomParsers", sb14.toString());
                                    }
                                    jArr3 = jArrCopyOf2;
                                    iArr = iArrCopyOf2;
                                    j15 = j2113;
                                    jArr4 = jArrCopyOf;
                                }
                                jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                j16 = c9488k3.f48731c;
                                jArr5 = c9488k3.f48736h;
                                if (jArr5 == null) {
                                    C10134c0.m19031P(jArr3, j16);
                                    c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                } else {
                                    length = jArr5.length;
                                    i34 = c9488k3.f48730b;
                                    jArr6 = c9488k3.f48737i;
                                    if (length == 1) {
                                        i35 = iMo17911b;
                                        i36 = i34;
                                        jArr7 = jArr6;
                                        iArr2 = iArr;
                                        i37 = 1;
                                        if (jArr5.length == 1) {
                                            i38 = 0;
                                            if (jArr5[0] == 0) {
                                                jArr7.getClass();
                                                j20 = jArr7[0];
                                                while (i38 < jArr3.length) {
                                                    jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                    i38++;
                                                }
                                                c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                            } else {
                                                i37 = 1;
                                            }
                                        } else {
                                            i38 = 0;
                                        }
                                        if (i36 == i37) {
                                            z16 = 1;
                                        } else {
                                            z16 = i38;
                                        }
                                        iArr3 = new int[jArr5.length];
                                        iArr4 = new int[jArr5.length];
                                        jArr7.getClass();
                                        i39 = i38;
                                        i40 = i39;
                                        i41 = i40;
                                        while (i38 < jArr5.length) {
                                            long[] jArr11112 = jArr4;
                                            j19 = jArr7[i38];
                                            if (j19 != -1) {
                                                int i711111118 = i39;
                                                int i711111119 = i40;
                                                long jM19030O17 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O17, z16);
                                                while (true) {
                                                    i47 = iArr3[i38];
                                                    i48 = iArr4[i38];
                                                    if (i47 < i48) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i38] = i47 + 1;
                                                }
                                                i40 = (i48 - i47) + i711111119;
                                                i39 = i711111118 | (i41 == i47 ? 0 : 1);
                                                i41 = i48;
                                            }
                                            i38++;
                                            jArr4 = jArr11112;
                                            jArr5 = jArr5;
                                            iArrCopyOf = iArrCopyOf;
                                        }
                                        iArr5 = iArrCopyOf;
                                        long[] jArr211114 = jArr5;
                                        jArr8 = jArr4;
                                        i42 = i39 | (i40 == i35 ? 0 : 1);
                                        if (i42 != 0) {
                                            jArr9 = new long[i40];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (i42 != 0) {
                                            iArr6 = new int[i40];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i42 != 0) {
                                            i26 = 0;
                                        }
                                        if (i42 != 0) {
                                            iArr7 = new int[i40];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        jArr10 = new long[i40];
                                        i43 = 0;
                                        j17 = 0;
                                        i44 = 0;
                                        jArr11 = jArr211114;
                                        while (i44 < jArr11.length) {
                                            j18 = jArr7[i44];
                                            i45 = iArr3[i44];
                                            int[] iArr1110 = iArr3;
                                            i46 = iArr4[i44];
                                            if (i42 != 0) {
                                                int i7111111110 = i46 - i45;
                                                System.arraycopy(jArr8, i45, jArr9, i43, i7111111110);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i45, iArr6, i43, i7111111110);
                                                iArr9 = iArr2;
                                                System.arraycopy(iArr9, i45, iArr7, i43, i7111111110);
                                            } else {
                                                iArr8 = iArr5;
                                                iArr9 = iArr2;
                                            }
                                            int i7111111111 = i26;
                                            while (i45 < i46) {
                                                int i7111111112 = i46;
                                                long[] jArr211115 = jArr11;
                                                long j2114 = j17;
                                                int i7111111113 = i44;
                                                long[] jArr211116 = jArr3;
                                                jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                if (i42 == 0) {
                                                }
                                                i43++;
                                                i45++;
                                                jArr11 = jArr211115;
                                                jArr3 = jArr211116;
                                                i44 = i7111111113;
                                                j17 = j2114;
                                                i46 = i7111111112;
                                            }
                                            long[] jArr211117 = jArr11;
                                            int i7111111114 = i44;
                                            j17 += jArr211117[i7111111114];
                                            i44 = i7111111114 + 1;
                                            iArr3 = iArr1110;
                                            jArr11 = jArr211117;
                                            iArr2 = iArr9;
                                            jArr9 = jArr9;
                                            iArr5 = iArr8;
                                            i26 = i7111111111;
                                            iArr4 = iArr4;
                                        }
                                        c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                    } else {
                                        i35 = iMo17911b;
                                        i36 = i34;
                                        jArr7 = jArr6;
                                        iArr2 = iArr;
                                        i37 = 1;
                                        if (jArr5.length == 1) {
                                            i38 = 0;
                                            if (jArr5[0] == 0) {
                                                jArr7.getClass();
                                                j20 = jArr7[0];
                                                while (i38 < jArr3.length) {
                                                    jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                    i38++;
                                                }
                                                c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                            } else {
                                                i37 = 1;
                                            }
                                        } else {
                                            i38 = 0;
                                        }
                                        if (i36 == i37) {
                                            z16 = 1;
                                        } else {
                                            z16 = i38;
                                        }
                                        iArr3 = new int[jArr5.length];
                                        iArr4 = new int[jArr5.length];
                                        jArr7.getClass();
                                        i39 = i38;
                                        i40 = i39;
                                        i41 = i40;
                                        while (i38 < jArr5.length) {
                                            long[] jArr11113 = jArr4;
                                            j19 = jArr7[i38];
                                            if (j19 != -1) {
                                                int i7111111115 = i39;
                                                int i7111111116 = i40;
                                                long jM19030O18 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O18, z16);
                                                while (true) {
                                                    i47 = iArr3[i38];
                                                    i48 = iArr4[i38];
                                                    if (i47 < i48) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i38] = i47 + 1;
                                                }
                                                i40 = (i48 - i47) + i7111111116;
                                                i39 = i7111111115 | (i41 == i47 ? 0 : 1);
                                                i41 = i48;
                                            }
                                            i38++;
                                            jArr4 = jArr11113;
                                            jArr5 = jArr5;
                                            iArrCopyOf = iArrCopyOf;
                                        }
                                        iArr5 = iArrCopyOf;
                                        long[] jArr211118 = jArr5;
                                        jArr8 = jArr4;
                                        i42 = i39 | (i40 == i35 ? 0 : 1);
                                        if (i42 != 0) {
                                            jArr9 = new long[i40];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (i42 != 0) {
                                            iArr6 = new int[i40];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i42 != 0) {
                                            i26 = 0;
                                        }
                                        if (i42 != 0) {
                                            iArr7 = new int[i40];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        jArr10 = new long[i40];
                                        i43 = 0;
                                        j17 = 0;
                                        i44 = 0;
                                        jArr11 = jArr211118;
                                        while (i44 < jArr11.length) {
                                            j18 = jArr7[i44];
                                            i45 = iArr3[i44];
                                            int[] iArr1111 = iArr3;
                                            i46 = iArr4[i44];
                                            if (i42 != 0) {
                                                int i7111111117 = i46 - i45;
                                                System.arraycopy(jArr8, i45, jArr9, i43, i7111111117);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i45, iArr6, i43, i7111111117);
                                                iArr9 = iArr2;
                                                System.arraycopy(iArr9, i45, iArr7, i43, i7111111117);
                                            } else {
                                                iArr8 = iArr5;
                                                iArr9 = iArr2;
                                            }
                                            int i7111111118 = i26;
                                            while (i45 < i46) {
                                                int i7111111119 = i46;
                                                long[] jArr211119 = jArr11;
                                                long j2115 = j17;
                                                int i71111111110 = i44;
                                                long[] jArr2111110 = jArr3;
                                                jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                if (i42 == 0) {
                                                }
                                                i43++;
                                                i45++;
                                                jArr11 = jArr211119;
                                                jArr3 = jArr2111110;
                                                i44 = i71111111110;
                                                j17 = j2115;
                                                i46 = i7111111119;
                                            }
                                            long[] jArr2111111 = jArr11;
                                            int i71111111111 = i44;
                                            j17 += jArr2111111[i71111111111];
                                            i44 = i71111111111 + 1;
                                            iArr3 = iArr1111;
                                            jArr11 = jArr2111111;
                                            iArr2 = iArr9;
                                            jArr9 = jArr9;
                                            iArr5 = iArr8;
                                            i26 = i7111111118;
                                            iArr4 = iArr4;
                                        }
                                        c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                    }
                                    c9491n2 = c9491n;
                                }
                            } else {
                                i21 = -1;
                                iM19148w5 = 0;
                            }
                            i22 = i21;
                            iM19148w6 = i22;
                            iMo17910a = fVar.mo17910a();
                            i23 = i58;
                            String str10 = c2416m.f12484l;
                            if (iMo17910a == i22) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                i49 = aVar2.f48609a;
                                jArr12 = new long[i49];
                                iArr10 = new int[i49];
                                while (aVar2.m17909a()) {
                                    int i61111114 = aVar2.f48610b;
                                    jArr12[i61111114] = aVar2.f48612d;
                                    iArr10[i61111114] = aVar2.f48611c;
                                }
                                j21 = iM19148w3;
                                i50 = 8192 / iMo17910a;
                                i52 = 0;
                                while (i51 < i49) {
                                    int i61111115 = iArr10[i51];
                                    int i61111116 = C10134c0.f51354a;
                                    i52 += ((i61111115 + i50) - 1) / i50;
                                }
                                jArr4 = new long[i52];
                                iArr11 = new int[i52];
                                jArr13 = new long[i52];
                                iArr = new int[i52];
                                i53 = 0;
                                i54 = 0;
                                i55 = 0;
                                i56 = 0;
                                while (i56 < i49) {
                                    int i61111117 = iArr10[i56];
                                    j22 = jArr12[i56];
                                    long[] jArr11114 = jArr12;
                                    iMax = i53;
                                    int i61111118 = i49;
                                    i57 = i61111117;
                                    while (i57 > 0) {
                                        int iMin8 = Math.min(i50, i57);
                                        jArr4[i54] = j22;
                                        int[] iArr1112 = iArr10;
                                        int i61111119 = iMo17910a * iMin8;
                                        iArr11[i54] = i61111119;
                                        iMax = Math.max(iMax, i61111119);
                                        jArr13[i54] = ((long) i55) * j21;
                                        iArr[i54] = 1;
                                        j22 += (long) iArr11[i54];
                                        i55 += iMin8;
                                        i57 -= iMin8;
                                        i54++;
                                        iArr10 = iArr1112;
                                        i50 = i50;
                                    }
                                    i56++;
                                    i53 = iMax;
                                    i49 = i61111118;
                                    jArr12 = jArr11114;
                                }
                                j15 = j21 * ((long) i55);
                                iArrCopyOf = iArr11;
                                jArr3 = jArr13;
                                i26 = i53;
                                c9488k3 = c9488k2;
                            } else {
                                jArrCopyOf = new long[iMo17911b];
                                iArrCopyOf = new int[iMo17911b];
                                jArrCopyOf2 = new long[iMo17911b];
                                iArrCopyOf2 = new int[iMo17911b];
                                i24 = 0;
                                j13 = 0;
                                j14 = 0;
                                iM19129d5 = 0;
                                iM19148w7 = 0;
                                int i611111110 = iM19148w;
                                i25 = iM19148w3;
                                i26 = 0;
                                iM19148w8 = iM19148w2;
                                iM19148w9 = iM19148w6;
                                i27 = iM19148w4;
                                i28 = 0;
                                while (i28 < iMo17911b) {
                                    zM17909a = true;
                                    while (i24 == 0) {
                                        zM17909a = aVar2.m17909a();
                                        if (zM17909a) {
                                            break;
                                            break;
                                        }
                                        j14 = aVar2.f48612d;
                                        i24 = aVar2.f48611c;
                                        iMo17911b = iMo17911b;
                                        i25 = i25;
                                    }
                                    i30 = iMo17911b;
                                    i31 = i25;
                                    if (!zM17909a) {
                                        C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                        iMo17911b = i28;
                                        break;
                                    }
                                    if (c10151t4 != null) {
                                        while (iM19148w7 == 0) {
                                            iM19148w7 = c10151t4.m19148w();
                                            iM19129d5 = c10151t4.m19129d();
                                            i27--;
                                        }
                                        iM19148w7--;
                                    }
                                    int i611111111 = iM19129d5;
                                    jArrCopyOf[i28] = j14;
                                    iMo17912c = fVar.mo17912c();
                                    iArrCopyOf[i28] = iMo17912c;
                                    if (iMo17912c > i26) {
                                        i32 = iMo17912c;
                                    } else {
                                        i32 = i26;
                                    }
                                    jArrCopyOf2[i28] = j13 + ((long) i611111111);
                                    if (c10151t3 == null) {
                                        i33 = 1;
                                    } else {
                                        i33 = 0;
                                    }
                                    iArrCopyOf2[i28] = i33;
                                    if (i28 == iM19148w9) {
                                        iArrCopyOf2[i28] = 1;
                                        iM19148w5--;
                                        if (iM19148w5 > 0) {
                                            c10151t3.getClass();
                                            iM19148w9 = c10151t3.m19148w() - 1;
                                        }
                                    }
                                    long[] jArr11115 = jArrCopyOf2;
                                    int iM19129d111 = i31;
                                    j13 += (long) iM19129d111;
                                    iM19148w8--;
                                    if (iM19148w8 != 0) {
                                    }
                                    j14 += (long) iArrCopyOf[i28];
                                    i24--;
                                    i28++;
                                    jArrCopyOf2 = jArr11115;
                                    iM19129d5 = i611111111;
                                    iMo17911b = i30;
                                    aVar2 = aVar2;
                                    i25 = iM19129d111;
                                    i26 = i32;
                                }
                                int i611111112 = i24;
                                long j2116 = j13 + ((long) iM19129d5);
                                if (c10151t4 != null) {
                                    z15 = true;
                                    break;
                                }
                                while (true) {
                                    if (i27 > 0) {
                                        z15 = true;
                                        break;
                                    }
                                    if (c10151t4.m19148w() != 0) {
                                        z15 = false;
                                        break;
                                    }
                                    c10151t4.m19129d();
                                    i27--;
                                }
                                if (iM19148w5 != 0) {
                                    i29 = iM19148w7;
                                    StringBuilder sb15 = new StringBuilder("Inconsistent stbl box for track ");
                                    c9488k3 = c9488k2;
                                    sb15.append(c9488k3.f48729a);
                                    sb15.append(": remainingSynchronizationSamples ");
                                    sb15.append(iM19148w5);
                                    sb15.append(", remainingSamplesAtTimestampDelta ");
                                    sb15.append(iM19148w8);
                                    sb15.append(", remainingSamplesInChunk ");
                                    sb15.append(i611111112);
                                    sb15.append(", remainingTimestampDeltaChanges ");
                                    sb15.append(i611111110);
                                    sb15.append(", remainingSamplesAtTimestampOffset ");
                                    sb15.append(i29);
                                    if (z15) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = str;
                                    }
                                    sb15.append(str2);
                                    C10145n.m19099g("AtomParsers", sb15.toString());
                                } else {
                                    i29 = iM19148w7;
                                    StringBuilder sb16 = new StringBuilder("Inconsistent stbl box for track ");
                                    c9488k3 = c9488k2;
                                    sb16.append(c9488k3.f48729a);
                                    sb16.append(": remainingSynchronizationSamples ");
                                    sb16.append(iM19148w5);
                                    sb16.append(", remainingSamplesAtTimestampDelta ");
                                    sb16.append(iM19148w8);
                                    sb16.append(", remainingSamplesInChunk ");
                                    sb16.append(i611111112);
                                    sb16.append(", remainingTimestampDeltaChanges ");
                                    sb16.append(i611111110);
                                    sb16.append(", remainingSamplesAtTimestampOffset ");
                                    sb16.append(i29);
                                    if (z15) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = str;
                                    }
                                    sb16.append(str2);
                                    C10145n.m19099g("AtomParsers", sb16.toString());
                                }
                                jArr3 = jArrCopyOf2;
                                iArr = iArrCopyOf2;
                                j15 = j2116;
                                jArr4 = jArrCopyOf;
                            }
                            jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                            j16 = c9488k3.f48731c;
                            jArr5 = c9488k3.f48736h;
                            if (jArr5 == null) {
                                C10134c0.m19031P(jArr3, j16);
                                c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                            } else {
                                length = jArr5.length;
                                i34 = c9488k3.f48730b;
                                jArr6 = c9488k3.f48737i;
                                if (length == 1) {
                                    i35 = iMo17911b;
                                    i36 = i34;
                                    jArr7 = jArr6;
                                    iArr2 = iArr;
                                    i37 = 1;
                                    if (jArr5.length == 1) {
                                        i38 = 0;
                                        if (jArr5[0] == 0) {
                                            jArr7.getClass();
                                            j20 = jArr7[0];
                                            while (i38 < jArr3.length) {
                                                jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                i38++;
                                            }
                                            c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                        } else {
                                            i37 = 1;
                                        }
                                    } else {
                                        i38 = 0;
                                    }
                                    if (i36 == i37) {
                                        z16 = 1;
                                    } else {
                                        z16 = i38;
                                    }
                                    iArr3 = new int[jArr5.length];
                                    iArr4 = new int[jArr5.length];
                                    jArr7.getClass();
                                    i39 = i38;
                                    i40 = i39;
                                    i41 = i40;
                                    while (i38 < jArr5.length) {
                                        long[] jArr11116 = jArr4;
                                        j19 = jArr7[i38];
                                        if (j19 != -1) {
                                            int i71111111112 = i39;
                                            int i71111111113 = i40;
                                            long jM19030O19 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                            iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                            iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O19, z16);
                                            while (true) {
                                                i47 = iArr3[i38];
                                                i48 = iArr4[i38];
                                                if (i47 < i48) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i38] = i47 + 1;
                                            }
                                            i40 = (i48 - i47) + i71111111113;
                                            i39 = i71111111112 | (i41 == i47 ? 0 : 1);
                                            i41 = i48;
                                        }
                                        i38++;
                                        jArr4 = jArr11116;
                                        jArr5 = jArr5;
                                        iArrCopyOf = iArrCopyOf;
                                    }
                                    iArr5 = iArrCopyOf;
                                    long[] jArr2111112 = jArr5;
                                    jArr8 = jArr4;
                                    i42 = i39 | (i40 == i35 ? 0 : 1);
                                    if (i42 != 0) {
                                        jArr9 = new long[i40];
                                    } else {
                                        jArr9 = jArr8;
                                    }
                                    if (i42 != 0) {
                                        iArr6 = new int[i40];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i42 != 0) {
                                        i26 = 0;
                                    }
                                    if (i42 != 0) {
                                        iArr7 = new int[i40];
                                    } else {
                                        iArr7 = iArr2;
                                    }
                                    jArr10 = new long[i40];
                                    i43 = 0;
                                    j17 = 0;
                                    i44 = 0;
                                    jArr11 = jArr2111112;
                                    while (i44 < jArr11.length) {
                                        j18 = jArr7[i44];
                                        i45 = iArr3[i44];
                                        int[] iArr1113 = iArr3;
                                        i46 = iArr4[i44];
                                        if (i42 != 0) {
                                            int i71111111114 = i46 - i45;
                                            System.arraycopy(jArr8, i45, jArr9, i43, i71111111114);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i45, iArr6, i43, i71111111114);
                                            iArr9 = iArr2;
                                            System.arraycopy(iArr9, i45, iArr7, i43, i71111111114);
                                        } else {
                                            iArr8 = iArr5;
                                            iArr9 = iArr2;
                                        }
                                        int i71111111115 = i26;
                                        while (i45 < i46) {
                                            int i71111111116 = i46;
                                            long[] jArr2111113 = jArr11;
                                            long j2117 = j17;
                                            int i71111111117 = i44;
                                            long[] jArr2111114 = jArr3;
                                            jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                            if (i42 == 0) {
                                            }
                                            i43++;
                                            i45++;
                                            jArr11 = jArr2111113;
                                            jArr3 = jArr2111114;
                                            i44 = i71111111117;
                                            j17 = j2117;
                                            i46 = i71111111116;
                                        }
                                        long[] jArr2111115 = jArr11;
                                        int i71111111118 = i44;
                                        j17 += jArr2111115[i71111111118];
                                        i44 = i71111111118 + 1;
                                        iArr3 = iArr1113;
                                        jArr11 = jArr2111115;
                                        iArr2 = iArr9;
                                        jArr9 = jArr9;
                                        iArr5 = iArr8;
                                        i26 = i71111111115;
                                        iArr4 = iArr4;
                                    }
                                    c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                } else {
                                    i35 = iMo17911b;
                                    i36 = i34;
                                    jArr7 = jArr6;
                                    iArr2 = iArr;
                                    i37 = 1;
                                    if (jArr5.length == 1) {
                                        i38 = 0;
                                        if (jArr5[0] == 0) {
                                            jArr7.getClass();
                                            j20 = jArr7[0];
                                            while (i38 < jArr3.length) {
                                                jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                i38++;
                                            }
                                            c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                        } else {
                                            i37 = 1;
                                        }
                                    } else {
                                        i38 = 0;
                                    }
                                    if (i36 == i37) {
                                        z16 = 1;
                                    } else {
                                        z16 = i38;
                                    }
                                    iArr3 = new int[jArr5.length];
                                    iArr4 = new int[jArr5.length];
                                    jArr7.getClass();
                                    i39 = i38;
                                    i40 = i39;
                                    i41 = i40;
                                    while (i38 < jArr5.length) {
                                        long[] jArr11117 = jArr4;
                                        j19 = jArr7[i38];
                                        if (j19 != -1) {
                                            int i71111111119 = i39;
                                            int i711111111110 = i40;
                                            long jM19030O110 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                            iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                            iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O110, z16);
                                            while (true) {
                                                i47 = iArr3[i38];
                                                i48 = iArr4[i38];
                                                if (i47 < i48) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i38] = i47 + 1;
                                            }
                                            i40 = (i48 - i47) + i711111111110;
                                            i39 = i71111111119 | (i41 == i47 ? 0 : 1);
                                            i41 = i48;
                                        }
                                        i38++;
                                        jArr4 = jArr11117;
                                        jArr5 = jArr5;
                                        iArrCopyOf = iArrCopyOf;
                                    }
                                    iArr5 = iArrCopyOf;
                                    long[] jArr2111116 = jArr5;
                                    jArr8 = jArr4;
                                    i42 = i39 | (i40 == i35 ? 0 : 1);
                                    if (i42 != 0) {
                                        jArr9 = new long[i40];
                                    } else {
                                        jArr9 = jArr8;
                                    }
                                    if (i42 != 0) {
                                        iArr6 = new int[i40];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i42 != 0) {
                                        i26 = 0;
                                    }
                                    if (i42 != 0) {
                                        iArr7 = new int[i40];
                                    } else {
                                        iArr7 = iArr2;
                                    }
                                    jArr10 = new long[i40];
                                    i43 = 0;
                                    j17 = 0;
                                    i44 = 0;
                                    jArr11 = jArr2111116;
                                    while (i44 < jArr11.length) {
                                        j18 = jArr7[i44];
                                        i45 = iArr3[i44];
                                        int[] iArr1114 = iArr3;
                                        i46 = iArr4[i44];
                                        if (i42 != 0) {
                                            int i711111111111 = i46 - i45;
                                            System.arraycopy(jArr8, i45, jArr9, i43, i711111111111);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i45, iArr6, i43, i711111111111);
                                            iArr9 = iArr2;
                                            System.arraycopy(iArr9, i45, iArr7, i43, i711111111111);
                                        } else {
                                            iArr8 = iArr5;
                                            iArr9 = iArr2;
                                        }
                                        int i711111111112 = i26;
                                        while (i45 < i46) {
                                            int i711111111113 = i46;
                                            long[] jArr2111117 = jArr11;
                                            long j2118 = j17;
                                            int i711111111114 = i44;
                                            long[] jArr2111118 = jArr3;
                                            jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                            if (i42 == 0) {
                                            }
                                            i43++;
                                            i45++;
                                            jArr11 = jArr2111117;
                                            jArr3 = jArr2111118;
                                            i44 = i711111111114;
                                            j17 = j2118;
                                            i46 = i711111111113;
                                        }
                                        long[] jArr2111119 = jArr11;
                                        int i711111111115 = i44;
                                        j17 += jArr2111119[i711111111115];
                                        i44 = i711111111115 + 1;
                                        iArr3 = iArr1114;
                                        jArr11 = jArr2111119;
                                        iArr2 = iArr9;
                                        jArr9 = jArr9;
                                        iArr5 = iArr8;
                                        i26 = i711111111112;
                                        iArr4 = iArr4;
                                    }
                                    c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                }
                                c9491n2 = c9491n;
                            }
                        }
                        arrayList = arrayList2;
                        arrayList.add(c9491n2);
                    }
                }
                i11 = i10;
                str = "";
                if (i11 == -1) {
                    str = "";
                } else {
                    AbstractC9478a.b bVarM17903c20 = aVar3.m17903c(1953196132);
                    bVarM17903c20.getClass();
                    c10151t = bVarM17903c20.f48607b;
                    c10151t.m19124E(8);
                    iM19129d = (c10151t.m19129d() >> 24) & 255;
                    c10151t.m19125F(iM19129d == 0 ? 8 : 16);
                    iM19129d2 = c10151t.m19129d();
                    c10151t.m19125F(4);
                    i12 = c10151t.f51439b;
                    if (iM19129d == 0) {
                        i13 = 4;
                    } else {
                        i13 = 8;
                    }
                    i14 = 0;
                    while (true) {
                        if (i14 < i13) {
                            z12 = true;
                            break;
                        }
                        if (c10151t.f51438a[i12 + i14] != -1) {
                            z12 = false;
                            break;
                        }
                        i14++;
                    }
                    if (z12) {
                        c10151t.m19125F(i13);
                    } else {
                        if (iM19129d == 0) {
                            jM19149x = c10151t.m19146u();
                        } else {
                            jM19149x = c10151t.m19149x();
                        }
                        if (jM19149x == 0) {
                            i15 = 16;
                        }
                        c10151t.m19125F(i15);
                        iM19129d3 = c10151t.m19129d();
                        int iM19129d112 = c10151t.m19129d();
                        c10151t.m19125F(4);
                        int iM19129d113 = c10151t.m19129d();
                        int iM19129d114 = c10151t.m19129d();
                        j11 = jM19149x;
                        if (iM19129d3 != 0) {
                            if (iM19129d3 != 0) {
                                if (iM19129d3 != -65536) {
                                    i16 = 0;
                                } else {
                                    i16 = 0;
                                }
                            } else if (iM19129d3 != -65536) {
                                i16 = 0;
                            } else {
                                i16 = 0;
                            }
                        } else if (iM19129d3 != 0) {
                            if (iM19129d3 != -65536) {
                                i16 = 0;
                            } else {
                                i16 = 0;
                            }
                        } else if (iM19129d3 != -65536) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                        if (j10 == -9223372036854775807L) {
                            j12 = j11;
                        } else {
                            j12 = j10;
                        }
                        c10151t2 = bVarM17903c7.f48607b;
                        c10151t2.m19124E(8);
                        if (((c10151t2.m19129d() >> 24) & 255) == 0) {
                            i17 = 8;
                        } else {
                            i17 = 16;
                        }
                        c10151t2.m19125F(i17);
                        jM19146u = c10151t2.m19146u();
                        jM19030O = j12 != -9223372036854775807L ? C10134c0.m19030O(j12, 1000000L, jM19146u) : -9223372036854775807L;
                        AbstractC9478a.a aVarM17902b16 = aVarM17902b3.m17902b(1835626086);
                        aVarM17902b16.getClass();
                        AbstractC9478a.a aVarM17902b17 = aVarM17902b16.m17902b(1937007212);
                        aVarM17902b17.getClass();
                        AbstractC9478a.b bVarM17903c111 = aVarM17902b3.m17903c(1835296868);
                        bVarM17903c111.getClass();
                        C10151t c10151t13 = bVarM17903c111.f48607b;
                        c10151t13.m19124E(8);
                        iM19129d4 = (c10151t13.m19129d() >> 24) & 255;
                        if (iM19129d4 == 0) {
                            i18 = 8;
                        } else {
                            i18 = 16;
                        }
                        c10151t13.m19125F(i18);
                        long jM19146u4 = c10151t13.m19146u();
                        if (iM19129d4 == 0) {
                            i19 = 4;
                        } else {
                            i19 = 8;
                        }
                        c10151t13.m19125F(i19);
                        int iM19150y3 = c10151t13.m19150y();
                        pairCreate = Pair.create(Long.valueOf(jM19146u4), "" + ((char) (((iM19150y3 >> 10) & 31) + 96)) + ((char) (((iM19150y3 >> 5) & 31) + 96)) + ((char) ((iM19150y3 & 31) + 96)));
                        bVarM17903c = aVarM17902b17.m17903c(1937011556);
                        if (bVarM17903c != null) {
                            throw ParserException.m6770a("Malformed sample table (stbl) missing sample description (stsd)", null);
                        }
                        dVarM17907d = m17907d(bVarM17903c.f48607b, iM19129d2, i16, (String) pairCreate.second, drmInitData, z11);
                        if (z10) {
                            str = "";
                            jArr = null;
                            jArr2 = null;
                        } else {
                            str = "";
                            jArr = null;
                            jArr2 = null;
                        }
                        if (dVarM17907d.f48623b != null) {
                            c9488k = new C9488k(iM19129d2, i11, ((Long) pairCreate.first).longValue(), jM19146u, jM19030O, dVarM17907d.f48623b, dVarM17907d.f48625d, dVarM17907d.f48622a, dVarM17907d.f48624c, jArr, jArr2);
                            i20 = 1835626086;
                        }
                        c9488k2 = (C9488k) interfaceC10171c.apply(c9488k);
                        if (c9488k2 == null) {
                            arrayList = arrayList2;
                            i23 = i58;
                        } else {
                            AbstractC9478a.a aVarM17902b18 = aVar3.m17902b(1835297121);
                            aVarM17902b18.getClass();
                            AbstractC9478a.a aVarM17902b19 = aVarM17902b18.m17902b(i20);
                            aVarM17902b19.getClass();
                            aVarM17902b2 = aVarM17902b19.m17902b(1937007212);
                            aVarM17902b2.getClass();
                            bVarM17903c2 = aVarM17902b2.m17903c(1937011578);
                            c2416m = c9488k2.f48734f;
                            if (bVarM17903c2 != null) {
                                fVar = new e(bVarM17903c2, c2416m);
                            } else {
                                bVarM17903c3 = aVarM17902b2.m17903c(1937013298);
                                if (bVarM17903c3 == null) {
                                    throw ParserException.m6770a("Track has no sample table size information", null);
                                }
                                fVar = new f(bVarM17903c3);
                            }
                            iMo17911b = fVar.mo17911b();
                            if (iMo17911b == 0) {
                                c9491n2 = new C9491n(c9488k2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                arrayList2 = arrayList2;
                                i23 = i58;
                            } else {
                                bVarM17903c4 = aVarM17902b2.m17903c(1937007471);
                                if (bVarM17903c4 == null) {
                                    bVarM17903c4 = aVarM17902b2.m17903c(1668232756);
                                    bVarM17903c4.getClass();
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                AbstractC9478a.b bVarM17903c112 = aVarM17902b2.m17903c(1937011555);
                                bVarM17903c112.getClass();
                                AbstractC9478a.b bVarM17903c113 = aVarM17902b2.m17903c(1937011827);
                                bVarM17903c113.getClass();
                                bVarM17903c5 = aVarM17902b2.m17903c(1937011571);
                                if (bVarM17903c5 != null) {
                                    c10151t3 = bVarM17903c5.f48607b;
                                } else {
                                    c10151t3 = null;
                                }
                                bVarM17903c6 = aVarM17902b2.m17903c(1668576371);
                                if (bVarM17903c6 != null) {
                                    c10151t4 = bVarM17903c6.f48607b;
                                } else {
                                    c10151t4 = null;
                                }
                                aVar2 = new a(bVarM17903c112.f48607b, bVarM17903c4.f48607b, z13);
                                C10151t c10151t14 = bVarM17903c113.f48607b;
                                c10151t14.m19124E(12);
                                iM19148w = c10151t14.m19148w() - 1;
                                iM19148w2 = c10151t14.m19148w();
                                iM19148w3 = c10151t14.m19148w();
                                if (c10151t4 != null) {
                                    c10151t4.m19124E(12);
                                    iM19148w4 = c10151t4.m19148w();
                                } else {
                                    iM19148w4 = 0;
                                }
                                if (c10151t3 != null) {
                                    c10151t3.m19124E(12);
                                    iM19148w5 = c10151t3.m19148w();
                                    if (iM19148w5 > 0) {
                                        iM19148w6 = c10151t3.m19148w() - 1;
                                        i22 = -1;
                                    } else {
                                        i21 = -1;
                                        c10151t3 = null;
                                    }
                                    iMo17910a = fVar.mo17910a();
                                    i23 = i58;
                                    String str11 = c2416m.f12484l;
                                    if (iMo17910a == i22) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        i49 = aVar2.f48609a;
                                        jArr12 = new long[i49];
                                        iArr10 = new int[i49];
                                        while (aVar2.m17909a()) {
                                            int i611111113 = aVar2.f48610b;
                                            jArr12[i611111113] = aVar2.f48612d;
                                            iArr10[i611111113] = aVar2.f48611c;
                                        }
                                        j21 = iM19148w3;
                                        i50 = 8192 / iMo17910a;
                                        i52 = 0;
                                        while (i51 < i49) {
                                            int i611111114 = iArr10[i51];
                                            int i611111115 = C10134c0.f51354a;
                                            i52 += ((i611111114 + i50) - 1) / i50;
                                        }
                                        jArr4 = new long[i52];
                                        iArr11 = new int[i52];
                                        jArr13 = new long[i52];
                                        iArr = new int[i52];
                                        i53 = 0;
                                        i54 = 0;
                                        i55 = 0;
                                        i56 = 0;
                                        while (i56 < i49) {
                                            int i611111116 = iArr10[i56];
                                            j22 = jArr12[i56];
                                            long[] jArr11118 = jArr12;
                                            iMax = i53;
                                            int i611111117 = i49;
                                            i57 = i611111116;
                                            while (i57 > 0) {
                                                int iMin9 = Math.min(i50, i57);
                                                jArr4[i54] = j22;
                                                int[] iArr1115 = iArr10;
                                                int i611111118 = iMo17910a * iMin9;
                                                iArr11[i54] = i611111118;
                                                iMax = Math.max(iMax, i611111118);
                                                jArr13[i54] = ((long) i55) * j21;
                                                iArr[i54] = 1;
                                                j22 += (long) iArr11[i54];
                                                i55 += iMin9;
                                                i57 -= iMin9;
                                                i54++;
                                                iArr10 = iArr1115;
                                                i50 = i50;
                                            }
                                            i56++;
                                            i53 = iMax;
                                            i49 = i611111117;
                                            jArr12 = jArr11118;
                                        }
                                        j15 = j21 * ((long) i55);
                                        iArrCopyOf = iArr11;
                                        jArr3 = jArr13;
                                        i26 = i53;
                                        c9488k3 = c9488k2;
                                    } else {
                                        jArrCopyOf = new long[iMo17911b];
                                        iArrCopyOf = new int[iMo17911b];
                                        jArrCopyOf2 = new long[iMo17911b];
                                        iArrCopyOf2 = new int[iMo17911b];
                                        i24 = 0;
                                        j13 = 0;
                                        j14 = 0;
                                        iM19129d5 = 0;
                                        iM19148w7 = 0;
                                        int i611111119 = iM19148w;
                                        i25 = iM19148w3;
                                        i26 = 0;
                                        iM19148w8 = iM19148w2;
                                        iM19148w9 = iM19148w6;
                                        i27 = iM19148w4;
                                        i28 = 0;
                                        while (i28 < iMo17911b) {
                                            zM17909a = true;
                                            while (i24 == 0) {
                                                zM17909a = aVar2.m17909a();
                                                if (zM17909a) {
                                                    break;
                                                    break;
                                                }
                                                j14 = aVar2.f48612d;
                                                i24 = aVar2.f48611c;
                                                iMo17911b = iMo17911b;
                                                i25 = i25;
                                            }
                                            i30 = iMo17911b;
                                            i31 = i25;
                                            if (!zM17909a) {
                                                C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                                iMo17911b = i28;
                                                break;
                                            }
                                            if (c10151t4 != null) {
                                                while (iM19148w7 == 0) {
                                                    iM19148w7 = c10151t4.m19148w();
                                                    iM19129d5 = c10151t4.m19129d();
                                                    i27--;
                                                }
                                                iM19148w7--;
                                            }
                                            int i6111111110 = iM19129d5;
                                            jArrCopyOf[i28] = j14;
                                            iMo17912c = fVar.mo17912c();
                                            iArrCopyOf[i28] = iMo17912c;
                                            if (iMo17912c > i26) {
                                                i32 = iMo17912c;
                                            } else {
                                                i32 = i26;
                                            }
                                            jArrCopyOf2[i28] = j13 + ((long) i6111111110);
                                            if (c10151t3 == null) {
                                                i33 = 1;
                                            } else {
                                                i33 = 0;
                                            }
                                            iArrCopyOf2[i28] = i33;
                                            if (i28 == iM19148w9) {
                                                iArrCopyOf2[i28] = 1;
                                                iM19148w5--;
                                                if (iM19148w5 > 0) {
                                                    c10151t3.getClass();
                                                    iM19148w9 = c10151t3.m19148w() - 1;
                                                }
                                            }
                                            long[] jArr11119 = jArrCopyOf2;
                                            int iM19129d115 = i31;
                                            j13 += (long) iM19129d115;
                                            iM19148w8--;
                                            if (iM19148w8 != 0) {
                                            }
                                            j14 += (long) iArrCopyOf[i28];
                                            i24--;
                                            i28++;
                                            jArrCopyOf2 = jArr11119;
                                            iM19129d5 = i6111111110;
                                            iMo17911b = i30;
                                            aVar2 = aVar2;
                                            i25 = iM19129d115;
                                            i26 = i32;
                                        }
                                        int i6111111111 = i24;
                                        long j2119 = j13 + ((long) iM19129d5);
                                        if (c10151t4 != null) {
                                            z15 = true;
                                            break;
                                        }
                                        while (true) {
                                            if (i27 > 0) {
                                                z15 = true;
                                                break;
                                            }
                                            if (c10151t4.m19148w() != 0) {
                                                z15 = false;
                                                break;
                                            }
                                            c10151t4.m19129d();
                                            i27--;
                                        }
                                        if (iM19148w5 != 0) {
                                            i29 = iM19148w7;
                                            StringBuilder sb17 = new StringBuilder("Inconsistent stbl box for track ");
                                            c9488k3 = c9488k2;
                                            sb17.append(c9488k3.f48729a);
                                            sb17.append(": remainingSynchronizationSamples ");
                                            sb17.append(iM19148w5);
                                            sb17.append(", remainingSamplesAtTimestampDelta ");
                                            sb17.append(iM19148w8);
                                            sb17.append(", remainingSamplesInChunk ");
                                            sb17.append(i6111111111);
                                            sb17.append(", remainingTimestampDeltaChanges ");
                                            sb17.append(i611111119);
                                            sb17.append(", remainingSamplesAtTimestampOffset ");
                                            sb17.append(i29);
                                            if (z15) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = str;
                                            }
                                            sb17.append(str2);
                                            C10145n.m19099g("AtomParsers", sb17.toString());
                                        } else {
                                            i29 = iM19148w7;
                                            StringBuilder sb18 = new StringBuilder("Inconsistent stbl box for track ");
                                            c9488k3 = c9488k2;
                                            sb18.append(c9488k3.f48729a);
                                            sb18.append(": remainingSynchronizationSamples ");
                                            sb18.append(iM19148w5);
                                            sb18.append(", remainingSamplesAtTimestampDelta ");
                                            sb18.append(iM19148w8);
                                            sb18.append(", remainingSamplesInChunk ");
                                            sb18.append(i6111111111);
                                            sb18.append(", remainingTimestampDeltaChanges ");
                                            sb18.append(i611111119);
                                            sb18.append(", remainingSamplesAtTimestampOffset ");
                                            sb18.append(i29);
                                            if (z15) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = str;
                                            }
                                            sb18.append(str2);
                                            C10145n.m19099g("AtomParsers", sb18.toString());
                                        }
                                        jArr3 = jArrCopyOf2;
                                        iArr = iArrCopyOf2;
                                        j15 = j2119;
                                        jArr4 = jArrCopyOf;
                                    }
                                    jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                    j16 = c9488k3.f48731c;
                                    jArr5 = c9488k3.f48736h;
                                    if (jArr5 == null) {
                                        C10134c0.m19031P(jArr3, j16);
                                        c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                    } else {
                                        length = jArr5.length;
                                        i34 = c9488k3.f48730b;
                                        jArr6 = c9488k3.f48737i;
                                        if (length == 1) {
                                            i35 = iMo17911b;
                                            i36 = i34;
                                            jArr7 = jArr6;
                                            iArr2 = iArr;
                                            i37 = 1;
                                            if (jArr5.length == 1) {
                                                i38 = 0;
                                                if (jArr5[0] == 0) {
                                                    jArr7.getClass();
                                                    j20 = jArr7[0];
                                                    while (i38 < jArr3.length) {
                                                        jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                        i38++;
                                                    }
                                                    c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                } else {
                                                    i37 = 1;
                                                }
                                            } else {
                                                i38 = 0;
                                            }
                                            if (i36 == i37) {
                                                z16 = 1;
                                            } else {
                                                z16 = i38;
                                            }
                                            iArr3 = new int[jArr5.length];
                                            iArr4 = new int[jArr5.length];
                                            jArr7.getClass();
                                            i39 = i38;
                                            i40 = i39;
                                            i41 = i40;
                                            while (i38 < jArr5.length) {
                                                long[] jArr111110 = jArr4;
                                                j19 = jArr7[i38];
                                                if (j19 != -1) {
                                                    int i711111111116 = i39;
                                                    int i711111111117 = i40;
                                                    long jM19030O111 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                    iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                    iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O111, z16);
                                                    while (true) {
                                                        i47 = iArr3[i38];
                                                        i48 = iArr4[i38];
                                                        if (i47 < i48) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr3[i38] = i47 + 1;
                                                    }
                                                    i40 = (i48 - i47) + i711111111117;
                                                    i39 = i711111111116 | (i41 == i47 ? 0 : 1);
                                                    i41 = i48;
                                                }
                                                i38++;
                                                jArr4 = jArr111110;
                                                jArr5 = jArr5;
                                                iArrCopyOf = iArrCopyOf;
                                            }
                                            iArr5 = iArrCopyOf;
                                            long[] jArr21111110 = jArr5;
                                            jArr8 = jArr4;
                                            i42 = i39 | (i40 == i35 ? 0 : 1);
                                            if (i42 != 0) {
                                                jArr9 = new long[i40];
                                            } else {
                                                jArr9 = jArr8;
                                            }
                                            if (i42 != 0) {
                                                iArr6 = new int[i40];
                                            } else {
                                                iArr6 = iArr5;
                                            }
                                            if (i42 != 0) {
                                                i26 = 0;
                                            }
                                            if (i42 != 0) {
                                                iArr7 = new int[i40];
                                            } else {
                                                iArr7 = iArr2;
                                            }
                                            jArr10 = new long[i40];
                                            i43 = 0;
                                            j17 = 0;
                                            i44 = 0;
                                            jArr11 = jArr21111110;
                                            while (i44 < jArr11.length) {
                                                j18 = jArr7[i44];
                                                i45 = iArr3[i44];
                                                int[] iArr1116 = iArr3;
                                                i46 = iArr4[i44];
                                                if (i42 != 0) {
                                                    int i711111111118 = i46 - i45;
                                                    System.arraycopy(jArr8, i45, jArr9, i43, i711111111118);
                                                    iArr8 = iArr5;
                                                    System.arraycopy(iArr8, i45, iArr6, i43, i711111111118);
                                                    iArr9 = iArr2;
                                                    System.arraycopy(iArr9, i45, iArr7, i43, i711111111118);
                                                } else {
                                                    iArr8 = iArr5;
                                                    iArr9 = iArr2;
                                                }
                                                int i711111111119 = i26;
                                                while (i45 < i46) {
                                                    int i7111111111110 = i46;
                                                    long[] jArr21111111 = jArr11;
                                                    long j21110 = j17;
                                                    int i7111111111111 = i44;
                                                    long[] jArr21111112 = jArr3;
                                                    jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                    if (i42 == 0) {
                                                    }
                                                    i43++;
                                                    i45++;
                                                    jArr11 = jArr21111111;
                                                    jArr3 = jArr21111112;
                                                    i44 = i7111111111111;
                                                    j17 = j21110;
                                                    i46 = i7111111111110;
                                                }
                                                long[] jArr21111113 = jArr11;
                                                int i7111111111112 = i44;
                                                j17 += jArr21111113[i7111111111112];
                                                i44 = i7111111111112 + 1;
                                                iArr3 = iArr1116;
                                                jArr11 = jArr21111113;
                                                iArr2 = iArr9;
                                                jArr9 = jArr9;
                                                iArr5 = iArr8;
                                                i26 = i711111111119;
                                                iArr4 = iArr4;
                                            }
                                            c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                        } else {
                                            i35 = iMo17911b;
                                            i36 = i34;
                                            jArr7 = jArr6;
                                            iArr2 = iArr;
                                            i37 = 1;
                                            if (jArr5.length == 1) {
                                                i38 = 0;
                                                if (jArr5[0] == 0) {
                                                    jArr7.getClass();
                                                    j20 = jArr7[0];
                                                    while (i38 < jArr3.length) {
                                                        jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                        i38++;
                                                    }
                                                    c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                                } else {
                                                    i37 = 1;
                                                }
                                            } else {
                                                i38 = 0;
                                            }
                                            if (i36 == i37) {
                                                z16 = 1;
                                            } else {
                                                z16 = i38;
                                            }
                                            iArr3 = new int[jArr5.length];
                                            iArr4 = new int[jArr5.length];
                                            jArr7.getClass();
                                            i39 = i38;
                                            i40 = i39;
                                            i41 = i40;
                                            while (i38 < jArr5.length) {
                                                long[] jArr111111 = jArr4;
                                                j19 = jArr7[i38];
                                                if (j19 != -1) {
                                                    int i7111111111113 = i39;
                                                    int i7111111111114 = i40;
                                                    long jM19030O112 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                    iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                    iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O112, z16);
                                                    while (true) {
                                                        i47 = iArr3[i38];
                                                        i48 = iArr4[i38];
                                                        if (i47 < i48) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr3[i38] = i47 + 1;
                                                    }
                                                    i40 = (i48 - i47) + i7111111111114;
                                                    i39 = i7111111111113 | (i41 == i47 ? 0 : 1);
                                                    i41 = i48;
                                                }
                                                i38++;
                                                jArr4 = jArr111111;
                                                jArr5 = jArr5;
                                                iArrCopyOf = iArrCopyOf;
                                            }
                                            iArr5 = iArrCopyOf;
                                            long[] jArr21111114 = jArr5;
                                            jArr8 = jArr4;
                                            i42 = i39 | (i40 == i35 ? 0 : 1);
                                            if (i42 != 0) {
                                                jArr9 = new long[i40];
                                            } else {
                                                jArr9 = jArr8;
                                            }
                                            if (i42 != 0) {
                                                iArr6 = new int[i40];
                                            } else {
                                                iArr6 = iArr5;
                                            }
                                            if (i42 != 0) {
                                                i26 = 0;
                                            }
                                            if (i42 != 0) {
                                                iArr7 = new int[i40];
                                            } else {
                                                iArr7 = iArr2;
                                            }
                                            jArr10 = new long[i40];
                                            i43 = 0;
                                            j17 = 0;
                                            i44 = 0;
                                            jArr11 = jArr21111114;
                                            while (i44 < jArr11.length) {
                                                j18 = jArr7[i44];
                                                i45 = iArr3[i44];
                                                int[] iArr1117 = iArr3;
                                                i46 = iArr4[i44];
                                                if (i42 != 0) {
                                                    int i7111111111115 = i46 - i45;
                                                    System.arraycopy(jArr8, i45, jArr9, i43, i7111111111115);
                                                    iArr8 = iArr5;
                                                    System.arraycopy(iArr8, i45, iArr6, i43, i7111111111115);
                                                    iArr9 = iArr2;
                                                    System.arraycopy(iArr9, i45, iArr7, i43, i7111111111115);
                                                } else {
                                                    iArr8 = iArr5;
                                                    iArr9 = iArr2;
                                                }
                                                int i7111111111116 = i26;
                                                while (i45 < i46) {
                                                    int i7111111111117 = i46;
                                                    long[] jArr21111115 = jArr11;
                                                    long j21111 = j17;
                                                    int i7111111111118 = i44;
                                                    long[] jArr21111116 = jArr3;
                                                    jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                    if (i42 == 0) {
                                                    }
                                                    i43++;
                                                    i45++;
                                                    jArr11 = jArr21111115;
                                                    jArr3 = jArr21111116;
                                                    i44 = i7111111111118;
                                                    j17 = j21111;
                                                    i46 = i7111111111117;
                                                }
                                                long[] jArr21111117 = jArr11;
                                                int i7111111111119 = i44;
                                                j17 += jArr21111117[i7111111111119];
                                                i44 = i7111111111119 + 1;
                                                iArr3 = iArr1117;
                                                jArr11 = jArr21111117;
                                                iArr2 = iArr9;
                                                jArr9 = jArr9;
                                                iArr5 = iArr8;
                                                i26 = i7111111111116;
                                                iArr4 = iArr4;
                                            }
                                            c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                        }
                                        c9491n2 = c9491n;
                                    }
                                } else {
                                    i21 = -1;
                                    iM19148w5 = 0;
                                }
                                i22 = i21;
                                iM19148w6 = i22;
                                iMo17910a = fVar.mo17910a();
                                i23 = i58;
                                String str12 = c2416m.f12484l;
                                if (iMo17910a == i22) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i49 = aVar2.f48609a;
                                    jArr12 = new long[i49];
                                    iArr10 = new int[i49];
                                    while (aVar2.m17909a()) {
                                        int i6111111112 = aVar2.f48610b;
                                        jArr12[i6111111112] = aVar2.f48612d;
                                        iArr10[i6111111112] = aVar2.f48611c;
                                    }
                                    j21 = iM19148w3;
                                    i50 = 8192 / iMo17910a;
                                    i52 = 0;
                                    while (i51 < i49) {
                                        int i6111111113 = iArr10[i51];
                                        int i6111111114 = C10134c0.f51354a;
                                        i52 += ((i6111111113 + i50) - 1) / i50;
                                    }
                                    jArr4 = new long[i52];
                                    iArr11 = new int[i52];
                                    jArr13 = new long[i52];
                                    iArr = new int[i52];
                                    i53 = 0;
                                    i54 = 0;
                                    i55 = 0;
                                    i56 = 0;
                                    while (i56 < i49) {
                                        int i6111111115 = iArr10[i56];
                                        j22 = jArr12[i56];
                                        long[] jArr111112 = jArr12;
                                        iMax = i53;
                                        int i6111111116 = i49;
                                        i57 = i6111111115;
                                        while (i57 > 0) {
                                            int iMin10 = Math.min(i50, i57);
                                            jArr4[i54] = j22;
                                            int[] iArr1118 = iArr10;
                                            int i6111111117 = iMo17910a * iMin10;
                                            iArr11[i54] = i6111111117;
                                            iMax = Math.max(iMax, i6111111117);
                                            jArr13[i54] = ((long) i55) * j21;
                                            iArr[i54] = 1;
                                            j22 += (long) iArr11[i54];
                                            i55 += iMin10;
                                            i57 -= iMin10;
                                            i54++;
                                            iArr10 = iArr1118;
                                            i50 = i50;
                                        }
                                        i56++;
                                        i53 = iMax;
                                        i49 = i6111111116;
                                        jArr12 = jArr111112;
                                    }
                                    j15 = j21 * ((long) i55);
                                    iArrCopyOf = iArr11;
                                    jArr3 = jArr13;
                                    i26 = i53;
                                    c9488k3 = c9488k2;
                                } else {
                                    jArrCopyOf = new long[iMo17911b];
                                    iArrCopyOf = new int[iMo17911b];
                                    jArrCopyOf2 = new long[iMo17911b];
                                    iArrCopyOf2 = new int[iMo17911b];
                                    i24 = 0;
                                    j13 = 0;
                                    j14 = 0;
                                    iM19129d5 = 0;
                                    iM19148w7 = 0;
                                    int i6111111118 = iM19148w;
                                    i25 = iM19148w3;
                                    i26 = 0;
                                    iM19148w8 = iM19148w2;
                                    iM19148w9 = iM19148w6;
                                    i27 = iM19148w4;
                                    i28 = 0;
                                    while (i28 < iMo17911b) {
                                        zM17909a = true;
                                        while (i24 == 0) {
                                            zM17909a = aVar2.m17909a();
                                            if (zM17909a) {
                                                break;
                                                break;
                                            }
                                            j14 = aVar2.f48612d;
                                            i24 = aVar2.f48611c;
                                            iMo17911b = iMo17911b;
                                            i25 = i25;
                                        }
                                        i30 = iMo17911b;
                                        i31 = i25;
                                        if (!zM17909a) {
                                            C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                            iMo17911b = i28;
                                            break;
                                        }
                                        if (c10151t4 != null) {
                                            while (iM19148w7 == 0) {
                                                iM19148w7 = c10151t4.m19148w();
                                                iM19129d5 = c10151t4.m19129d();
                                                i27--;
                                            }
                                            iM19148w7--;
                                        }
                                        int i6111111119 = iM19129d5;
                                        jArrCopyOf[i28] = j14;
                                        iMo17912c = fVar.mo17912c();
                                        iArrCopyOf[i28] = iMo17912c;
                                        if (iMo17912c > i26) {
                                            i32 = iMo17912c;
                                        } else {
                                            i32 = i26;
                                        }
                                        jArrCopyOf2[i28] = j13 + ((long) i6111111119);
                                        if (c10151t3 == null) {
                                            i33 = 1;
                                        } else {
                                            i33 = 0;
                                        }
                                        iArrCopyOf2[i28] = i33;
                                        if (i28 == iM19148w9) {
                                            iArrCopyOf2[i28] = 1;
                                            iM19148w5--;
                                            if (iM19148w5 > 0) {
                                                c10151t3.getClass();
                                                iM19148w9 = c10151t3.m19148w() - 1;
                                            }
                                        }
                                        long[] jArr111113 = jArrCopyOf2;
                                        int iM19129d116 = i31;
                                        j13 += (long) iM19129d116;
                                        iM19148w8--;
                                        if (iM19148w8 != 0) {
                                        }
                                        j14 += (long) iArrCopyOf[i28];
                                        i24--;
                                        i28++;
                                        jArrCopyOf2 = jArr111113;
                                        iM19129d5 = i6111111119;
                                        iMo17911b = i30;
                                        aVar2 = aVar2;
                                        i25 = iM19129d116;
                                        i26 = i32;
                                    }
                                    int i61111111110 = i24;
                                    long j21112 = j13 + ((long) iM19129d5);
                                    if (c10151t4 != null) {
                                        z15 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i27 > 0) {
                                            z15 = true;
                                            break;
                                        }
                                        if (c10151t4.m19148w() != 0) {
                                            z15 = false;
                                            break;
                                        }
                                        c10151t4.m19129d();
                                        i27--;
                                    }
                                    if (iM19148w5 != 0) {
                                        i29 = iM19148w7;
                                        StringBuilder sb19 = new StringBuilder("Inconsistent stbl box for track ");
                                        c9488k3 = c9488k2;
                                        sb19.append(c9488k3.f48729a);
                                        sb19.append(": remainingSynchronizationSamples ");
                                        sb19.append(iM19148w5);
                                        sb19.append(", remainingSamplesAtTimestampDelta ");
                                        sb19.append(iM19148w8);
                                        sb19.append(", remainingSamplesInChunk ");
                                        sb19.append(i61111111110);
                                        sb19.append(", remainingTimestampDeltaChanges ");
                                        sb19.append(i6111111118);
                                        sb19.append(", remainingSamplesAtTimestampOffset ");
                                        sb19.append(i29);
                                        if (z15) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = str;
                                        }
                                        sb19.append(str2);
                                        C10145n.m19099g("AtomParsers", sb19.toString());
                                    } else {
                                        i29 = iM19148w7;
                                        StringBuilder sb110 = new StringBuilder("Inconsistent stbl box for track ");
                                        c9488k3 = c9488k2;
                                        sb110.append(c9488k3.f48729a);
                                        sb110.append(": remainingSynchronizationSamples ");
                                        sb110.append(iM19148w5);
                                        sb110.append(", remainingSamplesAtTimestampDelta ");
                                        sb110.append(iM19148w8);
                                        sb110.append(", remainingSamplesInChunk ");
                                        sb110.append(i61111111110);
                                        sb110.append(", remainingTimestampDeltaChanges ");
                                        sb110.append(i6111111118);
                                        sb110.append(", remainingSamplesAtTimestampOffset ");
                                        sb110.append(i29);
                                        if (z15) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = str;
                                        }
                                        sb110.append(str2);
                                        C10145n.m19099g("AtomParsers", sb110.toString());
                                    }
                                    jArr3 = jArrCopyOf2;
                                    iArr = iArrCopyOf2;
                                    j15 = j21112;
                                    jArr4 = jArrCopyOf;
                                }
                                jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                j16 = c9488k3.f48731c;
                                jArr5 = c9488k3.f48736h;
                                if (jArr5 == null) {
                                    C10134c0.m19031P(jArr3, j16);
                                    c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                } else {
                                    length = jArr5.length;
                                    i34 = c9488k3.f48730b;
                                    jArr6 = c9488k3.f48737i;
                                    if (length == 1) {
                                        i35 = iMo17911b;
                                        i36 = i34;
                                        jArr7 = jArr6;
                                        iArr2 = iArr;
                                        i37 = 1;
                                        if (jArr5.length == 1) {
                                            i38 = 0;
                                            if (jArr5[0] == 0) {
                                                jArr7.getClass();
                                                j20 = jArr7[0];
                                                while (i38 < jArr3.length) {
                                                    jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                    i38++;
                                                }
                                                c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                            } else {
                                                i37 = 1;
                                            }
                                        } else {
                                            i38 = 0;
                                        }
                                        if (i36 == i37) {
                                            z16 = 1;
                                        } else {
                                            z16 = i38;
                                        }
                                        iArr3 = new int[jArr5.length];
                                        iArr4 = new int[jArr5.length];
                                        jArr7.getClass();
                                        i39 = i38;
                                        i40 = i39;
                                        i41 = i40;
                                        while (i38 < jArr5.length) {
                                            long[] jArr111114 = jArr4;
                                            j19 = jArr7[i38];
                                            if (j19 != -1) {
                                                int i71111111111110 = i39;
                                                int i71111111111111 = i40;
                                                long jM19030O113 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O113, z16);
                                                while (true) {
                                                    i47 = iArr3[i38];
                                                    i48 = iArr4[i38];
                                                    if (i47 < i48) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i38] = i47 + 1;
                                                }
                                                i40 = (i48 - i47) + i71111111111111;
                                                i39 = i71111111111110 | (i41 == i47 ? 0 : 1);
                                                i41 = i48;
                                            }
                                            i38++;
                                            jArr4 = jArr111114;
                                            jArr5 = jArr5;
                                            iArrCopyOf = iArrCopyOf;
                                        }
                                        iArr5 = iArrCopyOf;
                                        long[] jArr21111118 = jArr5;
                                        jArr8 = jArr4;
                                        i42 = i39 | (i40 == i35 ? 0 : 1);
                                        if (i42 != 0) {
                                            jArr9 = new long[i40];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (i42 != 0) {
                                            iArr6 = new int[i40];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i42 != 0) {
                                            i26 = 0;
                                        }
                                        if (i42 != 0) {
                                            iArr7 = new int[i40];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        jArr10 = new long[i40];
                                        i43 = 0;
                                        j17 = 0;
                                        i44 = 0;
                                        jArr11 = jArr21111118;
                                        while (i44 < jArr11.length) {
                                            j18 = jArr7[i44];
                                            i45 = iArr3[i44];
                                            int[] iArr1119 = iArr3;
                                            i46 = iArr4[i44];
                                            if (i42 != 0) {
                                                int i71111111111112 = i46 - i45;
                                                System.arraycopy(jArr8, i45, jArr9, i43, i71111111111112);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i45, iArr6, i43, i71111111111112);
                                                iArr9 = iArr2;
                                                System.arraycopy(iArr9, i45, iArr7, i43, i71111111111112);
                                            } else {
                                                iArr8 = iArr5;
                                                iArr9 = iArr2;
                                            }
                                            int i71111111111113 = i26;
                                            while (i45 < i46) {
                                                int i71111111111114 = i46;
                                                long[] jArr21111119 = jArr11;
                                                long j21113 = j17;
                                                int i71111111111115 = i44;
                                                long[] jArr211111110 = jArr3;
                                                jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                if (i42 == 0) {
                                                }
                                                i43++;
                                                i45++;
                                                jArr11 = jArr21111119;
                                                jArr3 = jArr211111110;
                                                i44 = i71111111111115;
                                                j17 = j21113;
                                                i46 = i71111111111114;
                                            }
                                            long[] jArr211111111 = jArr11;
                                            int i71111111111116 = i44;
                                            j17 += jArr211111111[i71111111111116];
                                            i44 = i71111111111116 + 1;
                                            iArr3 = iArr1119;
                                            jArr11 = jArr211111111;
                                            iArr2 = iArr9;
                                            jArr9 = jArr9;
                                            iArr5 = iArr8;
                                            i26 = i71111111111113;
                                            iArr4 = iArr4;
                                        }
                                        c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                    } else {
                                        i35 = iMo17911b;
                                        i36 = i34;
                                        jArr7 = jArr6;
                                        iArr2 = iArr;
                                        i37 = 1;
                                        if (jArr5.length == 1) {
                                            i38 = 0;
                                            if (jArr5[0] == 0) {
                                                jArr7.getClass();
                                                j20 = jArr7[0];
                                                while (i38 < jArr3.length) {
                                                    jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                    i38++;
                                                }
                                                c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                            } else {
                                                i37 = 1;
                                            }
                                        } else {
                                            i38 = 0;
                                        }
                                        if (i36 == i37) {
                                            z16 = 1;
                                        } else {
                                            z16 = i38;
                                        }
                                        iArr3 = new int[jArr5.length];
                                        iArr4 = new int[jArr5.length];
                                        jArr7.getClass();
                                        i39 = i38;
                                        i40 = i39;
                                        i41 = i40;
                                        while (i38 < jArr5.length) {
                                            long[] jArr111115 = jArr4;
                                            j19 = jArr7[i38];
                                            if (j19 != -1) {
                                                int i71111111111117 = i39;
                                                int i71111111111118 = i40;
                                                long jM19030O114 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O114, z16);
                                                while (true) {
                                                    i47 = iArr3[i38];
                                                    i48 = iArr4[i38];
                                                    if (i47 < i48) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i38] = i47 + 1;
                                                }
                                                i40 = (i48 - i47) + i71111111111118;
                                                i39 = i71111111111117 | (i41 == i47 ? 0 : 1);
                                                i41 = i48;
                                            }
                                            i38++;
                                            jArr4 = jArr111115;
                                            jArr5 = jArr5;
                                            iArrCopyOf = iArrCopyOf;
                                        }
                                        iArr5 = iArrCopyOf;
                                        long[] jArr211111112 = jArr5;
                                        jArr8 = jArr4;
                                        i42 = i39 | (i40 == i35 ? 0 : 1);
                                        if (i42 != 0) {
                                            jArr9 = new long[i40];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (i42 != 0) {
                                            iArr6 = new int[i40];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i42 != 0) {
                                            i26 = 0;
                                        }
                                        if (i42 != 0) {
                                            iArr7 = new int[i40];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        jArr10 = new long[i40];
                                        i43 = 0;
                                        j17 = 0;
                                        i44 = 0;
                                        jArr11 = jArr211111112;
                                        while (i44 < jArr11.length) {
                                            j18 = jArr7[i44];
                                            i45 = iArr3[i44];
                                            int[] iArr11110 = iArr3;
                                            i46 = iArr4[i44];
                                            if (i42 != 0) {
                                                int i71111111111119 = i46 - i45;
                                                System.arraycopy(jArr8, i45, jArr9, i43, i71111111111119);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i45, iArr6, i43, i71111111111119);
                                                iArr9 = iArr2;
                                                System.arraycopy(iArr9, i45, iArr7, i43, i71111111111119);
                                            } else {
                                                iArr8 = iArr5;
                                                iArr9 = iArr2;
                                            }
                                            int i711111111111110 = i26;
                                            while (i45 < i46) {
                                                int i711111111111111 = i46;
                                                long[] jArr211111113 = jArr11;
                                                long j21114 = j17;
                                                int i711111111111112 = i44;
                                                long[] jArr211111114 = jArr3;
                                                jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                if (i42 == 0) {
                                                }
                                                i43++;
                                                i45++;
                                                jArr11 = jArr211111113;
                                                jArr3 = jArr211111114;
                                                i44 = i711111111111112;
                                                j17 = j21114;
                                                i46 = i711111111111111;
                                            }
                                            long[] jArr211111115 = jArr11;
                                            int i711111111111113 = i44;
                                            j17 += jArr211111115[i711111111111113];
                                            i44 = i711111111111113 + 1;
                                            iArr3 = iArr11110;
                                            jArr11 = jArr211111115;
                                            iArr2 = iArr9;
                                            jArr9 = jArr9;
                                            iArr5 = iArr8;
                                            i26 = i711111111111110;
                                            iArr4 = iArr4;
                                        }
                                        c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                    }
                                    c9491n2 = c9491n;
                                }
                            }
                            arrayList = arrayList2;
                            arrayList.add(c9491n2);
                        }
                    }
                    i15 = 16;
                    jM19149x = -9223372036854775807L;
                    c10151t.m19125F(i15);
                    iM19129d3 = c10151t.m19129d();
                    int iM19129d117 = c10151t.m19129d();
                    c10151t.m19125F(4);
                    int iM19129d118 = c10151t.m19129d();
                    int iM19129d119 = c10151t.m19129d();
                    j11 = jM19149x;
                    if (iM19129d3 != 0) {
                        if (iM19129d3 != 0) {
                            if (iM19129d3 != -65536) {
                                i16 = 0;
                            } else {
                                i16 = 0;
                            }
                        } else if (iM19129d3 != -65536) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                    } else if (iM19129d3 != 0) {
                        if (iM19129d3 != -65536) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                    } else if (iM19129d3 != -65536) {
                        i16 = 0;
                    } else {
                        i16 = 0;
                    }
                    if (j10 == -9223372036854775807L) {
                        j12 = j11;
                    } else {
                        j12 = j10;
                    }
                    c10151t2 = bVarM17903c7.f48607b;
                    c10151t2.m19124E(8);
                    if (((c10151t2.m19129d() >> 24) & 255) == 0) {
                        i17 = 8;
                    } else {
                        i17 = 16;
                    }
                    c10151t2.m19125F(i17);
                    jM19146u = c10151t2.m19146u();
                    jM19030O = j12 != -9223372036854775807L ? C10134c0.m19030O(j12, 1000000L, jM19146u) : -9223372036854775807L;
                    AbstractC9478a.a aVarM17902b110 = aVarM17902b3.m17902b(1835626086);
                    aVarM17902b110.getClass();
                    AbstractC9478a.a aVarM17902b111 = aVarM17902b110.m17902b(1937007212);
                    aVarM17902b111.getClass();
                    AbstractC9478a.b bVarM17903c114 = aVarM17902b3.m17903c(1835296868);
                    bVarM17903c114.getClass();
                    C10151t c10151t15 = bVarM17903c114.f48607b;
                    c10151t15.m19124E(8);
                    iM19129d4 = (c10151t15.m19129d() >> 24) & 255;
                    if (iM19129d4 == 0) {
                        i18 = 8;
                    } else {
                        i18 = 16;
                    }
                    c10151t15.m19125F(i18);
                    long jM19146u5 = c10151t15.m19146u();
                    if (iM19129d4 == 0) {
                        i19 = 4;
                    } else {
                        i19 = 8;
                    }
                    c10151t15.m19125F(i19);
                    int iM19150y4 = c10151t15.m19150y();
                    pairCreate = Pair.create(Long.valueOf(jM19146u5), "" + ((char) (((iM19150y4 >> 10) & 31) + 96)) + ((char) (((iM19150y4 >> 5) & 31) + 96)) + ((char) ((iM19150y4 & 31) + 96)));
                    bVarM17903c = aVarM17902b111.m17903c(1937011556);
                    if (bVarM17903c != null) {
                        throw ParserException.m6770a("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    dVarM17907d = m17907d(bVarM17903c.f48607b, iM19129d2, i16, (String) pairCreate.second, drmInitData, z11);
                    if (z10) {
                        str = "";
                        jArr = null;
                        jArr2 = null;
                    } else {
                        str = "";
                        jArr = null;
                        jArr2 = null;
                    }
                    if (dVarM17907d.f48623b != null) {
                        c9488k = new C9488k(iM19129d2, i11, ((Long) pairCreate.first).longValue(), jM19146u, jM19030O, dVarM17907d.f48623b, dVarM17907d.f48625d, dVarM17907d.f48622a, dVarM17907d.f48624c, jArr, jArr2);
                        i20 = 1835626086;
                    }
                    c9488k2 = (C9488k) interfaceC10171c.apply(c9488k);
                    if (c9488k2 == null) {
                        arrayList = arrayList2;
                        i23 = i58;
                    } else {
                        AbstractC9478a.a aVarM17902b112 = aVar3.m17902b(1835297121);
                        aVarM17902b112.getClass();
                        AbstractC9478a.a aVarM17902b113 = aVarM17902b112.m17902b(i20);
                        aVarM17902b113.getClass();
                        aVarM17902b2 = aVarM17902b113.m17902b(1937007212);
                        aVarM17902b2.getClass();
                        bVarM17903c2 = aVarM17902b2.m17903c(1937011578);
                        c2416m = c9488k2.f48734f;
                        if (bVarM17903c2 != null) {
                            fVar = new e(bVarM17903c2, c2416m);
                        } else {
                            bVarM17903c3 = aVarM17902b2.m17903c(1937013298);
                            if (bVarM17903c3 == null) {
                                throw ParserException.m6770a("Track has no sample table size information", null);
                            }
                            fVar = new f(bVarM17903c3);
                        }
                        iMo17911b = fVar.mo17911b();
                        if (iMo17911b == 0) {
                            c9491n2 = new C9491n(c9488k2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                            arrayList2 = arrayList2;
                            i23 = i58;
                        } else {
                            bVarM17903c4 = aVarM17902b2.m17903c(1937007471);
                            if (bVarM17903c4 == null) {
                                bVarM17903c4 = aVarM17902b2.m17903c(1668232756);
                                bVarM17903c4.getClass();
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            AbstractC9478a.b bVarM17903c115 = aVarM17902b2.m17903c(1937011555);
                            bVarM17903c115.getClass();
                            AbstractC9478a.b bVarM17903c116 = aVarM17902b2.m17903c(1937011827);
                            bVarM17903c116.getClass();
                            bVarM17903c5 = aVarM17902b2.m17903c(1937011571);
                            if (bVarM17903c5 != null) {
                                c10151t3 = bVarM17903c5.f48607b;
                            } else {
                                c10151t3 = null;
                            }
                            bVarM17903c6 = aVarM17902b2.m17903c(1668576371);
                            if (bVarM17903c6 != null) {
                                c10151t4 = bVarM17903c6.f48607b;
                            } else {
                                c10151t4 = null;
                            }
                            aVar2 = new a(bVarM17903c115.f48607b, bVarM17903c4.f48607b, z13);
                            C10151t c10151t16 = bVarM17903c116.f48607b;
                            c10151t16.m19124E(12);
                            iM19148w = c10151t16.m19148w() - 1;
                            iM19148w2 = c10151t16.m19148w();
                            iM19148w3 = c10151t16.m19148w();
                            if (c10151t4 != null) {
                                c10151t4.m19124E(12);
                                iM19148w4 = c10151t4.m19148w();
                            } else {
                                iM19148w4 = 0;
                            }
                            if (c10151t3 != null) {
                                c10151t3.m19124E(12);
                                iM19148w5 = c10151t3.m19148w();
                                if (iM19148w5 > 0) {
                                    iM19148w6 = c10151t3.m19148w() - 1;
                                    i22 = -1;
                                } else {
                                    i21 = -1;
                                    c10151t3 = null;
                                }
                                iMo17910a = fVar.mo17910a();
                                i23 = i58;
                                String str13 = c2416m.f12484l;
                                if (iMo17910a == i22) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i49 = aVar2.f48609a;
                                    jArr12 = new long[i49];
                                    iArr10 = new int[i49];
                                    while (aVar2.m17909a()) {
                                        int i61111111111 = aVar2.f48610b;
                                        jArr12[i61111111111] = aVar2.f48612d;
                                        iArr10[i61111111111] = aVar2.f48611c;
                                    }
                                    j21 = iM19148w3;
                                    i50 = 8192 / iMo17910a;
                                    i52 = 0;
                                    while (i51 < i49) {
                                        int i61111111112 = iArr10[i51];
                                        int i61111111113 = C10134c0.f51354a;
                                        i52 += ((i61111111112 + i50) - 1) / i50;
                                    }
                                    jArr4 = new long[i52];
                                    iArr11 = new int[i52];
                                    jArr13 = new long[i52];
                                    iArr = new int[i52];
                                    i53 = 0;
                                    i54 = 0;
                                    i55 = 0;
                                    i56 = 0;
                                    while (i56 < i49) {
                                        int i61111111114 = iArr10[i56];
                                        j22 = jArr12[i56];
                                        long[] jArr111116 = jArr12;
                                        iMax = i53;
                                        int i61111111115 = i49;
                                        i57 = i61111111114;
                                        while (i57 > 0) {
                                            int iMin11 = Math.min(i50, i57);
                                            jArr4[i54] = j22;
                                            int[] iArr11111 = iArr10;
                                            int i61111111116 = iMo17910a * iMin11;
                                            iArr11[i54] = i61111111116;
                                            iMax = Math.max(iMax, i61111111116);
                                            jArr13[i54] = ((long) i55) * j21;
                                            iArr[i54] = 1;
                                            j22 += (long) iArr11[i54];
                                            i55 += iMin11;
                                            i57 -= iMin11;
                                            i54++;
                                            iArr10 = iArr11111;
                                            i50 = i50;
                                        }
                                        i56++;
                                        i53 = iMax;
                                        i49 = i61111111115;
                                        jArr12 = jArr111116;
                                    }
                                    j15 = j21 * ((long) i55);
                                    iArrCopyOf = iArr11;
                                    jArr3 = jArr13;
                                    i26 = i53;
                                    c9488k3 = c9488k2;
                                } else {
                                    jArrCopyOf = new long[iMo17911b];
                                    iArrCopyOf = new int[iMo17911b];
                                    jArrCopyOf2 = new long[iMo17911b];
                                    iArrCopyOf2 = new int[iMo17911b];
                                    i24 = 0;
                                    j13 = 0;
                                    j14 = 0;
                                    iM19129d5 = 0;
                                    iM19148w7 = 0;
                                    int i61111111117 = iM19148w;
                                    i25 = iM19148w3;
                                    i26 = 0;
                                    iM19148w8 = iM19148w2;
                                    iM19148w9 = iM19148w6;
                                    i27 = iM19148w4;
                                    i28 = 0;
                                    while (i28 < iMo17911b) {
                                        zM17909a = true;
                                        while (i24 == 0) {
                                            zM17909a = aVar2.m17909a();
                                            if (zM17909a) {
                                                break;
                                                break;
                                            }
                                            j14 = aVar2.f48612d;
                                            i24 = aVar2.f48611c;
                                            iMo17911b = iMo17911b;
                                            i25 = i25;
                                        }
                                        i30 = iMo17911b;
                                        i31 = i25;
                                        if (!zM17909a) {
                                            C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                            iMo17911b = i28;
                                            break;
                                        }
                                        if (c10151t4 != null) {
                                            while (iM19148w7 == 0) {
                                                iM19148w7 = c10151t4.m19148w();
                                                iM19129d5 = c10151t4.m19129d();
                                                i27--;
                                            }
                                            iM19148w7--;
                                        }
                                        int i61111111118 = iM19129d5;
                                        jArrCopyOf[i28] = j14;
                                        iMo17912c = fVar.mo17912c();
                                        iArrCopyOf[i28] = iMo17912c;
                                        if (iMo17912c > i26) {
                                            i32 = iMo17912c;
                                        } else {
                                            i32 = i26;
                                        }
                                        jArrCopyOf2[i28] = j13 + ((long) i61111111118);
                                        if (c10151t3 == null) {
                                            i33 = 1;
                                        } else {
                                            i33 = 0;
                                        }
                                        iArrCopyOf2[i28] = i33;
                                        if (i28 == iM19148w9) {
                                            iArrCopyOf2[i28] = 1;
                                            iM19148w5--;
                                            if (iM19148w5 > 0) {
                                                c10151t3.getClass();
                                                iM19148w9 = c10151t3.m19148w() - 1;
                                            }
                                        }
                                        long[] jArr111117 = jArrCopyOf2;
                                        int iM19129d1110 = i31;
                                        j13 += (long) iM19129d1110;
                                        iM19148w8--;
                                        if (iM19148w8 != 0) {
                                        }
                                        j14 += (long) iArrCopyOf[i28];
                                        i24--;
                                        i28++;
                                        jArrCopyOf2 = jArr111117;
                                        iM19129d5 = i61111111118;
                                        iMo17911b = i30;
                                        aVar2 = aVar2;
                                        i25 = iM19129d1110;
                                        i26 = i32;
                                    }
                                    int i61111111119 = i24;
                                    long j21115 = j13 + ((long) iM19129d5);
                                    if (c10151t4 != null) {
                                        z15 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i27 > 0) {
                                            z15 = true;
                                            break;
                                        }
                                        if (c10151t4.m19148w() != 0) {
                                            z15 = false;
                                            break;
                                        }
                                        c10151t4.m19129d();
                                        i27--;
                                    }
                                    if (iM19148w5 != 0) {
                                        i29 = iM19148w7;
                                        StringBuilder sb111 = new StringBuilder("Inconsistent stbl box for track ");
                                        c9488k3 = c9488k2;
                                        sb111.append(c9488k3.f48729a);
                                        sb111.append(": remainingSynchronizationSamples ");
                                        sb111.append(iM19148w5);
                                        sb111.append(", remainingSamplesAtTimestampDelta ");
                                        sb111.append(iM19148w8);
                                        sb111.append(", remainingSamplesInChunk ");
                                        sb111.append(i61111111119);
                                        sb111.append(", remainingTimestampDeltaChanges ");
                                        sb111.append(i61111111117);
                                        sb111.append(", remainingSamplesAtTimestampOffset ");
                                        sb111.append(i29);
                                        if (z15) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = str;
                                        }
                                        sb111.append(str2);
                                        C10145n.m19099g("AtomParsers", sb111.toString());
                                    } else {
                                        i29 = iM19148w7;
                                        StringBuilder sb112 = new StringBuilder("Inconsistent stbl box for track ");
                                        c9488k3 = c9488k2;
                                        sb112.append(c9488k3.f48729a);
                                        sb112.append(": remainingSynchronizationSamples ");
                                        sb112.append(iM19148w5);
                                        sb112.append(", remainingSamplesAtTimestampDelta ");
                                        sb112.append(iM19148w8);
                                        sb112.append(", remainingSamplesInChunk ");
                                        sb112.append(i61111111119);
                                        sb112.append(", remainingTimestampDeltaChanges ");
                                        sb112.append(i61111111117);
                                        sb112.append(", remainingSamplesAtTimestampOffset ");
                                        sb112.append(i29);
                                        if (z15) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = str;
                                        }
                                        sb112.append(str2);
                                        C10145n.m19099g("AtomParsers", sb112.toString());
                                    }
                                    jArr3 = jArrCopyOf2;
                                    iArr = iArrCopyOf2;
                                    j15 = j21115;
                                    jArr4 = jArrCopyOf;
                                }
                                jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                                j16 = c9488k3.f48731c;
                                jArr5 = c9488k3.f48736h;
                                if (jArr5 == null) {
                                    C10134c0.m19031P(jArr3, j16);
                                    c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                                } else {
                                    length = jArr5.length;
                                    i34 = c9488k3.f48730b;
                                    jArr6 = c9488k3.f48737i;
                                    if (length == 1) {
                                        i35 = iMo17911b;
                                        i36 = i34;
                                        jArr7 = jArr6;
                                        iArr2 = iArr;
                                        i37 = 1;
                                        if (jArr5.length == 1) {
                                            i38 = 0;
                                            if (jArr5[0] == 0) {
                                                jArr7.getClass();
                                                j20 = jArr7[0];
                                                while (i38 < jArr3.length) {
                                                    jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                    i38++;
                                                }
                                                c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                            } else {
                                                i37 = 1;
                                            }
                                        } else {
                                            i38 = 0;
                                        }
                                        if (i36 == i37) {
                                            z16 = 1;
                                        } else {
                                            z16 = i38;
                                        }
                                        iArr3 = new int[jArr5.length];
                                        iArr4 = new int[jArr5.length];
                                        jArr7.getClass();
                                        i39 = i38;
                                        i40 = i39;
                                        i41 = i40;
                                        while (i38 < jArr5.length) {
                                            long[] jArr111118 = jArr4;
                                            j19 = jArr7[i38];
                                            if (j19 != -1) {
                                                int i711111111111114 = i39;
                                                int i711111111111115 = i40;
                                                long jM19030O115 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O115, z16);
                                                while (true) {
                                                    i47 = iArr3[i38];
                                                    i48 = iArr4[i38];
                                                    if (i47 < i48) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i38] = i47 + 1;
                                                }
                                                i40 = (i48 - i47) + i711111111111115;
                                                i39 = i711111111111114 | (i41 == i47 ? 0 : 1);
                                                i41 = i48;
                                            }
                                            i38++;
                                            jArr4 = jArr111118;
                                            jArr5 = jArr5;
                                            iArrCopyOf = iArrCopyOf;
                                        }
                                        iArr5 = iArrCopyOf;
                                        long[] jArr211111116 = jArr5;
                                        jArr8 = jArr4;
                                        i42 = i39 | (i40 == i35 ? 0 : 1);
                                        if (i42 != 0) {
                                            jArr9 = new long[i40];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (i42 != 0) {
                                            iArr6 = new int[i40];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i42 != 0) {
                                            i26 = 0;
                                        }
                                        if (i42 != 0) {
                                            iArr7 = new int[i40];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        jArr10 = new long[i40];
                                        i43 = 0;
                                        j17 = 0;
                                        i44 = 0;
                                        jArr11 = jArr211111116;
                                        while (i44 < jArr11.length) {
                                            j18 = jArr7[i44];
                                            i45 = iArr3[i44];
                                            int[] iArr11112 = iArr3;
                                            i46 = iArr4[i44];
                                            if (i42 != 0) {
                                                int i711111111111116 = i46 - i45;
                                                System.arraycopy(jArr8, i45, jArr9, i43, i711111111111116);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i45, iArr6, i43, i711111111111116);
                                                iArr9 = iArr2;
                                                System.arraycopy(iArr9, i45, iArr7, i43, i711111111111116);
                                            } else {
                                                iArr8 = iArr5;
                                                iArr9 = iArr2;
                                            }
                                            int i711111111111117 = i26;
                                            while (i45 < i46) {
                                                int i711111111111118 = i46;
                                                long[] jArr211111117 = jArr11;
                                                long j21116 = j17;
                                                int i711111111111119 = i44;
                                                long[] jArr211111118 = jArr3;
                                                jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                if (i42 == 0) {
                                                }
                                                i43++;
                                                i45++;
                                                jArr11 = jArr211111117;
                                                jArr3 = jArr211111118;
                                                i44 = i711111111111119;
                                                j17 = j21116;
                                                i46 = i711111111111118;
                                            }
                                            long[] jArr211111119 = jArr11;
                                            int i7111111111111110 = i44;
                                            j17 += jArr211111119[i7111111111111110];
                                            i44 = i7111111111111110 + 1;
                                            iArr3 = iArr11112;
                                            jArr11 = jArr211111119;
                                            iArr2 = iArr9;
                                            jArr9 = jArr9;
                                            iArr5 = iArr8;
                                            i26 = i711111111111117;
                                            iArr4 = iArr4;
                                        }
                                        c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                    } else {
                                        i35 = iMo17911b;
                                        i36 = i34;
                                        jArr7 = jArr6;
                                        iArr2 = iArr;
                                        i37 = 1;
                                        if (jArr5.length == 1) {
                                            i38 = 0;
                                            if (jArr5[0] == 0) {
                                                jArr7.getClass();
                                                j20 = jArr7[0];
                                                while (i38 < jArr3.length) {
                                                    jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                    i38++;
                                                }
                                                c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                            } else {
                                                i37 = 1;
                                            }
                                        } else {
                                            i38 = 0;
                                        }
                                        if (i36 == i37) {
                                            z16 = 1;
                                        } else {
                                            z16 = i38;
                                        }
                                        iArr3 = new int[jArr5.length];
                                        iArr4 = new int[jArr5.length];
                                        jArr7.getClass();
                                        i39 = i38;
                                        i40 = i39;
                                        i41 = i40;
                                        while (i38 < jArr5.length) {
                                            long[] jArr111119 = jArr4;
                                            j19 = jArr7[i38];
                                            if (j19 != -1) {
                                                int i7111111111111111 = i39;
                                                int i7111111111111112 = i40;
                                                long jM19030O116 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                                iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                                iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O116, z16);
                                                while (true) {
                                                    i47 = iArr3[i38];
                                                    i48 = iArr4[i38];
                                                    if (i47 < i48) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr3[i38] = i47 + 1;
                                                }
                                                i40 = (i48 - i47) + i7111111111111112;
                                                i39 = i7111111111111111 | (i41 == i47 ? 0 : 1);
                                                i41 = i48;
                                            }
                                            i38++;
                                            jArr4 = jArr111119;
                                            jArr5 = jArr5;
                                            iArrCopyOf = iArrCopyOf;
                                        }
                                        iArr5 = iArrCopyOf;
                                        long[] jArr2111111110 = jArr5;
                                        jArr8 = jArr4;
                                        i42 = i39 | (i40 == i35 ? 0 : 1);
                                        if (i42 != 0) {
                                            jArr9 = new long[i40];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (i42 != 0) {
                                            iArr6 = new int[i40];
                                        } else {
                                            iArr6 = iArr5;
                                        }
                                        if (i42 != 0) {
                                            i26 = 0;
                                        }
                                        if (i42 != 0) {
                                            iArr7 = new int[i40];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        jArr10 = new long[i40];
                                        i43 = 0;
                                        j17 = 0;
                                        i44 = 0;
                                        jArr11 = jArr2111111110;
                                        while (i44 < jArr11.length) {
                                            j18 = jArr7[i44];
                                            i45 = iArr3[i44];
                                            int[] iArr11113 = iArr3;
                                            i46 = iArr4[i44];
                                            if (i42 != 0) {
                                                int i7111111111111113 = i46 - i45;
                                                System.arraycopy(jArr8, i45, jArr9, i43, i7111111111111113);
                                                iArr8 = iArr5;
                                                System.arraycopy(iArr8, i45, iArr6, i43, i7111111111111113);
                                                iArr9 = iArr2;
                                                System.arraycopy(iArr9, i45, iArr7, i43, i7111111111111113);
                                            } else {
                                                iArr8 = iArr5;
                                                iArr9 = iArr2;
                                            }
                                            int i7111111111111114 = i26;
                                            while (i45 < i46) {
                                                int i7111111111111115 = i46;
                                                long[] jArr2111111111 = jArr11;
                                                long j21117 = j17;
                                                int i7111111111111116 = i44;
                                                long[] jArr2111111112 = jArr3;
                                                jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                                if (i42 == 0) {
                                                }
                                                i43++;
                                                i45++;
                                                jArr11 = jArr2111111111;
                                                jArr3 = jArr2111111112;
                                                i44 = i7111111111111116;
                                                j17 = j21117;
                                                i46 = i7111111111111115;
                                            }
                                            long[] jArr2111111113 = jArr11;
                                            int i7111111111111117 = i44;
                                            j17 += jArr2111111113[i7111111111111117];
                                            i44 = i7111111111111117 + 1;
                                            iArr3 = iArr11113;
                                            jArr11 = jArr2111111113;
                                            iArr2 = iArr9;
                                            jArr9 = jArr9;
                                            iArr5 = iArr8;
                                            i26 = i7111111111111114;
                                            iArr4 = iArr4;
                                        }
                                        c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                    }
                                    c9491n2 = c9491n;
                                }
                            } else {
                                i21 = -1;
                                iM19148w5 = 0;
                            }
                            i22 = i21;
                            iM19148w6 = i22;
                            iMo17910a = fVar.mo17910a();
                            i23 = i58;
                            String str14 = c2416m.f12484l;
                            if (iMo17910a == i22) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                i49 = aVar2.f48609a;
                                jArr12 = new long[i49];
                                iArr10 = new int[i49];
                                while (aVar2.m17909a()) {
                                    int i611111111110 = aVar2.f48610b;
                                    jArr12[i611111111110] = aVar2.f48612d;
                                    iArr10[i611111111110] = aVar2.f48611c;
                                }
                                j21 = iM19148w3;
                                i50 = 8192 / iMo17910a;
                                i52 = 0;
                                while (i51 < i49) {
                                    int i611111111111 = iArr10[i51];
                                    int i611111111112 = C10134c0.f51354a;
                                    i52 += ((i611111111111 + i50) - 1) / i50;
                                }
                                jArr4 = new long[i52];
                                iArr11 = new int[i52];
                                jArr13 = new long[i52];
                                iArr = new int[i52];
                                i53 = 0;
                                i54 = 0;
                                i55 = 0;
                                i56 = 0;
                                while (i56 < i49) {
                                    int i611111111113 = iArr10[i56];
                                    j22 = jArr12[i56];
                                    long[] jArr1111110 = jArr12;
                                    iMax = i53;
                                    int i611111111114 = i49;
                                    i57 = i611111111113;
                                    while (i57 > 0) {
                                        int iMin12 = Math.min(i50, i57);
                                        jArr4[i54] = j22;
                                        int[] iArr11114 = iArr10;
                                        int i611111111115 = iMo17910a * iMin12;
                                        iArr11[i54] = i611111111115;
                                        iMax = Math.max(iMax, i611111111115);
                                        jArr13[i54] = ((long) i55) * j21;
                                        iArr[i54] = 1;
                                        j22 += (long) iArr11[i54];
                                        i55 += iMin12;
                                        i57 -= iMin12;
                                        i54++;
                                        iArr10 = iArr11114;
                                        i50 = i50;
                                    }
                                    i56++;
                                    i53 = iMax;
                                    i49 = i611111111114;
                                    jArr12 = jArr1111110;
                                }
                                j15 = j21 * ((long) i55);
                                iArrCopyOf = iArr11;
                                jArr3 = jArr13;
                                i26 = i53;
                                c9488k3 = c9488k2;
                            } else {
                                jArrCopyOf = new long[iMo17911b];
                                iArrCopyOf = new int[iMo17911b];
                                jArrCopyOf2 = new long[iMo17911b];
                                iArrCopyOf2 = new int[iMo17911b];
                                i24 = 0;
                                j13 = 0;
                                j14 = 0;
                                iM19129d5 = 0;
                                iM19148w7 = 0;
                                int i611111111116 = iM19148w;
                                i25 = iM19148w3;
                                i26 = 0;
                                iM19148w8 = iM19148w2;
                                iM19148w9 = iM19148w6;
                                i27 = iM19148w4;
                                i28 = 0;
                                while (i28 < iMo17911b) {
                                    zM17909a = true;
                                    while (i24 == 0) {
                                        zM17909a = aVar2.m17909a();
                                        if (zM17909a) {
                                            break;
                                            break;
                                        }
                                        j14 = aVar2.f48612d;
                                        i24 = aVar2.f48611c;
                                        iMo17911b = iMo17911b;
                                        i25 = i25;
                                    }
                                    i30 = iMo17911b;
                                    i31 = i25;
                                    if (!zM17909a) {
                                        C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                        iMo17911b = i28;
                                        break;
                                    }
                                    if (c10151t4 != null) {
                                        while (iM19148w7 == 0) {
                                            iM19148w7 = c10151t4.m19148w();
                                            iM19129d5 = c10151t4.m19129d();
                                            i27--;
                                        }
                                        iM19148w7--;
                                    }
                                    int i611111111117 = iM19129d5;
                                    jArrCopyOf[i28] = j14;
                                    iMo17912c = fVar.mo17912c();
                                    iArrCopyOf[i28] = iMo17912c;
                                    if (iMo17912c > i26) {
                                        i32 = iMo17912c;
                                    } else {
                                        i32 = i26;
                                    }
                                    jArrCopyOf2[i28] = j13 + ((long) i611111111117);
                                    if (c10151t3 == null) {
                                        i33 = 1;
                                    } else {
                                        i33 = 0;
                                    }
                                    iArrCopyOf2[i28] = i33;
                                    if (i28 == iM19148w9) {
                                        iArrCopyOf2[i28] = 1;
                                        iM19148w5--;
                                        if (iM19148w5 > 0) {
                                            c10151t3.getClass();
                                            iM19148w9 = c10151t3.m19148w() - 1;
                                        }
                                    }
                                    long[] jArr1111111 = jArrCopyOf2;
                                    int iM19129d1111 = i31;
                                    j13 += (long) iM19129d1111;
                                    iM19148w8--;
                                    if (iM19148w8 != 0) {
                                    }
                                    j14 += (long) iArrCopyOf[i28];
                                    i24--;
                                    i28++;
                                    jArrCopyOf2 = jArr1111111;
                                    iM19129d5 = i611111111117;
                                    iMo17911b = i30;
                                    aVar2 = aVar2;
                                    i25 = iM19129d1111;
                                    i26 = i32;
                                }
                                int i611111111118 = i24;
                                long j21118 = j13 + ((long) iM19129d5);
                                if (c10151t4 != null) {
                                    z15 = true;
                                    break;
                                }
                                while (true) {
                                    if (i27 > 0) {
                                        z15 = true;
                                        break;
                                    }
                                    if (c10151t4.m19148w() != 0) {
                                        z15 = false;
                                        break;
                                    }
                                    c10151t4.m19129d();
                                    i27--;
                                }
                                if (iM19148w5 != 0) {
                                    i29 = iM19148w7;
                                    StringBuilder sb113 = new StringBuilder("Inconsistent stbl box for track ");
                                    c9488k3 = c9488k2;
                                    sb113.append(c9488k3.f48729a);
                                    sb113.append(": remainingSynchronizationSamples ");
                                    sb113.append(iM19148w5);
                                    sb113.append(", remainingSamplesAtTimestampDelta ");
                                    sb113.append(iM19148w8);
                                    sb113.append(", remainingSamplesInChunk ");
                                    sb113.append(i611111111118);
                                    sb113.append(", remainingTimestampDeltaChanges ");
                                    sb113.append(i611111111116);
                                    sb113.append(", remainingSamplesAtTimestampOffset ");
                                    sb113.append(i29);
                                    if (z15) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = str;
                                    }
                                    sb113.append(str2);
                                    C10145n.m19099g("AtomParsers", sb113.toString());
                                } else {
                                    i29 = iM19148w7;
                                    StringBuilder sb114 = new StringBuilder("Inconsistent stbl box for track ");
                                    c9488k3 = c9488k2;
                                    sb114.append(c9488k3.f48729a);
                                    sb114.append(": remainingSynchronizationSamples ");
                                    sb114.append(iM19148w5);
                                    sb114.append(", remainingSamplesAtTimestampDelta ");
                                    sb114.append(iM19148w8);
                                    sb114.append(", remainingSamplesInChunk ");
                                    sb114.append(i611111111118);
                                    sb114.append(", remainingTimestampDeltaChanges ");
                                    sb114.append(i611111111116);
                                    sb114.append(", remainingSamplesAtTimestampOffset ");
                                    sb114.append(i29);
                                    if (z15) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = str;
                                    }
                                    sb114.append(str2);
                                    C10145n.m19099g("AtomParsers", sb114.toString());
                                }
                                jArr3 = jArrCopyOf2;
                                iArr = iArrCopyOf2;
                                j15 = j21118;
                                jArr4 = jArrCopyOf;
                            }
                            jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                            j16 = c9488k3.f48731c;
                            jArr5 = c9488k3.f48736h;
                            if (jArr5 == null) {
                                C10134c0.m19031P(jArr3, j16);
                                c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                            } else {
                                length = jArr5.length;
                                i34 = c9488k3.f48730b;
                                jArr6 = c9488k3.f48737i;
                                if (length == 1) {
                                    i35 = iMo17911b;
                                    i36 = i34;
                                    jArr7 = jArr6;
                                    iArr2 = iArr;
                                    i37 = 1;
                                    if (jArr5.length == 1) {
                                        i38 = 0;
                                        if (jArr5[0] == 0) {
                                            jArr7.getClass();
                                            j20 = jArr7[0];
                                            while (i38 < jArr3.length) {
                                                jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                i38++;
                                            }
                                            c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                        } else {
                                            i37 = 1;
                                        }
                                    } else {
                                        i38 = 0;
                                    }
                                    if (i36 == i37) {
                                        z16 = 1;
                                    } else {
                                        z16 = i38;
                                    }
                                    iArr3 = new int[jArr5.length];
                                    iArr4 = new int[jArr5.length];
                                    jArr7.getClass();
                                    i39 = i38;
                                    i40 = i39;
                                    i41 = i40;
                                    while (i38 < jArr5.length) {
                                        long[] jArr1111112 = jArr4;
                                        j19 = jArr7[i38];
                                        if (j19 != -1) {
                                            int i7111111111111118 = i39;
                                            int i7111111111111119 = i40;
                                            long jM19030O117 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                            iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                            iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O117, z16);
                                            while (true) {
                                                i47 = iArr3[i38];
                                                i48 = iArr4[i38];
                                                if (i47 < i48) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i38] = i47 + 1;
                                            }
                                            i40 = (i48 - i47) + i7111111111111119;
                                            i39 = i7111111111111118 | (i41 == i47 ? 0 : 1);
                                            i41 = i48;
                                        }
                                        i38++;
                                        jArr4 = jArr1111112;
                                        jArr5 = jArr5;
                                        iArrCopyOf = iArrCopyOf;
                                    }
                                    iArr5 = iArrCopyOf;
                                    long[] jArr2111111114 = jArr5;
                                    jArr8 = jArr4;
                                    i42 = i39 | (i40 == i35 ? 0 : 1);
                                    if (i42 != 0) {
                                        jArr9 = new long[i40];
                                    } else {
                                        jArr9 = jArr8;
                                    }
                                    if (i42 != 0) {
                                        iArr6 = new int[i40];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i42 != 0) {
                                        i26 = 0;
                                    }
                                    if (i42 != 0) {
                                        iArr7 = new int[i40];
                                    } else {
                                        iArr7 = iArr2;
                                    }
                                    jArr10 = new long[i40];
                                    i43 = 0;
                                    j17 = 0;
                                    i44 = 0;
                                    jArr11 = jArr2111111114;
                                    while (i44 < jArr11.length) {
                                        j18 = jArr7[i44];
                                        i45 = iArr3[i44];
                                        int[] iArr11115 = iArr3;
                                        i46 = iArr4[i44];
                                        if (i42 != 0) {
                                            int i71111111111111110 = i46 - i45;
                                            System.arraycopy(jArr8, i45, jArr9, i43, i71111111111111110);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i45, iArr6, i43, i71111111111111110);
                                            iArr9 = iArr2;
                                            System.arraycopy(iArr9, i45, iArr7, i43, i71111111111111110);
                                        } else {
                                            iArr8 = iArr5;
                                            iArr9 = iArr2;
                                        }
                                        int i71111111111111111 = i26;
                                        while (i45 < i46) {
                                            int i71111111111111112 = i46;
                                            long[] jArr2111111115 = jArr11;
                                            long j21119 = j17;
                                            int i71111111111111113 = i44;
                                            long[] jArr2111111116 = jArr3;
                                            jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                            if (i42 == 0) {
                                            }
                                            i43++;
                                            i45++;
                                            jArr11 = jArr2111111115;
                                            jArr3 = jArr2111111116;
                                            i44 = i71111111111111113;
                                            j17 = j21119;
                                            i46 = i71111111111111112;
                                        }
                                        long[] jArr2111111117 = jArr11;
                                        int i71111111111111114 = i44;
                                        j17 += jArr2111111117[i71111111111111114];
                                        i44 = i71111111111111114 + 1;
                                        iArr3 = iArr11115;
                                        jArr11 = jArr2111111117;
                                        iArr2 = iArr9;
                                        jArr9 = jArr9;
                                        iArr5 = iArr8;
                                        i26 = i71111111111111111;
                                        iArr4 = iArr4;
                                    }
                                    c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                } else {
                                    i35 = iMo17911b;
                                    i36 = i34;
                                    jArr7 = jArr6;
                                    iArr2 = iArr;
                                    i37 = 1;
                                    if (jArr5.length == 1) {
                                        i38 = 0;
                                        if (jArr5[0] == 0) {
                                            jArr7.getClass();
                                            j20 = jArr7[0];
                                            while (i38 < jArr3.length) {
                                                jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                i38++;
                                            }
                                            c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                        } else {
                                            i37 = 1;
                                        }
                                    } else {
                                        i38 = 0;
                                    }
                                    if (i36 == i37) {
                                        z16 = 1;
                                    } else {
                                        z16 = i38;
                                    }
                                    iArr3 = new int[jArr5.length];
                                    iArr4 = new int[jArr5.length];
                                    jArr7.getClass();
                                    i39 = i38;
                                    i40 = i39;
                                    i41 = i40;
                                    while (i38 < jArr5.length) {
                                        long[] jArr1111113 = jArr4;
                                        j19 = jArr7[i38];
                                        if (j19 != -1) {
                                            int i71111111111111115 = i39;
                                            int i71111111111111116 = i40;
                                            long jM19030O118 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                            iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                            iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O118, z16);
                                            while (true) {
                                                i47 = iArr3[i38];
                                                i48 = iArr4[i38];
                                                if (i47 < i48) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i38] = i47 + 1;
                                            }
                                            i40 = (i48 - i47) + i71111111111111116;
                                            i39 = i71111111111111115 | (i41 == i47 ? 0 : 1);
                                            i41 = i48;
                                        }
                                        i38++;
                                        jArr4 = jArr1111113;
                                        jArr5 = jArr5;
                                        iArrCopyOf = iArrCopyOf;
                                    }
                                    iArr5 = iArrCopyOf;
                                    long[] jArr2111111118 = jArr5;
                                    jArr8 = jArr4;
                                    i42 = i39 | (i40 == i35 ? 0 : 1);
                                    if (i42 != 0) {
                                        jArr9 = new long[i40];
                                    } else {
                                        jArr9 = jArr8;
                                    }
                                    if (i42 != 0) {
                                        iArr6 = new int[i40];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i42 != 0) {
                                        i26 = 0;
                                    }
                                    if (i42 != 0) {
                                        iArr7 = new int[i40];
                                    } else {
                                        iArr7 = iArr2;
                                    }
                                    jArr10 = new long[i40];
                                    i43 = 0;
                                    j17 = 0;
                                    i44 = 0;
                                    jArr11 = jArr2111111118;
                                    while (i44 < jArr11.length) {
                                        j18 = jArr7[i44];
                                        i45 = iArr3[i44];
                                        int[] iArr11116 = iArr3;
                                        i46 = iArr4[i44];
                                        if (i42 != 0) {
                                            int i71111111111111117 = i46 - i45;
                                            System.arraycopy(jArr8, i45, jArr9, i43, i71111111111111117);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i45, iArr6, i43, i71111111111111117);
                                            iArr9 = iArr2;
                                            System.arraycopy(iArr9, i45, iArr7, i43, i71111111111111117);
                                        } else {
                                            iArr8 = iArr5;
                                            iArr9 = iArr2;
                                        }
                                        int i71111111111111118 = i26;
                                        while (i45 < i46) {
                                            int i71111111111111119 = i46;
                                            long[] jArr2111111119 = jArr11;
                                            long j211110 = j17;
                                            int i711111111111111110 = i44;
                                            long[] jArr21111111110 = jArr3;
                                            jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                            if (i42 == 0) {
                                            }
                                            i43++;
                                            i45++;
                                            jArr11 = jArr2111111119;
                                            jArr3 = jArr21111111110;
                                            i44 = i711111111111111110;
                                            j17 = j211110;
                                            i46 = i71111111111111119;
                                        }
                                        long[] jArr21111111111 = jArr11;
                                        int i711111111111111111 = i44;
                                        j17 += jArr21111111111[i711111111111111111];
                                        i44 = i711111111111111111 + 1;
                                        iArr3 = iArr11116;
                                        jArr11 = jArr21111111111;
                                        iArr2 = iArr9;
                                        jArr9 = jArr9;
                                        iArr5 = iArr8;
                                        i26 = i71111111111111118;
                                        iArr4 = iArr4;
                                    }
                                    c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                }
                                c9491n2 = c9491n;
                            }
                        }
                        arrayList = arrayList2;
                        arrayList.add(c9491n2);
                    }
                }
                c9488k = null;
                i20 = 1835626086;
                c9488k2 = (C9488k) interfaceC10171c.apply(c9488k);
                if (c9488k2 == null) {
                    arrayList = arrayList2;
                    i23 = i58;
                } else {
                    AbstractC9478a.a aVarM17902b114 = aVar3.m17902b(1835297121);
                    aVarM17902b114.getClass();
                    AbstractC9478a.a aVarM17902b115 = aVarM17902b114.m17902b(i20);
                    aVarM17902b115.getClass();
                    aVarM17902b2 = aVarM17902b115.m17902b(1937007212);
                    aVarM17902b2.getClass();
                    bVarM17903c2 = aVarM17902b2.m17903c(1937011578);
                    c2416m = c9488k2.f48734f;
                    if (bVarM17903c2 != null) {
                        fVar = new e(bVarM17903c2, c2416m);
                    } else {
                        bVarM17903c3 = aVarM17902b2.m17903c(1937013298);
                        if (bVarM17903c3 == null) {
                            throw ParserException.m6770a("Track has no sample table size information", null);
                        }
                        fVar = new f(bVarM17903c3);
                    }
                    iMo17911b = fVar.mo17911b();
                    if (iMo17911b == 0) {
                        c9491n2 = new C9491n(c9488k2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        arrayList2 = arrayList2;
                        i23 = i58;
                    } else {
                        bVarM17903c4 = aVarM17902b2.m17903c(1937007471);
                        if (bVarM17903c4 == null) {
                            bVarM17903c4 = aVarM17902b2.m17903c(1668232756);
                            bVarM17903c4.getClass();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        AbstractC9478a.b bVarM17903c117 = aVarM17902b2.m17903c(1937011555);
                        bVarM17903c117.getClass();
                        AbstractC9478a.b bVarM17903c118 = aVarM17902b2.m17903c(1937011827);
                        bVarM17903c118.getClass();
                        bVarM17903c5 = aVarM17902b2.m17903c(1937011571);
                        if (bVarM17903c5 != null) {
                            c10151t3 = bVarM17903c5.f48607b;
                        } else {
                            c10151t3 = null;
                        }
                        bVarM17903c6 = aVarM17902b2.m17903c(1668576371);
                        if (bVarM17903c6 != null) {
                            c10151t4 = bVarM17903c6.f48607b;
                        } else {
                            c10151t4 = null;
                        }
                        aVar2 = new a(bVarM17903c117.f48607b, bVarM17903c4.f48607b, z13);
                        C10151t c10151t17 = bVarM17903c118.f48607b;
                        c10151t17.m19124E(12);
                        iM19148w = c10151t17.m19148w() - 1;
                        iM19148w2 = c10151t17.m19148w();
                        iM19148w3 = c10151t17.m19148w();
                        if (c10151t4 != null) {
                            c10151t4.m19124E(12);
                            iM19148w4 = c10151t4.m19148w();
                        } else {
                            iM19148w4 = 0;
                        }
                        if (c10151t3 != null) {
                            c10151t3.m19124E(12);
                            iM19148w5 = c10151t3.m19148w();
                            if (iM19148w5 > 0) {
                                iM19148w6 = c10151t3.m19148w() - 1;
                                i22 = -1;
                            } else {
                                i21 = -1;
                                c10151t3 = null;
                            }
                            iMo17910a = fVar.mo17910a();
                            i23 = i58;
                            String str15 = c2416m.f12484l;
                            if (iMo17910a == i22) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                i49 = aVar2.f48609a;
                                jArr12 = new long[i49];
                                iArr10 = new int[i49];
                                while (aVar2.m17909a()) {
                                    int i611111111119 = aVar2.f48610b;
                                    jArr12[i611111111119] = aVar2.f48612d;
                                    iArr10[i611111111119] = aVar2.f48611c;
                                }
                                j21 = iM19148w3;
                                i50 = 8192 / iMo17910a;
                                i52 = 0;
                                while (i51 < i49) {
                                    int i6111111111110 = iArr10[i51];
                                    int i6111111111111 = C10134c0.f51354a;
                                    i52 += ((i6111111111110 + i50) - 1) / i50;
                                }
                                jArr4 = new long[i52];
                                iArr11 = new int[i52];
                                jArr13 = new long[i52];
                                iArr = new int[i52];
                                i53 = 0;
                                i54 = 0;
                                i55 = 0;
                                i56 = 0;
                                while (i56 < i49) {
                                    int i6111111111112 = iArr10[i56];
                                    j22 = jArr12[i56];
                                    long[] jArr1111114 = jArr12;
                                    iMax = i53;
                                    int i6111111111113 = i49;
                                    i57 = i6111111111112;
                                    while (i57 > 0) {
                                        int iMin13 = Math.min(i50, i57);
                                        jArr4[i54] = j22;
                                        int[] iArr11117 = iArr10;
                                        int i6111111111114 = iMo17910a * iMin13;
                                        iArr11[i54] = i6111111111114;
                                        iMax = Math.max(iMax, i6111111111114);
                                        jArr13[i54] = ((long) i55) * j21;
                                        iArr[i54] = 1;
                                        j22 += (long) iArr11[i54];
                                        i55 += iMin13;
                                        i57 -= iMin13;
                                        i54++;
                                        iArr10 = iArr11117;
                                        i50 = i50;
                                    }
                                    i56++;
                                    i53 = iMax;
                                    i49 = i6111111111113;
                                    jArr12 = jArr1111114;
                                }
                                j15 = j21 * ((long) i55);
                                iArrCopyOf = iArr11;
                                jArr3 = jArr13;
                                i26 = i53;
                                c9488k3 = c9488k2;
                            } else {
                                jArrCopyOf = new long[iMo17911b];
                                iArrCopyOf = new int[iMo17911b];
                                jArrCopyOf2 = new long[iMo17911b];
                                iArrCopyOf2 = new int[iMo17911b];
                                i24 = 0;
                                j13 = 0;
                                j14 = 0;
                                iM19129d5 = 0;
                                iM19148w7 = 0;
                                int i6111111111115 = iM19148w;
                                i25 = iM19148w3;
                                i26 = 0;
                                iM19148w8 = iM19148w2;
                                iM19148w9 = iM19148w6;
                                i27 = iM19148w4;
                                i28 = 0;
                                while (i28 < iMo17911b) {
                                    zM17909a = true;
                                    while (i24 == 0) {
                                        zM17909a = aVar2.m17909a();
                                        if (zM17909a) {
                                            break;
                                            break;
                                        }
                                        j14 = aVar2.f48612d;
                                        i24 = aVar2.f48611c;
                                        iMo17911b = iMo17911b;
                                        i25 = i25;
                                    }
                                    i30 = iMo17911b;
                                    i31 = i25;
                                    if (!zM17909a) {
                                        C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                        iMo17911b = i28;
                                        break;
                                    }
                                    if (c10151t4 != null) {
                                        while (iM19148w7 == 0) {
                                            iM19148w7 = c10151t4.m19148w();
                                            iM19129d5 = c10151t4.m19129d();
                                            i27--;
                                        }
                                        iM19148w7--;
                                    }
                                    int i6111111111116 = iM19129d5;
                                    jArrCopyOf[i28] = j14;
                                    iMo17912c = fVar.mo17912c();
                                    iArrCopyOf[i28] = iMo17912c;
                                    if (iMo17912c > i26) {
                                        i32 = iMo17912c;
                                    } else {
                                        i32 = i26;
                                    }
                                    jArrCopyOf2[i28] = j13 + ((long) i6111111111116);
                                    if (c10151t3 == null) {
                                        i33 = 1;
                                    } else {
                                        i33 = 0;
                                    }
                                    iArrCopyOf2[i28] = i33;
                                    if (i28 == iM19148w9) {
                                        iArrCopyOf2[i28] = 1;
                                        iM19148w5--;
                                        if (iM19148w5 > 0) {
                                            c10151t3.getClass();
                                            iM19148w9 = c10151t3.m19148w() - 1;
                                        }
                                    }
                                    long[] jArr1111115 = jArrCopyOf2;
                                    int iM19129d1112 = i31;
                                    j13 += (long) iM19129d1112;
                                    iM19148w8--;
                                    if (iM19148w8 != 0) {
                                    }
                                    j14 += (long) iArrCopyOf[i28];
                                    i24--;
                                    i28++;
                                    jArrCopyOf2 = jArr1111115;
                                    iM19129d5 = i6111111111116;
                                    iMo17911b = i30;
                                    aVar2 = aVar2;
                                    i25 = iM19129d1112;
                                    i26 = i32;
                                }
                                int i6111111111117 = i24;
                                long j211111 = j13 + ((long) iM19129d5);
                                if (c10151t4 != null) {
                                    z15 = true;
                                    break;
                                }
                                while (true) {
                                    if (i27 > 0) {
                                        z15 = true;
                                        break;
                                    }
                                    if (c10151t4.m19148w() != 0) {
                                        z15 = false;
                                        break;
                                    }
                                    c10151t4.m19129d();
                                    i27--;
                                }
                                if (iM19148w5 != 0) {
                                    i29 = iM19148w7;
                                    StringBuilder sb115 = new StringBuilder("Inconsistent stbl box for track ");
                                    c9488k3 = c9488k2;
                                    sb115.append(c9488k3.f48729a);
                                    sb115.append(": remainingSynchronizationSamples ");
                                    sb115.append(iM19148w5);
                                    sb115.append(", remainingSamplesAtTimestampDelta ");
                                    sb115.append(iM19148w8);
                                    sb115.append(", remainingSamplesInChunk ");
                                    sb115.append(i6111111111117);
                                    sb115.append(", remainingTimestampDeltaChanges ");
                                    sb115.append(i6111111111115);
                                    sb115.append(", remainingSamplesAtTimestampOffset ");
                                    sb115.append(i29);
                                    if (z15) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = str;
                                    }
                                    sb115.append(str2);
                                    C10145n.m19099g("AtomParsers", sb115.toString());
                                } else {
                                    i29 = iM19148w7;
                                    StringBuilder sb116 = new StringBuilder("Inconsistent stbl box for track ");
                                    c9488k3 = c9488k2;
                                    sb116.append(c9488k3.f48729a);
                                    sb116.append(": remainingSynchronizationSamples ");
                                    sb116.append(iM19148w5);
                                    sb116.append(", remainingSamplesAtTimestampDelta ");
                                    sb116.append(iM19148w8);
                                    sb116.append(", remainingSamplesInChunk ");
                                    sb116.append(i6111111111117);
                                    sb116.append(", remainingTimestampDeltaChanges ");
                                    sb116.append(i6111111111115);
                                    sb116.append(", remainingSamplesAtTimestampOffset ");
                                    sb116.append(i29);
                                    if (z15) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = str;
                                    }
                                    sb116.append(str2);
                                    C10145n.m19099g("AtomParsers", sb116.toString());
                                }
                                jArr3 = jArrCopyOf2;
                                iArr = iArrCopyOf2;
                                j15 = j211111;
                                jArr4 = jArrCopyOf;
                            }
                            jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                            j16 = c9488k3.f48731c;
                            jArr5 = c9488k3.f48736h;
                            if (jArr5 == null) {
                                C10134c0.m19031P(jArr3, j16);
                                c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                            } else {
                                length = jArr5.length;
                                i34 = c9488k3.f48730b;
                                jArr6 = c9488k3.f48737i;
                                if (length == 1) {
                                    i35 = iMo17911b;
                                    i36 = i34;
                                    jArr7 = jArr6;
                                    iArr2 = iArr;
                                    i37 = 1;
                                    if (jArr5.length == 1) {
                                        i38 = 0;
                                        if (jArr5[0] == 0) {
                                            jArr7.getClass();
                                            j20 = jArr7[0];
                                            while (i38 < jArr3.length) {
                                                jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                i38++;
                                            }
                                            c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                        } else {
                                            i37 = 1;
                                        }
                                    } else {
                                        i38 = 0;
                                    }
                                    if (i36 == i37) {
                                        z16 = 1;
                                    } else {
                                        z16 = i38;
                                    }
                                    iArr3 = new int[jArr5.length];
                                    iArr4 = new int[jArr5.length];
                                    jArr7.getClass();
                                    i39 = i38;
                                    i40 = i39;
                                    i41 = i40;
                                    while (i38 < jArr5.length) {
                                        long[] jArr1111116 = jArr4;
                                        j19 = jArr7[i38];
                                        if (j19 != -1) {
                                            int i711111111111111112 = i39;
                                            int i711111111111111113 = i40;
                                            long jM19030O119 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                            iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                            iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O119, z16);
                                            while (true) {
                                                i47 = iArr3[i38];
                                                i48 = iArr4[i38];
                                                if (i47 < i48) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i38] = i47 + 1;
                                            }
                                            i40 = (i48 - i47) + i711111111111111113;
                                            i39 = i711111111111111112 | (i41 == i47 ? 0 : 1);
                                            i41 = i48;
                                        }
                                        i38++;
                                        jArr4 = jArr1111116;
                                        jArr5 = jArr5;
                                        iArrCopyOf = iArrCopyOf;
                                    }
                                    iArr5 = iArrCopyOf;
                                    long[] jArr21111111112 = jArr5;
                                    jArr8 = jArr4;
                                    i42 = i39 | (i40 == i35 ? 0 : 1);
                                    if (i42 != 0) {
                                        jArr9 = new long[i40];
                                    } else {
                                        jArr9 = jArr8;
                                    }
                                    if (i42 != 0) {
                                        iArr6 = new int[i40];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i42 != 0) {
                                        i26 = 0;
                                    }
                                    if (i42 != 0) {
                                        iArr7 = new int[i40];
                                    } else {
                                        iArr7 = iArr2;
                                    }
                                    jArr10 = new long[i40];
                                    i43 = 0;
                                    j17 = 0;
                                    i44 = 0;
                                    jArr11 = jArr21111111112;
                                    while (i44 < jArr11.length) {
                                        j18 = jArr7[i44];
                                        i45 = iArr3[i44];
                                        int[] iArr11118 = iArr3;
                                        i46 = iArr4[i44];
                                        if (i42 != 0) {
                                            int i711111111111111114 = i46 - i45;
                                            System.arraycopy(jArr8, i45, jArr9, i43, i711111111111111114);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i45, iArr6, i43, i711111111111111114);
                                            iArr9 = iArr2;
                                            System.arraycopy(iArr9, i45, iArr7, i43, i711111111111111114);
                                        } else {
                                            iArr8 = iArr5;
                                            iArr9 = iArr2;
                                        }
                                        int i711111111111111115 = i26;
                                        while (i45 < i46) {
                                            int i711111111111111116 = i46;
                                            long[] jArr21111111113 = jArr11;
                                            long j211112 = j17;
                                            int i711111111111111117 = i44;
                                            long[] jArr21111111114 = jArr3;
                                            jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                            if (i42 == 0) {
                                            }
                                            i43++;
                                            i45++;
                                            jArr11 = jArr21111111113;
                                            jArr3 = jArr21111111114;
                                            i44 = i711111111111111117;
                                            j17 = j211112;
                                            i46 = i711111111111111116;
                                        }
                                        long[] jArr21111111115 = jArr11;
                                        int i711111111111111118 = i44;
                                        j17 += jArr21111111115[i711111111111111118];
                                        i44 = i711111111111111118 + 1;
                                        iArr3 = iArr11118;
                                        jArr11 = jArr21111111115;
                                        iArr2 = iArr9;
                                        jArr9 = jArr9;
                                        iArr5 = iArr8;
                                        i26 = i711111111111111115;
                                        iArr4 = iArr4;
                                    }
                                    c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                } else {
                                    i35 = iMo17911b;
                                    i36 = i34;
                                    jArr7 = jArr6;
                                    iArr2 = iArr;
                                    i37 = 1;
                                    if (jArr5.length == 1) {
                                        i38 = 0;
                                        if (jArr5[0] == 0) {
                                            jArr7.getClass();
                                            j20 = jArr7[0];
                                            while (i38 < jArr3.length) {
                                                jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                                i38++;
                                            }
                                            c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                        } else {
                                            i37 = 1;
                                        }
                                    } else {
                                        i38 = 0;
                                    }
                                    if (i36 == i37) {
                                        z16 = 1;
                                    } else {
                                        z16 = i38;
                                    }
                                    iArr3 = new int[jArr5.length];
                                    iArr4 = new int[jArr5.length];
                                    jArr7.getClass();
                                    i39 = i38;
                                    i40 = i39;
                                    i41 = i40;
                                    while (i38 < jArr5.length) {
                                        long[] jArr1111117 = jArr4;
                                        j19 = jArr7[i38];
                                        if (j19 != -1) {
                                            int i711111111111111119 = i39;
                                            int i7111111111111111110 = i40;
                                            long jM19030O1110 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                            iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                            iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O1110, z16);
                                            while (true) {
                                                i47 = iArr3[i38];
                                                i48 = iArr4[i38];
                                                if (i47 < i48) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i38] = i47 + 1;
                                            }
                                            i40 = (i48 - i47) + i7111111111111111110;
                                            i39 = i711111111111111119 | (i41 == i47 ? 0 : 1);
                                            i41 = i48;
                                        }
                                        i38++;
                                        jArr4 = jArr1111117;
                                        jArr5 = jArr5;
                                        iArrCopyOf = iArrCopyOf;
                                    }
                                    iArr5 = iArrCopyOf;
                                    long[] jArr21111111116 = jArr5;
                                    jArr8 = jArr4;
                                    i42 = i39 | (i40 == i35 ? 0 : 1);
                                    if (i42 != 0) {
                                        jArr9 = new long[i40];
                                    } else {
                                        jArr9 = jArr8;
                                    }
                                    if (i42 != 0) {
                                        iArr6 = new int[i40];
                                    } else {
                                        iArr6 = iArr5;
                                    }
                                    if (i42 != 0) {
                                        i26 = 0;
                                    }
                                    if (i42 != 0) {
                                        iArr7 = new int[i40];
                                    } else {
                                        iArr7 = iArr2;
                                    }
                                    jArr10 = new long[i40];
                                    i43 = 0;
                                    j17 = 0;
                                    i44 = 0;
                                    jArr11 = jArr21111111116;
                                    while (i44 < jArr11.length) {
                                        j18 = jArr7[i44];
                                        i45 = iArr3[i44];
                                        int[] iArr11119 = iArr3;
                                        i46 = iArr4[i44];
                                        if (i42 != 0) {
                                            int i7111111111111111111 = i46 - i45;
                                            System.arraycopy(jArr8, i45, jArr9, i43, i7111111111111111111);
                                            iArr8 = iArr5;
                                            System.arraycopy(iArr8, i45, iArr6, i43, i7111111111111111111);
                                            iArr9 = iArr2;
                                            System.arraycopy(iArr9, i45, iArr7, i43, i7111111111111111111);
                                        } else {
                                            iArr8 = iArr5;
                                            iArr9 = iArr2;
                                        }
                                        int i7111111111111111112 = i26;
                                        while (i45 < i46) {
                                            int i7111111111111111113 = i46;
                                            long[] jArr21111111117 = jArr11;
                                            long j211113 = j17;
                                            int i7111111111111111114 = i44;
                                            long[] jArr21111111118 = jArr3;
                                            jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                            if (i42 == 0) {
                                            }
                                            i43++;
                                            i45++;
                                            jArr11 = jArr21111111117;
                                            jArr3 = jArr21111111118;
                                            i44 = i7111111111111111114;
                                            j17 = j211113;
                                            i46 = i7111111111111111113;
                                        }
                                        long[] jArr21111111119 = jArr11;
                                        int i7111111111111111115 = i44;
                                        j17 += jArr21111111119[i7111111111111111115];
                                        i44 = i7111111111111111115 + 1;
                                        iArr3 = iArr11119;
                                        jArr11 = jArr21111111119;
                                        iArr2 = iArr9;
                                        jArr9 = jArr9;
                                        iArr5 = iArr8;
                                        i26 = i7111111111111111112;
                                        iArr4 = iArr4;
                                    }
                                    c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                                }
                                c9491n2 = c9491n;
                            }
                        } else {
                            i21 = -1;
                            iM19148w5 = 0;
                        }
                        i22 = i21;
                        iM19148w6 = i22;
                        iMo17910a = fVar.mo17910a();
                        i23 = i58;
                        String str16 = c2416m.f12484l;
                        if (iMo17910a == i22) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            i49 = aVar2.f48609a;
                            jArr12 = new long[i49];
                            iArr10 = new int[i49];
                            while (aVar2.m17909a()) {
                                int i6111111111118 = aVar2.f48610b;
                                jArr12[i6111111111118] = aVar2.f48612d;
                                iArr10[i6111111111118] = aVar2.f48611c;
                            }
                            j21 = iM19148w3;
                            i50 = 8192 / iMo17910a;
                            i52 = 0;
                            while (i51 < i49) {
                                int i6111111111119 = iArr10[i51];
                                int i61111111111110 = C10134c0.f51354a;
                                i52 += ((i6111111111119 + i50) - 1) / i50;
                            }
                            jArr4 = new long[i52];
                            iArr11 = new int[i52];
                            jArr13 = new long[i52];
                            iArr = new int[i52];
                            i53 = 0;
                            i54 = 0;
                            i55 = 0;
                            i56 = 0;
                            while (i56 < i49) {
                                int i61111111111111 = iArr10[i56];
                                j22 = jArr12[i56];
                                long[] jArr1111118 = jArr12;
                                iMax = i53;
                                int i61111111111112 = i49;
                                i57 = i61111111111111;
                                while (i57 > 0) {
                                    int iMin14 = Math.min(i50, i57);
                                    jArr4[i54] = j22;
                                    int[] iArr111110 = iArr10;
                                    int i61111111111113 = iMo17910a * iMin14;
                                    iArr11[i54] = i61111111111113;
                                    iMax = Math.max(iMax, i61111111111113);
                                    jArr13[i54] = ((long) i55) * j21;
                                    iArr[i54] = 1;
                                    j22 += (long) iArr11[i54];
                                    i55 += iMin14;
                                    i57 -= iMin14;
                                    i54++;
                                    iArr10 = iArr111110;
                                    i50 = i50;
                                }
                                i56++;
                                i53 = iMax;
                                i49 = i61111111111112;
                                jArr12 = jArr1111118;
                            }
                            j15 = j21 * ((long) i55);
                            iArrCopyOf = iArr11;
                            jArr3 = jArr13;
                            i26 = i53;
                            c9488k3 = c9488k2;
                        } else {
                            jArrCopyOf = new long[iMo17911b];
                            iArrCopyOf = new int[iMo17911b];
                            jArrCopyOf2 = new long[iMo17911b];
                            iArrCopyOf2 = new int[iMo17911b];
                            i24 = 0;
                            j13 = 0;
                            j14 = 0;
                            iM19129d5 = 0;
                            iM19148w7 = 0;
                            int i61111111111114 = iM19148w;
                            i25 = iM19148w3;
                            i26 = 0;
                            iM19148w8 = iM19148w2;
                            iM19148w9 = iM19148w6;
                            i27 = iM19148w4;
                            i28 = 0;
                            while (i28 < iMo17911b) {
                                zM17909a = true;
                                while (i24 == 0) {
                                    zM17909a = aVar2.m17909a();
                                    if (zM17909a) {
                                        break;
                                        break;
                                    }
                                    j14 = aVar2.f48612d;
                                    i24 = aVar2.f48611c;
                                    iMo17911b = iMo17911b;
                                    i25 = i25;
                                }
                                i30 = iMo17911b;
                                i31 = i25;
                                if (!zM17909a) {
                                    C10145n.m19099g("AtomParsers", "Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i28);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i28);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i28);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i28);
                                    iMo17911b = i28;
                                    break;
                                }
                                if (c10151t4 != null) {
                                    while (iM19148w7 == 0) {
                                        iM19148w7 = c10151t4.m19148w();
                                        iM19129d5 = c10151t4.m19129d();
                                        i27--;
                                    }
                                    iM19148w7--;
                                }
                                int i61111111111115 = iM19129d5;
                                jArrCopyOf[i28] = j14;
                                iMo17912c = fVar.mo17912c();
                                iArrCopyOf[i28] = iMo17912c;
                                if (iMo17912c > i26) {
                                    i32 = iMo17912c;
                                } else {
                                    i32 = i26;
                                }
                                jArrCopyOf2[i28] = j13 + ((long) i61111111111115);
                                if (c10151t3 == null) {
                                    i33 = 1;
                                } else {
                                    i33 = 0;
                                }
                                iArrCopyOf2[i28] = i33;
                                if (i28 == iM19148w9) {
                                    iArrCopyOf2[i28] = 1;
                                    iM19148w5--;
                                    if (iM19148w5 > 0) {
                                        c10151t3.getClass();
                                        iM19148w9 = c10151t3.m19148w() - 1;
                                    }
                                }
                                long[] jArr1111119 = jArrCopyOf2;
                                int iM19129d1113 = i31;
                                j13 += (long) iM19129d1113;
                                iM19148w8--;
                                if (iM19148w8 != 0) {
                                }
                                j14 += (long) iArrCopyOf[i28];
                                i24--;
                                i28++;
                                jArrCopyOf2 = jArr1111119;
                                iM19129d5 = i61111111111115;
                                iMo17911b = i30;
                                aVar2 = aVar2;
                                i25 = iM19129d1113;
                                i26 = i32;
                            }
                            int i61111111111116 = i24;
                            long j211114 = j13 + ((long) iM19129d5);
                            if (c10151t4 != null) {
                                z15 = true;
                                break;
                            }
                            while (true) {
                                if (i27 > 0) {
                                    z15 = true;
                                    break;
                                }
                                if (c10151t4.m19148w() != 0) {
                                    z15 = false;
                                    break;
                                }
                                c10151t4.m19129d();
                                i27--;
                            }
                            if (iM19148w5 != 0) {
                                i29 = iM19148w7;
                                StringBuilder sb117 = new StringBuilder("Inconsistent stbl box for track ");
                                c9488k3 = c9488k2;
                                sb117.append(c9488k3.f48729a);
                                sb117.append(": remainingSynchronizationSamples ");
                                sb117.append(iM19148w5);
                                sb117.append(", remainingSamplesAtTimestampDelta ");
                                sb117.append(iM19148w8);
                                sb117.append(", remainingSamplesInChunk ");
                                sb117.append(i61111111111116);
                                sb117.append(", remainingTimestampDeltaChanges ");
                                sb117.append(i61111111111114);
                                sb117.append(", remainingSamplesAtTimestampOffset ");
                                sb117.append(i29);
                                if (z15) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = str;
                                }
                                sb117.append(str2);
                                C10145n.m19099g("AtomParsers", sb117.toString());
                            } else {
                                i29 = iM19148w7;
                                StringBuilder sb118 = new StringBuilder("Inconsistent stbl box for track ");
                                c9488k3 = c9488k2;
                                sb118.append(c9488k3.f48729a);
                                sb118.append(": remainingSynchronizationSamples ");
                                sb118.append(iM19148w5);
                                sb118.append(", remainingSamplesAtTimestampDelta ");
                                sb118.append(iM19148w8);
                                sb118.append(", remainingSamplesInChunk ");
                                sb118.append(i61111111111116);
                                sb118.append(", remainingTimestampDeltaChanges ");
                                sb118.append(i61111111111114);
                                sb118.append(", remainingSamplesAtTimestampOffset ");
                                sb118.append(i29);
                                if (z15) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = str;
                                }
                                sb118.append(str2);
                                C10145n.m19099g("AtomParsers", sb118.toString());
                            }
                            jArr3 = jArrCopyOf2;
                            iArr = iArrCopyOf2;
                            j15 = j211114;
                            jArr4 = jArrCopyOf;
                        }
                        jM19030O2 = C10134c0.m19030O(j15, 1000000L, c9488k3.f48731c);
                        j16 = c9488k3.f48731c;
                        jArr5 = c9488k3.f48736h;
                        if (jArr5 == null) {
                            C10134c0.m19031P(jArr3, j16);
                            c9491n2 = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr, jM19030O2);
                        } else {
                            length = jArr5.length;
                            i34 = c9488k3.f48730b;
                            jArr6 = c9488k3.f48737i;
                            if (length == 1) {
                                i35 = iMo17911b;
                                i36 = i34;
                                jArr7 = jArr6;
                                iArr2 = iArr;
                                i37 = 1;
                                if (jArr5.length == 1) {
                                    i38 = 0;
                                    if (jArr5[0] == 0) {
                                        jArr7.getClass();
                                        j20 = jArr7[0];
                                        while (i38 < jArr3.length) {
                                            jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                            i38++;
                                        }
                                        c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                    } else {
                                        i37 = 1;
                                    }
                                } else {
                                    i38 = 0;
                                }
                                if (i36 == i37) {
                                    z16 = 1;
                                } else {
                                    z16 = i38;
                                }
                                iArr3 = new int[jArr5.length];
                                iArr4 = new int[jArr5.length];
                                jArr7.getClass();
                                i39 = i38;
                                i40 = i39;
                                i41 = i40;
                                while (i38 < jArr5.length) {
                                    long[] jArr11111110 = jArr4;
                                    j19 = jArr7[i38];
                                    if (j19 != -1) {
                                        int i7111111111111111116 = i39;
                                        int i7111111111111111117 = i40;
                                        long jM19030O1111 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                        iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                        iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O1111, z16);
                                        while (true) {
                                            i47 = iArr3[i38];
                                            i48 = iArr4[i38];
                                            if (i47 < i48) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i38] = i47 + 1;
                                        }
                                        i40 = (i48 - i47) + i7111111111111111117;
                                        i39 = i7111111111111111116 | (i41 == i47 ? 0 : 1);
                                        i41 = i48;
                                    }
                                    i38++;
                                    jArr4 = jArr11111110;
                                    jArr5 = jArr5;
                                    iArrCopyOf = iArrCopyOf;
                                }
                                iArr5 = iArrCopyOf;
                                long[] jArr211111111110 = jArr5;
                                jArr8 = jArr4;
                                i42 = i39 | (i40 == i35 ? 0 : 1);
                                if (i42 != 0) {
                                    jArr9 = new long[i40];
                                } else {
                                    jArr9 = jArr8;
                                }
                                if (i42 != 0) {
                                    iArr6 = new int[i40];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (i42 != 0) {
                                    i26 = 0;
                                }
                                if (i42 != 0) {
                                    iArr7 = new int[i40];
                                } else {
                                    iArr7 = iArr2;
                                }
                                jArr10 = new long[i40];
                                i43 = 0;
                                j17 = 0;
                                i44 = 0;
                                jArr11 = jArr211111111110;
                                while (i44 < jArr11.length) {
                                    j18 = jArr7[i44];
                                    i45 = iArr3[i44];
                                    int[] iArr111111 = iArr3;
                                    i46 = iArr4[i44];
                                    if (i42 != 0) {
                                        int i7111111111111111118 = i46 - i45;
                                        System.arraycopy(jArr8, i45, jArr9, i43, i7111111111111111118);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i45, iArr6, i43, i7111111111111111118);
                                        iArr9 = iArr2;
                                        System.arraycopy(iArr9, i45, iArr7, i43, i7111111111111111118);
                                    } else {
                                        iArr8 = iArr5;
                                        iArr9 = iArr2;
                                    }
                                    int i7111111111111111119 = i26;
                                    while (i45 < i46) {
                                        int i71111111111111111110 = i46;
                                        long[] jArr211111111111 = jArr11;
                                        long j211115 = j17;
                                        int i71111111111111111111 = i44;
                                        long[] jArr211111111112 = jArr3;
                                        jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                        if (i42 == 0) {
                                        }
                                        i43++;
                                        i45++;
                                        jArr11 = jArr211111111111;
                                        jArr3 = jArr211111111112;
                                        i44 = i71111111111111111111;
                                        j17 = j211115;
                                        i46 = i71111111111111111110;
                                    }
                                    long[] jArr211111111113 = jArr11;
                                    int i71111111111111111112 = i44;
                                    j17 += jArr211111111113[i71111111111111111112];
                                    i44 = i71111111111111111112 + 1;
                                    iArr3 = iArr111111;
                                    jArr11 = jArr211111111113;
                                    iArr2 = iArr9;
                                    jArr9 = jArr9;
                                    iArr5 = iArr8;
                                    i26 = i7111111111111111119;
                                    iArr4 = iArr4;
                                }
                                c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                            } else {
                                i35 = iMo17911b;
                                i36 = i34;
                                jArr7 = jArr6;
                                iArr2 = iArr;
                                i37 = 1;
                                if (jArr5.length == 1) {
                                    i38 = 0;
                                    if (jArr5[0] == 0) {
                                        jArr7.getClass();
                                        j20 = jArr7[0];
                                        while (i38 < jArr3.length) {
                                            jArr3[i38] = C10134c0.m19030O(jArr3[i38] - j20, 1000000L, c9488k3.f48731c);
                                            i38++;
                                        }
                                        c9491n = new C9491n(c9488k3, jArr4, iArrCopyOf, i26, jArr3, iArr2, C10134c0.m19030O(j15 - j20, 1000000L, c9488k3.f48731c));
                                    } else {
                                        i37 = 1;
                                    }
                                } else {
                                    i38 = 0;
                                }
                                if (i36 == i37) {
                                    z16 = 1;
                                } else {
                                    z16 = i38;
                                }
                                iArr3 = new int[jArr5.length];
                                iArr4 = new int[jArr5.length];
                                jArr7.getClass();
                                i39 = i38;
                                i40 = i39;
                                i41 = i40;
                                while (i38 < jArr5.length) {
                                    long[] jArr11111111 = jArr4;
                                    j19 = jArr7[i38];
                                    if (j19 != -1) {
                                        int i71111111111111111113 = i39;
                                        int i71111111111111111114 = i40;
                                        long jM19030O1112 = C10134c0.m19030O(jArr5[i38], c9488k3.f48731c, c9488k3.f48732d);
                                        iArr3[i38] = C10134c0.m19039f(jArr3, j19, true);
                                        iArr4[i38] = C10134c0.m19035b(jArr3, j19 + jM19030O1112, z16);
                                        while (true) {
                                            i47 = iArr3[i38];
                                            i48 = iArr4[i38];
                                            if (i47 < i48) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i38] = i47 + 1;
                                        }
                                        i40 = (i48 - i47) + i71111111111111111114;
                                        i39 = i71111111111111111113 | (i41 == i47 ? 0 : 1);
                                        i41 = i48;
                                    }
                                    i38++;
                                    jArr4 = jArr11111111;
                                    jArr5 = jArr5;
                                    iArrCopyOf = iArrCopyOf;
                                }
                                iArr5 = iArrCopyOf;
                                long[] jArr211111111114 = jArr5;
                                jArr8 = jArr4;
                                i42 = i39 | (i40 == i35 ? 0 : 1);
                                if (i42 != 0) {
                                    jArr9 = new long[i40];
                                } else {
                                    jArr9 = jArr8;
                                }
                                if (i42 != 0) {
                                    iArr6 = new int[i40];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (i42 != 0) {
                                    i26 = 0;
                                }
                                if (i42 != 0) {
                                    iArr7 = new int[i40];
                                } else {
                                    iArr7 = iArr2;
                                }
                                jArr10 = new long[i40];
                                i43 = 0;
                                j17 = 0;
                                i44 = 0;
                                jArr11 = jArr211111111114;
                                while (i44 < jArr11.length) {
                                    j18 = jArr7[i44];
                                    i45 = iArr3[i44];
                                    int[] iArr111112 = iArr3;
                                    i46 = iArr4[i44];
                                    if (i42 != 0) {
                                        int i71111111111111111115 = i46 - i45;
                                        System.arraycopy(jArr8, i45, jArr9, i43, i71111111111111111115);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i45, iArr6, i43, i71111111111111111115);
                                        iArr9 = iArr2;
                                        System.arraycopy(iArr9, i45, iArr7, i43, i71111111111111111115);
                                    } else {
                                        iArr8 = iArr5;
                                        iArr9 = iArr2;
                                    }
                                    int i71111111111111111116 = i26;
                                    while (i45 < i46) {
                                        int i71111111111111111117 = i46;
                                        long[] jArr211111111115 = jArr11;
                                        long j211116 = j17;
                                        int i71111111111111111118 = i44;
                                        long[] jArr211111111116 = jArr3;
                                        jArr10[i43] = C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d) + C10134c0.m19030O(Math.max(0L, jArr3[i45] - j18), 1000000L, c9488k3.f48731c);
                                        if (i42 == 0) {
                                        }
                                        i43++;
                                        i45++;
                                        jArr11 = jArr211111111115;
                                        jArr3 = jArr211111111116;
                                        i44 = i71111111111111111118;
                                        j17 = j211116;
                                        i46 = i71111111111111111117;
                                    }
                                    long[] jArr211111111117 = jArr11;
                                    int i71111111111111111119 = i44;
                                    j17 += jArr211111111117[i71111111111111111119];
                                    i44 = i71111111111111111119 + 1;
                                    iArr3 = iArr111112;
                                    jArr11 = jArr211111111117;
                                    iArr2 = iArr9;
                                    jArr9 = jArr9;
                                    iArr5 = iArr8;
                                    i26 = i71111111111111111116;
                                    iArr4 = iArr4;
                                }
                                c9491n2 = new C9491n(c9488k3, jArr9, iArr6, i26, jArr10, iArr7, C10134c0.m19030O(j17, 1000000L, c9488k3.f48732d));
                            }
                            c9491n2 = c9491n;
                        }
                    }
                    arrayList = arrayList2;
                    arrayList.add(c9491n2);
                }
            }
            i58 = i23 + 1;
            arrayList2 = arrayList;
        }
    }
}
