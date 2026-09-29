package p000;

import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: renamed from: w1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3706w1 {

    /* JADX INFO: renamed from: a */
    public AbstractC3743x1[] f66194a;

    /* JADX INFO: renamed from: b */
    public int f66195b;

    /* JADX INFO: renamed from: c */
    public int f66196c;

    /* JADX INFO: renamed from: d */
    public vm9 f66197d;

    /* JADX INFO: renamed from: c */
    public final AbstractC3743x1 m23669c() {
        AbstractC3743x1 abstractC3743x1Mo15549d;
        vm9 vm9Var;
        synchronized (this) {
            try {
                AbstractC3743x1[] abstractC3743x1ArrMo15550e = this.f66194a;
                if (abstractC3743x1ArrMo15550e == null) {
                    abstractC3743x1ArrMo15550e = mo15550e();
                    this.f66194a = abstractC3743x1ArrMo15550e;
                } else if (this.f66195b >= abstractC3743x1ArrMo15550e.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC3743x1ArrMo15550e, abstractC3743x1ArrMo15550e.length * 2);
                    this.f66194a = (AbstractC3743x1[]) objArrCopyOf;
                    abstractC3743x1ArrMo15550e = (AbstractC3743x1[]) objArrCopyOf;
                }
                int i = this.f66196c;
                do {
                    abstractC3743x1Mo15549d = abstractC3743x1ArrMo15550e[i];
                    if (abstractC3743x1Mo15549d == null) {
                        abstractC3743x1Mo15549d = mo15549d();
                        abstractC3743x1ArrMo15550e[i] = abstractC3743x1Mo15549d;
                    }
                    i++;
                    if (i >= abstractC3743x1ArrMo15550e.length) {
                        i = 0;
                    }
                } while (!abstractC3743x1Mo15549d.mo4330a(this));
                this.f66196c = i;
                this.f66195b++;
                vm9Var = this.f66197d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vm9Var != null) {
            vm9Var.m23426v(1);
        }
        return abstractC3743x1Mo15549d;
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC3743x1 mo15549d();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC3743x1[] mo15550e();

    /* JADX INFO: renamed from: f */
    public final void m23670f(AbstractC3743x1 abstractC3743x1) {
        vm9 vm9Var;
        int i;
        Continuation[] continuationArrMo4331b;
        synchronized (this) {
            try {
                int i2 = this.f66195b - 1;
                this.f66195b = i2;
                vm9Var = this.f66197d;
                if (i2 == 0) {
                    this.f66196c = 0;
                }
                abstractC3743x1.getClass();
                continuationArrMo4331b = abstractC3743x1.mo4331b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrMo4331b) {
            if (continuation != null) {
                continuation.resumeWith(xfa.f68157a);
            }
        }
        if (vm9Var != null) {
            vm9Var.m23426v(-1);
        }
    }

    /* JADX INFO: renamed from: g */
    public final vm9 m23671g() {
        vm9 vm9Var;
        synchronized (this) {
            vm9Var = this.f66197d;
            if (vm9Var == null) {
                int i = this.f66195b;
                vm9Var = new vm9(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
                vm9Var.m15558p(Integer.valueOf(i));
                this.f66197d = vm9Var;
            }
        }
        return vm9Var;
    }
}
