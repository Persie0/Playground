package com.lingq.p055ui.home.collections;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181ii.C6334c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lii/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$getLessonsAudiosDownloads$1$1$2", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class CollectionsViewModel$getLessonsAudiosDownloads$1$1$2 extends SuspendLambda implements InterfaceC2056p<List<? extends C6334c>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f23352e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$getLessonsAudiosDownloads$1$1$2(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super CollectionsViewModel$getLessonsAudiosDownloads$1$1$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23353f = collectionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        CollectionsViewModel$getLessonsAudiosDownloads$1$1$2 collectionsViewModel$getLessonsAudiosDownloads$1$1$2 = new CollectionsViewModel$getLessonsAudiosDownloads$1$1$2(this.f23353f, interfaceC9968c);
        collectionsViewModel$getLessonsAudiosDownloads$1$1$2.f23352e = obj;
        return collectionsViewModel$getLessonsAudiosDownloads$1$1$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(List<? extends C6334c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$getLessonsAudiosDownloads$1$1$2) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        this.f23353f.f23237T.setValue(C6752c.m13421O((List) this.f23352e));
        return C9072e.f47360a;
    }
}
