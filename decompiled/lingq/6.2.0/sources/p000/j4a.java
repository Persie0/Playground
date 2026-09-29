package p000;

import androidx.compose.animation.core.C0059a;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.PopupInteractionState;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j4a implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f45049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f45050c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f45051d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f45052e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f45053f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f45054g;

    public /* synthetic */ j4a(float f, float f2, vi3 vi3Var, t66 t66Var, t66 t66Var2, t66 t66Var3, int i) {
        this.f45048a = i;
        this.f45049b = f;
        this.f45050c = f2;
        this.f45051d = vi3Var;
        this.f45052e = t66Var;
        this.f45053f = t66Var2;
        this.f45054g = t66Var3;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f45048a;
        xfa xfaVar = xfa.f68157a;
        s2a s2aVar = s2a.f60219a;
        t66 t66Var = this.f45054g;
        t66 t66Var2 = this.f45053f;
        t66 t66Var3 = this.f45052e;
        vi3 vi3Var = this.f45051d;
        float f = this.f45050c;
        float f2 = this.f45049b;
        switch (i) {
            case 0:
                C0059a c0059a = (C0059a) obj;
                if (gq6.m12821b(((gq6) c0059a.m745d()).f41189a, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L))) {
                    t66Var3.setValue(PopupInteractionState.Idle);
                    AbstractC1899b.m8702k(t66Var2, true);
                    vi3Var.invoke(s2aVar);
                    t66Var.setValue(Boolean.FALSE);
                } else if (Float.intBitsToFloat((int) (((gq6) c0059a.m745d()).f41189a & 4294967295L)) < f + 60.0f && Float.intBitsToFloat((int) (((gq6) c0059a.m745d()).f41189a >> 32)) < f2 + 30.0f) {
                    AbstractC1899b.m8702k(t66Var2, true);
                    vi3Var.invoke(s2aVar);
                }
                break;
            default:
                C0059a c0059a2 = (C0059a) obj;
                if (gq6.m12821b(((gq6) c0059a2.m745d()).f41189a, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L))) {
                    t66Var3.setValue(PopupInteractionState.Idle);
                    AbstractC1899b.m8702k(t66Var2, true);
                    vi3Var.invoke(s2aVar);
                    t66Var.setValue(Boolean.FALSE);
                } else if (Float.intBitsToFloat((int) (((gq6) c0059a2.m745d()).f41189a & 4294967295L)) < f + 60.0f && Float.intBitsToFloat((int) (((gq6) c0059a2.m745d()).f41189a >> 32)) < f2 + 30.0f) {
                    AbstractC1899b.m8702k(t66Var2, true);
                    vi3Var.invoke(s2aVar);
                }
                break;
        }
        return xfaVar;
    }
}
