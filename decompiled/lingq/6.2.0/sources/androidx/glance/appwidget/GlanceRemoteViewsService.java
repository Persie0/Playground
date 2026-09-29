package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import p000.C3386nv;
import p000.v11;

/* JADX INFO: loaded from: classes2.dex */
public class GlanceRemoteViewsService extends RemoteViewsService {

    /* JADX INFO: renamed from: a */
    public static final v11 f5947a = new v11(1);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        if (intent == null) {
            C3386nv.m17626m("Intent is null");
            return null;
        }
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            C3386nv.m17633t("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            C3386nv.m17633t("No view id was present in the intent");
            return null;
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra != null && stringExtra.length() != 0) {
            return new C0662j(this, intExtra, intExtra2, stringExtra);
        }
        C3386nv.m17633t("No size info was present in the intent");
        return null;
    }
}
