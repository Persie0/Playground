package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0063e;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3081hn;
import p000.C0817bn;
import p000.C3386nv;
import p000.C3838zm;
import p000.InterfaceC0025an;
import p000.InterfaceC3579sm;
import p000.b34;
import p000.e32;
import p000.e41;
import p000.f32;
import p000.fa4;
import p000.jda;
import p000.ji7;
import p000.jo9;
import p000.kl3;
import p000.kn1;
import p000.kv4;
import p000.or9;
import p000.pk9;
import p000.ss5;
import p000.vi3;
import p000.wx8;
import p000.xc9;
import p000.xfa;
import p000.z26;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.animation.core.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0063e {
    /* JADX INFO: renamed from: a */
    public static final Object m754a(float f, float f2, float f3, InterfaceC0025an interfaceC0025an, zi3 zi3Var, SuspendLambda suspendLambda) throws Throwable {
        jda jdaVar = pk9.f56363h;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        vi3 vi3Var = jdaVar.f45442a;
        AbstractC3081hn abstractC3081hnMo10485c = (AbstractC3081hn) vi3Var.invoke(f6);
        if (abstractC3081hnMo10485c == null) {
            abstractC3081hnMo10485c = ((AbstractC3081hn) vi3Var.invoke(f4)).mo10485c();
        }
        AbstractC3081hn abstractC3081hn = abstractC3081hnMo10485c;
        Object objM755b = m755b(new C0817bn(jdaVar, f4, abstractC3081hn, 56), new or9(interfaceC0025an, jdaVar, f4, f5, abstractC3081hn), Long.MIN_VALUE, new kv4(zi3Var, 26), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        xfa xfaVar = xfa.f68157a;
        if (objM755b != coroutineSingletons) {
            objM755b = xfaVar;
        }
        return objM755b == coroutineSingletons ? objM755b : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX WARN: Code duplicated, block: B:68:0x016e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public static final Object m755b(C0817bn c0817bn, InterfaceC3579sm interfaceC3579sm, long j, final vi3 vi3Var, ContinuationImpl continuationImpl) throws Throwable {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        final Ref$ObjectRef ref$ObjectRef;
        final C0817bn c0817bn2;
        C0817bn c0817bn3;
        Ref$ObjectRef ref$ObjectRef2;
        Object objMo1250e;
        vi3 vi3Var2;
        C3838zm c3838zm;
        C3838zm c3838zm2;
        Object objMo1250e2;
        final InterfaceC3579sm interfaceC3579sm2 = interfaceC3579sm;
        if (continuationImpl instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) continuationImpl;
            int i = suspendAnimationKt$animate$4.f1533f;
            if ((i & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.f1533f = i - Integer.MIN_VALUE;
            } else {
                suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(continuationImpl);
            }
        } else {
            suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(continuationImpl);
        }
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$5 = suspendAnimationKt$animate$4;
        Object obj = suspendAnimationKt$animate$5.f1532e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = suspendAnimationKt$animate$5.f1533f;
        int i3 = 9;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            final Object objMo10821g = interfaceC3579sm2.mo10821g(0L);
            final AbstractC3081hn abstractC3081hnMo10820e = interfaceC3579sm2.mo10820e(0L);
            ref$ObjectRef = new Ref$ObjectRef();
            if (j == Long.MIN_VALUE) {
                try {
                    final float fM761h = m761h(suspendAnimationKt$animate$5.getContext());
                    c0817bn2 = c0817bn;
                    try {
                        vi3 vi3Var3 = new vi3() { // from class: io9
                            @Override // p000.vi3
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                InterfaceC3579sm interfaceC3579sm3 = interfaceC3579sm2;
                                jda jdaVarMo10819d = interfaceC3579sm3.mo10819d();
                                Object objMo10822h = interfaceC3579sm3.mo10822h();
                                C0817bn c0817bn4 = c0817bn2;
                                C3838zm c3838zm3 = new C3838zm(objMo10821g, jdaVarMo10819d, abstractC3081hnMo10820e, jLongValue, objMo10822h, jLongValue, new jo9(1, c0817bn4));
                                AbstractC0063e.m760g(c3838zm3, jLongValue, fM761h, interfaceC3579sm3, c0817bn4, vi3Var);
                                ref$ObjectRef.f47718a = c3838zm3;
                                return xfa.f68157a;
                            }
                        };
                        ref$ObjectRef2 = ref$ObjectRef;
                        try {
                            suspendAnimationKt$animate$5.f1528a = c0817bn2;
                            suspendAnimationKt$animate$5.f1529b = interfaceC3579sm2;
                            suspendAnimationKt$animate$5.f1530c = vi3Var;
                            suspendAnimationKt$animate$5.f1531d = ref$ObjectRef2;
                            suspendAnimationKt$animate$5.f1533f = 1;
                            if (interfaceC3579sm2.mo10817b()) {
                                objMo1250e = fa4.m11637K(vi3Var3, suspendAnimationKt$animate$5);
                            } else {
                                objMo1250e = b34.m3250q(suspendAnimationKt$animate$5.getContext()).mo1250e(new kl3(vi3Var3, i3), suspendAnimationKt$animate$5);
                            }
                            if (objMo1250e != coroutineSingletons) {
                                c0817bn3 = c0817bn2;
                                vi3Var2 = vi3Var;
                                ref$ObjectRef = ref$ObjectRef2;
                            }
                            return coroutineSingletons;
                        } catch (CancellationException e) {
                            e = e;
                            c0817bn3 = c0817bn2;
                            ref$ObjectRef = ref$ObjectRef2;
                            c3838zm = (C3838zm) ref$ObjectRef.f47718a;
                            if (c3838zm != null) {
                                ((xc9) c3838zm.f71733i).setValue(Boolean.FALSE);
                            }
                            c3838zm2 = (C3838zm) ref$ObjectRef.f47718a;
                            if (c3838zm2 != null) {
                                c0817bn3.f8708f = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        c0817bn3 = c0817bn2;
                        c3838zm = (C3838zm) ref$ObjectRef.f47718a;
                        if (c3838zm != null) {
                            ((xc9) c3838zm.f71733i).setValue(Boolean.FALSE);
                        }
                        c3838zm2 = (C3838zm) ref$ObjectRef.f47718a;
                        if (c3838zm2 != null) {
                            c0817bn3.f8708f = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    c0817bn2 = c0817bn;
                }
            } else {
                ref$ObjectRef2 = ref$ObjectRef;
                try {
                    C3838zm c3838zm3 = new C3838zm(objMo10821g, interfaceC3579sm2.mo10819d(), abstractC3081hnMo10820e, j, interfaceC3579sm2.mo10822h(), j, new jo9(0, c0817bn));
                    m760g(c3838zm3, j, m761h(suspendAnimationKt$animate$5.getContext()), interfaceC3579sm2, c0817bn, vi3Var);
                    ref$ObjectRef2.f47718a = c3838zm3;
                    c0817bn3 = c0817bn;
                    interfaceC3579sm2 = interfaceC3579sm;
                    vi3Var2 = vi3Var;
                    ref$ObjectRef = ref$ObjectRef2;
                } catch (CancellationException e4) {
                    e = e4;
                    c0817bn3 = c0817bn;
                    ref$ObjectRef = ref$ObjectRef2;
                    c3838zm = (C3838zm) ref$ObjectRef.f47718a;
                    if (c3838zm != null) {
                        ((xc9) c3838zm.f71733i).setValue(Boolean.FALSE);
                    }
                    c3838zm2 = (C3838zm) ref$ObjectRef.f47718a;
                    if (c3838zm2 != null) {
                        c0817bn3.f8708f = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = suspendAnimationKt$animate$5.f1531d;
            vi3Var2 = suspendAnimationKt$animate$5.f1530c;
            interfaceC3579sm2 = suspendAnimationKt$animate$5.f1529b;
            c0817bn3 = suspendAnimationKt$animate$5.f1528a;
            try {
                AbstractC3193b.m15359b(obj);
            } catch (CancellationException e5) {
                e = e5;
                c3838zm = (C3838zm) ref$ObjectRef.f47718a;
                if (c3838zm != null) {
                    ((xc9) c3838zm.f71733i).setValue(Boolean.FALSE);
                }
                c3838zm2 = (C3838zm) ref$ObjectRef.f47718a;
                if (c3838zm2 != null) {
                    c0817bn3.f8708f = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = ref$ObjectRef.f47718a;
            obj2.getClass();
            if (!((Boolean) ((xc9) ((C3838zm) obj2).f71733i).getValue()).booleanValue()) {
                return xfa.f68157a;
            }
            final float fM761h2 = m761h(suspendAnimationKt$animate$5.getContext());
            final Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
            final vi3 vi3Var4 = vi3Var2;
            final InterfaceC3579sm interfaceC3579sm3 = interfaceC3579sm2;
            final C0817bn c0817bn4 = c0817bn3;
            try {
                vi3 vi3Var5 = new vi3() { // from class: ko9
                    @Override // p000.vi3
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = ref$ObjectRef3.f47718a;
                        obj4.getClass();
                        AbstractC0063e.m760g((C3838zm) obj4, jLongValue, fM761h2, interfaceC3579sm3, c0817bn4, vi3Var4);
                        return xfa.f68157a;
                    }
                };
                ref$ObjectRef = ref$ObjectRef3;
                interfaceC3579sm2 = interfaceC3579sm3;
                c0817bn3 = c0817bn4;
                vi3Var2 = vi3Var4;
                suspendAnimationKt$animate$5.f1528a = c0817bn3;
                suspendAnimationKt$animate$5.f1529b = interfaceC3579sm2;
                suspendAnimationKt$animate$5.f1530c = vi3Var2;
                suspendAnimationKt$animate$5.f1531d = ref$ObjectRef;
                suspendAnimationKt$animate$5.f1533f = 2;
                if (interfaceC3579sm2.mo10817b()) {
                    objMo1250e2 = fa4.m11637K(vi3Var5, suspendAnimationKt$animate$5);
                } else {
                    objMo1250e2 = b34.m3250q(suspendAnimationKt$animate$5.getContext()).mo1250e(new kl3(vi3Var5, i3), suspendAnimationKt$animate$5);
                }
            } catch (CancellationException e6) {
                e = e6;
                ref$ObjectRef = ref$ObjectRef3;
                c0817bn3 = c0817bn4;
                c3838zm = (C3838zm) ref$ObjectRef.f47718a;
                if (c3838zm != null) {
                    ((xc9) c3838zm.f71733i).setValue(Boolean.FALSE);
                }
                c3838zm2 = (C3838zm) ref$ObjectRef.f47718a;
                if (c3838zm2 != null && c3838zm2.f71731g == c0817bn3.f8706d) {
                    c0817bn3.f8708f = false;
                }
                throw e;
            }
        } while (objMo1250e2 != coroutineSingletons);
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m756c(float f, InterfaceC0025an interfaceC0025an, zi3 zi3Var, SuspendLambda suspendLambda, int i) {
        if ((i & 8) != 0) {
            interfaceC0025an = ss5.m21698Y(0.0f, 0.0f, null, 7);
        }
        return m754a(0.0f, f, 0.0f, interfaceC0025an, zi3Var, suspendLambda);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m757d(C0817bn c0817bn, f32 f32Var, boolean z, vi3 vi3Var, ContinuationImpl continuationImpl) throws Throwable {
        Object objM755b = m755b(c0817bn, new e32(f32Var, c0817bn.f8703a, ((xc9) c0817bn.f8704b).getValue(), c0817bn.f8705c), z ? c0817bn.f8706d : Long.MIN_VALUE, vi3Var, continuationImpl);
        return objM755b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM755b : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m758e(C0817bn c0817bn, Float f, InterfaceC0025an interfaceC0025an, boolean z, vi3 vi3Var, ContinuationImpl continuationImpl) throws Throwable {
        Object objM755b = m755b(c0817bn, new or9(interfaceC0025an, c0817bn.f8703a, ((xc9) c0817bn.f8704b).getValue(), f, c0817bn.f8705c), z ? c0817bn.f8706d : Long.MIN_VALUE, vi3Var, continuationImpl);
        return objM755b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM755b : xfa.f68157a;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m759f(C0817bn c0817bn, Float f, InterfaceC0025an interfaceC0025an, boolean z, vi3 vi3Var, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            interfaceC0025an = ss5.m21698Y(0.0f, 0.0f, null, 7);
        }
        InterfaceC0025an interfaceC0025an2 = interfaceC0025an;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            vi3Var = new wx8(3);
        }
        return m758e(c0817bn, f, interfaceC0025an2, z2, vi3Var, continuationImpl);
    }

    /* JADX INFO: renamed from: g */
    public static final void m760g(C3838zm c3838zm, long j, float f, InterfaceC3579sm interfaceC3579sm, C0817bn c0817bn, vi3 vi3Var) {
        long jMo10818c = f == 0.0f ? interfaceC3579sm.mo10818c() : (long) ((j - c3838zm.f71727c) / f);
        c3838zm.f71731g = j;
        ((xc9) c3838zm.f71729e).setValue(interfaceC3579sm.mo10821g(jMo10818c));
        c3838zm.f71730f = interfaceC3579sm.mo10820e(jMo10818c);
        if (interfaceC3579sm.m21452f(jMo10818c)) {
            c3838zm.f71732h = c3838zm.f71731g;
            ((xc9) c3838zm.f71733i).setValue(Boolean.FALSE);
        }
        m762i(c3838zm, c0817bn);
        vi3Var.invoke(c3838zm);
    }

    /* JADX INFO: renamed from: h */
    public static final float m761h(kn1 kn1Var) {
        z26 z26Var = (z26) kn1Var.get(e41.f36681f);
        float fMo1819A = z26Var != null ? z26Var.mo1819A() : 1.0f;
        if (fMo1819A >= 0.0f) {
            return fMo1819A;
        }
        ji7.m14492b("negative scale factor");
        return fMo1819A;
    }

    /* JADX INFO: renamed from: i */
    public static final void m762i(C3838zm c3838zm, C0817bn c0817bn) {
        ((xc9) c0817bn.f8704b).setValue(((xc9) c3838zm.f71729e).getValue());
        AbstractC3081hn abstractC3081hn = c0817bn.f8705c;
        AbstractC3081hn abstractC3081hn2 = c3838zm.f71730f;
        int iMo10484b = abstractC3081hn.mo10484b();
        for (int i = 0; i < iMo10484b; i++) {
            abstractC3081hn.mo10487e(i, abstractC3081hn2.mo10483a(i));
        }
        c0817bn.f8707e = c3838zm.f71732h;
        c0817bn.f8706d = c3838zm.f71731g;
        c0817bn.f8708f = ((Boolean) ((xc9) c3838zm.f71733i).getValue()).booleanValue();
    }
}
