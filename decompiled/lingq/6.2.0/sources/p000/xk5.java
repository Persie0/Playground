package p000;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class xk5 extends AbstractC0343j {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f68314b;

    /* JADX INFO: renamed from: c */
    public final Object f68315c;

    public /* synthetic */ xk5(Object obj, int i) {
        this.f68314b = i;
        this.f68315c = obj;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        int i = this.f68314b;
        Object obj = this.f68315c;
        switch (i) {
            case 0:
                return ((AbstractC0359i) obj).mo594a();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0391c) obj).getDensity().mo594a();
        }
    }

    @Override // androidx.compose.p002ui.layout.AbstractC0343j
    /* JADX INFO: renamed from: c */
    public float mo1527c(kv3 kv3Var) {
        float fIntBitsToFloat;
        int iM20844l0;
        switch (this.f68314b) {
            case 0:
                zi3 zi3Var = kv3Var.f48460a;
                if (zi3Var != null) {
                    return ((Number) zi3Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC0359i abstractC0359i = (AbstractC0359i) this.f68315c;
                if (abstractC0359i.f4367k) {
                    return Float.NaN;
                }
                AbstractC0359i abstractC0359i2 = abstractC0359i;
                while (true) {
                    C3488q8 c3488q8 = abstractC0359i2.f4360H;
                    float f = (c3488q8 == null || (iM20844l0 = AbstractC3550rv.m20844l0((kv3[]) c3488q8.f57369c, kv3Var)) < 0) ? Float.NaN : ((float[]) c3488q8.f57370d)[iM20844l0];
                    if (!Float.isNaN(f)) {
                        abstractC0359i2.m1631p0(abstractC0359i.mo1622J0(), kv3Var);
                        aq4 aq4VarMo1620H0 = abstractC0359i2.mo1620H0();
                        aq4 aq4VarMo1620H1 = abstractC0359i.mo1620H0();
                        switch (kv3Var.f48461b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (aq4VarMo1620H1.mo1667K(aq4VarMo1620H0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (aq4VarMo1620H0.mo1687j() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (aq4VarMo1620H1.mo1667K(aq4VarMo1620H0, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (aq4VarMo1620H0.mo1687j() & 4294967295L)) / 2.0f)))) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    AbstractC0359i abstractC0359iMo1625O0 = abstractC0359i2.mo1625O0();
                    if (abstractC0359iMo1625O0 == null) {
                        abstractC0359i2.m1631p0(abstractC0359i.mo1622J0(), kv3Var);
                        return Float.NaN;
                    }
                    abstractC0359i2 = abstractC0359iMo1625O0;
                }
                break;
            default:
                return super.mo1527c(kv3Var);
        }
    }

    @Override // androidx.compose.p002ui.layout.AbstractC0343j
    /* JADX INFO: renamed from: d */
    public final LayoutDirection mo1528d() {
        int i = this.f68314b;
        Object obj = this.f68315c;
        switch (i) {
            case 0:
                return ((AbstractC0359i) obj).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0391c) obj).getLayoutDirection();
        }
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        int i = this.f68314b;
        Object obj = this.f68315c;
        switch (i) {
            case 0:
                return ((AbstractC0359i) obj).mo597d0();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0391c) obj).getDensity().mo597d0();
        }
    }

    @Override // androidx.compose.p002ui.layout.AbstractC0343j
    /* JADX INFO: renamed from: e */
    public final int mo1529e() {
        int i = this.f68314b;
        Object obj = this.f68315c;
        switch (i) {
            case 0:
                return ((AbstractC0359i) obj).mo1642b0();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0391c) obj).getRoot().f4337b0.f58070p.f49301a;
        }
    }
}
