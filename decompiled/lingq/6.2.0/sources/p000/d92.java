package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d92 extends s8a {

    /* JADX INFO: renamed from: F */
    public static final d92 f35197F = new d92(new c92());

    /* JADX INFO: renamed from: A */
    public final boolean f35198A;

    /* JADX INFO: renamed from: B */
    public final boolean f35199B;

    /* JADX INFO: renamed from: C */
    public final boolean f35200C;

    /* JADX INFO: renamed from: D */
    public final SparseArray f35201D;

    /* JADX INFO: renamed from: E */
    public final SparseBooleanArray f35202E;

    /* JADX INFO: renamed from: w */
    public final boolean f35203w;

    /* JADX INFO: renamed from: x */
    public final boolean f35204x;

    /* JADX INFO: renamed from: y */
    public final boolean f35205y;

    /* JADX INFO: renamed from: z */
    public final boolean f35206z;

    static {
        AbstractC3393o1.m17746u(DescriptorProtos.Edition.EDITION_2023_VALUE, 1001, 1002, 1003, 1004);
        AbstractC3393o1.m17746u(1005, 1006, 1007, 1008, 1009);
        AbstractC3393o1.m17746u(1010, 1011, 1012, 1013, 1014);
        uma.m22828w(1015);
        uma.m22828w(1016);
        uma.m22828w(1017);
        uma.m22828w(1018);
    }

    public d92(c92 c92Var) {
        super(c92Var);
        this.f35203w = c92Var.f9750w;
        this.f35204x = c92Var.f9751x;
        this.f35205y = c92Var.f9752y;
        this.f35206z = c92Var.f9753z;
        this.f35198A = c92Var.f9745A;
        this.f35199B = c92Var.f9746B;
        this.f35200C = c92Var.f9747C;
        this.f35201D = c92Var.f9748D;
        this.f35202E = c92Var.f9749E;
    }

    @Override // p000.s8a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d92.class == obj.getClass()) {
            d92 d92Var = (d92) obj;
            if (super.equals(d92Var) && this.f35203w == d92Var.f35203w && this.f35204x == d92Var.f35204x && this.f35205y == d92Var.f35205y && this.f35206z == d92Var.f35206z && this.f35198A == d92Var.f35198A && this.f35199B == d92Var.f35199B && this.f35200C == d92Var.f35200C) {
                SparseBooleanArray sparseBooleanArray = d92Var.f35202E;
                SparseBooleanArray sparseBooleanArray2 = this.f35202E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = d92Var.f35201D;
                    SparseArray sparseArray2 = this.f35201D;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        k8a k8aVar = (k8a) entry.getKey();
                                        if (!map2.containsKey(k8aVar) || !Objects.equals(entry.getValue(), map2.get(k8aVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.s8a
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f35203w ? 1 : 0)) * 961) + (this.f35204x ? 1 : 0)) * 961) + (this.f35205y ? 1 : 0)) * 28629151) + (this.f35206z ? 1 : 0)) * 31) + (this.f35198A ? 1 : 0)) * 31) + (this.f35199B ? 1 : 0)) * 961) + (this.f35200C ? 1 : 0)) * 31;
    }
}
