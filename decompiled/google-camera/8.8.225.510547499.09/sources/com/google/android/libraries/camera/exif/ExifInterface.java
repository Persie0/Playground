package com.google.android.libraries.camera.exif;

import android.util.Log;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p000.kaz;
import p000.kef;
import p000.keg;
import p000.keh;
import p000.kej;
import p000.kem;
import p000.ken;
import p000.keo;
import p000.keq;
import p000.keu;
import p000.kfv;
import p000.lku;
import p021j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ExifInterface implements keg {

    /* JADX INFO: renamed from: A */
    public static final int f7787A;

    /* JADX INFO: renamed from: B */
    public static final int f7788B;

    /* JADX INFO: renamed from: C */
    public static final int f7789C;

    /* JADX INFO: renamed from: D */
    public static final int f7790D;

    /* JADX INFO: renamed from: E */
    public static final int f7791E;

    /* JADX INFO: renamed from: F */
    public static final int f7792F;

    /* JADX INFO: renamed from: G */
    public static final int f7793G;

    /* JADX INFO: renamed from: H */
    public static final int f7794H;

    /* JADX INFO: renamed from: I */
    public static final int f7795I;

    /* JADX INFO: renamed from: J */
    public static final int f7796J;

    /* JADX INFO: renamed from: K */
    public static final int f7797K;

    /* JADX INFO: renamed from: L */
    public static final int f7798L;

    /* JADX INFO: renamed from: M */
    public static final int f7799M;

    /* JADX INFO: renamed from: N */
    public static final int f7800N;

    /* JADX INFO: renamed from: O */
    public static final int f7801O;

    /* JADX INFO: renamed from: P */
    public static final int f7802P;

    /* JADX INFO: renamed from: Q */
    public static final int f7803Q;

    /* JADX INFO: renamed from: R */
    public static final int f7804R;

    /* JADX INFO: renamed from: S */
    public static final int f7805S;

    /* JADX INFO: renamed from: T */
    public static final int f7806T;
    public static final int TAG_SOFTWARE;

    /* JADX INFO: renamed from: U */
    public static final int f7807U;

    /* JADX INFO: renamed from: V */
    public static final int f7808V;

    /* JADX INFO: renamed from: W */
    public static final int f7809W;

    /* JADX INFO: renamed from: X */
    public static final int f7810X;

    /* JADX INFO: renamed from: Y */
    public static final int f7811Y;

    /* JADX INFO: renamed from: Z */
    public static final int f7812Z;

    /* JADX INFO: renamed from: aA */
    public static final int f7814aA;

    /* JADX INFO: renamed from: aB */
    public static final int f7815aB;

    /* JADX INFO: renamed from: aC */
    public static final int f7816aC;

    /* JADX INFO: renamed from: aD */
    public static final int f7817aD;

    /* JADX INFO: renamed from: aE */
    public static final int f7818aE;

    /* JADX INFO: renamed from: aF */
    public static final int f7819aF;

    /* JADX INFO: renamed from: aG */
    public static final int f7820aG;

    /* JADX INFO: renamed from: aH */
    public static final int f7821aH;

    /* JADX INFO: renamed from: aI */
    public static final int f7822aI;

    /* JADX INFO: renamed from: aJ */
    public static final int f7823aJ;

    /* JADX INFO: renamed from: aK */
    public static final int f7824aK;

    /* JADX INFO: renamed from: aL */
    public static final int f7825aL;

    /* JADX INFO: renamed from: aM */
    public static final int f7826aM;

    /* JADX INFO: renamed from: aN */
    public static final int f7827aN;

    /* JADX INFO: renamed from: aO */
    public static final int f7828aO;

    /* JADX INFO: renamed from: aP */
    public static final int f7829aP;

    /* JADX INFO: renamed from: aQ */
    public static final int f7830aQ;

    /* JADX INFO: renamed from: aR */
    public static final int f7831aR;

    /* JADX INFO: renamed from: aS */
    public static final int f7832aS;

    /* JADX INFO: renamed from: aT */
    public static final int f7833aT;

    /* JADX INFO: renamed from: aU */
    public static final int f7834aU;

    /* JADX INFO: renamed from: aV */
    public static final int f7835aV;

    /* JADX INFO: renamed from: aW */
    public static final int f7836aW;

    /* JADX INFO: renamed from: aX */
    public static final int f7837aX;

    /* JADX INFO: renamed from: aY */
    public static final int f7838aY;

    /* JADX INFO: renamed from: aZ */
    public static final int f7839aZ;

    /* JADX INFO: renamed from: aa */
    public static final int f7840aa;

    /* JADX INFO: renamed from: ab */
    public static final int f7841ab;

    /* JADX INFO: renamed from: ac */
    public static final int f7842ac;

    /* JADX INFO: renamed from: ad */
    public static final int f7843ad;

    /* JADX INFO: renamed from: ae */
    public static final int f7844ae;

    /* JADX INFO: renamed from: af */
    public static final int f7845af;

    /* JADX INFO: renamed from: ag */
    public static final int f7846ag;

    /* JADX INFO: renamed from: ah */
    public static final int f7847ah;

    /* JADX INFO: renamed from: ai */
    public static final int f7848ai;

    /* JADX INFO: renamed from: aj */
    public static final int f7849aj;

    /* JADX INFO: renamed from: ak */
    public static final int f7850ak;

    /* JADX INFO: renamed from: al */
    public static final int f7851al;

    /* JADX INFO: renamed from: am */
    public static final int f7852am;

    /* JADX INFO: renamed from: an */
    public static final int f7853an;

    /* JADX INFO: renamed from: ao */
    public static final int f7854ao;

    /* JADX INFO: renamed from: ap */
    public static final int f7855ap;

    /* JADX INFO: renamed from: aq */
    public static final int f7856aq;

    /* JADX INFO: renamed from: ar */
    public static final int f7857ar;

    /* JADX INFO: renamed from: as */
    public static final int f7858as;

    /* JADX INFO: renamed from: at */
    public static final int f7859at;

    /* JADX INFO: renamed from: au */
    public static final int f7860au;

    /* JADX INFO: renamed from: av */
    public static final int f7861av;

    /* JADX INFO: renamed from: aw */
    public static final int f7862aw;

    /* JADX INFO: renamed from: ax */
    public static final int f7863ax;

    /* JADX INFO: renamed from: ay */
    public static final int f7864ay;

    /* JADX INFO: renamed from: az */
    public static final int f7865az;

    /* JADX INFO: renamed from: bE */
    private static final HashSet f7867bE;

    /* JADX INFO: renamed from: bF */
    private static final Long f7868bF;

    /* JADX INFO: renamed from: ba */
    public static final int f7869ba;

    /* JADX INFO: renamed from: bb */
    public static final int f7870bb;

    /* JADX INFO: renamed from: bc */
    public static final int f7871bc;

    /* JADX INFO: renamed from: bd */
    public static final int f7872bd;

    /* JADX INFO: renamed from: be */
    public static final int f7873be;

    /* JADX INFO: renamed from: bf */
    public static final int f7874bf;

    /* JADX INFO: renamed from: bg */
    public static final int f7875bg;

    /* JADX INFO: renamed from: bh */
    public static final int f7876bh;

    /* JADX INFO: renamed from: bi */
    public static final int f7877bi;

    /* JADX INFO: renamed from: bj */
    public static final int f7878bj;

    /* JADX INFO: renamed from: bk */
    public static final int f7879bk;

    /* JADX INFO: renamed from: bl */
    public static final int f7880bl;

    /* JADX INFO: renamed from: bm */
    public static final int f7881bm;

    /* JADX INFO: renamed from: bn */
    public static final int f7882bn;

    /* JADX INFO: renamed from: bo */
    public static final int f7883bo;

    /* JADX INFO: renamed from: bp */
    public static final int f7884bp;

    /* JADX INFO: renamed from: bq */
    public static final int f7885bq;

    /* JADX INFO: renamed from: br */
    public static final int f7886br;

    /* JADX INFO: renamed from: bs */
    public static final int f7887bs;

    /* JADX INFO: renamed from: bt */
    public static final int f7888bt;

    /* JADX INFO: renamed from: bu */
    public static final int f7889bu;

    /* JADX INFO: renamed from: bv */
    public static final int f7890bv;

    /* JADX INFO: renamed from: bw */
    protected static final HashSet f7891bw;

    /* JADX INFO: renamed from: bx */
    public static final Long f7892bx;

    /* JADX INFO: renamed from: by */
    public static final ByteOrder f7893by;

    /* JADX INFO: renamed from: i */
    public static final int f7900i;

    /* JADX INFO: renamed from: j */
    public static final int f7901j;

    /* JADX INFO: renamed from: k */
    public static final int f7902k;

    /* JADX INFO: renamed from: l */
    public static final int f7903l;

    /* JADX INFO: renamed from: m */
    public static final int f7904m;

    /* JADX INFO: renamed from: n */
    public static final int f7905n;

    /* JADX INFO: renamed from: o */
    public static final int f7906o;

    /* JADX INFO: renamed from: p */
    public static final int f7907p;

    /* JADX INFO: renamed from: q */
    public static final int f7908q;

    /* JADX INFO: renamed from: r */
    public static final int f7909r;

    /* JADX INFO: renamed from: s */
    public static final int f7910s;

    /* JADX INFO: renamed from: t */
    public static final int f7911t;

    /* JADX INFO: renamed from: u */
    public static final int f7912u;

    /* JADX INFO: renamed from: v */
    public static final int f7913v;

    /* JADX INFO: renamed from: w */
    public static final int f7914w;

    /* JADX INFO: renamed from: x */
    public static final int f7915x;

    /* JADX INFO: renamed from: y */
    public static final int f7916y;

    /* JADX INFO: renamed from: z */
    public static final int f7917z;

    /* JADX INFO: renamed from: bC */
    public final DateFormat f7920bC;

    /* JADX INFO: renamed from: bD */
    public final Calendar f7921bD;

    /* JADX INFO: renamed from: bH */
    private SparseIntArray f7923bH;

    /* JADX INFO: renamed from: a */
    public static final int f7813a = m4670c(0, 256);

    /* JADX INFO: renamed from: b */
    public static final int f7866b = m4670c(0, 257);

    /* JADX INFO: renamed from: c */
    public static final int f7894c = m4670c(0, 258);

    /* JADX INFO: renamed from: d */
    public static final int f7895d = m4670c(0, 259);

    /* JADX INFO: renamed from: e */
    public static final int f7896e = m4670c(0, 262);

    /* JADX INFO: renamed from: f */
    public static final int f7897f = m4670c(0, 270);

    /* JADX INFO: renamed from: g */
    public static final int f7898g = m4670c(0, 271);

    /* JADX INFO: renamed from: h */
    public static final int f7899h = m4670c(0, 272);

    /* JADX INFO: renamed from: bz */
    public int f7924bz = 0;

    /* JADX INFO: renamed from: bA */
    public String f7918bA = "";

    /* JADX INFO: renamed from: bB */
    public kef f7919bB = new kef(f7893by);

    /* JADX INFO: renamed from: bG */
    private final DateFormat f7922bG = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ROOT);

    static {
        int iM4670c = m4670c(0, (short) 273);
        f7900i = iM4670c;
        f7901j = m4670c(0, (short) 274);
        f7902k = m4670c(0, (short) 277);
        f7903l = m4670c(0, (short) 278);
        int iM4670c2 = m4670c(0, (short) 279);
        f7904m = iM4670c2;
        f7905n = m4670c(0, (short) 282);
        f7906o = m4670c(0, (short) 283);
        f7907p = m4670c(0, (short) 284);
        f7908q = m4670c(0, (short) 296);
        f7909r = m4670c(0, (short) 301);
        TAG_SOFTWARE = m4670c(0, (short) 305);
        f7910s = m4670c(0, (short) 306);
        f7911t = m4670c(0, (short) 315);
        f7912u = m4670c(0, (short) 318);
        f7913v = m4670c(0, (short) 319);
        f7914w = m4670c(0, (short) 529);
        f7915x = m4670c(0, (short) 530);
        f7916y = m4670c(0, (short) 531);
        f7917z = m4670c(0, (short) 532);
        f7787A = m4670c(0, (short) -32104);
        int iM4670c3 = m4670c(0, (short) -30871);
        f7788B = iM4670c3;
        int iM4670c4 = m4670c(0, (short) -30683);
        f7789C = iM4670c4;
        int iM4670c5 = m4670c(1, (short) 513);
        f7790D = iM4670c5;
        int iM4670c6 = m4670c(1, (short) 514);
        f7791E = iM4670c6;
        f7792F = m4670c(2, (short) -32102);
        f7793G = m4670c(2, (short) -32099);
        f7794H = m4670c(2, (short) -30686);
        f7795I = m4670c(2, (short) -30684);
        f7796J = m4670c(2, (short) -30681);
        f7797K = m4670c(2, (short) -30680);
        f7798L = m4670c(2, (short) -28672);
        f7799M = m4670c(2, (short) -28669);
        f7800N = m4670c(2, (short) -28668);
        f7801O = m4670c(2, (short) -28415);
        f7802P = m4670c(2, (short) -28414);
        f7803Q = m4670c(2, (short) -28159);
        f7804R = m4670c(2, (short) -28158);
        f7805S = m4670c(2, (short) -28157);
        f7806T = m4670c(2, (short) -28156);
        f7807U = m4670c(2, (short) -28155);
        f7808V = m4670c(2, (short) -28154);
        f7809W = m4670c(2, (short) -28153);
        f7810X = m4670c(2, (short) -28152);
        f7811Y = m4670c(2, (short) -28151);
        f7812Z = m4670c(2, (short) -28150);
        f7840aa = m4670c(2, (short) -28140);
        f7841ab = m4670c(2, (short) -28036);
        f7842ac = m4670c(2, (short) -28026);
        f7843ad = m4670c(2, (short) -28016);
        f7844ae = m4670c(2, (short) -28015);
        f7845af = m4670c(2, (short) -28014);
        f7846ag = m4670c(2, (short) -24576);
        f7847ah = m4670c(2, (short) -24575);
        f7848ai = m4670c(2, (short) -24574);
        f7849aj = m4670c(2, (short) -24573);
        f7850ak = m4670c(2, (short) -24572);
        int iM4670c7 = m4670c(2, (short) -24571);
        f7851al = iM4670c7;
        f7852am = m4670c(2, (short) -24053);
        f7853an = m4670c(2, (short) -24052);
        f7854ao = m4670c(2, (short) -24050);
        f7855ap = m4670c(2, (short) -24049);
        f7856aq = m4670c(2, (short) -24048);
        f7857ar = m4670c(2, (short) -24044);
        f7858as = m4670c(2, (short) -24043);
        f7859at = m4670c(2, (short) -24041);
        f7860au = m4670c(2, (short) -23808);
        f7861av = m4670c(2, (short) -23807);
        f7862aw = m4670c(2, (short) -23806);
        f7863ax = m4670c(2, (short) -23551);
        f7864ay = m4670c(2, (short) -23550);
        f7865az = m4670c(2, (short) -23549);
        f7814aA = m4670c(2, (short) -23548);
        f7815aB = m4670c(2, (short) -23547);
        f7816aC = m4670c(2, (short) -23546);
        f7817aD = m4670c(2, (short) -23545);
        f7818aE = m4670c(2, (short) -23544);
        f7819aF = m4670c(2, (short) -23543);
        f7820aG = m4670c(2, (short) -23542);
        f7821aH = m4670c(2, (short) -23541);
        f7822aI = m4670c(2, (short) -23540);
        f7823aJ = m4670c(2, (short) -23520);
        f7824aK = m4670c(2, (short) -23501);
        f7825aL = m4670c(2, (short) -23500);
        f7826aM = m4670c(2, (short) -28656);
        f7827aN = m4670c(2, (short) -28655);
        f7828aO = m4670c(2, (short) -28654);
        f7829aP = m4670c(2, (short) -27648);
        f7830aQ = m4670c(2, (short) -27645);
        f7831aR = m4670c(4, (short) 0);
        f7832aS = m4670c(4, (short) 1);
        f7833aT = m4670c(4, (short) 2);
        f7834aU = m4670c(4, (short) 3);
        f7835aV = m4670c(4, (short) 4);
        f7836aW = m4670c(4, (short) 5);
        f7837aX = m4670c(4, (short) 6);
        f7838aY = m4670c(4, (short) 7);
        f7839aZ = m4670c(4, (short) 8);
        f7869ba = m4670c(4, (short) 9);
        f7870bb = m4670c(4, (short) 10);
        f7871bc = m4670c(4, (short) 11);
        f7872bd = m4670c(4, (short) 12);
        f7873be = m4670c(4, (short) 13);
        f7874bf = m4670c(4, (short) 14);
        f7875bg = m4670c(4, (short) 15);
        f7876bh = m4670c(4, (short) 16);
        f7877bi = m4670c(4, (short) 17);
        f7878bj = m4670c(4, (short) 18);
        f7879bk = m4670c(4, (short) 19);
        f7880bl = m4670c(4, (short) 20);
        f7881bm = m4670c(4, (short) 23);
        f7882bn = m4670c(4, (short) 24);
        f7883bo = m4670c(4, (short) 25);
        f7884bp = m4670c(4, (short) 26);
        f7885bq = m4670c(4, (short) 27);
        f7886br = m4670c(4, (short) 28);
        f7887bs = m4670c(4, (short) 29);
        f7888bt = m4670c(4, (short) 30);
        f7889bu = m4670c(3, (short) 1);
        f7890bv = m4670c(3, (short) 2);
        HashSet hashSet = new HashSet();
        f7867bE = hashSet;
        hashSet.add(Short.valueOf(m4674n(iM4670c4)));
        hashSet.add(Short.valueOf(m4674n(iM4670c3)));
        hashSet.add(Short.valueOf(m4674n(iM4670c5)));
        hashSet.add(Short.valueOf(m4674n(iM4670c7)));
        hashSet.add(Short.valueOf(m4674n(iM4670c)));
        HashSet hashSet2 = new HashSet(hashSet);
        f7891bw = hashSet2;
        hashSet2.add(Short.valueOf(m4674n(-1)));
        hashSet2.add(Short.valueOf(m4674n(iM4670c6)));
        hashSet2.add(Short.valueOf(m4674n(iM4670c2)));
        f7892bx = 100L;
        f7868bF = 100L;
        f7893by = ByteOrder.BIG_ENDIAN;
    }

    public ExifInterface() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd", Locale.ROOT);
        this.f7920bC = simpleDateFormat;
        this.f7921bD = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        this.f7923bH = null;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    /* JADX INFO: renamed from: c */
    public static int m4670c(int i, short s) {
        return (i << 16) | ((char) s);
    }

    /* JADX INFO: renamed from: d */
    protected static int m4671d(int i) {
        return (char) i;
    }

    /* JADX INFO: renamed from: f */
    protected static int m4672f(int[] iArr) {
        int[] iArr2 = keq.f35784a;
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 : iArr) {
                if (iArr2[i2] == i3) {
                    i |= 1 << i2;
                    break;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static int m4673g(int i) {
        return i >>> 16;
    }

    /* JADX INFO: renamed from: n */
    public static short m4674n(int i) {
        return (short) i;
    }

    /* JADX INFO: renamed from: o */
    protected static short m4675o(int i) {
        return (short) ((i >> 16) & 255);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m4676s(int i, int i2) {
        int[] iArr = keq.f35784a;
        for (int i3 = 0; i3 < 5; i3++) {
            if (i2 == iArr[i3] && (((i >>> 24) >> i3) & 1) == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m4677t(short s) {
        return f7867bE.contains(Short.valueOf(s));
    }

    /* JADX INFO: renamed from: w */
    public static kaz[] m4678w(double d) {
        double dAbs = Math.abs(d);
        int i = (int) dAbs;
        double d2 = i;
        Double.isNaN(d2);
        double d3 = dAbs - d2;
        Long l = f7868bF;
        l.longValue();
        double d4 = d3 * 60.0d;
        int i2 = (int) d4;
        l.longValue();
        double d5 = i2;
        Double.isNaN(d5);
        return new kaz[]{new kaz(i, 1L), new kaz(i2, 1L), new kaz((int) ((d4 - d5) * 60.0d * 100.0d), 100L)};
    }

    /* JADX INFO: renamed from: z */
    private static final String m4679z(long j) {
        return lku.m15666t(Long.toString(j), 2);
    }

    @Override // p000.keg
    /* JADX INFO: renamed from: a */
    public final kaz mo4680a(int i) {
        kaz[] kazVarArrM4693v = m4693v(i, m4682e(i));
        if (kazVarArrM4693v == null || kazVarArrM4693v.length == 0) {
            return null;
        }
        return new kaz(kazVarArrM4693v[0]);
    }

    @Override // p000.keg
    /* JADX INFO: renamed from: b */
    public final Integer mo4681b(int i) {
        ken kenVarM4687l = m4687l(i, m4682e(i));
        int[] iArrM14057m = kenVarM4687l == null ? null : kenVarM4687l.m14057m();
        if (iArrM14057m == null || iArrM14057m.length <= 0) {
            return null;
        }
        return Integer.valueOf(iArrM14057m[0]);
    }

    /* JADX INFO: renamed from: e */
    public final int m4682e(int i) {
        if (m4683h().get(i) == 0) {
            return -1;
        }
        return m4673g(i);
    }

    @Override // p000.keg
    public String getTagStringValue(int i) {
        ken kenVarM4687l = m4687l(i, m4682e(i));
        if (kenVarM4687l == null) {
            return null;
        }
        return kenVarM4687l.m14049d();
    }

    /* JADX INFO: renamed from: h */
    public final SparseIntArray m4683h() {
        if (this.f7923bH == null) {
            this.f7923bH = new SparseIntArray();
            int iM4672f = m4672f(new int[]{0, 1}) << 24;
            SparseIntArray sparseIntArray = this.f7923bH;
            sparseIntArray.getClass();
            int i = f7898g;
            int i2 = iM4672f | 131072;
            sparseIntArray.put(i, i2);
            int i3 = iM4672f | 262145;
            sparseIntArray.put(f7813a, i3);
            sparseIntArray.put(f7866b, i3);
            sparseIntArray.put(f7894c, 196611 | iM4672f);
            int i4 = iM4672f | 196609;
            sparseIntArray.put(f7895d, i4);
            sparseIntArray.put(f7896e, i4);
            sparseIntArray.put(f7901j, i4);
            sparseIntArray.put(f7902k, i4);
            sparseIntArray.put(f7907p, i4);
            sparseIntArray.put(f7915x, iM4672f | 196610);
            sparseIntArray.put(f7916y, i4);
            int i5 = iM4672f | 327681;
            sparseIntArray.put(f7905n, i5);
            sparseIntArray.put(f7906o, i5);
            sparseIntArray.put(f7908q, i4);
            int i6 = 262144 | iM4672f;
            sparseIntArray.put(f7900i, i6);
            sparseIntArray.put(f7903l, i3);
            sparseIntArray.put(f7904m, i6);
            sparseIntArray.put(f7909r, 197376 | iM4672f);
            sparseIntArray.put(f7912u, 327682 | iM4672f);
            int i7 = 327686 | iM4672f;
            sparseIntArray.put(f7913v, i7);
            sparseIntArray.put(f7914w, iM4672f | 327683);
            sparseIntArray.put(f7917z, i7);
            sparseIntArray.put(f7910s, iM4672f | 131092);
            sparseIntArray.put(f7897f, i2);
            sparseIntArray.put(i, i2);
            sparseIntArray.put(f7899h, i2);
            sparseIntArray.put(TAG_SOFTWARE, i2);
            sparseIntArray.put(f7911t, i2);
            sparseIntArray.put(f7787A, i2);
            sparseIntArray.put(f7788B, i3);
            sparseIntArray.put(f7789C, i3);
            int iM4672f2 = (m4672f(new int[]{1}) << 24) | 262145;
            sparseIntArray.put(f7790D, iM4672f2);
            sparseIntArray.put(f7791E, iM4672f2);
            int iM4672f3 = m4672f(new int[]{2}) << 24;
            int i8 = 458756 | iM4672f3;
            sparseIntArray.put(f7798L, i8);
            sparseIntArray.put(f7846ag, i8);
            int i9 = iM4672f3 | 196609;
            sparseIntArray.put(f7847ah, i9);
            sparseIntArray.put(f7801O, i8);
            int i10 = iM4672f3 | 327681;
            sparseIntArray.put(f7802P, i10);
            int i11 = iM4672f3 | 262145;
            sparseIntArray.put(f7848ai, i11);
            sparseIntArray.put(f7849aj, i11);
            int i12 = iM4672f3 | 458752;
            sparseIntArray.put(f7841ab, i12);
            sparseIntArray.put(f7842ac, i12);
            sparseIntArray.put(f7850ak, 131085 | iM4672f3);
            int i13 = iM4672f3 | 131092;
            sparseIntArray.put(f7799M, i13);
            sparseIntArray.put(f7800N, i13);
            int i14 = iM4672f3 | 131072;
            sparseIntArray.put(f7843ad, i14);
            sparseIntArray.put(f7844ae, i14);
            sparseIntArray.put(f7845af, i14);
            sparseIntArray.put(f7823aJ, 131105 | iM4672f3);
            sparseIntArray.put(f7824aK, i14);
            sparseIntArray.put(f7825aL, i14);
            sparseIntArray.put(f7792F, i10);
            sparseIntArray.put(f7793G, i10);
            sparseIntArray.put(f7794H, i9);
            sparseIntArray.put(f7795I, i14);
            int i15 = 196608 | iM4672f3;
            sparseIntArray.put(f7796J, i15);
            sparseIntArray.put(f7797K, i12);
            int i16 = 655361 | iM4672f3;
            sparseIntArray.put(f7803Q, i16);
            sparseIntArray.put(f7804R, i10);
            sparseIntArray.put(f7805S, i16);
            sparseIntArray.put(f7806T, i16);
            sparseIntArray.put(f7807U, i10);
            sparseIntArray.put(f7808V, i10);
            sparseIntArray.put(f7809W, i9);
            sparseIntArray.put(f7810X, i9);
            sparseIntArray.put(f7811Y, i9);
            sparseIntArray.put(f7812Z, i10);
            sparseIntArray.put(f7840aa, i15);
            sparseIntArray.put(f7852am, i10);
            sparseIntArray.put(f7853an, i12);
            sparseIntArray.put(f7854ao, i10);
            sparseIntArray.put(f7855ap, i10);
            sparseIntArray.put(f7856aq, i9);
            sparseIntArray.put(f7857ar, iM4672f3 | 196610);
            sparseIntArray.put(f7858as, i10);
            sparseIntArray.put(f7859at, i9);
            int i17 = 458753 | iM4672f3;
            sparseIntArray.put(f7860au, i17);
            sparseIntArray.put(f7861av, i17);
            sparseIntArray.put(f7862aw, i12);
            sparseIntArray.put(f7863ax, i9);
            sparseIntArray.put(f7864ay, i9);
            sparseIntArray.put(f7865az, i9);
            sparseIntArray.put(f7814aA, i10);
            sparseIntArray.put(f7815aB, i9);
            sparseIntArray.put(f7816aC, i9);
            sparseIntArray.put(f7817aD, i10);
            sparseIntArray.put(f7818aE, i9);
            sparseIntArray.put(f7819aF, i9);
            sparseIntArray.put(f7820aG, i9);
            sparseIntArray.put(f7821aH, i12);
            sparseIntArray.put(f7822aI, i9);
            sparseIntArray.put(f7851al, i11);
            int i18 = iM4672f3 | 131079;
            sparseIntArray.put(f7826aM, i18);
            sparseIntArray.put(f7828aO, i18);
            sparseIntArray.put(f7827aN, i18);
            sparseIntArray.put(f7829aP, i16);
            sparseIntArray.put(f7830aQ, i16);
            int iM4672f4 = m4672f(new int[]{4}) << 24;
            sparseIntArray.put(f7831aR, 65540 | iM4672f4);
            int i19 = 131074 | iM4672f4;
            sparseIntArray.put(f7832aS, i19);
            sparseIntArray.put(f7834aU, i19);
            int i20 = iM4672f4 | 327683;
            sparseIntArray.put(f7833aT, i20);
            sparseIntArray.put(f7835aV, i20);
            sparseIntArray.put(f7836aW, 65537 | iM4672f4);
            int i21 = iM4672f4 | 327681;
            sparseIntArray.put(f7837aX, i21);
            sparseIntArray.put(f7838aY, i20);
            int i22 = iM4672f4 | 131072;
            sparseIntArray.put(f7839aZ, i22);
            sparseIntArray.put(f7869ba, i19);
            sparseIntArray.put(f7870bb, i19);
            sparseIntArray.put(f7871bc, i21);
            sparseIntArray.put(f7872bd, i19);
            sparseIntArray.put(f7873be, i21);
            sparseIntArray.put(f7874bf, i19);
            sparseIntArray.put(f7875bg, i21);
            sparseIntArray.put(f7876bh, i19);
            sparseIntArray.put(f7877bi, i21);
            sparseIntArray.put(f7878bj, i22);
            sparseIntArray.put(f7879bk, i19);
            sparseIntArray.put(f7880bl, i21);
            sparseIntArray.put(f7881bm, i19);
            sparseIntArray.put(f7882bn, i21);
            sparseIntArray.put(f7883bo, i19);
            sparseIntArray.put(f7884bp, i21);
            int i23 = iM4672f4 | 458752;
            sparseIntArray.put(f7885bq, i23);
            sparseIntArray.put(f7886br, i23);
            sparseIntArray.put(f7887bs, 131083 | iM4672f4);
            sparseIntArray.put(f7888bt, iM4672f4 | 196619);
            int iM4672f5 = m4672f(new int[]{3}) << 24;
            sparseIntArray.put(f7889bu, iM4672f5 | 131072);
            sparseIntArray.put(f7890bv, iM4672f5 | 458752);
        }
        SparseIntArray sparseIntArray2 = this.f7923bH;
        sparseIntArray2.getClass();
        return sparseIntArray2;
    }

    /* JADX INFO: renamed from: i */
    public final ken m4684i(int i, Object obj) {
        boolean zM14053i;
        int i2 = m4683h().get(i);
        if (i2 == 0 || obj == null) {
            return null;
        }
        int iM4673g = m4673g(i);
        short sM4675o = m4675o(i2);
        int iM4671d = m4671d(i2);
        boolean z = iM4671d != 0;
        if (!m4676s(i2, iM4673g)) {
            return null;
        }
        ken kenVar = new ken(m4674n(i), sM4675o, iM4671d, iM4673g, z);
        if (obj instanceof Short) {
            zM14053i = kenVar.m14051g((char) ((Short) obj).shortValue());
        } else if (obj instanceof String) {
            zM14053i = kenVar.m14052h((String) obj);
        } else if (obj instanceof int[]) {
            zM14053i = kenVar.m14054j((int[]) obj);
        } else if (obj instanceof long[]) {
            zM14053i = kenVar.m14055k((long[]) obj);
        } else if (obj instanceof kaz) {
            zM14053i = kenVar.m14056l(new kaz[]{(kaz) obj});
        } else if (obj instanceof kaz[]) {
            zM14053i = kenVar.m14056l((kaz[]) obj);
        } else if (obj instanceof byte[]) {
            zM14053i = kenVar.m14053i((byte[]) obj);
        } else if (obj instanceof Integer) {
            zM14053i = kenVar.m14051g(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            zM14053i = kenVar.m14055k(new long[]{((Long) obj).longValue()});
        } else if (obj instanceof Byte) {
            zM14053i = kenVar.m14053i(new byte[]{((Byte) obj).byteValue()});
        } else if (obj instanceof Short[]) {
            Short[] shArr = (Short[]) obj;
            int[] iArr = new int[shArr.length];
            for (int i3 = 0; i3 < shArr.length; i3++) {
                Short sh = shArr[i3];
                iArr[i3] = sh == null ? (char) 0 : (char) sh.shortValue();
            }
            zM14053i = kenVar.m14054j(iArr);
        } else if (obj instanceof Integer[]) {
            Integer[] numArr = (Integer[]) obj;
            int[] iArr2 = new int[numArr.length];
            for (int i4 = 0; i4 < numArr.length; i4++) {
                Integer num = numArr[i4];
                iArr2[i4] = num == null ? 0 : num.intValue();
            }
            zM14053i = kenVar.m14054j(iArr2);
        } else if (obj instanceof Long[]) {
            Long[] lArr = (Long[]) obj;
            long[] jArr = new long[lArr.length];
            for (int i5 = 0; i5 < lArr.length; i5++) {
                Long l = lArr[i5];
                jArr[i5] = l == null ? 0L : l.longValue();
            }
            zM14053i = kenVar.m14055k(jArr);
        } else {
            if (!(obj instanceof Byte[])) {
                return null;
            }
            Byte[] bArr = (Byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            for (int i6 = 0; i6 < bArr.length; i6++) {
                Byte b = bArr[i6];
                bArr2[i6] = b == null ? (byte) 0 : b.byteValue();
            }
            zM14053i = kenVar.m14053i(bArr2);
        }
        if (zM14053i) {
            return kenVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final ken m4685j(int i) {
        int i2 = m4683h().get(i);
        if (i2 == 0) {
            return null;
        }
        int iM4671d = m4671d(i2);
        return new ken(m4674n(i), m4675o(i2), iM4671d, m4673g(i), iM4671d != 0);
    }

    /* JADX INFO: renamed from: k */
    public final ken m4686k(int i) {
        return m4687l(i, m4682e(i));
    }

    /* JADX INFO: renamed from: l */
    public final ken m4687l(int i, int i2) {
        if (!ken.m14045f(i2)) {
            return null;
        }
        kef kefVar = this.f7919bB;
        short sM4674n = m4674n(i);
        keq keqVar = kefVar.f35718a[i2];
        if (keqVar == null) {
            return null;
        }
        return keqVar.m14075b(sM4674n);
    }

    /* JADX INFO: renamed from: m */
    public final OutputStream m4688m(OutputStream outputStream) {
        return new keu(new keo(new BufferedOutputStream(outputStream, 65536), this, this.f7919bB));
    }

    /* JADX INFO: renamed from: p */
    public final void m4689p(int i) {
        this.f7919bB.m14029h(m4674n(i), m4682e(i));
    }

    /* JADX INFO: renamed from: q */
    public final void m4690q(InputStream inputStream) throws IOException {
        try {
            kem kemVar = new kem(inputStream, this);
            kef kefVar = new kef(kemVar.f35747a.f35716b.order());
            for (int iM14039a = kemVar.m14039a(); iM14039a != 5; iM14039a = kemVar.m14039a()) {
                int iM14048b = 0;
                switch (iM14039a) {
                    case 0:
                        kefVar.m14025d(new keq(kemVar.f35748b));
                        continue;
                        break;
                    case 1:
                        ken kenVar = kemVar.f35749c;
                        if (kenVar == null) {
                            continue;
                        } else if (kenVar.m14050e()) {
                            keq keqVarM14023b = kefVar.m14023b(kenVar.f35769e);
                            if (keqVarM14023b != null) {
                                keqVarM14023b.m14078e(kenVar);
                            }
                        } else {
                            int i = kenVar.f35771g;
                            if (i >= kemVar.f35747a.f35715a) {
                                kemVar.f35753g.put(Integer.valueOf(i), new kej(kenVar, true));
                            }
                        }
                        break;
                    case 2:
                        ken kenVar2 = kemVar.f35749c;
                        if (kenVar2 != null) {
                            if (kenVar2.f35766b == 7) {
                                kemVar.m14043e(kenVar2);
                            }
                            keq keqVarM14023b2 = kefVar.m14023b(kenVar2.f35769e);
                            if (keqVarM14023b2 != null) {
                                keqVarM14023b2.m14078e(kenVar2);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        ken kenVar3 = kemVar.f35752f;
                        if (kenVar3 != null) {
                            iM14048b = (int) kenVar3.m14048b(0);
                        }
                        byte[] bArr = new byte[iM14048b];
                        if (iM14048b == kemVar.m14040b(bArr)) {
                            kefVar.f35719b = bArr;
                            continue;
                        } else {
                            Log.w("CAM_ExifReader", "Failed to read the compressed thumbnail");
                        }
                        break;
                    default:
                        ken kenVar4 = kemVar.f35751e;
                        if (kenVar4 != null) {
                            iM14048b = (int) kenVar4.m14048b(0);
                        }
                        byte[] bArr2 = new byte[iM14048b];
                        if (iM14048b == kemVar.m14040b(bArr2)) {
                            int i2 = kemVar.f35750d.f35737a;
                            if (i2 < kefVar.f35720c.size()) {
                                kefVar.f35720c.set(i2, bArr2);
                            } else {
                                for (int size = kefVar.f35720c.size(); size < i2; size++) {
                                    kefVar.f35720c.add(null);
                                }
                                kefVar.f35720c.add(bArr2);
                            }
                        } else {
                            Log.w("CAM_ExifReader", "Failed to read the strip bytes");
                            continue;
                        }
                        break;
                }
                throw new IOException("Invalid exif format : ", e);
            }
            this.f7919bB = kefVar;
        } catch (keh e) {
            throw new IOException("Invalid exif format : ", e);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4691r(byte[] bArr) throws IOException {
        m4690q(new ByteArrayInputStream(bArr));
    }

    public void readExif(String str) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        m4690q(bufferedInputStream);
        bufferedInputStream.close();
    }

    /* JADX INFO: renamed from: u */
    public final kaz[] m4692u(int i) {
        return m4693v(i, m4682e(i));
    }

    /* JADX INFO: renamed from: v */
    public final kaz[] m4693v(int i, int i2) {
        ken kenVarM4687l = m4687l(i, i2);
        if (kenVarM4687l == null) {
            return null;
        }
        Object obj = kenVarM4687l.f35770f;
        if (obj instanceof kaz[]) {
            return (kaz[]) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m4694x(int i, long j, TimeZone timeZone) {
        ken kenVarM4684i;
        int i2;
        int i3;
        int i4 = f7910s;
        if (i == i4 || i == f7800N || i == f7799M) {
            synchronized (this.f7922bG) {
                this.f7922bG.setTimeZone(timeZone);
                kenVarM4684i = m4684i(i, this.f7922bG.format(Long.valueOf(j)));
            }
            if (kenVarM4684i == null) {
                return;
            }
            m4695y(kenVarM4684i);
            if (i == i4) {
                i2 = f7826aM;
            } else if (i == f7800N) {
                i2 = f7828aO;
            } else {
                if (i != f7799M) {
                    throw new IllegalArgumentException("Must pass a date stamp tag, unrecognized tag: " + i);
                }
                i2 = f7827aN;
            }
            int offset = timeZone.getOffset(j);
            int iAbs = Math.abs(offset);
            StringBuilder sb = new StringBuilder();
            sb.append(offset < 0 ? "-" : "+");
            long j2 = iAbs;
            sb.append(m4679z(TimeUnit.MILLISECONDS.toHours(j2)));
            sb.append(":");
            sb.append(m4679z(TimeUnit.MILLISECONDS.toMinutes(j2) % 60));
            ken kenVarM4684i2 = m4684i(i2, sb.toString());
            if (kenVarM4684i2 != null) {
                m4695y(kenVarM4684i2);
            }
            if (i == i4) {
                i3 = f7843ad;
            } else if (i == f7800N) {
                i3 = f7845af;
            } else {
                if (i != f7799M) {
                    throw new IllegalArgumentException("Must pass a date stamp tag, unrecognized tag: " + i);
                }
                i3 = f7844ae;
            }
            ken kenVarM4684i3 = m4684i(i3, kfv.m14164A(j));
            if (kenVarM4684i3 == null) {
                return;
            }
            m4695y(kenVarM4684i3);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m4695y(ken kenVar) {
        this.f7919bB.m14031j(kenVar);
    }
}
