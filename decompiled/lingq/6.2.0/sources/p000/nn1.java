package p000;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class nn1 extends AbstractC0830c0 implements in1 {

    /* JADX INFO: renamed from: b */
    public static final mn1 f52986b = new mn1(jj5.f45612c, new C2951e4(15));

    public nn1() {
        super(jj5.f45612c);
    }

    /* JADX INFO: renamed from: T */
    public abstract void mo385T(kn1 kn1Var, Runnable runnable);

    /* JADX INFO: renamed from: W */
    public void mo386W(kn1 kn1Var, Runnable runnable) throws DispatchException {
        eh0.m11117N(this, kn1Var, runnable);
    }

    /* JADX INFO: renamed from: Y */
    public boolean mo17503Y(kn1 kn1Var) {
        return !(this instanceof nfa);
    }

    /* JADX INFO: renamed from: Z */
    public nn1 mo387Z(int i) {
        l70.m15942e(i);
        return new gc5(this, i);
    }

    @Override // p000.AbstractC0830c0, p000.kn1
    public final in1 get(jn1 jn1Var) {
        in1 in1Var;
        jn1Var.getClass();
        if (jn1Var instanceof mn1) {
            mn1 mn1Var = (mn1) jn1Var;
            jn1 jn1Var2 = this.f9216a;
            if ((jn1Var2 == mn1Var || mn1Var.f51551b == jn1Var2) && (in1Var = (in1) mn1Var.f51550a.invoke(this)) != null) {
                return in1Var;
            }
        } else if (jj5.f45612c == jn1Var) {
            return this;
        }
        return null;
    }

    @Override // p000.AbstractC0830c0, p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        jn1Var.getClass();
        if (jn1Var instanceof mn1) {
            mn1 mn1Var = (mn1) jn1Var;
            jn1 jn1Var2 = this.f9216a;
            if ((jn1Var2 != mn1Var && mn1Var.f51551b != jn1Var2) || ((in1) mn1Var.f51550a.invoke(this)) == null) {
                return this;
            }
        } else if (jj5.f45612c != jn1Var) {
            return this;
        }
        return EmptyCoroutineContext.f47685a;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + d32.m10016N(this);
    }
}
