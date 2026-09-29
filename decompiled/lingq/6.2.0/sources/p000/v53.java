package p000;

import com.google.firebase.sessions.C1164a;
import com.google.firebase.sessions.settings.C1170b;

/* JADX INFO: loaded from: classes.dex */
public final class v53 implements vy2 {

    /* JADX INFO: renamed from: a */
    public final wy8 f64881a;

    /* JADX INFO: renamed from: b */
    public final qo7 f64882b;

    /* JADX INFO: renamed from: c */
    public final qo7 f64883c;

    /* JADX INFO: renamed from: d */
    public final qo7 f64884d;

    public v53(wy8 wy8Var, qo7 qo7Var, qo7 qo7Var2, qo7 qo7Var3) {
        this.f64881a = wy8Var;
        this.f64882b = qo7Var;
        this.f64883c = qo7Var2;
        this.f64884d = qo7Var3;
    }

    @Override // p000.so7
    public final Object get() {
        return new C1164a((q43) this.f64881a.f67529b, (C1170b) this.f64882b.get(), (kn1) this.f64883c.get(), (nz8) this.f64884d.get());
    }
}
