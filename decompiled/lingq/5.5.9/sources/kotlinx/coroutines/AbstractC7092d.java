package kotlinx.coroutines;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7092d extends CoroutineDispatcher implements Closeable {
    static {
        ExecutorCoroutineDispatcher$Key$1 executorCoroutineDispatcher$Key$1 = new InterfaceC2052l<CoroutineContext.InterfaceC6757a, AbstractC7092d>() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC7092d mo528n(CoroutineContext.InterfaceC6757a interfaceC6757a) {
                CoroutineContext.InterfaceC6757a interfaceC6757a2 = interfaceC6757a;
                if (interfaceC6757a2 instanceof AbstractC7092d) {
                    return (AbstractC7092d) interfaceC6757a2;
                }
                return null;
            }
        };
        C5207g.m11111f(CoroutineDispatcher.f39989b, "baseKey");
        C5207g.m11111f(executorCoroutineDispatcher$Key$1, "safeCast");
    }
}
