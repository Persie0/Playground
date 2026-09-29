package p317p7;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p291o7.C8004n;

/* JADX INFO: renamed from: p7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8195b {

    /* JADX INFO: renamed from: a */
    public static final C8195b f44375a = new C8195b();

    /* JADX INFO: renamed from: b */
    public static final String f44376b = C8195b.class.getSimpleName();

    /* JADX INFO: renamed from: c */
    public static final ReentrantReadWriteLock f44377c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d */
    public static String f44378d;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f44379e;

    /* JADX INFO: renamed from: a */
    public static void m16318a() {
        if (f44379e) {
            return;
        }
        f44377c.writeLock().lock();
        try {
            if (!f44379e) {
                f44378d = PreferenceManager.getDefaultSharedPreferences(C8004n.m15871a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f44379e = true;
            }
        } finally {
            f44377c.writeLock().unlock();
        }
    }
}
