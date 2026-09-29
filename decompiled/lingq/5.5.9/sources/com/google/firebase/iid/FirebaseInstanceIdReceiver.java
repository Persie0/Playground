package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C3246i;
import com.google.firebase.messaging.C3251n;
import java.util.concurrent.ExecutionException;
import p115fb.AbstractC5485a;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC5485a {
    @Override // p115fb.AbstractC5485a
    /* JADX INFO: renamed from: a */
    public final int mo9187a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.m8537a(new C3246i(context).m9263b(cloudMessage.f13853a))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // p115fb.AbstractC5485a
    /* JADX INFO: renamed from: b */
    public final void mo9188b(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (C3251n.m9270b(intentPutExtras)) {
            C3251n.m9269a(intentPutExtras.getExtras(), "_nd");
        }
    }
}
