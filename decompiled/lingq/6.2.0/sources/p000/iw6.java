package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iw6 implements cj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44707a;

    public /* synthetic */ iw6(int i) {
        this.f44707a = i;
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f44707a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ux5.m22975B((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                cx9 cx9Var = (cx9) obj5;
                String string = ((CharSequence) obj4).subSequence(cx9.m9924f(cx9Var.f34694a), cx9.m9923e(cx9Var.f34694a)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return xfaVar;
    }
}
