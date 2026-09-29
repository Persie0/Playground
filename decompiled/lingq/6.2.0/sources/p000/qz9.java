package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class qz9 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f58430a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static yt2 m20221a() {
        ThreadLocal threadLocal = f58430a;
        yt2 yt2Var = (yt2) threadLocal.get();
        if (yt2Var != null) {
            return yt2Var;
        }
        vd0 vd0Var = new vd0(Thread.currentThread());
        threadLocal.set(vd0Var);
        return vd0Var;
    }
}
