package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lv5 implements kk1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fm2 f50187a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh5 f50188b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ru5 f50189c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IOException f50190d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f50191e;

    public /* synthetic */ lv5(fm2 fm2Var, eh5 eh5Var, ru5 ru5Var, IOException iOException, boolean z) {
        this.f50187a = fm2Var;
        this.f50188b = eh5Var;
        this.f50189c = ru5Var;
        this.f50190d = iOException;
        this.f50191e = z;
    }

    @Override // p000.kk1
    public final void accept(Object obj) {
        ov5 ov5Var = (ov5) obj;
        fm2 fm2Var = this.f50187a;
        ov5Var.mo11810l(fm2Var.f39277a, fm2Var.f39278b, this.f50188b, this.f50189c, this.f50190d, this.f50191e);
    }
}
