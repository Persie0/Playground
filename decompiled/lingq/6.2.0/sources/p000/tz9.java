package p000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class tz9 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63150b = AtomicIntegerFieldUpdater.newUpdater(tz9.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public bu2[] f63151a;

    /* JADX INFO: renamed from: a */
    public final void m22357a(bu2 bu2Var) {
        bu2Var.m4177d((cu2) this);
        bu2[] bu2VarArr = this.f63151a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f63150b;
        if (bu2VarArr == null) {
            bu2VarArr = new bu2[4];
            this.f63151a = bu2VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= bu2VarArr.length) {
            bu2VarArr = (bu2[]) Arrays.copyOf(bu2VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f63151a = bu2VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        bu2VarArr[i] = bu2Var;
        bu2Var.f9021b = i;
        m22359c(i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final bu2 m22358b(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f63151a;
        objArr2.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f63150b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m22360d(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                bu2 bu2Var = objArr2[i];
                bu2Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (bu2Var.compareTo(obj2) < 0) {
                    m22360d(i, i5);
                    m22359c(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f63151a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        m22360d(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f63151a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    m22360d(i, i4);
                    i = i4;
                }
            }
        }
        bu2 bu2Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        bu2Var2.getClass();
        bu2Var2.m4177d(null);
        bu2Var2.f9021b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return bu2Var2;
    }

    /* JADX INFO: renamed from: c */
    public final void m22359c(int i) {
        while (i > 0) {
            bu2[] bu2VarArr = this.f63151a;
            bu2VarArr.getClass();
            int i2 = (i - 1) / 2;
            bu2 bu2Var = bu2VarArr[i2];
            bu2Var.getClass();
            bu2 bu2Var2 = bu2VarArr[i];
            bu2Var2.getClass();
            if (bu2Var.compareTo(bu2Var2) <= 0) {
                return;
            }
            m22360d(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m22360d(int i, int i2) {
        bu2[] bu2VarArr = this.f63151a;
        bu2VarArr.getClass();
        bu2 bu2Var = bu2VarArr[i2];
        bu2Var.getClass();
        bu2 bu2Var2 = bu2VarArr[i];
        bu2Var2.getClass();
        bu2VarArr[i] = bu2Var;
        bu2VarArr[i2] = bu2Var2;
        bu2Var.f9021b = i;
        bu2Var2.f9021b = i2;
    }
}
