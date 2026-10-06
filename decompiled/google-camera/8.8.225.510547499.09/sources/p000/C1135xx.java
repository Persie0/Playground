package p000;

/* JADX INFO: renamed from: xx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1135xx extends AbstractC1131xt {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1136xy f48038c;

    public C1135xx(C1136xy c1136xy) {
        this.f48038c = c1136xy;
    }

    @Override // p000.AbstractC1131xt
    /* JADX INFO: renamed from: c */
    protected final String mo19589c() {
        C1132xu c1132xu = (C1132xu) this.f48038c.f48039a.get();
        if (c1132xu == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c1132xu.f48034a + "]";
    }
}
