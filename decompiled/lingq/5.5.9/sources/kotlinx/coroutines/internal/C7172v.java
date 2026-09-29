package kotlinx.coroutines.internal;

import dm.C5207g;
import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.AbstractC7082c;
import kotlinx.coroutines.internal.InterfaceC7173w;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.v */
/* JADX INFO: loaded from: classes2.dex */
public class C7172v<T extends InterfaceC7173w & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* JADX INFO: renamed from: a */
    public T[] f40448a;

    /* JADX INFO: renamed from: a */
    public final void m14470a(AbstractC7082c.c cVar) {
        cVar.mo14331f((AbstractC7082c.d) this);
        T[] tArr = this.f40448a;
        if (tArr == null) {
            tArr = (T[]) new InterfaceC7173w[4];
            this.f40448a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, this._size * 2);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((InterfaceC7173w[]) objArrCopyOf);
            this.f40448a = tArr;
        }
        int i10 = this._size;
        this._size = i10 + 1;
        tArr[i10] = cVar;
        cVar.f40015b = i10;
        m14474e(i10);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14471b() {
        return this._size == 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086 A[LOOP:0: B:10:0x0043->B:21:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x008c A[EDGE_INSN: B:24:0x008c->B:22:0x008c BREAK  A[LOOP:0: B:10:0x0043->B:21:0x0086], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x008c A[EDGE_INSN: B:25:0x008c->B:22:0x008c BREAK  A[LOOP:0: B:10:0x0043->B:21:0x0086], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    /* JADX INFO: renamed from: c */
    public final T m14472c(int i10) {
        int i11;
        T[] tArr;
        int i12;
        T t10;
        T t11;
        T t12;
        T t13;
        T[] tArr2 = this.f40448a;
        C5207g.m11108c(tArr2);
        this._size--;
        if (i10 < this._size) {
            m14475f(i10, this._size);
            int i13 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t14 = tArr2[i10];
                C5207g.m11108c(t14);
                T t15 = tArr2[i13];
                C5207g.m11108c(t15);
                if (((Comparable) t14).compareTo(t15) < 0) {
                    m14475f(i10, i13);
                    m14474e(i13);
                } else {
                    while (true) {
                        i11 = (i10 * 2) + 1;
                        if (i11 >= this._size) {
                            break;
                        }
                        tArr = this.f40448a;
                        C5207g.m11108c(tArr);
                        i12 = i11 + 1;
                        if (i12 < this._size) {
                            t12 = tArr[i12];
                            C5207g.m11108c(t12);
                            t13 = tArr[i11];
                            C5207g.m11108c(t13);
                            if (((Comparable) t12).compareTo(t13) < 0) {
                                i11 = i12;
                            }
                        }
                        t10 = tArr[i10];
                        C5207g.m11108c(t10);
                        t11 = tArr[i11];
                        C5207g.m11108c(t11);
                        if (((Comparable) t10).compareTo(t11) <= 0) {
                            break;
                        }
                        m14475f(i10, i11);
                        i10 = i11;
                    }
                }
            } else {
                while (true) {
                    i11 = (i10 * 2) + 1;
                    if (i11 >= this._size) {
                        break;
                        break;
                    }
                    tArr = this.f40448a;
                    C5207g.m11108c(tArr);
                    i12 = i11 + 1;
                    if (i12 < this._size) {
                        t12 = tArr[i12];
                        C5207g.m11108c(t12);
                        t13 = tArr[i11];
                        C5207g.m11108c(t13);
                        if (((Comparable) t12).compareTo(t13) < 0) {
                            i11 = i12;
                        }
                    }
                    t10 = tArr[i10];
                    C5207g.m11108c(t10);
                    t11 = tArr[i11];
                    C5207g.m11108c(t11);
                    if (((Comparable) t10).compareTo(t11) <= 0) {
                        break;
                        break;
                    }
                    m14475f(i10, i11);
                    i10 = i11;
                }
            }
        }
        T t16 = tArr2[this._size];
        C5207g.m11108c(t16);
        t16.mo14331f(null);
        t16.setIndex(-1);
        tArr2[this._size] = null;
        return t16;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final T m14473d() {
        T t10;
        synchronized (this) {
            try {
                t10 = this._size > 0 ? (T) m14472c(0) : null;
            } finally {
            }
        }
        return t10;
    }

    /* JADX INFO: renamed from: e */
    public final void m14474e(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f40448a;
            C5207g.m11108c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            C5207g.m11108c(t10);
            T t11 = tArr[i10];
            C5207g.m11108c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m14475f(i10, i11);
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14475f(int i10, int i11) {
        T[] tArr = this.f40448a;
        C5207g.m11108c(tArr);
        T t10 = tArr[i11];
        C5207g.m11108c(t10);
        T t11 = tArr[i10];
        C5207g.m11108c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
