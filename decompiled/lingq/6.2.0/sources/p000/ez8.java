package p000;

import com.google.firebase.sessions.settings.C1170b;

/* JADX INFO: loaded from: classes.dex */
public final class ez8 implements vy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38111a;

    /* JADX INFO: renamed from: b */
    public final qo7 f38112b;

    /* JADX INFO: renamed from: c */
    public final qo7 f38113c;

    public /* synthetic */ ez8(qo7 qo7Var, qo7 qo7Var2, int i) {
        this.f38111a = i;
        this.f38112b = qo7Var;
        this.f38113c = qo7Var2;
    }

    @Override // p000.so7
    public final Object get() {
        int i = this.f38111a;
        qo7 qo7Var = this.f38113c;
        qo7 qo7Var2 = this.f38112b;
        switch (i) {
            case 0:
                return new dz8((r0a) qo7Var2.get(), (lna) qo7Var.get());
            default:
                return new C1170b((r29) qo7Var2.get(), (r29) qo7Var.get());
        }
    }
}
