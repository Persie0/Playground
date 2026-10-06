package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bdc extends apn {
    public bdc(apt aptVar) {
        super(aptVar);
    }

    @Override // p000.apn
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1805b(arf arfVar, Object obj) {
        bcv bcvVar = (bcv) obj;
        arfVar.mo1847g(1, bcvVar.f2964a);
        arfVar.mo1845e(2, C0166er.m7724o(bcvVar.f2981r));
        String str = bcvVar.f2965b;
        if (str == null) {
            arfVar.mo1846f(3);
        } else {
            arfVar.mo1847g(3, str);
        }
        String str2 = bcvVar.f2966c;
        if (str2 == null) {
            arfVar.mo1846f(4);
        } else {
            arfVar.mo1847g(4, str2);
        }
        byte[] bArrM2091c = axt.m2091c(bcvVar.f2967d);
        if (bArrM2091c == null) {
            arfVar.mo1846f(5);
        } else {
            arfVar.mo1843c(5, bArrM2091c);
        }
        byte[] bArrM2091c2 = axt.m2091c(bcvVar.f2968e);
        if (bArrM2091c2 == null) {
            arfVar.mo1846f(6);
        } else {
            arfVar.mo1843c(6, bArrM2091c2);
        }
        arfVar.mo1845e(7, bcvVar.f2969f);
        arfVar.mo1845e(8, bcvVar.f2970g);
        arfVar.mo1845e(9, bcvVar.f2971h);
        arfVar.mo1845e(10, bcvVar.f2973j);
        arfVar.mo1845e(11, C0166er.m7721l(bcvVar.f2982s));
        arfVar.mo1845e(12, bcvVar.f2974k);
        arfVar.mo1845e(13, bcvVar.f2975l);
        arfVar.mo1845e(14, bcvVar.f2976m);
        arfVar.mo1845e(15, bcvVar.f2977n);
        arfVar.mo1845e(16, bcvVar.f2978o ? 1L : 0L);
        arfVar.mo1845e(17, C0166er.m7723n(bcvVar.f2983t));
        arfVar.mo1845e(18, bcvVar.f2979p);
        arfVar.mo1845e(19, bcvVar.f2980q);
        axr axrVar = bcvVar.f2972i;
        if (axrVar != null) {
            arfVar.mo1845e(20, C0166er.m7722m(axrVar.f2686i));
            arfVar.mo1845e(21, axrVar.f2679b ? 1L : 0L);
            arfVar.mo1845e(22, axrVar.f2680c ? 1L : 0L);
            arfVar.mo1845e(23, axrVar.f2681d ? 1L : 0L);
            arfVar.mo1845e(24, axrVar.f2682e ? 1L : 0L);
            arfVar.mo1845e(25, axrVar.f2683f);
            arfVar.mo1845e(26, axrVar.f2684g);
            arfVar.mo1843c(27, C0166er.m7720k(axrVar.f2685h));
        } else {
            arfVar.mo1846f(20);
            arfVar.mo1846f(21);
            arfVar.mo1846f(22);
            arfVar.mo1846f(23);
            arfVar.mo1846f(24);
            arfVar.mo1846f(25);
            arfVar.mo1846f(26);
            arfVar.mo1846f(27);
        }
        arfVar.mo1847g(28, bcvVar.f2964a);
    }

    @Override // p000.aqa
    /* JADX INFO: renamed from: d */
    public final String mo1852d() {
        return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
    }
}
