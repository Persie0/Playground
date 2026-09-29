package p402u0;

import p150h9.C5931p;
import p385sf.C9000b;

/* JADX INFO: renamed from: u0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9363f {

    /* JADX INFO: renamed from: a */
    public static final float[] f48105a;

    /* JADX INFO: renamed from: b */
    public static final float[] f48106b;

    /* JADX INFO: renamed from: c */
    public static final C9374q f48107c;

    /* JADX INFO: renamed from: d */
    public static final C9374q f48108d;

    /* JADX INFO: renamed from: e */
    public static final C9374q f48109e;

    /* JADX INFO: renamed from: f */
    public static final C9374q f48110f;

    /* JADX INFO: renamed from: g */
    public static final C9374q f48111g;

    /* JADX INFO: renamed from: h */
    public static final C9374q f48112h;

    /* JADX INFO: renamed from: i */
    public static final C9374q f48113i;

    /* JADX INFO: renamed from: j */
    public static final C9374q f48114j;

    /* JADX INFO: renamed from: k */
    public static final C9374q f48115k;

    /* JADX INFO: renamed from: l */
    public static final C9374q f48116l;

    /* JADX INFO: renamed from: m */
    public static final C9374q f48117m;

    /* JADX INFO: renamed from: n */
    public static final C9374q f48118n;

    /* JADX INFO: renamed from: o */
    public static final C9374q f48119o;

    /* JADX INFO: renamed from: p */
    public static final C9374q f48120p;

    /* JADX INFO: renamed from: q */
    public static final C9377t f48121q;

    /* JADX INFO: renamed from: r */
    public static final C9367j f48122r;

    /* JADX INFO: renamed from: s */
    public static final C9374q f48123s;

    /* JADX INFO: renamed from: t */
    public static final C9368k f48124t;

    /* JADX INFO: renamed from: u */
    public static final AbstractC9360c[] f48125u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f48105a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f48106b = fArr2;
        C9375r c9375r = new C9375r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C9375r c9375r2 = new C9375r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C9376s c9376s = C9000b.f47200e;
        C9374q c9374q = new C9374q("sRGB IEC61966-2.1", fArr, c9376s, c9375r, 0);
        f48107c = c9374q;
        C9374q c9374q2 = new C9374q("sRGB IEC61966-2.1 (Linear)", fArr, c9376s, 1.0d, 0.0f, 1.0f, 1);
        f48108d = c9374q2;
        int i10 = 0;
        C9374q c9374q3 = new C9374q("scRGB-nl IEC 61966-2-2:2003", fArr, c9376s, null, new C9362e(i10), new C5931p(i10), -0.799f, 2.399f, c9375r, 2);
        f48109e = c9374q3;
        C9374q c9374q4 = new C9374q("scRGB IEC 61966-2-2:2003", fArr, c9376s, 1.0d, -0.5f, 7.499f, 3);
        f48110f = c9374q4;
        C9374q c9374q5 = new C9374q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c9376s, new C9375r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f48111g = c9374q5;
        C9374q c9374q6 = new C9374q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c9376s, new C9375r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f48112h = c9374q6;
        C9374q c9374q7 = new C9374q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C9376s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f48113i = c9374q7;
        C9374q c9374q8 = new C9374q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c9376s, c9375r, 7);
        f48114j = c9374q8;
        C9374q c9374q9 = new C9374q("NTSC (1953)", fArr2, C9000b.f47197b, new C9375r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f48115k = c9374q9;
        C9374q c9374q10 = new C9374q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c9376s, new C9375r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f48116l = c9374q10;
        C9374q c9374q11 = new C9374q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c9376s, 2.2d, 0.0f, 1.0f, 10);
        f48117m = c9374q11;
        C9374q c9374q12 = new C9374q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, C9000b.f47198c, new C9375r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f48118n = c9374q12;
        C9376s c9376s2 = C9000b.f47199d;
        C9374q c9374q13 = new C9374q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c9376s2, 1.0d, -65504.0f, 65504.0f, 12);
        f48119o = c9374q13;
        C9374q c9374q14 = new C9374q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c9376s2, 1.0d, -65504.0f, 65504.0f, 13);
        f48120p = c9374q14;
        C9377t c9377t = new C9377t();
        f48121q = c9377t;
        C9367j c9367j = new C9367j();
        f48122r = c9367j;
        C9374q c9374q15 = new C9374q("None", fArr, c9376s, c9375r2, 16);
        f48123s = c9374q15;
        C9368k c9368k = new C9368k();
        f48124t = c9368k;
        f48125u = new AbstractC9360c[]{c9374q, c9374q2, c9374q3, c9374q4, c9374q5, c9374q6, c9374q7, c9374q8, c9374q9, c9374q10, c9374q11, c9374q12, c9374q13, c9374q14, c9377t, c9367j, c9374q15, c9368k};
    }
}
