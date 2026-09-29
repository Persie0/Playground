package p035c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import dm.C5207g;
import p254m2.C7472a;

/* JADX INFO: renamed from: c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1643c extends AbstractC1641a<String, Boolean> {
    @Override // p035c.AbstractC1641a
    /* JADX INFO: renamed from: a */
    public final Intent mo3677a(ComponentActivity componentActivity, Object obj) {
        String str = (String) obj;
        C5207g.m11111f(componentActivity, "context");
        C5207g.m11111f(str, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        C5207g.m11110e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // p035c.AbstractC1641a
    /* JADX INFO: renamed from: b */
    public final AbstractC1641a.a mo5338b(ComponentActivity componentActivity, Object obj) {
        String str = (String) obj;
        C5207g.m11111f(componentActivity, "context");
        C5207g.m11111f(str, "input");
        if (C7472a.m14841a(componentActivity, str) == 0) {
            return new AbstractC1641a.a(Boolean.TRUE);
        }
        return null;
    }

    @Override // p035c.AbstractC1641a
    /* JADX INFO: renamed from: c */
    public final Object mo3678c(Intent intent, int i10) {
        boolean z10;
        if (intent == null || i10 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z11 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                if (intArrayExtra[i11] == 0) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            if (z10) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
