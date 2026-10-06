package p000;

import android.util.Pair;
import android.widget.PopupWindow;
import java.util.List;
import java.util.concurrent.Executor;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dbd implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10364a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10365b;

    public /* synthetic */ dbd(dbe dbeVar, int i) {
        this.f10365b = i;
        this.f10364a = dbeVar;
    }

    public dbd(C0237hh c0237hh, int i) {
        this.f10365b = i;
        this.f10364a = c0237hh;
    }

    public /* synthetic */ dbd(iha ihaVar, int i) {
        this.f10365b = i;
        this.f10364a = ihaVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f10365b) {
            case 0:
                Collection$EL.forEach(((dbe) this.f10364a).f10370e, cpf.f8554f);
                break;
            case 1:
                ((C0237hh) this.f10364a).mo10276c();
                break;
            default:
                List<Pair> list = ((iha) this.f10364a).f30938u;
                if (list != null) {
                    for (Pair pair : list) {
                        ((Executor) pair.second).execute((Runnable) pair.first);
                    }
                    break;
                }
                break;
        }
    }
}
