package p000;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class gk3 {

    /* JADX INFO: renamed from: a */
    public final Runtime f40908a = Runtime.getRuntime();

    /* JADX INFO: renamed from: b */
    public final ActivityManager f40909b;

    /* JADX INFO: renamed from: c */
    public final ActivityManager.MemoryInfo f40910c;

    static {
        C3723wi.m23970d();
    }

    public gk3(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f40909b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f40910c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
