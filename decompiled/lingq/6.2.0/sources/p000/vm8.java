package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class vm8 implements xy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65611a;

    /* JADX INFO: renamed from: b */
    public final so7 f65612b;

    /* JADX INFO: renamed from: c */
    public final so7 f65613c;

    /* JADX INFO: renamed from: d */
    public final xy2 f65614d;

    public /* synthetic */ vm8(so7 so7Var, so7 so7Var2, xy2 xy2Var, int i) {
        this.f65611a = i;
        this.f65612b = so7Var;
        this.f65613c = so7Var2;
        this.f65614d = xy2Var;
    }

    @Override // p000.so7
    public final Object get() {
        int i = this.f65611a;
        xy2 xy2Var = this.f65614d;
        so7 so7Var = this.f65613c;
        so7 so7Var2 = this.f65612b;
        switch (i) {
            case 0:
                return new C3309ls((Context) so7Var2.get(), so7Var.get(), ((wu2) xy2Var).get(), 24);
            default:
                return new nba(new nj0(18), new jj5(17), (w72) ((x72) so7Var2).get(), (n16) ((ija) so7Var).get(), (ny8) ((d8b) xy2Var).get());
        }
    }
}
