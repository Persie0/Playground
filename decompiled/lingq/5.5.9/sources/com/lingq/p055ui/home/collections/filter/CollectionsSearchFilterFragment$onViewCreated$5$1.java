package com.lingq.p055ui.home.collections.filter;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.vocabulary.filter.C4079a;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.AbstractC7787n;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$onViewCreated$5$1", m19206f = "CollectionsSearchFilterFragment.kt", m19207l = {117}, m19208m = "invokeSuspend")
public final class CollectionsSearchFilterFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23465e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsSearchFilterFragment f23466f;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lnh/n;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterFragment$onViewCreated$5$1$1", m19206f = "CollectionsSearchFilterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35741 extends SuspendLambda implements InterfaceC2056p<List<? extends AbstractC7787n>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23467e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsSearchFilterFragment f23468f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35741(CollectionsSearchFilterFragment collectionsSearchFilterFragment, InterfaceC9968c<? super C35741> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23468f = collectionsSearchFilterFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35741 c35741 = new C35741(this.f23468f, interfaceC9968c);
            c35741.f23467e = obj;
            return c35741;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends AbstractC7787n> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35741) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f23467e;
            C4079a c4079a = this.f23468f.f23455U0;
            if (c4079a != null) {
                c4079a.m4529q(list);
                return C9072e.f47360a;
            }
            C5207g.m11117l("settingsAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchFilterFragment$onViewCreated$5$1(CollectionsSearchFilterFragment collectionsSearchFilterFragment, InterfaceC9968c<? super CollectionsSearchFilterFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23466f = collectionsSearchFilterFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsSearchFilterFragment$onViewCreated$5$1(this.f23466f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsSearchFilterFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23465e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsSearchFilterFragment collectionsSearchFilterFragment = this.f23466f;
            CollectionsSearchFilterViewModel collectionsSearchFilterViewModel = (CollectionsSearchFilterViewModel) collectionsSearchFilterFragment.f23452R0.getValue();
            C35741 c35741 = new C35741(collectionsSearchFilterFragment, null);
            this.f23465e = 1;
            if (C0062b.m369m0(collectionsSearchFilterViewModel.f23620g, c35741, this) == coroutineSingletons) {
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
