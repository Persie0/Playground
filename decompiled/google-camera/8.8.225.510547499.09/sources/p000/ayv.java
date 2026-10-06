package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayv extends aqc {

    /* JADX INFO: renamed from: c */
    public static final ayv f2734c = new ayv();

    private ayv() {
        super(4, 5);
    }

    @Override // p000.aqc
    /* JADX INFO: renamed from: a */
    public final void mo1857a(aqp aqpVar) {
        aqpVar.mo1868g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        aqpVar.mo1868g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
