package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kfd {
    /* JADX INFO: renamed from: a */
    public static final void m15169a(Context context, xg3 xg3Var) {
        xg3Var.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            xg3Var.m24494a();
            try {
                xg3Var.m24499p(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                xg3Var.m24499p(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                xg3Var.m24502u();
            } finally {
                xg3Var.m24497e();
            }
        }
    }
}
