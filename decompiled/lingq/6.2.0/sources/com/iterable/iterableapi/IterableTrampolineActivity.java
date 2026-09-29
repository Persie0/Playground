package com.iterable.iterableapi;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import p000.AbstractActivityC2935dp;
import p000.eh0;
import p000.te1;

/* JADX INFO: loaded from: classes2.dex */
public class IterableTrampolineActivity extends AbstractActivityC2935dp {
    @Override // p000.id3, p000.uc1, p000.tc1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eh0.m11120Q("TrampolineActivity", "Notification Trampoline Activity created");
    }

    @Override // p000.AbstractActivityC2935dp, p000.id3, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        eh0.m11120Q("TrampolineActivity", "Notification Trampoline Activity destroyed");
    }

    @Override // p000.id3, android.app.Activity
    public final void onPause() {
        super.onPause();
        eh0.m11120Q("TrampolineActivity", "Notification Trampoline Activity on pause");
    }

    @Override // p000.id3, android.app.Activity
    public final void onResume() {
        super.onResume();
        eh0.m11120Q("TrampolineActivity", "Notification Trampoline Activity resumed");
        Intent intent = getIntent();
        if (intent == null) {
            eh0.m11133m("TrampolineActivity", "Intent is null. Doing nothing.");
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            eh0.m11133m("TrampolineActivity", "Intent action is null. Doing nothing.");
            finish();
            return;
        }
        ((NotificationManager) getSystemService("notification")).cancel(intent.getIntExtra("requestCode", 0));
        te1.m22002p(this);
        if ("com.iterable.push.ACTION_PUSH_ACTION".equalsIgnoreCase(action)) {
            te1.m22010x(this, intent);
        }
        finish();
    }
}
