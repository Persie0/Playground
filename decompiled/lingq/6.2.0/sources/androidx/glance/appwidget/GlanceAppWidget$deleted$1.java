package androidx.glance.appwidget;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C0785at;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidget", m4291f = "GlanceAppWidget.kt", m4292l = {140, 142, 149, 149, 149, 149}, m4293m = "deleted$glance_appwidget", m4294v = 1)
final class GlanceAppWidget$deleted$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f5848a;

    /* JADX INFO: renamed from: b */
    public C0785at f5849b;

    /* JADX INFO: renamed from: c */
    public Throwable f5850c;

    /* JADX INFO: renamed from: d */
    public int f5851d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f5852e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0659g f5853f;

    /* JADX INFO: renamed from: g */
    public int f5854g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$deleted$1(AbstractC0659g abstractC0659g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5853f = abstractC0659g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5852e = obj;
        this.f5854g |= Integer.MIN_VALUE;
        return this.f5853f.m2232a(null, 0, this);
    }
}
