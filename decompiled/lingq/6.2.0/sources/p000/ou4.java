package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.AbstractC0150d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class ou4 implements nu4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0150d f55001a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f55002b;

    public ou4(AbstractC0150d abstractC0150d, boolean z) {
        this.f55001a = abstractC0150d;
        this.f55002b = z;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: a */
    public final int mo987a() {
        AbstractC0150d abstractC0150d = this.f55001a;
        return (int) (abstractC0150d.m1038m().f52223e == Orientation.Vertical ? abstractC0150d.m1038m().m17188g() & 4294967295L : abstractC0150d.m1038m().m17188g() >> 32);
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: b */
    public final float mo988b() {
        return omd.m18165u(this.f55001a);
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: c */
    public final int mo989c() {
        AbstractC0150d abstractC0150d = this.f55001a;
        return (-abstractC0150d.m1038m().f52224f) + abstractC0150d.m1038m().f52222d;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: d */
    public final float mo990d() {
        AbstractC0150d abstractC0150d = this.f55001a;
        return v27.m23065a(abstractC0150d.m1038m(), abstractC0150d.mo1039n());
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: e */
    public final Object mo991e(int i, Continuation continuation) {
        Object objM1031u = AbstractC0150d.m1031u(this.f55001a, i, (SuspendLambda) continuation);
        return objM1031u == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1031u : xfa.f68157a;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: f */
    public final e71 mo992f() {
        boolean z = this.f55002b;
        AbstractC0150d abstractC0150d = this.f55001a;
        return z ? new e71(abstractC0150d.mo1039n(), 1) : new e71(1, abstractC0150d.mo1039n());
    }
}
