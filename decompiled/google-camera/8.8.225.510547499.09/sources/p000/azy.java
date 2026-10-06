package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class azy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f2830a = 0;

    static {
        ayc.m2100b("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ayc.m2099a();
        StringBuilder sb = new StringBuilder();
        sb.append("onReceive : ");
        sb.append(intent);
        context.startService(azx.m2145b(context));
    }
}
