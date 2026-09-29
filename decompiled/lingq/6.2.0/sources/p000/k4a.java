package p000;

import androidx.compose.animation.core.C0059a;
import com.lingq.core.token.PopupInteractionState;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k4a implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46705a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f46706b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f46707c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f46708d;

    public /* synthetic */ k4a(float f, float f2, t66 t66Var) {
        this.f46706b = f;
        this.f46707c = f2;
        this.f46708d = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f46705a;
        float f = this.f46707c;
        float f2 = this.f46706b;
        Object obj2 = this.f46708d;
        switch (i) {
            case 0:
                t66 t66Var = (t66) obj2;
                if (gq6.m12821b(((gq6) ((C0059a) obj).m745d()).f41189a, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32))) {
                    t66Var.setValue(PopupInteractionState.Idle);
                }
                return xfa.f68157a;
            default:
                e28 e28Var = (e28) obj2;
                ((fb2) obj).getClass();
                return new f84((((long) ss5.m21693T(e28Var.f36621b + f)) & 4294967295L) | (((long) ss5.m21693T(Float.intBitsToFloat((int) (e28Var.m10803d() >> 32)) - (f2 / 2.0f))) << 32));
        }
    }

    public /* synthetic */ k4a(e28 e28Var, float f, float f2) {
        this.f46708d = e28Var;
        this.f46706b = f;
        this.f46707c = f2;
    }
}
