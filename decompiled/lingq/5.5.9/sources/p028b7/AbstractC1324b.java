package p028b7;

import android.support.v4.media.AbstractC0140a;
import android.view.View;
import java.util.HashMap;
import p406u4.C9425n0;

/* JADX INFO: renamed from: b7.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1324b extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public static final String[] f8082a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* JADX INFO: renamed from: k0 */
    public static int m4889k0(C9425n0 c9425n0, int i10) {
        int[] iArr;
        if (c9425n0 == null || (iArr = (int[]) c9425n0.f48372a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: L */
    public void mo574L() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: j */
    public void mo600j(C9425n0 c9425n0) {
        HashMap map = c9425n0.f48372a;
        Integer numValueOf = (Integer) map.get("android:visibility:visibility");
        View view = c9425n0.f48373b;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        map.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + iRound;
        int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = iRound2;
        iArr[1] = (view.getHeight() / 2) + iRound2;
        map.put("android:visibilityPropagation:center", iArr);
    }
}
