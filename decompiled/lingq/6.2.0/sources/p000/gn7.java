package p000;

import androidx.media3.exoplayer.source.C0717b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gn7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0717b f41051b;

    public /* synthetic */ gn7(C0717b c0717b, int i) {
        this.f41050a = i;
        this.f41051b = c0717b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f41050a;
        C0717b c0717b = this.f41051b;
        switch (i) {
            case 0:
                c0717b.m2562u();
                break;
            case 1:
                if (!c0717b.f6507k0) {
                    wu5 wu5Var = c0717b.f6471L;
                    wu5Var.getClass();
                    wu5Var.mo17593a(c0717b);
                }
                break;
            default:
                c0717b.f6495e0 = true;
                break;
        }
    }
}
