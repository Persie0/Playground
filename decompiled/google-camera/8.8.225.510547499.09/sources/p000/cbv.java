package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cbv {

    /* JADX INFO: renamed from: a */
    public long f4970a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f4971b;

    /* JADX INFO: renamed from: c */
    private final jwn f4972c;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, jwn] */
    public cbv(djm djmVar, chx chxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ?? r1 = djmVar.f11788b;
        this.f4972c = r1;
        this.f4971b = ((Boolean) ((jwf) r1).f34942d).booleanValue();
        chxVar.f5767b.m13537d(r1.mo3830a(new cbx(this, 1), not.INSTANCE));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3410a() {
        return ((Boolean) ((jwf) this.f4972c).f34942d).booleanValue() || System.currentTimeMillis() - this.f4970a < 3000;
    }
}
