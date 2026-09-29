package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import ci.InterfaceC2025r;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.p055ui.token.InterfaceC4865b;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenEditData;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dj.C5191i;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7140u;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C7127c;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mo.C7661i;
import ni.C7797e;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5182d;
import p097ej.C5416g;
import p097ej.InterfaceC5415f;
import p225kk.C6715l;
import p260m8.C7499b;
import p264mi.C7563c;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/VocabularyViewModel;", "Landroidx/lifecycle/h0;", "Lcom/lingq/ui/token/b;", "Lej/f;", "Lak/j;", "", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class VocabularyViewModel extends AbstractC1036h0 implements InterfaceC4865b, InterfaceC5415f, InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final C5191i f26221H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f26222I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f26223J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f26224K;

    /* JADX INFO: renamed from: L */
    public final StateFlowImpl f26225L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f26226M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f26227N;

    /* JADX INFO: renamed from: O */
    public final StateFlowImpl f26228O;

    /* JADX INFO: renamed from: P */
    public final StateFlowImpl f26229P;

    /* JADX INFO: renamed from: Q */
    public final C7135p f26230Q;

    /* JADX INFO: renamed from: R */
    public final StateFlowImpl f26231R;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f26232S;

    /* JADX INFO: renamed from: T */
    public final C7131l f26233T;

    /* JADX INFO: renamed from: U */
    public final C7138s f26234U;

    /* JADX INFO: renamed from: V */
    public final C7134o f26235V;

    /* JADX INFO: renamed from: W */
    public final C7138s f26236W;

    /* JADX INFO: renamed from: X */
    public final C7134o f26237X;

    /* JADX INFO: renamed from: Y */
    public final C7138s f26238Y;

    /* JADX INFO: renamed from: Z */
    public final C7134o f26239Z;

    /* JADX INFO: renamed from: a0 */
    public final StateFlowImpl f26240a0;

    /* JADX INFO: renamed from: b0 */
    public final C7138s f26241b0;

    /* JADX INFO: renamed from: c0 */
    public final C7134o f26242c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2008a f26243d;

    /* JADX INFO: renamed from: d0 */
    public final C7138s f26244d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2025r f26245e;

    /* JADX INFO: renamed from: e0 */
    public final C7134o f26246e0;

    /* JADX INFO: renamed from: f */
    public final CoroutineJobManager f26247f;

    /* JADX INFO: renamed from: f0 */
    public final C7135p f26248f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5182d f26249g;

    /* JADX INFO: renamed from: g0 */
    public final C7135p f26250g0;

    /* JADX INFO: renamed from: h */
    public final C7797e f26251h;

    /* JADX INFO: renamed from: h0 */
    public final C7135p f26252h0;

    /* JADX INFO: renamed from: i */
    public final CoroutineDispatcher f26253i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC4865b f26254j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC5415f f26255k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0113j f26256l;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$1", m19206f = "VocabularyViewModel.kt", m19207l = {175}, m19208m = "invokeSuspend")
    final class C40191 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26257e;

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$1$1", m19206f = "VocabularyViewModel.kt", m19207l = {179}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f26259e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f26260f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ VocabularyViewModel f26261g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26261g = vocabularyViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26261g, interfaceC9968c);
                anonymousClass1.f26260f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                VocabularyViewModel vocabularyViewModel;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f26259e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    UserLanguage userLanguage = (UserLanguage) this.f26260f;
                    if (userLanguage != null) {
                        VocabularyViewModel vocabularyViewModel2 = this.f26261g;
                        boolean z10 = !C7661i.m15250P2(vocabularyViewModel2.f26221H.f33230a);
                        String str = userLanguage.f21726a;
                        C5191i c5191i = vocabularyViewModel2.f26221H;
                        if (z10 && !C5207g.m11106a(str, c5191i.f33230a)) {
                            vocabularyViewModel2.f26227N.setValue(EmptyList.f38032a);
                            this.f26260f = vocabularyViewModel2;
                            this.f26259e = 1;
                            if (vocabularyViewModel2.mo501d(c5191i.f33230a, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            vocabularyViewModel = vocabularyViewModel2;
                        } else if ((!C7661i.m15250P2(c5191i.f33230a)) && C5207g.m11106a(str, c5191i.f33230a)) {
                            StateFlowImpl stateFlowImpl = vocabularyViewModel2.f26240a0;
                            if (((Boolean) stateFlowImpl.getValue()).booleanValue()) {
                                vocabularyViewModel2.m10058o2();
                                VocabularyViewModel.m10023l2(vocabularyViewModel2);
                            } else {
                                stateFlowImpl.setValue(Boolean.valueOf(!C7661i.m15250P2(c5191i.f33231b)));
                                vocabularyViewModel2.m10058o2();
                                VocabularyViewModel.m10023l2(vocabularyViewModel2);
                            }
                        } else {
                            vocabularyViewModel2.m10058o2();
                            VocabularyViewModel.m10023l2(vocabularyViewModel2);
                        }
                    }
                    return C9072e.f47360a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vocabularyViewModel = (VocabularyViewModel) this.f26260f;
                C7499b.m14977z0(obj);
                vocabularyViewModel.f26229P.setValue(Resource.Status.LOADING);
                return C9072e.f47360a;
            }
        }

        public C40191(InterfaceC9968c<? super C40191> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return VocabularyViewModel.this.new C40191(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40191) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26257e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                VocabularyViewModel vocabularyViewModel = VocabularyViewModel.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = vocabularyViewModel.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(vocabularyViewModel, null);
                this.f26257e = 1;
                if (C0062b.m369m0(interfaceC7142wMo509w0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$2", m19206f = "VocabularyViewModel.kt", m19207l = {194}, m19208m = "invokeSuspend")
    final class C40202 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26262e;

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "showReview", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$2$1", m19206f = "VocabularyViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f26264e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ VocabularyViewModel f26265f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26265f = vocabularyViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26265f, interfaceC9968c);
                anonymousClass1.f26264e = ((Boolean) obj).booleanValue();
                return anonymousClass1;
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
                if (this.f26264e) {
                    this.f26265f.m10059p2();
                }
                return C9072e.f47360a;
            }
        }

        public C40202(InterfaceC9968c<? super C40202> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return VocabularyViewModel.this.new C40202(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40202) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26262e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                VocabularyViewModel vocabularyViewModel = VocabularyViewModel.this;
                C7135p c7135p = vocabularyViewModel.f26250g0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(vocabularyViewModel, null);
                this.f26262e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$3", m19206f = "VocabularyViewModel.kt", m19207l = {202}, m19208m = "invokeSuspend")
    final class C40213 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26266e;

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/vocabulary/VocabularySearchQuery;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$3$1", m19206f = "VocabularyViewModel.kt", m19207l = {203}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends VocabularySearchQuery>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public StateFlowImpl f26268e;

            /* JADX INFO: renamed from: f */
            public int f26269f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ VocabularyViewModel f26270g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26270g = vocabularyViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f26270g, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends VocabularySearchQuery> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                StateFlowImpl stateFlowImpl;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f26269f;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    VocabularyViewModel vocabularyViewModel = this.f26270g;
                    StateFlowImpl stateFlowImpl2 = vocabularyViewModel.f26222I;
                    this.f26268e = stateFlowImpl2;
                    this.f26269f = 1;
                    obj = VocabularyViewModel.m10024m2(vocabularyViewModel, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    stateFlowImpl = stateFlowImpl2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    stateFlowImpl = this.f26268e;
                    C7499b.m14977z0(obj);
                }
                stateFlowImpl.setValue(obj);
                return C9072e.f47360a;
            }
        }

        public C40213(InterfaceC9968c<? super C40213> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return VocabularyViewModel.this.new C40213(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40213) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26266e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                VocabularyViewModel vocabularyViewModel = VocabularyViewModel.this;
                InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = vocabularyViewModel.f26249g.mo9685i();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(vocabularyViewModel, null);
                this.f26266e = 1;
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

    public VocabularyViewModel(InterfaceC2008a interfaceC2008a, InterfaceC2025r interfaceC2025r, C5416g c5416g, InterfaceC4865b interfaceC4865b, InterfaceC0113j interfaceC0113j, CoroutineJobManager coroutineJobManager, InterfaceC5182d interfaceC5182d, C7797e c7797e, ExecutorC7177a executorC7177a, C1024c0 c1024c0) {
        String str;
        String str2;
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC2025r, "vocabularyRepository");
        C5207g.m11111f(interfaceC4865b, "tokenControllerDelegate");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(c7797e, "utils");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f26243d = interfaceC2008a;
        this.f26245e = interfaceC2025r;
        this.f26247f = coroutineJobManager;
        this.f26249g = interfaceC5182d;
        this.f26251h = c7797e;
        this.f26253i = executorC7177a;
        this.f26254j = interfaceC4865b;
        this.f26255k = c5416g;
        this.f26256l = interfaceC0113j;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (linkedHashMap.containsKey("vocabularyLanguageFromDeeplink")) {
            str = (String) c1024c0.m3929b("vocabularyLanguageFromDeeplink");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"vocabularyLanguageFromDeeplink\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        if (linkedHashMap.containsKey("lotd")) {
            str2 = (String) c1024c0.m3929b("lotd");
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"lotd\" is marked as non-null but was passed a null value");
            }
        } else {
            str2 = "";
        }
        this.f26221H = new C5191i(str, str2);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(new Pair(CardStatus.Ignored, CardStatus.Known));
        this.f26222I = stateFlowImplM14379a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(VocabularyAdapter.SelectedContent.All);
        this.f26223J = stateFlowImplM14379a2;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a("");
        this.f26224K = stateFlowImplM14379a3;
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(bool);
        this.f26225L = stateFlowImplM14379a4;
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(0);
        this.f26226M = stateFlowImplM14379a5;
        C7131l c7131l = new C7131l(stateFlowImplM14379a3, stateFlowImplM14379a4, new VocabularyViewModel$_emptyTitleDescription$1(null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedLazily startedLazily = InterfaceC7140u.a.f40388b;
        C7135p c7135pM353h2 = C0062b.m353h2(c7131l, interfaceC7882zM16767w0, startedLazily, new Pair(-1, -1));
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(emptyList);
        this.f26227N = stateFlowImplM14379a6;
        C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a6, new VocabularyViewModel$cards$1(null)), C8573r0.m16767w0(this), startedLazily, emptyList);
        this.f26228O = C7120g.m14379a(bool);
        Resource.Status status = Resource.Status.ERROR;
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(status);
        this.f26229P = stateFlowImplM14379a7;
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f26230Q = C0062b.m353h2(stateFlowImplM14379a7, interfaceC7882zM16767w1, startedWhileSubscribed, status);
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(1);
        this.f26231R = stateFlowImplM14379a8;
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(1);
        this.f26232S = stateFlowImplM14379a9;
        this.f26233T = new C7131l(stateFlowImplM14379a8, stateFlowImplM14379a9, new VocabularyViewModel$pageIndex$1(null));
        C0062b.m341d2(C4924a.m10448a(), C8573r0.m16767w0(this), startedWhileSubscribed);
        C0062b.m341d2(C4924a.m10448a(), C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f26234U = c7138sM10448a;
        this.f26235V = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f26236W = c7138sM10448a2;
        this.f26237X = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f26238Y = c7138sM10448a3;
        this.f26239Z = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a10 = C7120g.m14379a(bool);
        this.f26240a0 = stateFlowImplM14379a10;
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f26241b0 = c7138sM10448a4;
        this.f26242c0 = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f26244d0 = c7138sM10448a5;
        this.f26246e0 = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7135p c7135pM353h3 = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a6, new VocabularyViewModel$vocabularyCanReview$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f26248f0 = c7135pM353h3;
        this.f26250g0 = C0062b.m353h2(new C7131l(c7135pM353h3, stateFlowImplM14379a10, new VocabularyViewModel$showReview$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        final InterfaceC7116c[] interfaceC7116cArr = {stateFlowImplM14379a6, stateFlowImplM14379a2, stateFlowImplM14379a, stateFlowImplM14379a7, c7135pM353h2, stateFlowImplM14379a5};
        this.f26252h0 = C0062b.m353h2(new InterfaceC7116c<List<? extends VocabularyAdapter.AbstractC3987a>>() { // from class: com.lingq.ui.home.vocabulary.VocabularyViewModel$special$$inlined$combine$1

            /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$special$$inlined$combine$1$3 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$special$$inlined$combine$1$3", m19206f = "VocabularyViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
            public static final class C40273 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends VocabularyAdapter.AbstractC3987a>>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f26317e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f26318f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f26319g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ VocabularyViewModel f26320h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C40273(VocabularyViewModel vocabularyViewModel, InterfaceC9968c interfaceC9968c) {
                    super(3, interfaceC9968c);
                    this.f26320h = vocabularyViewModel;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<? super List<? extends VocabularyAdapter.AbstractC3987a>> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C40273 c40273 = new C40273(this.f26320h, interfaceC9968c);
                    c40273.f26318f = interfaceC7117d;
                    c40273.f26319g = objArr;
                    return c40273.mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f26317e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        InterfaceC7117d interfaceC7117d = this.f26318f;
                        Object[] objArr = this.f26319g;
                        Object obj2 = objArr[0];
                        C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.uimodel.vocabulary.VocabularyCard?>");
                        Object obj3 = objArr[1];
                        C5207g.m11109d(obj3, "null cannot be cast to non-null type com.lingq.ui.home.vocabulary.VocabularyAdapter.SelectedContent");
                        Object obj4 = objArr[2];
                        C5207g.m11109d(obj4, "null cannot be cast to non-null type kotlin.Pair<com.lingq.shared.uimodel.CardStatus, com.lingq.shared.uimodel.CardStatus>");
                        Object obj5 = objArr[3];
                        C5207g.m11109d(obj5, "null cannot be cast to non-null type com.lingq.shared.domain.Resource.Status");
                        Resource.Status status = (Resource.Status) obj5;
                        Object obj6 = objArr[4];
                        C5207g.m11109d(obj6, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.Int>");
                        Pair pair = (Pair) obj6;
                        Object obj7 = objArr[5];
                        C5207g.m11109d(obj7, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue = ((Integer) obj7).intValue();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new VocabularyAdapter.AbstractC3987a.d((String) this.f26320h.f26224K.getValue()));
                        arrayList.add(new VocabularyAdapter.AbstractC3987a.c((VocabularyAdapter.SelectedContent) obj3, (Pair) obj4, iIntValue));
                        ArrayList arrayListM13421O = C6752c.m13421O((List) obj2);
                        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayListM13421O, 10));
                        Iterator it = arrayListM13421O.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new VocabularyAdapter.AbstractC3987a.a((C7563c) it.next()));
                        }
                        arrayList.addAll(arrayList2);
                        if (status == Resource.Status.EMPTY) {
                            arrayList.add(new VocabularyAdapter.AbstractC3987a.b(((Number) pair.f38012a).intValue(), ((Number) pair.f38013b).intValue()));
                        }
                        List listM13453u0 = C6752c.m13453u0(arrayList);
                        this.f26317e = 1;
                        if (interfaceC7117d.mo1339r(listM13453u0, this) == coroutineSingletons) {
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

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super List<? extends VocabularyAdapter.AbstractC3987a>> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.home.vocabulary.VocabularyViewModel$special$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Object[] mo807E() {
                        return new Object[interfaceC7116cArr2.length];
                    }
                }, new C40273(this, null), interfaceC7117d, interfaceC7116cArr2);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedLazily, emptyList);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C40191(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C40202(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C40213(null), 3);
    }

    /* JADX INFO: renamed from: l2 */
    public static final void m10023l2(VocabularyViewModel vocabularyViewModel) {
        vocabularyViewModel.f26228O.setValue(Boolean.TRUE);
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(vocabularyViewModel);
        String str = "fetchCards " + vocabularyViewModel.f26232S.getValue();
        VocabularyViewModel$fetchCards$1 vocabularyViewModel$fetchCards$1 = new VocabularyViewModel$fetchCards$1(vocabularyViewModel, null);
        CoroutineJobManager coroutineJobManager = vocabularyViewModel.f26247f;
        C7499b.m14935d0(interfaceC7882zM16767w0, coroutineJobManager, str, vocabularyViewModel$fetchCards$1);
        vocabularyViewModel.m10056n2();
        C7499b.m14935d0(C8573r0.m16767w0(vocabularyViewModel), coroutineJobManager, "observeHasCreatedLingqs", new VocabularyViewModel$observeHasCreatedLingqs$1(vocabularyViewModel, null));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0104  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0100, please report this as an issue */
    /* JADX INFO: renamed from: m2 */
    public static final Serializable m10024m2(VocabularyViewModel vocabularyViewModel, InterfaceC9968c interfaceC9968c) throws Throwable {
        VocabularyViewModel$getCurrentFilterLabel$1 vocabularyViewModel$getCurrentFilterLabel$1;
        LinkedHashMap linkedHashMapM13467T0;
        VocabularySearchQuery vocabularySearchQuery;
        List list;
        int i10;
        VocabularyViewModel vocabularyViewModel2 = vocabularyViewModel;
        vocabularyViewModel.getClass();
        if (interfaceC9968c instanceof VocabularyViewModel$getCurrentFilterLabel$1) {
            vocabularyViewModel$getCurrentFilterLabel$1 = (VocabularyViewModel$getCurrentFilterLabel$1) interfaceC9968c;
            int i11 = vocabularyViewModel$getCurrentFilterLabel$1.f26287g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vocabularyViewModel$getCurrentFilterLabel$1.f26287g = i11 - Integer.MIN_VALUE;
            } else {
                vocabularyViewModel$getCurrentFilterLabel$1 = new VocabularyViewModel$getCurrentFilterLabel$1(vocabularyViewModel2, interfaceC9968c);
            }
        } else {
            vocabularyViewModel$getCurrentFilterLabel$1 = new VocabularyViewModel$getCurrentFilterLabel$1(vocabularyViewModel2, interfaceC9968c);
        }
        Object objM14360a = vocabularyViewModel$getCurrentFilterLabel$1.f26285e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = vocabularyViewModel$getCurrentFilterLabel$1.f26287g;
        if (i12 != 0) {
            if (i12 == 1) {
                vocabularyViewModel2 = vocabularyViewModel$getCurrentFilterLabel$1.f26284d;
                C7499b.m14977z0(objM14360a);
            } else if (i12 == 2) {
                vocabularyViewModel2 = vocabularyViewModel$getCurrentFilterLabel$1.f26284d;
                C7499b.m14977z0(objM14360a);
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                linkedHashMapM13467T0.put(vocabularyViewModel2.mo498E1(), new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null));
                vocabularyViewModel$getCurrentFilterLabel$1.f26284d = vocabularyViewModel2;
                vocabularyViewModel$getCurrentFilterLabel$1.f26287g = 3;
                if (vocabularyViewModel2.f26249g.mo9694r(linkedHashMapM13467T0, vocabularyViewModel$getCurrentFilterLabel$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = vocabularyViewModel2.f26249g.mo9685i();
                vocabularyViewModel$getCurrentFilterLabel$1.f26284d = vocabularyViewModel2;
                vocabularyViewModel$getCurrentFilterLabel$1.f26287g = 4;
                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i, vocabularyViewModel$getCurrentFilterLabel$1);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i12 == 3) {
                vocabularyViewModel2 = vocabularyViewModel$getCurrentFilterLabel$1.f26284d;
                C7499b.m14977z0(objM14360a);
                InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i2 = vocabularyViewModel2.f26249g.mo9685i();
                vocabularyViewModel$getCurrentFilterLabel$1.f26284d = vocabularyViewModel2;
                vocabularyViewModel$getCurrentFilterLabel$1.f26287g = 4;
                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i2, vocabularyViewModel$getCurrentFilterLabel$1);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vocabularyViewModel2 = vocabularyViewModel$getCurrentFilterLabel$1.f26284d;
                C7499b.m14977z0(objM14360a);
            }
            vocabularySearchQuery = (VocabularySearchQuery) ((Map) objM14360a).get(vocabularyViewModel2.mo498E1());
            if (vocabularySearchQuery != null || (list = vocabularySearchQuery.f22134h) == null) {
                list = EmptyList.f38032a;
            }
            if (!list.isEmpty()) {
                return new Pair(CardStatus.New, CardStatus.Known);
            }
            if (vocabularySearchQuery != null) {
                i10 = vocabularySearchQuery.f22127a;
            } else {
                i10 = 0;
            }
            return new Pair((CardStatus) list.get(i10), (CardStatus) list.get(vocabularySearchQuery != null ? vocabularySearchQuery.f22128b : 0));
        }
        C7499b.m14977z0(objM14360a);
        InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i3 = vocabularyViewModel2.f26249g.mo9685i();
        vocabularyViewModel$getCurrentFilterLabel$1.f26284d = vocabularyViewModel2;
        vocabularyViewModel$getCurrentFilterLabel$1.f26287g = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i3, vocabularyViewModel$getCurrentFilterLabel$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((Map) objM14360a).get(vocabularyViewModel2.mo498E1()) == null) {
            InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i4 = vocabularyViewModel2.f26249g.mo9685i();
            vocabularyViewModel$getCurrentFilterLabel$1.f26284d = vocabularyViewModel2;
            vocabularyViewModel$getCurrentFilterLabel$1.f26287g = 2;
            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i4, vocabularyViewModel$getCurrentFilterLabel$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
            linkedHashMapM13467T0.put(vocabularyViewModel2.mo498E1(), new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null));
            vocabularyViewModel$getCurrentFilterLabel$1.f26284d = vocabularyViewModel2;
            vocabularyViewModel$getCurrentFilterLabel$1.f26287g = 3;
            if (vocabularyViewModel2.f26249g.mo9694r(linkedHashMapM13467T0, vocabularyViewModel$getCurrentFilterLabel$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i5 = vocabularyViewModel2.f26249g.mo9685i();
        vocabularyViewModel$getCurrentFilterLabel$1.f26284d = vocabularyViewModel2;
        vocabularyViewModel$getCurrentFilterLabel$1.f26287g = 4;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i5, vocabularyViewModel$getCurrentFilterLabel$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        vocabularySearchQuery = (VocabularySearchQuery) ((Map) objM14360a).get(vocabularyViewModel2.mo498E1());
        if (vocabularySearchQuery != null) {
            list = EmptyList.f38032a;
        } else {
            list = EmptyList.f38032a;
        }
        if (!list.isEmpty()) {
            return new Pair(CardStatus.New, CardStatus.Known);
        }
        if (vocabularySearchQuery != null) {
            i10 = vocabularySearchQuery.f22127a;
        } else {
            i10 = 0;
        }
        return new Pair((CardStatus) list.get(i10), (CardStatus) list.get(vocabularySearchQuery != null ? vocabularySearchQuery.f22128b : 0));
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: A1 */
    public final void mo10025A1() {
        this.f26254j.mo10025A1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f26256l.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26256l.mo497B0(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: D */
    public final InterfaceC7137r<TokenEditData> mo10026D() {
        return this.f26254j.mo10026D();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f26256l.mo498E1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC7137r<String> mo10027H0() {
        return this.f26254j.mo10027H0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: I0 */
    public final void mo10028I0(TokenRelatedPhrase tokenRelatedPhrase, int i10, int i11, int i12) {
        this.f26254j.mo10028I0(tokenRelatedPhrase, i10, i11, i12);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26256l.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC7137r<String> mo10029L0() {
        return this.f26254j.mo10029L0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N0 */
    public final void mo10030N0(String str) {
        this.f26254j.mo10030N0(str);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N1 */
    public final InterfaceC7137r<TokenData> mo10031N1() {
        return this.f26254j.mo10031N1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f26256l.mo500P();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: P1 */
    public final void mo10032P1(int i10) {
        this.f26254j.mo10032P1(i10);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Q1 */
    public final void mo10033Q1(boolean z10, boolean z11) {
        this.f26254j.mo10033Q1(z10, z11);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: S */
    public final InterfaceC7137r<Integer> mo10034S() {
        return this.f26254j.mo10034S();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: U1 */
    public final InterfaceC7137r<TokenData> mo10035U1() {
        return this.f26254j.mo10035U1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V */
    public final InterfaceC7137r<TokenRelatedPhrase> mo10036V() {
        return this.f26254j.mo10036V();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V0 */
    public final void mo10037V0(TokenMeaning tokenMeaning) {
        this.f26254j.mo10037V0(tokenMeaning);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: W1 */
    public final InterfaceC7137r<C9072e> mo10038W1() {
        return this.f26254j.mo10038W1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Y */
    public final InterfaceC7137r<TokenData> mo10039Y() {
        return this.f26254j.mo10039Y();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: Y0 */
    public final void mo10040Y0() {
        this.f26255k.mo10040Y0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b */
    public final void mo10041b() {
        this.f26254j.mo10041b();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b2 */
    public final InterfaceC7137r<C9072e> mo10042b2() {
        return this.f26254j.mo10042b2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: c1 */
    public final InterfaceC7137r<Boolean> mo10043c1() {
        return this.f26254j.mo10043c1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26256l.mo501d(str, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: d2 */
    public final InterfaceC7137r<C9072e> mo10044d2() {
        return this.f26254j.mo10044d2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: e0 */
    public final void mo10045e0() {
        this.f26254j.mo10045e0();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: e1 */
    public final void mo10046e1() {
        this.f26255k.mo10046e1();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: e2 */
    public final InterfaceC7137r<Boolean> mo10047e2() {
        return this.f26255k.mo10047e2();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f26256l;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26256l.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: f2 */
    public final void mo10048f2(TokenData tokenData) {
        this.f26254j.mo10048f2(tokenData);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: g */
    public final void mo10049g() {
        this.f26254j.mo10049g();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: h1 */
    public final void mo10050h1(FilterType filterType) {
        C5207g.m11111f(filterType, "filterType");
        this.f26255k.mo10050h1(filterType);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: j */
    public final InterfaceC7137r<C9072e> mo10051j() {
        return this.f26254j.mo10051j();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f26256l.mo504j1();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: k */
    public final InterfaceC7137r<Boolean> mo10052k() {
        return this.f26255k.mo10052k();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: l */
    public final InterfaceC7137r<C9072e> mo10053l() {
        return this.f26254j.mo10053l();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26256l.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f26256l.mo506l1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: m */
    public final InterfaceC7137r<TokenMeaning> mo10054m() {
        return this.f26254j.mo10054m();
    }

    @Override // p097ej.InterfaceC5415f
    /* JADX INFO: renamed from: n1 */
    public final InterfaceC7137r<FilterType> mo10055n1() {
        return this.f26255k.mo10055n1();
    }

    /* JADX INFO: renamed from: n2 */
    public final void m10056n2() {
        C7499b.m14935d0(C8573r0.m16767w0(this), this.f26247f, "observeCards " + this.f26232S.getValue(), new VocabularyViewModel$observableVocabulary$1(this, null));
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: o0 */
    public final void mo10057o0(TokenMeaning tokenMeaning, String str) {
        this.f26254j.mo10057o0(tokenMeaning, str);
    }

    /* JADX INFO: renamed from: o2 */
    public final void m10058o2() {
        this.f26232S.setValue(1);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new VocabularyViewModel$resetCurrentPage$1(this, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f26256l.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m10059p2() {
        List<C7563c> list = (List) this.f26227N.getValue();
        ArrayList arrayList = new ArrayList();
        for (C7563c c7563c : list) {
            String str = c7563c != null ? c7563c.f41680b : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f26238Y.mo14371k(new AbstractC4033e.b(arrayList));
        }
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: q1 */
    public final InterfaceC7137r<Pair<TokenMeaning, String>> mo10060q1() {
        return this.f26254j.mo10060q1();
    }

    /* JADX INFO: renamed from: q2 */
    public final void m10061q2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new VocabularyViewModel$update$1(this, null), 3);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: r */
    public final void mo10062r(String str) {
        this.f26254j.mo10062r(str);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m10063r2(String str, int i10) {
        C5207g.m11111f(str, "term");
        C7828f.m15570d(C8573r0.m16767w0(this), this.f26253i, null, new VocabularyViewModel$updateStatus$1(i10, this, str, null), 2);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: t0 */
    public final void mo10064t0(TokenData tokenData) {
        C5207g.m11111f(tokenData, "updateTokenData");
        this.f26254j.mo10064t0(tokenData);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f26256l.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f26256l.mo509w0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: z */
    public final void mo10065z() {
        this.f26254j.mo10065z();
    }
}
