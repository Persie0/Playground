package com.lingq.p055ui.home.collections;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.domain.Resource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/home/library/CollectionsAdapter$a$k;", "Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$_loadingLibraryItems$1", m19206f = "CollectionsViewModel.kt", m19207l = {166}, m19208m = "invokeSuspend")
final class CollectionsViewModel$_loadingLibraryItems$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends CollectionsAdapter.AbstractC3739a.k>>, Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23305e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f23306f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Resource.Status f23307g;

    public CollectionsViewModel$_loadingLibraryItems$1(InterfaceC9968c<? super CollectionsViewModel$_loadingLibraryItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends CollectionsAdapter.AbstractC3739a.k>> interfaceC7117d, Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        CollectionsViewModel$_loadingLibraryItems$1 collectionsViewModel$_loadingLibraryItems$1 = new CollectionsViewModel$_loadingLibraryItems$1(interfaceC9968c);
        collectionsViewModel$_loadingLibraryItems$1.f23306f = interfaceC7117d;
        collectionsViewModel$_loadingLibraryItems$1.f23307g = status;
        return collectionsViewModel$_loadingLibraryItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ?? arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23305e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f23306f;
            if (this.f23307g == Resource.Status.LOADING) {
                arrayList = new ArrayList(3);
                for (int i11 = 0; i11 < 3; i11++) {
                    arrayList.add(CollectionsAdapter.AbstractC3739a.k.f24502a);
                }
            } else {
                arrayList = EmptyList.f38032a;
            }
            this.f23306f = null;
            this.f23305e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
