package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g0c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f40038a = new C0282a(-1670294951, false, new wd1(2));

    /* JADX INFO: renamed from: a */
    public static PendingIntent m12274a(Context context, Intent intent) {
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }
}
