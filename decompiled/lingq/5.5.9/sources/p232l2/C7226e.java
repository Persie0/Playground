package p232l2;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: l2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7226e {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f40611a;

    /* JADX INFO: renamed from: b */
    public static final Field f40612b;

    /* JADX INFO: renamed from: c */
    public static final Field f40613c;

    /* JADX INFO: renamed from: d */
    public static final Method f40614d;

    /* JADX INFO: renamed from: e */
    public static final Method f40615e;

    /* JADX INFO: renamed from: f */
    public static final Method f40616f;

    /* JADX INFO: renamed from: g */
    public static final Handler f40617g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l2.e$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public Object f40618a;

        /* JADX INFO: renamed from: b */
        public Activity f40619b;

        /* JADX INFO: renamed from: c */
        public final int f40620c;

        /* JADX INFO: renamed from: d */
        public boolean f40621d = false;

        /* JADX INFO: renamed from: e */
        public boolean f40622e = false;

        /* JADX INFO: renamed from: f */
        public boolean f40623f = false;

        public a(Activity activity) {
            this.f40619b = activity;
            this.f40620c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f40619b == activity) {
                this.f40619b = null;
                this.f40622e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f40622e || this.f40623f || this.f40621d) {
                return;
            }
            Object obj = this.f40618a;
            boolean z10 = false;
            try {
                Object obj2 = C7226e.f40613c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f40620c) {
                    C7226e.f40617g.postAtFrontOfQueue(new RunnableC7225d(C7226e.f40612b.get(activity), obj2));
                    z10 = true;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
            if (z10) {
                this.f40623f = true;
                this.f40618a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f40619b == activity) {
                this.f40621d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Class<?> cls2;
        Method declaredMethod2;
        Class<?> cls3;
        int i10;
        boolean z10;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f40611a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f40612b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f40613c = declaredField2;
        Class<?> cls4 = f40611a;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
            f40614d = declaredMethod;
            cls2 = f40611a;
            if (cls2 == null) {
                declaredMethod2 = null;
            } else {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                    declaredMethod2 = null;
                }
            }
            f40615e = declaredMethod2;
            cls3 = f40611a;
            i10 = Build.VERSION.SDK_INT;
            if (i10 != 26 || i10 == 27) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && cls3 != null) {
                try {
                    Class<?> cls5 = Boolean.TYPE;
                    Method declaredMethod3 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                    declaredMethod3.setAccessible(true);
                    method = declaredMethod3;
                } catch (Throwable unused6) {
                }
            }
            f40616f = method;
        }
        declaredMethod = null;
        f40614d = declaredMethod;
        cls2 = f40611a;
        if (cls2 == null) {
            declaredMethod2 = null;
        } else {
            declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod2.setAccessible(true);
        }
        f40615e = declaredMethod2;
        cls3 = f40611a;
        i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (z10) {
            Class<?> cls6 = Boolean.TYPE;
            Method declaredMethod4 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls6, Configuration.class, Configuration.class, cls6, cls6);
            declaredMethod4.setAccessible(true);
            method = declaredMethod4;
        }
        f40616f = method;
    }
}
