package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.do8;
import p000.t66;
import p000.vi3;
import p000.vz1;
import p000.xc9;
import p000.xfa;
import p000.y72;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0101i implements do8 {

    /* JADX INFO: renamed from: a */
    public final vi3 f2260a;

    /* JADX INFO: renamed from: b */
    public final y72 f2261b = new y72(this);

    /* JADX INFO: renamed from: c */
    public final C0145m f2262c = new C0145m();

    /* JADX INFO: renamed from: d */
    public final t66 f2263d;

    /* JADX INFO: renamed from: e */
    public final t66 f2264e;

    /* JADX INFO: renamed from: f */
    public final t66 f2265f;

    public C0101i(vi3 vi3Var) {
        this.f2260a = vi3Var;
        Boolean bool = Boolean.FALSE;
        this.f2263d = AbstractC0278f.m1260j(bool);
        this.f2264e = AbstractC0278f.m1260j(bool);
        this.f2265f = AbstractC0278f.m1260j(bool);
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: a */
    public final boolean mo863a() {
        return ((Boolean) ((xc9) this.f2263d).getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: c */
    public final Object mo864c(MutatePriority mutatePriority, zi3 zi3Var, ContinuationImpl continuationImpl) {
        Object objM23649s = vz1.m23649s(new DefaultScrollableState$scroll$2(this, mutatePriority, zi3Var, null), continuationImpl);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: e */
    public final float mo865e(float f) {
        return ((Number) this.f2260a.invoke(Float.valueOf(f))).floatValue();
    }
}
