package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.LinkedHashMap;
import p000.C3386nv;
import p000.fa4;
import p000.my5;

/* JADX INFO: loaded from: classes2.dex */
public class UnmanagedSessionReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final my5 f5978a = new my5(12);

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f5979b = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !fa4.m11650l(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            C3386nv.m17633t("Intent is missing ActionKey extra");
            return;
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            C3386nv.m17633t("Intent is missing AppWidgetId extra");
        } else {
            my5.m17153f(intExtra);
            Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
        }
    }
}
