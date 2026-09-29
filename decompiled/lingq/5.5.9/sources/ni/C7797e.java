package ni;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.Uri;
import android.support.v4.media.session.C0166e;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0979t;
import com.kochava.tracker.BuildConfig;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import mo.C7653a;
import tk.C9312p;

/* JADX INFO: renamed from: ni.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7797e {

    /* JADX INFO: renamed from: a */
    public final Context f42873a;

    /* JADX INFO: renamed from: ni.e$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static String m15516a(String str) throws NoSuchAlgorithmException {
            C5207g.m11111f(str, "input");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(C7653a.f42116b);
            C5207g.m11110e(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            C5207g.m11110e(bArrDigest, "getInstance(algorithm)\n …gest(input.toByteArray())");
            String strM765k = "";
            for (byte b10 : bArrDigest) {
                strM765k = C0166e.m765k(strM765k, C0166e.m770q(new Object[]{Byte.valueOf(b10)}, 1, "%02x", "format(this, *args)"));
            }
            return strM765k;
        }
    }

    public C7797e(Context context) {
        this.f42873a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m15508a(ActivityC0979t activityC0979t) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@LingQ.com"});
        intent.putExtra("android.intent.extra.SUBJECT", "Android Support v".concat(m15509b()));
        try {
            activityC0979t.startActivity(Intent.createChooser(intent, "Send mail"));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activityC0979t, "There are no email clients installed.", 0).show();
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m15509b() {
        try {
            Context context = this.f42873a;
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            C5207g.m11110e(str, "packageInfo.versionName");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m15510c(String str) {
        String string;
        Context context = this.f42873a;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
            C5207g.m11110e(applicationInfo, "context.packageManager.g…T_META_DATA\n            )");
            string = applicationInfo.metaData.getString(str);
            if (string == null) {
                string = "all";
            }
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
        }
        return string;
    }

    /* JADX INFO: renamed from: d */
    public final String m15511d() {
        String strM15515h = m15515h("language_list.txt");
        Map map = strM15515h != null ? (Map) new C4955q(new C4955q.a()).m10564b(C9312p.m17659d(Map.class, String.class, String.class)).m10532b(strM15515h) : null;
        Locale locale = Locale.getDefault();
        if (map == null || ((String) map.get(locale.getLanguage())) == null) {
            return "en";
        }
        String language = locale.getLanguage();
        C5207g.m11110e(language, "current.language");
        return language;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15512e() {
        Object systemService = this.f42873a.getSystemService("connectivity");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || connectivityManager.getNetworkCapabilities(activeNetwork) == null) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15513f() {
        return (this.f42873a.getApplicationInfo().flags & 2) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15514g() {
        return C5207g.m11106a(m15510c("app_code"), "LingQ");
    }

    /* JADX INFO: renamed from: h */
    public final String m15515h(String str) {
        try {
            InputStream inputStreamOpen = this.f42873a.getAssets().open(str);
            C5207g.m11110e(inputStreamOpen, "context.assets.open(fileName)");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            Charset charset = StandardCharsets.UTF_8;
            C5207g.m11110e(charset, "UTF_8");
            return new String(bArr, charset);
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
