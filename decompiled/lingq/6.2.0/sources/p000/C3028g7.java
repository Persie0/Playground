package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.AbstractC0638f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: renamed from: g7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3028g7 extends pk9 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ int f40286A;

    public /* synthetic */ C3028g7(int i) {
        this.f40286A = i;
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: f */
    public final Intent mo5255f(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f40286A) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 1:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            case 2:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                intentSenderRequest.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                intentPutExtra2.getClass();
                return intentPutExtra2;
            default:
                IntentSenderRequest intentSenderRequestM10556e = (IntentSenderRequest) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intentM636a = intentSenderRequestM10556e.m636a();
                if (intentM636a != null && (bundleExtra = intentM636a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intentM636a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intentM636a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        doa doaVar = new doa(intentSenderRequestM10556e.m639d());
                        doaVar.m10561j(intentSenderRequestM10556e.m638c(), intentSenderRequestM10556e.m637b());
                        intentSenderRequestM10556e = doaVar.m10556e();
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequestM10556e);
                if (AbstractC0638f.m2128L(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: q */
    public hi8 mo12391q(Context context, Object obj) {
        switch (this.f40286A) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                int i = 2;
                if (strArr.length == 0) {
                    return new hi8((Serializable) AbstractC3194a.m15360M(), i);
                }
                for (String str : strArr) {
                    if (do7.m10532h(context, str) != 0) {
                        return null;
                    }
                }
                int iM15363P = AbstractC3194a.m15363P(strArr.length);
                if (iM15363P < 16) {
                    iM15363P = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new hi8(linkedHashMap, i);
            default:
                return super.mo12391q(context, obj);
        }
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: u */
    public final Object mo5256u(Intent intent, int i) {
        switch (this.f40286A) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra == null || stringArrayExtra == null) {
                        return AbstractC3194a.m15360M();
                    }
                    ArrayList arrayList = new ArrayList(intArrayExtra.length);
                    for (int i2 : intArrayExtra) {
                        arrayList.add(Boolean.valueOf(i2 == 0));
                    }
                    ArrayList arrayListM20837e0 = AbstractC3550rv.m20837e0(stringArrayExtra);
                    Iterator it = arrayListM20837e0.iterator();
                    Iterator it2 = arrayList.iterator();
                    ArrayList arrayList2 = new ArrayList(Math.min(v91.m23189q0(arrayListM20837e0, 10), v91.m23189q0(arrayList, 10)));
                    while (it.hasNext() && it2.hasNext()) {
                        arrayList2.add(new Pair(it.next(), it2.next()));
                    }
                    return AbstractC3194a.m15370W(arrayList2);
                }
                return AbstractC3194a.m15360M();
            case 1:
                return new ActivityResult(intent, i);
            case 2:
                return new ActivityResult(intent, i);
            default:
                return new ActivityResult(intent, i);
        }
    }
}
