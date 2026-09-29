package androidx.glance.appwidget;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.jq2;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetSession", m4291f = "AppWidgetSession.kt", m4292l = {171, 202, 202, 202, 202}, m4293m = "processEmittableTree$suspendImpl", m4294v = 1)
final class AppWidgetSession$processEmittableTree$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f5797a;

    /* JADX INFO: renamed from: b */
    public Context f5798b;

    /* JADX INFO: renamed from: c */
    public jq2 f5799c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f5800d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0656d f5801e;

    /* JADX INFO: renamed from: f */
    public int f5802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$processEmittableTree$1(C0656d c0656d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5801e = c0656d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5800d = obj;
        this.f5802f |= Integer.MIN_VALUE;
        return C0656d.m2223d(this.f5801e, null, null, this);
    }
}
