package com.lingq.p055ui.home.search;

import ci.InterfaceC2022o;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$networkLoadCourses$1", m19206f = "SearchViewModel.kt", m19207l = {283}, m19208m = "invokeSuspend")
final class SearchViewModel$networkLoadCourses$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26039e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SearchViewModel f26040f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<Integer> f26041g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$networkLoadCourses$1(SearchViewModel searchViewModel, List<Integer> list, InterfaceC9968c<? super SearchViewModel$networkLoadCourses$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26040f = searchViewModel;
        this.f26041g = list;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SearchViewModel$networkLoadCourses$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new SearchViewModel$networkLoadCourses$1(this.f26040f, this.f26041g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26039e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            SearchViewModel searchViewModel = this.f26040f;
            InterfaceC2022o interfaceC2022o = searchViewModel.f26006f;
            String strMo498E1 = searchViewModel.mo498E1();
            this.f26039e = 1;
            if (interfaceC2022o.mo6162g(strMo498E1, this.f26041g, this) == coroutineSingletons) {
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
