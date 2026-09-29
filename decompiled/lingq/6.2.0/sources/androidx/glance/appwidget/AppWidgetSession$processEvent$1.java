package androidx.glance.appwidget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetSession", m4291f = "AppWidgetSession.kt", m4292l = {217}, m4293m = "processEvent$suspendImpl", m4294v = 1)
final class AppWidgetSession$processEvent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0656d f5803a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5804b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0656d f5805c;

    /* JADX INFO: renamed from: d */
    public int f5806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$processEvent$1(C0656d c0656d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5805c = c0656d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5804b = obj;
        this.f5806d |= Integer.MIN_VALUE;
        return C0656d.m2224e(this.f5805c, null, null, this);
    }
}
