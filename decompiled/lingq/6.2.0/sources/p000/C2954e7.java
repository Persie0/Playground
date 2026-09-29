package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.sequences.AbstractC3204c;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: loaded from: classes.dex */
@jj6("activity")
public class C2954e7 extends kj6 {

    /* JADX INFO: renamed from: c */
    public final Context f36788c;

    /* JADX INFO: renamed from: d */
    public final Activity f36789d;

    public C2954e7(Context context) {
        this.f36788c = context;
        for (Object obj : AbstractC3204c.m15418n0(context, new C2951e4(1))) {
            if (((Context) obj) instanceof Activity) {
                this.f36789d = (Activity) obj;
            }
        }
        obj = null;
        this.f36789d = (Activity) obj;
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: a */
    public final r86 mo10901a() {
        return new C2917d7(this);
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: c */
    public final r86 mo10902c(r86 r86Var, Bundle bundle, wd6 wd6Var) {
        Intent intent;
        int intExtra;
        C2917d7 c2917d7 = (C2917d7) r86Var;
        C3488q8 c3488q8 = c2917d7.f58881b;
        if (c2917d7.m10137m() == null) {
            gm5.m12751g(wq1.m24123s(new StringBuilder("Destination "), c3488q8.f57368b, " does not have an Intent set."));
            return null;
        }
        Intent intent2 = new Intent(c2917d7.m10137m());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strM10136l = c2917d7.m10136l();
            if (strM10136l != null && strM10136l.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strM10136l);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strM10136l).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    x76 x76Var = (x76) c2917d7.m20442h().get(strGroup);
                    de6 de6Var = x76Var != null ? x76Var.f67888a : null;
                    stringBuffer.append(de6Var != null ? de6Var.mo10314f(de6Var.mo301a(strGroup, bundle)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f36789d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (wd6Var != null && wd6Var.f66649a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c3488q8.f57368b);
        Context context = this.f36788c;
        Resources resources = context.getResources();
        if (wd6Var != null) {
            int i = wd6Var.f66656h;
            int i2 = wd6Var.f66657i;
            if ((i <= 0 || !fa4.m11650l(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !fa4.m11650l(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2).getClass();
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + c2917d7);
            }
        }
        context.startActivity(intent2);
        if (wd6Var != null && activity != null) {
            int i3 = wd6Var.f66654f;
            int i4 = wd6Var.f66655g;
            if ((i3 > 0 && fa4.m11650l(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && fa4.m11650l(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + c2917d7);
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // p000.kj6
    /* JADX INFO: renamed from: j */
    public final boolean mo10903j() {
        Activity activity = this.f36789d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
