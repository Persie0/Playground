package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ips implements ipk {

    /* JADX INFO: renamed from: a */
    private long f31755a = -1;

    @Override // p000.ipk
    /* JADX INFO: renamed from: a */
    public final ipl mo3652a() {
        return ipl.FRAMERATE_LIMITER;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lby mo3653b() {
        return null;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3654c() {
        return kbd.m13925n(this);
    }

    @Override // p000.ipk, p000.kba, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean mo3662k() {
        return false;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: l */
    public final synchronized int mo3663l(kpw kpwVar, kpw kpwVar2) {
        long jMo7248d = kpwVar.mo7248d();
        long j = this.f31755a;
        if (j > 0 && jMo7248d - j < 25000000) {
            return 3;
        }
        this.f31755a = jMo7248d;
        return 2;
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int mo3664m(key keyVar, kgg kggVar, key keyVar2) {
        return kbd.m13927p(this, keyVar, kggVar, keyVar2);
    }

    @Override // p000.ipk
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int mo3665n(lcy lcyVar, ldx ldxVar) {
        return kbd.m13928q();
    }
}
