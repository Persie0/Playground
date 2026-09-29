package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes2.dex */
public final class d11 implements InterfaceC3624tu {

    /* JADX INFO: renamed from: a */
    public final float f34822a;

    /* JADX INFO: renamed from: b */
    public final float f34823b;

    /* JADX INFO: renamed from: c */
    public final float f34824c;

    public d11(float f) {
        this.f34822a = f;
        this.f34823b = f;
        this.f34824c = (f + f) / 2.0f;
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: a */
    public final float mo9967a() {
        return this.f34824c;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: j */
    public final void mo9968j(fb2 fb2Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iMo916w0 = fb2Var.mo916w0(this.f34822a);
        int iMo916w1 = fb2Var.mo916w0(this.f34823b);
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i4 + 1;
            if (i4 == 0) {
                i2 = 0;
            } else if (i4 == 1) {
                int i7 = iArr[0];
                i2 = i7 + (i7 > 0 ? iMo916w0 : iMo916w1);
            } else if (i4 != 2) {
                i2 = 0;
            } else {
                i2 = i - i5;
            }
            if (layoutDirection != LayoutDirection.Ltr) {
                i2 = (i - i2) - i5;
            }
            iArr2[i4] = i2;
            i3++;
            i4 = i6;
        }
    }
}
