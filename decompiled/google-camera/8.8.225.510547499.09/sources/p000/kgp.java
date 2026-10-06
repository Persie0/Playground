package p000;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgp {

    /* JADX INFO: renamed from: a */
    public final khf f35940a;

    /* JADX INFO: renamed from: b */
    public final kbo f35941b;

    /* JADX INFO: renamed from: d */
    public boolean f35943d;

    /* JADX INFO: renamed from: f */
    public boolean f35945f;

    /* JADX INFO: renamed from: g */
    private final Executor f35946g;

    /* JADX INFO: renamed from: c */
    public kex f35942c = kgo.m14209b().mo14090a();

    /* JADX INFO: renamed from: e */
    public boolean f35944e = false;

    public kgp(khf khfVar, Executor executor, kbo kboVar) {
        this.f35940a = khfVar;
        this.f35946g = executor;
        this.f35941b = kboVar.mo6314a("FS3aUpdater");
    }

    /* JADX INFO: renamed from: a */
    public final void m14210a(kex kexVar, boolean z) {
        synchronized (this) {
            kir kirVarM14363b = kir.m14363b(this.f35942c);
            if (!kexVar.mo14094d().equals(kgo.f35930a)) {
                kirVarM14363b.f36195a = kexVar.mo14094d();
            }
            if (!kexVar.mo14092b().equals(kgo.f35930a)) {
                kirVarM14363b.f36196b = kexVar.mo14092b();
            }
            if (!kexVar.mo14091a().equals(kgo.f35930a)) {
                kirVarM14363b.f36197c = kexVar.mo14091a();
            }
            if (!kexVar.mo14093c().equals(kgo.f35930a)) {
                kirVarM14363b.f36198d = kexVar.mo14093c();
            }
            if (!kexVar.mo14095e().equals(kgo.f35930a)) {
                kirVarM14363b.f36199e = kexVar.mo14095e();
            }
            if (!Arrays.equals(kexVar.mo14097g(), kgo.f35931b)) {
                kirVarM14363b.f36203i = kexVar.mo14097g();
            }
            if (!Arrays.equals(kexVar.mo14096f(), kgo.f35931b)) {
                kirVarM14363b.f36204j = kexVar.mo14096f();
            }
            if (!Arrays.equals(kexVar.mo14098h(), kgo.f35931b)) {
                kirVarM14363b.f36205k = kexVar.mo14098h();
            }
            this.f35942c = kirVarM14363b.m14365d();
            this.f35944e |= z;
            if (this.f35945f) {
                this.f35943d = true;
                return;
            }
            this.f35945f = true;
            try {
                this.f35946g.execute(new jzq(this, 6));
            } catch (RejectedExecutionException e) {
                this.f35941b.mo13940b("Task to update 3A rejected by the executor.");
            }
        }
    }
}
