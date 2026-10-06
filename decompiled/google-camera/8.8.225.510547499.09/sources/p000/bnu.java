package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bnu {

    /* JADX INFO: renamed from: i */
    public static final boo f3896i = new boo("CamAgnt");

    /* JADX INFO: renamed from: a */
    public abstract Handler mo2742a();

    /* JADX INFO: renamed from: b */
    public abstract bod mo2743b();

    /* JADX INFO: renamed from: c */
    public abstract boh mo2744c();

    /* JADX INFO: renamed from: d */
    protected abstract boj mo2745d();

    /* JADX INFO: renamed from: e */
    public abstract bok mo2746e();

    /* JADX INFO: renamed from: f */
    public abstract void mo2747f(boh bohVar);

    /* JADX INFO: renamed from: g */
    public final void m2779g(boolean z) {
        try {
            if (!z) {
                mo2746e().m2806a(new baa(this, 7));
            } else {
                if (mo2745d().m2803d()) {
                    return;
                }
                bnt bntVar = new bnt();
                mo2746e().m2807b(new bey(this, bntVar, 7), bntVar.f3895b, "camera release");
            }
        } catch (RuntimeException e) {
            mo2744c().mo2759c(e);
        }
    }
}
