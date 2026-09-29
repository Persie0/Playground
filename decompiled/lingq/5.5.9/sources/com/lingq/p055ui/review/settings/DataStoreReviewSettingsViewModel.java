package com.lingq.p055ui.review.settings;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2024q;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$1;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$24;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$25;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$26;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$3;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$4;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$5;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$6;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$7;
import com.lingq.shared.storage.ReviewStoreImpl$special$$inlined$map$8;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C7127c;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5181c;
import p225kk.C6715l;
import p260m8.C7499b;
import p278nh.AbstractC7787n;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/review/settings/DataStoreReviewSettingsViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DataStoreReviewSettingsViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final C7135p f30188H;

    /* JADX INFO: renamed from: I */
    public final C7135p f30189I;

    /* JADX INFO: renamed from: J */
    public final C7135p f30190J;

    /* JADX INFO: renamed from: K */
    public final C7135p f30191K;

    /* JADX INFO: renamed from: L */
    public final C7135p f30192L;

    /* JADX INFO: renamed from: M */
    public final C7135p f30193M;

    /* JADX INFO: renamed from: N */
    public final C7135p f30194N;

    /* JADX INFO: renamed from: O */
    public final C7135p f30195O;

    /* JADX INFO: renamed from: P */
    public final C7135p f30196P;

    /* JADX INFO: renamed from: Q */
    public final C7135p f30197Q;

    /* JADX INFO: renamed from: R */
    public final C7135p f30198R;

    /* JADX INFO: renamed from: S */
    public final C7135p f30199S;

    /* JADX INFO: renamed from: T */
    public final C7135p f30200T;

    /* JADX INFO: renamed from: U */
    public final C7135p f30201U;

    /* JADX INFO: renamed from: V */
    public final C7135p f30202V;

    /* JADX INFO: renamed from: W */
    public final C7135p f30203W;

    /* JADX INFO: renamed from: X */
    public final C7135p f30204X;

    /* JADX INFO: renamed from: Y */
    public final C7135p f30205Y;

    /* JADX INFO: renamed from: Z */
    public final C7135p f30206Z;

    /* JADX INFO: renamed from: a0 */
    public final C7135p f30207a0;

    /* JADX INFO: renamed from: b0 */
    public final C7135p f30208b0;

    /* JADX INFO: renamed from: c0 */
    public final C7135p f30209c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2024q f30210d;

    /* JADX INFO: renamed from: d0 */
    public final StateFlowImpl f30211d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5181c f30212e;

    /* JADX INFO: renamed from: e0 */
    public final C7138s f30213e0;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f30214f;

    /* JADX INFO: renamed from: f0 */
    public final C7134o f30215f0;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0113j f30216g;

    /* JADX INFO: renamed from: g0 */
    public final C7135p f30217g0;

    /* JADX INFO: renamed from: h */
    public final StateFlowImpl f30218h;

    /* JADX INFO: renamed from: i */
    public final C7135p f30219i;

    /* JADX INFO: renamed from: j */
    public final C7135p f30220j;

    /* JADX INFO: renamed from: k */
    public final C7135p f30221k;

    /* JADX INFO: renamed from: l */
    public final C7135p f30222l;

    /* JADX INFO: renamed from: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$1", m19206f = "DataStoreReviewSettingsViewModel.kt", m19207l = {300, 301}, m19208m = "invokeSuspend")
    final class C46631 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30223e;

        /* JADX INFO: renamed from: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$1$1", m19206f = "DataStoreReviewSettingsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ int f30225e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ DataStoreReviewSettingsViewModel f30226f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f30226f = dataStoreReviewSettingsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f30226f, interfaceC9968c);
                anonymousClass1.f30225e = ((Number) obj).intValue();
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
                this.f30226f.f30211d0.setValue(Boolean.valueOf(this.f30225e > 0));
                return C9072e.f47360a;
            }
        }

        public C46631(InterfaceC9968c<? super C46631> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DataStoreReviewSettingsViewModel.this.new C46631(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46631) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30223e;
            DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel = DataStoreReviewSettingsViewModel.this;
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
            InterfaceC2024q interfaceC2024q = dataStoreReviewSettingsViewModel.f30210d;
            String strMo498E1 = dataStoreReviewSettingsViewModel.mo498E1();
            this.f30223e = 1;
            obj = interfaceC2024q.mo6170a(strMo498E1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dataStoreReviewSettingsViewModel, null);
            this.f30223e = 2;
            return C0062b.m369m0((InterfaceC7116c) obj, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    public DataStoreReviewSettingsViewModel(InterfaceC2024q interfaceC2024q, InterfaceC5181c interfaceC5181c, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        int i10;
        C7135p c7135pM306S;
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC5181c, "reviewStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f30210d = interfaceC2024q;
        this.f30212e = interfaceC5181c;
        this.f30214f = executorC7177a;
        this.f30216g = interfaceC0113j;
        Integer num = (Integer) c1024c0.m3929b("viewKey");
        ViewKeys viewKeys = ViewKeys.ActivitiesSettings;
        int iOrdinal = viewKeys.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            i10 = R.string.activities_settings;
        } else {
            int iOrdinal2 = ViewKeys.FlashCardsSettings.ordinal();
            if (num != null && num.intValue() == iOrdinal2) {
                i10 = R.string.settings_text_flashcards_settings;
            } else {
                i10 = (num != null && num.intValue() == ViewKeys.ReversFlashCardsSettings.ordinal()) ? R.string.settings_text_reverse_flashcards_settings : R.string.placeholder;
            }
        }
        this.f30218h = C7120g.m14379a(Integer.valueOf(i10));
        ReviewStoreImpl$special$$inlined$map$1 reviewStoreImpl$special$$inlined$map$1Mo9651a = interfaceC5181c.mo9651a();
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        Boolean bool = Boolean.FALSE;
        C7135p c7135pM353h2 = C0062b.m353h2(reviewStoreImpl$special$$inlined$map$1Mo9651a, interfaceC7882zM16767w0, startedWhileSubscribed, bool);
        this.f30219i = c7135pM353h2;
        C7135p c7135pM353h3 = C0062b.m353h2(interfaceC5181c.mo9657g(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f30220j = c7135pM353h3;
        C7135p c7135pM353h4 = C0062b.m353h2(interfaceC5181c.mo9653c(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f30221k = c7135pM353h4;
        C7135p c7135pM353h5 = C0062b.m353h2(interfaceC5181c.mo9625A(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f30222l = c7135pM353h5;
        C7135p c7135pM353h6 = C0062b.m353h2(interfaceC5181c.mo9672v(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f30188H = c7135pM353h6;
        C7135p c7135pM353h7 = C0062b.m353h2(interfaceC5181c.mo9664n(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f30189I = c7135pM353h7;
        C7135p c7135pM353h8 = C0062b.m353h2(interfaceC5181c.mo9636L(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f30190J = c7135pM353h8;
        C7135p c7135pM353h9 = C0062b.m353h2(interfaceC5181c.mo9660j(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f30191K = c7135pM353h9;
        C7135p c7135pM353h10 = C0062b.m353h2(interfaceC5181c.mo9630F(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f30192L = c7135pM353h10;
        C7135p c7135pM353h11 = C0062b.m353h2(interfaceC5181c.mo9638N(), C8573r0.m16767w0(this), startedWhileSubscribed, 10);
        this.f30193M = c7135pM353h11;
        ReviewStoreImpl$special$$inlined$map$8 reviewStoreImpl$special$$inlined$map$8Mo9673w = interfaceC5181c.mo9673w();
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(this);
        Boolean bool2 = Boolean.TRUE;
        C7135p c7135pM353h12 = C0062b.m353h2(reviewStoreImpl$special$$inlined$map$8Mo9673w, interfaceC7882zM16767w1, startedWhileSubscribed, bool2);
        this.f30194N = c7135pM353h12;
        C7135p c7135pM353h13 = C0062b.m353h2(interfaceC5181c.mo9656f(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30195O = c7135pM353h13;
        C7135p c7135pM353h14 = C0062b.m353h2(interfaceC5181c.mo9648X(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30196P = c7135pM353h14;
        C7135p c7135pM353h15 = C0062b.m353h2(interfaceC5181c.mo9663m(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30197Q = c7135pM353h15;
        C7135p c7135pM353h16 = C0062b.m353h2(interfaceC5181c.mo9675y(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30198R = c7135pM353h16;
        C7135p c7135pM353h17 = C0062b.m353h2(interfaceC5181c.mo9635K(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30199S = c7135pM353h17;
        C7135p c7135pM353h18 = C0062b.m353h2(interfaceC5181c.mo9646V(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30200T = c7135pM353h18;
        C7135p c7135pM353h19 = C0062b.m353h2(interfaceC5181c.mo9654d(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30201U = c7135pM353h19;
        C7135p c7135pM353h20 = C0062b.m353h2(interfaceC5181c.mo9643S(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30202V = c7135pM353h20;
        C7135p c7135pM353h21 = C0062b.m353h2(interfaceC5181c.mo9659i(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30203W = c7135pM353h21;
        C7135p c7135pM353h22 = C0062b.m353h2(interfaceC5181c.mo9637M(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30204X = c7135pM353h22;
        C7135p c7135pM353h23 = C0062b.m353h2(interfaceC5181c.mo9647W(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30205Y = c7135pM353h23;
        C7135p c7135pM353h24 = C0062b.m353h2(interfaceC5181c.mo9676z(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30206Z = c7135pM353h24;
        C7135p c7135pM353h25 = C0062b.m353h2(interfaceC5181c.mo9632H(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30207a0 = c7135pM353h25;
        C7135p c7135pM353h26 = C0062b.m353h2(interfaceC5181c.mo9658h(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30208b0 = c7135pM353h26;
        C7135p c7135pM353h27 = C0062b.m353h2(interfaceC5181c.mo9670t(), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f30209c0 = c7135pM353h27;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f30211d0 = stateFlowImplM14379a;
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f30213e0 = c7138sM10448a;
        this.f30215f0 = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        int iOrdinal3 = viewKeys.ordinal();
        if (num != null && num.intValue() == iOrdinal3) {
            final InterfaceC7116c[] interfaceC7116cArr = {c7135pM353h11, c7135pM353h2, c7135pM353h3, c7135pM353h4, c7135pM353h5, c7135pM353h6, c7135pM353h7, c7135pM353h8, c7135pM353h9, c7135pM353h10, stateFlowImplM14379a};
            c7135pM306S = C0062b.m353h2(new InterfaceC7116c<List<? extends AbstractC7787n>>() { // from class: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$1

                /* JADX INFO: renamed from: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$1$3 */
                @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$1$3", m19206f = "DataStoreReviewSettingsViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
                public static final class C46803 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends AbstractC7787n>>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public int f30319e;

                    /* JADX INFO: renamed from: f */
                    public /* synthetic */ InterfaceC7117d f30320f;

                    /* JADX INFO: renamed from: g */
                    public /* synthetic */ Object[] f30321g;

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ DataStoreReviewSettingsViewModel f30322h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C46803(DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel, InterfaceC9968c interfaceC9968c) {
                        super(3, interfaceC9968c);
                        this.f30322h = dataStoreReviewSettingsViewModel;
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final Object mo1343M(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        C46803 c46803 = new C46803(this.f30322h, interfaceC9968c);
                        c46803.f30320f = interfaceC7117d;
                        c46803.f30321g = objArr;
                        return c46803.mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f30319e;
                        if (i10 == 0) {
                            C7499b.m14977z0(obj);
                            InterfaceC7117d interfaceC7117d = this.f30320f;
                            ArrayList arrayListM10302p2 = this.f30322h.m10302p2();
                            this.f30319e = 1;
                            if (interfaceC7117d.mo1339r(arrayListM10302p2, this) == coroutineSingletons) {
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
                public final Object mo9539a(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                    final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                    Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Object[] mo807E() {
                            return new Object[interfaceC7116cArr2.length];
                        }
                    }, new C46803(this, null), interfaceC7117d, interfaceC7116cArr2);
                    return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
                }
            }, C8573r0.m16767w0(this), startedWhileSubscribed, EmptyList.f38032a);
        } else {
            int iOrdinal4 = ViewKeys.FlashCardsSettings.ordinal();
            if (num != null && num.intValue() == iOrdinal4) {
                final InterfaceC7116c[] interfaceC7116cArr2 = {c7135pM353h12, c7135pM353h14, c7135pM353h13, c7135pM353h15, c7135pM353h16, c7135pM353h18, c7135pM353h17, c7135pM353h19};
                c7135pM306S = C0062b.m353h2(new InterfaceC7116c<List<? extends AbstractC7787n>>() { // from class: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$2

                    /* JADX INFO: renamed from: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$2$3 */
                    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                    @InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$2$3", m19206f = "DataStoreReviewSettingsViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
                    public static final class C46823 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends AbstractC7787n>>, Boolean[], InterfaceC9968c<? super C9072e>, Object> {

                        /* JADX INFO: renamed from: e */
                        public int f30326e;

                        /* JADX INFO: renamed from: f */
                        public /* synthetic */ InterfaceC7117d f30327f;

                        /* JADX INFO: renamed from: g */
                        public /* synthetic */ Object[] f30328g;

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ DataStoreReviewSettingsViewModel f30329h;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C46823(DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel, InterfaceC9968c interfaceC9968c) {
                            super(3, interfaceC9968c);
                            this.f30329h = dataStoreReviewSettingsViewModel;
                        }

                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final Object mo1343M(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, Boolean[] boolArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                            C46823 c46823 = new C46823(this.f30329h, interfaceC9968c);
                            c46823.f30327f = interfaceC7117d;
                            c46823.f30328g = boolArr;
                            return c46823.mo1338x(C9072e.f47360a);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) throws Throwable {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i10 = this.f30326e;
                            if (i10 == 0) {
                                C7499b.m14977z0(obj);
                                InterfaceC7117d interfaceC7117d = this.f30327f;
                                ArrayList arrayListM10300n2 = this.f30329h.m10300n2();
                                this.f30326e = 1;
                                if (interfaceC7117d.mo1339r(arrayListM10300n2, this) == coroutineSingletons) {
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
                    public final Object mo9539a(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                        final InterfaceC7116c[] interfaceC7116cArr3 = interfaceC7116cArr2;
                        Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Boolean[]>() { // from class: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Boolean[] mo807E() {
                                return new Boolean[interfaceC7116cArr3.length];
                            }
                        }, new C46823(this, null), interfaceC7117d, interfaceC7116cArr3);
                        return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
                    }
                }, C8573r0.m16767w0(this), startedWhileSubscribed, EmptyList.f38032a);
            } else {
                int iOrdinal5 = ViewKeys.ReversFlashCardsSettings.ordinal();
                if (num != null && num.intValue() == iOrdinal5) {
                    final InterfaceC7116c[] interfaceC7116cArr3 = {c7135pM353h20, c7135pM353h22, c7135pM353h21, c7135pM353h23, c7135pM353h24, c7135pM353h26, c7135pM353h25, c7135pM353h27};
                    c7135pM306S = C0062b.m353h2(new InterfaceC7116c<List<? extends AbstractC7787n>>() { // from class: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$3

                        /* JADX INFO: renamed from: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$3$3 */
                        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                        @InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$3$3", m19206f = "DataStoreReviewSettingsViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
                        public static final class C46843 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends AbstractC7787n>>, Boolean[], InterfaceC9968c<? super C9072e>, Object> {

                            /* JADX INFO: renamed from: e */
                            public int f30333e;

                            /* JADX INFO: renamed from: f */
                            public /* synthetic */ InterfaceC7117d f30334f;

                            /* JADX INFO: renamed from: g */
                            public /* synthetic */ Object[] f30335g;

                            /* JADX INFO: renamed from: h */
                            public final /* synthetic */ DataStoreReviewSettingsViewModel f30336h;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C46843(DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel, InterfaceC9968c interfaceC9968c) {
                                super(3, interfaceC9968c);
                                this.f30336h = dataStoreReviewSettingsViewModel;
                            }

                            @Override // cm.InterfaceC2057q
                            /* JADX INFO: renamed from: M */
                            public final Object mo1343M(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, Boolean[] boolArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                                C46843 c46843 = new C46843(this.f30336h, interfaceC9968c);
                                c46843.f30334f = interfaceC7117d;
                                c46843.f30335g = boolArr;
                                return c46843.mo1338x(C9072e.f47360a);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) throws Throwable {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i10 = this.f30333e;
                                if (i10 == 0) {
                                    C7499b.m14977z0(obj);
                                    InterfaceC7117d interfaceC7117d = this.f30334f;
                                    ArrayList arrayListM10301o2 = this.f30336h.m10301o2();
                                    this.f30333e = 1;
                                    if (interfaceC7117d.mo1339r(arrayListM10301o2, this) == coroutineSingletons) {
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
                        public final Object mo9539a(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                            final InterfaceC7116c[] interfaceC7116cArr4 = interfaceC7116cArr3;
                            Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Boolean[]>() { // from class: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$special$$inlined$combine$3.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Boolean[] mo807E() {
                                    return new Boolean[interfaceC7116cArr4.length];
                                }
                            }, new C46843(this, null), interfaceC7117d, interfaceC7116cArr4);
                            return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
                        }
                    }, C8573r0.m16767w0(this), startedWhileSubscribed, EmptyList.f38032a);
                } else {
                    c7135pM306S = C0062b.m306S(C7120g.m14379a(EmptyList.f38032a));
                }
            }
        }
        this.f30217g0 = c7135pM306S;
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C46631(null), 3);
        int iOrdinal6 = viewKeys.ordinal();
        if (num != null && num.intValue() == iOrdinal6) {
            m10302p2();
            return;
        }
        int iOrdinal7 = ViewKeys.FlashCardsSettings.ordinal();
        if (num != null && num.intValue() == iOrdinal7) {
            m10300n2();
            return;
        }
        int iOrdinal8 = ViewKeys.ReversFlashCardsSettings.ordinal();
        if (num != null && num.intValue() == iOrdinal8) {
            m10301o2();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0117  */
    /* JADX WARN: Code duplicated, block: B:35:0x0137  */
    /* JADX WARN: Code duplicated, block: B:39:0x0158  */
    /* JADX WARN: Code duplicated, block: B:42:0x0178  */
    /* JADX WARN: Code duplicated, block: B:43:0x017b  */
    /* JADX WARN: Code duplicated, block: B:52:0x01be  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01df  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX INFO: renamed from: l2 */
    public static final Object m10298l2(DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel, boolean z10, InterfaceC9968c interfaceC9968c) throws Throwable {
        DataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1 dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1;
        DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel2;
        Boolean[] boolArr;
        int i10;
        DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel3;
        Boolean[] boolArr2;
        int i11;
        Object[] objArr;
        Object[] objArr2;
        int i12;
        Boolean[] boolArr3;
        Boolean[] boolArr4;
        DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel4;
        Object[] objArr3;
        Object[] objArr4;
        Boolean[] boolArr5;
        Object[] objArr5;
        Boolean[] boolArr6;
        Object[] objArr6;
        Boolean[] boolArr7;
        int i13;
        Boolean[] boolArr8;
        int i14;
        int i15;
        Object[] objArr7;
        dataStoreReviewSettingsViewModel.getClass();
        if (interfaceC9968c instanceof DataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1) {
            dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1 = (DataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1) interfaceC9968c;
            int i16 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = i16 - Integer.MIN_VALUE;
            } else {
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1 = new DataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1(dataStoreReviewSettingsViewModel, interfaceC9968c);
            }
        } else {
            dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1 = new DataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1(dataStoreReviewSettingsViewModel, interfaceC9968c);
        }
        Object objM14360a = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30231h;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean z11 = true;
        int i17 = 4;
        int i18 = 3;
        int i19 = 2;
        switch (dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(objM14360a);
                if (!z10) {
                    boolean zM10303q2 = dataStoreReviewSettingsViewModel.m10303q2();
                    InterfaceC5181c interfaceC5181c = dataStoreReviewSettingsViewModel.f30212e;
                    if (zM10303q2) {
                        Boolean[] boolArr9 = new Boolean[5];
                        ReviewStoreImpl$special$$inlined$map$3 reviewStoreImpl$special$$inlined$map$3Mo9657g = interfaceC5181c.mo9657g();
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr9;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr9;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 0;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 1;
                        objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$3Mo9657g, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                        if (objM14360a == obj) {
                            return obj;
                        }
                        dataStoreReviewSettingsViewModel3 = dataStoreReviewSettingsViewModel;
                        boolArr2 = boolArr9;
                        i11 = 0;
                        objArr = boolArr9;
                        objArr[i11] = objM14360a;
                        ReviewStoreImpl$special$$inlined$map$4 reviewStoreImpl$special$$inlined$map$4Mo9653c = dataStoreReviewSettingsViewModel3.f30212e.mo9653c();
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel3;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr2;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr2;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 1;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 2;
                        objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$4Mo9653c, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                        if (objM14360a == obj) {
                            return obj;
                        }
                        objArr2 = boolArr2;
                        i12 = 1;
                        boolArr3 = boolArr2;
                        objArr2[i12] = objM14360a;
                        ReviewStoreImpl$special$$inlined$map$5 reviewStoreImpl$special$$inlined$map$5Mo9625A = dataStoreReviewSettingsViewModel3.f30212e.mo9625A();
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel3;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr3;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr3;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 2;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 3;
                        objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$5Mo9625A, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                        if (objM14360a == obj) {
                            return obj;
                        }
                        Boolean[] boolArr10 = boolArr3;
                        boolArr4 = boolArr10;
                        dataStoreReviewSettingsViewModel4 = dataStoreReviewSettingsViewModel3;
                        objArr3 = boolArr10;
                        objArr3[i19] = objM14360a;
                        ReviewStoreImpl$special$$inlined$map$6 reviewStoreImpl$special$$inlined$map$6Mo9672v = dataStoreReviewSettingsViewModel4.f30212e.mo9672v();
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel4;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr4;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr4;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 3;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 4;
                        objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$6Mo9672v, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                        if (objM14360a == obj) {
                            return obj;
                        }
                        objArr4 = boolArr4;
                        boolArr5 = boolArr4;
                        objArr4[i18] = objM14360a;
                        ReviewStoreImpl$special$$inlined$map$7 reviewStoreImpl$special$$inlined$map$7Mo9664n = dataStoreReviewSettingsViewModel4.f30212e.mo9664n();
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = boolArr5;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr5;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = null;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 4;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 5;
                        objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$7Mo9664n, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                        if (objM14360a == obj) {
                            return obj;
                        }
                        objArr5 = boolArr5;
                        boolArr6 = boolArr5;
                        objArr5[i17] = objM14360a;
                        boolArr8 = boolArr6;
                        i15 = 0;
                        for (Boolean bool : boolArr8) {
                            if (bool.booleanValue()) {
                                i15++;
                            }
                        }
                        if (i15 == 1) {
                            z11 = false;
                        }
                    } else {
                        Boolean[] boolArr11 = new Boolean[2];
                        ReviewStoreImpl$special$$inlined$map$5 reviewStoreImpl$special$$inlined$map$5Mo9625A2 = interfaceC5181c.mo9625A();
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr11;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr11;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 0;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 6;
                        objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$5Mo9625A2, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                        if (objM14360a == obj) {
                            return obj;
                        }
                        dataStoreReviewSettingsViewModel2 = dataStoreReviewSettingsViewModel;
                        boolArr = boolArr11;
                        i10 = 0;
                        objArr6 = boolArr11;
                        objArr6[i10] = objM14360a;
                        ReviewStoreImpl$special$$inlined$map$6 reviewStoreImpl$special$$inlined$map$6Mo9672v2 = dataStoreReviewSettingsViewModel2.f30212e.mo9672v();
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = boolArr;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = null;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 1;
                        dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 7;
                        objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$6Mo9672v2, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                        if (objM14360a == obj) {
                            return obj;
                        }
                        Boolean[] boolArr12 = boolArr;
                        boolArr7 = boolArr12;
                        i13 = 1;
                        objArr7 = boolArr12;
                        objArr7[i13] = objM14360a;
                        boolArr8 = boolArr7;
                        i15 = 0;
                        while (i14 < r12) {
                            if (bool.booleanValue()) {
                                i15++;
                            }
                        }
                        if (i15 == 1) {
                            z11 = false;
                        }
                    }
                }
                return Boolean.valueOf(z11);
            case 1:
                i11 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g;
                Object[] objArr8 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f;
                Boolean[] boolArr13 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e;
                dataStoreReviewSettingsViewModel3 = (DataStoreReviewSettingsViewModel) dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d;
                C7499b.m14977z0(objM14360a);
                boolArr2 = boolArr13;
                objArr = objArr8;
                objArr[i11] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$4 reviewStoreImpl$special$$inlined$map$4Mo9653c2 = dataStoreReviewSettingsViewModel3.f30212e.mo9653c();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr2;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr2;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 1;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 2;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$4Mo9653c2, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                objArr2 = boolArr2;
                i12 = 1;
                boolArr3 = boolArr2;
                objArr2[i12] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$5 reviewStoreImpl$special$$inlined$map$5Mo9625A3 = dataStoreReviewSettingsViewModel3.f30212e.mo9625A();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 2;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 3;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$5Mo9625A3, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                Boolean[] boolArr14 = boolArr3;
                boolArr4 = boolArr14;
                dataStoreReviewSettingsViewModel4 = dataStoreReviewSettingsViewModel3;
                objArr3 = boolArr14;
                objArr3[i19] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$6 reviewStoreImpl$special$$inlined$map$6Mo9672v3 = dataStoreReviewSettingsViewModel4.f30212e.mo9672v();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 4;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$6Mo9672v3, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                objArr4 = boolArr4;
                boolArr5 = boolArr4;
                objArr4[i18] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$7 reviewStoreImpl$special$$inlined$map$7Mo9664n2 = dataStoreReviewSettingsViewModel4.f30212e.mo9664n();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = boolArr5;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr5;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = null;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 5;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$7Mo9664n2, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                objArr5 = boolArr5;
                boolArr6 = boolArr5;
                objArr5[i17] = objM14360a;
                boolArr8 = boolArr6;
                i15 = 0;
                while (i14 < r12) {
                    if (bool.booleanValue()) {
                        i15++;
                    }
                }
                if (i15 == 1) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 2:
                i12 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g;
                Object[] objArr9 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f;
                Boolean[] boolArr15 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e;
                dataStoreReviewSettingsViewModel3 = (DataStoreReviewSettingsViewModel) dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d;
                C7499b.m14977z0(objM14360a);
                boolArr3 = boolArr15;
                objArr2 = objArr9;
                objArr2[i12] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$5 reviewStoreImpl$special$$inlined$map$5Mo9625A4 = dataStoreReviewSettingsViewModel3.f30212e.mo9625A();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 2;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 3;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$5Mo9625A4, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                Boolean[] boolArr16 = boolArr3;
                boolArr4 = boolArr16;
                dataStoreReviewSettingsViewModel4 = dataStoreReviewSettingsViewModel3;
                objArr3 = boolArr16;
                objArr3[i19] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$6 reviewStoreImpl$special$$inlined$map$6Mo9672v4 = dataStoreReviewSettingsViewModel4.f30212e.mo9672v();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 4;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$6Mo9672v4, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                objArr4 = boolArr4;
                boolArr5 = boolArr4;
                objArr4[i18] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$7 reviewStoreImpl$special$$inlined$map$7Mo9664n3 = dataStoreReviewSettingsViewModel4.f30212e.mo9664n();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = boolArr5;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr5;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = null;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 5;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$7Mo9664n3, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                objArr5 = boolArr5;
                boolArr6 = boolArr5;
                objArr5[i17] = objM14360a;
                boolArr8 = boolArr6;
                i15 = 0;
                while (i14 < r12) {
                    if (bool.booleanValue()) {
                        i15++;
                    }
                }
                if (i15 == 1) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 3:
                i19 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g;
                Object[] objArr10 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f;
                Boolean[] boolArr17 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e;
                dataStoreReviewSettingsViewModel4 = (DataStoreReviewSettingsViewModel) dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d;
                C7499b.m14977z0(objM14360a);
                objArr3 = objArr10;
                boolArr4 = boolArr17;
                objArr3[i19] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$6 reviewStoreImpl$special$$inlined$map$6Mo9672v5 = dataStoreReviewSettingsViewModel4.f30212e.mo9672v();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = dataStoreReviewSettingsViewModel4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = boolArr4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 3;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 4;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$6Mo9672v5, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                objArr4 = boolArr4;
                boolArr5 = boolArr4;
                objArr4[i18] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$7 reviewStoreImpl$special$$inlined$map$7Mo9664n4 = dataStoreReviewSettingsViewModel4.f30212e.mo9664n();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = boolArr5;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr5;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = null;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 5;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$7Mo9664n4, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                objArr5 = boolArr5;
                boolArr6 = boolArr5;
                objArr5[i17] = objM14360a;
                boolArr8 = boolArr6;
                i15 = 0;
                while (i14 < r12) {
                    if (bool.booleanValue()) {
                        i15++;
                    }
                }
                if (i15 == 1) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 4:
                i18 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g;
                Object[] objArr11 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f;
                Boolean[] boolArr18 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e;
                dataStoreReviewSettingsViewModel4 = (DataStoreReviewSettingsViewModel) dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d;
                C7499b.m14977z0(objM14360a);
                objArr4 = objArr11;
                boolArr5 = boolArr18;
                objArr4[i18] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$7 reviewStoreImpl$special$$inlined$map$7Mo9664n5 = dataStoreReviewSettingsViewModel4.f30212e.mo9664n();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = boolArr5;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr5;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = null;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 4;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 5;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$7Mo9664n5, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                objArr5 = boolArr5;
                boolArr6 = boolArr5;
                objArr5[i17] = objM14360a;
                boolArr8 = boolArr6;
                i15 = 0;
                while (i14 < r12) {
                    if (bool.booleanValue()) {
                        i15++;
                    }
                }
                if (i15 == 1) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 5:
                i17 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g;
                Object[] objArr12 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e;
                Boolean[] boolArr19 = (Boolean[]) dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d;
                C7499b.m14977z0(objM14360a);
                objArr5 = objArr12;
                boolArr6 = boolArr19;
                objArr5[i17] = objM14360a;
                boolArr8 = boolArr6;
                i15 = 0;
                while (i14 < r12) {
                    if (bool.booleanValue()) {
                        i15++;
                    }
                }
                if (i15 == 1) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                i10 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g;
                Object[] objArr13 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f;
                Boolean[] boolArr20 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e;
                dataStoreReviewSettingsViewModel2 = (DataStoreReviewSettingsViewModel) dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d;
                C7499b.m14977z0(objM14360a);
                boolArr = boolArr20;
                objArr6 = objArr13;
                objArr6[i10] = objM14360a;
                ReviewStoreImpl$special$$inlined$map$6 reviewStoreImpl$special$$inlined$map$6Mo9672v6 = dataStoreReviewSettingsViewModel2.f30212e.mo9672v();
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d = boolArr;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e = boolArr;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30229f = null;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g = 1;
                dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30233j = 7;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$6Mo9672v6, dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1);
                if (objM14360a == obj) {
                    return obj;
                }
                Boolean[] boolArr110 = boolArr;
                boolArr7 = boolArr110;
                i13 = 1;
                objArr7 = boolArr110;
                objArr7[i13] = objM14360a;
                boolArr8 = boolArr7;
                i15 = 0;
                while (i14 < r12) {
                    if (bool.booleanValue()) {
                        i15++;
                    }
                }
                if (i15 == 1) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                i13 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30230g;
                Object[] objArr14 = dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30228e;
                Boolean[] boolArr21 = (Boolean[]) dataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1.f30227d;
                C7499b.m14977z0(objM14360a);
                boolArr7 = boolArr21;
                objArr7 = objArr14;
                objArr7[i13] = objM14360a;
                boolArr8 = boolArr7;
                i15 = 0;
                while (i14 < r12) {
                    if (bool.booleanValue()) {
                        i15++;
                    }
                }
                if (i15 == 1) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: m2 */
    public static final Object m10299m2(DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel, boolean z10, InterfaceC9968c interfaceC9968c) throws Throwable {
        C4664xa36f20e c4664xa36f20e;
        DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel2;
        Boolean[] boolArr;
        int i10;
        Object[] objArr;
        Object[] objArr2;
        int i11;
        Boolean[] boolArr2;
        Boolean[] boolArr3;
        Object[] objArr3;
        int i12;
        int i13;
        dataStoreReviewSettingsViewModel.getClass();
        if (interfaceC9968c instanceof C4664xa36f20e) {
            c4664xa36f20e = (C4664xa36f20e) interfaceC9968c;
            int i14 = c4664xa36f20e.f30240j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c4664xa36f20e.f30240j = i14 - Integer.MIN_VALUE;
            } else {
                c4664xa36f20e = new C4664xa36f20e(dataStoreReviewSettingsViewModel, interfaceC9968c);
            }
        } else {
            c4664xa36f20e = new C4664xa36f20e(dataStoreReviewSettingsViewModel, interfaceC9968c);
        }
        Object objM14360a = c4664xa36f20e.f30238h;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = c4664xa36f20e.f30240j;
        boolean z11 = true;
        int i16 = 2;
        if (i15 == 0) {
            C7499b.m14977z0(objM14360a);
            if (!z10) {
                Boolean[] boolArr4 = new Boolean[3];
                ReviewStoreImpl$special$$inlined$map$24 reviewStoreImpl$special$$inlined$map$24Mo9636L = dataStoreReviewSettingsViewModel.f30212e.mo9636L();
                c4664xa36f20e.f30234d = dataStoreReviewSettingsViewModel;
                c4664xa36f20e.f30235e = boolArr4;
                c4664xa36f20e.f30236f = boolArr4;
                c4664xa36f20e.f30237g = 0;
                c4664xa36f20e.f30240j = 1;
                objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$24Mo9636L, c4664xa36f20e);
                if (objM14360a == obj) {
                    return obj;
                }
                dataStoreReviewSettingsViewModel2 = dataStoreReviewSettingsViewModel;
                boolArr = boolArr4;
                i10 = 0;
                objArr = boolArr4;
            }
            return Boolean.valueOf(z11);
        }
        if (i15 == 1) {
            i10 = c4664xa36f20e.f30237g;
            Object[] objArr4 = c4664xa36f20e.f30236f;
            Boolean[] boolArr5 = c4664xa36f20e.f30235e;
            dataStoreReviewSettingsViewModel2 = (DataStoreReviewSettingsViewModel) c4664xa36f20e.f30234d;
            C7499b.m14977z0(objM14360a);
            boolArr = boolArr5;
            objArr = objArr4;
        } else if (i15 == 2) {
            i11 = c4664xa36f20e.f30237g;
            Object[] objArr5 = c4664xa36f20e.f30236f;
            Boolean[] boolArr6 = c4664xa36f20e.f30235e;
            dataStoreReviewSettingsViewModel2 = (DataStoreReviewSettingsViewModel) c4664xa36f20e.f30234d;
            C7499b.m14977z0(objM14360a);
            boolArr2 = boolArr6;
            objArr2 = objArr5;
            objArr2[i11] = objM14360a;
            ReviewStoreImpl$special$$inlined$map$26 reviewStoreImpl$special$$inlined$map$26Mo9630F = dataStoreReviewSettingsViewModel2.f30212e.mo9630F();
            c4664xa36f20e.f30234d = boolArr2;
            c4664xa36f20e.f30235e = boolArr2;
            c4664xa36f20e.f30236f = null;
            c4664xa36f20e.f30237g = 2;
            c4664xa36f20e.f30240j = 3;
            objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$26Mo9630F, c4664xa36f20e);
            if (objM14360a == obj) {
                return obj;
            }
            Boolean[] boolArr7 = boolArr2;
            boolArr3 = boolArr7;
            objArr3 = boolArr7;
        } else {
            if (i15 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i16 = c4664xa36f20e.f30237g;
            Object[] objArr6 = c4664xa36f20e.f30235e;
            Boolean[] boolArr8 = (Boolean[]) c4664xa36f20e.f30234d;
            C7499b.m14977z0(objM14360a);
            objArr3 = objArr6;
            boolArr3 = boolArr8;
        }
        objArr3[i16] = objM14360a;
        i13 = 0;
        for (Boolean bool : boolArr3) {
            if (bool.booleanValue()) {
                i13++;
            }
        }
        if (i13 == 1) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
        objArr[i10] = objM14360a;
        ReviewStoreImpl$special$$inlined$map$25 reviewStoreImpl$special$$inlined$map$25Mo9660j = dataStoreReviewSettingsViewModel2.f30212e.mo9660j();
        c4664xa36f20e.f30234d = dataStoreReviewSettingsViewModel2;
        c4664xa36f20e.f30235e = boolArr;
        c4664xa36f20e.f30236f = boolArr;
        c4664xa36f20e.f30237g = 1;
        c4664xa36f20e.f30240j = 2;
        objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$25Mo9660j, c4664xa36f20e);
        if (objM14360a == obj) {
            return obj;
        }
        objArr2 = boolArr;
        i11 = 1;
        boolArr2 = boolArr;
        objArr2[i11] = objM14360a;
        ReviewStoreImpl$special$$inlined$map$26 reviewStoreImpl$special$$inlined$map$26Mo9630F2 = dataStoreReviewSettingsViewModel2.f30212e.mo9630F();
        c4664xa36f20e.f30234d = boolArr2;
        c4664xa36f20e.f30235e = boolArr2;
        c4664xa36f20e.f30236f = null;
        c4664xa36f20e.f30237g = 2;
        c4664xa36f20e.f30240j = 3;
        objM14360a = FlowKt__ReduceKt.m14360a(reviewStoreImpl$special$$inlined$map$26Mo9630F2, c4664xa36f20e);
        if (objM14360a == obj) {
            return obj;
        }
        Boolean[] boolArr9 = boolArr2;
        boolArr3 = boolArr9;
        objArr3 = boolArr9;
        objArr3[i16] = objM14360a;
        i13 = 0;
        while (i12 < r8) {
            if (bool.booleanValue()) {
                i13++;
            }
        }
        if (i13 == 1) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f30216g.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30216g.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f30216g.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30216g.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f30216g.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30216g.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f30216g;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30216g.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f30216g.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30216g.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f30216g.mo506l1();
    }

    /* JADX INFO: renamed from: n2 */
    public final ArrayList m10300n2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC7787n.b(R.string.settings_text_flashcards_front));
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_term, ViewKeys.FlashcardsFrontTerm.ordinal(), ((Boolean) this.f30194N.getValue()).booleanValue(), false));
        AbstractC7787n.d dVar = AbstractC7787n.d.f42747a;
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_phrase, ViewKeys.FlashcardsFrontPhrase.ordinal(), ((Boolean) this.f30196P.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_meaning, ViewKeys.FlashcardsFrontTranslation.ordinal(), ((Boolean) this.f30195O.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_status_bar, ViewKeys.FlashcardsFrontStatusBar.ordinal(), ((Boolean) this.f30197Q.getValue()).booleanValue(), false));
        arrayList.add(new AbstractC7787n.b(R.string.settings_text_flashcards_back));
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_term, ViewKeys.FlashcardsBackTerm.ordinal(), ((Boolean) this.f30198R.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_phrase, ViewKeys.FlashcardsBackPhrase.ordinal(), ((Boolean) this.f30200T.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_meaning, ViewKeys.FlashcardsBackTranslation.ordinal(), ((Boolean) this.f30199S.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_status_bar, ViewKeys.FlashcardsBackStatusBar.ordinal(), ((Boolean) this.f30201U.getValue()).booleanValue(), false));
        return arrayList;
    }

    /* JADX INFO: renamed from: o2 */
    public final ArrayList m10301o2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC7787n.b(R.string.settings_text_flashcards_front));
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_term, ViewKeys.ReverseFlashcardsFrontTerm.ordinal(), ((Boolean) this.f30202V.getValue()).booleanValue(), false));
        AbstractC7787n.d dVar = AbstractC7787n.d.f42747a;
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_phrase, ViewKeys.ReverseFlashcardsFrontPhrase.ordinal(), ((Boolean) this.f30204X.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_meaning, ViewKeys.ReverseFlashcardsFrontTranslation.ordinal(), ((Boolean) this.f30203W.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_status_bar, ViewKeys.ReverseFlashcardsFrontStatusBar.ordinal(), ((Boolean) this.f30205Y.getValue()).booleanValue(), false));
        arrayList.add(new AbstractC7787n.b(R.string.settings_text_flashcards_back));
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_term, ViewKeys.ReverseFlashcardsBackTerm.ordinal(), ((Boolean) this.f30206Z.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_phrase, ViewKeys.ReverseFlashcardsBackPhrase.ordinal(), ((Boolean) this.f30208b0.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_meaning, ViewKeys.ReverseFlashcardsBackTranslation.ordinal(), ((Boolean) this.f30207a0.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards_status_bar, ViewKeys.ReverseFlashcardsBackStatusBar.ordinal(), ((Boolean) this.f30209c0.getValue()).booleanValue(), false));
        return arrayList;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f30216g.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final ArrayList m10302p2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC7787n.n(R.string.settings_cards_per_session, R.string.placeholder, ViewKeys.CardsPerSession.ordinal(), String.valueOf(((Number) this.f30193M.getValue()).intValue()), null, 40));
        AbstractC7787n.d dVar = AbstractC7787n.d.f42747a;
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_shuffle_cards, ViewKeys.ShuffleCards.ordinal(), ((Boolean) this.f30219i.getValue()).booleanValue(), false));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.n(R.string.settings_text_flashcards_settings, R.string.placeholder, ViewKeys.FlashCardsSettings.ordinal(), null, null, 56));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.n(R.string.settings_text_reverse_flashcards_settings, R.string.placeholder, ViewKeys.ReversFlashCardsSettings.ordinal(), null, null, 56));
        arrayList.add(new AbstractC7787n.b(R.string.activities_text_activities));
        if (m10303q2()) {
            arrayList.add(new AbstractC7787n.k(R.string.settings_flashcards, ViewKeys.Flashcards.ordinal(), ((Boolean) this.f30220j.getValue()).booleanValue(), true));
            arrayList.add(dVar);
        }
        if (m10303q2()) {
            arrayList.add(new AbstractC7787n.k(R.string.settings_reverse_flashcards, ViewKeys.ReverseFlashcards.ordinal(), ((Boolean) this.f30221k.getValue()).booleanValue(), true));
        }
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_cloze, ViewKeys.Cloze.ordinal(), ((Boolean) this.f30222l.getValue()).booleanValue(), true));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.settings_multiple_choice, ViewKeys.MultipleChoice.ordinal(), ((Boolean) this.f30188H.getValue()).booleanValue(), true));
        if (m10303q2()) {
            arrayList.add(dVar);
            arrayList.add(new AbstractC7787n.k(R.string.settings_dictation, ViewKeys.Dictation.ordinal(), ((Boolean) this.f30189I.getValue()).booleanValue(), true));
        }
        arrayList.add(new AbstractC7787n.b(R.string.lesson_review_study_sentence));
        arrayList.add(new AbstractC7787n.k(R.string.review_settings_matching, ViewKeys.Matching.ordinal(), ((Boolean) this.f30192L.getValue()).booleanValue(), true));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.review_settings_unscramble, ViewKeys.Unscramble.ordinal(), ((Boolean) this.f30190J.getValue()).booleanValue(), true));
        arrayList.add(dVar);
        arrayList.add(new AbstractC7787n.k(R.string.review_settings_speaking, ViewKeys.Speaking.ordinal(), ((Boolean) this.f30191K.getValue()).booleanValue(), true));
        return arrayList;
    }

    /* JADX INFO: renamed from: q2 */
    public final boolean m10303q2() {
        return C5207g.m11106a(this.f30211d0.getValue(), Boolean.TRUE);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f30216g.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f30216g.mo509w0();
    }
}
