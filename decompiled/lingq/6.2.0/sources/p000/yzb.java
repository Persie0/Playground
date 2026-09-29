package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.zzjd;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yzb implements InterfaceC2991f7 {

    /* JADX INFO: renamed from: a */
    public Object f70718a;

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public void mo2125c(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f70718a;
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.f1008b;
        int i = activityResult.f1007a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            AbstractC0985a.m5508i("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjd.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i);
        }
        int i2 = AbstractC0985a.m5504e(intent, "ProxyBillingActivityV2").f57553a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f11293X;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            AbstractC0985a.m5508i("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (i2 != 0) {
            AbstractC0985a.m5508i("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }
}
