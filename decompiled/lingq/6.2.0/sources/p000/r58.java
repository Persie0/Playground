package p000;

import com.google.firebase.sessions.C1167c;
import com.google.firebase.sessions.settings.C1169a;
import com.google.firebase.sessions.settings.C1170b;
import com.google.firebase.sessions.settings.C1171c;

/* JADX INFO: loaded from: classes.dex */
public final class r58 implements vy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58771a = 0;

    /* JADX INFO: renamed from: b */
    public final qo7 f58772b;

    /* JADX INFO: renamed from: c */
    public final qo7 f58773c;

    /* JADX INFO: renamed from: d */
    public final qo7 f58774d;

    /* JADX INFO: renamed from: e */
    public final qo7 f58775e;

    /* JADX INFO: renamed from: f */
    public final qo7 f58776f;

    public r58(qo7 qo7Var, qo7 qo7Var2, qo7 qo7Var3, qo7 qo7Var4, qo7 qo7Var5) {
        this.f58772b = qo7Var;
        this.f58773c = qo7Var2;
        this.f58774d = qo7Var3;
        this.f58775e = qo7Var4;
        this.f58776f = qo7Var5;
    }

    @Override // p000.so7
    public final Object get() {
        int i = this.f58771a;
        qo7 qo7Var = this.f58775e;
        qo7 qo7Var2 = this.f58774d;
        qo7 qo7Var3 = this.f58773c;
        qo7 qo7Var4 = this.f58772b;
        qo7 qo7Var5 = this.f58776f;
        switch (i) {
            case 0:
                return new C1169a((r0a) qo7Var4.get(), (x43) qo7Var3.get(), (C3384nt) qo7Var2.get(), (q58) qo7Var.get(), (C1171c) qo7Var5.get());
            default:
                return new C1167c((q43) ((wy8) qo7Var5).f67529b, (x43) qo7Var4.get(), (C1170b) qo7Var3.get(), (tt2) qo7Var2.get(), (kn1) qo7Var.get());
        }
    }

    public r58(wy8 wy8Var, qo7 qo7Var, qo7 qo7Var2, qo7 qo7Var3, qo7 qo7Var4) {
        this.f58776f = wy8Var;
        this.f58772b = qo7Var;
        this.f58773c = qo7Var2;
        this.f58774d = qo7Var3;
        this.f58775e = qo7Var4;
    }
}
