package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iaa implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ faa f43874b;

    public /* synthetic */ iaa(faa faaVar, int i) {
        this.f43873a = i;
        this.f43874b = faaVar;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f43873a;
        faa faaVar = this.f43874b;
        switch (i) {
            case 0:
                return new jaa(faaVar, 1);
            default:
                return new jaa(faaVar, 0);
        }
    }
}
