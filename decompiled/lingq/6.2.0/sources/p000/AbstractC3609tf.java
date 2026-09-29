package p000;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: tf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3609tf {

    /* JADX INFO: renamed from: a */
    public static final ReentrantReadWriteLock f62208a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: b */
    public static String f62209b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f62210c;

    /* JADX INFO: renamed from: a */
    public static void m22023a() {
        if (f62210c) {
            return;
        }
        f62208a.writeLock().lock();
        try {
            if (!f62210c) {
                f62209b = PreferenceManager.getDefaultSharedPreferences(sy2.m21766a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f62210c = true;
            }
        } finally {
            f62208a.writeLock().unlock();
        }
    }
}
