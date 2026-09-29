package com.lingq.p055ui.home.vocabulary.filter;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2010c;
import ci.InterfaceC2012e;
import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.vocabulary.VocabularySearch;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import com.lingq.shared.uimodel.vocabulary.VocabularySort;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5182d;
import p225kk.C6715l;
import p260m8.C7499b;
import p278nh.C7785l;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/filter/VocabularyFilterSelectionViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class VocabularyFilterSelectionViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final C7135p f26423H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f26424I;

    /* JADX INFO: renamed from: J */
    public final C7135p f26425J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f26426K;

    /* JADX INFO: renamed from: L */
    public final C7135p f26427L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f26428M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f26429N;

    /* JADX INFO: renamed from: O */
    public final StateFlowImpl f26430O;

    /* JADX INFO: renamed from: P */
    public final StateFlowImpl f26431P;

    /* JADX INFO: renamed from: Q */
    public final C7135p f26432Q;

    /* JADX INFO: renamed from: R */
    public final C7138s f26433R;

    /* JADX INFO: renamed from: S */
    public final C7134o f26434S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f26435T;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5182d f26436d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2010c f26437e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3324a f26438f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2012e f26439g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2014g f26440h;

    /* JADX INFO: renamed from: i */
    public final CoroutineDispatcher f26441i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0113j f26442j;

    /* JADX INFO: renamed from: k */
    public final FilterType f26443k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f26444l;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {123}, m19208m = "invokeSuspend")
    final class C40561 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26445e;

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lnh/l;", "items", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$1$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C7785l>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f26447e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ VocabularyFilterSelectionViewModel f26448f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26448f = vocabularyFilterSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26448f, interfaceC9968c);
                anonymousClass1.f26447e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C7785l> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f26448f.f26426K.setValue((List) this.f26447e);
                return C9072e.f47360a;
            }
        }

        public C40561(InterfaceC9968c<? super C40561> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return VocabularyFilterSelectionViewModel.this.new C40561(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40561) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26445e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel = VocabularyFilterSelectionViewModel.this;
                C7135p c7135p = vocabularyFilterSelectionViewModel.f26432Q;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(vocabularyFilterSelectionViewModel, null);
                this.f26445e = 1;
                if (C0062b.m369m0(c7135p, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$2", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {130}, m19208m = "invokeSuspend")
    final class C40572 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26449e;

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/vocabulary/VocabularySearchQuery;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$2$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends VocabularySearchQuery>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f26451e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ VocabularyFilterSelectionViewModel f26452f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26452f = vocabularyFilterSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26452f, interfaceC9968c);
                anonymousClass1.f26451e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends VocabularySearchQuery> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Map map = (Map) this.f26451e;
                VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel = this.f26452f;
                vocabularyFilterSelectionViewModel.f26435T.setValue(map.get(vocabularyFilterSelectionViewModel.mo498E1()));
                vocabularyFilterSelectionViewModel.m10072l2();
                return C9072e.f47360a;
            }
        }

        public C40572(InterfaceC9968c<? super C40572> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return VocabularyFilterSelectionViewModel.this.new C40572(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40572) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26449e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel = VocabularyFilterSelectionViewModel.this;
                InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = vocabularyFilterSelectionViewModel.f26436d.mo9685i();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(vocabularyFilterSelectionViewModel, null);
                this.f26449e = 1;
                if (C0062b.m369m0(interfaceC7116cMo9685i, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$a */
    public /* synthetic */ class C4058a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26456a;

        static {
            int[] iArr = new int[FilterType.values().length];
            try {
                iArr[FilterType.Status.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterType.SortBy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterType.SearchTerm.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterType.Course.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FilterType.Lesson.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FilterType.Tags.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f26456a = iArr;
        }
    }

    public VocabularyFilterSelectionViewModel(InterfaceC5182d interfaceC5182d, InterfaceC2010c interfaceC2010c, InterfaceC3324a interfaceC3324a, InterfaceC2012e interfaceC2012e, InterfaceC2014g interfaceC2014g, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC2010c, "courseRepository");
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f26436d = interfaceC5182d;
        this.f26437e = interfaceC2010c;
        this.f26438f = interfaceC3324a;
        this.f26439g = interfaceC2012e;
        this.f26440h = interfaceC2014g;
        this.f26441i = executorC7177a;
        this.f26442j = interfaceC0113j;
        FilterType filterType = (FilterType) c1024c0.m3929b("filterType");
        this.f26443k = filterType;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a("");
        this.f26444l = stateFlowImplM14379a;
        FilterType filterType2 = FilterType.Tags;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(Boolean.valueOf(filterType == filterType2));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        Boolean bool = Boolean.FALSE;
        this.f26423H = C0062b.m353h2(stateFlowImplM14379a2, interfaceC7882zM16767w0, startedWhileSubscribed, bool);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(bool);
        this.f26424I = stateFlowImplM14379a3;
        this.f26425J = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(emptyList);
        this.f26426K = stateFlowImplM14379a4;
        this.f26427L = C0062b.m353h2(new C7131l(stateFlowImplM14379a4, stateFlowImplM14379a, new VocabularyFilterSelectionViewModel$selectionItems$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f26428M = C7120g.m14379a(emptyList);
        this.f26429N = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(emptyList);
        this.f26430O = stateFlowImplM14379a5;
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(emptyList);
        this.f26431P = stateFlowImplM14379a6;
        this.f26432Q = C0062b.m353h2(C0062b.m377o0(stateFlowImplM14379a5, stateFlowImplM14379a6, stateFlowImplM14379a, new VocabularyFilterSelectionViewModel$_tags$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f26433R = c7138sM10448a;
        this.f26434S = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f26435T = C7120g.m14379a(null);
        m10072l2();
        if (filterType == filterType2) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C40561(null), 3);
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C40572(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f26442j.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26442j.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f26442j.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26442j.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f26442j.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26442j.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f26442j;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26442j.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f26442j.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26442j.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f26442j.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m10072l2() {
        VocabularySort vocabularySort;
        VocabularySearch vocabularySearch;
        Pair<String, Integer> pair;
        Integer num;
        Pair<String, Integer> pair2;
        Integer num2;
        Pair<String, Integer> pair3;
        FilterType filterType = this.f26443k;
        int i10 = filterType == null ? -1 : C4058a.f26456a[filterType.ordinal()];
        StateFlowImpl stateFlowImpl = this.f26426K;
        StateFlowImpl stateFlowImpl2 = this.f26435T;
        int iIntValue = 0;
        if (i10 == 2) {
            new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
            List<VocabularySort> listM17252r = C9000b.m17252r(VocabularySort.AtoZ, VocabularySort.CreationDate, VocabularySort.Importance, VocabularySort.Status);
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listM17252r, 10));
            for (VocabularySort vocabularySort2 : listM17252r) {
                Integer numValueOf = Integer.valueOf(C4924a.m10432K(vocabularySort2));
                String roomColumnName = vocabularySort2.getRoomColumnName();
                VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) stateFlowImpl2.getValue();
                arrayList.add(new C7785l(numValueOf, null, C5207g.m11106a(roomColumnName, (vocabularySearchQuery == null || (vocabularySort = vocabularySearchQuery.f22131e) == null) ? null : vocabularySort.getRoomColumnName()), vocabularySort2.getRoomColumnName(), 2));
            }
            stateFlowImpl.setValue(arrayList);
            return;
        }
        if (i10 == 3) {
            new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
            List<VocabularySearch> listM17252r2 = C9000b.m17252r(VocabularySearch.StartsWith, VocabularySearch.EndsWith, VocabularySearch.Contains, VocabularySearch.PhraseContaining, VocabularySearch.MeaningContaining);
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listM17252r2, 10));
            for (VocabularySearch vocabularySearch2 : listM17252r2) {
                Integer numValueOf2 = Integer.valueOf(C4924a.m10431J(vocabularySearch2));
                String columnName = vocabularySearch2.getColumnName();
                VocabularySearchQuery vocabularySearchQuery2 = (VocabularySearchQuery) stateFlowImpl2.getValue();
                arrayList2.add(new C7785l(numValueOf2, null, C5207g.m11106a(columnName, (vocabularySearchQuery2 == null || (vocabularySearch = vocabularySearchQuery2.f22129c) == null) ? null : vocabularySearch.getColumnName()), vocabularySearch2.getColumnName(), 2));
            }
            stateFlowImpl.setValue(arrayList2);
            return;
        }
        if (i10 == 4) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new VocabularyFilterSelectionViewModel$getCourses$1(this, null), 3);
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new VocabularyFilterSelectionViewModel$networkVocabularyCourses$1(this, null), 3);
            return;
        }
        if (i10 != 5) {
            if (i10 != 6) {
                return;
            }
            InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
            VocabularyFilterSelectionViewModel$getLanguageTags$1 vocabularyFilterSelectionViewModel$getLanguageTags$1 = new VocabularyFilterSelectionViewModel$getLanguageTags$1(this, null);
            CoroutineDispatcher coroutineDispatcher = this.f26441i;
            C7828f.m15570d(interfaceC7882zM16767w0, coroutineDispatcher, null, vocabularyFilterSelectionViewModel$getLanguageTags$1, 2);
            C7828f.m15570d(C8573r0.m16767w0(this), coroutineDispatcher, null, new VocabularyFilterSelectionViewModel$networkLanguageTags$1(this, null), 2);
            return;
        }
        VocabularySearchQuery vocabularySearchQuery3 = (VocabularySearchQuery) stateFlowImpl2.getValue();
        if (((vocabularySearchQuery3 == null || (pair3 = vocabularySearchQuery3.f22135i) == null) ? null : pair3.f38013b) != null) {
            VocabularySearchQuery vocabularySearchQuery4 = (VocabularySearchQuery) stateFlowImpl2.getValue();
            if (!((vocabularySearchQuery4 == null || (pair2 = vocabularySearchQuery4.f22135i) == null || (num2 = pair2.f38013b) == null || num2.intValue() != 0) ? false : true)) {
                C7828f.m15570d(C8573r0.m16767w0(this), null, null, new VocabularyFilterSelectionViewModel$getCourseLessons$1(this, null), 3);
                VocabularySearchQuery vocabularySearchQuery5 = (VocabularySearchQuery) stateFlowImpl2.getValue();
                if (vocabularySearchQuery5 != null && (pair = vocabularySearchQuery5.f22135i) != null && (num = pair.f38013b) != null) {
                    iIntValue = num.intValue();
                }
                C7828f.m15570d(C8573r0.m16767w0(this), null, null, new VocabularyFilterSelectionViewModel$networkCourseLessons$1(this, iIntValue, null), 3);
                return;
            }
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new VocabularyFilterSelectionViewModel$getLessons$1(this, null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new VocabularyFilterSelectionViewModel$networkVocabularyLessons$1(this, null), 3);
    }

    /* JADX INFO: renamed from: m2 */
    public final void m10073m2(VocabularySearchQuery vocabularySearchQuery) {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new VocabularyFilterSelectionViewModel$updateStoreQuery$1(this, vocabularySearchQuery, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f26442j.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f26442j.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f26442j.mo509w0();
    }
}
