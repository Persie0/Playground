package p000;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class arq extends asg {

    /* JADX INFO: renamed from: a */
    boolean f2193a = false;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ViewGroup f2194b;

    public arq(ViewGroup viewGroup) {
        this.f2194b = viewGroup;
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: a */
    public final void mo1893a(asf asfVar) {
        if (!this.f2193a) {
            asr.m1972b(this.f2194b, false);
        }
        asfVar.m1955y(this);
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: b */
    public final void mo1894b() {
        asr.m1972b(this.f2194b, false);
        this.f2193a = true;
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: c */
    public final void mo1895c() {
        asr.m1972b(this.f2194b, false);
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: d */
    public final void mo1896d() {
        asr.m1972b(this.f2194b, true);
    }
}
