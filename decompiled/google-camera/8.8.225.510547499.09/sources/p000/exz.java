package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exz {

    /* JADX INFO: renamed from: a */
    public boolean f20931a;

    /* JADX INFO: renamed from: b */
    public boolean f20932b;

    /* JADX INFO: renamed from: c */
    public Object f20933c;

    public exz() {
        this.f20931a = true;
        this.f20932b = false;
    }

    public exz(byte[] bArr) {
    }

    /* JADX INFO: renamed from: a */
    public final void m8036a(adj adjVar) {
        synchronized (this) {
            while (this.f20932b) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.f20933c == adjVar) {
                return;
            }
            this.f20933c = adjVar;
            if (this.f20931a && adjVar != null) {
                adjVar.mo291a();
            }
        }
    }
}
