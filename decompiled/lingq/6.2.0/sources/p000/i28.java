package p000;

/* JADX INFO: loaded from: classes.dex */
public final class i28 implements h28 {

    /* JADX INFO: renamed from: a */
    public final String f43386a;

    /* JADX INFO: renamed from: b */
    public final kv3 f43387b = new kv3(1, null);

    /* JADX INFO: renamed from: c */
    public final kv3 f43388c = new kv3(0, null);

    /* JADX INFO: renamed from: d */
    public final kv3 f43389d = new kv3(1, null);

    /* JADX INFO: renamed from: e */
    public final kv3 f43390e = new kv3(0, null);

    public i28(String str) {
        this.f43386a = str;
    }

    @Override // p000.h28
    /* JADX INFO: renamed from: a */
    public final kv3 mo1482a() {
        return this.f43390e;
    }

    @Override // p000.h28
    /* JADX INFO: renamed from: b */
    public final kv3 mo1483b() {
        return this.f43387b;
    }

    @Override // p000.h28
    /* JADX INFO: renamed from: c */
    public final kv3 mo1484c() {
        return this.f43388c;
    }

    @Override // p000.h28
    /* JADX INFO: renamed from: d */
    public final kv3 mo1485d() {
        return this.f43389d;
    }

    public final String toString() {
        return ux5.m22986i(')', "RectRulers(", this.f43386a);
    }
}
