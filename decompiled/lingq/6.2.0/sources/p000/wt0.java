package p000;

import android.view.View;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class wt0 extends laa {

    /* JADX INFO: renamed from: a */
    public View f67263a;

    /* JADX INFO: renamed from: b */
    public en3 f67264b;

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
        daaVar.mo10189I(this);
        View view = this.f67263a;
        int i = en3.f37553g;
        en3 en3Var = (en3) view.getTag(R$id.ghost_view);
        if (en3Var != null) {
            int i2 = en3Var.f37557d - 1;
            en3Var.f37557d = i2;
            if (i2 <= 0) {
                ((dn3) en3Var.getParent()).removeView(en3Var);
            }
        }
        view.setTag(R$id.transition_transform, null);
        view.setTag(R$id.parent_matrix, null);
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
        this.f67264b.setVisibility(4);
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
        this.f67264b.setVisibility(0);
    }
}
