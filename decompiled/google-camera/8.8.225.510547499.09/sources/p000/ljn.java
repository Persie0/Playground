package p000;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ljn {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public ljn(Context context) throws Throwable {
        lib.m15376a();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
