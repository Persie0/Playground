package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amo {

    /* JADX INFO: renamed from: a */
    final IntentFilter f713a;

    /* JADX INFO: renamed from: b */
    final BroadcastReceiver f714b;

    /* JADX INFO: renamed from: c */
    boolean f715c;

    /* JADX INFO: renamed from: d */
    boolean f716d;

    public amo(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f713a = intentFilter;
        this.f714b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f714b);
        sb.append(" filter=");
        sb.append(this.f713a);
        if (this.f716d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
