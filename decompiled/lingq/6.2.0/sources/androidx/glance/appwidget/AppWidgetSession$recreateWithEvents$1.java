package androidx.glance.appwidget;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetSession", m4291f = "AppWidgetSession.kt", m4292l = {265}, m4293m = "recreateWithEvents$suspendImpl", m4294v = 1)
final class AppWidgetSession$recreateWithEvents$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0656d f5812a;

    /* JADX INFO: renamed from: b */
    public C0656d f5813b;

    /* JADX INFO: renamed from: c */
    public List f5814c;

    /* JADX INFO: renamed from: d */
    public int f5815d;

    /* JADX INFO: renamed from: e */
    public int f5816e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f5817f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0656d f5818g;

    /* JADX INFO: renamed from: h */
    public int f5819h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$recreateWithEvents$1(C0656d c0656d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5818g = c0656d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5817f = obj;
        this.f5819h |= Integer.MIN_VALUE;
        return C0656d.m2225f(this.f5818g, null, this);
    }
}
