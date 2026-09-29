package kotlin.collections;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import tl.AbstractC9313a;
import tl.C9322j;

/* JADX INFO: renamed from: kotlin.collections.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6754e<T> extends AbstractC9313a<T> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final Object[] f38079a;

    /* JADX INFO: renamed from: b */
    public final int f38080b;

    /* JADX INFO: renamed from: c */
    public int f38081c;

    /* JADX INFO: renamed from: d */
    public int f38082d;

    /* JADX INFO: renamed from: kotlin.collections.e$a */
    public static final class a extends AbstractC6743a<T> {

        /* JADX INFO: renamed from: c */
        public int f38083c;

        /* JADX INFO: renamed from: d */
        public int f38084d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C6754e<T> f38085e;

        public a(C6754e<T> c6754e) {
            this.f38085e = c6754e;
            this.f38083c = c6754e.mo1847a();
            this.f38084d = c6754e.f38081c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC6743a
        /* JADX INFO: renamed from: a */
        public final void mo13008a() {
            if (this.f38083c == 0) {
                this.f38045a = State.Done;
                return;
            }
            C6754e<T> c6754e = this.f38085e;
            m13375c(c6754e.f38079a[this.f38084d]);
            this.f38084d = (this.f38084d + 1) % c6754e.f38080b;
            this.f38083c--;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C6754e(int i10, Object[] objArr) {
        this.f38079a = objArr;
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m761g("ring buffer filled size should not be negative but it is ", i10).toString());
        }
        if (i10 > objArr.length ? false : z10) {
            this.f38080b = objArr.length;
            this.f38082d = i10;
        } else {
            StringBuilder sbM614j = C0141b.m614j("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
            sbM614j.append(objArr.length);
            throw new IllegalArgumentException(sbM614j.toString().toString());
        }
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        return this.f38082d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m13468f(int i10) {
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m761g("n shouldn't be negative but it is ", i10).toString());
        }
        if (i10 > this.f38082d) {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sbM614j = C0141b.m614j("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            sbM614j.append(this.f38082d);
            throw new IllegalArgumentException(sbM614j.toString().toString());
        }
        if (i10 > 0) {
            int i11 = this.f38081c;
            int i12 = this.f38080b;
            int i13 = (i11 + i10) % i12;
            Object[] objArr = this.f38079a;
            if (i11 > i13) {
                C9322j.m17678f0(i11, i12, objArr);
                C9322j.m17678f0(0, i13, objArr);
            } else {
                C9322j.m17678f0(i11, i13, objArr);
            }
            this.f38081c = i13;
            this.f38082d -= i10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.List
    public final T get(int i10) {
        int iMo1847a = mo1847a();
        if (i10 < 0 || i10 >= iMo1847a) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", iMo1847a));
        }
        return (T) this.f38079a[(this.f38081c + i10) % this.f38080b];
    }

    @Override // tl.AbstractC9313a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[mo1847a()]);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Object[] objArr;
        C5207g.m11111f(tArr, "array");
        if (tArr.length < mo1847a()) {
            tArr = (T[]) Arrays.copyOf(tArr, mo1847a());
            C5207g.m11110e(tArr, "copyOf(this, newSize)");
        }
        int iMo1847a = mo1847a();
        int i10 = this.f38081c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.f38079a;
            if (i12 >= iMo1847a || i10 >= this.f38080b) {
                break;
            }
            tArr[i12] = objArr[i10];
            i12++;
            i10++;
        }
        while (i12 < iMo1847a) {
            tArr[i12] = objArr[i11];
            i12++;
            i11++;
        }
        if (tArr.length > mo1847a()) {
            tArr[mo1847a()] = null;
        }
        return tArr;
    }
}
