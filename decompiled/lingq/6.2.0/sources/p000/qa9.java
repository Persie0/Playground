package p000;

import android.app.PendingIntent;
import androidx.compose.material3.C0228e0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qa9 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0228e0 f57504b;

    public /* synthetic */ qa9(fb2 fb2Var, C0228e0 c0228e0) {
        this.f57503a = 1;
        this.f57504b = c0228e0;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws PendingIntent.CanceledException {
        int i;
        int i2 = this.f57503a;
        xfa xfaVar = xfa.f68157a;
        C0228e0 c0228e0 = this.f57504b;
        switch (i2) {
            case 0:
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                vi3 vi3Var = c0228e0.f3404e;
                if (vi3Var != null) {
                    vi3Var.invoke(f);
                } else {
                    c0228e0.m1143d(fFloatValue);
                }
                return xfaVar;
            case 1:
                n84 n84Var = (n84) obj;
                c0228e0.f3410k.m21223i((int) (n84Var.f52482a >> 32));
                c0228e0.f3411l.m21223i((int) (n84Var.f52482a & 4294967295L));
                return xfaVar;
            case 2:
                float fFloatValue2 = ((Float) obj).floatValue();
                h41 h41Var = c0228e0.f3402c;
                qc9 qc9Var = c0228e0.f3403d;
                float fM15944g = l70.m15944g(fFloatValue2, h41Var.f41765a, h41Var.f41766b);
                int i3 = c0228e0.f3400a;
                boolean z = false;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float fAbs = fM15944g;
                    float f2 = fAbs;
                    int i4 = 0;
                    while (true) {
                        float fM18232Q = AbstractC3423or.m18232Q(h41Var.f41765a, h41Var.f41766b, i4 / i);
                        float f3 = fM18232Q - fM15944g;
                        if (Math.abs(f3) <= fAbs) {
                            fAbs = Math.abs(f3);
                            f2 = fM18232Q;
                        }
                        if (i4 != i) {
                            i4++;
                        } else {
                            fM15944g = f2;
                        }
                    }
                }
                if (fM15944g != qc9Var.m19861h()) {
                    if (fM15944g != qc9Var.m19861h()) {
                        vi3 vi3Var2 = c0228e0.f3404e;
                        if (vi3Var2 != null) {
                            vi3Var2.invoke(Float.valueOf(fM15944g));
                        } else {
                            c0228e0.m1143d(fM15944g);
                        }
                    }
                    ui3 ui3Var = c0228e0.f3401b;
                    if (ui3Var != null) {
                        ui3Var.mo0a();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                c0228e0.m1141b(0.0f);
                c0228e0.f3414o.mo0a();
                return xfaVar;
        }
    }

    public /* synthetic */ qa9(C0228e0 c0228e0, int i) {
        this.f57503a = i;
        this.f57504b = c0228e0;
    }
}
