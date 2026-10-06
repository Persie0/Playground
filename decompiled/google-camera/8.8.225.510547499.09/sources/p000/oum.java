package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oum extends oun {
    public oum(onm onmVar, oly olyVar) {
        super(onmVar, olyVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.oun, p000.owg
    /* JADX INFO: renamed from: b */
    protected final Object mo19080b(oub oubVar, ols olsVar) {
        oul oulVar;
        if (olsVar instanceof oul) {
            oulVar = (oul) olsVar;
            int i = oulVar.f46581c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oulVar.f46581c = i - Integer.MIN_VALUE;
            } else {
                oulVar = new oul(this, olsVar);
            }
        } else {
            oulVar = new oul(this, olsVar);
        }
        Object obj = oulVar.f46579a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (oulVar.f46581c) {
            case 0:
                lkm.m15592s(obj);
                oulVar.f46582d = oubVar;
                oulVar.f46581c = 1;
                if (oun.m19081c(this, oubVar, oulVar) == omaVar) {
                    return omaVar;
                }
                break;
            case 1:
                oubVar = oulVar.f46582d;
                lkm.m15592s(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (oubVar.f46543b.mo19053A()) {
            return oki.f46196a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }
}
