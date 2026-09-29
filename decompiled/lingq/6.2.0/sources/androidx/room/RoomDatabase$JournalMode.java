package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum RoomDatabase$JournalMode {
    AUTOMATIC,
    TRUNCATE,
    WRITE_AHEAD_LOGGING;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final RoomDatabase$JournalMode resolve$room_runtime(Context context) {
        context.getClass();
        if (this != AUTOMATIC) {
            return this;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
    }
}
