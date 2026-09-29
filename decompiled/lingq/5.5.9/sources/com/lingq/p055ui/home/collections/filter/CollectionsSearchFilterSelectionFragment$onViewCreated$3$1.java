package com.lingq.p055ui.home.collections.filter;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$onViewCreated$3$1", m19206f = "CollectionsSearchFilterSelectionFragment.kt", m19207l = {76}, m19208m = "invokeSuspend")
public final class CollectionsSearchFilterSelectionFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23505e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsSearchFilterSelectionFragment f23506f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CollectionsSearchFilterSelectionAdapter f23507g;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionAdapter$b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$onViewCreated$3$1$1", m19206f = "CollectionsSearchFilterSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35901 extends SuspendLambda implements InterfaceC2056p<List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23508e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsSearchFilterSelectionAdapter f23509f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35901(CollectionsSearchFilterSelectionAdapter collectionsSearchFilterSelectionAdapter, InterfaceC9968c<? super C35901> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23509f = collectionsSearchFilterSelectionAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35901 c35901 = new C35901(this.f23509f, interfaceC9968c);
            c35901.f23508e = obj;
            return c35901;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35901) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f23509f.m4529q((List) this.f23508e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchFilterSelectionFragment$onViewCreated$3$1(CollectionsSearchFilterSelectionAdapter collectionsSearchFilterSelectionAdapter, CollectionsSearchFilterSelectionFragment collectionsSearchFilterSelectionFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23506f = collectionsSearchFilterSelectionFragment;
        this.f23507g = collectionsSearchFilterSelectionAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsSearchFilterSelectionFragment$onViewCreated$3$1(this.f23507g, this.f23506f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsSearchFilterSelectionFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23505e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModelM9853n0 = CollectionsSearchFilterSelectionFragment.m9853n0(this.f23506f);
            C35901 c35901 = new C35901(this.f23507g, null);
            this.f23505e = 1;
            if (C0062b.m369m0(collectionsSearchFilterSelectionViewModelM9853n0.f23535N, c35901, this) == coroutineSingletons) {
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
