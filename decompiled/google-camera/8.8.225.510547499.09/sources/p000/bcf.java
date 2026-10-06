package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bcf extends apo {
    public bcf(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        bcd bcdVar = (bcd) obj;
        arfVar.mo1847g(1, bcdVar.f2939a);
        arfVar.mo1845e(2, bcdVar.f2940b);
        arfVar.mo1845e(3, bcdVar.f2941c);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}
