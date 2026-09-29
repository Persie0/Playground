package p000;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.C1167c;
import com.google.firebase.sessions.C1168d;
import com.google.firebase.sessions.settings.C1170b;

/* JADX INFO: loaded from: classes.dex */
public final class g59 implements vy2 {

    /* JADX INFO: renamed from: a */
    public final qo7 f40243a;

    /* JADX INFO: renamed from: b */
    public final qo7 f40244b;

    /* JADX INFO: renamed from: c */
    public final qo7 f40245c;

    /* JADX INFO: renamed from: d */
    public final qo7 f40246d;

    /* JADX INFO: renamed from: e */
    public final qo7 f40247e;

    /* JADX INFO: renamed from: f */
    public final qo7 f40248f;

    /* JADX INFO: renamed from: g */
    public final qo7 f40249g;

    public g59(qo7 qo7Var, qo7 qo7Var2, qo7 qo7Var3, qo7 qo7Var4, qo7 qo7Var5, qo7 qo7Var6, qo7 qo7Var7) {
        this.f40243a = qo7Var;
        this.f40244b = qo7Var2;
        this.f40245c = qo7Var3;
        this.f40246d = qo7Var4;
        this.f40247e = qo7Var5;
        this.f40248f = qo7Var6;
        this.f40249g = qo7Var7;
    }

    @Override // p000.so7
    public final Object get() {
        return new C1168d((C1170b) this.f40243a.get(), (dz8) this.f40244b.get(), (C1167c) this.f40245c.get(), (r0a) this.f40246d.get(), (DataStore) this.f40247e.get(), (zk7) this.f40248f.get(), (kn1) this.f40249g.get());
    }
}
