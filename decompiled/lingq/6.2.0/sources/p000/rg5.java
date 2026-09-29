package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg5 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59235a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59236b;

    public /* synthetic */ rg5(Object obj, int i) {
        this.f59235a = i;
        this.f59236b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.f59235a;
        Object obj = this.f59236b;
        switch (i) {
            case 0:
                vg5 vg5Var = (vg5) obj;
                tg5 tg5Var = vg5Var.f65347c;
                tg5Var.getClass();
                for (ug5 ug5Var : vg5Var.f65348d) {
                    if (!ug5Var.f63889d && ug5Var.f63888c) {
                        t63 t63VarM24469b = ug5Var.f63887b.m24469b();
                        ug5Var.f63887b = new xe1();
                        ug5Var.f63888c = false;
                        tg5Var.mo13388b(ug5Var.f63886a, t63VarM24469b);
                    }
                    qp9 qp9Var = vg5Var.f65346b;
                    qp9Var.getClass();
                    if (qp9Var.f58033a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                n16 n16Var = (n16) obj;
                int i2 = message.what;
                if (i2 == 1) {
                    ((ml9) n16Var.f52178f).m16918a();
                } else if (i2 == 2) {
                    ((nl9) n16Var.f52179g).m17491a();
                } else if (i2 == 3) {
                    ((ol9) n16Var.f52180h).m18106a();
                } else {
                    if (i2 != 4) {
                        return false;
                    }
                    ((pl9) n16Var.f52181i).m19391a();
                }
                return true;
        }
    }
}
