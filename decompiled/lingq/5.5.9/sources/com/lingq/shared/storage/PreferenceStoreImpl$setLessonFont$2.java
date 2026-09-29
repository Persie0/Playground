package com.lingq.shared.storage;

import androidx.datastore.preferences.core.MutablePreferences;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$setLessonFont$2", m19206f = "PreferenceStore.kt", m19207l = {}, m19208m = "invokeSuspend")
final class PreferenceStoreImpl$setLessonFont$2 extends SuspendLambda implements InterfaceC2056p<MutablePreferences, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20814e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Map<String, LessonFont> f20815f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PreferenceStoreImpl f20816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setLessonFont$2(PreferenceStoreImpl preferenceStoreImpl, Map map, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f20815f = map;
        this.f20816g = preferenceStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        PreferenceStoreImpl$setLessonFont$2 preferenceStoreImpl$setLessonFont$2 = new PreferenceStoreImpl$setLessonFont$2(this.f20816g, this.f20815f, interfaceC9968c);
        preferenceStoreImpl$setLessonFont$2.f20814e = obj;
        return preferenceStoreImpl$setLessonFont$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(MutablePreferences mutablePreferences, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PreferenceStoreImpl$setLessonFont$2) mo1336a(mutablePreferences, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.f20814e;
        Map<String, LessonFont> map = this.f20815f;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, LessonFont> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), C3398a.m9700c(entry.getValue())));
        }
        Map mapM13464Q0 = C6753d.m13464Q0(arrayList);
        PreferenceStoreImpl preferenceStoreImpl = this.f20816g;
        mutablePreferences.m3052d(preferenceStoreImpl.f20769o, preferenceStoreImpl.f20747a.m10564b(C9312p.m17659d(Map.class, String.class, String.class)).m10535e(mapM13464Q0));
        return C9072e.f47360a;
    }
}
