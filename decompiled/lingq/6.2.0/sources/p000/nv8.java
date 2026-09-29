package p000;

import androidx.compose.p002ui.semantics.C0427g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public abstract class nv8 {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f53301a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static final void m17641a(y64 y64Var, kv8 kv8Var) {
        z91 z91Var = y64Var.f69367c;
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(kv8Var, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
        Iterator it = kv8Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((C0427g) entry.getKey()).f5023a, entry.getValue());
        }
        z91Var.m25511b(linkedHashMap, "properties");
    }

    /* JADX INFO: renamed from: b */
    public static final e16 m17642b(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new g31(vi3Var));
    }

    /* JADX INFO: renamed from: c */
    public static final e16 m17643c(e16 e16Var, boolean z, vi3 vi3Var) {
        return e16Var.mo3161g(new C3087ht(vi3Var, z));
    }
}
