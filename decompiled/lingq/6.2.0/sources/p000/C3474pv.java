package p000;

import java.util.RandomAccess;

/* JADX INFO: renamed from: pv */
/* JADX INFO: loaded from: classes2.dex */
public final class C3474pv extends AbstractC3816z0 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int[] f56844a;

    public C3474pv(int[] iArr) {
        this.f56844a = iArr;
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return AbstractC3550rv.m20822P(this.f56844a, ((Number) obj).intValue());
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f56844a.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.f56844a[i]);
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return AbstractC3550rv.m20843k0(this.f56844a, ((Number) obj).intValue());
    }

    @Override // p000.AbstractC3778y, java.util.Collection
    public final boolean isEmpty() {
        return this.f56844a.length == 0;
    }

    @Override // p000.AbstractC3816z0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            int[] iArr = this.f56844a;
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (iIntValue == iArr[length]) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        }
        return -1;
    }
}
