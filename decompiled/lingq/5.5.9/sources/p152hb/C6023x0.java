package p152hb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.media.AbstractC0140a;

/* JADX INFO: renamed from: hb.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6023x0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public Context f35622a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0140a f35623b;

    public C6023x0(AbstractC0140a abstractC0140a) {
        this.f35623b = abstractC0140a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f35623b.mo601j0();
            synchronized (this) {
                try {
                    Context context2 = this.f35622a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f35622a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
