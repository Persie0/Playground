package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfn implements fzu {

    /* JADX INFO: renamed from: a */
    private final cem f5507a;

    /* JADX INFO: renamed from: b */
    private final nps f5508b;

    /* JADX INFO: renamed from: c */
    private final fzu f5509c;

    public cfn(fzu fzuVar, cem cemVar, nps npsVar) {
        this.f5507a = cemVar;
        npsVar.getClass();
        this.f5508b = npsVar;
        fzuVar.getClass();
        this.f5509c = fzuVar;
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: a */
    public final fzt mo3603a(glk glkVar) {
        return new cfm(this.f5507a, this.f5508b, this.f5509c.mo3603a(glkVar));
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: b */
    public final fzt mo3604b(glk glkVar) {
        fzt fztVarMo3604b = this.f5509c.mo3604b(glkVar);
        if (fztVarMo3604b == null) {
            return null;
        }
        return new cfm(this.f5507a, this.f5508b, fztVarMo3604b);
    }
}
