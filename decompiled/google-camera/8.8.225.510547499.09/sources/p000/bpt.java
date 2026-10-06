package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bpt {

    /* JADX INFO: renamed from: a */
    public final bpu f4099a;

    /* JADX INFO: renamed from: b */
    public final boolean[] f4100b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ bpv f4101c;

    /* JADX INFO: renamed from: d */
    private boolean f4102d;

    public bpt(bpv bpvVar, bpu bpuVar) {
        this.f4101c = bpvVar;
        this.f4099a = bpuVar;
        this.f4100b = bpuVar.f4107e ? null : new boolean[bpvVar.f4111b];
    }

    /* JADX INFO: renamed from: a */
    public final void m2876a() {
        this.f4101c.m2892a(this, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m2877b() {
        if (this.f4102d) {
            return;
        }
        try {
            m2876a();
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2878c() {
        this.f4101c.m2892a(this, true);
        this.f4102d = true;
    }

    /* JADX INFO: renamed from: d */
    public final File m2879d() {
        File fileM2884d;
        synchronized (this.f4101c) {
            bpu bpuVar = this.f4099a;
            if (bpuVar.f4108f != this) {
                throw new IllegalStateException();
            }
            if (!bpuVar.f4107e) {
                this.f4100b[0] = true;
            }
            fileM2884d = bpuVar.m2884d();
            this.f4101c.f4110a.mkdirs();
        }
        return fileM2884d;
    }
}
