package androidx.compose.animation;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.collections.AbstractC3194a;
import p000.InterfaceC3571se;
import p000.az2;
import p000.ba4;
import p000.ca9;
import p000.ct5;
import p000.dh9;
import p000.dk1;
import p000.f84;
import p000.fa4;
import p000.faa;
import p000.gaa;
import p000.gm5;
import p000.it5;
import p000.jm8;
import p000.jt5;
import p000.k9a;
import p000.l43;
import p000.l87;
import p000.n84;
import p000.nj0;
import p000.q98;
import p000.qs2;
import p000.qv2;
import p000.rs2;
import p000.ss2;
import p000.ts2;
import p000.u9a;
import p000.ui3;
import p000.us2;
import p000.v9a;
import p000.vi3;
import p000.vs2;
import p000.vt0;
import p000.xc9;
import p000.xfa;
import p000.z9a;

/* JADX INFO: renamed from: androidx.compose.animation.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0071j extends ba4 {

    /* JADX INFO: renamed from: K */
    public faa f1580K;

    /* JADX INFO: renamed from: L */
    public v9a f1581L;

    /* JADX INFO: renamed from: M */
    public v9a f1582M;

    /* JADX INFO: renamed from: N */
    public v9a f1583N;

    /* JADX INFO: renamed from: O */
    public vs2 f1584O;

    /* JADX INFO: renamed from: P */
    public qv2 f1585P;

    /* JADX INFO: renamed from: Q */
    public ui3 f1586Q;

    /* JADX INFO: renamed from: R */
    public qs2 f1587R;

    /* JADX INFO: renamed from: S */
    public long f1588S;

    /* JADX INFO: renamed from: T */
    public InterfaceC3571se f1589T;

    /* JADX INFO: renamed from: U */
    public final vi3 f1590U;

    /* JADX INFO: renamed from: V */
    public final vi3 f1591V;

    public C0071j(faa faaVar, v9a v9aVar, v9a v9aVar2, v9a v9aVar3, vs2 vs2Var, qv2 qv2Var, ui3 ui3Var, qs2 qs2Var) {
        super(1);
        this.f1580K = faaVar;
        this.f1581L = v9aVar;
        this.f1582M = v9aVar2;
        this.f1583N = v9aVar3;
        this.f1584O = vs2Var;
        this.f1585P = qv2Var;
        this.f1586Q = ui3Var;
        this.f1587R = qs2Var;
        this.f1588S = -9223372034707292160L;
        dk1.m10424b(0, 0, 0, 0, 15);
        this.f1590U = new vi3() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                z9a z9aVar = (z9a) obj;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                boolean zM25516b = z9aVar.m25516b(enterExitState, enterExitState2);
                Object obj2 = null;
                C0071j c0071j = this.f1476b;
                if (zM25516b) {
                    vt0 vt0Var = c0071j.f1584O.f65844a.f40477c;
                    if (vt0Var != null) {
                        obj2 = vt0Var.f65873c;
                    }
                } else if (z9aVar.m25516b(enterExitState2, EnterExitState.PostExit)) {
                    vt0 vt0Var2 = c0071j.f1585P.f58243a.f40477c;
                    if (vt0Var2 != null) {
                        obj2 = vt0Var2.f65873c;
                    }
                } else {
                    obj2 = AbstractC0070i.f1579d;
                }
                return obj2 == null ? AbstractC0070i.f1579d : obj2;
            }
        };
        this.f1591V = new vi3() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ca9 ca9Var;
                z9a z9aVar = (z9a) obj;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                boolean zM25516b = z9aVar.m25516b(enterExitState, enterExitState2);
                C0071j c0071j = this.f1477b;
                if (zM25516b) {
                    ca9 ca9Var2 = c0071j.f1584O.f65844a.f40476b;
                    return ca9Var2 != null ? ca9Var2.f9803b : AbstractC0070i.f1578c;
                }
                if (z9aVar.m25516b(enterExitState2, EnterExitState.PostExit) && (ca9Var = c0071j.f1585P.f58243a.f40476b) != null) {
                    return ca9Var.f9803b;
                }
                return AbstractC0070i.f1578c;
            }
        };
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        this.f1588S = -9223372034707292160L;
    }

    /* JADX INFO: renamed from: b1 */
    public final InterfaceC3571se m783b1() {
        InterfaceC3571se interfaceC3571se;
        InterfaceC3571se interfaceC3571se2;
        if (this.f1580K.m11672f().m25516b(EnterExitState.PreEnter, EnterExitState.Visible)) {
            vt0 vt0Var = this.f1584O.f65844a.f40477c;
            if (vt0Var != null && (interfaceC3571se2 = vt0Var.f65871a) != null) {
                return interfaceC3571se2;
            }
            vt0 vt0Var2 = this.f1585P.f58243a.f40477c;
            if (vt0Var2 != null) {
                return vt0Var2.f65871a;
            }
            return null;
        }
        vt0 vt0Var3 = this.f1585P.f58243a.f40477c;
        if (vt0Var3 != null && (interfaceC3571se = vt0Var3.f65871a) != null) {
            return interfaceC3571se;
        }
        vt0 vt0Var4 = this.f1584O.f65844a.f40477c;
        if (vt0Var4 != null) {
            return vt0Var4.f65871a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    @Override // p000.ba4, androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        final k9a k9aVar;
        final u9a u9aVarM23193a;
        final long j2;
        long j3;
        u9a u9aVarM23193a2 = null;
        if (this.f1580K.m11669c() == ((xc9) this.f1580K.f38738d).getValue()) {
            this.f1589T = null;
        } else if (this.f1589T == null) {
            InterfaceC3571se interfaceC3571seM783b1 = m783b1();
            if (interfaceC3571seM783b1 == null) {
                interfaceC3571seM783b1 = nj0.f52808c;
            }
            this.f1589T = interfaceC3571seM783b1;
        }
        if (jt5Var.mo211f0()) {
            final l87 l87VarMo1514r = ct5Var.mo1514r(j);
            long j4 = (((long) l87VarMo1514r.f49301a) << 32) | (((long) l87VarMo1514r.f49302b) & 4294967295L);
            this.f1588S = j4;
            return jt5Var.mo9895M0((int) (j4 >> 32), (int) (j4 & 4294967295L), AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    ((AbstractC0343j) obj).m1530f(l87VarMo1514r, 0, 0, 0.0f);
                    return xfa.f68157a;
                }
            });
        }
        if (!((Boolean) this.f1586Q.mo0a()).booleanValue()) {
            final l87 l87VarMo1514r2 = ct5Var.mo1514r(j);
            return jt5Var.mo9895M0(l87VarMo1514r2.f49301a, l87VarMo1514r2.f49302b, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    ((AbstractC0343j) obj).m1530f(l87VarMo1514r2, 0, 0, 0.0f);
                    return xfa.f68157a;
                }
            });
        }
        qs2 qs2Var = this.f1587R;
        v9a v9aVar = qs2Var.f58124a;
        v9a v9aVar2 = qs2Var.f58125b;
        faa faaVar = qs2Var.f58126c;
        final vs2 vs2Var = qs2Var.f58127d;
        gaa gaaVar = vs2Var.f65844a;
        final qv2 qv2Var = qs2Var.f58128e;
        v9a v9aVar3 = qs2Var.f58129f;
        final u9a u9aVarM23193a3 = v9aVar != null ? v9aVar.m23193a(new vi3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                l43 l43Var;
                l43 l43Var2;
                z9a z9aVar = (z9a) obj;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (z9aVar.m25516b(enterExitState, enterExitState2)) {
                    az2 az2Var = vs2Var.f65844a.f40475a;
                    return (az2Var == null || (l43Var2 = az2Var.f7686b) == null) ? AbstractC0070i.f1577b : l43Var2;
                }
                if (!z9aVar.m25516b(enterExitState2, EnterExitState.PostExit)) {
                    return AbstractC0070i.f1577b;
                }
                az2 az2Var2 = qv2Var.f58243a.f40475a;
                return (az2Var2 == null || (l43Var = az2Var2.f7686b) == null) ? AbstractC0070i.f1577b : l43Var;
            }
        }, new vi3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                int i = rs2.f59752a[((EnterExitState) obj).ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        az2 az2Var = vs2Var.f65844a.f40475a;
                        if (az2Var != null) {
                            f = az2Var.f7685a;
                        }
                    } else {
                        if (i != 3) {
                            gm5.m12750e();
                            return null;
                        }
                        az2 az2Var2 = qv2Var.f58243a.f40475a;
                        if (az2Var2 != null) {
                            f = az2Var2.f7685a;
                        }
                    }
                }
                return Float.valueOf(f);
            }
        }) : null;
        final u9a u9aVarM23193a4 = v9aVar2 != null ? v9aVar2.m23193a(new vi3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                l43 l43Var;
                l43 l43Var2;
                z9a z9aVar = (z9a) obj;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (z9aVar.m25516b(enterExitState, enterExitState2)) {
                    jm8 jm8Var = vs2Var.f65844a.f40478d;
                    return (jm8Var == null || (l43Var2 = jm8Var.f45837c) == null) ? AbstractC0070i.f1577b : l43Var2;
                }
                if (!z9aVar.m25516b(enterExitState2, EnterExitState.PostExit)) {
                    return AbstractC0070i.f1577b;
                }
                jm8 jm8Var2 = qv2Var.f58243a.f40478d;
                return (jm8Var2 == null || (l43Var = jm8Var2.f45837c) == null) ? AbstractC0070i.f1577b : l43Var;
            }
        }, new vi3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                int i = ss2.f61330a[((EnterExitState) obj).ordinal()];
                float f = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        jm8 jm8Var = vs2Var.f65844a.f40478d;
                        if (jm8Var != null) {
                            f = jm8Var.f45835a;
                        }
                    } else {
                        if (i != 3) {
                            gm5.m12750e();
                            return null;
                        }
                        jm8 jm8Var2 = qv2Var.f58243a.f40478d;
                        if (jm8Var2 != null) {
                            f = jm8Var2.f45835a;
                        }
                    }
                }
                return Float.valueOf(f);
            }
        }) : null;
        if (faaVar.m11669c() == EnterExitState.PreEnter) {
            jm8 jm8Var = gaaVar.f40478d;
            if (jm8Var != null) {
                k9aVar = new k9a(jm8Var.f45836b);
            } else {
                jm8 jm8Var2 = qv2Var.f58243a.f40478d;
                if (jm8Var2 != null) {
                    k9aVar = new k9a(jm8Var2.f45836b);
                } else {
                    k9aVar = null;
                }
            }
        } else {
            jm8 jm8Var3 = qv2Var.f58243a.f40478d;
            if (jm8Var3 != null) {
                k9aVar = new k9a(jm8Var3.f45836b);
            } else {
                jm8 jm8Var4 = gaaVar.f40478d;
                if (jm8Var4 != null) {
                    k9aVar = new k9a(jm8Var4.f45836b);
                } else {
                    k9aVar = null;
                }
            }
        }
        if (v9aVar3 != null) {
            u9aVarM23193a = v9aVar3.m23193a(C0052x3f929be8.f1446b, new vi3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    k9a k9aVar2;
                    gaa gaaVar2 = vs2Var.f65844a;
                    int i = ts2.f62796a[((EnterExitState) obj).ordinal()];
                    if (i != 1) {
                        k9aVar2 = null;
                        qv2 qv2Var2 = qv2Var;
                        if (i == 2) {
                            jm8 jm8Var5 = gaaVar2.f40478d;
                            if (jm8Var5 != null) {
                                k9aVar2 = new k9a(jm8Var5.f45836b);
                            } else {
                                jm8 jm8Var6 = qv2Var2.f58243a.f40478d;
                                if (jm8Var6 != null) {
                                    k9aVar2 = new k9a(jm8Var6.f45836b);
                                }
                            }
                        } else {
                            if (i != 3) {
                                gm5.m12750e();
                                return null;
                            }
                            jm8 jm8Var7 = qv2Var2.f58243a.f40478d;
                            if (jm8Var7 != null) {
                                k9aVar2 = new k9a(jm8Var7.f45836b);
                            } else {
                                jm8 jm8Var8 = gaaVar2.f40478d;
                                if (jm8Var8 != null) {
                                    k9aVar2 = new k9a(jm8Var8.f45836b);
                                }
                            }
                        }
                    } else {
                        k9aVar2 = k9aVar;
                    }
                    return new k9a(k9aVar2 != null ? k9aVar2.f46917a : k9a.f46915b);
                }
            });
        } else {
            u9aVarM23193a = null;
        }
        final vi3 vi3Var = new vi3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                q98 q98Var = (q98) obj;
                dh9 dh9Var = u9aVarM23193a3;
                q98Var.m19813c(dh9Var != null ? ((Number) dh9Var.getValue()).floatValue() : 1.0f);
                dh9 dh9Var2 = u9aVarM23193a4;
                q98Var.m19823p(dh9Var2 != null ? ((Number) dh9Var2.getValue()).floatValue() : 1.0f);
                q98Var.m19824q(dh9Var2 != null ? ((Number) dh9Var2.getValue()).floatValue() : 1.0f);
                dh9 dh9Var3 = u9aVarM23193a;
                q98Var.m19828x(dh9Var3 != null ? ((k9a) dh9Var3.getValue()).f46917a : k9a.f46915b);
                return xfa.f68157a;
            }
        };
        final l87 l87VarMo1514r3 = ct5Var.mo1514r(j);
        long j5 = (((long) l87VarMo1514r3.f49301a) << 32) | (((long) l87VarMo1514r3.f49302b) & 4294967295L);
        final long j6 = !n84.m17279a(this.f1588S, -9223372034707292160L) ? this.f1588S : j5;
        v9a v9aVar4 = this.f1581L;
        if (v9aVar4 != null) {
            u9aVarM23193a2 = v9aVar4.m23193a(this.f1590U, new vi3() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    vi3 vi3Var2;
                    vi3 vi3Var3;
                    int i = us2.f64282a[((EnterExitState) obj).ordinal()];
                    long j7 = j6;
                    if (i != 1) {
                        C0071j c0071j = this.f1469b;
                        if (i == 2) {
                            vt0 vt0Var = c0071j.f1584O.f65844a.f40477c;
                            if (vt0Var != null && (vi3Var2 = vt0Var.f65872b) != null) {
                                j7 = ((n84) vi3Var2.invoke(new n84(j7))).f52482a;
                            }
                        } else {
                            if (i != 3) {
                                gm5.m12750e();
                                return null;
                            }
                            vt0 vt0Var2 = c0071j.f1585P.f58243a.f40477c;
                            if (vt0Var2 != null && (vi3Var3 = vt0Var2.f65872b) != null) {
                                j7 = ((n84) vi3Var3.invoke(new n84(j7))).f52482a;
                            }
                        }
                    }
                    return new n84(j7);
                }
            });
        }
        if (u9aVarM23193a2 != null) {
            j5 = ((n84) u9aVarM23193a2.getValue()).f52482a;
        }
        long jM10426d = dk1.m10426d(j, j5);
        v9a v9aVar5 = this.f1582M;
        long jMo10276a = 0;
        if (v9aVar5 != null) {
            j2 = ((f84) v9aVar5.m23193a(EnterExitTransitionModifierNode$measure$offsetDelta$1.f1471b, new vi3() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0067  */
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    long jM11594c;
                    int i;
                    EnterExitState enterExitState = (EnterExitState) obj;
                    C0071j c0071j = this.f1472b;
                    if (c0071j.f1589T == null || c0071j.m783b1() == null || fa4.m11650l(c0071j.f1589T, c0071j.m783b1()) || (i = us2.f64282a[enterExitState.ordinal()]) == 1 || i == 2) {
                        jM11594c = 0;
                    } else {
                        if (i != 3) {
                            gm5.m12750e();
                            return null;
                        }
                        vt0 vt0Var = c0071j.f1585P.f58243a.f40477c;
                        if (vt0Var != null) {
                            vi3 vi3Var2 = vt0Var.f65872b;
                            long j7 = j6;
                            long j8 = ((n84) vi3Var2.invoke(new n84(j7))).f52482a;
                            InterfaceC3571se interfaceC3571seM783b2 = c0071j.m783b1();
                            interfaceC3571seM783b2.getClass();
                            LayoutDirection layoutDirection = LayoutDirection.Ltr;
                            long jMo10276a2 = interfaceC3571seM783b2.mo10276a(j7, j8, layoutDirection);
                            InterfaceC3571se interfaceC3571se = c0071j.f1589T;
                            interfaceC3571se.getClass();
                            jM11594c = f84.m11594c(jMo10276a2, interfaceC3571se.mo10276a(j7, j8, layoutDirection));
                        } else {
                            jM11594c = 0;
                        }
                    }
                    return new f84(jM11594c);
                }
            }).getValue()).f38612a;
        } else {
            j2 = 0;
        }
        v9a v9aVar6 = this.f1583N;
        if (v9aVar6 != null) {
            j3 = ((f84) v9aVar6.m23193a(this.f1591V, new vi3() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    EnterExitState enterExitState = (EnterExitState) obj;
                    C0071j c0071j = this.f1474b;
                    ca9 ca9Var = c0071j.f1584O.f65844a.f40476b;
                    long j7 = j6;
                    long j8 = 0;
                    long j9 = ca9Var != null ? ((f84) ca9Var.f9802a.invoke(new n84(j7))).f38612a : 0L;
                    ca9 ca9Var2 = c0071j.f1585P.f58243a.f40476b;
                    long j10 = ca9Var2 != null ? ((f84) ca9Var2.f9802a.invoke(new n84(j7))).f38612a : 0L;
                    int i = us2.f64282a[enterExitState.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            j8 = j9;
                        } else {
                            if (i != 3) {
                                gm5.m12750e();
                                return null;
                            }
                            j8 = j10;
                        }
                    }
                    return new f84(j8);
                }
            }).getValue()).f38612a;
        } else {
            j3 = 0;
        }
        InterfaceC3571se interfaceC3571se = this.f1589T;
        if (interfaceC3571se != null) {
            jMo10276a = interfaceC3571se.mo10276a(j6, jM10426d, LayoutDirection.Ltr);
        }
        final long jM11595d = f84.m11595d(jMo10276a, j3);
        return jt5Var.mo9895M0((int) (jM10426d >> 32), (int) (jM10426d & 4294967295L), AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                long j7 = jM11595d;
                long j8 = j2;
                abstractC0343j.getClass();
                l87 l87Var = l87VarMo1514r3;
                AbstractC0343j.m1518b(abstractC0343j, l87Var);
                l87Var.mo1544i0(f84.m11595d((((long) (((int) (j7 >> 32)) + ((int) (j8 >> 32)))) << 32) | (((long) (((int) (j7 & 4294967295L)) + ((int) (j8 & 4294967295L)))) & 4294967295L), l87Var.f49305e), 0.0f, vi3Var);
                return xfa.f68157a;
            }
        });
    }
}
