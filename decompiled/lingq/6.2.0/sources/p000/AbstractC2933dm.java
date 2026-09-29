package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.parser.moshi.C0877c;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import java.util.List;

/* JADX INFO: renamed from: dm */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2933dm {

    /* JADX INFO: renamed from: a */
    public static final p33 f35804a = p33.m18864S("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* JADX INFO: renamed from: b */
    public static final p33 f35805b = p33.m18864S("k");

    /* JADX INFO: renamed from: a */
    public static void m10456a(C3763xl c3763xl, gl5 gl5Var) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) c3763xl.f57375b;
        if (list.isEmpty()) {
            list.add(new kj4(gl5Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(gl5Var.f40969m)));
        } else if (((kj4) list.get(0)).f47378b == null) {
            list.set(0, new kj4(gl5Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(gl5Var.f40969m)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10457b(C3763xl c3763xl) {
        if (c3763xl != null) {
            return c3763xl.mo552d() && ((Float) ((kj4) ((List) c3763xl.f57375b).get(0)).f47378b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0122  */
    /* JADX INFO: renamed from: c */
    public static C0852cm m10458c(C0877c c0877c, gl5 gl5Var) {
        C3726wl c3726wl;
        boolean z = c0877c.mo5047z() == JsonReader$Token.BEGIN_OBJECT;
        if (z) {
            c0877c.mo5038b();
        }
        C3800yl c3800ylM25688a = null;
        InterfaceC2969em interfaceC2969emM25689b = null;
        C3763xl c3763xlM23071c = null;
        C3726wl c3726wl2 = null;
        C3763xl c3763xlM23071c2 = null;
        C3763xl c3763xlM23071c3 = null;
        C3763xl c3763xlM23071c4 = null;
        C3763xl c3763xlM23071c5 = null;
        C3763xl c3763xlM23071c6 = null;
        C3726wl c3726wlM23073e = null;
        C3763xl c3763xlM23071c7 = null;
        C3763xl c3763xlM23071c8 = null;
        while (c0877c.mo5042p()) {
            switch (c0877c.mo5033J(f35804a)) {
                case 0:
                    c0877c.mo5038b();
                    while (c0877c.mo5042p()) {
                        if (c0877c.mo5033J(f35805b) != 0) {
                            c0877c.mo5034N();
                            c0877c.mo5035R();
                        } else {
                            c3800ylM25688a = AbstractC3837zl.m25688a(c0877c, gl5Var);
                        }
                    }
                    c0877c.mo5040e();
                    break;
                case 1:
                    interfaceC2969emM25689b = AbstractC3837zl.m25689b(c0877c, gl5Var);
                    break;
                case 2:
                    c3726wl2 = new C3726wl(4, nj4.m17476a(c0877c, gl5Var, 1.0f, to2.f62632b, false));
                    break;
                case 3:
                    c3763xlM23071c6 = v2d.m23071c(c0877c, gl5Var, false);
                    m10456a(c3763xlM23071c6, gl5Var);
                    break;
                case 4:
                    c3763xlM23071c = v2d.m23071c(c0877c, gl5Var, false);
                    m10456a(c3763xlM23071c, gl5Var);
                    break;
                case 5:
                    c3726wlM23073e = v2d.m23073e(c0877c, gl5Var);
                    break;
                case 6:
                    c3763xlM23071c7 = v2d.m23071c(c0877c, gl5Var, false);
                    break;
                case 7:
                    c3763xlM23071c8 = v2d.m23071c(c0877c, gl5Var, false);
                    break;
                case 8:
                    c3763xlM23071c2 = v2d.m23071c(c0877c, gl5Var, false);
                    break;
                case 9:
                    c3763xlM23071c3 = v2d.m23071c(c0877c, gl5Var, false);
                    break;
                case 10:
                    c3763xlM23071c4 = v2d.m23071c(c0877c, gl5Var, false);
                    m10456a(c3763xlM23071c4, gl5Var);
                    break;
                case 11:
                    c3763xlM23071c5 = v2d.m23071c(c0877c, gl5Var, false);
                    m10456a(c3763xlM23071c5, gl5Var);
                    break;
                default:
                    c0877c.mo5034N();
                    c0877c.mo5035R();
                    break;
            }
        }
        if (z) {
            c0877c.mo5040e();
        }
        if (c3800ylM25688a == null || (c3800ylM25688a.mo552d() && ((PointF) ((kj4) c3800ylM25688a.f69968a.get(0)).f47378b).equals(0.0f, 0.0f))) {
            c3800ylM25688a = null;
        }
        InterfaceC2969em interfaceC2969em = (interfaceC2969emM25689b == null || (!(interfaceC2969emM25689b instanceof C0024am) && interfaceC2969emM25689b.mo552d() && ((PointF) ((kj4) interfaceC2969emM25689b.mo551c().get(0)).f47378b).equals(0.0f, 0.0f))) ? null : interfaceC2969emM25689b;
        C3763xl c3763xl = m10457b(c3763xlM23071c) ? null : c3763xlM23071c;
        if (c3726wl2 == null) {
            c3726wl = null;
        } else {
            if (c3726wl2.mo552d()) {
                nm8 nm8Var = (nm8) ((kj4) ((List) c3726wl2.f57375b).get(0)).f47378b;
                if (nm8Var.f52968a == 1.0f && nm8Var.f52969b == 1.0f) {
                    c3726wl = null;
                }
            }
            c3726wl = c3726wl2;
        }
        return new C0852cm(c3800ylM25688a, interfaceC2969em, c3726wl, c3763xl, c3726wlM23073e, c3763xlM23071c7, c3763xlM23071c8, (c3763xlM23071c2 == null || (c3763xlM23071c2.mo552d() && ((Float) ((kj4) ((List) c3763xlM23071c2.f57375b).get(0)).f47378b).floatValue() == 0.0f)) ? null : c3763xlM23071c2, (c3763xlM23071c3 == null || (c3763xlM23071c3.mo552d() && ((Float) ((kj4) ((List) c3763xlM23071c3.f57375b).get(0)).f47378b).floatValue() == 0.0f)) ? null : c3763xlM23071c3, m10457b(c3763xlM23071c4) ? null : c3763xlM23071c4, m10457b(c3763xlM23071c5) ? null : c3763xlM23071c5, m10457b(c3763xlM23071c6) ? null : c3763xlM23071c6);
    }
}
