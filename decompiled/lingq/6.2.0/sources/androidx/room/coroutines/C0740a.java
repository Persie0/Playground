package androidx.room.coroutines;

import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import p000.AbstractC3352my;
import p000.AbstractC3695vr;
import p000.C3156jq;
import p000.C3386nv;
import p000.C3539rk;
import p000.cn2;
import p000.eh0;
import p000.gi1;
import p000.hi1;
import p000.iy5;
import p000.ji1;
import p000.kn1;
import p000.lda;
import p000.ni1;
import p000.pz9;
import p000.to2;
import p000.ui3;
import p000.wfb;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.coroutines.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0740a implements hi1 {

    /* JADX INFO: renamed from: a */
    public final C0743d f6926a;

    /* JADX INFO: renamed from: b */
    public final C0743d f6927b;

    /* JADX INFO: renamed from: c */
    public final to2 f6928c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f6929d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f6930e;

    /* JADX INFO: renamed from: f */
    public final long f6931f;

    /* JADX INFO: renamed from: g */
    public final int f6932g;

    public C0740a(final C3156jq c3156jq, final String str, int i) {
        str.getClass();
        this.f6928c = new to2();
        this.f6929d = new ThreadLocal();
        iy5 iy5Var = cn2.f10315b;
        this.f6931f = AbstractC3352my.m17117e0(30, DurationUnit.SECONDS);
        this.f6932g = 2;
        if (i <= 0) {
            C3386nv.m17626m("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.f6926a = new C0743d(i, new ui3() { // from class: ii1
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                String str2 = str;
                C3156jq c3156jq2 = c3156jq;
                switch (i3) {
                    case 0:
                        bk8 bk8VarMo4512m = c3156jq2.mo4512m(str2);
                        AbstractC3695vr.m23496g(bk8VarMo4512m, "PRAGMA query_only = 1");
                        return bk8VarMo4512m;
                    default:
                        return c3156jq2.mo4512m(str2);
                }
            }
        });
        final int i3 = 1;
        this.f6927b = new C0743d(1, new ui3() { // from class: ii1
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i4 = i3;
                String str2 = str;
                C3156jq c3156jq2 = c3156jq;
                switch (i4) {
                    case 0:
                        bk8 bk8VarMo4512m = c3156jq2.mo4512m(str2);
                        AbstractC3695vr.m23496g(bk8VarMo4512m, "PRAGMA query_only = 1");
                        return bk8VarMo4512m;
                    default:
                        return c3156jq2.mo4512m(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f6930e) {
            return;
        }
        this.f6930e = true;
        this.f6926a.m2821c();
        this.f6927b.m2821c();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #4 {all -> 0x019f, blocks: (B:64:0x011f, B:69:0x013b, B:71:0x0146, B:86:0x01a3, B:87:0x01aa), top: B:115:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3 A[Catch: all -> 0x019f, TRY_ENTER, TryCatch #4 {all -> 0x019f, blocks: (B:64:0x011f, B:69:0x013b, B:71:0x0146, B:86:0x01a3, B:87:0x01aa), top: B:115:0x011f }] */
    @Override // p000.hi1
    /* JADX INFO: renamed from: v */
    public final Object mo2813v(boolean z, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        ConnectionPoolImpl$useConnection$1 connectionPoolImpl$useConnection$1;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        C0743d c0743d;
        kn1 context;
        zi3 zi3Var2;
        to2 to2Var;
        C0743d c0743d2;
        Ref$ObjectRef ref$ObjectRef2;
        boolean z2;
        Object obj;
        Ref$ObjectRef ref$ObjectRef3;
        C0744e c0744e;
        boolean z3 = z;
        if (continuationImpl instanceof ConnectionPoolImpl$useConnection$1) {
            connectionPoolImpl$useConnection$1 = (ConnectionPoolImpl$useConnection$1) continuationImpl;
            int i = connectionPoolImpl$useConnection$1.f6853j;
            if ((i & Integer.MIN_VALUE) != 0) {
                connectionPoolImpl$useConnection$1.f6853j = i - Integer.MIN_VALUE;
            } else {
                connectionPoolImpl$useConnection$1 = new ConnectionPoolImpl$useConnection$1(this, continuationImpl);
            }
        } else {
            connectionPoolImpl$useConnection$1 = new ConnectionPoolImpl$useConnection$1(this, continuationImpl);
        }
        Object objM23905G = connectionPoolImpl$useConnection$1.f6851h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = connectionPoolImpl$useConnection$1.f6853j;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM23905G);
                return objM23905G;
            }
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM23905G);
                return objM23905G;
            }
            if (i2 == 3) {
                z3 = connectionPoolImpl$useConnection$1.f6844a;
                to2Var = connectionPoolImpl$useConnection$1.f6850g;
                Ref$ObjectRef ref$ObjectRef4 = connectionPoolImpl$useConnection$1.f6849f;
                kn1 kn1Var = connectionPoolImpl$useConnection$1.f6848e;
                Ref$ObjectRef ref$ObjectRef5 = connectionPoolImpl$useConnection$1.f6847d;
                c0743d2 = (C0743d) connectionPoolImpl$useConnection$1.f6846c;
                zi3Var2 = (zi3) connectionPoolImpl$useConnection$1.f6845b;
                try {
                    AbstractC3193b.m15359b(objM23905G);
                    ref$ObjectRef2 = ref$ObjectRef4;
                    ref$ObjectRef = ref$ObjectRef5;
                    context = kn1Var;
                    try {
                        ni1 ni1Var = (ni1) objM23905G;
                        ni1Var.getClass();
                        context.getClass();
                        ni1Var.f52751c = context;
                        ni1Var.f52752d = new Throwable();
                        if (this.f6926a == this.f6927b && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ref$ObjectRef2.f47718a = new C0744e(to2Var, ni1Var, z2);
                        obj = ref$ObjectRef.f47718a;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        C0744e c0744e2 = (C0744e) obj;
                        gi1 gi1Var = new gi1(this.f6928c, c0744e2);
                        ThreadLocal threadLocal = this.f6929d;
                        threadLocal.getClass();
                        kn1 kn1VarM11113J = eh0.m11113J(gi1Var, new pz9(c0744e2, threadLocal));
                        ConnectionPoolImpl$useConnection$4 connectionPoolImpl$useConnection$4 = new ConnectionPoolImpl$useConnection$4(zi3Var2, ref$ObjectRef, null);
                        connectionPoolImpl$useConnection$1.f6845b = c0743d2;
                        connectionPoolImpl$useConnection$1.f6846c = ref$ObjectRef;
                        connectionPoolImpl$useConnection$1.f6847d = null;
                        connectionPoolImpl$useConnection$1.f6848e = null;
                        connectionPoolImpl$useConnection$1.f6849f = null;
                        connectionPoolImpl$useConnection$1.f6850g = null;
                        connectionPoolImpl$useConnection$1.f6853j = 4;
                        objM23905G = wfb.m23905G(connectionPoolImpl$useConnection$4, kn1VarM11113J, connectionPoolImpl$useConnection$1);
                        if (objM23905G != coroutineSingletons) {
                            ref$ObjectRef3 = ref$ObjectRef;
                            c0743d = c0743d2;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        c0743d = c0743d2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ref$ObjectRef = ref$ObjectRef5;
                    c0743d = c0743d2;
                    throw th;
                }
            }
            if (i2 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef3 = (Ref$ObjectRef) connectionPoolImpl$useConnection$1.f6846c;
            c0743d = (C0743d) connectionPoolImpl$useConnection$1.f6845b;
            try {
                AbstractC3193b.m15359b(objM23905G);
            } catch (Throwable th4) {
                ref$ObjectRef = ref$ObjectRef3;
                th = th4;
            }
            c0744e = (C0744e) ref$ObjectRef3.f47718a;
            if (c0744e != null) {
                if (!c0744e.f6953e) {
                    c0744e.f6953e = true;
                    if (c0744e.f6950b.f52749a.mo2872S()) {
                        AbstractC3695vr.m23496g(c0744e.f6950b, "ROLLBACK TRANSACTION");
                    }
                }
                ni1 ni1Var2 = c0744e.f6950b;
                ni1Var2.f52751c = null;
                ni1Var2.f52752d = null;
                c0743d.m2823e(ni1Var2);
            }
            return objM23905G;
        }
        AbstractC3193b.m15359b(objM23905G);
        if (this.f6930e) {
            AbstractC3695vr.m23485C(21, "Connection pool is closed");
            throw null;
        }
        C0744e c0744e3 = (C0744e) this.f6929d.get();
        if (c0744e3 == null) {
            gi1 gi1Var2 = (gi1) connectionPoolImpl$useConnection$1.getContext().get(this.f6928c);
            c0744e3 = gi1Var2 != null ? gi1Var2.f40845b : null;
        }
        if (c0744e3 == null) {
            C0743d c0743d3 = z3 ? this.f6926a : this.f6927b;
            ref$ObjectRef = new Ref$ObjectRef();
            try {
                context = connectionPoolImpl$useConnection$1.getContext();
                to2 to2Var2 = this.f6928c;
                long j = this.f6931f;
                ji1 ji1Var = new ji1(this, z3);
                connectionPoolImpl$useConnection$1.f6845b = zi3Var;
                connectionPoolImpl$useConnection$1.f6846c = c0743d3;
                connectionPoolImpl$useConnection$1.f6847d = ref$ObjectRef;
                connectionPoolImpl$useConnection$1.f6848e = context;
                connectionPoolImpl$useConnection$1.f6849f = ref$ObjectRef;
                connectionPoolImpl$useConnection$1.f6850g = to2Var2;
                connectionPoolImpl$useConnection$1.f6844a = z3;
                connectionPoolImpl$useConnection$1.f6853j = 3;
                Object objM2820b = c0743d3.m2820b(j, ji1Var, connectionPoolImpl$useConnection$1);
                if (objM2820b != coroutineSingletons) {
                    zi3Var2 = zi3Var;
                    to2Var = to2Var2;
                    c0743d2 = c0743d3;
                    objM23905G = objM2820b;
                    ref$ObjectRef2 = ref$ObjectRef;
                    ni1 ni1Var3 = (ni1) objM23905G;
                    ni1Var3.getClass();
                    context.getClass();
                    ni1Var3.f52751c = context;
                    ni1Var3.f52752d = new Throwable();
                    if (this.f6926a == this.f6927b) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    ref$ObjectRef2.f47718a = new C0744e(to2Var, ni1Var3, z2);
                    obj = ref$ObjectRef.f47718a;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C0744e c0744e4 = (C0744e) obj;
                    gi1 gi1Var3 = new gi1(this.f6928c, c0744e4);
                    ThreadLocal threadLocal2 = this.f6929d;
                    threadLocal2.getClass();
                    kn1 kn1VarM11113J2 = eh0.m11113J(gi1Var3, new pz9(c0744e4, threadLocal2));
                    ConnectionPoolImpl$useConnection$4 connectionPoolImpl$useConnection$5 = new ConnectionPoolImpl$useConnection$4(zi3Var2, ref$ObjectRef, null);
                    connectionPoolImpl$useConnection$1.f6845b = c0743d2;
                    connectionPoolImpl$useConnection$1.f6846c = ref$ObjectRef;
                    connectionPoolImpl$useConnection$1.f6847d = null;
                    connectionPoolImpl$useConnection$1.f6848e = null;
                    connectionPoolImpl$useConnection$1.f6849f = null;
                    connectionPoolImpl$useConnection$1.f6850g = null;
                    connectionPoolImpl$useConnection$1.f6853j = 4;
                    objM23905G = wfb.m23905G(connectionPoolImpl$useConnection$5, kn1VarM11113J2, connectionPoolImpl$useConnection$1);
                    if (objM23905G != coroutineSingletons) {
                        ref$ObjectRef3 = ref$ObjectRef;
                        c0743d = c0743d2;
                        c0744e = (C0744e) ref$ObjectRef3.f47718a;
                        if (c0744e != null) {
                            if (!c0744e.f6953e) {
                                c0744e.f6953e = true;
                                if (c0744e.f6950b.f52749a.mo2872S()) {
                                    AbstractC3695vr.m23496g(c0744e.f6950b, "ROLLBACK TRANSACTION");
                                }
                            }
                            ni1 ni1Var4 = c0744e.f6950b;
                            ni1Var4.f52751c = null;
                            ni1Var4.f52752d = null;
                            c0743d.m2823e(ni1Var4);
                        }
                        return objM23905G;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                c0743d = c0743d3;
            }
        } else {
            if (!z3 && c0744e3.f6951c) {
                AbstractC3695vr.m23485C(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (connectionPoolImpl$useConnection$1.getContext().get(this.f6928c) == null) {
                gi1 gi1Var4 = new gi1(this.f6928c, c0744e3);
                ThreadLocal threadLocal3 = this.f6929d;
                threadLocal3.getClass();
                kn1 kn1VarM11113J3 = eh0.m11113J(gi1Var4, new pz9(c0744e3, threadLocal3));
                ConnectionPoolImpl$useConnection$2 connectionPoolImpl$useConnection$2 = new ConnectionPoolImpl$useConnection$2(zi3Var, c0744e3, null);
                connectionPoolImpl$useConnection$1.f6853j = 1;
                Object objM23905G2 = wfb.m23905G(connectionPoolImpl$useConnection$2, kn1VarM11113J3, connectionPoolImpl$useConnection$1);
                if (objM23905G2 != coroutineSingletons) {
                    return objM23905G2;
                }
            } else {
                connectionPoolImpl$useConnection$1.f6853j = 2;
                Object objInvoke = zi3Var.invoke(c0744e3, connectionPoolImpl$useConnection$1);
                if (objInvoke != coroutineSingletons) {
                    return objInvoke;
                }
            }
        }
        return coroutineSingletons;
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                C0744e c0744e5 = (C0744e) ref$ObjectRef.f47718a;
                if (c0744e5 == null) {
                    throw th6;
                }
                if (!c0744e5.f6953e) {
                    c0744e5.f6953e = true;
                    if (c0744e5.f6950b.f52749a.mo2872S()) {
                        AbstractC3695vr.m23496g(c0744e5.f6950b, "ROLLBACK TRANSACTION");
                    }
                }
                ni1 ni1Var5 = c0744e5.f6950b;
                ni1Var5.f52751c = null;
                ni1Var5.f52752d = null;
                c0743d.m2823e(ni1Var5);
                throw th6;
            } catch (Throwable th7) {
                lda.m16117c(th, th7);
                throw th6;
            }
        }
    }

    public C0740a(C3156jq c3156jq) {
        this.f6928c = new to2();
        this.f6929d = new ThreadLocal();
        iy5 iy5Var = cn2.f10315b;
        this.f6931f = AbstractC3352my.m17117e0(30, DurationUnit.SECONDS);
        this.f6932g = 2;
        C0743d c0743d = new C0743d(1, new C3539rk(c3156jq, 9));
        this.f6926a = c0743d;
        this.f6927b = c0743d;
    }
}
