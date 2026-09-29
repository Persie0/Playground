package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes2.dex */
public final class ep9 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37690a;

    /* JADX INFO: renamed from: b */
    public Context f37691b;

    /* JADX INFO: renamed from: c */
    public Object f37692c;

    public /* synthetic */ ep9(Object obj, int i) {
        this.f37690a = i;
        this.f37692c = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m11312a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        fp9 fp9Var = (fp9) this.f37692c;
        if (fp9Var != null) {
            Context context = ((FirebaseMessaging) fp9Var.f39433d).f13722b;
            this.f37691b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m11313b() {
        try {
            Context context = this.f37691b;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f37691b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f37690a) {
            case 0:
                fp9 fp9Var = (fp9) this.f37692c;
                if (fp9Var != null && fp9Var.m11986a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    fp9 fp9Var2 = (fp9) this.f37692c;
                    ((FirebaseMessaging) fp9Var2.f39433d).getClass();
                    FirebaseMessaging.m6704b(fp9Var2, 0L);
                    Context context2 = this.f37691b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f37692c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((RunnableC3468pp) ((cdb) this.f37692c).f9946c).getClass();
                    throw null;
                }
                return;
        }
    }
}
