package p066d7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: d7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5053e {
    /* JADX INFO: renamed from: a */
    public static boolean m10731a(Context context, Intent intent) {
        return (intent == null || context.getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10732b(Context context) {
        try {
            if (!"xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
                return false;
            }
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "ro.miui.ui.version.code");
            if (str != null && !TextUtils.isEmpty(str.trim())) {
                return true;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (!m10731a(context, new Intent("miui.intent.action.OP_AUTO_START").addCategory("android.intent.category.DEFAULT")) && !m10731a(context, new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"))) && !m10731a(context, new Intent("miui.intent.action.POWER_HIDE_MODE_APP_LIST").addCategory("android.intent.category.DEFAULT")) && !m10731a(context, new Intent().setComponent(new ComponentName("com.miui.securitycenter", "com.miui.powercenter.PowerSettings")))) {
            return false;
        }
        return true;
    }
}
