package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cdk {

    /* JADX INFO: renamed from: a */
    private volatile int f5306a;

    /* JADX INFO: renamed from: b */
    private volatile int f5307b;

    /* JADX INFO: renamed from: c */
    private volatile int f5308c;

    /* JADX INFO: renamed from: d */
    private volatile int f5309d;

    public cdk() {
        m3493a();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3493a() {
        this.f5309d = 1;
        this.f5308c = 0;
        this.f5306a = 0;
        this.f5307b = 0;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m3494b(gst gstVar) {
        boolean z;
        this.f5306a++;
        z = false;
        if (gstVar.m9712b()) {
            this.f5308c++;
        } else {
            this.f5308c = 0;
        }
        if (this.f5306a - this.f5307b >= 30) {
            if (this.f5308c > 30) {
                if (this.f5309d != 3) {
                    this.f5309d = 3;
                    z = true;
                }
            } else if (this.f5309d != 2) {
                this.f5309d = 2;
            }
            if (z) {
                this.f5307b = this.f5306a;
                this.f5309d = 1;
            }
        }
        return z;
    }
}
