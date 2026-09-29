package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.C1005p;
import com.google.android.gms.internal.play_billing.C1006q;
import com.google.android.gms.internal.play_billing.C1010u;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.measurement.internal.C1045d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qfb extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57707a = 1;

    /* JADX INFO: renamed from: b */
    public boolean f57708b;

    /* JADX INFO: renamed from: c */
    public boolean f57709c;

    /* JADX INFO: renamed from: d */
    public final Object f57710d;

    public qfb(C1045d c1045d) {
        lda.m16130p(c1045d);
        this.f57710d = c1045d;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m19926a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f57708b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f57709c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f57708b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19927b() {
        C1045d c1045d = (C1045d) this.f57710d;
        c1045d.m5930l0();
        c1045d.mo5913d().mo12359D();
        c1045d.mo5913d().mo12359D();
        if (this.f57708b) {
            c1045d.mo5909b().f68076I.m17923a("Unregistering connectivity change receiver");
            this.f57708b = false;
            this.f57709c = false;
            try {
                c1045d.f12372l.f47433a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                c1045d.mo5909b().f68080f.m17924b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m19928c(Context context) {
        if (!this.f57708b) {
            AbstractC0985a.m5508i("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f57708b = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m19929d(Bundle bundle, qc0 qc0Var, int i, zzjk zzjkVar, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            tz1 tz1Var = (tz1) this.f57710d;
            if (byteArray != null) {
                ((qfa) ((vvb) tz1Var.f63125d)).m19921v(C1005p.m5611t(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((qfa) ((vvb) tz1Var.f63125d)).m19921v(qvb.m20182b(zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i, qc0Var, null, zzjkVar), j, z);
            }
        } catch (Throwable unused) {
            AbstractC0985a.m5508i("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x0253 A[Catch: all -> 0x026e, TRY_ENTER, TryCatch #0 {all -> 0x026e, blocks: (B:90:0x022e, B:94:0x0253, B:95:0x026a), top: B:102:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0277  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzjk zzjkVar;
        qc0 qc0VarM5504e;
        long j;
        C1010u c1010u;
        int iIntValue;
        int i = this.f57707a;
        Object obj = this.f57710d;
        switch (i) {
            case 0:
                tz1 tz1Var = (tz1) obj;
                String action = intent.getAction();
                int iHashCode = action.hashCode();
                if (iHashCode != -1484087650) {
                    if (iHashCode != -337612916) {
                        if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                            zzjkVar = zzjk.ALTERNATIVE_BILLING_ACTION;
                        } else {
                            zzjkVar = zzjk.BROADCAST_ACTION_UNSPECIFIED;
                        }
                    } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                        zzjkVar = zzjk.LOCAL_PURCHASES_UPDATED_ACTION;
                    } else {
                        zzjkVar = zzjk.BROADCAST_ACTION_UNSPECIFIED;
                    }
                } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                    zzjkVar = zzjk.PURCHASES_UPDATED_ACTION;
                } else {
                    zzjkVar = zzjk.BROADCAST_ACTION_UNSPECIFIED;
                }
                zzjk zzjkVar2 = zzjkVar;
                zzjk zzjkVar3 = zzjk.LOCAL_PURCHASES_UPDATED_ACTION;
                int i2 = (zzjkVar2.equals(zzjkVar3) || zzjkVar2.equals(zzjk.ALTERNATIVE_BILLING_ACTION)) ? 2 : zzjkVar2.equals(zzjk.PURCHASES_UPDATED_ACTION) ? 32 : 1;
                Bundle extras = intent.getExtras();
                ArrayList arrayList = null;
                if (extras != null) {
                    if (i2 == 2) {
                        int i3 = AbstractC0985a.f12176a;
                        sq6 sq6VarM19857a = qc0.m19857a();
                        sq6VarM19857a.f61253a = AbstractC0985a.m5500a("BillingBroadcastManager", intent.getExtras());
                        Bundle extras2 = intent.getExtras();
                        if (extras2 == null) {
                            AbstractC0985a.m5508i("BillingBroadcastManager", "Unexpected null bundle received!");
                        } else {
                            Object obj2 = extras2.get("SUB_RESPONSE_CODE");
                            if (obj2 == null) {
                                AbstractC0985a.m5507h("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                            } else {
                                if (obj2 instanceof Integer) {
                                    iIntValue = ((Integer) obj2).intValue();
                                } else {
                                    AbstractC0985a.m5508i("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj2.getClass().getName()));
                                }
                                sq6VarM19857a.f61254b = iIntValue;
                                sq6VarM19857a.f61255c = AbstractC0985a.m5505f("BillingBroadcastManager", intent.getExtras());
                                qc0VarM5504e = sq6VarM19857a.m21585u();
                            }
                        }
                        iIntValue = 0;
                        sq6VarM19857a.f61254b = iIntValue;
                        sq6VarM19857a.f61255c = AbstractC0985a.m5505f("BillingBroadcastManager", intent.getExtras());
                        qc0VarM5504e = sq6VarM19857a.m21585u();
                    } else {
                        qc0VarM5504e = AbstractC0985a.m5504e(intent, "BillingBroadcastManager");
                    }
                    long j2 = extras.getLong("billingClientTransactionId", 0L);
                    boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
                    if (zzjkVar2.equals(zzjk.PURCHASES_UPDATED_ACTION) || zzjkVar2.equals(zzjkVar3)) {
                        qc0 qc0Var = qc0VarM5504e;
                        int i4 = i2;
                        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        ArrayList arrayList2 = new ArrayList();
                        if (stringArrayList == null || stringArrayList2 == null) {
                            j = 0;
                            Purchase purchaseM5510k = AbstractC0985a.m5510k(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                            if (purchaseM5510k == null) {
                                AbstractC0985a.m5507h("BillingHelper", "Couldn't find single purchase data as well.");
                            } else {
                                arrayList2.add(purchaseM5510k);
                            }
                            if (qc0Var.f57553a == 0) {
                                vvb vvbVar = (vvb) tz1Var.f63125d;
                                C1006q c1006qM20183c = qvb.m20183c(i4, zzjkVar2);
                                qfa qfaVar = (qfa) vvbVar;
                                qfaVar.getClass();
                                try {
                                    wmc wmcVar = (wmc) c1006qM20183c.m5541l();
                                    prc prcVar = (prc) c1006qM20183c.m5621s().m5541l();
                                    prcVar.m19466c(z);
                                    wmcVar.m24056d(prcVar);
                                    C1006q c1006q = (C1006q) wmcVar.m18947a();
                                    c1010u = (C1010u) qfaVar.f57705a;
                                    if (j2 != j) {
                                        bqc bqcVar = (bqc) c1010u.m5541l();
                                        bqcVar.m18948b();
                                        C1010u.m5636E((C1010u) bqcVar.f55715b, j2);
                                        c1010u = (C1010u) bqcVar.m18947a();
                                    }
                                    qfaVar.m19905B(c1006q, c1010u);
                                } catch (Throwable th) {
                                    AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
                                }
                            } else {
                                m19929d(extras, qc0Var, i4, zzjkVar2, j2, z);
                            }
                            ((pc0) tz1Var.f63124c).m19061b(qc0Var, arrayList);
                        } else {
                            j = 0;
                            AbstractC0985a.m5507h("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                            for (int i5 = 0; i5 < stringArrayList.size() && i5 < stringArrayList2.size(); i5++) {
                                Purchase purchaseM5510k2 = AbstractC0985a.m5510k(stringArrayList.get(i5), stringArrayList2.get(i5));
                                if (purchaseM5510k2 != null) {
                                    arrayList2.add(purchaseM5510k2);
                                }
                            }
                        }
                        arrayList = arrayList2;
                        if (qc0Var.f57553a == 0) {
                            vvb vvbVar2 = (vvb) tz1Var.f63125d;
                            C1006q c1006qM20183c2 = qvb.m20183c(i4, zzjkVar2);
                            qfa qfaVar2 = (qfa) vvbVar2;
                            qfaVar2.getClass();
                            wmc wmcVar2 = (wmc) c1006qM20183c2.m5541l();
                            prc prcVar2 = (prc) c1006qM20183c2.m5621s().m5541l();
                            prcVar2.m19466c(z);
                            wmcVar2.m24056d(prcVar2);
                            C1006q c1006q2 = (C1006q) wmcVar2.m18947a();
                            c1010u = (C1010u) qfaVar2.f57705a;
                            if (j2 != j) {
                                bqc bqcVar2 = (bqc) c1010u.m5541l();
                                bqcVar2.m18948b();
                                C1010u.m5636E((C1010u) bqcVar2.f55715b, j2);
                                c1010u = (C1010u) bqcVar2.m18947a();
                            }
                            qfaVar2.m19905B(c1006q2, c1010u);
                        } else {
                            m19929d(extras, qc0Var, i4, zzjkVar2, j2, z);
                        }
                        ((pc0) tz1Var.f63124c).m19061b(qc0Var, arrayList);
                        break;
                    } else if (zzjkVar2.equals(zzjk.ALTERNATIVE_BILLING_ACTION)) {
                        if (qc0VarM5504e.f57553a != 0) {
                            qc0 qc0Var2 = qc0VarM5504e;
                            m19929d(extras, qc0Var2, i2, zzjkVar2, j2, z);
                            ((pc0) tz1Var.f63124c).m19061b(qc0Var2, zzbw.m5669n());
                        } else {
                            int i6 = i2;
                            tz1Var.getClass();
                            AbstractC0985a.m5508i("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                            vvb vvbVar3 = (vvb) tz1Var.f63125d;
                            zzjd zzjdVar = zzjd.NULL_DEVELOPER_MANAGED_BILLING_LISTENER;
                            qc0 qc0Var3 = wwb.f67443h;
                            ((qfa) vvbVar3).m19921v(qvb.m20182b(zzjdVar, i6, qc0Var3, null, zzjkVar2), j2, z);
                            ((pc0) tz1Var.f63124c).m19061b(qc0Var3, zzbw.m5669n());
                        }
                    }
                } else {
                    AbstractC0985a.m5508i("BillingBroadcastManager", "Bundle is null.");
                    vvb vvbVar4 = (vvb) tz1Var.f63125d;
                    zzjd zzjdVar2 = zzjd.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
                    qc0 qc0Var4 = wwb.f67443h;
                    ((qfa) vvbVar4).m19917q(qvb.m20182b(zzjdVar2, i2, qc0Var4, null, zzjkVar2));
                    pc0 pc0Var = (pc0) tz1Var.f63124c;
                    if (pc0Var != null) {
                        pc0Var.m19061b(qc0Var4, null);
                    }
                }
                break;
            default:
                C1045d c1045d = (C1045d) obj;
                c1045d.m5930l0();
                String action2 = intent.getAction();
                c1045d.mo5909b().f68076I.m17924b(action2, "NetworkBroadcastReceiver received action");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action2)) {
                    ydc ydcVar = c1045d.f12358b;
                    C1045d.m5885T(ydcVar);
                    boolean zM25102H = ydcVar.m25102H();
                    if (this.f57709c != zM25102H) {
                        this.f57709c = zM25102H;
                        c1045d.mo5913d().m22076M(new RunnableC3468pp(this, zM25102H));
                    }
                } else {
                    c1045d.mo5909b().f68083i.m17924b(action2, "NetworkBroadcastReceiver received unknown action");
                }
                break;
        }
    }

    public qfb(tz1 tz1Var, boolean z) {
        this.f57710d = tz1Var;
        this.f57709c = z;
    }
}
