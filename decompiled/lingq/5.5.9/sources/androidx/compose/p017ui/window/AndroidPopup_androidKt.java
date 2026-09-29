package androidx.compose.p017ui.window;

import android.view.View;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.graphics.C0512a;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.semantics.C0685a;
import androidx.compose.p017ui.semantics.SemanticsProperties;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.C0487a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import dm.C5212l;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import km.InterfaceC6727j;
import kotlin.collections.C6753d;
import p081e0.C5304d1;
import p081e0.C5329p;
import p081e0.C5331q;
import p081e0.C5332q0;
import p081e0.C5333r;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p127g1.C5656t;
import p127g1.C5659w;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5652p;
import p127g1.InterfaceC5653q;
import p210k1.C6576n;
import p210k1.InterfaceC6577o;
import p230l0.C7204a;
import p338qd.C8573r0;
import p385sf.C9000b;
import p470x1.C10022j;
import p470x1.InterfaceC10015c;
import p521z1.C10427a;
import p521z1.C10428b;
import p521z1.C10435i;
import p521z1.InterfaceC10434h;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPopup_androidKt {

    /* JADX INFO: renamed from: a */
    public static final C5331q f4691a = CompositionLocalKt.m1692b(new InterfaceC2041a<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final /* bridge */ /* synthetic */ String mo807E() {
            return "DEFAULT_TEST_TAG";
        }
    });

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0206  */
    /* JADX WARN: Code duplicated, block: B:75:0x0217  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v46, types: [androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m2619a(final InterfaceC10434h interfaceC10434h, InterfaceC2041a<C9072e> interfaceC2041a, C10435i c10435i, final InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        final InterfaceC2041a<C9072e> interfaceC2041a2;
        int i13;
        C10435i c10435i2;
        int i14;
        int i15;
        InterfaceC2041a<C9072e> interfaceC2041a3;
        C10435i c10435i3;
        View view;
        InterfaceC10015c interfaceC10015c;
        final String str;
        ComposerImpl.C0466b c0466bM1590C;
        final InterfaceC5312g0 interfaceC5312g0M16704V0;
        UUID uuid;
        Object objM1619a0;
        InterfaceC5652p interfaceC5652p;
        InterfaceC10015c interfaceC10015c2;
        LayoutDirection layoutDirection;
        InterfaceC0647n1 interfaceC0647n1;
        InterfaceC2041a<ComposeUiNode> interfaceC2041a4;
        ComposableLambdaImpl composableLambdaImplM2036a;
        final C10435i c10435i4;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(interfaceC10434h, "popupPositionProvider");
        C5207g.m11111f(interfaceC2056p, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-830247068);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.mo1665y(interfaceC10434h) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 112) == 0) {
                interfaceC2041a2 = interfaceC2041a;
                i12 |= composerImplMo1636j.m1600H(interfaceC2041a2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    c10435i2 = c10435i;
                    if (composerImplMo1636j.mo1665y(c10435i2)) {
                        i14 = 256;
                    } else {
                        i14 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 5851) == 1170 || !composerImplMo1636j.mo1642m()) {
                    if (i16 != 0) {
                        interfaceC2041a3 = null;
                    } else {
                        interfaceC2041a3 = interfaceC2041a2;
                    }
                    if (i13 != 0) {
                        c10435i3 = new C10435i(false, 63);
                    } else {
                        c10435i3 = c10435i2;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                    view = (View) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
                    C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
                    str = (String) composerImplMo1636j.mo1648p(f4691a);
                    C5304d1 c5304d2 = CompositionLocalsKt.f4143k;
                    final LayoutDirection layoutDirection2 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
                    composerImplMo1636j.mo1622c(-1165786124);
                    c0466bM1590C = composerImplMo1636j.m1590C();
                    composerImplMo1636j.mo1661w();
                    interfaceC5312g0M16704V0 = C8573r0.m16704V0(interfaceC2056p, composerImplMo1636j);
                    uuid = (UUID) C0487a.m1860a(new Object[0], null, new InterfaceC2041a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final UUID mo807E() {
                            return UUID.randomUUID();
                        }
                    }, composerImplMo1636j, 6);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        C5207g.m11110e(uuid, "popupId");
                        final PopupLayout popupLayout = new PopupLayout(interfaceC2041a3, c10435i3, str, view, interfaceC10015c, interfaceC10434h, uuid);
                        popupLayout.m2621j(c0466bM1590C, C7204a.m14523c(1302892335, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$3, kotlin.jvm.internal.Lambda] */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                    interfaceC0476a3.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                    InterfaceC0500b interfaceC0500bM11163j0 = C5212l.m11163j0(InterfaceC0500b.a.f3325a, false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                                            InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                                            C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                                            InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                                            C0685a<C9072e> c0685a = SemanticsProperties.f4423p;
                                            C9072e c9072e = C9072e.f47360a;
                                            interfaceC6577o2.mo13162a(c0685a, c9072e);
                                            return c9072e;
                                        }
                                    });
                                    final PopupLayout popupLayout2 = popupLayout;
                                    InterfaceC2052l<C10022j, C9072e> interfaceC2052l = new InterfaceC2052l<C10022j, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                        {
                                            super(1);
                                        }

                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final C9072e mo528n(C10022j c10022j) {
                                            C10022j c10022j2 = new C10022j(c10022j.f50980a);
                                            PopupLayout popupLayout3 = popupLayout2;
                                            popupLayout3.m19590setPopupContentSizefhxjrPA(c10022j2);
                                            popupLayout3.m2625n();
                                            return C9072e.f47360a;
                                        }
                                    };
                                    C5207g.m11111f(interfaceC0500bM11163j0, "<this>");
                                    InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM11163j0.mo1929K(new C5659w(interfaceC2052l, InspectableValueKt.f4184a));
                                    float f3 = popupLayout2.getCanCalculatePosition() ? 1.0f : 0.0f;
                                    C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                                    if (!(f3 == 1.0f)) {
                                        interfaceC0500bMo1929K = C0512a.m2001b(interfaceC0500bMo1929K, f3, null, true, 126971);
                                    }
                                    final InterfaceC5301c1<InterfaceC2056p<InterfaceC0476a, Integer, C9072e>> interfaceC5301c1 = interfaceC5312g0M16704V0;
                                    ComposableLambdaImpl composableLambdaImplM14522b = C7204a.m14522b(interfaceC0476a3, 606497925, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                            InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                            if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                                interfaceC0476a5.mo1650q();
                                            } else {
                                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                                                C5331q c5331q = AndroidPopup_androidKt.f4691a;
                                                interfaceC5301c1.getValue().mo1337m0(interfaceC0476a5, 0);
                                            }
                                            return C9072e.f47360a;
                                        }
                                    });
                                    interfaceC0476a3.mo1622c(1406149896);
                                    AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                                        @Override // p127g1.InterfaceC5652p
                                        /* JADX INFO: renamed from: a */
                                        public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                                            int iMax;
                                            C5207g.m11111f(interfaceC0524e, "$this$Layout");
                                            int size = list.size();
                                            int i17 = 0;
                                            if (size == 0) {
                                                return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                                    @Override // cm.InterfaceC2052l
                                                    /* JADX INFO: renamed from: n */
                                                    public final C9072e mo528n(AbstractC0526g.a aVar) {
                                                        C5207g.m11111f(aVar, "$this$layout");
                                                        return C9072e.f47360a;
                                                    }
                                                });
                                            }
                                            if (size == 1) {
                                                final AbstractC0526g abstractC0526gMo2048w = list.get(0).mo2048w(j10);
                                                return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // cm.InterfaceC2052l
                                                    /* JADX INFO: renamed from: n */
                                                    public final C9072e mo528n(AbstractC0526g.a aVar) {
                                                        AbstractC0526g.a aVar2 = aVar;
                                                        C5207g.m11111f(aVar2, "$this$layout");
                                                        AbstractC0526g.a.m2059e(aVar2, abstractC0526gMo2048w, 0, 0);
                                                        return C9072e.f47360a;
                                                    }
                                                });
                                            }
                                            final ArrayList arrayList = new ArrayList(list.size());
                                            int size2 = list.size();
                                            for (int i18 = 0; i18 < size2; i18++) {
                                                arrayList.add(list.get(i18).mo2048w(j10));
                                            }
                                            int iM17249o = C9000b.m17249o(arrayList);
                                            if (iM17249o >= 0) {
                                                int iMax2 = 0;
                                                iMax = 0;
                                                while (true) {
                                                    AbstractC0526g abstractC0526g = (AbstractC0526g) arrayList.get(i17);
                                                    iMax2 = Math.max(iMax2, abstractC0526g.f3686a);
                                                    iMax = Math.max(iMax, abstractC0526g.f3687b);
                                                    if (i17 == iM17249o) {
                                                        break;
                                                    }
                                                    i17++;
                                                }
                                                i17 = iMax2;
                                            } else {
                                                iMax = 0;
                                            }
                                            return interfaceC0524e.m2043P(i17, iMax, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(AbstractC0526g.a aVar) {
                                                    AbstractC0526g.a aVar2 = aVar;
                                                    C5207g.m11111f(aVar2, "$this$layout");
                                                    List<AbstractC0526g> list2 = arrayList;
                                                    int iM17249o2 = C9000b.m17249o(list2);
                                                    if (iM17249o2 >= 0) {
                                                        int i19 = 0;
                                                        while (true) {
                                                            AbstractC0526g.a.m2059e(aVar2, list2.get(i19), 0, 0);
                                                            if (i19 == iM17249o2) {
                                                                break;
                                                            }
                                                            i19++;
                                                        }
                                                    }
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                    };
                                    interfaceC0476a3.mo1622c(-1323940314);
                                    InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                                    InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                                    ComposeUiNode.f3726n.getClass();
                                    InterfaceC2041a<ComposeUiNode> interfaceC2041a5 = ComposeUiNode.Companion.f3728b;
                                    ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bMo1929K);
                                    if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    interfaceC0476a3.mo1640l();
                                    if (interfaceC0476a3.mo1632h()) {
                                        interfaceC0476a3.mo1634i(interfaceC2041a5);
                                    } else {
                                        interfaceC0476a3.mo1653s();
                                    }
                                    C8573r0.m16714a1(interfaceC0476a3, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.f3731e);
                                    C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c3, ComposeUiNode.Companion.f3730d);
                                    C8573r0.m16714a1(interfaceC0476a3, layoutDirection3, ComposeUiNode.Companion.f3732f);
                                    C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n2, ComposeUiNode.Companion.f3733g);
                                    composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                                    interfaceC0476a3.mo1622c(2058660585);
                                    composableLambdaImplM14522b.mo1337m0(interfaceC0476a3, 6);
                                    interfaceC0476a3.mo1661w();
                                    interfaceC0476a3.mo1663x();
                                    interfaceC0476a3.mo1661w();
                                    interfaceC0476a3.mo1661w();
                                }
                                return C9072e.f47360a;
                            }
                        }, true));
                        composerImplMo1636j.m1597F0(popupLayout);
                        objM1619a0 = popupLayout;
                    }
                    composerImplMo1636j.m1609Q(false);
                    final PopupLayout popupLayout2 = (PopupLayout) objM1619a0;
                    final InterfaceC2041a<C9072e> interfaceC2041a5 = interfaceC2041a3;
                    final C10435i c10435i5 = c10435i3;
                    C5333r.m11459a(popupLayout2, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final InterfaceC5327o mo528n(C5329p c5329p) {
                            C5207g.m11111f(c5329p, "$this$DisposableEffect");
                            PopupLayout popupLayout3 = popupLayout2;
                            popupLayout3.f4732I.addView(popupLayout3, popupLayout3.f4733J);
                            popupLayout3.m2622k(interfaceC2041a5, c10435i5, str, layoutDirection2);
                            return new C10427a(popupLayout3);
                        }
                    }, composerImplMo1636j);
                    InterfaceC2041a<C9072e> interfaceC2041a6 = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C9072e mo807E() {
                            popupLayout2.m2622k(interfaceC2041a5, c10435i5, str, layoutDirection2);
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.mo1622c(-1288466761);
                    composerImplMo1636j.m1639k0(interfaceC2041a6);
                    composerImplMo1636j.m1609Q(false);
                    C5333r.m11459a(interfaceC10434h, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final InterfaceC5327o mo528n(C5329p c5329p) {
                            C5207g.m11111f(c5329p, "$this$DisposableEffect");
                            PopupLayout popupLayout3 = popupLayout2;
                            popupLayout3.setPositionProvider(interfaceC10434h);
                            popupLayout3.m2625n();
                            return new C10428b();
                        }
                    }, composerImplMo1636j);
                    C5333r.m11460b(popupLayout2, new AndroidPopup_androidKt$Popup$5(popupLayout2, null), composerImplMo1636j);
                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                    C5656t c5656t = new C5656t(new InterfaceC2052l<InterfaceC5647k, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
                            InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
                            C5207g.m11111f(interfaceC5647k2, "childCoordinates");
                            NodeCoordinator nodeCoordinatorMo2156A = interfaceC5647k2.mo2156A();
                            C5207g.m11108c(nodeCoordinatorMo2156A);
                            popupLayout2.m2624m(nodeCoordinatorMo2156A);
                            return C9072e.f47360a;
                        }
                    }, InspectableValueKt.f4184a);
                    aVar.mo1929K(c5656t);
                    interfaceC5652p = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                        @Override // p127g1.InterfaceC5652p
                        /* JADX INFO: renamed from: a */
                        public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                            C5207g.m11111f(interfaceC0524e, "$this$Layout");
                            popupLayout2.setParentLayoutDirection(layoutDirection2);
                            return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(AbstractC0526g.a aVar2) {
                                    C5207g.m11111f(aVar2, "$this$layout");
                                    return C9072e.f47360a;
                                }
                            });
                        }
                    };
                    composerImplMo1636j.mo1622c(-1323940314);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d2);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a4 = ComposeUiNode.Companion.f3728b;
                    composableLambdaImplM2036a = C0520a.m2036a(c5656t);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(interfaceC2041a4);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC5652p, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                    composerImplMo1636j.mo1622c(2058660585);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    interfaceC2041a2 = interfaceC2041a3;
                    c10435i4 = c10435i3;
                } else {
                    composerImplMo1636j.mo1650q();
                    c10435i4 = c10435i2;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        AndroidPopup_androidKt.m2619a(interfaceC10434h, interfaceC2041a2, c10435i4, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 384;
            c10435i2 = c10435i;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    interfaceC2041a3 = null;
                } else {
                    interfaceC2041a3 = interfaceC2041a2;
                }
                if (i13 != 0) {
                    c10435i3 = new C10435i(false, 63);
                } else {
                    c10435i3 = c10435i2;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                view = (View) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
                C5304d1 c5304d3 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d3);
                str = (String) composerImplMo1636j.mo1648p(f4691a);
                C5304d1 c5304d4 = CompositionLocalsKt.f4143k;
                final LayoutDirection layoutDirection3 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d4);
                composerImplMo1636j.mo1622c(-1165786124);
                c0466bM1590C = composerImplMo1636j.m1590C();
                composerImplMo1636j.mo1661w();
                interfaceC5312g0M16704V0 = C8573r0.m16704V0(interfaceC2056p, composerImplMo1636j);
                uuid = (UUID) C0487a.m1860a(new Object[0], null, new InterfaceC2041a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final UUID mo807E() {
                        return UUID.randomUUID();
                    }
                }, composerImplMo1636j, 6);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    C5207g.m11110e(uuid, "popupId");
                    final PopupLayout popupLayout3 = new PopupLayout(interfaceC2041a3, c10435i3, str, view, interfaceC10015c, interfaceC10434h, uuid);
                    popupLayout3.m2621j(c0466bM1590C, C7204a.m14523c(1302892335, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$3, kotlin.jvm.internal.Lambda] */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                                InterfaceC0500b interfaceC0500bM11163j0 = C5212l.m11163j0(InterfaceC0500b.a.f3325a, false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                                        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                                        C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                                        C0685a<C9072e> c0685a = SemanticsProperties.f4423p;
                                        C9072e c9072e = C9072e.f47360a;
                                        interfaceC6577o2.mo13162a(c0685a, c9072e);
                                        return c9072e;
                                    }
                                });
                                final PopupLayout popupLayout4 = popupLayout3;
                                InterfaceC2052l<C10022j, C9072e> interfaceC2052l = new InterfaceC2052l<C10022j, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                    {
                                        super(1);
                                    }

                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C10022j c10022j) {
                                        C10022j c10022j2 = new C10022j(c10022j.f50980a);
                                        PopupLayout popupLayout5 = popupLayout4;
                                        popupLayout5.m19590setPopupContentSizefhxjrPA(c10022j2);
                                        popupLayout5.m2625n();
                                        return C9072e.f47360a;
                                    }
                                };
                                C5207g.m11111f(interfaceC0500bM11163j0, "<this>");
                                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM11163j0.mo1929K(new C5659w(interfaceC2052l, InspectableValueKt.f4184a));
                                float f3 = popupLayout4.getCanCalculatePosition() ? 1.0f : 0.0f;
                                C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                                if (!(f3 == 1.0f)) {
                                    interfaceC0500bMo1929K = C0512a.m2001b(interfaceC0500bMo1929K, f3, null, true, 126971);
                                }
                                final InterfaceC5301c1<? extends InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e>> interfaceC5301c1 = interfaceC5312g0M16704V0;
                                ComposableLambdaImpl composableLambdaImplM14522b = C7204a.m14522b(interfaceC0476a3, 606497925, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                        InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                        if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                            interfaceC0476a5.mo1650q();
                                        } else {
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                            C5331q c5331q = AndroidPopup_androidKt.f4691a;
                                            interfaceC5301c1.getValue().mo1337m0(interfaceC0476a5, 0);
                                        }
                                        return C9072e.f47360a;
                                    }
                                });
                                interfaceC0476a3.mo1622c(1406149896);
                                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                                    @Override // p127g1.InterfaceC5652p
                                    /* JADX INFO: renamed from: a */
                                    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                                        int iMax;
                                        C5207g.m11111f(interfaceC0524e, "$this$Layout");
                                        int size = list.size();
                                        int i17 = 0;
                                        if (size == 0) {
                                            return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(AbstractC0526g.a aVar2) {
                                                    C5207g.m11111f(aVar2, "$this$layout");
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                        if (size == 1) {
                                            final AbstractC0526g abstractC0526gMo2048w = list.get(0).mo2048w(j10);
                                            return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                                {
                                                    super(1);
                                                }

                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(AbstractC0526g.a aVar2) {
                                                    AbstractC0526g.a aVar3 = aVar2;
                                                    C5207g.m11111f(aVar3, "$this$layout");
                                                    AbstractC0526g.a.m2059e(aVar3, abstractC0526gMo2048w, 0, 0);
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                        final ArrayList arrayList = new ArrayList(list.size());
                                        int size2 = list.size();
                                        for (int i18 = 0; i18 < size2; i18++) {
                                            arrayList.add(list.get(i18).mo2048w(j10));
                                        }
                                        int iM17249o = C9000b.m17249o(arrayList);
                                        if (iM17249o >= 0) {
                                            int iMax2 = 0;
                                            iMax = 0;
                                            while (true) {
                                                AbstractC0526g abstractC0526g = (AbstractC0526g) arrayList.get(i17);
                                                iMax2 = Math.max(iMax2, abstractC0526g.f3686a);
                                                iMax = Math.max(iMax, abstractC0526g.f3687b);
                                                if (i17 == iM17249o) {
                                                    break;
                                                }
                                                i17++;
                                            }
                                            i17 = iMax2;
                                        } else {
                                            iMax = 0;
                                        }
                                        return interfaceC0524e.m2043P(i17, iMax, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // cm.InterfaceC2052l
                                            /* JADX INFO: renamed from: n */
                                            public final C9072e mo528n(AbstractC0526g.a aVar2) {
                                                AbstractC0526g.a aVar3 = aVar2;
                                                C5207g.m11111f(aVar3, "$this$layout");
                                                List<AbstractC0526g> list2 = arrayList;
                                                int iM17249o2 = C9000b.m17249o(list2);
                                                if (iM17249o2 >= 0) {
                                                    int i19 = 0;
                                                    while (true) {
                                                        AbstractC0526g.a.m2059e(aVar3, list2.get(i19), 0, 0);
                                                        if (i19 == iM17249o2) {
                                                            break;
                                                        }
                                                        i19++;
                                                    }
                                                }
                                                return C9072e.f47360a;
                                            }
                                        });
                                    }
                                };
                                interfaceC0476a3.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                                LayoutDirection layoutDirection4 = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a7 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bMo1929K);
                                if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a3.mo1640l();
                                if (interfaceC0476a3.mo1632h()) {
                                    interfaceC0476a3.mo1634i(interfaceC2041a7);
                                } else {
                                    interfaceC0476a3.mo1653s();
                                }
                                C8573r0.m16714a1(interfaceC0476a3, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.f3731e);
                                C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c3, ComposeUiNode.Companion.f3730d);
                                C8573r0.m16714a1(interfaceC0476a3, layoutDirection4, ComposeUiNode.Companion.f3732f);
                                C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n2, ComposeUiNode.Companion.f3733g);
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                                interfaceC0476a3.mo1622c(2058660585);
                                composableLambdaImplM14522b.mo1337m0(interfaceC0476a3, 6);
                                interfaceC0476a3.mo1661w();
                                interfaceC0476a3.mo1663x();
                                interfaceC0476a3.mo1661w();
                                interfaceC0476a3.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }, true));
                    composerImplMo1636j.m1597F0(popupLayout3);
                    objM1619a0 = popupLayout3;
                }
                composerImplMo1636j.m1609Q(false);
                final PopupLayout popupLayout4 = (PopupLayout) objM1619a0;
                final InterfaceC2041a<C9072e> interfaceC2041a7 = interfaceC2041a3;
                final C10435i c10435i6 = c10435i3;
                C5333r.m11459a(popupLayout4, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final InterfaceC5327o mo528n(C5329p c5329p) {
                        C5207g.m11111f(c5329p, "$this$DisposableEffect");
                        PopupLayout popupLayout5 = popupLayout4;
                        popupLayout5.f4732I.addView(popupLayout5, popupLayout5.f4733J);
                        popupLayout5.m2622k(interfaceC2041a7, c10435i6, str, layoutDirection3);
                        return new C10427a(popupLayout5);
                    }
                }, composerImplMo1636j);
                InterfaceC2041a<C9072e> interfaceC2041a8 = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        popupLayout4.m2622k(interfaceC2041a7, c10435i6, str, layoutDirection3);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.mo1622c(-1288466761);
                composerImplMo1636j.m1639k0(interfaceC2041a8);
                composerImplMo1636j.m1609Q(false);
                C5333r.m11459a(interfaceC10434h, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final InterfaceC5327o mo528n(C5329p c5329p) {
                        C5207g.m11111f(c5329p, "$this$DisposableEffect");
                        PopupLayout popupLayout5 = popupLayout4;
                        popupLayout5.setPositionProvider(interfaceC10434h);
                        popupLayout5.m2625n();
                        return new C10428b();
                    }
                }, composerImplMo1636j);
                C5333r.m11460b(popupLayout4, new AndroidPopup_androidKt$Popup$5(popupLayout4, null), composerImplMo1636j);
                InterfaceC0500b.a aVar2 = InterfaceC0500b.a.f3325a;
                C5656t c5656t2 = new C5656t(new InterfaceC2052l<InterfaceC5647k, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
                        InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
                        C5207g.m11111f(interfaceC5647k2, "childCoordinates");
                        NodeCoordinator nodeCoordinatorMo2156A = interfaceC5647k2.mo2156A();
                        C5207g.m11108c(nodeCoordinatorMo2156A);
                        popupLayout4.m2624m(nodeCoordinatorMo2156A);
                        return C9072e.f47360a;
                    }
                }, InspectableValueKt.f4184a);
                aVar2.mo1929K(c5656t2);
                interfaceC5652p = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                    @Override // p127g1.InterfaceC5652p
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                        C5207g.m11111f(interfaceC0524e, "$this$Layout");
                        popupLayout4.setParentLayoutDirection(layoutDirection3);
                        return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(AbstractC0526g.a aVar3) {
                                C5207g.m11111f(aVar3, "$this$layout");
                                return C9072e.f47360a;
                            }
                        });
                    }
                };
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d3);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d4);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a4 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(c5656t2);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a4);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652p, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                interfaceC2041a2 = interfaceC2041a3;
                c10435i4 = c10435i3;
            } else {
                if (i16 != 0) {
                    interfaceC2041a3 = null;
                } else {
                    interfaceC2041a3 = interfaceC2041a2;
                }
                if (i13 != 0) {
                    c10435i3 = new C10435i(false, 63);
                } else {
                    c10435i3 = c10435i2;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                view = (View) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
                C5304d1 c5304d5 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d5);
                str = (String) composerImplMo1636j.mo1648p(f4691a);
                C5304d1 c5304d6 = CompositionLocalsKt.f4143k;
                final LayoutDirection layoutDirection4 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d6);
                composerImplMo1636j.mo1622c(-1165786124);
                c0466bM1590C = composerImplMo1636j.m1590C();
                composerImplMo1636j.mo1661w();
                interfaceC5312g0M16704V0 = C8573r0.m16704V0(interfaceC2056p, composerImplMo1636j);
                uuid = (UUID) C0487a.m1860a(new Object[0], null, new InterfaceC2041a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final UUID mo807E() {
                        return UUID.randomUUID();
                    }
                }, composerImplMo1636j, 6);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    C5207g.m11110e(uuid, "popupId");
                    final PopupLayout popupLayout5 = new PopupLayout(interfaceC2041a3, c10435i3, str, view, interfaceC10015c, interfaceC10434h, uuid);
                    popupLayout5.m2621j(c0466bM1590C, C7204a.m14523c(1302892335, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$3, kotlin.jvm.internal.Lambda] */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                InterfaceC0500b interfaceC0500bM11163j0 = C5212l.m11163j0(InterfaceC0500b.a.f3325a, false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                                        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                                        C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                                        C0685a<C9072e> c0685a = SemanticsProperties.f4423p;
                                        C9072e c9072e = C9072e.f47360a;
                                        interfaceC6577o2.mo13162a(c0685a, c9072e);
                                        return c9072e;
                                    }
                                });
                                final PopupLayout popupLayout6 = popupLayout5;
                                InterfaceC2052l<C10022j, C9072e> interfaceC2052l = new InterfaceC2052l<C10022j, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                    {
                                        super(1);
                                    }

                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C10022j c10022j) {
                                        C10022j c10022j2 = new C10022j(c10022j.f50980a);
                                        PopupLayout popupLayout7 = popupLayout6;
                                        popupLayout7.m19590setPopupContentSizefhxjrPA(c10022j2);
                                        popupLayout7.m2625n();
                                        return C9072e.f47360a;
                                    }
                                };
                                C5207g.m11111f(interfaceC0500bM11163j0, "<this>");
                                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM11163j0.mo1929K(new C5659w(interfaceC2052l, InspectableValueKt.f4184a));
                                float f3 = popupLayout6.getCanCalculatePosition() ? 1.0f : 0.0f;
                                C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                                if (!(f3 == 1.0f)) {
                                    interfaceC0500bMo1929K = C0512a.m2001b(interfaceC0500bMo1929K, f3, null, true, 126971);
                                }
                                final InterfaceC5301c1<? extends InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e>> interfaceC5301c1 = interfaceC5312g0M16704V0;
                                ComposableLambdaImpl composableLambdaImplM14522b = C7204a.m14522b(interfaceC0476a3, 606497925, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                        InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                        if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                            interfaceC0476a5.mo1650q();
                                        } else {
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                            C5331q c5331q = AndroidPopup_androidKt.f4691a;
                                            interfaceC5301c1.getValue().mo1337m0(interfaceC0476a5, 0);
                                        }
                                        return C9072e.f47360a;
                                    }
                                });
                                interfaceC0476a3.mo1622c(1406149896);
                                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                                    @Override // p127g1.InterfaceC5652p
                                    /* JADX INFO: renamed from: a */
                                    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                                        int iMax;
                                        C5207g.m11111f(interfaceC0524e, "$this$Layout");
                                        int size = list.size();
                                        int i17 = 0;
                                        if (size == 0) {
                                            return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(AbstractC0526g.a aVar3) {
                                                    C5207g.m11111f(aVar3, "$this$layout");
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                        if (size == 1) {
                                            final AbstractC0526g abstractC0526gMo2048w = list.get(0).mo2048w(j10);
                                            return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                                {
                                                    super(1);
                                                }

                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(AbstractC0526g.a aVar3) {
                                                    AbstractC0526g.a aVar4 = aVar3;
                                                    C5207g.m11111f(aVar4, "$this$layout");
                                                    AbstractC0526g.a.m2059e(aVar4, abstractC0526gMo2048w, 0, 0);
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                        final ArrayList arrayList = new ArrayList(list.size());
                                        int size2 = list.size();
                                        for (int i18 = 0; i18 < size2; i18++) {
                                            arrayList.add(list.get(i18).mo2048w(j10));
                                        }
                                        int iM17249o = C9000b.m17249o(arrayList);
                                        if (iM17249o >= 0) {
                                            int iMax2 = 0;
                                            iMax = 0;
                                            while (true) {
                                                AbstractC0526g abstractC0526g = (AbstractC0526g) arrayList.get(i17);
                                                iMax2 = Math.max(iMax2, abstractC0526g.f3686a);
                                                iMax = Math.max(iMax, abstractC0526g.f3687b);
                                                if (i17 == iM17249o) {
                                                    break;
                                                }
                                                i17++;
                                            }
                                            i17 = iMax2;
                                        } else {
                                            iMax = 0;
                                        }
                                        return interfaceC0524e.m2043P(i17, iMax, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // cm.InterfaceC2052l
                                            /* JADX INFO: renamed from: n */
                                            public final C9072e mo528n(AbstractC0526g.a aVar3) {
                                                AbstractC0526g.a aVar4 = aVar3;
                                                C5207g.m11111f(aVar4, "$this$layout");
                                                List<AbstractC0526g> list2 = arrayList;
                                                int iM17249o2 = C9000b.m17249o(list2);
                                                if (iM17249o2 >= 0) {
                                                    int i19 = 0;
                                                    while (true) {
                                                        AbstractC0526g.a.m2059e(aVar4, list2.get(i19), 0, 0);
                                                        if (i19 == iM17249o2) {
                                                            break;
                                                        }
                                                        i19++;
                                                    }
                                                }
                                                return C9072e.f47360a;
                                            }
                                        });
                                    }
                                };
                                interfaceC0476a3.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                                LayoutDirection layoutDirection5 = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a9 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bMo1929K);
                                if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a3.mo1640l();
                                if (interfaceC0476a3.mo1632h()) {
                                    interfaceC0476a3.mo1634i(interfaceC2041a9);
                                } else {
                                    interfaceC0476a3.mo1653s();
                                }
                                C8573r0.m16714a1(interfaceC0476a3, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.f3731e);
                                C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c3, ComposeUiNode.Companion.f3730d);
                                C8573r0.m16714a1(interfaceC0476a3, layoutDirection5, ComposeUiNode.Companion.f3732f);
                                C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n2, ComposeUiNode.Companion.f3733g);
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                                interfaceC0476a3.mo1622c(2058660585);
                                composableLambdaImplM14522b.mo1337m0(interfaceC0476a3, 6);
                                interfaceC0476a3.mo1661w();
                                interfaceC0476a3.mo1663x();
                                interfaceC0476a3.mo1661w();
                                interfaceC0476a3.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }, true));
                    composerImplMo1636j.m1597F0(popupLayout5);
                    objM1619a0 = popupLayout5;
                }
                composerImplMo1636j.m1609Q(false);
                final PopupLayout popupLayout6 = (PopupLayout) objM1619a0;
                final InterfaceC2041a<C9072e> interfaceC2041a9 = interfaceC2041a3;
                final C10435i c10435i7 = c10435i3;
                C5333r.m11459a(popupLayout6, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final InterfaceC5327o mo528n(C5329p c5329p) {
                        C5207g.m11111f(c5329p, "$this$DisposableEffect");
                        PopupLayout popupLayout7 = popupLayout6;
                        popupLayout7.f4732I.addView(popupLayout7, popupLayout7.f4733J);
                        popupLayout7.m2622k(interfaceC2041a9, c10435i7, str, layoutDirection4);
                        return new C10427a(popupLayout7);
                    }
                }, composerImplMo1636j);
                InterfaceC2041a<C9072e> interfaceC2041a10 = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        popupLayout6.m2622k(interfaceC2041a9, c10435i7, str, layoutDirection4);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.mo1622c(-1288466761);
                composerImplMo1636j.m1639k0(interfaceC2041a10);
                composerImplMo1636j.m1609Q(false);
                C5333r.m11459a(interfaceC10434h, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final InterfaceC5327o mo528n(C5329p c5329p) {
                        C5207g.m11111f(c5329p, "$this$DisposableEffect");
                        PopupLayout popupLayout7 = popupLayout6;
                        popupLayout7.setPositionProvider(interfaceC10434h);
                        popupLayout7.m2625n();
                        return new C10428b();
                    }
                }, composerImplMo1636j);
                C5333r.m11460b(popupLayout6, new AndroidPopup_androidKt$Popup$5(popupLayout6, null), composerImplMo1636j);
                InterfaceC0500b.a aVar3 = InterfaceC0500b.a.f3325a;
                C5656t c5656t3 = new C5656t(new InterfaceC2052l<InterfaceC5647k, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
                        InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
                        C5207g.m11111f(interfaceC5647k2, "childCoordinates");
                        NodeCoordinator nodeCoordinatorMo2156A = interfaceC5647k2.mo2156A();
                        C5207g.m11108c(nodeCoordinatorMo2156A);
                        popupLayout6.m2624m(nodeCoordinatorMo2156A);
                        return C9072e.f47360a;
                    }
                }, InspectableValueKt.f4184a);
                aVar3.mo1929K(c5656t3);
                interfaceC5652p = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                    @Override // p127g1.InterfaceC5652p
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                        C5207g.m11111f(interfaceC0524e, "$this$Layout");
                        popupLayout6.setParentLayoutDirection(layoutDirection4);
                        return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(AbstractC0526g.a aVar4) {
                                C5207g.m11111f(aVar4, "$this$layout");
                                return C9072e.f47360a;
                            }
                        });
                    }
                };
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d5);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d6);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a4 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(c5656t3);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a4);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652p, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                interfaceC2041a2 = interfaceC2041a3;
                c10435i4 = c10435i3;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AndroidPopup_androidKt.m2619a(interfaceC10434h, interfaceC2041a2, c10435i4, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 48;
        interfaceC2041a2 = interfaceC2041a;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                c10435i2 = c10435i;
                if (composerImplMo1636j.mo1665y(c10435i2)) {
                    i14 = 256;
                } else {
                    i14 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    interfaceC2041a3 = null;
                } else {
                    interfaceC2041a3 = interfaceC2041a2;
                }
                if (i13 != 0) {
                    c10435i3 = new C10435i(false, 63);
                } else {
                    c10435i3 = c10435i2;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                view = (View) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
                C5304d1 c5304d7 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d7);
                str = (String) composerImplMo1636j.mo1648p(f4691a);
                C5304d1 c5304d8 = CompositionLocalsKt.f4143k;
                final LayoutDirection layoutDirection5 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d8);
                composerImplMo1636j.mo1622c(-1165786124);
                c0466bM1590C = composerImplMo1636j.m1590C();
                composerImplMo1636j.mo1661w();
                interfaceC5312g0M16704V0 = C8573r0.m16704V0(interfaceC2056p, composerImplMo1636j);
                uuid = (UUID) C0487a.m1860a(new Object[0], null, new InterfaceC2041a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final UUID mo807E() {
                        return UUID.randomUUID();
                    }
                }, composerImplMo1636j, 6);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    C5207g.m11110e(uuid, "popupId");
                    final PopupLayout popupLayout7 = new PopupLayout(interfaceC2041a3, c10435i3, str, view, interfaceC10015c, interfaceC10434h, uuid);
                    popupLayout7.m2621j(c0466bM1590C, C7204a.m14523c(1302892335, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$3, kotlin.jvm.internal.Lambda] */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                                InterfaceC0500b interfaceC0500bM11163j0 = C5212l.m11163j0(InterfaceC0500b.a.f3325a, false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                                        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                                        C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                                        C0685a<C9072e> c0685a = SemanticsProperties.f4423p;
                                        C9072e c9072e = C9072e.f47360a;
                                        interfaceC6577o2.mo13162a(c0685a, c9072e);
                                        return c9072e;
                                    }
                                });
                                final PopupLayout popupLayout8 = popupLayout7;
                                InterfaceC2052l<C10022j, C9072e> interfaceC2052l = new InterfaceC2052l<C10022j, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                    {
                                        super(1);
                                    }

                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C10022j c10022j) {
                                        C10022j c10022j2 = new C10022j(c10022j.f50980a);
                                        PopupLayout popupLayout9 = popupLayout8;
                                        popupLayout9.m19590setPopupContentSizefhxjrPA(c10022j2);
                                        popupLayout9.m2625n();
                                        return C9072e.f47360a;
                                    }
                                };
                                C5207g.m11111f(interfaceC0500bM11163j0, "<this>");
                                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM11163j0.mo1929K(new C5659w(interfaceC2052l, InspectableValueKt.f4184a));
                                float f3 = popupLayout8.getCanCalculatePosition() ? 1.0f : 0.0f;
                                C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                                if (!(f3 == 1.0f)) {
                                    interfaceC0500bMo1929K = C0512a.m2001b(interfaceC0500bMo1929K, f3, null, true, 126971);
                                }
                                final InterfaceC5301c1<? extends InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e>> interfaceC5301c1 = interfaceC5312g0M16704V0;
                                ComposableLambdaImpl composableLambdaImplM14522b = C7204a.m14522b(interfaceC0476a3, 606497925, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                        InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                        if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                            interfaceC0476a5.mo1650q();
                                        } else {
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                            C5331q c5331q = AndroidPopup_androidKt.f4691a;
                                            interfaceC5301c1.getValue().mo1337m0(interfaceC0476a5, 0);
                                        }
                                        return C9072e.f47360a;
                                    }
                                });
                                interfaceC0476a3.mo1622c(1406149896);
                                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                                    @Override // p127g1.InterfaceC5652p
                                    /* JADX INFO: renamed from: a */
                                    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                                        int iMax;
                                        C5207g.m11111f(interfaceC0524e, "$this$Layout");
                                        int size = list.size();
                                        int i17 = 0;
                                        if (size == 0) {
                                            return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(AbstractC0526g.a aVar4) {
                                                    C5207g.m11111f(aVar4, "$this$layout");
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                        if (size == 1) {
                                            final AbstractC0526g abstractC0526gMo2048w = list.get(0).mo2048w(j10);
                                            return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                                {
                                                    super(1);
                                                }

                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(AbstractC0526g.a aVar4) {
                                                    AbstractC0526g.a aVar5 = aVar4;
                                                    C5207g.m11111f(aVar5, "$this$layout");
                                                    AbstractC0526g.a.m2059e(aVar5, abstractC0526gMo2048w, 0, 0);
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                        final ArrayList arrayList = new ArrayList(list.size());
                                        int size2 = list.size();
                                        for (int i18 = 0; i18 < size2; i18++) {
                                            arrayList.add(list.get(i18).mo2048w(j10));
                                        }
                                        int iM17249o = C9000b.m17249o(arrayList);
                                        if (iM17249o >= 0) {
                                            int iMax2 = 0;
                                            iMax = 0;
                                            while (true) {
                                                AbstractC0526g abstractC0526g = (AbstractC0526g) arrayList.get(i17);
                                                iMax2 = Math.max(iMax2, abstractC0526g.f3686a);
                                                iMax = Math.max(iMax, abstractC0526g.f3687b);
                                                if (i17 == iM17249o) {
                                                    break;
                                                }
                                                i17++;
                                            }
                                            i17 = iMax2;
                                        } else {
                                            iMax = 0;
                                        }
                                        return interfaceC0524e.m2043P(i17, iMax, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // cm.InterfaceC2052l
                                            /* JADX INFO: renamed from: n */
                                            public final C9072e mo528n(AbstractC0526g.a aVar4) {
                                                AbstractC0526g.a aVar5 = aVar4;
                                                C5207g.m11111f(aVar5, "$this$layout");
                                                List<AbstractC0526g> list2 = arrayList;
                                                int iM17249o2 = C9000b.m17249o(list2);
                                                if (iM17249o2 >= 0) {
                                                    int i19 = 0;
                                                    while (true) {
                                                        AbstractC0526g.a.m2059e(aVar5, list2.get(i19), 0, 0);
                                                        if (i19 == iM17249o2) {
                                                            break;
                                                        }
                                                        i19++;
                                                    }
                                                }
                                                return C9072e.f47360a;
                                            }
                                        });
                                    }
                                };
                                interfaceC0476a3.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                                LayoutDirection layoutDirection6 = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a11 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bMo1929K);
                                if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a3.mo1640l();
                                if (interfaceC0476a3.mo1632h()) {
                                    interfaceC0476a3.mo1634i(interfaceC2041a11);
                                } else {
                                    interfaceC0476a3.mo1653s();
                                }
                                C8573r0.m16714a1(interfaceC0476a3, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.f3731e);
                                C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c3, ComposeUiNode.Companion.f3730d);
                                C8573r0.m16714a1(interfaceC0476a3, layoutDirection6, ComposeUiNode.Companion.f3732f);
                                C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n2, ComposeUiNode.Companion.f3733g);
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                                interfaceC0476a3.mo1622c(2058660585);
                                composableLambdaImplM14522b.mo1337m0(interfaceC0476a3, 6);
                                interfaceC0476a3.mo1661w();
                                interfaceC0476a3.mo1663x();
                                interfaceC0476a3.mo1661w();
                                interfaceC0476a3.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }, true));
                    composerImplMo1636j.m1597F0(popupLayout7);
                    objM1619a0 = popupLayout7;
                }
                composerImplMo1636j.m1609Q(false);
                final PopupLayout popupLayout8 = (PopupLayout) objM1619a0;
                final InterfaceC2041a<C9072e> interfaceC2041a11 = interfaceC2041a3;
                final C10435i c10435i8 = c10435i3;
                C5333r.m11459a(popupLayout8, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final InterfaceC5327o mo528n(C5329p c5329p) {
                        C5207g.m11111f(c5329p, "$this$DisposableEffect");
                        PopupLayout popupLayout9 = popupLayout8;
                        popupLayout9.f4732I.addView(popupLayout9, popupLayout9.f4733J);
                        popupLayout9.m2622k(interfaceC2041a11, c10435i8, str, layoutDirection5);
                        return new C10427a(popupLayout9);
                    }
                }, composerImplMo1636j);
                InterfaceC2041a<C9072e> interfaceC2041a12 = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        popupLayout8.m2622k(interfaceC2041a11, c10435i8, str, layoutDirection5);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.mo1622c(-1288466761);
                composerImplMo1636j.m1639k0(interfaceC2041a12);
                composerImplMo1636j.m1609Q(false);
                C5333r.m11459a(interfaceC10434h, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final InterfaceC5327o mo528n(C5329p c5329p) {
                        C5207g.m11111f(c5329p, "$this$DisposableEffect");
                        PopupLayout popupLayout9 = popupLayout8;
                        popupLayout9.setPositionProvider(interfaceC10434h);
                        popupLayout9.m2625n();
                        return new C10428b();
                    }
                }, composerImplMo1636j);
                C5333r.m11460b(popupLayout8, new AndroidPopup_androidKt$Popup$5(popupLayout8, null), composerImplMo1636j);
                InterfaceC0500b.a aVar4 = InterfaceC0500b.a.f3325a;
                C5656t c5656t4 = new C5656t(new InterfaceC2052l<InterfaceC5647k, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
                        InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
                        C5207g.m11111f(interfaceC5647k2, "childCoordinates");
                        NodeCoordinator nodeCoordinatorMo2156A = interfaceC5647k2.mo2156A();
                        C5207g.m11108c(nodeCoordinatorMo2156A);
                        popupLayout8.m2624m(nodeCoordinatorMo2156A);
                        return C9072e.f47360a;
                    }
                }, InspectableValueKt.f4184a);
                aVar4.mo1929K(c5656t4);
                interfaceC5652p = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                    @Override // p127g1.InterfaceC5652p
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                        C5207g.m11111f(interfaceC0524e, "$this$Layout");
                        popupLayout8.setParentLayoutDirection(layoutDirection5);
                        return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(AbstractC0526g.a aVar5) {
                                C5207g.m11111f(aVar5, "$this$layout");
                                return C9072e.f47360a;
                            }
                        });
                    }
                };
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d7);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d8);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a4 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(c5656t4);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a4);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652p, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                interfaceC2041a2 = interfaceC2041a3;
                c10435i4 = c10435i3;
            } else {
                if (i16 != 0) {
                    interfaceC2041a3 = null;
                } else {
                    interfaceC2041a3 = interfaceC2041a2;
                }
                if (i13 != 0) {
                    c10435i3 = new C10435i(false, 63);
                } else {
                    c10435i3 = c10435i2;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                view = (View) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
                C5304d1 c5304d9 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d9);
                str = (String) composerImplMo1636j.mo1648p(f4691a);
                C5304d1 c5304d10 = CompositionLocalsKt.f4143k;
                final LayoutDirection layoutDirection6 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d10);
                composerImplMo1636j.mo1622c(-1165786124);
                c0466bM1590C = composerImplMo1636j.m1590C();
                composerImplMo1636j.mo1661w();
                interfaceC5312g0M16704V0 = C8573r0.m16704V0(interfaceC2056p, composerImplMo1636j);
                uuid = (UUID) C0487a.m1860a(new Object[0], null, new InterfaceC2041a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final UUID mo807E() {
                        return UUID.randomUUID();
                    }
                }, composerImplMo1636j, 6);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    C5207g.m11110e(uuid, "popupId");
                    final PopupLayout popupLayout9 = new PopupLayout(interfaceC2041a3, c10435i3, str, view, interfaceC10015c, interfaceC10434h, uuid);
                    popupLayout9.m2621j(c0466bM1590C, C7204a.m14523c(1302892335, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$3, kotlin.jvm.internal.Lambda] */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                InterfaceC0500b interfaceC0500bM11163j0 = C5212l.m11163j0(InterfaceC0500b.a.f3325a, false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                                        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                                        C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                                        C0685a<C9072e> c0685a = SemanticsProperties.f4423p;
                                        C9072e c9072e = C9072e.f47360a;
                                        interfaceC6577o2.mo13162a(c0685a, c9072e);
                                        return c9072e;
                                    }
                                });
                                final PopupLayout popupLayout10 = popupLayout9;
                                InterfaceC2052l<C10022j, C9072e> interfaceC2052l = new InterfaceC2052l<C10022j, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                    {
                                        super(1);
                                    }

                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C10022j c10022j) {
                                        C10022j c10022j2 = new C10022j(c10022j.f50980a);
                                        PopupLayout popupLayout11 = popupLayout10;
                                        popupLayout11.m19590setPopupContentSizefhxjrPA(c10022j2);
                                        popupLayout11.m2625n();
                                        return C9072e.f47360a;
                                    }
                                };
                                C5207g.m11111f(interfaceC0500bM11163j0, "<this>");
                                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM11163j0.mo1929K(new C5659w(interfaceC2052l, InspectableValueKt.f4184a));
                                float f3 = popupLayout10.getCanCalculatePosition() ? 1.0f : 0.0f;
                                C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                                if (!(f3 == 1.0f)) {
                                    interfaceC0500bMo1929K = C0512a.m2001b(interfaceC0500bMo1929K, f3, null, true, 126971);
                                }
                                final InterfaceC5301c1<? extends InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e>> interfaceC5301c1 = interfaceC5312g0M16704V0;
                                ComposableLambdaImpl composableLambdaImplM14522b = C7204a.m14522b(interfaceC0476a3, 606497925, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                        InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                        if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                            interfaceC0476a5.mo1650q();
                                        } else {
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                                            C5331q c5331q = AndroidPopup_androidKt.f4691a;
                                            interfaceC5301c1.getValue().mo1337m0(interfaceC0476a5, 0);
                                        }
                                        return C9072e.f47360a;
                                    }
                                });
                                interfaceC0476a3.mo1622c(1406149896);
                                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                                    @Override // p127g1.InterfaceC5652p
                                    /* JADX INFO: renamed from: a */
                                    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                                        int iMax;
                                        C5207g.m11111f(interfaceC0524e, "$this$Layout");
                                        int size = list.size();
                                        int i17 = 0;
                                        if (size == 0) {
                                            return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(AbstractC0526g.a aVar5) {
                                                    C5207g.m11111f(aVar5, "$this$layout");
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                        if (size == 1) {
                                            final AbstractC0526g abstractC0526gMo2048w = list.get(0).mo2048w(j10);
                                            return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                                {
                                                    super(1);
                                                }

                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(AbstractC0526g.a aVar5) {
                                                    AbstractC0526g.a aVar6 = aVar5;
                                                    C5207g.m11111f(aVar6, "$this$layout");
                                                    AbstractC0526g.a.m2059e(aVar6, abstractC0526gMo2048w, 0, 0);
                                                    return C9072e.f47360a;
                                                }
                                            });
                                        }
                                        final ArrayList arrayList = new ArrayList(list.size());
                                        int size2 = list.size();
                                        for (int i18 = 0; i18 < size2; i18++) {
                                            arrayList.add(list.get(i18).mo2048w(j10));
                                        }
                                        int iM17249o = C9000b.m17249o(arrayList);
                                        if (iM17249o >= 0) {
                                            int iMax2 = 0;
                                            iMax = 0;
                                            while (true) {
                                                AbstractC0526g abstractC0526g = (AbstractC0526g) arrayList.get(i17);
                                                iMax2 = Math.max(iMax2, abstractC0526g.f3686a);
                                                iMax = Math.max(iMax, abstractC0526g.f3687b);
                                                if (i17 == iM17249o) {
                                                    break;
                                                }
                                                i17++;
                                            }
                                            i17 = iMax2;
                                        } else {
                                            iMax = 0;
                                        }
                                        return interfaceC0524e.m2043P(i17, iMax, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // cm.InterfaceC2052l
                                            /* JADX INFO: renamed from: n */
                                            public final C9072e mo528n(AbstractC0526g.a aVar5) {
                                                AbstractC0526g.a aVar6 = aVar5;
                                                C5207g.m11111f(aVar6, "$this$layout");
                                                List<AbstractC0526g> list2 = arrayList;
                                                int iM17249o2 = C9000b.m17249o(list2);
                                                if (iM17249o2 >= 0) {
                                                    int i19 = 0;
                                                    while (true) {
                                                        AbstractC0526g.a.m2059e(aVar6, list2.get(i19), 0, 0);
                                                        if (i19 == iM17249o2) {
                                                            break;
                                                        }
                                                        i19++;
                                                    }
                                                }
                                                return C9072e.f47360a;
                                            }
                                        });
                                    }
                                };
                                interfaceC0476a3.mo1622c(-1323940314);
                                InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                                LayoutDirection layoutDirection7 = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                                InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                                ComposeUiNode.f3726n.getClass();
                                InterfaceC2041a<ComposeUiNode> interfaceC2041a13 = ComposeUiNode.Companion.f3728b;
                                ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bMo1929K);
                                if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                interfaceC0476a3.mo1640l();
                                if (interfaceC0476a3.mo1632h()) {
                                    interfaceC0476a3.mo1634i(interfaceC2041a13);
                                } else {
                                    interfaceC0476a3.mo1653s();
                                }
                                C8573r0.m16714a1(interfaceC0476a3, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.f3731e);
                                C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c3, ComposeUiNode.Companion.f3730d);
                                C8573r0.m16714a1(interfaceC0476a3, layoutDirection7, ComposeUiNode.Companion.f3732f);
                                C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n2, ComposeUiNode.Companion.f3733g);
                                composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                                interfaceC0476a3.mo1622c(2058660585);
                                composableLambdaImplM14522b.mo1337m0(interfaceC0476a3, 6);
                                interfaceC0476a3.mo1661w();
                                interfaceC0476a3.mo1663x();
                                interfaceC0476a3.mo1661w();
                                interfaceC0476a3.mo1661w();
                            }
                            return C9072e.f47360a;
                        }
                    }, true));
                    composerImplMo1636j.m1597F0(popupLayout9);
                    objM1619a0 = popupLayout9;
                }
                composerImplMo1636j.m1609Q(false);
                final PopupLayout popupLayout10 = (PopupLayout) objM1619a0;
                final InterfaceC2041a<C9072e> interfaceC2041a13 = interfaceC2041a3;
                final C10435i c10435i9 = c10435i3;
                C5333r.m11459a(popupLayout10, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final InterfaceC5327o mo528n(C5329p c5329p) {
                        C5207g.m11111f(c5329p, "$this$DisposableEffect");
                        PopupLayout popupLayout11 = popupLayout10;
                        popupLayout11.f4732I.addView(popupLayout11, popupLayout11.f4733J);
                        popupLayout11.m2622k(interfaceC2041a13, c10435i9, str, layoutDirection6);
                        return new C10427a(popupLayout11);
                    }
                }, composerImplMo1636j);
                InterfaceC2041a<C9072e> interfaceC2041a14 = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        popupLayout10.m2622k(interfaceC2041a13, c10435i9, str, layoutDirection6);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.mo1622c(-1288466761);
                composerImplMo1636j.m1639k0(interfaceC2041a14);
                composerImplMo1636j.m1609Q(false);
                C5333r.m11459a(interfaceC10434h, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final InterfaceC5327o mo528n(C5329p c5329p) {
                        C5207g.m11111f(c5329p, "$this$DisposableEffect");
                        PopupLayout popupLayout11 = popupLayout10;
                        popupLayout11.setPositionProvider(interfaceC10434h);
                        popupLayout11.m2625n();
                        return new C10428b();
                    }
                }, composerImplMo1636j);
                C5333r.m11460b(popupLayout10, new AndroidPopup_androidKt$Popup$5(popupLayout10, null), composerImplMo1636j);
                InterfaceC0500b.a aVar5 = InterfaceC0500b.a.f3325a;
                C5656t c5656t5 = new C5656t(new InterfaceC2052l<InterfaceC5647k, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
                        InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
                        C5207g.m11111f(interfaceC5647k2, "childCoordinates");
                        NodeCoordinator nodeCoordinatorMo2156A = interfaceC5647k2.mo2156A();
                        C5207g.m11108c(nodeCoordinatorMo2156A);
                        popupLayout10.m2624m(nodeCoordinatorMo2156A);
                        return C9072e.f47360a;
                    }
                }, InspectableValueKt.f4184a);
                aVar5.mo1929K(c5656t5);
                interfaceC5652p = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                    @Override // p127g1.InterfaceC5652p
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                        C5207g.m11111f(interfaceC0524e, "$this$Layout");
                        popupLayout10.setParentLayoutDirection(layoutDirection6);
                        return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(AbstractC0526g.a aVar6) {
                                C5207g.m11111f(aVar6, "$this$layout");
                                return C9072e.f47360a;
                            }
                        });
                    }
                };
                composerImplMo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d9);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d10);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a4 = ComposeUiNode.Companion.f3728b;
                composableLambdaImplM2036a = C0520a.m2036a(c5656t5);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(interfaceC2041a4);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, interfaceC5652p, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
                composerImplMo1636j.mo1622c(2058660585);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                interfaceC2041a2 = interfaceC2041a3;
                c10435i4 = c10435i3;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    AndroidPopup_androidKt.m2619a(interfaceC10434h, interfaceC2041a2, c10435i4, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 384;
        c10435i2 = c10435i;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 5851) == 1170) {
            if (i16 != 0) {
                interfaceC2041a3 = null;
            } else {
                interfaceC2041a3 = interfaceC2041a2;
            }
            if (i13 != 0) {
                c10435i3 = new C10435i(false, 63);
            } else {
                c10435i3 = c10435i2;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
            view = (View) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
            C5304d1 c5304d11 = CompositionLocalsKt.f4137e;
            interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d11);
            str = (String) composerImplMo1636j.mo1648p(f4691a);
            C5304d1 c5304d12 = CompositionLocalsKt.f4143k;
            final LayoutDirection layoutDirection7 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d12);
            composerImplMo1636j.mo1622c(-1165786124);
            c0466bM1590C = composerImplMo1636j.m1590C();
            composerImplMo1636j.mo1661w();
            interfaceC5312g0M16704V0 = C8573r0.m16704V0(interfaceC2056p, composerImplMo1636j);
            uuid = (UUID) C0487a.m1860a(new Object[0], null, new InterfaceC2041a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final UUID mo807E() {
                    return UUID.randomUUID();
                }
            }, composerImplMo1636j, 6);
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a0 = composerImplMo1636j.m1619a0();
            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                C5207g.m11110e(uuid, "popupId");
                final PopupLayout popupLayout11 = new PopupLayout(interfaceC2041a3, c10435i3, str, view, interfaceC10015c, interfaceC10434h, uuid);
                popupLayout11.m2621j(c0466bM1590C, C7204a.m14523c(1302892335, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$3, kotlin.jvm.internal.Lambda] */
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                            InterfaceC0500b interfaceC0500bM11163j0 = C5212l.m11163j0(InterfaceC0500b.a.f3325a, false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                                    InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                                    C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                                    InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                                    C0685a<C9072e> c0685a = SemanticsProperties.f4423p;
                                    C9072e c9072e = C9072e.f47360a;
                                    interfaceC6577o2.mo13162a(c0685a, c9072e);
                                    return c9072e;
                                }
                            });
                            final PopupLayout popupLayout12 = popupLayout11;
                            InterfaceC2052l<C10022j, C9072e> interfaceC2052l = new InterfaceC2052l<C10022j, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C10022j c10022j) {
                                    C10022j c10022j2 = new C10022j(c10022j.f50980a);
                                    PopupLayout popupLayout13 = popupLayout12;
                                    popupLayout13.m19590setPopupContentSizefhxjrPA(c10022j2);
                                    popupLayout13.m2625n();
                                    return C9072e.f47360a;
                                }
                            };
                            C5207g.m11111f(interfaceC0500bM11163j0, "<this>");
                            InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM11163j0.mo1929K(new C5659w(interfaceC2052l, InspectableValueKt.f4184a));
                            float f3 = popupLayout12.getCanCalculatePosition() ? 1.0f : 0.0f;
                            C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                            if (!(f3 == 1.0f)) {
                                interfaceC0500bMo1929K = C0512a.m2001b(interfaceC0500bMo1929K, f3, null, true, 126971);
                            }
                            final InterfaceC5301c1<? extends InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e>> interfaceC5301c1 = interfaceC5312g0M16704V0;
                            ComposableLambdaImpl composableLambdaImplM14522b = C7204a.m14522b(interfaceC0476a3, 606497925, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                    InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                    if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                        interfaceC0476a5.mo1650q();
                                    } else {
                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                        C5331q c5331q = AndroidPopup_androidKt.f4691a;
                                        interfaceC5301c1.getValue().mo1337m0(interfaceC0476a5, 0);
                                    }
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC0476a3.mo1622c(1406149896);
                            AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                                @Override // p127g1.InterfaceC5652p
                                /* JADX INFO: renamed from: a */
                                public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                                    int iMax;
                                    C5207g.m11111f(interfaceC0524e, "$this$Layout");
                                    int size = list.size();
                                    int i17 = 0;
                                    if (size == 0) {
                                        return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                            @Override // cm.InterfaceC2052l
                                            /* JADX INFO: renamed from: n */
                                            public final C9072e mo528n(AbstractC0526g.a aVar6) {
                                                C5207g.m11111f(aVar6, "$this$layout");
                                                return C9072e.f47360a;
                                            }
                                        });
                                    }
                                    if (size == 1) {
                                        final AbstractC0526g abstractC0526gMo2048w = list.get(0).mo2048w(j10);
                                        return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                            {
                                                super(1);
                                            }

                                            @Override // cm.InterfaceC2052l
                                            /* JADX INFO: renamed from: n */
                                            public final C9072e mo528n(AbstractC0526g.a aVar6) {
                                                AbstractC0526g.a aVar7 = aVar6;
                                                C5207g.m11111f(aVar7, "$this$layout");
                                                AbstractC0526g.a.m2059e(aVar7, abstractC0526gMo2048w, 0, 0);
                                                return C9072e.f47360a;
                                            }
                                        });
                                    }
                                    final ArrayList arrayList = new ArrayList(list.size());
                                    int size2 = list.size();
                                    for (int i18 = 0; i18 < size2; i18++) {
                                        arrayList.add(list.get(i18).mo2048w(j10));
                                    }
                                    int iM17249o = C9000b.m17249o(arrayList);
                                    if (iM17249o >= 0) {
                                        int iMax2 = 0;
                                        iMax = 0;
                                        while (true) {
                                            AbstractC0526g abstractC0526g = (AbstractC0526g) arrayList.get(i17);
                                            iMax2 = Math.max(iMax2, abstractC0526g.f3686a);
                                            iMax = Math.max(iMax, abstractC0526g.f3687b);
                                            if (i17 == iM17249o) {
                                                break;
                                            }
                                            i17++;
                                        }
                                        i17 = iMax2;
                                    } else {
                                        iMax = 0;
                                    }
                                    return interfaceC0524e.m2043P(i17, iMax, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final C9072e mo528n(AbstractC0526g.a aVar6) {
                                            AbstractC0526g.a aVar7 = aVar6;
                                            C5207g.m11111f(aVar7, "$this$layout");
                                            List<AbstractC0526g> list2 = arrayList;
                                            int iM17249o2 = C9000b.m17249o(list2);
                                            if (iM17249o2 >= 0) {
                                                int i19 = 0;
                                                while (true) {
                                                    AbstractC0526g.a.m2059e(aVar7, list2.get(i19), 0, 0);
                                                    if (i19 == iM17249o2) {
                                                        break;
                                                    }
                                                    i19++;
                                                }
                                            }
                                            return C9072e.f47360a;
                                        }
                                    });
                                }
                            };
                            interfaceC0476a3.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                            LayoutDirection layoutDirection8 = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a15 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bMo1929K);
                            if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a3.mo1640l();
                            if (interfaceC0476a3.mo1632h()) {
                                interfaceC0476a3.mo1634i(interfaceC2041a15);
                            } else {
                                interfaceC0476a3.mo1653s();
                            }
                            C8573r0.m16714a1(interfaceC0476a3, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.f3731e);
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c3, ComposeUiNode.Companion.f3730d);
                            C8573r0.m16714a1(interfaceC0476a3, layoutDirection8, ComposeUiNode.Companion.f3732f);
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n2, ComposeUiNode.Companion.f3733g);
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                            interfaceC0476a3.mo1622c(2058660585);
                            composableLambdaImplM14522b.mo1337m0(interfaceC0476a3, 6);
                            interfaceC0476a3.mo1661w();
                            interfaceC0476a3.mo1663x();
                            interfaceC0476a3.mo1661w();
                            interfaceC0476a3.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }, true));
                composerImplMo1636j.m1597F0(popupLayout11);
                objM1619a0 = popupLayout11;
            }
            composerImplMo1636j.m1609Q(false);
            final PopupLayout popupLayout12 = (PopupLayout) objM1619a0;
            final InterfaceC2041a<C9072e> interfaceC2041a15 = interfaceC2041a3;
            final C10435i c10435i10 = c10435i3;
            C5333r.m11459a(popupLayout12, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    PopupLayout popupLayout13 = popupLayout12;
                    popupLayout13.f4732I.addView(popupLayout13, popupLayout13.f4733J);
                    popupLayout13.m2622k(interfaceC2041a15, c10435i10, str, layoutDirection7);
                    return new C10427a(popupLayout13);
                }
            }, composerImplMo1636j);
            InterfaceC2041a<C9072e> interfaceC2041a16 = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    popupLayout12.m2622k(interfaceC2041a15, c10435i10, str, layoutDirection7);
                    return C9072e.f47360a;
                }
            };
            composerImplMo1636j.mo1622c(-1288466761);
            composerImplMo1636j.m1639k0(interfaceC2041a16);
            composerImplMo1636j.m1609Q(false);
            C5333r.m11459a(interfaceC10434h, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    PopupLayout popupLayout13 = popupLayout12;
                    popupLayout13.setPositionProvider(interfaceC10434h);
                    popupLayout13.m2625n();
                    return new C10428b();
                }
            }, composerImplMo1636j);
            C5333r.m11460b(popupLayout12, new AndroidPopup_androidKt$Popup$5(popupLayout12, null), composerImplMo1636j);
            InterfaceC0500b.a aVar6 = InterfaceC0500b.a.f3325a;
            C5656t c5656t6 = new C5656t(new InterfaceC2052l<InterfaceC5647k, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
                    InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
                    C5207g.m11111f(interfaceC5647k2, "childCoordinates");
                    NodeCoordinator nodeCoordinatorMo2156A = interfaceC5647k2.mo2156A();
                    C5207g.m11108c(nodeCoordinatorMo2156A);
                    popupLayout12.m2624m(nodeCoordinatorMo2156A);
                    return C9072e.f47360a;
                }
            }, InspectableValueKt.f4184a);
            aVar6.mo1929K(c5656t6);
            interfaceC5652p = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                @Override // p127g1.InterfaceC5652p
                /* JADX INFO: renamed from: a */
                public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                    C5207g.m11111f(interfaceC0524e, "$this$Layout");
                    popupLayout12.setParentLayoutDirection(layoutDirection7);
                    return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(AbstractC0526g.a aVar7) {
                            C5207g.m11111f(aVar7, "$this$layout");
                            return C9072e.f47360a;
                        }
                    });
                }
            };
            composerImplMo1636j.mo1622c(-1323940314);
            interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d11);
            layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d12);
            interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a4 = ComposeUiNode.Companion.f3728b;
            composableLambdaImplM2036a = C0520a.m2036a(c5656t6);
            if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.mo1640l();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(interfaceC2041a4);
            } else {
                composerImplMo1636j.mo1653s();
            }
            C8573r0.m16714a1(composerImplMo1636j, interfaceC5652p, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
            composerImplMo1636j.mo1622c(2058660585);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            interfaceC2041a2 = interfaceC2041a3;
            c10435i4 = c10435i3;
        } else {
            if (i16 != 0) {
                interfaceC2041a3 = null;
            } else {
                interfaceC2041a3 = interfaceC2041a2;
            }
            if (i13 != 0) {
                c10435i3 = new C10435i(false, 63);
            } else {
                c10435i3 = c10435i2;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
            view = (View) composerImplMo1636j.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
            C5304d1 c5304d13 = CompositionLocalsKt.f4137e;
            interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d13);
            str = (String) composerImplMo1636j.mo1648p(f4691a);
            C5304d1 c5304d14 = CompositionLocalsKt.f4143k;
            final LayoutDirection layoutDirection8 = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d14);
            composerImplMo1636j.mo1622c(-1165786124);
            c0466bM1590C = composerImplMo1636j.m1590C();
            composerImplMo1636j.mo1661w();
            interfaceC5312g0M16704V0 = C8573r0.m16704V0(interfaceC2056p, composerImplMo1636j);
            uuid = (UUID) C0487a.m1860a(new Object[0], null, new InterfaceC2041a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final UUID mo807E() {
                    return UUID.randomUUID();
                }
            }, composerImplMo1636j, 6);
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a0 = composerImplMo1636j.m1619a0();
            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                C5207g.m11110e(uuid, "popupId");
                final PopupLayout popupLayout13 = new PopupLayout(interfaceC2041a3, c10435i3, str, view, interfaceC10015c, interfaceC10434h, uuid);
                popupLayout13.m2621j(c0466bM1590C, C7204a.m14523c(1302892335, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$3, kotlin.jvm.internal.Lambda] */
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                            InterfaceC0500b interfaceC0500bM11163j0 = C5212l.m11163j0(InterfaceC0500b.a.f3325a, false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                                    InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                                    C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                                    InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                                    C0685a<C9072e> c0685a = SemanticsProperties.f4423p;
                                    C9072e c9072e = C9072e.f47360a;
                                    interfaceC6577o2.mo13162a(c0685a, c9072e);
                                    return c9072e;
                                }
                            });
                            final PopupLayout popupLayout14 = popupLayout13;
                            InterfaceC2052l<C10022j, C9072e> interfaceC2052l = new InterfaceC2052l<C10022j, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.2
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C10022j c10022j) {
                                    C10022j c10022j2 = new C10022j(c10022j.f50980a);
                                    PopupLayout popupLayout15 = popupLayout14;
                                    popupLayout15.m19590setPopupContentSizefhxjrPA(c10022j2);
                                    popupLayout15.m2625n();
                                    return C9072e.f47360a;
                                }
                            };
                            C5207g.m11111f(interfaceC0500bM11163j0, "<this>");
                            InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM11163j0.mo1929K(new C5659w(interfaceC2052l, InspectableValueKt.f4184a));
                            float f3 = popupLayout14.getCanCalculatePosition() ? 1.0f : 0.0f;
                            C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                            if (!(f3 == 1.0f)) {
                                interfaceC0500bMo1929K = C0512a.m2001b(interfaceC0500bMo1929K, f3, null, true, 126971);
                            }
                            final InterfaceC5301c1<? extends InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e>> interfaceC5301c1 = interfaceC5312g0M16704V0;
                            ComposableLambdaImpl composableLambdaImplM14522b = C7204a.m14522b(interfaceC0476a3, 606497925, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a4, Integer num2) {
                                    InterfaceC0476a interfaceC0476a5 = interfaceC0476a4;
                                    if ((num2.intValue() & 11) == 2 && interfaceC0476a5.mo1642m()) {
                                        interfaceC0476a5.mo1650q();
                                    } else {
                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                                        C5331q c5331q = AndroidPopup_androidKt.f4691a;
                                        interfaceC5301c1.getValue().mo1337m0(interfaceC0476a5, 0);
                                    }
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC0476a3.mo1622c(1406149896);
                            AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                                @Override // p127g1.InterfaceC5652p
                                /* JADX INFO: renamed from: a */
                                public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                                    int iMax;
                                    C5207g.m11111f(interfaceC0524e, "$this$Layout");
                                    int size = list.size();
                                    int i17 = 0;
                                    if (size == 0) {
                                        return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$1
                                            @Override // cm.InterfaceC2052l
                                            /* JADX INFO: renamed from: n */
                                            public final C9072e mo528n(AbstractC0526g.a aVar7) {
                                                C5207g.m11111f(aVar7, "$this$layout");
                                                return C9072e.f47360a;
                                            }
                                        });
                                    }
                                    if (size == 1) {
                                        final AbstractC0526g abstractC0526gMo2048w = list.get(0).mo2048w(j10);
                                        return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$2
                                            {
                                                super(1);
                                            }

                                            @Override // cm.InterfaceC2052l
                                            /* JADX INFO: renamed from: n */
                                            public final C9072e mo528n(AbstractC0526g.a aVar7) {
                                                AbstractC0526g.a aVar8 = aVar7;
                                                C5207g.m11111f(aVar8, "$this$layout");
                                                AbstractC0526g.a.m2059e(aVar8, abstractC0526gMo2048w, 0, 0);
                                                return C9072e.f47360a;
                                            }
                                        });
                                    }
                                    final ArrayList arrayList = new ArrayList(list.size());
                                    int size2 = list.size();
                                    for (int i18 = 0; i18 < size2; i18++) {
                                        arrayList.add(list.get(i18).mo2048w(j10));
                                    }
                                    int iM17249o = C9000b.m17249o(arrayList);
                                    if (iM17249o >= 0) {
                                        int iMax2 = 0;
                                        iMax = 0;
                                        while (true) {
                                            AbstractC0526g abstractC0526g = (AbstractC0526g) arrayList.get(i17);
                                            iMax2 = Math.max(iMax2, abstractC0526g.f3686a);
                                            iMax = Math.max(iMax, abstractC0526g.f3687b);
                                            if (i17 == iM17249o) {
                                                break;
                                            }
                                            i17++;
                                        }
                                        i17 = iMax2;
                                    } else {
                                        iMax = 0;
                                    }
                                    return interfaceC0524e.m2043P(i17, iMax, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final C9072e mo528n(AbstractC0526g.a aVar7) {
                                            AbstractC0526g.a aVar8 = aVar7;
                                            C5207g.m11111f(aVar8, "$this$layout");
                                            List<AbstractC0526g> list2 = arrayList;
                                            int iM17249o2 = C9000b.m17249o(list2);
                                            if (iM17249o2 >= 0) {
                                                int i19 = 0;
                                                while (true) {
                                                    AbstractC0526g.a.m2059e(aVar8, list2.get(i19), 0, 0);
                                                    if (i19 == iM17249o2) {
                                                        break;
                                                    }
                                                    i19++;
                                                }
                                            }
                                            return C9072e.f47360a;
                                        }
                                    });
                                }
                            };
                            interfaceC0476a3.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c3 = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                            LayoutDirection layoutDirection9 = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                            InterfaceC0647n1 interfaceC0647n2 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a17 = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a2 = C0520a.m2036a(interfaceC0500bMo1929K);
                            if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a3.mo1640l();
                            if (interfaceC0476a3.mo1632h()) {
                                interfaceC0476a3.mo1634i(interfaceC2041a17);
                            } else {
                                interfaceC0476a3.mo1653s();
                            }
                            C8573r0.m16714a1(interfaceC0476a3, androidPopup_androidKt$SimpleStack$1, ComposeUiNode.Companion.f3731e);
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c3, ComposeUiNode.Companion.f3730d);
                            C8573r0.m16714a1(interfaceC0476a3, layoutDirection9, ComposeUiNode.Companion.f3732f);
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n2, ComposeUiNode.Companion.f3733g);
                            composableLambdaImplM2036a2.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, 0);
                            interfaceC0476a3.mo1622c(2058660585);
                            composableLambdaImplM14522b.mo1337m0(interfaceC0476a3, 6);
                            interfaceC0476a3.mo1661w();
                            interfaceC0476a3.mo1663x();
                            interfaceC0476a3.mo1661w();
                            interfaceC0476a3.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                }, true));
                composerImplMo1636j.m1597F0(popupLayout13);
                objM1619a0 = popupLayout13;
            }
            composerImplMo1636j.m1609Q(false);
            final PopupLayout popupLayout14 = (PopupLayout) objM1619a0;
            final InterfaceC2041a<C9072e> interfaceC2041a17 = interfaceC2041a3;
            final C10435i c10435i11 = c10435i3;
            C5333r.m11459a(popupLayout14, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    PopupLayout popupLayout15 = popupLayout14;
                    popupLayout15.f4732I.addView(popupLayout15, popupLayout15.f4733J);
                    popupLayout15.m2622k(interfaceC2041a17, c10435i11, str, layoutDirection8);
                    return new C10427a(popupLayout15);
                }
            }, composerImplMo1636j);
            InterfaceC2041a<C9072e> interfaceC2041a18 = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    popupLayout14.m2622k(interfaceC2041a17, c10435i11, str, layoutDirection8);
                    return C9072e.f47360a;
                }
            };
            composerImplMo1636j.mo1622c(-1288466761);
            composerImplMo1636j.m1639k0(interfaceC2041a18);
            composerImplMo1636j.m1609Q(false);
            C5333r.m11459a(interfaceC10434h, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    PopupLayout popupLayout15 = popupLayout14;
                    popupLayout15.setPositionProvider(interfaceC10434h);
                    popupLayout15.m2625n();
                    return new C10428b();
                }
            }, composerImplMo1636j);
            C5333r.m11460b(popupLayout14, new AndroidPopup_androidKt$Popup$5(popupLayout14, null), composerImplMo1636j);
            InterfaceC0500b.a aVar7 = InterfaceC0500b.a.f3325a;
            C5656t c5656t7 = new C5656t(new InterfaceC2052l<InterfaceC5647k, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
                    InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
                    C5207g.m11111f(interfaceC5647k2, "childCoordinates");
                    NodeCoordinator nodeCoordinatorMo2156A = interfaceC5647k2.mo2156A();
                    C5207g.m11108c(nodeCoordinatorMo2156A);
                    popupLayout14.m2624m(nodeCoordinatorMo2156A);
                    return C9072e.f47360a;
                }
            }, InspectableValueKt.f4184a);
            aVar7.mo1929K(c5656t7);
            interfaceC5652p = new InterfaceC5652p() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
                @Override // p127g1.InterfaceC5652p
                /* JADX INFO: renamed from: a */
                public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
                    C5207g.m11111f(interfaceC0524e, "$this$Layout");
                    popupLayout14.setParentLayoutDirection(layoutDirection8);
                    return interfaceC0524e.m2043P(0, 0, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$measure$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(AbstractC0526g.a aVar8) {
                            C5207g.m11111f(aVar8, "$this$layout");
                            return C9072e.f47360a;
                        }
                    });
                }
            };
            composerImplMo1636j.mo1622c(-1323940314);
            interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d13);
            layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(c5304d14);
            interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a4 = ComposeUiNode.Companion.f3728b;
            composableLambdaImplM2036a = C0520a.m2036a(c5656t7);
            if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.mo1640l();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(interfaceC2041a4);
            } else {
                composerImplMo1636j.mo1653s();
            }
            C8573r0.m16714a1(composerImplMo1636j, interfaceC5652p, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
            composerImplMo1636j.mo1622c(2058660585);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            interfaceC2041a2 = interfaceC2041a3;
            c10435i4 = c10435i3;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                AndroidPopup_androidKt.m2619a(interfaceC10434h, interfaceC2041a2, c10435i4, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                return C9072e.f47360a;
            }
        };
    }
}
