package p289o5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.C2933a;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import p081e0.C5298b1;

/* JADX INFO: renamed from: o5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7941u extends BroadcastReceiver {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f43258d = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC7927g f43259a;

    /* JADX INFO: renamed from: b */
    public boolean f43260b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5298b1 f43261c;

    public /* synthetic */ C7941u(C5298b1 c5298b1, InterfaceC7927g interfaceC7927g) {
        this.f43261c = c5298b1;
        this.f43259a = interfaceC7927g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        InterfaceC7927g interfaceC7927g = this.f43259a;
        if (extras == null) {
            C2933a.m8515g("BillingBroadcastManager", "Bundle is null.");
            if (interfaceC7927g != null) {
                interfaceC7927g.mo13091a(C7939s.f43248h, null);
                return;
            }
            return;
        }
        C7925e c7925eM8511c = C2933a.m8511c(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (c7925eM8511c.f43186a != 0) {
                    interfaceC7927g.mo13091a(c7925eM8511c, zzu.m8528Q());
                    return;
                } else {
                    C2933a.m8515g("BillingBroadcastManager", "AlternativeBillingListener is null.");
                    interfaceC7927g.mo13091a(C7939s.f43248h, zzu.m8528Q());
                }
            }
            return;
        }
        if (extras.getBoolean("IS_FIRST_PARTY_PURCHASE", false) || interfaceC7927g == null) {
            C2933a.m8515g("BillingBroadcastManager", "Received purchase and no valid listener registered.");
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseM8517i = C2933a.m8517i(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseM8517i == null) {
                C2933a.m8514f("BillingHelper", "Couldn't find single purchase data as well.");
            } else {
                arrayList2.add(purchaseM8517i);
            }
            interfaceC7927g.mo13091a(c7925eM8511c, arrayList);
        }
        C2933a.m8514f("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
            Purchase purchaseM8517i2 = C2933a.m8517i(stringArrayList.get(i10), stringArrayList2.get(i10));
            if (purchaseM8517i2 != null) {
                arrayList2.add(purchaseM8517i2);
            }
        }
        arrayList = arrayList2;
        interfaceC7927g.mo13091a(c7925eM8511c, arrayList);
    }
}
