package p290o6;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.C0987y;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.Task;
import com.linguist.R;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;
import p043c7.C1735a;
import p066d7.C5049a;
import p088e7.C5382b;
import p450w6.C9818e;

/* JADX INFO: renamed from: o6.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7951d0 {

    /* JADX INFO: renamed from: l */
    public static int f43290l = -1;

    /* JADX INFO: renamed from: c */
    public a f43293c;

    /* JADX INFO: renamed from: d */
    public final CleverTapInstanceConfig f43294d;

    /* JADX INFO: renamed from: e */
    public final Context f43295e;

    /* JADX INFO: renamed from: j */
    public final C7986y f43300j;

    /* JADX INFO: renamed from: a */
    public final Object f43291a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f43292b = false;

    /* JADX INFO: renamed from: f */
    public final Object f43296f = new Object();

    /* JADX INFO: renamed from: g */
    public boolean f43297g = false;

    /* JADX INFO: renamed from: h */
    public String f43298h = null;

    /* JADX INFO: renamed from: i */
    public boolean f43299i = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList<C5382b> f43301k = new ArrayList<>();

    /* JADX INFO: renamed from: o6.d0$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public final String f43302a;

        /* JADX INFO: renamed from: b */
        public final int f43303b;

        /* JADX INFO: renamed from: c */
        public final String f43304c;

        /* JADX INFO: renamed from: d */
        public final String f43305d;

        /* JADX INFO: renamed from: e */
        public final int f43306e;

        /* JADX INFO: renamed from: f */
        public final double f43307f;

        /* JADX INFO: renamed from: g */
        public final String f43308g;

        /* JADX INFO: renamed from: h */
        public final String f43309h;

        /* JADX INFO: renamed from: i */
        public final String f43310i;

        /* JADX INFO: renamed from: j */
        public final boolean f43311j;

        /* JADX INFO: renamed from: k */
        public final String f43312k;

        /* JADX INFO: renamed from: l */
        public final String f43313l;

        /* JADX INFO: renamed from: m */
        public final int f43314m;

        /* JADX INFO: renamed from: n */
        public final String f43315n;

        /* JADX INFO: renamed from: o */
        public final double f43316o;

        /* JADX INFO: renamed from: p */
        public final String f43317p;

        /* JADX INFO: renamed from: q */
        public int f43318q;

        public a() {
            String str;
            int i10;
            String simCountryIso;
            int iHeight;
            float f3;
            double dRound;
            int iWidth;
            float f10;
            int i11;
            boolean zAreNotificationsEnabled;
            String networkOperatorName = null;
            try {
                str = C7951d0.this.f43295e.getPackageManager().getPackageInfo(C7951d0.this.f43295e.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                C2181a.m6449a("Unable to get app version");
                str = networkOperatorName;
            }
            this.f43315n = str;
            this.f43312k = "Android";
            this.f43313l = Build.VERSION.RELEASE;
            String str2 = Build.MANUFACTURER;
            this.f43308g = str2;
            String str3 = "";
            this.f43309h = Build.MODEL.replace(str2, "");
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C7951d0.this.f43295e.getSystemService("phone");
                if (telephonyManager != null) {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                }
            } catch (Exception unused2) {
            }
            this.f43304c = networkOperatorName;
            C7951d0 c7951d0 = C7951d0.this;
            try {
                i10 = c7951d0.f43295e.getPackageManager().getPackageInfo(c7951d0.f43295e.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused3) {
                C2181a.m6449a("Unable to get app build");
                i10 = 0;
            }
            this.f43303b = i10;
            this.f43310i = C7979r0.m15840g(C7951d0.this.f43295e);
            C7951d0 c7951d1 = C7951d0.this;
            this.f43302a = c7951d1.f43295e.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") ? "ble" : c7951d1.f43295e.getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? "classic" : "none";
            try {
                TelephonyManager telephonyManager2 = (TelephonyManager) C7951d0.this.f43295e.getSystemService("phone");
                simCountryIso = telephonyManager2 != null ? telephonyManager2.getSimCountryIso() : "";
            } catch (Throwable unused4) {
            }
            this.f43305d = simCountryIso;
            this.f43314m = 40705;
            C7951d0 c7951d2 = C7951d0.this;
            WindowManager windowManager = (WindowManager) c7951d2.f43295e.getSystemService("window");
            double dRound2 = 0.0d;
            if (windowManager == null) {
                dRound = 0.0d;
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    Configuration configuration = c7951d2.f43295e.getResources().getConfiguration();
                    Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemGestures());
                    iHeight = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
                    f3 = configuration.densityDpi;
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    iHeight = displayMetrics.heightPixels;
                    f3 = displayMetrics.ydpi;
                }
                dRound = Math.round(((double) (iHeight / f3)) * 100.0d) / 100.0d;
            }
            this.f43307f = dRound;
            WindowManager windowManager2 = (WindowManager) C7951d0.this.f43295e.getSystemService("window");
            if (windowManager2 != null) {
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics currentWindowMetrics2 = windowManager2.getCurrentWindowMetrics();
                    Insets insetsIgnoringVisibility2 = currentWindowMetrics2.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemGestures());
                    currentWindowMetrics2.getBounds().height();
                    int unused5 = insetsIgnoringVisibility2.top;
                } else {
                    windowManager2.getDefaultDisplay().getMetrics(new DisplayMetrics());
                }
            }
            C7951d0 c7951d3 = C7951d0.this;
            WindowManager windowManager3 = (WindowManager) c7951d3.f43295e.getSystemService("window");
            if (windowManager3 != null) {
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics currentWindowMetrics3 = windowManager3.getCurrentWindowMetrics();
                    Configuration configuration2 = c7951d3.f43295e.getResources().getConfiguration();
                    Insets insetsIgnoringVisibility3 = currentWindowMetrics3.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemGestures());
                    iWidth = (currentWindowMetrics3.getBounds().width() - insetsIgnoringVisibility3.right) - insetsIgnoringVisibility3.left;
                    f10 = configuration2.densityDpi;
                } else {
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    windowManager3.getDefaultDisplay().getMetrics(displayMetrics2);
                    iWidth = displayMetrics2.widthPixels;
                    f10 = displayMetrics2.xdpi;
                }
                dRound2 = Math.round(((double) (iWidth / f10)) * 100.0d) / 100.0d;
            }
            this.f43316o = dRound2;
            WindowManager windowManager4 = (WindowManager) C7951d0.this.f43295e.getSystemService("window");
            if (windowManager4 != null) {
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics currentWindowMetrics4 = windowManager4.getCurrentWindowMetrics();
                    Insets insetsIgnoringVisibility4 = currentWindowMetrics4.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemGestures());
                    currentWindowMetrics4.getBounds().width();
                    int unused6 = insetsIgnoringVisibility4.right;
                } else {
                    windowManager4.getDefaultDisplay().getMetrics(new DisplayMetrics());
                }
            }
            C7951d0 c7951d4 = C7951d0.this;
            WindowManager windowManager5 = (WindowManager) c7951d4.f43295e.getSystemService("window");
            if (windowManager5 == null) {
                i11 = 0;
            } else if (Build.VERSION.SDK_INT >= 30) {
                i11 = c7951d4.f43295e.getResources().getConfiguration().densityDpi;
            } else {
                DisplayMetrics displayMetrics3 = new DisplayMetrics();
                windowManager5.getDefaultDisplay().getMetrics(displayMetrics3);
                i11 = displayMetrics3.densityDpi;
            }
            this.f43306e = i11;
            try {
                zAreNotificationsEnabled = NotificationManagerCompat.from(C7951d0.this.f43295e).areNotificationsEnabled();
            } catch (RuntimeException e10) {
                C2181a.m6449a("Runtime exception caused when checking whether notification are enabled or not");
                e10.printStackTrace();
                zAreNotificationsEnabled = true;
            }
            this.f43311j = zAreNotificationsEnabled;
            this.f43318q = C7977q0.m15824b(C7951d0.this.f43295e, 0, "local_in_app_count");
            if (Build.VERSION.SDK_INT >= 28) {
                int appStandbyBucket = ((UsageStatsManager) C7951d0.this.f43295e.getSystemService("usagestats")).getAppStandbyBucket();
                if (appStandbyBucket == 10) {
                    str3 = "active";
                } else if (appStandbyBucket == 20) {
                    str3 = "working_set";
                } else if (appStandbyBucket == 30) {
                    str3 = "frequent";
                } else if (appStandbyBucket == 40) {
                    str3 = "rare";
                } else if (appStandbyBucket == 45) {
                    str3 = "restricted";
                }
                this.f43317p = str3;
            }
        }
    }

    public C7951d0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, C7986y c7986y) {
        this.f43295e = context;
        this.f43294d = cleverTapInstanceConfig;
        this.f43300j = c7986y;
        C1735a.m5472a(cleverTapInstanceConfig).m5473a().m6585b("getDeviceCachedInfo", new CallableC7945a0(this));
        Task taskM5473a = C1735a.m5472a(cleverTapInstanceConfig).m5473a();
        taskM5473a.m6584a(new C7947b0(this));
        taskM5473a.m6585b("initDeviceID", new CallableC7949c0(this, str));
        C2181a c2181aM15763g = m15763g();
        String str2 = cleverTapInstanceConfig.f10995a + ":async_deviceID";
        c2181aM15763g.getClass();
        C2181a.m6460m(str2, "DeviceInfo() called");
    }

    /* JADX INFO: renamed from: e */
    public static String m15756e() {
        return "__" + UUID.randomUUID().toString().replace("-", "");
    }

    /* JADX INFO: renamed from: k */
    public static int m15757k(Context context) {
        if (f43290l == -1) {
            try {
                if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
                    f43290l = 3;
                    return 3;
                }
            } catch (Exception e10) {
                C2181a.m6449a("Failed to decide whether device is a TV!");
                e10.printStackTrace();
            }
            try {
                f43290l = context.getResources().getBoolean(R.bool.ctIsTablet) ? 2 : 1;
            } catch (Exception e11) {
                C2181a.m6449a("Failed to decide whether device is a smart phone or tablet!");
                e11.printStackTrace();
                f43290l = 0;
            }
        }
        return f43290l;
    }

    /* JADX INFO: renamed from: a */
    public final String m15758a() {
        synchronized (this.f43296f) {
            if (!this.f43294d.f10988H) {
                return C7977q0.m15828f(this.f43295e, m15766j(), null);
            }
            String strM15828f = C7977q0.m15828f(this.f43295e, m15766j(), null);
            if (strM15828f == null) {
                strM15828f = C7977q0.m15828f(this.f43295e, "deviceId", null);
            }
            return strM15828f;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m15759b(String str) {
        if (C7979r0.m15844k(str)) {
            m15763g().m6462g(this.f43294d.f10995a, "Setting CleverTap ID to custom CleverTap ID : " + str);
            m15760c("__h" + str);
            return;
        }
        synchronized (this) {
            if (C7977q0.m15828f(this.f43295e, "fallbackId:" + this.f43294d.f10995a, null) == null) {
                synchronized (this.f43296f) {
                    String str2 = "__i" + UUID.randomUUID().toString().replace("-", "");
                    if (str2.trim().length() > 2) {
                        C2181a c2181aM15763g = m15763g();
                        String str3 = this.f43294d.f10995a;
                        String strConcat = "Updating the fallback id - ".concat(str2);
                        c2181aM15763g.getClass();
                        C2181a.m6460m(str3, strConcat);
                        C7977q0.m15832j(this.f43295e, "fallbackId:" + this.f43294d.f10995a, str2);
                    } else {
                        C2181a c2181aM15763g2 = m15763g();
                        String str4 = this.f43294d.f10995a;
                        c2181aM15763g2.getClass();
                        C2181a.m6460m(str4, "Unable to generate fallback error device ID");
                    }
                }
            }
        }
        C7977q0.m15830h(C7977q0.m15827e(this.f43295e, null).edit().remove(m15766j()));
        m15763g().m6462g(this.f43294d.f10995a, m15768m(21, str, C7977q0.m15828f(this.f43295e, "fallbackId:" + this.f43294d.f10995a, null)));
    }

    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: c */
    public final void m15760c(String str) {
        C2181a c2181aM15763g = m15763g();
        c2181aM15763g.getClass();
        C2181a.m6460m(this.f43294d.f10995a, "Force updating the device ID to " + str);
        synchronized (this.f43296f) {
            C7977q0.m15832j(this.f43295e, m15766j(), str);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m15761d() {
        String str;
        String strM15756e;
        String strConcat;
        try {
            C2181a c2181aM15763g = m15763g();
            String str2 = this.f43294d.f10995a + ":async_deviceID";
            c2181aM15763g.getClass();
            C2181a.m6460m(str2, "generateDeviceID() called!");
            synchronized (this.f43291a) {
                try {
                    str = this.f43298h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (str != null) {
                strConcat = "__g".concat(str);
            } else {
                synchronized (this.f43296f) {
                    strM15756e = m15756e();
                }
                strConcat = strM15756e;
            }
            m15760c(strConcat);
            C2181a c2181aM15763g2 = m15763g();
            String str3 = this.f43294d.f10995a + ":async_deviceID";
            c2181aM15763g2.getClass();
            C2181a.m6460m(str3, "generateDeviceID() done executing!");
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m15762f() {
        String str;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43294d;
        try {
            synchronized (this.f43291a) {
                try {
                    str = this.f43298h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            boolean z10 = false;
            if (str != null) {
                if (new C9818e(this.f43295e, cleverTapInstanceConfig, this).m18297b().length() > 1) {
                    z10 = true;
                }
                cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "deviceIsMultiUser:[" + z10 + "]");
            }
            this.f43300j.getClass();
            return C5049a.m10723b(this, this.f43297g, z10);
        } catch (Throwable th3) {
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str2 = cleverTapInstanceConfig.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6461n(str2, "Failed to construct App Launched event", th3);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: g */
    public final C2181a m15763g() {
        return this.f43294d.m6433b();
    }

    /* JADX INFO: renamed from: h */
    public final a m15764h() {
        if (this.f43293c == null) {
            this.f43293c = new a();
        }
        return this.f43293c;
    }

    /* JADX INFO: renamed from: i */
    public final String m15765i() {
        if (m15758a() != null) {
            return m15758a();
        }
        return C7977q0.m15828f(this.f43295e, "fallbackId:" + this.f43294d.f10995a, null);
    }

    /* JADX INFO: renamed from: j */
    public final String m15766j() {
        return "deviceId:" + this.f43294d.f10995a;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m15767l() {
        return m15765i() != null && m15765i().startsWith("__i");
    }

    /* JADX INFO: renamed from: m */
    public final String m15768m(int i10, String... strArr) {
        C5382b c5382bM3821c = C0987y.m3821c(514, i10, strArr);
        this.f43301k.add(c5382bM3821c);
        return c5382bM3821c.f33798b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public final void m15769n() {
        String strM15765i = m15765i();
        String strConcat = strM15765i == null ? null : "OptOut:".concat(strM15765i);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43294d;
        if (strConcat == null) {
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str = cleverTapInstanceConfig.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6460m(str, "Unable to set current user OptOut state from storage: storage key is null");
            return;
        }
        boolean zM15823a = C7977q0.m15823a(this.f43295e, cleverTapInstanceConfig, strConcat);
        C7986y c7986y = this.f43300j;
        synchronized (c7986y.f43452J) {
            try {
                c7986y.f43463e = zM15823a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
        c2181aM6433b2.getClass();
        C2181a.m6460m(cleverTapInstanceConfig.f10995a, "Set current user OptOut state from storage to: " + zM15823a + " for key: " + strConcat);
    }
}
