package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qxc {

    /* JADX INFO: renamed from: a */
    public static final String[] f58358a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* JADX INFO: renamed from: a */
    public static void m20195a(waa waaVar) {
        View view = waaVar.f66571b;
        HashMap map = waaVar.f66570a;
        Integer numValueOf = (Integer) map.get("android:visibility:visibility");
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

    /* JADX INFO: renamed from: c */
    public static int m20196c(waa waaVar, int i) {
        int[] iArr;
        if (waaVar == null || (iArr = (int[]) waaVar.f66570a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo17263b(ViewGroup viewGroup, daa daaVar, waa waaVar, waa waaVar2);
}
