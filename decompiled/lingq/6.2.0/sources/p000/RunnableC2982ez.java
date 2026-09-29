package p000;

import com.google.common.collect.ImmutableList;

/* JADX INFO: renamed from: ez */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2982ez implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f38095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f38096c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f38097d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f38098e;

    public /* synthetic */ RunnableC2982ez(Object obj, int i, long j, long j2, int i2) {
        this.f38094a = i2;
        this.f38098e = obj;
        this.f38095b = i;
        this.f38096c = j;
        this.f38097d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f38094a;
        Object obj = this.f38098e;
        switch (i) {
            case 0:
                ew2 ew2Var = ((C3165jz) obj).f46414b;
                String str = uma.f64080a;
                l52 l52Var = ew2Var.f37985a.f46300r;
                final C3496qf c3496qfM15807I = l52Var.m15807I();
                final int i2 = this.f38095b;
                final long j = this.f38096c;
                final long j2 = this.f38097d;
                l52Var.m15808J(c3496qfM15807I, 1011, new sg5() { // from class: j52
                    @Override // p000.sg5
                    public final void invoke(Object obj2) {
                        ((InterfaceC3534rf) obj2).mo20606E(c3496qfM15807I, i2, j, j2);
                    }
                });
                break;
            default:
                l52 l52Var2 = ((h80) obj).f41928b;
                co7 co7Var = l52Var2.f49067d;
                C3496qf c3496qfM15804F = l52Var2.m15804F(((ImmutableList) co7Var.f10360c).isEmpty() ? null : (jv5) sgd.m21369a((ImmutableList) co7Var.f10360c));
                l52Var2.m15808J(c3496qfM15804F, 1006, new i52(c3496qfM15804F, this.f38095b, this.f38096c, this.f38097d));
                break;
        }
    }
}
