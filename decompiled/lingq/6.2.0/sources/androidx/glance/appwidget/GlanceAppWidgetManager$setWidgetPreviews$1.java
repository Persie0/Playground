package androidx.glance.appwidget;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetManager", m4291f = "GlanceAppWidgetManager.kt", m4292l = {350}, m4293m = "setWidgetPreviews", m4294v = 1)
final class GlanceAppWidgetManager$setWidgetPreviews$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C0660h f5894H;

    /* JADX INFO: renamed from: I */
    public int f5895I;

    /* JADX INFO: renamed from: a */
    public AbstractC0659g f5896a;

    /* JADX INFO: renamed from: b */
    public ComponentName f5897b;

    /* JADX INFO: renamed from: c */
    public AppWidgetProviderInfo f5898c;

    /* JADX INFO: renamed from: d */
    public int[] f5899d;

    /* JADX INFO: renamed from: e */
    public long[] f5900e;

    /* JADX INFO: renamed from: f */
    public int f5901f;

    /* JADX INFO: renamed from: g */
    public int f5902g;

    /* JADX INFO: renamed from: h */
    public int f5903h;

    /* JADX INFO: renamed from: i */
    public int f5904i;

    /* JADX INFO: renamed from: j */
    public int f5905j;

    /* JADX INFO: renamed from: k */
    public long f5906k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f5907l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$setWidgetPreviews$1(C0660h c0660h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5894H = c0660h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5907l = obj;
        this.f5895I |= Integer.MIN_VALUE;
        return this.f5894H.m2241d(null, null, this);
    }
}
