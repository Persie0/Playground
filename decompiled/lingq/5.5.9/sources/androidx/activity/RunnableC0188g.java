package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: androidx.activity.g */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0188g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f484a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntentSender.SendIntentException f485b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ComponentActivity.C0174b f486c;

    public RunnableC0188g(ComponentActivity.C0174b c0174b, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f486c = c0174b;
        this.f484a = i10;
        this.f485b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f486c.m866a(this.f484a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f485b));
    }
}
