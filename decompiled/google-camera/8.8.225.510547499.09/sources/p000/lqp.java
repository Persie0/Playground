package p000;

import java.io.File;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqp {

    /* JADX INFO: renamed from: a */
    public static final lpw f38996a = lpw.m15847b();

    /* JADX INFO: renamed from: b */
    private static final ltu f38997b = new ltu(lqg.f38956b);

    /* JADX INFO: renamed from: c */
    private static final Object f38998c = new Object();

    /* JADX INFO: renamed from: d */
    private static volatile ljf f38999d = null;

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static boolean m15886a(File file) {
        if (file.isDirectory()) {
            boolean z = true;
            for (File file2 : file.listFiles()) {
                z = z && m15886a(file2);
            }
            if (z) {
                if (file.delete()) {
                    return true;
                }
            }
        } else if (file.delete()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ltp m15887b(lpj lpjVar) {
        lti ltiVarM15971a = ltj.m15971a();
        lsd lsdVarM15942a = lse.m15942a(lpjVar.f38894c);
        lsdVarM15942a.m15940b("phenotype");
        lsdVarM15942a.m15941c("all_accounts.pb");
        ltiVarM15971a.m15970e(lsdVarM15942a.m15939a());
        ltiVarM15971a.m15969d(lqg.f38956b);
        ltiVarM15971a.m15968c(f38997b);
        ltiVarM15971a.m15967b();
        ltj ltjVarM15966a = ltiVarM15971a.m15966a();
        ljf ljfVar = f38999d;
        if (ljfVar == null) {
            synchronized (f38998c) {
                ljfVar = f38999d;
                if (ljfVar == null) {
                    ltv ltvVar = ltv.f39201a;
                    HashMap map = new HashMap();
                    npv npvVarM15826b = lpjVar.m15826b();
                    C1058va c1058vaM15829f = lpjVar.m15829f();
                    lkm.m15579f(ltm.f39177a, map);
                    ljf ljfVarM15572M = lkm.m15572M(npvVarM15826b, c1058vaM15829f, map, ltvVar);
                    f38999d = ljfVarM15572M;
                    ljfVar = ljfVarM15572M;
                }
            }
        }
        return ljfVar.m15525a(ltjVarM15966a);
    }
}
