package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private ResultReceiver f8220a;

    /* JADX INFO: renamed from: a */
    private final void m4868a() {
        ResultReceiver resultReceiver = this.f8220a;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.f8220a) != null) {
            if (i2 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i2 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            Intent intent2 = new Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.f8220a = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f8220a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            m4868a();
            finish();
        } else {
            try {
                startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent, 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                m4868a();
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f8220a);
    }
}
