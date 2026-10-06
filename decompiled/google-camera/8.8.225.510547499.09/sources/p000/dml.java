package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dml extends apn {
    public dml(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apn
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1805b(arf arfVar, Object obj) {
        dmn dmnVar = (dmn) obj;
        arfVar.mo1845e(1, dmnVar.f12033a);
        arfVar.mo1845e(2, dmnVar.f12034b);
        arfVar.mo1845e(3, dmnVar.f12035c);
        String str = dmnVar.f12036d;
        if (str == null) {
            arfVar.mo1846f(4);
        } else {
            arfVar.mo1847g(4, str);
        }
        arfVar.mo1845e(5, dmnVar.f12033a);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "UPDATE OR ABORT `shot_log` SET `sequence` = ?,`shot_id` = ?,`time_millis` = ?,`message` = ? WHERE `sequence` = ?";
    }
}
