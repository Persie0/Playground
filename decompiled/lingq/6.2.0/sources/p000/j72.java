package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class j72 implements qt5 {

    /* JADX INFO: renamed from: a */
    public final qg9 f45135a;

    /* JADX INFO: renamed from: b */
    public final rw2 f45136b;

    /* JADX INFO: renamed from: c */
    public y90 f45137c;

    /* JADX INFO: renamed from: d */
    public qt5 f45138d;

    /* JADX INFO: renamed from: e */
    public boolean f45139e = true;

    /* JADX INFO: renamed from: f */
    public boolean f45140f;

    public j72(rw2 rw2Var, mp9 mp9Var) {
        this.f45136b = rw2Var;
        this.f45135a = new qg9(mp9Var);
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: a */
    public final void mo14311a(n97 n97Var) {
        qt5 qt5Var = this.f45138d;
        if (qt5Var != null) {
            qt5Var.mo14311a(n97Var);
            n97Var = this.f45138d.mo14315e();
        }
        this.f45135a.mo14311a(n97Var);
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: b */
    public final long mo14312b() {
        if (this.f45139e) {
            return this.f45135a.mo14312b();
        }
        qt5 qt5Var = this.f45138d;
        qt5Var.getClass();
        return qt5Var.mo14312b();
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: c */
    public final boolean mo14313c() {
        if (this.f45139e) {
            this.f45135a.getClass();
            return false;
        }
        qt5 qt5Var = this.f45138d;
        qt5Var.getClass();
        return qt5Var.mo14313c();
    }

    /* JADX INFO: renamed from: d */
    public final void m14314d(y90 y90Var) {
        qt5 qt5Var;
        qt5 qt5VarMo22304j = y90Var.mo22304j();
        if (qt5VarMo22304j == null || qt5VarMo22304j == (qt5Var = this.f45138d)) {
            return;
        }
        if (qt5Var != null) {
            throw ExoPlaybackException.m2528e(new IllegalStateException("Multiple renderer media clocks enabled."), DescriptorProtos.Edition.EDITION_2023_VALUE);
        }
        this.f45138d = qt5VarMo22304j;
        this.f45137c = y90Var;
        ((tt5) qt5VarMo22304j).mo14311a((n97) this.f45135a.f57770e);
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: e */
    public final n97 mo14315e() {
        qt5 qt5Var = this.f45138d;
        return qt5Var != null ? qt5Var.mo14315e() : (n97) this.f45135a.f57770e;
    }
}
