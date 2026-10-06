package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayn extends aem {

    /* JADX INFO: renamed from: a */
    public static final ayn f2727a = new ayn();

    private ayn() {
    }

    @Override // p000.aem
    /* JADX INFO: renamed from: d */
    public final void mo353d(aqp aqpVar) {
        aqpVar.mo1865d();
        try {
            aqpVar.mo1868g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - azi.f2773a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aqpVar.mo1869h();
        } finally {
            aqpVar.mo1867f();
        }
    }
}
