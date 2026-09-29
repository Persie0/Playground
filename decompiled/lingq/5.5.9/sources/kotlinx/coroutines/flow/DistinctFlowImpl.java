package kotlinx.coroutines.flow;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5206f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class DistinctFlowImpl<T> implements InterfaceC7116c<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<T> f40040a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<T, Object> f40041b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2056p<Object, Object, Boolean> f40042c;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(InterfaceC7116c<? extends T> interfaceC7116c, InterfaceC2052l<? super T, ? extends Object> interfaceC2052l, InterfaceC2056p<Object, Object, Boolean> interfaceC2056p) {
        this.f40040a = interfaceC7116c;
        this.f40041b = interfaceC2052l;
        this.f40042c = interfaceC2056p;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f38127a = (T) C5206f.f33272g;
        Object objMo9539a = this.f40040a.mo9539a(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, interfaceC7117d), interfaceC9968c);
        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
    }
}
