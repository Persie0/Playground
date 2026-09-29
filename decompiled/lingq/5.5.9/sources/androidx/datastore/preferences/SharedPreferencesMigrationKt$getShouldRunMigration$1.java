package androidx.datastore.preferences;

import cm.InterfaceC2056p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p212k3.AbstractC6579a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lk3/a;", "prefs", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 5, 1})
@InterfaceC10224c(m19205c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m19206f = "SharedPreferencesMigration.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements InterfaceC2056p<AbstractC6579a, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f5775e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Set<String> f5776f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set<String> set, InterfaceC9968c<? super SharedPreferencesMigrationKt$getShouldRunMigration$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f5776f = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.f5776f, interfaceC9968c);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.f5775e = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(AbstractC6579a abstractC6579a, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) mo1336a(abstractC6579a, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        Set<AbstractC6579a.a<?>> setKeySet = ((AbstractC6579a) this.f5775e).mo3049a().keySet();
        ArrayList arrayList = new ArrayList(C9325m.m17681z(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC6579a.a) it.next()).f37403a);
        }
        LinkedHashSet linkedHashSet = SharedPreferencesMigrationKt.f5772a;
        boolean z10 = true;
        Set<String> set = this.f5776f;
        if (set != linkedHashSet) {
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (Boolean.valueOf(!arrayList.contains((String) it2.next())).booleanValue()) {
                    }
                }
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
