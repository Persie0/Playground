package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0729e {

    /* JADX INFO: renamed from: a */
    public int[] f6719a;

    /* JADX INFO: renamed from: b */
    public ArrayList f6720b;

    /* JADX INFO: renamed from: a */
    public final void m2804a() {
        int[] iArr = this.f6719a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f6720b = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m2805b(int i) {
        int[] iArr = this.f6719a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f6719a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f6719a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f6719a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2806c(int i, int i2) {
        int[] iArr = this.f6719a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m2805b(i3);
        int[] iArr2 = this.f6719a;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.f6719a, i, i3, -1);
        ArrayList arrayList = this.f6720b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f6720b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f6704a;
            if (i4 >= i) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f6704a = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2807d(int i, int i2) {
        int[] iArr = this.f6719a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m2805b(i3);
        int[] iArr2 = this.f6719a;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.f6719a;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = this.f6720b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f6720b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f6704a;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.f6720b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f6704a = i4 - i2;
                }
            }
        }
    }
}
