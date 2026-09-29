package p349qo;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p325po.InterfaceC8442r;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: qo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C8664j<T> implements InterfaceC7117d<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8442r<T> f46243a;

    /* JADX WARN: Multi-variable type inference failed */
    public C8664j(InterfaceC8442r<? super T> interfaceC8442r) {
        this.f46243a = interfaceC8442r;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo16480k = this.f46243a.mo16480k(t10, interfaceC9968c);
        return objMo16480k == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo16480k : C9072e.f47360a;
    }
}
