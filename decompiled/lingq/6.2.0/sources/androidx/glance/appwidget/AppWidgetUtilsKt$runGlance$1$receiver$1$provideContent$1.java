package androidx.glance.appwidget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$receiver$1", m4291f = "AppWidgetUtils.kt", m4292l = {273}, m4293m = "provideContent", m4294v = 1)
final class AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0657e f5834b;

    /* JADX INFO: renamed from: c */
    public int f5835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(C0657e c0657e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5834b = c0657e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5833a = obj;
        this.f5835c |= Integer.MIN_VALUE;
        return this.f5834b.mo2215J(null, this);
    }
}
