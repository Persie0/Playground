package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class rh5 {

    /* JADX INFO: renamed from: a */
    public final IntentFilter f59307a;

    /* JADX INFO: renamed from: b */
    public final BroadcastReceiver f59308b;

    /* JADX INFO: renamed from: c */
    public boolean f59309c;

    /* JADX INFO: renamed from: d */
    public boolean f59310d;

    public rh5(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f59307a = intentFilter;
        this.f59308b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f59308b);
        sb.append(" filter=");
        sb.append(this.f59307a);
        if (this.f59310d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
