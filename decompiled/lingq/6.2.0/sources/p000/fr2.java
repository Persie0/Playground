package p000;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class fr2 extends b34 {

    /* JADX INFO: renamed from: y */
    public final er2 f39516y;

    public fr2(TextView textView) {
        this.f39516y = new er2(textView);
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: P */
    public final void mo3259P(boolean z) {
        if (pq2.m19449d()) {
            this.f39516y.mo3259P(z);
        }
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: R */
    public final void mo3260R(boolean z) {
        boolean zM19449d = pq2.m19449d();
        er2 er2Var = this.f39516y;
        if (zM19449d) {
            er2Var.mo3260R(z);
        } else {
            er2Var.f37741A = z;
        }
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: d0 */
    public final TransformationMethod mo3261d0(TransformationMethod transformationMethod) {
        return !pq2.m19449d() ? transformationMethod : this.f39516y.mo3261d0(transformationMethod);
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: n */
    public final InputFilter[] mo3262n(InputFilter[] inputFilterArr) {
        return !pq2.m19449d() ? inputFilterArr : this.f39516y.mo3262n(inputFilterArr);
    }

    @Override // p000.b34
    /* JADX INFO: renamed from: u */
    public final boolean mo3263u() {
        return this.f39516y.f37741A;
    }
}
