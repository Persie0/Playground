package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lap implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Object f37839a;

    /* JADX INFO: renamed from: b */
    private final lav f37840b;

    /* JADX INFO: renamed from: c */
    private final kyz f37841c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f37842d;

    public lap(Object obj, kyz kyzVar, lav lavVar, int i) {
        this.f37842d = i;
        this.f37839a = obj;
        this.f37840b = lavVar;
        this.f37841c = kyzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37842d) {
            case 0:
                lav.m15122k(this.f37839a, this.f37841c, this.f37840b);
                break;
            default:
                Object obj = this.f37839a;
                kyz kyzVar = this.f37841c;
                lav lavVar = this.f37840b;
                try {
                    lavVar.m15130l(kyzVar.mo8768a(obj));
                } catch (kzy e) {
                    lavVar.m15131m(e);
                    return;
                } catch (Throwable th) {
                    lavVar.m15131m(kzy.m15111a(th));
                    return;
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f37842d) {
            case 0:
                break;
        }
        return this.f37841c.toString();
    }
}
