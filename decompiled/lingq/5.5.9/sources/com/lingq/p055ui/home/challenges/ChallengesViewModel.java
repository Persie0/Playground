package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2009b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.CoroutineJobManager;
import com.linguist.R;
import dm.C5207g;
import fi.C5537a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mo.C7661i;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import si.C9033q;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengesViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengesViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f23092H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f23093I;

    /* JADX INFO: renamed from: J */
    public final C7135p f23094J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f23095K;

    /* JADX INFO: renamed from: L */
    public final C7135p f23096L;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2009b f23097d;

    /* JADX INFO: renamed from: e */
    public final CoroutineJobManager f23098e;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f23099f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0113j f23100g;

    /* JADX INFO: renamed from: h */
    public final C9033q f23101h;

    /* JADX INFO: renamed from: i */
    public final StateFlowImpl f23102i;

    /* JADX INFO: renamed from: j */
    public final C7135p f23103j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f23104k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f23105l;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$1", m19206f = "ChallengesViewModel.kt", m19207l = {76}, m19208m = "invokeSuspend")
    final class C35271 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23106e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$1$1", m19206f = "ChallengesViewModel.kt", m19207l = {78}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f23108e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f23109f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ ChallengesViewModel f23110g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23110g = challengesViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23110g, interfaceC9968c);
                anonymousClass1.f23109f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f23108e;
                ChallengesViewModel challengesViewModel = this.f23110g;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    UserLanguage userLanguage = (UserLanguage) this.f23109f;
                    if (!C7661i.m15250P2(challengesViewModel.f23101h.f47273a)) {
                        String str = userLanguage != null ? userLanguage.f21726a : null;
                        C9033q c9033q = challengesViewModel.f23101h;
                        if (!C5207g.m11106a(str, c9033q.f47273a)) {
                            String str2 = c9033q.f47273a;
                            this.f23108e = 1;
                            if (challengesViewModel.mo501d(str2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                StateFlowImpl stateFlowImpl = challengesViewModel.f23092H;
                EmptyList emptyList = EmptyList.f38032a;
                stateFlowImpl.setValue(emptyList);
                challengesViewModel.f23093I.setValue(emptyList);
                challengesViewModel.f23095K.setValue(new Pair(emptyList, emptyList));
                challengesViewModel.m9797m2();
                return C9072e.f47360a;
            }
        }

        public C35271(InterfaceC9968c<? super C35271> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengesViewModel.this.new C35271(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35271) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23106e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengesViewModel challengesViewModel = ChallengesViewModel.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = challengesViewModel.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengesViewModel, null);
                this.f23106e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$2", m19206f = "ChallengesViewModel.kt", m19207l = {86}, m19208m = "invokeSuspend")
    final class C35282 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23111e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lfi/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$2$1", m19206f = "ChallengesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C5537a>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengesViewModel f23113e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23113e = challengesViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23113e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C5537a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                ChallengesViewModel challengesViewModel = this.f23113e;
                challengesViewModel.f23095K.setValue(ChallengesViewModel.m9796l2(challengesViewModel));
                return C9072e.f47360a;
            }
        }

        public C35282(InterfaceC9968c<? super C35282> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengesViewModel.this.new C35282(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35282) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23111e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengesViewModel challengesViewModel = ChallengesViewModel.this;
                C7135p c7135p = challengesViewModel.f23094J;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengesViewModel, null);
                this.f23111e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$3", m19206f = "ChallengesViewModel.kt", m19207l = {92}, m19208m = "invokeSuspend")
    final class C35293 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23114e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lfi/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$3$1", m19206f = "ChallengesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C5537a>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengesViewModel f23116e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23116e = challengesViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23116e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C5537a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                ChallengesViewModel challengesViewModel = this.f23116e;
                challengesViewModel.f23095K.setValue(ChallengesViewModel.m9796l2(challengesViewModel));
                return C9072e.f47360a;
            }
        }

        public C35293(InterfaceC9968c<? super C35293> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengesViewModel.this.new C35293(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35293) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23114e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengesViewModel challengesViewModel = ChallengesViewModel.this;
                StateFlowImpl stateFlowImpl = challengesViewModel.f23093I;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengesViewModel, null);
                this.f23114e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$4", m19206f = "ChallengesViewModel.kt", m19207l = {98}, m19208m = "invokeSuspend")
    final class C35304 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23117e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$4$1", m19206f = "ChallengesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengesViewModel f23119e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23119e = challengesViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23119e, interfaceC9968c);
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
                ChallengesViewModel challengesViewModel = this.f23119e;
                challengesViewModel.f23095K.setValue(ChallengesViewModel.m9796l2(challengesViewModel));
                return C9072e.f47360a;
            }
        }

        public C35304(InterfaceC9968c<? super C35304> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengesViewModel.this.new C35304(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35304) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23117e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengesViewModel challengesViewModel = ChallengesViewModel.this;
                StateFlowImpl stateFlowImpl = challengesViewModel.f23104k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengesViewModel, null);
                this.f23117e = 1;
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

    public ChallengesViewModel(InterfaceC2009b interfaceC2009b, CoroutineJobManager coroutineJobManager, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        String str;
        C5207g.m11111f(interfaceC2009b, "challengeRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f23097d = interfaceC2009b;
        this.f23098e = coroutineJobManager;
        this.f23099f = executorC7177a;
        this.f23100g = interfaceC0113j;
        if (c1024c0.f6616a.containsKey("languageFromDeeplink")) {
            str = (String) c1024c0.m3929b("languageFromDeeplink");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        this.f23101h = new C9033q(str);
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(bool);
        this.f23102i = stateFlowImplM14379a;
        this.f23103j = C0062b.m306S(stateFlowImplM14379a);
        this.f23104k = C7120g.m14379a(bool);
        EmptyList emptyList = EmptyList.f38032a;
        this.f23105l = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f23092H = stateFlowImplM14379a2;
        this.f23093I = C7120g.m14379a(emptyList);
        C7131l c7131l = new C7131l(stateFlowImplM14379a2, mo496B(), new ChallengesViewModel$_activeChallenges$1(null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f23094J = C0062b.m353h2(c7131l, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(new Pair(emptyList, emptyList));
        this.f23095K = stateFlowImplM14379a3;
        this.f23096L = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, new Pair(emptyList, emptyList));
        m9797m2();
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35271(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35282(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35293(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35304(null), 3);
    }

    /* JADX INFO: renamed from: l2 */
    public static final Pair m9796l2(ChallengesViewModel challengesViewModel) {
        challengesViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = (List) challengesViewModel.f23094J.getValue();
        boolean z10 = !list.isEmpty();
        StateFlowImpl stateFlowImpl = challengesViewModel.f23104k;
        if (z10 && !((Boolean) stateFlowImpl.getValue()).booleanValue()) {
            arrayList.add(new ChallengesAdapter.AbstractC3515b.b(R.string.challenges_active_challenges));
        }
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(new ChallengesAdapter.AbstractC3515b.a((C5537a) it.next()));
        }
        arrayList.addAll(arrayList3);
        List list2 = (List) challengesViewModel.f23093I.getValue();
        if ((!list2.isEmpty()) && !((Boolean) stateFlowImpl.getValue()).booleanValue()) {
            arrayList.add(new ChallengesAdapter.AbstractC3515b.b(R.string.challenges_past_challenges));
        }
        if (((Boolean) stateFlowImpl.getValue()).booleanValue()) {
            ArrayList arrayList4 = new ArrayList(C9325m.m17681z(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new ChallengesAdapter.AbstractC3515b.a((C5537a) it2.next()));
            }
            arrayList2.addAll(arrayList4);
        } else {
            ArrayList arrayList5 = new ArrayList(C9325m.m17681z(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new ChallengesAdapter.AbstractC3515b.a((C5537a) it3.next()));
            }
            arrayList.addAll(arrayList5);
        }
        return new Pair(arrayList, arrayList2);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f23100g.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23100g.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f23100g.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23100g.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f23100g.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23100g.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f23100g;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23100g.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f23100g.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23100g.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f23100g.mo506l1();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9797m2() {
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        ChallengesViewModel$observeActiveChallenges$1 challengesViewModel$observeActiveChallenges$1 = new ChallengesViewModel$observeActiveChallenges$1(this, null);
        CoroutineJobManager coroutineJobManager = this.f23098e;
        CoroutineDispatcher coroutineDispatcher = this.f23099f;
        C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "activeChallenges", challengesViewModel$observeActiveChallenges$1);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "pastChallenges", new ChallengesViewModel$observePastChallenges$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "networkActiveChallenges", new ChallengesViewModel$networkActiveChallenges$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "networkPastChallenges", new ChallengesViewModel$networkPastChallenges$1(this, null));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f23100g.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f23100g.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f23100g.mo509w0();
    }
}
