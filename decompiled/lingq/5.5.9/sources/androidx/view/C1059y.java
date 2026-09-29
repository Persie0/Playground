package androidx.view;

import dm.C5207g;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import no.AbstractC7821c1;
import no.C7832g0;
import p080e.RunnableC5286r;

/* JADX INFO: renamed from: androidx.lifecycle.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1059y extends CoroutineDispatcher {

    /* JADX INFO: renamed from: c */
    public final C1031f f6692c = new C1031f();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: B1 */
    public final boolean mo3964B1(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        C7178b c7178b = C7832g0.f42930a;
        if (C7162l.f40438a.mo14316C1().mo3964B1(coroutineContext)) {
            return true;
        }
        C1031f c1031f = this.f6692c;
        return !(c1031f.f6644b || !c1031f.f6643a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        C5207g.m11111f(coroutineContext, "context");
        C5207g.m11111f(runnable, "block");
        C1031f c1031f = this.f6692c;
        c1031f.getClass();
        C7178b c7178b = C7832g0.f42930a;
        AbstractC7821c1 abstractC7821c1Mo14316C1 = C7162l.f40438a.mo14316C1();
        if (!abstractC7821c1Mo14316C1.mo3964B1(coroutineContext)) {
            if (!(c1031f.f6644b || !c1031f.f6643a)) {
                if (!((Queue) c1031f.f6646d).offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables".toString());
                }
                c1031f.m3935a();
                return;
            }
        }
        abstractC7821c1Mo14316C1.mo2307z1(coroutineContext, new RunnableC5286r(c1031f, 3, runnable));
    }
}
