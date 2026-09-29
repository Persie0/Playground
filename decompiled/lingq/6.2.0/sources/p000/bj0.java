package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class bj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8575a;

    /* JADX INFO: renamed from: b */
    public int f8576b;

    public /* synthetic */ bj0(int i, int i2) {
        this.f8575a = i2;
        this.f8576b = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m3750a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* JADX INFO: renamed from: d */
    public boolean m3751d(int i) {
        return (this.f8576b & i) == i;
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo3752e();

    /* JADX INFO: renamed from: f */
    public abstract int mo3753f();

    /* JADX INFO: renamed from: g */
    public abstract int mo3754g();

    /* JADX INFO: renamed from: h */
    public abstract int mo3755h();

    /* JADX INFO: renamed from: j */
    public abstract int mo3756j();

    public String toString() {
        switch (this.f8575a) {
            case 2:
                return m3750a(this.f8576b);
            default:
                return super.toString();
        }
    }
}
