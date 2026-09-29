package com.lingq.p055ui.home.collections;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181ii.C6333b;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lii/b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$getLibraryDownloads$1$2$3", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class CollectionsViewModel$getLibraryDownloads$1$2$3 extends SuspendLambda implements InterfaceC2056p<List<? extends C6333b>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f23373e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23374f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$getLibraryDownloads$1$2$3(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super CollectionsViewModel$getLibraryDownloads$1$2$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23374f = collectionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        CollectionsViewModel$getLibraryDownloads$1$2$3 collectionsViewModel$getLibraryDownloads$1$2$3 = new CollectionsViewModel$getLibraryDownloads$1$2$3(this.f23374f, interfaceC9968c);
        collectionsViewModel$getLibraryDownloads$1$2$3.f23373e = obj;
        return collectionsViewModel$getLibraryDownloads$1$2$3;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(List<? extends C6333b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$getLibraryDownloads$1$2$3) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        this.f23374f.f23236S.setValue(C6752c.m13421O((List) this.f23373e));
        return C9072e.f47360a;
    }
}
