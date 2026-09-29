package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import androidx.media3.common.C0713b;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class a3d implements coa, fn9, bn9, vq6, xoc, sic {

    /* JADX INFO: renamed from: a */
    public static a3d f189a;

    /* JADX INFO: renamed from: b */
    public static final a3d f190b = new a3d();

    /* JADX INFO: renamed from: c */
    public static final a3d f191c = new a3d();

    /* JADX INFO: renamed from: d */
    public static final a3d f192d = new a3d();

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:13:0x001a, B:11:0x0014, B:8:0x0010), top: B:90:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static s24 m76m(Context context) {
        a34 a34VarM17447g;
        a34 a34Var;
        Class cls;
        Class cls2;
        Class cls3;
        Object objM3252s;
        s24 s24Var;
        Object objM3252s2;
        Object objM3252s3;
        synchronized (a34.f171g) {
            if (lp1.f49971a.contains(a34.class)) {
                a34VarM17447g = null;
                if (a34VarM17447g == null) {
                    a34VarM17447g = nid.m17447g();
                }
                a34Var = a34VarM17447g;
            } else {
                try {
                    a34VarM17447g = a34.f172h;
                } catch (Throwable th) {
                    lp1.m16420a(a34.class, th);
                    a34VarM17447g = null;
                }
                if (a34VarM17447g == null) {
                    a34VarM17447g = nid.m17447g();
                }
                a34Var = a34VarM17447g;
            }
            throw th;
        }
        if (a34Var == null) {
            return null;
        }
        Class clsM3246l = b34.m3246l("com.android.billingclient.api.BillingClient");
        Class clsM3246l2 = b34.m3246l("com.android.billingclient.api.Purchase");
        Class clsM3246l3 = b34.m3246l("com.android.billingclient.api.Purchase$PurchasesResult");
        Class clsM3246l4 = b34.m3246l("com.android.billingclient.api.SkuDetails");
        Class clsM3246l5 = b34.m3246l("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsM3246l6 = b34.m3246l("com.android.billingclient.api.SkuDetailsResponseListener");
        Class clsM3246l7 = b34.m3246l("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsM3246l == null || clsM3246l3 == null || clsM3246l2 == null || clsM3246l4 == null || clsM3246l6 == null || clsM3246l5 == null || clsM3246l7 == null) {
            Log.w(s24.m21006b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Method methodM3249p = b34.m3249p(clsM3246l, "queryPurchases", String.class);
        Method methodM3249p2 = b34.m3249p(clsM3246l3, "getPurchasesList", new Class[0]);
        Method methodM3249p3 = b34.m3249p(clsM3246l2, "getOriginalJson", new Class[0]);
        Method methodM3249p4 = b34.m3249p(clsM3246l4, "getOriginalJson", new Class[0]);
        Method methodM3249p5 = b34.m3249p(clsM3246l5, "getOriginalJson", new Class[0]);
        if (lp1.f49971a.contains(a34Var)) {
            cls = null;
        } else {
            try {
                cls = (Class) a34Var.f173a;
            } catch (Throwable th2) {
                lp1.m16420a(a34Var, th2);
                cls = null;
            }
        }
        Method methodM3249p6 = b34.m3249p(clsM3246l, "querySkuDetailsAsync", cls, clsM3246l6);
        Method methodM3249p7 = b34.m3249p(clsM3246l, "queryPurchaseHistoryAsync", String.class, clsM3246l7);
        if (methodM3249p == null || methodM3249p2 == null || methodM3249p3 == null || methodM3249p4 == null || methodM3249p5 == null || methodM3249p6 == null || methodM3249p7 == null) {
            Log.w(s24.m21006b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Class clsM3246l8 = b34.m3246l("com.android.billingclient.api.BillingClient$Builder");
        Class clsM3246l9 = b34.m3246l("com.android.billingclient.api.PurchasesUpdatedListener");
        if (clsM3246l8 == null || clsM3246l9 == null) {
            cls2 = clsM3246l;
            cls3 = clsM3246l4;
        } else {
            Method methodM3249p8 = b34.m3249p(clsM3246l, "newBuilder", Context.class);
            Method methodM3249p9 = b34.m3249p(clsM3246l8, "enablePendingPurchases", new Class[0]);
            Method methodM3249p10 = b34.m3249p(clsM3246l8, "setListener", clsM3246l9);
            cls3 = clsM3246l4;
            Method methodM3249p11 = b34.m3249p(clsM3246l8, "build", new Class[0]);
            if (methodM3249p8 != null && methodM3249p9 != null && methodM3249p10 != null && methodM3249p11 != null && (objM3252s2 = b34.m3252s(clsM3246l, null, methodM3249p8, context)) != null) {
                cls2 = clsM3246l;
                Object objM3252s4 = b34.m3252s(clsM3246l8, objM3252s2, methodM3249p10, Proxy.newProxyInstance(clsM3246l9.getClassLoader(), new Class[]{clsM3246l9}, new r24()));
                objM3252s = (objM3252s4 == null || (objM3252s3 = b34.m3252s(clsM3246l8, objM3252s4, methodM3249p9, new Object[0])) == null) ? null : b34.m3252s(clsM3246l8, objM3252s3, methodM3249p11, new Object[0]);
                if (objM3252s == null) {
                    Log.w(s24.m21006b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                    return null;
                }
                s24Var = new s24(objM3252s, cls2, cls3, clsM3246l5, clsM3246l6, clsM3246l7, methodM3249p4, methodM3249p5, methodM3249p6, methodM3249p7, a34Var);
                if (!lp1.f49971a.contains(s24.class)) {
                    try {
                        s24.f60179m = s24Var;
                    } catch (Throwable th3) {
                        lp1.m16420a(s24.class, th3);
                    }
                }
                if (!lp1.f49971a.contains(s24.class)) {
                    try {
                        return s24.f60179m;
                    } catch (Throwable th4) {
                        lp1.m16420a(s24.class, th4);
                    }
                }
                return null;
            }
            cls2 = clsM3246l;
        }
        if (objM3252s == null) {
            Log.w(s24.m21006b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        s24Var = new s24(objM3252s, cls2, cls3, clsM3246l5, clsM3246l6, clsM3246l7, methodM3249p4, methodM3249p5, methodM3249p6, methodM3249p7, a34Var);
        if (!lp1.f49971a.contains(s24.class)) {
            s24.f60179m = s24Var;
        }
        if (!lp1.f49971a.contains(s24.class)) {
            return s24.f60179m;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static ConcurrentHashMap m77n() {
        if (lp1.f49971a.contains(s24.class)) {
            return null;
        }
        try {
            return s24.f60181o;
        } catch (Throwable th) {
            lp1.m16420a(s24.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static ConcurrentHashMap m78p() {
        if (lp1.f49971a.contains(s24.class)) {
            return null;
        }
        try {
            return s24.f60183q;
        } catch (Throwable th) {
            lp1.m16420a(s24.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static ConcurrentHashMap m79q() {
        if (lp1.f49971a.contains(s24.class)) {
            return null;
        }
        try {
            return s24.f60182p;
        } catch (Throwable th) {
            lp1.m16420a(s24.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static synchronized void m80r() {
        if (f189a == null) {
            f189a = new a3d();
        }
    }

    @Override // p000.vq6
    /* JADX INFO: renamed from: a */
    public long mo81a(iy2 iy2Var) {
        return -1L;
    }

    @Override // p000.bn9
    /* JADX INFO: renamed from: b */
    public int mo82b(C0713b c0713b) {
        String str = c0713b.f6406o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        C3386nv.m17626m(AbstractC3393o1.m17734i("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // p000.sic
    /* JADX INFO: renamed from: c */
    public byte[] mo83c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.vq6
    /* JADX INFO: renamed from: d */
    public st8 mo84d() {
        return new h60(-9223372036854775807L);
    }

    @Override // p000.bn9
    /* JADX INFO: renamed from: e */
    public cn9 mo85e(C0713b c0713b) {
        String str = c0713b.f6406o;
        List list = c0713b.f6409r;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    qn2 qn2Var = new qn2();
                    k47 k47Var = new k47((byte[]) list.get(0));
                    int iM14812G = k47Var.m14812G();
                    int iM14812G2 = k47Var.m14812G();
                    Paint paint = new Paint();
                    qn2Var.f57962a = paint;
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    paint.setPathEffect(null);
                    Paint paint2 = new Paint();
                    qn2Var.f57963b = paint2;
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                    paint2.setPathEffect(null);
                    qn2Var.f57964c = new Canvas();
                    qn2Var.f57965d = new kn2(719, 575, 0, 719, 0, 575);
                    qn2Var.f57966e = new jn2(0, new int[]{0, -1, -16777216, -8421505}, qn2.m20037b(), qn2.m20038c());
                    qn2Var.f57967f = new pn2(iM14812G, iM14812G2);
                    return qn2Var;
                case "application/pgs":
                    return new C3329mb(12);
                case "application/x-mp4-vtt":
                    return new hi8(23);
                case "text/vtt":
                    return new p33(28);
                case "application/x-quicktime-tx3g":
                    return new kda(list);
                case "text/x-ssa":
                    return new dg9(list);
                case "application/vobsub":
                    return new mwa(list);
                case "application/x-subrip":
                    return new tm9();
                case "application/ttml+xml":
                    return new pca();
            }
        }
        C3386nv.m17626m(AbstractC3393o1.m17734i("Unsupported MIME type: ", str));
        return null;
    }

    @Override // p000.vq6
    /* JADX INFO: renamed from: f */
    public void mo86f(long j) {
    }

    @Override // p000.coa
    /* JADX INFO: renamed from: g */
    public Object mo87g(AbstractC0875a abstractC0875a, float f) {
        boolean z = abstractC0875a.mo5047z() == JsonReader$Token.BEGIN_ARRAY;
        if (z) {
            abstractC0875a.mo5037a();
        }
        double dMo5044r = abstractC0875a.mo5044r();
        double dMo5044r2 = abstractC0875a.mo5044r();
        double dMo5044r3 = abstractC0875a.mo5044r();
        double dMo5044r4 = abstractC0875a.mo5047z() == JsonReader$Token.NUMBER ? abstractC0875a.mo5044r() : 1.0d;
        if (z) {
            abstractC0875a.mo5039c();
        }
        if (dMo5044r <= 1.0d && dMo5044r2 <= 1.0d && dMo5044r3 <= 1.0d) {
            dMo5044r *= 255.0d;
            dMo5044r2 *= 255.0d;
            dMo5044r3 *= 255.0d;
            if (dMo5044r4 <= 1.0d) {
                dMo5044r4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMo5044r4, (int) dMo5044r, (int) dMo5044r2, (int) dMo5044r3));
    }

    /* JADX INFO: renamed from: h */
    public void m88h(float f, float f2, int i, long j, ye1 ye1Var, e16 e16Var, o39 o39Var) {
        o39 o39Var2;
        o39 o39Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1895596205);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | 25984;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                f2 = tj7.f62416b;
                j = ra1.m20492e(tj7.f62415a, tj3Var);
                o39Var3 = tj7.f62417c;
            } else {
                tj3Var.m22102U();
                o39Var3 = o39Var;
            }
            tj3Var.m22140r();
            thb.m22044c(tj3Var, d32.m10007D(c99.m4421n(c99.m4417j(e16Var, f2), f), j, o39Var3));
            o39Var2 = o39Var3;
        } else {
            tj3Var.m22102U();
            o39Var2 = o39Var;
        }
        float f3 = f2;
        long j2 = j;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mg0(this, e16Var, f, f3, j2, o39Var2, i);
        }
    }

    @Override // p000.bn9
    /* JADX INFO: renamed from: i */
    public boolean mo89i(C0713b c0713b) {
        String str = c0713b.f6406o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX INFO: renamed from: j */
    public void m90j(final e16 e16Var, float f, long j, ye1 ye1Var, final int i) {
        final float f2;
        final long j2;
        float f3;
        long jM20492e;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1498258020);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | 176;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                f3 = tj7.f62416b;
                jM20492e = ra1.m20492e(tj7.f62415a, tj3Var);
            } else {
                tj3Var.m22102U();
                f3 = f;
                jM20492e = j;
            }
            tj3Var.m22140r();
            qh0.m19963a(d32.m10007D(c99.m4414g(c99.m4412e(e16Var, 1.0f), f3), jM20492e, ss5.f61356d), tj3Var, 0);
            j2 = jM20492e;
            f2 = f3;
        } else {
            tj3Var.m22102U();
            f2 = f;
            j2 = j;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(e16Var, f2, j2, i) { // from class: kq9

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ e16 f48341b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ float f48342c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f48343d;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(3073);
                    this.f48340a.m90j(this.f48341b, this.f48342c, this.f48343d, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        return Tasks.m5975c(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l */
    public void m92l(zr2 zr2Var) {
        zr2Var.mo12901e(tmc.class, o2c.f53696a);
        zr2Var.mo12901e(xvc.class, ucc.f63731a);
        zr2Var.mo12901e(zmc.class, t2c.f61779a);
        zr2Var.mo12901e(xnc.class, x2c.f67685a);
        zr2Var.mo12901e(lnc.class, u2c.f63334a);
        zr2Var.mo12901e(snc.class, z2c.f70809a);
        zr2Var.mo12901e(kic.class, zyb.f72397a);
        zr2Var.mo12901e(gic.class, uyb.f64547a);
        zr2Var.mo12901e(blc.class, t1c.f61756a);
        zr2Var.mo12901e(tuc.class, lbc.f49419a);
        zr2Var.mo12901e(bic.class, qyb.f58395a);
        zr2Var.mo12901e(xhc.class, nyb.f53422a);
        zr2Var.mo12901e(opc.class, y4c.f69296a);
        zr2Var.mo12901e(czc.class, s0c.f60144a);
        zr2Var.mo12901e(nkc.class, g1c.f40056a);
        zr2Var.mo12901e(zjc.class, o0c.f53565a);
        zr2Var.mo12901e(ppc.class, e5c.f36731a);
        zr2Var.mo12901e(kuc.class, vac.f65154a);
        zr2Var.mo12901e(ouc.class, abc.f479a);
        zr2Var.mo12901e(huc.class, qac.f57519a);
        zr2Var.mo12901e(qoc.class, r3c.f58583a);
        zr2Var.mo12901e(yyc.class, ovb.f55045a);
        zr2Var.mo12901e(yoc.class, w3c.f66345a);
        zr2Var.mo12901e(uqc.class, x6c.f67843a);
        zr2Var.mo12901e(drc.class, k7c.f46835a);
        zr2Var.mo12901e(zqc.class, g7c.f40367a);
        zr2Var.mo12901e(vqc.class, b7c.f8075a);
        zr2Var.mo12901e(tsc.class, v8c.f65031a);
        zr2Var.mo12901e(xsc.class, b9c.f8193a);
        zr2Var.mo12901e(dtc.class, n9c.f52528a);
        zr2Var.mo12901e(atc.class, j9c.f45270a);
        zr2Var.mo12901e(poc.class, o3c.f53811a);
        zr2Var.mo12901e(itc.class, r9c.f58951a);
        zr2Var.mo12901e(mtc.class, w9c.f66548a);
        zr2Var.mo12901e(stc.class, z9c.f71247a);
        zr2Var.mo12901e(xtc.class, dac.f35342a);
        zr2Var.mo12901e(euc.class, iac.f43875a);
        zr2Var.mo12901e(auc.class, lac.f49377a);
        zr2Var.mo12901e(psc.class, c8c.f9733a);
        zr2Var.mo12901e(bmc.class, k2c.f46603a);
        zr2Var.mo12901e(hsc.class, k8c.f46875a);
        zr2Var.mo12901e(esc.class, g8c.f40405a);
        zr2Var.mo12901e(lsc.class, p8c.f55797a);
        zr2Var.mo12901e(puc.class, fbc.f38824a);
        zr2Var.mo12901e(ywc.class, jec.f45494a);
        zr2Var.mo12901e(cgc.class, xwb.f68910a);
        zr2Var.mo12901e(sfc.class, pwb.f56932a);
        zr2Var.mo12901e(mfc.class, lwb.f50232a);
        zr2Var.mo12901e(bgc.class, twb.f63026a);
        zr2Var.mo12901e(ngc.class, exb.f38057a);
        zr2Var.mo12901e(igc.class, axb.f7654a);
        zr2Var.mo12901e(sgc.class, ixb.f44749a);
        zr2Var.mo12901e(tgc.class, mxb.f52012a);
        zr2Var.mo12901e(xgc.class, rxb.f60018a);
        zr2Var.mo12901e(chc.class, uxb.f64494a);
        zr2Var.mo12901e(ghc.class, yxb.f70623a);
        zr2Var.mo12901e(iqb.class, wub.f67323a);
        zr2Var.mo12901e(pqb.class, evb.f37959a);
        zr2Var.mo12901e(lqb.class, zub.f72210a);
        zr2Var.mo12901e(slc.class, d2c.f34880a);
        zr2Var.mo12901e(pic.class, czb.f34748a);
        zr2Var.mo12901e(umb.class, wqb.f67195a);
        zr2Var.mo12901e(smb.class, arb.f7408a);
        zr2Var.mo12901e(qjc.class, zzb.f72437a);
        zr2Var.mo12901e(anb.class, crb.f34435a);
        zr2Var.mo12901e(ymb.class, grb.f41251a);
        zr2Var.mo12901e(wnb.class, isb.f44515a);
        zr2Var.mo12901e(snb.class, lsb.f50088a);
        zr2Var.mo12901e(hnb.class, lrb.f50052a);
        zr2Var.mo12901e(enb.class, nrb.f53175a);
        zr2Var.mo12901e(epb.class, zsb.f72113a);
        zr2Var.mo12901e(apb.class, ctb.f34530a);
        zr2Var.mo12901e(npb.class, ntb.f53242a);
        zr2Var.mo12901e(kpb.class, wtb.f67288a);
        zr2Var.mo12901e(hqb.class, pub.f56839a);
        zr2Var.mo12901e(eqb.class, tub.f62917a);
        zr2Var.mo12901e(spb.class, bub.f9036a);
        zr2Var.mo12901e(rpb.class, fub.f39722a);
        zr2Var.mo12901e(zpb.class, iub.f44623a);
        zr2Var.mo12901e(xpb.class, nub.f53273a);
        zr2Var.mo12901e(dyc.class, xbc.f68047a);
        zr2Var.mo12901e(cxc.class, hzb.f43263a);
        zr2Var.mo12901e(qxc.class, l3c.f48999a);
        zr2Var.mo12901e(pxc.class, i3c.f43454a);
        zr2Var.mo12901e(gxc.class, w0c.f66192a);
        zr2Var.mo12901e(zxc.class, tbc.f62120a);
        zr2Var.mo12901e(vxc.class, obc.f54146a);
        zr2Var.mo12901e(hyc.class, ccc.f9897a);
        zr2Var.mo12901e(jxc.class, x1c.f67652a);
        zr2Var.mo12901e(vyc.class, rec.f59168a);
        zr2Var.mo12901e(syc.class, wec.f66743a);
        zr2Var.mo12901e(lyc.class, nec.f52660a);
        zr2Var.mo12901e(zuc.class, gcc.f40556a);
        zr2Var.mo12901e(plc.class, a2c.f137a);
        zr2Var.mo12901e(fmc.class, l2c.f48949a);
        zr2Var.mo12901e(ifc.class, svb.f61501a);
        zr2Var.mo12901e(skc.class, j1c.f44915a);
        zr2Var.mo12901e(xlc.class, e2c.f36631a);
        zr2Var.mo12901e(vjc.class, e0c.f36545a);
        zr2Var.mo12901e(cjc.class, ozb.f55340a);
        zr2Var.mo12901e(gjc.class, rzb.f60097a);
        zr2Var.mo12901e(zic.class, lzb.f50363a);
        zr2Var.mo12901e(mjc.class, vzb.f66147a);
        zr2Var.mo12901e(goc.class, f3c.f38372a);
        zr2Var.mo12901e(foc.class, d3c.f34976a);
        zr2Var.mo12901e(nmb.class, sqb.f61271a);
        zr2Var.mo12901e(lwc.class, kdc.f47076a);
        zr2Var.mo12901e(uwc.class, udc.f63802a);
        zr2Var.mo12901e(pwc.class, pdc.f55992a);
        zr2Var.mo12901e(dfc.class, ivb.f44688a);
        zr2Var.mo12901e(thc.class, kyb.f48780a);
        zr2Var.mo12901e(phc.class, gyb.f41536a);
        zr2Var.mo12901e(lhc.class, dyb.f36430a);
        zr2Var.mo12901e(zoc.class, i4c.f43528a);
        zr2Var.mo12901e(hpc.class, r4c.f58716a);
        zr2Var.mo12901e(gpc.class, n4c.f52350a);
        zr2Var.mo12901e(pnb.class, dsb.f36186a);
        zr2Var.mo12901e(knb.class, esb.f37782a);
        zr2Var.mo12901e(spc.class, l5c.f49102a);
        zr2Var.mo12901e(fqc.class, h6c.f41855a);
        zr2Var.mo12901e(xpc.class, r5c.f58782a);
        zr2Var.mo12901e(ypc.class, v5c.f64900a);
        zr2Var.mo12901e(nob.class, msb.f51815a);
        zr2Var.mo12901e(kob.class, qsb.f58169a);
        zr2Var.mo12901e(ivc.class, pcc.f55961a);
        zr2Var.mo12901e(evc.class, lcc.f49483a);
        zr2Var.mo12901e(ewc.class, ycc.f69638a);
        zr2Var.mo12901e(fwc.class, fdc.f38919a);
        zr2Var.mo12901e(hrc.class, q7c.f57366a);
        zr2Var.mo12901e(bsc.class, y7c.f69454a);
        zr2Var.mo12901e(mrc.class, r7c.f58866a);
        zr2Var.mo12901e(xrc.class, v7c.f64998a);
        zr2Var.mo12901e(ipb.class, ftb.f39634a);
        zr2Var.mo12901e(gpb.class, itb.f44562a);
        zr2Var.mo12901e(xkc.class, p1c.f55464a);
        zr2Var.mo12901e(fkc.class, b1c.f7774a);
        zr2Var.mo12901e(gqc.class, l6c.f49227a);
        zr2Var.mo12901e(mqc.class, t6c.f61922a);
        zr2Var.mo12901e(lqc.class, s6c.f60438a);
        zr2Var.mo12901e(wob.class, vsb.f65868a);
        zr2Var.mo12901e(sob.class, ysb.f70431a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:12:0x0016, B:10:0x0011, B:7:0x000d), top: B:22:0x0001, inners: #0 }] */
    /* JADX INFO: renamed from: o */
    public synchronized s24 m93o(Context context) {
        s24 s24VarM76m;
        s24VarM76m = null;
        if (!lp1.f49971a.contains(s24.class)) {
            try {
                s24VarM76m = s24.f60179m;
            } catch (Throwable th) {
                lp1.m16420a(s24.class, th);
            }
            if (s24VarM76m == null) {
                s24VarM76m = m76m(context);
            }
        } else if (s24VarM76m == null) {
            s24VarM76m = m76m(context);
        }
        throw th;
        return s24VarM76m;
    }
}
