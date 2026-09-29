package com.lingq.p055ui.review.activities;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2024q;
import cm.InterfaceC2056p;
import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.review.views.speaking.SpeechRecognitionState;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.lingq.util.C4925b;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p225kk.C6715l;
import p260m8.C7499b;
import p265mj.C7570d;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import p513yj.C10408j;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/review/activities/ReviewActivitySpeakingViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewActivitySpeakingViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f30020H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f30021I;

    /* JADX INFO: renamed from: J */
    public final C7135p f30022J;

    /* JADX INFO: renamed from: K */
    public String f30023K;

    /* JADX INFO: renamed from: L */
    public final Locale f30024L;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f30025d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2024q f30026e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3275c f30027f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5179a f30028g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0113j f30029h;

    /* JADX INFO: renamed from: i */
    public final int f30030i;

    /* JADX INFO: renamed from: j */
    public final int f30031j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f30032k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f30033l;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$1", m19206f = "ReviewActivitySpeakingViewModel.kt", m19207l = {75, 76}, m19208m = "invokeSuspend")
    final class C46321 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30034e;

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "hasTts", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$1$1", m19206f = "ReviewActivitySpeakingViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ int f30036e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ReviewActivitySpeakingViewModel f30037f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f30037f = reviewActivitySpeakingViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f30037f, interfaceC9968c);
                anonymousClass1.f30036e = ((Number) obj).intValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                Object value;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                int i10 = this.f30036e;
                StateFlowImpl stateFlowImpl = this.f30037f.f30021I;
                do {
                    value = stateFlowImpl.getValue();
                } while (!stateFlowImpl.mo14366c(value, C10408j.m19394a((C10408j) value, i10 > 0, 0, null, null, null, null, null, 126)));
                return C9072e.f47360a;
            }
        }

        public C46321(InterfaceC9968c<? super C46321> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewActivitySpeakingViewModel.this.new C46321(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46321) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30034e;
            ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel = ReviewActivitySpeakingViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            C7499b.m14977z0(obj);
            InterfaceC2024q interfaceC2024q = reviewActivitySpeakingViewModel.f30026e;
            String strMo498E1 = reviewActivitySpeakingViewModel.mo498E1();
            this.f30034e = 1;
            obj = interfaceC2024q.mo6170a(strMo498E1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(reviewActivitySpeakingViewModel, null);
            this.f30034e = 2;
            return C0062b.m369m0((InterfaceC7116c) obj, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2", m19206f = "ReviewActivitySpeakingViewModel.kt", m19207l = {84}, m19208m = "invokeSuspend")
    final class C46332 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30038e;

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$3, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlin/Pair;", "", "", "Lmj/d;", "sentenceText", "tokens", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$3", m19206f = "ReviewActivitySpeakingViewModel.kt", m19207l = {83}, m19208m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super Pair<? extends String, ? extends List<? extends C7570d>>>, String, List<? extends C7570d>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f30040e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ InterfaceC7117d f30041f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ String f30042g;

            /* JADX INFO: renamed from: h */
            public /* synthetic */ List f30043h;

            public AnonymousClass3(InterfaceC9968c<? super AnonymousClass3> interfaceC9968c) {
                super(4, interfaceC9968c);
            }

            @Override // cm.InterfaceC2058r
            /* JADX INFO: renamed from: T */
            public final Object mo1851T(InterfaceC7117d<? super Pair<? extends String, ? extends List<? extends C7570d>>> interfaceC7117d, String str, List<? extends C7570d> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC9968c);
                anonymousClass3.f30041f = interfaceC7117d;
                anonymousClass3.f30042g = str;
                anonymousClass3.f30043h = list;
                return anonymousClass3.mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f30040e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC7117d interfaceC7117d = this.f30041f;
                    Pair pair = new Pair(this.f30042g, this.f30043h);
                    this.f30041f = null;
                    this.f30042g = null;
                    this.f30040e = 1;
                    if (interfaceC7117d.mo1339r(pair, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$4, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "", "Lmj/d;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$4", m19206f = "ReviewActivitySpeakingViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends List<? extends C7570d>>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f30044e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ReviewActivitySpeakingViewModel f30045f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel, InterfaceC9968c<? super AnonymousClass4> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f30045f = reviewActivitySpeakingViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.f30045f, interfaceC9968c);
                anonymousClass4.f30044e = obj;
                return anonymousClass4;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Pair<? extends String, ? extends List<? extends C7570d>> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass4) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                Object value;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Pair pair = (Pair) this.f30044e;
                String str = (String) pair.f38012a;
                List list = (List) pair.f38013b;
                StateFlowImpl stateFlowImpl = this.f30045f.f30021I;
                do {
                    value = stateFlowImpl.getValue();
                } while (!stateFlowImpl.mo14366c(value, C10408j.m19394a((C10408j) value, false, 0, str, null, null, null, list, 59)));
                return C9072e.f47360a;
            }
        }

        public C46332(InterfaceC9968c<? super C46332> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewActivitySpeakingViewModel.this.new C46332(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46332) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30038e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel = ReviewActivitySpeakingViewModel.this;
                final StateFlowImpl stateFlowImpl = reviewActivitySpeakingViewModel.f30020H;
                InterfaceC7116c<String> interfaceC7116c = new InterfaceC7116c<String>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$invokeSuspend$$inlined$filterNot$1

                    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC7117d {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ InterfaceC7117d f30047a;

                        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$invokeSuspend$$inlined$filterNot$1$2", m19206f = "ReviewActivitySpeakingViewModel.kt", m19207l = {223}, m19208m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: d */
                            public /* synthetic */ Object f30048d;

                            /* JADX INFO: renamed from: e */
                            public int f30049e;

                            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                                super(interfaceC9968c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) {
                                this.f30048d = obj;
                                this.f30049e |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.mo1339r(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC7117d interfaceC7117d) {
                            this.f30047a = interfaceC7117d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        @Override // kotlinx.coroutines.flow.InterfaceC7117d
                        /* JADX INFO: renamed from: r */
                        public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC9968c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                                int i10 = anonymousClass1.f30049e;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f30049e = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                            Object obj2 = anonymousClass1.f30048d;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i11 = anonymousClass1.f30049e;
                            if (i11 == 0) {
                                C7499b.m14977z0(obj2);
                                if (!(((String) obj).length() == 0)) {
                                    anonymousClass1.f30049e = 1;
                                    if (this.f30047a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C7499b.m14977z0(obj2);
                            }
                            return C9072e.f47360a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC7116c
                    /* JADX INFO: renamed from: a */
                    public final Object mo9539a(InterfaceC7117d<? super String> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                        Object objMo9539a = stateFlowImpl.mo9539a(new AnonymousClass2(interfaceC7117d), interfaceC9968c);
                        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                    }
                };
                final StateFlowImpl stateFlowImpl2 = reviewActivitySpeakingViewModel.f30033l;
                C7136q c7136qM385q0 = C0062b.m385q0(interfaceC7116c, new InterfaceC7116c<List<? extends C7570d>>() { // from class: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$invokeSuspend$$inlined$filterNot$2

                    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$invokeSuspend$$inlined$filterNot$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC7117d {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ InterfaceC7117d f30052a;

                        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$invokeSuspend$$inlined$filterNot$2$2$1, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$2$invokeSuspend$$inlined$filterNot$2$2", m19206f = "ReviewActivitySpeakingViewModel.kt", m19207l = {223}, m19208m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: d */
                            public /* synthetic */ Object f30053d;

                            /* JADX INFO: renamed from: e */
                            public int f30054e;

                            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                                super(interfaceC9968c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) {
                                this.f30053d = obj;
                                this.f30054e |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.mo1339r(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC7117d interfaceC7117d) {
                            this.f30052a = interfaceC7117d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlinx.coroutines.flow.InterfaceC7117d
                        /* JADX INFO: renamed from: r */
                        public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC9968c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                                int i10 = anonymousClass1.f30054e;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f30054e = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                            Object obj2 = anonymousClass1.f30053d;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i11 = anonymousClass1.f30054e;
                            if (i11 == 0) {
                                C7499b.m14977z0(obj2);
                                if (!((List) obj).isEmpty()) {
                                    anonymousClass1.f30054e = 1;
                                    if (this.f30052a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C7499b.m14977z0(obj2);
                            }
                            return C9072e.f47360a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC7116c
                    /* JADX INFO: renamed from: a */
                    public final Object mo9539a(InterfaceC7117d<? super List<? extends C7570d>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                        Object objMo9539a = stateFlowImpl2.mo9539a(new AnonymousClass2(interfaceC7117d), interfaceC9968c);
                        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                    }
                }, new AnonymousClass3(null));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(reviewActivitySpeakingViewModel, null);
                this.f30038e = 1;
                if (C0062b.m369m0(c7136qM385q0, anonymousClass4, this) == coroutineSingletons) {
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

    public ReviewActivitySpeakingViewModel(InterfaceC3324a interfaceC3324a, InterfaceC2024q interfaceC2024q, InterfaceC3275c interfaceC3275c, InterfaceC5179a interfaceC5179a, CoroutineDispatcher coroutineDispatcher, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC3275c, "ttsController");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f30025d = interfaceC3324a;
        this.f30026e = interfaceC2024q;
        this.f30027f = interfaceC3275c;
        this.f30028g = interfaceC5179a;
        this.f30029h = interfaceC0113j;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        this.f30030i = num != null ? num.intValue() : -1;
        Integer num2 = (Integer) c1024c0.m3929b("sentenceIndex");
        int iIntValue = num2 != null ? num2.intValue() : -1;
        this.f30031j = iIntValue;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f30032k = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        this.f30033l = C7120g.m14379a(EmptyList.f38032a);
        this.f30020H = C7120g.m14379a("");
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(new C10408j(0));
        this.f30021I = stateFlowImplM14379a2;
        this.f30022J = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, new C10408j(0));
        this.f30023K = "";
        C7138s c7138sM10448a = C4924a.m10448a();
        C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f30024L = Locale.forLanguageTag(mo498E1());
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C46321(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C46332(null), 3);
        if (iIntValue == -1) {
            c7138sM10448a.mo14371k(C9072e.f47360a);
        } else {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new ReviewActivitySpeakingViewModel$fetchSentence$1(this, null), 3);
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new ReviewActivitySpeakingViewModel$fetchSentenceTokens$1(this, null), 3);
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f30029h.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30029h.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f30029h.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30029h.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f30029h.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30029h.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f30029h;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30029h.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f30029h.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30029h.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f30029h.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m10285l2(SpeechRecognitionState speechRecognitionState) {
        StateFlowImpl stateFlowImpl;
        Object value;
        C5207g.m11111f(speechRecognitionState, "state");
        do {
            stateFlowImpl = this.f30021I;
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo14366c(value, C10408j.m19394a((C10408j) value, false, 0, null, null, speechRecognitionState, null, null, 111)));
    }

    /* JADX INFO: renamed from: m2 */
    public final void m10286m2(String str) {
        StateFlowImpl stateFlowImpl;
        Object value;
        C10408j c10408j;
        HashSet<Integer> hashSet;
        Locale locale = this.f30024L;
        C5207g.m11110e(locale, "_locale");
        C4925b c4925b = new C4925b(locale, this.f30023K, str);
        do {
            stateFlowImpl = this.f30021I;
            value = stateFlowImpl.getValue();
            c10408j = (C10408j) value;
            hashSet = c4925b.f32105c;
        } while (!stateFlowImpl.mo14366c(value, C10408j.m19394a(c10408j, false, (int) ((((double) hashSet.size()) / ((double) (c4925b.f32106d.size() + hashSet.size()))) * ((double) 100)), null, str, null, c4925b, null, 85)));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f30029h.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f30029h.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f30029h.mo509w0();
    }
}
