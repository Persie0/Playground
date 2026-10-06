package p000;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class koe implements Comparator {

    /* JADX INFO: renamed from: a */
    private final Comparator[] f36679a;

    public koe(Comparator[] comparatorArr) {
        this.f36679a = comparatorArr;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator[] comparatorArr = this.f36679a;
        Object[] objArr = ((kod) obj).f36677b;
        Object[] objArr2 = ((kod) obj2).f36677b;
        int length = comparatorArr.length;
        if (objArr.length == length && objArr2.length == length) {
            for (int i = 0; i < comparatorArr.length; i++) {
                int iCompare = comparatorArr[i].compare(objArr[i], objArr2[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("Unable to compare " + Arrays.toString(objArr) + " to " + Arrays.toString(objArr2) + " because the lengths are different from " + length);
    }
}
