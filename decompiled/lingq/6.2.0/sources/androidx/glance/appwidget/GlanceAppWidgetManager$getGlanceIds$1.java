package androidx.glance.appwidget;

import androidx.glance.appwidget.AbstractC0659g;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetManager", m4291f = "GlanceAppWidgetManager.kt", m4292l = {139}, m4293m = "getGlanceIds", m4294v = 1)
final class GlanceAppWidgetManager$getGlanceIds$1<T extends AbstractC0659g> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Class f5886a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5887b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0660h f5888c;

    /* JADX INFO: renamed from: d */
    public int f5889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$getGlanceIds$1(C0660h c0660h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5888c = c0660h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5887b = obj;
        this.f5889d |= Integer.MIN_VALUE;
        return this.f5888c.m2239b(null, this);
    }
}
