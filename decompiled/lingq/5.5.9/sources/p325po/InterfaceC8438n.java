package p325po;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.selects.InterfaceC7190b;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: po.n */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8438n<E> {
    /* JADX INFO: renamed from: a */
    void mo14334a(CancellationException cancellationException);

    /* JADX INFO: renamed from: c */
    InterfaceC7190b<C8431g<E>> mo14335c();

    /* JADX INFO: renamed from: f */
    Object mo14336f();

    /* JADX INFO: renamed from: g */
    Object mo14337g(InterfaceC9968c<? super C8431g<? extends E>> interfaceC9968c);

    InterfaceC8430f<E> iterator();

    /* JADX INFO: renamed from: m */
    Object mo14338m(SuspendLambda suspendLambda);
}
