package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfp extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public Context f33912a;

    /* JADX INFO: renamed from: b */
    private final jfo f33913b;

    public jfp(jfo jfoVar) {
        this.f33913b = jfoVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m13054a() {
        Context context = this.f33912a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f33912a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f33913b.m13052a();
            m13054a();
        }
    }
}
