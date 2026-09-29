package p000;

import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.playlists.C1832h;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qf7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57700a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1832h f57701b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oe7 f57702c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dh9 f57703d;

    public /* synthetic */ qf7(C1832h c1832h, oe7 oe7Var, dh9 dh9Var, int i) {
        this.f57700a = i;
        this.f57701b = c1832h;
        this.f57702c = oe7Var;
        this.f57703d = dh9Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f57700a;
        xfa xfaVar = xfa.f68157a;
        dh9 dh9Var = this.f57703d;
        oe7 oe7Var = this.f57702c;
        C1832h c1832h = this.f57701b;
        switch (i) {
            case 0:
                tf7 tf7Var = (tf7) dh9Var.getValue();
                if ((tf7Var instanceof sf7) && ((sf7) tf7Var).f60795b) {
                    C3244l c3244l = c1832h.f22302l;
                    kd7 kd7Var = new kd7(null);
                    c3244l.getClass();
                    c3244l.m15572j(null, kd7Var);
                } else {
                    oe7Var.f54248a.setValue(Boolean.FALSE);
                    oe7Var.f54249b.mo3737M1(UpgradeReason.PLAYLISTS);
                }
                break;
            default:
                tf7 tf7Var2 = (tf7) dh9Var.getValue();
                if ((tf7Var2 instanceof sf7) && ((sf7) tf7Var2).f60795b) {
                    C3244l c3244l2 = c1832h.f22302l;
                    kd7 kd7Var2 = new kd7(null);
                    c3244l2.getClass();
                    c3244l2.m15572j(null, kd7Var2);
                } else {
                    t66 t66Var = oe7Var.f54248a;
                    Boolean bool = Boolean.FALSE;
                    t66Var.setValue(bool);
                    oe7Var.f54248a.setValue(bool);
                    oe7Var.f54249b.mo3737M1(UpgradeReason.PLAYLISTS);
                }
                break;
        }
        return xfaVar;
    }
}
