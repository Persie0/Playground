package androidx.glance.appwidget;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.LayoutConfiguration$Companion", m4291f = "WidgetLayout.kt", m4292l = {95}, m4293m = "load$glance_appwidget", m4294v = 1)
final class LayoutConfiguration$Companion$load$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f5958a;

    /* JADX INFO: renamed from: b */
    public int f5959b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f5960c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0663k f5961d;

    /* JADX INFO: renamed from: e */
    public int f5962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutConfiguration$Companion$load$1(C0663k c0663k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5961d = c0663k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5960c = obj;
        this.f5962e |= Integer.MIN_VALUE;
        return this.f5961d.m2253c(null, 0, this);
    }
}
