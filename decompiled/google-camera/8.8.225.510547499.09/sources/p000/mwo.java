package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mwo extends nba {

    /* JADX INFO: renamed from: a */
    private final mws f41732a;

    public mwo(mws mwsVar, int i) {
        super(mwsVar.size(), i);
        this.f41732a = mwsVar;
    }

    @Override // p000.nba
    /* JADX INFO: renamed from: a */
    protected final Object mo17085a(int i) {
        return this.f41732a.get(i);
    }
}
