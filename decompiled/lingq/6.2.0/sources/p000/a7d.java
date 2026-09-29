package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a7d {
    /* JADX INFO: renamed from: a */
    public static l3d m167a(jx9 jx9Var) {
        j6d j6dVar = (j6d) g06.m12269c().m12271a(j6d.class);
        kx9 kx9Var = (kx9) j6dVar.f45126a.m21326o(jx9Var);
        zu2 zu2Var = j6dVar.f45127b;
        Executor executorMo14182c = jx9Var.mo14182c();
        if (executorMo14182c != null) {
            zu2Var.getClass();
        } else {
            executorMo14182c = (Executor) zu2Var.f72171a.get();
        }
        return new l3d(kx9Var, executorMo14182c, vkd.m23405b(jx9Var.mo14181b()), jx9Var);
    }
}
