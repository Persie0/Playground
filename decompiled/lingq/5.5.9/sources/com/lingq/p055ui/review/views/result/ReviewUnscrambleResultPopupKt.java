package com.lingq.p055ui.review.views.result;

import ae.C0062b;
import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0438a;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C0463b;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.commons.status.MatchingTextKt;
import com.lingq.p055ui.theme.CustomColorSchemeKt;
import com.lingq.p055ui.theme.SpacingKt;
import com.linguist.R;
import dm.C5207g;
import dm.C5212l;
import kotlin.NoWhenBranchMatchedException;
import p036c0.C1646b;
import p036c0.C1648d;
import p036c0.C1656l;
import p081e0.C5304d1;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p230l0.C7204a;
import p231l1.C7218l;
import p260m8.C7499b;
import p284o0.C7886b;
import p284o0.InterfaceC7885a;
import p338qd.C8573r0;
import p386t.C9112d;
import p387t0.C9156l0;
import p387t0.C9169u;
import p423v.C9613k;
import p423v.InterfaceC9612j;
import p443w.C9775f;
import p443w.C9782m;
import p443w.InterfaceC9771b;
import p443w.InterfaceC9786q;
import p445w1.C9797g;
import p470x1.InterfaceC10015c;
import p494y.AbstractC10270a;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewUnscrambleResultPopupKt {
    /* JADX WARN: Code duplicated, block: B:101:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x0129  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m10307a(final ReviewResultType reviewResultType, final String str, final boolean z10, final String str2, final String str3, final boolean z11, InterfaceC2041a<C9072e> interfaceC2041a, InterfaceC2041a<C9072e> interfaceC2041a2, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        InterfaceC2041a<C9072e> interfaceC2041a3;
        int i13;
        InterfaceC2041a<C9072e> interfaceC2041a4;
        int i14;
        final int i15;
        InterfaceC2041a<C9072e> interfaceC2041a5;
        InterfaceC2041a<C9072e> interfaceC2041a6;
        ComposerImpl composerImpl;
        final InterfaceC2041a<C9072e> interfaceC2041a7;
        final InterfaceC2041a<C9072e> interfaceC2041a8;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(reviewResultType, "result");
        C5207g.m11111f(str, "emoji");
        C5207g.m11111f(str2, "sentence");
        C5207g.m11111f(str3, "answered");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1313780445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.mo1665y(reviewResultType) ? 4 : 2) | i10;
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
            i12 |= composerImplMo1636j.m1598G(z10) ? 256 : BuildConfig.SDK_TRUNCATE_LENGTH;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerImplMo1636j.mo1665y(str2) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            i12 |= composerImplMo1636j.mo1665y(str3) ? 16384 : 8192;
        }
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((458752 & i10) == 0) {
            i12 |= composerImplMo1636j.m1598G(z11) ? 131072 : 65536;
        }
        int i16 = i11 & 64;
        if (i16 == 0) {
            if ((3670016 & i10) == 0) {
                interfaceC2041a3 = interfaceC2041a;
                i12 |= composerImplMo1636j.m1600H(interfaceC2041a3) ? 1048576 : 524288;
            }
            i13 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i13 != 0) {
                if ((29360128 & i10) == 0) {
                    interfaceC2041a4 = interfaceC2041a2;
                    if (composerImplMo1636j.m1600H(interfaceC2041a4)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i12 |= i14;
                }
                i15 = i12;
                if ((i15 & 23967451) == 4793490 || !composerImplMo1636j.mo1642m()) {
                    if (i16 != 0) {
                        interfaceC2041a5 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2041a5 = interfaceC2041a3;
                    }
                    if (i13 != 0) {
                        interfaceC2041a6 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$2
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2041a6 = interfaceC2041a4;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                    final Context context = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                    final InterfaceC2041a<C9072e> interfaceC2041a9 = interfaceC2041a5;
                    composerImpl = composerImplMo1636j;
                    final InterfaceC2041a<C9072e> interfaceC2041a10 = interfaceC2041a6;
                    AnimatedVisibilityKt.m1334b(z10, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 60, null, 4), 2), null, C7204a.m14522b(composerImpl, 1982907829, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r9v1, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3, kotlin.jvm.internal.Lambda] */
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
                            if (objMo1624d == InterfaceC0476a.a.f3122a) {
                                objMo1624d = new C9613k();
                                interfaceC0476a3.mo1655t(objMo1624d);
                            }
                            interfaceC0476a3.mo1661w();
                            InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, (InterfaceC9612j) objMo1624d, null, false, null, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.2
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                    return C9072e.f47360a;
                                }
                            }, 28);
                            long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                            final Context context2 = context;
                            final boolean z12 = z11;
                            final String str4 = str2;
                            final int i17 = i15;
                            final ReviewResultType reviewResultType2 = reviewResultType;
                            final String str5 = str3;
                            final String str6 = str;
                            final InterfaceC2041a<C9072e> interfaceC2041a11 = interfaceC2041a9;
                            final InterfaceC2041a<C9072e> interfaceC2041a12 = interfaceC2041a10;
                            SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1127002864, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Type inference failed for: r3v7, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2, kotlin.jvm.internal.Lambda] */
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                    InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                    if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                        interfaceC0476a5.mo1650q();
                                    } else {
                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                                        InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1508e(C5212l.m11156c0(InterfaceC0500b.a.f3325a, SpacingKt.m10360a(interfaceC0476a5).f33955e))), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.1
                                            @Override // cm.InterfaceC2052l
                                            /* JADX INFO: renamed from: n */
                                            public final Integer mo528n(Integer num3) {
                                                num3.intValue();
                                                return -500;
                                            }
                                        })), EnterExitTransitionKt.m1348e(null, 3), "animateEnterExit"), C7499b.m14898D(interfaceC0476a5).m5363v(), C7499b.m14916N(interfaceC0476a5).f9263e);
                                        C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                        final Context context3 = context2;
                                        final boolean z13 = z12;
                                        final String str7 = str4;
                                        final int i18 = i17;
                                        final ReviewResultType reviewResultType3 = reviewResultType2;
                                        final String str8 = str5;
                                        final String str9 = str6;
                                        final InterfaceC2041a<C9072e> interfaceC2041a13 = interfaceC2041a11;
                                        final InterfaceC2041a<C9072e> interfaceC2041a14 = interfaceC2041a12;
                                        CardKt.m1557a(interfaceC0500bM309T, null, null, c0463bM11139L, null, C7204a.m14522b(interfaceC0476a5, -1565704098, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.2

                                            /* JADX INFO: renamed from: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$a */
                                            public /* synthetic */ class a {

                                                /* JADX INFO: renamed from: a */
                                                public static final /* synthetic */ int[] f30442a;

                                                static {
                                                    int[] iArr = new int[ReviewResultType.values().length];
                                                    try {
                                                        iArr[ReviewResultType.CORRECT.ordinal()] = 1;
                                                    } catch (NoSuchFieldError unused) {
                                                    }
                                                    try {
                                                        iArr[ReviewResultType.ALMOST.ordinal()] = 2;
                                                    } catch (NoSuchFieldError unused2) {
                                                    }
                                                    try {
                                                        iArr[ReviewResultType.INCORRECT.ordinal()] = 3;
                                                    } catch (NoSuchFieldError unused3) {
                                                    }
                                                    f30442a = iArr;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r1v13, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2, kotlin.jvm.internal.Lambda] */
                                            /* JADX WARN: Type inference failed for: r2v48, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1, kotlin.jvm.internal.Lambda] */
                                            @Override // cm.InterfaceC2057q
                                            /* JADX INFO: renamed from: M */
                                            public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) throws Throwable {
                                                int i19;
                                                String string;
                                                InterfaceC0476a interfaceC0476a7;
                                                long jM5366y;
                                                InterfaceC0476a interfaceC0476a8;
                                                long jM5366y2;
                                                InterfaceC0476a interfaceC0476a9 = interfaceC0476a6;
                                                int iIntValue = num3.intValue();
                                                C5207g.m11111f(interfaceC9771b, "$this$Card");
                                                if ((iIntValue & 81) == 16 && interfaceC0476a9.mo1642m()) {
                                                    interfaceC0476a9.mo1650q();
                                                } else {
                                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                                    InterfaceC0500b interfaceC0500bM11156c0 = C5212l.m11156c0(SizeKt.m1508e(SizeKt.m1512i(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                                    C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                                    String str10 = str9;
                                                    interfaceC0476a9.mo1622c(693286680);
                                                    C0438a.f fVar = C0438a.f2429a;
                                                    InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(fVar, bVar, interfaceC0476a9);
                                                    interfaceC0476a9.mo1622c(-1323940314);
                                                    C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
                                                    InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d1);
                                                    C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
                                                    LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d2);
                                                    C5304d1 c5304d3 = CompositionLocalsKt.f4148p;
                                                    InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d3);
                                                    ComposeUiNode.f3726n.getClass();
                                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a15 = ComposeUiNode.Companion.f3728b;
                                                    ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c0);
                                                    if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                                        C8573r0.m16771y0();
                                                        throw null;
                                                    }
                                                    interfaceC0476a9.mo1640l();
                                                    if (interfaceC0476a9.mo1632h()) {
                                                        interfaceC0476a9.mo1634i(interfaceC2041a15);
                                                    } else {
                                                        interfaceC0476a9.mo1653s();
                                                    }
                                                    interfaceC0476a9.mo1644n();
                                                    InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p = ComposeUiNode.Companion.f3731e;
                                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p);
                                                    InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p2 = ComposeUiNode.Companion.f3730d;
                                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c, interfaceC2056p2);
                                                    InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3732f;
                                                    C8573r0.m16714a1(interfaceC0476a9, layoutDirection, interfaceC2056p3);
                                                    InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3733g;
                                                    C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n1, interfaceC2056p4);
                                                    interfaceC0476a9.mo1626e();
                                                    composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                                    interfaceC0476a9.mo1622c(2058660585);
                                                    InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                    long jM16765v0 = C8573r0.m16765v0(24);
                                                    C9797g c9797g = new C9797g(3);
                                                    int i20 = i18;
                                                    TextKt.m1576c(str10, interfaceC0500bM11156c1, 0L, jM16765v0, null, null, null, 0L, null, c9797g, 0L, 0, false, 0, null, null, interfaceC0476a9, ((i20 >> 3) & 14) | 3072, 0, 65012);
                                                    InterfaceC0500b interfaceC0500bM11156c2 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                    int[] iArr = a.f30442a;
                                                    ReviewResultType reviewResultType4 = reviewResultType3;
                                                    int i21 = iArr[reviewResultType4.ordinal()];
                                                    final Context context4 = context3;
                                                    if (i21 == 1) {
                                                        i19 = 3;
                                                        string = context4.getString(R.string.activities_correct);
                                                    } else if (i21 != 2) {
                                                        i19 = 3;
                                                        if (i21 != 3) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        string = context4.getString(R.string.activities_incorrect);
                                                    } else {
                                                        i19 = 3;
                                                        string = context4.getString(R.string.activities_almost);
                                                    }
                                                    C7218l c7218l = C7499b.m14918P(interfaceC0476a9).f9267d;
                                                    int i22 = iArr[reviewResultType4.ordinal()];
                                                    if (i22 == 1) {
                                                        interfaceC0476a7 = interfaceC0476a9;
                                                        interfaceC0476a7.mo1622c(106572499);
                                                        jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                                        interfaceC0476a7.mo1661w();
                                                    } else if (i22 == 2) {
                                                        interfaceC0476a7 = interfaceC0476a9;
                                                        interfaceC0476a7.mo1622c(106572655);
                                                        jM5366y = C7499b.m14898D(interfaceC0476a7).m5366y();
                                                        interfaceC0476a7.mo1661w();
                                                    } else {
                                                        if (i22 != i19) {
                                                            interfaceC0476a9.mo1622c(106566727);
                                                            interfaceC0476a9.mo1661w();
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        interfaceC0476a7 = interfaceC0476a9;
                                                        interfaceC0476a7.mo1622c(106572813);
                                                        jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33945g.getValue()).f47705a;
                                                        interfaceC0476a7.mo1661w();
                                                    }
                                                    C5207g.m11110e(string, "when (result) {\n        …                        }");
                                                    InterfaceC0476a interfaceC0476a10 = interfaceC0476a7;
                                                    TextKt.m1576c(string, interfaceC0500bM11156c2, jM5366y, 0L, null, null, null, 0L, null, new C9797g(i19), 0L, 0, false, 0, null, c7218l, interfaceC0476a10, 0, 0, 32248);
                                                    interfaceC0476a10.mo1661w();
                                                    interfaceC0476a10.mo1663x();
                                                    interfaceC0476a10.mo1661w();
                                                    interfaceC0476a10.mo1661w();
                                                    InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                    String string2 = context4.getString(R.string.label_correct);
                                                    C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                    long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33946h.getValue()).f47705a;
                                                    C5207g.m11110e(string2, "getString(R.string.label_correct)");
                                                    TextKt.m1576c(string2, interfaceC0500bM11159f0, j11, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, 0, 0, 32248);
                                                    InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33956f, SpacingKt.m10360a(interfaceC0476a10).f33956f, 2);
                                                    C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                    boolean z14 = z13;
                                                    TextKt.m1576c(str7, interfaceC0500bM11159f1, C7499b.m14898D(interfaceC0476a10).m5354m(), 0L, null, null, null, 0L, null, new C9797g(z14 ? 6 : 5), 0L, 0, false, 0, null, c7218l3, interfaceC0476a10, (i20 >> 9) & 14, 0, 32248);
                                                    InterfaceC0500b interfaceC0500bM11159f2 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                    String string3 = context4.getString(R.string.activities_you_answered);
                                                    C7218l c7218l4 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                    int i23 = iArr[reviewResultType4.ordinal()];
                                                    if (i23 == 1) {
                                                        interfaceC0476a8 = interfaceC0476a10;
                                                        interfaceC0476a8.mo1622c(-2029521532);
                                                        jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33946h.getValue()).f47705a;
                                                        interfaceC0476a8.mo1661w();
                                                    } else if (i23 == 2) {
                                                        interfaceC0476a8 = interfaceC0476a10;
                                                        interfaceC0476a8.mo1622c(-2029521387);
                                                        jM5366y2 = C7499b.m14898D(interfaceC0476a8).m5366y();
                                                        interfaceC0476a8.mo1661w();
                                                    } else {
                                                        if (i23 != 3) {
                                                            interfaceC0476a10.mo1622c(-2029529946);
                                                            interfaceC0476a10.mo1661w();
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        interfaceC0476a8 = interfaceC0476a10;
                                                        interfaceC0476a8.mo1622c(-2029521241);
                                                        jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33945g.getValue()).f47705a;
                                                        interfaceC0476a8.mo1661w();
                                                    }
                                                    C5207g.m11110e(string3, "getString(R.string.activities_you_answered)");
                                                    InterfaceC0476a interfaceC0476a11 = interfaceC0476a8;
                                                    TextKt.m1576c(string3, interfaceC0500bM11159f2, jM5366y2, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l4, interfaceC0476a11, 0, 0, 32248);
                                                    MatchingTextKt.m9749a(C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33957g, 2), C7499b.m14918P(interfaceC0476a11).f9273j, new C9797g(z14 ? 6 : 5), 0L, 0L, str8, str7, interfaceC0476a11, (3670016 & (i20 << 9)) | ((i20 << 3) & 458752), 24);
                                                    float f3 = 70;
                                                    InterfaceC0500b interfaceC0500bM1509f = SizeKt.m1509f(SizeKt.m1508e(aVar), f3);
                                                    InterfaceC2041a<C9072e> interfaceC2041a16 = interfaceC2041a13;
                                                    InterfaceC2041a<C9072e> interfaceC2041a17 = interfaceC2041a14;
                                                    interfaceC0476a11.mo1622c(693286680);
                                                    InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(fVar, InterfaceC7885a.a.f42993e, interfaceC0476a11);
                                                    interfaceC0476a11.mo1622c(-1323940314);
                                                    InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a11.mo1648p(c5304d1);
                                                    LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a11.mo1648p(c5304d2);
                                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a11.mo1648p(c5304d3);
                                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1509f);
                                                    if (!(interfaceC0476a11.mo1646o() instanceof InterfaceC5299c)) {
                                                        C8573r0.m16771y0();
                                                        throw null;
                                                    }
                                                    interfaceC0476a11.mo1640l();
                                                    if (interfaceC0476a11.mo1632h()) {
                                                        interfaceC0476a11.mo1634i(interfaceC2041a15);
                                                    } else {
                                                        interfaceC0476a11.mo1653s();
                                                    }
                                                    interfaceC0476a11.mo1644n();
                                                    C8573r0.m16714a1(interfaceC0476a11, interfaceC5652pM1503a2, interfaceC2056p);
                                                    C8573r0.m16714a1(interfaceC0476a11, interfaceC10015c2, interfaceC2056p2);
                                                    C8573r0.m16714a1(interfaceC0476a11, layoutDirection2, interfaceC2056p3);
                                                    C8573r0.m16714a1(interfaceC0476a11, interfaceC0647n2, interfaceC2056p4);
                                                    interfaceC0476a11.mo1626e();
                                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a11), interfaceC0476a11, 0);
                                                    interfaceC0476a11.mo1622c(2058660585);
                                                    IntrinsicSize intrinsicSize = IntrinsicSize.Max;
                                                    ButtonKt.m1556b(interfaceC2041a16, C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 6), false, C7499b.m14916N(interfaceC0476a11).f9260b, null, null, new C9112d(1, new C9156l0(C7499b.m14898D(interfaceC0476a11).m5355n())), null, null, C7204a.m14522b(interfaceC0476a11, 813356273, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // cm.InterfaceC2057q
                                                        /* JADX INFO: renamed from: M */
                                                        public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                            InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                            int iIntValue2 = num4.intValue();
                                                            C5207g.m11111f(interfaceC9786q, "$this$OutlinedButton");
                                                            if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                                interfaceC0476a13.mo1650q();
                                                            } else {
                                                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                                                InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(C9775f.m18272a(IntrinsicSize.Max), InterfaceC7885a.a.f42991c, 2);
                                                                String string4 = context4.getString(R.string.warning_try_again);
                                                                C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                                long jM5354m = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5354m();
                                                                C5207g.m11110e(string4, "getString(R.string.warning_try_again)");
                                                                AutoSizedTextKt.m10305a(string4, interfaceC0500bM1513j, jM5354m, new C9797g(3), 0L, 0, false, 2, c7218l5, interfaceC0476a13, 12582960, 112);
                                                            }
                                                            return C9072e.f47360a;
                                                        }
                                                    }), interfaceC0476a11, ((i20 >> 18) & 14) | 805306368, 436);
                                                    C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(interfaceC0476a11).f33951a), interfaceC0476a11);
                                                    InterfaceC0500b interfaceC0500bM11159f3 = C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 3);
                                                    AbstractC10270a abstractC10270a = C7499b.m14916N(interfaceC0476a11).f9260b;
                                                    C9782m c9782m = C1646b.f9206a;
                                                    ButtonKt.m1555a(interfaceC2041a17, interfaceC0500bM11159f3, false, abstractC10270a, C1646b.m5339a(C7499b.m14898D(interfaceC0476a11).m5351j(), interfaceC0476a11, 14), null, null, null, null, C7204a.m14522b(interfaceC0476a11, 197654323, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // cm.InterfaceC2057q
                                                        /* JADX INFO: renamed from: M */
                                                        public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                            InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                            int iIntValue2 = num4.intValue();
                                                            C5207g.m11111f(interfaceC9786q, "$this$Button");
                                                            if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                                interfaceC0476a13.mo1650q();
                                                            } else {
                                                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                                                InterfaceC0500b interfaceC0500bM18272a = C9775f.m18272a(IntrinsicSize.Max);
                                                                String string4 = context4.getString(R.string.ui_continue);
                                                                C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                                long jM5345d = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5345d();
                                                                C5207g.m11110e(string4, "getString(R.string.ui_continue)");
                                                                TextKt.m1576c(string4, interfaceC0500bM18272a, jM5345d, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 1, null, c7218l5, interfaceC0476a13, 48, 3072, 24056);
                                                            }
                                                            return C9072e.f47360a;
                                                        }
                                                    }), interfaceC0476a11, (14 & (i20 >> 21)) | 805306368, 484);
                                                    interfaceC0476a11.mo1661w();
                                                    interfaceC0476a11.mo1663x();
                                                    interfaceC0476a11.mo1661w();
                                                    interfaceC0476a11.mo1661w();
                                                }
                                                return C9072e.f47360a;
                                            }
                                        }), interfaceC0476a5, 196608, 22);
                                    }
                                    return C9072e.f47360a;
                                }
                            }), interfaceC0476a3, 12582912, 122);
                            return C9072e.f47360a;
                        }
                    }), composerImpl, ((i15 >> 6) & 14) | 199680, 18);
                    interfaceC2041a7 = interfaceC2041a5;
                    interfaceC2041a8 = interfaceC2041a6;
                } else {
                    composerImplMo1636j.mo1650q();
                    interfaceC2041a7 = interfaceC2041a3;
                    interfaceC2041a8 = interfaceC2041a4;
                    composerImpl = composerImplMo1636j;
                }
                c5332q0M1612T = composerImpl.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        ReviewUnscrambleResultPopupKt.m10307a(reviewResultType, str, z10, str2, str3, z11, interfaceC2041a7, interfaceC2041a8, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 12582912;
            interfaceC2041a4 = interfaceC2041a2;
            i15 = i12;
            if ((i15 & 23967451) == 4793490) {
                if (i16 != 0) {
                    interfaceC2041a5 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2041a5 = interfaceC2041a3;
                }
                if (i13 != 0) {
                    interfaceC2041a6 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$2
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2041a6 = interfaceC2041a4;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                final Context context2 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                final InterfaceC2041a<C9072e> interfaceC2041a11 = interfaceC2041a5;
                composerImpl = composerImplMo1636j;
                final InterfaceC2041a<C9072e> interfaceC2041a12 = interfaceC2041a6;
                AnimatedVisibilityKt.m1334b(z10, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 60, null, 4), 2), null, C7204a.m14522b(composerImpl, 1982907829, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r9v1, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3, kotlin.jvm.internal.Lambda] */
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
                        if (objMo1624d == InterfaceC0476a.a.f3122a) {
                            objMo1624d = new C9613k();
                            interfaceC0476a3.mo1655t(objMo1624d);
                        }
                        interfaceC0476a3.mo1661w();
                        InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, (InterfaceC9612j) objMo1624d, null, false, null, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.2
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        }, 28);
                        long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                        final Context context3 = context2;
                        final boolean z12 = z11;
                        final String str4 = str2;
                        final int i17 = i15;
                        final ReviewResultType reviewResultType2 = reviewResultType;
                        final String str5 = str3;
                        final String str6 = str;
                        final InterfaceC2041a<C9072e> interfaceC2041a13 = interfaceC2041a11;
                        final InterfaceC2041a<C9072e> interfaceC2041a14 = interfaceC2041a12;
                        SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1127002864, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Type inference failed for: r3v7, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2, kotlin.jvm.internal.Lambda] */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                    interfaceC0476a5.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                    InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1508e(C5212l.m11156c0(InterfaceC0500b.a.f3325a, SpacingKt.m10360a(interfaceC0476a5).f33955e))), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.1
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final Integer mo528n(Integer num3) {
                                            num3.intValue();
                                            return -500;
                                        }
                                    })), EnterExitTransitionKt.m1348e(null, 3), "animateEnterExit"), C7499b.m14898D(interfaceC0476a5).m5363v(), C7499b.m14916N(interfaceC0476a5).f9263e);
                                    C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                    final Context context4 = context3;
                                    final boolean z13 = z12;
                                    final String str7 = str4;
                                    final int i18 = i17;
                                    final ReviewResultType reviewResultType3 = reviewResultType2;
                                    final String str8 = str5;
                                    final String str9 = str6;
                                    final InterfaceC2041a<C9072e> interfaceC2041a15 = interfaceC2041a13;
                                    final InterfaceC2041a<C9072e> interfaceC2041a16 = interfaceC2041a14;
                                    CardKt.m1557a(interfaceC0500bM309T, null, null, c0463bM11139L, null, C7204a.m14522b(interfaceC0476a5, -1565704098, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.2

                                        /* JADX INFO: renamed from: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$a */
                                        public /* synthetic */ class a {

                                            /* JADX INFO: renamed from: a */
                                            public static final /* synthetic */ int[] f30442a;

                                            static {
                                                int[] iArr = new int[ReviewResultType.values().length];
                                                try {
                                                    iArr[ReviewResultType.CORRECT.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[ReviewResultType.ALMOST.ordinal()] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                                try {
                                                    iArr[ReviewResultType.INCORRECT.ordinal()] = 3;
                                                } catch (NoSuchFieldError unused3) {
                                                }
                                                f30442a = iArr;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r1v13, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2, kotlin.jvm.internal.Lambda] */
                                        /* JADX WARN: Type inference failed for: r2v48, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1, kotlin.jvm.internal.Lambda] */
                                        @Override // cm.InterfaceC2057q
                                        /* JADX INFO: renamed from: M */
                                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) throws Throwable {
                                            int i19;
                                            String string;
                                            InterfaceC0476a interfaceC0476a7;
                                            long jM5366y;
                                            InterfaceC0476a interfaceC0476a8;
                                            long jM5366y2;
                                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a6;
                                            int iIntValue = num3.intValue();
                                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                                            if ((iIntValue & 81) == 16 && interfaceC0476a9.mo1642m()) {
                                                interfaceC0476a9.mo1650q();
                                            } else {
                                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                                InterfaceC0500b interfaceC0500bM11156c0 = C5212l.m11156c0(SizeKt.m1508e(SizeKt.m1512i(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                                String str10 = str9;
                                                interfaceC0476a9.mo1622c(693286680);
                                                C0438a.f fVar = C0438a.f2429a;
                                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(fVar, bVar, interfaceC0476a9);
                                                interfaceC0476a9.mo1622c(-1323940314);
                                                C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
                                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d1);
                                                C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
                                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d2);
                                                C5304d1 c5304d3 = CompositionLocalsKt.f4148p;
                                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d3);
                                                ComposeUiNode.f3726n.getClass();
                                                InterfaceC2041a<ComposeUiNode> interfaceC2041a17 = ComposeUiNode.Companion.f3728b;
                                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c0);
                                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                                    C8573r0.m16771y0();
                                                    throw null;
                                                }
                                                interfaceC0476a9.mo1640l();
                                                if (interfaceC0476a9.mo1632h()) {
                                                    interfaceC0476a9.mo1634i(interfaceC2041a17);
                                                } else {
                                                    interfaceC0476a9.mo1653s();
                                                }
                                                interfaceC0476a9.mo1644n();
                                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p = ComposeUiNode.Companion.f3731e;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p);
                                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p2 = ComposeUiNode.Companion.f3730d;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c, interfaceC2056p2);
                                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3732f;
                                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection, interfaceC2056p3);
                                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3733g;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n1, interfaceC2056p4);
                                                interfaceC0476a9.mo1626e();
                                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                                interfaceC0476a9.mo1622c(2058660585);
                                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                long jM16765v0 = C8573r0.m16765v0(24);
                                                C9797g c9797g = new C9797g(3);
                                                int i20 = i18;
                                                TextKt.m1576c(str10, interfaceC0500bM11156c1, 0L, jM16765v0, null, null, null, 0L, null, c9797g, 0L, 0, false, 0, null, null, interfaceC0476a9, ((i20 >> 3) & 14) | 3072, 0, 65012);
                                                InterfaceC0500b interfaceC0500bM11156c2 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                int[] iArr = a.f30442a;
                                                ReviewResultType reviewResultType4 = reviewResultType3;
                                                int i21 = iArr[reviewResultType4.ordinal()];
                                                final Context context5 = context4;
                                                if (i21 == 1) {
                                                    i19 = 3;
                                                    string = context5.getString(R.string.activities_correct);
                                                } else if (i21 != 2) {
                                                    i19 = 3;
                                                    if (i21 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    string = context5.getString(R.string.activities_incorrect);
                                                } else {
                                                    i19 = 3;
                                                    string = context5.getString(R.string.activities_almost);
                                                }
                                                C7218l c7218l = C7499b.m14918P(interfaceC0476a9).f9267d;
                                                int i22 = iArr[reviewResultType4.ordinal()];
                                                if (i22 == 1) {
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572499);
                                                    jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                                    interfaceC0476a7.mo1661w();
                                                } else if (i22 == 2) {
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572655);
                                                    jM5366y = C7499b.m14898D(interfaceC0476a7).m5366y();
                                                    interfaceC0476a7.mo1661w();
                                                } else {
                                                    if (i22 != i19) {
                                                        interfaceC0476a9.mo1622c(106566727);
                                                        interfaceC0476a9.mo1661w();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572813);
                                                    jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33945g.getValue()).f47705a;
                                                    interfaceC0476a7.mo1661w();
                                                }
                                                C5207g.m11110e(string, "when (result) {\n        …                        }");
                                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a7;
                                                TextKt.m1576c(string, interfaceC0500bM11156c2, jM5366y, 0L, null, null, null, 0L, null, new C9797g(i19), 0L, 0, false, 0, null, c7218l, interfaceC0476a10, 0, 0, 32248);
                                                interfaceC0476a10.mo1661w();
                                                interfaceC0476a10.mo1663x();
                                                interfaceC0476a10.mo1661w();
                                                interfaceC0476a10.mo1661w();
                                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                String string2 = context5.getString(R.string.label_correct);
                                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33946h.getValue()).f47705a;
                                                C5207g.m11110e(string2, "getString(R.string.label_correct)");
                                                TextKt.m1576c(string2, interfaceC0500bM11159f0, j11, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, 0, 0, 32248);
                                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33956f, SpacingKt.m10360a(interfaceC0476a10).f33956f, 2);
                                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                boolean z14 = z13;
                                                TextKt.m1576c(str7, interfaceC0500bM11159f1, C7499b.m14898D(interfaceC0476a10).m5354m(), 0L, null, null, null, 0L, null, new C9797g(z14 ? 6 : 5), 0L, 0, false, 0, null, c7218l3, interfaceC0476a10, (i20 >> 9) & 14, 0, 32248);
                                                InterfaceC0500b interfaceC0500bM11159f2 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                String string3 = context5.getString(R.string.activities_you_answered);
                                                C7218l c7218l4 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                int i23 = iArr[reviewResultType4.ordinal()];
                                                if (i23 == 1) {
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521532);
                                                    jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33946h.getValue()).f47705a;
                                                    interfaceC0476a8.mo1661w();
                                                } else if (i23 == 2) {
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521387);
                                                    jM5366y2 = C7499b.m14898D(interfaceC0476a8).m5366y();
                                                    interfaceC0476a8.mo1661w();
                                                } else {
                                                    if (i23 != 3) {
                                                        interfaceC0476a10.mo1622c(-2029529946);
                                                        interfaceC0476a10.mo1661w();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521241);
                                                    jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33945g.getValue()).f47705a;
                                                    interfaceC0476a8.mo1661w();
                                                }
                                                C5207g.m11110e(string3, "getString(R.string.activities_you_answered)");
                                                InterfaceC0476a interfaceC0476a11 = interfaceC0476a8;
                                                TextKt.m1576c(string3, interfaceC0500bM11159f2, jM5366y2, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l4, interfaceC0476a11, 0, 0, 32248);
                                                MatchingTextKt.m9749a(C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33957g, 2), C7499b.m14918P(interfaceC0476a11).f9273j, new C9797g(z14 ? 6 : 5), 0L, 0L, str8, str7, interfaceC0476a11, (3670016 & (i20 << 9)) | ((i20 << 3) & 458752), 24);
                                                float f3 = 70;
                                                InterfaceC0500b interfaceC0500bM1509f = SizeKt.m1509f(SizeKt.m1508e(aVar), f3);
                                                InterfaceC2041a<C9072e> interfaceC2041a18 = interfaceC2041a15;
                                                InterfaceC2041a<C9072e> interfaceC2041a19 = interfaceC2041a16;
                                                interfaceC0476a11.mo1622c(693286680);
                                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(fVar, InterfaceC7885a.a.f42993e, interfaceC0476a11);
                                                interfaceC0476a11.mo1622c(-1323940314);
                                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a11.mo1648p(c5304d1);
                                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a11.mo1648p(c5304d2);
                                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a11.mo1648p(c5304d3);
                                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1509f);
                                                if (!(interfaceC0476a11.mo1646o() instanceof InterfaceC5299c)) {
                                                    C8573r0.m16771y0();
                                                    throw null;
                                                }
                                                interfaceC0476a11.mo1640l();
                                                if (interfaceC0476a11.mo1632h()) {
                                                    interfaceC0476a11.mo1634i(interfaceC2041a17);
                                                } else {
                                                    interfaceC0476a11.mo1653s();
                                                }
                                                interfaceC0476a11.mo1644n();
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC5652pM1503a2, interfaceC2056p);
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC10015c2, interfaceC2056p2);
                                                C8573r0.m16714a1(interfaceC0476a11, layoutDirection2, interfaceC2056p3);
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC0647n2, interfaceC2056p4);
                                                interfaceC0476a11.mo1626e();
                                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a11), interfaceC0476a11, 0);
                                                interfaceC0476a11.mo1622c(2058660585);
                                                IntrinsicSize intrinsicSize = IntrinsicSize.Max;
                                                ButtonKt.m1556b(interfaceC2041a18, C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 6), false, C7499b.m14916N(interfaceC0476a11).f9260b, null, null, new C9112d(1, new C9156l0(C7499b.m14898D(interfaceC0476a11).m5355n())), null, null, C7204a.m14522b(interfaceC0476a11, 813356273, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // cm.InterfaceC2057q
                                                    /* JADX INFO: renamed from: M */
                                                    public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                        InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                        int iIntValue2 = num4.intValue();
                                                        C5207g.m11111f(interfaceC9786q, "$this$OutlinedButton");
                                                        if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                            interfaceC0476a13.mo1650q();
                                                        } else {
                                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                                            InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(C9775f.m18272a(IntrinsicSize.Max), InterfaceC7885a.a.f42991c, 2);
                                                            String string4 = context5.getString(R.string.warning_try_again);
                                                            C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                            long jM5354m = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5354m();
                                                            C5207g.m11110e(string4, "getString(R.string.warning_try_again)");
                                                            AutoSizedTextKt.m10305a(string4, interfaceC0500bM1513j, jM5354m, new C9797g(3), 0L, 0, false, 2, c7218l5, interfaceC0476a13, 12582960, 112);
                                                        }
                                                        return C9072e.f47360a;
                                                    }
                                                }), interfaceC0476a11, ((i20 >> 18) & 14) | 805306368, 436);
                                                C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(interfaceC0476a11).f33951a), interfaceC0476a11);
                                                InterfaceC0500b interfaceC0500bM11159f3 = C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 3);
                                                AbstractC10270a abstractC10270a = C7499b.m14916N(interfaceC0476a11).f9260b;
                                                C9782m c9782m = C1646b.f9206a;
                                                ButtonKt.m1555a(interfaceC2041a19, interfaceC0500bM11159f3, false, abstractC10270a, C1646b.m5339a(C7499b.m14898D(interfaceC0476a11).m5351j(), interfaceC0476a11, 14), null, null, null, null, C7204a.m14522b(interfaceC0476a11, 197654323, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // cm.InterfaceC2057q
                                                    /* JADX INFO: renamed from: M */
                                                    public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                        InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                        int iIntValue2 = num4.intValue();
                                                        C5207g.m11111f(interfaceC9786q, "$this$Button");
                                                        if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                            interfaceC0476a13.mo1650q();
                                                        } else {
                                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                                            InterfaceC0500b interfaceC0500bM18272a = C9775f.m18272a(IntrinsicSize.Max);
                                                            String string4 = context5.getString(R.string.ui_continue);
                                                            C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                            long jM5345d = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5345d();
                                                            C5207g.m11110e(string4, "getString(R.string.ui_continue)");
                                                            TextKt.m1576c(string4, interfaceC0500bM18272a, jM5345d, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 1, null, c7218l5, interfaceC0476a13, 48, 3072, 24056);
                                                        }
                                                        return C9072e.f47360a;
                                                    }
                                                }), interfaceC0476a11, (14 & (i20 >> 21)) | 805306368, 484);
                                                interfaceC0476a11.mo1661w();
                                                interfaceC0476a11.mo1663x();
                                                interfaceC0476a11.mo1661w();
                                                interfaceC0476a11.mo1661w();
                                            }
                                            return C9072e.f47360a;
                                        }
                                    }), interfaceC0476a5, 196608, 22);
                                }
                                return C9072e.f47360a;
                            }
                        }), interfaceC0476a3, 12582912, 122);
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i15 >> 6) & 14) | 199680, 18);
                interfaceC2041a7 = interfaceC2041a5;
                interfaceC2041a8 = interfaceC2041a6;
            } else {
                if (i16 != 0) {
                    interfaceC2041a5 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2041a5 = interfaceC2041a3;
                }
                if (i13 != 0) {
                    interfaceC2041a6 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$2
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2041a6 = interfaceC2041a4;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                final Context context3 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                final InterfaceC2041a<C9072e> interfaceC2041a13 = interfaceC2041a5;
                composerImpl = composerImplMo1636j;
                final InterfaceC2041a<C9072e> interfaceC2041a14 = interfaceC2041a6;
                AnimatedVisibilityKt.m1334b(z10, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 60, null, 4), 2), null, C7204a.m14522b(composerImpl, 1982907829, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r9v1, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3, kotlin.jvm.internal.Lambda] */
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
                        if (objMo1624d == InterfaceC0476a.a.f3122a) {
                            objMo1624d = new C9613k();
                            interfaceC0476a3.mo1655t(objMo1624d);
                        }
                        interfaceC0476a3.mo1661w();
                        InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, (InterfaceC9612j) objMo1624d, null, false, null, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.2
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        }, 28);
                        long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                        final Context context4 = context3;
                        final boolean z12 = z11;
                        final String str4 = str2;
                        final int i17 = i15;
                        final ReviewResultType reviewResultType2 = reviewResultType;
                        final String str5 = str3;
                        final String str6 = str;
                        final InterfaceC2041a<C9072e> interfaceC2041a15 = interfaceC2041a13;
                        final InterfaceC2041a<C9072e> interfaceC2041a16 = interfaceC2041a14;
                        SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1127002864, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Type inference failed for: r3v7, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2, kotlin.jvm.internal.Lambda] */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                    interfaceC0476a5.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                    InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1508e(C5212l.m11156c0(InterfaceC0500b.a.f3325a, SpacingKt.m10360a(interfaceC0476a5).f33955e))), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.1
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final Integer mo528n(Integer num3) {
                                            num3.intValue();
                                            return -500;
                                        }
                                    })), EnterExitTransitionKt.m1348e(null, 3), "animateEnterExit"), C7499b.m14898D(interfaceC0476a5).m5363v(), C7499b.m14916N(interfaceC0476a5).f9263e);
                                    C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                    final Context context5 = context4;
                                    final boolean z13 = z12;
                                    final String str7 = str4;
                                    final int i18 = i17;
                                    final ReviewResultType reviewResultType3 = reviewResultType2;
                                    final String str8 = str5;
                                    final String str9 = str6;
                                    final InterfaceC2041a<C9072e> interfaceC2041a17 = interfaceC2041a15;
                                    final InterfaceC2041a<C9072e> interfaceC2041a18 = interfaceC2041a16;
                                    CardKt.m1557a(interfaceC0500bM309T, null, null, c0463bM11139L, null, C7204a.m14522b(interfaceC0476a5, -1565704098, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.2

                                        /* JADX INFO: renamed from: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$a */
                                        public /* synthetic */ class a {

                                            /* JADX INFO: renamed from: a */
                                            public static final /* synthetic */ int[] f30442a;

                                            static {
                                                int[] iArr = new int[ReviewResultType.values().length];
                                                try {
                                                    iArr[ReviewResultType.CORRECT.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[ReviewResultType.ALMOST.ordinal()] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                                try {
                                                    iArr[ReviewResultType.INCORRECT.ordinal()] = 3;
                                                } catch (NoSuchFieldError unused3) {
                                                }
                                                f30442a = iArr;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r1v13, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2, kotlin.jvm.internal.Lambda] */
                                        /* JADX WARN: Type inference failed for: r2v48, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1, kotlin.jvm.internal.Lambda] */
                                        @Override // cm.InterfaceC2057q
                                        /* JADX INFO: renamed from: M */
                                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) throws Throwable {
                                            int i19;
                                            String string;
                                            InterfaceC0476a interfaceC0476a7;
                                            long jM5366y;
                                            InterfaceC0476a interfaceC0476a8;
                                            long jM5366y2;
                                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a6;
                                            int iIntValue = num3.intValue();
                                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                                            if ((iIntValue & 81) == 16 && interfaceC0476a9.mo1642m()) {
                                                interfaceC0476a9.mo1650q();
                                            } else {
                                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                                InterfaceC0500b interfaceC0500bM11156c0 = C5212l.m11156c0(SizeKt.m1508e(SizeKt.m1512i(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                                String str10 = str9;
                                                interfaceC0476a9.mo1622c(693286680);
                                                C0438a.f fVar = C0438a.f2429a;
                                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(fVar, bVar, interfaceC0476a9);
                                                interfaceC0476a9.mo1622c(-1323940314);
                                                C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
                                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d1);
                                                C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
                                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d2);
                                                C5304d1 c5304d3 = CompositionLocalsKt.f4148p;
                                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d3);
                                                ComposeUiNode.f3726n.getClass();
                                                InterfaceC2041a<ComposeUiNode> interfaceC2041a19 = ComposeUiNode.Companion.f3728b;
                                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c0);
                                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                                    C8573r0.m16771y0();
                                                    throw null;
                                                }
                                                interfaceC0476a9.mo1640l();
                                                if (interfaceC0476a9.mo1632h()) {
                                                    interfaceC0476a9.mo1634i(interfaceC2041a19);
                                                } else {
                                                    interfaceC0476a9.mo1653s();
                                                }
                                                interfaceC0476a9.mo1644n();
                                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p = ComposeUiNode.Companion.f3731e;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p);
                                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p2 = ComposeUiNode.Companion.f3730d;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c, interfaceC2056p2);
                                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3732f;
                                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection, interfaceC2056p3);
                                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3733g;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n1, interfaceC2056p4);
                                                interfaceC0476a9.mo1626e();
                                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                                interfaceC0476a9.mo1622c(2058660585);
                                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                long jM16765v0 = C8573r0.m16765v0(24);
                                                C9797g c9797g = new C9797g(3);
                                                int i20 = i18;
                                                TextKt.m1576c(str10, interfaceC0500bM11156c1, 0L, jM16765v0, null, null, null, 0L, null, c9797g, 0L, 0, false, 0, null, null, interfaceC0476a9, ((i20 >> 3) & 14) | 3072, 0, 65012);
                                                InterfaceC0500b interfaceC0500bM11156c2 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                int[] iArr = a.f30442a;
                                                ReviewResultType reviewResultType4 = reviewResultType3;
                                                int i21 = iArr[reviewResultType4.ordinal()];
                                                final Context context6 = context5;
                                                if (i21 == 1) {
                                                    i19 = 3;
                                                    string = context6.getString(R.string.activities_correct);
                                                } else if (i21 != 2) {
                                                    i19 = 3;
                                                    if (i21 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    string = context6.getString(R.string.activities_incorrect);
                                                } else {
                                                    i19 = 3;
                                                    string = context6.getString(R.string.activities_almost);
                                                }
                                                C7218l c7218l = C7499b.m14918P(interfaceC0476a9).f9267d;
                                                int i22 = iArr[reviewResultType4.ordinal()];
                                                if (i22 == 1) {
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572499);
                                                    jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                                    interfaceC0476a7.mo1661w();
                                                } else if (i22 == 2) {
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572655);
                                                    jM5366y = C7499b.m14898D(interfaceC0476a7).m5366y();
                                                    interfaceC0476a7.mo1661w();
                                                } else {
                                                    if (i22 != i19) {
                                                        interfaceC0476a9.mo1622c(106566727);
                                                        interfaceC0476a9.mo1661w();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572813);
                                                    jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33945g.getValue()).f47705a;
                                                    interfaceC0476a7.mo1661w();
                                                }
                                                C5207g.m11110e(string, "when (result) {\n        …                        }");
                                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a7;
                                                TextKt.m1576c(string, interfaceC0500bM11156c2, jM5366y, 0L, null, null, null, 0L, null, new C9797g(i19), 0L, 0, false, 0, null, c7218l, interfaceC0476a10, 0, 0, 32248);
                                                interfaceC0476a10.mo1661w();
                                                interfaceC0476a10.mo1663x();
                                                interfaceC0476a10.mo1661w();
                                                interfaceC0476a10.mo1661w();
                                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                String string2 = context6.getString(R.string.label_correct);
                                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33946h.getValue()).f47705a;
                                                C5207g.m11110e(string2, "getString(R.string.label_correct)");
                                                TextKt.m1576c(string2, interfaceC0500bM11159f0, j11, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, 0, 0, 32248);
                                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33956f, SpacingKt.m10360a(interfaceC0476a10).f33956f, 2);
                                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                boolean z14 = z13;
                                                TextKt.m1576c(str7, interfaceC0500bM11159f1, C7499b.m14898D(interfaceC0476a10).m5354m(), 0L, null, null, null, 0L, null, new C9797g(z14 ? 6 : 5), 0L, 0, false, 0, null, c7218l3, interfaceC0476a10, (i20 >> 9) & 14, 0, 32248);
                                                InterfaceC0500b interfaceC0500bM11159f2 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                String string3 = context6.getString(R.string.activities_you_answered);
                                                C7218l c7218l4 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                int i23 = iArr[reviewResultType4.ordinal()];
                                                if (i23 == 1) {
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521532);
                                                    jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33946h.getValue()).f47705a;
                                                    interfaceC0476a8.mo1661w();
                                                } else if (i23 == 2) {
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521387);
                                                    jM5366y2 = C7499b.m14898D(interfaceC0476a8).m5366y();
                                                    interfaceC0476a8.mo1661w();
                                                } else {
                                                    if (i23 != 3) {
                                                        interfaceC0476a10.mo1622c(-2029529946);
                                                        interfaceC0476a10.mo1661w();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521241);
                                                    jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33945g.getValue()).f47705a;
                                                    interfaceC0476a8.mo1661w();
                                                }
                                                C5207g.m11110e(string3, "getString(R.string.activities_you_answered)");
                                                InterfaceC0476a interfaceC0476a11 = interfaceC0476a8;
                                                TextKt.m1576c(string3, interfaceC0500bM11159f2, jM5366y2, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l4, interfaceC0476a11, 0, 0, 32248);
                                                MatchingTextKt.m9749a(C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33957g, 2), C7499b.m14918P(interfaceC0476a11).f9273j, new C9797g(z14 ? 6 : 5), 0L, 0L, str8, str7, interfaceC0476a11, (3670016 & (i20 << 9)) | ((i20 << 3) & 458752), 24);
                                                float f3 = 70;
                                                InterfaceC0500b interfaceC0500bM1509f = SizeKt.m1509f(SizeKt.m1508e(aVar), f3);
                                                InterfaceC2041a<C9072e> interfaceC2041a110 = interfaceC2041a17;
                                                InterfaceC2041a<C9072e> interfaceC2041a111 = interfaceC2041a18;
                                                interfaceC0476a11.mo1622c(693286680);
                                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(fVar, InterfaceC7885a.a.f42993e, interfaceC0476a11);
                                                interfaceC0476a11.mo1622c(-1323940314);
                                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a11.mo1648p(c5304d1);
                                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a11.mo1648p(c5304d2);
                                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a11.mo1648p(c5304d3);
                                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1509f);
                                                if (!(interfaceC0476a11.mo1646o() instanceof InterfaceC5299c)) {
                                                    C8573r0.m16771y0();
                                                    throw null;
                                                }
                                                interfaceC0476a11.mo1640l();
                                                if (interfaceC0476a11.mo1632h()) {
                                                    interfaceC0476a11.mo1634i(interfaceC2041a19);
                                                } else {
                                                    interfaceC0476a11.mo1653s();
                                                }
                                                interfaceC0476a11.mo1644n();
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC5652pM1503a2, interfaceC2056p);
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC10015c2, interfaceC2056p2);
                                                C8573r0.m16714a1(interfaceC0476a11, layoutDirection2, interfaceC2056p3);
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC0647n2, interfaceC2056p4);
                                                interfaceC0476a11.mo1626e();
                                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a11), interfaceC0476a11, 0);
                                                interfaceC0476a11.mo1622c(2058660585);
                                                IntrinsicSize intrinsicSize = IntrinsicSize.Max;
                                                ButtonKt.m1556b(interfaceC2041a110, C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 6), false, C7499b.m14916N(interfaceC0476a11).f9260b, null, null, new C9112d(1, new C9156l0(C7499b.m14898D(interfaceC0476a11).m5355n())), null, null, C7204a.m14522b(interfaceC0476a11, 813356273, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // cm.InterfaceC2057q
                                                    /* JADX INFO: renamed from: M */
                                                    public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                        InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                        int iIntValue2 = num4.intValue();
                                                        C5207g.m11111f(interfaceC9786q, "$this$OutlinedButton");
                                                        if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                            interfaceC0476a13.mo1650q();
                                                        } else {
                                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                                                            InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(C9775f.m18272a(IntrinsicSize.Max), InterfaceC7885a.a.f42991c, 2);
                                                            String string4 = context6.getString(R.string.warning_try_again);
                                                            C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                            long jM5354m = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5354m();
                                                            C5207g.m11110e(string4, "getString(R.string.warning_try_again)");
                                                            AutoSizedTextKt.m10305a(string4, interfaceC0500bM1513j, jM5354m, new C9797g(3), 0L, 0, false, 2, c7218l5, interfaceC0476a13, 12582960, 112);
                                                        }
                                                        return C9072e.f47360a;
                                                    }
                                                }), interfaceC0476a11, ((i20 >> 18) & 14) | 805306368, 436);
                                                C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(interfaceC0476a11).f33951a), interfaceC0476a11);
                                                InterfaceC0500b interfaceC0500bM11159f3 = C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 3);
                                                AbstractC10270a abstractC10270a = C7499b.m14916N(interfaceC0476a11).f9260b;
                                                C9782m c9782m = C1646b.f9206a;
                                                ButtonKt.m1555a(interfaceC2041a111, interfaceC0500bM11159f3, false, abstractC10270a, C1646b.m5339a(C7499b.m14898D(interfaceC0476a11).m5351j(), interfaceC0476a11, 14), null, null, null, null, C7204a.m14522b(interfaceC0476a11, 197654323, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // cm.InterfaceC2057q
                                                    /* JADX INFO: renamed from: M */
                                                    public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                        InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                        int iIntValue2 = num4.intValue();
                                                        C5207g.m11111f(interfaceC9786q, "$this$Button");
                                                        if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                            interfaceC0476a13.mo1650q();
                                                        } else {
                                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                                                            InterfaceC0500b interfaceC0500bM18272a = C9775f.m18272a(IntrinsicSize.Max);
                                                            String string4 = context6.getString(R.string.ui_continue);
                                                            C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                            long jM5345d = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5345d();
                                                            C5207g.m11110e(string4, "getString(R.string.ui_continue)");
                                                            TextKt.m1576c(string4, interfaceC0500bM18272a, jM5345d, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 1, null, c7218l5, interfaceC0476a13, 48, 3072, 24056);
                                                        }
                                                        return C9072e.f47360a;
                                                    }
                                                }), interfaceC0476a11, (14 & (i20 >> 21)) | 805306368, 484);
                                                interfaceC0476a11.mo1661w();
                                                interfaceC0476a11.mo1663x();
                                                interfaceC0476a11.mo1661w();
                                                interfaceC0476a11.mo1661w();
                                            }
                                            return C9072e.f47360a;
                                        }
                                    }), interfaceC0476a5, 196608, 22);
                                }
                                return C9072e.f47360a;
                            }
                        }), interfaceC0476a3, 12582912, 122);
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i15 >> 6) & 14) | 199680, 18);
                interfaceC2041a7 = interfaceC2041a5;
                interfaceC2041a8 = interfaceC2041a6;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    ReviewUnscrambleResultPopupKt.m10307a(reviewResultType, str, z10, str2, str3, z11, interfaceC2041a7, interfaceC2041a8, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 1572864;
        interfaceC2041a3 = interfaceC2041a;
        i13 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
        if (i13 != 0) {
            if ((29360128 & i10) == 0) {
                interfaceC2041a4 = interfaceC2041a2;
                if (composerImplMo1636j.m1600H(interfaceC2041a4)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i12 |= i14;
            }
            i15 = i12;
            if ((i15 & 23967451) == 4793490) {
                if (i16 != 0) {
                    interfaceC2041a5 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2041a5 = interfaceC2041a3;
                }
                if (i13 != 0) {
                    interfaceC2041a6 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$2
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2041a6 = interfaceC2041a4;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                final Context context4 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                final InterfaceC2041a<C9072e> interfaceC2041a15 = interfaceC2041a5;
                composerImpl = composerImplMo1636j;
                final InterfaceC2041a<C9072e> interfaceC2041a16 = interfaceC2041a6;
                AnimatedVisibilityKt.m1334b(z10, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 60, null, 4), 2), null, C7204a.m14522b(composerImpl, 1982907829, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r9v1, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3, kotlin.jvm.internal.Lambda] */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(AnimatedVisibilityScope animatedVisibilityScope, InterfaceC0476a interfaceC0476a2, Integer num) {
                        final AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        num.intValue();
                        C5207g.m11111f(animatedVisibilityScope2, "$this$AnimatedVisibility");
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                        InterfaceC0500b interfaceC0500bM1507d = SizeKt.m1507d();
                        interfaceC0476a3.mo1622c(-492369756);
                        Object objMo1624d = interfaceC0476a3.mo1624d();
                        if (objMo1624d == InterfaceC0476a.a.f3122a) {
                            objMo1624d = new C9613k();
                            interfaceC0476a3.mo1655t(objMo1624d);
                        }
                        interfaceC0476a3.mo1661w();
                        InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, (InterfaceC9612j) objMo1624d, null, false, null, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.2
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        }, 28);
                        long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                        final Context context5 = context4;
                        final boolean z12 = z11;
                        final String str4 = str2;
                        final int i17 = i15;
                        final ReviewResultType reviewResultType2 = reviewResultType;
                        final String str5 = str3;
                        final String str6 = str;
                        final InterfaceC2041a<C9072e> interfaceC2041a17 = interfaceC2041a15;
                        final InterfaceC2041a<C9072e> interfaceC2041a18 = interfaceC2041a16;
                        SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1127002864, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Type inference failed for: r3v7, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2, kotlin.jvm.internal.Lambda] */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                    interfaceC0476a5.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                    InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1508e(C5212l.m11156c0(InterfaceC0500b.a.f3325a, SpacingKt.m10360a(interfaceC0476a5).f33955e))), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.1
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final Integer mo528n(Integer num3) {
                                            num3.intValue();
                                            return -500;
                                        }
                                    })), EnterExitTransitionKt.m1348e(null, 3), "animateEnterExit"), C7499b.m14898D(interfaceC0476a5).m5363v(), C7499b.m14916N(interfaceC0476a5).f9263e);
                                    C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                    final Context context6 = context5;
                                    final boolean z13 = z12;
                                    final String str7 = str4;
                                    final int i18 = i17;
                                    final ReviewResultType reviewResultType3 = reviewResultType2;
                                    final String str8 = str5;
                                    final String str9 = str6;
                                    final InterfaceC2041a<C9072e> interfaceC2041a19 = interfaceC2041a17;
                                    final InterfaceC2041a<C9072e> interfaceC2041a110 = interfaceC2041a18;
                                    CardKt.m1557a(interfaceC0500bM309T, null, null, c0463bM11139L, null, C7204a.m14522b(interfaceC0476a5, -1565704098, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.2

                                        /* JADX INFO: renamed from: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$a */
                                        public /* synthetic */ class a {

                                            /* JADX INFO: renamed from: a */
                                            public static final /* synthetic */ int[] f30442a;

                                            static {
                                                int[] iArr = new int[ReviewResultType.values().length];
                                                try {
                                                    iArr[ReviewResultType.CORRECT.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[ReviewResultType.ALMOST.ordinal()] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                                try {
                                                    iArr[ReviewResultType.INCORRECT.ordinal()] = 3;
                                                } catch (NoSuchFieldError unused3) {
                                                }
                                                f30442a = iArr;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r1v13, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2, kotlin.jvm.internal.Lambda] */
                                        /* JADX WARN: Type inference failed for: r2v48, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1, kotlin.jvm.internal.Lambda] */
                                        @Override // cm.InterfaceC2057q
                                        /* JADX INFO: renamed from: M */
                                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) throws Throwable {
                                            int i19;
                                            String string;
                                            InterfaceC0476a interfaceC0476a7;
                                            long jM5366y;
                                            InterfaceC0476a interfaceC0476a8;
                                            long jM5366y2;
                                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a6;
                                            int iIntValue = num3.intValue();
                                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                                            if ((iIntValue & 81) == 16 && interfaceC0476a9.mo1642m()) {
                                                interfaceC0476a9.mo1650q();
                                            } else {
                                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                                InterfaceC0500b interfaceC0500bM11156c0 = C5212l.m11156c0(SizeKt.m1508e(SizeKt.m1512i(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                                String str10 = str9;
                                                interfaceC0476a9.mo1622c(693286680);
                                                C0438a.f fVar = C0438a.f2429a;
                                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(fVar, bVar, interfaceC0476a9);
                                                interfaceC0476a9.mo1622c(-1323940314);
                                                C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
                                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d1);
                                                C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
                                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d2);
                                                C5304d1 c5304d3 = CompositionLocalsKt.f4148p;
                                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d3);
                                                ComposeUiNode.f3726n.getClass();
                                                InterfaceC2041a<ComposeUiNode> interfaceC2041a111 = ComposeUiNode.Companion.f3728b;
                                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c0);
                                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                                    C8573r0.m16771y0();
                                                    throw null;
                                                }
                                                interfaceC0476a9.mo1640l();
                                                if (interfaceC0476a9.mo1632h()) {
                                                    interfaceC0476a9.mo1634i(interfaceC2041a111);
                                                } else {
                                                    interfaceC0476a9.mo1653s();
                                                }
                                                interfaceC0476a9.mo1644n();
                                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p = ComposeUiNode.Companion.f3731e;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p);
                                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p2 = ComposeUiNode.Companion.f3730d;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c, interfaceC2056p2);
                                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3732f;
                                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection, interfaceC2056p3);
                                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3733g;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n1, interfaceC2056p4);
                                                interfaceC0476a9.mo1626e();
                                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                                interfaceC0476a9.mo1622c(2058660585);
                                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                long jM16765v0 = C8573r0.m16765v0(24);
                                                C9797g c9797g = new C9797g(3);
                                                int i20 = i18;
                                                TextKt.m1576c(str10, interfaceC0500bM11156c1, 0L, jM16765v0, null, null, null, 0L, null, c9797g, 0L, 0, false, 0, null, null, interfaceC0476a9, ((i20 >> 3) & 14) | 3072, 0, 65012);
                                                InterfaceC0500b interfaceC0500bM11156c2 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                int[] iArr = a.f30442a;
                                                ReviewResultType reviewResultType4 = reviewResultType3;
                                                int i21 = iArr[reviewResultType4.ordinal()];
                                                final Context context7 = context6;
                                                if (i21 == 1) {
                                                    i19 = 3;
                                                    string = context7.getString(R.string.activities_correct);
                                                } else if (i21 != 2) {
                                                    i19 = 3;
                                                    if (i21 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    string = context7.getString(R.string.activities_incorrect);
                                                } else {
                                                    i19 = 3;
                                                    string = context7.getString(R.string.activities_almost);
                                                }
                                                C7218l c7218l = C7499b.m14918P(interfaceC0476a9).f9267d;
                                                int i22 = iArr[reviewResultType4.ordinal()];
                                                if (i22 == 1) {
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572499);
                                                    jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                                    interfaceC0476a7.mo1661w();
                                                } else if (i22 == 2) {
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572655);
                                                    jM5366y = C7499b.m14898D(interfaceC0476a7).m5366y();
                                                    interfaceC0476a7.mo1661w();
                                                } else {
                                                    if (i22 != i19) {
                                                        interfaceC0476a9.mo1622c(106566727);
                                                        interfaceC0476a9.mo1661w();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572813);
                                                    jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33945g.getValue()).f47705a;
                                                    interfaceC0476a7.mo1661w();
                                                }
                                                C5207g.m11110e(string, "when (result) {\n        …                        }");
                                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a7;
                                                TextKt.m1576c(string, interfaceC0500bM11156c2, jM5366y, 0L, null, null, null, 0L, null, new C9797g(i19), 0L, 0, false, 0, null, c7218l, interfaceC0476a10, 0, 0, 32248);
                                                interfaceC0476a10.mo1661w();
                                                interfaceC0476a10.mo1663x();
                                                interfaceC0476a10.mo1661w();
                                                interfaceC0476a10.mo1661w();
                                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                String string2 = context7.getString(R.string.label_correct);
                                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33946h.getValue()).f47705a;
                                                C5207g.m11110e(string2, "getString(R.string.label_correct)");
                                                TextKt.m1576c(string2, interfaceC0500bM11159f0, j11, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, 0, 0, 32248);
                                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33956f, SpacingKt.m10360a(interfaceC0476a10).f33956f, 2);
                                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                boolean z14 = z13;
                                                TextKt.m1576c(str7, interfaceC0500bM11159f1, C7499b.m14898D(interfaceC0476a10).m5354m(), 0L, null, null, null, 0L, null, new C9797g(z14 ? 6 : 5), 0L, 0, false, 0, null, c7218l3, interfaceC0476a10, (i20 >> 9) & 14, 0, 32248);
                                                InterfaceC0500b interfaceC0500bM11159f2 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                String string3 = context7.getString(R.string.activities_you_answered);
                                                C7218l c7218l4 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                int i23 = iArr[reviewResultType4.ordinal()];
                                                if (i23 == 1) {
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521532);
                                                    jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33946h.getValue()).f47705a;
                                                    interfaceC0476a8.mo1661w();
                                                } else if (i23 == 2) {
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521387);
                                                    jM5366y2 = C7499b.m14898D(interfaceC0476a8).m5366y();
                                                    interfaceC0476a8.mo1661w();
                                                } else {
                                                    if (i23 != 3) {
                                                        interfaceC0476a10.mo1622c(-2029529946);
                                                        interfaceC0476a10.mo1661w();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521241);
                                                    jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33945g.getValue()).f47705a;
                                                    interfaceC0476a8.mo1661w();
                                                }
                                                C5207g.m11110e(string3, "getString(R.string.activities_you_answered)");
                                                InterfaceC0476a interfaceC0476a11 = interfaceC0476a8;
                                                TextKt.m1576c(string3, interfaceC0500bM11159f2, jM5366y2, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l4, interfaceC0476a11, 0, 0, 32248);
                                                MatchingTextKt.m9749a(C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33957g, 2), C7499b.m14918P(interfaceC0476a11).f9273j, new C9797g(z14 ? 6 : 5), 0L, 0L, str8, str7, interfaceC0476a11, (3670016 & (i20 << 9)) | ((i20 << 3) & 458752), 24);
                                                float f3 = 70;
                                                InterfaceC0500b interfaceC0500bM1509f = SizeKt.m1509f(SizeKt.m1508e(aVar), f3);
                                                InterfaceC2041a<C9072e> interfaceC2041a112 = interfaceC2041a19;
                                                InterfaceC2041a<C9072e> interfaceC2041a113 = interfaceC2041a110;
                                                interfaceC0476a11.mo1622c(693286680);
                                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(fVar, InterfaceC7885a.a.f42993e, interfaceC0476a11);
                                                interfaceC0476a11.mo1622c(-1323940314);
                                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a11.mo1648p(c5304d1);
                                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a11.mo1648p(c5304d2);
                                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a11.mo1648p(c5304d3);
                                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1509f);
                                                if (!(interfaceC0476a11.mo1646o() instanceof InterfaceC5299c)) {
                                                    C8573r0.m16771y0();
                                                    throw null;
                                                }
                                                interfaceC0476a11.mo1640l();
                                                if (interfaceC0476a11.mo1632h()) {
                                                    interfaceC0476a11.mo1634i(interfaceC2041a111);
                                                } else {
                                                    interfaceC0476a11.mo1653s();
                                                }
                                                interfaceC0476a11.mo1644n();
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC5652pM1503a2, interfaceC2056p);
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC10015c2, interfaceC2056p2);
                                                C8573r0.m16714a1(interfaceC0476a11, layoutDirection2, interfaceC2056p3);
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC0647n2, interfaceC2056p4);
                                                interfaceC0476a11.mo1626e();
                                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a11), interfaceC0476a11, 0);
                                                interfaceC0476a11.mo1622c(2058660585);
                                                IntrinsicSize intrinsicSize = IntrinsicSize.Max;
                                                ButtonKt.m1556b(interfaceC2041a112, C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 6), false, C7499b.m14916N(interfaceC0476a11).f9260b, null, null, new C9112d(1, new C9156l0(C7499b.m14898D(interfaceC0476a11).m5355n())), null, null, C7204a.m14522b(interfaceC0476a11, 813356273, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // cm.InterfaceC2057q
                                                    /* JADX INFO: renamed from: M */
                                                    public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                        InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                        int iIntValue2 = num4.intValue();
                                                        C5207g.m11111f(interfaceC9786q, "$this$OutlinedButton");
                                                        if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                            interfaceC0476a13.mo1650q();
                                                        } else {
                                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                                            InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(C9775f.m18272a(IntrinsicSize.Max), InterfaceC7885a.a.f42991c, 2);
                                                            String string4 = context7.getString(R.string.warning_try_again);
                                                            C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                            long jM5354m = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5354m();
                                                            C5207g.m11110e(string4, "getString(R.string.warning_try_again)");
                                                            AutoSizedTextKt.m10305a(string4, interfaceC0500bM1513j, jM5354m, new C9797g(3), 0L, 0, false, 2, c7218l5, interfaceC0476a13, 12582960, 112);
                                                        }
                                                        return C9072e.f47360a;
                                                    }
                                                }), interfaceC0476a11, ((i20 >> 18) & 14) | 805306368, 436);
                                                C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(interfaceC0476a11).f33951a), interfaceC0476a11);
                                                InterfaceC0500b interfaceC0500bM11159f3 = C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 3);
                                                AbstractC10270a abstractC10270a = C7499b.m14916N(interfaceC0476a11).f9260b;
                                                C9782m c9782m = C1646b.f9206a;
                                                ButtonKt.m1555a(interfaceC2041a113, interfaceC0500bM11159f3, false, abstractC10270a, C1646b.m5339a(C7499b.m14898D(interfaceC0476a11).m5351j(), interfaceC0476a11, 14), null, null, null, null, C7204a.m14522b(interfaceC0476a11, 197654323, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // cm.InterfaceC2057q
                                                    /* JADX INFO: renamed from: M */
                                                    public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                        InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                        int iIntValue2 = num4.intValue();
                                                        C5207g.m11111f(interfaceC9786q, "$this$Button");
                                                        if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                            interfaceC0476a13.mo1650q();
                                                        } else {
                                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                                            InterfaceC0500b interfaceC0500bM18272a = C9775f.m18272a(IntrinsicSize.Max);
                                                            String string4 = context7.getString(R.string.ui_continue);
                                                            C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                            long jM5345d = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5345d();
                                                            C5207g.m11110e(string4, "getString(R.string.ui_continue)");
                                                            TextKt.m1576c(string4, interfaceC0500bM18272a, jM5345d, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 1, null, c7218l5, interfaceC0476a13, 48, 3072, 24056);
                                                        }
                                                        return C9072e.f47360a;
                                                    }
                                                }), interfaceC0476a11, (14 & (i20 >> 21)) | 805306368, 484);
                                                interfaceC0476a11.mo1661w();
                                                interfaceC0476a11.mo1663x();
                                                interfaceC0476a11.mo1661w();
                                                interfaceC0476a11.mo1661w();
                                            }
                                            return C9072e.f47360a;
                                        }
                                    }), interfaceC0476a5, 196608, 22);
                                }
                                return C9072e.f47360a;
                            }
                        }), interfaceC0476a3, 12582912, 122);
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i15 >> 6) & 14) | 199680, 18);
                interfaceC2041a7 = interfaceC2041a5;
                interfaceC2041a8 = interfaceC2041a6;
            } else {
                if (i16 != 0) {
                    interfaceC2041a5 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2041a5 = interfaceC2041a3;
                }
                if (i13 != 0) {
                    interfaceC2041a6 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$2
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2041a6 = interfaceC2041a4;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                final Context context5 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
                final InterfaceC2041a<C9072e> interfaceC2041a17 = interfaceC2041a5;
                composerImpl = composerImplMo1636j;
                final InterfaceC2041a<C9072e> interfaceC2041a18 = interfaceC2041a6;
                AnimatedVisibilityKt.m1334b(z10, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 60, null, 4), 2), null, C7204a.m14522b(composerImpl, 1982907829, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r9v1, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3, kotlin.jvm.internal.Lambda] */
                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final C9072e mo1343M(AnimatedVisibilityScope animatedVisibilityScope, InterfaceC0476a interfaceC0476a2, Integer num) {
                        final AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        num.intValue();
                        C5207g.m11111f(animatedVisibilityScope2, "$this$AnimatedVisibility");
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                        InterfaceC0500b interfaceC0500bM1507d = SizeKt.m1507d();
                        interfaceC0476a3.mo1622c(-492369756);
                        Object objMo1624d = interfaceC0476a3.mo1624d();
                        if (objMo1624d == InterfaceC0476a.a.f3122a) {
                            objMo1624d = new C9613k();
                            interfaceC0476a3.mo1655t(objMo1624d);
                        }
                        interfaceC0476a3.mo1661w();
                        InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, (InterfaceC9612j) objMo1624d, null, false, null, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.2
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                                return C9072e.f47360a;
                            }
                        }, 28);
                        long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                        final Context context6 = context5;
                        final boolean z12 = z11;
                        final String str4 = str2;
                        final int i17 = i15;
                        final ReviewResultType reviewResultType2 = reviewResultType;
                        final String str5 = str3;
                        final String str6 = str;
                        final InterfaceC2041a<C9072e> interfaceC2041a19 = interfaceC2041a17;
                        final InterfaceC2041a<C9072e> interfaceC2041a110 = interfaceC2041a18;
                        SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1127002864, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Type inference failed for: r3v7, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2, kotlin.jvm.internal.Lambda] */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                    interfaceC0476a5.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                                    InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1508e(C5212l.m11156c0(InterfaceC0500b.a.f3325a, SpacingKt.m10360a(interfaceC0476a5).f33955e))), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.1
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final Integer mo528n(Integer num3) {
                                            num3.intValue();
                                            return -500;
                                        }
                                    })), EnterExitTransitionKt.m1348e(null, 3), "animateEnterExit"), C7499b.m14898D(interfaceC0476a5).m5363v(), C7499b.m14916N(interfaceC0476a5).f9263e);
                                    C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                    final Context context7 = context6;
                                    final boolean z13 = z12;
                                    final String str7 = str4;
                                    final int i18 = i17;
                                    final ReviewResultType reviewResultType3 = reviewResultType2;
                                    final String str8 = str5;
                                    final String str9 = str6;
                                    final InterfaceC2041a<C9072e> interfaceC2041a111 = interfaceC2041a19;
                                    final InterfaceC2041a<C9072e> interfaceC2041a112 = interfaceC2041a110;
                                    CardKt.m1557a(interfaceC0500bM309T, null, null, c0463bM11139L, null, C7204a.m14522b(interfaceC0476a5, -1565704098, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.2

                                        /* JADX INFO: renamed from: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$a */
                                        public /* synthetic */ class a {

                                            /* JADX INFO: renamed from: a */
                                            public static final /* synthetic */ int[] f30442a;

                                            static {
                                                int[] iArr = new int[ReviewResultType.values().length];
                                                try {
                                                    iArr[ReviewResultType.CORRECT.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[ReviewResultType.ALMOST.ordinal()] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                                try {
                                                    iArr[ReviewResultType.INCORRECT.ordinal()] = 3;
                                                } catch (NoSuchFieldError unused3) {
                                                }
                                                f30442a = iArr;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r1v13, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2, kotlin.jvm.internal.Lambda] */
                                        /* JADX WARN: Type inference failed for: r2v48, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1, kotlin.jvm.internal.Lambda] */
                                        @Override // cm.InterfaceC2057q
                                        /* JADX INFO: renamed from: M */
                                        public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) throws Throwable {
                                            int i19;
                                            String string;
                                            InterfaceC0476a interfaceC0476a7;
                                            long jM5366y;
                                            InterfaceC0476a interfaceC0476a8;
                                            long jM5366y2;
                                            InterfaceC0476a interfaceC0476a9 = interfaceC0476a6;
                                            int iIntValue = num3.intValue();
                                            C5207g.m11111f(interfaceC9771b, "$this$Card");
                                            if ((iIntValue & 81) == 16 && interfaceC0476a9.mo1642m()) {
                                                interfaceC0476a9.mo1650q();
                                            } else {
                                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                                InterfaceC0500b interfaceC0500bM11156c0 = C5212l.m11156c0(SizeKt.m1508e(SizeKt.m1512i(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                                C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                                String str10 = str9;
                                                interfaceC0476a9.mo1622c(693286680);
                                                C0438a.f fVar = C0438a.f2429a;
                                                InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(fVar, bVar, interfaceC0476a9);
                                                interfaceC0476a9.mo1622c(-1323940314);
                                                C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
                                                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d1);
                                                C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
                                                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d2);
                                                C5304d1 c5304d3 = CompositionLocalsKt.f4148p;
                                                InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d3);
                                                ComposeUiNode.f3726n.getClass();
                                                InterfaceC2041a<ComposeUiNode> interfaceC2041a113 = ComposeUiNode.Companion.f3728b;
                                                ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c0);
                                                if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                                    C8573r0.m16771y0();
                                                    throw null;
                                                }
                                                interfaceC0476a9.mo1640l();
                                                if (interfaceC0476a9.mo1632h()) {
                                                    interfaceC0476a9.mo1634i(interfaceC2041a113);
                                                } else {
                                                    interfaceC0476a9.mo1653s();
                                                }
                                                interfaceC0476a9.mo1644n();
                                                InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p = ComposeUiNode.Companion.f3731e;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p);
                                                InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p2 = ComposeUiNode.Companion.f3730d;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c, interfaceC2056p2);
                                                InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3732f;
                                                C8573r0.m16714a1(interfaceC0476a9, layoutDirection, interfaceC2056p3);
                                                InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3733g;
                                                C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n1, interfaceC2056p4);
                                                interfaceC0476a9.mo1626e();
                                                composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                                interfaceC0476a9.mo1622c(2058660585);
                                                InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                long jM16765v0 = C8573r0.m16765v0(24);
                                                C9797g c9797g = new C9797g(3);
                                                int i20 = i18;
                                                TextKt.m1576c(str10, interfaceC0500bM11156c1, 0L, jM16765v0, null, null, null, 0L, null, c9797g, 0L, 0, false, 0, null, null, interfaceC0476a9, ((i20 >> 3) & 14) | 3072, 0, 65012);
                                                InterfaceC0500b interfaceC0500bM11156c2 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                                int[] iArr = a.f30442a;
                                                ReviewResultType reviewResultType4 = reviewResultType3;
                                                int i21 = iArr[reviewResultType4.ordinal()];
                                                final Context context8 = context7;
                                                if (i21 == 1) {
                                                    i19 = 3;
                                                    string = context8.getString(R.string.activities_correct);
                                                } else if (i21 != 2) {
                                                    i19 = 3;
                                                    if (i21 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    string = context8.getString(R.string.activities_incorrect);
                                                } else {
                                                    i19 = 3;
                                                    string = context8.getString(R.string.activities_almost);
                                                }
                                                C7218l c7218l = C7499b.m14918P(interfaceC0476a9).f9267d;
                                                int i22 = iArr[reviewResultType4.ordinal()];
                                                if (i22 == 1) {
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572499);
                                                    jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                                    interfaceC0476a7.mo1661w();
                                                } else if (i22 == 2) {
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572655);
                                                    jM5366y = C7499b.m14898D(interfaceC0476a7).m5366y();
                                                    interfaceC0476a7.mo1661w();
                                                } else {
                                                    if (i22 != i19) {
                                                        interfaceC0476a9.mo1622c(106566727);
                                                        interfaceC0476a9.mo1661w();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    interfaceC0476a7 = interfaceC0476a9;
                                                    interfaceC0476a7.mo1622c(106572813);
                                                    jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33945g.getValue()).f47705a;
                                                    interfaceC0476a7.mo1661w();
                                                }
                                                C5207g.m11110e(string, "when (result) {\n        …                        }");
                                                InterfaceC0476a interfaceC0476a10 = interfaceC0476a7;
                                                TextKt.m1576c(string, interfaceC0500bM11156c2, jM5366y, 0L, null, null, null, 0L, null, new C9797g(i19), 0L, 0, false, 0, null, c7218l, interfaceC0476a10, 0, 0, 32248);
                                                interfaceC0476a10.mo1661w();
                                                interfaceC0476a10.mo1663x();
                                                interfaceC0476a10.mo1661w();
                                                interfaceC0476a10.mo1661w();
                                                InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                String string2 = context8.getString(R.string.label_correct);
                                                C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33946h.getValue()).f47705a;
                                                C5207g.m11110e(string2, "getString(R.string.label_correct)");
                                                TextKt.m1576c(string2, interfaceC0500bM11159f0, j11, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, 0, 0, 32248);
                                                InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33956f, SpacingKt.m10360a(interfaceC0476a10).f33956f, 2);
                                                C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                boolean z14 = z13;
                                                TextKt.m1576c(str7, interfaceC0500bM11159f1, C7499b.m14898D(interfaceC0476a10).m5354m(), 0L, null, null, null, 0L, null, new C9797g(z14 ? 6 : 5), 0L, 0, false, 0, null, c7218l3, interfaceC0476a10, (i20 >> 9) & 14, 0, 32248);
                                                InterfaceC0500b interfaceC0500bM11159f2 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                                String string3 = context8.getString(R.string.activities_you_answered);
                                                C7218l c7218l4 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                                int i23 = iArr[reviewResultType4.ordinal()];
                                                if (i23 == 1) {
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521532);
                                                    jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33946h.getValue()).f47705a;
                                                    interfaceC0476a8.mo1661w();
                                                } else if (i23 == 2) {
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521387);
                                                    jM5366y2 = C7499b.m14898D(interfaceC0476a8).m5366y();
                                                    interfaceC0476a8.mo1661w();
                                                } else {
                                                    if (i23 != 3) {
                                                        interfaceC0476a10.mo1622c(-2029529946);
                                                        interfaceC0476a10.mo1661w();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    interfaceC0476a8 = interfaceC0476a10;
                                                    interfaceC0476a8.mo1622c(-2029521241);
                                                    jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33945g.getValue()).f47705a;
                                                    interfaceC0476a8.mo1661w();
                                                }
                                                C5207g.m11110e(string3, "getString(R.string.activities_you_answered)");
                                                InterfaceC0476a interfaceC0476a11 = interfaceC0476a8;
                                                TextKt.m1576c(string3, interfaceC0500bM11159f2, jM5366y2, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l4, interfaceC0476a11, 0, 0, 32248);
                                                MatchingTextKt.m9749a(C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33957g, 2), C7499b.m14918P(interfaceC0476a11).f9273j, new C9797g(z14 ? 6 : 5), 0L, 0L, str8, str7, interfaceC0476a11, (3670016 & (i20 << 9)) | ((i20 << 3) & 458752), 24);
                                                float f3 = 70;
                                                InterfaceC0500b interfaceC0500bM1509f = SizeKt.m1509f(SizeKt.m1508e(aVar), f3);
                                                InterfaceC2041a<C9072e> interfaceC2041a114 = interfaceC2041a111;
                                                InterfaceC2041a<C9072e> interfaceC2041a115 = interfaceC2041a112;
                                                interfaceC0476a11.mo1622c(693286680);
                                                InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(fVar, InterfaceC7885a.a.f42993e, interfaceC0476a11);
                                                interfaceC0476a11.mo1622c(-1323940314);
                                                InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a11.mo1648p(c5304d1);
                                                LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a11.mo1648p(c5304d2);
                                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a11.mo1648p(c5304d3);
                                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1509f);
                                                if (!(interfaceC0476a11.mo1646o() instanceof InterfaceC5299c)) {
                                                    C8573r0.m16771y0();
                                                    throw null;
                                                }
                                                interfaceC0476a11.mo1640l();
                                                if (interfaceC0476a11.mo1632h()) {
                                                    interfaceC0476a11.mo1634i(interfaceC2041a113);
                                                } else {
                                                    interfaceC0476a11.mo1653s();
                                                }
                                                interfaceC0476a11.mo1644n();
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC5652pM1503a2, interfaceC2056p);
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC10015c2, interfaceC2056p2);
                                                C8573r0.m16714a1(interfaceC0476a11, layoutDirection2, interfaceC2056p3);
                                                C8573r0.m16714a1(interfaceC0476a11, interfaceC0647n2, interfaceC2056p4);
                                                interfaceC0476a11.mo1626e();
                                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a11), interfaceC0476a11, 0);
                                                interfaceC0476a11.mo1622c(2058660585);
                                                IntrinsicSize intrinsicSize = IntrinsicSize.Max;
                                                ButtonKt.m1556b(interfaceC2041a114, C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 6), false, C7499b.m14916N(interfaceC0476a11).f9260b, null, null, new C9112d(1, new C9156l0(C7499b.m14898D(interfaceC0476a11).m5355n())), null, null, C7204a.m14522b(interfaceC0476a11, 813356273, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // cm.InterfaceC2057q
                                                    /* JADX INFO: renamed from: M */
                                                    public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                        InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                        int iIntValue2 = num4.intValue();
                                                        C5207g.m11111f(interfaceC9786q, "$this$OutlinedButton");
                                                        if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                            interfaceC0476a13.mo1650q();
                                                        } else {
                                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                                                            InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(C9775f.m18272a(IntrinsicSize.Max), InterfaceC7885a.a.f42991c, 2);
                                                            String string4 = context8.getString(R.string.warning_try_again);
                                                            C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                            long jM5354m = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5354m();
                                                            C5207g.m11110e(string4, "getString(R.string.warning_try_again)");
                                                            AutoSizedTextKt.m10305a(string4, interfaceC0500bM1513j, jM5354m, new C9797g(3), 0L, 0, false, 2, c7218l5, interfaceC0476a13, 12582960, 112);
                                                        }
                                                        return C9072e.f47360a;
                                                    }
                                                }), interfaceC0476a11, ((i20 >> 18) & 14) | 805306368, 436);
                                                C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(interfaceC0476a11).f33951a), interfaceC0476a11);
                                                InterfaceC0500b interfaceC0500bM11159f3 = C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 3);
                                                AbstractC10270a abstractC10270a = C7499b.m14916N(interfaceC0476a11).f9260b;
                                                C9782m c9782m = C1646b.f9206a;
                                                ButtonKt.m1555a(interfaceC2041a115, interfaceC0500bM11159f3, false, abstractC10270a, C1646b.m5339a(C7499b.m14898D(interfaceC0476a11).m5351j(), interfaceC0476a11, 14), null, null, null, null, C7204a.m14522b(interfaceC0476a11, 197654323, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // cm.InterfaceC2057q
                                                    /* JADX INFO: renamed from: M */
                                                    public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                        InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                        int iIntValue2 = num4.intValue();
                                                        C5207g.m11111f(interfaceC9786q, "$this$Button");
                                                        if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                            interfaceC0476a13.mo1650q();
                                                        } else {
                                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                                                            InterfaceC0500b interfaceC0500bM18272a = C9775f.m18272a(IntrinsicSize.Max);
                                                            String string4 = context8.getString(R.string.ui_continue);
                                                            C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                            long jM5345d = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5345d();
                                                            C5207g.m11110e(string4, "getString(R.string.ui_continue)");
                                                            TextKt.m1576c(string4, interfaceC0500bM18272a, jM5345d, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 1, null, c7218l5, interfaceC0476a13, 48, 3072, 24056);
                                                        }
                                                        return C9072e.f47360a;
                                                    }
                                                }), interfaceC0476a11, (14 & (i20 >> 21)) | 805306368, 484);
                                                interfaceC0476a11.mo1661w();
                                                interfaceC0476a11.mo1663x();
                                                interfaceC0476a11.mo1661w();
                                                interfaceC0476a11.mo1661w();
                                            }
                                            return C9072e.f47360a;
                                        }
                                    }), interfaceC0476a5, 196608, 22);
                                }
                                return C9072e.f47360a;
                            }
                        }), interfaceC0476a3, 12582912, 122);
                        return C9072e.f47360a;
                    }
                }), composerImpl, ((i15 >> 6) & 14) | 199680, 18);
                interfaceC2041a7 = interfaceC2041a5;
                interfaceC2041a8 = interfaceC2041a6;
            }
            c5332q0M1612T = composerImpl.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    ReviewUnscrambleResultPopupKt.m10307a(reviewResultType, str, z10, str2, str3, z11, interfaceC2041a7, interfaceC2041a8, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 12582912;
        interfaceC2041a4 = interfaceC2041a2;
        i15 = i12;
        if ((i15 & 23967451) == 4793490) {
            if (i16 != 0) {
                interfaceC2041a5 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2041a5 = interfaceC2041a3;
            }
            if (i13 != 0) {
                interfaceC2041a6 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$2
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2041a6 = interfaceC2041a4;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
            final Context context6 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
            final InterfaceC2041a<C9072e> interfaceC2041a19 = interfaceC2041a5;
            composerImpl = composerImplMo1636j;
            final InterfaceC2041a<C9072e> interfaceC2041a110 = interfaceC2041a6;
            AnimatedVisibilityKt.m1334b(z10, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 60, null, 4), 2), null, C7204a.m14522b(composerImpl, 1982907829, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v1, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3, kotlin.jvm.internal.Lambda] */
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(AnimatedVisibilityScope animatedVisibilityScope, InterfaceC0476a interfaceC0476a2, Integer num) {
                    final AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(animatedVisibilityScope2, "$this$AnimatedVisibility");
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    InterfaceC0500b interfaceC0500bM1507d = SizeKt.m1507d();
                    interfaceC0476a3.mo1622c(-492369756);
                    Object objMo1624d = interfaceC0476a3.mo1624d();
                    if (objMo1624d == InterfaceC0476a.a.f3122a) {
                        objMo1624d = new C9613k();
                        interfaceC0476a3.mo1655t(objMo1624d);
                    }
                    interfaceC0476a3.mo1661w();
                    InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, (InterfaceC9612j) objMo1624d, null, false, null, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.2
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    }, 28);
                    long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                    final Context context7 = context6;
                    final boolean z12 = z11;
                    final String str4 = str2;
                    final int i17 = i15;
                    final ReviewResultType reviewResultType2 = reviewResultType;
                    final String str5 = str3;
                    final String str6 = str;
                    final InterfaceC2041a<C9072e> interfaceC2041a111 = interfaceC2041a19;
                    final InterfaceC2041a<C9072e> interfaceC2041a112 = interfaceC2041a110;
                    SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1127002864, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r3v7, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2, kotlin.jvm.internal.Lambda] */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                            InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                            if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                interfaceC0476a5.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1508e(C5212l.m11156c0(InterfaceC0500b.a.f3325a, SpacingKt.m10360a(interfaceC0476a5).f33955e))), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final Integer mo528n(Integer num3) {
                                        num3.intValue();
                                        return -500;
                                    }
                                })), EnterExitTransitionKt.m1348e(null, 3), "animateEnterExit"), C7499b.m14898D(interfaceC0476a5).m5363v(), C7499b.m14916N(interfaceC0476a5).f9263e);
                                C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                final Context context8 = context7;
                                final boolean z13 = z12;
                                final String str7 = str4;
                                final int i18 = i17;
                                final ReviewResultType reviewResultType3 = reviewResultType2;
                                final String str8 = str5;
                                final String str9 = str6;
                                final InterfaceC2041a<C9072e> interfaceC2041a113 = interfaceC2041a111;
                                final InterfaceC2041a<C9072e> interfaceC2041a114 = interfaceC2041a112;
                                CardKt.m1557a(interfaceC0500bM309T, null, null, c0463bM11139L, null, C7204a.m14522b(interfaceC0476a5, -1565704098, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.2

                                    /* JADX INFO: renamed from: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$a */
                                    public /* synthetic */ class a {

                                        /* JADX INFO: renamed from: a */
                                        public static final /* synthetic */ int[] f30442a;

                                        static {
                                            int[] iArr = new int[ReviewResultType.values().length];
                                            try {
                                                iArr[ReviewResultType.CORRECT.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[ReviewResultType.ALMOST.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            try {
                                                iArr[ReviewResultType.INCORRECT.ordinal()] = 3;
                                            } catch (NoSuchFieldError unused3) {
                                            }
                                            f30442a = iArr;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r1v13, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2, kotlin.jvm.internal.Lambda] */
                                    /* JADX WARN: Type inference failed for: r2v48, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1, kotlin.jvm.internal.Lambda] */
                                    @Override // cm.InterfaceC2057q
                                    /* JADX INFO: renamed from: M */
                                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) throws Throwable {
                                        int i19;
                                        String string;
                                        InterfaceC0476a interfaceC0476a7;
                                        long jM5366y;
                                        InterfaceC0476a interfaceC0476a8;
                                        long jM5366y2;
                                        InterfaceC0476a interfaceC0476a9 = interfaceC0476a6;
                                        int iIntValue = num3.intValue();
                                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                                        if ((iIntValue & 81) == 16 && interfaceC0476a9.mo1642m()) {
                                            interfaceC0476a9.mo1650q();
                                        } else {
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                            InterfaceC0500b interfaceC0500bM11156c0 = C5212l.m11156c0(SizeKt.m1508e(SizeKt.m1512i(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                            String str10 = str9;
                                            interfaceC0476a9.mo1622c(693286680);
                                            C0438a.f fVar = C0438a.f2429a;
                                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(fVar, bVar, interfaceC0476a9);
                                            interfaceC0476a9.mo1622c(-1323940314);
                                            C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
                                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d1);
                                            C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
                                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d2);
                                            C5304d1 c5304d3 = CompositionLocalsKt.f4148p;
                                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d3);
                                            ComposeUiNode.f3726n.getClass();
                                            InterfaceC2041a<ComposeUiNode> interfaceC2041a115 = ComposeUiNode.Companion.f3728b;
                                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c0);
                                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                                C8573r0.m16771y0();
                                                throw null;
                                            }
                                            interfaceC0476a9.mo1640l();
                                            if (interfaceC0476a9.mo1632h()) {
                                                interfaceC0476a9.mo1634i(interfaceC2041a115);
                                            } else {
                                                interfaceC0476a9.mo1653s();
                                            }
                                            interfaceC0476a9.mo1644n();
                                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p = ComposeUiNode.Companion.f3731e;
                                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p);
                                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p2 = ComposeUiNode.Companion.f3730d;
                                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c, interfaceC2056p2);
                                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3732f;
                                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection, interfaceC2056p3);
                                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3733g;
                                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n1, interfaceC2056p4);
                                            interfaceC0476a9.mo1626e();
                                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                            interfaceC0476a9.mo1622c(2058660585);
                                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            long jM16765v0 = C8573r0.m16765v0(24);
                                            C9797g c9797g = new C9797g(3);
                                            int i20 = i18;
                                            TextKt.m1576c(str10, interfaceC0500bM11156c1, 0L, jM16765v0, null, null, null, 0L, null, c9797g, 0L, 0, false, 0, null, null, interfaceC0476a9, ((i20 >> 3) & 14) | 3072, 0, 65012);
                                            InterfaceC0500b interfaceC0500bM11156c2 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            int[] iArr = a.f30442a;
                                            ReviewResultType reviewResultType4 = reviewResultType3;
                                            int i21 = iArr[reviewResultType4.ordinal()];
                                            final Context context9 = context8;
                                            if (i21 == 1) {
                                                i19 = 3;
                                                string = context9.getString(R.string.activities_correct);
                                            } else if (i21 != 2) {
                                                i19 = 3;
                                                if (i21 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                string = context9.getString(R.string.activities_incorrect);
                                            } else {
                                                i19 = 3;
                                                string = context9.getString(R.string.activities_almost);
                                            }
                                            C7218l c7218l = C7499b.m14918P(interfaceC0476a9).f9267d;
                                            int i22 = iArr[reviewResultType4.ordinal()];
                                            if (i22 == 1) {
                                                interfaceC0476a7 = interfaceC0476a9;
                                                interfaceC0476a7.mo1622c(106572499);
                                                jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                                interfaceC0476a7.mo1661w();
                                            } else if (i22 == 2) {
                                                interfaceC0476a7 = interfaceC0476a9;
                                                interfaceC0476a7.mo1622c(106572655);
                                                jM5366y = C7499b.m14898D(interfaceC0476a7).m5366y();
                                                interfaceC0476a7.mo1661w();
                                            } else {
                                                if (i22 != i19) {
                                                    interfaceC0476a9.mo1622c(106566727);
                                                    interfaceC0476a9.mo1661w();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                interfaceC0476a7 = interfaceC0476a9;
                                                interfaceC0476a7.mo1622c(106572813);
                                                jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33945g.getValue()).f47705a;
                                                interfaceC0476a7.mo1661w();
                                            }
                                            C5207g.m11110e(string, "when (result) {\n        …                        }");
                                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a7;
                                            TextKt.m1576c(string, interfaceC0500bM11156c2, jM5366y, 0L, null, null, null, 0L, null, new C9797g(i19), 0L, 0, false, 0, null, c7218l, interfaceC0476a10, 0, 0, 32248);
                                            interfaceC0476a10.mo1661w();
                                            interfaceC0476a10.mo1663x();
                                            interfaceC0476a10.mo1661w();
                                            interfaceC0476a10.mo1661w();
                                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                            String string2 = context9.getString(R.string.label_correct);
                                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                            long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33946h.getValue()).f47705a;
                                            C5207g.m11110e(string2, "getString(R.string.label_correct)");
                                            TextKt.m1576c(string2, interfaceC0500bM11159f0, j11, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, 0, 0, 32248);
                                            InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33956f, SpacingKt.m10360a(interfaceC0476a10).f33956f, 2);
                                            C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                            boolean z14 = z13;
                                            TextKt.m1576c(str7, interfaceC0500bM11159f1, C7499b.m14898D(interfaceC0476a10).m5354m(), 0L, null, null, null, 0L, null, new C9797g(z14 ? 6 : 5), 0L, 0, false, 0, null, c7218l3, interfaceC0476a10, (i20 >> 9) & 14, 0, 32248);
                                            InterfaceC0500b interfaceC0500bM11159f2 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                            String string3 = context9.getString(R.string.activities_you_answered);
                                            C7218l c7218l4 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                            int i23 = iArr[reviewResultType4.ordinal()];
                                            if (i23 == 1) {
                                                interfaceC0476a8 = interfaceC0476a10;
                                                interfaceC0476a8.mo1622c(-2029521532);
                                                jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33946h.getValue()).f47705a;
                                                interfaceC0476a8.mo1661w();
                                            } else if (i23 == 2) {
                                                interfaceC0476a8 = interfaceC0476a10;
                                                interfaceC0476a8.mo1622c(-2029521387);
                                                jM5366y2 = C7499b.m14898D(interfaceC0476a8).m5366y();
                                                interfaceC0476a8.mo1661w();
                                            } else {
                                                if (i23 != 3) {
                                                    interfaceC0476a10.mo1622c(-2029529946);
                                                    interfaceC0476a10.mo1661w();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                interfaceC0476a8 = interfaceC0476a10;
                                                interfaceC0476a8.mo1622c(-2029521241);
                                                jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33945g.getValue()).f47705a;
                                                interfaceC0476a8.mo1661w();
                                            }
                                            C5207g.m11110e(string3, "getString(R.string.activities_you_answered)");
                                            InterfaceC0476a interfaceC0476a11 = interfaceC0476a8;
                                            TextKt.m1576c(string3, interfaceC0500bM11159f2, jM5366y2, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l4, interfaceC0476a11, 0, 0, 32248);
                                            MatchingTextKt.m9749a(C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33957g, 2), C7499b.m14918P(interfaceC0476a11).f9273j, new C9797g(z14 ? 6 : 5), 0L, 0L, str8, str7, interfaceC0476a11, (3670016 & (i20 << 9)) | ((i20 << 3) & 458752), 24);
                                            float f3 = 70;
                                            InterfaceC0500b interfaceC0500bM1509f = SizeKt.m1509f(SizeKt.m1508e(aVar), f3);
                                            InterfaceC2041a<C9072e> interfaceC2041a116 = interfaceC2041a113;
                                            InterfaceC2041a<C9072e> interfaceC2041a117 = interfaceC2041a114;
                                            interfaceC0476a11.mo1622c(693286680);
                                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(fVar, InterfaceC7885a.a.f42993e, interfaceC0476a11);
                                            interfaceC0476a11.mo1622c(-1323940314);
                                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a11.mo1648p(c5304d1);
                                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a11.mo1648p(c5304d2);
                                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a11.mo1648p(c5304d3);
                                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1509f);
                                            if (!(interfaceC0476a11.mo1646o() instanceof InterfaceC5299c)) {
                                                C8573r0.m16771y0();
                                                throw null;
                                            }
                                            interfaceC0476a11.mo1640l();
                                            if (interfaceC0476a11.mo1632h()) {
                                                interfaceC0476a11.mo1634i(interfaceC2041a115);
                                            } else {
                                                interfaceC0476a11.mo1653s();
                                            }
                                            interfaceC0476a11.mo1644n();
                                            C8573r0.m16714a1(interfaceC0476a11, interfaceC5652pM1503a2, interfaceC2056p);
                                            C8573r0.m16714a1(interfaceC0476a11, interfaceC10015c2, interfaceC2056p2);
                                            C8573r0.m16714a1(interfaceC0476a11, layoutDirection2, interfaceC2056p3);
                                            C8573r0.m16714a1(interfaceC0476a11, interfaceC0647n2, interfaceC2056p4);
                                            interfaceC0476a11.mo1626e();
                                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a11), interfaceC0476a11, 0);
                                            interfaceC0476a11.mo1622c(2058660585);
                                            IntrinsicSize intrinsicSize = IntrinsicSize.Max;
                                            ButtonKt.m1556b(interfaceC2041a116, C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 6), false, C7499b.m14916N(interfaceC0476a11).f9260b, null, null, new C9112d(1, new C9156l0(C7499b.m14898D(interfaceC0476a11).m5355n())), null, null, C7204a.m14522b(interfaceC0476a11, 813356273, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // cm.InterfaceC2057q
                                                /* JADX INFO: renamed from: M */
                                                public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                    InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                    int iIntValue2 = num4.intValue();
                                                    C5207g.m11111f(interfaceC9786q, "$this$OutlinedButton");
                                                    if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                        interfaceC0476a13.mo1650q();
                                                    } else {
                                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                                                        InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(C9775f.m18272a(IntrinsicSize.Max), InterfaceC7885a.a.f42991c, 2);
                                                        String string4 = context9.getString(R.string.warning_try_again);
                                                        C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                        long jM5354m = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5354m();
                                                        C5207g.m11110e(string4, "getString(R.string.warning_try_again)");
                                                        AutoSizedTextKt.m10305a(string4, interfaceC0500bM1513j, jM5354m, new C9797g(3), 0L, 0, false, 2, c7218l5, interfaceC0476a13, 12582960, 112);
                                                    }
                                                    return C9072e.f47360a;
                                                }
                                            }), interfaceC0476a11, ((i20 >> 18) & 14) | 805306368, 436);
                                            C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(interfaceC0476a11).f33951a), interfaceC0476a11);
                                            InterfaceC0500b interfaceC0500bM11159f3 = C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 3);
                                            AbstractC10270a abstractC10270a = C7499b.m14916N(interfaceC0476a11).f9260b;
                                            C9782m c9782m = C1646b.f9206a;
                                            ButtonKt.m1555a(interfaceC2041a117, interfaceC0500bM11159f3, false, abstractC10270a, C1646b.m5339a(C7499b.m14898D(interfaceC0476a11).m5351j(), interfaceC0476a11, 14), null, null, null, null, C7204a.m14522b(interfaceC0476a11, 197654323, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // cm.InterfaceC2057q
                                                /* JADX INFO: renamed from: M */
                                                public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                    InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                    int iIntValue2 = num4.intValue();
                                                    C5207g.m11111f(interfaceC9786q, "$this$Button");
                                                    if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                        interfaceC0476a13.mo1650q();
                                                    } else {
                                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                                                        InterfaceC0500b interfaceC0500bM18272a = C9775f.m18272a(IntrinsicSize.Max);
                                                        String string4 = context9.getString(R.string.ui_continue);
                                                        C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                        long jM5345d = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5345d();
                                                        C5207g.m11110e(string4, "getString(R.string.ui_continue)");
                                                        TextKt.m1576c(string4, interfaceC0500bM18272a, jM5345d, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 1, null, c7218l5, interfaceC0476a13, 48, 3072, 24056);
                                                    }
                                                    return C9072e.f47360a;
                                                }
                                            }), interfaceC0476a11, (14 & (i20 >> 21)) | 805306368, 484);
                                            interfaceC0476a11.mo1661w();
                                            interfaceC0476a11.mo1663x();
                                            interfaceC0476a11.mo1661w();
                                            interfaceC0476a11.mo1661w();
                                        }
                                        return C9072e.f47360a;
                                    }
                                }), interfaceC0476a5, 196608, 22);
                            }
                            return C9072e.f47360a;
                        }
                    }), interfaceC0476a3, 12582912, 122);
                    return C9072e.f47360a;
                }
            }), composerImpl, ((i15 >> 6) & 14) | 199680, 18);
            interfaceC2041a7 = interfaceC2041a5;
            interfaceC2041a8 = interfaceC2041a6;
        } else {
            if (i16 != 0) {
                interfaceC2041a5 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2041a5 = interfaceC2041a3;
            }
            if (i13 != 0) {
                interfaceC2041a6 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$2
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2041a6 = interfaceC2041a4;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
            final Context context7 = (Context) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4084b);
            final InterfaceC2041a<C9072e> interfaceC2041a111 = interfaceC2041a5;
            composerImpl = composerImplMo1636j;
            final InterfaceC2041a<C9072e> interfaceC2041a112 = interfaceC2041a6;
            AnimatedVisibilityKt.m1334b(z10, null, EnterExitTransitionKt.m1346c(0.5f, C8573r0.m16734k1(30, 0, null, 6)), EnterExitTransitionKt.m1348e(C8573r0.m16734k1(30, 60, null, 4), 2), null, C7204a.m14522b(composerImpl, 1982907829, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v1, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3, kotlin.jvm.internal.Lambda] */
                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final C9072e mo1343M(AnimatedVisibilityScope animatedVisibilityScope, InterfaceC0476a interfaceC0476a2, Integer num) {
                    final AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    num.intValue();
                    C5207g.m11111f(animatedVisibilityScope2, "$this$AnimatedVisibility");
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                    InterfaceC0500b interfaceC0500bM1507d = SizeKt.m1507d();
                    interfaceC0476a3.mo1622c(-492369756);
                    Object objMo1624d = interfaceC0476a3.mo1624d();
                    if (objMo1624d == InterfaceC0476a.a.f3122a) {
                        objMo1624d = new C9613k();
                        interfaceC0476a3.mo1655t(objMo1624d);
                    }
                    interfaceC0476a3.mo1661w();
                    InterfaceC0500b interfaceC0500bM1409c = ClickableKt.m1409c(interfaceC0500bM1507d, (InterfaceC9612j) objMo1624d, null, false, null, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.2
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    }, 28);
                    long j10 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a3).f33947i.getValue()).f47705a;
                    final Context context8 = context7;
                    final boolean z12 = z11;
                    final String str4 = str2;
                    final int i17 = i15;
                    final ReviewResultType reviewResultType2 = reviewResultType;
                    final String str5 = str3;
                    final String str6 = str;
                    final InterfaceC2041a<C9072e> interfaceC2041a113 = interfaceC2041a111;
                    final InterfaceC2041a<C9072e> interfaceC2041a114 = interfaceC2041a112;
                    SurfaceKt.m1570a(interfaceC0500bM1409c, null, j10, 0L, 0.0f, 0.0f, null, C7204a.m14522b(interfaceC0476a3, -1127002864, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r3v7, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2, kotlin.jvm.internal.Lambda] */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                            InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                            if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                interfaceC0476a5.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                                InterfaceC0500b interfaceC0500bM309T = C0062b.m309T(animatedVisibilityScope2.m1341b(SizeKt.m1512i(SizeKt.m1508e(C5212l.m11156c0(InterfaceC0500b.a.f3325a, SpacingKt.m10360a(interfaceC0476a5).f33955e))), EnterExitTransitionKt.m1347d(0.5f, 1).m16926b(EnterExitTransitionKt.m1350g(C8573r0.m16734k1(400, 60, null, 4), new InterfaceC2052l<Integer, Integer>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final Integer mo528n(Integer num3) {
                                        num3.intValue();
                                        return -500;
                                    }
                                })), EnterExitTransitionKt.m1348e(null, 3), "animateEnterExit"), C7499b.m14898D(interfaceC0476a5).m5363v(), C7499b.m14916N(interfaceC0476a5).f9263e);
                                C0463b c0463bM11139L = C5212l.m11139L(interfaceC0476a5);
                                final Context context9 = context8;
                                final boolean z13 = z12;
                                final String str7 = str4;
                                final int i18 = i17;
                                final ReviewResultType reviewResultType3 = reviewResultType2;
                                final String str8 = str5;
                                final String str9 = str6;
                                final InterfaceC2041a<C9072e> interfaceC2041a115 = interfaceC2041a113;
                                final InterfaceC2041a<C9072e> interfaceC2041a116 = interfaceC2041a114;
                                CardKt.m1557a(interfaceC0500bM309T, null, null, c0463bM11139L, null, C7204a.m14522b(interfaceC0476a5, -1565704098, new InterfaceC2057q<InterfaceC9771b, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt.ReviewUnscrambleResultPopup.3.3.2

                                    /* JADX INFO: renamed from: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$a */
                                    public /* synthetic */ class a {

                                        /* JADX INFO: renamed from: a */
                                        public static final /* synthetic */ int[] f30442a;

                                        static {
                                            int[] iArr = new int[ReviewResultType.values().length];
                                            try {
                                                iArr[ReviewResultType.CORRECT.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[ReviewResultType.ALMOST.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            try {
                                                iArr[ReviewResultType.INCORRECT.ordinal()] = 3;
                                            } catch (NoSuchFieldError unused3) {
                                            }
                                            f30442a = iArr;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r1v13, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2, kotlin.jvm.internal.Lambda] */
                                    /* JADX WARN: Type inference failed for: r2v48, types: [com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1, kotlin.jvm.internal.Lambda] */
                                    @Override // cm.InterfaceC2057q
                                    /* JADX INFO: renamed from: M */
                                    public final C9072e mo1343M(InterfaceC9771b interfaceC9771b, InterfaceC0476a interfaceC0476a6, Integer num3) throws Throwable {
                                        int i19;
                                        String string;
                                        InterfaceC0476a interfaceC0476a7;
                                        long jM5366y;
                                        InterfaceC0476a interfaceC0476a8;
                                        long jM5366y2;
                                        InterfaceC0476a interfaceC0476a9 = interfaceC0476a6;
                                        int iIntValue = num3.intValue();
                                        C5207g.m11111f(interfaceC9771b, "$this$Card");
                                        if ((iIntValue & 81) == 16 && interfaceC0476a9.mo1642m()) {
                                            interfaceC0476a9.mo1650q();
                                        } else {
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                                            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                                            InterfaceC0500b interfaceC0500bM11156c0 = C5212l.m11156c0(SizeKt.m1508e(SizeKt.m1512i(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33951a);
                                            C7886b.b bVar = InterfaceC7885a.a.f42994f;
                                            String str10 = str9;
                                            interfaceC0476a9.mo1622c(693286680);
                                            C0438a.f fVar = C0438a.f2429a;
                                            InterfaceC5652p interfaceC5652pM1503a = RowKt.m1503a(fVar, bVar, interfaceC0476a9);
                                            interfaceC0476a9.mo1622c(-1323940314);
                                            C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
                                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a9.mo1648p(c5304d1);
                                            C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
                                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a9.mo1648p(c5304d2);
                                            C5304d1 c5304d3 = CompositionLocalsKt.f4148p;
                                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a9.mo1648p(c5304d3);
                                            ComposeUiNode.f3726n.getClass();
                                            InterfaceC2041a<ComposeUiNode> interfaceC2041a117 = ComposeUiNode.Companion.f3728b;
                                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM11156c0);
                                            if (!(interfaceC0476a9.mo1646o() instanceof InterfaceC5299c)) {
                                                C8573r0.m16771y0();
                                                throw null;
                                            }
                                            interfaceC0476a9.mo1640l();
                                            if (interfaceC0476a9.mo1632h()) {
                                                interfaceC0476a9.mo1634i(interfaceC2041a117);
                                            } else {
                                                interfaceC0476a9.mo1653s();
                                            }
                                            interfaceC0476a9.mo1644n();
                                            InterfaceC2056p<ComposeUiNode, InterfaceC5652p, C9072e> interfaceC2056p = ComposeUiNode.Companion.f3731e;
                                            C8573r0.m16714a1(interfaceC0476a9, interfaceC5652pM1503a, interfaceC2056p);
                                            InterfaceC2056p<ComposeUiNode, InterfaceC10015c, C9072e> interfaceC2056p2 = ComposeUiNode.Companion.f3730d;
                                            C8573r0.m16714a1(interfaceC0476a9, interfaceC10015c, interfaceC2056p2);
                                            InterfaceC2056p<ComposeUiNode, LayoutDirection, C9072e> interfaceC2056p3 = ComposeUiNode.Companion.f3732f;
                                            C8573r0.m16714a1(interfaceC0476a9, layoutDirection, interfaceC2056p3);
                                            InterfaceC2056p<ComposeUiNode, InterfaceC0647n1, C9072e> interfaceC2056p4 = ComposeUiNode.Companion.f3733g;
                                            C8573r0.m16714a1(interfaceC0476a9, interfaceC0647n1, interfaceC2056p4);
                                            interfaceC0476a9.mo1626e();
                                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a9), interfaceC0476a9, 0);
                                            interfaceC0476a9.mo1622c(2058660585);
                                            InterfaceC0500b interfaceC0500bM11156c1 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            long jM16765v0 = C8573r0.m16765v0(24);
                                            C9797g c9797g = new C9797g(3);
                                            int i20 = i18;
                                            TextKt.m1576c(str10, interfaceC0500bM11156c1, 0L, jM16765v0, null, null, null, 0L, null, c9797g, 0L, 0, false, 0, null, null, interfaceC0476a9, ((i20 >> 3) & 14) | 3072, 0, 65012);
                                            InterfaceC0500b interfaceC0500bM11156c2 = C5212l.m11156c0(SizeKt.m1512i(SizeKt.m1514k(aVar)), SpacingKt.m10360a(interfaceC0476a9).f33954d);
                                            int[] iArr = a.f30442a;
                                            ReviewResultType reviewResultType4 = reviewResultType3;
                                            int i21 = iArr[reviewResultType4.ordinal()];
                                            final Context context10 = context9;
                                            if (i21 == 1) {
                                                i19 = 3;
                                                string = context10.getString(R.string.activities_correct);
                                            } else if (i21 != 2) {
                                                i19 = 3;
                                                if (i21 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                string = context10.getString(R.string.activities_incorrect);
                                            } else {
                                                i19 = 3;
                                                string = context10.getString(R.string.activities_almost);
                                            }
                                            C7218l c7218l = C7499b.m14918P(interfaceC0476a9).f9267d;
                                            int i22 = iArr[reviewResultType4.ordinal()];
                                            if (i22 == 1) {
                                                interfaceC0476a7 = interfaceC0476a9;
                                                interfaceC0476a7.mo1622c(106572499);
                                                jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33946h.getValue()).f47705a;
                                                interfaceC0476a7.mo1661w();
                                            } else if (i22 == 2) {
                                                interfaceC0476a7 = interfaceC0476a9;
                                                interfaceC0476a7.mo1622c(106572655);
                                                jM5366y = C7499b.m14898D(interfaceC0476a7).m5366y();
                                                interfaceC0476a7.mo1661w();
                                            } else {
                                                if (i22 != i19) {
                                                    interfaceC0476a9.mo1622c(106566727);
                                                    interfaceC0476a9.mo1661w();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                interfaceC0476a7 = interfaceC0476a9;
                                                interfaceC0476a7.mo1622c(106572813);
                                                jM5366y = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a7).f33945g.getValue()).f47705a;
                                                interfaceC0476a7.mo1661w();
                                            }
                                            C5207g.m11110e(string, "when (result) {\n        …                        }");
                                            InterfaceC0476a interfaceC0476a10 = interfaceC0476a7;
                                            TextKt.m1576c(string, interfaceC0500bM11156c2, jM5366y, 0L, null, null, null, 0L, null, new C9797g(i19), 0L, 0, false, 0, null, c7218l, interfaceC0476a10, 0, 0, 32248);
                                            interfaceC0476a10.mo1661w();
                                            interfaceC0476a10.mo1663x();
                                            interfaceC0476a10.mo1661w();
                                            interfaceC0476a10.mo1661w();
                                            InterfaceC0500b interfaceC0500bM11159f0 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33951a, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                            String string2 = context10.getString(R.string.label_correct);
                                            C7218l c7218l2 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                            long j11 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a10).f33946h.getValue()).f47705a;
                                            C5207g.m11110e(string2, "getString(R.string.label_correct)");
                                            TextKt.m1576c(string2, interfaceC0500bM11159f0, j11, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l2, interfaceC0476a10, 0, 0, 32248);
                                            InterfaceC0500b interfaceC0500bM11159f1 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33956f, SpacingKt.m10360a(interfaceC0476a10).f33956f, 2);
                                            C7218l c7218l3 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                            boolean z14 = z13;
                                            TextKt.m1576c(str7, interfaceC0500bM11159f1, C7499b.m14898D(interfaceC0476a10).m5354m(), 0L, null, null, null, 0L, null, new C9797g(z14 ? 6 : 5), 0L, 0, false, 0, null, c7218l3, interfaceC0476a10, (i20 >> 9) & 14, 0, 32248);
                                            InterfaceC0500b interfaceC0500bM11159f2 = C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1514k(C5212l.m11159f0(aVar, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 0.0f, 0.0f, 13))), SpacingKt.m10360a(interfaceC0476a10).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a10).f33955e, 6);
                                            String string3 = context10.getString(R.string.activities_you_answered);
                                            C7218l c7218l4 = C7499b.m14918P(interfaceC0476a10).f9273j;
                                            int i23 = iArr[reviewResultType4.ordinal()];
                                            if (i23 == 1) {
                                                interfaceC0476a8 = interfaceC0476a10;
                                                interfaceC0476a8.mo1622c(-2029521532);
                                                jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33946h.getValue()).f47705a;
                                                interfaceC0476a8.mo1661w();
                                            } else if (i23 == 2) {
                                                interfaceC0476a8 = interfaceC0476a10;
                                                interfaceC0476a8.mo1622c(-2029521387);
                                                jM5366y2 = C7499b.m14898D(interfaceC0476a8).m5366y();
                                                interfaceC0476a8.mo1661w();
                                            } else {
                                                if (i23 != 3) {
                                                    interfaceC0476a10.mo1622c(-2029529946);
                                                    interfaceC0476a10.mo1661w();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                interfaceC0476a8 = interfaceC0476a10;
                                                interfaceC0476a8.mo1622c(-2029521241);
                                                jM5366y2 = ((C9169u) CustomColorSchemeKt.m10359a(interfaceC0476a8).f33945g.getValue()).f47705a;
                                                interfaceC0476a8.mo1661w();
                                            }
                                            C5207g.m11110e(string3, "getString(R.string.activities_you_answered)");
                                            InterfaceC0476a interfaceC0476a11 = interfaceC0476a8;
                                            TextKt.m1576c(string3, interfaceC0500bM11159f2, jM5366y2, 0L, null, null, null, 0L, null, new C9797g(5), 0L, 0, false, 0, null, c7218l4, interfaceC0476a11, 0, 0, 32248);
                                            MatchingTextKt.m9749a(C5212l.m11159f0(SizeKt.m1512i(SizeKt.m1508e(aVar)), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33957g, 2), C7499b.m14918P(interfaceC0476a11).f9273j, new C9797g(z14 ? 6 : 5), 0L, 0L, str8, str7, interfaceC0476a11, (3670016 & (i20 << 9)) | ((i20 << 3) & 458752), 24);
                                            float f3 = 70;
                                            InterfaceC0500b interfaceC0500bM1509f = SizeKt.m1509f(SizeKt.m1508e(aVar), f3);
                                            InterfaceC2041a<C9072e> interfaceC2041a118 = interfaceC2041a115;
                                            InterfaceC2041a<C9072e> interfaceC2041a119 = interfaceC2041a116;
                                            interfaceC0476a11.mo1622c(693286680);
                                            InterfaceC5652p interfaceC5652pM1503a2 = RowKt.m1503a(fVar, InterfaceC7885a.a.f42993e, interfaceC0476a11);
                                            interfaceC0476a11.mo1622c(-1323940314);
                                            InterfaceC10015c interfaceC10015c2 = (InterfaceC10015c) interfaceC0476a11.mo1648p(c5304d1);
                                            LayoutDirection layoutDirection2 = (LayoutDirection) interfaceC0476a11.mo1648p(c5304d2);
                                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a11.mo1648p(c5304d3);
                                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bM1509f);
                                            if (!(interfaceC0476a11.mo1646o() instanceof InterfaceC5299c)) {
                                                C8573r0.m16771y0();
                                                throw null;
                                            }
                                            interfaceC0476a11.mo1640l();
                                            if (interfaceC0476a11.mo1632h()) {
                                                interfaceC0476a11.mo1634i(interfaceC2041a117);
                                            } else {
                                                interfaceC0476a11.mo1653s();
                                            }
                                            interfaceC0476a11.mo1644n();
                                            C8573r0.m16714a1(interfaceC0476a11, interfaceC5652pM1503a2, interfaceC2056p);
                                            C8573r0.m16714a1(interfaceC0476a11, interfaceC10015c2, interfaceC2056p2);
                                            C8573r0.m16714a1(interfaceC0476a11, layoutDirection2, interfaceC2056p3);
                                            C8573r0.m16714a1(interfaceC0476a11, interfaceC0647n2, interfaceC2056p4);
                                            interfaceC0476a11.mo1626e();
                                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a11), interfaceC0476a11, 0);
                                            interfaceC0476a11.mo1622c(2058660585);
                                            IntrinsicSize intrinsicSize = IntrinsicSize.Max;
                                            ButtonKt.m1556b(interfaceC2041a118, C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), SpacingKt.m10360a(interfaceC0476a11).f33956f, 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 6), false, C7499b.m14916N(interfaceC0476a11).f9260b, null, null, new C9112d(1, new C9156l0(C7499b.m14898D(interfaceC0476a11).m5355n())), null, null, C7204a.m14522b(interfaceC0476a11, 813356273, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // cm.InterfaceC2057q
                                                /* JADX INFO: renamed from: M */
                                                public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                    InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                    int iIntValue2 = num4.intValue();
                                                    C5207g.m11111f(interfaceC9786q, "$this$OutlinedButton");
                                                    if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                        interfaceC0476a13.mo1650q();
                                                    } else {
                                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                                                        InterfaceC0500b interfaceC0500bM1513j = SizeKt.m1513j(C9775f.m18272a(IntrinsicSize.Max), InterfaceC7885a.a.f42991c, 2);
                                                        String string4 = context10.getString(R.string.warning_try_again);
                                                        C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                        long jM5354m = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5354m();
                                                        C5207g.m11110e(string4, "getString(R.string.warning_try_again)");
                                                        AutoSizedTextKt.m10305a(string4, interfaceC0500bM1513j, jM5354m, new C9797g(3), 0L, 0, false, 2, c7218l5, interfaceC0476a13, 12582960, 112);
                                                    }
                                                    return C9072e.f47360a;
                                                }
                                            }), interfaceC0476a11, ((i20 >> 18) & 14) | 805306368, 436);
                                            C0062b.m376o(SizeKt.m1511h(aVar, SpacingKt.m10360a(interfaceC0476a11).f33951a), interfaceC0476a11);
                                            InterfaceC0500b interfaceC0500bM11159f3 = C5212l.m11159f0(SizeKt.m1509f(InterfaceC9786q.m18282a(C9775f.m18273b(aVar, intrinsicSize)), f3), 0.0f, 0.0f, SpacingKt.m10360a(interfaceC0476a11).f33956f, SpacingKt.m10360a(interfaceC0476a11).f33956f, 3);
                                            AbstractC10270a abstractC10270a = C7499b.m14916N(interfaceC0476a11).f9260b;
                                            C9782m c9782m = C1646b.f9206a;
                                            ButtonKt.m1555a(interfaceC2041a119, interfaceC0500bM11159f3, false, abstractC10270a, C1646b.m5339a(C7499b.m14898D(interfaceC0476a11).m5351j(), interfaceC0476a11, 14), null, null, null, null, C7204a.m14522b(interfaceC0476a11, 197654323, new InterfaceC2057q<InterfaceC9786q, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$3$3$2$2$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // cm.InterfaceC2057q
                                                /* JADX INFO: renamed from: M */
                                                public final C9072e mo1343M(InterfaceC9786q interfaceC9786q, InterfaceC0476a interfaceC0476a12, Integer num4) {
                                                    InterfaceC0476a interfaceC0476a13 = interfaceC0476a12;
                                                    int iIntValue2 = num4.intValue();
                                                    C5207g.m11111f(interfaceC9786q, "$this$Button");
                                                    if ((iIntValue2 & 81) == 16 && interfaceC0476a13.mo1642m()) {
                                                        interfaceC0476a13.mo1650q();
                                                    } else {
                                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                                                        InterfaceC0500b interfaceC0500bM18272a = C9775f.m18272a(IntrinsicSize.Max);
                                                        String string4 = context10.getString(R.string.ui_continue);
                                                        C7218l c7218l5 = ((C1656l) interfaceC0476a13.mo1648p(TypographyKt.f2857a)).f9268e;
                                                        long jM5345d = ((C1648d) interfaceC0476a13.mo1648p(ColorSchemeKt.f2735a)).m5345d();
                                                        C5207g.m11110e(string4, "getString(R.string.ui_continue)");
                                                        TextKt.m1576c(string4, interfaceC0500bM18272a, jM5345d, 0L, null, null, null, 0L, null, new C9797g(3), 0L, 0, false, 1, null, c7218l5, interfaceC0476a13, 48, 3072, 24056);
                                                    }
                                                    return C9072e.f47360a;
                                                }
                                            }), interfaceC0476a11, (14 & (i20 >> 21)) | 805306368, 484);
                                            interfaceC0476a11.mo1661w();
                                            interfaceC0476a11.mo1663x();
                                            interfaceC0476a11.mo1661w();
                                            interfaceC0476a11.mo1661w();
                                        }
                                        return C9072e.f47360a;
                                    }
                                }), interfaceC0476a5, 196608, 22);
                            }
                            return C9072e.f47360a;
                        }
                    }), interfaceC0476a3, 12582912, 122);
                    return C9072e.f47360a;
                }
            }), composerImpl, ((i15 >> 6) & 14) | 199680, 18);
            interfaceC2041a7 = interfaceC2041a5;
            interfaceC2041a8 = interfaceC2041a6;
        }
        c5332q0M1612T = composerImpl.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.review.views.result.ReviewUnscrambleResultPopupKt$ReviewUnscrambleResultPopup$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                ReviewUnscrambleResultPopupKt.m10307a(reviewResultType, str, z10, str2, str3, z11, interfaceC2041a7, interfaceC2041a8, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                return C9072e.f47360a;
            }
        };
    }
}
