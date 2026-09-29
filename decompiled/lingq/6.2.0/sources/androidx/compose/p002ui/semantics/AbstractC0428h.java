package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import p000.e28;
import p000.e84;
import p000.kv8;
import p000.ma3;
import p000.nu2;
import p000.t56;
import p000.vi3;
import p000.vz1;
import p000.x91;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0428h {

    /* JADX INFO: renamed from: a */
    public static final Comparator[] f5026a;

    /* JADX INFO: renamed from: b */
    public static final zi3 f5027b;

    static {
        int i = 2;
        Comparator[] comparatorArr = new Comparator[2];
        int i2 = 0;
        while (i2 < 2) {
            comparatorArr[i2] = new nu2(new nu2(i2 == 0 ? ma3.f50831d : ma3.f50830c), i);
            i2++;
        }
        f5026a = comparatorArr;
        f5027b = SemanticsSortKt$UnmergedConfigComparator$1.f4941b;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1868a(C0423c c0423c, ArrayList arrayList, vi3 vi3Var, vi3 vi3Var2, t56 t56Var) {
        kv8 kv8Var = c0423c.f4974d;
        Object objM17255g = kv8Var.f48471a.m17255g(AbstractC0424d.f5007n);
        if (objM17255g == null) {
            objM17255g = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM17255g).booleanValue();
        if ((zBooleanValue || ((Boolean) vi3Var2.invoke(c0423c)).booleanValue()) && ((Boolean) vi3Var.invoke(c0423c)).booleanValue()) {
            arrayList.add(c0423c);
        }
        if (zBooleanValue) {
            t56Var.m21850i(c0423c.f4976f, m1869b(c0423c, vi3Var, vi3Var2, C0423c.m1839j(7, c0423c)));
            return;
        }
        List listM1839j = C0423c.m1839j(7, c0423c);
        int size = listM1839j.size();
        for (int i = 0; i < size; i++) {
            m1868a((C0423c) listM1839j.get(i), arrayList, vi3Var, vi3Var2, t56Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX INFO: renamed from: b */
    public static final ArrayList m1869b(C0423c c0423c, vi3 vi3Var, vi3 vi3Var2, List list) {
        int i;
        t56 t56Var = e84.f36837a;
        t56 t56Var2 = new t56();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m1868a((C0423c) list.get(i2), arrayList, vi3Var, vi3Var2, t56Var2);
        }
        int i3 = 1;
        char c = c0423c.f4973c.f4328U == LayoutDirection.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                C0423c c0423c2 = (C0423c) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new Pair(c0423c2.m1847h(), vz1.m23608N(c0423c2)));
                    break;
                }
                float f = c0423c2.m1847h().f36621b;
                float f2 = c0423c2.m1847h().f36623d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        e28 e28Var = (e28) ((Pair) arrayList2.get(i6)).f47623a;
                        float f3 = e28Var.f36621b;
                        i = i3;
                        float f4 = e28Var.f36623d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new Pair(new e28(Math.max(e28Var.f36620a, 0.0f), Math.max(e28Var.f36621b, f), Math.min(e28Var.f36622c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i6)).f47624b));
                            ((List) ((Pair) arrayList2.get(i6)).f47624b).add(c0423c2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new Pair(c0423c2.m1847h(), vz1.m23608N(c0423c2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        x91.m24414t0(arrayList2, ma3.f50832e);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f5026a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Pair pair = (Pair) arrayList2.get(i8);
            x91.m24414t0((List) pair.f47624b, comparator);
            arrayList3.addAll((Collection) pair.f47624b);
        }
        final zi3 zi3Var = f5027b;
        x91.m24414t0(arrayList3, new Comparator() { // from class: uv8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) zi3Var.invoke(obj, obj2)).intValue();
            }
        });
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) t56Var2.m10152b(((C0423c) arrayList3.get(size5)).f4976f);
            if (list2 != null) {
                if (((Boolean) vi3Var2.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
