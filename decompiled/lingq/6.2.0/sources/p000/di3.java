package p000;

import androidx.compose.p002ui.draw.C0296c;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class di3 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35675a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f35676b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f35677c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f35678d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f35679e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f35680f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f35681g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f35682h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ dh9 f35683i;

    public /* synthetic */ di3(long j, float f, boolean z, int i, float f2, long j2, float f3, dh9 dh9Var) {
        this.f35677c = j;
        this.f35678d = f;
        this.f35676b = z;
        this.f35679e = i;
        this.f35680f = f2;
        this.f35681g = j2;
        this.f35682h = f3;
        this.f35683i = dh9Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        switch (this.f35675a) {
            case 0:
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                long j = this.f35677c;
                float f = this.f35678d;
                InterfaceC0310a.m1417c0(interfaceC0310a, j, f, 0L, 0.0f, null, 124);
                if (this.f35676b) {
                    int i = 0;
                    while (true) {
                        int i2 = this.f35679e;
                        if (i < i2) {
                            float fFloatValue = ((i / i2) + ((Number) this.f35683i.getValue()).floatValue()) % 1.0f;
                            float f2 = (this.f35680f * fFloatValue) + f;
                            float f3 = 1.0f - fFloatValue;
                            if (f3 < 0.0f) {
                                f3 = 0.0f;
                            }
                            float fPow = (float) Math.pow(f3, 2.0d);
                            if (fPow > 0.0f && f2 > f) {
                                InterfaceC0310a.m1417c0(interfaceC0310a, aa1.m198b(fPow, this.f35681g), f2, 0L, 0.0f, new el9(this.f35682h, 0.0f, 0, 0, 30), 108);
                            }
                            i++;
                        }
                    }
                }
                return xfa.f68157a;
            default:
                C0296c c0296c = (C0296c) obj;
                c0296c.getClass();
                return c0296c.m1348b(new di3(this.f35677c, this.f35678d, this.f35676b, this.f35679e, this.f35680f, this.f35681g, this.f35682h, this.f35683i));
        }
    }

    public /* synthetic */ di3(boolean z, long j, float f, int i, float f2, long j2, float f3, l44 l44Var) {
        this.f35676b = z;
        this.f35677c = j;
        this.f35678d = f;
        this.f35679e = i;
        this.f35680f = f2;
        this.f35681g = j2;
        this.f35682h = f3;
        this.f35683i = l44Var;
    }
}
