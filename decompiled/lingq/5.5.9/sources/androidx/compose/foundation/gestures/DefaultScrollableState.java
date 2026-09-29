package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C0392d;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p260m8.C7499b;
import p338qd.C8573r0;
import p401u.InterfaceC9356i;
import p401u.InterfaceC9357j;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultScrollableState implements InterfaceC9357j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<Float, Float> f1989a;

    /* JADX INFO: renamed from: b */
    public final C0398a f1990b = new C0398a();

    /* JADX INFO: renamed from: c */
    public final C0392d f1991c = new C0392d();

    /* JADX INFO: renamed from: d */
    public final ParcelableSnapshotMutableState f1992d = C8573r0.m16684L0(Boolean.FALSE);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$a */
    public static final class C0398a implements InterfaceC9356i {
        public C0398a() {
        }

        @Override // p401u.InterfaceC9356i
        /* JADX INFO: renamed from: a */
        public final float mo1442a(float f3) {
            return DefaultScrollableState.this.f1989a.mo528n(Float.valueOf(f3)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState(InterfaceC2052l<? super Float, Float> interfaceC2052l) {
        this.f1989a = interfaceC2052l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p401u.InterfaceC9357j
    /* JADX INFO: renamed from: a */
    public final boolean mo1416a() {
        return ((Boolean) this.f1992d.getValue()).booleanValue();
    }

    @Override // p401u.InterfaceC9357j
    /* JADX INFO: renamed from: b */
    public final Object mo1417b(MutatePriority mutatePriority, InterfaceC2056p<? super InterfaceC9356i, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM14963s = C7499b.m14963s(new DefaultScrollableState$scroll$2(this, mutatePriority, interfaceC2056p, null), interfaceC9968c);
        return objM14963s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14963s : C9072e.f47360a;
    }

    @Override // p401u.InterfaceC9357j
    /* JADX INFO: renamed from: f */
    public final float mo1420f(float f3) {
        return this.f1989a.mo528n(Float.valueOf(f3)).floatValue();
    }
}
