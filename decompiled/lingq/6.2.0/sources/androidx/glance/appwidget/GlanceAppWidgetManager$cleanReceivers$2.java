package androidx.glance.appwidget;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.hn3;
import p000.u91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetManager$cleanReceivers$2", m4291f = "GlanceAppWidgetManager.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidgetManager$cleanReceivers$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f5885b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetManager$cleanReceivers$2(Set set, Continuation continuation) {
        super(2, continuation);
        this.f5885b = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GlanceAppWidgetManager$cleanReceivers$2 glanceAppWidgetManager$cleanReceivers$2 = new GlanceAppWidgetManager$cleanReceivers$2(this.f5885b, continuation);
        glanceAppWidgetManager$cleanReceivers$2.f5884a = obj;
        return glanceAppWidgetManager$cleanReceivers$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidgetManager$cleanReceivers$2) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Collection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? linkedHashSet;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Preferences preferences = (Preferences) this.f5884a;
        Set set = (Set) preferences.get(C0660h.f6014g);
        if (set != null) {
            Set set2 = set;
            ?? arrayList = new ArrayList();
            for (Object obj2 : set2) {
                if (!this.f5885b.contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                MutablePreferences mutablePreferences = preferences.toMutablePreferences();
                Preferences.Key key = C0660h.f6014g;
                if (arrayList.isEmpty()) {
                    linkedHashSet = u91.m22627s1(set2);
                } else if (arrayList instanceof Set) {
                    linkedHashSet = new LinkedHashSet();
                    for (Object obj3 : set2) {
                        if (!((Set) arrayList).contains(obj3)) {
                            linkedHashSet.add(obj3);
                        }
                    }
                } else {
                    ?? linkedHashSet2 = new LinkedHashSet(set);
                    linkedHashSet2.removeAll(arrayList);
                    linkedHashSet = linkedHashSet2;
                }
                mutablePreferences.set(key, linkedHashSet);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mutablePreferences.remove(hn3.m13377a(C0660h.f6011d, (String) it.next()));
                }
                return mutablePreferences.toPreferences();
            }
        }
        return preferences;
    }
}
