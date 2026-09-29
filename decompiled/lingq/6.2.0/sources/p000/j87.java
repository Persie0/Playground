package p000;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class j87 implements pj6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k87 f45195a;

    public j87(k87 k87Var) {
        this.f45195a = k87Var;
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: t */
    public final Object mo919t(long j, long j2, Continuation continuation) {
        if (dpa.m10572c(j2) > 0.0f) {
            this.f45195a.f46860a.m15982e(0.0f);
        }
        return super.mo919t(j, j2, continuation);
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: u0 */
    public final long mo920u0(int i, long j, long j2) {
        k87 k87Var = this.f45195a;
        if (!((Boolean) k87Var.f46861b.mo0a()).booleanValue()) {
            return 0L;
        }
        l7a l7aVar = k87Var.f46860a;
        l7aVar.m15982e(Float.intBitsToFloat((int) (j & 4294967295L)) + l7aVar.f49257b.m19861h());
        return 0L;
    }
}
