package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lyv extends aqc {
    public lyv() {
        super(6, 7);
    }

    @Override // p000.aqc
    /* JADX INFO: renamed from: a */
    public final void mo1857a(aqp aqpVar) {
        aqpVar.mo1868g("ALTER TABLE ResourceEntity ADD COLUMN provenance BLOB");
        aqpVar.mo1868g("ALTER TABLE AnnotachmentEntity ADD COLUMN provenance BLOB");
    }
}
