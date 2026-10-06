package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foh implements kba {

    /* JADX INFO: renamed from: a */
    public static final ckh f22931a = new ckb();

    /* JADX INFO: renamed from: b */
    public final jwn f22932b;

    /* JADX INFO: renamed from: c */
    public final fon f22933c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f22934d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public kfk f22935e;

    /* JADX INFO: renamed from: f */
    public kgg f22936f;

    /* JADX INFO: renamed from: g */
    public ihw f22937g;

    /* JADX INFO: renamed from: h */
    public kfc f22938h;

    /* JADX INFO: renamed from: i */
    public jvb f22939i;

    /* JADX INFO: renamed from: j */
    public final khy f22940j;

    public foh(khy khyVar, jwn jwnVar, fon fonVar) {
        this.f22940j = khyVar;
        this.f22932b = jwnVar;
        this.f22933c = fonVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        jvd.m13538a();
        jvb jvbVar = this.f22939i;
        if (jvbVar != null) {
            jvbVar.close();
        }
        this.f22935e = null;
        this.f22938h = null;
    }
}
