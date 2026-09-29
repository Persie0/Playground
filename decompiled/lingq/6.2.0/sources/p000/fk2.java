package p000;

import com.lingq.core.p012ui.dragdrop.C1919b;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fk2 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39220a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f39221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1919b f39222c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f39223d;

    public /* synthetic */ fk2(vi3 vi3Var, C1919b c1919b, Ref$ObjectRef ref$ObjectRef, int i) {
        this.f39220a = i;
        this.f39221b = vi3Var;
        this.f39222c = c1919b;
        this.f39223d = ref$ObjectRef;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f39220a;
        xfa xfaVar = xfa.f68157a;
        Ref$ObjectRef ref$ObjectRef = this.f39223d;
        C1919b c1919b = this.f39222c;
        vi3 vi3Var = this.f39221b;
        switch (i) {
            case 0:
                vi3Var.invoke(Boolean.FALSE);
                c1919b.m8798b();
                cd4 cd4Var = (cd4) ref$ObjectRef.f47718a;
                if (cd4Var != null) {
                    cd4Var.mo4537a(null);
                }
                break;
            default:
                vi3Var.invoke(Boolean.FALSE);
                c1919b.m8798b();
                cd4 cd4Var2 = (cd4) ref$ObjectRef.f47718a;
                if (cd4Var2 != null) {
                    cd4Var2.mo4537a(null);
                }
                break;
        }
        return xfaVar;
    }
}
