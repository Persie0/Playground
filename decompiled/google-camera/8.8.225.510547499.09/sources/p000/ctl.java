package p000;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ctl implements ctp {

    /* JADX INFO: renamed from: a */
    public static final nbh f9479a = nbh.m17259h("com/google/android/apps/camera/camcorder/file/MediaFileOutputVideo");

    /* JADX INFO: renamed from: b */
    public final gyn f9480b;

    /* JADX INFO: renamed from: c */
    public FileOutputStream f9481c;

    /* JADX INFO: renamed from: d */
    public final nqf f9482d = nqf.m17621g();

    /* JADX INFO: renamed from: e */
    private final gyj f9483e;

    /* JADX INFO: renamed from: f */
    private final Executor f9484f;

    /* JADX INFO: renamed from: g */
    private final kbz f9485g;

    /* JADX INFO: renamed from: h */
    private int f9486h;

    public ctl(gyn gynVar, gyj gyjVar, Executor executor, kbz kbzVar) {
        this.f9480b = gynVar;
        this.f9483e = gyjVar;
        this.f9484f = executor;
        this.f9485g = kbzVar;
        executor.execute(kbzVar.mo13959c("MFOV#Init", new cgl(this, gyjVar, 18)));
        this.f9486h = 1;
        UUID.randomUUID().toString();
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: a */
    public final long mo5497a() {
        return this.f9483e.f26832a.mo14681a();
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gyx mo5498b() {
        return dhk.m6163e(this);
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: c */
    public final mrm mo5499c() {
        return mrm.m16829i(this.f9483e);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.f9486h;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            return;
        }
        this.f9486h = 2;
        this.f9484f.execute(new cqr(this, 19));
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: d */
    public final mrm mo5500d() {
        return mrm.m16829i(this.f9480b);
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: e */
    public final nps mo5501e() {
        return this.f9482d;
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: f */
    public final FileDescriptor mo5502f() {
        try {
            try {
                this.f9485g.mo13961e("MFOV#getFileDescriptor");
                FileDescriptor fileDescriptor = (FileDescriptor) this.f9482d.get();
                this.f9485g.mo13962f();
                return fileDescriptor;
            } catch (Throwable th) {
                this.f9485g.mo13962f();
                throw th;
            }
        } catch (InterruptedException | ExecutionException e) {
            ((nbe) ((nbe) ((nbe) f9479a.m17251b()).mo17283h(e)).mo17276G(604)).mo17290o("Can't get file descriptor.");
            throw new RuntimeException(e);
        }
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: g */
    public final synchronized void mo5503g() {
        int i = this.f9486h;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            return;
        }
        this.f9486h = 3;
        this.f9484f.execute(new cqr(this, 18));
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean mo5504h() {
        return mo5497a() > 200000;
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: i */
    public final void mo5505i() {
    }
}
