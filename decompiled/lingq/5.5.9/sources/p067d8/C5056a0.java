package p067d8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v4.media.C0141b;
import com.facebook.FacebookSdkNotInitializedException;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p291o7.C8004n;

/* JADX INFO: renamed from: d8.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5056a0 {

    /* JADX INFO: renamed from: a */
    public static final String f32910a;

    static {
        new C5056a0();
        f32910a = C5056a0.class.getName();
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m10743a(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        C5207g.m11111f(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!C5207g.m11106a(activityInfo.name, "com.facebook.CustomTabActivity") || !C5207g.m11106a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public static final void m10744b(String str, String str2) {
        C5207g.m11111f(str, "arg");
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException(C0141b.m611g("Argument '", str2, "' cannot be empty").toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10745c(Collection collection) {
        C5207g.m11111f(collection, "container");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (!(!collection.isEmpty())) {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static final void m10746d(String str, String str2) {
        boolean z10 = false;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            }
        }
        if (!z10) {
            throw new IllegalArgumentException(C0141b.m611g("Argument '", str2, "' cannot be null or empty").toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m10747e() {
        if (!C8004n.m15878h()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
