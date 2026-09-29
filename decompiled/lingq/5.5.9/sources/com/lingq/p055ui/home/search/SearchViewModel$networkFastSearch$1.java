package com.lingq.p055ui.home.search;

import ci.InterfaceC2022o;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.CoroutineJobManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$networkFastSearch$1", m19206f = "SearchViewModel.kt", m19207l = {248}, m19208m = "invokeSuspend")
final class SearchViewModel$networkFastSearch$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26037e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SearchViewModel f26038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$networkFastSearch$1(SearchViewModel searchViewModel, InterfaceC9968c<? super SearchViewModel$networkFastSearch$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26038f = searchViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SearchViewModel$networkFastSearch$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new SearchViewModel$networkFastSearch$1(this.f26038f, interfaceC9968c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26037e;
        SearchViewModel searchViewModel = this.f26038f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2022o interfaceC2022o = searchViewModel.f26006f;
                String strMo498E1 = searchViewModel.mo498E1();
                String str = (String) searchViewModel.f25995I.getValue();
                this.f26037e = 1;
                obj = interfaceC2022o.mo6158c(strMo498E1, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            Triple triple = (Triple) obj;
            int iIntValue = ((Number) triple.f38021a).intValue();
            List list = (List) triple.f38022b;
            List list2 = (List) triple.f38023c;
            searchViewModel.f26012l.setValue(Boolean.FALSE);
            searchViewModel.f25994H.setValue(Boolean.valueOf(iIntValue == 0));
            boolean z10 = !list.isEmpty();
            CoroutineJobManager coroutineJobManager = searchViewModel.f26004d;
            CoroutineDispatcher coroutineDispatcher = searchViewModel.f26008h;
            if (z10) {
                C7499b.m14933c0(C8573r0.m16767w0(searchViewModel), coroutineJobManager, coroutineDispatcher, "networkLoadLessons", new SearchViewModel$networkLoadLessons$1(searchViewModel, list, null));
            }
            if (!list2.isEmpty()) {
                C7499b.m14933c0(C8573r0.m16767w0(searchViewModel), coroutineJobManager, coroutineDispatcher, "networkLoadCourses", new SearchViewModel$networkLoadCourses$1(searchViewModel, list2, null));
            }
        } catch (Exception unused) {
            searchViewModel.f26012l.setValue(Boolean.FALSE);
            searchViewModel.f25994H.setValue(Boolean.TRUE);
        }
        return C9072e.f47360a;
    }
}
