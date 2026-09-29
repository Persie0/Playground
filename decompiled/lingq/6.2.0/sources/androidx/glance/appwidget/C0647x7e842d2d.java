package androidx.glance.appwidget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: renamed from: androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory", m4291f = "GlanceRemoteViewsService.kt", m4292l = {119, 129, 132}, m4293m = "startSessionIfNeededAndWaitUntilReady", m4294v = 1)
final class C0647x7e842d2d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0662j f5951b;

    /* JADX INFO: renamed from: c */
    public int f5952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647x7e842d2d(C0662j c0662j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5951b = c0662j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5950a = obj;
        this.f5952c |= Integer.MIN_VALUE;
        return C0662j.m2249a(this.f5951b, null, this);
    }
}
