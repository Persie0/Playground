package androidx.glance.appwidget;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3489q9;
import p000.c32;
import p000.hn3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetManager$updateReceiver$2", m4291f = "GlanceAppWidgetManager.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidgetManager$updateReceiver$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f5909b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f5910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$updateReceiver$2(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f5909b = str;
        this.f5910c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GlanceAppWidgetManager$updateReceiver$2 glanceAppWidgetManager$updateReceiver$2 = new GlanceAppWidgetManager$updateReceiver$2(this.f5909b, this.f5910c, continuation);
        glanceAppWidgetManager$updateReceiver$2.f5908a = obj;
        return glanceAppWidgetManager$updateReceiver$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidgetManager$updateReceiver$2) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Preferences preferences = (Preferences) this.f5908a;
        MutablePreferences mutablePreferences = preferences.toMutablePreferences();
        Preferences.Key key = C0660h.f6014g;
        Set set = (Set) preferences.get(key);
        if (set == null) {
            set = EmptySet.f47640a;
        }
        String str = this.f5909b;
        mutablePreferences.set(key, AbstractC3489q9.m19765B(set, str));
        mutablePreferences.set(hn3.m13377a(C0660h.f6011d, str), this.f5910c);
        return mutablePreferences.toPreferences();
    }
}
