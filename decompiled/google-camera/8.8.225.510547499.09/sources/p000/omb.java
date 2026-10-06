package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omb extends omj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ onm f46304a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f46305b;

    /* JADX INFO: renamed from: c */
    private int f46306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omb(ols olsVar, onm onmVar, Object obj) {
        super(olsVar);
        this.f46304a = onmVar;
        this.f46305b = obj;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    protected final Object mo561b(Object obj) {
        switch (this.f46306c) {
            case 0:
                this.f46306c = 1;
                lkm.m15592s(obj);
                onm onmVar = this.f46304a;
                ook.m18788b(onmVar, 2);
                return onmVar.mo560a(this.f46305b, this);
            case 1:
                this.f46306c = 2;
                lkm.m15592s(obj);
                return obj;
            default:
                throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
