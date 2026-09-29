package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import androidx.activity.result.C0204c;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2009b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.challenge.ChallengeUserRanking;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import com.linguist.R;
import dm.C5207g;
import fi.C5538b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
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
import mo.C7661i;
import ni.C7796d;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5180b;
import p205jk.InterfaceC6515k;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import si.C9021e;
import si.C9023g;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengeDetailsViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Ljk/k;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeDetailsViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC6515k {

    /* JADX INFO: renamed from: H */
    public final C7134o f22891H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f22892I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f22893J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f22894K;

    /* JADX INFO: renamed from: L */
    public final Integer[] f22895L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f22896M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f22897N;

    /* JADX INFO: renamed from: O */
    public final C7135p f22898O;

    /* JADX INFO: renamed from: P */
    public final StateFlowImpl f22899P;

    /* JADX INFO: renamed from: Q */
    public final StateFlowImpl f22900Q;

    /* JADX INFO: renamed from: R */
    public final C7135p f22901R;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f22902S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f22903T;

    /* JADX INFO: renamed from: U */
    public final C7135p f22904U;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2009b f22905d;

    /* JADX INFO: renamed from: e */
    public final CoroutineJobManager f22906e;

    /* JADX INFO: renamed from: f */
    public final C7796d f22907f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5180b f22908g;

    /* JADX INFO: renamed from: h */
    public final CoroutineDispatcher f22909h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0113j f22910i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC6515k f22911j;

    /* JADX INFO: renamed from: k */
    public final C9021e f22912k;

    /* JADX INFO: renamed from: l */
    public final C7138s f22913l;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {103}, m19208m = "invokeSuspend")
    final class C34901 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22914e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$1$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<ChallengeDetail, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengeDetailsViewModel f22916e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22916e = challengeDetailsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f22916e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(ChallengeDetail challengeDetail, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(challengeDetail, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = this.f22916e;
                challengeDetailsViewModel.f22903T.setValue(ChallengeDetailsViewModel.m9786l2(challengeDetailsViewModel));
                return C9072e.f47360a;
            }
        }

        public C34901(InterfaceC9968c<? super C34901> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengeDetailsViewModel.this.new C34901(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34901) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22914e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = ChallengeDetailsViewModel.this;
                StateFlowImpl stateFlowImpl = challengeDetailsViewModel.f22897N;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengeDetailsViewModel, null);
                this.f22914e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$2", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {109}, m19208m = "invokeSuspend")
    final class C34912 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22917e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lfi/b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$2$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C5538b>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengeDetailsViewModel f22919e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22919e = challengeDetailsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f22919e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C5538b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = this.f22919e;
                challengeDetailsViewModel.f22903T.setValue(ChallengeDetailsViewModel.m9786l2(challengeDetailsViewModel));
                return C9072e.f47360a;
            }
        }

        public C34912(InterfaceC9968c<? super C34912> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengeDetailsViewModel.this.new C34912(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34912) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22917e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = ChallengeDetailsViewModel.this;
                StateFlowImpl stateFlowImpl = challengeDetailsViewModel.f22899P;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengeDetailsViewModel, null);
                this.f22917e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$3", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {115}, m19208m = "invokeSuspend")
    final class C34923 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22920e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/challenge/ChallengeUserRanking;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$3$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends ChallengeUserRanking>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengeDetailsViewModel f22922e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22922e = challengeDetailsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f22922e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends ChallengeUserRanking> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = this.f22922e;
                challengeDetailsViewModel.f22903T.setValue(ChallengeDetailsViewModel.m9786l2(challengeDetailsViewModel));
                return C9072e.f47360a;
            }
        }

        public C34923(InterfaceC9968c<? super C34923> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengeDetailsViewModel.this.new C34923(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34923) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22920e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = ChallengeDetailsViewModel.this;
                StateFlowImpl stateFlowImpl = challengeDetailsViewModel.f22902S;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengeDetailsViewModel, null);
                this.f22920e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$4", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {121}, m19208m = "invokeSuspend")
    final class C34934 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22923e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lsi/g;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$4$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C9023g>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengeDetailsViewModel f22925e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22925e = challengeDetailsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f22925e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C9023g> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = this.f22925e;
                challengeDetailsViewModel.f22903T.setValue(ChallengeDetailsViewModel.m9786l2(challengeDetailsViewModel));
                return C9072e.f47360a;
            }
        }

        public C34934(InterfaceC9968c<? super C34934> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengeDetailsViewModel.this.new C34934(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34934) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22923e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = ChallengeDetailsViewModel.this;
                C7135p c7135p = challengeDetailsViewModel.f22901R;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengeDetailsViewModel, null);
                this.f22923e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$5", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {127}, m19208m = "invokeSuspend")
    final class C34945 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22926e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$5$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengeDetailsViewModel f22928e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22928e = challengeDetailsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f22928e, interfaceC9968c);
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
                ChallengeDetailsViewModel challengeDetailsViewModel = this.f22928e;
                challengeDetailsViewModel.f22903T.setValue(ChallengeDetailsViewModel.m9786l2(challengeDetailsViewModel));
                return C9072e.f47360a;
            }
        }

        public C34945(InterfaceC9968c<? super C34945> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengeDetailsViewModel.this.new C34945(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34945) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22926e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = ChallengeDetailsViewModel.this;
                StateFlowImpl stateFlowImpl = challengeDetailsViewModel.f22894K;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengeDetailsViewModel, null);
                this.f22926e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$6", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {133}, m19208m = "invokeSuspend")
    final class C34956 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22929e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$6$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$6$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengeDetailsViewModel f22931e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22931e = challengeDetailsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f22931e, interfaceC9968c);
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
                ChallengeDetailsViewModel challengeDetailsViewModel = this.f22931e;
                challengeDetailsViewModel.f22903T.setValue(ChallengeDetailsViewModel.m9786l2(challengeDetailsViewModel));
                return C9072e.f47360a;
            }
        }

        public C34956(InterfaceC9968c<? super C34956> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengeDetailsViewModel.this.new C34956(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34956) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22929e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = ChallengeDetailsViewModel.this;
                StateFlowImpl stateFlowImpl = challengeDetailsViewModel.f22892I;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengeDetailsViewModel, null);
                this.f22929e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$7 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$7", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {139}, m19208m = "invokeSuspend")
    final class C34967 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22932e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$7$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$7$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ChallengeDetailsViewModel f22934e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22934e = challengeDetailsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f22934e, interfaceC9968c);
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
                ChallengeDetailsViewModel challengeDetailsViewModel = this.f22934e;
                challengeDetailsViewModel.f22903T.setValue(ChallengeDetailsViewModel.m9786l2(challengeDetailsViewModel));
                return C9072e.f47360a;
            }
        }

        public C34967(InterfaceC9968c<? super C34967> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengeDetailsViewModel.this.new C34967(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34967) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22932e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = ChallengeDetailsViewModel.this;
                StateFlowImpl stateFlowImpl = challengeDetailsViewModel.f22893J;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengeDetailsViewModel, null);
                this.f22932e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$8 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$8", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {145}, m19208m = "invokeSuspend")
    final class C34978 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22935e;

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailsViewModel$8$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeDetailsViewModel$8$1", m19206f = "ChallengeDetailsViewModel.kt", m19207l = {149}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f22937e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f22938f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ ChallengeDetailsViewModel f22939g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChallengeDetailsViewModel challengeDetailsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22939g = challengeDetailsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22939g, interfaceC9968c);
                anonymousClass1.f22938f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0060  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f22937e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    UserLanguage userLanguage = (UserLanguage) this.f22938f;
                    if (userLanguage != null) {
                        ChallengeDetailsViewModel challengeDetailsViewModel = this.f22939g;
                        if (!C7661i.m15250P2(challengeDetailsViewModel.f22912k.f47252c)) {
                            C9021e c9021e = challengeDetailsViewModel.f22912k;
                            if (C5207g.m11106a(userLanguage.f21726a, c9021e.f47252c)) {
                                challengeDetailsViewModel.m9787m2();
                            } else {
                                challengeDetailsViewModel.f22903T.setValue(EmptyList.f38032a);
                                this.f22937e = 1;
                                if (challengeDetailsViewModel.mo501d(c9021e.f47252c, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            challengeDetailsViewModel.m9787m2();
                        }
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

        public C34978(InterfaceC9968c<? super C34978> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ChallengeDetailsViewModel.this.new C34978(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34978) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22935e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ChallengeDetailsViewModel challengeDetailsViewModel = ChallengeDetailsViewModel.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = challengeDetailsViewModel.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(challengeDetailsViewModel, null);
                this.f22935e = 1;
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

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public ChallengeDetailsViewModel(InterfaceC2009b interfaceC2009b, CoroutineJobManager coroutineJobManager, C7796d c7796d, InterfaceC5180b interfaceC5180b, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, InterfaceC6515k interfaceC6515k, C1024c0 c1024c0) {
        Boolean bool;
        String str;
        C5207g.m11111f(interfaceC2009b, "challengeRepository");
        C5207g.m11111f(c7796d, "analytics");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC6515k, "upgradePopupDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f22905d = interfaceC2009b;
        this.f22906e = coroutineJobManager;
        this.f22907f = c7796d;
        this.f22908g = interfaceC5180b;
        this.f22909h = executorC7177a;
        this.f22910i = interfaceC0113j;
        this.f22911j = interfaceC6515k;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("challengeCode")) {
            throw new IllegalArgumentException("Required argument \"challengeCode\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) c1024c0.m3929b("challengeCode");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"challengeCode\" is marked as non-null but was passed a null value");
        }
        if (linkedHashMap.containsKey("isPast")) {
            bool = (Boolean) c1024c0.m3929b("isPast");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"isPast\" of type boolean does not support null values");
            }
        } else {
            bool = Boolean.TRUE;
        }
        if (linkedHashMap.containsKey("languageFromDeeplink")) {
            str = (String) c1024c0.m3929b("languageFromDeeplink");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        this.f22912k = new C9021e(str2, str, bool.booleanValue());
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f22913l = c7138sM10448a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f22891H = C0062b.m341d2(c7138sM10448a, interfaceC7882zM16767w0, startedWhileSubscribed);
        Boolean bool2 = Boolean.TRUE;
        this.f22892I = C7120g.m14379a(bool2);
        this.f22893J = C7120g.m14379a(bool2);
        this.f22894K = C7120g.m14379a(Boolean.FALSE);
        this.f22895L = new Integer[]{Integer.valueOf(R.attr.greenTint), Integer.valueOf(R.attr.yellowWordBorderColor), Integer.valueOf(R.attr.blueStrongColor), Integer.valueOf(R.attr.redTint)};
        this.f22896M = C7120g.m14379a(null);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f22897N = stateFlowImplM14379a;
        this.f22898O = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a, new ChallengeDetailsViewModel$isJoined$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        EmptyList emptyList = EmptyList.f38032a;
        this.f22899P = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f22900Q = stateFlowImplM14379a2;
        this.f22901R = C0062b.m353h2(new C7131l(stateFlowImplM14379a2, stateFlowImplM14379a, new ChallengeDetailsViewModel$_goals$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f22902S = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(emptyList);
        this.f22903T = stateFlowImplM14379a3;
        this.f22904U = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34901(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34912(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34923(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34934(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34945(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34956(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34967(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34978(null), 3);
    }

    /* JADX INFO: renamed from: l2 */
    public static final ArrayList m9786l2(ChallengeDetailsViewModel challengeDetailsViewModel) {
        ChallengeType challengeType;
        ChallengeType[] enumConstants;
        Object next;
        Object next2;
        challengeDetailsViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        StateFlowImpl stateFlowImpl = challengeDetailsViewModel.f22897N;
        ChallengeDetail challengeDetail = (ChallengeDetail) stateFlowImpl.getValue();
        if (challengeDetail != null) {
            StateFlowImpl stateFlowImpl2 = challengeDetailsViewModel.f22899P;
            boolean z10 = !((Collection) stateFlowImpl2.getValue()).isEmpty();
            StateFlowImpl stateFlowImpl3 = challengeDetailsViewModel.f22892I;
            if (z10) {
                ArrayList arrayListM13421O = C6752c.m13421O((Iterable) stateFlowImpl2.getValue());
                Iterator it = arrayListM13421O.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!C5207g.m11106a(((C5538b) next).f34249a, "KW"));
                C5538b c5538b = (C5538b) next;
                int i10 = c5538b != null ? c5538b.f34250b : 0;
                Iterator it2 = arrayListM13421O.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!C5207g.m11106a(((C5538b) next2).f34249a, "CC"));
                C5538b c5538b2 = (C5538b) next2;
                arrayList.add(new ChallengeDetailAdapter.AbstractC3482b.a(challengeDetail, i10, c5538b2 != null ? c5538b2.f34250b : 0, ((Boolean) stateFlowImpl3.getValue()).booleanValue()));
            } else {
                arrayList.add(new ChallengeDetailAdapter.AbstractC3482b.a(challengeDetail, 0, 0, ((Boolean) stateFlowImpl3.getValue()).booleanValue()));
            }
            List list = (List) challengeDetailsViewModel.f22901R.getValue();
            boolean z11 = !list.isEmpty();
            StateFlowImpl stateFlowImpl4 = challengeDetailsViewModel.f22893J;
            if (z11 || ((Boolean) stateFlowImpl4.getValue()).booleanValue()) {
                arrayList.add(new ChallengeDetailAdapter.AbstractC3482b.g());
                int i11 = challengeDetail.f21644l;
                int i12 = challengeDetail.f21640h;
                if (i11 > i12) {
                    i11 = i12;
                }
                arrayList.add(new ChallengeDetailAdapter.AbstractC3482b.e(i11, list, ((Boolean) stateFlowImpl4.getValue()).booleanValue()));
            }
            ArrayList arrayListM13421O2 = C6752c.m13421O((Iterable) challengeDetailsViewModel.f22902S.getValue());
            ChallengeType.Companion companion = ChallengeType.INSTANCE;
            Class<ChallengeType> cls = ChallengeType.class;
            if (!cls.isEnum()) {
                cls = null;
            }
            if (cls == null || (enumConstants = cls.getEnumConstants()) == null) {
                challengeType = null;
                break;
            }
            int length = enumConstants.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    challengeType = null;
                    break;
                }
                challengeType = enumConstants[i13];
                if (C5207g.m11106a(challengeType.getValue(), challengeDetail.f21639g)) {
                    break;
                }
                i13++;
            }
            if (challengeType != null && challengeType.getSorts().size() > 1) {
                arrayList.add(new ChallengeDetailAdapter.AbstractC3482b.d(challengeType));
            }
            if (((Boolean) challengeDetailsViewModel.f22894K.getValue()).booleanValue()) {
                ArrayList arrayList2 = new ArrayList(3);
                for (int i14 = 0; i14 < 3; i14++) {
                    arrayList2.add(ChallengeDetailAdapter.AbstractC3482b.b.f22848a);
                }
                arrayList.addAll(arrayList2);
            }
            if (!arrayListM13421O2.isEmpty()) {
                ChallengeDetail challengeDetail2 = (ChallengeDetail) stateFlowImpl.getValue();
                if (!C5207g.m11106a(challengeDetail2 != null ? challengeDetail2.f21639g : null, ChallengeType.ThousandWords.getValue())) {
                    LeaderboardMetric leaderboardMetric = (LeaderboardMetric) challengeDetailsViewModel.f22896M.getValue();
                    arrayList.add(new ChallengeDetailAdapter.AbstractC3482b.c(leaderboardMetric != null ? leaderboardMetric.getValue() : R.string.stats_streak));
                    ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayListM13421O2, 10));
                    Iterator it3 = arrayListM13421O2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new ChallengeDetailAdapter.AbstractC3482b.f((ChallengeUserRanking) it3.next()));
                    }
                    arrayList.addAll(arrayList3);
                }
            }
        }
        return arrayList;
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: A */
    public final void mo9771A(UpgradeReason upgradeReason) {
        C5207g.m11111f(upgradeReason, "reason");
        this.f22911j.mo9771A(upgradeReason);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f22910i.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22910i.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f22910i.mo498E1();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: G1 */
    public final void mo9772G1(String str) {
        this.f22911j.mo9772G1(str);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22910i.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f22910i.mo500P();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: S0 */
    public final InterfaceC7116c<UpgradeReason> mo9773S0() {
        return this.f22911j.mo9773S0();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c<String> mo9774X() {
        return this.f22911j.mo9774X();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22910i.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f22910i;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22910i.mo503f1(interfaceC9968c);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC7116c<C9072e> mo9775i0() {
        return this.f22911j.mo9775i0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f22910i.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22910i.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f22910i.mo506l1();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9787m2() {
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        ChallengeDetailsViewModel$observableChallengeDetail$1 challengeDetailsViewModel$observableChallengeDetail$1 = new ChallengeDetailsViewModel$observableChallengeDetail$1(this, null);
        CoroutineDispatcher coroutineDispatcher = this.f22909h;
        C7828f.m15570d(interfaceC7882zM16767w0, coroutineDispatcher, null, challengeDetailsViewModel$observableChallengeDetail$1, 2);
        C7828f.m15570d(C8573r0.m16767w0(this), coroutineDispatcher, null, new ChallengeDetailsViewModel$observableChallengeDetailStats$1(this, null), 2);
        C7828f.m15570d(C8573r0.m16767w0(this), coroutineDispatcher, null, new ChallengeDetailsViewModel$networkGetChallenge$1(this, null), 2);
        C7828f.m15570d(C8573r0.m16767w0(this), coroutineDispatcher, null, new ChallengeDetailsViewModel$networkGetChallengeDetailStats$1(this, null), 2);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m9788n2(LeaderboardMetric leaderboardMetric, String str) {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f22906e, this.f22909h, C0204c.m852k("networkGetChallengeRanking ", leaderboardMetric.getKey()), new ChallengeDetailsViewModel$networkGetChallengeRanking$1(this, str, leaderboardMetric, null));
    }

    /* JADX INFO: renamed from: o2 */
    public final void m9789o2(LeaderboardMetric leaderboardMetric) {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f22906e, this.f22909h, C0204c.m852k("ranking ", leaderboardMetric.getKey()), new ChallengeDetailsViewModel$observableUserRankings$1(this, leaderboardMetric, null));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f22910i.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f22910i.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f22910i.mo509w0();
    }
}
