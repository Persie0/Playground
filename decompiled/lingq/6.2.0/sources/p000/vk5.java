package p000;

import androidx.compose.p002ui.node.AbstractC0359i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vk5 implements fb2 {

    /* JADX INFO: renamed from: a */
    public boolean f65535a;

    /* JADX INFO: renamed from: b */
    public long f65536b = 9223372034707292159L;

    /* JADX INFO: renamed from: c */
    public long f65537c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0359i f65538d;

    public vk5(AbstractC0359i abstractC0359i) {
        this.f65538d = abstractC0359i;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f65538d.mo594a();
    }

    /* JADX INFO: renamed from: b */
    public final aq4 m23362b() {
        this.f65535a = true;
        AbstractC0359i abstractC0359i = this.f65538d;
        aq4 aq4VarMo1620H0 = abstractC0359i.mo1620H0();
        if (f84.m11593b(this.f65536b, 9223372034707292159L)) {
            this.f65536b = pvc.m19495C(aq4VarMo1620H0.mo1695q(0L));
            this.f65537c = aq4VarMo1620H0.mo1687j();
        }
        abstractC0359i.mo1622J0().f4337b0.m20105b();
        return aq4VarMo1620H0;
    }

    /* JADX INFO: renamed from: c */
    public final void m23363c(kv3 kv3Var, float f) {
        AbstractC0359i abstractC0359i = this.f65538d;
        C3488q8 c3488q8 = abstractC0359i.f4360H;
        if (c3488q8 == null) {
            c3488q8 = new C3488q8();
            abstractC0359i.f4360H = c3488q8;
        }
        int iM20844l0 = AbstractC3550rv.m20844l0((kv3[]) c3488q8.f57369c, kv3Var);
        if (iM20844l0 >= 0) {
            float[] fArr = (float[]) c3488q8.f57370d;
            if (fArr[iM20844l0] != f) {
                fArr[iM20844l0] = f;
                ((byte[]) c3488q8.f57371e)[iM20844l0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c3488q8.f57371e;
                if (bArr[iM20844l0] == 2) {
                    bArr[iM20844l0] = 0;
                    return;
                }
                return;
            }
        }
        int i = c3488q8.f57368b;
        kv3[] kv3VarArr = (kv3[]) c3488q8.f57369c;
        if (i == kv3VarArr.length) {
            int i2 = i * 2;
            c3488q8.f57369c = (kv3[]) Arrays.copyOf(kv3VarArr, i2);
            c3488q8.f57370d = Arrays.copyOf((float[]) c3488q8.f57370d, i2);
            c3488q8.f57371e = Arrays.copyOf((byte[]) c3488q8.f57371e, i2);
        }
        ((kv3[]) c3488q8.f57369c)[i] = kv3Var;
        ((byte[]) c3488q8.f57371e)[i] = 3;
        ((float[]) c3488q8.f57370d)[i] = f;
        c3488q8.f57368b++;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f65538d.mo597d0();
    }
}
