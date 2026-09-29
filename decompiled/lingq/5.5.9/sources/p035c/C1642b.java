package p035c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import p254m2.C7472a;
import p260m8.C7499b;

/* JADX INFO: renamed from: c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1642b extends AbstractC1641a<String[], Map<String, Boolean>> {
    @Override // p035c.AbstractC1641a
    /* JADX INFO: renamed from: a */
    public final Intent mo3677a(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        C5207g.m11111f(componentActivity, "context");
        C5207g.m11111f(strArr, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C5207g.m11110e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // p035c.AbstractC1641a
    /* JADX INFO: renamed from: b */
    public final AbstractC1641a.a mo5338b(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        C5207g.m11111f(componentActivity, "context");
        C5207g.m11111f(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new AbstractC1641a.a((Serializable) C6753d.m13459L0());
        }
        for (String str : strArr) {
            if (!(C7472a.m14841a(componentActivity, str) == 0)) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return null;
        }
        int iM14941g0 = C7499b.m14941g0(strArr.length);
        if (iM14941g0 < 16) {
            iM14941g0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new AbstractC1641a.a(linkedHashMap);
    }

    @Override // p035c.AbstractC1641a
    /* JADX INFO: renamed from: c */
    public final Object mo3678c(Intent intent, int i10) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i11 == 0));
                }
                return C6753d.m13464Q0(C6752c.m13412A0(C6744b.m13378j0(stringArrayExtra), arrayList));
            }
            return C6753d.m13459L0();
        }
        return C6753d.m13459L0();
    }
}
