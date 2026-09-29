package androidx.core.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import p000.C3386nv;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteViewsCompatService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getClass();
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            C3386nv.m17633t("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new C0483b(this, intExtra, intExtra2);
        }
        C3386nv.m17633t("No view id was present in the intent");
        return null;
    }
}
