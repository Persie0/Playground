package androidx.compose.p017ui.platform;

import cm.InterfaceC2052l;
import dm.C5207g;
import p352r1.C8721v;
import p352r1.InterfaceC8715p;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView_androidKt {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2052l<? super InterfaceC8715p, ? extends C8721v> f4081a = new InterfaceC2052l<InterfaceC8715p, C8721v>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$textInputServiceFactory$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8721v mo528n(InterfaceC8715p interfaceC8715p) {
            InterfaceC8715p interfaceC8715p2 = interfaceC8715p;
            C5207g.m11111f(interfaceC8715p2, "it");
            return new C8721v(interfaceC8715p2);
        }
    };

    /* JADX INFO: renamed from: a */
    public static final void m2302a(float[] fArr, float[] fArr2) {
        float fM2303b = m2303b(0, 0, fArr2, fArr);
        float fM2303b2 = m2303b(0, 1, fArr2, fArr);
        float fM2303b3 = m2303b(0, 2, fArr2, fArr);
        float fM2303b4 = m2303b(0, 3, fArr2, fArr);
        float fM2303b5 = m2303b(1, 0, fArr2, fArr);
        float fM2303b6 = m2303b(1, 1, fArr2, fArr);
        float fM2303b7 = m2303b(1, 2, fArr2, fArr);
        float fM2303b8 = m2303b(1, 3, fArr2, fArr);
        float fM2303b9 = m2303b(2, 0, fArr2, fArr);
        float fM2303b10 = m2303b(2, 1, fArr2, fArr);
        float fM2303b11 = m2303b(2, 2, fArr2, fArr);
        float fM2303b12 = m2303b(2, 3, fArr2, fArr);
        float fM2303b13 = m2303b(3, 0, fArr2, fArr);
        float fM2303b14 = m2303b(3, 1, fArr2, fArr);
        float fM2303b15 = m2303b(3, 2, fArr2, fArr);
        float fM2303b16 = m2303b(3, 3, fArr2, fArr);
        fArr[0] = fM2303b;
        fArr[1] = fM2303b2;
        fArr[2] = fM2303b3;
        fArr[3] = fM2303b4;
        fArr[4] = fM2303b5;
        fArr[5] = fM2303b6;
        fArr[6] = fM2303b7;
        fArr[7] = fM2303b8;
        fArr[8] = fM2303b9;
        fArr[9] = fM2303b10;
        fArr[10] = fM2303b11;
        fArr[11] = fM2303b12;
        fArr[12] = fM2303b13;
        fArr[13] = fM2303b14;
        fArr[14] = fM2303b15;
        fArr[15] = fM2303b16;
    }

    /* JADX INFO: renamed from: b */
    public static final float m2303b(int i10, int i11, float[] fArr, float[] fArr2) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 0] * fArr2[0 + i11]);
    }
}
