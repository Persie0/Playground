package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knw implements kba {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AmbientDelegate f36658a;

    /* JADX INFO: renamed from: b */
    private final knt f36659b;

    /* JADX INFO: renamed from: c */
    private boolean f36660c;

    /* JADX INFO: renamed from: d */
    private boolean f36661d;

    public knw(AmbientDelegate ambientDelegate, knt kntVar, byte[] bArr, byte[] bArr2) {
        this.f36658a = ambientDelegate;
        this.f36659b = kntVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m14609a(boolean z) {
        synchronized (this) {
            if (!this.f36661d) {
                long j = this.f36659b.f36647a;
                if (j != 0) {
                    boolean z2 = this.f36660c;
                    if (z2 && !z) {
                        j = -j;
                    } else if (z2 || !z) {
                        j = 0;
                    }
                    this.f36660c = z;
                    this.f36658a.m1598ac(j);
                }
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f36661d) {
                return;
            }
            this.f36661d = true;
            long j = this.f36660c ? -this.f36659b.f36647a : 0L;
            kba kbaVarM1593Y = this.f36658a.m1593Y();
            this.f36659b.close();
            this.f36658a.m1598ac(j);
            kbaVarM1593Y.close();
        }
    }
}
