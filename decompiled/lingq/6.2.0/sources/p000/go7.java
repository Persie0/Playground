package p000;

import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.AbstractC1188i;
import com.google.protobuf.AbstractC1189j;
import com.google.protobuf.C1186g;
import com.google.protobuf.C1187h;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class go7 {

    /* JADX INFO: renamed from: c */
    public static final go7 f41083c = new go7();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f41085b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final qn3 f41084a = new qn3(2);

    /* JADX INFO: renamed from: a */
    public final xm8 m12783a(Class cls) {
        xm8 xm8VarM6824m;
        Class cls2;
        Charset charset = p94.f55800a;
        if (cls == null) {
            C3386nv.m17635v("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f41085b;
        xm8 xm8Var = (xm8) concurrentHashMap.get(cls);
        if (xm8Var != null) {
            return xm8Var;
        }
        qn3 qn3Var = this.f41084a;
        qn3Var.getClass();
        Class cls3 = AbstractC1188i.f13953a;
        if (!AbstractC1183d.class.isAssignableFrom(cls) && (cls2 = AbstractC1188i.f13953a) != null && !cls2.isAssignableFrom(cls)) {
            C3386nv.m17626m("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        er7 er7VarMessageInfoFor = ((mp5) qn3Var.f57974a).messageInfoFor(cls);
        if ((er7VarMessageInfoFor.f37757d & 2) == 2) {
            if (AbstractC1183d.class.isAssignableFrom(cls)) {
                xm8VarM6824m = C1187h.m6846e(AbstractC1188i.f13955c, wx2.f67468a, er7VarMessageInfoFor.f37754a);
            } else {
                AbstractC1189j abstractC1189j = AbstractC1188i.f13954b;
                tx2 tx2Var = wx2.f67469b;
                if (tx2Var == null) {
                    C3386nv.m17633t("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                xm8VarM6824m = C1187h.m6846e(abstractC1189j, tx2Var, er7VarMessageInfoFor.f37754a);
            }
        } else if (AbstractC1183d.class.isAssignableFrom(cls)) {
            xm8VarM6824m = jp5.f45961a[er7VarMessageInfoFor.m11323a().ordinal()] != 1 ? C1186g.m6824m(er7VarMessageInfoFor, bl6.f8662b, ze5.f71458b, AbstractC1188i.f13955c, wx2.f67468a, aq5.f7360b) : C1186g.m6824m(er7VarMessageInfoFor, bl6.f8662b, ze5.f71458b, AbstractC1188i.f13955c, null, aq5.f7360b);
        } else if (jp5.f45961a[er7VarMessageInfoFor.m11323a().ordinal()] != 1) {
            yk6 yk6Var = bl6.f8661a;
            ve5 ve5Var = ze5.f71457a;
            AbstractC1189j abstractC1189j2 = AbstractC1188i.f13954b;
            tx2 tx2Var2 = wx2.f67469b;
            if (tx2Var2 == null) {
                C3386nv.m17633t("Protobuf runtime is not correctly loaded.");
                return null;
            }
            xm8VarM6824m = C1186g.m6824m(er7VarMessageInfoFor, yk6Var, ve5Var, abstractC1189j2, tx2Var2, aq5.f7359a);
        } else {
            xm8VarM6824m = C1186g.m6824m(er7VarMessageInfoFor, bl6.f8661a, ze5.f71457a, AbstractC1188i.f13954b, null, aq5.f7359a);
        }
        xm8 xm8Var2 = (xm8) concurrentHashMap.putIfAbsent(cls, xm8VarM6824m);
        return xm8Var2 != null ? xm8Var2 : xm8VarM6824m;
    }
}
