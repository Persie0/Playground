package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ii0 {

    /* JADX INFO: renamed from: a */
    public final x66 f44131a;

    public ii0(int i) {
        switch (i) {
            case 1:
                this.f44131a = new x66(new jt4[16]);
                break;
            default:
                this.f44131a = new x66(new vk1[16]);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13936a(CancellationException cancellationException) {
        x66 x66Var = this.f44131a;
        int i = x66Var.f67832c;
        qm0[] qm0VarArr = new qm0[i];
        for (int i2 = 0; i2 < i; i2++) {
            qm0VarArr[i2] = ((vk1) x66Var.f67830a[i2]).f65529b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            qm0VarArr[i3].mo10141l(cancellationException);
        }
        if (x66Var.f67832c == 0) {
            return;
        }
        l54.m15816c("uncancelled requests present");
    }

    /* JADX INFO: renamed from: b */
    public void m13937b() {
        x66 x66Var = this.f44131a;
        i84 i84VarM15922M = l70.m15922M(0, x66Var.f67832c);
        int i = i84VarM15922M.f40379a;
        int i2 = i84VarM15922M.f40380b;
        if (i <= i2) {
            while (true) {
                ((vk1) x66Var.f67830a[i]).f65529b.resumeWith(xfa.f68157a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        x66Var.m24310h();
    }
}
