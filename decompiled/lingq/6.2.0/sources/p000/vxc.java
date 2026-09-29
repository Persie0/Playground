package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vxc {

    /* JADX INFO: renamed from: a */
    public static final Object f66071a = new Object();

    /* JADX INFO: renamed from: b */
    public static b2b f66072b;

    /* JADX INFO: renamed from: a */
    public static void m23589a(Context context) {
        if (f66072b == null) {
            b2b b2bVar = new b2b(context);
            f66072b = b2bVar;
            synchronized (b2bVar.f7812a) {
                b2bVar.f7818g = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23590b(Intent intent) {
        synchronized (f66071a) {
            try {
                if (f66072b != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f66072b.m3199c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static ComponentName m23591c(Context context, Intent intent) {
        synchronized (f66071a) {
            try {
                m23589a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f66072b.m3197a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
