package p000;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buc {

    /* JADX INFO: renamed from: a */
    public final ActivityManager f4472a;

    /* JADX INFO: renamed from: b */
    public float f4473b;

    /* JADX INFO: renamed from: c */
    public final bkn f4474c;

    public buc(Context context) {
        this.f4473b = 1.0f;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f4472a = activityManager;
        this.f4474c = new bkn(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.f4473b = 0.0f;
        }
    }
}
