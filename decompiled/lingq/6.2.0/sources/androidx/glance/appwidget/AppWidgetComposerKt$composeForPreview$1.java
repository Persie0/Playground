package androidx.glance.appwidget;

import android.appwidget.AppWidgetProviderInfo;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetComposerKt", m4291f = "AppWidgetComposer.kt", m4292l = {186, 216}, m4293m = "composeForPreview", m4294v = 1)
final class AppWidgetComposerKt$composeForPreview$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f5774a;

    /* JADX INFO: renamed from: b */
    public Object f5775b;

    /* JADX INFO: renamed from: c */
    public AppWidgetProviderInfo f5776c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f5777d;

    /* JADX INFO: renamed from: e */
    public int f5778e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5777d = obj;
        this.f5778e |= Integer.MIN_VALUE;
        return AbstractC0652b.m2216a(null, null, 0, null, this);
    }
}
