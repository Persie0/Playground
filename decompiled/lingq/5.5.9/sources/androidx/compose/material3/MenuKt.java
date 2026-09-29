package androidx.compose.material3;

import androidx.compose.animation.core.C0372d;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.C0393e;
import androidx.compose.foundation.layout.C0438a;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.graphics.C0512a;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
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
import dm.C5207g;
import dm.C5212l;
import p036c0.C1648d;
import p059d0.C5007h;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5652p;
import p230l0.C7204a;
import p338qd.C8573r0;
import p374s.C8908g0;
import p374s.C8934v;
import p387t0.C9162o0;
import p387t0.InterfaceC9154k0;
import p387t0.InterfaceC9172x;
import p443w.C9772c;
import p443w.C9775f;
import p443w.InterfaceC9771b;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class MenuKt {

    /* JADX INFO: renamed from: a */
    public static final float f2763a = 48;

    /* JADX INFO: renamed from: b */
    public static final float f2764b = 8;

    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x019f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.material3.MenuKt$DropdownMenuContent$2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public static final void m1567a(final C8934v<Boolean> c8934v, final InterfaceC5312g0<C9162o0> interfaceC5312g0, InterfaceC0500b interfaceC0500b, final InterfaceC2057q<? super InterfaceC9771b, ? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2057q, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        final int i12;
        InterfaceC0500b interfaceC0500b2;
        int i13;
        InterfaceC0500b.a aVar;
        final InterfaceC0500b interfaceC0500b3;
        boolean zBooleanValue;
        float f3;
        boolean zBooleanValue2;
        float f10;
        final Transition.C0368d c0368dM1391c;
        boolean zBooleanValue3;
        float f11;
        final Transition.C0368d c0368dM1391c2;
        boolean zMo1665y;
        Object objM1619a0;
        final InterfaceC0500b interfaceC0500b4;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(c8934v, "expandedStates");
        C5207g.m11111f(interfaceC5312g0, "transformOriginState");
        C5207g.m11111f(interfaceC2057q, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-159754260);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.mo1665y(c8934v) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerImplMo1636j.mo1665y(interfaceC5312g0) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 896) == 0) {
                interfaceC0500b2 = interfaceC0500b;
                i12 |= composerImplMo1636j.mo1665y(interfaceC0500b2) ? 256 : BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5851) == 1170 || !composerImplMo1636j.mo1642m()) {
                aVar = InterfaceC0500b.a.f3325a;
                if (i14 != 0) {
                    interfaceC0500b3 = aVar;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                Transition transitionM1393e = C0372d.m1393e(c8934v, composerImplMo1636j);
                MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = MenuKt$DropdownMenuContent$scale$2.f2778b;
                composerImplMo1636j.mo1622c(1399891485);
                C8908g0 c8908g0 = VectorConvertersKt.f1626a;
                composerImplMo1636j.mo1622c(1847725064);
                zBooleanValue = ((Boolean) transitionM1393e.m1362b()).booleanValue();
                composerImplMo1636j.mo1622c(1808111696);
                if (zBooleanValue) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.8f;
                }
                composerImplMo1636j.m1609Q(false);
                Float fValueOf = Float.valueOf(f3);
                zBooleanValue2 = ((Boolean) transitionM1393e.m1364d()).booleanValue();
                composerImplMo1636j.mo1622c(1808111696);
                if (zBooleanValue2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                composerImplMo1636j.m1609Q(false);
                c0368dM1391c = C0372d.m1391c(transitionM1393e, fValueOf, Float.valueOf(f10), menuKt$DropdownMenuContent$scale$2.mo1343M(transitionM1393e.m1363c(), composerImplMo1636j, 0), c8908g0, "FloatAnimation", composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = MenuKt$DropdownMenuContent$alpha$2.f2777b;
                composerImplMo1636j.mo1622c(1399891485);
                composerImplMo1636j.mo1622c(1847725064);
                zBooleanValue3 = ((Boolean) transitionM1393e.m1362b()).booleanValue();
                composerImplMo1636j.mo1622c(1864763068);
                if (zBooleanValue3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                composerImplMo1636j.m1609Q(false);
                Float fValueOf2 = Float.valueOf(f11);
                boolean zBooleanValue4 = ((Boolean) transitionM1393e.m1364d()).booleanValue();
                composerImplMo1636j.mo1622c(1864763068);
                float f12 = zBooleanValue4 ? 1.0f : 0.0f;
                composerImplMo1636j.m1609Q(false);
                c0368dM1391c2 = C0372d.m1391c(transitionM1393e, fValueOf2, Float.valueOf(f12), menuKt$DropdownMenuContent$alpha$2.mo1343M(transitionM1393e.m1363c(), composerImplMo1636j, 0), c8908g0, "FloatAnimation", composerImplMo1636j);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(1618982084);
                zMo1665y = composerImplMo1636j.mo1665y(c0368dM1391c) | composerImplMo1636j.mo1665y(c0368dM1391c2) | composerImplMo1636j.mo1665y(interfaceC5312g0);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (zMo1665y || objM1619a0 == InterfaceC0476a.a.f3122a) {
                    objM1619a0 = new InterfaceC2052l<InterfaceC9172x, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(InterfaceC9172x interfaceC9172x) {
                            InterfaceC9172x interfaceC9172x2 = interfaceC9172x;
                            C5207g.m11111f(interfaceC9172x2, "$this$graphicsLayer");
                            InterfaceC5301c1<Float> interfaceC5301c1 = c0368dM1391c;
                            interfaceC9172x2.mo17465x(interfaceC5301c1.getValue().floatValue());
                            interfaceC9172x2.mo17459p(interfaceC5301c1.getValue().floatValue());
                            interfaceC9172x2.mo17463v(c0368dM1391c2.getValue().floatValue());
                            interfaceC9172x2.mo17462u0(interfaceC5312g0.getValue().f47691a);
                            return C9072e.f47360a;
                        }
                    };
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                InterfaceC0500b interfaceC0500bM2000a = C0512a.m2000a(aVar, (InterfaceC2052l) objM1619a0);
                InterfaceC9154k0 interfaceC9154k0M1568a = ShapesKt.m1568a(C5007h.f32676c, composerImplMo1636j);
                long jM1560b = ColorSchemeKt.m1560b((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a), C5007h.f32674a);
                float f13 = C5007h.f32675b;
                ComposableLambdaImpl composableLambdaImplM14522b = C7204a.m14522b(composerImplMo1636j, -1651673913, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                            InterfaceC0500b interfaceC0500bM1432b = C0393e.m1432b(C9775f.m18273b(C5212l.m11157d0(interfaceC0500b3, 0.0f, MenuKt.f2764b, 1), IntrinsicSize.Max), C0393e.m1431a(interfaceC0476a3));
                            int i15 = i12 & 7168;
                            interfaceC0476a3.mo1622c(-483455358);
                            C0438a.f fVar = C0438a.f2429a;
                            InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a3);
                            interfaceC0476a3.mo1622c(-1323940314);
                            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                            LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                            ComposeUiNode.f3726n.getClass();
                            InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
                            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1432b);
                            int i16 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
                            if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            interfaceC0476a3.mo1640l();
                            if (interfaceC0476a3.mo1632h()) {
                                interfaceC0476a3.mo1634i(interfaceC2041a);
                            } else {
                                interfaceC0476a3.mo1653s();
                            }
                            interfaceC0476a3.mo1644n();
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC5652pM1500a, ComposeUiNode.Companion.f3731e);
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                            C8573r0.m16714a1(interfaceC0476a3, layoutDirection, ComposeUiNode.Companion.f3732f);
                            C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                            interfaceC0476a3.mo1626e();
                            composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, Integer.valueOf((i16 >> 3) & 112));
                            interfaceC0476a3.mo1622c(2058660585);
                            interfaceC0476a3.mo1622c(-1163856341);
                            if (((i16 >> 9) & 14 & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                interfaceC2057q.mo1343M(C9772c.f49852a, interfaceC0476a3, Integer.valueOf(((i15 >> 6) & 112) | 6));
                            }
                            interfaceC0476a3.mo1661w();
                            interfaceC0476a3.mo1661w();
                            interfaceC0476a3.mo1663x();
                            interfaceC0476a3.mo1661w();
                            interfaceC0476a3.mo1661w();
                        }
                        return C9072e.f47360a;
                    }
                });
                interfaceC0500b4 = interfaceC0500b3;
                SurfaceKt.m1570a(interfaceC0500bM2000a, interfaceC9154k0M1568a, jM1560b, 0L, f13, f13, null, composableLambdaImplM14522b, composerImplMo1636j, 12804096, 72);
            } else {
                composerImplMo1636j.mo1650q();
                interfaceC0500b4 = interfaceC0500b2;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    MenuKt.m1567a(c8934v, interfaceC5312g0, interfaceC0500b4, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 384;
        interfaceC0500b2 = interfaceC0500b;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerImplMo1636j.mo1665y(interfaceC2057q)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170) {
            aVar = InterfaceC0500b.a.f3325a;
            if (i14 != 0) {
                interfaceC0500b3 = aVar;
            } else {
                interfaceC0500b3 = interfaceC0500b2;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
            Transition transitionM1393e2 = C0372d.m1393e(c8934v, composerImplMo1636j);
            MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$3 = MenuKt$DropdownMenuContent$scale$2.f2778b;
            composerImplMo1636j.mo1622c(1399891485);
            C8908g0 c8908g1 = VectorConvertersKt.f1626a;
            composerImplMo1636j.mo1622c(1847725064);
            zBooleanValue = ((Boolean) transitionM1393e2.m1362b()).booleanValue();
            composerImplMo1636j.mo1622c(1808111696);
            if (zBooleanValue) {
                f3 = 1.0f;
            } else {
                f3 = 0.8f;
            }
            composerImplMo1636j.m1609Q(false);
            Float fValueOf3 = Float.valueOf(f3);
            zBooleanValue2 = ((Boolean) transitionM1393e2.m1364d()).booleanValue();
            composerImplMo1636j.mo1622c(1808111696);
            if (zBooleanValue2) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            composerImplMo1636j.m1609Q(false);
            c0368dM1391c = C0372d.m1391c(transitionM1393e2, fValueOf3, Float.valueOf(f10), menuKt$DropdownMenuContent$scale$3.mo1343M(transitionM1393e2.m1363c(), composerImplMo1636j, 0), c8908g1, "FloatAnimation", composerImplMo1636j);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$3 = MenuKt$DropdownMenuContent$alpha$2.f2777b;
            composerImplMo1636j.mo1622c(1399891485);
            composerImplMo1636j.mo1622c(1847725064);
            zBooleanValue3 = ((Boolean) transitionM1393e2.m1362b()).booleanValue();
            composerImplMo1636j.mo1622c(1864763068);
            if (zBooleanValue3) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            composerImplMo1636j.m1609Q(false);
            Float fValueOf4 = Float.valueOf(f11);
            boolean zBooleanValue5 = ((Boolean) transitionM1393e2.m1364d()).booleanValue();
            composerImplMo1636j.mo1622c(1864763068);
            if (zBooleanValue5) {
            }
            composerImplMo1636j.m1609Q(false);
            c0368dM1391c2 = C0372d.m1391c(transitionM1393e2, fValueOf4, Float.valueOf(f12), menuKt$DropdownMenuContent$alpha$3.mo1343M(transitionM1393e2.m1363c(), composerImplMo1636j, 0), c8908g1, "FloatAnimation", composerImplMo1636j);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.mo1622c(1618982084);
            zMo1665y = composerImplMo1636j.mo1665y(c0368dM1391c) | composerImplMo1636j.mo1665y(c0368dM1391c2) | composerImplMo1636j.mo1665y(interfaceC5312g0);
            objM1619a0 = composerImplMo1636j.m1619a0();
            if (zMo1665y) {
                objM1619a0 = new InterfaceC2052l<InterfaceC9172x, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9172x interfaceC9172x) {
                        InterfaceC9172x interfaceC9172x2 = interfaceC9172x;
                        C5207g.m11111f(interfaceC9172x2, "$this$graphicsLayer");
                        InterfaceC5301c1<Float> interfaceC5301c1 = c0368dM1391c;
                        interfaceC9172x2.mo17465x(interfaceC5301c1.getValue().floatValue());
                        interfaceC9172x2.mo17459p(interfaceC5301c1.getValue().floatValue());
                        interfaceC9172x2.mo17463v(c0368dM1391c2.getValue().floatValue());
                        interfaceC9172x2.mo17462u0(interfaceC5312g0.getValue().f47691a);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a0);
            } else {
                objM1619a0 = new InterfaceC2052l<InterfaceC9172x, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9172x interfaceC9172x) {
                        InterfaceC9172x interfaceC9172x2 = interfaceC9172x;
                        C5207g.m11111f(interfaceC9172x2, "$this$graphicsLayer");
                        InterfaceC5301c1<Float> interfaceC5301c1 = c0368dM1391c;
                        interfaceC9172x2.mo17465x(interfaceC5301c1.getValue().floatValue());
                        interfaceC9172x2.mo17459p(interfaceC5301c1.getValue().floatValue());
                        interfaceC9172x2.mo17463v(c0368dM1391c2.getValue().floatValue());
                        interfaceC9172x2.mo17462u0(interfaceC5312g0.getValue().f47691a);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            InterfaceC0500b interfaceC0500bM2000a2 = C0512a.m2000a(aVar, (InterfaceC2052l) objM1619a0);
            InterfaceC9154k0 interfaceC9154k0M1568a2 = ShapesKt.m1568a(C5007h.f32676c, composerImplMo1636j);
            long jM1560b2 = ColorSchemeKt.m1560b((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a), C5007h.f32674a);
            float f14 = C5007h.f32675b;
            ComposableLambdaImpl composableLambdaImplM14522b2 = C7204a.m14522b(composerImplMo1636j, -1651673913, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                        interfaceC0476a3.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                        InterfaceC0500b interfaceC0500bM1432b = C0393e.m1432b(C9775f.m18273b(C5212l.m11157d0(interfaceC0500b3, 0.0f, MenuKt.f2764b, 1), IntrinsicSize.Max), C0393e.m1431a(interfaceC0476a3));
                        int i15 = i12 & 7168;
                        interfaceC0476a3.mo1622c(-483455358);
                        C0438a.f fVar = C0438a.f2429a;
                        InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a3);
                        interfaceC0476a3.mo1622c(-1323940314);
                        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                        LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1432b);
                        int i16 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
                        if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        interfaceC0476a3.mo1640l();
                        if (interfaceC0476a3.mo1632h()) {
                            interfaceC0476a3.mo1634i(interfaceC2041a);
                        } else {
                            interfaceC0476a3.mo1653s();
                        }
                        interfaceC0476a3.mo1644n();
                        C8573r0.m16714a1(interfaceC0476a3, interfaceC5652pM1500a, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(interfaceC0476a3, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        interfaceC0476a3.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, Integer.valueOf((i16 >> 3) & 112));
                        interfaceC0476a3.mo1622c(2058660585);
                        interfaceC0476a3.mo1622c(-1163856341);
                        if (((i16 >> 9) & 14 & 11) == 2 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            interfaceC2057q.mo1343M(C9772c.f49852a, interfaceC0476a3, Integer.valueOf(((i15 >> 6) & 112) | 6));
                        }
                        interfaceC0476a3.mo1661w();
                        interfaceC0476a3.mo1661w();
                        interfaceC0476a3.mo1663x();
                        interfaceC0476a3.mo1661w();
                        interfaceC0476a3.mo1661w();
                    }
                    return C9072e.f47360a;
                }
            });
            interfaceC0500b4 = interfaceC0500b3;
            SurfaceKt.m1570a(interfaceC0500bM2000a2, interfaceC9154k0M1568a2, jM1560b2, 0L, f14, f14, null, composableLambdaImplM14522b2, composerImplMo1636j, 12804096, 72);
        } else {
            aVar = InterfaceC0500b.a.f3325a;
            if (i14 != 0) {
                interfaceC0500b3 = aVar;
            } else {
                interfaceC0500b3 = interfaceC0500b2;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
            Transition transitionM1393e3 = C0372d.m1393e(c8934v, composerImplMo1636j);
            MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$4 = MenuKt$DropdownMenuContent$scale$2.f2778b;
            composerImplMo1636j.mo1622c(1399891485);
            C8908g0 c8908g2 = VectorConvertersKt.f1626a;
            composerImplMo1636j.mo1622c(1847725064);
            zBooleanValue = ((Boolean) transitionM1393e3.m1362b()).booleanValue();
            composerImplMo1636j.mo1622c(1808111696);
            if (zBooleanValue) {
                f3 = 1.0f;
            } else {
                f3 = 0.8f;
            }
            composerImplMo1636j.m1609Q(false);
            Float fValueOf5 = Float.valueOf(f3);
            zBooleanValue2 = ((Boolean) transitionM1393e3.m1364d()).booleanValue();
            composerImplMo1636j.mo1622c(1808111696);
            if (zBooleanValue2) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            composerImplMo1636j.m1609Q(false);
            c0368dM1391c = C0372d.m1391c(transitionM1393e3, fValueOf5, Float.valueOf(f10), menuKt$DropdownMenuContent$scale$4.mo1343M(transitionM1393e3.m1363c(), composerImplMo1636j, 0), c8908g2, "FloatAnimation", composerImplMo1636j);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$4 = MenuKt$DropdownMenuContent$alpha$2.f2777b;
            composerImplMo1636j.mo1622c(1399891485);
            composerImplMo1636j.mo1622c(1847725064);
            zBooleanValue3 = ((Boolean) transitionM1393e3.m1362b()).booleanValue();
            composerImplMo1636j.mo1622c(1864763068);
            if (zBooleanValue3) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            composerImplMo1636j.m1609Q(false);
            Float fValueOf6 = Float.valueOf(f11);
            boolean zBooleanValue6 = ((Boolean) transitionM1393e3.m1364d()).booleanValue();
            composerImplMo1636j.mo1622c(1864763068);
            if (zBooleanValue6) {
            }
            composerImplMo1636j.m1609Q(false);
            c0368dM1391c2 = C0372d.m1391c(transitionM1393e3, fValueOf6, Float.valueOf(f12), menuKt$DropdownMenuContent$alpha$4.mo1343M(transitionM1393e3.m1363c(), composerImplMo1636j, 0), c8908g2, "FloatAnimation", composerImplMo1636j);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.mo1622c(1618982084);
            zMo1665y = composerImplMo1636j.mo1665y(c0368dM1391c) | composerImplMo1636j.mo1665y(c0368dM1391c2) | composerImplMo1636j.mo1665y(interfaceC5312g0);
            objM1619a0 = composerImplMo1636j.m1619a0();
            if (zMo1665y) {
                objM1619a0 = new InterfaceC2052l<InterfaceC9172x, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9172x interfaceC9172x) {
                        InterfaceC9172x interfaceC9172x2 = interfaceC9172x;
                        C5207g.m11111f(interfaceC9172x2, "$this$graphicsLayer");
                        InterfaceC5301c1<Float> interfaceC5301c1 = c0368dM1391c;
                        interfaceC9172x2.mo17465x(interfaceC5301c1.getValue().floatValue());
                        interfaceC9172x2.mo17459p(interfaceC5301c1.getValue().floatValue());
                        interfaceC9172x2.mo17463v(c0368dM1391c2.getValue().floatValue());
                        interfaceC9172x2.mo17462u0(interfaceC5312g0.getValue().f47691a);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a0);
            } else {
                objM1619a0 = new InterfaceC2052l<InterfaceC9172x, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC9172x interfaceC9172x) {
                        InterfaceC9172x interfaceC9172x2 = interfaceC9172x;
                        C5207g.m11111f(interfaceC9172x2, "$this$graphicsLayer");
                        InterfaceC5301c1<Float> interfaceC5301c1 = c0368dM1391c;
                        interfaceC9172x2.mo17465x(interfaceC5301c1.getValue().floatValue());
                        interfaceC9172x2.mo17459p(interfaceC5301c1.getValue().floatValue());
                        interfaceC9172x2.mo17463v(c0368dM1391c2.getValue().floatValue());
                        interfaceC9172x2.mo17462u0(interfaceC5312g0.getValue().f47691a);
                        return C9072e.f47360a;
                    }
                };
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            InterfaceC0500b interfaceC0500bM2000a3 = C0512a.m2000a(aVar, (InterfaceC2052l) objM1619a0);
            InterfaceC9154k0 interfaceC9154k0M1568a3 = ShapesKt.m1568a(C5007h.f32676c, composerImplMo1636j);
            long jM1560b3 = ColorSchemeKt.m1560b((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a), C5007h.f32674a);
            float f15 = C5007h.f32675b;
            ComposableLambdaImpl composableLambdaImplM14522b3 = C7204a.m14522b(composerImplMo1636j, -1651673913, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                        interfaceC0476a3.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                        InterfaceC0500b interfaceC0500bM1432b = C0393e.m1432b(C9775f.m18273b(C5212l.m11157d0(interfaceC0500b3, 0.0f, MenuKt.f2764b, 1), IntrinsicSize.Max), C0393e.m1431a(interfaceC0476a3));
                        int i15 = i12 & 7168;
                        interfaceC0476a3.mo1622c(-483455358);
                        C0438a.f fVar = C0438a.f2429a;
                        InterfaceC5652p interfaceC5652pM1500a = ColumnKt.m1500a(interfaceC0476a3);
                        interfaceC0476a3.mo1622c(-1323940314);
                        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4137e);
                        LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4143k);
                        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a3.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500bM1432b);
                        int i16 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
                        if (!(interfaceC0476a3.mo1646o() instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        interfaceC0476a3.mo1640l();
                        if (interfaceC0476a3.mo1632h()) {
                            interfaceC0476a3.mo1634i(interfaceC2041a);
                        } else {
                            interfaceC0476a3.mo1653s();
                        }
                        interfaceC0476a3.mo1644n();
                        C8573r0.m16714a1(interfaceC0476a3, interfaceC5652pM1500a, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(interfaceC0476a3, interfaceC10015c, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(interfaceC0476a3, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(interfaceC0476a3, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        interfaceC0476a3.mo1626e();
                        composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a3), interfaceC0476a3, Integer.valueOf((i16 >> 3) & 112));
                        interfaceC0476a3.mo1622c(2058660585);
                        interfaceC0476a3.mo1622c(-1163856341);
                        if (((i16 >> 9) & 14 & 11) == 2 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            interfaceC2057q.mo1343M(C9772c.f49852a, interfaceC0476a3, Integer.valueOf(((i15 >> 6) & 112) | 6));
                        }
                        interfaceC0476a3.mo1661w();
                        interfaceC0476a3.mo1661w();
                        interfaceC0476a3.mo1663x();
                        interfaceC0476a3.mo1661w();
                        interfaceC0476a3.mo1661w();
                    }
                    return C9072e.f47360a;
                }
            });
            interfaceC0500b4 = interfaceC0500b3;
            SurfaceKt.m1570a(interfaceC0500bM2000a3, interfaceC9154k0M1568a3, jM1560b3, 0L, f15, f15, null, composableLambdaImplM14522b3, composerImplMo1636j, 12804096, 72);
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                MenuKt.m1567a(c8934v, interfaceC5312g0, interfaceC0500b4, interfaceC2057q, interfaceC0476a2, i10 | 1, i11);
                return C9072e.f47360a;
            }
        };
    }
}
