package tl;

import dm.C5207g;
import java.util.RandomAccess;

/* JADX INFO: renamed from: tl.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C9321i extends AbstractC9313a<Integer> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int[] f48062a;

    public C9321i(int[] iArr) {
        this.f48062a = iArr;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        return this.f48062a.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f48062a;
        C5207g.m11111f(iArr, "<this>");
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (iIntValue == iArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(this.f48062a[i10]);
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f48062a;
        C5207g.m11111f(iArr, "<this>");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iIntValue == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f48062a.length == 0;
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f48062a;
        C5207g.m11111f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (iIntValue == iArr[length]) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }
}
