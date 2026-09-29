package androidx.compose.p002ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.p002ui.R$id;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import p000.AbstractC3572sf;
import p000.d32;
import p000.fa4;
import p000.jf1;
import p000.ks6;
import p000.p84;
import p000.pf1;
import p000.rb5;
import p000.tj3;
import p000.ub5;
import p000.vi3;
import p000.we1;
import p000.xfa;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0413y implements jf1, rb5 {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f4873a;

    /* JADX INFO: renamed from: b */
    public final pf1 f4874b;

    /* JADX INFO: renamed from: c */
    public boolean f4875c;

    /* JADX INFO: renamed from: d */
    public AbstractC3572sf f4876d;

    /* JADX INFO: renamed from: e */
    public zi3 f4877e = AbstractC0399k.f4784a;

    public C0413y(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, pf1 pf1Var) {
        this.f4873a = viewTreeObserverOnGlobalLayoutListenerC0391c;
        this.f4874b = pf1Var;
    }

    @Override // p000.jf1
    /* JADX INFO: renamed from: a */
    public final void mo1823a() {
        if (!this.f4875c) {
            this.f4875c = true;
            this.f4873a.getView().setTag(R$id.wrapped_composition_tag, null);
            AbstractC3572sf abstractC3572sf = this.f4876d;
            if (abstractC3572sf != null) {
                abstractC3572sf.mo21331x(this);
            }
            this.f4876d = null;
        }
        this.f4874b.mo1823a();
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            mo1823a();
        } else {
            if (lifecycle$Event != Lifecycle$Event.ON_CREATE || this.f4875c) {
                return;
            }
            m1824d(this.f4877e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1824d(final zi3 zi3Var) {
        this.f4873a.setOnReadyForComposition(new vi3() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                final C0401m c0401m = (C0401m) obj;
                final C0413y c0413y = this.f4615b;
                if (!c0413y.f4875c) {
                    ub5 ub5Var = c0401m.f4788c;
                    View view = c0401m.f4786a;
                    AbstractC3572sf abstractC3572sfMo256K = ub5Var.mo256K();
                    final zi3 zi3Var2 = zi3Var;
                    c0413y.f4877e = zi3Var2;
                    if (c0413y.f4876d == null) {
                        if (fa4.m11650l(Looper.myLooper(), view.getHandler().getLooper())) {
                            c0413y.f4876d = abstractC3572sfMo256K;
                            abstractC3572sfMo256K.mo21323g(c0413y);
                        } else {
                            view.post(new ks6(8, c0413y, abstractC3572sfMo256K));
                        }
                    } else if (abstractC3572sfMo256K.mo21327q().isAtLeast(Lifecycle$State.CREATED)) {
                        c0413y.f4874b.m19085A(new C0282a(-1723985096, true, new zi3() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.2
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
                            public final Object invoke(Object obj2, Object obj3) {
                                ye1 ye1Var = (ye1) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C0413y c0413y2 = c0413y;
                                    ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = c0413y2.f4873a;
                                    boolean zM22124i = tj3Var.m22124i(c0413y2);
                                    Object objM22097O = tj3Var.m22097O();
                                    p84 p84Var = we1.f66679a;
                                    if (zM22124i || objM22097O == p84Var) {
                                        objM22097O = new WrappedComposition$setContent$1$2$1$1(c0413y2, null);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    d32.m10047k(tj3Var, (zi3) objM22097O, viewTreeObserverOnGlobalLayoutListenerC0391c);
                                    boolean zM22124i2 = tj3Var.m22124i(c0413y2);
                                    Object objM22097O2 = tj3Var.m22097O();
                                    if (zM22124i2 || objM22097O2 == p84Var) {
                                        objM22097O2 = new WrappedComposition$setContent$1$2$2$1(c0413y2, null);
                                        tj3Var.m22131l0(objM22097O2);
                                    }
                                    d32.m10047k(tj3Var, (zi3) objM22097O2, viewTreeObserverOnGlobalLayoutListenerC0391c);
                                    c0401m.m1800a(viewTreeObserverOnGlobalLayoutListenerC0391c, zi3Var2, tj3Var, 0);
                                } else {
                                    tj3Var.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }));
                    }
                }
                return xfa.f68157a;
            }
        });
    }
}
