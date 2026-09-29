package com.lingq.shared.storage;

import androidx.datastore.preferences.core.MutablePreferences;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$setSelectedPlaylists$2", m19206f = "UtilStore.kt", m19207l = {}, m19208m = "invokeSuspend")
final class UtilStoreImpl$setSelectedPlaylists$2 extends SuspendLambda implements InterfaceC2056p<MutablePreferences, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f21508e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UtilStoreImpl f21509f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Map<String, String> f21510g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$setSelectedPlaylists$2(UtilStoreImpl utilStoreImpl, Map<String, String> map, InterfaceC9968c<? super UtilStoreImpl$setSelectedPlaylists$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f21509f = utilStoreImpl;
        this.f21510g = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        UtilStoreImpl$setSelectedPlaylists$2 utilStoreImpl$setSelectedPlaylists$2 = new UtilStoreImpl$setSelectedPlaylists$2(this.f21509f, this.f21510g, interfaceC9968c);
        utilStoreImpl$setSelectedPlaylists$2.f21508e = obj;
        return utilStoreImpl$setSelectedPlaylists$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(MutablePreferences mutablePreferences, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UtilStoreImpl$setSelectedPlaylists$2) mo1336a(mutablePreferences, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.f21508e;
        UtilStoreImpl utilStoreImpl = this.f21509f;
        mutablePreferences.m3052d(utilStoreImpl.f21467f, utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, String.class, String.class)).m10535e(this.f21510g));
        return C9072e.f47360a;
    }
}
