package p000;

/* JADX INFO: loaded from: classes.dex */
public final class q56 extends yr1 {
    /* JADX INFO: renamed from: e */
    public final void m19660e(eg7 eg7Var, int i) {
        float[] fArr = this.f70312a;
        int i2 = i + 1;
        long jMo505b = eg7Var.mo505b(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (jMo505b >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & jMo505b));
    }
}
