package androidx.compose.animation;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import p000.AbstractC3393o1;
import p000.AbstractC3550rv;
import p000.C3080hm;
import p000.C3116im;
import p000.C3152jm;
import p000.C3189km;
import p000.C3541rm;
import p000.InterfaceC3571se;
import p000.aj3;
import p000.au3;
import p000.b16;
import p000.baa;
import p000.bk1;
import p000.ci8;
import p000.ct5;
import p000.d32;
import p000.dh9;
import p000.e16;
import p000.fa4;
import p000.faa;
import p000.ht5;
import p000.jc9;
import p000.jda;
import p000.jt5;
import p000.jwa;
import p000.kaa;
import p000.l43;
import p000.l77;
import p000.l87;
import p000.lda;
import p000.m01;
import p000.n66;
import p000.n84;
import p000.nj0;
import p000.oha;
import p000.om8;
import p000.p84;
import p000.pb1;
import p000.pk9;
import p000.q98;
import p000.qh0;
import p000.qv2;
import p000.se1;
import p000.ss5;
import p000.t66;
import p000.te1;
import p000.tj3;
import p000.u91;
import p000.ui3;
import p000.ui5;
import p000.v9a;
import p000.vi3;
import p000.vs2;
import p000.w66;
import p000.we1;
import p000.wq1;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.ye1;
import p000.z9a;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.animation.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0054a {
    /* JADX INFO: renamed from: a */
    public static final void m726a(final faa faaVar, final e16 e16Var, vi3 vi3Var, final InterfaceC3571se interfaceC3571se, final vi3 vi3Var2, final C0282a c0282a, ye1 ye1Var, final int i) {
        int i2;
        vi3 vi3Var3;
        tj3 tj3Var;
        SnapshotStateList snapshotStateList;
        C3189km c3189km;
        v9a v9aVarM15040b;
        tj3 tj3Var2;
        boolean z;
        final faa faaVar2 = faaVar;
        final vi3 vi3Var4 = vi3Var;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(511725103);
        if ((i & 6) == 0) {
            i2 = (tj3Var3.m22120g(faaVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var3.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var3.m22124i(vi3Var4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var3.m22120g(interfaceC3571se) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var3.m22124i(vi3Var2) ? 16384 : 8192;
        }
        final C0282a c0282a2 = c0282a;
        if ((196608 & i) == 0) {
            i2 |= tj3Var3.m22124i(c0282a2) ? 131072 : 65536;
        }
        if (tj3Var3.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objM22097O = tj3Var3.m22097O();
            p84 p84Var = we1.f66679a;
            if (z2 || objM22097O == p84Var) {
                objM22097O = new C3189km(faaVar2, interfaceC3571se);
                tj3Var3.m22131l0(objM22097O);
            }
            final C3189km c3189km2 = (C3189km) objM22097O;
            boolean z3 = i3 == 4;
            Object objM22097O2 = tj3Var3.m22097O();
            Object obj = objM22097O2;
            if (z3 || objM22097O2 == p84Var) {
                Object[] objArr = {faaVar2.m11669c()};
                SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                snapshotStateList2.addAll(AbstractC3550rv.m20852t0(objArr));
                tj3Var3.m22131l0(snapshotStateList2);
                obj = snapshotStateList2;
            }
            final SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj;
            boolean z4 = i3 == 4;
            Object objM22097O3 = tj3Var3.m22097O();
            if (z4 || objM22097O3 == p84Var) {
                long[] jArr = om8.f54590a;
                objM22097O3 = new n66();
                tj3Var3.m22131l0(objM22097O3);
            }
            n66 n66Var = (n66) objM22097O3;
            Object objM11669c = faaVar2.m11669c();
            t66 t66Var = faaVar2.f38738d;
            if (!snapshotStateList3.contains(objM11669c)) {
                snapshotStateList3.clear();
                snapshotStateList3.add(faaVar2.m11669c());
            }
            xc9 xc9Var = (xc9) t66Var;
            if (fa4.m11650l(faaVar2.m11669c(), xc9Var.getValue())) {
                if (snapshotStateList3.size() != 1 || !fa4.m11650l(snapshotStateList3.get(0), faaVar2.m11669c())) {
                    snapshotStateList3.clear();
                    snapshotStateList3.add(faaVar2.m11669c());
                }
                if (n66Var.f52403e != 1 || n66Var.m17251c(faaVar2.m11669c())) {
                    n66Var.m17249a();
                }
                c3189km2.f47505b = interfaceC3571se;
            }
            if (!fa4.m11650l(faaVar2.m11669c(), xc9Var.getValue()) && !snapshotStateList3.contains(xc9Var.getValue())) {
                ListIterator listIterator = snapshotStateList3.listIterator();
                int i4 = 0;
                while (true) {
                    au3 au3Var = (au3) listIterator;
                    if (!au3Var.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    Object objInvoke = vi3Var2.invoke(au3Var.next());
                    ListIterator listIterator2 = listIterator;
                    if (fa4.m11650l(objInvoke, vi3Var2.invoke(xc9Var.getValue()))) {
                        break;
                    }
                    i4++;
                    listIterator = listIterator2;
                }
                if (i4 == -1) {
                    snapshotStateList3.add(xc9Var.getValue());
                } else {
                    snapshotStateList3.set(i4, xc9Var.getValue());
                }
            }
            if (n66Var.m17251c(xc9Var.getValue()) && n66Var.m17251c(faaVar2.m11669c())) {
                tj3Var3.m22111b0(1968995539);
                tj3Var3.m22139q(false);
                vi3Var3 = vi3Var4;
            } else {
                tj3Var3.m22111b0(1966410449);
                n66Var.m17249a();
                int size = snapshotStateList3.size();
                int i5 = 0;
                while (i5 < size) {
                    final Object obj2 = snapshotStateList3.get(i5);
                    n66Var.m17261m(obj2, ci8.m4703P(-23915175, new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj3, Object obj4) {
                            ye1 ye1Var2 = (ye1) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            tj3 tj3Var4 = (tj3) ye1Var2;
                            if (tj3Var4.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Object objM22097O4 = tj3Var4.m22097O();
                                vi3 vi3Var5 = vi3Var4;
                                final C3189km c3189km3 = c3189km2;
                                p84 p84Var2 = we1.f66679a;
                                if (objM22097O4 == p84Var2) {
                                    objM22097O4 = (C0068g) vi3Var5.invoke(c3189km3);
                                    tj3Var4.m22131l0(objM22097O4);
                                }
                                final C0068g c0068g = (C0068g) objM22097O4;
                                faa faaVar3 = faaVar2;
                                z9a z9aVarM11672f = faaVar3.m11672f();
                                t66 t66Var2 = faaVar3.f38738d;
                                Object objMo218c = z9aVarM11672f.mo218c();
                                final Object obj5 = obj2;
                                boolean zM22122h = tj3Var4.m22122h(fa4.m11650l(objMo218c, obj5));
                                Object objM22097O5 = tj3Var4.m22097O();
                                if (zM22122h || objM22097O5 == p84Var2) {
                                    objM22097O5 = fa4.m11650l(faaVar3.m11672f().mo218c(), obj5) ? qv2.f58241b : ((C0068g) vi3Var5.invoke(c3189km3)).f1565b;
                                    tj3Var4.m22131l0(objM22097O5);
                                }
                                final qv2 qv2Var = (qv2) objM22097O5;
                                Object objM22097O6 = tj3Var4.m22097O();
                                if (objM22097O6 == p84Var2) {
                                    objM22097O6 = new C3152jm(fa4.m11650l(obj5, ((xc9) t66Var2).getValue()));
                                    tj3Var4.m22131l0(objM22097O6);
                                }
                                C3152jm c3152jm = (C3152jm) objM22097O6;
                                vs2 vs2Var = c0068g.f1564a;
                                boolean zM22124i = tj3Var4.m22124i(c0068g);
                                Object objM22097O7 = tj3Var4.m22097O();
                                if (zM22124i || objM22097O7 == p84Var2) {
                                    objM22097O7 = new aj3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        @Override // p000.aj3
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            final l87 l87VarMo1514r = ((ct5) obj7).mo1514r(((bk1) obj8).f8631a);
                                            int i6 = l87VarMo1514r.f49301a;
                                            int i7 = l87VarMo1514r.f49302b;
                                            final C0068g c0068g2 = c0068g;
                                            return ((jt5) obj6).mo9895M0(i6, i7, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // p000.vi3
                                                public final Object invoke(Object obj9) {
                                                    ((AbstractC0343j) obj9).m1530f(l87VarMo1514r, 0, 0, c0068g2.f1566c.m19861h());
                                                    return xfa.f68157a;
                                                }
                                            });
                                        }
                                    };
                                    tj3Var4.m22131l0(objM22097O7);
                                }
                                e16 e16VarM21968A = te1.m21968A(b16.f7762a, (aj3) objM22097O7);
                                ((xc9) c3152jm.f45814a).setValue(Boolean.valueOf(fa4.m11650l(obj5, ((xc9) t66Var2).getValue())));
                                e16 e16VarMo3161g = e16VarM21968A.mo3161g(c3152jm);
                                boolean zM22124i2 = tj3Var4.m22124i(obj5);
                                Object objM22097O8 = tj3Var4.m22097O();
                                if (zM22124i2 || objM22097O8 == p84Var2) {
                                    objM22097O8 = new vi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // p000.vi3
                                        public final Object invoke(Object obj6) {
                                            return Boolean.valueOf(fa4.m11650l(obj6, obj5));
                                        }
                                    };
                                    tj3Var4.m22131l0(objM22097O8);
                                }
                                vi3 vi3Var6 = (vi3) objM22097O8;
                                boolean zM22120g = tj3Var4.m22120g(qv2Var);
                                Object objM22097O9 = tj3Var4.m22097O();
                                if (zM22120g || objM22097O9 == p84Var2) {
                                    objM22097O9 = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        @Override // p000.zi3
                                        public final Object invoke(Object obj6, Object obj7) {
                                            EnterExitState enterExitState = (EnterExitState) obj6;
                                            EnterExitState enterExitState2 = (EnterExitState) obj7;
                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !qv2Var.f58243a.f40479e);
                                        }
                                    };
                                    tj3Var4.m22131l0(objM22097O9);
                                }
                                final SnapshotStateList snapshotStateList4 = snapshotStateList3;
                                final C0282a c0282a3 = c0282a2;
                                AbstractC0054a.m728c(faaVar3, vi3Var6, e16VarMo3161g, vs2Var, qv2Var, (zi3) objM22097O9, ci8.m4703P(-143346359, new aj3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

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
                                    @Override // p000.aj3
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                        InterfaceC0067f interfaceC0067f = (InterfaceC0067f) obj6;
                                        ye1 ye1Var3 = (ye1) obj7;
                                        int iIntValue2 = ((Number) obj8).intValue();
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= (iIntValue2 & 8) == 0 ? ((tj3) ye1Var3).m22120g(interfaceC0067f) : ((tj3) ye1Var3).m22124i(interfaceC0067f) ? 4 : 2;
                                        }
                                        tj3 tj3Var5 = (tj3) ye1Var3;
                                        if (tj3Var5.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                            final SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                            boolean zM22120g2 = tj3Var5.m22120g(snapshotStateList5);
                                            final Object obj9 = obj5;
                                            boolean zM22124i3 = zM22120g2 | tj3Var5.m22124i(obj9);
                                            final C3189km c3189km4 = c3189km3;
                                            boolean zM22124i4 = zM22124i3 | tj3Var5.m22124i(c3189km4);
                                            Object objM22097O10 = tj3Var5.m22097O();
                                            p84 p84Var3 = we1.f66679a;
                                            if (zM22124i4 || objM22097O10 == p84Var3) {
                                                objM22097O10 = new vi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // p000.vi3
                                                    public final Object invoke(Object obj10) {
                                                        return new C3080hm(snapshotStateList5, obj9, c3189km4, 0);
                                                    }
                                                };
                                                tj3Var5.m22131l0(objM22097O10);
                                            }
                                            d32.m10041h(interfaceC0067f, (vi3) objM22097O10, tj3Var5);
                                            n66 n66Var2 = c3189km4.f47507d;
                                            interfaceC0067f.getClass();
                                            n66Var2.m17261m(obj9, ((C3541rm) interfaceC0067f).f59521b);
                                            Object objM22097O11 = tj3Var5.m22097O();
                                            if (objM22097O11 == p84Var3) {
                                                objM22097O11 = new C3116im(interfaceC0067f);
                                                tj3Var5.m22131l0(objM22097O11);
                                            }
                                            c0282a3.mo825e((C3116im) objM22097O11, obj9, tj3Var5, 0);
                                        } else {
                                            tj3Var5.m22102U();
                                        }
                                        return xfa.f68157a;
                                    }
                                }, tj3Var4), tj3Var4, 12582912);
                            } else {
                                tj3Var4.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var3));
                    i5++;
                    faaVar2 = faaVar;
                    vi3Var4 = vi3Var4;
                    c0282a2 = c0282a;
                }
                vi3Var3 = vi3Var4;
                tj3Var3.m22139q(false);
            }
            boolean zM22120g = tj3Var3.m22120g(faaVar.m11672f()) | tj3Var3.m22120g(c3189km2);
            Object objM22097O4 = tj3Var3.m22097O();
            if (zM22120g || objM22097O4 == p84Var) {
                objM22097O4 = (C0068g) vi3Var3.invoke(c3189km2);
                tj3Var3.m22131l0(objM22097O4);
            }
            C0068g c0068g = (C0068g) objM22097O4;
            faa faaVar3 = c3189km2.f47504a;
            boolean zM22120g2 = tj3Var3.m22120g(c3189km2);
            Object objM22097O5 = tj3Var3.m22097O();
            if (zM22120g2 || objM22097O5 == p84Var) {
                objM22097O5 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var3.m22131l0(objM22097O5);
            }
            t66 t66Var2 = (t66) objM22097O5;
            t66 t66VarM1263m = AbstractC0278f.m1263m(c0068g.f1567d, tj3Var3);
            if (fa4.m11650l(faaVar3.m11669c(), ((xc9) faaVar3.f38738d).getValue())) {
                t66Var2.setValue(Boolean.FALSE);
            } else if (t66VarM1263m.getValue() != null) {
                t66Var2.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) t66Var2.getValue()).booleanValue();
            e16 e16Var2 = b16.f7762a;
            if (zBooleanValue) {
                tj3Var3.m22111b0(1353077497);
                snapshotStateList = snapshotStateList3;
                tj3 tj3Var4 = tj3Var3;
                c3189km = c3189km2;
                v9aVarM15040b = kaa.m15040b(c3189km2.f47504a, pk9.f56370o, null, tj3Var4, 0, 2);
                boolean zM22120g3 = tj3Var4.m22120g(v9aVarM15040b);
                Object objM22097O6 = tj3Var4.m22097O();
                if (zM22120g3 || objM22097O6 == p84Var) {
                    objM22097O6 = pb1.m19046p(e16Var2);
                    tj3Var4.m22131l0(objM22097O6);
                }
                e16Var2 = (e16) objM22097O6;
                tj3Var4.m22139q(false);
                tj3Var2 = tj3Var4;
            } else {
                snapshotStateList = snapshotStateList3;
                tj3 tj3Var5 = tj3Var3;
                c3189km = c3189km2;
                tj3Var5.m22111b0(1353343539);
                tj3Var5.m22139q(false);
                v9aVarM15040b = null;
                tj3Var2 = tj3Var5;
            }
            e16 e16VarMo3161g = e16Var.mo3161g(e16Var2.mo3161g(new C0056c(v9aVarM15040b, t66VarM1263m, c3189km)));
            Object objM22097O7 = tj3Var2.m22097O();
            if (objM22097O7 == p84Var) {
                objM22097O7 = new C0055b(c3189km);
                tj3Var2.m22131l0(objM22097O7);
            }
            C0055b c0055b = (C0055b) objM22097O7;
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, c0055b);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m17999e(tj3Var2, Integer.valueOf(iHashCode), C0352b.f4304g);
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            tj3Var2.m22111b0(-860173498);
            int size2 = snapshotStateList.size();
            int i6 = 0;
            while (i6 < size2) {
                SnapshotStateList snapshotStateList4 = snapshotStateList;
                Object obj3 = snapshotStateList4.get(i6);
                tj3Var2.m22106Y(-2026002954, vi3Var2.invoke(obj3));
                zi3 zi3Var = (zi3) n66Var.m17255g(obj3);
                if (zi3Var == null) {
                    tj3Var2.m22111b0(1618454323);
                    z = false;
                } else {
                    z = false;
                    tj3Var2.m22111b0(-2026001778);
                    zi3Var.invoke(tj3Var2, 0);
                }
                tj3Var2.m22139q(z);
                tj3Var2.m22139q(z);
                i6++;
                snapshotStateList = snapshotStateList4;
            }
            tj3Var2.m22139q(false);
            tj3Var2.m22139q(true);
            tj3Var = tj3Var2;
        } else {
            vi3Var3 = vi3Var4;
            tj3 tj3Var6 = tj3Var3;
            tj3Var6.m22102U();
            tj3Var = tj3Var6;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final vi3 vi3Var5 = vi3Var3;
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj4, Object obj5) {
                    ((Number) obj5).intValue();
                    AbstractC0054a.m726a(faaVar, e16Var, vi3Var5, interfaceC3571se, vi3Var2, c0282a, (ye1) obj4, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m727b(final Object obj, e16 e16Var, vi3 vi3Var, InterfaceC3571se interfaceC3571se, final String str, vi3 vi3Var2, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        e16 e16Var2;
        int i3;
        vi3 vi3Var3;
        int i4;
        int i5;
        InterfaceC3571se interfaceC3571se2;
        int i6;
        int i7;
        boolean z;
        final vi3 vi3Var4;
        final e16 e16Var3;
        final vi3 vi3Var5;
        final InterfaceC3571se interfaceC3571se3;
        x18 x18VarM22143u;
        e16 e16Var4;
        p84 p84Var;
        InterfaceC3571se interfaceC3571se4;
        Object objM22097O;
        Object objM22097O2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1501828832);
        int i8 = (tj3Var.m22120g(obj) ? 4 : 2) | i;
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                e16Var2 = e16Var;
                i8 |= tj3Var.m22120g(e16Var2) ? 32 : 16;
            }
            i3 = i2 & 4;
            if (i3 != 0) {
                if ((i & 384) == 0) {
                    vi3Var3 = vi3Var;
                    if (tj3Var.m22124i(vi3Var3)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i8 |= i4;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    if ((i & 3072) == 0) {
                        interfaceC3571se2 = interfaceC3571se;
                        if (tj3Var.m22120g(interfaceC3571se2)) {
                            i6 = 2048;
                        } else {
                            i6 = 1024;
                        }
                        i8 |= i6;
                    }
                    i7 = i8 | 196608;
                    if ((599187 & i7) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (tj3Var.m22099R(i7 & 1, z)) {
                        if (i9 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        p84Var = we1.f66679a;
                        if (i3 != 0) {
                            objM22097O2 = tj3Var.m22097O();
                            if (objM22097O2 == p84Var) {
                                objM22097O2 = AnimatedContentKt$AnimatedContent$1$1.f1307b;
                                tj3Var.m22131l0(objM22097O2);
                            }
                            vi3Var5 = (vi3) objM22097O2;
                        } else {
                            vi3Var5 = vi3Var3;
                        }
                        if (i5 != 0) {
                            interfaceC3571se4 = nj0.f52808c;
                        } else {
                            interfaceC3571se4 = interfaceC3571se2;
                        }
                        objM22097O = tj3Var.m22097O();
                        if (objM22097O == p84Var) {
                            objM22097O = AnimatedContentKt$AnimatedContent$2$1.f1308b;
                            tj3Var.m22131l0(objM22097O);
                        }
                        vi3 vi3Var6 = (vi3) objM22097O;
                        m726a(kaa.m15046h(obj, str, tj3Var, (i7 & 14) | 48, 0), e16Var4, vi3Var5, interfaceC3571se4, vi3Var6, c0282a, tj3Var, (i7 & 8176) | 221184);
                        e16Var3 = e16Var4;
                        interfaceC3571se3 = interfaceC3571se4;
                        vi3Var4 = vi3Var6;
                    } else {
                        tj3Var.m22102U();
                        vi3Var4 = vi3Var2;
                        e16Var3 = e16Var2;
                        vi3Var5 = vi3Var3;
                        interfaceC3571se3 = interfaceC3571se2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p000.zi3
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Number) obj3).intValue();
                                AbstractC0054a.m727b(obj, e16Var3, vi3Var5, interfaceC3571se3, str, vi3Var4, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i8 |= 3072;
                interfaceC3571se2 = interfaceC3571se;
                i7 = i8 | 196608;
                if ((599187 & i7) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i7 & 1, z)) {
                    if (i9 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    p84Var = we1.f66679a;
                    if (i3 != 0) {
                        objM22097O2 = tj3Var.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = AnimatedContentKt$AnimatedContent$1$1.f1307b;
                            tj3Var.m22131l0(objM22097O2);
                        }
                        vi3Var5 = (vi3) objM22097O2;
                    } else {
                        vi3Var5 = vi3Var3;
                    }
                    if (i5 != 0) {
                        interfaceC3571se4 = nj0.f52808c;
                    } else {
                        interfaceC3571se4 = interfaceC3571se2;
                    }
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = AnimatedContentKt$AnimatedContent$2$1.f1308b;
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3 vi3Var7 = (vi3) objM22097O;
                    m726a(kaa.m15046h(obj, str, tj3Var, (i7 & 14) | 48, 0), e16Var4, vi3Var5, interfaceC3571se4, vi3Var7, c0282a, tj3Var, (i7 & 8176) | 221184);
                    e16Var3 = e16Var4;
                    interfaceC3571se3 = interfaceC3571se4;
                    vi3Var4 = vi3Var7;
                } else {
                    tj3Var.m22102U();
                    vi3Var4 = vi3Var2;
                    e16Var3 = e16Var2;
                    vi3Var5 = vi3Var3;
                    interfaceC3571se3 = interfaceC3571se2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Number) obj3).intValue();
                            AbstractC0054a.m727b(obj, e16Var3, vi3Var5, interfaceC3571se3, str, vi3Var4, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i8 |= 384;
            vi3Var3 = vi3Var;
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    interfaceC3571se2 = interfaceC3571se;
                    if (tj3Var.m22120g(interfaceC3571se2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i8 |= i6;
                }
                i7 = i8 | 196608;
                if ((599187 & i7) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i7 & 1, z)) {
                    if (i9 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    p84Var = we1.f66679a;
                    if (i3 != 0) {
                        objM22097O2 = tj3Var.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = AnimatedContentKt$AnimatedContent$1$1.f1307b;
                            tj3Var.m22131l0(objM22097O2);
                        }
                        vi3Var5 = (vi3) objM22097O2;
                    } else {
                        vi3Var5 = vi3Var3;
                    }
                    if (i5 != 0) {
                        interfaceC3571se4 = nj0.f52808c;
                    } else {
                        interfaceC3571se4 = interfaceC3571se2;
                    }
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = AnimatedContentKt$AnimatedContent$2$1.f1308b;
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3 vi3Var8 = (vi3) objM22097O;
                    m726a(kaa.m15046h(obj, str, tj3Var, (i7 & 14) | 48, 0), e16Var4, vi3Var5, interfaceC3571se4, vi3Var8, c0282a, tj3Var, (i7 & 8176) | 221184);
                    e16Var3 = e16Var4;
                    interfaceC3571se3 = interfaceC3571se4;
                    vi3Var4 = vi3Var8;
                } else {
                    tj3Var.m22102U();
                    vi3Var4 = vi3Var2;
                    e16Var3 = e16Var2;
                    vi3Var5 = vi3Var3;
                    interfaceC3571se3 = interfaceC3571se2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Number) obj3).intValue();
                            AbstractC0054a.m727b(obj, e16Var3, vi3Var5, interfaceC3571se3, str, vi3Var4, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i8 |= 3072;
            interfaceC3571se2 = interfaceC3571se;
            i7 = i8 | 196608;
            if ((599187 & i7) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i7 & 1, z)) {
                if (i9 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                p84Var = we1.f66679a;
                if (i3 != 0) {
                    objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AnimatedContentKt$AnimatedContent$1$1.f1307b;
                        tj3Var.m22131l0(objM22097O2);
                    }
                    vi3Var5 = (vi3) objM22097O2;
                } else {
                    vi3Var5 = vi3Var3;
                }
                if (i5 != 0) {
                    interfaceC3571se4 = nj0.f52808c;
                } else {
                    interfaceC3571se4 = interfaceC3571se2;
                }
                objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AnimatedContentKt$AnimatedContent$2$1.f1308b;
                    tj3Var.m22131l0(objM22097O);
                }
                vi3 vi3Var9 = (vi3) objM22097O;
                m726a(kaa.m15046h(obj, str, tj3Var, (i7 & 14) | 48, 0), e16Var4, vi3Var5, interfaceC3571se4, vi3Var9, c0282a, tj3Var, (i7 & 8176) | 221184);
                e16Var3 = e16Var4;
                interfaceC3571se3 = interfaceC3571se4;
                vi3Var4 = vi3Var9;
            } else {
                tj3Var.m22102U();
                vi3Var4 = vi3Var2;
                e16Var3 = e16Var2;
                vi3Var5 = vi3Var3;
                interfaceC3571se3 = interfaceC3571se2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Number) obj3).intValue();
                        AbstractC0054a.m727b(obj, e16Var3, vi3Var5, interfaceC3571se3, str, vi3Var4, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i8 |= 48;
        e16Var2 = e16Var;
        i3 = i2 & 4;
        if (i3 != 0) {
            if ((i & 384) == 0) {
                vi3Var3 = vi3Var;
                if (tj3Var.m22124i(vi3Var3)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i8 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    interfaceC3571se2 = interfaceC3571se;
                    if (tj3Var.m22120g(interfaceC3571se2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i8 |= i6;
                }
                i7 = i8 | 196608;
                if ((599187 & i7) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i7 & 1, z)) {
                    if (i9 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    p84Var = we1.f66679a;
                    if (i3 != 0) {
                        objM22097O2 = tj3Var.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = AnimatedContentKt$AnimatedContent$1$1.f1307b;
                            tj3Var.m22131l0(objM22097O2);
                        }
                        vi3Var5 = (vi3) objM22097O2;
                    } else {
                        vi3Var5 = vi3Var3;
                    }
                    if (i5 != 0) {
                        interfaceC3571se4 = nj0.f52808c;
                    } else {
                        interfaceC3571se4 = interfaceC3571se2;
                    }
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = AnimatedContentKt$AnimatedContent$2$1.f1308b;
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3 vi3Var10 = (vi3) objM22097O;
                    m726a(kaa.m15046h(obj, str, tj3Var, (i7 & 14) | 48, 0), e16Var4, vi3Var5, interfaceC3571se4, vi3Var10, c0282a, tj3Var, (i7 & 8176) | 221184);
                    e16Var3 = e16Var4;
                    interfaceC3571se3 = interfaceC3571se4;
                    vi3Var4 = vi3Var10;
                } else {
                    tj3Var.m22102U();
                    vi3Var4 = vi3Var2;
                    e16Var3 = e16Var2;
                    vi3Var5 = vi3Var3;
                    interfaceC3571se3 = interfaceC3571se2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Number) obj3).intValue();
                            AbstractC0054a.m727b(obj, e16Var3, vi3Var5, interfaceC3571se3, str, vi3Var4, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i8 |= 3072;
            interfaceC3571se2 = interfaceC3571se;
            i7 = i8 | 196608;
            if ((599187 & i7) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i7 & 1, z)) {
                if (i9 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                p84Var = we1.f66679a;
                if (i3 != 0) {
                    objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AnimatedContentKt$AnimatedContent$1$1.f1307b;
                        tj3Var.m22131l0(objM22097O2);
                    }
                    vi3Var5 = (vi3) objM22097O2;
                } else {
                    vi3Var5 = vi3Var3;
                }
                if (i5 != 0) {
                    interfaceC3571se4 = nj0.f52808c;
                } else {
                    interfaceC3571se4 = interfaceC3571se2;
                }
                objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AnimatedContentKt$AnimatedContent$2$1.f1308b;
                    tj3Var.m22131l0(objM22097O);
                }
                vi3 vi3Var11 = (vi3) objM22097O;
                m726a(kaa.m15046h(obj, str, tj3Var, (i7 & 14) | 48, 0), e16Var4, vi3Var5, interfaceC3571se4, vi3Var11, c0282a, tj3Var, (i7 & 8176) | 221184);
                e16Var3 = e16Var4;
                interfaceC3571se3 = interfaceC3571se4;
                vi3Var4 = vi3Var11;
            } else {
                tj3Var.m22102U();
                vi3Var4 = vi3Var2;
                e16Var3 = e16Var2;
                vi3Var5 = vi3Var3;
                interfaceC3571se3 = interfaceC3571se2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Number) obj3).intValue();
                        AbstractC0054a.m727b(obj, e16Var3, vi3Var5, interfaceC3571se3, str, vi3Var4, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i8 |= 384;
        vi3Var3 = vi3Var;
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                interfaceC3571se2 = interfaceC3571se;
                if (tj3Var.m22120g(interfaceC3571se2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i8 |= i6;
            }
            i7 = i8 | 196608;
            if ((599187 & i7) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i7 & 1, z)) {
                if (i9 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                p84Var = we1.f66679a;
                if (i3 != 0) {
                    objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AnimatedContentKt$AnimatedContent$1$1.f1307b;
                        tj3Var.m22131l0(objM22097O2);
                    }
                    vi3Var5 = (vi3) objM22097O2;
                } else {
                    vi3Var5 = vi3Var3;
                }
                if (i5 != 0) {
                    interfaceC3571se4 = nj0.f52808c;
                } else {
                    interfaceC3571se4 = interfaceC3571se2;
                }
                objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = AnimatedContentKt$AnimatedContent$2$1.f1308b;
                    tj3Var.m22131l0(objM22097O);
                }
                vi3 vi3Var12 = (vi3) objM22097O;
                m726a(kaa.m15046h(obj, str, tj3Var, (i7 & 14) | 48, 0), e16Var4, vi3Var5, interfaceC3571se4, vi3Var12, c0282a, tj3Var, (i7 & 8176) | 221184);
                e16Var3 = e16Var4;
                interfaceC3571se3 = interfaceC3571se4;
                vi3Var4 = vi3Var12;
            } else {
                tj3Var.m22102U();
                vi3Var4 = vi3Var2;
                e16Var3 = e16Var2;
                vi3Var5 = vi3Var3;
                interfaceC3571se3 = interfaceC3571se2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Number) obj3).intValue();
                        AbstractC0054a.m727b(obj, e16Var3, vi3Var5, interfaceC3571se3, str, vi3Var4, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i8 |= 3072;
        interfaceC3571se2 = interfaceC3571se;
        i7 = i8 | 196608;
        if ((599187 & i7) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i7 & 1, z)) {
            if (i9 != 0) {
                e16Var4 = b16.f7762a;
            } else {
                e16Var4 = e16Var2;
            }
            p84Var = we1.f66679a;
            if (i3 != 0) {
                objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AnimatedContentKt$AnimatedContent$1$1.f1307b;
                    tj3Var.m22131l0(objM22097O2);
                }
                vi3Var5 = (vi3) objM22097O2;
            } else {
                vi3Var5 = vi3Var3;
            }
            if (i5 != 0) {
                interfaceC3571se4 = nj0.f52808c;
            } else {
                interfaceC3571se4 = interfaceC3571se2;
            }
            objM22097O = tj3Var.m22097O();
            if (objM22097O == p84Var) {
                objM22097O = AnimatedContentKt$AnimatedContent$2$1.f1308b;
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var13 = (vi3) objM22097O;
            m726a(kaa.m15046h(obj, str, tj3Var, (i7 & 14) | 48, 0), e16Var4, vi3Var5, interfaceC3571se4, vi3Var13, c0282a, tj3Var, (i7 & 8176) | 221184);
            e16Var3 = e16Var4;
            interfaceC3571se3 = interfaceC3571se4;
            vi3Var4 = vi3Var13;
        } else {
            tj3Var.m22102U();
            vi3Var4 = vi3Var2;
            e16Var3 = e16Var2;
            vi3Var5 = vi3Var3;
            interfaceC3571se3 = interfaceC3571se2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    AbstractC0054a.m727b(obj, e16Var3, vi3Var5, interfaceC3571se3, str, vi3Var4, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m728c(final faa faaVar, final vi3 vi3Var, final e16 e16Var, final vs2 vs2Var, final qv2 qv2Var, final zi3 zi3Var, C0282a c0282a, ye1 ye1Var, final int i) {
        int i2;
        C0282a c0282a2;
        boolean z;
        t66 t66Var = faaVar.f38738d;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1912839215);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(faaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(vs2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22120g(qv2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(zi3Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= tj3Var.m22124i(c0282a) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (!tj3Var.m22099R(i4 & 1, (i4 & 4793491) != 4793490)) {
            c0282a2 = c0282a;
            tj3Var.m22102U();
        } else if (((Boolean) vi3Var.invoke(((xc9) t66Var).getValue())).booleanValue() || ((Boolean) vi3Var.invoke(faaVar.m11669c())).booleanValue() || faaVar.m11673g() || faaVar.m11670d()) {
            tj3Var.m22111b0(-232386135);
            int i5 = i4 & 14;
            int i6 = i5 | 48;
            int i7 = i6 & 14;
            boolean z2 = ((i7 ^ 6) > 4 && tj3Var.m22120g(faaVar)) || (i6 & 6) == 4;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z2 || objM22097O == p84Var) {
                objM22097O = faaVar.m11669c();
                tj3Var.m22131l0(objM22097O);
            }
            if (faaVar.m11673g()) {
                objM22097O = faaVar.m11669c();
            }
            tj3Var.m22111b0(1844425648);
            EnterExitState enterExitStateM736k = m736k(faaVar, vi3Var, objM22097O, tj3Var);
            tj3Var.m22139q(false);
            Object value = ((xc9) t66Var).getValue();
            tj3Var.m22111b0(1844425648);
            EnterExitState enterExitStateM736k2 = m736k(faaVar, vi3Var, value, tj3Var);
            tj3Var.m22139q(false);
            int i8 = i7 | 3072;
            int i9 = (i8 & 14) ^ 6;
            boolean z3 = (i9 > 4 && tj3Var.m22120g(faaVar)) || (i8 & 6) == 4;
            Object objM22097O2 = tj3Var.m22097O();
            if (z3 || objM22097O2 == p84Var) {
                objM22097O2 = new faa(new w66(enterExitStateM736k), faaVar, AbstractC3393o1.m17738m(new StringBuilder(), faaVar.f38737c, " > EnterExitTransition"));
                tj3Var.m22131l0(objM22097O2);
            }
            faa faaVar2 = (faa) objM22097O2;
            boolean zM22120g = ((i9 > 4 && tj3Var.m22120g(faaVar)) || (i8 & 6) == 4) | tj3Var.m22120g(faaVar2);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                objM22097O3 = new ui5(20, faaVar, faaVar2);
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10041h(faaVar2, (vi3) objM22097O3, tj3Var);
            if (faaVar.m11673g()) {
                faaVar2.m11676j(enterExitStateM736k, enterExitStateM736k2);
            } else {
                faaVar2.m11677k(enterExitStateM736k2);
                ((xc9) faaVar2.f38745k).setValue(Boolean.FALSE);
            }
            vs2 vs2VarM781p = AbstractC0070i.m781p(faaVar2, vs2Var, tj3Var, (i4 >> 6) & 112);
            t66 t66Var2 = faaVar2.f38738d;
            qv2 qv2VarM782q = AbstractC0070i.m782q(faaVar2, qv2Var, tj3Var, (i4 >> 9) & 112);
            t66 t66VarM1263m = AbstractC0278f.m1263m(zi3Var, tj3Var);
            Object objInvoke = zi3Var.invoke(faaVar2.m11669c(), ((xc9) t66Var2).getValue());
            boolean zM22120g2 = tj3Var.m22120g(faaVar2) | tj3Var.m22120g(t66VarM1263m);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O4 == p84Var) {
                objM22097O4 = new C0048xd7829780(faaVar2, t66VarM1263m, null);
                tj3Var.m22131l0(objM22097O4);
            }
            t66 t66VarM1261k = AbstractC0278f.m1261k(tj3Var, (zi3) objM22097O4, objInvoke);
            Object objM11669c = faaVar2.m11669c();
            EnterExitState enterExitState = EnterExitState.PostExit;
            if (objM11669c == enterExitState && ((xc9) t66Var2).getValue() == enterExitState && ((Boolean) t66VarM1261k.getValue()).booleanValue()) {
                tj3Var.m22111b0(-229368781);
                tj3Var.m22139q(false);
                c0282a2 = c0282a;
                z = false;
            } else {
                tj3Var.m22111b0(-230699766);
                boolean z4 = i5 == 4;
                Object objM22097O5 = tj3Var.m22097O();
                if (z4 || objM22097O5 == p84Var) {
                    objM22097O5 = new C3541rm(faaVar2);
                    tj3Var.m22131l0(objM22097O5);
                }
                C3541rm c3541rm = (C3541rm) objM22097O5;
                z = false;
                e16 e16VarM766a = AbstractC0070i.m766a(faaVar2, vs2VarM781p, qv2VarM782q, "Built-in", tj3Var, 199680, 8);
                tj3Var.m22111b0(-7404393);
                tj3Var.m22139q(false);
                e16 e16VarMo3161g = e16Var.mo3161g(e16VarM766a.mo3161g(b16.f7762a));
                Object objM22097O6 = tj3Var.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new C0066e(c3541rm);
                    tj3Var.m22131l0(objM22097O6);
                }
                C0066e c0066e = (C0066e) objM22097O6;
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, c0066e);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m17999e(tj3Var, Integer.valueOf(iHashCode), C0352b.f4304g);
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                c0282a2 = c0282a;
                c0282a2.invoke(c3541rm, tj3Var, Integer.valueOf((i4 >> 18) & 112));
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22111b0(-229362829);
            tj3Var.m22139q(false);
            c0282a2 = c0282a;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final C0282a c0282a3 = c0282a2;
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AbstractC0054a.m728c(faaVar, vi3Var, e16Var, vs2Var, qv2Var, zi3Var, c0282a3, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m729d(final boolean z, e16 e16Var, vs2 vs2Var, qv2 qv2Var, String str, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        int i3;
        e16 e16Var2;
        int i4;
        vs2 vs2Var2;
        int i5;
        int i6;
        qv2 qv2Var2;
        int i7;
        int i8;
        boolean z2;
        final e16 e16Var3;
        final vs2 vs2Var3;
        final qv2 qv2Var3;
        final String str2;
        x18 x18VarM22143u;
        e16 e16Var4;
        vs2 vs2VarM23531a;
        qv2 qv2VarM20180a;
        Object objM22097O;
        int i9;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1448730565);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var.m22120g(e16Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    vs2Var2 = vs2Var;
                    if (tj3Var.m22120g(vs2Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        qv2Var2 = qv2Var;
                        if (tj3Var.m22120g(qv2Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 24576;
                    if ((196608 & i) == 0) {
                        if (tj3Var.m22124i(c0282a)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i8 |= i9;
                    }
                    if ((74899 & i8) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (tj3Var.m22099R(i8 & 1, z2)) {
                        if (i10 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i4 != 0) {
                            vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d());
                        } else {
                            vs2VarM23531a = vs2Var2;
                        }
                        if (i6 != 0) {
                            jda jdaVar = AbstractC0070i.f1576a;
                            Map map = jwa.f46325a;
                            qv2VarM20180a = AbstractC0070i.m775j(nj0.f52816k, ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1), EnterExitTransitionKt$shrinkOut$1.f1457b).m20180a(AbstractC0070i.m773h(null, 3));
                        } else {
                            qv2VarM20180a = qv2Var2;
                        }
                        str2 = "AnimatedVisibility";
                        faa faaVarM15046h = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                        objM22097O = tj3Var.m22097O();
                        if (objM22097O == we1.f66679a) {
                            objM22097O = AnimatedVisibilityKt$AnimatedVisibility$1$1.f1369b;
                            tj3Var.m22131l0(objM22097O);
                        }
                        vi3 vi3Var = (vi3) objM22097O;
                        int i11 = i8 << 3;
                        e16 e16Var5 = e16Var4;
                        vs2 vs2Var4 = vs2VarM23531a;
                        m732g(faaVarM15046h, vi3Var, e16Var5, vs2Var4, qv2VarM20180a, c0282a, tj3Var, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i8 & 458752));
                        e16Var3 = e16Var5;
                        vs2Var3 = vs2Var4;
                        qv2Var3 = qv2VarM20180a;
                    } else {
                        tj3Var.m22102U();
                        e16Var3 = e16Var2;
                        vs2Var3 = vs2Var2;
                        qv2Var3 = qv2Var2;
                        str2 = str;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Number) obj2).intValue();
                                AbstractC0054a.m729d(z, e16Var3, vs2Var3, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                qv2Var2 = qv2Var;
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (tj3Var.m22124i(c0282a)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i8 |= i9;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var.m22099R(i8 & 1, z2)) {
                    if (i10 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i4 != 0) {
                        vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d());
                    } else {
                        vs2VarM23531a = vs2Var2;
                    }
                    if (i6 != 0) {
                        jda jdaVar2 = AbstractC0070i.f1576a;
                        Map map2 = jwa.f46325a;
                        qv2VarM20180a = AbstractC0070i.m775j(nj0.f52816k, ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1), EnterExitTransitionKt$shrinkOut$1.f1457b).m20180a(AbstractC0070i.m773h(null, 3));
                    } else {
                        qv2VarM20180a = qv2Var2;
                    }
                    str2 = "AnimatedVisibility";
                    faa faaVarM15046h2 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AnimatedVisibilityKt$AnimatedVisibility$1$1.f1369b;
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O;
                    int i12 = i8 << 3;
                    e16 e16Var6 = e16Var4;
                    vs2 vs2Var5 = vs2VarM23531a;
                    m732g(faaVarM15046h2, vi3Var2, e16Var6, vs2Var5, qv2VarM20180a, c0282a, tj3Var, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i8 & 458752));
                    e16Var3 = e16Var6;
                    vs2Var3 = vs2Var5;
                    qv2Var3 = qv2VarM20180a;
                } else {
                    tj3Var.m22102U();
                    e16Var3 = e16Var2;
                    vs2Var3 = vs2Var2;
                    qv2Var3 = qv2Var2;
                    str2 = str;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Number) obj2).intValue();
                            AbstractC0054a.m729d(z, e16Var3, vs2Var3, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i3 |= 384;
            vs2Var2 = vs2Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    qv2Var2 = qv2Var;
                    if (tj3Var.m22120g(qv2Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (tj3Var.m22124i(c0282a)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i8 |= i9;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var.m22099R(i8 & 1, z2)) {
                    if (i10 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i4 != 0) {
                        vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d());
                    } else {
                        vs2VarM23531a = vs2Var2;
                    }
                    if (i6 != 0) {
                        jda jdaVar3 = AbstractC0070i.f1576a;
                        Map map3 = jwa.f46325a;
                        qv2VarM20180a = AbstractC0070i.m775j(nj0.f52816k, ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1), EnterExitTransitionKt$shrinkOut$1.f1457b).m20180a(AbstractC0070i.m773h(null, 3));
                    } else {
                        qv2VarM20180a = qv2Var2;
                    }
                    str2 = "AnimatedVisibility";
                    faa faaVarM15046h3 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AnimatedVisibilityKt$AnimatedVisibility$1$1.f1369b;
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O;
                    int i13 = i8 << 3;
                    e16 e16Var7 = e16Var4;
                    vs2 vs2Var6 = vs2VarM23531a;
                    m732g(faaVarM15046h3, vi3Var3, e16Var7, vs2Var6, qv2VarM20180a, c0282a, tj3Var, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i8 & 458752));
                    e16Var3 = e16Var7;
                    vs2Var3 = vs2Var6;
                    qv2Var3 = qv2VarM20180a;
                } else {
                    tj3Var.m22102U();
                    e16Var3 = e16Var2;
                    vs2Var3 = vs2Var2;
                    qv2Var3 = qv2Var2;
                    str2 = str;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Number) obj2).intValue();
                            AbstractC0054a.m729d(z, e16Var3, vs2Var3, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i3 |= 3072;
            qv2Var2 = qv2Var;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i8 |= i9;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i8 & 1, z2)) {
                if (i10 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if (i4 != 0) {
                    vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d());
                } else {
                    vs2VarM23531a = vs2Var2;
                }
                if (i6 != 0) {
                    jda jdaVar4 = AbstractC0070i.f1576a;
                    Map map4 = jwa.f46325a;
                    qv2VarM20180a = AbstractC0070i.m775j(nj0.f52816k, ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1), EnterExitTransitionKt$shrinkOut$1.f1457b).m20180a(AbstractC0070i.m773h(null, 3));
                } else {
                    qv2VarM20180a = qv2Var2;
                }
                str2 = "AnimatedVisibility";
                faa faaVarM15046h4 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AnimatedVisibilityKt$AnimatedVisibility$1$1.f1369b;
                    tj3Var.m22131l0(objM22097O);
                }
                vi3 vi3Var4 = (vi3) objM22097O;
                int i14 = i8 << 3;
                e16 e16Var8 = e16Var4;
                vs2 vs2Var7 = vs2VarM23531a;
                m732g(faaVarM15046h4, vi3Var4, e16Var8, vs2Var7, qv2VarM20180a, c0282a, tj3Var, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i8 & 458752));
                e16Var3 = e16Var8;
                vs2Var3 = vs2Var7;
                qv2Var3 = qv2VarM20180a;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                vs2Var3 = vs2Var2;
                qv2Var3 = qv2Var2;
                str2 = str;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0054a.m729d(z, e16Var3, vs2Var3, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 48;
        e16Var2 = e16Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                vs2Var2 = vs2Var;
                if (tj3Var.m22120g(vs2Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    qv2Var2 = qv2Var;
                    if (tj3Var.m22120g(qv2Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (tj3Var.m22124i(c0282a)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i8 |= i9;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var.m22099R(i8 & 1, z2)) {
                    if (i10 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i4 != 0) {
                        vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d());
                    } else {
                        vs2VarM23531a = vs2Var2;
                    }
                    if (i6 != 0) {
                        jda jdaVar5 = AbstractC0070i.f1576a;
                        Map map5 = jwa.f46325a;
                        qv2VarM20180a = AbstractC0070i.m775j(nj0.f52816k, ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1), EnterExitTransitionKt$shrinkOut$1.f1457b).m20180a(AbstractC0070i.m773h(null, 3));
                    } else {
                        qv2VarM20180a = qv2Var2;
                    }
                    str2 = "AnimatedVisibility";
                    faa faaVarM15046h5 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AnimatedVisibilityKt$AnimatedVisibility$1$1.f1369b;
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3 vi3Var5 = (vi3) objM22097O;
                    int i15 = i8 << 3;
                    e16 e16Var9 = e16Var4;
                    vs2 vs2Var8 = vs2VarM23531a;
                    m732g(faaVarM15046h5, vi3Var5, e16Var9, vs2Var8, qv2VarM20180a, c0282a, tj3Var, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i8 & 458752));
                    e16Var3 = e16Var9;
                    vs2Var3 = vs2Var8;
                    qv2Var3 = qv2VarM20180a;
                } else {
                    tj3Var.m22102U();
                    e16Var3 = e16Var2;
                    vs2Var3 = vs2Var2;
                    qv2Var3 = qv2Var2;
                    str2 = str;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Number) obj2).intValue();
                            AbstractC0054a.m729d(z, e16Var3, vs2Var3, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i3 |= 3072;
            qv2Var2 = qv2Var;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i8 |= i9;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i8 & 1, z2)) {
                if (i10 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if (i4 != 0) {
                    vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d());
                } else {
                    vs2VarM23531a = vs2Var2;
                }
                if (i6 != 0) {
                    jda jdaVar6 = AbstractC0070i.f1576a;
                    Map map6 = jwa.f46325a;
                    qv2VarM20180a = AbstractC0070i.m775j(nj0.f52816k, ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1), EnterExitTransitionKt$shrinkOut$1.f1457b).m20180a(AbstractC0070i.m773h(null, 3));
                } else {
                    qv2VarM20180a = qv2Var2;
                }
                str2 = "AnimatedVisibility";
                faa faaVarM15046h6 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AnimatedVisibilityKt$AnimatedVisibility$1$1.f1369b;
                    tj3Var.m22131l0(objM22097O);
                }
                vi3 vi3Var6 = (vi3) objM22097O;
                int i16 = i8 << 3;
                e16 e16Var10 = e16Var4;
                vs2 vs2Var9 = vs2VarM23531a;
                m732g(faaVarM15046h6, vi3Var6, e16Var10, vs2Var9, qv2VarM20180a, c0282a, tj3Var, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i8 & 458752));
                e16Var3 = e16Var10;
                vs2Var3 = vs2Var9;
                qv2Var3 = qv2VarM20180a;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                vs2Var3 = vs2Var2;
                qv2Var3 = qv2Var2;
                str2 = str;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0054a.m729d(z, e16Var3, vs2Var3, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 384;
        vs2Var2 = vs2Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                qv2Var2 = qv2Var;
                if (tj3Var.m22120g(qv2Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i8 |= i9;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i8 & 1, z2)) {
                if (i10 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if (i4 != 0) {
                    vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d());
                } else {
                    vs2VarM23531a = vs2Var2;
                }
                if (i6 != 0) {
                    jda jdaVar7 = AbstractC0070i.f1576a;
                    Map map7 = jwa.f46325a;
                    qv2VarM20180a = AbstractC0070i.m775j(nj0.f52816k, ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1), EnterExitTransitionKt$shrinkOut$1.f1457b).m20180a(AbstractC0070i.m773h(null, 3));
                } else {
                    qv2VarM20180a = qv2Var2;
                }
                str2 = "AnimatedVisibility";
                faa faaVarM15046h7 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AnimatedVisibilityKt$AnimatedVisibility$1$1.f1369b;
                    tj3Var.m22131l0(objM22097O);
                }
                vi3 vi3Var7 = (vi3) objM22097O;
                int i17 = i8 << 3;
                e16 e16Var11 = e16Var4;
                vs2 vs2Var10 = vs2VarM23531a;
                m732g(faaVarM15046h7, vi3Var7, e16Var11, vs2Var10, qv2VarM20180a, c0282a, tj3Var, (i17 & 57344) | (i17 & 896) | 48 | (i17 & 7168) | (i8 & 458752));
                e16Var3 = e16Var11;
                vs2Var3 = vs2Var10;
                qv2Var3 = qv2VarM20180a;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                vs2Var3 = vs2Var2;
                qv2Var3 = qv2Var2;
                str2 = str;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0054a.m729d(z, e16Var3, vs2Var3, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 3072;
        qv2Var2 = qv2Var;
        i8 = i3 | 24576;
        if ((196608 & i) == 0) {
            if (tj3Var.m22124i(c0282a)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        }
        if ((74899 & i8) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (tj3Var.m22099R(i8 & 1, z2)) {
            if (i10 != 0) {
                e16Var4 = b16.f7762a;
            } else {
                e16Var4 = e16Var2;
            }
            if (i4 != 0) {
                vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d());
            } else {
                vs2VarM23531a = vs2Var2;
            }
            if (i6 != 0) {
                jda jdaVar8 = AbstractC0070i.f1576a;
                Map map8 = jwa.f46325a;
                qv2VarM20180a = AbstractC0070i.m775j(nj0.f52816k, ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1), EnterExitTransitionKt$shrinkOut$1.f1457b).m20180a(AbstractC0070i.m773h(null, 3));
            } else {
                qv2VarM20180a = qv2Var2;
            }
            str2 = "AnimatedVisibility";
            faa faaVarM15046h8 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, (i8 & 14) | ((i8 >> 9) & 112), 0);
            objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AnimatedVisibilityKt$AnimatedVisibility$1$1.f1369b;
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var8 = (vi3) objM22097O;
            int i18 = i8 << 3;
            e16 e16Var12 = e16Var4;
            vs2 vs2Var11 = vs2VarM23531a;
            m732g(faaVarM15046h8, vi3Var8, e16Var12, vs2Var11, qv2VarM20180a, c0282a, tj3Var, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i8 & 458752));
            e16Var3 = e16Var12;
            vs2Var3 = vs2Var11;
            qv2Var3 = qv2VarM20180a;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            vs2Var3 = vs2Var2;
            qv2Var3 = qv2Var2;
            str2 = str;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AbstractC0054a.m729d(z, e16Var3, vs2Var3, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m730e(final boolean z, e16 e16Var, vs2 vs2Var, qv2 qv2Var, String str, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        vs2 vs2VarM23531a;
        int i3;
        qv2 qv2VarM20180a;
        int i4;
        final e16 e16Var2;
        final String str2;
        final vs2 vs2Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(234057107);
        int i5 = i | (tj3Var.m22122h(z) ? 32 : 16);
        int i6 = i5 | 384;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i5 | 3456;
            vs2VarM23531a = vs2Var;
        } else {
            vs2VarM23531a = vs2Var;
            i3 = i6 | (tj3Var.m22120g(vs2VarM23531a) ? 2048 : 1024);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | 24576;
            qv2VarM20180a = qv2Var;
        } else {
            qv2VarM20180a = qv2Var;
            i4 = i3 | (tj3Var.m22120g(qv2VarM20180a) ? 16384 : 8192);
        }
        int i9 = i4 | 196608;
        if (tj3Var.m22099R(i9 & 1, (599185 & i9) != 599184)) {
            if (i7 != 0) {
                vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m767b(null, null, 15));
            }
            vs2 vs2Var3 = vs2VarM23531a;
            if (i8 != 0) {
                qv2VarM20180a = AbstractC0070i.m773h(null, 3).m20180a(AbstractC0070i.m774i(null, null, 15));
            }
            faa faaVarM15046h = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, ((i9 >> 3) & 14) | 48, 0);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AnimatedVisibilityKt$AnimatedVisibility$3$1.f1378b;
                tj3Var.m22131l0(objM22097O);
            }
            b16 b16Var = b16.f7762a;
            m732g(faaVarM15046h, (vi3) objM22097O, b16Var, vs2Var3, qv2VarM20180a, c0282a, tj3Var, (i9 & 57344) | (i9 & 7168) | 432 | 196608);
            vs2Var2 = vs2Var3;
            str2 = "AnimatedVisibility";
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            str2 = str;
            vs2Var2 = vs2VarM23531a;
        }
        final qv2 qv2Var2 = qv2VarM20180a;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(z, e16Var2, vs2Var2, qv2Var2, str2, c0282a, i, i2) { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f1379b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ e16 f1380c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ vs2 f1381d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ qv2 f1382e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ String f1383f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ C0282a f1384g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f1385h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.f1385h = i2;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(1572871);
                    int i10 = this.f1385h;
                    AbstractC0054a.m730e(this.f1379b, this.f1380c, this.f1381d, this.f1382e, this.f1383f, this.f1384g, (ye1) obj, iM19383z, i10);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m731f(final boolean z, e16 e16Var, vs2 vs2Var, qv2 qv2Var, String str, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        vs2 vs2VarM23531a;
        int i3;
        qv2 qv2Var2;
        int i4;
        int i5;
        boolean z2;
        final e16 e16Var2;
        final vs2 vs2Var2;
        final qv2 qv2Var3;
        final String str2;
        x18 x18VarM22143u;
        qv2 qv2VarM20180a;
        Object objM22097O;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1799879339);
        int i6 = (tj3Var.m22122h(z) ? 32 : 16) | i;
        int i7 = i6 | 384;
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                vs2VarM23531a = vs2Var;
                i7 |= tj3Var.m22120g(vs2VarM23531a) ? 2048 : 1024;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                if ((i & 24576) == 0) {
                    qv2Var2 = qv2Var;
                    if (tj3Var.m22120g(qv2Var2)) {
                        i4 = 16384;
                    } else {
                        i4 = 8192;
                    }
                    i7 |= i4;
                }
                i5 = i7 | 196608;
                if ((599185 & i5) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var.m22099R(i5 & 1, z2)) {
                    if (i8 != 0) {
                        vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m770e(null, 15));
                    }
                    if (i3 != 0) {
                        qv2VarM20180a = AbstractC0070i.m773h(null, 3).m20180a(AbstractC0070i.m776k(null, 15));
                    } else {
                        qv2VarM20180a = qv2Var2;
                    }
                    str2 = "AnimatedVisibility";
                    faa faaVarM15046h = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, ((i5 >> 3) & 14) | 48, 0);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AnimatedVisibilityKt$AnimatedVisibility$5$1.f1386b;
                        tj3Var.m22131l0(objM22097O);
                    }
                    b16 b16Var = b16.f7762a;
                    vs2 vs2Var3 = vs2VarM23531a;
                    m732g(faaVarM15046h, (vi3) objM22097O, b16Var, vs2Var3, qv2VarM20180a, c0282a, tj3Var, (i5 & 57344) | (i5 & 7168) | 432 | 196608);
                    e16Var2 = b16Var;
                    vs2Var2 = vs2Var3;
                    qv2Var3 = qv2VarM20180a;
                } else {
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    vs2Var2 = vs2VarM23531a;
                    qv2Var3 = qv2Var2;
                    str2 = str;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Number) obj2).intValue();
                            AbstractC0054a.m731f(z, e16Var2, vs2Var2, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i7 |= 24576;
            qv2Var2 = qv2Var;
            i5 = i7 | 196608;
            if ((599185 & i5) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i5 & 1, z2)) {
                if (i8 != 0) {
                    vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m770e(null, 15));
                }
                if (i3 != 0) {
                    qv2VarM20180a = AbstractC0070i.m773h(null, 3).m20180a(AbstractC0070i.m776k(null, 15));
                } else {
                    qv2VarM20180a = qv2Var2;
                }
                str2 = "AnimatedVisibility";
                faa faaVarM15046h2 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, ((i5 >> 3) & 14) | 48, 0);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AnimatedVisibilityKt$AnimatedVisibility$5$1.f1386b;
                    tj3Var.m22131l0(objM22097O);
                }
                b16 b16Var2 = b16.f7762a;
                vs2 vs2Var4 = vs2VarM23531a;
                m732g(faaVarM15046h2, (vi3) objM22097O, b16Var2, vs2Var4, qv2VarM20180a, c0282a, tj3Var, (i5 & 57344) | (i5 & 7168) | 432 | 196608);
                e16Var2 = b16Var2;
                vs2Var2 = vs2Var4;
                qv2Var3 = qv2VarM20180a;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                vs2Var2 = vs2VarM23531a;
                qv2Var3 = qv2Var2;
                str2 = str;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0054a.m731f(z, e16Var2, vs2Var2, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i7 = i6 | 3456;
        vs2VarM23531a = vs2Var;
        i3 = i2 & 8;
        if (i3 != 0) {
            if ((i & 24576) == 0) {
                qv2Var2 = qv2Var;
                if (tj3Var.m22120g(qv2Var2)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i7 |= i4;
            }
            i5 = i7 | 196608;
            if ((599185 & i5) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i5 & 1, z2)) {
                if (i8 != 0) {
                    vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m770e(null, 15));
                }
                if (i3 != 0) {
                    qv2VarM20180a = AbstractC0070i.m773h(null, 3).m20180a(AbstractC0070i.m776k(null, 15));
                } else {
                    qv2VarM20180a = qv2Var2;
                }
                str2 = "AnimatedVisibility";
                faa faaVarM15046h3 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, ((i5 >> 3) & 14) | 48, 0);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AnimatedVisibilityKt$AnimatedVisibility$5$1.f1386b;
                    tj3Var.m22131l0(objM22097O);
                }
                b16 b16Var3 = b16.f7762a;
                vs2 vs2Var5 = vs2VarM23531a;
                m732g(faaVarM15046h3, (vi3) objM22097O, b16Var3, vs2Var5, qv2VarM20180a, c0282a, tj3Var, (i5 & 57344) | (i5 & 7168) | 432 | 196608);
                e16Var2 = b16Var3;
                vs2Var2 = vs2Var5;
                qv2Var3 = qv2VarM20180a;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                vs2Var2 = vs2VarM23531a;
                qv2Var3 = qv2Var2;
                str2 = str;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AbstractC0054a.m731f(z, e16Var2, vs2Var2, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i7 |= 24576;
        qv2Var2 = qv2Var;
        i5 = i7 | 196608;
        if ((599185 & i5) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (tj3Var.m22099R(i5 & 1, z2)) {
            if (i8 != 0) {
                vs2VarM23531a = AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m770e(null, 15));
            }
            if (i3 != 0) {
                qv2VarM20180a = AbstractC0070i.m773h(null, 3).m20180a(AbstractC0070i.m776k(null, 15));
            } else {
                qv2VarM20180a = qv2Var2;
            }
            str2 = "AnimatedVisibility";
            faa faaVarM15046h4 = kaa.m15046h(Boolean.valueOf(z), "AnimatedVisibility", tj3Var, ((i5 >> 3) & 14) | 48, 0);
            objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AnimatedVisibilityKt$AnimatedVisibility$5$1.f1386b;
                tj3Var.m22131l0(objM22097O);
            }
            b16 b16Var4 = b16.f7762a;
            vs2 vs2Var6 = vs2VarM23531a;
            m732g(faaVarM15046h4, (vi3) objM22097O, b16Var4, vs2Var6, qv2VarM20180a, c0282a, tj3Var, (i5 & 57344) | (i5 & 7168) | 432 | 196608);
            e16Var2 = b16Var4;
            vs2Var2 = vs2Var6;
            qv2Var3 = qv2VarM20180a;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            vs2Var2 = vs2VarM23531a;
            qv2Var3 = qv2Var2;
            str2 = str;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AbstractC0054a.m731f(z, e16Var2, vs2Var2, qv2Var3, str2, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m732g(final faa faaVar, final vi3 vi3Var, final e16 e16Var, final vs2 vs2Var, final qv2 qv2Var, final C0282a c0282a, ye1 ye1Var, final int i) {
        int i2;
        vs2 vs2Var2;
        qv2 qv2Var2;
        C0282a c0282a2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1706321816);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(faaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            vs2Var2 = vs2Var;
            i2 |= tj3Var.m22120g(vs2Var2) ? 2048 : 1024;
        } else {
            vs2Var2 = vs2Var;
        }
        if ((i & 24576) == 0) {
            qv2Var2 = qv2Var;
            i2 |= tj3Var.m22120g(qv2Var2) ? 16384 : 8192;
        } else {
            qv2Var2 = qv2Var;
        }
        if ((i & 196608) == 0) {
            c0282a2 = c0282a;
            i2 |= tj3Var.m22124i(c0282a2) ? 131072 : 65536;
        } else {
            c0282a2 = c0282a;
        }
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new aj3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        long j;
                        jt5 jt5Var = (jt5) obj;
                        final l87 l87VarMo1514r = ((ct5) obj2).mo1514r(((bk1) obj3).f8631a);
                        if (jt5Var.mo211f0()) {
                            if (((Boolean) vi3Var.invoke(((xc9) faaVar.f38738d).getValue())).booleanValue()) {
                                j = (((long) l87VarMo1514r.f49301a) << 32) | (((long) l87VarMo1514r.f49302b) & 4294967295L);
                            } else {
                                j = 0;
                            }
                        } else {
                            j = (((long) l87VarMo1514r.f49301a) << 32) | (((long) l87VarMo1514r.f49302b) & 4294967295L);
                        }
                        return jt5Var.mo9895M0((int) (j >> 32), (int) (4294967295L & j), AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            {
                                super(1);
                            }

                            @Override // p000.vi3
                            public final Object invoke(Object obj4) {
                                ((AbstractC0343j) obj4).m1530f(l87VarMo1514r, 0, 0, 0.0f);
                                return xfa.f68157a;
                            }
                        });
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM21968A = te1.m21968A(e16Var, (aj3) objM22097O);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1.f1398b;
                tj3Var.m22131l0(objM22097O2);
            }
            m728c(faaVar, vi3Var, e16VarM21968A, vs2Var2, qv2Var2, (zi3) objM22097O2, c0282a2, tj3Var, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AbstractC0054a.m732g(faaVar, vi3Var, e16Var, vs2Var, qv2Var, c0282a, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m733h(final faa faaVar, final e16 e16Var, final l43 l43Var, vi3 vi3Var, final C0282a c0282a, ye1 ye1Var, final int i) {
        final vi3 vi3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1877370462);
        int i2 = (i & 6) == 0 ? (tj3Var.m22120g(faaVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(l43Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22124i(c0282a) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = CrossfadeKt$Crossfade$3$1.f1419b;
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var3 = (vi3) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            Object obj = objM22097O2;
            if (objM22097O2 == p84Var) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.add(faaVar.m11669c());
                tj3Var.m22131l0(snapshotStateList);
                obj = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                long[] jArr = om8.f54590a;
                objM22097O3 = new n66();
                tj3Var.m22131l0(objM22097O3);
            }
            n66 n66Var = (n66) objM22097O3;
            Object objM11669c = faaVar.m11669c();
            xc9 xc9Var = (xc9) faaVar.f38738d;
            if (fa4.m11650l(objM11669c, xc9Var.getValue())) {
                tj3Var.m22111b0(321145192);
                if (snapshotStateList2.size() == 1 && fa4.m11650l(snapshotStateList2.get(0), xc9Var.getValue())) {
                    tj3Var.m22111b0(321469824);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object objM22097O4 = tj3Var.m22097O();
                    if (z || objM22097O4 == p84Var) {
                        objM22097O4 = new vi3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            {
                                super(1);
                            }

                            @Override // p000.vi3
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(!fa4.m11650l(obj2, ((xc9) faaVar.f38738d).getValue()));
                            }
                        };
                        tj3Var.m22131l0(objM22097O4);
                    }
                    u91.m22606X0((vi3) objM22097O4, snapshotStateList2);
                    n66Var.m17249a();
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(321475776);
                tj3Var.m22139q(false);
            }
            if (n66Var.m17250b(xc9Var.getValue())) {
                tj3Var.m22111b0(322279296);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(321536443);
                ListIterator listIterator = snapshotStateList2.listIterator();
                int i4 = 0;
                while (true) {
                    au3 au3Var = (au3) listIterator;
                    if (!au3Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (fa4.m11650l(vi3Var3.invoke(au3Var.next()), vi3Var3.invoke(xc9Var.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    snapshotStateList2.add(xc9Var.getValue());
                } else {
                    snapshotStateList2.set(i4, xc9Var.getValue());
                }
                n66Var.m17249a();
                int size = snapshotStateList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    final Object obj2 = snapshotStateList2.get(i5);
                    n66Var.m17261m(obj2, ci8.m4703P(-934471669, new zi3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

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
                        @Override // p000.zi3
                        public final Object invoke(Object obj3, Object obj4) {
                            Object objM24111g;
                            ye1 ye1Var2 = (ye1) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final l43 l43Var2 = l43Var;
                                aj3 aj3Var = new aj3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                    {
                                        super(3);
                                    }

                                    @Override // p000.aj3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        ((Number) obj7).intValue();
                                        tj3 tj3Var3 = (tj3) ((ye1) obj6);
                                        tj3Var3.m22111b0(955869654);
                                        tj3Var3.m22139q(false);
                                        return l43Var2;
                                    }
                                };
                                jda jdaVar = pk9.f56363h;
                                faa faaVar2 = faaVar;
                                boolean zM11673g = faaVar2.m11673g();
                                p84 p84Var2 = we1.f66679a;
                                if (zM11673g) {
                                    objM24111g = wq1.m24111g(tj3Var2, 1666827533, false, faaVar2);
                                } else {
                                    tj3Var2.m22111b0(1666573488);
                                    boolean zM22120g = tj3Var2.m22120g(faaVar2);
                                    objM24111g = tj3Var2.m22097O();
                                    if (zM22120g || objM24111g == p84Var2) {
                                        jc9 jc9VarM16139y = lda.m16139y();
                                        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                                        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                                        try {
                                            Object objM11669c2 = faaVar2.m11669c();
                                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                                            tj3Var2.m22131l0(objM11669c2);
                                            objM24111g = objM11669c2;
                                        } catch (Throwable th) {
                                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                                            throw th;
                                        }
                                    }
                                    tj3Var2.m22139q(false);
                                }
                                tj3Var2.m22111b0(1378811975);
                                Object obj5 = obj2;
                                float f = fa4.m11650l(objM24111g, obj5) ? 1.0f : 0.0f;
                                tj3Var2.m22139q(false);
                                Float fValueOf = Float.valueOf(f);
                                boolean zM22120g2 = tj3Var2.m22120g(faaVar2);
                                Object objM22097O5 = tj3Var2.m22097O();
                                if (zM22120g2 || objM22097O5 == p84Var2) {
                                    objM22097O5 = AbstractC0278f.m1254d(new m01(faaVar2, 4));
                                    tj3Var2.m22131l0(objM22097O5);
                                }
                                Object value = ((dh9) objM22097O5).getValue();
                                tj3Var2.m22111b0(1378811975);
                                float f2 = fa4.m11650l(value, obj5) ? 1.0f : 0.0f;
                                tj3Var2.m22139q(false);
                                Float fValueOf2 = Float.valueOf(f2);
                                boolean zM22120g3 = tj3Var2.m22120g(faaVar2);
                                Object objM22097O6 = tj3Var2.m22097O();
                                if (zM22120g3 || objM22097O6 == p84Var2) {
                                    objM22097O6 = AbstractC0278f.m1254d(new m01(faaVar2, 5));
                                    tj3Var2.m22131l0(objM22097O6);
                                }
                                final baa baaVarM15041c = kaa.m15041c(faaVar2, fValueOf, fValueOf2, (l43) aj3Var.invoke(((dh9) objM22097O6).getValue(), tj3Var2, 0), jdaVar, tj3Var2, 0);
                                boolean zM22120g4 = tj3Var2.m22120g(baaVarM15041c);
                                Object objM22097O7 = tj3Var2.m22097O();
                                if (zM22120g4 || objM22097O7 == p84Var2) {
                                    objM22097O7 = new vi3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // p000.vi3
                                        public final Object invoke(Object obj6) {
                                            ((q98) obj6).m19813c(((Number) baaVarM15041c.getValue()).floatValue());
                                            return xfa.f68157a;
                                        }
                                    };
                                    tj3Var2.m22131l0(objM22097O7);
                                }
                                e16 e16VarM1406a = AbstractC0309d.m1406a(b16.f7762a, (vi3) objM22097O7);
                                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                                l77 l77VarM22132m = tj3Var2.m22132m();
                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM1406a);
                                se1.f60731q.getClass();
                                ui3 ui3Var = C0352b.f4299b;
                                tj3Var2.m22119f0();
                                if (tj3Var2.f62384S) {
                                    tj3Var2.m22130l(ui3Var);
                                } else {
                                    tj3Var2.m22137o0();
                                }
                                oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
                                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                                oha.m17999e(tj3Var2, Integer.valueOf(iHashCode), C0352b.f4304g);
                                oha.m18000f(tj3Var2, C0352b.f4305h);
                                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                                c0282a.invoke(obj5, tj3Var2, 0);
                                tj3Var2.m22139q(true);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var));
                }
                tj3Var.m22139q(false);
            }
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m17999e(tj3Var, Integer.valueOf(iHashCode), C0352b.f4304g);
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(-1312707512);
            int size2 = snapshotStateList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj3 = snapshotStateList2.get(i6);
                tj3Var.m22106Y(1171574969, vi3Var3.invoke(obj3));
                zi3 zi3Var = (zi3) n66Var.m17255g(obj3);
                if (zi3Var == null) {
                    tj3Var.m22111b0(1959122128);
                } else {
                    tj3Var.m22111b0(1171576145);
                    zi3Var.invoke(tj3Var, 0);
                }
                tj3Var.m22139q(false);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
            vi3Var2 = vi3Var3;
        } else {
            tj3Var.m22102U();
            vi3Var2 = vi3Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj4, Object obj5) {
                    ((Number) obj5).intValue();
                    AbstractC0054a.m733h(faaVar, e16Var, l43Var, vi3Var2, c0282a, (ye1) obj4, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m734i(final Object obj, e16 e16Var, l43 l43Var, String str, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        int i3;
        final l43 l43Var2;
        int i4;
        String str2;
        int i5;
        boolean z;
        final e16 e16Var2;
        final String str3;
        x18 x18VarM22143u;
        l43 l43VarM21703b0;
        String str4;
        int i6;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? tj3Var.m22120g(obj) : tj3Var.m22124i(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                l43Var2 = l43Var;
                i3 |= tj3Var.m22124i(l43Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    str2 = str;
                    if (tj3Var.m22120g(str2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if (tj3Var.m22124i(c0282a)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i3 & 1, z)) {
                    if (i7 != 0) {
                        e16Var = b16.f7762a;
                    }
                    e16 e16Var3 = e16Var;
                    if (i8 != 0) {
                        l43VarM21703b0 = ss5.m21703b0(0, 0, null, 7);
                    } else {
                        l43VarM21703b0 = l43Var2;
                    }
                    if (i4 != 0) {
                        str4 = "Crossfade";
                    } else {
                        str4 = str2;
                    }
                    l43 l43Var3 = l43VarM21703b0;
                    m733h(kaa.m15046h(obj, str4, tj3Var, (i3 & 14) | ((i3 >> 6) & 112), 0), e16Var3, l43Var3, null, c0282a, tj3Var, i3 & 58352);
                    str3 = str4;
                    e16Var2 = e16Var3;
                    l43Var2 = l43Var3;
                } else {
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    str3 = str2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Number) obj3).intValue();
                            AbstractC0054a.m734i(obj, e16Var2, l43Var2, str3, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i3 |= 3072;
            str2 = str;
            if ((i & 24576) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i3 & 1, z)) {
                if (i7 != 0) {
                    e16Var = b16.f7762a;
                }
                e16 e16Var4 = e16Var;
                if (i8 != 0) {
                    l43VarM21703b0 = ss5.m21703b0(0, 0, null, 7);
                } else {
                    l43VarM21703b0 = l43Var2;
                }
                if (i4 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                l43 l43Var4 = l43VarM21703b0;
                m733h(kaa.m15046h(obj, str4, tj3Var, (i3 & 14) | ((i3 >> 6) & 112), 0), e16Var4, l43Var4, null, c0282a, tj3Var, i3 & 58352);
                str3 = str4;
                e16Var2 = e16Var4;
                l43Var2 = l43Var4;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                str3 = str2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Number) obj3).intValue();
                        AbstractC0054a.m734i(obj, e16Var2, l43Var2, str3, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 384;
        l43Var2 = l43Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                str2 = str;
                if (tj3Var.m22120g(str2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i3 & 1, z)) {
                if (i7 != 0) {
                    e16Var = b16.f7762a;
                }
                e16 e16Var5 = e16Var;
                if (i8 != 0) {
                    l43VarM21703b0 = ss5.m21703b0(0, 0, null, 7);
                } else {
                    l43VarM21703b0 = l43Var2;
                }
                if (i4 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                l43 l43Var5 = l43VarM21703b0;
                m733h(kaa.m15046h(obj, str4, tj3Var, (i3 & 14) | ((i3 >> 6) & 112), 0), e16Var5, l43Var5, null, c0282a, tj3Var, i3 & 58352);
                str3 = str4;
                e16Var2 = e16Var5;
                l43Var2 = l43Var5;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                str3 = str2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Number) obj3).intValue();
                        AbstractC0054a.m734i(obj, e16Var2, l43Var2, str3, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 3072;
        str2 = str;
        if ((i & 24576) == 0) {
            if (tj3Var.m22124i(c0282a)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i3 & 1, z)) {
            if (i7 != 0) {
                e16Var = b16.f7762a;
            }
            e16 e16Var6 = e16Var;
            if (i8 != 0) {
                l43VarM21703b0 = ss5.m21703b0(0, 0, null, 7);
            } else {
                l43VarM21703b0 = l43Var2;
            }
            if (i4 != 0) {
                str4 = "Crossfade";
            } else {
                str4 = str2;
            }
            l43 l43Var6 = l43VarM21703b0;
            m733h(kaa.m15046h(obj, str4, tj3Var, (i3 & 14) | ((i3 >> 6) & 112), 0), e16Var6, l43Var6, null, c0282a, tj3Var, i3 & 58352);
            str3 = str4;
            e16Var2 = e16Var6;
            l43Var2 = l43Var6;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            str3 = str2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    AbstractC0054a.m734i(obj, e16Var2, l43Var2, str3, c0282a, (ye1) obj2, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: j */
    public static final vi3 m735j() {
        return ColorVectorConverterKt$ColorToVector$1.f1409b;
    }

    /* JADX INFO: renamed from: k */
    public static final EnterExitState m736k(faa faaVar, vi3 vi3Var, Object obj, ye1 ye1Var) {
        EnterExitState enterExitState;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22106Y(-422486745, faaVar);
        if (faaVar.m11673g()) {
            tj3Var.m22111b0(-212166497);
            tj3Var.m22139q(false);
            if (((Boolean) vi3Var.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else {
                enterExitState = ((Boolean) vi3Var.invoke(faaVar.m11669c())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            }
        } else {
            tj3Var.m22111b0(-211892364);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            if (((Boolean) vi3Var.invoke(faaVar.m11669c())).booleanValue()) {
                t66Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) vi3Var.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else {
                enterExitState = ((Boolean) t66Var.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            }
            tj3Var.m22139q(false);
        }
        tj3Var.m22139q(false);
        return enterExitState;
    }
}
