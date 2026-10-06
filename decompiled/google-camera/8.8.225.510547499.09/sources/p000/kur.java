package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kur implements kus {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kut f37254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kus f37255b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f37256c;

    public /* synthetic */ kur(kut kutVar, kus kusVar, int i) {
        this.f37256c = i;
        this.f37254a = kutVar;
        this.f37255b = kusVar;
    }

    @Override // p000.kus
    /* JADX INFO: renamed from: a */
    public final void mo14904a(int i) {
        int iMo14917g;
        switch (this.f37256c) {
            case 0:
                this.f37255b.mo14904a(this.f37254a.m14911f());
                break;
            case 1:
                this.f37255b.mo14904a(this.f37254a.m14910e());
                break;
            default:
                kut kutVar = this.f37254a;
                kus kusVar = this.f37255b;
                lle.m15692l();
                if (kutVar.f37257a.mo14916f()) {
                    ivk ivkVarM14906a = kutVar.m14906a();
                    iMo14917g = ((ivkVarM14906a.f32280a & 1) == 0 || kutVar.f37257a.mo14912a() < ivkVarM14906a.f32281b) ? 13 : 2;
                } else {
                    iMo14917g = kutVar.f37257a.mo14917g();
                }
                kusVar.mo14904a(iMo14917g);
                break;
        }
    }
}
