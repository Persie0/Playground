package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dma extends apo {
    public dma(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apo
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1807b(arf arfVar, Object obj) {
        dmh dmhVar = (dmh) obj;
        arfVar.mo1845e(1, dmhVar.f12019a);
        String str = dmhVar.f12020b;
        if (str == null) {
            arfVar.mo1846f(2);
        } else {
            arfVar.mo1847g(2, str);
        }
        arfVar.mo1845e(3, dmhVar.f12021c);
        arfVar.mo1845e(4, dmhVar.f12022d);
        arfVar.mo1845e(5, dmhVar.f12023e);
        arfVar.mo1845e(6, dmhVar.f12024f);
        arfVar.mo1845e(7, dmhVar.f12025g);
        String str2 = dmhVar.f12026h;
        if (str2 == null) {
            arfVar.mo1846f(8);
        } else {
            arfVar.mo1847g(8, str2);
        }
        String str3 = dmhVar.f12027i;
        if (str3 == null) {
            arfVar.mo1846f(9);
        } else {
            arfVar.mo1847g(9, str3);
        }
        arfVar.mo1845e(10, dmhVar.f12028j);
        arfVar.mo1845e(11, dmhVar.f12029k ? 1L : 0L);
        arfVar.mo1845e(12, dmhVar.f12030l ? 1L : 0L);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "INSERT OR ABORT INTO `shots` (`shot_id`,`title`,`start_millis`,`persisted_millis`,`canceled_millis`,`deleted_millis`,`most_recent_event_millis`,`capture_session_type`,`capture_session_shot_id`,`pid`,`stuck`,`failed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
