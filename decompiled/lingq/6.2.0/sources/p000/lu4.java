package p000;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class lu4 {

    /* JADX INFO: renamed from: a */
    public final vi3 f50139a;

    /* JADX INFO: renamed from: c */
    public C3552rx f50141c;

    /* JADX INFO: renamed from: f */
    public int f50144f;

    /* JADX INFO: renamed from: b */
    public final sq5 f50140b = new sq5(7);

    /* JADX INFO: renamed from: d */
    public int f50142d = -1;

    /* JADX INFO: renamed from: e */
    public int f50143e = -1;

    public lu4(vi3 vi3Var) {
        this.f50139a = vi3Var;
    }

    /* JADX INFO: renamed from: a */
    public final ku4 m16545a(int i, long j, boolean z, vi3 vi3Var) {
        C3552rx c3552rx = this.f50141c;
        if (c3552rx == null) {
            return bn2.f8712a;
        }
        fj7 fj7Var = (fj7) c3552rx.f59989d;
        boolean z2 = fj7Var instanceof ViewOnAttachStateChangeListenerC0813bk;
        ej7 ej7Var = new ej7(c3552rx, i, this.f50140b, vi3Var);
        ej7Var.f37344d = new bk1(j);
        if (!z2) {
            fj7Var.mo3791a(ej7Var);
        } else if (z) {
            ViewOnAttachStateChangeListenerC0813bk viewOnAttachStateChangeListenerC0813bk = (ViewOnAttachStateChangeListenerC0813bk) fj7Var;
            viewOnAttachStateChangeListenerC0813bk.f8624b.add(new nk7(1, ej7Var));
            if (!viewOnAttachStateChangeListenerC0813bk.f8625c) {
                viewOnAttachStateChangeListenerC0813bk.f8625c = true;
                viewOnAttachStateChangeListenerC0813bk.f8623a.post(viewOnAttachStateChangeListenerC0813bk);
            }
        } else {
            ViewOnAttachStateChangeListenerC0813bk viewOnAttachStateChangeListenerC0813bk2 = (ViewOnAttachStateChangeListenerC0813bk) fj7Var;
            viewOnAttachStateChangeListenerC0813bk2.f8624b.add(new nk7(0, ej7Var));
            if (!viewOnAttachStateChangeListenerC0813bk2.f8625c) {
                viewOnAttachStateChangeListenerC0813bk2.f8625c = true;
                viewOnAttachStateChangeListenerC0813bk2.f8623a.post(viewOnAttachStateChangeListenerC0813bk2);
            }
        }
        Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
        return ej7Var;
    }
}
