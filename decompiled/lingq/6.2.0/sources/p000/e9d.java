package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e9d {

    /* JADX INFO: renamed from: a */
    public static p04 f36891a;

    /* JADX INFO: renamed from: a */
    public static Intent m10950a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }
}
