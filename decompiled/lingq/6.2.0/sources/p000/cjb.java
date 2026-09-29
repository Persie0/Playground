package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cjb {

    /* JADX INFO: renamed from: c */
    public static final cjb f10181c = new cjb();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f10183b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final qn3 f10182a = new qn3(3);

    /* JADX INFO: renamed from: a */
    public final fjb m4784a(Class cls) {
        fjb fjbVarM25157j;
        ConcurrentHashMap concurrentHashMap = this.f10183b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (fjb) obj;
        }
        qn3 qn3Var = this.f10182a;
        qn3Var.getClass();
        iy5 iy5Var = gjb.f40885a;
        if (!whb.class.isAssignableFrom(cls)) {
            int i = dhb.f35664a;
        }
        ejb ejbVarMo12440c = ((nr9) qn3Var.f57974a).mo12440c(cls);
        if ((ejbVarMo12440c.f37370d & 2) == 2) {
            int i2 = dhb.f35664a;
            iy5 iy5Var2 = gjb.f40885a;
            u06 u06Var = qhb.f57797a;
            fjbVarM25157j = yib.m25157j(iy5Var2, ejbVarMo12440c.f37367a);
        } else {
            int i3 = dhb.f35664a;
            int i4 = zib.f71625a;
            int i5 = oib.f54385a;
            iy5 iy5Var3 = gjb.f40885a;
            u06 u06Var2 = ejbVarMo12440c.m11198a() + (-1) != 1 ? qhb.f57797a : null;
            int i6 = rib.f59378a;
            fjbVarM25157j = xib.m24533y(ejbVarMo12440c, iy5Var3, u06Var2);
        }
        fjb fjbVar = (fjb) concurrentHashMap.putIfAbsent(cls, fjbVarM25157j);
        return fjbVar != null ? fjbVar : fjbVarM25157j;
    }
}
