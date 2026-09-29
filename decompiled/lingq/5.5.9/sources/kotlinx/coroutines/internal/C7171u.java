package kotlinx.coroutines.internal;

import dm.C5207g;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C7171u implements CoroutineContext.InterfaceC6758b<C7170t<?>> {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal<?> f40447a;

    public C7171u(ThreadLocal<?> threadLocal) {
        this.f40447a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7171u) && C5207g.m11106a(this.f40447a, ((C7171u) obj).f40447a);
    }

    public final int hashCode() {
        return this.f40447a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f40447a + ')';
    }
}
