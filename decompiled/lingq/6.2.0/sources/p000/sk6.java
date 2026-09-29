package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class sk6 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f60954a;

    /* JADX INFO: renamed from: b */
    public final Executor f60955b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tk6 f60956c;

    public sk6(tk6 tk6Var, t52 t52Var, Executor executor) {
        this.f60956c = tk6Var;
        this.f60954a = new WeakReference(t52Var);
        this.f60955b = executor;
    }
}
