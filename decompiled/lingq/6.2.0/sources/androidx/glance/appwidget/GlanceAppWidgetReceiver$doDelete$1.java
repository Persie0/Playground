package androidx.glance.appwidget;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetReceiver", m4291f = "GlanceAppWidgetReceiver.kt", m4292l = {176}, m4293m = "doDelete$glance_appwidget", m4294v = 1)
final class GlanceAppWidgetReceiver$doDelete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f5911a;

    /* JADX INFO: renamed from: b */
    public int[] f5912b;

    /* JADX INFO: renamed from: c */
    public int f5913c;

    /* JADX INFO: renamed from: d */
    public int f5914d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f5915e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0661i f5916f;

    /* JADX INFO: renamed from: g */
    public int f5917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$doDelete$1(AbstractC0661i abstractC0661i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5916f = abstractC0661i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5915e = obj;
        this.f5917g |= Integer.MIN_VALUE;
        return this.f5916f.m2243a(null, null, null, this);
    }
}
