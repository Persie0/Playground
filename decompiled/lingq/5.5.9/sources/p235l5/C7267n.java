package p235l5;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import p026b5.AbstractC1314g;

/* JADX INFO: renamed from: l5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7267n {

    /* JADX INFO: renamed from: a */
    public static final String f40757a = AbstractC1314g.m4868f("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static void m14658a(Context context, Class<?> cls, boolean z10) {
        String str = f40757a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            abstractC1314gM4867d.mo4869a(str, sb2.toString());
        } catch (Exception e10) {
            AbstractC1314g abstractC1314gM4867d2 = AbstractC1314g.m4867d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            String string = sb3.toString();
            if (((AbstractC1314g.a) abstractC1314gM4867d2).f8062c <= 3) {
                Log.d(str, string, e10);
            }
        }
    }
}
