package p000;

import androidx.compose.foundation.text.C0180h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0180h f43878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f43879c;

    public /* synthetic */ ib0(C0180h c0180h, vi3 vi3Var, int i) {
        this.f43877a = i;
        this.f43878b = c0180h;
        this.f43879c = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f43877a;
        vi3 vi3Var = this.f43879c;
        C0180h c0180h = this.f43878b;
        switch (i) {
            case 0:
                rw9 rw9Var = (rw9) obj;
                if (c0180h != null) {
                    ((xc9) c0180h.f2907a).setValue(rw9Var);
                }
                if (vi3Var != null) {
                    vi3Var.invoke(rw9Var);
                }
                return xfa.f68157a;
            default:
                c0180h.f2909c.add(vi3Var);
                return new d70(4, c0180h, vi3Var);
        }
    }
}
