package p000;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.selection.C0205f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pe1 implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55995a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55996b;

    public /* synthetic */ pe1(Object obj, int i) {
        this.f55995a = i;
        this.f55996b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.f55995a;
        Object obj = this.f55996b;
        switch (i) {
            case 0:
                ((pg9) obj).mo4537a(null);
                break;
            default:
                C0205f c0205f = (C0205f) obj;
                if (c0205f != null) {
                    yw4 yw4Var = c0205f.f3079d;
                    if (yw4Var != null) {
                        yw4Var.m25364e(cx9.f34692b);
                    }
                    yw4 yw4Var2 = c0205f.f3079d;
                    if (yw4Var2 != null) {
                        yw4Var2.m25365f(cx9.f34692b);
                    }
                }
                break;
        }
    }
}
