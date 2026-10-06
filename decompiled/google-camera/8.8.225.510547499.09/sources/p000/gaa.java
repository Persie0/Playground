package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gaa {
    /* JADX INFO: renamed from: a */
    public static ciw m8989a(Executor executor, Executor executor2, oju ojuVar, oju ojuVar2) {
        return dez.m6036f(new apv(executor, ojuVar2, ojuVar, executor2, 10), "poststartup");
    }

    /* JADX INFO: renamed from: b */
    public static final void m8990b(kpw kpwVar) {
        kpwVar.close();
    }

    /* JADX INFO: renamed from: c */
    public static ciw m8991c(jvb jvbVar, nps npsVar, grz grzVar) {
        return dez.m6036f(new epm(jvbVar, grzVar, npsVar, 17, (byte[]) null), "latch");
    }

    /* JADX INFO: renamed from: e */
    public static flp m8993e(fkp fkpVar, gtg gtgVar) {
        return new fln(fkpVar, gtgVar, null, null);
    }
}
