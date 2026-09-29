package p411u9;

import android.support.v4.media.C0141b;
import android.util.Pair;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p195j9.C6426c;
import p261m9.C7516q;
import p261m9.C7519t;
import p261m9.C7521v;
import p261m9.C7523x;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10148q;
import p479xa.C10151t;

/* JADX INFO: renamed from: u9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9484g implements InterfaceC7507h, InterfaceC7520u {

    /* JADX INFO: renamed from: a */
    public final int f48689a;

    /* JADX INFO: renamed from: b */
    public final C10151t f48690b;

    /* JADX INFO: renamed from: c */
    public final C10151t f48691c;

    /* JADX INFO: renamed from: d */
    public final C10151t f48692d;

    /* JADX INFO: renamed from: e */
    public final C10151t f48693e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<AbstractC9478a.a> f48694f;

    /* JADX INFO: renamed from: g */
    public final C9486i f48695g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f48696h;

    /* JADX INFO: renamed from: i */
    public int f48697i;

    /* JADX INFO: renamed from: j */
    public int f48698j;

    /* JADX INFO: renamed from: k */
    public long f48699k;

    /* JADX INFO: renamed from: l */
    public int f48700l;

    /* JADX INFO: renamed from: m */
    public C10151t f48701m;

    /* JADX INFO: renamed from: n */
    public int f48702n;

    /* JADX INFO: renamed from: o */
    public int f48703o;

    /* JADX INFO: renamed from: p */
    public int f48704p;

    /* JADX INFO: renamed from: q */
    public int f48705q;

    /* JADX INFO: renamed from: r */
    public InterfaceC7509j f48706r;

    /* JADX INFO: renamed from: s */
    public a[] f48707s;

    /* JADX INFO: renamed from: t */
    public long[][] f48708t;

    /* JADX INFO: renamed from: u */
    public int f48709u;

    /* JADX INFO: renamed from: v */
    public long f48710v;

    /* JADX INFO: renamed from: w */
    public int f48711w;

    /* JADX INFO: renamed from: x */
    public MotionPhotoMetadata f48712x;

    /* JADX INFO: renamed from: u9.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C9488k f48713a;

        /* JADX INFO: renamed from: b */
        public final C9491n f48714b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7522w f48715c;

        /* JADX INFO: renamed from: d */
        public final C7523x f48716d;

        /* JADX INFO: renamed from: e */
        public int f48717e;

        public a(C9488k c9488k, C9491n c9491n, InterfaceC7522w interfaceC7522w) {
            this.f48713a = c9488k;
            this.f48714b = c9491n;
            this.f48715c = interfaceC7522w;
            this.f48716d = "audio/true-hd".equals(c9488k.f48734f.f12484l) ? new C7523x() : null;
        }
    }

    public C9484g() {
        this(0);
    }

    public C9484g(int i10) {
        this.f48689a = 0;
        this.f48697i = 0;
        this.f48695g = new C9486i();
        this.f48696h = new ArrayList();
        this.f48693e = new C10151t(16);
        this.f48694f = new ArrayDeque<>();
        this.f48690b = new C10151t(C10148q.f51402a);
        this.f48691c = new C10151t(4);
        this.f48692d = new C10151t();
        this.f48702n = -1;
        this.f48706r = InterfaceC7509j.f41490A;
        this.f48707s = new a[0];
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:239:0x049b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0518  */
    /* JADX WARN: Code duplicated, block: B:261:0x052b  */
    /* JADX WARN: Code duplicated, block: B:263:0x0531  */
    /* JADX WARN: Code duplicated, block: B:270:0x0549  */
    /* JADX WARN: Code duplicated, block: B:273:0x055d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0585  */
    /* JADX WARN: Code duplicated, block: B:291:0x058b  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:301:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:302:0x05db  */
    /* JADX WARN: Code duplicated, block: B:304:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:341:0x063f  */
    /* JADX WARN: Code duplicated, block: B:343:0x0643  */
    /* JADX WARN: Code duplicated, block: B:345:0x0647  */
    /* JADX WARN: Code duplicated, block: B:346:0x0649  */
    /* JADX WARN: Code duplicated, block: B:349:0x0656  */
    /* JADX WARN: Code duplicated, block: B:350:0x0659  */
    /* JADX WARN: Code duplicated, block: B:352:0x0676  */
    /* JADX WARN: Code duplicated, block: B:354:0x0686  */
    /* JADX WARN: Code duplicated, block: B:366:0x049f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x06a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        int i10;
        char c10;
        boolean z10;
        boolean z11;
        long j10;
        long jMo14992a;
        AbstractC9478a.a aVarPeek;
        long j11;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        long j12;
        long j13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j14;
        long j15;
        long j16;
        int i13;
        while (true) {
            int i14 = this.f48697i;
            ArrayDeque<AbstractC9478a.a> arrayDeque = this.f48694f;
            int i15 = 4;
            C10151t c10151t = this.f48692d;
            if (i14 == 0) {
                int i16 = this.f48700l;
                C10151t c10151t2 = this.f48693e;
                if (i16 != 0) {
                    j10 = this.f48699k;
                    if (j10 == 1) {
                        interfaceC7508i.readFully(c10151t2.f51438a, 8, 8);
                        this.f48700l += 8;
                        this.f48699k = c10151t2.m19149x();
                    } else if (j10 == 0) {
                        jMo14992a = interfaceC7508i.mo14992a();
                        if (jMo14992a == -1 && (aVarPeek = arrayDeque.peek()) != null) {
                            jMo14992a = aVarPeek.f48604b;
                        }
                        if (jMo14992a != -1) {
                            this.f48699k = (jMo14992a - interfaceC7508i.mo15000m()) + ((long) this.f48700l);
                        }
                    }
                    j11 = this.f48699k;
                    i11 = this.f48700l;
                    if (j11 >= i11) {
                        throw ParserException.m6772c("Atom size less than header length (unsupported).");
                    }
                    i12 = this.f48698j;
                    if (i12 != 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1701082227 || i12 == 1835365473) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        long jMo15000m = interfaceC7508i.mo15000m();
                        j14 = this.f48699k;
                        j15 = this.f48700l;
                        j16 = (jMo15000m + j14) - j15;
                        if (j14 != j15 && this.f48698j == 1835365473) {
                            c10151t.m19121B(8);
                            interfaceC7508i.mo14999l(c10151t.f51438a, 0, 8);
                            byte[] bArr = C9479b.f48608a;
                            i13 = c10151t.f51439b;
                            c10151t.m19125F(4);
                            if (c10151t.m19129d() != 1751411826) {
                                i13 += 4;
                            }
                            c10151t.m19124E(i13);
                            interfaceC7508i.mo14998j(c10151t.f51439b);
                            interfaceC7508i.mo14997i();
                        }
                        arrayDeque.push(new AbstractC9478a.a(this.f48698j, j16));
                        if (this.f48699k == this.f48700l) {
                            m17926j(j16);
                        } else {
                            this.f48697i = 0;
                            this.f48700l = 0;
                        }
                        z14 = true;
                    } else {
                        if (i12 != 1835296868 || i12 == 1836476516 || i12 == 1751411826 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1937011571 || i12 == 1668576371 || i12 == 1701606260 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1953196132 || i12 == 1718909296 || i12 == 1969517665 || i12 == 1801812339 || i12 == 1768715124) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            if (i11 == 8) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            C10129a.m18992d(z15);
                            if (this.f48699k <= 2147483647L) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            C10129a.m18992d(z16);
                            C10151t c10151t3 = new C10151t((int) this.f48699k);
                            System.arraycopy(c10151t2.f51438a, 0, c10151t3.f51438a, 0, 8);
                            this.f48701m = c10151t3;
                            z14 = true;
                            this.f48697i = 1;
                        } else {
                            long jMo15000m2 = interfaceC7508i.mo15000m();
                            j12 = this.f48700l;
                            j13 = jMo15000m2 - j12;
                            if (this.f48698j == 1836086884) {
                                this.f48712x = new MotionPhotoMetadata(0L, j13, -9223372036854775807L, j13 + j12, this.f48699k - j12);
                            }
                            this.f48701m = null;
                            z14 = true;
                            this.f48697i = 1;
                        }
                    }
                    z17 = z14;
                } else if (interfaceC7508i.mo14993b(c10151t2.f51438a, 0, 8, true)) {
                    this.f48700l = 8;
                    c10151t2.m19124E(0);
                    this.f48699k = c10151t2.m19146u();
                    this.f48698j = c10151t2.m19129d();
                    j10 = this.f48699k;
                    if (j10 == 1) {
                        interfaceC7508i.readFully(c10151t2.f51438a, 8, 8);
                        this.f48700l += 8;
                        this.f48699k = c10151t2.m19149x();
                    } else if (j10 == 0) {
                        jMo14992a = interfaceC7508i.mo14992a();
                        if (jMo14992a == -1) {
                            jMo14992a = aVarPeek.f48604b;
                        }
                        if (jMo14992a != -1) {
                            this.f48699k = (jMo14992a - interfaceC7508i.mo15000m()) + ((long) this.f48700l);
                        }
                    }
                    j11 = this.f48699k;
                    i11 = this.f48700l;
                    if (j11 >= i11) {
                        throw ParserException.m6772c("Atom size less than header length (unsupported).");
                    }
                    i12 = this.f48698j;
                    if (i12 != 1836019574) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        long jMo15000m3 = interfaceC7508i.mo15000m();
                        j14 = this.f48699k;
                        j15 = this.f48700l;
                        j16 = (jMo15000m3 + j14) - j15;
                        if (j14 != j15) {
                            c10151t.m19121B(8);
                            interfaceC7508i.mo14999l(c10151t.f51438a, 0, 8);
                            byte[] bArr2 = C9479b.f48608a;
                            i13 = c10151t.f51439b;
                            c10151t.m19125F(4);
                            if (c10151t.m19129d() != 1751411826) {
                                i13 += 4;
                            }
                            c10151t.m19124E(i13);
                            interfaceC7508i.mo14998j(c10151t.f51439b);
                            interfaceC7508i.mo14997i();
                        }
                        arrayDeque.push(new AbstractC9478a.a(this.f48698j, j16));
                        if (this.f48699k == this.f48700l) {
                            m17926j(j16);
                        } else {
                            this.f48697i = 0;
                            this.f48700l = 0;
                        }
                        z14 = true;
                    } else {
                        if (i12 != 1835296868) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (z13) {
                            if (i11 == 8) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            C10129a.m18992d(z15);
                            if (this.f48699k <= 2147483647L) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            C10129a.m18992d(z16);
                            C10151t c10151t4 = new C10151t((int) this.f48699k);
                            System.arraycopy(c10151t2.f51438a, 0, c10151t4.f51438a, 0, 8);
                            this.f48701m = c10151t4;
                            z14 = true;
                            this.f48697i = 1;
                        } else {
                            long jMo15000m4 = interfaceC7508i.mo15000m();
                            j12 = this.f48700l;
                            j13 = jMo15000m4 - j12;
                            if (this.f48698j == 1836086884) {
                                this.f48712x = new MotionPhotoMetadata(0L, j13, -9223372036854775807L, j13 + j12, this.f48699k - j12);
                            }
                            this.f48701m = null;
                            z14 = true;
                            this.f48697i = 1;
                        }
                    }
                    z17 = z14;
                } else {
                    if (this.f48711w == 2 && (this.f48689a & 2) != 0) {
                        InterfaceC7522w interfaceC7522wMo7366q = this.f48706r.mo7366q(0, 4);
                        MotionPhotoMetadata motionPhotoMetadata = this.f48712x;
                        Metadata metadata = motionPhotoMetadata == null ? null : new Metadata(motionPhotoMetadata);
                        C2416m.a aVar = new C2416m.a();
                        aVar.f12499i = metadata;
                        interfaceC7522wMo7366q.mo7388f(new C2416m(aVar));
                        this.f48706r.mo7365i();
                        this.f48706r.mo7364c(new InterfaceC7520u.b(-9223372036854775807L));
                    }
                    z17 = false;
                }
                if (!z17) {
                    return -1;
                }
            } else {
                if (i14 != 1) {
                    if (i14 == 2) {
                        long jMo15000m5 = interfaceC7508i.mo15000m();
                        if (this.f48702n == -1) {
                            int i17 = -1;
                            int i18 = -1;
                            int i19 = 0;
                            boolean z18 = true;
                            boolean z19 = true;
                            long j17 = Long.MAX_VALUE;
                            long j18 = Long.MAX_VALUE;
                            long j19 = Long.MAX_VALUE;
                            while (true) {
                                a[] aVarArr = this.f48707s;
                                if (i19 >= aVarArr.length) {
                                    break;
                                }
                                a aVar2 = aVarArr[i19];
                                int i20 = aVar2.f48717e;
                                C9491n c9491n = aVar2.f48714b;
                                if (i20 != c9491n.f48763b) {
                                    long j20 = c9491n.f48764c[i20];
                                    long[][] jArr = this.f48708t;
                                    int i21 = C10134c0.f51354a;
                                    long j21 = jArr[i19][i20];
                                    long j22 = j20 - jMo15000m5;
                                    boolean z20 = j22 < 0 || j22 >= 262144;
                                    if ((!z20 && z19) || (z20 == z19 && j22 < j19)) {
                                        z19 = z20;
                                        j18 = j21;
                                        i18 = i19;
                                        j19 = j22;
                                    }
                                    if (j21 < j17) {
                                        z18 = z20;
                                        j17 = j21;
                                        i17 = i19;
                                    }
                                }
                                i19++;
                            }
                            if (j17 == Long.MAX_VALUE || !z18 || j18 < j17 + 10485760) {
                                i17 = i18;
                            }
                            this.f48702n = i17;
                            if (i17 == -1) {
                                return -1;
                            }
                        }
                        a aVar3 = this.f48707s[this.f48702n];
                        InterfaceC7522w interfaceC7522w = aVar3.f48715c;
                        int i22 = aVar3.f48717e;
                        C9491n c9491n2 = aVar3.f48714b;
                        long j23 = c9491n2.f48764c[i22];
                        int i23 = c9491n2.f48765d[i22];
                        long j24 = (j23 - jMo15000m5) + ((long) this.f48703o);
                        if (j24 < 0 || j24 >= 262144) {
                            c7519t.f41516a = j23;
                            return 1;
                        }
                        C9488k c9488k = aVar3.f48713a;
                        if (c9488k.f48735g == 1) {
                            j24 += 8;
                            i23 -= 8;
                        }
                        interfaceC7508i.mo14998j((int) j24);
                        int i24 = c9488k.f48738j;
                        C7523x c7523x = aVar3.f48716d;
                        if (i24 == 0) {
                            if ("audio/ac4".equals(c9488k.f48734f.f12484l)) {
                                if (this.f48704p == 0) {
                                    C6426c.m13048a(i23, c10151t);
                                    interfaceC7522w.m15021c(7, c10151t);
                                    this.f48704p += 7;
                                }
                                i23 += 7;
                            } else if (c7523x != null) {
                                c7523x.m15025c(interfaceC7508i);
                            }
                            while (true) {
                                int i25 = this.f48704p;
                                if (i25 >= i23) {
                                    break;
                                }
                                int iM15022d = interfaceC7522w.m15022d(interfaceC7508i, i23 - i25, false);
                                this.f48703o += iM15022d;
                                this.f48704p += iM15022d;
                                this.f48705q -= iM15022d;
                            }
                        } else {
                            C10151t c10151t5 = this.f48691c;
                            byte[] bArr3 = c10151t5.f51438a;
                            bArr3[0] = 0;
                            bArr3[1] = 0;
                            bArr3[2] = 0;
                            int i26 = 4 - i24;
                            while (this.f48704p < i23) {
                                int i27 = this.f48705q;
                                if (i27 == 0) {
                                    interfaceC7508i.readFully(bArr3, i26, i24);
                                    this.f48703o += i24;
                                    c10151t5.m19124E(0);
                                    int iM19129d = c10151t5.m19129d();
                                    if (iM19129d < 0) {
                                        throw ParserException.m6770a("Invalid NAL length", null);
                                    }
                                    this.f48705q = iM19129d;
                                    C10151t c10151t6 = this.f48690b;
                                    c10151t6.m19124E(0);
                                    interfaceC7522w.m15021c(4, c10151t6);
                                    this.f48704p += 4;
                                    i23 += i26;
                                } else {
                                    int iM15022d2 = interfaceC7522w.m15022d(interfaceC7508i, i27, false);
                                    this.f48703o += iM15022d2;
                                    this.f48704p += iM15022d2;
                                    this.f48705q -= iM15022d2;
                                }
                            }
                        }
                        long j25 = c9491n2.f48767f[i22];
                        int i28 = c9491n2.f48768g[i22];
                        if (c7523x != null) {
                            c7523x.m15024b(interfaceC7522w, j25, i28, i23, 0, null);
                            if (i22 + 1 == c9491n2.f48763b) {
                                c7523x.m15023a(interfaceC7522w, null);
                            }
                        } else {
                            interfaceC7522w.mo7387e(j25, i28, i23, 0, null);
                        }
                        aVar3.f48717e++;
                        this.f48702n = -1;
                        this.f48703o = 0;
                        this.f48704p = 0;
                        this.f48705q = 0;
                        return 0;
                    }
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    ArrayList arrayList = this.f48696h;
                    C9486i c9486i = this.f48695g;
                    int i29 = c9486i.f48724b;
                    if (i29 == 0) {
                        long jMo14992a2 = interfaceC7508i.mo14992a();
                        c7519t.f41516a = (jMo14992a2 == -1 || jMo14992a2 < 8) ? 0L : jMo14992a2 - 8;
                        c9486i.f48724b = 1;
                    } else if (i29 != 1) {
                        ArrayList arrayList2 = c9486i.f48723a;
                        short s10 = 2816;
                        if (i29 == 2) {
                            long jMo14992a3 = interfaceC7508i.mo14992a();
                            int i30 = (c9486i.f48725c - 12) - 8;
                            C10151t c10151t7 = new C10151t(i30);
                            interfaceC7508i.readFully(c10151t7.f51438a, 0, i30);
                            int i31 = 0;
                            while (i31 < i30 / 12) {
                                c10151t7.m19125F(2);
                                short sM19134i = c10151t7.m19134i();
                                if (sM19134i != 2192 && sM19134i != s10 && sM19134i != 2817 && sM19134i != 2819) {
                                    if (sM19134i != 2820) {
                                        c10151t7.m19125F(8);
                                    }
                                    i31++;
                                    s10 = 2816;
                                }
                                arrayList2.add(new C9486i.a(c10151t7.m19132g(), (jMo14992a3 - ((long) c9486i.f48725c)) - ((long) c10151t7.m19132g())));
                                i31++;
                                s10 = 2816;
                            }
                            if (arrayList2.isEmpty()) {
                                c7519t.f41516a = 0L;
                            } else {
                                c9486i.f48724b = 3;
                                c7519t.f41516a = ((C9486i.a) arrayList2.get(0)).f48726a;
                            }
                        } else {
                            if (i29 != 3) {
                                throw new IllegalStateException();
                            }
                            long jMo15000m6 = interfaceC7508i.mo15000m();
                            int iMo14992a = (int) ((interfaceC7508i.mo14992a() - interfaceC7508i.mo15000m()) - ((long) c9486i.f48725c));
                            C10151t c10151t8 = new C10151t(iMo14992a);
                            interfaceC7508i.readFully(c10151t8.f51438a, 0, iMo14992a);
                            int i32 = 0;
                            while (i32 < arrayList2.size()) {
                                C9486i.a aVar4 = (C9486i.a) arrayList2.get(i32);
                                c10151t8.m19124E((int) (aVar4.f48726a - jMo15000m6));
                                c10151t8.m19125F(i15);
                                int iM19132g = c10151t8.m19132g();
                                switch (c10151t8.m19142q(iM19132g)) {
                                    case "SlowMotion_Data":
                                        i10 = 0;
                                        break;
                                    case "Super_SlowMotion_Edit_Data":
                                        i10 = 1;
                                        break;
                                    case "Super_SlowMotion_Data":
                                        i10 = 2;
                                        break;
                                    case "Super_SlowMotion_Deflickering_On":
                                        i10 = 3;
                                        break;
                                    case "Super_SlowMotion_BGM":
                                        i10 = i15;
                                        break;
                                    default:
                                        i10 = -1;
                                        break;
                                }
                                if (i10 == 0) {
                                    c10 = 2192;
                                } else if (i10 == 1) {
                                    c10 = 2819;
                                } else if (i10 == 2) {
                                    c10 = 2816;
                                } else if (i10 == 3) {
                                    c10 = 2820;
                                } else {
                                    if (i10 != i15) {
                                        throw ParserException.m6770a("Invalid SEF name", null);
                                    }
                                    c10 = 2817;
                                }
                                int i33 = aVar4.f48727b - (iM19132g + 8);
                                if (c10 == 2192) {
                                    ArrayList arrayList3 = new ArrayList();
                                    List<String> listM19191a = C9486i.f48722e.m19191a(c10151t8.m19142q(i33));
                                    for (int i34 = 0; i34 < listM19191a.size(); i34++) {
                                        List<String> listM19191a2 = C9486i.f48721d.m19191a(listM19191a.get(i34));
                                        if (listM19191a2.size() != 3) {
                                            throw ParserException.m6770a(null, null);
                                        }
                                        try {
                                            arrayList3.add(new SlowMotionData.Segment(1 << (Integer.parseInt(listM19191a2.get(2)) - 1), Long.parseLong(listM19191a2.get(0)), Long.parseLong(listM19191a2.get(1))));
                                        } catch (NumberFormatException e10) {
                                            throw ParserException.m6770a(null, e10);
                                        }
                                    }
                                    arrayList.add(new SlowMotionData(arrayList3));
                                } else if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                    throw new IllegalStateException();
                                }
                                i32++;
                                i15 = 4;
                            }
                            c7519t.f41516a = 0L;
                        }
                    } else {
                        C10151t c10151t9 = new C10151t(8);
                        interfaceC7508i.readFully(c10151t9.f51438a, 0, 8);
                        c9486i.f48725c = c10151t9.m19132g() + 8;
                        if (c10151t9.m19129d() != 1397048916) {
                            c7519t.f41516a = 0L;
                        } else {
                            c7519t.f41516a = interfaceC7508i.mo15000m() - ((long) (c9486i.f48725c - 12));
                            c9486i.f48724b = 2;
                        }
                    }
                    if (c7519t.f41516a == 0) {
                        this.f48697i = 0;
                        this.f48700l = 0;
                    }
                    return 1;
                }
                long j26 = this.f48699k - ((long) this.f48700l);
                long jMo15000m7 = interfaceC7508i.mo15000m() + j26;
                C10151t c10151t10 = this.f48701m;
                if (c10151t10 != null) {
                    interfaceC7508i.readFully(c10151t10.f51438a, this.f48700l, (int) j26);
                    if (this.f48698j == 1718909296) {
                        c10151t10.m19124E(8);
                        int iM19129d2 = c10151t10.m19129d();
                        int i35 = iM19129d2 != 1751476579 ? iM19129d2 != 1903435808 ? 0 : 1 : 2;
                        if (i35 == 0) {
                            c10151t10.m19125F(4);
                            do {
                                if (c10151t10.f51440c - c10151t10.f51439b <= 0) {
                                    i35 = 0;
                                    break;
                                }
                                int iM19129d3 = c10151t10.m19129d();
                                i35 = iM19129d3 != 1751476579 ? iM19129d3 != 1903435808 ? 0 : 1 : 2;
                            } while (i35 == 0);
                        }
                        this.f48711w = i35;
                    } else if (!arrayDeque.isEmpty()) {
                        arrayDeque.peek().f48605c.add(new AbstractC9478a.b(this.f48698j, c10151t10));
                    }
                } else {
                    if (j26 < 262144) {
                        interfaceC7508i.mo14998j((int) j26);
                    } else {
                        c7519t.f41516a = interfaceC7508i.mo15000m() + j26;
                        z10 = true;
                    }
                    m17926j(jMo15000m7);
                    if (z10 || this.f48697i == 2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        return 1;
                    }
                }
                z10 = false;
                m17926j(jMo15000m7);
                if (z10) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return 1;
                }
            }
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        this.f48694f.clear();
        this.f48700l = 0;
        this.f48702n = -1;
        this.f48703o = 0;
        this.f48704p = 0;
        this.f48705q = 0;
        if (j10 == 0) {
            if (this.f48697i != 3) {
                this.f48697i = 0;
                this.f48700l = 0;
                return;
            } else {
                C9486i c9486i = this.f48695g;
                c9486i.f48723a.clear();
                c9486i.f48724b = 0;
                this.f48696h.clear();
                return;
            }
        }
        for (a aVar : this.f48707s) {
            C9491n c9491n = aVar.f48714b;
            int iM19039f = C10134c0.m19039f(c9491n.f48767f, j11, false);
            while (true) {
                if (iM19039f < 0) {
                    iM19039f = -1;
                    break;
                } else if ((c9491n.f48768g[iM19039f] & 1) != 0) {
                    break;
                } else {
                    iM19039f--;
                }
            }
            if (iM19039f == -1) {
                iM19039f = c9491n.m17931a(j11);
            }
            aVar.f48717e = iM19039f;
            C7523x c7523x = aVar.f48716d;
            if (c7523x != null) {
                c7523x.f41529b = false;
                c7523x.f41530c = 0;
            }
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f48706r = interfaceC7509j;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        return C9487j.m17930a(interfaceC7508i, false, (this.f48689a & 2) != 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c A[LOOP:2: B:35:0x0081->B:39:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd A[LOOP:3: B:49:0x00b2->B:53:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9 A[EDGE_INSN: B:70:0x00d9->B:62:0x00d9 BREAK  A[LOOP:1: B:30:0x006e->B:61:0x00d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0091 A[EDGE_INSN: B:76:0x0091->B:41:0x0091 BREAK  A[LOOP:2: B:35:0x0081->B:39:0x008c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00c2 A[EDGE_INSN: B:78:0x00c2->B:55:0x00c2 BREAK  A[LOOP:3: B:49:0x00b2->B:53:0x00bd], SYNTHETIC] */
    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        long jMin;
        long jMin2;
        long j11;
        long j12;
        int i10;
        a[] aVarArr;
        C7521v c7521v;
        InterfaceC7520u.a aVar;
        C9491n c9491n;
        int iM19039f;
        int iM19039f2;
        int iM17931a;
        long j13 = j10;
        a[] aVarArr2 = this.f48707s;
        int length = aVarArr2.length;
        C7521v c7521v2 = C7521v.f41521c;
        if (length == 0) {
            return new InterfaceC7520u.a(c7521v2, c7521v2);
        }
        int i11 = this.f48709u;
        boolean z10 = false;
        int i12 = -1;
        if (i11 != -1) {
            C9491n c9491n2 = aVarArr2[i11].f48714b;
            int iM19039f3 = C10134c0.m19039f(c9491n2.f48767f, j13, false);
            while (true) {
                if (iM19039f3 < 0) {
                    iM19039f3 = -1;
                    break;
                }
                if ((c9491n2.f48768g[iM19039f3] & 1) != 0) {
                    break;
                }
                iM19039f3--;
            }
            if (iM19039f3 == -1) {
                iM19039f3 = c9491n2.m17931a(j13);
            }
            if (iM19039f3 == -1) {
                return new InterfaceC7520u.a(c7521v2, c7521v2);
            }
            long[] jArr = c9491n2.f48767f;
            j11 = jArr[iM19039f3];
            long[] jArr2 = c9491n2.f48764c;
            jMin = jArr2[iM19039f3];
            if (j11 >= j13 || iM19039f3 >= c9491n2.f48763b - 1 || (iM17931a = c9491n2.m17931a(j13)) == -1 || iM17931a == iM19039f3) {
                j13 = j11;
            } else {
                j12 = jArr[iM17931a];
                jMin2 = jArr2[iM17931a];
            }
            i10 = 0;
            while (true) {
                aVarArr = this.f48707s;
                if (i10 < aVarArr.length) {
                    break;
                }
                if (i10 != this.f48709u) {
                    c9491n = aVarArr[i10].f48714b;
                    iM19039f = C10134c0.m19039f(c9491n.f48767f, j11, z10);
                    while (true) {
                        if (iM19039f >= 0) {
                            iM19039f = i12;
                            break;
                        }
                        if ((c9491n.f48768g[iM19039f] & 1) != 0) {
                            break;
                        }
                        iM19039f--;
                    }
                    if (iM19039f == i12) {
                        iM19039f = c9491n.m17931a(j11);
                    }
                    if (iM19039f != i12) {
                        jMin = Math.min(c9491n.f48764c[iM19039f], jMin);
                    }
                    if (j12 != -9223372036854775807L) {
                        iM19039f2 = C10134c0.m19039f(c9491n.f48767f, j12, false);
                        while (true) {
                            if (iM19039f2 >= 0) {
                                iM19039f2 = -1;
                                break;
                            }
                            if ((c9491n.f48768g[iM19039f2] & 1) != 0) {
                                break;
                            }
                            iM19039f2--;
                        }
                        if (iM19039f2 == -1) {
                            iM19039f2 = c9491n.m17931a(j12);
                        }
                        if (iM19039f2 == -1) {
                            jMin2 = Math.min(c9491n.f48764c[iM19039f2], jMin2);
                        }
                    }
                }
                i10++;
                z10 = false;
                i12 = -1;
            }
            c7521v = new C7521v(j11, jMin);
            if (j12 == -9223372036854775807L) {
                aVar = new InterfaceC7520u.a(c7521v, c7521v);
            } else {
                aVar = new InterfaceC7520u.a(c7521v, new C7521v(j12, jMin2));
            }
            return aVar;
        }
        jMin = Long.MAX_VALUE;
        jMin2 = -1;
        j11 = j13;
        j12 = -9223372036854775807L;
        i10 = 0;
        while (true) {
            aVarArr = this.f48707s;
            if (i10 < aVarArr.length) {
                break;
                break;
            }
            if (i10 != this.f48709u) {
                c9491n = aVarArr[i10].f48714b;
                iM19039f = C10134c0.m19039f(c9491n.f48767f, j11, z10);
                while (true) {
                    if (iM19039f >= 0) {
                        iM19039f = i12;
                        break;
                    }
                    if ((c9491n.f48768g[iM19039f] & 1) != 0) {
                        break;
                        break;
                    }
                    iM19039f--;
                }
                if (iM19039f == i12) {
                    iM19039f = c9491n.m17931a(j11);
                }
                if (iM19039f != i12) {
                    jMin = Math.min(c9491n.f48764c[iM19039f], jMin);
                }
                if (j12 != -9223372036854775807L) {
                    iM19039f2 = C10134c0.m19039f(c9491n.f48767f, j12, false);
                    while (true) {
                        if (iM19039f2 >= 0) {
                            iM19039f2 = -1;
                            break;
                        }
                        if ((c9491n.f48768g[iM19039f2] & 1) != 0) {
                            break;
                            break;
                        }
                        iM19039f2--;
                    }
                    if (iM19039f2 == -1) {
                        iM19039f2 = c9491n.m17931a(j12);
                    }
                    if (iM19039f2 == -1) {
                        jMin2 = Math.min(c9491n.f48764c[iM19039f2], jMin2);
                    }
                }
            }
            i10++;
            z10 = false;
            i12 = -1;
        }
        c7521v = new C7521v(j11, jMin);
        if (j12 == -9223372036854775807L) {
            aVar = new InterfaceC7520u.a(c7521v, c7521v);
        } else {
            aVar = new InterfaceC7520u.a(c7521v, new C7521v(j12, jMin2));
        }
        return aVar;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f48710v;
    }

    /* JADX WARN: Code duplicated, block: B:232:0x048e  */
    /* JADX WARN: Code duplicated, block: B:295:0x05a9  */
    /* JADX INFO: renamed from: j */
    public final void m17926j(long j10) throws ParserException {
        ArrayDeque<AbstractC9478a.a> arrayDeque;
        ArrayList arrayList;
        boolean z10;
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        Metadata metadata4;
        int i10;
        Metadata.Entry[] entryArr;
        Metadata metadata5;
        Metadata metadata6;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        MdtaMetadataEntry mdtaMetadataEntry;
        ArrayDeque<AbstractC9478a.a> arrayDeque2;
        ArrayList arrayList3;
        boolean z11;
        Metadata metadata7;
        boolean z12;
        Id3Frame id3FrameM17923d;
        while (true) {
            ArrayDeque<AbstractC9478a.a> arrayDeque3 = this.f48694f;
            if (arrayDeque3.isEmpty() || arrayDeque3.peek().f48604b != j10) {
                break;
            }
            AbstractC9478a.a aVarPop = arrayDeque3.pop();
            if (aVarPop.f48603a == 1836019574) {
                ArrayList arrayList4 = new ArrayList();
                boolean z13 = this.f48711w == 1;
                C7516q c7516q = new C7516q();
                AbstractC9478a.b bVarM17903c = aVarPop.m17903c(1969517665);
                int i14 = 1768715124;
                int i15 = 1751411826;
                int i16 = 1835365473;
                int i17 = 4;
                int i18 = 8;
                if (bVarM17903c != null) {
                    byte[] bArr = C9479b.f48608a;
                    C10151t c10151t = bVarM17903c.f48607b;
                    c10151t.m19124E(8);
                    Metadata metadata8 = null;
                    Metadata metadata9 = null;
                    while (true) {
                        int i19 = c10151t.f51440c;
                        int i20 = c10151t.f51439b;
                        if (i19 - i20 < i18) {
                            break;
                        }
                        int iM19129d = c10151t.m19129d();
                        int i21 = i14;
                        int iM19129d2 = c10151t.m19129d();
                        if (iM19129d2 == i16) {
                            c10151t.m19124E(i20);
                            int i22 = i20 + iM19129d;
                            c10151t.m19125F(i18);
                            int i23 = c10151t.f51439b;
                            c10151t.m19125F(i17);
                            if (c10151t.m19129d() != i15) {
                                i23 += 4;
                            }
                            c10151t.m19124E(i23);
                            int i24 = i21;
                            while (true) {
                                int i25 = c10151t.f51439b;
                                if (i25 < i22) {
                                    int iM19129d3 = c10151t.m19129d();
                                    if (c10151t.m19129d() == i24) {
                                        c10151t.m19124E(i25);
                                        int i26 = i25 + iM19129d3;
                                        c10151t.m19125F(i18);
                                        ArrayList arrayList5 = new ArrayList();
                                        while (true) {
                                            int i27 = c10151t.f51439b;
                                            if (i27 >= i26) {
                                                break;
                                            }
                                            int iM19129d4 = c10151t.m19129d() + i27;
                                            int iM19129d5 = c10151t.m19129d();
                                            int i28 = (iM19129d5 >> 24) & 255;
                                            int i29 = i26;
                                            ArrayDeque<AbstractC9478a.a> arrayDeque4 = arrayDeque3;
                                            ArrayList arrayList6 = arrayList4;
                                            if (i28 == 169 || i28 == 253) {
                                                z12 = z13;
                                                int i30 = 16777215 & iM19129d5;
                                                if (i30 == 6516084) {
                                                    id3FrameM17923d = C9483f.m17920a(iM19129d5, c10151t);
                                                } else if (i30 == 7233901 || i30 == 7631467) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TIT2");
                                                } else if (i30 == 6516589 || i30 == 7828084) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TCOM");
                                                } else if (i30 == 6578553) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TDRC");
                                                } else if (i30 == 4280916) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TPE1");
                                                } else if (i30 == 7630703) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TSSE");
                                                } else if (i30 == 6384738) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TALB");
                                                } else if (i30 == 7108978) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "USLT");
                                                } else if (i30 == 6776174) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TCON");
                                                } else if (i30 == 6779504) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TIT1");
                                                } else {
                                                    C10145n.m19094b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC9478a.m17901a(iM19129d5));
                                                    id3FrameM17923d = null;
                                                }
                                            } else if (iM19129d5 == 1735291493) {
                                                try {
                                                    int iM17925f = C9483f.m17925f(c10151t);
                                                    String str = (iM17925f <= 0 || iM17925f > 192) ? null : C9483f.f48688a[iM17925f - 1];
                                                    if (str != null) {
                                                        id3FrameM17923d = new TextInformationFrame("TCON", null, ImmutableList.m9064b0(str));
                                                        z12 = z13;
                                                    } else {
                                                        C10145n.m19099g("MetadataUtil", "Failed to parse standard genre code");
                                                        z12 = z13;
                                                        id3FrameM17923d = null;
                                                    }
                                                } catch (Throwable th2) {
                                                    c10151t.m19124E(iM19129d4);
                                                    throw th2;
                                                }
                                            } else {
                                                String strM19140o = null;
                                                if (iM19129d5 == 1684632427) {
                                                    id3FrameM17923d = C9483f.m17922c(iM19129d5, c10151t, "TPOS");
                                                } else if (iM19129d5 == 1953655662) {
                                                    id3FrameM17923d = C9483f.m17922c(iM19129d5, c10151t, "TRCK");
                                                } else if (iM19129d5 == 1953329263) {
                                                    id3FrameM17923d = C9483f.m17924e(iM19129d5, "TBPM", c10151t, true, false);
                                                } else if (iM19129d5 == 1668311404) {
                                                    id3FrameM17923d = C9483f.m17924e(iM19129d5, "TCMP", c10151t, true, true);
                                                } else if (iM19129d5 == 1668249202) {
                                                    id3FrameM17923d = C9483f.m17921b(c10151t);
                                                } else if (iM19129d5 == 1631670868) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TPE2");
                                                } else if (iM19129d5 == 1936682605) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TSOT");
                                                } else if (iM19129d5 == 1936679276) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TSO2");
                                                } else if (iM19129d5 == 1936679282) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TSOA");
                                                } else if (iM19129d5 == 1936679265) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TSOP");
                                                } else if (iM19129d5 == 1936679791) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TSOC");
                                                } else if (iM19129d5 == 1920233063) {
                                                    id3FrameM17923d = C9483f.m17924e(iM19129d5, "ITUNESADVISORY", c10151t, false, false);
                                                } else if (iM19129d5 == 1885823344) {
                                                    id3FrameM17923d = C9483f.m17924e(iM19129d5, "ITUNESGAPLESS", c10151t, false, true);
                                                } else if (iM19129d5 == 1936683886) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TVSHOWSORT");
                                                } else if (iM19129d5 == 1953919848) {
                                                    id3FrameM17923d = C9483f.m17923d(iM19129d5, c10151t, "TVSHOW");
                                                } else if (iM19129d5 == 757935405) {
                                                    int i31 = -1;
                                                    int i32 = -1;
                                                    String strM19140o2 = null;
                                                    while (true) {
                                                        int i33 = c10151t.f51439b;
                                                        if (i33 >= iM19129d4) {
                                                            break;
                                                        }
                                                        int iM19129d6 = c10151t.m19129d();
                                                        int iM19129d7 = c10151t.m19129d();
                                                        boolean z14 = z13;
                                                        c10151t.m19125F(4);
                                                        if (iM19129d7 == 1835360622) {
                                                            strM19140o = c10151t.m19140o(iM19129d6 - 12);
                                                        } else if (iM19129d7 == 1851878757) {
                                                            strM19140o2 = c10151t.m19140o(iM19129d6 - 12);
                                                        } else {
                                                            if (iM19129d7 == 1684108385) {
                                                                i31 = iM19129d6;
                                                                i32 = i33;
                                                            }
                                                            c10151t.m19125F(iM19129d6 - 12);
                                                        }
                                                        z13 = z14;
                                                    }
                                                    z12 = z13;
                                                    if (strM19140o == null || strM19140o2 == null || i32 == -1) {
                                                        id3FrameM17923d = null;
                                                    } else {
                                                        c10151t.m19124E(i32);
                                                        c10151t.m19125F(16);
                                                        id3FrameM17923d = new InternalFrame(strM19140o, strM19140o2, c10151t.m19140o(i31 - 16));
                                                    }
                                                } else {
                                                    z12 = z13;
                                                    C10145n.m19094b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC9478a.m17901a(iM19129d5));
                                                    id3FrameM17923d = null;
                                                }
                                                z12 = z13;
                                            }
                                            c10151t.m19124E(iM19129d4);
                                            if (id3FrameM17923d != null) {
                                                arrayList5.add(id3FrameM17923d);
                                            }
                                            i26 = i29;
                                            arrayDeque3 = arrayDeque4;
                                            arrayList4 = arrayList6;
                                            z13 = z12;
                                        }
                                        arrayDeque2 = arrayDeque3;
                                        arrayList3 = arrayList4;
                                        z11 = z13;
                                        if (!arrayList5.isEmpty()) {
                                            metadata7 = new Metadata(arrayList5);
                                            break;
                                        }
                                        break;
                                    }
                                    c10151t.m19124E(i25 + iM19129d3);
                                    i24 = 1768715124;
                                    i18 = 8;
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    arrayList3 = arrayList4;
                                    z11 = z13;
                                }
                                metadata7 = null;
                                break;
                            }
                            metadata8 = metadata7;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            arrayList3 = arrayList4;
                            z11 = z13;
                            if (iM19129d2 == 1936553057) {
                                c10151t.m19124E(i20);
                                int i34 = i20 + iM19129d;
                                c10151t.m19125F(12);
                                while (true) {
                                    int i35 = c10151t.f51439b;
                                    if (i35 < i34) {
                                        int iM19129d8 = c10151t.m19129d();
                                        if (c10151t.m19129d() != 1935766900) {
                                            c10151t.m19124E(i35 + iM19129d8);
                                        } else if (iM19129d8 >= 14) {
                                            c10151t.m19125F(5);
                                            int iM19145t = c10151t.m19145t();
                                            if (iM19145t == 12 || iM19145t == 13) {
                                                float f3 = iM19145t == 12 ? 240.0f : 120.0f;
                                                c10151t.m19125F(1);
                                                metadata9 = new Metadata(new SmtaMetadataEntry(c10151t.m19145t(), f3));
                                                break;
                                            }
                                        }
                                    }
                                    metadata9 = null;
                                    break;
                                }
                            }
                        }
                        c10151t.m19124E(i20 + iM19129d);
                        i17 = 4;
                        i14 = 1768715124;
                        i15 = 1751411826;
                        i16 = 1835365473;
                        i18 = 8;
                        arrayDeque3 = arrayDeque2;
                        arrayList4 = arrayList3;
                        z13 = z11;
                    }
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList4;
                    z10 = z13;
                    Pair pairCreate = Pair.create(metadata8, metadata9);
                    metadata2 = (Metadata) pairCreate.first;
                    metadata = (Metadata) pairCreate.second;
                    if (metadata2 != null) {
                        c7516q.m15019b(metadata2);
                    }
                    i16 = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    arrayList = arrayList4;
                    z10 = z13;
                    metadata = null;
                    metadata2 = null;
                }
                AbstractC9478a.a aVarM17902b = aVarPop.m17902b(i16);
                if (aVarM17902b != null) {
                    byte[] bArr2 = C9479b.f48608a;
                    AbstractC9478a.b bVarM17903c2 = aVarM17902b.m17903c(1751411826);
                    AbstractC9478a.b bVarM17903c3 = aVarM17902b.m17903c(1801812339);
                    AbstractC9478a.b bVarM17903c4 = aVarM17902b.m17903c(1768715124);
                    if (bVarM17903c2 == null || bVarM17903c3 == null || bVarM17903c4 == null) {
                        metadata3 = null;
                    } else {
                        C10151t c10151t2 = bVarM17903c2.f48607b;
                        c10151t2.m19124E(16);
                        if (c10151t2.m19129d() != 1835299937) {
                            metadata3 = null;
                        } else {
                            C10151t c10151t3 = bVarM17903c3.f48607b;
                            c10151t3.m19124E(12);
                            int iM19129d9 = c10151t3.m19129d();
                            String[] strArr = new String[iM19129d9];
                            for (int i36 = 0; i36 < iM19129d9; i36++) {
                                int iM19129d10 = c10151t3.m19129d();
                                c10151t3.m19125F(4);
                                strArr[i36] = c10151t3.m19142q(iM19129d10 - 8);
                            }
                            int i37 = 8;
                            C10151t c10151t4 = bVarM17903c4.f48607b;
                            c10151t4.m19124E(8);
                            ArrayList arrayList7 = new ArrayList();
                            while (true) {
                                int i38 = c10151t4.f51440c;
                                int i39 = c10151t4.f51439b;
                                if (i38 - i39 <= i37) {
                                    break;
                                }
                                int iM19129d11 = c10151t4.m19129d();
                                int iM19129d12 = c10151t4.m19129d() - 1;
                                if (iM19129d12 < 0 || iM19129d12 >= iM19129d9) {
                                    i13 = iM19129d9;
                                    C0141b.m620p("Skipped metadata with unknown key index: ", iM19129d12, "AtomParsers");
                                } else {
                                    String str2 = strArr[iM19129d12];
                                    int i40 = i39 + iM19129d11;
                                    while (true) {
                                        int i41 = c10151t4.f51439b;
                                        if (i41 >= i40) {
                                            i13 = iM19129d9;
                                            mdtaMetadataEntry = null;
                                            break;
                                        }
                                        int iM19129d13 = c10151t4.m19129d();
                                        i13 = iM19129d9;
                                        if (c10151t4.m19129d() == 1684108385) {
                                            int iM19129d14 = c10151t4.m19129d();
                                            int iM19129d15 = c10151t4.m19129d();
                                            int i42 = iM19129d13 - 16;
                                            byte[] bArr3 = new byte[i42];
                                            c10151t4.m19127b(bArr3, 0, i42);
                                            mdtaMetadataEntry = new MdtaMetadataEntry(str2, bArr3, iM19129d15, iM19129d14);
                                            break;
                                        }
                                        c10151t4.m19124E(i41 + iM19129d13);
                                        iM19129d9 = i13;
                                    }
                                    if (mdtaMetadataEntry != null) {
                                        arrayList7.add(mdtaMetadataEntry);
                                    }
                                }
                                c10151t4.m19124E(i39 + iM19129d11);
                                i37 = 8;
                                iM19129d9 = i13;
                            }
                            if (arrayList7.isEmpty()) {
                                metadata3 = null;
                            } else {
                                metadata3 = new Metadata(arrayList7);
                            }
                        }
                    }
                } else {
                    metadata3 = null;
                }
                Metadata metadata10 = metadata3;
                long j11 = -9223372036854775807L;
                int i43 = -1;
                ArrayList arrayListM17908e = C9479b.m17908e(aVarPop, c7516q, -9223372036854775807L, null, (this.f48689a & 1) != 0, z10, new C0141b());
                int size = arrayListM17908e.size();
                int i44 = 0;
                int size2 = -1;
                while (i44 < size) {
                    C9491n c9491n = (C9491n) arrayListM17908e.get(i44);
                    if (c9491n.f48763b == 0) {
                        metadata5 = metadata;
                        metadata6 = metadata2;
                        arrayList2 = arrayList;
                    } else {
                        C9488k c9488k = c9491n.f48762a;
                        long j12 = c9488k.f48733e;
                        if (j12 == -9223372036854775807L) {
                            j12 = c9491n.f48769h;
                        }
                        long jMax = Math.max(j11, j12);
                        InterfaceC7509j interfaceC7509j = this.f48706r;
                        int i45 = c9488k.f48730b;
                        a aVar = new a(c9488k, c9491n, interfaceC7509j.mo7366q(i44, i45));
                        C2416m c2416m = c9488k.f48734f;
                        boolean zEquals = "audio/true-hd".equals(c2416m.f12484l);
                        int i46 = c9491n.f48766e;
                        int i47 = zEquals ? i46 * 16 : i46 + 30;
                        C2416m.a aVar2 = new C2416m.a(c2416m);
                        aVar2.f12502l = i47;
                        if (i45 == 2 && j12 > 0 && (i12 = c9491n.f48763b) > 1) {
                            aVar2.f12508r = i12 / (j12 / 1000000.0f);
                        }
                        if (i45 == 1) {
                            int i48 = c7516q.f41509a;
                            if ((i48 == -1 || c7516q.f41510b == -1) ? false : true) {
                                aVar2.f12485A = i48;
                                aVar2.f12486B = c7516q.f41510b;
                            }
                        }
                        Metadata[] metadataArr = new Metadata[2];
                        metadataArr[0] = metadata;
                        ArrayList arrayList8 = this.f48696h;
                        if (arrayList8.isEmpty()) {
                            i10 = 1;
                            metadata4 = null;
                        } else {
                            metadata4 = new Metadata(arrayList8);
                            i10 = 1;
                        }
                        metadataArr[i10] = metadata4;
                        Metadata metadata11 = new Metadata(new Metadata.Entry[0]);
                        if (i45 != i10) {
                            if (i45 == 2 && metadata10 != null) {
                                int i49 = 0;
                                while (true) {
                                    Metadata.Entry[] entryArr2 = metadata10.f12627a;
                                    if (i49 >= entryArr2.length) {
                                        break;
                                    }
                                    Metadata.Entry entry = entryArr2[i49];
                                    if (entry instanceof MdtaMetadataEntry) {
                                        MdtaMetadataEntry mdtaMetadataEntry2 = (MdtaMetadataEntry) entry;
                                        if ("com.android.capture.fps".equals(mdtaMetadataEntry2.f12706a)) {
                                            metadata11 = new Metadata(mdtaMetadataEntry2);
                                            break;
                                        }
                                    }
                                    i49++;
                                }
                            }
                        } else if (metadata2 != null) {
                            metadata11 = metadata2;
                        }
                        int i50 = 0;
                        while (true) {
                            entryArr = metadata11.f12627a;
                            if (i50 >= 2) {
                                break;
                            }
                            Metadata metadata12 = metadataArr[i50];
                            if (metadata12 != null) {
                                Metadata.Entry[] entryArr3 = metadata12.f12627a;
                                if (entryArr3.length != 0) {
                                    int i51 = C10134c0.f51354a;
                                    Object[] objArrCopyOf = Arrays.copyOf(entryArr, entryArr.length + entryArr3.length);
                                    System.arraycopy(entryArr3, 0, objArrCopyOf, entryArr.length, entryArr3.length);
                                    metadata11 = new Metadata(metadata11.f12628b, (Metadata.Entry[]) objArrCopyOf);
                                }
                            }
                            i50++;
                            metadata = metadata;
                            metadata2 = metadata2;
                            metadataArr = metadataArr;
                        }
                        metadata5 = metadata;
                        metadata6 = metadata2;
                        if (entryArr.length > 0) {
                            aVar2.f12499i = metadata11;
                        }
                        aVar.f48715c.mo7388f(new C2416m(aVar2));
                        if (i45 == 2) {
                            i11 = -1;
                            if (size2 == -1) {
                                size2 = arrayList.size();
                            }
                        } else {
                            i11 = -1;
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(aVar);
                        i43 = i11;
                        j11 = jMax;
                    }
                    i44++;
                    arrayList = arrayList2;
                    arrayListM17908e = arrayListM17908e;
                    size = size;
                    metadata = metadata5;
                    metadata2 = metadata6;
                }
                long j13 = 0;
                this.f48709u = size2;
                this.f48710v = j11;
                a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
                this.f48707s = aVarArr;
                long[][] jArr = new long[aVarArr.length][];
                int[] iArr = new int[aVarArr.length];
                long[] jArr2 = new long[aVarArr.length];
                boolean[] zArr = new boolean[aVarArr.length];
                for (int i52 = 0; i52 < aVarArr.length; i52++) {
                    jArr[i52] = new long[aVarArr[i52].f48714b.f48763b];
                    jArr2[i52] = aVarArr[i52].f48714b.f48767f[0];
                }
                int i53 = 0;
                while (i53 < aVarArr.length) {
                    long j14 = Long.MAX_VALUE;
                    int i54 = i43;
                    for (int i55 = 0; i55 < aVarArr.length; i55++) {
                        if (!zArr[i55]) {
                            long j15 = jArr2[i55];
                            if (j15 <= j14) {
                                i54 = i55;
                                j14 = j15;
                            }
                        }
                    }
                    int i56 = iArr[i54];
                    long[] jArr3 = jArr[i54];
                    jArr3[i56] = j13;
                    C9491n c9491n2 = aVarArr[i54].f48714b;
                    j13 += (long) c9491n2.f48765d[i56];
                    int i57 = i56 + 1;
                    iArr[i54] = i57;
                    if (i57 < jArr3.length) {
                        jArr2[i54] = c9491n2.f48767f[i57];
                    } else {
                        zArr[i54] = true;
                        i53++;
                    }
                }
                this.f48708t = jArr;
                this.f48706r.mo7365i();
                this.f48706r.mo7364c(this);
                arrayDeque.clear();
                this.f48697i = 2;
            } else if (!arrayDeque3.isEmpty()) {
                arrayDeque3.peek().f48606d.add(aVarPop);
            }
        }
        if (this.f48697i != 2) {
            this.f48697i = 0;
            this.f48700l = 0;
        }
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
