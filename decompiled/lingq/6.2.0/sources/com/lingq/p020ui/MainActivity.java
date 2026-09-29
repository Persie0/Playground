package com.lingq.p020ui;

import android.animation.ObjectAnimator;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.glance.appwidget.C0660h;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.navigation.fragment.NavHostFragment;
import com.android.billingclient.api.Purchase;
import com.lingq.R$id;
import com.lingq.R$navigation;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.designsystem.R$bool;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.notification.InAppNotificationType;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.user.ImportData;
import com.lingq.core.domain.model.user.Login;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.player.service.PlayerService;
import com.lingq.core.tooltips.TooltipContainer;
import com.lingq.feature.widget.C2864b;
import com.lingq.feature.widget.PlaylistWidgetReceiver;
import com.lingq.p020ui.MainActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.AbstractC3193b;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import org.json.JSONObject;
import p000.AbstractActivityC2935dp;
import p000.AbstractC3343mp;
import p000.AbstractC3352my;
import p000.C2892cp;
import p000.C2916d6;
import p000.C3052gv;
import p000.C3370nf;
import p000.C3386nv;
import p000.C3404oc;
import p000.C3437ov;
import p000.C3440oy;
import p000.C3509qs;
import p000.C3524r6;
import p000.C3540rl;
import p000.C3675v7;
import p000.C3749x7;
import p000.C3822z6;
import p000.LayoutInflaterFactory2C3804yp;
import p000.RunnableC0002a0;
import p000.a7a;
import p000.ac6;
import p000.ah9;
import p000.ap5;
import p000.b64;
import p000.b6a;
import p000.b7a;
import p000.bp5;
import p000.by8;
import p000.c32;
import p000.c83;
import p000.cc4;
import p000.cf6;
import p000.cg7;
import p000.ci8;
import p000.cl9;
import p000.cs4;
import p000.cy1;
import p000.d04;
import p000.d7a;
import p000.df6;
import p000.dia;
import p000.dta;
import p000.dw6;
import p000.e41;
import p000.e86;
import p000.ee6;
import p000.efa;
import p000.eh9;
import p000.eia;
import p000.es4;
import p000.ew7;
import p000.fa4;
import p000.fb4;
import p000.fe6;
import p000.fr5;
import p000.fs6;
import p000.gd6;
import p000.gm5;
import p000.gp0;
import p000.h0a;
import p000.h24;
import p000.h86;
import p000.hd6;
import p000.hf6;
import p000.hm5;
import p000.hvb;
import p000.jfa;
import p000.kc0;
import p000.kp9;
import p000.lb0;
import p000.lda;
import p000.le6;
import p000.lf9;
import p000.m83;
import p000.m84;
import p000.mbd;
import p000.mo2;
import p000.nk3;
import p000.no2;
import p000.nt3;
import p000.ob1;
import p000.oc0;
import p000.ofd;
import p000.oo2;
import p000.p56;
import p000.p58;
import p000.p5a;
import p000.pc0;
import p000.ph2;
import p000.q5a;
import p000.qb4;
import p000.qe6;
import p000.ql7;
import p000.qn7;
import p000.qo2;
import p000.qz2;
import p000.r86;
import p000.re6;
import p000.rm5;
import p000.rn7;
import p000.ro2;
import p000.ro5;
import p000.s32;
import p000.s92;
import p000.sb6;
import p000.se6;
import p000.sg3;
import p000.sm5;
import p000.so2;
import p000.so5;
import p000.t32;
import p000.t6a;
import p000.ta6;
import p000.te6;
import p000.thb;
import p000.ty1;
import p000.u32;
import p000.u56;
import p000.u86;
import p000.u91;
import p000.ua6;
import p000.ud6;
import p000.un1;
import p000.up6;
import p000.ux5;
import p000.v48;
import p000.v63;
import p000.vd6;
import p000.ve6;
import p000.vg1;
import p000.vi3;
import p000.vk9;
import p000.vz1;
import p000.w41;
import p000.wb5;
import p000.wfb;
import p000.wsa;
import p000.x6a;
import p000.xe1;
import p000.xfa;
import p000.y38;
import p000.y6a;
import p000.yb6;
import p000.z21;
import p000.zi3;
import p000.zo5;
import p000.zta;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC2935dp implements nk3 {
    private static final zo5 Companion = new zo5();

    /* JADX INFO: renamed from: m0 */
    public static final /* synthetic */ int f33994m0 = 0;

    /* JADX INFO: renamed from: W */
    public volatile C3524r6 f33995W;

    /* JADX INFO: renamed from: X */
    public final Object f33996X = new Object();

    /* JADX INFO: renamed from: Y */
    public boolean f33997Y = false;

    /* JADX INFO: renamed from: Z */
    public final w41 f33998Z;

    /* JADX INFO: renamed from: a0 */
    public final cs4 f33999a0;

    /* JADX INFO: renamed from: b0 */
    public pc0 f34000b0;

    /* JADX INFO: renamed from: c0 */
    public String f34001c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f34002d0;

    /* JADX INFO: renamed from: e0 */
    public ob1 f34003e0;

    /* JADX INFO: renamed from: f0 */
    public C3509qs f34004f0;

    /* JADX INFO: renamed from: g0 */
    public hm5 f34005g0;

    /* JADX INFO: renamed from: h0 */
    public C2864b f34006h0;

    /* JADX INFO: renamed from: i0 */
    public qn7 f34007i0;

    /* JADX INFO: renamed from: j0 */
    public v48 f34008j0;

    /* JADX INFO: renamed from: k0 */
    public final int f34009k0;

    /* JADX INFO: renamed from: l0 */
    public final int f34010l0;

    /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$5 */
    @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$5", m4291f = "MainActivity.kt", m4292l = {221}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28805 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f34011a;

        public C28805(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new C28805(continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C28805) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f34011a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0660h c0660h = new C0660h(MainActivity.this);
                z21 z21VarM24933a = y38.m24933a(PlaylistWidgetReceiver.class);
                this.f34011a = 1;
                int[] iArr = m84.f50750a;
                u56 u56Var = new u56(1);
                u56Var.f63437b[u56Var.m22477d(7)] = 7;
                if (c0660h.m2241d(z21VarM24933a, u56Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6 */
    @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6", m4291f = "MainActivity.kt", m4292l = {229}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28816 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f34013a;

        /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f34015a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MainActivity f34016b;

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$1", m4291f = "MainActivity.kt", m4292l = {232}, m4293m = "invokeSuspend", m4294v = 2)
            final class C38561 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34017a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34018b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$1$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$1$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38571 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34019a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34020b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38571(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34020b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38571 c38571 = new C38571(this.f34020b, continuation);
                        c38571.f34019a = obj;
                        return c38571;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38571 c38571 = (C38571) create((Login) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38571.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object value;
                        Object value2;
                        Uri uri;
                        String string;
                        String string2;
                        String string3;
                        Login login = (Login) this.f34019a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        String str = login.f19647b;
                        boolean z = str == null || str.length() == 0;
                        MainActivity mainActivity = this.f34020b;
                        Intent intent = mainActivity.getIntent();
                        intent.getClass();
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = mainActivity.m13792j().m2136D(R$id.nav_host_fragment_top);
                        abstractComponentCallbacksC0635cM2136D.getClass();
                        ud6 ud6VarM2573c0 = ((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0();
                        vd6 vd6Var = (vd6) ud6VarM2573c0.f63766h.getValue();
                        h86 h86Var = ud6VarM2573c0.f63760b;
                        u86 u86VarM23234b = vd6Var.m23234b(R$navigation.nav_graph_main);
                        sg3 sg3Var = u86VarM23234b.f63589g;
                        if (z) {
                            t32 t32Var = u32.Companion;
                            String dataString = intent.getDataString();
                            t32Var.getClass();
                            if (t32.m21826a(dataString)) {
                                mainActivity.f34002d0 = true;
                            }
                            if (mainActivity.f34002d0) {
                                r86 r86VarM22538m = u86VarM23234b.m22538m(com.lingq.feature.onboarding.R$id.nav_graph_onboarding);
                                u86 u86Var = r86VarM22538m instanceof u86 ? (u86) r86VarM22538m : null;
                                if (u86Var != null) {
                                    u86Var.f63589g.m21361m(com.lingq.feature.onboarding.R$id.fragment_onboarding_login);
                                }
                            }
                            sg3Var.m21361m(com.lingq.feature.onboarding.R$id.nav_graph_onboarding);
                        } else {
                            mainActivity.f34002d0 = false;
                            sg3Var.m21361m(R$id.nav_graph_home);
                        }
                        String str2 = "";
                        if ((intent.getFlags() & 1048576) == 0 && fa4.m11650l(intent.getAction(), "android.intent.action.SEND")) {
                            if (u91.m22633z0(vz1.m23622b0(), intent.getType())) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
                                    uri = parcelableExtra instanceof Uri ? (Uri) parcelableExtra : null;
                                }
                                Bundle extras = intent.getExtras();
                                if (extras == null || (string = extras.getString("android.intent.extra.SUBJECT", "")) == null) {
                                    string = "";
                                }
                                Bundle extras2 = intent.getExtras();
                                if (extras2 == null || (string2 = extras2.getString("android.intent.extra.TEXT", "")) == null) {
                                    string2 = "";
                                }
                                Bundle extras3 = intent.getExtras();
                                if (extras3 != null && (string3 = extras3.getString("share_screenshot_as_stream", "")) != null) {
                                    str2 = string3;
                                }
                                ImportData importData = new ImportData(string, string2, str2, uri != null ? uri.toString() : null);
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("shareData", ofd.m17971a(importData));
                                h86Var.m13138r(u86VarM23234b, bundle);
                                C2889e c2889eM9802q = mainActivity.m9802q();
                                qe6 qe6Var = new qe6(new le6(importData));
                                c2889eM9802q.getClass();
                                c2889eM9802q.f34205g.mo8243R1(qe6Var);
                            }
                            mainActivity.setIntent(new Intent(mainActivity, (Class<?>) MainActivity.class));
                        } else if ((intent.getFlags() & 1048576) == 0 && fa4.m11650l(intent.getAction(), "android.intent.action.VIEW") && intent.getDataString() != null) {
                            h86Var.m13138r(u86VarM23234b, new Bundle());
                            C2889e c2889eM9802q2 = mainActivity.m9802q();
                            String dataString2 = intent.getDataString();
                            str2 = dataString2 != null ? dataString2 : "";
                            c2889eM9802q2.getClass();
                            wfb.m23926u(lda.m16103C(c2889eM9802q2), null, null, new MainViewModel$intentData$1(c2889eM9802q2, str2, null), 3);
                            mainActivity.setIntent(new Intent(mainActivity, (Class<?>) MainActivity.class));
                        } else {
                            h86Var.m13138r(u86VarM23234b, new Bundle());
                        }
                        C3244l c3244l = mainActivity.m9802q().f34198H;
                        do {
                            value = c3244l.getValue();
                            ((Boolean) value).getClass();
                        } while (!c3244l.m15570h(value, Boolean.FALSE));
                        C3244l c3244l2 = mainActivity.m9802q().f34224z;
                        do {
                            value2 = c3244l2.getValue();
                        } while (!c3244l2.m15570h(value2, null));
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C38561(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34018b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C38561(this.f34018b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((C38561) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34017a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34018b;
                        C3540rl c3540rl = new C3540rl(mainActivity.m9802q().f34192B, 5);
                        C38571 c38571 = new C38571(mainActivity, null);
                        this.f34017a = 1;
                        if (AbstractC3224d.m15529h(c3540rl, c38571, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$10, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$10", m4291f = "MainActivity.kt", m4292l = {304}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass10 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34021a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34022b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$10$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$10$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38581 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34023a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34024b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38581(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34024b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38581 c38581 = new C38581(this.f34024b, continuation);
                        c38581.f34023a = obj;
                        return c38581;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38581 c38581 = (C38581) create((LqTheme) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38581.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        int i;
                        LqTheme lqTheme = (LqTheme) this.f34023a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        MainActivity mainActivity = this.f34024b;
                        lqTheme.getClass();
                        if (Build.VERSION.SDK_INT >= 31) {
                            Object systemService = mainActivity.getSystemService("uimode");
                            systemService.getClass();
                            UiModeManager uiModeManager = (UiModeManager) systemService;
                            int i2 = efa.f37196b[lqTheme.ordinal()];
                            if (i2 == 1) {
                                uiModeManager.setApplicationNightMode(1);
                            } else if (i2 == 2) {
                                uiModeManager.setApplicationNightMode(2);
                            } else {
                                if (i2 != 3) {
                                    gm5.m12750e();
                                    return null;
                                }
                                uiModeManager.setApplicationNightMode(0);
                            }
                        } else {
                            int i3 = efa.f37196b[lqTheme.ordinal()];
                            if (i3 == 1) {
                                i = 1;
                            } else if (i3 == 2) {
                                i = 2;
                            } else {
                                if (i3 != 3) {
                                    gm5.m12750e();
                                    return null;
                                }
                                i = -1;
                            }
                            by8 by8Var = AbstractC3343mp.f51673a;
                            if (i != -1 && i != 0 && i != 1 && i != 2) {
                                Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
                            } else if (AbstractC3343mp.f51674b != i) {
                                AbstractC3343mp.f51674b = i;
                                synchronized (AbstractC3343mp.f51680h) {
                                    try {
                                        C3437ov c3437ov = AbstractC3343mp.f51679g;
                                        c3437ov.getClass();
                                        C3052gv c3052gv = new C3052gv(c3437ov);
                                        while (c3052gv.hasNext()) {
                                            AbstractC3343mp abstractC3343mp = (AbstractC3343mp) ((WeakReference) c3052gv.next()).get();
                                            if (abstractC3343mp != null) {
                                                ((LayoutInflaterFactory2C3804yp) abstractC3343mp).m25229l(true, true);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass10(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34022b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass10(this.f34022b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass10) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34021a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34022b;
                        m83 m83Var = mainActivity.m9802q().f34221w;
                        C38581 c38581 = new C38581(mainActivity, null);
                        this.f34021a = 1;
                        if (AbstractC3224d.m15529h(m83Var, c38581, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$11, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$11", m4291f = "MainActivity.kt", m4292l = {310}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass11 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34025a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34026b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$11$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$11$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38591 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MainActivity f34027a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38591(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34027a = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C38591(this.f34027a, continuation);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38591 c38591 = (C38591) create((String) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38591.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        this.f34027a.recreate();
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass11(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34026b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass11(this.f34026b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass11) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34025a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34026b;
                        m83 m83Var = mainActivity.m9802q().f34223y;
                        C38591 c38591 = new C38591(mainActivity, null);
                        this.f34025a = 1;
                        if (AbstractC3224d.m15529h(m83Var, c38591, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$12, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$12", m4291f = "MainActivity.kt", m4292l = {316}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass12 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34028a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34029b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$12$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$12$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38601 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MainActivity f34030a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38601(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34030a = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C38601(this.f34030a, continuation);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38601 c38601 = (C38601) create((xfa) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38601.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        MainActivity mainActivity = this.f34030a;
                        mainActivity.startForegroundService(new Intent(mainActivity, (Class<?>) PlayerService.class));
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass12(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34029b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass12(this.f34029b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass12) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34028a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34029b;
                        c83 c83VarMo9213q = mainActivity.m9802q().f34203e.mo9213q();
                        C38601 c38601 = new C38601(mainActivity, null);
                        this.f34028a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo9213q, c38601, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$13, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$13", m4291f = "MainActivity.kt", m4292l = {326}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass13 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34031a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34032b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$13$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$13$1", m4291f = "MainActivity.kt", m4292l = {383}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38611 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public int f34033a;

                    /* JADX INFO: renamed from: b */
                    public /* synthetic */ Object f34034b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ MainActivity f34035c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38611(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34035c = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38611 c38611 = new C38611(this.f34035c, continuation);
                        c38611.f34034b = obj;
                        return c38611;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C38611) create((hf6) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        hf6 hf6Var = (hf6) this.f34034b;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.f34033a;
                        if (i == 0) {
                            AbstractC3193b.m15359b(obj);
                            MainActivity mainActivity = this.f34035c;
                            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = mainActivity.m13792j().m2136D(R$id.nav_host_fragment_top);
                            abstractComponentCallbacksC0635cM2136D.getClass();
                            ud6 ud6VarM2573c0 = ((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0();
                            if (hf6Var instanceof se6) {
                                ud6VarM2573c0.m22688e(((se6) hf6Var).f60763a);
                                mainActivity.m9802q().mo8241G0();
                            } else if (hf6Var instanceof fe6) {
                                ud6VarM2573c0.m22688e(((fe6) hf6Var).f38945a);
                                mainActivity.m9802q().mo8241G0();
                            } else if (hf6Var instanceof ee6) {
                                ud6VarM2573c0.m22688e(((ee6) hf6Var).f37111a);
                                mainActivity.m9802q().mo8241G0();
                            } else if (hf6Var instanceof te6) {
                                C3509qs c3509qs = mainActivity.f34004f0;
                                if (c3509qs == null) {
                                    fa4.m11636J("appSettings");
                                    throw null;
                                }
                                c3509qs.m20134h(((te6) hf6Var).f62194a);
                                r86 r86VarM13127f = ud6VarM2573c0.f63760b.m13127f();
                                if (r86VarM13127f == null || r86VarM13127f.f58881b.f57368b != com.lingq.feature.onboarding.R$id.fragment_onboarding_login) {
                                    ac6.Companion.getClass();
                                    jfa.m14428k(ud6VarM2573c0, new yb6(""), null);
                                }
                                mainActivity.m9802q().mo8241G0();
                            } else if (hf6Var instanceof df6) {
                                String value = LqAnalyticsValues$UpgradePopupSource.Campaign.getValue();
                                String str = ((df6) hf6Var).f35565a;
                                mainActivity.m9806w(value, str, cl9.m4834Q(str, "lq-plus", false));
                                mainActivity.m9802q().mo8241G0();
                            } else if (hf6Var instanceof re6) {
                                mainActivity.m9802q().mo8569i2(((re6) hf6Var).f59161a);
                                mainActivity.m9802q().mo8241G0();
                            } else if (hf6Var instanceof cf6) {
                                mbd.m16755c(mainActivity, ((cf6) hf6Var).f10003a, null, 30);
                                mainActivity.m9802q().mo8241G0();
                            } else if (hf6Var instanceof ve6) {
                                ud6VarM2573c0.m22686c(mainActivity.getIntent());
                                mainActivity.m9802q().mo8241G0();
                            } else if (hf6Var instanceof qe6) {
                                ud6VarM2573c0.m22690g(R$id.fragment_home, false);
                                C2889e c2889eM9802q = mainActivity.m9802q();
                                hf6 hf6Var2 = ((qe6) hf6Var).f57651a;
                                this.f34034b = null;
                                this.f34033a = 1;
                                if (c2889eM9802q.f34205g.mo8242M2(hf6Var2, 500L, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i != 1) {
                                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC3193b.m15359b(obj);
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass13(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34032b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass13(this.f34032b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass13) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34031a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34032b;
                        eh9 eh9VarMo8244S1 = mainActivity.m9802q().f34205g.mo8244S1();
                        C38611 c38611 = new C38611(mainActivity, null);
                        this.f34031a = 1;
                        if (AbstractC3224d.m15529h(eh9VarMo8244S1, c38611, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$14, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$14", m4291f = "MainActivity.kt", m4292l = {392}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass14 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34036a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34037b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$14$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$14$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38621 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34038a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34039b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38621(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34039b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38621 c38621 = new C38621(this.f34039b, continuation);
                        c38621.f34038a = obj;
                        return c38621;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38621 c38621 = (C38621) create((Pair) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38621.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        String str;
                        Pair pair = (Pair) this.f34038a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        boolean zBooleanValue = ((Boolean) pair.f47623a).booleanValue();
                        String str2 = (String) pair.f47624b;
                        MainActivity mainActivity = this.f34039b;
                        if (zBooleanValue) {
                            int i = MainActivity.f33994m0;
                            jfa.m14429l(mainActivity.m9801o().f70970f);
                            TextView textView = mainActivity.m9801o().f70967c;
                            if (vk9.m23391n0(str2)) {
                                str = "";
                            } else {
                                Locale locale = Locale.getDefault();
                                String string = mainActivity.getString(R$string.deep_link_language_switching);
                                string.getClass();
                                str = String.format(locale, string, Arrays.copyOf(new Object[]{AbstractC3352my.m17093L(mainActivity, str2)}, 1));
                            }
                            textView.setText(str);
                        } else {
                            int i2 = MainActivity.f33994m0;
                            jfa.m14425h(mainActivity.m9801o().f70970f);
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass14(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34037b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass14(this.f34037b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass14) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34036a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34037b;
                        eh9 eh9VarMo8248h1 = mainActivity.m9802q().f34205g.mo8248h1();
                        C38621 c38621 = new C38621(mainActivity, null);
                        this.f34036a = 1;
                        if (AbstractC3224d.m15529h(eh9VarMo8248h1, c38621, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$15, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$15", m4291f = "MainActivity.kt", m4292l = {411}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass15 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34040a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34041b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$15$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$15$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38631 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MainActivity f34042a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38631(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34042a = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C38631(this.f34042a, continuation);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38631 c38631 = (C38631) create((xfa) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38631.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        int i = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34042a;
                        C2889e c2889eM9802q = mainActivity.m9802q();
                        c2889eM9802q.getClass();
                        wfb.m23926u(lda.m16103C(c2889eM9802q), c2889eM9802q.f34219u, null, new MainViewModel$clearProfile$1(c2889eM9802q, null), 2);
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = mainActivity.m13792j().m2136D(R$id.nav_host_fragment_top);
                        abstractComponentCallbacksC0635cM2136D.getClass();
                        ud6 ud6VarM2573c0 = ((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0();
                        sb6.Companion.getClass();
                        jfa.m14428k(ud6VarM2573c0, new C2916d6(R$id.actionToLogout), null);
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass15(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34041b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass15(this.f34041b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass15) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34040a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34041b;
                        c83 c83VarMo9814U = mainActivity.m9802q().f34206h.mo9814U();
                        C38631 c38631 = new C38631(mainActivity, null);
                        this.f34040a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo9814U, c38631, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$16, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$16", m4291f = "MainActivity.kt", m4292l = {421}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass16 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34043a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34044b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$16$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$16$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38641 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MainActivity f34045a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38641(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34045a = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C38641(this.f34045a, continuation);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38641 c38641 = (C38641) create((xfa) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38641.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = this.f34045a.m13792j().m2136D(R$id.nav_host_fragment_top);
                        abstractComponentCallbacksC0635cM2136D.getClass();
                        ud6 ud6VarM2573c0 = ((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0();
                        sb6.Companion.getClass();
                        jfa.m14428k(ud6VarM2573c0, new C2916d6(R$id.actionToLogout), null);
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass16(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34044b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass16(this.f34044b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass16) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34043a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34044b;
                        c83 c83VarMo4582N = mainActivity.m9802q().f34200b.mo4582N();
                        C38641 c38641 = new C38641(mainActivity, null);
                        this.f34043a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo4582N, c38641, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$17, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$17", m4291f = "MainActivity.kt", m4292l = {430}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass17 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34046a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34047b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$17$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$17$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38651 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ int f34048a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34049b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38651(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34049b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38651 c38651 = new C38651(this.f34049b, continuation);
                        c38651.f34048a = ((Number) obj).intValue();
                        return c38651;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38651 c38651 = (C38651) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38651.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        int i = this.f34048a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        Locale locale = Locale.getDefault();
                        int i2 = R$string.upgrade_more_lingqs_success;
                        MainActivity mainActivity = this.f34049b;
                        String string = mainActivity.getString(i2);
                        string.getClass();
                        Toast.makeText(mainActivity, String.format(locale, string, Arrays.copyOf(new Object[]{new Integer(i)}, 1)), 1).show();
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass17(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34047b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass17(this.f34047b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass17) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34046a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34047b;
                        c83 c83VarMo8557N1 = mainActivity.m9802q().f34201c.mo8557N1();
                        C38651 c38651 = new C38651(mainActivity, null);
                        this.f34046a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo8557N1, c38651, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$18, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$18", m4291f = "MainActivity.kt", m4292l = {445}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass18 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34050a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34051b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$18$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$18$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38661 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34052a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34053b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38661(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34053b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38661 c38661 = new C38661(this.f34053b, continuation);
                        c38661.f34052a = obj;
                        return c38661;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38661 c38661 = (C38661) create((rn7) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38661.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        List<OfferBanner> list;
                        rn7 rn7Var = (rn7) this.f34052a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        up6 up6Var = rn7Var.f59593c.f61064b;
                        if (up6Var != null && (list = up6Var.f64191s) != null) {
                            for (OfferBanner offerBanner : list) {
                                MainActivity mainActivity = this.f34053b;
                                d04 d04Var = new d04(mainActivity);
                                d04Var.f34778c = offerBanner.m8104a();
                                p58.m18903m(mainActivity).m4951b(d04Var.m9960a());
                            }
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass18(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34051b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass18(this.f34051b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass18) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34050a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34051b;
                        C3540rl c3540rl = new C3540rl(mainActivity.m9802q().f34199I, 5);
                        C38661 c38661 = new C38661(mainActivity, null);
                        this.f34050a = 1;
                        if (AbstractC3224d.m15529h(c3540rl, c38661, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$19, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$19", m4291f = "MainActivity.kt", m4292l = {456}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass19 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34054a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34055b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$19$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$19$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38671 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MainActivity f34056a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38671(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34056a = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C38671(this.f34056a, continuation);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38671 c38671 = (C38671) create((xfa) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38671.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        int i = com.lingq.R$string.upgrade_more_lingqs_error;
                        MainActivity mainActivity = this.f34056a;
                        Toast.makeText(mainActivity, mainActivity.getString(i), 1).show();
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass19(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34055b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass19(this.f34055b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass19) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34054a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34055b;
                        c83 c83VarMo8565Y = mainActivity.m9802q().f34201c.mo8565Y();
                        C38671 c38671 = new C38671(mainActivity, null);
                        this.f34054a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo8565Y, c38671, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$2, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$2", m4291f = "MainActivity.kt", m4292l = {243}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass2 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34057a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34058b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$2$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$2$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38681 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34059a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34060b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38681(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34060b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38681 c38681 = new C38681(this.f34060b, continuation);
                        c38681.f34059a = obj;
                        return c38681;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38681 c38681 = (C38681) create((s32) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38681.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        s32 s32Var = (s32) this.f34059a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        String strM21044a = s32Var.m21044a();
                        final boolean zM21045b = s32Var.m21045b();
                        int i = MainActivity.f33994m0;
                        final MainActivity mainActivity = this.f34060b;
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = mainActivity.m13792j().m2136D(R$id.nav_host_fragment_top);
                        abstractComponentCallbacksC0635cM2136D.getClass();
                        final ud6 ud6VarM2573c0 = ((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0();
                        if (vk9.m23380c0(strM21044a, "click.lingq", false)) {
                            mainActivity.m9802q().mo8247e0(strM21044a, 0L);
                        } else {
                            ud6VarM2573c0.m22684a(new e86() { // from class: yo5
                                @Override // p000.e86
                                /* JADX INFO: renamed from: a */
                                public final void mo10921a(ud6 ud6Var, r86 r86Var) {
                                    int i2 = MainActivity.f33994m0;
                                    r86Var.getClass();
                                    ud6 ud6Var2 = ud6VarM2573c0;
                                    r86 r86VarM13127f = ud6Var2.f63760b.m13127f();
                                    if (r86VarM13127f == null || r86VarM13127f.f58881b.f57368b != R$id.fragment_home) {
                                        return;
                                    }
                                    MainActivity mainActivity2 = mainActivity;
                                    if (vk9.m23391n0(mainActivity2.f34001c0)) {
                                        return;
                                    }
                                    mainActivity2.m9803s(zM21045b, mainActivity2.f34001c0, ud6Var2, true);
                                    mainActivity2.f34001c0 = "";
                                }
                            });
                            mainActivity.m9803s(zM21045b, strM21044a, ud6VarM2573c0, false);
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34058b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.f34058b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34057a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34058b;
                        C3540rl c3540rl = new C3540rl(mainActivity.m9802q().f34197G, 5);
                        C38681 c38681 = new C38681(mainActivity, null);
                        this.f34057a = 1;
                        if (AbstractC3224d.m15529h(c3540rl, c38681, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$20, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$20", m4291f = "MainActivity.kt", m4292l = {466}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass20 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34061a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34062b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$20$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$20$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38691 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34063a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34064b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38691(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34064b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38691 c38691 = new C38691(this.f34064b, continuation);
                        c38691.f34063a = obj;
                        return c38691;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38691 c38691 = (C38691) create((String) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38691.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        String str = (String) this.f34063a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        if (!vk9.m23391n0(str)) {
                            InAppNotificationType inAppNotificationType = InAppNotificationType.Timezone;
                            int i = R$string.settings_timezone_message;
                            MainActivity mainActivity = this.f34064b;
                            String string = mainActivity.getString(i);
                            string.getClass();
                            h24 h24Var = new h24(inAppNotificationType, String.format(string, Arrays.copyOf(new Object[]{str}, 1)), "", vz1.m23605K(InAppNotificationAction.Yes, InAppNotificationAction.No, InAppNotificationAction.AdjustSettings), str);
                            C2889e c2889eM9802q = mainActivity.m9802q();
                            c2889eM9802q.getClass();
                            c2889eM9802q.f34204f.mo7013g1(h24Var);
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass20(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34062b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass20(this.f34062b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass20) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34061a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34062b;
                        c83 c83VarMo4571A = mainActivity.m9802q().f34200b.mo4571A();
                        C38691 c38691 = new C38691(mainActivity, null);
                        this.f34061a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo4571A, c38691, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$21, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$21", m4291f = "MainActivity.kt", m4292l = {488}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass21 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34065a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34066b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$21$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$21$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38701 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34067a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34068b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38701(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34068b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38701 c38701 = new C38701(this.f34068b, continuation);
                        c38701.f34067a = obj;
                        return c38701;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38701 c38701 = (C38701) create((Triple) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38701.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Triple triple = (Triple) this.f34067a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        String str = (String) triple.f47633a;
                        boolean zBooleanValue = ((Boolean) triple.f47634b).booleanValue();
                        int i = MainActivity.f33994m0;
                        this.f34068b.m9806w(str, null, zBooleanValue);
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass21(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34066b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass21(this.f34066b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass21) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34065a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34066b;
                        c83 c83VarMo3738Z = mainActivity.m9802q().f34209k.mo3738Z();
                        C38701 c38701 = new C38701(mainActivity, null);
                        this.f34065a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo3738Z, c38701, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$22, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$22", m4291f = "MainActivity.kt", m4292l = {494}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass22 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34069a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34070b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$22$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$22$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38711 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34071a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34072b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38711(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34072b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38711 c38711 = new C38711(this.f34072b, continuation);
                        c38711.f34071a = obj;
                        return c38711;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38711 c38711 = (C38711) create((h24) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38711.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        h24 h24Var = (h24) this.f34071a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        InAppNotificationType inAppNotificationType = h24Var.f41695a;
                        Object obj2 = h24Var.f41699e;
                        int i = ap5.f7325a[inAppNotificationType.ordinal()];
                        MainActivity mainActivity = this.f34072b;
                        switch (i) {
                            case 1:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                break;
                            case 2:
                            case 3:
                                obj2.getClass();
                                int i2 = MainActivity.f33994m0;
                                C2889e c2889eM9802q = mainActivity.m9802q();
                                DailyGoalMet dailyGoalMetM22349a = ((ty1) obj2).m22349a();
                                c2889eM9802q.getClass();
                                wfb.m23926u(lda.m16103C(c2889eM9802q), c2889eM9802q.f34219u, null, new MainViewModel$metDailyGoal$1(c2889eM9802q, dailyGoalMetM22349a, null), 2);
                                Bundle bundle = new Bundle();
                                bundle.putString("Streak Language", mainActivity.m9802q().f34200b.mo4589b2());
                                ((C1240a) mainActivity.m9800n()).m7025f("Daily Streak Goal Hit", bundle);
                                break;
                            case 4:
                                obj2.getClass();
                                int i3 = MainActivity.f33994m0;
                                C2889e c2889eM9802q2 = mainActivity.m9802q();
                                c2889eM9802q2.getClass();
                                wfb.m23926u(lda.m16103C(c2889eM9802q2), c2889eM9802q2.f34219u, null, new MainViewModel$metMilestone$1(c2889eM9802q2, (Milestone) obj2, null), 2);
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass22(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34070b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass22(this.f34070b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass22) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34069a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34070b;
                        c83 c83VarMo7004O0 = mainActivity.m9802q().f34204f.mo7004O0();
                        C38711 c38711 = new C38711(mainActivity, null);
                        this.f34069a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo7004O0, c38711, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$3, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$3", m4291f = "MainActivity.kt", m4292l = {250}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass3 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34073a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34074b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$3$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$3$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38721 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34075a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34076b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38721(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34076b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38721 c38721 = new C38721(this.f34076b, continuation);
                        c38721.f34075a = obj;
                        return c38721;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38721 c38721 = (C38721) create((Triple) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38721.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Triple triple = (Triple) this.f34075a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        ql7 ql7Var = (ql7) triple.f47633a;
                        String str = (String) triple.f47634b;
                        String str2 = (String) triple.f47635c;
                        MainActivity mainActivity = this.f34076b;
                        pc0 pc0Var = mainActivity.f34000b0;
                        if (pc0Var == null) {
                            fa4.m11636J("billingManager");
                            throw null;
                        }
                        ql7Var.getClass();
                        str.getClass();
                        str2.getClass();
                        oc0 oc0Var = new oc0((Object) ql7Var, str, (Object) pc0Var, str2, 0);
                        if (pc0Var.f55937a) {
                            oc0Var.run();
                        } else {
                            ((kc0) pc0Var.f55941e).mo13517e(new b64(pc0Var, oc0Var));
                        }
                        mainActivity.m9802q().mo8558O2();
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34074b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass3(this.f34074b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34073a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34074b;
                        C3540rl c3540rl = new C3540rl(mainActivity.m9802q().f34201c.mo8577y2(), 5);
                        C38721 c38721 = new C38721(mainActivity, null);
                        this.f34073a = 1;
                        if (AbstractC3224d.m15529h(c3540rl, c38721, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$4, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$4", m4291f = "MainActivity.kt", m4292l = {261}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass4 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34077a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34078b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$4$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$4$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38731 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34079a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34080b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38731(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34080b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38731 c38731 = new C38731(this.f34080b, continuation);
                        c38731.f34079a = obj;
                        return c38731;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38731 c38731 = (C38731) create((Purchase) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38731.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Purchase purchase = (Purchase) this.f34079a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        MainActivity mainActivity = this.f34080b;
                        pc0 pc0Var = mainActivity.f34000b0;
                        if (pc0Var == null) {
                            fa4.m11636J("billingManager");
                            throw null;
                        }
                        purchase.getClass();
                        JSONObject jSONObject = purchase.f11296c;
                        if (jSONObject.optInt("purchaseState", 1) != 4 && !jSONObject.optBoolean("acknowledged", true)) {
                            C3404oc c3404ocM12784a = gp0.m12784a();
                            c3404ocM12784a.m17908d(purchase.m5177b());
                            ((kc0) pc0Var.f55941e).mo13513a(c3404ocM12784a.m17907b(), new C3440oy(purchase, 2));
                        }
                        mainActivity.m9802q().mo8553I();
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34078b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass4(this.f34078b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34077a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34078b;
                        C3540rl c3540rl = new C3540rl(mainActivity.m9802q().f34201c.mo8571l(), 5);
                        C38731 c38731 = new C38731(mainActivity, null);
                        this.f34077a = 1;
                        if (AbstractC3224d.m15529h(c3540rl, c38731, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$5, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$5", m4291f = "MainActivity.kt", m4292l = {268}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass5 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34081a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34082b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$5$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$5$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38741 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34083a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34084b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38741(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34084b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38741 c38741 = new C38741(this.f34084b, continuation);
                        c38741.f34083a = obj;
                        return c38741;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38741 c38741 = (C38741) create((b6a) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38741.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:100:0x0365  */
                    /* JADX WARN: Code duplicated, block: B:103:0x039e  */
                    /* JADX WARN: Code duplicated, block: B:59:0x022b  */
                    /* JADX WARN: Code duplicated, block: B:61:0x0238  */
                    /* JADX WARN: Code duplicated, block: B:63:0x0249  */
                    /* JADX WARN: Code duplicated, block: B:66:0x0257  */
                    /* JADX WARN: Code duplicated, block: B:68:0x025e  */
                    /* JADX WARN: Code duplicated, block: B:70:0x0278  */
                    /* JADX WARN: Code duplicated, block: B:73:0x0280  */
                    /* JADX WARN: Code duplicated, block: B:77:0x0292  */
                    /* JADX WARN: Code duplicated, block: B:78:0x02a3  */
                    /* JADX WARN: Code duplicated, block: B:80:0x02bb  */
                    /* JADX WARN: Code duplicated, block: B:85:0x02ee  */
                    /* JADX WARN: Code duplicated, block: B:87:0x0303  */
                    /* JADX WARN: Code duplicated, block: B:88:0x0311  */
                    /* JADX WARN: Code duplicated, block: B:91:0x031d  */
                    /* JADX WARN: Code duplicated, block: B:95:0x033c  */
                    /* JADX WARN: Code duplicated, block: B:96:0x0342  */
                    /* JADX WARN: Code duplicated, block: B:99:0x035b  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        int i;
                        Object next;
                        Object next2;
                        Object obj2;
                        int measuredWidth;
                        FrameLayout.LayoutParams layoutParams;
                        int i2;
                        int iM14419b;
                        int iM14419b2;
                        Rect rect;
                        d7a d7aVar;
                        int measuredWidth2;
                        int iWidth;
                        int iM14419b3;
                        int iM14419b4;
                        b6a b6aVar = (b6a) this.f34083a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        v48 v48Var = this.f34084b.f34008j0;
                        if (v48Var == null) {
                            fa4.m11636J("toolTipsViewManager");
                            throw null;
                        }
                        HashMap map = (HashMap) v48Var.f64851h;
                        HashMap map2 = (HashMap) v48Var.f64852i;
                        TooltipContainer tooltipContainer = (TooltipContainer) v48Var.f64847d;
                        MainActivity mainActivity = (MainActivity) v48Var.f64845b;
                        b6aVar.getClass();
                        ArrayList arrayList = v48Var.f64844a;
                        Iterator it = arrayList.iterator();
                        int i3 = 1;
                        boolean z = true;
                        while (true) {
                            i = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            b6a b6aVar2 = (b6a) it.next();
                            if (b6aVar2.m3373c().m24947b() != TooltipStep.SentenceModeHighlight && b6aVar2.m3373c().m24947b() != TooltipStep.ReviewMenuHighlight && b6aVar2.m3373c().m24947b() != TooltipStep.PlayAudioHighlight) {
                                z = false;
                            }
                        }
                        if (map.get(b6aVar.m3373c().m24947b()) == null) {
                            Iterator it2 = arrayList.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (((b6a) next).m3373c().m24947b() != b6aVar.m3373c().m24947b());
                            if (next == null) {
                                Iterator it3 = arrayList.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it3.next();
                                } while (!((b6a) next2).m3377g());
                                if (next2 == null && z) {
                                    if (b6aVar.m3377g()) {
                                        v48Var.m23099b();
                                    }
                                    u91.m22606X0(new cg7(b6aVar, 29), arrayList);
                                    arrayList.add(b6aVar);
                                    View view = (View) v48Var.f64846c;
                                    dw6 dw6Var = new dw6(b6aVar, 16);
                                    WeakHashMap weakHashMap = dta.f36217a;
                                    wsa.m24145c(view, dw6Var);
                                    int iM14419b5 = (int) jfa.m14419b(mainActivity, 5);
                                    b6aVar.m3376f().left -= iM14419b5;
                                    b6aVar.m3376f().right += iM14419b5;
                                    if (b6aVar.m3377g()) {
                                        obj2 = null;
                                        v48Var.f64853j = new t6a(mainActivity, b6aVar.m3376f());
                                        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
                                        t6a t6aVar = (t6a) v48Var.f64853j;
                                        if (t6aVar != null) {
                                            t6aVar.setOnTouchListener(new ew7(i3, b6aVar, v48Var));
                                        }
                                        tooltipContainer.addView((t6a) v48Var.f64853j, layoutParams2);
                                        t6a t6aVar2 = (t6a) v48Var.f64853j;
                                        if (t6aVar2 != null) {
                                            t6aVar2.setAlpha(0.0f);
                                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(t6aVar2, "alpha", 0.0f, 1.0f);
                                            objectAnimatorOfFloat.getClass();
                                            objectAnimatorOfFloat.setDuration(300L);
                                            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                                            objectAnimatorOfFloat.addListener(new q5a(t6aVar2, i));
                                            objectAnimatorOfFloat.start();
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                    switch (p5a.f55621a[b6aVar.m3373c().m24946a().m18928b().ordinal()]) {
                                        case 1:
                                            y6a y6aVar = new y6a(mainActivity, b6aVar.m3376f(), 0);
                                            tooltipContainer.addView(y6aVar);
                                            map2.put(b6aVar.m3373c().m24947b(), y6aVar);
                                            if (b6aVar.m3373c().m24946a().m18929c().length() > 0) {
                                                measuredWidth = tooltipContainer.getMeasuredWidth();
                                                if (b6aVar.m3372b()) {
                                                    iWidth = b6aVar.m3376f().width();
                                                    iM14419b3 = (int) jfa.m14419b(mainActivity, 80);
                                                    if (iWidth < iM14419b3) {
                                                        iWidth = iM14419b3;
                                                    }
                                                    measuredWidth = iWidth + ((int) jfa.m14419b(mainActivity, 80));
                                                    iM14419b4 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (measuredWidth > iM14419b4) {
                                                        measuredWidth = iM14419b4;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(measuredWidth, -2);
                                                } else {
                                                    i2 = (measuredWidth - b6aVar.m3375e().left) - b6aVar.m3375e().right;
                                                    iM14419b = (int) jfa.m14419b(mainActivity, 120);
                                                    if (i2 < iM14419b) {
                                                        i2 = iM14419b;
                                                    }
                                                    iM14419b2 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (i2 > iM14419b2) {
                                                        i2 = iM14419b2;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(i2, -2);
                                                }
                                                rect = new Rect();
                                                if (b6aVar.m3372b()) {
                                                    rect.left = b6aVar.m3376f().left;
                                                    rect.right = b6aVar.m3376f().right;
                                                } else {
                                                    layoutParams.leftMargin = b6aVar.m3375e().left;
                                                    layoutParams.rightMargin = b6aVar.m3375e().right;
                                                    if (b6aVar.m3375e().left == 0 && b6aVar.m3375e().right > 0) {
                                                        layoutParams.gravity = 8388613;
                                                    }
                                                }
                                                v48Var.f64854k = new d7a(mainActivity, b6aVar.m3373c(), new vg1(16, v48Var, b6aVar));
                                                map.put(b6aVar.m3373c().m24947b(), (d7a) v48Var.f64854k);
                                                d7aVar = (d7a) v48Var.f64854k;
                                                if (d7aVar != null) {
                                                    d7aVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    if (b6aVar.m3375e().bottom != 0) {
                                                        layoutParams.topMargin = b6aVar.m3376f().top - d7aVar.getMeasuredHeight();
                                                    } else {
                                                        layoutParams.topMargin = b6aVar.m3375e().top;
                                                    }
                                                    if (rect.left != 0 && rect.right != 0) {
                                                        measuredWidth2 = (d7aVar.getMeasuredWidth() - b6aVar.m3376f().width()) / 2;
                                                        if (rect.left - measuredWidth2 > jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.leftMargin = rect.left - measuredWidth2;
                                                        } else {
                                                            layoutParams.leftMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        }
                                                        if (rect.right + measuredWidth2 > tooltipContainer.getMeasuredWidth() - jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.gravity = 8388613;
                                                            layoutParams.rightMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        } else {
                                                            layoutParams.rightMargin = rect.right + measuredWidth2;
                                                        }
                                                    }
                                                    tooltipContainer.addView(d7aVar, layoutParams);
                                                    d7aVar.setAlpha(0.0f);
                                                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(d7aVar, "alpha", 0.0f, 1.0f);
                                                    objectAnimatorOfFloat2.getClass();
                                                    objectAnimatorOfFloat2.setDuration(500L);
                                                    objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                                                    objectAnimatorOfFloat2.addListener(new q5a(d7aVar, 1));
                                                    objectAnimatorOfFloat2.start();
                                                    if (b6aVar.m3374d()) {
                                                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(d7aVar, "translationY", 10.0f);
                                                        objectAnimatorOfFloat3.setDuration(1000L);
                                                        objectAnimatorOfFloat3.setRepeatMode(2);
                                                        objectAnimatorOfFloat3.setRepeatCount(-1);
                                                        objectAnimatorOfFloat3.setInterpolator(new qz2(2));
                                                        objectAnimatorOfFloat3.start();
                                                    }
                                                }
                                            }
                                            break;
                                        case 2:
                                            y6a y6aVar2 = new y6a(mainActivity, b6aVar.m3376f(), 1);
                                            tooltipContainer.addView(y6aVar2);
                                            map2.put(b6aVar.m3373c().m24947b(), y6aVar2);
                                            if (b6aVar.m3373c().m24946a().m18929c().length() > 0) {
                                                measuredWidth = tooltipContainer.getMeasuredWidth();
                                                if (b6aVar.m3372b()) {
                                                    iWidth = b6aVar.m3376f().width();
                                                    iM14419b3 = (int) jfa.m14419b(mainActivity, 80);
                                                    if (iWidth < iM14419b3) {
                                                        iWidth = iM14419b3;
                                                    }
                                                    measuredWidth = iWidth + ((int) jfa.m14419b(mainActivity, 80));
                                                    iM14419b4 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (measuredWidth > iM14419b4) {
                                                        measuredWidth = iM14419b4;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(measuredWidth, -2);
                                                } else {
                                                    i2 = (measuredWidth - b6aVar.m3375e().left) - b6aVar.m3375e().right;
                                                    iM14419b = (int) jfa.m14419b(mainActivity, 120);
                                                    if (i2 < iM14419b) {
                                                        i2 = iM14419b;
                                                    }
                                                    iM14419b2 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (i2 > iM14419b2) {
                                                        i2 = iM14419b2;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(i2, -2);
                                                }
                                                rect = new Rect();
                                                if (b6aVar.m3372b()) {
                                                    rect.left = b6aVar.m3376f().left;
                                                    rect.right = b6aVar.m3376f().right;
                                                } else {
                                                    layoutParams.leftMargin = b6aVar.m3375e().left;
                                                    layoutParams.rightMargin = b6aVar.m3375e().right;
                                                    if (b6aVar.m3375e().left == 0) {
                                                        layoutParams.gravity = 8388613;
                                                    }
                                                }
                                                v48Var.f64854k = new d7a(mainActivity, b6aVar.m3373c(), new vg1(16, v48Var, b6aVar));
                                                map.put(b6aVar.m3373c().m24947b(), (d7a) v48Var.f64854k);
                                                d7aVar = (d7a) v48Var.f64854k;
                                                if (d7aVar != null) {
                                                    d7aVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    if (b6aVar.m3375e().bottom != 0) {
                                                        layoutParams.topMargin = b6aVar.m3376f().top - d7aVar.getMeasuredHeight();
                                                    } else {
                                                        layoutParams.topMargin = b6aVar.m3375e().top;
                                                    }
                                                    if (rect.left != 0) {
                                                        measuredWidth2 = (d7aVar.getMeasuredWidth() - b6aVar.m3376f().width()) / 2;
                                                        if (rect.left - measuredWidth2 > jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.leftMargin = rect.left - measuredWidth2;
                                                        } else {
                                                            layoutParams.leftMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        }
                                                        if (rect.right + measuredWidth2 > tooltipContainer.getMeasuredWidth() - jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.gravity = 8388613;
                                                            layoutParams.rightMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        } else {
                                                            layoutParams.rightMargin = rect.right + measuredWidth2;
                                                        }
                                                    }
                                                    tooltipContainer.addView(d7aVar, layoutParams);
                                                    d7aVar.setAlpha(0.0f);
                                                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(d7aVar, "alpha", 0.0f, 1.0f);
                                                    objectAnimatorOfFloat4.getClass();
                                                    objectAnimatorOfFloat4.setDuration(500L);
                                                    objectAnimatorOfFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                                                    objectAnimatorOfFloat4.addListener(new q5a(d7aVar, 1));
                                                    objectAnimatorOfFloat4.start();
                                                    if (b6aVar.m3374d()) {
                                                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(d7aVar, "translationY", 10.0f);
                                                        objectAnimatorOfFloat5.setDuration(1000L);
                                                        objectAnimatorOfFloat5.setRepeatMode(2);
                                                        objectAnimatorOfFloat5.setRepeatCount(-1);
                                                        objectAnimatorOfFloat5.setInterpolator(new qz2(2));
                                                        objectAnimatorOfFloat5.start();
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            x6a x6aVar = new x6a(mainActivity, b6aVar.m3376f());
                                            tooltipContainer.addView(x6aVar);
                                            map2.put(b6aVar.m3373c().m24947b(), x6aVar);
                                            if (b6aVar.m3373c().m24946a().m18929c().length() > 0) {
                                                measuredWidth = tooltipContainer.getMeasuredWidth();
                                                if (b6aVar.m3372b()) {
                                                    iWidth = b6aVar.m3376f().width();
                                                    iM14419b3 = (int) jfa.m14419b(mainActivity, 80);
                                                    if (iWidth < iM14419b3) {
                                                        iWidth = iM14419b3;
                                                    }
                                                    measuredWidth = iWidth + ((int) jfa.m14419b(mainActivity, 80));
                                                    iM14419b4 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (measuredWidth > iM14419b4) {
                                                        measuredWidth = iM14419b4;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(measuredWidth, -2);
                                                } else {
                                                    i2 = (measuredWidth - b6aVar.m3375e().left) - b6aVar.m3375e().right;
                                                    iM14419b = (int) jfa.m14419b(mainActivity, 120);
                                                    if (i2 < iM14419b) {
                                                        i2 = iM14419b;
                                                    }
                                                    iM14419b2 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (i2 > iM14419b2) {
                                                        i2 = iM14419b2;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(i2, -2);
                                                }
                                                rect = new Rect();
                                                if (b6aVar.m3372b()) {
                                                    rect.left = b6aVar.m3376f().left;
                                                    rect.right = b6aVar.m3376f().right;
                                                } else {
                                                    layoutParams.leftMargin = b6aVar.m3375e().left;
                                                    layoutParams.rightMargin = b6aVar.m3375e().right;
                                                    if (b6aVar.m3375e().left == 0) {
                                                        layoutParams.gravity = 8388613;
                                                    }
                                                }
                                                v48Var.f64854k = new d7a(mainActivity, b6aVar.m3373c(), new vg1(16, v48Var, b6aVar));
                                                map.put(b6aVar.m3373c().m24947b(), (d7a) v48Var.f64854k);
                                                d7aVar = (d7a) v48Var.f64854k;
                                                if (d7aVar != null) {
                                                    d7aVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    if (b6aVar.m3375e().bottom != 0) {
                                                        layoutParams.topMargin = b6aVar.m3376f().top - d7aVar.getMeasuredHeight();
                                                    } else {
                                                        layoutParams.topMargin = b6aVar.m3375e().top;
                                                    }
                                                    if (rect.left != 0) {
                                                        measuredWidth2 = (d7aVar.getMeasuredWidth() - b6aVar.m3376f().width()) / 2;
                                                        if (rect.left - measuredWidth2 > jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.leftMargin = rect.left - measuredWidth2;
                                                        } else {
                                                            layoutParams.leftMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        }
                                                        if (rect.right + measuredWidth2 > tooltipContainer.getMeasuredWidth() - jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.gravity = 8388613;
                                                            layoutParams.rightMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        } else {
                                                            layoutParams.rightMargin = rect.right + measuredWidth2;
                                                        }
                                                    }
                                                    tooltipContainer.addView(d7aVar, layoutParams);
                                                    d7aVar.setAlpha(0.0f);
                                                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(d7aVar, "alpha", 0.0f, 1.0f);
                                                    objectAnimatorOfFloat6.getClass();
                                                    objectAnimatorOfFloat6.setDuration(500L);
                                                    objectAnimatorOfFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                                                    objectAnimatorOfFloat6.addListener(new q5a(d7aVar, 1));
                                                    objectAnimatorOfFloat6.start();
                                                    if (b6aVar.m3374d()) {
                                                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(d7aVar, "translationY", 10.0f);
                                                        objectAnimatorOfFloat7.setDuration(1000L);
                                                        objectAnimatorOfFloat7.setRepeatMode(2);
                                                        objectAnimatorOfFloat7.setRepeatCount(-1);
                                                        objectAnimatorOfFloat7.setInterpolator(new qz2(2));
                                                        objectAnimatorOfFloat7.start();
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            a7a a7aVar = new a7a(mainActivity, b6aVar.m3376f());
                                            tooltipContainer.addView(a7aVar);
                                            map2.put(b6aVar.m3373c().m24947b(), a7aVar);
                                            if (b6aVar.m3373c().m24946a().m18929c().length() > 0) {
                                                measuredWidth = tooltipContainer.getMeasuredWidth();
                                                if (b6aVar.m3372b()) {
                                                    iWidth = b6aVar.m3376f().width();
                                                    iM14419b3 = (int) jfa.m14419b(mainActivity, 80);
                                                    if (iWidth < iM14419b3) {
                                                        iWidth = iM14419b3;
                                                    }
                                                    measuredWidth = iWidth + ((int) jfa.m14419b(mainActivity, 80));
                                                    iM14419b4 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (measuredWidth > iM14419b4) {
                                                        measuredWidth = iM14419b4;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(measuredWidth, -2);
                                                } else {
                                                    i2 = (measuredWidth - b6aVar.m3375e().left) - b6aVar.m3375e().right;
                                                    iM14419b = (int) jfa.m14419b(mainActivity, 120);
                                                    if (i2 < iM14419b) {
                                                        i2 = iM14419b;
                                                    }
                                                    iM14419b2 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (i2 > iM14419b2) {
                                                        i2 = iM14419b2;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(i2, -2);
                                                }
                                                rect = new Rect();
                                                if (b6aVar.m3372b()) {
                                                    rect.left = b6aVar.m3376f().left;
                                                    rect.right = b6aVar.m3376f().right;
                                                } else {
                                                    layoutParams.leftMargin = b6aVar.m3375e().left;
                                                    layoutParams.rightMargin = b6aVar.m3375e().right;
                                                    if (b6aVar.m3375e().left == 0) {
                                                        layoutParams.gravity = 8388613;
                                                    }
                                                }
                                                v48Var.f64854k = new d7a(mainActivity, b6aVar.m3373c(), new vg1(16, v48Var, b6aVar));
                                                map.put(b6aVar.m3373c().m24947b(), (d7a) v48Var.f64854k);
                                                d7aVar = (d7a) v48Var.f64854k;
                                                if (d7aVar != null) {
                                                    d7aVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    if (b6aVar.m3375e().bottom != 0) {
                                                        layoutParams.topMargin = b6aVar.m3376f().top - d7aVar.getMeasuredHeight();
                                                    } else {
                                                        layoutParams.topMargin = b6aVar.m3375e().top;
                                                    }
                                                    if (rect.left != 0) {
                                                        measuredWidth2 = (d7aVar.getMeasuredWidth() - b6aVar.m3376f().width()) / 2;
                                                        if (rect.left - measuredWidth2 > jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.leftMargin = rect.left - measuredWidth2;
                                                        } else {
                                                            layoutParams.leftMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        }
                                                        if (rect.right + measuredWidth2 > tooltipContainer.getMeasuredWidth() - jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.gravity = 8388613;
                                                            layoutParams.rightMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        } else {
                                                            layoutParams.rightMargin = rect.right + measuredWidth2;
                                                        }
                                                    }
                                                    tooltipContainer.addView(d7aVar, layoutParams);
                                                    d7aVar.setAlpha(0.0f);
                                                    ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(d7aVar, "alpha", 0.0f, 1.0f);
                                                    objectAnimatorOfFloat8.getClass();
                                                    objectAnimatorOfFloat8.setDuration(500L);
                                                    objectAnimatorOfFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                                                    objectAnimatorOfFloat8.addListener(new q5a(d7aVar, 1));
                                                    objectAnimatorOfFloat8.start();
                                                    if (b6aVar.m3374d()) {
                                                        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(d7aVar, "translationY", 10.0f);
                                                        objectAnimatorOfFloat9.setDuration(1000L);
                                                        objectAnimatorOfFloat9.setRepeatMode(2);
                                                        objectAnimatorOfFloat9.setRepeatCount(-1);
                                                        objectAnimatorOfFloat9.setInterpolator(new qz2(2));
                                                        objectAnimatorOfFloat9.start();
                                                    }
                                                }
                                            }
                                            break;
                                        case 5:
                                            b7a b7aVar = new b7a(mainActivity, b6aVar.m3376f());
                                            tooltipContainer.addView(b7aVar);
                                            map2.put(b6aVar.m3373c().m24947b(), b7aVar);
                                            if (b6aVar.m3373c().m24946a().m18929c().length() > 0) {
                                                measuredWidth = tooltipContainer.getMeasuredWidth();
                                                if (b6aVar.m3372b()) {
                                                    iWidth = b6aVar.m3376f().width();
                                                    iM14419b3 = (int) jfa.m14419b(mainActivity, 80);
                                                    if (iWidth < iM14419b3) {
                                                        iWidth = iM14419b3;
                                                    }
                                                    measuredWidth = iWidth + ((int) jfa.m14419b(mainActivity, 80));
                                                    iM14419b4 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (measuredWidth > iM14419b4) {
                                                        measuredWidth = iM14419b4;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(measuredWidth, -2);
                                                } else {
                                                    i2 = (measuredWidth - b6aVar.m3375e().left) - b6aVar.m3375e().right;
                                                    iM14419b = (int) jfa.m14419b(mainActivity, 120);
                                                    if (i2 < iM14419b) {
                                                        i2 = iM14419b;
                                                    }
                                                    iM14419b2 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (i2 > iM14419b2) {
                                                        i2 = iM14419b2;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(i2, -2);
                                                }
                                                rect = new Rect();
                                                if (b6aVar.m3372b()) {
                                                    rect.left = b6aVar.m3376f().left;
                                                    rect.right = b6aVar.m3376f().right;
                                                } else {
                                                    layoutParams.leftMargin = b6aVar.m3375e().left;
                                                    layoutParams.rightMargin = b6aVar.m3375e().right;
                                                    if (b6aVar.m3375e().left == 0) {
                                                        layoutParams.gravity = 8388613;
                                                    }
                                                }
                                                v48Var.f64854k = new d7a(mainActivity, b6aVar.m3373c(), new vg1(16, v48Var, b6aVar));
                                                map.put(b6aVar.m3373c().m24947b(), (d7a) v48Var.f64854k);
                                                d7aVar = (d7a) v48Var.f64854k;
                                                if (d7aVar != null) {
                                                    d7aVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    if (b6aVar.m3375e().bottom != 0) {
                                                        layoutParams.topMargin = b6aVar.m3376f().top - d7aVar.getMeasuredHeight();
                                                    } else {
                                                        layoutParams.topMargin = b6aVar.m3375e().top;
                                                    }
                                                    if (rect.left != 0) {
                                                        measuredWidth2 = (d7aVar.getMeasuredWidth() - b6aVar.m3376f().width()) / 2;
                                                        if (rect.left - measuredWidth2 > jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.leftMargin = rect.left - measuredWidth2;
                                                        } else {
                                                            layoutParams.leftMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        }
                                                        if (rect.right + measuredWidth2 > tooltipContainer.getMeasuredWidth() - jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.gravity = 8388613;
                                                            layoutParams.rightMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        } else {
                                                            layoutParams.rightMargin = rect.right + measuredWidth2;
                                                        }
                                                    }
                                                    tooltipContainer.addView(d7aVar, layoutParams);
                                                    d7aVar.setAlpha(0.0f);
                                                    ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(d7aVar, "alpha", 0.0f, 1.0f);
                                                    objectAnimatorOfFloat10.getClass();
                                                    objectAnimatorOfFloat10.setDuration(500L);
                                                    objectAnimatorOfFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                                                    objectAnimatorOfFloat10.addListener(new q5a(d7aVar, 1));
                                                    objectAnimatorOfFloat10.start();
                                                    if (b6aVar.m3374d()) {
                                                        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(d7aVar, "translationY", 10.0f);
                                                        objectAnimatorOfFloat11.setDuration(1000L);
                                                        objectAnimatorOfFloat11.setRepeatMode(2);
                                                        objectAnimatorOfFloat11.setRepeatCount(-1);
                                                        objectAnimatorOfFloat11.setInterpolator(new qz2(2));
                                                        objectAnimatorOfFloat11.start();
                                                    }
                                                }
                                            }
                                            break;
                                        case 6:
                                            y6a y6aVar3 = new y6a(mainActivity, b6aVar.m3376f(), 2);
                                            tooltipContainer.addView(y6aVar3);
                                            map2.put(b6aVar.m3373c().m24947b(), y6aVar3);
                                            if (b6aVar.m3373c().m24946a().m18929c().length() > 0) {
                                                measuredWidth = tooltipContainer.getMeasuredWidth();
                                                if (b6aVar.m3372b()) {
                                                    iWidth = b6aVar.m3376f().width();
                                                    iM14419b3 = (int) jfa.m14419b(mainActivity, 80);
                                                    if (iWidth < iM14419b3) {
                                                        iWidth = iM14419b3;
                                                    }
                                                    measuredWidth = iWidth + ((int) jfa.m14419b(mainActivity, 80));
                                                    iM14419b4 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (measuredWidth > iM14419b4) {
                                                        measuredWidth = iM14419b4;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(measuredWidth, -2);
                                                } else {
                                                    i2 = (measuredWidth - b6aVar.m3375e().left) - b6aVar.m3375e().right;
                                                    iM14419b = (int) jfa.m14419b(mainActivity, 120);
                                                    if (i2 < iM14419b) {
                                                        i2 = iM14419b;
                                                    }
                                                    iM14419b2 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (i2 > iM14419b2) {
                                                        i2 = iM14419b2;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(i2, -2);
                                                }
                                                rect = new Rect();
                                                if (b6aVar.m3372b()) {
                                                    rect.left = b6aVar.m3376f().left;
                                                    rect.right = b6aVar.m3376f().right;
                                                } else {
                                                    layoutParams.leftMargin = b6aVar.m3375e().left;
                                                    layoutParams.rightMargin = b6aVar.m3375e().right;
                                                    if (b6aVar.m3375e().left == 0) {
                                                        layoutParams.gravity = 8388613;
                                                    }
                                                }
                                                v48Var.f64854k = new d7a(mainActivity, b6aVar.m3373c(), new vg1(16, v48Var, b6aVar));
                                                map.put(b6aVar.m3373c().m24947b(), (d7a) v48Var.f64854k);
                                                d7aVar = (d7a) v48Var.f64854k;
                                                if (d7aVar != null) {
                                                    d7aVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    if (b6aVar.m3375e().bottom != 0) {
                                                        layoutParams.topMargin = b6aVar.m3376f().top - d7aVar.getMeasuredHeight();
                                                    } else {
                                                        layoutParams.topMargin = b6aVar.m3375e().top;
                                                    }
                                                    if (rect.left != 0) {
                                                        measuredWidth2 = (d7aVar.getMeasuredWidth() - b6aVar.m3376f().width()) / 2;
                                                        if (rect.left - measuredWidth2 > jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.leftMargin = rect.left - measuredWidth2;
                                                        } else {
                                                            layoutParams.leftMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        }
                                                        if (rect.right + measuredWidth2 > tooltipContainer.getMeasuredWidth() - jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.gravity = 8388613;
                                                            layoutParams.rightMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        } else {
                                                            layoutParams.rightMargin = rect.right + measuredWidth2;
                                                        }
                                                    }
                                                    tooltipContainer.addView(d7aVar, layoutParams);
                                                    d7aVar.setAlpha(0.0f);
                                                    ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(d7aVar, "alpha", 0.0f, 1.0f);
                                                    objectAnimatorOfFloat12.getClass();
                                                    objectAnimatorOfFloat12.setDuration(500L);
                                                    objectAnimatorOfFloat12.setInterpolator(new AccelerateDecelerateInterpolator());
                                                    objectAnimatorOfFloat12.addListener(new q5a(d7aVar, 1));
                                                    objectAnimatorOfFloat12.start();
                                                    if (b6aVar.m3374d()) {
                                                        ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(d7aVar, "translationY", 10.0f);
                                                        objectAnimatorOfFloat13.setDuration(1000L);
                                                        objectAnimatorOfFloat13.setRepeatMode(2);
                                                        objectAnimatorOfFloat13.setRepeatCount(-1);
                                                        objectAnimatorOfFloat13.setInterpolator(new qz2(2));
                                                        objectAnimatorOfFloat13.start();
                                                    }
                                                }
                                            }
                                            break;
                                        case 7:
                                            y6a y6aVar4 = new y6a(mainActivity, b6aVar.m3376f(), 3);
                                            tooltipContainer.addView(y6aVar4);
                                            map2.put(b6aVar.m3373c().m24947b(), y6aVar4);
                                            if (b6aVar.m3373c().m24946a().m18929c().length() > 0) {
                                                measuredWidth = tooltipContainer.getMeasuredWidth();
                                                if (b6aVar.m3372b()) {
                                                    iWidth = b6aVar.m3376f().width();
                                                    iM14419b3 = (int) jfa.m14419b(mainActivity, 80);
                                                    if (iWidth < iM14419b3) {
                                                        iWidth = iM14419b3;
                                                    }
                                                    measuredWidth = iWidth + ((int) jfa.m14419b(mainActivity, 80));
                                                    iM14419b4 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (measuredWidth > iM14419b4) {
                                                        measuredWidth = iM14419b4;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(measuredWidth, -2);
                                                } else {
                                                    i2 = (measuredWidth - b6aVar.m3375e().left) - b6aVar.m3375e().right;
                                                    iM14419b = (int) jfa.m14419b(mainActivity, 120);
                                                    if (i2 < iM14419b) {
                                                        i2 = iM14419b;
                                                    }
                                                    iM14419b2 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (i2 > iM14419b2) {
                                                        i2 = iM14419b2;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(i2, -2);
                                                }
                                                rect = new Rect();
                                                if (b6aVar.m3372b()) {
                                                    rect.left = b6aVar.m3376f().left;
                                                    rect.right = b6aVar.m3376f().right;
                                                } else {
                                                    layoutParams.leftMargin = b6aVar.m3375e().left;
                                                    layoutParams.rightMargin = b6aVar.m3375e().right;
                                                    if (b6aVar.m3375e().left == 0) {
                                                        layoutParams.gravity = 8388613;
                                                    }
                                                }
                                                v48Var.f64854k = new d7a(mainActivity, b6aVar.m3373c(), new vg1(16, v48Var, b6aVar));
                                                map.put(b6aVar.m3373c().m24947b(), (d7a) v48Var.f64854k);
                                                d7aVar = (d7a) v48Var.f64854k;
                                                if (d7aVar != null) {
                                                    d7aVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    if (b6aVar.m3375e().bottom != 0) {
                                                        layoutParams.topMargin = b6aVar.m3376f().top - d7aVar.getMeasuredHeight();
                                                    } else {
                                                        layoutParams.topMargin = b6aVar.m3375e().top;
                                                    }
                                                    if (rect.left != 0) {
                                                        measuredWidth2 = (d7aVar.getMeasuredWidth() - b6aVar.m3376f().width()) / 2;
                                                        if (rect.left - measuredWidth2 > jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.leftMargin = rect.left - measuredWidth2;
                                                        } else {
                                                            layoutParams.leftMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        }
                                                        if (rect.right + measuredWidth2 > tooltipContainer.getMeasuredWidth() - jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.gravity = 8388613;
                                                            layoutParams.rightMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        } else {
                                                            layoutParams.rightMargin = rect.right + measuredWidth2;
                                                        }
                                                    }
                                                    tooltipContainer.addView(d7aVar, layoutParams);
                                                    d7aVar.setAlpha(0.0f);
                                                    ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(d7aVar, "alpha", 0.0f, 1.0f);
                                                    objectAnimatorOfFloat14.getClass();
                                                    objectAnimatorOfFloat14.setDuration(500L);
                                                    objectAnimatorOfFloat14.setInterpolator(new AccelerateDecelerateInterpolator());
                                                    objectAnimatorOfFloat14.addListener(new q5a(d7aVar, 1));
                                                    objectAnimatorOfFloat14.start();
                                                    if (b6aVar.m3374d()) {
                                                        ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(d7aVar, "translationY", 10.0f);
                                                        objectAnimatorOfFloat15.setDuration(1000L);
                                                        objectAnimatorOfFloat15.setRepeatMode(2);
                                                        objectAnimatorOfFloat15.setRepeatCount(-1);
                                                        objectAnimatorOfFloat15.setInterpolator(new qz2(2));
                                                        objectAnimatorOfFloat15.start();
                                                    }
                                                }
                                            }
                                            break;
                                        case 8:
                                            if (b6aVar.m3373c().m24946a().m18929c().length() > 0) {
                                                measuredWidth = tooltipContainer.getMeasuredWidth();
                                                if (b6aVar.m3372b()) {
                                                    iWidth = b6aVar.m3376f().width();
                                                    iM14419b3 = (int) jfa.m14419b(mainActivity, 80);
                                                    if (iWidth < iM14419b3) {
                                                        iWidth = iM14419b3;
                                                    }
                                                    measuredWidth = iWidth + ((int) jfa.m14419b(mainActivity, 80));
                                                    iM14419b4 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (measuredWidth > iM14419b4) {
                                                        measuredWidth = iM14419b4;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(measuredWidth, -2);
                                                } else {
                                                    i2 = (measuredWidth - b6aVar.m3375e().left) - b6aVar.m3375e().right;
                                                    iM14419b = (int) jfa.m14419b(mainActivity, 120);
                                                    if (i2 < iM14419b) {
                                                        i2 = iM14419b;
                                                    }
                                                    iM14419b2 = (int) jfa.m14419b(mainActivity, 300);
                                                    if (i2 > iM14419b2) {
                                                        i2 = iM14419b2;
                                                    }
                                                    layoutParams = new FrameLayout.LayoutParams(i2, -2);
                                                }
                                                rect = new Rect();
                                                if (b6aVar.m3372b()) {
                                                    rect.left = b6aVar.m3376f().left;
                                                    rect.right = b6aVar.m3376f().right;
                                                } else {
                                                    layoutParams.leftMargin = b6aVar.m3375e().left;
                                                    layoutParams.rightMargin = b6aVar.m3375e().right;
                                                    if (b6aVar.m3375e().left == 0) {
                                                        layoutParams.gravity = 8388613;
                                                    }
                                                }
                                                v48Var.f64854k = new d7a(mainActivity, b6aVar.m3373c(), new vg1(16, v48Var, b6aVar));
                                                map.put(b6aVar.m3373c().m24947b(), (d7a) v48Var.f64854k);
                                                d7aVar = (d7a) v48Var.f64854k;
                                                if (d7aVar != null) {
                                                    d7aVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    if (b6aVar.m3375e().bottom != 0) {
                                                        layoutParams.topMargin = b6aVar.m3376f().top - d7aVar.getMeasuredHeight();
                                                    } else {
                                                        layoutParams.topMargin = b6aVar.m3375e().top;
                                                    }
                                                    if (rect.left != 0) {
                                                        measuredWidth2 = (d7aVar.getMeasuredWidth() - b6aVar.m3376f().width()) / 2;
                                                        if (rect.left - measuredWidth2 > jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.leftMargin = rect.left - measuredWidth2;
                                                        } else {
                                                            layoutParams.leftMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        }
                                                        if (rect.right + measuredWidth2 > tooltipContainer.getMeasuredWidth() - jfa.m14419b(mainActivity, 5)) {
                                                            layoutParams.gravity = 8388613;
                                                            layoutParams.rightMargin = (int) jfa.m14419b(mainActivity, 5);
                                                        } else {
                                                            layoutParams.rightMargin = rect.right + measuredWidth2;
                                                        }
                                                    }
                                                    tooltipContainer.addView(d7aVar, layoutParams);
                                                    d7aVar.setAlpha(0.0f);
                                                    ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(d7aVar, "alpha", 0.0f, 1.0f);
                                                    objectAnimatorOfFloat16.getClass();
                                                    objectAnimatorOfFloat16.setDuration(500L);
                                                    objectAnimatorOfFloat16.setInterpolator(new AccelerateDecelerateInterpolator());
                                                    objectAnimatorOfFloat16.addListener(new q5a(d7aVar, 1));
                                                    objectAnimatorOfFloat16.start();
                                                    if (b6aVar.m3374d()) {
                                                        ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(d7aVar, "translationY", 10.0f);
                                                        objectAnimatorOfFloat17.setDuration(1000L);
                                                        objectAnimatorOfFloat17.setRepeatMode(2);
                                                        objectAnimatorOfFloat17.setRepeatCount(-1);
                                                        objectAnimatorOfFloat17.setInterpolator(new qz2(2));
                                                        objectAnimatorOfFloat17.start();
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            gm5.m12750e();
                                            return obj2;
                                    }
                                }
                            }
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34082b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass5(this.f34082b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34081a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34082b;
                        c83 c83VarMo8780w = mainActivity.m9802q().f34202d.mo8780w();
                        C38741 c38741 = new C38741(mainActivity, null);
                        this.f34081a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo8780w, c38741, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$6, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$6", m4291f = "MainActivity.kt", m4292l = {276}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass6 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34085a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34086b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$6$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$6$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38751 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34087a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34088b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38751(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34088b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38751 c38751 = new C38751(this.f34088b, continuation);
                        c38751.f34087a = obj;
                        return c38751;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38751 c38751 = (C38751) create((TooltipStep) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38751.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        TooltipStep tooltipStep = (TooltipStep) this.f34087a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        v48 v48Var = this.f34088b.f34008j0;
                        if (v48Var != null) {
                            v48Var.m23100c(tooltipStep);
                            return xfa.f68157a;
                        }
                        fa4.m11636J("toolTipsViewManager");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34086b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass6(this.f34086b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34085a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34086b;
                        c83 c83VarMo8781y0 = mainActivity.m9802q().f34202d.mo8781y0();
                        C38751 c38751 = new C38751(mainActivity, null);
                        this.f34085a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo8781y0, c38751, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$7, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$7", m4291f = "MainActivity.kt", m4292l = {282}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass7 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34089a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34090b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$7$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$7$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38761 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ MainActivity f34091a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38761(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34091a = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C38761(this.f34091a, continuation);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38761 c38761 = (C38761) create((xfa) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38761.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        v48 v48Var = this.f34091a.f34008j0;
                        if (v48Var != null) {
                            v48Var.m23099b();
                            return xfa.f68157a;
                        }
                        fa4.m11636J("toolTipsViewManager");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34090b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass7(this.f34090b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34089a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34090b;
                        c83 c83VarMo8736D1 = mainActivity.m9802q().f34202d.mo8736D1();
                        C38761 c38761 = new C38761(mainActivity, null);
                        this.f34089a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo8736D1, c38761, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$8, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$8", m4291f = "MainActivity.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass8 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34092a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34093b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$8$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$8$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38771 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34094a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34095b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38771(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34095b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38771 c38771 = new C38771(this.f34095b, continuation);
                        c38771.f34094a = obj;
                        return c38771;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38771 c38771 = (C38771) create((List) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38771.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        List<TooltipStep> list = (List) this.f34094a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        for (TooltipStep tooltipStep : list) {
                            v48 v48Var = this.f34095b.f34008j0;
                            if (v48Var == null) {
                                fa4.m11636J("toolTipsViewManager");
                                throw null;
                            }
                            v48Var.m23100c(tooltipStep);
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass8(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34093b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass8(this.f34093b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass8) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34092a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34093b;
                        c83 c83VarMo8771q0 = mainActivity.m9802q().f34202d.mo8771q0();
                        C38771 c38771 = new C38771(mainActivity, null);
                        this.f34092a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo8771q0, c38771, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$9, reason: invalid class name */
            @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$9", m4291f = "MainActivity.kt", m4292l = {296}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass9 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f34096a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MainActivity f34097b;

                /* JADX INFO: renamed from: com.lingq.ui.MainActivity$onCreate$6$1$9$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.ui.MainActivity$onCreate$6$1$9$1", m4291f = "MainActivity.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38781 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public /* synthetic */ Object f34098a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ MainActivity f34099b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38781(MainActivity mainActivity, Continuation continuation) {
                        super(2, continuation);
                        this.f34099b = mainActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C38781 c38781 = new C38781(this.f34099b, continuation);
                        c38781.f34098a = obj;
                        return c38781;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) throws Throwable {
                        C38781 c38781 = (C38781) create((TooltipStep) obj, (Continuation) obj2);
                        xfa xfaVar = xfa.f68157a;
                        c38781.invokeSuspend(xfaVar);
                        return xfaVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        TooltipStep tooltipStep = (TooltipStep) this.f34098a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        AbstractC3193b.m15359b(obj);
                        MainActivity mainActivity = this.f34099b;
                        v48 v48Var = mainActivity.f34008j0;
                        Object obj2 = null;
                        if (v48Var == null) {
                            fa4.m11636J("toolTipsViewManager");
                            throw null;
                        }
                        tooltipStep.getClass();
                        d7a d7aVar = (d7a) ((HashMap) v48Var.f64851h).get(tooltipStep);
                        if (d7aVar != null) {
                            if (d7aVar.getVisibility() != 0) {
                                for (Object obj3 : v48Var.f64844a) {
                                    if (((b6a) obj3).m3373c().m24947b() == tooltipStep) {
                                        obj2 = obj3;
                                        break;
                                    }
                                }
                                if (obj2 == null) {
                                    if (((HashMap) v48Var.f64852i).get(tooltipStep) != null) {
                                    }
                                }
                            }
                            C2889e c2889eM9802q = mainActivity.m9802q();
                            c2889eM9802q.getClass();
                            c2889eM9802q.f34202d.mo8742L(tooltipStep);
                        } else if (((HashMap) v48Var.f64852i).get(tooltipStep) != null) {
                            C2889e c2889eM9802q2 = mainActivity.m9802q();
                            c2889eM9802q2.getClass();
                            c2889eM9802q2.f34202d.mo8742L(tooltipStep);
                        }
                        return xfa.f68157a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass9(MainActivity mainActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f34097b = mainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass9(this.f34097b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass9) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f34096a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        int i2 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f34097b;
                        c83 c83VarMo8778u0 = mainActivity.m9802q().f34202d.mo8778u0();
                        C38781 c38781 = new C38781(mainActivity, null);
                        this.f34096a = 1;
                        if (AbstractC3224d.m15529h(c83VarMo8778u0, c38781, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainActivity mainActivity, Continuation continuation) {
                super(2, continuation);
                this.f34016b = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34016b, continuation);
                anonymousClass1.f34015a = obj;
                return anonymousClass1;
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((un1) obj, (Continuation) obj2);
                xfa xfaVar = xfa.f68157a;
                anonymousClass1.invokeSuspend(xfaVar);
                return xfaVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                un1 un1Var = (un1) this.f34015a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                AbstractC3193b.m15359b(obj);
                MainActivity mainActivity = this.f34016b;
                wfb.m23926u(un1Var, null, null, new C38561(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass2(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass3(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass4(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass5(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass6(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass7(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass8(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass9(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass10(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass11(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass12(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass13(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass14(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass15(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass16(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass17(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass18(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass19(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass20(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass21(mainActivity, null), 3);
                wfb.m23926u(un1Var, null, null, new AnonymousClass22(mainActivity, null), 3);
                return xfa.f68157a;
            }
        }

        public C28816(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new C28816(continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C28816) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f34013a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                MainActivity mainActivity = MainActivity.this;
                wb5 wb5Var = mainActivity.f62130a;
                Lifecycle$State lifecycle$State = Lifecycle$State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(mainActivity, null);
                this.f34013a = 1;
                if (AbstractC0708b.m2509b(wb5Var, lifecycle$State, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    public MainActivity() {
        int i = 1;
        m22669g(new C2892cp(this, i));
        this.f33998Z = new w41(y38.m24933a(C2889e.class), new bp5(this, 2), new bp5(this, i), new bp5(this, 3));
        this.f33999a0 = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new bp5(this, 0));
        this.f34001c0 = "";
        this.f34009k0 = Color.argb(230, 255, 255, 255);
        this.f34010l0 = Color.argb(128, 27, 27, 27);
    }

    @Override // p000.AbstractActivityC2935dp, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ContextWrapper contextWrapper;
        context.getClass();
        String str = (String) ah9.f674c.getValue();
        if (vk9.m23391n0(str)) {
            super.attachBaseContext(context);
            return;
        }
        if (str.equals("")) {
            contextWrapper = new ContextWrapper(context);
        } else {
            String strReplace = str.replace('_', '-');
            strReplace.getClass();
            Locale localeForLanguageTag = Locale.forLanguageTag(strReplace);
            Locale.setDefault(localeForLanguageTag);
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(localeForLanguageTag);
            contextWrapper = new ContextWrapper(context.createConfigurationContext(configuration));
        }
        super.attachBaseContext(contextWrapper);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        return m9799m().mo6995b();
    }

    @Override // p000.uc1, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        zta ztaVarMo2102d = super.mo2102d();
        cy1 cy1Var = (cy1) ((s92) ci8.m4741z(this, s92.class));
        es4 es4VarM9932a = cy1Var.m9932a();
        b64 b64Var = new b64(cy1Var.f34704a, cy1Var.f34705b);
        ztaVarMo2102d.getClass();
        return new nt3(es4VarM9932a, ztaVarMo2102d, b64Var);
    }

    /* JADX INFO: renamed from: m */
    public final C3524r6 m9799m() {
        if (this.f33995W == null) {
            synchronized (this.f33996X) {
                try {
                    if (this.f33995W == null) {
                        this.f33995W = new C3524r6(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f33995W;
    }

    /* JADX INFO: renamed from: n */
    public final hm5 m9800n() {
        hm5 hm5Var = this.f34005g0;
        if (hm5Var != null) {
            return hm5Var;
        }
        fa4.m11636J("analytics");
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final C3822z6 m9801o() {
        Object value = this.f33999a0.getValue();
        value.getClass();
        return (C3822z6) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30, types: [uo5] */
    @Override // p000.id3, p000.uc1, p000.tc1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        kc0 hvbVar;
        qo2 ro2Var;
        int i = Build.VERSION.SDK_INT;
        fs6 lf9Var = i >= 31 ? new lf9(this) : new fs6(this);
        lf9Var.mo12119z();
        final int i2 = 0;
        final int i3 = 1;
        final boolean z = (getResources().getConfiguration().uiMode & 48) == 32;
        kp9 kp9Var = new kp9(0, new vi3() { // from class: xo5
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                int i4 = i2;
                boolean z2 = z;
                Resources resources = (Resources) obj;
                switch (i4) {
                    case 0:
                        int i5 = MainActivity.f33994m0;
                        resources.getClass();
                        break;
                    default:
                        int i6 = MainActivity.f33994m0;
                        resources.getClass();
                        break;
                }
                return Boolean.valueOf(z2);
            }
        }, 0);
        kp9 kp9Var2 = new kp9(this.f34009k0, new vi3() { // from class: xo5
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                int i4 = i3;
                boolean z2 = z;
                Resources resources = (Resources) obj;
                switch (i4) {
                    case 0:
                        int i5 = MainActivity.f33994m0;
                        resources.getClass();
                        break;
                    default:
                        int i6 = MainActivity.f33994m0;
                        resources.getClass();
                        break;
                }
                return Boolean.valueOf(z2);
            }
        }, this.f34010l0);
        qo2 qo2Var = no2.f53044a;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        qo2 qo2Var2 = no2.f53044a;
        if (qo2Var2 == null) {
            if (i >= 35) {
                ro2Var = new so2();
            } else {
                ro2Var = i >= 30 ? new ro2() : new qo2();
            }
            qo2Var2 = ro2Var;
            no2.f53044a = qo2Var2;
        }
        qo2 qo2Var3 = qo2Var2;
        lb0 lb0Var = new lb0(qo2Var3, kp9Var, kp9Var2, this, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i4 = 0;
        while (true) {
            if (i4 >= viewGroup.getChildCount()) {
                mo2 mo2Var = new mo2(lb0Var, viewGroup.getContext());
                mo2Var.setTag(qo2Var3);
                mo2Var.setVisibility(8);
                mo2Var.setWillNotDraw(true);
                viewGroup.addView(mo2Var);
                break;
            }
            int i5 = i4 + 1;
            View childAt = viewGroup.getChildAt(i4);
            if (childAt == null) {
                v63.m23128b();
                return;
            } else if (childAt.getTag() instanceof oo2) {
                break;
            } else {
                i4 = i5;
            }
        }
        lb0Var.run();
        Window window = getWindow();
        window.getClass();
        qo2Var3.mo18182a(window);
        m9804u(bundle);
        lf9Var.mo12097L(new ro5(this));
        ((C1240a) m9800n()).m7028i(false);
        setContentView(m9801o().f70965a);
        setRequestedOrientation(getResources().getBoolean(R$bool.is_phone) ? 1 : -1);
        ConstraintLayout constraintLayout = m9801o().f70965a;
        ro5 ro5Var = new ro5(this);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(constraintLayout, ro5Var);
        cc4 cc4Var = new cc4(this);
        hm5 hm5VarM9800n = m9800n();
        pc0 pc0Var = new pc0();
        pc0Var.f55938b = this;
        pc0Var.f55939c = cc4Var;
        pc0Var.f55940d = hm5VarM9800n;
        C3370nf c3370nf = new C3370nf(this);
        c3370nf.f52664c = pc0Var;
        c3370nf.f52662a = new e41(14);
        if (((pc0) c3370nf.f52664c) == null) {
            C3386nv.m17626m("Please provide a valid listener for purchases updates.");
            throw null;
        }
        if (((e41) c3370nf.f52662a) == null) {
            C3386nv.m17626m("Pending purchases for one-time products must be supported.");
            throw null;
        }
        ((e41) c3370nf.f52662a).getClass();
        pc0 pc0Var2 = (pc0) c3370nf.f52664c;
        e41 e41Var = (e41) c3370nf.f52662a;
        if (pc0Var2 != null) {
            pc0 pc0Var3 = (pc0) c3370nf.f52664c;
            hvbVar = c3370nf.m17404a() ? new hvb(e41Var, this, pc0Var3, c3370nf) : new kc0(e41Var, this, pc0Var3, c3370nf);
        } else {
            hvbVar = c3370nf.m17404a() ? new hvb(e41Var, this, c3370nf) : new kc0(e41Var, this, c3370nf);
        }
        pc0Var.f55941e = hvbVar;
        hvbVar.mo13517e(new b64(pc0Var, new RunnableC0002a0(pc0Var, 5)));
        this.f34000b0 = pc0Var;
        C3509qs c3509qs = this.f34004f0;
        if (c3509qs == null) {
            fa4.m11636J("appSettings");
            throw null;
        }
        View rootView = m9801o().f70965a.getRootView();
        rootView.getClass();
        this.f34008j0 = new v48(this, c3509qs, rootView, m9801o().f70966b, new ro5(this), new ro5(this), new ro5(this));
        ob1 ob1Var = this.f34003e0;
        if (ob1Var == null) {
            fa4.m11636J("utils");
            throw null;
        }
        if (!ob1Var.m17896j()) {
            C3509qs c3509qs2 = this.f34004f0;
            if (c3509qs2 == null) {
                fa4.m11636J("appSettings");
                throw null;
            }
            if (!c3509qs2.f58118b.getBoolean("shownMigrationDialog", false)) {
                fr5 fr5Var = new fr5(this);
                fr5Var.m12028k(com.lingq.R$string.migration_dialog_title);
                fr5Var.m12020c(com.lingq.R$string.migration_dialog_message);
                fr5Var.m12019b();
                fr5 fr5VarM12022e = fr5Var.m12025h(com.lingq.R$string.migration_dialog_download, new DialogInterface.OnClickListener() { // from class: to5
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i6) {
                        int i7 = MainActivity.f33994m0;
                        MainActivity mainActivity = this.f62642a;
                        Intent launchIntentForPackage = mainActivity.getPackageManager().getLaunchIntentForPackage("com.linguist");
                        if (launchIntentForPackage != null) {
                            mainActivity.startActivity(launchIntentForPackage);
                        } else {
                            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.linguist")));
                        }
                    }
                }).m12022e(com.lingq.R$string.migration_dialog_later, null);
                fr5VarM12022e.m12024g(new DialogInterface.OnDismissListener() { // from class: uo5
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        int i6 = MainActivity.f33994m0;
                        C3509qs c3509qs3 = this.f64138a.f34004f0;
                        if (c3509qs3 == null) {
                            fa4.m11636J("appSettings");
                            throw null;
                        }
                        SharedPreferences.Editor editorEdit = c3509qs3.f58118b.edit();
                        editorEdit.getClass();
                        editorEdit.putBoolean("shownMigrationDialog", true);
                        editorEdit.apply();
                    }
                });
                fr5VarM12022e.m25557a();
            }
        }
        ComposeView composeView = m9801o().f70968d;
        C0411w c0411w = C0411w.f4868a;
        composeView.setViewCompositionStrategy(c0411w);
        composeView.setContent(new C0282a(601219231, true, new so5(this, 7)));
        wfb.m23926u(AbstractC0708b.m2508a(this), null, null, new MainActivity$setupStreakWidgetUpdates$1(this, null), 3);
        ComposeView composeView2 = m9801o().f70972h;
        composeView2.setViewCompositionStrategy(c0411w);
        composeView2.setContent(new C0282a(121369905, true, new so5(this, i2)));
        ComposeView composeView3 = m9801o().f70971g;
        composeView3.setViewCompositionStrategy(c0411w);
        composeView3.setContent(new C0282a(1113826918, true, new so5(this, 6)));
        ComposeView composeView4 = m9801o().f70969e;
        composeView4.setViewCompositionStrategy(c0411w);
        composeView4.setContent(new C0282a(546808682, true, new so5(this, i3)));
        m9800n();
        qb4 qb4VarM11694e = fb4.f38769t.m11694e();
        qb4VarM11694e.getClass();
        qb4.m19846c(qb4VarM11694e);
        ((C1240a) m9800n()).m7023d();
        if (Build.VERSION.SDK_INT >= 35) {
            wfb.m23926u(AbstractC0708b.m2508a(this), ph2.f56212a, null, new C28805(null), 2);
        }
        m9802q().m9815V2();
        wfb.m23926u(AbstractC0708b.m2508a(this), null, null, new C28816(null), 3);
    }

    @Override // p000.AbstractActivityC2935dp, p000.id3, android.app.Activity
    public final void onDestroy() {
        m9805v();
        pc0 pc0Var = this.f34000b0;
        if (pc0Var == null) {
            fa4.m11636J("billingManager");
            throw null;
        }
        kc0 kc0Var = (kc0) pc0Var.f55941e;
        kc0Var.getClass();
        if (kc0Var.m15105w()) {
            kc0Var.mo13514b();
        }
        v48 v48Var = this.f34008j0;
        if (v48Var != null) {
            v48Var.m23099b();
        } else {
            fa4.m11636J("toolTipsViewManager");
            throw null;
        }
    }

    @Override // p000.uc1, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Object value;
        Uri uri;
        String string;
        String string2;
        String string3;
        intent.getClass();
        super.onNewIntent(intent);
        String str = "";
        if ((intent.getFlags() & 1048576) == 0 && fa4.m11650l(intent.getAction(), "android.intent.action.SEND")) {
            if (u91.m22633z0(vz1.m23622b0(), intent.getType())) {
                if (Build.VERSION.SDK_INT >= 33) {
                    uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
                    uri = parcelableExtra instanceof Uri ? (Uri) parcelableExtra : null;
                }
                Bundle extras = intent.getExtras();
                if (extras == null || (string = extras.getString("android.intent.extra.SUBJECT", "")) == null) {
                    string = "";
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 == null || (string2 = extras2.getString("android.intent.extra.TEXT", "")) == null) {
                    string2 = "";
                }
                Bundle extras3 = intent.getExtras();
                if (extras3 != null && (string3 = extras3.getString("share_screenshot_as_stream", "")) != null) {
                    str = string3;
                }
                ImportData importData = new ImportData(string, string2, str, uri != null ? uri.toString() : null);
                if (importData.f19641e) {
                    C2889e c2889eM9802q = m9802q();
                    qe6 qe6Var = new qe6(new le6(importData));
                    c2889eM9802q.getClass();
                    c2889eM9802q.f34205g.mo8243R1(qe6Var);
                }
            }
            setIntent(new Intent(this, (Class<?>) MainActivity.class));
        } else if ((intent.getFlags() & 1048576) == 0 && fa4.m11650l(intent.getAction(), "android.intent.action.VIEW")) {
            C2889e c2889eM9802q2 = m9802q();
            String dataString = intent.getDataString();
            str = dataString != null ? dataString : "";
            c2889eM9802q2.getClass();
            wfb.m23926u(lda.m16103C(c2889eM9802q2), null, null, new MainViewModel$intentData$1(c2889eM9802q2, str, null), 3);
            setIntent(new Intent(this, (Class<?>) MainActivity.class));
        }
        C3244l c3244l = m9802q().f34198H;
        do {
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: q */
    public final C2889e m9802q() {
        return (C2889e) this.f33998Z.getValue();
    }

    /* JADX INFO: renamed from: s */
    public final void m9803s(boolean z, String str, ud6 ud6Var, boolean z2) {
        r86 r86VarM13127f;
        str.getClass();
        ud6Var.getClass();
        if (z && ((r86VarM13127f = ud6Var.f63760b.m13127f()) == null || r86VarM13127f.f58881b.f57368b != R$id.fragment_home)) {
            this.f34001c0 = str;
            ud6Var.m22690g(R$id.fragment_home, false);
        } else {
            long j = z2 ? 1000L : 0L;
            C2889e c2889eM9802q = m9802q();
            c2889eM9802q.getClass();
            c2889eM9802q.f34205g.mo8247e0(str, j);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m9804u(Bundle bundle) {
        super.onCreate(bundle);
        C3524r6 c3524r6M9799m = m9799m();
        C3749x7 c3749x7 = c3524r6M9799m.f58786d;
        xe1 xe1Var = ((C3675v7) C3749x7.m24324a(c3749x7.f67846a, c3749x7.f67847b).m16643g(y38.m24933a(C3675v7.class))).f64956c;
        c3524r6M9799m.f58787e = xe1Var;
        if (((p56) xe1Var.f68117b) == null) {
            p56 p56VarMo2103e = c3524r6M9799m.f58785c.mo2103e();
            thb.m22048g(xe1Var.f68116a, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            xe1Var.f68117b = p56VarMo2103e;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m9805v() {
        super.onDestroy();
        xe1 xe1Var = m9799m().f58787e;
        if (xe1Var != null) {
            xe1Var.f68117b = null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9806w(String str, String str2, boolean z) {
        String str3;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = m13792j().m2136D(R$id.nav_host_fragment_top);
        abstractComponentCallbacksC0635cM2136D.getClass();
        ud6 ud6VarM2573c0 = ((NavHostFragment) abstractComponentCallbacksC0635cM2136D).m2573c0();
        boolean zMo8550F2 = m9802q().f34201c.mo8550F2(str2);
        qn7 qn7Var = this.f34007i0;
        if (qn7Var == null) {
            fa4.m11636J("promoBannerDelegate");
            throw null;
        }
        up6 up6Var = ((rn7) qn7Var.getState().getValue()).f59593c.f61064b;
        dia diaVarM11162a = eia.m11162a(str, str2, up6Var != null ? up6Var.m22854b() : null, zMo8550F2, false);
        rm5 rm5Var = sm5.Companion;
        String str4 = diaVarM11162a.m10406b() ? "FreeTrial" : "Upgrade";
        StringBuilder sbM23000w = ux5.m23000w("[Offers] showUpgradeScreen attemptedAction=", str, " offer=", str2, " isPlusDefault=");
        sbM23000w.append(z);
        sbM23000w.append(" → ");
        sbM23000w.append(str4);
        String string = sbM23000w.toString();
        rm5Var.getClass();
        h0a.f41641a.mo11430a(string, new Object[0]);
        if (diaVarM11162a.m10406b()) {
            ta6 ta6Var = ua6.Companion;
            String strM10405a = diaVarM11162a.m10405a();
            str3 = strM10405a != null ? strM10405a : "";
            ta6Var.getClass();
            jfa.m14428k(ud6VarM2573c0, ta6.m21920a(str, str3, z), null);
            return;
        }
        gd6 gd6Var = hd6.Companion;
        String strM10405a2 = diaVarM11162a.m10405a();
        str3 = strM10405a2 != null ? strM10405a2 : "";
        gd6Var.getClass();
        jfa.m14428k(ud6VarM2573c0, gd6.m12504a(str, str3, z), null);
    }
}
