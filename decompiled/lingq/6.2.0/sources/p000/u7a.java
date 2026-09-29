package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class u7a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public v7a f63522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v7a f63523b;

    public u7a(v7a v7aVar, v7a v7aVar2) {
        this.f63523b = v7aVar;
        this.f63522a = v7aVar2;
    }

    /* JADX INFO: renamed from: a */
    public final void m22521a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((Context) this.f63523b.f64988c).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            v7a v7aVar = this.f63522a;
            if (v7aVar == null) {
                return;
            }
            if (v7aVar.m23158d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                v7a v7aVar2 = this.f63522a;
                ((t7a) v7aVar2.f64991f).f61960f.schedule(v7aVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f63522a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
