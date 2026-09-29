package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import p290o6.C7968m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2727k4 {

    /* JADX INFO: renamed from: c */
    public static C2727k4 f14288c;

    /* JADX INFO: renamed from: a */
    public final Context f14289a;

    /* JADX INFO: renamed from: b */
    public final C2713j4 f14290b;

    public C2727k4() {
        this.f14289a = null;
        this.f14290b = null;
    }

    public C2727k4(Context context) {
        this.f14289a = context;
        C2713j4 c2713j4 = new C2713j4();
        this.f14290b = c2713j4;
        context.getContentResolver().registerContentObserver(C2615c4.f14080a, true, c2713j4);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065 A[Catch: all -> 0x00b2, TryCatch #1 {, blocks: (B:9:0x0014, B:11:0x0019, B:16:0x0024, B:18:0x0028, B:19:0x0035, B:35:0x006c, B:37:0x0071, B:22:0x003c, B:24:0x0043, B:32:0x0065, B:29:0x0052), top: B:65:0x0014, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006c A[Catch: all -> 0x00b2, TryCatch #1 {, blocks: (B:9:0x0014, B:11:0x0019, B:16:0x0024, B:18:0x0028, B:19:0x0035, B:35:0x006c, B:37:0x0071, B:22:0x003c, B:24:0x0043, B:32:0x0065, B:29:0x0052), top: B:65:0x0014, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX INFO: renamed from: a */
    public final String m7918a(String str) {
        Object objM15819g;
        boolean z10;
        Context context = this.f14289a;
        if (context != null) {
            boolean z11 = false;
            if (!C2629d4.f14150b) {
                synchronized (C2629d4.class) {
                    if (!C2629d4.f14150b) {
                        int i10 = 1;
                        while (true) {
                            if (i10 <= 2) {
                                if (C2629d4.f14149a == null) {
                                    C2629d4.f14149a = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = C2629d4.f14149a;
                                if (userManager == null) {
                                    z10 = true;
                                } else {
                                    try {
                                        if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            C2629d4.f14149a = null;
                                        }
                                    } catch (NullPointerException e10) {
                                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                        C2629d4.f14149a = null;
                                        i10++;
                                    }
                                }
                                if (z10) {
                                    C2629d4.f14150b = true;
                                }
                                if (!z10) {
                                    z11 = true;
                                }
                            }
                            z10 = false;
                            if (z10) {
                                C2629d4.f14149a = null;
                            }
                            if (z10) {
                                C2629d4.f14150b = true;
                            }
                            if (!z10) {
                                z11 = true;
                            }
                        }
                    }
                }
            }
            if (!z11) {
                try {
                    try {
                        C7968m c7968m = new C7968m(this, str);
                        try {
                            objM15819g = c7968m.m15819g();
                        } catch (SecurityException unused) {
                            long jClearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                objM15819g = c7968m.m15819g();
                                Binder.restoreCallingIdentity(jClearCallingIdentity);
                            } catch (Throwable th2) {
                                Binder.restoreCallingIdentity(jClearCallingIdentity);
                                throw th2;
                            }
                        }
                        return (String) objM15819g;
                    } catch (SecurityException e11) {
                        e = e11;
                        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                        return null;
                    }
                } catch (IllegalStateException e12) {
                    e = e12;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                    return null;
                } catch (NullPointerException e13) {
                    e = e13;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
                    return null;
                }
            }
        }
        return null;
    }
}
