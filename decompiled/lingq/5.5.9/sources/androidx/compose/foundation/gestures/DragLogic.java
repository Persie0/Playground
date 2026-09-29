package androidx.compose.foundation.gestures;

import cm.InterfaceC2057q;
import dm.C5207g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.InterfaceC7882z;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p375s0.C8941c;
import p423v.C9603a;
import p423v.C9604b;
import p423v.C9605c;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p470x1.C10025m;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class DragLogic {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2057q<InterfaceC7882z, C8941c, InterfaceC9968c<? super C9072e>, Object> f2030a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2057q<InterfaceC7882z, C10025m, InterfaceC9968c<? super C9072e>, Object> f2031b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5312g0<C9604b> f2032c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9612j f2033d;

    /* JADX WARN: Multi-variable type inference failed */
    public DragLogic(InterfaceC2057q<? super InterfaceC7882z, ? super C8941c, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q, InterfaceC2057q<? super InterfaceC7882z, ? super C10025m, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q2, InterfaceC5312g0<C9604b> interfaceC5312g0, InterfaceC9612j interfaceC9612j) {
        C5207g.m11111f(interfaceC2057q, "onDragStarted");
        C5207g.m11111f(interfaceC2057q2, "onDragStopped");
        C5207g.m11111f(interfaceC5312g0, "dragStartInteraction");
        this.f2030a = interfaceC2057q;
        this.f2031b = interfaceC2057q2;
        this.f2032c = interfaceC5312g0;
        this.f2033d = interfaceC9612j;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final Object m1451a(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        DragLogic$processDragCancel$1 dragLogic$processDragCancel$1;
        DragLogic dragLogic;
        if (interfaceC9968c instanceof DragLogic$processDragCancel$1) {
            dragLogic$processDragCancel$1 = (DragLogic$processDragCancel$1) interfaceC9968c;
            int i10 = dragLogic$processDragCancel$1.f2038h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragCancel$1.f2038h = i10 - Integer.MIN_VALUE;
            } else {
                dragLogic$processDragCancel$1 = new DragLogic$processDragCancel$1(this, interfaceC9968c);
            }
        } else {
            dragLogic$processDragCancel$1 = new DragLogic$processDragCancel$1(this, interfaceC9968c);
        }
        Object obj = dragLogic$processDragCancel$1.f2036f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = dragLogic$processDragCancel$1.f2038h;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC7882z = dragLogic$processDragCancel$1.f2035e;
                dragLogic = dragLogic$processDragCancel$1.f2034d;
                C7499b.m14977z0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        C9604b value = this.f2032c.getValue();
        if (value != null) {
            InterfaceC9612j interfaceC9612j = this.f2033d;
            if (interfaceC9612j != null) {
                C9603a c9603a = new C9603a(value);
                dragLogic$processDragCancel$1.f2034d = this;
                dragLogic$processDragCancel$1.f2035e = interfaceC7882z;
                dragLogic$processDragCancel$1.f2038h = 1;
                if (interfaceC9612j.mo18074c(c9603a, dragLogic$processDragCancel$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            dragLogic = this;
        } else {
            dragLogic = this;
        }
        C10025m c10025m = new C10025m(C10025m.f50985b);
        dragLogic$processDragCancel$1.f2034d = null;
        dragLogic$processDragCancel$1.f2035e = null;
        dragLogic$processDragCancel$1.f2038h = 2;
        return dragLogic.f2031b.mo1343M(interfaceC7882z, c10025m, dragLogic$processDragCancel$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        dragLogic.f2032c.setValue(null);
        C10025m c10025m2 = new C10025m(C10025m.f50985b);
        dragLogic$processDragCancel$1.f2034d = null;
        dragLogic$processDragCancel$1.f2035e = null;
        dragLogic$processDragCancel$1.f2038h = 2;
        if (dragLogic.f2031b.mo1343M(interfaceC7882z, c10025m2, dragLogic$processDragCancel$1) == coroutineSingletons) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m1452b(InterfaceC7882z interfaceC7882z, AbstractC0414c.c cVar, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        DragLogic$processDragStart$1 dragLogic$processDragStart$1;
        DragLogic dragLogic;
        InterfaceC9612j interfaceC9612j;
        C9604b c9604b;
        DragLogic dragLogic2;
        InterfaceC7882z interfaceC7882z2;
        C9604b c9604b2;
        C8941c c8941c;
        if (interfaceC9968c instanceof DragLogic$processDragStart$1) {
            dragLogic$processDragStart$1 = (DragLogic$processDragStart$1) interfaceC9968c;
            int i10 = dragLogic$processDragStart$1.f2045j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStart$1.f2045j = i10 - Integer.MIN_VALUE;
            } else {
                dragLogic$processDragStart$1 = new DragLogic$processDragStart$1(this, interfaceC9968c);
            }
        } else {
            dragLogic$processDragStart$1 = new DragLogic$processDragStart$1(this, interfaceC9968c);
        }
        Object obj = dragLogic$processDragStart$1.f2043h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = dragLogic$processDragStart$1.f2045j;
        if (i11 != 0) {
            if (i11 == 1) {
                cVar = dragLogic$processDragStart$1.f2041f;
                interfaceC7882z = dragLogic$processDragStart$1.f2040e;
                dragLogic = dragLogic$processDragStart$1.f2039d;
                C7499b.m14977z0(obj);
            } else if (i11 == 2) {
                c9604b2 = dragLogic$processDragStart$1.f2042g;
                cVar = dragLogic$processDragStart$1.f2041f;
                interfaceC7882z2 = dragLogic$processDragStart$1.f2040e;
                dragLogic2 = dragLogic$processDragStart$1.f2039d;
                C7499b.m14977z0(obj);
                c9604b = c9604b2;
                interfaceC7882z = interfaceC7882z2;
                dragLogic = dragLogic2;
                dragLogic.f2032c.setValue(c9604b);
                c8941c = new C8941c(cVar.f2290a);
                dragLogic$processDragStart$1.f2039d = null;
                dragLogic$processDragStart$1.f2040e = null;
                dragLogic$processDragStart$1.f2041f = null;
                dragLogic$processDragStart$1.f2042g = null;
                dragLogic$processDragStart$1.f2045j = 3;
                if (dragLogic.f2030a.mo1343M(interfaceC7882z, c8941c, dragLogic$processDragStart$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        C9604b value = this.f2032c.getValue();
        if (value != null && (interfaceC9612j = this.f2033d) != null) {
            C9603a c9603a = new C9603a(value);
            dragLogic$processDragStart$1.f2039d = this;
            dragLogic$processDragStart$1.f2040e = interfaceC7882z;
            dragLogic$processDragStart$1.f2041f = cVar;
            dragLogic$processDragStart$1.f2045j = 1;
            if (interfaceC9612j.mo18074c(c9603a, dragLogic$processDragStart$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        dragLogic = this;
        c9604b = new C9604b();
        InterfaceC9612j interfaceC9612j2 = dragLogic.f2033d;
        if (interfaceC9612j2 != null) {
            dragLogic$processDragStart$1.f2039d = dragLogic;
            dragLogic$processDragStart$1.f2040e = interfaceC7882z;
            dragLogic$processDragStart$1.f2041f = cVar;
            dragLogic$processDragStart$1.f2042g = c9604b;
            dragLogic$processDragStart$1.f2045j = 2;
            if (interfaceC9612j2.mo18074c(c9604b, dragLogic$processDragStart$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            dragLogic2 = dragLogic;
            interfaceC7882z2 = interfaceC7882z;
            c9604b2 = c9604b;
            c9604b = c9604b2;
            interfaceC7882z = interfaceC7882z2;
            dragLogic = dragLogic2;
        }
        dragLogic.f2032c.setValue(c9604b);
        c8941c = new C8941c(cVar.f2290a);
        dragLogic$processDragStart$1.f2039d = null;
        dragLogic$processDragStart$1.f2040e = null;
        dragLogic$processDragStart$1.f2041f = null;
        dragLogic$processDragStart$1.f2042g = null;
        dragLogic$processDragStart$1.f2045j = 3;
        if (dragLogic.f2030a.mo1343M(interfaceC7882z, c8941c, dragLogic$processDragStart$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: c */
    public final Object m1453c(InterfaceC7882z interfaceC7882z, AbstractC0414c.d dVar, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        DragLogic$processDragStop$1 dragLogic$processDragStop$1;
        DragLogic dragLogic;
        C10025m c10025m;
        if (interfaceC9968c instanceof DragLogic$processDragStop$1) {
            dragLogic$processDragStop$1 = (DragLogic$processDragStop$1) interfaceC9968c;
            int i10 = dragLogic$processDragStop$1.f2051i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragLogic$processDragStop$1.f2051i = i10 - Integer.MIN_VALUE;
            } else {
                dragLogic$processDragStop$1 = new DragLogic$processDragStop$1(this, interfaceC9968c);
            }
        } else {
            dragLogic$processDragStop$1 = new DragLogic$processDragStop$1(this, interfaceC9968c);
        }
        Object obj = dragLogic$processDragStop$1.f2049g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = dragLogic$processDragStop$1.f2051i;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC0414c.d dVar2 = dragLogic$processDragStop$1.f2048f;
                InterfaceC7882z interfaceC7882z2 = dragLogic$processDragStop$1.f2047e;
                dragLogic = dragLogic$processDragStop$1.f2046d;
                C7499b.m14977z0(obj);
                dVar = dVar2;
                interfaceC7882z = interfaceC7882z2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        C9604b value = this.f2032c.getValue();
        if (value != null) {
            InterfaceC9612j interfaceC9612j = this.f2033d;
            if (interfaceC9612j != null) {
                C9605c c9605c = new C9605c(value);
                dragLogic$processDragStop$1.f2046d = this;
                dragLogic$processDragStop$1.f2047e = interfaceC7882z;
                dragLogic$processDragStop$1.f2048f = dVar;
                dragLogic$processDragStop$1.f2051i = 1;
                if (interfaceC9612j.mo18074c(c9605c, dragLogic$processDragStop$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            dragLogic = this;
        } else {
            dragLogic = this;
        }
        c10025m = new C10025m(dVar.f2291a);
        dragLogic$processDragStop$1.f2046d = null;
        dragLogic$processDragStop$1.f2047e = null;
        dragLogic$processDragStop$1.f2048f = null;
        dragLogic$processDragStop$1.f2051i = 2;
        if (dragLogic.f2031b.mo1343M(interfaceC7882z, c10025m, dragLogic$processDragStop$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
        dragLogic.f2032c.setValue(null);
        c10025m = new C10025m(dVar.f2291a);
        dragLogic$processDragStop$1.f2046d = null;
        dragLogic$processDragStop$1.f2047e = null;
        dragLogic$processDragStop$1.f2048f = null;
        dragLogic$processDragStop$1.f2051i = 2;
        if (dragLogic.f2031b.mo1343M(interfaceC7882z, c10025m, dragLogic$processDragStop$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
