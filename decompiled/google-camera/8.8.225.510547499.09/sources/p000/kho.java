package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kho {

    /* JADX INFO: renamed from: a */
    public final mxk f36065a;

    /* JADX INFO: renamed from: b */
    public final mxk f36066b;

    /* JADX INFO: renamed from: c */
    public final mxk f36067c;

    /* JADX INFO: renamed from: d */
    public final mxk f36068d;

    /* JADX INFO: renamed from: e */
    public final int f36069e;

    /* JADX INFO: renamed from: f */
    public final long f36070f;

    /* JADX INFO: renamed from: g */
    private final int f36071g;

    /* JADX INFO: renamed from: h */
    private final msi f36072h;

    public kho(mxk mxkVar, mxk mxkVar2, mxk mxkVar3, mxk mxkVar4, int i, msi msiVar) {
        int i2;
        boolean z = true;
        lku.m15669w(!mxkVar.isEmpty());
        if (i <= 0) {
            if (i == -1) {
                i = -1;
            } else {
                z = false;
            }
        }
        lku.m15672z(z, "Capacity %s must be greater than 0, or -1 to indicate that capacity is not tracked.", i);
        this.f36067c = mxkVar;
        this.f36065a = mxkVar2;
        this.f36066b = mxkVar3;
        this.f36068d = mxkVar4;
        this.f36069e = i;
        this.f36072h = msiVar;
        this.f36070f = lle.m15700t(mxkVar2);
        synchronized (kiu.class) {
            i2 = kiu.f36218a;
            kiu.f36218a = i2 + 1;
        }
        this.f36071g = i2;
    }

    /* JADX INFO: renamed from: a */
    public final jwn m14271a() {
        return (jwn) this.f36072h.mo6051a();
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set m14272b() {
        return this.f36068d;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set m14273c() {
        return this.f36067c;
    }

    public final String toString() {
        return "FrameStream-" + this.f36071g;
    }
}
