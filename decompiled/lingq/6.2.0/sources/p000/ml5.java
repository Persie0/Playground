package p000;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.parser.moshi.C0877c;
import com.airbnb.lottie.parser.moshi.JsonEncodingException;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ml5 {

    /* JADX INFO: renamed from: a */
    public static final p33 f51470a = p33.m18864S("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b */
    public static final p33 f51471b = p33.m18864S("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c */
    public static final p33 f51472c = p33.m18864S("list");

    /* JADX INFO: renamed from: d */
    public static final p33 f51473d = p33.m18864S("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    public static gl5 m16917a(C0877c c0877c) throws JsonEncodingException, EOFException {
        gl5 gl5Var;
        int i;
        float f;
        gl5 gl5Var2;
        float f2;
        float f3;
        float fM11957c = fna.m11957c();
        tk5 tk5Var = new tk5((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        pe9 pe9Var = new pe9(0);
        gl5 gl5Var3 = new gl5();
        c0877c.mo5038b();
        int iMo5044r = 0;
        int iMo5044r2 = 0;
        float fMo5044r = 0.0f;
        float fMo5044r2 = 0.0f;
        float fMo5044r3 = 0.0f;
        while (c0877c.mo5042p()) {
            switch (c0877c.mo5033J(f51470a)) {
                case 0:
                    iMo5044r = (int) c0877c.mo5044r();
                    gl5Var3 = gl5Var3;
                    break;
                case 1:
                    iMo5044r2 = (int) c0877c.mo5044r();
                    gl5Var3 = gl5Var3;
                    break;
                case 2:
                    fMo5044r2 = (float) c0877c.mo5044r();
                    gl5Var3 = gl5Var3;
                    break;
                case 3:
                    fMo5044r = ((float) c0877c.mo5044r()) - 0.01f;
                    gl5Var3 = gl5Var3;
                    fM11957c = fM11957c;
                    break;
                case 4:
                    fMo5044r3 = (float) c0877c.mo5044r();
                    gl5Var3 = gl5Var3;
                    fM11957c = fM11957c;
                    break;
                case 5:
                    fM11957c = fM11957c;
                    gl5Var = gl5Var3;
                    i = iMo5044r2;
                    f = fMo5044r2;
                    String[] strArrSplit = c0877c.mo5046x().split("\\.");
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    int i3 = Integer.parseInt(strArrSplit[1]);
                    int i4 = Integer.parseInt(strArrSplit[2]);
                    if (i2 < 4 || (i2 <= 4 && (i3 < 4 || (i3 <= 4 && i4 < 0)))) {
                        gl5Var.m12727a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    gl5Var3 = gl5Var;
                    iMo5044r2 = i;
                    fMo5044r2 = f;
                    fM11957c = fM11957c;
                    break;
                case 6:
                    fM11957c = fM11957c;
                    gl5 gl5Var4 = gl5Var3;
                    i = iMo5044r2;
                    f = fMo5044r2;
                    c0877c.mo5037a();
                    int i5 = 0;
                    while (c0877c.mo5042p()) {
                        gl5 gl5Var5 = gl5Var4;
                        tp4 tp4VarM24097a = wp4.m24097a(c0877c, gl5Var5);
                        if (tp4VarM24097a.f62675e == Layer$LayerType.IMAGE) {
                            i5++;
                        }
                        arrayList.add(tp4VarM24097a);
                        tk5Var.m22180f(tp4VarM24097a, tp4VarM24097a.f62674d);
                        if (i5 > 4) {
                            tj5.m22151c("You have " + i5 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        gl5Var4 = gl5Var5;
                    }
                    gl5Var = gl5Var4;
                    c0877c.mo5039c();
                    gl5Var3 = gl5Var;
                    iMo5044r2 = i;
                    fMo5044r2 = f;
                    fM11957c = fM11957c;
                    break;
                case 7:
                    fM11957c = fM11957c;
                    i = iMo5044r2;
                    f = fMo5044r2;
                    c0877c.mo5037a();
                    while (c0877c.mo5042p()) {
                        ArrayList arrayList3 = new ArrayList();
                        tk5 tk5Var2 = new tk5((Object) null);
                        c0877c.mo5038b();
                        String strMo5046x = null;
                        String strMo5046x2 = null;
                        String strMo5046x3 = null;
                        int iMo5045u = 0;
                        int iMo5045u2 = 0;
                        while (c0877c.mo5042p()) {
                            int iMo5033J = c0877c.mo5033J(f51471b);
                            if (iMo5033J != 0) {
                                if (iMo5033J == 1) {
                                    c0877c.mo5037a();
                                    while (c0877c.mo5042p()) {
                                        tp4 tp4VarM24097a2 = wp4.m24097a(c0877c, gl5Var3);
                                        tk5Var2.m22180f(tp4VarM24097a2, tp4VarM24097a2.f62674d);
                                        arrayList3.add(tp4VarM24097a2);
                                        gl5Var3 = gl5Var3;
                                    }
                                    gl5Var2 = gl5Var3;
                                    c0877c.mo5039c();
                                } else if (iMo5033J == 2) {
                                    iMo5045u = c0877c.mo5045u();
                                } else if (iMo5033J == 3) {
                                    iMo5045u2 = c0877c.mo5045u();
                                } else if (iMo5033J == 4) {
                                    strMo5046x2 = c0877c.mo5046x();
                                } else if (iMo5033J != 5) {
                                    c0877c.mo5034N();
                                    c0877c.mo5035R();
                                    gl5Var2 = gl5Var3;
                                } else {
                                    strMo5046x3 = c0877c.mo5046x();
                                }
                                gl5Var3 = gl5Var2;
                            } else {
                                strMo5046x = c0877c.mo5046x();
                            }
                        }
                        gl5 gl5Var6 = gl5Var3;
                        c0877c.mo5040e();
                        if (strMo5046x2 != null) {
                            map2.put(strMo5046x, new wl5(iMo5045u, iMo5045u2, strMo5046x, strMo5046x2, strMo5046x3));
                        } else {
                            map.put(strMo5046x, arrayList3);
                        }
                        gl5Var3 = gl5Var6;
                    }
                    c0877c.mo5039c();
                    gl5Var = gl5Var3;
                    gl5Var3 = gl5Var;
                    iMo5044r2 = i;
                    fMo5044r2 = f;
                    fM11957c = fM11957c;
                    break;
                case 8:
                    fM11957c = fM11957c;
                    i = iMo5044r2;
                    float f4 = fMo5044r2;
                    c0877c.mo5038b();
                    while (c0877c.mo5042p()) {
                        if (c0877c.mo5033J(f51472c) != 0) {
                            c0877c.mo5034N();
                            c0877c.mo5035R();
                        } else {
                            c0877c.mo5037a();
                            while (c0877c.mo5042p()) {
                                p33 p33Var = eb3.f36970a;
                                c0877c.mo5038b();
                                String strMo5046x4 = null;
                                String strMo5046x5 = null;
                                String strMo5046x6 = null;
                                while (c0877c.mo5042p()) {
                                    int iMo5033J2 = c0877c.mo5033J(eb3.f36970a);
                                    if (iMo5033J2 != 0) {
                                        float f5 = f4;
                                        if (iMo5033J2 == 1) {
                                            strMo5046x5 = c0877c.mo5046x();
                                        } else if (iMo5033J2 == 2) {
                                            strMo5046x6 = c0877c.mo5046x();
                                        } else if (iMo5033J2 != 3) {
                                            c0877c.mo5034N();
                                            c0877c.mo5035R();
                                        } else {
                                            c0877c.mo5044r();
                                        }
                                        f4 = f5;
                                    } else {
                                        strMo5046x4 = c0877c.mo5046x();
                                    }
                                }
                                c0877c.mo5040e();
                                map3.put(strMo5046x5, new qa3(strMo5046x4, strMo5046x5, strMo5046x6));
                                f4 = f4;
                            }
                            c0877c.mo5039c();
                        }
                    }
                    f = f4;
                    c0877c.mo5040e();
                    gl5Var = gl5Var3;
                    gl5Var3 = gl5Var;
                    iMo5044r2 = i;
                    fMo5044r2 = f;
                    fM11957c = fM11957c;
                    break;
                case 9:
                    fM11957c = fM11957c;
                    i = iMo5044r2;
                    f2 = fMo5044r2;
                    c0877c.mo5037a();
                    while (c0877c.mo5042p()) {
                        p33 p33Var2 = ta3.f62048a;
                        ArrayList arrayList4 = new ArrayList();
                        c0877c.mo5038b();
                        double dMo5044r = 0.0d;
                        char cCharAt = 0;
                        String strMo5046x7 = null;
                        String strMo5046x8 = null;
                        while (c0877c.mo5042p()) {
                            int iMo5033J3 = c0877c.mo5033J(ta3.f62048a);
                            if (iMo5033J3 == 0) {
                                cCharAt = c0877c.mo5046x().charAt(0);
                            } else if (iMo5033J3 == 1) {
                                c0877c.mo5044r();
                            } else if (iMo5033J3 == 2) {
                                dMo5044r = c0877c.mo5044r();
                            } else if (iMo5033J3 == 3) {
                                strMo5046x7 = c0877c.mo5046x();
                            } else if (iMo5033J3 == 4) {
                                strMo5046x8 = c0877c.mo5046x();
                            } else if (iMo5033J3 != 5) {
                                c0877c.mo5034N();
                                c0877c.mo5035R();
                            } else {
                                c0877c.mo5038b();
                                while (c0877c.mo5042p()) {
                                    if (c0877c.mo5033J(ta3.f62049b) != 0) {
                                        c0877c.mo5034N();
                                        c0877c.mo5035R();
                                    } else {
                                        c0877c.mo5037a();
                                        while (c0877c.mo5042p()) {
                                            arrayList4.add((z39) dl1.m10449a(c0877c, gl5Var3));
                                        }
                                        c0877c.mo5039c();
                                    }
                                }
                                c0877c.mo5040e();
                            }
                        }
                        c0877c.mo5040e();
                        sa3 sa3Var = new sa3(arrayList4, cCharAt, dMo5044r, strMo5046x7, strMo5046x8);
                        pe9Var.m19080d(sa3Var.hashCode(), sa3Var);
                    }
                    c0877c.mo5039c();
                    f = f2;
                    gl5Var = gl5Var3;
                    gl5Var3 = gl5Var;
                    iMo5044r2 = i;
                    fMo5044r2 = f;
                    fM11957c = fM11957c;
                    break;
                case 10:
                    c0877c.mo5037a();
                    while (c0877c.mo5042p()) {
                        c0877c.mo5038b();
                        String strMo5046x9 = null;
                        float fMo5044r4 = 0.0f;
                        float fMo5044r5 = 0.0f;
                        while (c0877c.mo5042p()) {
                            int iMo5033J4 = c0877c.mo5033J(f51473d);
                            if (iMo5033J4 != 0) {
                                f3 = fM11957c;
                                if (iMo5033J4 == 1) {
                                    fMo5044r2 = fMo5044r2;
                                    fMo5044r4 = (float) c0877c.mo5044r();
                                } else if (iMo5033J4 != 2) {
                                    c0877c.mo5034N();
                                    c0877c.mo5035R();
                                } else {
                                    fMo5044r2 = fMo5044r2;
                                    fMo5044r5 = (float) c0877c.mo5044r();
                                }
                                iMo5044r2 = iMo5044r2;
                            } else {
                                f3 = fM11957c;
                                strMo5046x9 = c0877c.mo5046x();
                            }
                            fM11957c = f3;
                        }
                        c0877c.mo5040e();
                        arrayList2.add(new gq5(strMo5046x9, fMo5044r4, fMo5044r5));
                        fMo5044r2 = fMo5044r2;
                        iMo5044r2 = iMo5044r2;
                        fM11957c = fM11957c;
                    }
                    fM11957c = fM11957c;
                    i = iMo5044r2;
                    f2 = fMo5044r2;
                    c0877c.mo5039c();
                    f = f2;
                    gl5Var = gl5Var3;
                    gl5Var3 = gl5Var;
                    iMo5044r2 = i;
                    fMo5044r2 = f;
                    fM11957c = fM11957c;
                    break;
                default:
                    c0877c.mo5034N();
                    c0877c.mo5035R();
                    fM11957c = fM11957c;
                    gl5Var = gl5Var3;
                    i = iMo5044r2;
                    f = fMo5044r2;
                    gl5Var3 = gl5Var;
                    iMo5044r2 = i;
                    fMo5044r2 = f;
                    fM11957c = fM11957c;
                    break;
            }
        }
        float f6 = fM11957c;
        gl5 gl5Var7 = gl5Var3;
        Rect rect = new Rect(0, 0, (int) (iMo5044r * f6), (int) (iMo5044r2 * f6));
        float fM11957c2 = fna.m11957c();
        gl5Var7.f40967k = rect;
        gl5Var7.f40968l = fMo5044r2;
        gl5Var7.f40969m = fMo5044r;
        gl5Var7.f40970n = fMo5044r3;
        gl5Var7.f40966j = arrayList;
        gl5Var7.f40965i = tk5Var;
        gl5Var7.f40959c = map;
        gl5Var7.f40960d = map2;
        gl5Var7.f40961e = fM11957c2;
        gl5Var7.f40964h = pe9Var;
        gl5Var7.f40962f = map3;
        gl5Var7.f40963g = arrayList2;
        return gl5Var7;
    }
}
