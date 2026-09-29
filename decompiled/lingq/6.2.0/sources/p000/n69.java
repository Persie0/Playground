package p000;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class n69 extends qxc {

    /* JADX INFO: renamed from: b */
    public int f52415b;

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    @Override // p000.qxc
    /* JADX INFO: renamed from: b */
    public final long mo17263b(ViewGroup viewGroup, daa daaVar, waa waaVar, waa waaVar2) {
        int i;
        int iAbs;
        Integer num;
        waa waaVar3 = waaVar;
        if (waaVar3 == null && waaVar2 == null) {
            return 0L;
        }
        if (waaVar2 == null) {
            i = -1;
        } else {
            if (((waaVar3 == null || (num = (Integer) waaVar3.f66570a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
                i = -1;
            } else {
                waaVar3 = waaVar2;
                i = 1;
            }
        }
        int iM20196c = qxc.m20196c(waaVar3, 0);
        int iM20196c2 = qxc.m20196c(waaVar3, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        int i2 = (iRound + width) / 2;
        int i3 = (iRound2 + height) / 2;
        int i4 = this.f52415b;
        if (i4 == 8388611) {
            if (viewGroup.getLayoutDirection() == 1) {
                i4 = 5;
            } else {
                i4 = 3;
            }
        } else if (i4 == 8388613) {
            if (viewGroup.getLayoutDirection() == 1) {
                i4 = 3;
            } else {
                i4 = 5;
            }
        }
        if (i4 == 3) {
            iAbs = Math.abs(i3 - iM20196c2) + (width - iM20196c);
        } else if (i4 == 5) {
            iAbs = Math.abs(i3 - iM20196c2) + (iM20196c - iRound);
        } else if (i4 != 48) {
            iAbs = i4 != 80 ? 0 : (iM20196c2 - iRound2) + Math.abs(i2 - iM20196c);
        } else {
            iAbs = Math.abs(i2 - iM20196c) + (height - iM20196c2);
        }
        float f = iAbs;
        int i5 = this.f52415b;
        float width2 = f / ((i5 == 3 || i5 == 5 || i5 == 8388611 || i5 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long j = daaVar.f35331c;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * width2);
    }
}
