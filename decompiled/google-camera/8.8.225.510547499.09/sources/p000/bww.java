package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bww extends bwy {
    @Override // p000.bwy
    /* JADX INFO: renamed from: a */
    public final float mo3139a(int i, int i2, int i3, int i4) {
        if (f4674g) {
            return Math.min(i3 / i, i4 / i2);
        }
        int iMax = Math.max(i2 / i4, i / i3);
        if (iMax == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(iMax);
    }

    @Override // p000.bwy
    /* JADX INFO: renamed from: b */
    public final int mo3140b(int i, int i2, int i3, int i4) {
        return f4674g ? 2 : 1;
    }
}
