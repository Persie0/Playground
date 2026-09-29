package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class nha implements InterfaceC2991f7, InterfaceC3016fw {

    /* JADX INFO: renamed from: a */
    public final Object f52742a;

    public nha(s7b s7bVar) {
        s7bVar.getClass();
        this.f52742a = s7bVar;
    }

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public void mo2125c(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f52742a;
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.f1008b;
        int i = activityResult.f1007a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            AbstractC0985a.m5508i("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjd.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i);
        }
        int i2 = AbstractC0985a.m5504e(intent, "ProxyBillingActivityV2").f57553a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f11292W;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            AbstractC0985a.m5508i("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i2 != 0) {
            AbstractC0985a.m5508i("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // p000.InterfaceC3016fw
    public /* synthetic */ ListenableFuture call() {
        return (AbstractC1112b) this.f52742a;
    }

    public nha(lrc lrcVar, byte[] bArr) {
        this.f52742a = bArr;
    }

    public /* synthetic */ nha(Object obj) {
        this.f52742a = obj;
    }
}
