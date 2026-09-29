package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import cm.InterfaceC2056p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p401u.InterfaceC9348a;
import p401u.InterfaceC9350c;
import p401u.InterfaceC9356i;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollDraggableState implements InterfaceC9350c, InterfaceC9348a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5301c1<ScrollingLogic> f2150a;

    /* JADX INFO: renamed from: b */
    public InterfaceC9356i f2151b = ScrollableKt.f2166a;

    public ScrollDraggableState(InterfaceC5312g0 interfaceC5312g0) {
        this.f2150a = interfaceC5312g0;
    }

    @Override // p401u.InterfaceC9350c
    /* JADX INFO: renamed from: a */
    public final Object mo1467a(MutatePriority mutatePriority, InterfaceC2056p<? super InterfaceC9348a, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo1417b = this.f2150a.getValue().f2206d.mo1417b(mutatePriority, new ScrollDraggableState$drag$2(this, interfaceC2056p, null), interfaceC9968c);
        return objMo1417b == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1417b : C9072e.f47360a;
    }

    @Override // p401u.InterfaceC9348a
    /* JADX INFO: renamed from: b */
    public final void mo1468b(float f3) {
        ScrollingLogic value = this.f2150a.getValue();
        value.m1479a(this.f2151b, value.m1483e(f3), 1);
    }
}
