package p000;

import com.google.firebase.crashlytics.internal.common.C1148a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sp1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61142a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f61143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f61144c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f61145d;

    public /* synthetic */ sp1(C3165jz c3165jz, Object obj, long j) {
        this.f61144c = c3165jz;
        this.f61145d = obj;
        this.f61143b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f61142a;
        long j = this.f61143b;
        Object obj = this.f61145d;
        Object obj2 = this.f61144c;
        switch (i) {
            case 0:
                String str = (String) obj;
                C1148a c1148a = ((tp1) obj2).f62660g;
                br1 br1Var = c1148a.f13663n;
                if (br1Var == null || !br1Var.f8884e.get()) {
                    ((q33) c1148a.f13658i.f8007b).mo4103e(str, j);
                }
                break;
            default:
                ew2 ew2Var = ((C3165jz) obj2).f46414b;
                String str2 = uma.f64080a;
                jw2 jw2Var = ew2Var.f37985a;
                l52 l52Var = jw2Var.f46300r;
                C3496qf c3496qfM15807I = l52Var.m15807I();
                l52Var.m15808J(c3496qfM15807I, 26, new vg1(c3496qfM15807I, obj, j));
                if (jw2Var.f46269P == obj) {
                    jw2Var.f46295m.m23271d(26, new fg2(1));
                }
                break;
        }
    }

    public /* synthetic */ sp1(tp1 tp1Var, long j, String str) {
        this.f61144c = tp1Var;
        this.f61143b = j;
        this.f61145d = str;
    }
}
