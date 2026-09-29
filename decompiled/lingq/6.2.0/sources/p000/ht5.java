package p000;

import androidx.compose.p002ui.layout.IntrinsicMinMax;
import androidx.compose.p002ui.layout.IntrinsicWidthHeight;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ht5 {
    /* JADX INFO: renamed from: a */
    default int mo737a(aa4 aa4Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new s62((ct5) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo738b(new ha4(aa4Var, aa4Var.getLayoutDirection()), arrayList, dk1.m10424b(0, 0, 0, i, 7)).mo10626d();
    }

    /* JADX INFO: renamed from: b */
    it5 mo738b(jt5 jt5Var, List list, long j);

    /* JADX INFO: renamed from: c */
    default int mo739c(aa4 aa4Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new s62((ct5) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo738b(new ha4(aa4Var, aa4Var.getLayoutDirection()), arrayList, dk1.m10424b(0, 0, 0, i, 7)).mo10626d();
    }

    /* JADX INFO: renamed from: d */
    default int mo740d(aa4 aa4Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new s62((ct5) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo738b(new ha4(aa4Var, aa4Var.getLayoutDirection()), arrayList, dk1.m10424b(0, i, 0, 0, 13)).mo10623a();
    }

    /* JADX INFO: renamed from: e */
    default int mo741e(aa4 aa4Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new s62((ct5) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo738b(new ha4(aa4Var, aa4Var.getLayoutDirection()), arrayList, dk1.m10424b(0, i, 0, 0, 13)).mo10623a();
    }
}
