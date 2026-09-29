package p000;

import androidx.room.AbstractC0746d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class i93 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c83 f43737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0746d f43738b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f43739c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f43740d;

    public i93(c83 c83Var, AbstractC0746d abstractC0746d, boolean z, vi3 vi3Var) {
        this.f43737a = c83Var;
        this.f43738b = abstractC0746d;
        this.f43739c = z;
        this.f43740d = vi3Var;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        Object objCollect = this.f43737a.collect(new h93(e83Var, this.f43738b, this.f43739c, this.f43740d), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfa.f68157a;
    }
}
