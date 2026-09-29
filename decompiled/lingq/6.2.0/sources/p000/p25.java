package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p25 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f55483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f55484c;

    public /* synthetic */ p25(long j, Object obj, int i) {
        this.f55482a = i;
        this.f55483b = j;
        this.f55484c = obj;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f55482a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f55484c;
        switch (i) {
            case 0:
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                ui0 ui0Var = vi0.Companion;
                List listM23605K = vz1.m23605K(new aa1(((aa1) ((t66) obj2).getValue()).f414a), new aa1(this.f55483b));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)) / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) / 2.0f;
                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
                long jMo1422h = interfaceC0310a.mo1422h();
                InterfaceC0310a.m1418s0(interfaceC0310a, ui0.m22748d(ui0Var, listM23605K, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), Math.max(Float.intBitsToFloat((int) ((jMo1422h >> 32) & 2147483647L)), Float.intBitsToFloat((int) (jMo1422h & 2147483647L)))), 0L, 0L, 0.0f, null, null, 0, 126);
                break;
            default:
                InterfaceC0310a.m1414L0((InterfaceC0310a) obj, this.f55483b, 0L, 0L, l70.m15944g(((Number) ((ui3) obj2).mo0a()).floatValue(), 0.0f, 1.0f), null, 0, 118);
                break;
        }
        return xfaVar;
    }
}
