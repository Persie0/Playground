package p000;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qv5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tv5 f58247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Pair f58248c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ eh5 f58249d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ru5 f58250e;

    public /* synthetic */ qv5(tv5 tv5Var, Pair pair, eh5 eh5Var, ru5 ru5Var, int i) {
        this.f58246a = i;
        this.f58247b = tv5Var;
        this.f58248c = pair;
        this.f58249d = eh5Var;
        this.f58250e = ru5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f58246a;
        ru5 ru5Var = this.f58250e;
        eh5 eh5Var = this.f58249d;
        Pair pair = this.f58248c;
        tv5 tv5Var = this.f58247b;
        switch (i) {
            case 0:
                ((l52) tv5Var.f62948b.f67361i).mo11808g(((Integer) pair.first).intValue(), (jv5) pair.second, eh5Var, ru5Var);
                break;
            default:
                ((l52) tv5Var.f62948b.f67361i).mo11809j(((Integer) pair.first).intValue(), (jv5) pair.second, eh5Var, ru5Var);
                break;
        }
    }
}
