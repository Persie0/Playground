package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.text.contextmenu.internal.C0170a;

/* JADX INFO: renamed from: ok */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3412ok implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0170a f54487b;

    public /* synthetic */ C3412ok(C0170a c0170a, int i) {
        this.f54486a = i;
        this.f54487b = c0170a;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f54486a;
        xfa xfaVar = xfa.f68157a;
        C0170a c0170a = this.f54487b;
        switch (i) {
            case 0:
                ui3 ui3Var = (ui3) obj;
                View view = c0170a.f2860a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ui3Var.mo0a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC3501qk(0, ui3Var));
                    }
                }
                return xfaVar;
            case 1:
                ActionMode actionMode = c0170a.f2867h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return xfaVar;
            case 2:
                ActionMode actionMode2 = c0170a.f2867h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return xfaVar;
            default:
                c0170a.f2864e.m11068d();
                return new C3525r7(c0170a, 1);
        }
    }
}
