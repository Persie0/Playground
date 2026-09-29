package p000;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class au3 implements ListIterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7507a;

    /* JADX INFO: renamed from: b */
    public int f7508b;

    /* JADX INFO: renamed from: c */
    public int f7509c;

    /* JADX INFO: renamed from: d */
    public int f7510d;

    /* JADX INFO: renamed from: e */
    public final Object f7511e;

    public au3(SnapshotStateList snapshotStateList, int i) {
        this.f7507a = 2;
        this.f7511e = snapshotStateList;
        this.f7508b = i - 1;
        this.f7509c = -1;
        this.f7510d = AbstractC3584sr.m21599J(snapshotStateList);
    }

    /* JADX INFO: renamed from: a */
    public void m3048a() {
        if (((AbstractList) ((ListBuilder) this.f7511e)).modCount == this.f7510d) {
            return;
        }
        C3386nv.m17619e();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f7507a;
        Object obj2 = this.f7511e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m3048a();
                ListBuilder listBuilder = (ListBuilder) obj2;
                int i2 = this.f7508b;
                this.f7508b = i2 + 1;
                listBuilder.add(i2, obj);
                this.f7509c = -1;
                this.f7510d = ((AbstractList) listBuilder).modCount;
                return;
            default:
                m3049b();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                snapshotStateList.add(this.f7508b + 1, obj);
                this.f7509c = -1;
                this.f7508b++;
                this.f7510d = AbstractC3584sr.m21599J(snapshotStateList);
                return;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3049b() {
        if (AbstractC3584sr.m21599J((SnapshotStateList) this.f7511e) == this.f7510d) {
            return;
        }
        C3386nv.m17619e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f7507a;
        Object obj = this.f7511e;
        switch (i) {
            case 0:
                return this.f7508b < this.f7510d;
            case 1:
                return this.f7508b < ((ListBuilder) obj).f47652b;
            default:
                return this.f7508b < ((SnapshotStateList) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f7507a) {
            case 0:
                return this.f7508b > this.f7509c;
            case 1:
                return this.f7508b > 0;
            default:
                return this.f7508b >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f7507a;
        Object obj = this.f7511e;
        switch (i) {
            case 0:
                h66 h66Var = ((cu3) obj).f34537a;
                int i2 = this.f7508b;
                this.f7508b = i2 + 1;
                Object objM717b = h66Var.m717b(i2);
                objM717b.getClass();
                return (d16) objM717b;
            case 1:
                m3048a();
                int i3 = this.f7508b;
                ListBuilder listBuilder = (ListBuilder) obj;
                if (i3 >= listBuilder.f47652b) {
                    uk9.m22784s();
                    return null;
                }
                this.f7508b = i3 + 1;
                this.f7509c = i3;
                return listBuilder.f47651a[i3];
            default:
                m3049b();
                int i4 = this.f7508b + 1;
                this.f7509c = i4;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                AbstractC3584sr.m21640r(i4, snapshotStateList.size());
                Object obj2 = snapshotStateList.get(i4);
                this.f7508b = i4;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f7507a) {
            case 0:
                return this.f7508b - this.f7509c;
            case 1:
                return this.f7508b;
            default:
                return this.f7508b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f7507a;
        Object obj = this.f7511e;
        switch (i) {
            case 0:
                h66 h66Var = ((cu3) obj).f34537a;
                int i2 = this.f7508b - 1;
                this.f7508b = i2;
                Object objM717b = h66Var.m717b(i2);
                objM717b.getClass();
                return (d16) objM717b;
            case 1:
                m3048a();
                int i3 = this.f7508b;
                if (i3 <= 0) {
                    uk9.m22784s();
                    return null;
                }
                int i4 = i3 - 1;
                this.f7508b = i4;
                this.f7509c = i4;
                return ((ListBuilder) obj).f47651a[i4];
            default:
                m3049b();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                AbstractC3584sr.m21640r(this.f7508b, snapshotStateList.size());
                int i5 = this.f7508b;
                this.f7509c = i5;
                Object obj2 = snapshotStateList.get(i5);
                this.f7508b--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f7507a) {
            case 0:
                return (this.f7508b - this.f7509c) - 1;
            case 1:
                return this.f7508b - 1;
            default:
                return this.f7508b;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f7507a;
        Object obj = this.f7511e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ListBuilder listBuilder = (ListBuilder) obj;
                m3048a();
                int i2 = this.f7509c;
                if (i2 == -1) {
                    C3386nv.m17633t("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                listBuilder.mo4183f(i2);
                this.f7508b = this.f7509c;
                this.f7509c = -1;
                this.f7510d = ((AbstractList) listBuilder).modCount;
                return;
            default:
                m3049b();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                snapshotStateList.remove(this.f7509c);
                this.f7508b--;
                this.f7509c = -1;
                this.f7510d = AbstractC3584sr.m21599J(snapshotStateList);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f7507a;
        Object obj2 = this.f7511e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m3048a();
                int i2 = this.f7509c;
                if (i2 != -1) {
                    ((ListBuilder) obj2).set(i2, obj);
                    return;
                } else {
                    C3386nv.m17633t("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                m3049b();
                int i3 = this.f7509c;
                if (i3 < 0) {
                    C3386nv.m17633t("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    snapshotStateList.set(i3, obj);
                    this.f7510d = AbstractC3584sr.m21599J(snapshotStateList);
                    return;
                }
        }
    }

    public au3(ListBuilder listBuilder, int i) {
        this.f7507a = 1;
        this.f7511e = listBuilder;
        this.f7508b = i;
        this.f7509c = -1;
        this.f7510d = ((AbstractList) listBuilder).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public au3(cu3 cu3Var, int i, int i2) {
        this(cu3Var, (i2 & 1) != 0 ? 0 : i, 0, cu3Var.f34537a.f1294b);
        this.f7507a = 0;
    }

    public au3(cu3 cu3Var, int i, int i2, int i3) {
        this.f7507a = 0;
        this.f7511e = cu3Var;
        this.f7508b = i;
        this.f7509c = i2;
        this.f7510d = i3;
    }
}
