package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p000.be4;
import p000.vi3;

/* JADX INFO: renamed from: kotlinx.coroutines.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3210c extends be4 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47764i = AtomicIntegerFieldUpdater.newUpdater(C3210c.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: h */
    public final vi3 f47765h;

    public C3210c(vi3 vi3Var) {
        this.f47765h = vi3Var;
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: r */
    public final boolean mo3669r() {
        return true;
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: s */
    public final void mo3670s(Throwable th) {
        if (f47764i.compareAndSet(this, 0, 1)) {
            ((JobKt__JobKt$invokeOnCompletion$1) this.f47765h).invoke(th);
        }
    }
}
