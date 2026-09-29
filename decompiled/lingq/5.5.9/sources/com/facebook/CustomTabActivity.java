package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import dm.C5207g;
import kotlin.Metadata;
import p498y3.C10289a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class CustomTabActivity extends Activity {

    /* JADX INFO: renamed from: b */
    public static final String f11417b = C5207g.m11116k(".action_customTabRedirect", "CustomTabActivity");

    /* JADX INFO: renamed from: c */
    public static final String f11418c = C5207g.m11116k(".action_destroy", "CustomTabActivity");

    /* JADX INFO: renamed from: a */
    public C2271a f11419a;

    /* JADX INFO: renamed from: com.facebook.CustomTabActivity$a */
    public static final class C2271a extends BroadcastReceiver {
        public C2271a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C5207g.m11111f(context, "context");
            C5207g.m11111f(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f11417b);
            intent2.putExtra(CustomTabMainActivity.f11424f, getIntent().getDataString());
            C10289a.m19281a(this).m19283c(intent2);
            C2271a c2271a = new C2271a();
            C10289a.m19281a(this).m19282b(c2271a, new IntentFilter(f11418c));
            this.f11419a = c2271a;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f11417b);
        intent.putExtra(CustomTabMainActivity.f11424f, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C2271a c2271a = this.f11419a;
        if (c2271a != null) {
            C10289a.m19281a(this).m19284d(c2271a);
        }
        super.onDestroy();
    }
}
