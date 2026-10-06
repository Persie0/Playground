package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kzn implements kzo {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f37773a;

    /* JADX INFO: renamed from: b */
    private final Object f37774b;

    public kzn(kyz kyzVar, int i) {
        this.f37773a = i;
        this.f37774b = kyzVar;
    }

    public kzn(lab labVar, int i) {
        this.f37773a = i;
        this.f37774b = labVar;
    }

    public final String toString() {
        switch (this.f37773a) {
            case 0:
                break;
        }
        return this.f37774b.toString();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lab] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kyz] */
    @Override // p000.kzo
    /* JADX INFO: renamed from: a */
    public final void mo15092a(Object obj, Executor executor, lav lavVar) {
        switch (this.f37773a) {
            case 0:
                kxk.m14975U(this.f37774b.mo15098a(obj, executor).mo15106e(), new juv(lavVar, 3), not.INSTANCE);
                break;
            default:
                lavVar.m15130l(this.f37774b.mo8768a(obj));
                break;
        }
    }
}
