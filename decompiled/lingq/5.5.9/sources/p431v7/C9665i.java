package p431v7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.internal.FeatureManager;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.C7076b;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: renamed from: v7.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9665i {

    /* JADX INFO: renamed from: a */
    public static final C9665i f49496a = new C9665i();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f49497b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static final void m18149a() {
        if (C6205a.m12742b(C9665i.class)) {
            return;
        }
        try {
            if (f49497b.get()) {
                if (f49496a.m18150b()) {
                    FeatureManager featureManager = FeatureManager.f11546a;
                    if (FeatureManager.m6666c(FeatureManager.Feature.IapLoggingLib2)) {
                        C9661e c9661e = C9661e.f49457a;
                        C9661e.m18120b(C8004n.m15871a());
                        return;
                    }
                }
                C9659c.m18119b();
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C9665i.class, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18150b() {
        if (C6205a.m12742b(this)) {
            return false;
        }
        try {
            Context contextM15871a = C8004n.m15871a();
            ApplicationInfo applicationInfo = contextM15871a.getPackageManager().getApplicationInfo(contextM15871a.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
            C5207g.m11110e(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            return string != null && Integer.parseInt((String) C7076b.m14299s3(string, new String[]{"."}, 3, 2).get(0)) >= 2;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return false;
        }
    }
}
