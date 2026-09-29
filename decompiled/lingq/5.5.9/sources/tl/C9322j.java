package tl;

import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.C7168r;
import p349qo.C8656b;

/* JADX INFO: renamed from: tl.j */
/* JADX INFO: loaded from: classes2.dex */
public class C9322j extends C8656b {
    /* JADX INFO: renamed from: X */
    public static final <T> List<T> m17670X(T[] tArr) {
        C5207g.m11111f(tArr, "<this>");
        List<T> listAsList = Arrays.asList(tArr);
        C5207g.m11110e(listAsList, "asList(this)");
        return listAsList;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m17671Y(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        C5207g.m11111f(bArr, "<this>");
        C5207g.m11111f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    /* JADX INFO: renamed from: Z */
    public static final void m17672Z(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        C5207g.m11111f(iArr, "<this>");
        C5207g.m11111f(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m17673a0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        C5207g.m11111f(objArr, "<this>");
        C5207g.m11111f(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m17674b0(int[] iArr, int[] iArr2, int i10, int i11) {
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        m17672Z(0, 0, i10, iArr, iArr2);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m17675c0(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        m17673a0(i10, i11, i12, objArr, objArr2);
    }

    /* JADX INFO: renamed from: d0 */
    public static final float[] m17676d0(float[] fArr, int i10, int i11) {
        C8656b.m16906n(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        C5207g.m11110e(fArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return fArrCopyOfRange;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Object[] m17677e0(int i10, int i11, Object[] objArr) {
        C5207g.m11111f(objArr, "<this>");
        C8656b.m16906n(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        C5207g.m11110e(objArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m17678f0(int i10, int i11, Object[] objArr) {
        C5207g.m11111f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m17679g0(Object[] objArr, C7168r c7168r) {
        int length = objArr.length;
        C5207g.m11111f(objArr, "<this>");
        Arrays.fill(objArr, 0, length, c7168r);
    }
}
