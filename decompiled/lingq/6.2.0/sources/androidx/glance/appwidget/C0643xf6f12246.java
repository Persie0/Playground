package androidx.glance.appwidget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetComposerKt$composeForPreview$content$1$receiver$1$provideContent$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetComposerKt$composeForPreview$content$1$receiver$1", m4291f = "AppWidgetComposer.kt", m4292l = {189}, m4293m = "provideContent", m4294v = 1)
final class C0643xf6f12246 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5794a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0650a f5795b;

    /* JADX INFO: renamed from: c */
    public int f5796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643xf6f12246(C0650a c0650a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5795b = c0650a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5794a = obj;
        this.f5796c |= Integer.MIN_VALUE;
        return this.f5795b.mo2215J(null, this);
    }
}
