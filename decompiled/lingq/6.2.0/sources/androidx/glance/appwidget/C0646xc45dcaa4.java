package androidx.glance.appwidget;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.hn3;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetManager$addAllReceiversAndProvidersToPreferences$2 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetManager$addAllReceiversAndProvidersToPreferences$2", m4291f = "GlanceAppWidgetManager.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class C0646xc45dcaa4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5882a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f5883b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0646xc45dcaa4(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f5883b = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0646xc45dcaa4 c0646xc45dcaa4 = new C0646xc45dcaa4(this.f5883b, continuation);
        c0646xc45dcaa4.f5882a = obj;
        return c0646xc45dcaa4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0646xc45dcaa4) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        MutablePreferences mutablePreferences = ((Preferences) this.f5882a).toMutablePreferences();
        Preferences.Key key = C0660h.f6014g;
        ArrayList<AbstractC0661i> arrayList = this.f5883b;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC0661i) it.next()).getClass().getName());
        }
        mutablePreferences.set(key, u91.m22627s1(arrayList2));
        for (AbstractC0661i abstractC0661i : arrayList) {
            hn3 hn3Var = C0660h.f6011d;
            hn3Var.getClass();
            String canonicalName = abstractC0661i.getClass().getCanonicalName();
            if (canonicalName == null) {
                C3386nv.m17626m("no receiver name");
                return null;
            }
            Preferences.Key keyM13377a = hn3.m13377a(hn3Var, canonicalName);
            String canonicalName2 = abstractC0661i.mo2247e().getClass().getCanonicalName();
            if (canonicalName2 == null) {
                C3386nv.m17626m("no provider name");
                return null;
            }
            mutablePreferences.set(keyM13377a, canonicalName2);
        }
        return mutablePreferences.toPreferences();
    }
}
