package com.lingq.p055ui.home.collections;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import java.util.List;
import km.InterfaceC6727j;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$5", m19206f = "CollectionsFragment.kt", m19207l = {477}, m19208m = "invokeSuspend")
public final class CollectionsFragment$onViewCreated$6$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23192e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsFragment f23193f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CollectionsAdapter f23194g;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$5$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/library/CollectionsAdapter$a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$5$1", m19206f = "CollectionsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35441 extends SuspendLambda implements InterfaceC2056p<List<? extends CollectionsAdapter.AbstractC3739a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23195e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsAdapter f23196f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35441(CollectionsAdapter collectionsAdapter, InterfaceC9968c<? super C35441> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23196f = collectionsAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35441 c35441 = new C35441(this.f23196f, interfaceC9968c);
            c35441.f23195e = obj;
            return c35441;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends CollectionsAdapter.AbstractC3739a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35441) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f23196f.m4529q((List) this.f23195e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsFragment$onViewCreated$6$5(CollectionsFragment collectionsFragment, CollectionsAdapter collectionsAdapter, InterfaceC9968c<? super CollectionsFragment$onViewCreated$6$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23193f = collectionsFragment;
        this.f23194g = collectionsAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsFragment$onViewCreated$6$5(this.f23193f, this.f23194g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsFragment$onViewCreated$6$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23192e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
            CollectionsViewModel collectionsViewModelM9800p0 = this.f23193f.m9800p0();
            C35441 c35441 = new C35441(this.f23194g, null);
            this.f23192e = 1;
            if (C0062b.m369m0(collectionsViewModelM9800p0.f23250e0, c35441, this) == coroutineSingletons) {
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
