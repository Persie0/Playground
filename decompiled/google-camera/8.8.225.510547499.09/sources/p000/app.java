package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class app {

    /* JADX INFO: renamed from: a */
    public final Object f2028a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f2029b;

    public app(C1075vr c1075vr) {
        this.f2029b = c1075vr;
        this.f2028a = ook.m18793g(false);
    }

    public app(String[] strArr, otq otqVar) {
        this.f2029b = otqVar;
        this.f2028a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m1809a() {
        if (((opk) this.f2028a).m18843b()) {
            Object obj = this.f2029b;
            synchronized (((C1075vr) obj).f47864b) {
                int i = ((C1075vr) obj).f47865c - 1;
                ((C1075vr) obj).f47865c = i;
                if (i == 0 && !((C1075vr) obj).f47867e) {
                    ((C1075vr) obj).m19508a();
                }
            }
        }
    }
}
