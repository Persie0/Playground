package com.lingq.p055ui;

import ae.C0062b;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.lingq.p055ui.session.AuthenticationViewModel;
import com.lingq.shared.domain.Resource;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import mo.C7661i;
import ni.C7796d;
import no.InterfaceC7882z;
import p199jd.ViewOnClickListenerC6464i;
import p260m8.C7499b;
import p302oi.C8055f;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.StartFragment$onViewCreated$2$2", m19206f = "StartFragment.kt", m19207l = {94}, m19208m = "invokeSuspend")
public final class StartFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22398e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StartFragment f22399f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22400g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f22401h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f22402i;

    /* JADX INFO: renamed from: com.lingq.ui.StartFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.StartFragment$onViewCreated$2$2$1", m19206f = "StartFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34351 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22403e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ StartFragment f22404f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f22405g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f22406h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f22407i;

        /* JADX INFO: renamed from: com.lingq.ui.StartFragment$onViewCreated$2$2$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ StartFragment f22408a;

            public a(StartFragment startFragment) {
                this.f22408a = startFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((AuthenticationViewModel) this.f22408a.f22375C0.getValue()).m10329n2();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34351(int i10, int i11, int i12, StartFragment startFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22404f = startFragment;
            this.f22405g = i10;
            this.f22406h = i11;
            this.f22407i = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34351 c34351 = new C34351(this.f22405g, this.f22406h, this.f22407i, this.f22404f, interfaceC9968c);
            c34351.f22403e = obj;
            return c34351;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Boolean> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34351) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource resource = (Resource) this.f22403e;
            Exception exc = resource.f17864c;
            StartFragment startFragment = this.f22404f;
            if (exc != null) {
                String strM3600t = C5207g.m11106a(exc.getMessage(), "no data") ? startFragment.m3600t(R.string.warning_no_connection_login) : startFragment.m3600t(R.string.warning_no_connection_login);
                C5207g.m11110e(strM3600t, "when (it.error?.message)…                        }");
                Snackbar snackbarM8842h = Snackbar.m8842h(startFragment.m3580c0(), strM3600t, -2);
                String strM3600t2 = startFragment.m3600t(R.string.warning_retry);
                a aVar = new a(startFragment);
                Button actionView = ((SnackbarContentLayout) snackbarM8842h.f15553i.getChildAt(0)).getActionView();
                if (TextUtils.isEmpty(strM3600t2)) {
                    actionView.setVisibility(8);
                    actionView.setOnClickListener(null);
                    snackbarM8842h.f15583B = false;
                } else {
                    snackbarM8842h.f15583B = true;
                    actionView.setVisibility(0);
                    actionView.setText(strM3600t2);
                    actionView.setOnClickListener(new ViewOnClickListenerC6464i(snackbarM8842h, 0, aVar));
                }
                snackbarM8842h.m8844i();
            } else {
                if (C5207g.m11106a(resource.f17863b, Boolean.TRUE)) {
                    if (startFragment.m9748n0().m13299a().length() == 0) {
                        String str = (String) C6752c.m13440h0(C9000b.m17252r("Control", "UpgradeTest"), Random.f38128a);
                        startFragment.m9748n0().m13303e(str);
                        C7796d c7796d = startFragment.f22379G0;
                        if (c7796d == null) {
                            C5207g.m11117l("analytics");
                            throw null;
                        }
                        c7796d.m15507d("And_Upgrade_23_05_08", str);
                    }
                    if (!((MainViewModel) startFragment.f22374B0.getValue()).mo502f0() && this.f22405g == 0 && this.f22406h == 0 && this.f22407i == 0) {
                        NavController navControllerM16725g0 = C8573r0.m16725g0(startFragment);
                        NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToUpgrade) != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("attemptedAction", "First Time App Open");
                            bundle.putString("offer", "");
                            navControllerM16725g0.m3992m(R.id.actionToUpgrade, bundle, null);
                        }
                    } else if (C7661i.m15250P2(((C8055f) startFragment.f22376D0.getValue()).f43745b)) {
                        C4924a.m10447Z(C8573r0.m16725g0(startFragment), C8573r0.m16661A());
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartFragment$onViewCreated$2$2(int i10, int i11, int i12, StartFragment startFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22399f = startFragment;
        this.f22400g = i10;
        this.f22401h = i11;
        this.f22402i = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new StartFragment$onViewCreated$2$2(this.f22400g, this.f22401h, this.f22402i, this.f22399f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StartFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22398e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            AuthenticationViewModel authenticationViewModel = (AuthenticationViewModel) this.f22399f.f22375C0.getValue();
            C34351 c34351 = new C34351(this.f22400g, this.f22401h, this.f22402i, this.f22399f, null);
            this.f22398e = 1;
            if (C0062b.m369m0(authenticationViewModel.f30538P, c34351, this) == coroutineSingletons) {
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
