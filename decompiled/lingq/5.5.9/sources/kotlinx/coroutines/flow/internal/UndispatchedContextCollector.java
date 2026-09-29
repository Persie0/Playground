package kotlinx.coroutines.flow.internal;

import cm.InterfaceC2056p;
import dm.C5206f;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.internal.ThreadContextKt;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class UndispatchedContextCollector<T> implements InterfaceC7117d<T> {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f40350a;

    /* JADX INFO: renamed from: b */
    public final Object f40351b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2056p<T, InterfaceC9968c<? super C9072e>, Object> f40352c;

    public UndispatchedContextCollector(InterfaceC7117d<? super T> interfaceC7117d, CoroutineContext coroutineContext) {
        this.f40350a = coroutineContext;
        this.f40351b = ThreadContextKt.m14434b(coroutineContext);
        this.f40352c = new UndispatchedContextCollector$emitRef$1(interfaceC7117d, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM11033z1 = C5206f.m11033z1(this.f40350a, t10, this.f40351b, this.f40352c, interfaceC9968c);
        return objM11033z1 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11033z1 : C9072e.f47360a;
    }
}
