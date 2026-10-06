package p000;

import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kyc implements kyq {

    /* JADX INFO: renamed from: e */
    public final Executor f37714e;

    /* JADX INFO: renamed from: f */
    public final amv f37715f;

    /* JADX INFO: renamed from: g */
    private final FileOutputStream f37716g;

    /* JADX INFO: renamed from: a */
    public boolean f37710a = false;

    /* JADX INFO: renamed from: b */
    public boolean f37711b = false;

    /* JADX INFO: renamed from: c */
    public final nqf f37712c = nqf.m17621g();

    /* JADX INFO: renamed from: d */
    public final Set f37713d = new HashSet();

    /* JADX INFO: renamed from: h */
    private int f37717h = 0;

    public kyc(FileOutputStream fileOutputStream, amv amvVar, Executor executor) {
        this.f37715f = amvVar;
        this.f37714e = new kya(this, kxk.m14956B(executor), 0);
        this.f37716g = fileOutputStream;
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: a */
    public final synchronized kyt mo8410a() {
        kyb kybVar;
        int i = this.f37717h;
        this.f37717h = i + 1;
        kybVar = new kyb(this, i);
        this.f37714e.execute(new kds(this, kybVar, 14));
        return kybVar;
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: b */
    public final nps mo8411b() {
        return lau.m15120a(this.f37712c);
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: c */
    public final void mo8412c() {
        this.f37714e.execute(new kxw(this, 4));
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: d */
    public final synchronized void mo8413d() {
        this.f37714e.execute(new kxw(this, 5));
    }

    /* JADX INFO: renamed from: e */
    public final void m15047e() {
        if (this.f37710a && this.f37713d.isEmpty() && !this.f37711b) {
            this.f37715f.close();
            this.f37711b = true;
            this.f37716g.close();
            this.f37712c.mo14894e(null);
        }
    }
}
