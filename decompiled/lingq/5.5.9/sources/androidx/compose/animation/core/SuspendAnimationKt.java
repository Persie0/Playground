package androidx.compose.animation.core;

import androidx.compose.p017ui.platform.InterfaceC0655q0;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p081e0.C5300c0;
import p260m8.C7499b;
import p284o0.InterfaceC7887c;
import p338qd.C8573r0;
import p374s.AbstractC8911i;
import p374s.C8899c;
import p374s.C8903e;
import p374s.C8908g0;
import p374s.C8919m;
import p374s.C8937y;
import p374s.InterfaceC8895a;
import p374s.InterfaceC8901d;
import p374s.InterfaceC8906f0;
import p374s.InterfaceC8921n;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendAnimationKt {
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, s.c] */
    /* JADX INFO: renamed from: a */
    public static final <T, V extends AbstractC8911i> Object m1354a(final C8903e<T, V> c8903e, final InterfaceC8895a<T, V> interfaceC8895a, long j10, final InterfaceC2052l<? super C8899c<T, V>, C9072e> interfaceC2052l, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        final Ref$ObjectRef ref$ObjectRef;
        C8903e<T, V> c8903e2;
        InterfaceC2052l<? super C8899c<T, V>, C9072e> interfaceC2052l2;
        InterfaceC2052l<? super C8899c<T, V>, C9072e> interfaceC2052l3;
        Ref$ObjectRef ref$ObjectRef2;
        C8899c c8899c;
        C8899c c8899c2;
        InterfaceC2052l<Long, C9072e> interfaceC2052l4;
        InterfaceC8895a<T, V> interfaceC8895a2 = interfaceC8895a;
        if (interfaceC9968c instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) interfaceC9968c;
            int i10 = suspendAnimationKt$animate$4.f1557i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.f1557i = i10 - Integer.MIN_VALUE;
            } else {
                suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(interfaceC9968c);
            }
        } else {
            suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(interfaceC9968c);
        }
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$5 = suspendAnimationKt$animate$4;
        Object obj = suspendAnimationKt$animate$5.f1556h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = suspendAnimationKt$animate$5.f1557i;
        CoroutineContext coroutineContext = suspendAnimationKt$animate$5.f38105b;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            final T tMo17131f = interfaceC8895a2.mo17131f(0L);
            final AbstractC8911i abstractC8911iMo17129d = interfaceC8895a2.mo17129d(0L);
            ref$ObjectRef = new Ref$ObjectRef();
            try {
                if (j10 == Long.MIN_VALUE) {
                    C5207g.m11108c(coroutineContext);
                    final float fM1359f = m1359f(coroutineContext);
                    InterfaceC2052l<Long, C9072e> interfaceC2052l5 = new InterfaceC2052l<Long, C9072e>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Ls/c<TT;TV;>;>;TT;Ls/a<TT;TV;>;TV;Ls/e<TT;TV;>;FLcm/l<-Ls/c<TT;TV;>;Lsl/e;>;)V */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r15v2, types: [T, s.c] */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(Long l10) {
                            long jLongValue = l10.longValue();
                            T t10 = tMo17131f;
                            InterfaceC8895a<T, V> interfaceC8895a3 = interfaceC8895a;
                            InterfaceC8906f0 interfaceC8906f0Mo17128c = interfaceC8895a3.mo17128c();
                            AbstractC8911i abstractC8911i = abstractC8911iMo17129d;
                            Object objMo17132g = interfaceC8895a3.mo17132g();
                            final C8903e<T, V> c8903e3 = c8903e;
                            ?? c8899c3 = new C8899c(t10, interfaceC8906f0Mo17128c, abstractC8911i, jLongValue, objMo17132g, jLongValue, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C9072e mo807E() {
                                    c8903e3.f46803f = false;
                                    return C9072e.f47360a;
                                }
                            });
                            SuspendAnimationKt.m1358e(c8899c3, jLongValue, fM1359f, interfaceC8895a, c8903e, interfaceC2052l);
                            ref$ObjectRef.f38127a = c8899c3;
                            return C9072e.f47360a;
                        }
                    };
                    suspendAnimationKt$animate$5.f1552d = c8903e;
                    suspendAnimationKt$animate$5.f1553e = interfaceC8895a2;
                    interfaceC2052l2 = interfaceC2052l;
                    suspendAnimationKt$animate$5.f1554f = interfaceC2052l2;
                    suspendAnimationKt$animate$5.f1555g = ref$ObjectRef;
                    suspendAnimationKt$animate$5.f1557i = 1;
                    if (m1357d(interfaceC8895a2, interfaceC2052l5, suspendAnimationKt$animate$5) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    interfaceC2052l2 = interfaceC2052l;
                    try {
                        ?? r13 = (T) new C8899c(tMo17131f, interfaceC8895a.mo17128c(), abstractC8911iMo17129d, j10, interfaceC8895a.mo17132g(), j10, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C9072e mo807E() {
                                c8903e.f46803f = false;
                                return C9072e.f47360a;
                            }
                        });
                        C5207g.m11108c(coroutineContext);
                        ref$ObjectRef = ref$ObjectRef;
                        m1358e(r13, j10, m1359f(coroutineContext), interfaceC8895a, c8903e, interfaceC2052l);
                        ref$ObjectRef.f38127a = r13;
                    } catch (CancellationException e10) {
                        e = e10;
                        ref$ObjectRef = ref$ObjectRef;
                        c8903e2 = c8903e;
                        c8899c = (C8899c) ref$ObjectRef.f38127a;
                        if (c8899c != null) {
                            c8899c.f46795i.setValue(Boolean.FALSE);
                        }
                        c8899c2 = (C8899c) ref$ObjectRef.f38127a;
                        if (c8899c2 == null && c8899c2.f46793g == c8903e2.f46801d) {
                            c8903e2.f46803f = false;
                        }
                        throw e;
                    }
                }
                interfaceC2052l3 = interfaceC2052l2;
                c8903e2 = c8903e;
                ref$ObjectRef2 = ref$ObjectRef;
            } catch (CancellationException e11) {
                e = e11;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$ObjectRef ref$ObjectRef3 = suspendAnimationKt$animate$5.f1555g;
            interfaceC2052l3 = suspendAnimationKt$animate$5.f1554f;
            InterfaceC8895a<T, V> interfaceC8895a3 = suspendAnimationKt$animate$5.f1553e;
            c8903e2 = suspendAnimationKt$animate$5.f1552d;
            ref$ObjectRef2 = ref$ObjectRef3;
            try {
                C7499b.m14977z0(obj);
                interfaceC8895a2 = interfaceC8895a3;
            } catch (CancellationException e12) {
                e = e12;
                ref$ObjectRef = ref$ObjectRef2;
                c8899c = (C8899c) ref$ObjectRef.f38127a;
                if (c8899c != null) {
                    c8899c.f46795i.setValue(Boolean.FALSE);
                }
                c8899c2 = (C8899c) ref$ObjectRef.f38127a;
                if (c8899c2 == null && c8899c2.f46793g == c8903e2.f46801d) {
                    c8903e2.f46803f = false;
                }
                throw e;
            }
        }
        do {
            T t10 = ref$ObjectRef2.f38127a;
            C5207g.m11108c(t10);
            if (!((Boolean) ((C8899c) t10).f46795i.getValue()).booleanValue()) {
                return C9072e.f47360a;
            }
            C5207g.m11108c(coroutineContext);
            final float fM1359f2 = m1359f(coroutineContext);
            final Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
            final InterfaceC8895a<T, V> interfaceC8895a4 = interfaceC8895a2;
            final C8903e<T, V> c8903e3 = c8903e2;
            final InterfaceC2052l<? super C8899c<T, V>, C9072e> interfaceC2052l6 = interfaceC2052l3;
            interfaceC2052l4 = new InterfaceC2052l<Long, C9072e>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Long l10) {
                    long jLongValue = l10.longValue();
                    T t11 = ref$ObjectRef4.f38127a;
                    C5207g.m11108c(t11);
                    SuspendAnimationKt.m1358e((C8899c) t11, jLongValue, fM1359f2, interfaceC8895a4, c8903e3, interfaceC2052l6);
                    return C9072e.f47360a;
                }
            };
            suspendAnimationKt$animate$5.f1552d = c8903e2;
            suspendAnimationKt$animate$5.f1553e = interfaceC8895a2;
            suspendAnimationKt$animate$5.f1554f = interfaceC2052l3;
            suspendAnimationKt$animate$5.f1555g = ref$ObjectRef2;
            suspendAnimationKt$animate$5.f1557i = 2;
        } while (m1357d(interfaceC8895a2, interfaceC2052l4, suspendAnimationKt$animate$5) != coroutineSingletons);
        return coroutineSingletons;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public static Object m1355b(float f3, InterfaceC8901d interfaceC8901d, final InterfaceC2056p interfaceC2056p, InterfaceC9968c interfaceC9968c) throws Throwable {
        final C8908g0 c8908g0 = VectorConvertersKt.f1626a;
        Comparable f10 = new Float(0.0f);
        Float f11 = new Float(f3);
        AbstractC8911i abstractC8911iM16686M0 = (AbstractC8911i) c8908g0.f46812a.mo528n((T) new Float(0.0f));
        if (abstractC8911iM16686M0 == null) {
            abstractC8911iM16686M0 = C8573r0.m16686M0((AbstractC8911i) c8908g0.f46812a.mo528n((T) f10));
        }
        AbstractC8911i abstractC8911i = abstractC8911iM16686M0;
        Object objM1354a = m1354a(new C8903e(c8908g0, f10, abstractC8911i, 56), new C8937y(interfaceC8901d, c8908g0, f10, f11, abstractC8911i), Long.MIN_VALUE, new InterfaceC2052l<C8899c<Object, Object>, C9072e>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C8899c<Object, Object> c8899c) {
                C8899c<Object, Object> c8899c2 = c8899c;
                C5207g.m11111f(c8899c2, "$this$animate");
                interfaceC2056p.mo1337m0(c8899c2.m17133a(), c8908g0.mo17141b().mo528n(c8899c2.f46792f));
                return C9072e.f47360a;
            }
        }, interfaceC9968c);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM1354a != coroutineSingletons) {
            objM1354a = C9072e.f47360a;
        }
        return objM1354a == coroutineSingletons ? objM1354a : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: c */
    public static Object m1356c(C8903e c8903e, InterfaceC8921n interfaceC8921n, InterfaceC2052l interfaceC2052l, InterfaceC9968c interfaceC9968c) throws Throwable {
        Object objM1354a = m1354a(c8903e, new C8919m(interfaceC8921n, c8903e.f46798a, c8903e.getValue(), c8903e.f46800c), Long.MIN_VALUE, interfaceC2052l, interfaceC9968c);
        return objM1354a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1354a : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: d */
    public static final <R, T, V extends AbstractC8911i> Object m1357d(InterfaceC8895a<T, V> interfaceC8895a, final InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c) {
        if (!interfaceC8895a.mo17126a()) {
            return C5300c0.m11449b(new InterfaceC2052l<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Object mo528n(Long l10) {
                    return interfaceC2052l.mo528n(Long.valueOf(l10.longValue() / 1));
                }
            }, interfaceC9968c);
        }
        CoroutineContext coroutineContext = ((ContinuationImpl) interfaceC9968c).f38105b;
        C5207g.m11108c(coroutineContext);
        InterfaceC0655q0 interfaceC0655q0 = (InterfaceC0655q0) coroutineContext.mo1474w(InterfaceC0655q0.a.f4335a);
        if (interfaceC0655q0 == null) {
            return C5300c0.m11449b(interfaceC2052l, interfaceC9968c);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(interfaceC2052l, null);
        return interfaceC0655q0.m2453B0();
    }

    /* JADX INFO: renamed from: e */
    public static final <T, V extends AbstractC8911i> void m1358e(C8899c<T, V> c8899c, long j10, float f3, InterfaceC8895a<T, V> interfaceC8895a, C8903e<T, V> c8903e, InterfaceC2052l<? super C8899c<T, V>, C9072e> interfaceC2052l) {
        long jMo17127b = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)) == 0 ? interfaceC8895a.mo17127b() : (long) ((j10 - c8899c.f46789c) / f3);
        c8899c.f46793g = j10;
        c8899c.f46791e.setValue(interfaceC8895a.mo17131f(jMo17127b));
        V v10 = (V) interfaceC8895a.mo17129d(jMo17127b);
        C5207g.m11111f(v10, "<set-?>");
        c8899c.f46792f = v10;
        if (interfaceC8895a.m17130e(jMo17127b)) {
            c8899c.f46794h = c8899c.f46793g;
            c8899c.f46795i.setValue(Boolean.FALSE);
        }
        m1360g(c8899c, c8903e);
        interfaceC2052l.mo528n(c8899c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static final float m1359f(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "<this>");
        int i10 = InterfaceC7887c.f43001C;
        InterfaceC7887c interfaceC7887c = (InterfaceC7887c) coroutineContext.mo1474w(InterfaceC7887c.a.f43002a);
        float fMo1472d0 = interfaceC7887c != null ? interfaceC7887c.mo1472d0() : 1.0f;
        if (fMo1472d0 >= 0.0f) {
            return fMo1472d0;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX INFO: renamed from: g */
    public static final <T, V extends AbstractC8911i> void m1360g(C8899c<T, V> c8899c, C8903e<T, V> c8903e) {
        C5207g.m11111f(c8899c, "<this>");
        C5207g.m11111f(c8903e, "state");
        c8903e.f46799b.setValue(c8899c.m17133a());
        V v10 = c8903e.f46800c;
        V v11 = c8899c.f46792f;
        C5207g.m11111f(v10, "<this>");
        C5207g.m11111f(v11, "source");
        int iMo17136b = v10.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            v10.mo17139e(i10, v11.mo17135a(i10));
        }
        c8903e.f46802e = c8899c.f46794h;
        c8903e.f46801d = c8899c.f46793g;
        c8903e.f46803f = ((Boolean) c8899c.f46795i.getValue()).booleanValue();
    }
}
