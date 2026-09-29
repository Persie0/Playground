package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sw2 {

    /* JADX INFO: renamed from: a */
    public final j8a f61508a;

    /* JADX INFO: renamed from: b */
    public final int[] f61509b;

    public sw2(j8a j8aVar, int... iArr) {
        if (iArr.length == 0) {
            ss5.m21724v("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f61508a = j8aVar;
        this.f61509b = iArr;
    }
}
