package com.lingq.p055ui;

import ae.C0062b;
import android.graphics.Rect;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.view.AbstractC1036h0;
import ci.InterfaceC2012e;
import ci.InterfaceC2014g;
import ci.InterfaceC2020m;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.billingclient.api.Purchase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.AbstractC3274b;
import com.lingq.commons.controllers.InterfaceC3273a;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.player.PlayingFrom;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.result.ResultErrorUpgrade;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$4;
import com.lingq.shared.storage.Theme;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.util.C4924a;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import jp.C6553u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7122i;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import ni.C7796d;
import ni.C7797e;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p155he.C6041e;
import p183ik.C6343f;
import p225kk.C6715l;
import p244lh.InterfaceC7368e;
import p260m8.C7499b;
import p289o5.C7926f;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p486xh.InterfaceC10189a;
import p490xl.InterfaceC10224c;
import retrofit2.HttpException;
import sh.C9015k;
import sh.InterfaceC9013i;
import sl.C9072e;
import so.AbstractC9107y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, m13365d2 = {"Lcom/lingq/ui/MainViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/ui/tooltips/b;", "Lsh/i;", "Llh/e;", "Lcom/lingq/commons/controllers/a;", "Lxh/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class MainViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC4912b, InterfaceC9013i, InterfaceC7368e, InterfaceC3273a, InterfaceC10189a {

    /* JADX INFO: renamed from: H */
    public final CoroutineDispatcher f22261H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC0113j f22262I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC4912b f22263J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC9013i f22264K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC7368e f22265L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC3273a f22266M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC10189a f22267N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC7116c<Theme> f22268O;

    /* JADX INFO: renamed from: P */
    public String f22269P;

    /* JADX INFO: renamed from: Q */
    public final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 f22270Q;

    /* JADX INFO: renamed from: R */
    public final String f22271R;

    /* JADX INFO: renamed from: S */
    public final String f22272S;

    /* JADX INFO: renamed from: T */
    public final String f22273T;

    /* JADX INFO: renamed from: U */
    public final StateFlowImpl f22274U;

    /* JADX INFO: renamed from: V */
    public final C7135p f22275V;

    /* JADX INFO: renamed from: W */
    public final C7138s f22276W;

    /* JADX INFO: renamed from: X */
    public final C7134o f22277X;

    /* JADX INFO: renamed from: Y */
    public final AbstractChannel f22278Y;

    /* JADX INFO: renamed from: Z */
    public final C7114a f22279Z;

    /* JADX INFO: renamed from: a0 */
    public final AbstractChannel f22280a0;

    /* JADX INFO: renamed from: b0 */
    public final C7114a f22281b0;

    /* JADX INFO: renamed from: c0 */
    public final AbstractChannel f22282c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2020m f22283d;

    /* JADX INFO: renamed from: d0 */
    public final C7114a f22284d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2012e f22285e;

    /* JADX INFO: renamed from: e0 */
    public final StateFlowImpl f22286e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5179a f22287f;

    /* JADX INFO: renamed from: f0 */
    public final C7135p f22288f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5180b f22289g;

    /* JADX INFO: renamed from: g0 */
    public final C7138s f22290g0;

    /* JADX INFO: renamed from: h */
    public final C7797e f22291h;

    /* JADX INFO: renamed from: h0 */
    public final C7134o f22292h0;

    /* JADX INFO: renamed from: i */
    public final C7796d f22293i;

    /* JADX INFO: renamed from: i0 */
    public final StateFlowImpl f22294i0;

    /* JADX INFO: renamed from: j */
    public final C4955q f22295j;

    /* JADX INFO: renamed from: j0 */
    public final StateFlowImpl f22296j0;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2014g f22297k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC7882z f22298l;

    /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$1", m19206f = "MainViewModel.kt", m19207l = {153}, m19208m = "invokeSuspend")
    final class C34261 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public MainViewModel f22299e;

        /* JADX INFO: renamed from: f */
        public int f22300f;

        public C34261(InterfaceC9968c<? super C34261> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return MainViewModel.this.new C34261(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34261) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            MainViewModel mainViewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22300f;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                MainViewModel mainViewModel2 = MainViewModel.this;
                PreferenceStoreImpl$special$$inlined$map$4 preferenceStoreImpl$special$$inlined$map$4Mo9587d0 = mainViewModel2.f22287f.mo9587d0();
                this.f22299e = mainViewModel2;
                this.f22300f = 1;
                Object objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$4Mo9587d0, this);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mainViewModel = mainViewModel2;
                obj = objM14360a;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mainViewModel = this.f22299e;
                C7499b.m14977z0(obj);
            }
            mainViewModel.f22269P = (String) obj;
            return C9072e.f47360a;
        }
    }

    public MainViewModel(InterfaceC2020m interfaceC2020m, InterfaceC2012e interfaceC2012e, InterfaceC5179a interfaceC5179a, InterfaceC5180b interfaceC5180b, C7797e c7797e, C7796d c7796d, C4955q c4955q, InterfaceC2014g interfaceC2014g, LingQDatabase lingQDatabase, InterfaceC7882z interfaceC7882z, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, InterfaceC4912b interfaceC4912b, InterfaceC9013i interfaceC9013i, InterfaceC7368e interfaceC7368e, InterfaceC3273a interfaceC3273a, InterfaceC10189a interfaceC10189a) {
        C5207g.m11111f(interfaceC2020m, "profileRepository");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(c7797e, "utils");
        C5207g.m11111f(c7796d, "analytics");
        C5207g.m11111f(c4955q, "moshi");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(lingQDatabase, "database");
        C5207g.m11111f(interfaceC7882z, "coroutineScope");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(interfaceC9013i, "playerServiceControllerDelegate");
        C5207g.m11111f(interfaceC7368e, "notificationsController");
        C5207g.m11111f(interfaceC3273a, "deepLinkController");
        C5207g.m11111f(interfaceC10189a, "networkUnauthorizedHandlerDelegate");
        this.f22283d = interfaceC2020m;
        this.f22285e = interfaceC2012e;
        this.f22287f = interfaceC5179a;
        this.f22289g = interfaceC5180b;
        this.f22291h = c7797e;
        this.f22293i = c7796d;
        this.f22295j = c4955q;
        this.f22297k = interfaceC2014g;
        this.f22298l = interfaceC7882z;
        this.f22261H = executorC7177a;
        this.f22262I = interfaceC0113j;
        this.f22263J = interfaceC4912b;
        this.f22264K = interfaceC9013i;
        this.f22265L = interfaceC7368e;
        this.f22266M = interfaceC3273a;
        this.f22267N = interfaceC10189a;
        this.f22268O = C0062b.m273H0(interfaceC5179a.mo9585c0());
        this.f22269P = "";
        final C7122i c7122i = new C7122i(interfaceC5179a.mo9587d0());
        this.f22270Q = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new MainViewModel$interfaceLanguage$2(this, null), new InterfaceC7116c<String>() { // from class: com.lingq.ui.MainViewModel$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$special$$inlined$filter$1$2 */
            public static final class C34282<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f22344a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainViewModel f22345b;

                /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$special$$inlined$filter$1$2", m19206f = "MainViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f22346d;

                    /* JADX INFO: renamed from: e */
                    public int f22347e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f22346d = obj;
                        this.f22347e |= Integer.MIN_VALUE;
                        return C34282.this.mo1339r(null, this);
                    }
                }

                public C34282(InterfaceC7117d interfaceC7117d, MainViewModel mainViewModel) {
                    this.f22344a = interfaceC7117d;
                    this.f22345b = mainViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f22347e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f22347e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f22346d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f22347e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!C5207g.m11106a((String) obj, this.f22345b.f22269P)) {
                            anonymousClass1.f22347e = 1;
                            if (this.f22344a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
                Object objMo9539a = c7122i.mo9539a(new C34282(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        });
        this.f22271R = c7797e.m15514g() ? "lqa_001" : "lqa_001_".concat(c7797e.m15510c("language_code"));
        this.f22272S = c7797e.m15514g() ? "lqa_002" : "lqa_002_".concat(c7797e.m15510c("language_code"));
        this.f22273T = c7797e.m15514g() ? "lqa_003" : "lqa_003_".concat(c7797e.m15510c("language_code"));
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f22274U = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f22275V = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f22276W = c7138sM10448a;
        this.f22277X = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f22278Y = abstractChannelM16738m;
        this.f22279Z = C0062b.m287L1(abstractChannelM16738m);
        AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(-1, null, 6);
        this.f22280a0 = abstractChannelM16738m2;
        this.f22281b0 = C0062b.m287L1(abstractChannelM16738m2);
        AbstractChannel abstractChannelM16738m3 = C8573r0.m16738m(-1, null, 6);
        this.f22282c0 = abstractChannelM16738m3;
        this.f22284d0 = C0062b.m287L1(abstractChannelM16738m3);
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(status);
        this.f22286e0 = stateFlowImplM14379a2;
        this.f22288f0 = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f22290g0 = c7138sM10448a2;
        this.f22292h0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f22294i0 = C7120g.m14379a("");
        this.f22296j0 = C7120g.m14379a("");
        C0062b.m353h2(C7120g.m14379a(status), C8573r0.m16767w0(this), startedWhileSubscribed, status);
        C0062b.m341d2(C4924a.m10448a(), C8573r0.m16767w0(this), startedWhileSubscribed);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34261(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e3 A[Catch: Exception -> 0x0106, TryCatch #0 {Exception -> 0x0106, blocks: (B:21:0x0078, B:42:0x00d9, B:44:0x00e3, B:46:0x00e7, B:49:0x0108, B:32:0x009f, B:34:0x00b0, B:35:0x00b5, B:37:0x00bf, B:39:0x00c5, B:52:0x0124), top: B:80:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l2 */
    public static final Object m9717l2(MainViewModel mainViewModel, Purchase purchase, Throwable th2, InterfaceC9968c interfaceC9968c) throws Throwable {
        MainViewModel$handleErrorUpgrade$1 mainViewModel$handleErrorUpgrade$1;
        MainViewModel mainViewModel2;
        Exception exc;
        C9072e c9072e;
        ProfileAccount profileAccount;
        String str;
        AbstractC9107y abstractC9107y;
        AbstractChannel abstractChannel;
        C9072e c9072e2;
        ProfileAccount profileAccount2;
        String str2;
        mainViewModel.getClass();
        if (interfaceC9968c instanceof MainViewModel$handleErrorUpgrade$1) {
            mainViewModel$handleErrorUpgrade$1 = (MainViewModel$handleErrorUpgrade$1) interfaceC9968c;
            int i10 = mainViewModel$handleErrorUpgrade$1.f22321i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mainViewModel$handleErrorUpgrade$1.f22321i = i10 - Integer.MIN_VALUE;
            } else {
                mainViewModel$handleErrorUpgrade$1 = new MainViewModel$handleErrorUpgrade$1(mainViewModel, interfaceC9968c);
            }
        } else {
            mainViewModel$handleErrorUpgrade$1 = new MainViewModel$handleErrorUpgrade$1(mainViewModel, interfaceC9968c);
        }
        Object objM14362c = mainViewModel$handleErrorUpgrade$1.f22319g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (mainViewModel$handleErrorUpgrade$1.f22321i) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7499b.m14977z0(objM14362c);
                    Resource.Status status = Resource.Status.SUCCESS;
                    StateFlowImpl stateFlowImpl = mainViewModel.f22286e0;
                    stateFlowImpl.setValue(status);
                    boolean z10 = th2 instanceof HttpException;
                    C7797e c7797e = mainViewModel.f22291h;
                    if (z10) {
                        C6553u<?> c6553u = ((HttpException) th2).f46513a;
                        String strM17355r = (c6553u == null || (abstractC9107y = c6553u.f37340c) == null) ? null : abstractC9107y.m17355r();
                        if (strM17355r != null) {
                            ResultErrorUpgrade resultErrorUpgrade = (ResultErrorUpgrade) mainViewModel.f22295j.m10563a(ResultErrorUpgrade.class).m10532b(strM17355r);
                            if (resultErrorUpgrade == null) {
                                resultErrorUpgrade = new ResultErrorUpgrade(null, 1, null);
                            }
                            if (C5207g.m11106a(resultErrorUpgrade.f18423a, "Subscription already exists")) {
                                stateFlowImpl.setValue(status);
                                AbstractChannel abstractChannel2 = mainViewModel.f22282c0;
                                mainViewModel$handleErrorUpgrade$1.f22316d = mainViewModel;
                                mainViewModel$handleErrorUpgrade$1.f22317e = purchase;
                                mainViewModel$handleErrorUpgrade$1.f22321i = 3;
                                if (abstractChannel2.mo16480k(purchase, mainViewModel$handleErrorUpgrade$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (!c7797e.m15513f()) {
                                    InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = mainViewModel.mo508t1();
                                    mainViewModel$handleErrorUpgrade$1.f22316d = mainViewModel;
                                    mainViewModel$handleErrorUpgrade$1.f22317e = purchase;
                                    mainViewModel$handleErrorUpgrade$1.f22318f = th2;
                                    mainViewModel$handleErrorUpgrade$1.f22321i = 1;
                                    objM14362c = FlowKt__ReduceKt.m14362c(interfaceC7116cMo508t1, mainViewModel$handleErrorUpgrade$1);
                                    if (objM14362c == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    profileAccount2 = (ProfileAccount) objM14362c;
                                    C6041e c6041eM12476a = C6041e.m12476a();
                                    if (profileAccount2 != null) {
                                        str2 = profileAccount2.f17802b;
                                    } else {
                                        str2 = null;
                                    }
                                    c6041eM12476a.m12477b(new Exception("Failed to upgrade " + str2 + " " + purchase.f10529c.optString("orderId"), th2));
                                }
                                mainViewModel.f22286e0.setValue(Resource.Status.ERROR);
                                abstractChannel = mainViewModel.f22278Y;
                                c9072e2 = C9072e.f47360a;
                                mainViewModel$handleErrorUpgrade$1.f22316d = mainViewModel;
                                mainViewModel$handleErrorUpgrade$1.f22317e = purchase;
                                mainViewModel$handleErrorUpgrade$1.f22318f = null;
                                mainViewModel$handleErrorUpgrade$1.f22321i = 2;
                                if (abstractChannel.mo16480k(c9072e2, mainViewModel$handleErrorUpgrade$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    } else {
                        th2.printStackTrace();
                        if (!c7797e.m15513f()) {
                            InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t2 = mainViewModel.mo508t1();
                            mainViewModel$handleErrorUpgrade$1.f22316d = purchase;
                            mainViewModel$handleErrorUpgrade$1.f22317e = th2;
                            mainViewModel$handleErrorUpgrade$1.f22321i = 6;
                            objM14362c = FlowKt__ReduceKt.m14362c(interfaceC7116cMo508t2, mainViewModel$handleErrorUpgrade$1);
                            if (objM14362c == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ProfileAccount profileAccount3 = (ProfileAccount) objM14362c;
                            C6041e c6041eM12476a2 = C6041e.m12476a();
                            String str3 = profileAccount3 != null ? profileAccount3.f17802b : null;
                            c6041eM12476a2.m12477b(new Exception("Failed to upgrade " + str3 + " " + purchase.f10529c.optString("orderId"), th2));
                        }
                    }
                    return C9072e.f47360a;
                case 1:
                    th2 = mainViewModel$handleErrorUpgrade$1.f22318f;
                    purchase = (Purchase) mainViewModel$handleErrorUpgrade$1.f22317e;
                    mainViewModel = (MainViewModel) mainViewModel$handleErrorUpgrade$1.f22316d;
                    C7499b.m14977z0(objM14362c);
                    profileAccount2 = (ProfileAccount) objM14362c;
                    C6041e c6041eM12476a3 = C6041e.m12476a();
                    if (profileAccount2 != null) {
                        str2 = profileAccount2.f17802b;
                    } else {
                        str2 = null;
                    }
                    c6041eM12476a3.m12477b(new Exception("Failed to upgrade " + str2 + " " + purchase.f10529c.optString("orderId"), th2));
                    mainViewModel.f22286e0.setValue(Resource.Status.ERROR);
                    abstractChannel = mainViewModel.f22278Y;
                    c9072e2 = C9072e.f47360a;
                    mainViewModel$handleErrorUpgrade$1.f22316d = mainViewModel;
                    mainViewModel$handleErrorUpgrade$1.f22317e = purchase;
                    mainViewModel$handleErrorUpgrade$1.f22318f = null;
                    mainViewModel$handleErrorUpgrade$1.f22321i = 2;
                    if (abstractChannel.mo16480k(c9072e2, mainViewModel$handleErrorUpgrade$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return C9072e.f47360a;
                case 2:
                case 3:
                    Purchase purchase2 = (Purchase) mainViewModel$handleErrorUpgrade$1.f22317e;
                    MainViewModel mainViewModel3 = (MainViewModel) mainViewModel$handleErrorUpgrade$1.f22316d;
                    try {
                        C7499b.m14977z0(objM14362c);
                        break;
                    } catch (Exception e10) {
                        purchase = purchase2;
                        exc = e10;
                        mainViewModel2 = mainViewModel3;
                        if (!mainViewModel2.f22291h.m15513f()) {
                            InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t3 = mainViewModel2.mo508t1();
                            mainViewModel$handleErrorUpgrade$1.f22316d = mainViewModel2;
                            mainViewModel$handleErrorUpgrade$1.f22317e = purchase;
                            mainViewModel$handleErrorUpgrade$1.f22318f = exc;
                            mainViewModel$handleErrorUpgrade$1.f22321i = 4;
                            objM14362c = FlowKt__ReduceKt.m14362c(interfaceC7116cMo508t3, mainViewModel$handleErrorUpgrade$1);
                            if (objM14362c == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            profileAccount = (ProfileAccount) objM14362c;
                            C6041e c6041eM12476a4 = C6041e.m12476a();
                            if (profileAccount != null) {
                                str = profileAccount.f17802b;
                            } else {
                                str = null;
                            }
                            c6041eM12476a4.m12477b(new Exception("Failed to upgrade " + str + " " + purchase.f10529c.optString("orderId"), exc));
                        }
                        exc.printStackTrace();
                        mainViewModel2.f22286e0.setValue(Resource.Status.ERROR);
                        c9072e = C9072e.f47360a;
                        mainViewModel$handleErrorUpgrade$1.f22316d = null;
                        mainViewModel$handleErrorUpgrade$1.f22317e = null;
                        mainViewModel$handleErrorUpgrade$1.f22318f = null;
                        mainViewModel$handleErrorUpgrade$1.f22321i = 5;
                        if (mainViewModel2.f22278Y.mo16480k(c9072e, mainViewModel$handleErrorUpgrade$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 4:
                    exc = (Exception) mainViewModel$handleErrorUpgrade$1.f22318f;
                    purchase = (Purchase) mainViewModel$handleErrorUpgrade$1.f22317e;
                    mainViewModel2 = (MainViewModel) mainViewModel$handleErrorUpgrade$1.f22316d;
                    C7499b.m14977z0(objM14362c);
                    profileAccount = (ProfileAccount) objM14362c;
                    C6041e c6041eM12476a5 = C6041e.m12476a();
                    if (profileAccount != null) {
                        str = profileAccount.f17802b;
                    } else {
                        str = null;
                    }
                    c6041eM12476a5.m12477b(new Exception("Failed to upgrade " + str + " " + purchase.f10529c.optString("orderId"), exc));
                    exc.printStackTrace();
                    mainViewModel2.f22286e0.setValue(Resource.Status.ERROR);
                    c9072e = C9072e.f47360a;
                    mainViewModel$handleErrorUpgrade$1.f22316d = null;
                    mainViewModel$handleErrorUpgrade$1.f22317e = null;
                    mainViewModel$handleErrorUpgrade$1.f22318f = null;
                    mainViewModel$handleErrorUpgrade$1.f22321i = 5;
                    if (mainViewModel2.f22278Y.mo16480k(c9072e, mainViewModel$handleErrorUpgrade$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return C9072e.f47360a;
                case 5:
                    C7499b.m14977z0(objM14362c);
                    return C9072e.f47360a;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    th2 = (Throwable) mainViewModel$handleErrorUpgrade$1.f22317e;
                    purchase = (Purchase) mainViewModel$handleErrorUpgrade$1.f22316d;
                    C7499b.m14977z0(objM14362c);
                    ProfileAccount profileAccount4 = (ProfileAccount) objM14362c;
                    C6041e c6041eM12476a6 = C6041e.m12476a();
                    if (profileAccount4 != null) {
                    }
                    c6041eM12476a6.m12477b(new Exception("Failed to upgrade " + str3 + " " + purchase.f10529c.optString("orderId"), th2));
                    return C9072e.f47360a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e11) {
            mainViewModel2 = mainViewModel;
            exc = e11;
        }
    }

    /* JADX INFO: renamed from: m2 */
    public static final LibraryTab m9718m2(MainViewModel mainViewModel, LibraryShelf libraryShelf) {
        Object next;
        mainViewModel.getClass();
        List<LibraryTab> list = libraryShelf.f22049b;
        if (list.size() == 1) {
            return (LibraryTab) C6752c.m13423Q(list);
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!C5207g.m11106a(((LibraryTab) next).f22063d, Boolean.TRUE));
        LibraryTab libraryTab = (LibraryTab) next;
        return libraryTab == null ? (LibraryTab) C6752c.m13423Q(list) : libraryTab;
    }

    /* JADX INFO: renamed from: n2 */
    public static void m9719n2(MainViewModel mainViewModel, String str, String str2, LibraryShelf libraryShelf, LibraryTab libraryTab) {
        C7828f.m15570d(mainViewModel.f22298l, null, null, new MainViewModel$fetchLessonsNetwork$1(mainViewModel, str, libraryShelf, libraryTab, "", str2, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f22262I.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22262I.mo497B0(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: C1 */
    public final InterfaceC7142w<Integer> mo9327C1() {
        return this.f22265L.mo9327C1();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: D0 */
    public final Object mo9328D0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22265L.mo9328D0(i10, interfaceC9968c);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: E */
    public final void mo9720E(PlayingFrom playingFrom) {
        C5207g.m11111f(playingFrom, "playingFrom");
        this.f22264K.mo9720E(playingFrom);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f22262I.mo498E1();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: F0 */
    public final InterfaceC7142w<C9015k> mo9721F0() {
        return this.f22264K.mo9721F0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f22263J.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f22263J.mo9723I(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22262I.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f22263J.mo9724L();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: O */
    public final Object mo9329O(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22265L.mo9329O(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f22262I.mo500P();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: Q0 */
    public final Object mo9330Q0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22265L.mo9330Q0(interfaceC9968c);
    }

    @Override // p486xh.InterfaceC10189a
    /* JADX INFO: renamed from: R0 */
    public final void mo9725R0() {
        this.f22267N.mo9725R0();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: R1 */
    public final InterfaceC7142w<PlayingFrom> mo9726R1() {
        return this.f22264K.mo9726R1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f22263J.mo9727T0();
    }

    @Override // p486xh.InterfaceC10189a
    /* JADX INFO: renamed from: U */
    public final InterfaceC7116c<C9072e> mo9728U() {
        return this.f22267N.mo9728U();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f22263J.mo9729Y1();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: Z */
    public final void mo9317Z(String str, long j10) {
        C5207g.m11111f(str, "url");
        this.f22266M.mo9317Z(str, j10);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: Z0 */
    public final InterfaceC7142w<Pair<Boolean, String>> mo9318Z0() {
        return this.f22266M.mo9318Z0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f22263J.mo9730a1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f22263J.mo9731b0(z10);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: b1 */
    public final void mo9732b1() {
        this.f22264K.mo9732b1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22262I.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f22262I;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22262I.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f22263J.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f22263J.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f22263J.mo9735h();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f22263J.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f22262I.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f22263J.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f22263J.mo9738k1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22262I.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f22262I.mo506l1();
    }

    /* JADX INFO: renamed from: o2 */
    public final void m9739o2() {
        C7828f.m15570d(this.f22298l, null, null, new MainViewModel$initLibrary$1(this, null), 3);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: p */
    public final InterfaceC7116c<C9072e> mo9740p() {
        return this.f22264K.mo9740p();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f22263J.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f22262I.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m9742p2(String str, String str2) {
        C5207g.m11111f(str, "selectedPlan");
        C5207g.m11111f(str2, "offer");
        List list = (List) this.f22274U.getValue();
        C7796d c7796d = this.f22293i;
        C5207g.m11111f(c7796d, "analytics");
        Object obj = null;
        if (list != null && (!list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C5207g.m11106a(((C7926f) it.next()).f43192c, str)) {
                    c7796d.m15505b(null, "checkout_started");
                }
            }
        }
        if (!list.isEmpty()) {
            for (Object obj2 : list) {
                if (C5207g.m11106a(((C7926f) obj2).f43192c, str)) {
                    obj = obj2;
                    break;
                }
            }
            C7926f c7926f = (C7926f) obj;
            if (c7926f != null) {
                this.f22276W.mo14371k(new Triple(c7926f, this.f22296j0.getValue(), str2));
            }
        }
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: q */
    public final void mo9319q(AbstractC3274b abstractC3274b) {
        C5207g.m11111f(abstractC3274b, "destination");
        this.f22266M.mo9319q(abstractC3274b);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f22263J.mo9743r0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f22262I.mo508t1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f22263J.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f22263J.mo9745u0(z10);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f22263J.mo9746v1(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f22262I.mo509w0();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: y1 */
    public final InterfaceC7137r<AbstractC3274b> mo9320y1() {
        return this.f22266M.mo9320y1();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: z1 */
    public final void mo9747z1(int i10, long j10, boolean z10) {
        this.f22264K.mo9747z1(i10, j10, z10);
    }
}
