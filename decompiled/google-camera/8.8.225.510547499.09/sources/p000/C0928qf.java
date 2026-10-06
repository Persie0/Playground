package p000;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: qf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0928qf extends AbstractC0927qe {
    @Override // p000.AbstractC0927qe
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3937a(int i, Intent intent) {
        if (i != -1 || intent == null) {
            return okw.f46216a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return okw.f46216a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Iterator it = arrayList2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList3 = new ArrayList(Math.min(omn.m18678R(arrayList2), omn.m18678R(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(lkm.m15590q(it.next(), it2.next()));
        }
        return omn.m18663C(arrayList3);
    }

    @Override // p000.AbstractC0927qe
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Intent mo3938b(Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // p000.AbstractC0927qe
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ bkn mo19340c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new bkn(okw.f46216a, (short[]) null);
        }
        for (String str : strArr) {
            if (abx.m170b(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ook.m18789c(omn.m18721z(strArr.length), 16));
        for (String str2 : strArr) {
            okb okbVarM15590q = lkm.m15590q(str2, true);
            linkedHashMap.put(okbVarM15590q.f46186a, okbVarM15590q.f46187b);
        }
        return new bkn(linkedHashMap, (short[]) null);
    }
}
