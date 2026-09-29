package p000;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes2.dex */
public final class gn3 {

    /* JADX INFO: renamed from: a */
    public static final gn3 f41046a = new gn3();

    /* JADX INFO: renamed from: a */
    public final boolean m12762a(AppWidgetManager appWidgetManager, ComponentName componentName, int i, RemoteViews remoteViews) {
        return appWidgetManager.setWidgetPreview(componentName, i, remoteViews);
    }
}
