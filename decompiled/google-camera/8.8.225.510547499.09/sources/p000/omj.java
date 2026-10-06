package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class omj extends omd {
    public omj(ols olsVar) {
        super(olsVar);
        if (olsVar != null && olsVar.mo18639d() != olz.f46282a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: d */
    public final oly mo18639d() {
        return olz.f46282a;
    }
}
