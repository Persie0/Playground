package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.concurrent.futures.C0464b;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pyb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f57003a = new C0282a(568519789, false, new sd1(21));

    /* JADX INFO: renamed from: a */
    public static final web m19571a(iy5 iy5Var, String str, Executor executor, ui3 ui3Var) {
        xfa xfaVar = xfa.f68157a;
        iy5Var.getClass();
        executor.getClass();
        w56 w56Var = new w56(0);
        C0464b c0464b = new C0464b();
        c0464b.f5330c = new r78();
        gm0 gm0Var = new gm0(c0464b);
        c0464b.f5329b = gm0Var;
        c0464b.f5328a = hn1.class;
        try {
            executor.execute(new wq6(iy5Var, str, ui3Var, w56Var, c0464b));
            c0464b.f5328a = xfaVar;
        } catch (Exception e) {
            gm0Var.f40990b.mo20435l(e);
        }
        web webVar = new web();
        webVar.f66742a = gm0Var;
        return webVar;
    }
}
