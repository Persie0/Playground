package p000;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class r21 extends qxc {
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    @Override // p000.qxc
    /* JADX INFO: renamed from: b */
    public final long mo17263b(ViewGroup viewGroup, daa daaVar, waa waaVar, waa waaVar2) {
        int i;
        Integer num;
        if (waaVar == null && waaVar2 == null) {
            return 0L;
        }
        if (waaVar2 == null) {
            i = -1;
        } else {
            if (((waaVar == null || (num = (Integer) waaVar.f66570a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
                i = -1;
            } else {
                waaVar = waaVar2;
                i = 1;
            }
        }
        int iM20196c = qxc.m20196c(waaVar, 0);
        int iM20196c2 = qxc.m20196c(waaVar, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        float fRound = Math.round(viewGroup.getTranslationX() + ((viewGroup.getWidth() / 2) + iArr[0])) - iM20196c;
        float fRound2 = Math.round(viewGroup.getTranslationY() + ((viewGroup.getHeight() / 2) + iArr[1])) - iM20196c2;
        float fSqrt = (float) Math.sqrt((fRound2 * fRound2) + (fRound * fRound));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j = daaVar.f35331c;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * fSqrt2);
    }
}
