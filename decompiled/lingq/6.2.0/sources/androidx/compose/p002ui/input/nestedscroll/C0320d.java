package androidx.compose.p002ui.input.nestedscroll;

import androidx.compose.p002ui.node.C0357g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.d16;
import p000.dpa;
import p000.ea2;
import p000.fa2;
import p000.fa4;
import p000.gq6;
import p000.i54;
import p000.ir9;
import p000.k40;
import p000.pba;
import p000.pj6;
import p000.qba;
import p000.te1;
import p000.un1;
import p000.vi3;
import p000.vz1;
import p000.x66;

/* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0320d extends d16 implements pba, pj6 {

    /* JADX INFO: renamed from: J */
    public pj6 f4089J;

    /* JADX INFO: renamed from: K */
    public C0317a f4090K;

    /* JADX INFO: renamed from: L */
    public C0320d f4091L;

    /* JADX INFO: renamed from: M */
    public final String f4092M;

    public C0320d(pj6 pj6Var, C0317a c0317a) {
        this.f4089J = pj6Var;
        this.f4090K = c0317a == null ? new C0317a() : c0317a;
        this.f4092M = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: P */
    public final long mo1183P(int i, long j) {
        C0320d c0320dM1452a1 = this.f34836I ? m1452a1() : null;
        long jMo1183P = c0320dM1452a1 != null ? c0320dM1452a1.mo1183P(i, j) : 0L;
        return gq6.m12825f(jMo1183P, this.f4089J.mo1183P(i, gq6.m12824e(j, jMo1183P)));
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        C0317a c0317a = this.f4090K;
        c0317a.f4083a = this;
        c0317a.f4084b = null;
        this.f4091L = null;
        c0317a.f4085c = new NestedScrollNode$updateDispatcherFields$1(this);
        c0317a.f4086d = m9971N0();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        qba.m19853e(this, new vi3() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                boolean z;
                ea2 ea2Var = (pba) obj;
                if (((d16) ea2Var).f34837a.f34836I) {
                    ref$ObjectRef.f47718a = ea2Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        C0320d c0320d = (C0320d) ((pba) ref$ObjectRef.f47718a);
        this.f4091L = c0320d;
        C0317a c0317a = this.f4090K;
        c0317a.f4084b = c0320d;
        if (c0317a.f4083a == this) {
            c0317a.f4083a = null;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final un1 m1451Z0() {
        C0320d c0320dM1452a1 = m1452a1();
        un1 un1VarM1451Z0 = c0320dM1452a1 != null ? c0320dM1452a1.m1451Z0() : null;
        if (un1VarM1451Z0 != null && vz1.m23603I(un1VarM1451Z0)) {
            return un1VarM1451Z0;
        }
        un1 un1Var = this.f4090K.f4086d;
        if (un1Var != null) {
            return un1Var;
        }
        C3386nv.m17633t("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public final C0320d m1452a1() {
        k40 k40Var;
        pba pbaVar = null;
        if (!this.f34836I) {
            return null;
        }
        if (!this.f34837a.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var = this.f34837a.f34841e;
        C0357g c0357gM21979L = te1.m21979L(this);
        loop0: while (c0357gM21979L != null) {
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 262144) != 0) {
                while (d16Var != null) {
                    if ((d16Var.f34839c & 262144) != 0) {
                        d16 d16VarM21992f = d16Var;
                        x66 x66Var = null;
                        while (d16VarM21992f != null) {
                            if (d16VarM21992f instanceof pba) {
                                pba pbaVar2 = (pba) d16VarM21992f;
                                if (fa4.m11650l(this.f4092M, pbaVar2.mo956r()) && C0320d.class == pbaVar2.getClass()) {
                                    pbaVar = pbaVar2;
                                    break loop0;
                                }
                            }
                            if ((d16VarM21992f.f34839c & 262144) != 0 && (d16VarM21992f instanceof fa2)) {
                                int i = 0;
                                for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                    if ((d16Var2.f34839c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            d16VarM21992f = d16Var2;
                                        } else {
                                            if (x66Var == null) {
                                                x66Var = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f != null) {
                                                x66Var.m24305c(d16VarM21992f);
                                                d16VarM21992f = null;
                                            }
                                            x66Var.m24305c(d16Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            d16VarM21992f = te1.m21992f(x66Var);
                        }
                    }
                    d16Var = d16Var.f34841e;
                }
            }
            c0357gM21979L = c0357gM21979L.m1610w();
            d16Var = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
        }
        return (C0320d) pbaVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r1) goto L27;
     */
    @Override // p000.pj6
    /* JADX INFO: renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1198p0(long j, Continuation continuation) throws Throwable {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        long j2;
        long j3;
        if (continuation instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) continuation;
            int i = nestedScrollNode$onPreFling$1.f4080d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.f4080d = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, (ContinuationImpl) continuation);
            }
        } else {
            nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, (ContinuationImpl) continuation);
        }
        Object objMo1198p0 = nestedScrollNode$onPreFling$1.f4078b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollNode$onPreFling$1.f4080d;
        if (i2 != 0) {
            if (i2 == 1) {
                j = nestedScrollNode$onPreFling$1.f4077a;
                AbstractC3193b.m15359b(objMo1198p0);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = nestedScrollNode$onPreFling$1.f4077a;
                AbstractC3193b.m15359b(objMo1198p0);
            }
            return new dpa(dpa.m10574e(j3, ((dpa) objMo1198p0).f36010a));
        }
        AbstractC3193b.m15359b(objMo1198p0);
        C0320d c0320dM1452a1 = this.f34836I ? m1452a1() : null;
        if (c0320dM1452a1 != null) {
            nestedScrollNode$onPreFling$1.f4077a = j;
            nestedScrollNode$onPreFling$1.f4080d = 1;
            objMo1198p0 = c0320dM1452a1.mo1198p0(j, nestedScrollNode$onPreFling$1);
        } else {
            j2 = 0;
            pj6 pj6Var = this.f4089J;
            long jM10573d = dpa.m10573d(j, j2);
            nestedScrollNode$onPreFling$1.f4077a = j2;
            nestedScrollNode$onPreFling$1.f4080d = 2;
            objMo1198p0 = pj6Var.mo1198p0(jM10573d, nestedScrollNode$onPreFling$1);
            if (objMo1198p0 != coroutineSingletons) {
                j3 = j2;
                return new dpa(dpa.m10574e(j3, ((dpa) objMo1198p0).f36010a));
            }
        }
        return coroutineSingletons;
        j2 = ((dpa) objMo1198p0).f36010a;
        pj6 pj6Var2 = this.f4089J;
        long jM10573d2 = dpa.m10573d(j, j2);
        nestedScrollNode$onPreFling$1.f4077a = j2;
        nestedScrollNode$onPreFling$1.f4080d = 2;
        objMo1198p0 = pj6Var2.mo1198p0(jM10573d2, nestedScrollNode$onPreFling$1);
        if (objMo1198p0 != coroutineSingletons) {
            j3 = j2;
            return new dpa(dpa.m10574e(j3, ((dpa) objMo1198p0).f36010a));
        }
        return coroutineSingletons;
    }

    @Override // p000.pba
    /* JADX INFO: renamed from: r */
    public final Object mo956r() {
        return this.f4092M;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p000.pj6
    /* JADX INFO: renamed from: t */
    public final Object mo919t(long j, long j2, Continuation continuation) throws Throwable {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        long j3;
        long j4;
        long j5;
        long j6;
        if (continuation instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) continuation;
            int i = nestedScrollNode$onPostFling$1.f4076e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.f4076e = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, (ContinuationImpl) continuation);
            }
        } else {
            nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, (ContinuationImpl) continuation);
        }
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$2 = nestedScrollNode$onPostFling$1;
        Object objMo919t = nestedScrollNode$onPostFling$2.f4074c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollNode$onPostFling$2.f4076e;
        C0320d c0320dM1452a1 = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objMo919t);
            pj6 pj6Var = this.f4089J;
            nestedScrollNode$onPostFling$2.f4072a = j;
            nestedScrollNode$onPostFling$2.f4073b = j2;
            nestedScrollNode$onPostFling$2.f4076e = 1;
            objMo919t = pj6Var.mo919t(j, j2, nestedScrollNode$onPostFling$2);
            if (objMo919t != coroutineSingletons) {
                j3 = j2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            long j7 = nestedScrollNode$onPostFling$2.f4073b;
            long j8 = nestedScrollNode$onPostFling$2.f4072a;
            AbstractC3193b.m15359b(objMo919t);
            j3 = j7;
            j = j8;
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j6 = nestedScrollNode$onPostFling$2.f4072a;
            AbstractC3193b.m15359b(objMo919t);
        }
        j5 = ((dpa) objMo919t).f36010a;
        j4 = j6;
        return new dpa(dpa.m10574e(j4, j5));
        j4 = ((dpa) objMo919t).f36010a;
        boolean z = this.f34836I;
        if (!z) {
            c0320dM1452a1 = this.f4091L;
        } else if (z) {
            c0320dM1452a1 = m1452a1();
        }
        pj6 pj6Var2 = c0320dM1452a1;
        if (pj6Var2 != null) {
            long jM10574e = dpa.m10574e(j, j4);
            long jM10573d = dpa.m10573d(j3, j4);
            nestedScrollNode$onPostFling$2.f4072a = j4;
            nestedScrollNode$onPostFling$2.f4076e = 2;
            objMo919t = pj6Var2.mo919t(jM10574e, jM10573d, nestedScrollNode$onPostFling$2);
            if (objMo919t != coroutineSingletons) {
                j6 = j4;
                j5 = ((dpa) objMo919t).f36010a;
                j4 = j6;
            }
            return coroutineSingletons;
        }
        j5 = 0;
        return new dpa(dpa.m10574e(j4, j5));
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: u0 */
    public final long mo920u0(int i, long j, long j2) {
        long jMo920u0 = this.f4089J.mo920u0(i, j, j2);
        C0320d c0320dM1452a1 = this.f34836I ? m1452a1() : null;
        return gq6.m12825f(jMo920u0, c0320dM1452a1 != null ? c0320dM1452a1.mo920u0(i, gq6.m12825f(j, jMo920u0), gq6.m12824e(j2, jMo920u0)) : 0L);
    }
}
