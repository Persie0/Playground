package androidx.glance.appwidget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetKt", m4291f = "GlanceAppWidget.kt", m4292l = {299}, m4293m = "provideContent", m4294v = 1)
final class GlanceAppWidgetKt$provideContent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5875a;

    /* JADX INFO: renamed from: b */
    public int f5876b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5875a = obj;
        this.f5876b |= Integer.MIN_VALUE;
        return AbstractC0652b.m2217b(null, this);
    }
}
