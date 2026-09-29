package p000;

import androidx.compose.foundation.gestures.AbstractC0104l;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk2 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64015a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f64016b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f64017c;

    public /* synthetic */ uk2(float f, Ref$BooleanRef ref$BooleanRef) {
        this.f64016b = f;
        this.f64017c = ref$BooleanRef;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f64015a;
        boolean z2 = false;
        float f = this.f64016b;
        Object obj2 = this.f64017c;
        switch (i) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                fl2 fl2Var = (fl2) obj;
                boolean zM11650l = fa4.m11650l(fl2Var.mo790S(), "waiting");
                if (fl2Var.mo880b0() == null) {
                    z = false;
                } else {
                    Orientation orientationMo880b0 = fl2Var.mo880b0();
                    orientationMo880b0.getClass();
                    aj3 aj3Var = AbstractC0104l.f2286a;
                    if (orientationMo880b0 != Orientation.Horizontal ? f <= 30.0f || f > 90.0f : f > 30.0f) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (ref$BooleanRef.f47713a || (zM11650l && z)) {
                    z2 = true;
                }
                ref$BooleanRef.f47713a = z2;
                return Boolean.valueOf(!z2);
            default:
                faa faaVar = (faa) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zM11673g = faaVar.m11673g();
                uc9 uc9Var = faaVar.f38741g;
                if (!zM11673g) {
                    if (uc9Var.m22673h() == Long.MIN_VALUE) {
                        uc9Var.m22674i(jLongValue);
                        ((xc9) faaVar.f38735a.f66456a).setValue(Boolean.TRUE);
                    }
                    long jM22673h = jLongValue - uc9Var.m22673h();
                    if (f != 0.0f) {
                        jM22673h = ss5.m21694U(jM22673h / ((double) f));
                    }
                    if (faaVar.f38736b == null) {
                        faaVar.f38740f.m22674i(jM22673h);
                    }
                    faaVar.m11674h(jM22673h, f == 0.0f);
                }
                return xfa.f68157a;
        }
    }

    public /* synthetic */ uk2(faa faaVar, float f) {
        this.f64017c = faaVar;
        this.f64016b = f;
    }
}
