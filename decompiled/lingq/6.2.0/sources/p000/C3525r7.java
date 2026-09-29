package p000;

import android.view.ActionMode;
import androidx.compose.foundation.text.contextmenu.internal.C0170a;
import androidx.compose.foundation.text.contextmenu.provider.C0175a;
import androidx.compose.foundation.text.selection.C0205f;

/* JADX INFO: renamed from: r7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3525r7 implements zh2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f58815b;

    public /* synthetic */ C3525r7(Object obj, int i) {
        this.f58814a = i;
        this.f58815b = obj;
    }

    @Override // p000.zh2
    /* JADX INFO: renamed from: a */
    public final void mo1799a() {
        int i = this.f58814a;
        Object obj = this.f58815b;
        switch (i) {
            case 0:
                C3399o7 c3399o7 = ((C3137j7) obj).f45128a;
                if (c3399o7 == null) {
                    C3386nv.m17633t("Launcher has not been initialized");
                } else {
                    c3399o7.m17829b();
                }
                break;
            case 1:
                C0170a c0170a = (C0170a) obj;
                ed9 ed9Var = c0170a.f2864e;
                sd3 sd3Var = ed9Var.f37077h;
                if (sd3Var != null) {
                    sd3Var.mo19438a();
                }
                ed9Var.m11065a();
                ActionMode actionMode = c0170a.f2867h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c0170a.f2867h = null;
                break;
            case 2:
                za0 za0Var = (za0) ((xc9) ((C0175a) obj).f2889c).getValue();
                if (za0Var != null) {
                    za0Var.close();
                }
                break;
            case 3:
                ((C0205f) obj).m1115p();
                break;
            case 4:
                ((wt4) obj).f67274d = null;
                break;
            case 5:
                lu4 lu4Var = (lu4) obj;
                C3552rx c3552rx = lu4Var.f50141c;
                if (c3552rx != null) {
                    c3552rx.f59986a = false;
                }
                lu4Var.f50141c = null;
                break;
            default:
                ((hu4) obj).f42946f = true;
                break;
        }
    }
}
