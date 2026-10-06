package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayp extends aqc {

    /* JADX INFO: renamed from: c */
    public static final ayp f2728c = new ayp();

    private ayp() {
        super(11, 12);
    }

    @Override // p000.aqc
    /* JADX INFO: renamed from: a */
    public final void mo1857a(aqp aqpVar) {
        aqpVar.mo1868g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
