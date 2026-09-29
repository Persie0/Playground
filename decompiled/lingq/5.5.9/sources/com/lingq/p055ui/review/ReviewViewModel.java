package com.lingq.p055ui.review;

import ae.C0062b;
import android.os.Parcelable;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import ci.InterfaceC2024q;
import ci.InterfaceC2025r;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.p055ui.review.data.ReviewActivityType;
import com.lingq.p055ui.review.views.result.ReviewActivityResultPopupKt;
import com.lingq.p055ui.review.views.result.ReviewResultType;
import com.lingq.p055ui.token.InterfaceC4865b;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenEditData;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import li.C7374a;
import mo.C7661i;
import ni.C7793a;
import ni.C7796d;
import no.C7828f;
import no.InterfaceC7882z;
import org.joda.time.DateTime;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5181c;
import p225kk.C6704a;
import p225kk.C6715l;
import p244lh.InterfaceC7364a;
import p260m8.C7499b;
import p264mi.C7566f;
import p338qd.C8573r0;
import p385sf.C9000b;
import p418uj.C9544d;
import p418uj.C9545e;
import p418uj.C9548h;
import p462wj.AbstractC9953a;
import p462wj.C9955c;
import p462wj.InterfaceC9956d;
import p462wj.InterfaceC9957e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;
import tl.C9338z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/review/ReviewViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/ui/token/b;", "Llh/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ReviewViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC4865b, InterfaceC7364a {

    /* JADX INFO: renamed from: A0 */
    public final StateFlowImpl f29601A0;

    /* JADX INFO: renamed from: B0 */
    public final C7135p f29602B0;

    /* JADX INFO: renamed from: C0 */
    public final C7135p f29603C0;

    /* JADX INFO: renamed from: D0 */
    public final C7135p f29604D0;

    /* JADX INFO: renamed from: E0 */
    public final C7135p f29605E0;

    /* JADX INFO: renamed from: F0 */
    public final C7135p f29606F0;

    /* JADX INFO: renamed from: G0 */
    public final C7135p f29607G0;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4865b f29608H;

    /* JADX INFO: renamed from: H0 */
    public final C7135p f29609H0;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC7364a f29610I;

    /* JADX INFO: renamed from: I0 */
    public final C7135p f29611I0;

    /* JADX INFO: renamed from: J */
    public final C9548h f29612J;

    /* JADX INFO: renamed from: J0 */
    public final C7135p f29613J0;

    /* JADX INFO: renamed from: K */
    public final Locale f29614K;

    /* JADX INFO: renamed from: K0 */
    public final C7134o f29615K0;

    /* JADX INFO: renamed from: L */
    public List<String> f29616L;

    /* JADX INFO: renamed from: L0 */
    public final StateFlowImpl f29617L0;

    /* JADX INFO: renamed from: M */
    public final C7138s f29618M;

    /* JADX INFO: renamed from: M0 */
    public final C7138s f29619M0;

    /* JADX INFO: renamed from: N */
    public final C7138s f29620N;

    /* JADX INFO: renamed from: N0 */
    public final C7135p f29621N0;

    /* JADX INFO: renamed from: O */
    public final StateFlowImpl f29622O;

    /* JADX INFO: renamed from: O0 */
    public final C7138s f29623O0;

    /* JADX INFO: renamed from: P */
    public final C7135p f29624P;

    /* JADX INFO: renamed from: P0 */
    public final C7134o f29625P0;

    /* JADX INFO: renamed from: Q */
    public final StateFlowImpl f29626Q;

    /* JADX INFO: renamed from: Q0 */
    public final StateFlowImpl f29627Q0;

    /* JADX INFO: renamed from: R */
    public final C7135p f29628R;

    /* JADX INFO: renamed from: R0 */
    public final C7135p f29629R0;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f29630S;

    /* JADX INFO: renamed from: S0 */
    public final StateFlowImpl f29631S0;

    /* JADX INFO: renamed from: T */
    public final C7135p f29632T;

    /* JADX INFO: renamed from: T0 */
    public final C7135p f29633T0;

    /* JADX INFO: renamed from: U */
    public final StateFlowImpl f29634U;

    /* JADX INFO: renamed from: U0 */
    public final C7138s f29635U0;

    /* JADX INFO: renamed from: V */
    public final C7135p f29636V;

    /* JADX INFO: renamed from: V0 */
    public final C7134o f29637V0;

    /* JADX INFO: renamed from: W */
    public final StateFlowImpl f29638W;

    /* JADX INFO: renamed from: X */
    public final C7135p f29639X;

    /* JADX INFO: renamed from: Y */
    public final StateFlowImpl f29640Y;

    /* JADX INFO: renamed from: Z */
    public final StateFlowImpl f29641Z;

    /* JADX INFO: renamed from: a0 */
    public final C7135p f29642a0;

    /* JADX INFO: renamed from: b0 */
    public final StateFlowImpl f29643b0;

    /* JADX INFO: renamed from: c0 */
    public final StateFlowImpl f29644c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2025r f29645d;

    /* JADX INFO: renamed from: d0 */
    public final C7138s f29646d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2008a f29647e;

    /* JADX INFO: renamed from: e0 */
    public final AbstractChannel f29648e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2024q f29649f;

    /* JADX INFO: renamed from: f0 */
    public final C7114a f29650f0;

    /* JADX INFO: renamed from: g */
    public final CoroutineDispatcher f29651g;

    /* JADX INFO: renamed from: g0 */
    public final C7138s f29652g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5179a f29653h;

    /* JADX INFO: renamed from: h0 */
    public final C7134o f29654h0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5181c f29655i;

    /* JADX INFO: renamed from: i0 */
    public final C7138s f29656i0;

    /* JADX INFO: renamed from: j */
    public final C6704a f29657j;

    /* JADX INFO: renamed from: j0 */
    public final C7134o f29658j0;

    /* JADX INFO: renamed from: k */
    public final C7796d f29659k;

    /* JADX INFO: renamed from: k0 */
    public final StateFlowImpl f29660k0;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0113j f29661l;

    /* JADX INFO: renamed from: l0 */
    public final C7135p f29662l0;

    /* JADX INFO: renamed from: m0 */
    public final C7138s f29663m0;

    /* JADX INFO: renamed from: n0 */
    public final C7134o f29664n0;

    /* JADX INFO: renamed from: o0 */
    public final C7138s f29665o0;

    /* JADX INFO: renamed from: p0 */
    public final C7134o f29666p0;

    /* JADX INFO: renamed from: q0 */
    public final C7138s f29667q0;

    /* JADX INFO: renamed from: r0 */
    public final C7134o f29668r0;

    /* JADX INFO: renamed from: s0 */
    public final C7138s f29669s0;

    /* JADX INFO: renamed from: t0 */
    public final C7134o f29670t0;

    /* JADX INFO: renamed from: u0 */
    public final C7138s f29671u0;

    /* JADX INFO: renamed from: v0 */
    public final C7134o f29672v0;

    /* JADX INFO: renamed from: w0 */
    public final C7138s f29673w0;

    /* JADX INFO: renamed from: x0 */
    public final C7134o f29674x0;

    /* JADX INFO: renamed from: y0 */
    public final C7138s f29675y0;

    /* JADX INFO: renamed from: z0 */
    public final C7134o f29676z0;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$1", m19206f = "ReviewViewModel.kt", m19207l = {259, 260}, m19208m = "invokeSuspend")
    final class C45511 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29677e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$1$1", m19206f = "ReviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ int f29679e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ReviewViewModel f29680f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29680f = reviewViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29680f, interfaceC9968c);
                anonymousClass1.f29679e = ((Number) obj).intValue();
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
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f29680f.f29601A0.setValue(Boolean.valueOf(this.f29679e > 0));
                return C9072e.f47360a;
            }
        }

        public C45511(InterfaceC9968c<? super C45511> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewViewModel.this.new C45511(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45511) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29677e;
            ReviewViewModel reviewViewModel = ReviewViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC2024q interfaceC2024q = reviewViewModel.f29649f;
            String strMo498E1 = reviewViewModel.mo498E1();
            this.f29677e = 1;
            obj = interfaceC2024q.mo6170a(strMo498E1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(reviewViewModel, null);
            this.f29677e = 2;
            if (C0062b.m369m0((InterfaceC7116c) obj, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$2", m19206f = "ReviewViewModel.kt", m19207l = {266}, m19208m = "invokeSuspend")
    final class C45522 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29681e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous parameter 0>", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$2$1", m19206f = "ReviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ReviewViewModel f29683e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29683e = reviewViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f29683e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                ReviewViewModel reviewViewModel = this.f29683e;
                reviewViewModel.f29619M0.mo14371k(Boolean.valueOf(((Boolean) reviewViewModel.f29617L0.getValue()).booleanValue() && (!ReviewViewModel.m10247m2(reviewViewModel) || ((List) reviewViewModel.f29626Q.getValue()).isEmpty())));
                return C9072e.f47360a;
            }
        }

        public C45522(InterfaceC9968c<? super C45522> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewViewModel.this.new C45522(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45522) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29681e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ReviewViewModel reviewViewModel = ReviewViewModel.this;
                C7134o c7134o = reviewViewModel.f29615K0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(reviewViewModel, null);
                this.f29681e = 1;
                if (C0062b.m369m0(c7134o, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$3", m19206f = "ReviewViewModel.kt", m19207l = {272}, m19208m = "invokeSuspend")
    final class C45533 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29684e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "", "filter", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$3$1", m19206f = "ReviewViewModel.kt", m19207l = {279, 285}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends String>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public Collection f29686e;

            /* JADX INFO: renamed from: f */
            public Iterator f29687f;

            /* JADX INFO: renamed from: g */
            public Collection f29688g;

            /* JADX INFO: renamed from: h */
            public int f29689h;

            /* JADX INFO: renamed from: i */
            public /* synthetic */ Object f29690i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ ReviewViewModel f29691j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29691j = reviewViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29691j, interfaceC9968c);
                anonymousClass1.f29690i = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends String> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0126  */
            /* JADX WARN: Code duplicated, block: B:32:0x0147 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:33:0x0148  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e6 -> B:25:0x00ed). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0148 -> B:34:0x0150). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final java.lang.Object mo1338x(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 367
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.review.ReviewViewModel.C45533.AnonymousClass1.mo1338x(java.lang.Object):java.lang.Object");
            }
        }

        public C45533(InterfaceC9968c<? super C45533> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewViewModel.this.new C45533(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45533) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29684e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ReviewViewModel reviewViewModel = ReviewViewModel.this;
                C7138s c7138s = reviewViewModel.f29618M;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(reviewViewModel, null);
                this.f29684e = 1;
                if (C0062b.m369m0(c7138s, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$4", m19206f = "ReviewViewModel.kt", m19207l = {293}, m19208m = "invokeSuspend")
    final class C45544 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29692e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "language", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$4$1", m19206f = "ReviewViewModel.kt", m19207l = {296, 300}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f29694e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f29695f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ ReviewViewModel f29696g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29696g = reviewViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29696g, interfaceC9968c);
                anonymousClass1.f29695f = obj;
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
                ArrayList arrayList;
                int iCompareTo;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f29694e;
                ReviewViewModel reviewViewModel = this.f29696g;
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7499b.m14977z0(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj);
                    }
                    return C9072e.f47360a;
                }
                C7499b.m14977z0(obj);
                UserLanguage userLanguage = (UserLanguage) this.f29695f;
                C6704a c6704a = reviewViewModel.f29657j;
                c6704a.getClass();
                Set<String> set = EmptySet.f38034a;
                Set<String> stringSet = c6704a.f37891b.getStringSet("termsStudyReview", set);
                if (stringSet != null) {
                    set = stringSet;
                }
                List<String> listM13453u0 = C6752c.m13453u0(set);
                C9548h c9548h = reviewViewModel.f29612J;
                if (!(!C7661i.m15250P2(c9548h.f49125f)) || C5207g.m11106a(userLanguage.f21726a, c9548h.f49125f)) {
                    if (listM13453u0.isEmpty()) {
                        int i11 = c9548h.f49120a;
                        if (i11 != -1) {
                            this.f29694e = 2;
                            obj = reviewViewModel.f29647e.mo5949a(i11, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if (c9548h.f49126g != null) {
                            C7828f.m15570d(C8573r0.m16767w0(reviewViewModel), reviewViewModel.f29651g, null, new ReviewViewModel$fetchLotdCards$1(reviewViewModel, null), 2);
                        } else {
                            C7828f.m15570d(C8573r0.m16767w0(reviewViewModel), null, null, new ReviewViewModel$fetchCards$1(reviewViewModel, null), 3);
                        }
                    } else {
                        reviewViewModel.f29616L = listM13453u0;
                        reviewViewModel.f29618M.mo14371k(listM13453u0);
                    }
                    reviewViewModel.f29657j.m13311m(EmptySet.f38034a);
                } else {
                    String str = c9548h.f49125f;
                    this.f29694e = 1;
                    if (reviewViewModel.mo501d(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
                List list = (List) obj;
                if (reviewViewModel.f29612J.f49121b == ReviewType.SrsDue) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        String str2 = ((C7374a) obj2).f41152k;
                        if (str2 != null) {
                            String string = new DateTime().toString();
                            C5207g.m11110e(string, "now().toString()");
                            iCompareTo = str2.compareTo(string);
                        } else {
                            iCompareTo = 0;
                        }
                        if (iCompareTo < 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(C9325m.m17681z(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C7374a) it.next()).f41142a);
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((C7374a) it2.next()).f41142a);
                    }
                    arrayList = arrayList3;
                }
                reviewViewModel.f29616L = arrayList;
                reviewViewModel.f29618M.mo14371k(arrayList);
                reviewViewModel.f29657j.m13311m(EmptySet.f38034a);
                return C9072e.f47360a;
            }
        }

        public C45544(InterfaceC9968c<? super C45544> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewViewModel.this.new C45544(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45544) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29692e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ReviewViewModel reviewViewModel = ReviewViewModel.this;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(reviewViewModel.mo509w0());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(reviewViewModel, null);
                this.f29692e = 1;
                if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$5", m19206f = "ReviewViewModel.kt", m19207l = {333}, m19208m = "invokeSuspend")
    final class C45555 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29697e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lmi/f;", "cards", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$5$1", m19206f = "ReviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C7566f>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f29699e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ReviewViewModel f29700f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29700f = reviewViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29700f, interfaceC9968c);
                anonymousClass1.f29699e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C7566f> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                ReviewViewModel.m10248n2(this.f29700f, (List) this.f29699e);
                return C9072e.f47360a;
            }
        }

        public C45555(InterfaceC9968c<? super C45555> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewViewModel.this.new C45555(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45555) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29697e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ReviewViewModel reviewViewModel = ReviewViewModel.this;
                C7138s c7138s = reviewViewModel.f29620N;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(reviewViewModel, null);
                this.f29697e = 1;
                if (C0062b.m369m0(c7138s, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$6", m19206f = "ReviewViewModel.kt", m19207l = {339}, m19208m = "invokeSuspend")
    final class C45566 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29701e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$6$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lmi/f;", "cards", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$6$2", m19206f = "ReviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<List<? extends C7566f>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f29703e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ReviewViewModel f29704f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ReviewViewModel reviewViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29704f = reviewViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f29704f, interfaceC9968c);
                anonymousClass2.f29703e = obj;
                return anonymousClass2;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C7566f> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                Integer num;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                if (!((List) this.f29703e).isEmpty()) {
                    ReviewViewModel reviewViewModel = this.f29704f;
                    if (reviewViewModel.f29612J.f49121b != ReviewType.Integrated) {
                        reviewViewModel.f29659k.m15505b(null, "started_review");
                        Random random = new Random();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        List<C7566f> list = (List) reviewViewModel.f29622O.getValue();
                        for (C7566f c7566f : list) {
                            linkedHashMap.put(c7566f, new ArrayList());
                            linkedHashMap2.put(c7566f.f41692b, 0);
                            int i10 = 2;
                            while (i10 >= 1) {
                                int iNextInt = random.nextInt(ReviewActivityType.values().length);
                                if (reviewViewModel.m10264x2(iNextInt)) {
                                    List list2 = (List) linkedHashMap.get(c7566f);
                                    if (((list2 == null || list2.contains(Integer.valueOf(iNextInt))) ? false : true) || reviewViewModel.m10257p2() == 1) {
                                        List list3 = (List) linkedHashMap.get(c7566f);
                                        if (list3 != null) {
                                            list3.add(Integer.valueOf(iNextInt));
                                        }
                                        i10--;
                                        if (reviewViewModel.m10257p2() < 1) {
                                            i10 = 0;
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        int size = list.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            boolean z10 = false;
                            while (!z10) {
                                int iNextInt2 = random.nextInt(list.size());
                                if (!arrayList.contains(Integer.valueOf(iNextInt2))) {
                                    arrayList.add(Integer.valueOf(iNextInt2));
                                    z10 = true;
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list.size();
                        boolean z11 = false;
                        for (int i12 = 0; i12 < size2; i12++) {
                            boolean z12 = false;
                            while (!z12) {
                                int iNextInt3 = random.nextInt(list.size());
                                if (list.size() > 1 && !z11) {
                                    if ((((Number) arrayList.get(arrayList.size() - 1)).intValue() == iNextInt3 || arrayList2.contains(Integer.valueOf(iNextInt3))) ? false : true) {
                                        arrayList2.add(Integer.valueOf(iNextInt3));
                                        z11 = true;
                                        z12 = true;
                                    }
                                } else if (!arrayList2.contains(Integer.valueOf(iNextInt3))) {
                                    arrayList2.add(Integer.valueOf(iNextInt3));
                                    z11 = true;
                                    z12 = true;
                                }
                            }
                        }
                        ArrayList arrayListM13438f0 = C6752c.m13438f0(arrayList2, arrayList);
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        ArrayList arrayList3 = new ArrayList();
                        int size3 = arrayListM13438f0.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            C7566f c7566f2 = (C7566f) list.get(((Number) arrayListM13438f0.get(i13)).intValue());
                            if (linkedHashMap3.get(c7566f2) == null) {
                                linkedHashMap3.put(c7566f2, 0);
                            } else {
                                linkedHashMap3.put(c7566f2, 1);
                            }
                            Integer num2 = (Integer) linkedHashMap3.get(c7566f2);
                            int iIntValue = num2 != null ? num2.intValue() : 0;
                            List list4 = (List) linkedHashMap.get(c7566f2);
                            if (iIntValue < (list4 != null ? list4.size() : 0)) {
                                List list5 = (List) linkedHashMap.get(c7566f2);
                                if (list5 != null) {
                                    C5207g.m11108c(num2);
                                    num = (Integer) list5.get(num2.intValue());
                                } else {
                                    num = null;
                                }
                                int iOrdinal = ReviewActivityType.FlashcardActivity.ordinal();
                                if (num != null && num.intValue() == iOrdinal) {
                                    arrayList3.add(new AbstractC9953a.d(c7566f2));
                                } else {
                                    int iOrdinal2 = ReviewActivityType.FlashcardReverseActivity.ordinal();
                                    if (num != null && num.intValue() == iOrdinal2) {
                                        arrayList3.add(new AbstractC9953a.e(c7566f2));
                                    } else {
                                        int iOrdinal3 = ReviewActivityType.DictationActivity.ordinal();
                                        if (num != null && num.intValue() == iOrdinal3) {
                                            String str = c7566f2.f41692b;
                                            arrayList3.add(new AbstractC9953a.b(c7566f2, str, reviewViewModel.m10263v2(str)));
                                        } else {
                                            int iOrdinal4 = ReviewActivityType.DictationReverseActivity.ordinal();
                                            if (num != null && num.intValue() == iOrdinal4) {
                                                arrayList3.add(new AbstractC9953a.c(c7566f2, c7566f2.f41696f.get(0).f22090c, reviewViewModel.m10262u2(c7566f2.f41696f.get(0).f22090c)));
                                            } else {
                                                int iOrdinal5 = ReviewActivityType.MultiChoiceActivity.ordinal();
                                                if (num != null && num.intValue() == iOrdinal5) {
                                                    arrayList3.add(new AbstractC9953a.g(c7566f2, c7566f2.f41696f.get(0).f22090c, reviewViewModel.m10262u2(c7566f2.f41696f.get(0).f22090c)));
                                                } else {
                                                    int iOrdinal6 = ReviewActivityType.MultiChoiceReverseActivity.ordinal();
                                                    if (num != null && num.intValue() == iOrdinal6) {
                                                        arrayList3.add(new AbstractC9953a.h(c7566f2, c7566f2.f41692b, reviewViewModel.m10263v2(c7566f2.f41692b)));
                                                    } else {
                                                        int iOrdinal7 = ReviewActivityType.ClozeActivity.ordinal();
                                                        if (num != null && num.intValue() == iOrdinal7) {
                                                            arrayList3.add(new AbstractC9953a.a(c7566f2, c7566f2.f41692b));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        reviewViewModel.f29626Q.setValue(arrayList3);
                        reviewViewModel.m10266z2();
                    }
                }
                return C9072e.f47360a;
            }
        }

        public C45566(InterfaceC9968c<? super C45566> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewViewModel.this.new C45566(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45566) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29701e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ReviewViewModel reviewViewModel = ReviewViewModel.this;
                final C7135p c7135p = reviewViewModel.f29621N0;
                InterfaceC7116c<List<? extends C7566f>> interfaceC7116c = new InterfaceC7116c<List<? extends C7566f>>() { // from class: com.lingq.ui.review.ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1

                    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2 */
                    public static final class C45572<T> implements InterfaceC7117d {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ InterfaceC7117d f29706a;

                        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$6$invokeSuspend$$inlined$filterNot$1$2", m19206f = "ReviewViewModel.kt", m19207l = {223}, m19208m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: d */
                            public /* synthetic */ Object f29707d;

                            /* JADX INFO: renamed from: e */
                            public int f29708e;

                            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                                super(interfaceC9968c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) {
                                this.f29707d = obj;
                                this.f29708e |= Integer.MIN_VALUE;
                                return C45572.this.mo1339r(null, this);
                            }
                        }

                        public C45572(InterfaceC7117d interfaceC7117d) {
                            this.f29706a = interfaceC7117d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlinx.coroutines.flow.InterfaceC7117d
                        /* JADX INFO: renamed from: r */
                        public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC9968c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                                int i10 = anonymousClass1.f29708e;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f29708e = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                            Object obj2 = anonymousClass1.f29707d;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i11 = anonymousClass1.f29708e;
                            if (i11 == 0) {
                                C7499b.m14977z0(obj2);
                                if (!((List) obj).isEmpty()) {
                                    anonymousClass1.f29708e = 1;
                                    if (this.f29706a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
                    public final Object mo9539a(InterfaceC7117d<? super List<? extends C7566f>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                        Object objMo9539a = c7135p.mo9539a(new C45572(interfaceC7117d), interfaceC9968c);
                        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(reviewViewModel, null);
                this.f29701e = 1;
                if (C0062b.m369m0(interfaceC7116c, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$7 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$7", m19206f = "ReviewViewModel.kt", m19207l = {348}, m19208m = "invokeSuspend")
    final class C45587 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29710e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$7$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "canReload", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$7$1", m19206f = "ReviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f29712e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ReviewViewModel f29713f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29713f = reviewViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29713f, interfaceC9968c);
                anonymousClass1.f29712e = ((Boolean) obj).booleanValue();
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
                if (this.f29712e) {
                    this.f29713f.f29648e0.mo16479j(C9072e.f47360a);
                }
                return C9072e.f47360a;
            }
        }

        public C45587(InterfaceC9968c<? super C45587> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewViewModel.this.new C45587(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45587) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29710e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ReviewViewModel reviewViewModel = ReviewViewModel.this;
                C7138s c7138s = reviewViewModel.f29619M0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(reviewViewModel, null);
                this.f29710e = 1;
                if (C0062b.m369m0(c7138s, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$8 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$8", m19206f = "ReviewViewModel.kt", m19207l = {356}, m19208m = "invokeSuspend")
    final class C45598 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29714e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$8$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$8$1", m19206f = "ReviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {
            public AnonymousClass1(InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                num.intValue();
                return new AnonymousClass1(interfaceC9968c).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            }
        }

        public C45598(InterfaceC9968c<? super C45598> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewViewModel.this.new C45598(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45598) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29714e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                C7135p c7135p = ReviewViewModel.this.f29632T;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.f29714e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$9 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$9", m19206f = "ReviewViewModel.kt", m19207l = {360}, m19208m = "invokeSuspend")
    final class C45609 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29716e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$9$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lmi/f;", "cards", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$9$2", m19206f = "ReviewViewModel.kt", m19207l = {361}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<List<? extends C7566f>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f29718e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ReviewViewModel f29719f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ReviewViewModel reviewViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29719f = reviewViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass2(this.f29719f, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C7566f> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                Object objM10258q2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f29718e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    this.f29718e = 1;
                    ReviewViewModel reviewViewModel = this.f29719f;
                    if (reviewViewModel.f29612J.f49121b != ReviewType.Integrated) {
                        String strMo498E1 = reviewViewModel.mo498E1();
                        C7828f.m15570d(C8573r0.m16767w0(reviewViewModel), reviewViewModel.f29651g, null, new ReviewViewModel$cardsForAnswers$3(reviewViewModel, strMo498E1, null), 2);
                        objM10258q2 = C9072e.f47360a;
                    } else {
                        reviewViewModel.f29659k.m15505b(null, "started_review");
                        objM10258q2 = reviewViewModel.m10258q2(this);
                        if (objM10258q2 != coroutineSingletons) {
                            objM10258q2 = C9072e.f47360a;
                        }
                    }
                    if (objM10258q2 == coroutineSingletons) {
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

        public C45609(InterfaceC9968c<? super C45609> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ReviewViewModel.this.new C45609(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45609) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29716e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ReviewViewModel reviewViewModel = ReviewViewModel.this;
                final StateFlowImpl stateFlowImpl = reviewViewModel.f29622O;
                InterfaceC7116c<List<? extends C7566f>> interfaceC7116c = new InterfaceC7116c<List<? extends C7566f>>() { // from class: com.lingq.ui.review.ReviewViewModel$9$invokeSuspend$$inlined$filterNot$1

                    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$9$invokeSuspend$$inlined$filterNot$1$2 */
                    public static final class C45612<T> implements InterfaceC7117d {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ InterfaceC7117d f29721a;

                        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$9$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$9$invokeSuspend$$inlined$filterNot$1$2", m19206f = "ReviewViewModel.kt", m19207l = {223}, m19208m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: d */
                            public /* synthetic */ Object f29722d;

                            /* JADX INFO: renamed from: e */
                            public int f29723e;

                            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                                super(interfaceC9968c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) {
                                this.f29722d = obj;
                                this.f29723e |= Integer.MIN_VALUE;
                                return C45612.this.mo1339r(null, this);
                            }
                        }

                        public C45612(InterfaceC7117d interfaceC7117d) {
                            this.f29721a = interfaceC7117d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        @Override // kotlinx.coroutines.flow.InterfaceC7117d
                        /* JADX INFO: renamed from: r */
                        public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC9968c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                                int i10 = anonymousClass1.f29723e;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f29723e = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                            Object obj2 = anonymousClass1.f29722d;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i11 = anonymousClass1.f29723e;
                            if (i11 == 0) {
                                C7499b.m14977z0(obj2);
                                if (!((List) obj).isEmpty()) {
                                    anonymousClass1.f29723e = 1;
                                    if (this.f29721a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
                    public final Object mo9539a(InterfaceC7117d<? super List<? extends C7566f>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                        Object objMo9539a = stateFlowImpl.mo9539a(new C45612(interfaceC7117d), interfaceC9968c);
                        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(reviewViewModel, null);
                this.f29716e = 1;
                if (C0062b.m369m0(interfaceC7116c, anonymousClass2, this) == coroutineSingletons) {
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

    public ReviewViewModel(InterfaceC2025r interfaceC2025r, InterfaceC2008a interfaceC2008a, InterfaceC2024q interfaceC2024q, ExecutorC7177a executorC7177a, InterfaceC5179a interfaceC5179a, InterfaceC5181c interfaceC5181c, C6704a c6704a, C7796d c7796d, InterfaceC0113j interfaceC0113j, InterfaceC4865b interfaceC4865b, InterfaceC7364a interfaceC7364a, C1024c0 c1024c0) {
        Integer num;
        ReviewType reviewType;
        Boolean bool;
        Boolean bool2;
        String str;
        CardStatus cardStatus;
        C5207g.m11111f(interfaceC2025r, "vocabularyRepository");
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC5181c, "reviewStore");
        C5207g.m11111f(c6704a, "appSettings");
        C5207g.m11111f(c7796d, "analytics");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC4865b, "tokenControllerDelegate");
        C5207g.m11111f(interfaceC7364a, "appUsageController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f29645d = interfaceC2025r;
        this.f29647e = interfaceC2008a;
        this.f29649f = interfaceC2024q;
        this.f29651g = executorC7177a;
        this.f29653h = interfaceC5179a;
        this.f29655i = interfaceC5181c;
        this.f29657j = c6704a;
        this.f29659k = c7796d;
        this.f29661l = interfaceC0113j;
        this.f29608H = interfaceC4865b;
        this.f29610I = interfaceC7364a;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        Integer num2 = -1;
        if (linkedHashMap.containsKey("lessonId")) {
            num = (Integer) c1024c0.m3929b("lessonId");
            if (num == null) {
                throw new IllegalArgumentException("Argument \"lessonId\" of type integer does not support null values");
            }
        } else {
            num = num2;
        }
        if (!linkedHashMap.containsKey("reviewType")) {
            reviewType = ReviewType.All;
        } else {
            if (!Parcelable.class.isAssignableFrom(ReviewType.class) && !Serializable.class.isAssignableFrom(ReviewType.class)) {
                throw new UnsupportedOperationException(ReviewType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            reviewType = (ReviewType) c1024c0.m3929b("reviewType");
            if (reviewType == null) {
                throw new IllegalArgumentException("Argument \"reviewType\" is marked as non-null but was passed a null value");
            }
        }
        ReviewType reviewType2 = reviewType;
        if (linkedHashMap.containsKey("isDailyLingQs")) {
            bool = (Boolean) c1024c0.m3929b("isDailyLingQs");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"isDailyLingQs\" of type boolean does not support null values");
            }
        } else {
            bool = Boolean.FALSE;
        }
        if (linkedHashMap.containsKey("isFromVocabulary")) {
            bool2 = (Boolean) c1024c0.m3929b("isFromVocabulary");
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"isFromVocabulary\" of type boolean does not support null values");
            }
        } else {
            bool2 = Boolean.FALSE;
        }
        if (linkedHashMap.containsKey("sentenceIndex") && (num2 = (Integer) c1024c0.m3929b("sentenceIndex")) == null) {
            throw new IllegalArgumentException("Argument \"sentenceIndex\" of type integer does not support null values");
        }
        if (linkedHashMap.containsKey("reviewLanguageFromDeeplink")) {
            str = (String) c1024c0.m3929b("reviewLanguageFromDeeplink");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"reviewLanguageFromDeeplink\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = linkedHashMap.containsKey("lotd") ? (String) c1024c0.m3929b("lotd") : null;
        if (!linkedHashMap.containsKey("statusUpper")) {
            cardStatus = CardStatus.Known;
        } else {
            if (!Parcelable.class.isAssignableFrom(CardStatus.class) && !Serializable.class.isAssignableFrom(CardStatus.class)) {
                throw new UnsupportedOperationException(CardStatus.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            cardStatus = (CardStatus) c1024c0.m3929b("statusUpper");
            if (cardStatus == null) {
                throw new IllegalArgumentException("Argument \"statusUpper\" is marked as non-null but was passed a null value");
            }
        }
        this.f29612J = new C9548h(num.intValue(), reviewType2, bool.booleanValue(), bool2.booleanValue(), num2.intValue(), str2, str3, cardStatus);
        this.f29614K = Locale.forLanguageTag(mo498E1());
        EmptyList emptyList = EmptyList.f38032a;
        this.f29616L = emptyList;
        this.f29618M = C4924a.m10448a();
        this.f29620N = C4924a.m10448a();
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f29622O = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f29624P = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f29626Q = stateFlowImplM14379a2;
        this.f29628R = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(0);
        this.f29630S = stateFlowImplM14379a3;
        this.f29632T = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, 0);
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(C6753d.m13459L0());
        this.f29634U = stateFlowImplM14379a4;
        this.f29636V = C0062b.m353h2(stateFlowImplM14379a4, C8573r0.m16767w0(this), startedWhileSubscribed, C6753d.m13459L0());
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(C6753d.m13459L0());
        this.f29638W = stateFlowImplM14379a5;
        this.f29639X = C0062b.m353h2(stateFlowImplM14379a5, C8573r0.m16767w0(this), startedWhileSubscribed, C6753d.m13459L0());
        final StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(emptyList);
        this.f29640Y = stateFlowImplM14379a6;
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(-1);
        this.f29641Z = stateFlowImplM14379a7;
        this.f29642a0 = C0062b.m353h2(stateFlowImplM14379a7, C8573r0.m16767w0(this), startedWhileSubscribed, -1);
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(Resource.Status.EMPTY);
        this.f29643b0 = stateFlowImplM14379a8;
        this.f29644c0 = stateFlowImplM14379a8;
        this.f29646d0 = C0062b.m368m(0, 3, BufferOverflow.DROP_OLDEST);
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f29648e0 = abstractChannelM16738m;
        this.f29650f0 = C0062b.m287L1(abstractChannelM16738m);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f29652g0 = c7138sM10448a;
        this.f29654h0 = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f29656i0 = c7138sM10448a2;
        this.f29658j0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(null);
        this.f29660k0 = stateFlowImplM14379a9;
        this.f29662l0 = C0062b.m353h2(stateFlowImplM14379a9, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f29663m0 = c7138sM10448a3;
        this.f29664n0 = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f29665o0 = c7138sM10448a4;
        this.f29666p0 = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f29667q0 = c7138sM10448a5;
        this.f29668r0 = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a6 = C4924a.m10448a();
        this.f29669s0 = c7138sM10448a6;
        this.f29670t0 = C0062b.m341d2(c7138sM10448a6, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a7 = C4924a.m10448a();
        this.f29671u0 = c7138sM10448a7;
        this.f29672v0 = C0062b.m341d2(c7138sM10448a7, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a8 = C4924a.m10448a();
        this.f29673w0 = c7138sM10448a8;
        this.f29674x0 = C0062b.m341d2(c7138sM10448a8, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a9 = C4924a.m10448a();
        this.f29675y0 = c7138sM10448a9;
        this.f29676z0 = C0062b.m341d2(c7138sM10448a9, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a10 = C7120g.m14379a(null);
        this.f29601A0 = stateFlowImplM14379a10;
        C7135p c7135pM353h2 = C0062b.m353h2(C0062b.m273H0(interfaceC5181c.mo9638N()), C8573r0.m16767w0(this), startedWhileSubscribed, 10);
        this.f29602B0 = c7135pM353h2;
        InterfaceC7116c interfaceC7116cM273H0 = C0062b.m273H0(interfaceC5181c.mo9657g());
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(this);
        Boolean bool3 = Boolean.FALSE;
        C7135p c7135pM353h3 = C0062b.m353h2(interfaceC7116cM273H0, interfaceC7882zM16767w1, startedWhileSubscribed, bool3);
        this.f29603C0 = c7135pM353h3;
        C7135p c7135pM353h4 = C0062b.m353h2(C0062b.m273H0(interfaceC5181c.mo9653c()), C8573r0.m16767w0(this), startedWhileSubscribed, bool3);
        this.f29604D0 = c7135pM353h4;
        C7135p c7135pM353h5 = C0062b.m353h2(C0062b.m273H0(interfaceC5181c.mo9625A()), C8573r0.m16767w0(this), startedWhileSubscribed, bool3);
        this.f29605E0 = c7135pM353h5;
        C7135p c7135pM353h6 = C0062b.m353h2(C0062b.m273H0(interfaceC5181c.mo9672v()), C8573r0.m16767w0(this), startedWhileSubscribed, bool3);
        this.f29606F0 = c7135pM353h6;
        C7135p c7135pM353h7 = C0062b.m353h2(C0062b.m273H0(interfaceC5181c.mo9664n()), C8573r0.m16767w0(this), startedWhileSubscribed, bool3);
        this.f29607G0 = c7135pM353h7;
        C7135p c7135pM353h8 = C0062b.m353h2(C0062b.m273H0(interfaceC5181c.mo9636L()), C8573r0.m16767w0(this), startedWhileSubscribed, bool3);
        this.f29609H0 = c7135pM353h8;
        C7135p c7135pM353h9 = C0062b.m353h2(C0062b.m273H0(interfaceC5181c.mo9630F()), C8573r0.m16767w0(this), startedWhileSubscribed, bool3);
        this.f29611I0 = c7135pM353h9;
        C7135p c7135pM353h10 = C0062b.m353h2(C0062b.m273H0(interfaceC5181c.mo9660j()), C8573r0.m16767w0(this), startedWhileSubscribed, bool3);
        this.f29613J0 = c7135pM353h10;
        this.f29615K0 = C0062b.m341d2(new C7136q(new ReviewViewModel$special$$inlined$combineTransform$1(new InterfaceC7116c[]{c7135pM353h2, c7135pM353h5, c7135pM353h3, c7135pM353h4, c7135pM353h6, c7135pM353h7, c7135pM353h8, c7135pM353h9, c7135pM353h10}, null)), C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f29617L0 = C7120g.m14379a(bool3);
        this.f29619M0 = C4924a.m10448a();
        this.f29621N0 = C0062b.m353h2(new C7131l(new InterfaceC7116c<List<? extends C7566f>>() { // from class: com.lingq.ui.review.ReviewViewModel$special$$inlined$filterNot$1

            /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$special$$inlined$filterNot$1$2 */
            public static final class C45672<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f29771a;

                /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$special$$inlined$filterNot$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$special$$inlined$filterNot$1$2", m19206f = "ReviewViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f29772d;

                    /* JADX INFO: renamed from: e */
                    public int f29773e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f29772d = obj;
                        this.f29773e |= Integer.MIN_VALUE;
                        return C45672.this.mo1339r(null, this);
                    }
                }

                public C45672(InterfaceC7117d interfaceC7117d) {
                    this.f29771a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f29773e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f29773e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f29772d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f29773e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.f29773e = 1;
                            if (this.f29771a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super List<? extends C7566f>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = stateFlowImplM14379a6.mo9539a(new C45672(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a10), new ReviewViewModel$cardsForAnswers$2(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a10 = C4924a.m10448a();
        this.f29623O0 = c7138sM10448a10;
        this.f29625P0 = C0062b.m341d2(c7138sM10448a10, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a11 = C7120g.m14379a(new C9544d(0));
        this.f29627Q0 = stateFlowImplM14379a11;
        this.f29629R0 = C0062b.m353h2(stateFlowImplM14379a11, C8573r0.m16767w0(this), startedWhileSubscribed, new C9544d(0));
        StateFlowImpl stateFlowImplM14379a12 = C7120g.m14379a(new C9545e(0));
        this.f29631S0 = stateFlowImplM14379a12;
        this.f29633T0 = C0062b.m353h2(stateFlowImplM14379a12, C8573r0.m16767w0(this), startedWhileSubscribed, new C9545e(0));
        C7138s c7138sM10448a11 = C4924a.m10448a();
        this.f29635U0 = c7138sM10448a11;
        this.f29637V0 = C0062b.m341d2(c7138sM10448a11, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C45511(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C45522(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C45533(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C45544(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C45555(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C45566(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C45587(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C45598(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C45609(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public static final Object m10246l2(ReviewViewModel reviewViewModel, AbstractC9953a abstractC9953a, InterfaceC9968c interfaceC9968c) throws Throwable {
        ReviewViewModel$checkActivityValidAndShow$1 reviewViewModel$checkActivityValidAndShow$1;
        Object obj;
        ReviewViewModel reviewViewModel2 = reviewViewModel;
        reviewViewModel2.getClass();
        if (interfaceC9968c instanceof ReviewViewModel$checkActivityValidAndShow$1) {
            reviewViewModel$checkActivityValidAndShow$1 = (ReviewViewModel$checkActivityValidAndShow$1) interfaceC9968c;
            int i10 = reviewViewModel$checkActivityValidAndShow$1.f29747h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                reviewViewModel$checkActivityValidAndShow$1.f29747h = i10 - Integer.MIN_VALUE;
            } else {
                reviewViewModel$checkActivityValidAndShow$1 = new ReviewViewModel$checkActivityValidAndShow$1(reviewViewModel2, interfaceC9968c);
            }
        } else {
            reviewViewModel$checkActivityValidAndShow$1 = new ReviewViewModel$checkActivityValidAndShow$1(reviewViewModel2, interfaceC9968c);
        }
        Object objMo5965q = reviewViewModel$checkActivityValidAndShow$1.f29745f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = reviewViewModel$checkActivityValidAndShow$1.f29747h;
        if (i11 == 0) {
            C7499b.m14977z0(objMo5965q);
            if (abstractC9953a instanceof InterfaceC9956d) {
                reviewViewModel2.f29667q0.mo14371k(abstractC9953a);
            } else if (abstractC9953a instanceof InterfaceC9957e) {
                String strMo498E1 = reviewViewModel2.mo498E1();
                String str = ((InterfaceC9957e) abstractC9953a).mo18533a().f41692b;
                reviewViewModel$checkActivityValidAndShow$1.f29743d = reviewViewModel2;
                reviewViewModel$checkActivityValidAndShow$1.f29744e = abstractC9953a;
                reviewViewModel$checkActivityValidAndShow$1.f29747h = 1;
                objMo5965q = reviewViewModel2.f29647e.mo5965q(strMo498E1, str, reviewViewModel$checkActivityValidAndShow$1);
                if (objMo5965q == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = abstractC9953a;
            }
            return C9072e.f47360a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = reviewViewModel$checkActivityValidAndShow$1.f29744e;
        reviewViewModel2 = reviewViewModel$checkActivityValidAndShow$1.f29743d;
        C7499b.m14977z0(objMo5965q);
        obj = obj2;
        if (((C7374a) objMo5965q) != null) {
            reviewViewModel2.f29667q0.mo14371k(obj);
        } else {
            ArrayList arrayListM13454v0 = C6752c.m13454v0((Collection) reviewViewModel2.f29626Q.getValue());
            arrayListM13454v0.remove(obj);
            StateFlowImpl stateFlowImpl = reviewViewModel2.f29641Z;
            stateFlowImpl.setValue(new Integer(((Number) stateFlowImpl.getValue()).intValue() - 1));
            reviewViewModel2.f29626Q.setValue(arrayListM13454v0);
            reviewViewModel2.m10266z2();
        }
        return C9072e.f47360a;
    }

    /* JADX INFO: renamed from: m2 */
    public static final boolean m10247m2(ReviewViewModel reviewViewModel) {
        return ((Number) reviewViewModel.f29641Z.getValue()).intValue() >= ((List) reviewViewModel.f29626Q.getValue()).size() - 1;
    }

    /* JADX INFO: renamed from: n2 */
    public static final void m10248n2(ReviewViewModel reviewViewModel, List list) {
        int iIntValue = ((Number) reviewViewModel.f29602B0.getValue()).intValue();
        if (iIntValue > list.size()) {
            iIntValue = list.size();
        }
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        boolean zBooleanValue = ((Boolean) C7828f.m15572f(EmptyCoroutineContext.f38093a, new ReviewViewModel$readySessionCards$shouldShuffle$1(reviewViewModel, null))).booleanValue();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(Integer.valueOf(i10));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < iIntValue) {
            if (!zBooleanValue) {
                if (!((C7566f) list.get(i12)).f41696f.isEmpty()) {
                    arrayList.add(Integer.valueOf(i12));
                    i11++;
                }
                i12++;
                if (i12 > list.size() - 1) {
                    break;
                }
            } else {
                int iNextInt = random.nextInt(arrayList2.size());
                int iIntValue2 = ((Number) arrayList2.get(iNextInt)).intValue();
                if (!arrayList.contains(Integer.valueOf(iIntValue2)) && (!((C7566f) list.get(iIntValue2)).f41696f.isEmpty())) {
                    arrayList.add(Integer.valueOf(iIntValue2));
                    i11++;
                }
                arrayList2.remove(iNextInt);
                if (arrayList2.size() == 0) {
                    break;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(list.get(((Number) it.next()).intValue()));
        }
        if (arrayList3.isEmpty()) {
            reviewViewModel.f29673w0.mo14371k(C9072e.f47360a);
        } else {
            ReviewType reviewType = reviewViewModel.f29612J.f49121b;
            ReviewType reviewType2 = ReviewType.Integrated;
            StateFlowImpl stateFlowImpl = reviewViewModel.f29622O;
            if (reviewType != reviewType2) {
                int iM10257p2 = reviewViewModel.m10257p2();
                C7138s c7138s = reviewViewModel.f29675y0;
                if (iM10257p2 == 0) {
                    c7138s.mo14371k(C9072e.f47360a);
                    return;
                }
                StateFlowImpl stateFlowImpl2 = reviewViewModel.f29601A0;
                if (C5207g.m11106a(stateFlowImpl2.getValue(), Boolean.TRUE)) {
                    ReviewActivityType[] reviewActivityTypeArrValues = ReviewActivityType.values();
                    int length = reviewActivityTypeArrValues.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            z10 = true;
                            break;
                        } else if (!(!reviewViewModel.m10264x2(reviewActivityTypeArrValues[i13].ordinal()))) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (z10) {
                        c7138s.mo14371k(C9072e.f47360a);
                        return;
                    }
                }
                if (C5207g.m11106a(stateFlowImpl2.getValue(), Boolean.FALSE) && !reviewViewModel.m10264x2(ReviewActivityType.MultiChoiceReverseActivity.ordinal()) && !reviewViewModel.m10264x2(ReviewActivityType.ClozeActivity.ordinal())) {
                    c7138s.mo14371k(C9072e.f47360a);
                    return;
                }
                stateFlowImpl.setValue(C6752c.m13453u0(arrayList3));
            } else {
                stateFlowImpl.setValue(C6752c.m13453u0(arrayList3));
            }
        }
        arrayList3.size();
    }

    /* JADX INFO: renamed from: w2 */
    public static void m10249w2(Set set, ArrayList arrayList, List list) {
        Set setM13456x0 = C6752c.m13456x0(set);
        if (C9338z.m17691N0(setM13456x0, arrayList).size() >= 3) {
            while (setM13456x0.size() < 3) {
                setM13456x0.add((String) C6752c.m13440h0(arrayList, kotlin.random.Random.f38128a));
            }
            list.add(new AbstractC9953a.f(C6752c.m13448p0(C9000b.m17256v(setM13456x0), 3)));
        }
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: A1 */
    public final void mo10025A1() {
        this.f29608H.mo10025A1();
    }

    /* JADX INFO: renamed from: A2 */
    public final void m10250A2() {
        this.f29627Q0.setValue(new C9544d((String) C6752c.m13440h0(ReviewActivityResultPopupKt.f30380a, kotlin.random.Random.f38128a), true, true));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f29661l.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29661l.mo497B0(interfaceC9968c);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m10251B2() {
        C7828f.m15570d(C8573r0.m16767w0(this), this.f29651g, null, new ReviewViewModel$reviewCard$1(this, null), 2);
    }

    /* JADX INFO: renamed from: C2 */
    public final void m10252C2() {
        m10253D2();
        for (C7566f c7566f : (Iterable) this.f29622O.getValue()) {
        }
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: D */
    public final InterfaceC7137r<TokenEditData> mo10026D() {
        return this.f29608H.mo10026D();
    }

    /* JADX INFO: renamed from: D2 */
    public final void m10253D2() {
        StateFlowImpl stateFlowImpl = this.f29630S;
        stateFlowImpl.setValue(Integer.valueOf(((Number) stateFlowImpl.getValue()).intValue() + 1));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f29661l.mo498E1();
    }

    /* JADX INFO: renamed from: E2 */
    public final void m10254E2(String str) {
        C5207g.m11111f(str, "cardTerm");
        Locale locale = this.f29614K;
        C5207g.m11110e(locale, "locale");
        String strM15502f = C7793a.m15502f(str, locale);
        StateFlowImpl stateFlowImpl = this.f29638W;
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) stateFlowImpl.getValue());
        Integer num = (Integer) linkedHashMapM13467T0.get(strM15502f);
        linkedHashMapM13467T0.put(strM15502f, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        stateFlowImpl.setValue(linkedHashMapM13467T0);
    }

    /* JADX INFO: renamed from: F2 */
    public final void m10255F2() {
        Iterator it = ((Iterable) this.f29622O.getValue()).iterator();
        while (it.hasNext()) {
            m10254E2(((C7566f) it.next()).f41692b);
        }
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC7137r<String> mo10027H0() {
        return this.f29608H.mo10027H0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: I0 */
    public final void mo10028I0(TokenRelatedPhrase tokenRelatedPhrase, int i10, int i11, int i12) {
        this.f29608H.mo10028I0(tokenRelatedPhrase, i10, i11, i12);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29661l.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC7137r<String> mo10029L0() {
        return this.f29608H.mo10029L0();
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: N */
    public final void mo9402N(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        this.f29610I.mo9402N(appUsageType);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N0 */
    public final void mo10030N0(String str) {
        this.f29608H.mo10030N0(str);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N1 */
    public final InterfaceC7137r<TokenData> mo10031N1() {
        return this.f29608H.mo10031N1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f29661l.mo500P();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: P1 */
    public final void mo10032P1(int i10) {
        this.f29608H.mo10032P1(i10);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Q1 */
    public final void mo10033Q1(boolean z10, boolean z11) {
        this.f29608H.mo10033Q1(z10, z11);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: S */
    public final InterfaceC7137r<Integer> mo10034S() {
        return this.f29608H.mo10034S();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: U1 */
    public final InterfaceC7137r<TokenData> mo10035U1() {
        return this.f29608H.mo10035U1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V */
    public final InterfaceC7137r<TokenRelatedPhrase> mo10036V() {
        return this.f29608H.mo10036V();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V0 */
    public final void mo10037V0(TokenMeaning tokenMeaning) {
        this.f29608H.mo10037V0(tokenMeaning);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: W1 */
    public final InterfaceC7137r<C9072e> mo10038W1() {
        return this.f29608H.mo10038W1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Y */
    public final InterfaceC7137r<TokenData> mo10039Y() {
        return this.f29608H.mo10039Y();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b */
    public final void mo10041b() {
        this.f29608H.mo10041b();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b2 */
    public final InterfaceC7137r<C9072e> mo10042b2() {
        return this.f29608H.mo10042b2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: c1 */
    public final InterfaceC7137r<Boolean> mo10043c1() {
        return this.f29608H.mo10043c1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29661l.mo501d(str, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: d2 */
    public final InterfaceC7137r<C9072e> mo10044d2() {
        return this.f29608H.mo10044d2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: e0 */
    public final void mo10045e0() {
        this.f29608H.mo10045e0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f29661l;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29661l.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: f2 */
    public final void mo10048f2(TokenData tokenData) {
        this.f29608H.mo10048f2(tokenData);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: g */
    public final void mo10049g() {
        this.f29608H.mo10049g();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: j */
    public final InterfaceC7137r<C9072e> mo10051j() {
        return this.f29608H.mo10051j();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f29661l.mo504j1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: l */
    public final InterfaceC7137r<C9072e> mo10053l() {
        return this.f29608H.mo10053l();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29661l.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f29661l.mo506l1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: m */
    public final InterfaceC7137r<TokenMeaning> mo10054m() {
        return this.f29608H.mo10054m();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: o0 */
    public final void mo10057o0(TokenMeaning tokenMeaning, String str) {
        this.f29608H.mo10057o0(tokenMeaning, str);
    }

    /* JADX INFO: renamed from: o2 */
    public final void m10256o2(C9955c c9955c) {
        this.f29660k0.setValue(c9955c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f29661l.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final int m10257p2() {
        int i10 = 0;
        for (ReviewActivityType reviewActivityType : ReviewActivityType.values()) {
            boolean zM10264x2 = m10264x2(reviewActivityType.ordinal());
            if (zM10264x2 && (reviewActivityType == ReviewActivityType.DictationActivity || reviewActivityType == ReviewActivityType.DictationReverseActivity || reviewActivityType == ReviewActivityType.MultiChoiceActivity || reviewActivityType == ReviewActivityType.MultiChoiceReverseActivity)) {
                i10 += 2;
            } else if (zM10264x2) {
                i10++;
            }
        }
        return i10;
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: q1 */
    public final InterfaceC7137r<Pair<TokenMeaning, String>> mo10060q1() {
        return this.f29608H.mo10060q1();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    /* JADX WARN: Code duplicated, block: B:43:0x0142 A[LOOP:6: B:41:0x013c->B:43:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0169 A[LOOP:7: B:45:0x0163->B:47:0x0169, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c8 A[LOOP:1: B:56:0x01ac->B:60:0x01c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x01e4 A[LOOP:2: B:62:0x01de->B:64:0x01e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x020c A[LOOP:3: B:66:0x020a->B:67:0x020c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cd A[EDGE_INSN: B:87:0x01cd->B:61:0x01cd BREAK  A[LOOP:0: B:55:0x01ab->B:88:?, LOOP_LABEL: LOOP:0: B:55:0x01ab->B:88:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:0: B:55:0x01ab->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x010c A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q2 */
    public final Object m10258q2(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ReviewViewModel$buildMultiWordActivities$1 reviewViewModel$buildMultiWordActivities$1;
        ArrayList arrayList;
        ReviewViewModel reviewViewModel;
        ArrayList arrayList2;
        int i10;
        Set set;
        ArrayList arrayList3;
        Set set2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it;
        Iterator it2;
        ArrayList arrayList6;
        Iterator it3;
        ArrayList arrayList7;
        Iterator it4;
        int i11;
        Object next;
        if (interfaceC9968c instanceof ReviewViewModel$buildMultiWordActivities$1) {
            reviewViewModel$buildMultiWordActivities$1 = (ReviewViewModel$buildMultiWordActivities$1) interfaceC9968c;
            int i12 = reviewViewModel$buildMultiWordActivities$1.f29731j;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                reviewViewModel$buildMultiWordActivities$1.f29731j = i12 - Integer.MIN_VALUE;
            } else {
                reviewViewModel$buildMultiWordActivities$1 = new ReviewViewModel$buildMultiWordActivities$1(this, interfaceC9968c);
            }
        } else {
            reviewViewModel$buildMultiWordActivities$1 = new ReviewViewModel$buildMultiWordActivities$1(this, interfaceC9968c);
        }
        Object obj = reviewViewModel$buildMultiWordActivities$1.f29729h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = reviewViewModel$buildMultiWordActivities$1.f29731j;
        if (i13 == 0) {
            C7499b.m14977z0(obj);
            arrayList = new ArrayList();
            Iterable iterable = (Iterable) this.f29622O.getValue();
            ArrayList arrayList8 = new ArrayList(C9325m.m17681z(iterable, 10));
            Iterator it5 = iterable.iterator();
            while (it5.hasNext()) {
                arrayList8.add(((C7566f) it5.next()).f41692b);
            }
            int size = ((arrayList8.size() + 3) - 1) / 3;
            if (((Boolean) this.f29611I0.getValue()).booleanValue() && (!arrayList8.isEmpty())) {
                Set setM13457y0 = C6752c.m13457y0(C9000b.m17256v(arrayList8));
                int size2 = setM13457y0.size();
                C9548h c9548h = this.f29612J;
                InterfaceC2008a interfaceC2008a = this.f29647e;
                if (size2 < 3) {
                    int i14 = c9548h.f49120a;
                    reviewViewModel$buildMultiWordActivities$1.f29725d = this;
                    reviewViewModel$buildMultiWordActivities$1.f29726e = arrayList;
                    reviewViewModel$buildMultiWordActivities$1.f29727f = setM13457y0;
                    reviewViewModel$buildMultiWordActivities$1.f29728g = size;
                    reviewViewModel$buildMultiWordActivities$1.f29731j = 2;
                    Object objMo5949a = interfaceC2008a.mo5949a(i14, reviewViewModel$buildMultiWordActivities$1);
                    if (objMo5949a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    arrayList2 = arrayList;
                    obj = objMo5949a;
                    i10 = size;
                    set = setM13457y0;
                    reviewViewModel = this;
                    arrayList6 = new ArrayList();
                    it3 = ((List) obj).iterator();
                    loop0: while (true) {
                        while (true) {
                            if (it3.hasNext()) {
                                break loop0;
                                break loop0;
                            }
                            next = it3.next();
                            if (!((C7374a) next).f41146e.isEmpty()) {
                                arrayList6.add(next);
                            }
                        }
                    }
                    arrayList7 = new ArrayList(C9325m.m17681z(arrayList6, 10));
                    it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        String str = ((C7374a) it4.next()).f41142a;
                        Locale locale = reviewViewModel.f29614K;
                        C5207g.m11110e(locale, "locale");
                        arrayList7.add(C7793a.m15502f(str, locale));
                    }
                    Set setM13457y1 = C6752c.m13457y0(set);
                    reviewViewModel.getClass();
                    m10249w2(setM13457y1, arrayList7, arrayList2);
                    for (i11 = i10 - 1; i11 > 0; i11--) {
                        m10249w2(EmptySet.f38034a, arrayList7, arrayList2);
                    }
                    arrayList = arrayList2;
                } else if (size == 1) {
                    arrayList.add(new AbstractC9953a.f(C6752c.m13448p0(setM13457y0, 3)));
                } else {
                    int i15 = c9548h.f49120a;
                    reviewViewModel$buildMultiWordActivities$1.f29725d = this;
                    reviewViewModel$buildMultiWordActivities$1.f29726e = arrayList;
                    reviewViewModel$buildMultiWordActivities$1.f29727f = setM13457y0;
                    reviewViewModel$buildMultiWordActivities$1.f29731j = 1;
                    Object objMo5949a2 = interfaceC2008a.mo5949a(i15, reviewViewModel$buildMultiWordActivities$1);
                    if (objMo5949a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    arrayList3 = arrayList;
                    obj = objMo5949a2;
                    set2 = setM13457y0;
                    reviewViewModel = this;
                    arrayList4 = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        if (!((C7374a) obj2).f41146e.isEmpty()) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList5 = new ArrayList(C9325m.m17681z(arrayList4, 10));
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                        String str2 = ((C7374a) it.next()).f41142a;
                        Locale locale2 = reviewViewModel.f29614K;
                        C5207g.m11110e(locale2, "locale");
                        arrayList5.add(C7793a.m15502f(str2, locale2));
                    }
                    it2 = C6752c.m13414H(set2, 3).iterator();
                    while (it2.hasNext()) {
                        Set setM13457y2 = C6752c.m13457y0((List) it2.next());
                        reviewViewModel.getClass();
                        m10249w2(setM13457y2, arrayList5, arrayList3);
                    }
                    arrayList = arrayList3;
                }
            }
            reviewViewModel = this;
        } else if (i13 == 1) {
            set2 = reviewViewModel$buildMultiWordActivities$1.f29727f;
            arrayList3 = reviewViewModel$buildMultiWordActivities$1.f29726e;
            reviewViewModel = reviewViewModel$buildMultiWordActivities$1.f29725d;
            C7499b.m14977z0(obj);
            arrayList4 = new ArrayList();
            while (r12.hasNext()) {
                if (!((C7374a) obj2).f41146e.isEmpty()) {
                    arrayList4.add(obj2);
                }
            }
            arrayList5 = new ArrayList(C9325m.m17681z(arrayList4, 10));
            it = arrayList4.iterator();
            while (it.hasNext()) {
                String str3 = ((C7374a) it.next()).f41142a;
                Locale locale3 = reviewViewModel.f29614K;
                C5207g.m11110e(locale3, "locale");
                arrayList5.add(C7793a.m15502f(str3, locale3));
            }
            it2 = C6752c.m13414H(set2, 3).iterator();
            while (it2.hasNext()) {
                Set setM13457y3 = C6752c.m13457y0((List) it2.next());
                reviewViewModel.getClass();
                m10249w2(setM13457y3, arrayList5, arrayList3);
            }
            arrayList = arrayList3;
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = reviewViewModel$buildMultiWordActivities$1.f29728g;
            set = reviewViewModel$buildMultiWordActivities$1.f29727f;
            arrayList2 = reviewViewModel$buildMultiWordActivities$1.f29726e;
            reviewViewModel = reviewViewModel$buildMultiWordActivities$1.f29725d;
            C7499b.m14977z0(obj);
            arrayList6 = new ArrayList();
            it3 = ((List) obj).iterator();
            loop0: while (true) {
                while (true) {
                    if (it3.hasNext()) {
                        break loop0;
                    }
                    next = it3.next();
                    if (!((C7374a) next).f41146e.isEmpty()) {
                        arrayList6.add(next);
                    }
                }
            }
            arrayList7 = new ArrayList(C9325m.m17681z(arrayList6, 10));
            it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                String str4 = ((C7374a) it4.next()).f41142a;
                Locale locale4 = reviewViewModel.f29614K;
                C5207g.m11110e(locale4, "locale");
                arrayList7.add(C7793a.m15502f(str4, locale4));
            }
            Set setM13457y4 = C6752c.m13457y0(set);
            reviewViewModel.getClass();
            m10249w2(setM13457y4, arrayList7, arrayList2);
            while (i11 > 0) {
                m10249w2(EmptySet.f38034a, arrayList7, arrayList2);
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            Iterator it6 = C9000b.m17256v((Iterable) reviewViewModel.f29622O.getValue()).iterator();
            while (it6.hasNext()) {
                arrayList.add(new AbstractC9953a.d((C7566f) it6.next()));
            }
        }
        boolean zBooleanValue = ((Boolean) reviewViewModel.f29609H0.getValue()).booleanValue();
        C9548h c9548h2 = reviewViewModel.f29612J;
        if (zBooleanValue) {
            arrayList.add(new AbstractC9953a.j(c9548h2.f49124e));
        }
        if (((Boolean) reviewViewModel.f29613J0.getValue()).booleanValue() && C5207g.m11106a(reviewViewModel.f29601A0.getValue(), Boolean.TRUE)) {
            arrayList.add(new AbstractC9953a.i(c9548h2.f49124e));
        }
        reviewViewModel.f29626Q.setValue(arrayList);
        reviewViewModel.m10266z2();
        reviewViewModel.f29643b0.setValue(Resource.Status.SUCCESS);
        return C9072e.f47360a;
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: r */
    public final void mo10062r(String str) {
        this.f29608H.mo10062r(str);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m10259r2() {
        StateFlowImpl stateFlowImpl;
        Object value;
        boolean z10;
        String str;
        do {
            stateFlowImpl = this.f29627Q0;
            value = stateFlowImpl.getValue();
            C9544d c9544d = (C9544d) value;
            z10 = c9544d.f49108a;
            str = c9544d.f49109b;
            C5207g.m11111f(str, "emoji");
        } while (!stateFlowImpl.mo14366c(value, new C9544d(str, z10, false)));
    }

    /* JADX INFO: renamed from: s2 */
    public final void m10260s2() {
        StateFlowImpl stateFlowImpl;
        Object value;
        ReviewResultType reviewResultType;
        String str;
        String str2;
        String str3;
        do {
            stateFlowImpl = this.f29631S0;
            value = stateFlowImpl.getValue();
            C9545e c9545e = (C9545e) value;
            reviewResultType = c9545e.f49111a;
            C5207g.m11111f(reviewResultType, "result");
            str = c9545e.f49112b;
            C5207g.m11111f(str, "emoji");
            str2 = c9545e.f49114d;
            C5207g.m11111f(str2, "sentence");
            str3 = c9545e.f49115e;
            C5207g.m11111f(str3, "youAnswered");
        } while (!stateFlowImpl.mo14366c(value, new C9545e(reviewResultType, str, false, str2, str3)));
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: t0 */
    public final void mo10064t0(TokenData tokenData) {
        C5207g.m11111f(tokenData, "updateTokenData");
        this.f29608H.mo10064t0(tokenData);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f29661l.mo508t1();
    }

    /* JADX INFO: renamed from: t2 */
    public final AbstractC9953a m10261t2() {
        return (AbstractC9953a) C6752c.m13426T(((Number) this.f29641Z.getValue()).intValue(), (List) this.f29626Q.getValue());
    }

    /* JADX INFO: renamed from: u2 */
    public final ArrayList m10262u2(String str) {
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f29640Y.getValue();
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        while (hashSet.size() < 3) {
            int iNextInt = random.nextInt(list.size());
            if (!arrayList2.contains(Integer.valueOf(iNextInt))) {
                arrayList2.add(Integer.valueOf(iNextInt));
                List<TokenMeaning> list2 = ((C7566f) list.get(iNextInt)).f41696f;
                if ((!list2.isEmpty()) && !C5207g.m11106a(list2.get(0).f22090c, str)) {
                    hashSet.add(Integer.valueOf(iNextInt));
                }
            }
            if (hashSet.size() == list.size() || arrayList2.size() == list.size()) {
                break;
            }
        }
        for (Integer num : hashSet) {
            C5207g.m11110e(num, "cardIndex");
            arrayList.add(((C7566f) list.get(num.intValue())).f41696f.get(0).f22090c);
        }
        int iNextInt2 = random.nextInt(arrayList.size() + 1);
        if (str != null) {
            arrayList.add(iNextInt2, str);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v2 */
    public final ArrayList m10263v2(String str) {
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f29640Y.getValue();
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        while (hashSet.size() < 3) {
            int iNextInt = random.nextInt(list.size());
            if (!arrayList2.contains(Integer.valueOf(iNextInt))) {
                arrayList2.add(Integer.valueOf(iNextInt));
                if (!C5207g.m11106a(((C7566f) list.get(iNextInt)).f41692b, str)) {
                    hashSet.add(Integer.valueOf(iNextInt));
                }
            }
            if (hashSet.size() == list.size() || arrayList2.size() == list.size()) {
                break;
            }
        }
        for (Integer num : hashSet) {
            C5207g.m11110e(num, "cardIndex");
            arrayList.add(((C7566f) list.get(num.intValue())).f41692b);
        }
        arrayList.add(random.nextInt(arrayList.size() + 1), str);
        return arrayList;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f29661l.mo509w0();
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: x */
    public final void mo9421x(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        this.f29610I.mo9421x(appUsageType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f9, code lost:
    
        if (((java.util.List) r3.getValue()).size() >= 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0157, code lost:
    
        if (((java.util.List) r3.getValue()).size() >= 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (dm.C5207g.m11106a(r1.getValue(), java.lang.Boolean.TRUE) != false) goto L73;
     */
    /* JADX INFO: renamed from: x2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10264x2(int i10) {
        int iOrdinal = ReviewActivityType.FlashcardActivity.ordinal();
        StateFlowImpl stateFlowImpl = this.f29601A0;
        if (i10 == iOrdinal) {
            if (((Boolean) this.f29603C0.getValue()).booleanValue()) {
            }
        }
        if (i10 == ReviewActivityType.FlashcardReverseActivity.ordinal()) {
            if (((Boolean) this.f29604D0.getValue()).booleanValue() && C5207g.m11106a(stateFlowImpl.getValue(), Boolean.TRUE)) {
                return true;
            }
        }
        int iOrdinal2 = ReviewActivityType.DictationActivity.ordinal();
        StateFlowImpl stateFlowImpl2 = this.f29640Y;
        C7135p c7135p = this.f29607G0;
        StateFlowImpl stateFlowImpl3 = this.f29643b0;
        if (i10 == iOrdinal2) {
            return stateFlowImpl3.getValue() != Resource.Status.SUCCESS ? false : false;
        }
        if (i10 == ReviewActivityType.DictationReverseActivity.ordinal()) {
            if (stateFlowImpl3.getValue() == Resource.Status.SUCCESS) {
                if (((Boolean) c7135p.getValue()).booleanValue()) {
                    if (C5207g.m11106a(stateFlowImpl.getValue(), Boolean.TRUE)) {
                    }
                }
            }
            if (((Boolean) c7135p.getValue()).booleanValue() && C5207g.m11106a(stateFlowImpl.getValue(), Boolean.TRUE)) {
                return true;
            }
        }
        int iOrdinal3 = ReviewActivityType.MultiChoiceActivity.ordinal();
        C7135p c7135p2 = this.f29606F0;
        if (i10 == iOrdinal3) {
            if (stateFlowImpl3.getValue() == Resource.Status.SUCCESS) {
                if (((Boolean) c7135p2.getValue()).booleanValue()) {
                    if (C5207g.m11106a(stateFlowImpl.getValue(), Boolean.TRUE)) {
                    }
                }
            }
            if (((Boolean) c7135p2.getValue()).booleanValue() && C5207g.m11106a(stateFlowImpl.getValue(), Boolean.TRUE)) {
                return true;
            }
        }
        if (i10 == ReviewActivityType.MultiChoiceReverseActivity.ordinal()) {
            if (stateFlowImpl3.getValue() != Resource.Status.SUCCESS) {
                return ((Boolean) c7135p2.getValue()).booleanValue();
            }
            if (((Boolean) c7135p2.getValue()).booleanValue() && ((List) stateFlowImpl2.getValue()).size() >= 4) {
                return true;
            }
        } else if (i10 == ReviewActivityType.ClozeActivity.ordinal()) {
            return ((Boolean) this.f29605E0.getValue()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: y2 */
    public final void m10265y2(String str) {
        C5207g.m11111f(str, "cardTerm");
        Locale locale = this.f29614K;
        C5207g.m11110e(locale, "locale");
        String strM15502f = C7793a.m15502f(str, locale);
        StateFlowImpl stateFlowImpl = this.f29634U;
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) stateFlowImpl.getValue());
        Integer num = (Integer) linkedHashMapM13467T0.get(strM15502f);
        linkedHashMapM13467T0.put(strM15502f, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        stateFlowImpl.setValue(linkedHashMapM13467T0);
        Integer num2 = (Integer) linkedHashMapM13467T0.get(strM15502f);
        if (num2 == null) {
            return;
        }
        if (num2.intValue() == 2) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new ReviewViewModel$needsToUpdateStatus$1(this, strM15502f, null), 3);
        }
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: z */
    public final void mo10065z() {
        this.f29608H.mo10065z();
    }

    /* JADX INFO: renamed from: z2 */
    public final void m10266z2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new ReviewViewModel$nextActivity$1(this, null), 3);
    }
}
