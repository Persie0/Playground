package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jcz {

    /* JADX INFO: renamed from: c */
    public static final int f33769c;

    /* JADX INFO: renamed from: d */
    public static final jcz f33770d;

    static {
        int i = jdm.f33802c;
        f33769c = 230608000;
        f33770d = new jcz();
    }

    /* JADX INFO: renamed from: e */
    public final int m12901e(Context context) {
        return m12902f(context, f33769c);
    }

    /* JADX INFO: renamed from: f */
    public final int m12902f(Context context, int i) {
        int iM12929a = jdm.m12929a(context, i);
        if (jdm.m12931c(context, iM12929a)) {
            return 18;
        }
        return iM12929a;
    }

    /* JADX INFO: renamed from: g */
    public final Intent m12903g(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                if (context != null && jit.m13235c(context)) {
                    Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
                    intent.setPackage("com.google.android.wearable.app");
                    return intent;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("gcore_");
                sb.append(f33769c);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(jiz.m13300b(context).m14248n(context.getPackageName(), 0).versionCode);
                        break;
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
                String string = sb.toString();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(string)) {
                    builderAppendQueryParameter.appendQueryParameter(rmwTRjObXLGH.JNwYNy, string);
                }
                intent2.setData(builderAppendQueryParameter.build());
                intent2.setPackage("com.android.vending");
                intent2.addFlags(524288);
                return intent2;
            case 3:
                Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent3.setData(uriFromParts);
                return intent3;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final PendingIntent m12904h(Context context, int i, String str) {
        Intent intentM12903g = m12903g(context, i, str);
        if (intentM12903g == null) {
            return null;
        }
        return jmv.m13375b(context, intentM12903g, 201326592);
    }
}
