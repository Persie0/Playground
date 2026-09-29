package kotlinx.serialization.modules;

import java.util.HashMap;
import p000.wg8;
import p000.xl1;
import p000.z21;
import p000.zl1;

/* JADX INFO: renamed from: kotlinx.serialization.modules.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3268a {

    /* JADX INFO: renamed from: a */
    public final HashMap f48267a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f48268b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f48269c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f48270d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f48271e = new HashMap();

    /* JADX INFO: renamed from: a */
    public final void m15629a(z21 z21Var) {
        wg8 wg8Var = wg8.f66797a;
        xl1 xl1Var = new xl1();
        z21Var.getClass();
        HashMap map = this.f48267a;
        zl1 zl1Var = (zl1) map.get(z21Var);
        if (zl1Var != null && !zl1Var.equals(xl1Var)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + z21Var + " already registered in this module");
        }
        map.put(z21Var, xl1Var);
        Class cls = z21Var.f70781a;
        cls.getClass();
        cls.isInterface();
    }
}
