package p000;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class le1 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final fe5 f49539a;

    public le1(fe5 fe5Var) {
        this.f49539a = fe5Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        fe5 fe5Var = this.f49539a;
        ge5 ge5VarMo10311a = fe5Var.mo10311a();
        if (ge5VarMo10311a != null) {
            ge5VarMo10311a.mo11967a(fe5Var);
        }
    }
}
