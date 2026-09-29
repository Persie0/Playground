package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kgd {
    /* JADX INFO: renamed from: a */
    public static boolean m15193a(Context context, ck6 ck6Var) {
        if (ck6Var != null) {
            if (((JSONObject) ck6Var.f10194b).optString("type", null) != null && ((JSONObject) ck6Var.f10194b).optString("type", null).equals("openUrl")) {
                Uri uri = Uri.parse(((JSONObject) ck6Var.f10194b).optString("data", null));
                String str = uri.toString().split("://")[0];
                if (!str.equals("https")) {
                    String[] strArr = (String[]) fb4.f38769t.f38771b.f49400f;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            eh0.m11133m("IterableUtilImpl", str.concat(" is not in the allowed protocols"));
                            return false;
                        }
                        if (str.equals(strArr[i])) {
                            break;
                        }
                        i++;
                    }
                }
                fb4.f38769t.f38771b.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                if (context.getPackageManager() == null) {
                    eh0.m11135p("IterableActionRunner", "Could not find package manager to handle deep link:" + uri);
                    return false;
                }
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                if (listQueryIntentActivities.size() > 1) {
                    for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                        if (resolveInfo.activityInfo.packageName.equals(context.getPackageName())) {
                            Log.d("IterableActionRunner", "The deep link will be handled by the app: " + resolveInfo.activityInfo.packageName);
                            intent.setPackage(resolveInfo.activityInfo.packageName);
                            break;
                        }
                    }
                }
                intent.setFlags(872415232);
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                    return true;
                }
                eh0.m11135p("IterableActionRunner", "Could not find activities to handle deep link:" + uri);
                return false;
            }
            if (((JSONObject) ck6Var.f10194b).optString("type", null) != null && !((JSONObject) ck6Var.f10194b).optString("type", null).isEmpty()) {
                fb4.f38769t.f38771b.getClass();
            }
        }
        return false;
    }
}
