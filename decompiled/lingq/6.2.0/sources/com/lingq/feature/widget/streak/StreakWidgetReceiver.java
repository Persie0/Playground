package com.lingq.feature.widget.streak;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import androidx.glance.appwidget.AbstractC0659g;
import androidx.glance.appwidget.AbstractC0661i;

/* JADX INFO: loaded from: classes.dex */
public final class StreakWidgetReceiver extends AbstractC0661i {

    /* JADX INFO: renamed from: b */
    public final C2871b f33884b = new C2871b();

    @Override // androidx.glance.appwidget.AbstractC0661i
    /* JADX INFO: renamed from: e */
    public final AbstractC0659g mo2247e() {
        return this.f33884b;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        context.getClass();
        super.onDisabled(context);
        StreakDataUpdateWorker.Companion.getClass();
        C2870a.m9786a(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        context.getClass();
        super.onEnabled(context);
        StreakDataUpdateWorker.Companion.getClass();
        C2870a.m9787b(context);
        C2870a.m9789d(context);
    }

    @Override // androidx.glance.appwidget.AbstractC0661i, android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        super.onUpdate(context, appWidgetManager, iArr);
        StreakDataUpdateWorker.Companion.getClass();
        C2870a.m9787b(context);
    }
}
