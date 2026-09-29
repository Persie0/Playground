package p000;

import com.airbnb.lottie.parser.moshi.C0877c;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import java.util.ArrayList;

/* JADX INFO: renamed from: zl */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3837zl {

    /* JADX INFO: renamed from: a */
    public static final p33 f71692a = p33.m18864S("k", "x", "y");

    /* JADX INFO: renamed from: a */
    public static C3800yl m25688a(C0877c c0877c, gl5 gl5Var) {
        ArrayList arrayList = new ArrayList();
        if (c0877c.mo5047z() == JsonReader$Token.BEGIN_ARRAY) {
            c0877c.mo5037a();
            while (c0877c.mo5042p()) {
                C0877c c0877c2 = c0877c;
                gl5 gl5Var2 = gl5Var;
                arrayList.add(new i57(gl5Var2, mj4.m16856b(c0877c2, gl5Var2, fna.m11957c(), bw8.f9101c, c0877c.mo5047z() == JsonReader$Token.BEGIN_OBJECT, false)));
                c0877c = c0877c2;
                gl5Var = gl5Var2;
            }
            c0877c.mo5039c();
            nj4.m17477b(arrayList);
        } else {
            arrayList.add(new kj4(og4.m17978b(c0877c, fna.m11957c())));
        }
        return new C3800yl(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2969em m25689b(C0877c c0877c, gl5 gl5Var) {
        c0877c.mo5038b();
        C3800yl c3800ylM25688a = null;
        C3763xl c3763xlM23071c = null;
        boolean z = false;
        C3763xl c3763xlM23071c2 = null;
        while (c0877c.mo5047z() != JsonReader$Token.END_OBJECT) {
            int iMo5033J = c0877c.mo5033J(f71692a);
            if (iMo5033J == 0) {
                c3800ylM25688a = m25688a(c0877c, gl5Var);
            } else if (iMo5033J != 1) {
                if (iMo5033J != 2) {
                    c0877c.mo5034N();
                    c0877c.mo5035R();
                } else if (c0877c.mo5047z() == JsonReader$Token.STRING) {
                    c0877c.mo5035R();
                    z = true;
                } else {
                    c3763xlM23071c = v2d.m23071c(c0877c, gl5Var, true);
                }
            } else if (c0877c.mo5047z() == JsonReader$Token.STRING) {
                c0877c.mo5035R();
                z = true;
            } else {
                c3763xlM23071c2 = v2d.m23071c(c0877c, gl5Var, true);
            }
        }
        c0877c.mo5040e();
        if (z) {
            gl5Var.m12727a("Lottie doesn't support expressions.");
        }
        return c3800ylM25688a != null ? c3800ylM25688a : new C0024am(c3763xlM23071c2, c3763xlM23071c);
    }
}
