package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.inputmethod.ExtractedText;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import kotlin.NotImplementedError;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class lda {

    /* JADX INFO: renamed from: d */
    public static final fs6 f49511d;

    /* JADX INFO: renamed from: e */
    public static final fs6 f49512e;

    /* JADX INFO: renamed from: f */
    public static final fs6 f49513f;

    /* JADX INFO: renamed from: g */
    public static final fs6 f49514g;

    /* JADX INFO: renamed from: h */
    public static final fs6 f49515h;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f49517j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f49518k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f49519l = 0;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f49520m = 0;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f49521n = 0;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f49522o = 0;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f49523p = 0;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f49524q = 0;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f49525r = 0;

    /* JADX INFO: renamed from: a */
    public static final C0282a f49508a = new C0282a(1303147774, false, new C2914d4(8));

    /* JADX INFO: renamed from: b */
    public static final C0282a f49509b = new C0282a(131892250, false, new C2914d4(9));

    /* JADX INFO: renamed from: c */
    public static final jj5 f49510c = new jj5(13);

    /* JADX INFO: renamed from: i */
    public static final tr3 f49516i = new tr3(16);

    static {
        int i = 19;
        f49511d = new fs6(i, new cx7(3), new qv7(15));
        f49512e = new fs6(i, new cx7(4), new qv7(16));
        f49513f = new fs6(i, new cx7(5), new qv7(17));
        f49514g = new fs6(i, new cx7(6), new qv7(18));
        f49515h = new fs6(i, new cx7(7), new qv7(19));
    }

    /* JADX INFO: renamed from: A */
    public static void m16101A(sq5 sq5Var) {
        si4 si4Var;
        gv5 gv5VarM19598a = q16.m19598a();
        gv5VarM19598a.m12883M((o16) sq5Var.f61250d);
        Iterator it = ((ConcurrentMap) sq5Var.f61248b).values().iterator();
        while (it.hasNext()) {
            for (hk7 hk7Var : (List) it.next()) {
                int i = r16.f58486a[hk7Var.f42537d.ordinal()];
                if (i == 1) {
                    si4Var = si4.f60894c;
                } else if (i == 2) {
                    si4Var = si4.f60895d;
                } else {
                    if (i != 3) {
                        C3386nv.m17633t("Unknown key status");
                        return;
                    }
                    si4Var = si4.f60896e;
                }
                int i2 = hk7Var.f42539f;
                String strSubstring = hk7Var.f42540g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                gv5VarM19598a.m12904l(si4Var, i2, strSubstring, hk7Var.f42538e.name());
            }
        }
        hk7 hk7Var2 = (hk7) sq5Var.f61249c;
        if (hk7Var2 != null) {
            gv5VarM19598a.m12895Y(hk7Var2.f42539f);
        }
        try {
            gv5VarM19598a.m12913u();
        } catch (GeneralSecurityException e) {
            uk9.m22779n(e);
        }
    }

    /* JADX INFO: renamed from: B */
    public static final au8 m16102B(Object obj) {
        if (obj != AbstractC3184kh.f47264f) {
            return (au8) obj;
        }
        C3386nv.m17633t("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static final g41 m16103C(wta wtaVar) {
        g41 g41Var;
        wtaVar.getClass();
        synchronized (f49516i) {
            g41Var = (g41) wtaVar.m24156T2("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (g41Var == null) {
                kn1 kn1Var = EmptyCoroutineContext.f47685a;
                try {
                    v72 v72Var = ph2.f56212a;
                    kn1Var = dp5.f36000a.f68538f;
                } catch (IllegalStateException | NotImplementedError unused) {
                }
                g41 g41Var2 = new g41(kn1Var.plus(r46.m20384i()));
                wtaVar.m24154R2("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", g41Var2);
                g41Var = g41Var2;
            }
        }
        return g41Var;
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m16104D(Object obj) {
        return obj == AbstractC3184kh.f47264f;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m16105E(int i, Object obj) {
        int arity;
        if (obj instanceof xi3) {
            if (obj instanceof ij3) {
                arity = ((ij3) obj).getArity();
            } else if (obj instanceof ui3) {
                arity = 0;
            } else if (obj instanceof vi3) {
                arity = 1;
            } else if (obj instanceof zi3) {
                arity = 2;
            } else if (obj instanceof aj3) {
                arity = 3;
            } else if (obj instanceof bj3) {
                arity = 4;
            } else if (obj instanceof cj3) {
                arity = 5;
            } else if (obj instanceof dj3) {
                arity = 6;
            } else if (obj instanceof ej3) {
                arity = 7;
            } else if (obj instanceof fj3) {
                arity = 8;
            } else {
                boolean z = obj instanceof fd1;
                if (z) {
                    arity = 9;
                } else if (z) {
                    arity = 10;
                } else if (z) {
                    arity = 11;
                } else if (z) {
                    arity = 13;
                } else if (z) {
                    arity = 14;
                } else if (z) {
                    arity = 15;
                } else if (z) {
                    arity = 16;
                } else if (z) {
                    arity = 17;
                } else if (z) {
                    arity = 18;
                } else if (z) {
                    arity = 19;
                } else if (z) {
                    arity = 20;
                } else {
                    arity = z ? 21 : -1;
                }
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static jc9 m16106F(jc9 jc9Var) {
        if (jc9Var instanceof bba) {
            bba bbaVar = (bba) jc9Var;
            if (bbaVar.f8301t == r46.m20393t()) {
                bbaVar.f8299r = null;
                return jc9Var;
            }
        }
        if (jc9Var instanceof cba) {
            cba cbaVar = (cba) jc9Var;
            if (cbaVar.f9857i == r46.m20393t()) {
                cbaVar.f9856h = null;
                return jc9Var;
            }
        }
        jc9 jc9VarM17355g = nc9.m17355g(jc9Var, null, false);
        jc9VarM17355g.m14393j();
        return jc9VarM17355g;
    }

    /* JADX INFO: renamed from: G */
    public static Object m16107G(ec2 ec2Var, ui3 ui3Var) {
        jc9 bbaVar;
        jc9 jc9Var = (jc9) nc9.f52601b.m21566g();
        if (jc9Var instanceof bba) {
            bba bbaVar2 = (bba) jc9Var;
            if (bbaVar2.f8301t == r46.m20393t()) {
                vi3 vi3Var = bbaVar2.f8299r;
                vi3 vi3Var2 = bbaVar2.f8300s;
                try {
                    ((bba) jc9Var).f8299r = nc9.m17359k(ec2Var, vi3Var, true);
                    ((bba) jc9Var).f8300s = vi3Var2;
                    return ui3Var.mo0a();
                } finally {
                    bbaVar2.f8299r = vi3Var;
                    bbaVar2.f8300s = vi3Var2;
                }
            }
        }
        if (jc9Var == null || (jc9Var instanceof s66)) {
            bbaVar = new bba(jc9Var instanceof s66 ? (s66) jc9Var : null, ec2Var, null, true, false);
        } else {
            bbaVar = jc9Var.mo3170u(ec2Var);
        }
        try {
            jc9 jc9VarM14393j = bbaVar.m14393j();
            try {
                Object objMo0a = ui3Var.mo0a();
                jc9.m14390q(jc9VarM14393j);
                bbaVar.mo3162c();
                return objMo0a;
            } catch (Throwable th) {
                jc9.m14390q(jc9VarM14393j);
                throw th;
            }
        } catch (Throwable th2) {
            bbaVar.mo3162c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: H */
    public static final e16 m16108H(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new m93(vi3Var));
    }

    /* JADX INFO: renamed from: I */
    public static final hp5 m16109I(pk9 pk9Var, vi3 vi3Var, ye1 ye1Var) {
        Object c3450p7;
        pk9 pk9Var2;
        AbstractC0278f.m1263m(pk9Var, ye1Var);
        t66 t66VarM1263m = AbstractC0278f.m1263m(vi3Var, ye1Var);
        Object[] objArr = new Object[0];
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = new C3288l7(1);
            tj3Var.m22131l0(objM22097O);
        }
        String str = (String) xwc.m24745R(objArr, (ui3) objM22097O, tj3Var, 48);
        InterfaceC3564s7 interfaceC3564s7 = (InterfaceC3564s7) tj3Var.m22128k(qh5.f57783a);
        if (interfaceC3564s7 == null) {
            tj3Var.m22111b0(1213380307);
            Object baseContext = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC3564s7) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC3564s7 = (InterfaceC3564s7) baseContext;
        } else {
            tj3Var.m22111b0(1213379439);
        }
        tj3Var.m22139q(false);
        if (interfaceC3564s7 == null) {
            C3386nv.m17633t("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        sc1 sc1VarMo13203p = interfaceC3564s7.mo13203p();
        Object objM22097O2 = tj3Var.m22097O();
        if (objM22097O2 == p84Var) {
            objM22097O2 = new C3137j7();
            tj3Var.m22131l0(objM22097O2);
        }
        C3137j7 c3137j7 = (C3137j7) objM22097O2;
        Object objM22097O3 = tj3Var.m22097O();
        if (objM22097O3 == p84Var) {
            objM22097O3 = new hp5(c3137j7);
            tj3Var.m22131l0(objM22097O3);
        }
        hp5 hp5Var = (hp5) objM22097O3;
        boolean zM22124i = tj3Var.m22124i(c3137j7) | tj3Var.m22124i(sc1VarMo13203p) | tj3Var.m22120g(str) | tj3Var.m22124i(pk9Var) | tj3Var.m22120g(t66VarM1263m);
        Object objM22097O4 = tj3Var.m22097O();
        if (zM22124i || objM22097O4 == p84Var) {
            pk9Var2 = pk9Var;
            c3450p7 = new C3450p7(c3137j7, sc1VarMo13203p, str, pk9Var2, t66VarM1263m, 0);
            tj3Var.m22131l0(c3450p7);
        } else {
            c3450p7 = objM22097O4;
            pk9Var2 = pk9Var;
        }
        vi3 vi3Var2 = (vi3) c3450p7;
        boolean zM22120g = tj3Var.m22120g(sc1VarMo13203p) | tj3Var.m22120g(str) | tj3Var.m22120g(pk9Var2);
        Object objM22097O5 = tj3Var.m22097O();
        if (zM22120g || objM22097O5 == p84Var) {
            objM22097O5 = new yh2(vi3Var2);
            tj3Var.m22131l0(objM22097O5);
        }
        return hp5Var;
    }

    /* JADX INFO: renamed from: J */
    public static void m16110J(jc9 jc9Var, jc9 jc9Var2, vi3 vi3Var) {
        if (jc9Var != jc9Var2) {
            jc9Var2.getClass();
            jc9.m14390q(jc9Var);
            jc9Var2.mo3162c();
        } else if (jc9Var instanceof bba) {
            ((bba) jc9Var).f8299r = vi3Var;
        } else if (jc9Var instanceof cba) {
            ((cba) jc9Var).f9856h = vi3Var;
        } else {
            C3386nv.m17632s(jc9Var, "Non-transparent snapshot was reused: ");
        }
    }

    /* JADX INFO: renamed from: K */
    public static final long m16111K(e28 e28Var) {
        float f = e28Var.f36622c - e28Var.f36620a;
        return (((long) Float.floatToRawIntBits(e28Var.f36623d - e28Var.f36621b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: L */
    public static String m16112L(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: M */
    public static void m16113M(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC3393o1.m17735j(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        fa4.m11634H(classCastException, lda.class.getName());
        throw classCastException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [d08, sf] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: N */
    public static final ArrayList m16114N(bb9 bb9Var, int i, Integer num) {
        ?? d08Var = new d08(bb9Var);
        i = bb9Var.m3573q(i);
        oj3 oj3VarM3557a = bb9Var.m3557a(i);
        while (i >= 0) {
            d08Var.m21330v(bb9Var.m3565i(i), bb9Var.m3567k(i) ? bb9Var.m3572p(bb9Var.f8283b, i) : we1.f66679a, bb9Var.f8282a.m4494j(i), num);
            if (i >= 0) {
                oj3 oj3Var = oj3VarM3557a;
                oj3VarM3557a = bb9Var.m3557a(i);
                i = bb9Var.m3573q(i);
                num = oj3Var;
            } else {
                num = oj3VarM3557a;
            }
        }
        return (ArrayList) d08Var.f60774a;
    }

    /* JADX INFO: renamed from: a */
    public static final void m16115a(ui3 ui3Var, e16 e16Var, lu4 lu4Var, bu4 bu4Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1055276397);
        int i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i | (tj3Var.m22120g(e16Var) ? 32 : 16) | (tj3Var.m22120g(lu4Var) ? 256 : 128) | (tj3Var.m22120g(bu4Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            pvc.m19509e(ci8.m4703P(-933153643, new zt4(lu4Var, e16Var, bu4Var, AbstractC0278f.m1263m(ui3Var, tj3Var), 0), tj3Var), tj3Var, 6);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new au4(ui3Var, e16Var, lu4Var, bu4Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ExtractedText m16116b(vv9 vv9Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = vv9Var.f65990a.f54604b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = vv9Var.f65991b;
        extractedText.selectionStart = cx9.m9924f(j);
        extractedText.selectionEnd = cx9.m9923e(j);
        extractedText.flags = !vk9.m23381d0(vv9Var.f65990a.f54604b, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: c */
    public static void m16117c(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = vc4.f65182a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = y87.f69480a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Map m16118d(Object obj) {
        if ((obj instanceof tg4) && !(obj instanceof xg4)) {
            m16113M(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            fa4.m11634H(e, lda.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16119e(int i, Object obj) {
        if (obj == null || m16105E(i, obj)) {
            return;
        }
        m16113M(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static final Boolean m16120f(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: g */
    public static final Integer m16121g(int i) {
        return new Integer(i);
    }

    /* JADX INFO: renamed from: h */
    public static final void m16122h(long j) {
        new Long(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [d08, sf] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [oj3] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: i */
    public static final List m16123i(fb9 fb9Var, Integer num, int i, Integer num2) {
        int iM11710E;
        int iM11744s;
        h66 h66Var;
        if (fb9Var.f38822w || fb9Var.m11741p() == 0) {
            return EmptyList.f47638a;
        }
        ?? d08Var = new d08(fb9Var);
        if (num2 != null) {
            iM11710E = num2.intValue();
        } else {
            iM11710E = fb9Var.f38821v;
            if (iM11710E < 0) {
                iM11710E = fb9Var.m11710E(fb9Var.f38801b, i);
            }
        }
        if (num == 0) {
            int iM11719N = fb9Var.f38808i - fb9Var.m11719N(fb9Var.f38801b, fb9Var.m11743r(i));
            t56 t56Var = fb9Var.f38818s;
            num = Integer.valueOf(iM11719N + ((t56Var == null || (h66Var = (h66) t56Var.m10152b(i)) == null) ? 0 : h66Var.f1294b));
        }
        int iM11743r = fb9Var.m11743r(i) * 5;
        int[] iArr = fb9Var.f38801b;
        if (iM11743r < iArr.length) {
            iM11744s = fb9Var.m11744s(i);
        } else {
            int iM11710E2 = iM11710E >= 0 ? fb9Var.m11710E(iArr, iM11710E) : iM11710E;
            iM11744s = fb9Var.m11744s(iM11710E);
            int i2 = iM11710E;
            iM11710E = iM11710E2;
            i = i2;
        }
        while (i >= 0) {
            d08Var.m21330v(iM11744s, (fb9Var.f38801b[(fb9Var.m11743r(i) * 5) + 1] & 536870912) != 0 ? fb9Var.m11745t(i) : we1.f66679a, fb9Var.m11720O(i), num);
            num = fb9Var.m11728b(i);
            if (iM11710E >= 0) {
                int iM11710E3 = fb9Var.m11710E(fb9Var.f38801b, iM11710E);
                iM11744s = fb9Var.m11744s(iM11710E);
                int i3 = iM11710E;
                iM11710E = iM11710E3;
                i = i3;
            } else {
                i = iM11710E;
            }
        }
        return (ArrayList) d08Var.f60774a;
    }

    /* JADX INFO: renamed from: j */
    public static void m16124j(String str, boolean z) {
        if (z) {
            return;
        }
        C3386nv.m17626m(str);
    }

    /* JADX INFO: renamed from: k */
    public static void m16125k(boolean z) {
        if (z) {
            return;
        }
        ij6.m13959q();
    }

    /* JADX INFO: renamed from: l */
    public static void m16126l(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            AbstractC3393o1.m17725C(sb, "Must be called on ", name2, " thread, but got ", name);
            v63.m23138p(sb, ".");
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m16127m(String str) {
        if (TextUtils.isEmpty(str)) {
            C3386nv.m17626m("Given String is empty or null");
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m16128n(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C3386nv.m17626m(str2);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m16129o(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        C3386nv.m17633t(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m16130p(Object obj) {
        if (obj != null) {
            return;
        }
        C3386nv.m17635v("null reference");
    }

    /* JADX INFO: renamed from: q */
    public static void m16131q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C3386nv.m17635v(str);
    }

    /* JADX INFO: renamed from: r */
    public static void m16132r(String str, boolean z) {
        if (z) {
            return;
        }
        C3386nv.m17633t(str);
    }

    /* JADX INFO: renamed from: s */
    public static void m16133s(boolean z) {
        if (z) {
            return;
        }
        uk9.m22770c();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b1  */
    /* JADX INFO: renamed from: t */
    public static final void m16134t(InterfaceC0310a interfaceC0310a, C0312a c0312a) {
        float f;
        float f2;
        u8a u8aVarM11125e;
        float f3;
        float f4;
        Matrix matrix;
        ym0 ym0VarM16515r = interfaceC0310a.mo603o0().m16515r();
        C0312a c0312a2 = (C0312a) interfaceC0310a.mo603o0().f50065c;
        sp3 sp3Var = c0312a.f3977a;
        sp3 sp3Var2 = c0312a.f3977a;
        RenderNode renderNode = sp3Var.f61157c;
        if (c0312a.f3995s) {
            return;
        }
        long j = c0312a.f3984h;
        Canvas canvasM19936a = AbstractC3497qg.m19936a(ym0VarM16515r);
        boolean zIsHardwareAccelerated = canvasM19936a.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = c0312a.f3996t;
            float f5 = (int) (j2 >> 32);
            float f6 = f5 - c0312a.f3998v;
            float f7 = (int) (j2 & 4294967295L);
            float f8 = f7 - c0312a.f3999w;
            long j3 = c0312a.f3997u;
            float f9 = f5 + ((int) (j3 >> 32)) + c0312a.f4000x;
            float f10 = f7 + ((int) (j3 & 4294967295L)) + c0312a.f4001y;
            float f11 = sp3Var2.f61162h;
            fa1 fa1Var = sp3Var.f61164j;
            int i = sp3Var.f61163i;
            if (f11 >= 1.0f) {
                f = f10;
                if (i == 3 && fa1Var == null) {
                    f2 = f8;
                    if (sp3Var.f61154G != 1) {
                        canvasM19936a.save();
                        canvasM19936a = canvasM19936a;
                        f3 = f6;
                        f4 = f2;
                    }
                    canvasM19936a.translate(f3, f4);
                    matrix = sp3Var.f61160f;
                    if (matrix == null) {
                        matrix = new Matrix();
                        sp3Var.f61160f = matrix;
                    }
                    renderNode.getMatrix(matrix);
                    matrix.preTranslate(c0312a.f3998v, c0312a.f3999w);
                    canvasM19936a.concat(matrix);
                    c0312a.f3984h = gq6.m12824e(c0312a.f3984h, (((long) Float.floatToRawIntBits(c0312a.f3999w)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0312a.f3998v)) << 32));
                }
                u8aVarM11125e = c0312a.f3992p;
                if (u8aVarM11125e == null) {
                    u8aVarM11125e = eh0.m11125e();
                    c0312a.f3992p = u8aVarM11125e;
                }
                u8aVarM11125e.m22553n(f11);
                u8aVarM11125e.m22554o(i);
                u8aVarM11125e.m22556q(fa1Var);
                Paint paint = (Paint) u8aVarM11125e.f63594c;
                canvasM19936a = canvasM19936a;
                f3 = f6;
                f4 = f2;
                canvasM19936a.saveLayer(f3, f4, f9, f, paint);
                canvasM19936a.translate(f3, f4);
                matrix = sp3Var.f61160f;
                if (matrix == null) {
                    matrix = new Matrix();
                    sp3Var.f61160f = matrix;
                }
                renderNode.getMatrix(matrix);
                matrix.preTranslate(c0312a.f3998v, c0312a.f3999w);
                canvasM19936a.concat(matrix);
                c0312a.f3984h = gq6.m12824e(c0312a.f3984h, (((long) Float.floatToRawIntBits(c0312a.f3999w)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0312a.f3998v)) << 32));
            } else {
                f = f10;
            }
            f2 = f8;
            u8aVarM11125e = c0312a.f3992p;
            if (u8aVarM11125e == null) {
                u8aVarM11125e = eh0.m11125e();
                c0312a.f3992p = u8aVarM11125e;
            }
            u8aVarM11125e.m22553n(f11);
            u8aVarM11125e.m22554o(i);
            u8aVarM11125e.m22556q(fa1Var);
            Paint paint2 = (Paint) u8aVarM11125e.f63594c;
            canvasM19936a = canvasM19936a;
            f3 = f6;
            f4 = f2;
            canvasM19936a.saveLayer(f3, f4, f9, f, paint2);
            canvasM19936a.translate(f3, f4);
            matrix = sp3Var.f61160f;
            if (matrix == null) {
                matrix = new Matrix();
                sp3Var.f61160f = matrix;
            }
            renderNode.getMatrix(matrix);
            matrix.preTranslate(c0312a.f3998v, c0312a.f3999w);
            canvasM19936a.concat(matrix);
            c0312a.f3984h = gq6.m12824e(c0312a.f3984h, (((long) Float.floatToRawIntBits(c0312a.f3999w)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0312a.f3998v)) << 32));
        }
        c0312a.m1424a();
        if (!renderNode.hasDisplayList()) {
            try {
                c0312a.m1429f();
            } catch (Throwable unused) {
            }
        }
        boolean z = false;
        boolean z2 = sp3Var2.f61170p > 0.0f;
        if (z2) {
            ym0VarM16515r.mo17027t();
        }
        boolean z3 = !zIsHardwareAccelerated && c0312a.f3975A;
        if (z3) {
            ym0VarM16515r.mo17016h();
            pk9 pk9VarM1427d = c0312a.m1427d();
            if (pk9VarM1427d instanceof b07) {
                ym0.m25196q(ym0VarM16515r, ((b07) pk9VarM1427d).f7728A);
            } else if (pk9VarM1427d instanceof c07) {
                C3500qj c3500qjM22757a = c0312a.f3989m;
                if (c3500qjM22757a != null) {
                    c3500qjM22757a.m19992i();
                } else {
                    c3500qjM22757a = AbstractC3650uj.m22757a();
                    c0312a.f3989m = c3500qjM22757a;
                }
                C3500qj.m19986c(c3500qjM22757a, ((c07) pk9VarM1427d).f9272A);
                ym0VarM16515r.mo17020l(c3500qjM22757a);
            } else {
                if (!(pk9VarM1427d instanceof a07)) {
                    gm5.m12750e();
                    return;
                }
                ym0VarM16515r.mo17020l(((a07) pk9VarM1427d).f34A);
            }
        }
        if (c0312a2 != null) {
            pc0 pc0Var = c0312a2.f3994r;
            if (!pc0Var.f55937a) {
                h54.m13056a("Only add dependencies during a tracking");
            }
            o66 o66Var = (o66) pc0Var.f55940d;
            if (o66Var != null) {
                o66Var.m17811d(c0312a);
            } else if (((C0312a) pc0Var.f55938b) != null) {
                o66 o66Var2 = pm8.f56484a;
                o66 o66Var3 = new o66();
                C0312a c0312a3 = (C0312a) pc0Var.f55938b;
                c0312a3.getClass();
                o66Var3.m17811d(c0312a3);
                o66Var3.m17811d(c0312a);
                pc0Var.f55940d = o66Var3;
                pc0Var.f55938b = null;
            } else {
                pc0Var.f55938b = c0312a;
            }
            o66 o66Var4 = (o66) pc0Var.f55941e;
            if (o66Var4 != null) {
                z = !o66Var4.m17819l(c0312a);
            } else if (((C0312a) pc0Var.f55939c) != c0312a) {
                z = true;
            } else {
                pc0Var.f55939c = null;
            }
            if (z) {
                c0312a.f3993q++;
            }
        }
        C3459pg c3459pg = (C3459pg) ym0VarM16515r;
        if (c3459pg.f56079a.isHardwareAccelerated()) {
            c3459pg.f56079a.drawRenderNode(renderNode);
        } else {
            an0 an0Var = c0312a.f3991o;
            if (an0Var == null) {
                an0Var = new an0();
                c0312a.f3991o = an0Var;
            }
            C3309ls c3309ls = an0Var.f853b;
            fb2 fb2Var = c0312a.f3978b;
            LayoutDirection layoutDirection = c0312a.f3979c;
            long jM18152h0 = omd.m18152h0(c0312a.f3997u);
            fb2 fb2VarM16517t = c3309ls.m16517t();
            LayoutDirection layoutDirectionM16519w = c3309ls.m16519w();
            ym0 ym0VarM16515r2 = c3309ls.m16515r();
            long jM16483A = c3309ls.m16483A();
            C0312a c0312a4 = (C0312a) c3309ls.f50065c;
            c3309ls.m16499S(fb2Var);
            c3309ls.m16500T(layoutDirection);
            c3309ls.m16497Q(ym0VarM16515r);
            c3309ls.m16501U(jM18152h0);
            c3309ls.f50065c = c0312a;
            ym0VarM16515r.mo17016h();
            try {
                c0312a.m1426c(an0Var);
                ym0VarM16515r.mo17024p();
                c3309ls.m16499S(fb2VarM16517t);
                c3309ls.m16500T(layoutDirectionM16519w);
                c3309ls.m16497Q(ym0VarM16515r2);
                c3309ls.m16501U(jM16483A);
                c3309ls.f50065c = c0312a4;
            } catch (Throwable th) {
                ym0VarM16515r.mo17024p();
                c3309ls.m16499S(fb2VarM16517t);
                c3309ls.m16500T(layoutDirectionM16519w);
                c3309ls.m16497Q(ym0VarM16515r2);
                c3309ls.m16501U(jM16483A);
                c3309ls.f50065c = c0312a4;
                throw th;
            }
        }
        if (z3) {
            ym0VarM16515r.mo17024p();
        }
        if (z2) {
            ym0VarM16515r.mo17017i();
        }
        if (!zIsHardwareAccelerated) {
            canvasM19936a.restore();
        }
        c0312a.f3984h = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m16135u(C0358h c0358h, pk9 pk9Var, vi0 vi0Var, float f, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        boolean z = pk9Var instanceof b07;
        w33 w33Var = w33.f66328a;
        if (z) {
            e28 e28Var = ((b07) pk9Var).f7728A;
            float f3 = e28Var.f36620a;
            c0358h.mo592K0(vi0Var, (((long) Float.floatToRawIntBits(e28Var.f36621b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), m16111K(e28Var), f2, w33Var, null, 3);
            return;
        }
        if (!(pk9Var instanceof c07)) {
            if (pk9Var instanceof a07) {
                c0358h.mo606y(((a07) pk9Var).f34A, vi0Var, f2, w33Var, null, 3);
                return;
            } else {
                gm5.m12750e();
                return;
            }
        }
        c07 c07Var = (c07) pk9Var;
        C3500qj c3500qj = c07Var.f9273B;
        if (c3500qj != null) {
            c0358h.mo606y(c3500qj, vi0Var, f2, w33Var, null, 3);
            return;
        }
        mi8 mi8Var = c07Var.f9272A;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mi8Var.f51367h >> 32));
        float f4 = mi8Var.f51360a;
        c0358h.mo591C0(vi0Var, (((long) Float.floatToRawIntBits(mi8Var.f51361b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), (((long) Float.floatToRawIntBits(mi8Var.m16846b())) << 32) | (((long) Float.floatToRawIntBits(mi8Var.m16845a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f2, w33Var, null, 3);
    }

    /* JADX INFO: renamed from: v */
    public static void m16136v(C0358h c0358h, pk9 pk9Var, long j) {
        boolean z = pk9Var instanceof b07;
        w33 w33Var = w33.f66328a;
        if (z) {
            e28 e28Var = ((b07) pk9Var).f7728A;
            float f = e28Var.f36620a;
            c0358h.mo607z(j, (((long) Float.floatToRawIntBits(e28Var.f36621b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), m16111K(e28Var), 1.0f, w33Var, 3);
            return;
        }
        if (!(pk9Var instanceof c07)) {
            if (pk9Var instanceof a07) {
                c0358h.mo599k(((a07) pk9Var).f34A, j, 1.0f, w33Var);
                return;
            } else {
                gm5.m12750e();
                return;
            }
        }
        c07 c07Var = (c07) pk9Var;
        C3500qj c3500qj = c07Var.f9273B;
        if (c3500qj != null) {
            c0358h.mo599k(c3500qj, j, 1.0f, w33Var);
            return;
        }
        mi8 mi8Var = c07Var.f9272A;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mi8Var.f51367h >> 32));
        float f2 = mi8Var.f51360a;
        c0358h.mo598h0(j, (((long) Float.floatToRawIntBits(mi8Var.f51361b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(mi8Var.m16846b())) << 32) | (((long) Float.floatToRawIntBits(mi8Var.m16845a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), w33Var, 3);
    }

    /* JADX INFO: renamed from: w */
    public static final Integer m16137w(bb9 bb9Var, kf1 kf1Var, int i, int i2) {
        Integer numM16137w;
        int[] iArr = bb9Var.f8283b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (bb9Var.m3566j(i) && bb9Var.m3565i(i) == 206 && fa4.m11650l(bb9Var.m3572p(iArr, i), cf1.f9997e)) {
                Object objM3564h = bb9Var.m3564h(i, 0);
                xj3 xj3Var = objM3564h instanceof xj3 ? (xj3) objM3564h : null;
                x48 x48Var = xj3Var != null ? xj3Var.f68286a : null;
                rj3 rj3Var = x48Var instanceof rj3 ? (rj3) x48Var : null;
                if (rj3Var != null && rj3Var.f59403a == kf1Var) {
                    return Integer.valueOf(i);
                }
            }
            if (bb9Var.m3560d(i) && (numM16137w = m16137w(bb9Var, kf1Var, i + 1, i3)) != null) {
                return Integer.valueOf(numM16137w.intValue());
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: x */
    public static ApiException m16138x(Status status) {
        return status.f11664c != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    /* JADX INFO: renamed from: y */
    public static jc9 m16139y() {
        return (jc9) nc9.f52601b.m21566g();
    }

    /* JADX INFO: renamed from: z */
    public static i86 m16140z(cua cuaVar) {
        C3601t7 c3601t7 = j86.f45194a;
        or1 or1Var = or1.f54780b;
        c3601t7.getClass();
        or1Var.getClass();
        ny8 ny8Var = new ny8(cuaVar, c3601t7, or1Var);
        z21 z21VarM24933a = y38.m24933a(i86.class);
        String strM25413b = z21VarM24933a.m25413b();
        if (strM25413b != null) {
            return (i86) ny8Var.m17675B(z21VarM24933a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b));
        }
        C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
