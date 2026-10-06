package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxv implements fzu {

    /* JADX INFO: renamed from: a */
    private final kmd f23827a;

    /* JADX INFO: renamed from: b */
    private final cem f23828b;

    /* JADX INFO: renamed from: c */
    private final fzu f23829c;

    /* JADX INFO: renamed from: d */
    private final gvw f23830d;

    /* JADX INFO: renamed from: e */
    private final ehw f23831e;

    public fxv(kmd kmdVar, cem cemVar, fzu fzuVar, gvw gvwVar, ehw ehwVar) {
        this.f23827a = kmdVar;
        this.f23829c = fzuVar;
        this.f23828b = cemVar;
        this.f23830d = gvwVar;
        this.f23831e = ehwVar;
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: a */
    public final fzt mo3603a(glk glkVar) {
        return new fxu(this.f23827a, this.f23828b, this.f23829c.mo3603a(glkVar), this.f23830d, this.f23831e);
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: b */
    public final fzt mo3604b(glk glkVar) {
        fzt fztVarMo3604b = this.f23829c.mo3604b(glkVar);
        if (fztVarMo3604b == null) {
            return null;
        }
        return new fxu(this.f23827a, this.f23828b, fztVarMo3604b, this.f23830d, this.f23831e);
    }
}
