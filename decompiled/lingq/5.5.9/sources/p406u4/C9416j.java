package p406u4;

import android.graphics.Rect;
import android.view.ViewGroup;
import p028b7.AbstractC1324b;

/* JADX INFO: renamed from: u4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9416j extends AbstractC1324b {
    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: Q */
    public final long mo579Q(ViewGroup viewGroup, AbstractC9409f0 abstractC9409f0, C9425n0 c9425n0, C9425n0 c9425n1) {
        int i10;
        int iRound;
        int iCenterX;
        Integer num;
        if (c9425n0 == null && c9425n1 == null) {
            return 0L;
        }
        if (c9425n1 != null) {
            int iIntValue = 8;
            if (c9425n0 != null && (num = (Integer) c9425n0.f48372a.get("android:visibilityPropagation:visibility")) != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == 0) {
                i10 = -1;
            } else {
                c9425n0 = c9425n1;
                i10 = 1;
            }
        } else {
            i10 = -1;
        }
        int iM4889k0 = AbstractC1324b.m4889k0(c9425n0, 0);
        int iM4889k1 = AbstractC1324b.m4889k0(c9425n0, 1);
        AbstractC9409f0.d dVar = abstractC9409f0.f48289T;
        Rect rectMo17809a = dVar == null ? null : dVar.mo17809a();
        if (rectMo17809a != null) {
            iCenterX = rectMo17809a.centerX();
            iRound = rectMo17809a.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
            iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + iArr[1]);
            iCenterX = iRound2;
        }
        float f3 = iCenterX - iM4889k0;
        float f10 = iRound - iM4889k1;
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f3 * f3));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j10 = abstractC9409f0.f48293c;
        if (j10 < 0) {
            j10 = 300;
        }
        return Math.round(((j10 * ((long) i10)) / 3.0f) * fSqrt2);
    }
}
