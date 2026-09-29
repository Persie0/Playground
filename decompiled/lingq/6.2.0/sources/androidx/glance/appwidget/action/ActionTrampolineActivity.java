package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import p000.i1d;

/* JADX INFO: loaded from: classes2.dex */
public class ActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i1d.m13633d(this, getIntent());
        finish();
    }
}
