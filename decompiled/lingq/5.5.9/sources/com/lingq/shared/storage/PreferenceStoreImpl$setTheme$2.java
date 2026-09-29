package com.lingq.shared.storage;

import androidx.datastore.preferences.core.MutablePreferences;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$setTheme$2", m19206f = "PreferenceStore.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class PreferenceStoreImpl$setTheme$2 extends SuspendLambda implements InterfaceC2056p<MutablePreferences, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20856e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PreferenceStoreImpl f20857f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Theme f20858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTheme$2(PreferenceStoreImpl preferenceStoreImpl, Theme theme, InterfaceC9968c<? super PreferenceStoreImpl$setTheme$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f20857f = preferenceStoreImpl;
        this.f20858g = theme;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        PreferenceStoreImpl$setTheme$2 preferenceStoreImpl$setTheme$2 = new PreferenceStoreImpl$setTheme$2(this.f20857f, this.f20858g, interfaceC9968c);
        preferenceStoreImpl$setTheme$2.f20856e = obj;
        return preferenceStoreImpl$setTheme$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(MutablePreferences mutablePreferences, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PreferenceStoreImpl$setTheme$2) mo1336a(mutablePreferences, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        ((MutablePreferences) this.f20856e).m3052d(this.f20857f.f20753d, this.f20858g.name());
        return C9072e.f47360a;
    }
}
