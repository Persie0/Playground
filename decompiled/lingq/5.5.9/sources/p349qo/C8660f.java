package p349qo;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.internal.C7166p;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: qo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8660f<T> extends C7166p<T> {
    public C8660f(InterfaceC9968c interfaceC9968c, CoroutineContext coroutineContext) {
        super(interfaceC9968c, coroutineContext);
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: x */
    public final boolean mo15606x(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return m15644p(th2);
    }
}
