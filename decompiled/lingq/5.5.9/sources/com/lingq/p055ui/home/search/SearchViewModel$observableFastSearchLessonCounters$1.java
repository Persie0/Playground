package com.lingq.p055ui.home.search;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$observableFastSearchLessonCounters$1", m19206f = "SearchViewModel.kt", m19207l = {201}, m19208m = "invokeSuspend")
final class SearchViewModel$observableFastSearchLessonCounters$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26054e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SearchViewModel f26055f;

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$observableFastSearchLessonCounters$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "lessonCounters", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$observableFastSearchLessonCounters$1$1", m19206f = "SearchViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39821 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26056e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SearchViewModel f26057f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39821(SearchViewModel searchViewModel, InterfaceC9968c<? super C39821> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26057f = searchViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39821 c39821 = new C39821(this.f26057f, interfaceC9968c);
            c39821.f26056e = obj;
            return c39821;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39821) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26057f.f25997K.setValue((List) this.f26056e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$observableFastSearchLessonCounters$1(SearchViewModel searchViewModel, InterfaceC9968c<? super SearchViewModel$observableFastSearchLessonCounters$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26055f = searchViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SearchViewModel$observableFastSearchLessonCounters$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new SearchViewModel$observableFastSearchLessonCounters$1(this.f26055f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26054e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            SearchViewModel searchViewModel = this.f26055f;
            InterfaceC7116c<List<LibraryItemCounter>> interfaceC7116cMo6159d = searchViewModel.f26006f.mo6159d(searchViewModel.mo498E1(), (String) searchViewModel.f25995I.getValue());
            C39821 c39821 = new C39821(searchViewModel, null);
            this.f26054e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6159d, c39821, this) == coroutineSingletons) {
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
