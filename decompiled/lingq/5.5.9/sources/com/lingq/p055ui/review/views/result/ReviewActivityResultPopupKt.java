package com.lingq.p055ui.review.views.result;

import ae.C0062b;
import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.C0463b;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.theme.CustomColorSchemeKt;
import com.lingq.p055ui.theme.SpacingKt;
import com.linguist.R;
import dm.C5207g;
import dm.C5212l;
import java.util.List;
import p036c0.C1648d;
import p036c0.C1655k;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p230l0.C7204a;
import p231l1.C7218l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p387t0.C9169u;
import p423v.C9613k;
import p423v.InterfaceC9612j;
import p443w.InterfaceC9771b;
import p445w1.C9797g;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewActivityResultPopupKt {

    /* JADX INFO: renamed from: a */
    public static final List<String> f30380a = C9000b.m17252r("😉", "😃", "😊", "🤩", "😉");

    /* JADX INFO: renamed from: b */
    public static final List<String> f30381b = C9000b.m17252r("🤔", "😔", "🙁");

    /* JADX INFO: renamed from: c */
    public static final List<String> f30382c = C9000b.m17251q("🤔");

    /* JADX WARN: Code duplicated, block: B:50:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m10306a(final boolean z10, final String str, final boolean z11, InterfaceC2041a<C9072e> interfaceC2041a, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        final InterfaceC2041a<C9072e> interfaceC2041a2;
        final int i13;
        InterfaceC2041a<C9072e> interfaceC2041a3;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(str, "emoji");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(390830392);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.m1598G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerImplMo1636j.mo1665y(str) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerImplMo1636j.m1598G(z11) ? 256 : BuildConfig.SDK_TRUNCATE_LENGTH;
        }
        int i14 = i11 & 8;
        if (i14 == 0) {
            if ((i10 & 7168) == 0) {
                interfaceC2041a2 = interfaceC2041a;
                i12 |= composerImplMo1636j.m1600H(interfaceC2041a2) ? 2048 : 1024;
            }
            i13 = i12;
            if ((i13 & 5851) == 1170 || !composerImplMo1636j.mo1642m()) {
                if (i14 != 0) {
                    interfaceC2041a3 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2041a3 = interfaceC2041a2;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                final Context context = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                final InterfaceC2041a<C9072e> interfaceC2041a4 = interfaceC2041a3;
                AnimatedVisibilityKt.m1334b(z11, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 350, null, 4), 2), null, C7204a.m14522b(composerImplMo1636j, 2035181408, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r15v0, types: [com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2$3, kotlin.jvm.internal.Lambda] */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(AnimatedVisibilityScope animatedVisibilityScope, InterfaceC0476a interfaceC0476a2, Integer num) {
                        final AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        num.intValue();
                        C5207g.m11111f(animatedVisibilityScope2, "$this$AnimatedVisibility");
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        InterfaceC0500b interfaceC0500bM1507d = SizeKt.m1507d();
                        interfaceC0476a3.mo1622c(-492369756);
                        Object objMo1624d = interfaceC0476a3.mo1624d();
                        InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                        if (objMo1624d == c10586a) {
                            objMo1624d = new C9613k();
                            interfaceC0476a3.mo1655t(objMo1624d);
                        }
                        interfaceC0476a3.mo1661w();
                        InterfaceC9612j interfaceC9612j = (InterfaceC9612j) objMo1624d;
                        interfaceC0476a3.mo1622c(1157296644);
                        final InterfaceC2041a<C9072e> interfaceC2041a5 = interfaceC2041a4;
                        boolean zMo1665y = interfaceC0476a3.mo1665y(interfaceC2041a5);
                        Object objMo1624d2 = interfaceC0476a3.mo1624d();
                        if (zMo1665y || objMo1624d2 == c10586a) {
                            objMo1624d2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C9072e mo807E() {
                                    interfaceC2041a5.mo807E();
                                    return C9072e.f47360a;
                                }
                            };
                            interfaceC0476a3.mo1655t(objMo1624d2);
                        }
                        interfaceC0476a3.mo1661w();
                        InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, interfaceC9612j, null, false, null, (InterfaceC2041a) objMo1624d2, 28);
                        long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                        final InterfaceC2041a<C9072e> interfaceC2041a6 = interfaceC2041a4;
                        final int i15 = i13;
                        final String str2 = str;
                        final boolean z12 = z10;
                        final Context context2 = context;
                        SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1085776859, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Type inference failed for: r14v8, types: [com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2$3$3, kotlin.jvm.internal.Lambda] */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                    interfaceC0476a5.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                                    InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1514k(InterfaceC0500b.a.f3325a)), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt.ReviewActivityResultPopup.2.3.1
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final Integer mo528n(Integer num3) {
                                            num3.intValue();
                                            return -500;
                                        }
                                    })), EnterExitTransitionKt.m1348e(null, 3).m16928b(EnterExitTransitionKt.m1351h(C8573r0.m16734k1(300, 0, null, 6), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt.ReviewActivityResultPopup.2.3.2
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final Integer mo528n(Integer num3) {
                                            num3.intValue();
                                            return 500;
                                        }
                                    })), "animateEnterExit"), ((C1648d) interfaceC0476a5.mo1648p(ColorSchemeKt.f2735a)).m5363v(), ((C1655k) interfaceC0476a5.mo1648p(ShapesKt.f2783a)).f9263e);
                                    C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                    InterfaceC2041a<C9072e> interfaceC2041a7 = interfaceC2041a6;
                                    final Context context3 = context2;
                                    final boolean z13 = z12;
                                    final int i16 = i15;
                                    final String str3 = str2;
                                    CardKt.m1558b(interfaceC2041a7, interfaceC0500bM309T, false, null, null, c0463bM11139L, null, null, C7204a.m14522b(interfaceC0476a5, 1730355802, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt.ReviewActivityResultPopup.2.3.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // cm.InterfaceC2057q
                                        /* JADX INFO: renamed from: M */
                                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) {
                                            InterfaceC9771b interfaceC9771b2 = interfaceC9771b;
                                            InterfaceC0476a interfaceC0476a7 = interfaceC0476a6;
                                            int iIntValue = num3.intValue();
                                            C5207g.m11111f(interfaceC9771b2, "$this$Card");
                                            if ((iIntValue & 14) == 0) {
                                                iIntValue |= interfaceC0476a7.mo1665y(interfaceC9771b2) ? 4 : 2;
                                            }
                                            if ((iIntValue & 91) == 18 && interfaceC0476a7.mo1642m()) {
                                                interfaceC0476a7.mo1650q();
                                            } else {
                                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                                TextKt.m1576c(str3, interfaceC9771b2.mo18270a(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a7).f33951a, 0.0f, SpacingKt.m10360a(interfaceC0476a7).f33951a, 5)))), 0L, C8573r0.m16765v0(36), null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 0, null, null, interfaceC0476a7, ((i16 >> 3) & 14) | 3072, 0, 65012);
                                                InterfaceC0500b interfaceC0500bMo18270a = interfaceC9771b2.mo18270a(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a7).f33957g, SpacingKt.m10360a(interfaceC0476a7).f33956f, SpacingKt.m10360a(interfaceC0476a7).f33957g, SpacingKt.m10360a(interfaceC0476a7).f33956f))));
                                                boolean z14 = z13;
                                                Context context4 = context3;
                                                String string = z14 ? context4.getString(R.string.activities_correct) : context4.getString(R.string.activities_incorrect);
                                                C7218l c7218l = C7499b.m14918P(interfaceC0476a7).f9270g;
                                                long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                                C5207g.m11110e(string, "if (isCorrect) {\n       …ct)\n                    }");
                                                TextKt.m1576c(string, interfaceC0500bMo18270a, j11, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 0, null, c7218l, interfaceC0476a7, 0, 0, 32248);
                                            }
                                            return C9072e.f47360a;
                                        }
                                    }), interfaceC0476a5, ((i16 >> 9) & 14) | 100663296, 220);
                                }
                                return C9072e.f47360a;
                            }
                        }), interfaceC0476a3, 12582912, 122);
                        return C9072e.f47360a;
                    }
                }), composerImplMo1636j, ((i13 >> 6) & 14) | 199680, 18);
                interfaceC2041a2 = interfaceC2041a3;
            } else {
                composerImplMo1636j.mo1650q();
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    ReviewActivityResultPopupKt.m10306a(z10, str, z11, interfaceC2041a2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 3072;
        interfaceC2041a2 = interfaceC2041a;
        i13 = i12;
        if ((i13 & 5851) == 1170) {
            if (i14 != 0) {
                interfaceC2041a3 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2041a3 = interfaceC2041a2;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
            final Context context2 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
            final InterfaceC2041a<C9072e> interfaceC2041a5 = interfaceC2041a3;
            AnimatedVisibilityKt.m1334b(z11, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 350, null, 4), 2), null, C7204a.m14522b(composerImplMo1636j, 2035181408, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v0, types: [com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2$3, kotlin.jvm.internal.Lambda] */
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(AnimatedVisibilityScope animatedVisibilityScope, InterfaceC0476a interfaceC0476a2, Integer num) {
                    final AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(animatedVisibilityScope2, "$this$AnimatedVisibility");
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                    InterfaceC0500b interfaceC0500bM1507d = SizeKt.m1507d();
                    interfaceC0476a3.mo1622c(-492369756);
                    Object objMo1624d = interfaceC0476a3.mo1624d();
                    InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                    if (objMo1624d == c10586a) {
                        objMo1624d = new C9613k();
                        interfaceC0476a3.mo1655t(objMo1624d);
                    }
                    interfaceC0476a3.mo1661w();
                    InterfaceC9612j interfaceC9612j = (InterfaceC9612j) objMo1624d;
                    interfaceC0476a3.mo1622c(1157296644);
                    final InterfaceC2041a<C9072e> interfaceC2041a6 = interfaceC2041a5;
                    boolean zMo1665y = interfaceC0476a3.mo1665y(interfaceC2041a6);
                    Object objMo1624d2 = interfaceC0476a3.mo1624d();
                    if (zMo1665y || objMo1624d2 == c10586a) {
                        objMo1624d2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C9072e mo807E() {
                                interfaceC2041a6.mo807E();
                                return C9072e.f47360a;
                            }
                        };
                        interfaceC0476a3.mo1655t(objMo1624d2);
                    }
                    interfaceC0476a3.mo1661w();
                    InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, interfaceC9612j, null, false, null, (InterfaceC2041a) objMo1624d2, 28);
                    long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                    final InterfaceC2041a<C9072e> interfaceC2041a7 = interfaceC2041a5;
                    final int i15 = i13;
                    final String str2 = str;
                    final boolean z12 = z10;
                    final Context context3 = context2;
                    SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1085776859, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r14v8, types: [com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2$3$3, kotlin.jvm.internal.Lambda] */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                            InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                            if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                interfaceC0476a5.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1514k(InterfaceC0500b.a.f3325a)), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt.ReviewActivityResultPopup.2.3.1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final Integer mo528n(Integer num3) {
                                        num3.intValue();
                                        return -500;
                                    }
                                })), EnterExitTransitionKt.m1348e(null, 3).m16928b(EnterExitTransitionKt.m1351h(C8573r0.m16734k1(300, 0, null, 6), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt.ReviewActivityResultPopup.2.3.2
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final Integer mo528n(Integer num3) {
                                        num3.intValue();
                                        return 500;
                                    }
                                })), "animateEnterExit"), ((C1648d) interfaceC0476a5.mo1648p(ColorSchemeKt.f2735a)).m5363v(), ((C1655k) interfaceC0476a5.mo1648p(ShapesKt.f2783a)).f9263e);
                                C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                InterfaceC2041a<C9072e> interfaceC2041a8 = interfaceC2041a7;
                                final Context context4 = context3;
                                final boolean z13 = z12;
                                final int i16 = i15;
                                final String str3 = str2;
                                CardKt.m1558b(interfaceC2041a8, interfaceC0500bM309T, false, null, null, c0463bM11139L, null, null, C7204a.m14522b(interfaceC0476a5, 1730355802, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt.ReviewActivityResultPopup.2.3.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // cm.InterfaceC2057q
                                    /* JADX INFO: renamed from: M */
                                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) {
                                        InterfaceC9771b interfaceC9771b2 = interfaceC9771b;
                                        InterfaceC0476a interfaceC0476a7 = interfaceC0476a6;
                                        int iIntValue = num3.intValue();
                                        C5207g.m11111f(interfaceC9771b2, "$this$Card");
                                        if ((iIntValue & 14) == 0) {
                                            iIntValue |= interfaceC0476a7.mo1665y(interfaceC9771b2) ? 4 : 2;
                                        }
                                        if ((iIntValue & 91) == 18 && interfaceC0476a7.mo1642m()) {
                                            interfaceC0476a7.mo1650q();
                                        } else {
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                            TextKt.m1576c(str3, interfaceC9771b2.mo18270a(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a7).f33951a, 0.0f, SpacingKt.m10360a(interfaceC0476a7).f33951a, 5)))), 0L, C8573r0.m16765v0(36), null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 0, null, null, interfaceC0476a7, ((i16 >> 3) & 14) | 3072, 0, 65012);
                                            InterfaceC0500b interfaceC0500bMo18270a = interfaceC9771b2.mo18270a(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a7).f33957g, SpacingKt.m10360a(interfaceC0476a7).f33956f, SpacingKt.m10360a(interfaceC0476a7).f33957g, SpacingKt.m10360a(interfaceC0476a7).f33956f))));
                                            boolean z14 = z13;
                                            Context context5 = context4;
                                            String string = z14 ? context5.getString(R.string.activities_correct) : context5.getString(R.string.activities_incorrect);
                                            C7218l c7218l = C7499b.m14918P(interfaceC0476a7).f9270g;
                                            long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                            C5207g.m11110e(string, "if (isCorrect) {\n       …ct)\n                    }");
                                            TextKt.m1576c(string, interfaceC0500bMo18270a, j11, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 0, null, c7218l, interfaceC0476a7, 0, 0, 32248);
                                        }
                                        return C9072e.f47360a;
                                    }
                                }), interfaceC0476a5, ((i16 >> 9) & 14) | 100663296, 220);
                            }
                            return C9072e.f47360a;
                        }
                    }), interfaceC0476a3, 12582912, 122);
                    return C9072e.f47360a;
                }
            }), composerImplMo1636j, ((i13 >> 6) & 14) | 199680, 18);
            interfaceC2041a2 = interfaceC2041a3;
        } else {
            if (i14 != 0) {
                interfaceC2041a3 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2041a3 = interfaceC2041a2;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
            final Context context3 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
            final InterfaceC2041a<C9072e> interfaceC2041a6 = interfaceC2041a3;
            AnimatedVisibilityKt.m1334b(z11, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 350, null, 4), 2), null, C7204a.m14522b(composerImplMo1636j, 2035181408, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v0, types: [com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2$3, kotlin.jvm.internal.Lambda] */
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(AnimatedVisibilityScope animatedVisibilityScope, InterfaceC0476a interfaceC0476a2, Integer num) {
                    final AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(animatedVisibilityScope2, "$this$AnimatedVisibility");
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                    InterfaceC0500b interfaceC0500bM1507d = SizeKt.m1507d();
                    interfaceC0476a3.mo1622c(-492369756);
                    Object objMo1624d = interfaceC0476a3.mo1624d();
                    InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                    if (objMo1624d == c10586a) {
                        objMo1624d = new C9613k();
                        interfaceC0476a3.mo1655t(objMo1624d);
                    }
                    interfaceC0476a3.mo1661w();
                    InterfaceC9612j interfaceC9612j = (InterfaceC9612j) objMo1624d;
                    interfaceC0476a3.mo1622c(1157296644);
                    final InterfaceC2041a<C9072e> interfaceC2041a7 = interfaceC2041a6;
                    boolean zMo1665y = interfaceC0476a3.mo1665y(interfaceC2041a7);
                    Object objMo1624d2 = interfaceC0476a3.mo1624d();
                    if (zMo1665y || objMo1624d2 == c10586a) {
                        objMo1624d2 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C9072e mo807E() {
                                interfaceC2041a7.mo807E();
                                return C9072e.f47360a;
                            }
                        };
                        interfaceC0476a3.mo1655t(objMo1624d2);
                    }
                    interfaceC0476a3.mo1661w();
                    InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, interfaceC9612j, null, false, null, (InterfaceC2041a) objMo1624d2, 28);
                    long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                    final InterfaceC2041a<C9072e> interfaceC2041a8 = interfaceC2041a6;
                    final int i15 = i13;
                    final String str2 = str;
                    final boolean z12 = z10;
                    final Context context4 = context3;
                    SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1085776859, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r14v8, types: [com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$2$3$3, kotlin.jvm.internal.Lambda] */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                            InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                            if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                interfaceC0476a5.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1514k(InterfaceC0500b.a.f3325a)), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt.ReviewActivityResultPopup.2.3.1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final Integer mo528n(Integer num3) {
                                        num3.intValue();
                                        return -500;
                                    }
                                })), EnterExitTransitionKt.m1348e(null, 3).m16928b(EnterExitTransitionKt.m1351h(C8573r0.m16734k1(300, 0, null, 6), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt.ReviewActivityResultPopup.2.3.2
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final Integer mo528n(Integer num3) {
                                        num3.intValue();
                                        return 500;
                                    }
                                })), "animateEnterExit"), ((C1648d) interfaceC0476a5.mo1648p(ColorSchemeKt.f2735a)).m5363v(), ((C1655k) interfaceC0476a5.mo1648p(ShapesKt.f2783a)).f9263e);
                                C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                InterfaceC2041a<C9072e> interfaceC2041a9 = interfaceC2041a8;
                                final Context context5 = context4;
                                final boolean z13 = z12;
                                final int i16 = i15;
                                final String str3 = str2;
                                CardKt.m1558b(interfaceC2041a9, interfaceC0500bM309T, false, null, null, c0463bM11139L, null, null, C7204a.m14522b(interfaceC0476a5, 1730355802, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt.ReviewActivityResultPopup.2.3.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // cm.InterfaceC2057q
                                    /* JADX INFO: renamed from: M */
                                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) {
                                        InterfaceC9771b interfaceC9771b2 = interfaceC9771b;
                                        InterfaceC0476a interfaceC0476a7 = interfaceC0476a6;
                                        int iIntValue = num3.intValue();
                                        C5207g.m11111f(interfaceC9771b2, "$this$Card");
                                        if ((iIntValue & 14) == 0) {
                                            iIntValue |= interfaceC0476a7.mo1665y(interfaceC9771b2) ? 4 : 2;
                                        }
                                        if ((iIntValue & 91) == 18 && interfaceC0476a7.mo1642m()) {
                                            interfaceC0476a7.mo1650q();
                                        } else {
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                            TextKt.m1576c(str3, interfaceC9771b2.mo18270a(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a7).f33951a, 0.0f, SpacingKt.m10360a(interfaceC0476a7).f33951a, 5)))), 0L, C8573r0.m16765v0(36), null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 0, null, null, interfaceC0476a7, ((i16 >> 3) & 14) | 3072, 0, 65012);
                                            InterfaceC0500b interfaceC0500bMo18270a = interfaceC9771b2.mo18270a(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11158e0(aVar, SpacingKt.m10360a(interfaceC0476a7).f33957g, SpacingKt.m10360a(interfaceC0476a7).f33956f, SpacingKt.m10360a(interfaceC0476a7).f33957g, SpacingKt.m10360a(interfaceC0476a7).f33956f))));
                                            boolean z14 = z13;
                                            Context context6 = context5;
                                            String string = z14 ? context6.getString(R.string.activities_correct) : context6.getString(R.string.activities_incorrect);
                                            C7218l c7218l = C7499b.m14918P(interfaceC0476a7).f9270g;
                                            long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                            C5207g.m11110e(string, "if (isCorrect) {\n       …ct)\n                    }");
                                            TextKt.m1576c(string, interfaceC0500bMo18270a, j11, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 0, null, c7218l, interfaceC0476a7, 0, 0, 32248);
                                        }
                                        return C9072e.f47360a;
                                    }
                                }), interfaceC0476a5, ((i16 >> 9) & 14) | 100663296, 220);
                            }
                            return C9072e.f47360a;
                        }
                    }), interfaceC0476a3, 12582912, 122);
                    return C9072e.f47360a;
                }
            }), composerImplMo1636j, ((i13 >> 6) & 14) | 199680, 18);
            interfaceC2041a2 = interfaceC2041a3;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewActivityResultPopupKt$ReviewActivityResultPopup$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                ReviewActivityResultPopupKt.m10306a(z10, str, z11, interfaceC2041a2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                return C9072e.f47360a;
            }
        };
    }
}
