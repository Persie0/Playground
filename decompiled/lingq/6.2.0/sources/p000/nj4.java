package p000;

import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nj4 {

    /* JADX INFO: renamed from: a */
    public static final p33 f52842a = p33.m18864S("k");

    /* JADX INFO: renamed from: a */
    public static ArrayList m17476a(AbstractC0875a abstractC0875a, gl5 gl5Var, float f, coa coaVar, boolean z) {
        AbstractC0875a abstractC0875a2;
        gl5 gl5Var2;
        float f2;
        coa coaVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (abstractC0875a.mo5047z() == JsonReader$Token.STRING) {
            gl5Var.m12727a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC0875a.mo5038b();
        while (abstractC0875a.mo5042p()) {
            if (abstractC0875a.mo5033J(f52842a) != 0) {
                abstractC0875a.mo5035R();
            } else if (abstractC0875a.mo5047z() == JsonReader$Token.BEGIN_ARRAY) {
                abstractC0875a.mo5037a();
                if (abstractC0875a.mo5047z() == JsonReader$Token.NUMBER) {
                    AbstractC0875a abstractC0875a3 = abstractC0875a;
                    gl5 gl5Var3 = gl5Var;
                    float f3 = f;
                    coa coaVar3 = coaVar;
                    boolean z3 = z;
                    kj4 kj4VarM16856b = mj4.m16856b(abstractC0875a3, gl5Var3, f3, coaVar3, false, z3);
                    abstractC0875a2 = abstractC0875a3;
                    gl5Var2 = gl5Var3;
                    f2 = f3;
                    coaVar2 = coaVar3;
                    z2 = z3;
                    arrayList.add(kj4VarM16856b);
                } else {
                    abstractC0875a2 = abstractC0875a;
                    gl5Var2 = gl5Var;
                    f2 = f;
                    coaVar2 = coaVar;
                    z2 = z;
                    while (abstractC0875a2.mo5042p()) {
                        arrayList.add(mj4.m16856b(abstractC0875a2, gl5Var2, f2, coaVar2, true, z2));
                    }
                }
                abstractC0875a2.mo5039c();
                abstractC0875a = abstractC0875a2;
                gl5Var = gl5Var2;
                f = f2;
                coaVar = coaVar2;
                z = z2;
            } else {
                AbstractC0875a abstractC0875a4 = abstractC0875a;
                arrayList.add(mj4.m16856b(abstractC0875a4, gl5Var, f, coaVar, false, z));
                abstractC0875a = abstractC0875a4;
            }
        }
        abstractC0875a.mo5040e();
        m17477b(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m17477b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            kj4 kj4Var = (kj4) arrayList.get(i2);
            i2++;
            kj4 kj4Var2 = (kj4) arrayList.get(i2);
            kj4Var.f47384h = Float.valueOf(kj4Var2.f47383g);
            if (kj4Var.f47379c == null && (obj = kj4Var2.f47378b) != null) {
                kj4Var.f47379c = obj;
                if (kj4Var instanceof i57) {
                    ((i57) kj4Var).m13667d();
                }
            }
        }
        kj4 kj4Var3 = (kj4) arrayList.get(i);
        if ((kj4Var3.f47378b == null || kj4Var3.f47379c == null) && arrayList.size() > 1) {
            arrayList.remove(kj4Var3);
        }
    }
}
