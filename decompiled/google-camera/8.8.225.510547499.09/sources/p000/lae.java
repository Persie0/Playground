package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lae implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f37806a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f37807b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f37808c;

    public lae(kzp kzpVar, kzy kzyVar, int i) {
        this.f37808c = i;
        this.f37806a = kzpVar;
        this.f37807b = kzyVar;
    }

    public lae(lav lavVar, Callable callable, int i) {
        this.f37808c = i;
        this.f37806a = lavVar;
        this.f37807b = callable;
    }

    public lae(lav lavVar, kzj kzjVar, int i) {
        this.f37808c = i;
        this.f37807b = lavVar;
        this.f37806a = kzjVar;
    }

    public final String toString() {
        switch (this.f37808c) {
            case 0:
                return this.f37807b.toString();
            case 1:
                return ((kzp) this.f37806a).f37778d.toString();
            default:
                return this.f37807b.toString() + "finallyHandleException[" + this.f37806a.toString() + "]";
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37808c) {
            case 0:
                try {
                    Object obj = this.f37806a;
                    Object objCall = this.f37807b.call();
                    objCall.getClass();
                    ((lav) obj).m15130l(objCall);
                    return;
                } catch (Exception e) {
                    ((lav) this.f37806a).m15131m(kzy.m15111a(e));
                    return;
                }
            case 1:
                try {
                    Object obj2 = this.f37806a;
                    ((kzp) obj2).f37778d.mo15092a(this.f37807b, ((kzp) obj2).f37779e, ((kzp) obj2).f37775a);
                    return;
                } catch (Throwable th) {
                    th = th;
                    if (th != this.f37807b) {
                        th = kzy.m15111a(th);
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, this.f37807b);
                            break;
                        } catch (Exception e2) {
                        }
                    }
                    ((kzp) this.f37806a).m15094a(th);
                    return;
                }
            default:
                if (((lav) this.f37807b).f37856a == null) {
                    throw msm.m16866a(((lav) this.f37807b).f37857b);
                }
                return;
        }
    }
}
