package p000;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kuh {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f37221a = 0;

    /* JADX INFO: renamed from: b */
    private static UserManager f37222b;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f37223c = false;

    private kuh() {
    }

    /* JADX INFO: renamed from: a */
    public static Context m14886a(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    /* JADX INFO: renamed from: b */
    public static nps m14887b(Context context, Runnable runnable) {
        if (!m14889d(context)) {
            return C0930qh.m19342b(new kuf(runnable, context, 0));
        }
        runnable.run();
        return npp.f44031a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14888c(Context context) {
        return !m14890e(context);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14889d(Context context) {
        return m14890e(context);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f A[Catch: all -> 0x0053, TryCatch #1 {, blocks: (B:7:0x0009, B:9:0x000d, B:14:0x0015, B:16:0x0019, B:17:0x0023, B:31:0x004f, B:32:0x0051, B:20:0x0029, B:22:0x002f, B:26:0x003c, B:29:0x004b), top: B:41:0x0009, inners: #0 }] */
    /* JADX INFO: renamed from: e */
    private static boolean m14890e(Context context) {
        if (f37223c) {
            return true;
        }
        synchronized (kuh.class) {
            if (f37223c) {
                return true;
            }
            int i = 1;
            while (true) {
                boolean z = false;
                if (i <= 2) {
                    if (f37222b == null) {
                        f37222b = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = f37222b;
                    if (userManager == null) {
                        z = true;
                    } else {
                        try {
                            if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                z = true;
                            }
                        } catch (NullPointerException e) {
                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                            f37222b = null;
                            i++;
                        }
                    }
                    if (z) {
                        f37223c = true;
                    }
                    return z;
                }
                if (z) {
                    f37222b = null;
                }
                if (z) {
                    f37223c = true;
                }
                return z;
            }
        }
    }
}
