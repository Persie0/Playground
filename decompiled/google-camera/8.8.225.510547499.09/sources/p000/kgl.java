package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kgl implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kgm f35923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f35924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f35925c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f35926d;

    public /* synthetic */ kgl(kgm kgmVar, long j, int i, int i2) {
        this.f35926d = i2;
        this.f35923a = kgmVar;
        this.f35924b = j;
        this.f35925c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35926d) {
            case 0:
                kgm kgmVar = this.f35923a;
                kgmVar.f35927a.mo9226bk(this.f35924b, this.f35925c);
                break;
            default:
                kgm kgmVar2 = this.f35923a;
                kgmVar2.f35927a.mo9229bv(this.f35924b, this.f35925c);
                break;
        }
    }
}
