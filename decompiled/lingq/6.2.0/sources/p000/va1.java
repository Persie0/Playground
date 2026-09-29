package p000;

import androidx.compose.p002ui.graphics.colorspace.C0308a;

/* JADX INFO: loaded from: classes.dex */
public final class va1 {

    /* JADX INFO: renamed from: a */
    public static final float[] f65096a;

    /* JADX INFO: renamed from: b */
    public static final float[] f65097b;

    /* JADX INFO: renamed from: c */
    public static final h9a f65098c;

    /* JADX INFO: renamed from: d */
    public static final h9a f65099d;

    /* JADX INFO: renamed from: e */
    public static final C0308a f65100e;

    /* JADX INFO: renamed from: f */
    public static final C0308a f65101f;

    /* JADX INFO: renamed from: g */
    public static final C0308a f65102g;

    /* JADX INFO: renamed from: h */
    public static final C0308a f65103h;

    /* JADX INFO: renamed from: i */
    public static final C0308a f65104i;

    /* JADX INFO: renamed from: j */
    public static final C0308a f65105j;

    /* JADX INFO: renamed from: k */
    public static final C0308a f65106k;

    /* JADX INFO: renamed from: l */
    public static final C0308a f65107l;

    /* JADX INFO: renamed from: m */
    public static final C0308a f65108m;

    /* JADX INFO: renamed from: n */
    public static final C0308a f65109n;

    /* JADX INFO: renamed from: o */
    public static final C0308a f65110o;

    /* JADX INFO: renamed from: p */
    public static final C0308a f65111p;

    /* JADX INFO: renamed from: q */
    public static final C0308a f65112q;

    /* JADX INFO: renamed from: r */
    public static final C0308a f65113r;

    /* JADX INFO: renamed from: s */
    public static final zk4 f65114s;

    /* JADX INFO: renamed from: t */
    public static final zk4 f65115t;

    /* JADX INFO: renamed from: u */
    public static final C0308a f65116u;

    /* JADX INFO: renamed from: v */
    public static final C0308a f65117v;

    /* JADX INFO: renamed from: w */
    public static final C0308a f65118w;

    /* JADX INFO: renamed from: x */
    public static final fr6 f65119x;

    /* JADX INFO: renamed from: y */
    public static final sa1[] f65120y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f65096a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f65097b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        h9a h9aVar = new h9a(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        h9a h9aVar2 = new h9a(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        h9a h9aVar3 = new h9a(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f65098c = h9aVar3;
        h9a h9aVar4 = new h9a(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f65099d = h9aVar4;
        i4b i4bVar = AbstractC3184kh.f47268j;
        C0308a c0308a = new C0308a("sRGB IEC61966-2.1", fArr, i4bVar, h9aVar, 0);
        f65100e = c0308a;
        C0308a c0308a2 = new C0308a("sRGB IEC61966-2.1 (Linear)", fArr, i4bVar, 1.0d, 0.0f, 1.0f, 1);
        f65101f = c0308a2;
        C0308a c0308a3 = new C0308a("scRGB-nl IEC 61966-2-2:2003", fArr, i4bVar, null, new C3386nv(12), new C3386nv(13), -0.799f, 2.399f, h9aVar, 2);
        f65102g = c0308a3;
        C0308a c0308a4 = new C0308a("scRGB IEC 61966-2-2:2003", fArr, i4bVar, 1.0d, -0.5f, 7.499f, 3);
        f65103h = c0308a4;
        C0308a c0308a5 = new C0308a("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, i4bVar, new h9a(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f65104i = c0308a5;
        C0308a c0308a6 = new C0308a("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, i4bVar, new h9a(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f65105j = c0308a6;
        C0308a c0308a7 = new C0308a("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new i4b(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f65106k = c0308a7;
        C0308a c0308a8 = new C0308a("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, i4bVar, h9aVar, 7);
        f65107l = c0308a8;
        double d = 0.2222222222222222d;
        double d2 = 0.081d;
        double d3 = 2.2222222222222223d;
        double d4 = 0.9099181073703367d;
        double d5 = 0.09008189262966333d;
        C0308a c0308a9 = new C0308a("NTSC (1953)", fArr2, AbstractC3184kh.f47265g, new h9a(d3, d4, d5, d, d2), 8);
        f65108m = c0308a9;
        C0308a c0308a10 = new C0308a("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, i4bVar, new h9a(d3, d4, d5, d, d2), 9);
        f65109n = c0308a10;
        C0308a c0308a11 = new C0308a("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, i4bVar, 2.2d, 0.0f, 1.0f, 10);
        f65110o = c0308a11;
        C0308a c0308a12 = new C0308a("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC3184kh.f47266h, new h9a(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f65111p = c0308a12;
        i4b i4bVar2 = AbstractC3184kh.f47267i;
        C0308a c0308a13 = new C0308a("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, i4bVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f65112q = c0308a13;
        C0308a c0308a14 = new C0308a("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, i4bVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f65113r = c0308a14;
        zk4 zk4Var = new zk4(14, 12884901889L, "Generic XYZ", 1);
        f65114s = zk4Var;
        zk4 zk4Var2 = new zk4(15, 12884901890L, "Generic L*a*b*", 0);
        f65115t = zk4Var2;
        C0308a c0308a15 = new C0308a("None", fArr, i4bVar, h9aVar2, 16);
        f65116u = c0308a15;
        C0308a c0308a16 = new C0308a("Hybrid Log Gamma encoding", fArr3, i4bVar, null, new C3386nv(14), new C3386nv(15), 0.0f, 1.0f, h9aVar3, 17);
        f65117v = c0308a16;
        C0308a c0308a17 = new C0308a("Perceptual Quantizer encoding", fArr3, i4bVar, null, new C3386nv(16), new C3386nv(17), 0.0f, 1.0f, h9aVar4, 18);
        f65118w = c0308a17;
        fr6 fr6Var = new fr6("Oklab", 19, 12884901890L);
        f65119x = fr6Var;
        f65120y = new sa1[]{c0308a, c0308a2, c0308a3, c0308a4, c0308a5, c0308a6, c0308a7, c0308a8, c0308a9, c0308a10, c0308a11, c0308a12, c0308a13, c0308a14, zk4Var, zk4Var2, c0308a15, c0308a16, c0308a17, fr6Var};
    }

    /* JADX INFO: renamed from: a */
    public static double m23208a(h9a h9aVar, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = h9aVar.f42054b;
        double d5 = h9aVar.f42055c;
        double d6 = h9aVar.f42056d;
        double d7 = h9aVar.f42057e;
        double d8 = h9aVar.f42058f;
        double d9 = d4 * d3;
        return (h9aVar.f42059g + 1.0d) * d2 * (d9 <= 1.0d ? Math.pow(d9, d5) : Math.exp((d3 - d8) * d6) + d7);
    }

    /* JADX INFO: renamed from: b */
    public static double m23209b(h9a h9aVar, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = 1.0d / h9aVar.f42054b;
        double d4 = 1.0d / h9aVar.f42055c;
        double d5 = 1.0d / h9aVar.f42056d;
        double d6 = h9aVar.f42057e;
        double d7 = h9aVar.f42058f;
        double d8 = (d * d2) / (h9aVar.f42059g + 1.0d);
        return d2 * (d8 <= 1.0d ? Math.pow(d8, d4) * d3 : (Math.log(d8 - d6) * d5) + d7);
    }

    /* JADX INFO: renamed from: c */
    public static double m23210c(h9a h9aVar, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = h9aVar.f42054b;
        double d5 = h9aVar.f42056d;
        double dPow = (Math.pow(d3, d5) * h9aVar.f42055c) + d4;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d3, d5) * h9aVar.f42058f) + h9aVar.f42057e), h9aVar.f42059g) * d2;
    }

    /* JADX INFO: renamed from: d */
    public static double m23211d(h9a h9aVar, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = -h9aVar.f42054b;
        double d5 = h9aVar.f42057e;
        double d6 = 1.0d / h9aVar.f42059g;
        return Math.pow(Math.max((Math.pow(d3, d6) * d5) + d4, 0.0d) / ((Math.pow(d3, d6) * (-h9aVar.f42058f)) + h9aVar.f42055c), 1.0d / h9aVar.f42056d) * d2;
    }
}
