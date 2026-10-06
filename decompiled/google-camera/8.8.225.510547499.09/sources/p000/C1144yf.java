package p000;

/* JADX INFO: renamed from: yf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1144yf {

    /* JADX INFO: renamed from: a */
    C1146yh f48121a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1145yg f48122b;

    public C1144yf(C1145yg c1145yg) {
        this.f48122b = c1145yg;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f48121a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.f48121a.f48135i[i] + " ";
            }
        }
        return str + "] " + this.f48121a;
    }
}
