package androidx.glance.appwidget.state;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.state.GlanceAppWidgetStateKt$updateAppWidgetState$4", m4291f = "GlanceAppWidgetState.kt", m4292l = {74}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidgetStateKt$updateAppWidgetState$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6108a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6109b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f6110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetStateKt$updateAppWidgetState$4(zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f6110c = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GlanceAppWidgetStateKt$updateAppWidgetState$4 glanceAppWidgetStateKt$updateAppWidgetState$4 = new GlanceAppWidgetStateKt$updateAppWidgetState$4(this.f6110c, continuation);
        glanceAppWidgetStateKt$updateAppWidgetState$4.f6109b = obj;
        return glanceAppWidgetStateKt$updateAppWidgetState$4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidgetStateKt$updateAppWidgetState$4) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6108a;
        if (i != 0) {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.f6109b;
            AbstractC3193b.m15359b(obj);
            return mutablePreferences;
        }
        AbstractC3193b.m15359b(obj);
        MutablePreferences mutablePreferences2 = ((Preferences) this.f6109b).toMutablePreferences();
        this.f6109b = mutablePreferences2;
        this.f6108a = 1;
        this.f6110c.invoke(mutablePreferences2, this);
        return xfa.f68157a == coroutineSingletons ? coroutineSingletons : mutablePreferences2;
    }
}
