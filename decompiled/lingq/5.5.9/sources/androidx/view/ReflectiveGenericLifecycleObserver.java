package androidx.view;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public final Object f6554a;

    /* JADX INFO: renamed from: b */
    public final C1023c.a f6555b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f6554a = obj;
        this.f6555b = C1023c.f6608c.m3926b(obj.getClass());
    }

    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        HashMap map = this.f6555b.f6611a;
        List list = (List) map.get(event);
        Object obj = this.f6554a;
        C1023c.a.m3927a(list, interfaceC1051q, event, obj);
        C1023c.a.m3927a((List) map.get(Lifecycle.Event.ON_ANY), interfaceC1051q, event, obj);
    }
}
