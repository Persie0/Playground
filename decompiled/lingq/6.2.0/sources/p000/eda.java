package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import com.google.common.collect.ImmutableList;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class eda implements agd {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f37080a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f37081b = 9;

    /* JADX INFO: renamed from: c */
    public static final int f37082c = 6;

    /* JADX INFO: renamed from: d */
    public static final int f37083d = 10;

    /* JADX INFO: renamed from: e */
    public static final int f37084e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f37085f = 15;

    /* JADX INFO: renamed from: g */
    public static final int f37086g = 48;

    /* JADX INFO: renamed from: a */
    public static final boolean m11069a(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        str.getClass();
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
        if (listQueryIntentActivities != null) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (fa4.m11650l(activityInfo.name, "com.facebook.CustomTabActivity") && fa4.m11650l(activityInfo.packageName, context.getPackageName())) {
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final void m11070c(Context context) {
        ActivityInfo activityInfo;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            Log.w("eda", "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m11071d(String str, String str2) {
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        C3386nv.m17624j(wq1.m24118n("Argument '", str2, "' cannot be empty"));
    }

    /* JADX INFO: renamed from: e */
    public static final void m11072e(op3 op3Var) {
        op3Var.getClass();
        Iterator it = op3Var.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                C3386nv.m17635v("Container 'requests' cannot contain null values");
                return;
            }
        }
        if (op3Var.isEmpty()) {
            C3386nv.m17624j("Container 'requests' cannot be empty");
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m11073f(String str, String str2) {
        if (str == null || str.length() <= 0) {
            C3386nv.m17624j(wq1.m24118n("Argument '", str2, "' cannot be null or empty"));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m11074g() {
        if (!sy2.f61601q.get()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Pair m11075h(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    /* JADX INFO: renamed from: i */
    public static final void m11076i(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: j */
    public static final InputStream m11077j(ny8 ny8Var) {
        pfd pfdVarM19120a;
        ohd ohdVarMo14447a = ((uid) ny8Var.f53414b).mo14447a((Uri) ny8Var.f53417e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ohdVarMo14447a);
        ArrayList arrayList2 = (ArrayList) ny8Var.f53416d;
        if (!arrayList2.isEmpty() && (pfdVarM19120a = pfd.m19120a(ohdVarMo14447a, arrayList2)) != null) {
            arrayList.add(pfdVarM19120a);
        }
        Iterator<E> it = ((ImmutableList) ny8Var.f53415c).iterator();
        if (!it.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        g9a.m12435l(it.next());
        throw null;
    }
}
