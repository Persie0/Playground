package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class dh2 extends sr9 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f35645e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f35646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh2(String str, ui3 ui3Var) {
        super(str);
        this.f35645e = 2;
        this.f35646f = ui3Var;
    }

    @Override // p000.sr9
    /* JADX INFO: renamed from: a */
    public final long mo10391a() {
        long j;
        j18 j18Var;
        int i = 0;
        long j2 = -1;
        switch (this.f35645e) {
            case 0:
                gh2 gh2Var = (gh2) this.f35646f;
                synchronized (gh2Var) {
                    if (gh2Var.f40799H && !gh2Var.f40800I) {
                        try {
                            gh2Var.m12643A();
                        } catch (IOException unused) {
                            gh2Var.f40801J = true;
                        }
                        try {
                            if (gh2Var.m12649p()) {
                                gh2Var.m12653x();
                                gh2Var.f40815j = 0;
                            }
                        } catch (IOException unused2) {
                            gh2Var.f40802K = true;
                            d18 d18Var = gh2Var.f40813h;
                            if (d18Var != null) {
                                icb.m13766b(d18Var);
                            }
                            gh2Var.f40813h = new d18(new id0());
                        }
                    }
                    break;
                }
                return -1L;
            case 1:
                kl2 kl2Var = (kl2) this.f35646f;
                long jNanoTime = System.nanoTime();
                long j3 = (jNanoTime - kl2Var.f47482b) + 1;
                Iterator it = ((ConcurrentLinkedQueue) kl2Var.f47485e).iterator();
                it.getClass();
                long j4 = Long.MAX_VALUE;
                j18 j18Var2 = null;
                long j5 = j3;
                j18 j18Var3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    long j6 = j2;
                    j18 j18Var4 = (j18) it.next();
                    j18Var4.getClass();
                    synchronized (j18Var4) {
                        if (kl2Var.m15328a(j18Var4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j7 = j5;
                            long j8 = j18Var4.f44912q;
                            if (j8 < j7) {
                                j18Var3 = j18Var4;
                                j7 = j8;
                            }
                            i++;
                            if (j8 < j4) {
                                j18Var2 = j18Var4;
                                j4 = j8;
                            }
                            j5 = j7;
                        }
                    }
                    j2 = j6;
                }
                long j9 = j2;
                long j10 = j5;
                if (j18Var3 != null) {
                    j18Var = j18Var3;
                    j = j10;
                } else if (i > kl2Var.f47481a) {
                    j = j4;
                    j18Var = j18Var2;
                } else {
                    j = j9;
                    j18Var = null;
                }
                if (j18Var == null) {
                    if (j18Var2 != null) {
                        return (j4 + kl2Var.f47482b) - jNanoTime;
                    }
                    return i2 > 0 ? kl2Var.f47482b : j9;
                }
                synchronized (j18Var) {
                    if (j18Var.f44911p.isEmpty() && j18Var.f44912q == j) {
                        j18Var.f44905j = true;
                        ((ConcurrentLinkedQueue) kl2Var.f47485e).remove(j18Var);
                        kcb.m15112c(j18Var.f44900e);
                        if (!((ConcurrentLinkedQueue) kl2Var.f47485e).isEmpty()) {
                            return 0L;
                        }
                        zr9 zr9Var = (zr9) kl2Var.f47483c;
                        synchronized (zr9Var.f72009a) {
                            if (zr9Var.m25752a()) {
                                zr9Var.f72009a.m3022c(zr9Var);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((ui3) this.f35646f).mo0a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh2(String str, int i, Object obj) {
        super(str);
        this.f35645e = i;
        this.f35646f = obj;
    }
}
