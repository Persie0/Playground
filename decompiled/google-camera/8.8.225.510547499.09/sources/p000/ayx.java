package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayx extends aqc {

    /* JADX INFO: renamed from: c */
    public static final ayx f2736c = new ayx();

    private ayx() {
        super(7, 8);
    }

    @Override // p000.aqc
    /* JADX INFO: renamed from: a */
    public final void mo1857a(aqp aqpVar) {
        aqpVar.mo1868g("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
