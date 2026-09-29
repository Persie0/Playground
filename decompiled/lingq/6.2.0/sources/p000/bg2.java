package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bg2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f8489a;

    /* JADX INFO: renamed from: b */
    public final int[] f8490b;

    /* JADX INFO: renamed from: c */
    public final int[] f8491c;

    /* JADX INFO: renamed from: d */
    public final vj6 f8492d;

    /* JADX INFO: renamed from: e */
    public final int f8493e;

    /* JADX INFO: renamed from: f */
    public final int f8494f;

    /* JADX INFO: renamed from: g */
    public final boolean f8495g;

    public bg2(vj6 vj6Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.f8489a = arrayList;
        this.f8490b = iArr;
        this.f8491c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f8492d = vj6Var;
        RunnableC3626tw runnableC3626tw = (RunnableC3626tw) vj6Var.f65506b;
        int size = ((List) runnableC3626tw.f62973c).size();
        this.f8493e = size;
        int size2 = ((List) runnableC3626tw.f62974d).size();
        this.f8494f = size2;
        this.f8495g = true;
        ag2 ag2Var = arrayList.isEmpty() ? null : (ag2) arrayList.get(0);
        if (ag2Var == null || ag2Var.f597a != 0 || ag2Var.f598b != 0) {
            arrayList.add(0, new ag2(0, 0, 0));
        }
        arrayList.add(new ag2(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ag2 ag2Var2 = (ag2) it.next();
            for (int i3 = 0; i3 < ag2Var2.f599c; i3++) {
                int i4 = ag2Var2.f597a + i3;
                int i5 = ag2Var2.f598b + i3;
                int i6 = vj6Var.m23343o(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f8495g) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                ag2 ag2Var3 = (ag2) it2.next();
                while (true) {
                    i = ag2Var3.f597a;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size3 = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size3; i9++) {
                                ag2 ag2Var4 = (ag2) arrayList.get(i9);
                                while (true) {
                                    i2 = ag2Var4.f598b;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && vj6Var.m23344p(i7, i8)) {
                                            int i10 = vj6Var.m23343o(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = ag2Var4.f599c + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = ag2Var3.f599c + i;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static cg2 m3693a(ArrayDeque arrayDeque, int i, boolean z) {
        cg2 cg2Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                cg2Var = null;
                break;
            }
            cg2Var = (cg2) it.next();
            if (cg2Var.f10010a == i && cg2Var.f10012c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            cg2 cg2Var2 = (cg2) it.next();
            if (z) {
                cg2Var2.f10011b--;
            } else {
                cg2Var2.f10011b++;
            }
        }
        return cg2Var;
    }
}
