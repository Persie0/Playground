package androidx.glance.appwidget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C2976et;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetSession", m4291f = "AppWidgetSession.kt", m4292l = {290}, m4293m = "waitForReady", m4294v = 1)
final class AppWidgetSession$waitForReady$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C2976et f5820a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5821b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0656d f5822c;

    /* JADX INFO: renamed from: d */
    public int f5823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$waitForReady$1(C0656d c0656d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5822c = c0656d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5821b = obj;
        this.f5823d |= Integer.MIN_VALUE;
        return this.f5822c.m2227g(this);
    }
}
