package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class udb {

    /* JADX INFO: renamed from: a */
    public static final int f63801a;

    static {
        f63801a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m22700a(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }
}
