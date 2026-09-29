package p423v;

import ae.C0062b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7138s;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: v.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9613k implements InterfaceC9612j {

    /* JADX INFO: renamed from: a */
    public final C7138s f49280a = C0062b.m372n(0, 16, BufferOverflow.DROP_OLDEST, 1);

    @Override // p423v.InterfaceC9612j
    /* JADX INFO: renamed from: a */
    public final boolean mo18073a(InterfaceC9610h interfaceC9610h) {
        return this.f49280a.mo14371k(interfaceC9610h);
    }

    @Override // p423v.InterfaceC9611i
    /* JADX INFO: renamed from: b */
    public final C7138s mo18072b() {
        return this.f49280a;
    }

    @Override // p423v.InterfaceC9612j
    /* JADX INFO: renamed from: c */
    public final Object mo18074c(InterfaceC9610h interfaceC9610h, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo1339r = this.f49280a.mo1339r(interfaceC9610h, interfaceC9968c);
        return objMo1339r == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1339r : C9072e.f47360a;
    }
}
