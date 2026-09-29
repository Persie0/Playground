package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class pu4 implements nu4 {

    /* JADX INFO: renamed from: a */
    public final gc2 f56807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0127b f56808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f56809c;

    public pu4(C0127b c0127b, boolean z) {
        this.f56808b = c0127b;
        this.f56809c = z;
        this.f56807a = AbstractC0278f.m1254d(new C3757xf(c0127b, 19));
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: a */
    public final int mo987a() {
        C0127b c0127b = this.f56808b;
        return (int) (c0127b.m980j().f42989o == Orientation.Vertical ? c0127b.m980j().m13486g() & 4294967295L : c0127b.m980j().m13486g() >> 32);
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: b */
    public final float mo988b() {
        C0127b c0127b = this.f56808b;
        return (c0127b.m978h() * 500) + c0127b.m979i();
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: c */
    public final int mo989c() {
        C0127b c0127b = this.f56808b;
        return (-c0127b.m980j().f42986l) + c0127b.m980j().f42990p;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: d */
    public final float mo990d() {
        C0127b c0127b = this.f56808b;
        int iM978h = c0127b.m978h();
        int iM979i = c0127b.m979i();
        return c0127b.mo975d() ? (iM978h * 500) + iM979i + 100.0f : (iM978h * 500) + iM979i;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: e */
    public final Object mo991e(int i, Continuation continuation) throws Throwable {
        Object objM973l = C0127b.m973l(this.f56808b, i, (ContinuationImpl) continuation);
        return objM973l == CoroutineSingletons.COROUTINE_SUSPENDED ? objM973l : xfa.f68157a;
    }

    @Override // p000.nu4
    /* JADX INFO: renamed from: f */
    public final e71 mo992f() {
        boolean z = this.f56809c;
        gc2 gc2Var = this.f56807a;
        return z ? new e71(((Number) gc2Var.getValue()).intValue(), 1) : new e71(1, ((Number) gc2Var.getValue()).intValue());
    }
}
