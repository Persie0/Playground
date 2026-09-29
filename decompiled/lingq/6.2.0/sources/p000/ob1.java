package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ob1 {
    public static final mb1 Companion = new mb1();

    /* JADX INFO: renamed from: a */
    public final Context f54126a;

    public ob1(Context context) {
        this.f54126a = context;
    }

    /* JADX INFO: renamed from: e */
    public static String m17887e(String str) {
        yf4 yf4VarM21704c = ss5.m21704c(new C3013ft(13));
        try {
            try {
                try {
                    return u91.m22596N0((Iterable) yf4VarM21704c.m10321a(str, new C2978ev(sk9.f60959a)), "\n", null, null, null, 62);
                } catch (Exception unused) {
                    sk9 sk9Var = sk9.f60959a;
                    return (String) u91.m22590H0(((Map) yf4VarM21704c.m10321a(str, thb.m22043b(sk9Var, sk9Var))).values());
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            sk9 sk9Var2 = sk9.f60959a;
            return u91.m22596N0(v91.m23190r0(((Map) yf4VarM21704c.m10321a(str, thb.m22043b(sk9Var2, new C2978ev(sk9Var2)))).values()), "\n", null, null, null, 62);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17888a(id3 id3Var) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@LingQ.com"});
        intent.putExtra("android.intent.extra.SUBJECT", "Android Support v".concat(m17889b()));
        try {
            id3Var.startActivity(Intent.createChooser(intent, "Send mail"));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(id3Var, "There are no email clients installed.", 0).show();
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m17889b() {
        try {
            Context context = this.f54126a;
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m17890c() {
        String strM17897k = m17897k("country_list.txt");
        yf4 yf4VarM21704c = ss5.m21704c(new C3013ft(15));
        sk9 sk9Var = sk9.f60959a;
        Map map = strM17897k != null ? (Map) yf4VarM21704c.m10321a(strM17897k, thb.m22043b(sk9Var, sk9Var)) : null;
        Context context = this.f54126a;
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        String networkCountryIso = ((TelephonyManager) systemService).getNetworkCountryIso();
        networkCountryIso.getClass();
        if (networkCountryIso.length() == 0) {
            networkCountryIso = context.getResources().getConfiguration().getLocales().get(0).getCountry();
        }
        if (map == null || map.isEmpty()) {
            return "Canada";
        }
        networkCountryIso.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = networkCountryIso.toUpperCase(locale);
        upperCase.getClass();
        String str = (String) map.get(upperCase);
        if (str != null) {
            return !str.equals("Canada") ? str : "Canada";
        }
        return "Korea, North";
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17891d() {
        Context context = this.f54126a;
        try {
            Object obj = Class.forName(context.getPackageName() + ".BuildConfig").getField("DEV_OPTIONS_AVAILABLE").get(null);
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            return (context.getApplicationInfo().flags & 2) != 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m17892f(String str) {
        Context context = this.f54126a;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            String string = applicationInfo.metaData.getString(str);
            return string == null ? "all" : string;
        } catch (Exception e) {
            r43.m20289a().m20290b(e);
            return "all";
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m17893g() {
        String strM17897k = m17897k("language_list.txt");
        yf4 yf4VarM21704c = ss5.m21704c(new C3013ft(14));
        sk9 sk9Var = sk9.f60959a;
        Map map = strM17897k != null ? (Map) yf4VarM21704c.m10321a(strM17897k, thb.m22043b(sk9Var, sk9Var)) : null;
        Locale locale = Locale.getDefault();
        if (map == null || ((String) map.get(locale.getLanguage())) == null) {
            return "en";
        }
        String language = locale.getLanguage();
        language.getClass();
        return language;
    }

    /* JADX INFO: renamed from: h */
    public final String m17894h() {
        String str;
        String strM17897k = m17897k("language_list.txt");
        yf4 yf4VarM21704c = ss5.m21704c(new C3013ft(16));
        sk9 sk9Var = sk9.f60959a;
        Map map = strM17897k != null ? (Map) yf4VarM21704c.m10321a(strM17897k, thb.m22043b(sk9Var, sk9Var)) : null;
        return (map == null || (str = (String) map.get(Locale.getDefault().getLanguage())) == null) ? "English" : str;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m17895i() {
        Object systemService = this.f54126a.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || connectivityManager.getNetworkCapabilities(activeNetwork) == null) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m17896j() {
        return m17892f("app_code").equals("LingQ");
    }

    /* JADX INFO: renamed from: k */
    public final String m17897k(String str) {
        try {
            InputStream inputStreamOpen = this.f54126a.getAssets().open(str);
            inputStreamOpen.getClass();
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            return new String(bArr, charset);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
