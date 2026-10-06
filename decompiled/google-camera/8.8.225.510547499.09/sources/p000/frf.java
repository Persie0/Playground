package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frf implements fqi {

    /* JADX INFO: renamed from: a */
    private final ftm f23291a;

    /* JADX INFO: renamed from: b */
    private final int f23292b;

    /* JADX INFO: renamed from: c */
    private final int f23293c;

    /* JADX INFO: renamed from: d */
    private final int f23294d;

    /* JADX INFO: renamed from: e */
    private final int f23295e;

    /* JADX INFO: renamed from: f */
    private final jwn f23296f;

    /* JADX INFO: renamed from: g */
    private final AtomicReference f23297g = new AtomicReference(fqh.TOPSHOT_MODE);

    public frf(ftm ftmVar, int i, int i2, int i3, int i4, jwn jwnVar) {
        this.f23291a = ftmVar;
        this.f23292b = i;
        this.f23293c = i2;
        this.f23294d = i3;
        this.f23295e = i4;
        this.f23296f = jwnVar;
    }

    @Override // p000.fqi
    /* JADX INFO: renamed from: a */
    public final int mo8704a() {
        int i = 2;
        if (this.f23291a.mo8764a() == 2) {
            i = this.f23294d;
        } else if (this.f23291a.mo8764a() == 1) {
            i = 0;
        } else if (this.f23296f.mo3831be() == egl.NONE) {
            i = this.f23293c;
        }
        if (this.f23297g.get() == fqh.LONGSHOT_MODE) {
            i += this.f23295e;
        }
        return Math.max(this.f23292b - i, 1);
    }

    @Override // p000.fqi
    /* JADX INFO: renamed from: b */
    public final int mo8705b() {
        return mo8704a() + 2;
    }

    @Override // p000.fqi
    /* JADX INFO: renamed from: c */
    public final void mo8706c(fqh fqhVar) {
        this.f23297g.set(fqhVar);
    }
}
