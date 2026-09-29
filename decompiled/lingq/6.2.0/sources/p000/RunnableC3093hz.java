package p000;

/* JADX INFO: renamed from: hz */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3093hz implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f43226b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f43227c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f43228d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f43229e;

    public /* synthetic */ RunnableC3093hz(int i, long j, long j2, Object obj, String str) {
        this.f43225a = i;
        this.f43229e = obj;
        this.f43226b = str;
        this.f43227c = j;
        this.f43228d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f43225a;
        C3165jz c3165jz = (C3165jz) this.f43229e;
        switch (i) {
            case 0:
                ew2 ew2Var = c3165jz.f46414b;
                String str = uma.f64080a;
                l52 l52Var = ew2Var.f37985a.f46300r;
                C3496qf c3496qfM15807I = l52Var.m15807I();
                l52Var.m15808J(c3496qfM15807I, 1008, new y42(c3496qfM15807I, this.f43226b, this.f43228d, this.f43227c, 0));
                break;
            default:
                ew2 ew2Var2 = c3165jz.f46414b;
                String str2 = uma.f64080a;
                l52 l52Var2 = ew2Var2.f37985a.f46300r;
                C3496qf c3496qfM15807I2 = l52Var2.m15807I();
                l52Var2.m15808J(c3496qfM15807I2, 1016, new y42(c3496qfM15807I2, this.f43226b, this.f43228d, this.f43227c, 2));
                break;
        }
    }
}
