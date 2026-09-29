package p000;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3065h7 extends pk9 {
    @Override // p000.pk9
    /* JADX INFO: renamed from: f */
    public final Intent mo5255f(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: q */
    public final hi8 mo12391q(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        if (do7.m10532h(context, str) == 0) {
            return new hi8(Boolean.TRUE, 2);
        }
        return null;
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: u */
    public final Object mo5256u(Intent intent, int i) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z = false;
        if (intArrayExtra != null) {
            for (int i2 : intArrayExtra) {
                if (i2 == 0) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
