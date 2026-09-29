package androidx.glance.appwidget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetManager", m4291f = "GlanceAppWidgetManager.kt", m4292l = {132, 133}, m4293m = "getState", m4294v = 1)
final class GlanceAppWidgetManager$getState$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0660h f5890a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5891b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0660h f5892c;

    /* JADX INFO: renamed from: d */
    public int f5893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$getState$1(C0660h c0660h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5892c = c0660h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5891b = obj;
        this.f5893d |= Integer.MIN_VALUE;
        return this.f5892c.m2240c(this);
    }
}
