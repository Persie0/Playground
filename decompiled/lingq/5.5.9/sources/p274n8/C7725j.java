package p274n8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.login.LoginClient;
import dm.C5207g;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p173i8.C6205a;
import p317p7.C8204k;

/* JADX INFO: renamed from: n8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7725j {

    /* JADX INFO: renamed from: d */
    public static final ScheduledExecutorService f42268d;

    /* JADX INFO: renamed from: a */
    public final String f42269a;

    /* JADX INFO: renamed from: b */
    public final C8204k f42270b;

    /* JADX INFO: renamed from: c */
    public final String f42271c;

    /* JADX INFO: renamed from: n8.j$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static final Bundle m15311a(String str) {
            ScheduledExecutorService scheduledExecutorService = C7725j.f42268d;
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    static {
        new a();
        f42268d = Executors.newSingleThreadScheduledExecutor();
    }

    public C7725j(Context context, String str) {
        PackageInfo packageInfo;
        C5207g.m11111f(str, "applicationId");
        this.f42269a = str;
        this.f42270b = new C8204k(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f42271c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15310a(String str, String str2) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            Bundle bundleM15311a = a.m15311a("");
            bundleM15311a.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
            bundleM15311a.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            bundleM15311a.putString("3_method", str2);
            this.f42270b.m16340a(bundleM15311a, str);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
