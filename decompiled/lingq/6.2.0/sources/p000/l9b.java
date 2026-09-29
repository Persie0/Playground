package p000;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l9b implements xb5, hj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kf1 f49350a;

    public l9b(kf1 kf1Var) {
        this.f49350a = kf1Var;
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: b */
    public final xi3 mo13293b() {
        return new FunctionReferenceImpl(1, this.f49350a, kf1.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xb5) && (obj instanceof hj3)) {
            return mo13293b().equals(((hj3) obj).mo13293b());
        }
        return false;
    }

    public final int hashCode() {
        return mo13293b().hashCode();
    }
}
