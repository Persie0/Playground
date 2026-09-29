package p000;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes.dex */
public final class j53 implements ro7 {

    /* JADX INFO: renamed from: a */
    public final i53 f45066a;

    /* JADX INFO: renamed from: b */
    public final i53 f45067b;

    /* JADX INFO: renamed from: c */
    public final i53 f45068c;

    /* JADX INFO: renamed from: d */
    public final i53 f45069d;

    /* JADX INFO: renamed from: e */
    public final dy1 f45070e;

    /* JADX INFO: renamed from: f */
    public final dy1 f45071f;

    /* JADX INFO: renamed from: g */
    public final dy1 f45072g;

    public j53(i53 i53Var, i53 i53Var2, i53 i53Var3, i53 i53Var4, dy1 dy1Var, dy1 dy1Var2, dy1 dy1Var3) {
        this.f45066a = i53Var;
        this.f45067b = i53Var2;
        this.f45068c = i53Var3;
        this.f45069d = i53Var4;
        this.f45070e = dy1Var;
        this.f45071f = dy1Var2;
        this.f45072g = dy1Var3;
    }

    @Override // p000.so7
    public final Object get() {
        return new g53((q43) this.f45066a.get(), (uo7) this.f45067b.get(), (x43) this.f45068c.get(), (uo7) this.f45069d.get(), (RemoteConfigManager) this.f45070e.get(), (dh1) this.f45071f.get(), (SessionManager) this.f45072g.get());
    }
}
