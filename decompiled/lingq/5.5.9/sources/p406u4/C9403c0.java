package p406u4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p028b7.AbstractC1324b;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9403c0 extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public int f48223b = 80;

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: Q */
    public final long mo579Q(ViewGroup viewGroup, AbstractC9409f0 abstractC9409f0, C9425n0 c9425n0, C9425n0 c9425n1) {
        int i10;
        int iCenterX;
        int iCenterY;
        int i11;
        int iAbs;
        Integer num;
        C9425n0 c9425n2 = c9425n0;
        if (c9425n2 == null && c9425n1 == null) {
            return 0L;
        }
        AbstractC9409f0.d dVar = abstractC9409f0.f48289T;
        Rect rectMo17809a = dVar == null ? null : dVar.mo17809a();
        if (c9425n1 != null) {
            int iIntValue = 8;
            if (c9425n2 != null && (num = (Integer) c9425n2.f48372a.get("android:visibilityPropagation:visibility")) != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == 0) {
                i10 = -1;
            } else {
                c9425n2 = c9425n1;
                i10 = 1;
            }
        } else {
            i10 = -1;
        }
        int iM4889k0 = AbstractC1324b.m4889k0(c9425n2, 0);
        int iM4889k1 = AbstractC1324b.m4889k0(c9425n2, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectMo17809a != null) {
            iCenterX = rectMo17809a.centerX();
            iCenterY = rectMo17809a.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        int i12 = this.f48223b;
        if (i12 == 8388611) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.e.m18686d(viewGroup) == 1) {
                i11 = 3;
                i12 = 5;
            } else {
                i11 = 3;
                i12 = 3;
            }
        } else if (i12 == 8388613) {
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            if (C10029b0.e.m18686d(viewGroup) == 1) {
                i11 = 3;
                i12 = 3;
            } else {
                i11 = 3;
                i12 = 5;
            }
        } else {
            i11 = 3;
        }
        if (i12 == i11) {
            iAbs = Math.abs(iCenterY - iM4889k1) + (width - iM4889k0);
        } else if (i12 == 5) {
            iAbs = Math.abs(iCenterY - iM4889k1) + (iM4889k0 - iRound);
        } else if (i12 != 48) {
            iAbs = i12 != 80 ? 0 : Math.abs(iCenterX - iM4889k0) + (iM4889k1 - iRound2);
        } else {
            iAbs = Math.abs(iCenterX - iM4889k0) + (height - iM4889k1);
        }
        float f3 = iAbs;
        int i13 = this.f48223b;
        float width2 = f3 / ((i13 == 3 || i13 == 5 || i13 == 8388611 || i13 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long j10 = abstractC9409f0.f48293c;
        if (j10 < 0) {
            j10 = 300;
        }
        return Math.round(((j10 * ((long) i10)) / 3.0f) * width2);
    }
}
