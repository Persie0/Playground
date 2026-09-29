package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.amplitude.common.android.C0901a;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: renamed from: ph */
/* JADX INFO: loaded from: classes.dex */
public final class C3460ph {

    /* JADX INFO: renamed from: a */
    public final String f56194a;

    /* JADX INFO: renamed from: b */
    public final String f56195b;

    /* JADX INFO: renamed from: c */
    public final String f56196c;

    /* JADX INFO: renamed from: d */
    public final String f56197d;

    /* JADX INFO: renamed from: e */
    public final String f56198e;

    /* JADX INFO: renamed from: f */
    public final String f56199f;

    /* JADX INFO: renamed from: g */
    public final String f56200g;

    /* JADX INFO: renamed from: h */
    public final String f56201h;

    /* JADX INFO: renamed from: i */
    public final String f56202i;

    /* JADX INFO: renamed from: j */
    public final String f56203j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0901a f56204k;

    public C3460ph(C0901a c0901a) {
        String string;
        String str;
        String networkOperatorName;
        String country;
        String networkCountryIso;
        Context context = c0901a.f11000a;
        this.f56204k = c0901a;
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.f56197d = str2;
        String str3 = Build.BRAND;
        str3.getClass();
        this.f56198e = str3;
        String str4 = Build.MANUFACTURER;
        str4.getClass();
        this.f56199f = str4;
        String str5 = Build.MODEL;
        str5.getClass();
        this.f56200g = str5;
        String language = m19143a().getLanguage();
        language.getClass();
        this.f56202i = language;
        String str6 = null;
        if (!c0901a.f11001b) {
            string = null;
        } else if ("Amazon".equals(str4)) {
            ContentResolver contentResolver = context.getContentResolver();
            Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0);
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } else {
            try {
                Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                Object objInvoke2 = objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
                Boolean bool = objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null;
                if (bool != null) {
                    bool.booleanValue();
                }
                Object objInvoke3 = objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
                objInvoke3.getClass();
                string = (String) objInvoke3;
            } catch (ClassNotFoundException unused) {
                lj5.f49738c.mo16257c("Google Play Services SDK not found for advertising id!");
                string = null;
            } catch (InvocationTargetException unused2) {
                lj5.f49738c.mo16257c("Google Play Services not available for advertising id");
                string = null;
            } catch (Exception unused3) {
                lj5.f49738c.mo16255a("Encountered an error connecting to Google Play Services for advertising id");
                string = null;
            }
        }
        this.f56194a = string;
        Context context2 = this.f56204k.f11000a;
        try {
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
            packageInfo.getClass();
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused4) {
            str = null;
        }
        this.f56196c = str;
        try {
            Object systemService = this.f56204k.f11000a.getSystemService("phone");
            systemService.getClass();
            networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        } catch (Exception unused5) {
            networkOperatorName = null;
        }
        this.f56201h = networkOperatorName;
        try {
            Object systemService2 = this.f56204k.f11000a.getSystemService("phone");
            systemService2.getClass();
            TelephonyManager telephonyManager = (TelephonyManager) systemService2;
            if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                country = null;
            } else {
                Locale locale = Locale.US;
                locale.getClass();
                country = networkCountryIso.toUpperCase(locale);
                country.getClass();
            }
        } catch (Exception unused6) {
        }
        if (country == null || country.length() == 0) {
            country = m19143a().getCountry();
            country.getClass();
        }
        this.f56195b = country;
        try {
            int i = to3.f62638e;
            Object objInvoke4 = to3.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, this.f56204k.f11000a);
            Integer num = objInvoke4 instanceof Integer ? (Integer) objInvoke4 : null;
            if (num != null) {
                num.intValue();
            }
        } catch (ClassNotFoundException unused7) {
            lj5.f49738c.mo16257c("Google Play Services Util not found!");
        } catch (IllegalAccessException unused8) {
            lj5.f49738c.mo16257c("Google Play Services not available");
        } catch (Exception e) {
            lj5.f49738c.mo16257c("Error when checking for Google Play Services: " + e);
        } catch (NoClassDefFoundError unused9) {
            lj5.f49738c.mo16257c("Google Play Services Util not found!");
        } catch (NoSuchMethodException unused10) {
            lj5.f49738c.mo16257c("Google Play Services not available");
        } catch (InvocationTargetException unused11) {
            lj5.f49738c.mo16257c("Google Play Services not available");
        }
        if (this.f56204k.f11002c) {
            try {
                Object objInvoke5 = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, this.f56204k.f11000a);
                Object objInvoke6 = Tasks.class.getMethod("await", Task.class).invoke(null, objInvoke5.getClass().getMethod("getAppSetIdInfo", null).invoke(objInvoke5, null));
                Object objInvoke7 = objInvoke6.getClass().getMethod("getId", null).invoke(objInvoke6, null);
                objInvoke7.getClass();
                str6 = (String) objInvoke7;
            } catch (ClassNotFoundException unused12) {
                lj5.f49738c.mo16257c("Google Play Services SDK not found for app set id!");
            } catch (InvocationTargetException unused13) {
                lj5.f49738c.mo16257c("Google Play Services not available for app set id");
            } catch (Exception unused14) {
                lj5.f49738c.mo16255a("Encountered an error connecting to Google Play Services for app set id");
            }
        }
        this.f56203j = str6;
    }

    /* JADX INFO: renamed from: a */
    public static Locale m19143a() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        locales.getClass();
        Locale locale = locales.isEmpty() ? Locale.getDefault() : locales.get(0);
        locale.getClass();
        return locale;
    }
}
