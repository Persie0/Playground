package no;

import cm.InterfaceC2052l;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: no.j */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7840j<T> extends InterfaceC9968c<T> {
    /* JADX INFO: renamed from: A */
    void mo15576A(CoroutineDispatcher coroutineDispatcher, C9072e c9072e);

    /* JADX INFO: renamed from: R */
    void mo15577R(InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l);

    /* JADX INFO: renamed from: X */
    C7168r mo15578X(Throwable th2);

    /* JADX INFO: renamed from: b */
    boolean mo15579b();

    /* JADX INFO: renamed from: e0 */
    C7168r mo15580e0(Object obj, LockFreeLinkedListNode.AbstractC7146a abstractC7146a, InterfaceC2052l interfaceC2052l);

    /* JADX INFO: renamed from: q */
    C7168r mo15581q(Object obj, Object obj2);

    /* JADX INFO: renamed from: t */
    void mo15582t();

    /* JADX INFO: renamed from: t0 */
    boolean mo15583t0(Throwable th2);
}
