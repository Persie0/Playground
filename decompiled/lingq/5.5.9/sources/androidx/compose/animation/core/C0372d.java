package androidx.compose.animation.core;

import androidx.compose.animation.EnterExitState;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import dm.C5207g;
import dm.C5212l;
import p003a2.C0009a;
import p081e0.C5329p;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p374s.C8896a0;
import p374s.C8898b0;
import p374s.C8900c0;
import p374s.C8902d0;
import p374s.C8908g0;
import p374s.C8934v;
import p374s.C8938z;
import p374s.InterfaceC8929r;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.animation.core.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0372d {
    /* JADX INFO: renamed from: a */
    public static final Transition m1389a(final Transition transition, EnterExitState enterExitState, EnterExitState enterExitState2, InterfaceC0476a interfaceC0476a, int i10) {
        C5207g.m11111f(transition, "<this>");
        interfaceC0476a.mo1622c(-198307638);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(transition);
        Object objMo1624d = interfaceC0476a.mo1624d();
        Object obj = InterfaceC0476a.a.f3122a;
        if (zMo1665y || objMo1624d == obj) {
            objMo1624d = new Transition(new C8934v(enterExitState), C0009a.m23l(new StringBuilder(), transition.f1574b, " > EnterExitTransition"));
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        final Transition transition2 = (Transition) objMo1624d;
        interfaceC0476a.mo1622c(511388516);
        boolean zMo1665y2 = interfaceC0476a.mo1665y(transition) | interfaceC0476a.mo1665y(transition2);
        Object objMo1624d2 = interfaceC0476a.mo1624d();
        if (zMo1665y2 || objMo1624d2 == obj) {
            objMo1624d2 = new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    Transition<Object> transition3 = transition;
                    transition3.getClass();
                    Transition<?> transition4 = transition2;
                    C5207g.m11111f(transition4, "transition");
                    transition3.f1581i.add(transition4);
                    return new C8938z(transition3, transition4);
                }
            };
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        C5333r.m11459a(transition2, (InterfaceC2052l) objMo1624d2, interfaceC0476a);
        if (transition.m1365e()) {
            transition2.m1368h(transition.f1583k, enterExitState, enterExitState2);
        } else {
            transition2.m1369i(enterExitState2, interfaceC0476a, ((i10 >> 3) & 8) | ((i10 >> 6) & 14));
            transition2.f1582j.setValue(Boolean.FALSE);
        }
        interfaceC0476a.mo1661w();
        return transition2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public static final Transition.C0364a m1390b(final Transition transition, C8908g0 c8908g0, String str, InterfaceC0476a interfaceC0476a) {
        Transition.C0364a.a aVar;
        C5207g.m11111f(transition, "<this>");
        C5207g.m11111f(c8908g0, "typeConverter");
        interfaceC0476a.mo1622c(-1714122528);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(transition);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
            objMo1624d = new Transition.C0364a(transition, c8908g0, str);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        final Transition.C0364a c0364a = (Transition.C0364a) objMo1624d;
        C5333r.m11459a(c0364a, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC5327o mo528n(C5329p c5329p) {
                C5207g.m11111f(c5329p, "$this$DisposableEffect");
                return new C8896a0(transition, c0364a);
            }
        }, interfaceC0476a);
        if (transition.m1365e() && (aVar = (Transition.C0364a.a) c0364a.f1587c.getValue()) != null) {
            InterfaceC2052l<? super S, ? extends T> interfaceC2052l = aVar.f1591c;
            Transition<S> transition2 = c0364a.f1588d;
            aVar.f1589a.m1378h((T) interfaceC2052l.mo528n((Object) transition2.m1363c().mo1372a()), (T) aVar.f1591c.mo528n((Object) transition2.m1363c().mo1374c()), (InterfaceC8929r<T>) ((InterfaceC8929r) aVar.f1590b.mo528n(transition2.m1363c())));
        }
        interfaceC0476a.mo1661w();
        return c0364a;
    }

    /* JADX INFO: renamed from: c */
    public static final Transition.C0368d m1391c(final Transition transition, Object obj, Object obj2, InterfaceC8929r interfaceC8929r, C8908g0 c8908g0, String str, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(transition, "<this>");
        C5207g.m11111f(interfaceC8929r, "animationSpec");
        C5207g.m11111f(c8908g0, "typeConverter");
        C5207g.m11111f(str, "label");
        interfaceC0476a.mo1622c(-304821198);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(transition);
        Object objMo1624d = interfaceC0476a.mo1624d();
        Object obj3 = InterfaceC0476a.a.f3122a;
        if (zMo1665y || objMo1624d == obj3) {
            objMo1624d = new Transition.C0368d(transition, obj, C5212l.m11135G(c8908g0, obj2), c8908g0, str);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        final Transition.C0368d c0368d = (Transition.C0368d) objMo1624d;
        if (transition.m1365e()) {
            c0368d.m1378h(obj, obj2, interfaceC8929r);
        } else {
            c0368d.m1379i(obj2, interfaceC8929r);
        }
        interfaceC0476a.mo1622c(511388516);
        boolean zMo1665y2 = interfaceC0476a.mo1665y(transition) | interfaceC0476a.mo1665y(c0368d);
        Object objMo1624d2 = interfaceC0476a.mo1624d();
        if (zMo1665y2 || objMo1624d2 == obj3) {
            objMo1624d2 = new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    Transition<Object> transition2 = transition;
                    transition2.getClass();
                    Transition<Object>.C0368d<?, ?> c0368d2 = c0368d;
                    C5207g.m11111f(c0368d2, "animation");
                    transition2.f1580h.add(c0368d2);
                    return new C8898b0(transition2, c0368d2);
                }
            };
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        C5333r.m11459a(c0368d, (InterfaceC2052l) objMo1624d2, interfaceC0476a);
        interfaceC0476a.mo1661w();
        return c0368d;
    }

    /* JADX INFO: renamed from: d */
    public static final Transition m1392d(Boolean bool, String str, InterfaceC0476a interfaceC0476a, int i10) {
        interfaceC0476a.mo1622c(2029166765);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d = interfaceC0476a.mo1624d();
        Object obj = InterfaceC0476a.a.f3122a;
        if (objMo1624d == obj) {
            objMo1624d = new Transition(new C8934v(bool), str);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        final Transition transition = (Transition) objMo1624d;
        transition.m1361a(bool, interfaceC0476a, (i10 & 8) | 48 | (i10 & 14));
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(transition);
        Object objMo1624d2 = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d2 == obj) {
            objMo1624d2 = new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    return new C8900c0(transition);
                }
            };
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        C5333r.m11459a(transition, (InterfaceC2052l) objMo1624d2, interfaceC0476a);
        interfaceC0476a.mo1661w();
        return transition;
    }

    /* JADX INFO: renamed from: e */
    public static final Transition m1393e(C8934v c8934v, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(c8934v, "transitionState");
        interfaceC0476a.mo1622c(882913843);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(c8934v);
        Object objMo1624d = interfaceC0476a.mo1624d();
        Object obj = InterfaceC0476a.a.f3122a;
        if (zMo1665y || objMo1624d == obj) {
            objMo1624d = new Transition(c8934v, "DropDownMenu");
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        final Transition transition = (Transition) objMo1624d;
        transition.m1361a(c8934v.f46859b.getValue(), interfaceC0476a, 0);
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y2 = interfaceC0476a.mo1665y(transition);
        Object objMo1624d2 = interfaceC0476a.mo1624d();
        if (zMo1665y2 || objMo1624d2 == obj) {
            objMo1624d2 = new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    return new C8902d0(transition);
                }
            };
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        C5333r.m11459a(transition, (InterfaceC2052l) objMo1624d2, interfaceC0476a);
        interfaceC0476a.mo1661w();
        return transition;
    }
}
