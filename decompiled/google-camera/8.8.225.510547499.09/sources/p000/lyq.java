package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lyq extends aqc {
    public lyq() {
        super(4, 5);
    }

    @Override // p000.aqc
    /* JADX INFO: renamed from: a */
    public final void mo1857a(aqp aqpVar) {
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `F250LogEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceOnDeviceIds` TEXT NOT NULL, `f250LogAction` TEXT NOT NULL, `logEpochTimestamp` INTEGER NOT NULL, `f250LogReason` INTEGER NOT NULL, `errorMessage` TEXT)");
    }
}
