package p000;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class l17 {

    /* JADX INFO: renamed from: a */
    public static final String f48898a = oj5.m18041h("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static void m15740a(Context context, Class cls, boolean z) {
        String str = f48898a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                oj5.m18040f().m18042a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            oj5 oj5VarM18040f = oj5.m18040f();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            oj5VarM18040f.m18042a(str, sb.toString());
        } catch (Exception e) {
            oj5 oj5VarM18040f2 = oj5.m18040f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            String string = sb2.toString();
            if (oj5VarM18040f2.f54464a <= 3) {
                Log.d(str, string, e);
            }
        }
    }
}
