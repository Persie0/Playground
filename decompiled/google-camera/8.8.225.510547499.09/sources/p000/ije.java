package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ije implements iby {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f31169a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31170b;

    public /* synthetic */ ije(ijg ijgVar, int i) {
        this.f31170b = i;
        this.f31169a = ijgVar;
    }

    public /* synthetic */ ije(Runnable runnable, int i) {
        this.f31170b = i;
        this.f31169a = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ijg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // p000.iby
    /* JADX INFO: renamed from: a */
    public final void mo11033a(ikw ikwVar) {
        switch (this.f31170b) {
            case 0:
                this.f31169a.mo10999a(ikwVar);
                break;
            default:
                this.f31169a.run();
                break;
        }
    }
}
