package jm;

import p100em.InterfaceC5429a;
import p349qo.C8656b;

/* JADX INFO: renamed from: jm.g */
/* JADX INFO: loaded from: classes2.dex */
public class C6524g implements Iterable<Integer>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public final int f37163a;

    /* JADX INFO: renamed from: b */
    public final int f37164b;

    /* JADX INFO: renamed from: c */
    public final int f37165c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6524g(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f37163a = i10;
        this.f37164b = C8656b.m16915w(i10, i11, i12);
        this.f37165c = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6524g) {
            if (!isEmpty() || !((C6524g) obj).isEmpty()) {
                C6524g c6524g = (C6524g) obj;
                if (this.f37163a == c6524g.f37163a && this.f37164b == c6524g.f37164b && this.f37165c == c6524g.f37165c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C6525h iterator() {
        return new C6525h(this.f37163a, this.f37164b, this.f37165c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f37163a * 31) + this.f37164b) * 31) + this.f37165c;
    }

    public boolean isEmpty() {
        int i10 = this.f37165c;
        int i11 = this.f37164b;
        int i12 = this.f37163a;
        if (i10 > 0) {
            if (i12 > i11) {
                return true;
            }
        } else if (i12 < i11) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f37164b;
        int i11 = this.f37163a;
        int i12 = this.f37165c;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
