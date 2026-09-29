package p254m2;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.media.C0141b;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.app.NotificationManagerCompat;
import java.io.File;
import java.util.WeakHashMap;
import p286o2.C7902b;
import p286o2.C7906f;
import p338qd.C8573r0;
import p389t2.C9182a;

/* JADX INFO: renamed from: m2.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C7472a {

    /* JADX INFO: renamed from: a */
    public static final Object f41322a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f41323b = new Object();

    /* JADX INFO: renamed from: m2.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m14843a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* JADX INFO: renamed from: b */
        public static void m14844b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* JADX INFO: renamed from: m2.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static File[] m14845a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* JADX INFO: renamed from: b */
        public static File[] m14846b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* JADX INFO: renamed from: c */
        public static File[] m14847c(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX INFO: renamed from: m2.a$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static File m14848a(Context context) {
            return context.getCodeCacheDir();
        }

        /* JADX INFO: renamed from: b */
        public static Drawable m14849b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        /* JADX INFO: renamed from: c */
        public static File m14850c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: m2.a$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static int m14851a(Context context, int i10) {
            return context.getColor(i10);
        }

        /* JADX INFO: renamed from: b */
        public static <T> T m14852b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* JADX INFO: renamed from: c */
        public static String m14853c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: m2.a$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static Context m14854a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* JADX INFO: renamed from: b */
        public static File m14855b(Context context) {
            return context.getDataDir();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m14856c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: m2.a$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static Intent m14857a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            if ((i10 & 4) == 0 || str != null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
            }
            Object obj = C7472a.f41322a;
            String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (C8573r0.m16691P(context, str2) == 0) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
            }
            throw new RuntimeException(C0141b.m611g("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
        }

        /* JADX INFO: renamed from: b */
        public static ComponentName m14858b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static int m14841a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (C9182a.m17515a() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m14842b(int i10, Context context) {
        ColorStateList colorStateListM15666a;
        ColorStateList colorStateList;
        C7906f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C7906f.d dVar = new C7906f.d(resources, theme);
        synchronized (C7906f.f43058c) {
            SparseArray<C7906f.c> sparseArray = C7906f.f43057b.get(dVar);
            colorStateListM15666a = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (cVar = sparseArray.get(i10)) == null) {
                colorStateList = colorStateListM15666a;
            } else if (!cVar.f43060b.equals(resources.getConfiguration()) || (!(theme == null && cVar.f43061c == 0) && (theme == null || cVar.f43061c != theme.hashCode()))) {
                sparseArray.remove(i10);
                colorStateList = colorStateListM15666a;
            } else {
                colorStateList = cVar.f43059a;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (!(i11 >= 28 && i11 <= 31)) {
            try {
                colorStateListM15666a = C7902b.m15666a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateListM15666a == null) {
            return C7906f.b.m15679b(resources, i10, theme);
        }
        synchronized (C7906f.f43058c) {
            WeakHashMap<C7906f.d, SparseArray<C7906f.c>> weakHashMap = C7906f.f43057b;
            SparseArray<C7906f.c> sparseArray2 = weakHashMap.get(dVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray2);
            }
            sparseArray2.append(i10, new C7906f.c(colorStateListM15666a, dVar.f43062a.getConfiguration(), theme));
        }
        return colorStateListM15666a;
    }
}
