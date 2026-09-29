package p000;

import com.lingq.core.domain.model.library.Accent;

/* JADX INFO: renamed from: q2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3482q2 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57135a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f57136b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Accent f57137c;

    public /* synthetic */ C3482q2(vi3 vi3Var, Accent accent, int i) {
        this.f57135a = i;
        this.f57136b = vi3Var;
        this.f57137c = accent;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f57135a;
        xfa xfaVar = xfa.f68157a;
        Accent accent = this.f57137c;
        vi3 vi3Var = this.f57136b;
        switch (i) {
            case 0:
                vi3Var.invoke(accent.getValue());
                break;
            default:
                vi3Var.invoke(new C3320m2(accent.getValue()));
                break;
        }
        return xfaVar;
    }
}
