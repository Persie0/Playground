package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ka2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ma2 f46933b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f46934c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vqb f46935d;

    public /* synthetic */ ka2(ma2 ma2Var, Runnable runnable, vqb vqbVar, int i) {
        this.f46932a = i;
        this.f46933b = ma2Var;
        this.f46934c = runnable;
        this.f46935d = vqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f46932a;
        final vqb vqbVar = this.f46935d;
        final Runnable runnable = this.f46934c;
        ma2 ma2Var = this.f46933b;
        switch (i) {
            case 0:
                final int i2 = 0;
                ma2Var.f50827a.execute(new Runnable() { // from class: ia2
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i3 = i2;
                        vqb vqbVar2 = vqbVar;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    vqbVar2.m23481z(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    vqbVar2.m23481z(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    vqbVar2.m23480y(null);
                                    return;
                                } catch (Exception e3) {
                                    vqbVar2.m23481z(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                ma2Var.f50827a.execute(new Runnable() { // from class: ia2
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i4 = i3;
                        vqb vqbVar2 = vqbVar;
                        Runnable runnable2 = runnable;
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    vqbVar2.m23481z(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    vqbVar2.m23481z(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    vqbVar2.m23480y(null);
                                    return;
                                } catch (Exception e3) {
                                    vqbVar2.m23481z(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                ma2Var.f50827a.execute(new Runnable() { // from class: ia2
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i5 = i4;
                        vqb vqbVar2 = vqbVar;
                        Runnable runnable2 = runnable;
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    vqbVar2.m23481z(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    vqbVar2.m23481z(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    vqbVar2.m23480y(null);
                                    return;
                                } catch (Exception e3) {
                                    vqbVar2.m23481z(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
