package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p000.C3693vp;
import p000.w41;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomTabActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public C3693vp f11346a;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent("CustomTabActivity.action_customTabRedirect");
            intent2.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
            w41.m23706r(this).m23711E(intent2);
            C3693vp c3693vp = new C3693vp(this, 2);
            w41.m23706r(this).m23709C(c3693vp, new IntentFilter("CustomTabActivity.action_destroy"));
            this.f11346a = c3693vp;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction("CustomTabActivity.action_customTabRedirect");
        intent.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C3693vp c3693vp = this.f11346a;
        if (c3693vp != null) {
            w41.m23706r(this).m23717K(c3693vp);
        }
        super.onDestroy();
    }
}
