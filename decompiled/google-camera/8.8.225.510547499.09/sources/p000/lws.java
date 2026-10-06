package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lws implements our {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ our f39456a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ oog f39457b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lwv f39458c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mau f39459d;

    public lws(our ourVar, oog oogVar, lwv lwvVar, mau mauVar) {
        this.f39456a = ourVar;
        this.f39457b = oogVar;
        this.f39458c = lwvVar;
        this.f39459d = mauVar;
    }

    @Override // p000.our
    /* JADX INFO: renamed from: da */
    public final Object mo16104da(ous ousVar, ols olsVar) {
        Object objMo16104da = this.f39456a.mo16104da(new lwr(ousVar, this.f39457b, this.f39458c, this.f39459d), olsVar);
        return objMo16104da == oma.COROUTINE_SUSPENDED ? objMo16104da : oki.f46196a;
    }
}
