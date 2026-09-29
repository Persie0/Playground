package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class p78 extends ry5 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f55700c = 1;

    /* JADX INFO: renamed from: d */
    public final Context f55701d;

    public p78(Context context) {
        super(9, 10);
        this.f55701d = context;
    }

    @Override // p000.ry5
    /* JADX INFO: renamed from: a */
    public final void mo18937a(xg3 xg3Var) {
        int i = this.f55700c;
        Context context = this.f55701d;
        xg3Var.getClass();
        switch (i) {
            case 0:
                if (this.f60040b >= 10) {
                    xg3Var.m24499p(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                xg3Var.m24498n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    xg3Var.m24494a();
                    try {
                        xg3Var.m24499p(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        xg3Var.m24499p(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        xg3Var.m24502u();
                        xg3Var.m24497e();
                    } catch (Throwable th) {
                        xg3Var.m24497e();
                        throw th;
                    }
                }
                kfd.m15169a(context, xg3Var);
                return;
        }
    }

    public p78(Context context, int i, int i2) {
        super(i, i2);
        this.f55701d = context;
    }
}
