package com.lingq.p055ui.home.search;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2014g;
import ci.InterfaceC2022o;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.FastSearchData;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7119f;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mo.C7661i;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p181ii.C6332a;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import th.InterfaceC9284a;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/search/SearchViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lth/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SearchViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC9284a {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f25994H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f25995I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f25996J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f25997K;

    /* JADX INFO: renamed from: L */
    public final StateFlowImpl f25998L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f25999M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f26000N;

    /* JADX INFO: renamed from: O */
    public final C7135p f26001O;

    /* JADX INFO: renamed from: P */
    public final C7138s f26002P;

    /* JADX INFO: renamed from: Q */
    public final C7134o f26003Q;

    /* JADX INFO: renamed from: d */
    public final CoroutineJobManager f26004d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3324a f26005e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2022o f26006f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2014g f26007g;

    /* JADX INFO: renamed from: h */
    public final CoroutineDispatcher f26008h;

    /* JADX INFO: renamed from: i */
    public final C1024c0 f26009i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0113j f26010j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC9284a f26011k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f26012l;

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$1", m19206f = "SearchViewModel.kt", m19207l = {69}, m19208m = "invokeSuspend")
    final class C39721 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26013e;

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$1$1", m19206f = "SearchViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ SearchViewModel f26015e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchViewModel searchViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26015e = searchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f26015e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f26015e.m10014m2();
                return C9072e.f47360a;
            }
        }

        public C39721(InterfaceC9968c<? super C39721> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SearchViewModel.this.new C39721(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39721) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26013e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = SearchViewModel.this;
                InterfaceC7116c interfaceC7116cM14378a = C7119f.m14378a(searchViewModel.f25995I);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchViewModel, null);
                this.f26013e = 1;
                if (C0062b.m369m0(interfaceC7116cM14378a, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$2", m19206f = "SearchViewModel.kt", m19207l = {75}, m19208m = "invokeSuspend")
    final class C39732 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26016e;

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lii/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$2$1", m19206f = "SearchViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C6332a>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ SearchViewModel f26018e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchViewModel searchViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26018e = searchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f26018e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C6332a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = this.f26018e;
                searchViewModel.f26000N.setValue(SearchViewModel.m10013l2(searchViewModel));
                return C9072e.f47360a;
            }
        }

        public C39732(InterfaceC9968c<? super C39732> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SearchViewModel.this.new C39732(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39732) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26016e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = SearchViewModel.this;
                StateFlowImpl stateFlowImpl = searchViewModel.f25996J;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchViewModel, null);
                this.f26016e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$3", m19206f = "SearchViewModel.kt", m19207l = {81}, m19208m = "invokeSuspend")
    final class C39743 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26019e;

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$3$1", m19206f = "SearchViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ SearchViewModel f26021e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchViewModel searchViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26021e = searchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f26021e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = this.f26021e;
                searchViewModel.f26000N.setValue(SearchViewModel.m10013l2(searchViewModel));
                return C9072e.f47360a;
            }
        }

        public C39743(InterfaceC9968c<? super C39743> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SearchViewModel.this.new C39743(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39743) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26019e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = SearchViewModel.this;
                StateFlowImpl stateFlowImpl = searchViewModel.f25997K;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchViewModel, null);
                this.f26019e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$4", m19206f = "SearchViewModel.kt", m19207l = {87}, m19208m = "invokeSuspend")
    final class C39754 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26022e;

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lii/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$4$1", m19206f = "SearchViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C6332a>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ SearchViewModel f26024e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchViewModel searchViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26024e = searchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f26024e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C6332a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = this.f26024e;
                searchViewModel.f26000N.setValue(SearchViewModel.m10013l2(searchViewModel));
                return C9072e.f47360a;
            }
        }

        public C39754(InterfaceC9968c<? super C39754> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SearchViewModel.this.new C39754(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39754) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26022e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = SearchViewModel.this;
                StateFlowImpl stateFlowImpl = searchViewModel.f25998L;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchViewModel, null);
                this.f26022e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$5", m19206f = "SearchViewModel.kt", m19207l = {93}, m19208m = "invokeSuspend")
    final class C39765 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26025e;

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/FastSearchData;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$5$1", m19206f = "SearchViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends FastSearchData>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ SearchViewModel f26027e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchViewModel searchViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26027e = searchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f26027e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends FastSearchData> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = this.f26027e;
                searchViewModel.f26000N.setValue(SearchViewModel.m10013l2(searchViewModel));
                return C9072e.f47360a;
            }
        }

        public C39765(InterfaceC9968c<? super C39765> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SearchViewModel.this.new C39765(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39765) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26025e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = SearchViewModel.this;
                StateFlowImpl stateFlowImpl = searchViewModel.f25999M;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchViewModel, null);
                this.f26025e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$6", m19206f = "SearchViewModel.kt", m19207l = {99}, m19208m = "invokeSuspend")
    final class C39776 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26028e;

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$6$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$6$1", m19206f = "SearchViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ SearchViewModel f26030e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchViewModel searchViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26030e = searchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f26030e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = this.f26030e;
                searchViewModel.f26000N.setValue(SearchViewModel.m10013l2(searchViewModel));
                return C9072e.f47360a;
            }
        }

        public C39776(InterfaceC9968c<? super C39776> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SearchViewModel.this.new C39776(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39776) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26028e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = SearchViewModel.this;
                StateFlowImpl stateFlowImpl = searchViewModel.f26012l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchViewModel, null);
                this.f26028e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$7 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$7", m19206f = "SearchViewModel.kt", m19207l = {105}, m19208m = "invokeSuspend")
    final class C39787 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26031e;

        /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchViewModel$7$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$7$1", m19206f = "SearchViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ SearchViewModel f26033e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchViewModel searchViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26033e = searchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f26033e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = this.f26033e;
                searchViewModel.f26000N.setValue(SearchViewModel.m10013l2(searchViewModel));
                return C9072e.f47360a;
            }
        }

        public C39787(InterfaceC9968c<? super C39787> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SearchViewModel.this.new C39787(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39787) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26031e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SearchViewModel searchViewModel = SearchViewModel.this;
                StateFlowImpl stateFlowImpl = searchViewModel.f25994H;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchViewModel, null);
                this.f26031e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    public SearchViewModel(CoroutineJobManager coroutineJobManager, InterfaceC3324a interfaceC3324a, InterfaceC2022o interfaceC2022o, InterfaceC2014g interfaceC2014g, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, InterfaceC9284a interfaceC9284a, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2022o, "searchRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC9284a, "reportDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f26004d = coroutineJobManager;
        this.f26005e = interfaceC3324a;
        this.f26006f = interfaceC2022o;
        this.f26007g = interfaceC2014g;
        this.f26008h = executorC7177a;
        this.f26009i = c1024c0;
        this.f26010j = interfaceC0113j;
        this.f26011k = interfaceC9284a;
        this.f26012l = C7120g.m14379a(Boolean.FALSE);
        this.f25994H = C7120g.m14379a(Boolean.TRUE);
        String str = (String) c1024c0.m3929b("query");
        this.f25995I = C7120g.m14379a(str == null ? "" : str);
        EmptyList emptyList = EmptyList.f38032a;
        this.f25996J = C7120g.m14379a(emptyList);
        this.f25997K = C7120g.m14379a(emptyList);
        this.f25998L = C7120g.m14379a(emptyList);
        this.f25999M = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f26000N = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f26001O = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f26002P = c7138sM10448a;
        this.f26003Q = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        m10014m2();
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39721(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39732(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39743(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39754(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39765(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39776(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C39787(null), 3);
    }

    /* JADX INFO: renamed from: l2 */
    public static final ArrayList m10013l2(SearchViewModel searchViewModel) {
        Object next;
        searchViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        StateFlowImpl stateFlowImpl = searchViewModel.f25995I;
        arrayList.add(new SearchAdapter.AbstractC3964c.e((String) stateFlowImpl.getValue()));
        if (((Boolean) searchViewModel.f26012l.getValue()).booleanValue()) {
            ArrayList arrayList2 = new ArrayList(3);
            for (int i10 = 0; i10 < 3; i10++) {
                arrayList2.add(SearchAdapter.AbstractC3964c.d.f25951a);
            }
            arrayList.addAll(arrayList2);
        } else if (((Boolean) searchViewModel.f25994H.getValue()).booleanValue() || C7661i.m15250P2((CharSequence) stateFlowImpl.getValue())) {
            arrayList.add(new SearchAdapter.AbstractC3964c.b(!C7661i.m15250P2((CharSequence) stateFlowImpl.getValue())));
        } else {
            List<C6332a> list = (List) searchViewModel.f25996J.getValue();
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list, 10));
                for (C6332a c6332a : list) {
                    Iterator it = ((Iterable) searchViewModel.f25997K.getValue()).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((LibraryItemCounter) next).f22004a == c6332a.f36595a));
                    arrayList3.add(new SearchAdapter.AbstractC3964c.c(c6332a, (LibraryItemCounter) next));
                }
                arrayList.addAll(arrayList3);
            }
            List list2 = (List) searchViewModel.f25998L.getValue();
            if (!list2.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(C9325m.m17681z(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new SearchAdapter.AbstractC3964c.a((C6332a) it2.next()));
                }
                arrayList.addAll(arrayList4);
            }
            List list3 = (List) searchViewModel.f25999M.getValue();
            if (!list3.isEmpty()) {
                ArrayList arrayList5 = new ArrayList(C9325m.m17681z(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new SearchAdapter.AbstractC3964c.f((FastSearchData) it3.next()));
                }
                arrayList.addAll(arrayList5);
            }
        }
        return arrayList;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f26010j.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26010j.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f26010j.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26010j.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f26010j.mo500P();
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: W */
    public final Object mo9830W(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26011k.mo9830W(str, i10, str2, str3, interfaceC9968c);
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: a0 */
    public final void mo9831a0(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        this.f26011k.mo9831a0(str, i10, str2, str3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26010j.mo501d(str, interfaceC9968c);
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: f */
    public final Object mo9832f(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26011k.mo9832f(str, i10, str2, str3, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f26010j;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26010j.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f26010j.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26010j.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f26010j.mo506l1();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m10014m2() {
        if (!(!C7661i.m15250P2((CharSequence) this.f25995I.getValue()))) {
            this.f26012l.setValue(Boolean.FALSE);
            this.f25994H.setValue(Boolean.TRUE);
            return;
        }
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        SearchViewModel$observableFastSearchLessons$1 searchViewModel$observableFastSearchLessons$1 = new SearchViewModel$observableFastSearchLessons$1(this, null);
        CoroutineJobManager coroutineJobManager = this.f26004d;
        CoroutineDispatcher coroutineDispatcher = this.f26008h;
        C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "observableFastSearchLessons", searchViewModel$observableFastSearchLessons$1);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "observableFastSearchLessonCounters", new SearchViewModel$observableFastSearchLessonCounters$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "observableFastSearchCourses", new SearchViewModel$observableFastSearchCourses$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "observableFastSearchExtraData", new SearchViewModel$observableFastSearchExtraData$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "networkFastSearch", new SearchViewModel$networkFastSearch$1(this, null));
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: n */
    public final void mo9834n(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        this.f26011k.mo9834n(str, i10, str2, str3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f26010j.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f26010j.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f26010j.mo509w0();
    }
}
