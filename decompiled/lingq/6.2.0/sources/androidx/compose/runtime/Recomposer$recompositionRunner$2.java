package androidx.compose.runtime;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3186kj;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.cd4;
import p000.cf1;
import p000.ho5;
import p000.iy5;
import p000.m77;
import p000.me5;
import p000.nc9;
import p000.pf1;
import p000.sd3;
import p000.t16;
import p000.u91;
import p000.un1;
import p000.v77;
import p000.vz1;
import p000.x18;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m4291f = "Recomposer.kt", m4292l = {1081}, m4293m = "invokeSuspend", m4294v = 1)
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public sd3 f3670a;

    /* JADX INFO: renamed from: b */
    public int f3671b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f3672c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0281i f3673d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ aj3 f3674e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t16 f3675f;

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2 */
    @c32(m4290c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", m4291f = "Recomposer.kt", m4292l = {1081}, m4293m = "invokeSuspend", m4294v = 1)
    final class C02702 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f3676a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f3677b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ aj3 f3678c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ t16 f3679d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02702(aj3 aj3Var, t16 t16Var, Continuation continuation) {
            super(2, continuation);
            this.f3678c = aj3Var;
            this.f3679d = t16Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C02702 c02702 = new C02702(this.f3678c, this.f3679d, continuation);
            c02702.f3677b = obj;
            return c02702;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C02702) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f3676a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                un1 un1Var = (un1) this.f3677b;
                this.f3676a = 1;
                if (((Recomposer$runRecomposeAndApplyChanges$2) this.f3678c).invoke(un1Var, this.f3679d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(C0281i c0281i, aj3 aj3Var, t16 t16Var, Continuation continuation) {
        super(2, continuation);
        this.f3673d = c0281i;
        this.f3674e = aj3Var;
        this.f3675f = t16Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.f3673d, this.f3674e, this.f3675f, continuation);
        recomposer$recompositionRunner$2.f3672c = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Recomposer$recompositionRunner$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x013f A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:69:0x013b, B:71:0x013f, B:74:0x0144, B:76:0x014a), top: B:112:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:76:0x014a A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #1 {all -> 0x0142, blocks: (B:69:0x013b, B:71:0x013f, B:74:0x0144, B:76:0x014a), top: B:112:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x016d A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:87:0x0169, B:89:0x016d, B:92:0x0172, B:94:0x0178), top: B:110:0x0169 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0178 A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:87:0x0169, B:89:0x016d, B:92:0x0172, B:94:0x0178), top: B:110:0x0169 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        cd4 cd4VarM15441h;
        C3244l c3244l;
        v77 v77Var;
        v77 v77Var2;
        sd3 sd3Var;
        Throwable th;
        List listM1274E;
        pf1 pf1Var;
        C0281i c0281i;
        C0281i c0281i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3671b;
        if (i != 0) {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sd3Var = this.f3670a;
            cd4VarM15441h = (cd4) this.f3672c;
            try {
                AbstractC3193b.m15359b(obj);
                sd3Var.mo19438a();
                c0281i2 = this.f3673d;
                synchronized (c0281i2.f3757d) {
                    try {
                        if (c0281i2.f3758e == cd4VarM15441h) {
                            c0281i2.f3758e = null;
                        }
                        if (c0281i2.m1284y() != null) {
                            cf1.m4605a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C3244l c3244l2 = C0281i.f3751B;
                ho5.m13392i(this.f3673d.f3753A);
                return xfa.f68157a;
            } catch (Throwable th3) {
                th = th3;
                sd3Var.mo19438a();
                c0281i = this.f3673d;
                synchronized (c0281i.f3757d) {
                    try {
                        if (c0281i.f3758e == cd4VarM15441h) {
                            c0281i.f3758e = null;
                        }
                        if (c0281i.m1284y() != null) {
                            cf1.m4605a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                C3244l c3244l3 = C0281i.f3751B;
                ho5.m13392i(this.f3673d.f3753A);
                throw th;
            }
        }
        AbstractC3193b.m15359b(obj);
        cd4VarM15441h = AbstractC3208a.m15441h(((un1) this.f3672c).mo1309x());
        C0281i c0281i3 = this.f3673d;
        synchronized (c0281i3.f3757d) {
            Throwable th5 = c0281i3.f3759f;
            if (th5 != null) {
                throw th5;
            }
            if (((Recomposer$State) c0281i3.f3776w.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (c0281i3.f3758e != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            c0281i3.f3758e = cd4VarM15441h;
            if (c0281i3.m1284y() != null) {
                cf1.m4605a("called outside of runRecomposeAndApplyChanges");
            }
        }
        C3186kj c3186kj = new C3186kj(this.f3673d, 17);
        nc9.m17353e(nc9.f52600a);
        synchronized (nc9.f52602c) {
            nc9.f52607h = u91.m22604V0(nc9.f52607h, c3186kj);
        }
        sd3 sd3Var2 = new sd3(c3186kj);
        C3244l c3244l4 = C0281i.f3751B;
        iy5 iy5Var = this.f3673d.f3753A;
        do {
            c3244l = C0281i.f3751B;
            v77Var = (v77) c3244l.getValue();
            iy5 iy5Var2 = iy5.f44769e;
            m77 m77Var = v77Var.f64980c;
            if (m77Var.containsKey(iy5Var)) {
                v77Var2 = v77Var;
            } else if (v77Var.isEmpty()) {
                v77Var2 = new v77(iy5Var, iy5Var, m77Var.m16667c(iy5Var, new me5(iy5Var2, iy5Var2)));
            } else {
                Object obj2 = v77Var.f64979b;
                Object obj3 = m77Var.get(obj2);
                obj3.getClass();
                v77Var2 = new v77(v77Var.f64978a, iy5Var, m77Var.m16667c(obj2, new me5(((me5) obj3).f51205a, iy5Var)).m16667c(iy5Var, new me5(obj2, iy5Var2)));
            }
            if (v77Var == v77Var2) {
                break;
            }
        } while (!c3244l.m15570h(v77Var, v77Var2));
        try {
            C0281i c0281i4 = this.f3673d;
            synchronized (c0281i4.f3757d) {
                listM1274E = c0281i4.m1274E();
            }
            int size = listM1274E.size();
            for (int i2 = 0; i2 < size; i2++) {
                for (Object obj4 : ((pf1) listM1274E.get(i2)).f56043f.f9844c) {
                    x18 x18Var = obj4 instanceof x18 ? (x18) obj4 : null;
                    if (x18Var != null && (pf1Var = x18Var.f67639a) != null) {
                        pf1Var.m19103s(x18Var, null);
                    }
                }
            }
            C02702 c02702 = new C02702(this.f3674e, this.f3675f, null);
            this.f3672c = cd4VarM15441h;
            this.f3670a = sd3Var2;
            this.f3671b = 1;
            if (vz1.m23649s(c02702, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            sd3Var = sd3Var2;
            sd3Var.mo19438a();
            c0281i2 = this.f3673d;
            synchronized (c0281i2.f3757d) {
                if (c0281i2.f3758e == cd4VarM15441h) {
                    c0281i2.f3758e = null;
                }
                if (c0281i2.m1284y() != null) {
                    cf1.m4605a("called outside of runRecomposeAndApplyChanges");
                }
                C3244l c3244l5 = C0281i.f3751B;
                ho5.m13392i(this.f3673d.f3753A);
                return xfa.f68157a;
            }
        } catch (Throwable th6) {
            sd3Var = sd3Var2;
            th = th6;
            sd3Var.mo19438a();
            c0281i = this.f3673d;
            synchronized (c0281i.f3757d) {
                if (c0281i.f3758e == cd4VarM15441h) {
                    c0281i.f3758e = null;
                }
                if (c0281i.m1284y() != null) {
                    cf1.m4605a("called outside of runRecomposeAndApplyChanges");
                }
                C3244l c3244l6 = C0281i.f3751B;
                ho5.m13392i(this.f3673d.f3753A);
                throw th;
            }
        }
    }
}
