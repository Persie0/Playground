package androidx.glance.appwidget;

import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetKt", m4291f = "GlanceAppWidget.kt", m4292l = {268, 268}, m4293m = "updateAll", m4294v = 1)
final class GlanceAppWidgetKt$updateAll$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC0659g f5877a;

    /* JADX INFO: renamed from: b */
    public Context f5878b;

    /* JADX INFO: renamed from: c */
    public Iterator f5879c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f5880d;

    /* JADX INFO: renamed from: e */
    public int f5881e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5880d = obj;
        this.f5881e |= Integer.MIN_VALUE;
        return AbstractC0652b.m2218c(null, null, this);
    }
}
