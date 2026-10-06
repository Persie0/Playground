package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ayq extends aqc {

    /* JADX INFO: renamed from: c */
    public static final ayq f2729c = new ayq();

    private ayq() {
        super(12, 13);
    }

    @Override // p000.aqc
    /* JADX INFO: renamed from: a */
    public final void mo1857a(aqp aqpVar) {
        aqpVar.mo1868g("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        aqpVar.mo1868g("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
