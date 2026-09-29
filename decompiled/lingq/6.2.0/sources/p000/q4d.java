package p000;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q4d {

    /* JADX INFO: renamed from: a */
    public static p04 f57274a;

    /* JADX INFO: renamed from: a */
    public static v18 m19655a(Purchase purchase) {
        JSONObject jSONObject = purchase.f11296c;
        String strOptString = jSONObject.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        return new v18(strOptString, jSONObject.optString("packageName"), (String) u91.m22589G0(purchase.m5176a()), jSONObject.optLong("purchaseTime"), purchase.m5177b(), jSONObject.optBoolean("autoRenewing"));
    }
}
