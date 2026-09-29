package p286o2;

import java.util.ArrayList;

/* JADX INFO: renamed from: o2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7905e {

    /* JADX INFO: renamed from: a */
    public final int[] f43054a;

    /* JADX INFO: renamed from: b */
    public final float[] f43055b;

    public C7905e(int i10, int i11) {
        this.f43054a = new int[]{i10, i11};
        this.f43055b = new float[]{0.0f, 1.0f};
    }

    public C7905e(int i10, int i11, int i12) {
        this.f43054a = new int[]{i10, i11, i12};
        this.f43055b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C7905e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f43054a = new int[size];
        this.f43055b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f43054a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f43055b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }
}
