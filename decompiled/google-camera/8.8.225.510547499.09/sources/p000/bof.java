package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bof implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RuntimeException f3979a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3980b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f3981c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f3982d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ boh f3983e;

    public bof(boh bohVar, RuntimeException runtimeException, String str, int i, int i2) {
        this.f3983e = bohVar;
        this.f3979a = runtimeException;
        this.f3980b = str;
        this.f3981c = i;
        this.f3982d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3983e.f3984a.mo2790b(this.f3979a, this.f3980b, this.f3981c, this.f3982d);
    }
}
