package p000;

import androidx.compose.p002ui.layout.IntrinsicMinMax;
import androidx.compose.p002ui.layout.IntrinsicWidthHeight;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface p46 {
    /* JADX INFO: renamed from: a */
    default int mo1203a(aa4 aa4Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new s62((ct5) list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList2.add(arrayList3);
        }
        return mo1204b(new ha4(aa4Var, aa4Var.getLayoutDirection()), arrayList2, dk1.m10424b(0, 0, 0, i, 7)).mo10626d();
    }

    /* JADX INFO: renamed from: b */
    it5 mo1204b(jt5 jt5Var, List list, long j);

    /* JADX INFO: renamed from: c */
    default int mo1205c(aa4 aa4Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new s62((ct5) list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList2.add(arrayList3);
        }
        return mo1204b(new ha4(aa4Var, aa4Var.getLayoutDirection()), arrayList2, dk1.m10424b(0, 0, 0, i, 7)).mo10626d();
    }

    /* JADX INFO: renamed from: d */
    default int mo1206d(aa4 aa4Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new s62((ct5) list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList2.add(arrayList3);
        }
        return mo1204b(new ha4(aa4Var, aa4Var.getLayoutDirection()), arrayList2, dk1.m10424b(0, i, 0, 0, 13)).mo10623a();
    }

    /* JADX INFO: renamed from: e */
    default int mo1207e(aa4 aa4Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new s62((ct5) list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList2.add(arrayList3);
        }
        return mo1204b(new ha4(aa4Var, aa4Var.getLayoutDirection()), arrayList2, dk1.m10424b(0, i, 0, 0, 13)).mo10623a();
    }
}
