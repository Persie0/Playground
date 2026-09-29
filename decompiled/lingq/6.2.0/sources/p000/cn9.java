package p000;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes2.dex */
public interface cn9 {
    /* JADX INFO: renamed from: C */
    void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var);

    /* JADX INFO: renamed from: i */
    default wm9 mo4903i(byte[] bArr, int i, int i2) {
        c14 c14VarM6284m = ImmutableList.m6284m();
        mo4902C(bArr, 0, i2, new dw6(c14VarM6284m, 12));
        return new hs1(c14VarM6284m.m4280g());
    }

    default void reset() {
    }
}
