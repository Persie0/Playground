package com.lingq.p055ui.home.search;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchFragment$onViewCreated$4$1", m19206f = "SearchFragment.kt", m19207l = {192}, m19208m = "invokeSuspend")
public final class SearchFragment$onViewCreated$4$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25977e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SearchFragment f25978f;

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchFragment$onViewCreated$4$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/search/SearchAdapter$c;", "adapterItems", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchFragment$onViewCreated$4$1$1", m19206f = "SearchFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39701 extends SuspendLambda implements InterfaceC2056p<List<? extends SearchAdapter.AbstractC3964c>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25979e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SearchFragment f25980f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39701(SearchFragment searchFragment, InterfaceC9968c<? super C39701> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25980f = searchFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39701 c39701 = new C39701(this.f25980f, interfaceC9968c);
            c39701.f25979e = obj;
            return c39701;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends SearchAdapter.AbstractC3964c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39701) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25979e;
            SearchAdapter searchAdapter = this.f25980f.f25958D0;
            if (searchAdapter != null) {
                searchAdapter.m4529q(list);
                return C9072e.f47360a;
            }
            C5207g.m11117l("searchAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$onViewCreated$4$1(SearchFragment searchFragment, InterfaceC9968c<? super SearchFragment$onViewCreated$4$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25978f = searchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SearchFragment$onViewCreated$4$1(this.f25978f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SearchFragment$onViewCreated$4$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25977e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = SearchFragment.f25954E0;
            SearchFragment searchFragment = this.f25978f;
            SearchViewModel searchViewModelM10012p0 = searchFragment.m10012p0();
            C39701 c39701 = new C39701(searchFragment, null);
            this.f25977e = 1;
            if (C0062b.m369m0(searchViewModelM10012p0.f26001O, c39701, this) == coroutineSingletons) {
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
