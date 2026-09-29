package androidx.compose.p002ui.input.pointer;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import p000.AbstractC3584sr;
import p000.ci8;
import p000.d16;
import p000.fb2;
import p000.fg7;
import p000.jk8;
import p000.kg7;
import p000.mo9;
import p000.ng7;
import p000.no9;
import p000.og7;
import p000.pg9;
import p000.sm0;
import p000.te1;
import p000.vi3;
import p000.wfb;
import p000.x66;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0333g extends d16 implements og7, fb2, ng7 {

    /* JADX INFO: renamed from: J */
    public Object f4137J;

    /* JADX INFO: renamed from: K */
    public Object f4138K;

    /* JADX INFO: renamed from: L */
    public Object[] f4139L;

    /* JADX INFO: renamed from: M */
    public PointerInputEventHandler f4140M;

    /* JADX INFO: renamed from: N */
    public pg9 f4141N;

    /* JADX INFO: renamed from: O */
    public fg7 f4142O = mo9.f51649a;

    /* JADX INFO: renamed from: P */
    public final x66 f4143P;

    /* JADX INFO: renamed from: Q */
    public final x66 f4144Q;

    /* JADX INFO: renamed from: R */
    public final x66 f4145R;

    /* JADX INFO: renamed from: S */
    public fg7 f4146S;

    /* JADX INFO: renamed from: T */
    public long f4147T;

    public C0333g(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f4137J = obj;
        this.f4138K = obj2;
        this.f4139L = objArr;
        this.f4140M = pointerInputEventHandler;
        x66 x66Var = new x66(new C0332f[16]);
        this.f4143P = x66Var;
        this.f4144Q = x66Var;
        this.f4145R = new x66(new C0332f[16]);
        this.f4147T = 0L;
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: D */
    public final void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        this.f4147T = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f4142O = fg7Var;
        }
        if (this.f4141N == null) {
            this.f4141N = wfb.m23926u(m9971N0(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        m1480a1(fg7Var, pointerEventPass);
        List list = fg7Var.f39071a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!ci8.m4725j((kg7) list.get(i))) {
                this.f4146S = fg7Var;
            }
        }
        fg7Var = null;
        this.f4146S = fg7Var;
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: E0 */
    public final void mo1478E0() {
        m1481b1();
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: K */
    public final void mo818K() {
        fg7 fg7Var = this.f4146S;
        if (fg7Var == null) {
            return;
        }
        List list = fg7Var.f39071a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((kg7) list.get(i)).f47238d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    kg7 kg7Var = (kg7) list.get(i2);
                    long j = kg7Var.f47235a;
                    long j2 = kg7Var.f47237c;
                    long j3 = kg7Var.f47236b;
                    float f = kg7Var.f47239e;
                    boolean z = kg7Var.f47238d;
                    arrayList.add(new kg7(j, j3, j2, false, f, j3, j2, z, z, kg7Var.f47243i, 0L, 1.0f, 0L));
                }
                fg7 fg7Var2 = new fg7(arrayList, null);
                this.f4142O = fg7Var2;
                m1480a1(fg7Var2, PointerEventPass.Initial);
                m1480a1(fg7Var2, PointerEventPass.Main);
                m1480a1(fg7Var2, PointerEventPass.Final);
                this.f4146S = null;
                return;
            }
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        m1481b1();
    }

    /* JADX INFO: renamed from: Z0 */
    public final Object m1479Z0(zi3 zi3Var, Continuation continuation) {
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        final C0332f c0332f = new C0332f(this, sm0Var);
        synchronized (this.f4144Q) {
            this.f4143P.m24305c(c0332f);
            new jk8(AbstractC3584sr.m21600K(AbstractC3584sr.m21647z(zi3Var, c0332f, c0332f)), CoroutineSingletons.COROUTINE_SUSPENDED).resumeWith(xfa.f68157a);
        }
        sm0Var.m21470w(new vi3() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                C0332f c0332f2 = c0332f;
                sm0 sm0Var2 = c0332f2.f4133c;
                if (sm0Var2 != null) {
                    sm0Var2.mo10141l(th);
                }
                c0332f2.f4133c = null;
                return xfa.f68157a;
            }
        });
        return sm0Var.m21466r();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return te1.m21979L(this).f4327T.mo594a();
    }

    /* JADX INFO: renamed from: a1 */
    public final void m1480a1(fg7 fg7Var, PointerEventPass pointerEventPass) {
        sm0 sm0Var;
        sm0 sm0Var2;
        synchronized (this.f4144Q) {
            x66 x66Var = this.f4145R;
            x66Var.m24306d(x66Var.f67832c, this.f4143P);
        }
        try {
            int i = no9.f53067a[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                x66 x66Var2 = this.f4145R;
                Object[] objArr = x66Var2.f67830a;
                int i2 = x66Var2.f67832c;
                for (int i3 = 0; i3 < i2; i3++) {
                    C0332f c0332f = (C0332f) objArr[i3];
                    if (pointerEventPass == c0332f.f4134d && (sm0Var = c0332f.f4133c) != null) {
                        c0332f.f4133c = null;
                        sm0Var.resumeWith(fg7Var);
                    }
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                x66 x66Var3 = this.f4145R;
                int i4 = x66Var3.f67832c - 1;
                Object[] objArr2 = x66Var3.f67830a;
                if (i4 < objArr2.length) {
                    while (i4 >= 0) {
                        C0332f c0332f2 = (C0332f) objArr2[i4];
                        if (pointerEventPass == c0332f2.f4134d && (sm0Var2 = c0332f2.f4133c) != null) {
                            c0332f2.f4133c = null;
                            sm0Var2.resumeWith(fg7Var);
                        }
                        i4--;
                    }
                }
            }
            this.f4145R.m24310h();
        } catch (Throwable th) {
            this.f4145R.m24310h();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m1481b1() {
        pg9 pg9Var = this.f4141N;
        if (pg9Var != null) {
            pg9Var.mo15330B(new PointerInputResetException("Pointer input was reset"));
            this.f4141N = null;
        }
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return te1.m21979L(this).f4327T.mo597d0();
    }

    @Override // p000.ea2, p000.ng7
    /* JADX INFO: renamed from: g */
    public final void mo840g() {
        m1481b1();
    }
}
