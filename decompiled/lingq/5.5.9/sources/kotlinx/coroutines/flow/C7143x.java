package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p349qo.AbstractC8655a;
import p349qo.AbstractC8657c;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C7143x extends AbstractC8657c<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40389a = AtomicReferenceFieldUpdater.newUpdater(C7143x.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // p349qo.AbstractC8657c
    /* JADX INFO: renamed from: a */
    public final boolean mo14402a(AbstractC8655a abstractC8655a) {
        if (this._state != null) {
            return false;
        }
        this._state = C7120g.f40283a;
        return true;
    }

    @Override // p349qo.AbstractC8657c
    /* JADX INFO: renamed from: b */
    public final InterfaceC9968c[] mo14403b(AbstractC8655a abstractC8655a) {
        this._state = null;
        return C8656b.f46236d;
    }
}
