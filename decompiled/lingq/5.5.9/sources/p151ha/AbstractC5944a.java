package p151ha;

/* JADX INFO: renamed from: ha.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5944a implements InterfaceC5948e {

    /* JADX INFO: renamed from: c */
    public final long f35392c;

    /* JADX INFO: renamed from: b */
    public final long f35391b = 0;

    /* JADX INFO: renamed from: d */
    public long f35393d = -1;

    public AbstractC5944a(long j10) {
        this.f35392c = j10;
    }

    @Override // p151ha.InterfaceC5948e
    public final boolean next() {
        long j10 = this.f35393d + 1;
        this.f35393d = j10;
        return !(j10 > this.f35392c);
    }
}
