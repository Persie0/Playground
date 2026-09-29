package p349qo;

import dm.C5207g;
import java.util.Arrays;
import p349qo.AbstractC8657c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: qo.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8655a<S extends AbstractC8657c<?>> {

    /* JADX INFO: renamed from: a */
    public S[] f46232a;

    /* JADX INFO: renamed from: b */
    public int f46233b;

    /* JADX INFO: renamed from: c */
    public int f46234c;

    /* JADX INFO: renamed from: d */
    public C8666l f46235d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final S m16871d() {
        S s10;
        C8666l c8666l;
        synchronized (this) {
            S[] sArr = this.f46232a;
            if (sArr == null) {
                sArr = (S[]) mo14368f();
                this.f46232a = sArr;
            } else if (this.f46233b >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
                this.f46232a = (S[]) ((AbstractC8657c[]) objArrCopyOf);
                sArr = (S[]) ((AbstractC8657c[]) objArrCopyOf);
            }
            int i10 = this.f46234c;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = (S) mo14367e();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
            } while (!s10.mo14402a(this));
            this.f46234c = i10;
            this.f46233b++;
            c8666l = this.f46235d;
        }
        if (c8666l != null) {
            synchronized (c8666l) {
                Object[] objArr = c8666l.f40375h;
                C5207g.m11108c(objArr);
                c8666l.mo14371k(Integer.valueOf(((Number) objArr[((int) ((c8666l.f40376i + ((long) ((int) ((c8666l.m14395q() + ((long) c8666l.f40378k)) - c8666l.f40376i)))) - 1)) & (objArr.length - 1)]).intValue() + 1));
            }
        }
        return s10;
    }

    /* JADX INFO: renamed from: e */
    public abstract S mo14367e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC8657c[] mo14368f();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m16872g(S s10) {
        C8666l c8666l;
        int i10;
        InterfaceC9968c[] interfaceC9968cArrMo14403b;
        synchronized (this) {
            try {
                int i11 = this.f46233b - 1;
                this.f46233b = i11;
                c8666l = this.f46235d;
                if (i11 == 0) {
                    this.f46234c = 0;
                }
                interfaceC9968cArrMo14403b = s10.mo14403b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC9968c interfaceC9968c : interfaceC9968cArrMo14403b) {
            if (interfaceC9968c != null) {
                interfaceC9968c.mo2031y(C9072e.f47360a);
            }
        }
        if (c8666l != null) {
            synchronized (c8666l) {
                try {
                    Object[] objArr = c8666l.f40375h;
                    C5207g.m11108c(objArr);
                    c8666l.mo14371k(Integer.valueOf(((Number) objArr[((int) ((c8666l.f40376i + ((long) ((int) ((c8666l.m14395q() + ((long) c8666l.f40378k)) - c8666l.f40376i)))) - 1)) & (objArr.length - 1)]).intValue() - 1));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final C8666l m16873l() {
        C8666l c8666l;
        synchronized (this) {
            try {
                c8666l = this.f46235d;
                if (c8666l == null) {
                    c8666l = new C8666l(this.f46233b);
                    this.f46235d = c8666l;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8666l;
    }
}
