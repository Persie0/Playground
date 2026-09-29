package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.AbstractC0679m;
import androidx.glance.appwidget.protobuf.AbstractC0680n;
import androidx.glance.appwidget.protobuf.C0677k;
import androidx.glance.appwidget.protobuf.C0678l;
import androidx.glance.appwidget.protobuf.C0682p;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ho7 {

    /* JADX INFO: renamed from: c */
    public static final ho7 f42713c = new ho7();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f42715b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final vj6 f42714a = new vj6();

    /* JADX INFO: renamed from: a */
    public final ym8 m13412a(Class cls) {
        ux2 ux2Var;
        ym8 ym8VarM2397v;
        Class cls2;
        q94.m19807a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f42715b;
        ym8 ym8Var = (ym8) concurrentHashMap.get(cls);
        if (ym8Var != null) {
            return ym8Var;
        }
        vj6 vj6Var = this.f42714a;
        vj6Var.getClass();
        Class cls3 = AbstractC0679m.f6097a;
        if (!AbstractC0675i.class.isAssignableFrom(cls) && (cls2 = AbstractC0679m.f6097a) != null && !cls2.isAssignableFrom(cls)) {
            C3386nv.m17626m("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        fr7 fr7VarMessageInfoFor = ((np5) vj6Var.f65506b).messageInfoFor(cls);
        if ((fr7VarMessageInfoFor.f39532d & 2) == 2) {
            if (AbstractC0675i.class.isAssignableFrom(cls)) {
                ym8VarM2397v = new C0678l(AbstractC0679m.f6099c, xx2.f68923a, fr7VarMessageInfoFor.f39529a);
            } else {
                AbstractC0680n abstractC0680n = AbstractC0679m.f6098b;
                ux2 ux2Var2 = xx2.f68924b;
                if (ux2Var2 == null) {
                    C3386nv.m17633t("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                ym8VarM2397v = new C0678l(abstractC0680n, ux2Var2, fr7VarMessageInfoFor.f39529a);
            }
        } else if (AbstractC0675i.class.isAssignableFrom(cls)) {
            zk6 zk6Var = cl6.f10230b;
            bf5 bf5Var = cf5.f10002b;
            C0682p c0682p = AbstractC0679m.f6099c;
            ux2 ux2Var3 = kp5.f48283a[fr7VarMessageInfoFor.m12030a().ordinal()] != 1 ? xx2.f68923a : null;
            yp5 yp5Var = bq5.f8869b;
            if (!(fr7VarMessageInfoFor instanceof fr7)) {
                int[] iArr = C0677k.f6079n;
                ho2.m13383c();
                return null;
            }
            ym8VarM2397v = C0677k.m2397v(fr7VarMessageInfoFor, zk6Var, bf5Var, c0682p, ux2Var3, yp5Var);
        } else {
            zk6 zk6Var2 = cl6.f10229a;
            bf5 bf5Var2 = cf5.f10001a;
            AbstractC0680n abstractC0680n2 = AbstractC0679m.f6098b;
            if (kp5.f48283a[fr7VarMessageInfoFor.m12030a().ordinal()] != 1) {
                ux2 ux2Var4 = xx2.f68924b;
                if (ux2Var4 == null) {
                    C3386nv.m17633t("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                ux2Var = ux2Var4;
            } else {
                ux2Var = null;
            }
            yp5 yp5Var2 = bq5.f8868a;
            if (!(fr7VarMessageInfoFor instanceof fr7)) {
                int[] iArr2 = C0677k.f6079n;
                ho2.m13383c();
                return null;
            }
            ym8VarM2397v = C0677k.m2397v(fr7VarMessageInfoFor, zk6Var2, bf5Var2, abstractC0680n2, ux2Var, yp5Var2);
        }
        ym8 ym8Var2 = (ym8) concurrentHashMap.putIfAbsent(cls, ym8VarM2397v);
        return ym8Var2 != null ? ym8Var2 : ym8VarM2397v;
    }
}
