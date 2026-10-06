package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gja implements gof {

    /* JADX INFO: renamed from: a */
    private final glj f24943a;

    /* JADX INFO: renamed from: b */
    private final gof f24944b;

    public gja(kqj kqjVar, hee heeVar, jvb jvbVar, long j, int i, msi msiVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        glj gljVarM14708j = kqjVar.m14708j(i);
        jvbVar.m13537d(gljVarM14708j);
        this.f24943a = gljVarM14708j;
        this.f24944b = heeVar.m10142a(j, gljVarM14708j, msiVar, 2);
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: a */
    public final goe mo9303a() {
        final kba kbaVarM9422r = this.f24943a.m9422r();
        return new goe() { // from class: giz
            @Override // p000.goe
            /* JADX INFO: renamed from: a */
            public final void mo9302a() {
                kbaVarM9422r.close();
            }
        };
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: b */
    public final key mo9304b(long j) {
        return this.f24944b.mo9304b(j);
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: c */
    public final key mo9305c() {
        return this.f24944b.mo9305c();
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: d */
    public final key mo9306d() {
        return this.f24944b.mo9306d();
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: e */
    public final key mo9307e() {
        return this.f24944b.mo9307e();
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: f */
    public final kfc mo9308f() {
        return ((gjf) this.f24944b).f24959c;
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: g */
    public final mws mo9309g(List list) {
        return this.f24944b.mo9309g(list);
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: h */
    public final mws mo9310h(List list) {
        return this.f24944b.mo9310h(list);
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: i */
    public final List mo9311i() {
        return this.f24944b.mo9311i();
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: j */
    public final List mo9312j() {
        return ((gjf) this.f24944b).m9321o();
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: k */
    public final List mo9313k() {
        return this.f24944b.mo9313k();
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: l */
    public final void mo9314l(String str) {
        this.f24944b.mo9314l(str);
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: m */
    public final void mo9315m(int i) {
        this.f24944b.mo9315m(i);
    }

    @Override // p000.gof
    /* JADX INFO: renamed from: n */
    public final kho mo9316n() {
        return this.f24944b.mo9316n();
    }
}
