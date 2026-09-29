package p480xb;

import com.google.android.gms.internal.play_billing.zzu;
import java.util.NoSuchElementException;
import p338qd.C8573r0;

/* JADX INFO: renamed from: xb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10164g extends AbstractC10158a {

    /* JADX INFO: renamed from: a */
    public final int f51463a;

    /* JADX INFO: renamed from: b */
    public int f51464b;

    /* JADX INFO: renamed from: c */
    public final zzu f51465c;

    public C10164g(zzu zzuVar, int i10) {
        int size = zzuVar.size();
        C8573r0.m16754r1(i10, size);
        this.f51463a = size;
        this.f51464b = i10;
        this.f51465c = zzuVar;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        return this.f51464b < this.f51463a;
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean hasPrevious() {
        return this.f51464b > 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f51464b;
        this.f51464b = i10 + 1;
        return this.f51465c.get(i10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f51464b - 1;
        this.f51464b = i10;
        return this.f51465c.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f51464b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f51464b - 1;
    }
}
