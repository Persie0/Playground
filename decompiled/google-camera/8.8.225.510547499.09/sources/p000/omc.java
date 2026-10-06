package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omc extends omf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ onm f46307a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f46308b;

    /* JADX INFO: renamed from: c */
    private int f46309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omc(ols olsVar, oly olyVar, onm onmVar, Object obj) {
        super(olsVar, olyVar);
        this.f46307a = onmVar;
        this.f46308b = obj;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    protected final Object mo561b(Object obj) {
        switch (this.f46309c) {
            case 0:
                this.f46309c = 1;
                lkm.m15592s(obj);
                onm onmVar = this.f46307a;
                ook.m18788b(onmVar, 2);
                return onmVar.mo560a(this.f46308b, this);
            case 1:
                this.f46309c = 2;
                lkm.m15592s(obj);
                return obj;
            default:
                throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
