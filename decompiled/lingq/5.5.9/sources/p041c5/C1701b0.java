package p041c5;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: c5.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1701b0 extends AbstractC7252b {

    /* JADX INFO: renamed from: c */
    public final Context f9486c;

    public C1701b0(Context context) {
        super(9, 10);
        this.f9486c = context;
    }

    @Override // p234l4.AbstractC7252b
    /* JADX INFO: renamed from: a */
    public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.f9486c;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        boolean zContains = sharedPreferences.contains("reschedule_needed");
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.f7569a;
        if (zContains || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            frameworkSQLiteDatabase.mo4597k();
            try {
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                frameworkSQLiteDatabase.mo4590Z();
                frameworkSQLiteDatabase.mo4601w0();
            } catch (Throwable th2) {
                frameworkSQLiteDatabase.mo4601w0();
                throw th2;
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            frameworkSQLiteDatabase.mo4597k();
            try {
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences2.edit().clear().apply();
                frameworkSQLiteDatabase.mo4590Z();
            } finally {
                frameworkSQLiteDatabase.mo4601w0();
            }
        }
    }
}
