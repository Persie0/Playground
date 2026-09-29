package com.lingq.p055ui;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.C0141b;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.RunnableC0893g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import ci.InterfaceC2014g;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.billingclient.api.Purchase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.google.android.gms.internal.play_billing.C2933a;
import com.google.android.gms.internal.play_billing.zzu;
import com.google.common.collect.ImmutableList;
import com.lingq.commons.controllers.AbstractC3274b;
import com.lingq.p055ui.imports.ImportData;
import com.lingq.p055ui.onboarding.WebActivity;
import com.lingq.p055ui.tooltips.C4911a;
import com.lingq.p055ui.tooltips.ToolTipsViewManager;
import com.lingq.p055ui.tooltips.TooltipContainer;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.player.PlayerService;
import com.lingq.shared.domain.Login;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.network.requests.Receipt;
import com.lingq.shared.network.requests.RequestPurchase;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$4;
import com.lingq.shared.storage.Theme;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kh.C6686m;
import kh.C6687n;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import mo.C7661i;
import ni.C7796d;
import no.C7828f;
import no.InterfaceC7882z;
import org.json.JSONArray;
import org.json.JSONObject;
import p030b9.RunnableC1342a;
import p040c4.C1688m;
import p040c4.C1689n;
import p076di.InterfaceC5180b;
import p183ik.C6343f;
import p183ik.C6344g;
import p183ik.InterfaceC6338a;
import p183ik.InterfaceC6339b;
import p183ik.InterfaceC6340c;
import p205jk.C6505a;
import p225kk.C6704a;
import p225kk.C6716m;
import p260m8.C7499b;
import p289o5.C7921a;
import p289o5.C7922b;
import p289o5.C7926f;
import p289o5.C7928h;
import p289o5.C7939s;
import p289o5.RunnableC7930j;
import p289o5.ServiceConnectionC7938r;
import p302oi.AbstractActivityC8051b;
import p302oi.C8053d;
import p338qd.C8573r0;
import p385sf.C9000b;
import p402u0.C9370m;
import p427v3.AbstractC9634a;
import p464wl.InterfaceC9968c;
import p471x2.C10057p0;
import p471x2.C10059q0;
import p480xb.InterfaceC10161d;
import p490xl.InterfaceC10224c;
import ph.C8249a;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/MainActivity;", "Landroidx/appcompat/app/c;", "Ljk/a$a;", "<init>", "()V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class MainActivity extends AbstractActivityC8051b implements C6505a.a {

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ int f22168f0 = 0;

    /* JADX INFO: renamed from: Y */
    public C6505a f22171Y;

    /* JADX INFO: renamed from: a0 */
    public InterfaceC5180b f22173a0;

    /* JADX INFO: renamed from: b0 */
    public C6704a f22174b0;

    /* JADX INFO: renamed from: c0 */
    public C7796d f22175c0;

    /* JADX INFO: renamed from: d0 */
    public InterfaceC2014g f22176d0;

    /* JADX INFO: renamed from: e0 */
    public ToolTipsViewManager f22177e0;

    /* JADX INFO: renamed from: W */
    public final C1038i0 f22169W = new C1038i0(C5209i.m11118a(MainViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.MainActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C1046m0 mo807E() {
            C1046m0 c1046m0Mo796n = this.mo796n();
            C5207g.m11110e(c1046m0Mo796n, "viewModelStore");
            return c1046m0Mo796n;
        }
    }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.MainActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C1042k0.b mo807E() {
            C1042k0.b bVarMo470i = this.mo470i();
            C5207g.m11110e(bVarMo470i, "defaultViewModelProviderFactory");
            return bVarMo470i;
        }
    }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.MainActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final AbstractC9634a mo807E() {
            return this.mo792j();
        }
    });

    /* JADX INFO: renamed from: X */
    public final InterfaceC9070c f22170X = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<C8249a>() { // from class: com.lingq.ui.MainActivity$special$$inlined$viewBinding$1
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C8249a mo807E() {
            LayoutInflater layoutInflater = this.getLayoutInflater();
            C5207g.m11110e(layoutInflater, "layoutInflater");
            View viewInflate = layoutInflater.inflate(R.layout.activity_main, (ViewGroup) null, false);
            int i10 = R.id.nav_host_fragment_top;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C0062b.m298P0(viewInflate, R.id.nav_host_fragment_top);
            if (fragmentContainerView != null) {
                i10 = R.id.tooltipContainer;
                TooltipContainer tooltipContainer = (TooltipContainer) C0062b.m298P0(viewInflate, R.id.tooltipContainer);
                if (tooltipContainer != null) {
                    i10 = R.id.tvSwitchLanguage;
                    TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvSwitchLanguage);
                    if (textView != null) {
                        i10 = R.id.viewProgress;
                        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.viewProgress);
                        if (linearLayout != null) {
                            return new C8249a((ConstraintLayout) viewInflate, fragmentContainerView, tooltipContainer, textView, linearLayout);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
        }
    });

    /* JADX INFO: renamed from: Z */
    public String f22172Z = "";

    /* JADX INFO: renamed from: com.lingq.ui.MainActivity$a */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/MainActivity$a;", "", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public interface InterfaceC3420a {
        /* JADX INFO: renamed from: c */
        InterfaceC5180b mo9713c();
    }

    /* JADX INFO: renamed from: com.lingq.ui.MainActivity$b */
    public static final class C3421b implements InterfaceC6338a {
        public C3421b() {
        }

        @Override // p183ik.InterfaceC6338a
        /* JADX INFO: renamed from: a */
        public final void mo9714a(C6343f c6343f) {
            int i10 = MainActivity.f22168f0;
            MainActivity.this.m9708P().mo9723I(c6343f.f36654a);
            c6343f.f36661h.mo807E();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.MainActivity$c */
    public static final class C3422c implements InterfaceC6340c {
        public C3422c() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p183ik.InterfaceC6340c
        /* JADX INFO: renamed from: a */
        public final void mo9715a(TooltipStep tooltipStep) {
            Bundle bundle = new Bundle();
            int i10 = MainActivity.f22168f0;
            MainActivity mainActivity = MainActivity.this;
            bundle.putString("Is Premium", mainActivity.m9708P().mo502f0() ? "yes" : "no");
            bundle.putString("Tooltip step", tooltipStep.name());
            C7796d c7796d = mainActivity.f22175c0;
            if (c7796d == null) {
                C5207g.m11117l("analytics");
                throw null;
            }
            c7796d.m15505b(bundle, "Skip step tutorial");
            mainActivity.m9708P().mo9723I(tooltipStep);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.MainActivity$d */
    public static final class C3423d implements InterfaceC6339b {
        public C3423d() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p183ik.InterfaceC6339b
        /* JADX INFO: renamed from: a */
        public final void mo9716a(TooltipStep tooltipStep) {
            Bundle bundle = new Bundle();
            int i10 = MainActivity.f22168f0;
            MainActivity mainActivity = MainActivity.this;
            bundle.putString("Is Premium", mainActivity.m9708P().mo502f0() ? "yes" : "no");
            bundle.putString("Tooltip step", tooltipStep.name());
            C7796d c7796d = mainActivity.f22175c0;
            if (c7796d == null) {
                C5207g.m11117l("analytics");
                throw null;
            }
            c7796d.m15505b(bundle, "Quit tutorial");
            mainActivity.m9708P().mo9727T0();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$1", m19206f = "MainActivity.kt", m19207l = {104}, m19208m = "invokeSuspend")
    public static final class C34241 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22185e;

        public C34241(InterfaceC9968c<? super C34241> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return MainActivity.this.new C34241(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34241) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22185e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC5180b interfaceC5180bM9707O = MainActivity.this.m9707O();
                String string = UUID.randomUUID().toString();
                C5207g.m11110e(string, "randomUUID().toString()");
                this.f22185e = 1;
                if (interfaceC5180bM9707O.mo9616e(string, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6", m19206f = "MainActivity.kt", m19207l = {182}, m19208m = "invokeSuspend")
    public static final class C34256 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22187e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ MainActivity f22188f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ NavController f22189g;

        /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f22190e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ MainActivity f22191f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ NavController f22192g;

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$1", m19206f = "MainActivity.kt", m19207l = {184}, m19208m = "invokeSuspend")
            public static final class C106051 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22193e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22194f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "Lo5/f;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$1$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106061 extends SuspendLambda implements InterfaceC2056p<Triple<? extends C7926f, ? extends String, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22195e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22196f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106061(MainActivity mainActivity, InterfaceC9968c<? super C106061> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22196f = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106061 c106061 = new C106061(this.f22196f, interfaceC9968c);
                        c106061.f22195e = obj;
                        return c106061;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(Triple<? extends C7926f, ? extends String, ? extends String> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106061) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        Triple triple = (Triple) this.f22195e;
                        C7926f c7926f = (C7926f) triple.f38021a;
                        String str = (String) triple.f38022b;
                        String str2 = (String) triple.f38023c;
                        C6505a c6505a = this.f22196f.f22171Y;
                        if (c6505a == null) {
                            C5207g.m11117l("billingManager");
                            throw null;
                        }
                        C5207g.m11111f(c7926f, "productDetails");
                        C5207g.m11111f(str, "previousPurchaseToken");
                        C5207g.m11111f(str2, "offerTag");
                        RunnableC1342a runnableC1342a = new RunnableC1342a(c7926f, str, c6505a, str2, 1);
                        if (c6505a.f37121d) {
                            runnableC1342a.run();
                        } else {
                            c6505a.m13092b(runnableC1342a);
                        }
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C106051(MainActivity mainActivity, InterfaceC9968c<? super C106051> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22194f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new C106051(this.f22194f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((C106051) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22193e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22194f;
                        MainViewModel mainViewModelM9708P = mainActivity.m9708P();
                        C106061 c106061 = new C106061(mainActivity, null);
                        this.f22193e = 1;
                        if (C0062b.m369m0(mainViewModelM9708P.f22277X, c106061, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$10, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$10", m19206f = "MainActivity.kt", m19207l = {246}, m19208m = "invokeSuspend")
            public static final class AnonymousClass10 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22197e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22198f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$10$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$10$1", m19206f = "MainActivity.kt", m19207l = {248}, m19208m = "invokeSuspend")
                public static final class C106071 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public int f22199e;

                    /* JADX INFO: renamed from: f */
                    public /* synthetic */ Object f22200f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ MainActivity f22201g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106071(MainActivity mainActivity, InterfaceC9968c<? super C106071> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22201g = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106071 c106071 = new C106071(this.f22201g, interfaceC9968c);
                        c106071.f22200f = obj;
                        return c106071;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106071) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f22199e;
                        if (i10 == 0) {
                            C7499b.m14977z0(obj);
                            if (((String) this.f22200f).length() == 0) {
                                InterfaceC5180b interfaceC5180bM9707O = this.f22201g.m9707O();
                                String string = UUID.randomUUID().toString();
                                C5207g.m11110e(string, "randomUUID().toString()");
                                this.f22199e = 1;
                                if (interfaceC5180bM9707O.mo9616e(string, this) == coroutineSingletons) {
                                    return coroutineSingletons;
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass10(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass10> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22198f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass10(this.f22198f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass10) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22197e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        MainActivity mainActivity = this.f22198f;
                        ProfileStoreImpl$special$$inlined$map$4 profileStoreImpl$special$$inlined$map$4Mo9623l = mainActivity.m9707O().mo9623l();
                        C106071 c106071 = new C106071(mainActivity, null);
                        this.f22197e = 1;
                        if (C0062b.m369m0(profileStoreImpl$special$$inlined$map$4Mo9623l, c106071, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$11, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$11", m19206f = "MainActivity.kt", m19207l = {254}, m19208m = "invokeSuspend")
            public static final class AnonymousClass11 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22202e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22203f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$11$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/android/billingclient/api/Purchase;", "purchase", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$11$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106081 extends SuspendLambda implements InterfaceC2056p<Purchase, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22204e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22205f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106081(MainActivity mainActivity, InterfaceC9968c<? super C106081> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22205f = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106081 c106081 = new C106081(this.f22205f, interfaceC9968c);
                        c106081.f22204e = obj;
                        return c106081;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(Purchase purchase, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106081) mo1336a(purchase, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
                    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        Purchase purchase = (Purchase) this.f22204e;
                        C6505a c6505a = this.f22205f.f22171Y;
                        if (c6505a == null) {
                            C5207g.m11117l("billingManager");
                            throw null;
                        }
                        C5207g.m11111f(purchase, "purchase");
                        JSONObject jSONObject = purchase.f10529c;
                        if ((jSONObject.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2) == 1 && !jSONObject.optBoolean("acknowledged", true)) {
                            String strM6225a = purchase.m6225a();
                            if (strM6225a == null) {
                                throw new IllegalArgumentException("Purchase token must be set");
                            }
                            final C7921a c7921a = new C7921a();
                            c7921a.f43151a = strM6225a;
                            final C9370m c9370m = new C9370m(20, purchase);
                            final C7922b c7922b = c6505a.f37120c;
                            if (!c7922b.m15738k0()) {
                                c9370m.m17742d(C7939s.f43250j);
                            } else if (TextUtils.isEmpty(c7921a.f43151a)) {
                                C2933a.m8515g("BillingClient", "Please provide a valid purchase token.");
                                c9370m.m17742d(C7939s.f43247g);
                            } else if (!c7922b.f43168k) {
                                c9370m.m17742d(C7939s.f43242b);
                            } else if (c7922b.m15742o0(new Callable() { // from class: o5.i
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    C7922b c7922b2 = c7922b;
                                    C7921a c7921a2 = c7921a;
                                    C9370m c9370m2 = c9370m;
                                    c7922b2.getClass();
                                    try {
                                        InterfaceC10161d interfaceC10161d = c7922b2.f43163f;
                                        String packageName = c7922b2.f43162e.getPackageName();
                                        String str = c7921a2.f43151a;
                                        String str2 = c7922b2.f43159b;
                                        int i10 = C2933a.f14568a;
                                        Bundle bundle = new Bundle();
                                        bundle.putString("playBillingLibraryVersion", str2);
                                        Bundle bundleMo19178x = interfaceC10161d.mo19178x(packageName, str, bundle);
                                        int iM8509a = C2933a.m8509a(bundleMo19178x, "BillingClient");
                                        String strM8512d = C2933a.m8512d(bundleMo19178x, "BillingClient");
                                        C7925e c7925e = new C7925e();
                                        c7925e.f43186a = iM8509a;
                                        c7925e.f43187b = strM8512d;
                                        c9370m2.m17742d(c7925e);
                                    } catch (Exception e10) {
                                        C2933a.m8516h("BillingClient", "Error acknowledge purchase!", e10);
                                        c9370m2.m17742d(C7939s.f43250j);
                                    }
                                    return null;
                                }
                            }, 30000L, new RunnableC7930j(0, c9370m), c7922b.m15739l0()) == null) {
                                c9370m.m17742d(c7922b.m15741n0());
                            }
                        }
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass11(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass11> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22203f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass11(this.f22203f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass11) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22202e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22203f;
                        MainViewModel mainViewModelM9708P = mainActivity.m9708P();
                        C106081 c106081 = new C106081(mainActivity, null);
                        this.f22202e = 1;
                        if (C0062b.m369m0(mainViewModelM9708P.f22284d0, c106081, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$12, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$12", m19206f = "MainActivity.kt", m19207l = {260}, m19208m = "invokeSuspend")
            public static final class AnonymousClass12 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22206e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22207f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$12$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$12$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106091 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ MainActivity f22208e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106091(MainActivity mainActivity, InterfaceC9968c<? super C106091> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22208e = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        return new C106091(this.f22208e, interfaceC9968c);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106091) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        MainActivity mainActivity = this.f22208e;
                        mainActivity.startForegroundService(new Intent(mainActivity, (Class<?>) PlayerService.class));
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass12(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass12> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22207f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass12(this.f22207f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass12) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22206e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22207f;
                        InterfaceC7116c<C9072e> interfaceC7116cMo9740p = mainActivity.m9708P().mo9740p();
                        C106091 c106091 = new C106091(mainActivity, null);
                        this.f22206e = 1;
                        if (C0062b.m369m0(interfaceC7116cMo9740p, c106091, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$13, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$13", m19206f = "MainActivity.kt", m19207l = {270}, m19208m = "invokeSuspend")
            public static final class AnonymousClass13 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22209e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22210f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ NavController f22211g;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$13$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/commons/controllers/b;", "deepLink", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$13$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106101 extends SuspendLambda implements InterfaceC2056p<AbstractC3274b, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22212e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ NavController f22213f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ MainActivity f22214g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106101(NavController navController, MainActivity mainActivity, InterfaceC9968c<? super C106101> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22213f = navController;
                        this.f22214g = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106101 c106101 = new C106101(this.f22213f, this.f22214g, interfaceC9968c);
                        c106101.f22212e = obj;
                        return c106101;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(AbstractC3274b abstractC3274b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106101) mo1336a(abstractC3274b, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        AbstractC3274b abstractC3274b = (AbstractC3274b) this.f22212e;
                        boolean z10 = abstractC3274b instanceof AbstractC3274b.i;
                        NavController navController = this.f22213f;
                        if (z10) {
                            navController.m3993n(((AbstractC3274b.i) abstractC3274b).f16693a);
                        } else if (abstractC3274b instanceof AbstractC3274b.b) {
                            navController.m3993n(((AbstractC3274b.b) abstractC3274b).f16683a);
                        } else if (abstractC3274b instanceof AbstractC3274b.a) {
                            navController.m3993n(((AbstractC3274b.a) abstractC3274b).f16682a);
                        } else {
                            boolean z11 = abstractC3274b instanceof AbstractC3274b.j;
                            MainActivity mainActivity = this.f22214g;
                            if (z11) {
                                C6704a c6704a = mainActivity.f22174b0;
                                if (c6704a == null) {
                                    C5207g.m11117l("appSettings");
                                    throw null;
                                }
                                c6704a.m13308j(((AbstractC3274b.j) abstractC3274b).f16694a);
                                C5207g.m11111f(navController, "<this>");
                                NavDestination navDestinationM3986g = navController.m3986g();
                                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToSignIn) != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("authCode", "");
                                    navController.m3992m(R.id.actionToSignIn, bundle, null);
                                }
                            } else if (abstractC3274b instanceof AbstractC3274b.q) {
                                String str = ((AbstractC3274b.q) abstractC3274b).f16703a;
                                C5207g.m11111f(str, "offer");
                                C5207g.m11111f(navController, "<this>");
                                NavDestination navDestinationM3986g2 = navController.m3986g();
                                if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToUpgrade) != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("attemptedAction", "Campaign");
                                    bundle2.putString("offer", str);
                                    navController.m3992m(R.id.actionToUpgrade, bundle2, null);
                                }
                            } else if (abstractC3274b instanceof AbstractC3274b.p) {
                                String str2 = ((AbstractC3274b.p) abstractC3274b).f16702a;
                                int i10 = MainActivity.f22168f0;
                                mainActivity.getClass();
                                Intent intent = new Intent(mainActivity, (Class<?>) WebActivity.class);
                                intent.putExtra("url", str2);
                                mainActivity.startActivity(intent);
                            } else if (abstractC3274b instanceof AbstractC3274b.k) {
                                navController.m3990k(mainActivity.getIntent());
                            }
                        }
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass13(NavController navController, MainActivity mainActivity, InterfaceC9968c interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22210f = mainActivity;
                    this.f22211g = navController;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass13(this.f22211g, this.f22210f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass13) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22209e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22210f;
                        InterfaceC7137r<AbstractC3274b> interfaceC7137rMo9320y1 = mainActivity.m9708P().mo9320y1();
                        C106101 c106101 = new C106101(this.f22211g, mainActivity, null);
                        this.f22209e = 1;
                        if (C0062b.m369m0(interfaceC7137rMo9320y1, c106101, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$14, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$14", m19206f = "MainActivity.kt", m19207l = {299}, m19208m = "invokeSuspend")
            public static final class AnonymousClass14 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22215e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22216f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$14$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$14$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106111 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Boolean, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22217e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22218f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106111(MainActivity mainActivity, InterfaceC9968c<? super C106111> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22218f = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106111 c106111 = new C106111(this.f22218f, interfaceC9968c);
                        c106111.f22217e = obj;
                        return c106111;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(Pair<? extends Boolean, ? extends String> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106111) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        String strM613i;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        Pair pair = (Pair) this.f22217e;
                        boolean zBooleanValue = ((Boolean) pair.f38012a).booleanValue();
                        String str = (String) pair.f38013b;
                        MainActivity mainActivity = this.f22218f;
                        if (zBooleanValue) {
                            int i10 = MainActivity.f22168f0;
                            LinearLayout linearLayout = mainActivity.m9706N().f44547e;
                            C5207g.m11110e(linearLayout, "binding.viewProgress");
                            C4924a.m10457e0(linearLayout);
                            TextView textView = mainActivity.m9706N().f44546d;
                            if (!C7661i.m15250P2(str)) {
                                Locale locale = Locale.getDefault();
                                String string = mainActivity.getString(R.string.deep_link_language_switching);
                                C5207g.m11110e(string, "getString(R.string.deep_link_language_switching)");
                                strM613i = C0141b.m613i(new Object[]{C4924a.m10439R(mainActivity, str)}, 1, locale, string, "format(locale, format, *args)");
                            } else {
                                strM613i = "";
                            }
                            textView.setText(strM613i);
                        } else {
                            int i11 = MainActivity.f22168f0;
                            LinearLayout linearLayout2 = mainActivity.m9706N().f44547e;
                            C5207g.m11110e(linearLayout2, "binding.viewProgress");
                            C4924a.m10442U(linearLayout2);
                        }
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass14(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass14> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22216f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass14(this.f22216f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass14) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22215e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22216f;
                        InterfaceC7142w<Pair<Boolean, String>> interfaceC7142wMo9318Z0 = mainActivity.m9708P().mo9318Z0();
                        C106111 c106111 = new C106111(mainActivity, null);
                        this.f22215e = 1;
                        if (C0062b.m369m0(interfaceC7142wMo9318Z0, c106111, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$15, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$15", m19206f = "MainActivity.kt", m19207l = {318}, m19208m = "invokeSuspend")
            public static final class AnonymousClass15 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22219e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22220f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ NavController f22221g;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$15$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$15$1", m19206f = "MainActivity.kt", m19207l = {319}, m19208m = "invokeSuspend")
                public static final class C106121 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public int f22222e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22223f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ NavController f22224g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106121(NavController navController, MainActivity mainActivity, InterfaceC9968c interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22223f = mainActivity;
                        this.f22224g = navController;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        return new C106121(this.f22224g, this.f22223f, interfaceC9968c);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106121) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f22222e;
                        if (i10 == 0) {
                            C7499b.m14977z0(obj);
                            InterfaceC5180b interfaceC5180bM9707O = this.f22223f.m9707O();
                            this.f22222e = 1;
                            if (interfaceC5180bM9707O.mo9617f(this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7499b.m14977z0(obj);
                        }
                        C4924a.m10447Z(this.f22224g, new C6686m(null, ""));
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass15(NavController navController, MainActivity mainActivity, InterfaceC9968c interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22220f = mainActivity;
                    this.f22221g = navController;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass15(this.f22221g, this.f22220f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass15) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22219e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22220f;
                        InterfaceC7116c<C9072e> interfaceC7116cMo9728U = mainActivity.m9708P().mo9728U();
                        C106121 c106121 = new C106121(this.f22221g, mainActivity, null);
                        this.f22219e = 1;
                        if (C0062b.m369m0(interfaceC7116cMo9728U, c106121, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$2, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$2", m19206f = "MainActivity.kt", m19207l = {190}, m19208m = "invokeSuspend")
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22225e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22226f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$2$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lik/f;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$2$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106131 extends SuspendLambda implements InterfaceC2056p<C6343f, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22227e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22228f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106131(MainActivity mainActivity, InterfaceC9968c<? super C106131> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22228f = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106131 c106131 = new C106131(this.f22228f, interfaceC9968c);
                        c106131.f22227e = obj;
                        return c106131;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(C6343f c6343f, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106131) mo1336a(c6343f, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        C6343f c6343f = (C6343f) this.f22227e;
                        ToolTipsViewManager toolTipsViewManager = this.f22228f.f22177e0;
                        if (toolTipsViewManager != null) {
                            toolTipsViewManager.m10402d(c6343f);
                            return C9072e.f47360a;
                        }
                        C5207g.m11117l("toolTipsViewManager");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22226f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass2(this.f22226f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22225e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22226f;
                        InterfaceC7116c<C6343f> interfaceC7116cMo9744u = mainActivity.m9708P().mo9744u();
                        C106131 c106131 = new C106131(mainActivity, null);
                        this.f22225e = 1;
                        if (C0062b.m369m0(interfaceC7116cMo9744u, c106131, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$3, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$3", m19206f = "MainActivity.kt", m19207l = {198}, m19208m = "invokeSuspend")
            public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22229e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22230f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$3$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/tooltips/TooltipStep;", "step", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$3$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106141 extends SuspendLambda implements InterfaceC2056p<TooltipStep, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22231e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22232f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106141(MainActivity mainActivity, InterfaceC9968c<? super C106141> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22232f = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106141 c106141 = new C106141(this.f22232f, interfaceC9968c);
                        c106141.f22231e = obj;
                        return c106141;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(TooltipStep tooltipStep, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106141) mo1336a(tooltipStep, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        TooltipStep tooltipStep = (TooltipStep) this.f22231e;
                        ToolTipsViewManager toolTipsViewManager = this.f22232f.f22177e0;
                        if (toolTipsViewManager != null) {
                            toolTipsViewManager.m10401c(tooltipStep);
                            return C9072e.f47360a;
                        }
                        C5207g.m11117l("toolTipsViewManager");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass3> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22230f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass3(this.f22230f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22229e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22230f;
                        InterfaceC7116c<TooltipStep> interfaceC7116cMo9743r0 = mainActivity.m9708P().mo9743r0();
                        C106141 c106141 = new C106141(mainActivity, null);
                        this.f22229e = 1;
                        if (C0062b.m369m0(interfaceC7116cMo9743r0, c106141, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$4, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$4", m19206f = "MainActivity.kt", m19207l = {204}, m19208m = "invokeSuspend")
            public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22233e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22234f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$4$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$4$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106151 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ MainActivity f22235e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106151(MainActivity mainActivity, InterfaceC9968c<? super C106151> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22235e = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        return new C106151(this.f22235e, interfaceC9968c);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106151) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        ToolTipsViewManager toolTipsViewManager = this.f22235e.f22177e0;
                        if (toolTipsViewManager != null) {
                            toolTipsViewManager.m10399a();
                            return C9072e.f47360a;
                        }
                        C5207g.m11117l("toolTipsViewManager");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass4> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22234f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass4(this.f22234f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22233e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22234f;
                        InterfaceC7116c<C9072e> interfaceC7116cMo9738k1 = mainActivity.m9708P().mo9738k1();
                        C106151 c106151 = new C106151(mainActivity, null);
                        this.f22233e = 1;
                        if (C0062b.m369m0(interfaceC7116cMo9738k1, c106151, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$5, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$5", m19206f = "MainActivity.kt", m19207l = {210}, m19208m = "invokeSuspend")
            public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22236e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22237f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$5$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/tooltips/TooltipStep;", "steps", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$5$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106161 extends SuspendLambda implements InterfaceC2056p<List<? extends TooltipStep>, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22238e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22239f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106161(MainActivity mainActivity, InterfaceC9968c<? super C106161> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22239f = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106161 c106161 = new C106161(this.f22239f, interfaceC9968c);
                        c106161.f22238e = obj;
                        return c106161;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(List<? extends TooltipStep> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106161) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        for (TooltipStep tooltipStep : (List) this.f22238e) {
                            ToolTipsViewManager toolTipsViewManager = this.f22239f.f22177e0;
                            if (toolTipsViewManager == null) {
                                C5207g.m11117l("toolTipsViewManager");
                                throw null;
                            }
                            toolTipsViewManager.m10401c(tooltipStep);
                        }
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass5> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22237f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass5(this.f22237f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22236e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22237f;
                        InterfaceC7116c<List<TooltipStep>> interfaceC7116cMo9733g0 = mainActivity.m9708P().mo9733g0();
                        C106161 c106161 = new C106161(mainActivity, null);
                        this.f22236e = 1;
                        if (C0062b.m369m0(interfaceC7116cMo9733g0, c106161, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$6, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$6", m19206f = "MainActivity.kt", m19207l = {218}, m19208m = "invokeSuspend")
            public static final class AnonymousClass6 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22240e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22241f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$6$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/tooltips/TooltipStep;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$6$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106171 extends SuspendLambda implements InterfaceC2056p<TooltipStep, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22242e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22243f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106171(MainActivity mainActivity, InterfaceC9968c<? super C106171> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22243f = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106171 c106171 = new C106171(this.f22243f, interfaceC9968c);
                        c106171.f22242e = obj;
                        return c106171;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(TooltipStep tooltipStep, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106171) mo1336a(tooltipStep, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        TooltipStep tooltipStep = (TooltipStep) this.f22242e;
                        MainActivity mainActivity = this.f22243f;
                        ToolTipsViewManager toolTipsViewManager = mainActivity.f22177e0;
                        Object obj2 = null;
                        if (toolTipsViewManager == null) {
                            C5207g.m11117l("toolTipsViewManager");
                            throw null;
                        }
                        C5207g.m11111f(tooltipStep, "tooltipStep");
                        C4911a c4911a = toolTipsViewManager.f31916h.get(tooltipStep);
                        boolean z10 = true;
                        if (c4911a != null) {
                            if (!(c4911a.getVisibility() == 0)) {
                                for (Object obj3 : toolTipsViewManager.f31917i) {
                                    if (((C6343f) obj3).f36654a == tooltipStep) {
                                        obj2 = obj3;
                                        break;
                                    }
                                }
                                if (obj2 == null) {
                                    z10 = toolTipsViewManager.f31918j.get(tooltipStep) != null;
                                }
                            }
                        } else if (toolTipsViewManager.f31918j.get(tooltipStep) != null) {
                        }
                        if (z10) {
                            mainActivity.m9708P().mo9723I(tooltipStep);
                        }
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass6> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22241f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass6(this.f22241f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass6) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22240e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22241f;
                        InterfaceC7116c<TooltipStep> interfaceC7116cMo9737k0 = mainActivity.m9708P().mo9737k0();
                        C106171 c106171 = new C106171(mainActivity, null);
                        this.f22240e = 1;
                        if (C0062b.m369m0(interfaceC7116cMo9737k0, c106171, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$7, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$7", m19206f = "MainActivity.kt", m19207l = {226}, m19208m = "invokeSuspend")
            public static final class AnonymousClass7 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22244e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22245f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$7$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/storage/Theme;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$7$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106181 extends SuspendLambda implements InterfaceC2056p<Theme, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22246e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22247f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106181(MainActivity mainActivity, InterfaceC9968c<? super C106181> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22247f = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106181 c106181 = new C106181(this.f22247f, interfaceC9968c);
                        c106181.f22246e = obj;
                        return c106181;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(Theme theme, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106181) mo1336a(theme, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        Theme theme = (Theme) this.f22246e;
                        MainActivity mainActivity = this.f22247f;
                        C5207g.m11111f(mainActivity, "<this>");
                        C5207g.m11111f(theme, "theme");
                        int i10 = C4924a.a.f32101p[theme.ordinal()];
                        if (i10 == 1) {
                            mainActivity.m879M().mo11348x(1);
                        } else if (i10 == 2) {
                            mainActivity.m879M().mo11348x(2);
                        } else if (i10 == 3) {
                            mainActivity.m879M().mo11348x(-1);
                        }
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass7> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22245f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass7(this.f22245f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass7) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22244e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22245f;
                        InterfaceC7116c<Theme> interfaceC7116c = mainActivity.m9708P().f22268O;
                        C106181 c106181 = new C106181(mainActivity, null);
                        this.f22244e = 1;
                        if (C0062b.m369m0(interfaceC7116c, c106181, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$8, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$8", m19206f = "MainActivity.kt", m19207l = {232}, m19208m = "invokeSuspend")
            public static final class AnonymousClass8 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22248e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22249f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$8$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$8$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106191 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ MainActivity f22250e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106191(MainActivity mainActivity, InterfaceC9968c<? super C106191> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22250e = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        return new C106191(this.f22250e, interfaceC9968c);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106191) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        this.f22250e.recreate();
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass8(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass8> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22249f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass8(this.f22249f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass8) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22248e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22249f;
                        MainViewModel mainViewModelM9708P = mainActivity.m9708P();
                        C106191 c106191 = new C106191(mainActivity, null);
                        this.f22248e = 1;
                        if (C0062b.m369m0(mainViewModelM9708P.f22270Q, c106191, this) == coroutineSingletons) {
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

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$9, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$9", m19206f = "MainActivity.kt", m19207l = {238}, m19208m = "invokeSuspend")
            public static final class AnonymousClass9 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f22251e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MainActivity f22252f;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$9$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Profile;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.MainActivity$onCreate$6$1$9$1", m19206f = "MainActivity.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class C106201 extends SuspendLambda implements InterfaceC2056p<Profile, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public /* synthetic */ Object f22253e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ MainActivity f22254f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C106201(MainActivity mainActivity, InterfaceC9968c<? super C106201> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f22254f = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        C106201 c106201 = new C106201(this.f22254f, interfaceC9968c);
                        c106201.f22253e = obj;
                        return c106201;
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((C106201) mo1336a(profile, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        if (((Profile) this.f22253e).f17781a != 0) {
                            int i10 = MainActivity.f22168f0;
                            MainActivity mainActivity = this.f22254f;
                            FragmentContainerView fragmentContainerView = mainActivity.m9706N().f44544b;
                            List<Integer> list = C6716m.f37937a;
                            fragmentContainerView.setBackgroundColor(C6716m.m13333r(R.attr.backgroundGeneral, mainActivity));
                        }
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass9(MainActivity mainActivity, InterfaceC9968c<? super AnonymousClass9> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f22252f = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass9(this.f22252f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass9) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f22251e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        int i11 = MainActivity.f22168f0;
                        MainActivity mainActivity = this.f22252f;
                        InterfaceC7116c<Profile> interfaceC7116cMo504j1 = mainActivity.m9708P().mo504j1();
                        C106201 c106201 = new C106201(mainActivity, null);
                        this.f22251e = 1;
                        if (C0062b.m369m0(interfaceC7116cMo504j1, c106201, this) == coroutineSingletons) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NavController navController, MainActivity mainActivity, InterfaceC9968c interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22191f = mainActivity;
                this.f22192g = navController;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22192g, this.f22191f, interfaceC9968c);
                anonymousClass1.f22190e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f22190e;
                MainActivity mainActivity = this.f22191f;
                C7828f.m15570d(interfaceC7882z, null, null, new C106051(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass2(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass3(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass4(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass5(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass6(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass7(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass8(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass9(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass10(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass11(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass12(mainActivity, null), 3);
                NavController navController = this.f22192g;
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass13(navController, mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass14(mainActivity, null), 3);
                C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass15(navController, mainActivity, null), 3);
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34256(NavController navController, MainActivity mainActivity, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22188f = mainActivity;
            this.f22189g = navController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C34256(this.f22189g, this.f22188f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34256) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22187e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                MainActivity mainActivity = this.f22188f;
                C1052r c1052r = mainActivity.f440d;
                C5207g.m11110e(c1052r, "lifecycle");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22189g, mainActivity, null);
                this.f22187e = 1;
                if (RepeatOnLifecycleKt.m3906b(c1052r, state, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: N */
    public final C8249a m9706N() {
        return (C8249a) this.f22170X.getValue();
    }

    /* JADX INFO: renamed from: O */
    public final InterfaceC5180b m9707O() {
        InterfaceC5180b interfaceC5180b = this.f22173a0;
        if (interfaceC5180b != null) {
            return interfaceC5180b;
        }
        C5207g.m11117l("profileStore");
        throw null;
    }

    /* JADX INFO: renamed from: P */
    public final MainViewModel m9708P() {
        return (MainViewModel) this.f22169W.getValue();
    }

    /* JADX INFO: renamed from: Q */
    public final void m9709Q(String str, NavController navController, boolean z10) {
        C5207g.m11111f(str, "intentData");
        C5207g.m11111f(navController, "navController");
        String str2 = ((Login) C7828f.m15572f(EmptyCoroutineContext.f38093a, new MainActivity$handleDeeplink$loginData$1(this, null))).f17773b;
        boolean z11 = true;
        if (!(str2 == null || str2.length() == 0)) {
            NavDestination navDestinationM3986g = navController.m3986g();
            if (navDestinationM3986g == null || navDestinationM3986g.f6834h != R.id.fragment_home) {
                z11 = false;
            }
            if (!z11) {
                this.f22172Z = str;
                navController.m3996q(R.id.fragment_home, false);
                return;
            }
        }
        m9708P().mo9317Z(str, z10 ? 1000L : 0L);
    }

    @Override // androidx.appcompat.app.ActivityC0216c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Locale locale;
        ContextWrapper contextWrapper;
        List listM13448p0;
        Collection collectionM13448p0;
        C5207g.m11111f(context, "newBase");
        String str = (String) C7828f.m15572f(EmptyCoroutineContext.f38093a, new MainActivity$attachBaseContext$language$1(null));
        if (!(!C7661i.m15250P2(str))) {
            super.attachBaseContext(context);
            return;
        }
        if (C5207g.m11106a(str, "")) {
            contextWrapper = new ContextWrapper(context);
        } else {
            if (C7076b.m14278X2(str, "_", false)) {
                List listM14299s3 = C7076b.m14299s3(str, new String[]{"_"}, 0, 6);
                if (!listM14299s3.isEmpty()) {
                    ListIterator listIterator = listM14299s3.listIterator(listM14299s3.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listM13448p0 = EmptyList.f38032a;
                            break;
                        } else {
                            if (!(((String) listIterator.previous()).length() == 0)) {
                                listM13448p0 = C6752c.m13448p0(listM14299s3, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                } else {
                    listM13448p0 = EmptyList.f38032a;
                    break;
                }
                String str2 = ((String[]) listM13448p0.toArray(new String[0]))[0];
                List listM14299s4 = C7076b.m14299s3(str, new String[]{"_"}, 0, 6);
                if (!listM14299s4.isEmpty()) {
                    ListIterator listIterator2 = listM14299s4.listIterator(listM14299s4.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            collectionM13448p0 = EmptyList.f38032a;
                            break;
                        } else {
                            if (!(((String) listIterator2.previous()).length() == 0)) {
                                collectionM13448p0 = C6752c.m13448p0(listM14299s4, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                } else {
                    collectionM13448p0 = EmptyList.f38032a;
                    break;
                }
                locale = new Locale(str2, ((String[]) collectionM13448p0.toArray(new String[0]))[1]);
            } else {
                locale = new Locale(str);
            }
            Locale.setDefault(locale);
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            contextWrapper = new ContextWrapper(context.createConfigurationContext(configuration));
        }
        super.attachBaseContext(contextWrapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p205jk.C6505a.a
    /* JADX INFO: renamed from: h */
    public final void mo9710h() throws Throwable {
        C7928h.a aVar = new C7928h.a();
        C7928h.b.a aVar2 = new C7928h.b.a();
        aVar2.f43210a = m9708P().f22271R;
        aVar2.f43211b = "subs";
        C7928h.b bVarM15747a = aVar2.m15747a();
        C7928h.b.a aVar3 = new C7928h.b.a();
        aVar3.f43210a = m9708P().f22272S;
        aVar3.f43211b = "subs";
        C7928h.b bVarM15747a2 = aVar3.m15747a();
        C7928h.b.a aVar4 = new C7928h.b.a();
        aVar4.f43210a = m9708P().f22273T;
        aVar4.f43211b = "subs";
        ImmutableList immutableListM9059G = ImmutableList.m9059G(bVarM15747a, bVarM15747a2, aVar4.m15747a());
        if (immutableListM9059G == null || immutableListM9059G.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        ImmutableList.C3147b c3147bListIterator = immutableListM9059G.listIterator(0);
        while (c3147bListIterator.hasNext()) {
            C7928h.b bVar = (C7928h.b) c3147bListIterator.next();
            if (!"play_pass_subs".equals(bVar.f43209b)) {
                hashSet.add(bVar.f43209b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        aVar.f43207a = zzu.m8527G(immutableListM9059G);
        C7928h c7928h = new C7928h(aVar);
        C6505a c6505a = this.f22171Y;
        if (c6505a == null) {
            C5207g.m11117l("billingManager");
            throw null;
        }
        RunnableC0893g runnableC0893g = new RunnableC0893g(5, c6505a, c7928h, new InterfaceC2052l<List<? extends C7926f>, C9072e>() { // from class: com.lingq.ui.MainActivity$addProductDetails$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(List<? extends C7926f> list) {
                List<? extends C7926f> list2 = list;
                C5207g.m11111f(list2, "productDetails");
                int i10 = MainActivity.f22168f0;
                this.f22178b.m9708P().f22274U.setValue(list2);
                return C9072e.f47360a;
            }
        });
        if (c6505a.f37121d) {
            runnableC0893g.run();
        } else {
            c6505a.m13092b(runnableC0893g);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!m9708P().mo9741p0(TooltipStep.Finished)) {
            ToolTipsViewManager toolTipsViewManager = this.f22177e0;
            if (toolTipsViewManager == null) {
                C5207g.m11117l("toolTipsViewManager");
                throw null;
            }
            C6344g c6344g = toolTipsViewManager.f31919k;
            boolean z10 = false;
            if (c6344g != null) {
                if (c6344g.getVisibility() == 0) {
                    C6344g c6344g2 = toolTipsViewManager.f31919k;
                    C5207g.m11108c(c6344g2);
                    if (toolTipsViewManager.f31912d.indexOfChild(c6344g2) != -1) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                ToolTipsViewManager toolTipsViewManager2 = this.f22177e0;
                if (toolTipsViewManager2 == null) {
                    C5207g.m11117l("toolTipsViewManager");
                    throw null;
                }
                C6704a c6704a = this.f22174b0;
                if (c6704a != null) {
                    toolTipsViewManager2.m10400b(c6704a.m13300b());
                    return;
                } else {
                    C5207g.m11117l("appSettings");
                    throw null;
                }
            }
        }
        ToolTipsViewManager toolTipsViewManager3 = this.f22177e0;
        if (toolTipsViewManager3 == null) {
            C5207g.m11117l("toolTipsViewManager");
            throw null;
        }
        toolTipsViewManager3.m10399a();
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, p232l2.ActivityC7230i, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void onCreate(Bundle bundle) {
        CleverTapAPI cleverTapAPIM6420g = CleverTapAPI.m6420g(this, null);
        if (cleverTapAPIM6420g != null) {
            if (cleverTapAPIM6420g.f10981b.f43471a.f10999e) {
                C2181a c2181aM6429f = cleverTapAPIM6420g.m6429f();
                String strM6428e = cleverTapAPIM6420g.m6428e();
                c2181aM6429f.getClass();
                C2181a.m6452d(strM6428e, "CleverTap instance is set for Analytics only! Cannot suspend InApp Notifications.");
            } else {
                C2181a c2181aM6429f2 = cleverTapAPIM6420g.m6429f();
                String strM6428e2 = cleverTapAPIM6420g.m6428e();
                c2181aM6429f2.getClass();
                C2181a.m6452d(strM6428e2, "Suspending InApp Notifications...");
                C2181a c2181aM6429f3 = cleverTapAPIM6420g.m6429f();
                String strM6428e3 = cleverTapAPIM6420g.m6428e();
                c2181aM6429f3.getClass();
                C2181a.m6452d(strM6428e3, "Please Note - InApp Notifications will be suspended till resumeInAppNotifications() is not called again");
                cleverTapAPIM6420g.f10981b.f43478h.m6511n();
            }
        }
        InterfaceC5180b interfaceC5180bMo9713c = ((InterfaceC3420a) C9000b.m17245k(InterfaceC3420a.class, this)).mo9713c();
        C5207g.m11111f(interfaceC5180bMo9713c, "<set-?>");
        this.f22173a0 = interfaceC5180bMo9713c;
        if (((String) C7828f.m15572f(EmptyCoroutineContext.f38093a, new MainActivity$onCreate$guid$1(this, null))).length() == 0) {
            C7828f.m15570d(C7499b.m14906H(this), null, null, new C34241(null), 3);
        }
        new WebView(this);
        super.onCreate(bundle);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            C10059q0.m18850a(window, false);
        } else {
            C10057p0.m18849a(window, false);
        }
        setContentView(m9706N().f44543a);
        if (getResources().getBoolean(R.bool.is_phone)) {
            setRequestedOrientation(1);
        }
        this.f22171Y = new C6505a(this, this);
        C6704a c6704a = this.f22174b0;
        if (c6704a == null) {
            C5207g.m11117l("appSettings");
            throw null;
        }
        View rootView = m9706N().f44543a.getRootView();
        C5207g.m11110e(rootView, "binding.root.rootView");
        TooltipContainer tooltipContainer = m9706N().f44545c;
        C5207g.m11110e(tooltipContainer, "binding.tooltipContainer");
        this.f22177e0 = new ToolTipsViewManager(this, c6704a, rootView, tooltipContainer, new C3421b(), new C3422c(), new C3423d());
        Fragment fragmentM3615C = m3805K().m3615C(R.id.nav_host_fragment_top);
        C5207g.m11109d(fragmentM3615C, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C1688m c1688mM4035m0 = ((NavHostFragment) fragmentM3615C).m4035m0();
        int flags = getIntent().getFlags() & 1048576;
        InterfaceC9070c interfaceC9070c = c1688mM4035m0.f6750B;
        if (flags == 0 && C5207g.m11106a(getIntent().getAction(), "android.intent.action.SEND")) {
            if (C5207g.m11106a("text/plain", getIntent().getType())) {
                Bundle extras = getIntent().getExtras();
                String str = "";
                String string = extras != null ? extras.getString("android.intent.extra.SUBJECT", str) : null;
                if (string == null) {
                    string = str;
                }
                Bundle extras2 = getIntent().getExtras();
                String string2 = extras2 != null ? extras2.getString("android.intent.extra.TEXT", str) : null;
                if (string2 == null) {
                    string2 = str;
                }
                Bundle extras3 = getIntent().getExtras();
                String string3 = extras3 != null ? extras3.getString("share_screenshot_as_stream", str) : null;
                ImportData importData = new ImportData(string, string2, string3 != null ? string3 : "");
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("shareData", importData);
                c1688mM4035m0.m4001w(((C1689n) interfaceC9070c.getValue()).m5417b(R.navigation.nav_graph_main), bundle2);
            }
        } else if ((getIntent().getFlags() & 1048576) == 0 && C5207g.m11106a(getIntent().getAction(), "android.intent.action.VIEW") && getIntent().getDataString() != null) {
            c1688mM4035m0.m4001w(((C1689n) interfaceC9070c.getValue()).m5417b(R.navigation.nav_graph_main), null);
            String dataString = getIntent().getDataString();
            if (dataString != null) {
                if (C7076b.m14278X2(dataString, "click.lingq", false)) {
                    m9708P().mo9317Z(dataString, 0L);
                } else {
                    c1688mM4035m0.m3982b(new C8053d(c1688mM4035m0, this));
                    m9709Q(dataString, c1688mM4035m0, false);
                }
            }
        } else {
            c1688mM4035m0.m4001w(((C1689n) interfaceC9070c.getValue()).m5417b(R.navigation.nav_graph_main), null);
        }
        C7828f.m15570d(C7499b.m14906H(this), null, null, new C34256(c1688mM4035m0, this, null), 3);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // androidx.appcompat.app.ActivityC0216c, androidx.fragment.app.ActivityC0979t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C6505a c6505a = this.f22171Y;
        if (c6505a == null) {
            C5207g.m11117l("billingManager");
            throw null;
        }
        if (c6505a.f37120c.m15738k0()) {
            C7922b c7922b = c6505a.f37120c;
            c7922b.getClass();
            try {
                try {
                    c7922b.f43161d.m11442k();
                    if (c7922b.f43164g != null) {
                        ServiceConnectionC7938r serviceConnectionC7938r = c7922b.f43164g;
                        synchronized (serviceConnectionC7938r.f43237a) {
                            try {
                                serviceConnectionC7938r.f43239c = null;
                                serviceConnectionC7938r.f43238b = true;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    if (c7922b.f43164g != null && c7922b.f43163f != null) {
                        C2933a.m8514f("BillingClient", "Unbinding from service.");
                        c7922b.f43162e.unbindService(c7922b.f43164g);
                        c7922b.f43164g = null;
                    }
                    c7922b.f43163f = null;
                    ExecutorService executorService = c7922b.f43157M;
                    if (executorService != null) {
                        executorService.shutdownNow();
                        c7922b.f43157M = null;
                    }
                    c7922b.f43158a = 3;
                } catch (Exception e10) {
                    C2933a.m8516h("BillingClient", "There was an exception while ending connection!", e10);
                    c7922b.f43158a = 3;
                }
            } catch (Throwable th3) {
                c7922b.f43158a = 3;
                throw th3;
            }
        }
        ToolTipsViewManager toolTipsViewManager = this.f22177e0;
        if (toolTipsViewManager != null) {
            toolTipsViewManager.m10399a();
        } else {
            C5207g.m11117l("toolTipsViewManager");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            if ((intent.getFlags() & 1048576) != 0 || !C5207g.m11106a(intent.getAction(), "android.intent.action.SEND")) {
                if ((intent.getFlags() & 1048576) == 0 && C5207g.m11106a(intent.getAction(), "android.intent.action.VIEW")) {
                    Fragment fragmentM3615C = m3805K().m3615C(R.id.nav_host_fragment_top);
                    C5207g.m11109d(fragmentM3615C, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                    C1688m c1688mM4035m0 = ((NavHostFragment) fragmentM3615C).m4035m0();
                    if (intent.getDataString() == null) {
                        c1688mM4035m0.m3982b(new C8053d(c1688mM4035m0, this));
                        c1688mM4035m0.m3990k(intent);
                        return;
                    }
                    String dataString = intent.getDataString();
                    if (dataString != null) {
                        if (C7076b.m14278X2(dataString, "click.lingq", false)) {
                            m9708P().mo9317Z(dataString, 0L);
                            return;
                        } else {
                            c1688mM4035m0.m3982b(new C8053d(c1688mM4035m0, this));
                            m9709Q(dataString, c1688mM4035m0, false);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (C5207g.m11106a("text/plain", intent.getType())) {
                Fragment fragmentM3615C2 = m3805K().m3615C(R.id.nav_host_fragment_top);
                C5207g.m11109d(fragmentM3615C2, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                C1688m c1688mM4035m1 = ((NavHostFragment) fragmentM3615C2).m4035m0();
                Bundle extras = intent.getExtras();
                String string = null;
                String string2 = extras != null ? extras.getString("android.intent.extra.SUBJECT", "") : null;
                if (string2 == null) {
                    string2 = "";
                }
                Bundle extras2 = intent.getExtras();
                String string3 = extras2 != null ? extras2.getString("android.intent.extra.TEXT", "") : null;
                if (string3 == null) {
                    string3 = "";
                }
                Bundle extras3 = intent.getExtras();
                if (extras3 != null) {
                    string = extras3.getString("share_screenshot_as_stream", "");
                }
                if (string == null) {
                    string = "";
                }
                C4924a.m10447Z(c1688mM4035m1, new C6687n(new ImportData(string2, string3, string), ""));
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p205jk.C6505a.a
    /* JADX INFO: renamed from: p */
    public final void mo9711p(List<? extends Purchase> list) {
        C5207g.m11111f(list, "purchases");
        list.isEmpty();
        if (!false) {
            Purchase purchase = (Purchase) C6752c.m13423Q(list);
            purchase.f10529c.optInt("purchaseState", 1);
            if (1 != 1 || !purchase.f10529c.optBoolean("acknowledged", true)) {
                mo9712s(list);
                return;
            }
            MainViewModel mainViewModelM9708P = m9708P();
            String strM6225a = purchase.m6225a();
            C5207g.m11110e(strM6225a, "purchase.purchaseToken");
            mainViewModelM9708P.f22296j0.setValue(strM6225a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p205jk.C6505a.a
    /* JADX INFO: renamed from: s */
    public final void mo9712s(List<? extends Purchase> list) {
        C5207g.m11111f(list, "purchases");
        list.isEmpty();
        if (!false) {
            Purchase purchase = list.get(0);
            purchase.f10529c.optInt("purchaseState", 1);
            if (1 == 1) {
                JSONObject jSONObject = purchase.f10529c;
                if (!jSONObject.optBoolean("acknowledged", true)) {
                    RequestPurchase requestPurchase = new RequestPurchase();
                    Receipt receipt = new Receipt();
                    receipt.f18010a = jSONObject.optString("orderId");
                    jSONObject.optBoolean("autoRenewing");
                    receipt.f18016g = true;
                    receipt.f18011b = jSONObject.optString("packageName");
                    ArrayList arrayList = new ArrayList();
                    if (jSONObject.has("productIds")) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
                        if (jSONArrayOptJSONArray != null) {
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                arrayList.add(jSONArrayOptJSONArray.optString(i10));
                            }
                        }
                    } else if (jSONObject.has("productId")) {
                        arrayList.add(jSONObject.optString("productId"));
                    }
                    receipt.f18012c = (String) C6752c.m13423Q(arrayList);
                    jSONObject.optLong("purchaseTime");
                    receipt.f18013d = 1687104000000L;
                    receipt.f18015f = purchase.m6225a();
                    receipt.f18014e = 0;
                    requestPurchase.f18153a = receipt;
                    MainViewModel mainViewModelM9708P = m9708P();
                    C7828f.m15570d(C8573r0.m16767w0(mainViewModelM9708P), null, null, new MainViewModel$upgrade$1(mainViewModelM9708P, requestPurchase, purchase, null), 3);
                }
            }
        }
    }
}
