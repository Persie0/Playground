package p000;

import androidx.compose.p002ui.layout.C0339f;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tq4 implements it5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f62722b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f62723c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f62724d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uq4 f62725e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0339f f62726f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vi3 f62727g;

    public tq4(int i, int i2, Map map, vi3 vi3Var, uq4 uq4Var, C0339f c0339f, vi3 vi3Var2) {
        this.f62721a = i;
        this.f62722b = i2;
        this.f62723c = map;
        this.f62724d = vi3Var;
        this.f62725e = uq4Var;
        this.f62726f = c0339f;
        this.f62727g = vi3Var2;
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: a */
    public final int mo10623a() {
        return this.f62722b;
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: b */
    public final Map mo10624b() {
        return this.f62723c;
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: c */
    public final void mo10625c() {
        v54 v54Var;
        C0357g c0357g = this.f62726f.f4193a;
        boolean zMo211f0 = this.f62725e.mo211f0();
        vi3 vi3Var = this.f62727g;
        if (!zMo211f0 || (v54Var = ((C0353c) c0357g.f4335a0.f46676d).f4308o0) == null) {
            vi3Var.invoke(((C0353c) c0357g.f4335a0.f46676d).f4368l);
        } else {
            vi3Var.invoke(v54Var.f4368l);
        }
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: d */
    public final int mo10626d() {
        return this.f62721a;
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: e */
    public final vi3 mo10691e() {
        return this.f62724d;
    }
}
