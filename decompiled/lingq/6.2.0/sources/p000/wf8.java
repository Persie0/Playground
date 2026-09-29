package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wf8 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66758a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f66759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewKeys f66760c;

    public /* synthetic */ wf8(vi3 vi3Var, ViewKeys viewKeys, int i) {
        this.f66758a = i;
        this.f66759b = vi3Var;
        this.f66760c = viewKeys;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f66758a;
        xfa xfaVar = xfa.f68157a;
        ViewKeys viewKeys = this.f66760c;
        vi3 vi3Var = this.f66759b;
        uu8 uu8Var = (uu8) obj;
        switch (i) {
            case 0:
                uu8Var.getClass();
                if (uu8Var instanceof su8) {
                    vi3Var.invoke(new hf8(viewKeys, ((su8) uu8Var).f61446a.f9425c));
                } else if (uu8Var instanceof ru8) {
                    vi3Var.invoke(df8.f35567a);
                }
                break;
            default:
                uu8Var.getClass();
                if (uu8Var instanceof su8) {
                    vi3Var.invoke(new y09(viewKeys, ((su8) uu8Var).f61446a.f9425c));
                } else if (uu8Var instanceof tu8) {
                    vi3Var.invoke(new e19(((tu8) uu8Var).f62915a.f7877f));
                } else if (uu8Var instanceof ru8) {
                    vi3Var.invoke(l09.f48873a);
                }
                break;
        }
        return xfaVar;
    }
}
