package p000;

import androidx.compose.p002ui.semantics.C0427g;

/* JADX INFO: loaded from: classes.dex */
public abstract class dv8 {

    /* JADX INFO: renamed from: a */
    public static final C0427g f36273a = new C0427g("SelectionHandleInfo");

    /* JADX INFO: renamed from: a */
    public static final long m10686a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
