package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import p000.C3028g7;
import p000.C3399o7;
import p000.jh9;
import p000.nha;
import p000.pk9;
import p000.sua;
import p000.uc1;
import p000.yzb;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivityV2 extends uc1 {

    /* JADX INFO: renamed from: Q */
    public C3399o7 f11286Q;

    /* JADX INFO: renamed from: R */
    public C3399o7 f11287R;

    /* JADX INFO: renamed from: S */
    public C3399o7 f11288S;

    /* JADX INFO: renamed from: T */
    public C3399o7 f11289T;

    /* JADX INFO: renamed from: U */
    public ResultReceiver f11290U;

    /* JADX INFO: renamed from: V */
    public ResultReceiver f11291V;

    /* JADX INFO: renamed from: W */
    public ResultReceiver f11292W;

    /* JADX INFO: renamed from: X */
    public ResultReceiver f11293X;

    @Override // p000.uc1, p000.tc1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 2;
        this.f11286Q = (C3399o7) m22671i(new sua(this, i), new C3028g7(i));
        this.f11287R = (C3399o7) m22671i(new jh9(this, 6), new C3028g7(i));
        this.f11288S = (C3399o7) m22671i(new nha(this), new C3028g7(i));
        pk9 c3028g7 = new C3028g7(i);
        yzb yzbVar = new yzb();
        yzbVar.f70718a = this;
        this.f11289T = (C3399o7) m22671i(yzbVar, c3028g7);
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f11290U = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f11291V = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f11292W = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.f11293X = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
                return;
            }
            return;
        }
        AbstractC0985a.m5507h("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f11290U = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            C3399o7 c3399o7 = this.f11286Q;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            c3399o7.mo276a(new IntentSenderRequest(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f11291V = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            C3399o7 c3399o8 = this.f11287R;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            c3399o8.mo276a(new IntentSenderRequest(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f11292W = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            C3399o7 c3399o9 = this.f11288S;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            c3399o9.mo276a(new IntentSenderRequest(intentSender3, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.f11293X = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            C3399o7 c3399o10 = this.f11289T;
            pendingIntent4.getClass();
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            intentSender4.getClass();
            c3399o10.mo276a(new IntentSenderRequest(intentSender4, null, 0, 0));
        }
    }

    @Override // p000.uc1, p000.tc1, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f11290U;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f11291V;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f11292W;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f11293X;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
    }
}
