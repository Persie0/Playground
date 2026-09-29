package androidx.compose.p017ui.text;

import ae.C0062b;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p231l1.C7214h;

/* JADX INFO: renamed from: androidx.compose.ui.text.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0691b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4555a = 0;

    static {
        EmptyList emptyList = null;
        EmptyList emptyList2 = (6 & 2) != 0 ? EmptyList.f38032a : null;
        if ((6 & 4) != 0) {
            emptyList = EmptyList.f38032a;
        }
        C5207g.m11111f(emptyList2, "spanStyles");
        C5207g.m11111f(emptyList, "paragraphStyles");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final ArrayList m2581a(int i10, int i11, List list) {
        ArrayList arrayList;
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                C0689a.b bVar = (C0689a.b) obj;
                if (m2583c(i10, i11, bVar.f4537b, bVar.f4538c)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                C0689a.b bVar2 = (C0689a.b) arrayList2.get(i13);
                arrayList.add(new C0689a.b(Math.max(i10, bVar2.f4537b) - i10, Math.min(i11, bVar2.f4538c) - i10, bVar2.f4536a, bVar2.f4539d));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final List<C0689a.b<C7214h>> m2582b(C0689a c0689a, int i10, int i11) {
        List<C0689a.b<C7214h>> list;
        if (i10 == i11 || (list = c0689a.f4524b) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= c0689a.f4523a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C0689a.b<C7214h> bVar = list.get(i12);
            C0689a.b<C7214h> bVar2 = bVar;
            if (m2583c(i10, i11, bVar2.f4537b, bVar2.f4538c)) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C0689a.b bVar3 = (C0689a.b) arrayList.get(i13);
            arrayList2.add(new C0689a.b(C0062b.m361k0(bVar3.f4537b, i10, i11) - i10, C0062b.m361k0(bVar3.f4538c, i10, i11) - i10, bVar3.f4536a));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    /* JADX INFO: renamed from: c */
    public static final boolean m2583c(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (Math.max(i10, i12) < Math.min(i11, i13)) {
            return true;
        }
        if (i10 > i12 || i13 > i11) {
            z10 = false;
        } else {
            if (i11 == i13) {
                if ((i12 == i13) != (i10 == i11)) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        if (z10) {
            return true;
        }
        if (i12 > i10 || i11 > i13) {
            z11 = false;
        } else {
            if (i13 == i11) {
                if ((i10 == i11) != (i12 == i13)) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        return z11;
    }
}
