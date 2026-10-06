package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azq extends aqc {

    /* JADX INFO: renamed from: c */
    private final Context f2790c;

    public azq(Context context) {
        super(9, 10);
        this.f2790c = context;
    }

    @Override // p000.aqc
    /* JADX INFO: renamed from: a */
    public final void mo1857a(aqp aqpVar) {
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences sharedPreferences = this.f2790c.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = true == sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            aqpVar.mo1865d();
            try {
                aqpVar.mo1874m(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                aqpVar.mo1874m(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                aqpVar.mo1869h();
                aqpVar.mo1867f();
            } catch (Throwable th) {
                aqpVar.mo1867f();
                throw th;
            }
        }
        SharedPreferences sharedPreferences2 = this.f2790c.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            aqpVar.mo1865d();
            try {
                aqpVar.mo1874m(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                aqpVar.mo1874m(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                aqpVar.mo1869h();
            } finally {
                aqpVar.mo1867f();
            }
        }
    }
}
