package p000;

import androidx.compose.p002ui.node.AbstractC0351a;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.platform.C0403o;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class oq4 extends AbstractC0351a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f54731j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq4(InterfaceC3682ve interfaceC3682ve, int i) {
        super(interfaceC3682ve);
        this.f54731j = i;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0351a
    /* JADX INFO: renamed from: b */
    public final long mo1533b(AbstractC0362l abstractC0362l, long j) {
        switch (this.f54731j) {
            case 0:
                b17 b17Var = abstractC0362l.f4455g0;
                if (b17Var != null) {
                    C0403o c0403o = (C0403o) b17Var;
                    float[] fArrM1807b = c0403o.m1807b();
                    if (!c0403o.f4840N) {
                        j = ts5.m22287b(fArrM1807b, j);
                    }
                }
                return pvc.m19493A(j, abstractC0362l.f4443U);
            default:
                yk5 yk5VarMo1542d1 = abstractC0362l.mo1542d1();
                yk5VarMo1542d1.getClass();
                long j2 = yk5VarMo1542d1.f69929K;
                return gq6.m12825f((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
        }
    }

    @Override // androidx.compose.p002ui.node.AbstractC0351a
    /* JADX INFO: renamed from: c */
    public final Map mo1534c(AbstractC0362l abstractC0362l) {
        switch (this.f54731j) {
            case 0:
                return abstractC0362l.mo1624N0().mo10624b();
            default:
                yk5 yk5VarMo1542d1 = abstractC0362l.mo1542d1();
                yk5VarMo1542d1.getClass();
                return yk5VarMo1542d1.mo1624N0().mo10624b();
        }
    }

    @Override // androidx.compose.p002ui.node.AbstractC0351a
    /* JADX INFO: renamed from: d */
    public final int mo1535d(AbstractC0362l abstractC0362l, AbstractC3608te abstractC3608te) {
        switch (this.f54731j) {
            case 0:
                return abstractC0362l.mo1630V(abstractC3608te);
            default:
                yk5 yk5VarMo1542d1 = abstractC0362l.mo1542d1();
                yk5VarMo1542d1.getClass();
                return yk5VarMo1542d1.mo1630V(abstractC3608te);
        }
    }
}
