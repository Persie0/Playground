package p000;

import com.lingq.core.common.util.AbstractC1263a;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.AbstractC3208a;

/* JADX INFO: loaded from: classes.dex */
public abstract class pn1 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f56492a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static void m19405a(g41 g41Var, String str) {
        cd4 cd4Var;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f56492a.get(AbstractC3208a.m15441h(g41Var.f40161a));
        if (concurrentHashMap == null || (cd4Var = (cd4) concurrentHashMap.remove(str)) == null) {
            return;
        }
        AbstractC1263a.m7046a(cd4Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m19406b(un1 un1Var, String str, pg9 pg9Var) {
        cd4 cd4VarM15441h = AbstractC3208a.m15441h(un1Var.mo1309x());
        ConcurrentHashMap concurrentHashMap = f56492a;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(cd4VarM15441h);
        if (concurrentHashMap2 == null) {
            ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
            ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) concurrentHashMap.putIfAbsent(cd4VarM15441h, concurrentHashMap3);
            if (concurrentHashMap4 == null) {
                concurrentHashMap4 = concurrentHashMap3;
            }
            if (concurrentHashMap4 == concurrentHashMap3) {
                cd4VarM15441h.mo4540r(new C0011a9(cd4VarM15441h, 6));
            }
            concurrentHashMap2 = concurrentHashMap4;
        }
        cd4 cd4Var = (cd4) concurrentHashMap2.put(str, pg9Var);
        if (cd4Var != null) {
            AbstractC1263a.m7046a(cd4Var);
        }
        pg9Var.mo4540r(new bb0(concurrentHashMap2, str, pg9Var, 4));
    }
}
