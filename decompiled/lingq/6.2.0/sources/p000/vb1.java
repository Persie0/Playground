package p000;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vb1 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65157b;

    public /* synthetic */ vb1(Object obj, int i) {
        this.f65156a = i;
        this.f65157b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f65156a;
        Object obj3 = this.f65157b;
        switch (i) {
            case 0:
                for (vi3 vi3Var : (vi3[]) obj3) {
                    int iM21718o = ss5.m21718o((Comparable) vi3Var.invoke(obj), (Comparable) vi3Var.invoke(obj2));
                    if (iM21718o != 0) {
                        return iM21718o;
                    }
                }
                return 0;
            case 1:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f12765P).compareTo(Boolean.valueOf(materialButton2.f12765P));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            default:
                zt5 zt5Var = (zt5) obj3;
                return zt5Var.mo11825d(obj2) - zt5Var.mo11825d(obj);
        }
    }
}
