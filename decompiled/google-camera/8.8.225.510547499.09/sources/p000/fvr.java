package p000;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvr {

    /* JADX INFO: renamed from: a */
    public final fmf f23671a;

    /* JADX INFO: renamed from: b */
    public final fuc f23672b;

    /* JADX INFO: renamed from: c */
    public final nps f23673c;

    /* JADX INFO: renamed from: d */
    public final Future f23674d;

    public fvr() {
    }

    public fvr(fmf fmfVar, fuc fucVar, nps npsVar, Future future) {
        this.f23671a = fmfVar;
        this.f23672b = fucVar;
        this.f23673c = npsVar;
        this.f23674d = future;
    }

    /* JADX INFO: renamed from: a */
    public final void m8835a() {
        this.f23672b.close();
        this.f23673c.cancel(true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fvr) {
            fvr fvrVar = (fvr) obj;
            if (this.f23671a.equals(fvrVar.f23671a) && this.f23672b.equals(fvrVar.f23672b) && this.f23673c.equals(fvrVar.f23673c) && this.f23674d.equals(fvrVar.f23674d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f23671a.hashCode() ^ 1000003) * 1000003) ^ this.f23672b.hashCode()) * 1000003) ^ this.f23673c.hashCode()) * 1000003) ^ this.f23674d.hashCode();
    }

    public final String toString() {
        return "StartupTransaction{cameraKey=" + String.valueOf(this.f23671a) + ", camera=" + String.valueOf(this.f23672b) + ", starting=" + String.valueOf(this.f23673c) + ", previewSurface=" + String.valueOf(this.f23674d) + "}";
    }
}
