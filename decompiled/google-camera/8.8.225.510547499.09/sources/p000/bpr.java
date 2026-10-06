package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bpr implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f4097a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4098b;

    public bpr(bgm bgmVar, int i) {
        this.f4098b = i;
        this.f4097a = bgmVar;
    }

    public bpr(bpv bpvVar, int i) {
        this.f4098b = i;
        this.f4097a = bpvVar;
    }

    public bpr(iad iadVar, int i) {
        this.f4098b = i;
        this.f4097a = iadVar;
    }

    public bpr(Runnable runnable, int i) {
        this.f4098b = i;
        this.f4097a = runnable;
    }

    public bpr(kae kaeVar, int i) {
        this.f4098b = i;
        this.f4097a = kaeVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f4098b) {
            case 0:
                synchronized (this.f4097a) {
                    Object obj = this.f4097a;
                    if (((bpv) obj).f4112c != null) {
                        ((bpv) obj).m2894c();
                        if (((bpv) this.f4097a).m2895d()) {
                            ((bpv) this.f4097a).m2893b();
                            ((bpv) this.f4097a).f4113d = 0;
                        }
                    }
                }
                return null;
            case 1:
                return new bhb(this.f4097a);
            case 2:
                ((iad) this.f4097a).m10979e().onPause();
                return null;
            case 3:
                ((kae) this.f4097a).close();
                return null;
            default:
                this.f4097a.run();
                return null;
        }
    }
}
