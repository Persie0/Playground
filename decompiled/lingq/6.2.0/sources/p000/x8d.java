package p000;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_text_common.C0984o;

/* JADX INFO: loaded from: classes.dex */
public final class x8d extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final g06 f67942b;

    public x8d(g06 g06Var) {
        super(4);
        this.f67942b = g06Var;
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: l */
    public final Object mo16603l(Object obj) {
        jx9 jx9Var = (jx9) obj;
        C0984o c0984oM23405b = vkd.m23405b(jx9Var.mo14181b());
        Context contextM12272b = this.f67942b.m12272b();
        po3.f56584b.getClass();
        return new kx9(c0984oM23405b, (po3.m19430a(contextM12272b) >= 204700000 || jx9Var.mo14186g()) ? new cwb(contextM12272b, jx9Var, c0984oM23405b) : new nc0(contextM12272b), jx9Var);
    }
}
