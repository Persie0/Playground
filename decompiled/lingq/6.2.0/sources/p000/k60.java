package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k60 implements g60 {

    /* JADX INFO: renamed from: a */
    public final int f46750a;

    /* JADX INFO: renamed from: b */
    public final int f46751b;

    /* JADX INFO: renamed from: c */
    public final int f46752c;

    /* JADX INFO: renamed from: d */
    public final int f46753d;

    /* JADX INFO: renamed from: e */
    public final int f46754e;

    /* JADX INFO: renamed from: f */
    public final int f46755f;

    public k60(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f46750a = i;
        this.f46751b = i2;
        this.f46752c = i3;
        this.f46753d = i4;
        this.f46754e = i5;
        this.f46755f = i6;
    }

    /* JADX INFO: renamed from: a */
    public final int m14879a() {
        int i = this.f46750a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        ss5.m21707d0("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }

    @Override // p000.g60
    public final int getType() {
        return 1752331379;
    }
}
