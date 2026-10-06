package p000;

import android.graphics.Bitmap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gxl implements gyh {

    /* JADX INFO: renamed from: a */
    public static final nbh f26722a = nbh.m17259h("com/google/android/apps/camera/session/DelegatingCaptureSession");

    /* JADX INFO: renamed from: b */
    public final gwy f26723b;

    protected gxl(gwy gwyVar) {
        this.f26723b = gwyVar;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: A */
    public void mo9869A() {
        jeu.m12988l();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: B */
    public final void mo9870B(ihb ihbVar, Throwable th) {
        this.f26723b.mo9870B(ihbVar, th);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: C */
    public final void mo9871C(boolean z) {
        this.f26723b.mo9871C(z);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: D */
    public final void mo9872D() {
        this.f26723b.mo9872D();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: E */
    public void mo9873E() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: F */
    final Executor m9929F() {
        return this.f26723b.f26669e;
    }

    /* JADX INFO: renamed from: G */
    public final void m9930G() {
        gwy gwyVar = this.f26723b;
        gwyVar.m9899e().m9649a(gwyVar.f26677m);
    }

    /* JADX INFO: renamed from: H */
    final void m9931H(String str) {
        this.f26723b.m9891W(str);
    }

    /* JADX INFO: renamed from: I */
    public final void m9932I(String str) {
        ((nbe) ((nbe) f26722a.m17252c()).mo17276G(3337)).mo17301z("[%s] %s", mo9902h(), str);
    }

    /* JADX INFO: renamed from: J */
    final bkn m9933J() {
        return this.f26723b.f26688x;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: M */
    public void mo9881M() {
        this.f26723b.m9886R();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: N */
    public final void mo9882N(kpp kppVar, boolean z) {
        this.f26723b.mo9882N(kppVar, z);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: O */
    public final synchronized void mo9883O(boolean z) {
        this.f26723b.mo9883O(false);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: Q */
    public final void mo9885Q(ihb ihbVar) {
        this.f26723b.mo9885Q(ihbVar);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: S */
    public void mo9887S(kbc kbcVar) {
        gwy gwyVar = this.f26723b;
        gwyVar.f26666b.mo6362j(gwyVar.f26670f);
        gwyVar.m9891W("startEmpty");
        gwyVar.f26688x.m2559H(1, 2);
        jfs jfsVar = gwyVar.f26686v;
        gyu gyuVarMo9902h = gwyVar.mo9902h();
        ((hlp) jfsVar.f33914a).f28273b.put(gyuVarMo9902h, new lqq((Bitmap) null, 0, kbcVar));
        gwyVar.f26687w = new jfs(gyuVarMo9902h);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: T */
    public final void mo9888T(long j) {
        this.f26723b.mo9888T(j);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void mo9889U() {
        jeu.m12987k(this);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: V */
    public final void mo9890V(Integer num) {
        this.f26723b.mo9890V(null);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: X */
    public final void mo9892X(Bitmap bitmap, int i) {
        this.f26723b.mo9892X(bitmap, i);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: Y */
    public final void mo9893Y(Bitmap bitmap) {
        this.f26723b.mo9893Y(bitmap);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: Z */
    public final void mo9894Z(Bitmap bitmap, int i) {
        this.f26723b.mo9894Z(bitmap, i);
    }

    @Override // p000.gqr
    /* JADX INFO: renamed from: a */
    public final kbb mo9651a() {
        return this.f26723b.f26668d;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: ab */
    public final void mo9896ab(int i) {
        this.f26723b.mo9896ab(i);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: ac */
    public final void mo9897ac(cwd cwdVar) {
        this.f26723b.mo9897ac(cwdVar);
    }

    @Override // p000.gqr
    /* JADX INFO: renamed from: b */
    public final void mo9652b(kbb kbbVar) {
        this.f26723b.mo9652b(kbbVar);
    }

    @Override // p000.gqr
    /* JADX INFO: renamed from: c */
    public final void mo9653c(gqt gqtVar) {
        this.f26723b.mo9653c(gqtVar);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: d */
    public final long mo9898d() {
        return this.f26723b.mo9898d();
    }

    /* JADX INFO: renamed from: e */
    final cjr m9934e() {
        return this.f26723b.f26672h;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: f */
    public final gyj mo9900f() {
        return this.f26723b.mo9900f();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: g */
    public final gyn mo9901g() {
        return this.f26723b.f26679o;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: h */
    public final gyu mo9902h() {
        return this.f26723b.mo9902h();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: i */
    public final gyw mo9903i() {
        return this.f26723b.f26667c;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: j */
    public final gyx mo9904j() {
        return this.f26723b.mo9904j();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: k */
    public final hjy mo9905k() {
        return this.f26723b.f26673i;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: l */
    public final kpp mo9906l() {
        return this.f26723b.mo9906l();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: m */
    public final mrm mo9907m() {
        return this.f26723b.f26682r;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: n */
    public final mrm mo9908n() {
        return this.f26723b.f26678n;
    }

    /* JADX INFO: renamed from: o */
    final gxh m9935o() {
        return this.f26723b.f26671g;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: p */
    public final nps mo9910p() {
        return this.f26723b.f26681q;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: q */
    public final nps mo9911q() {
        return this.f26723b.mo9911q();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: r */
    public nps mo9912r(byte[] bArr, hln hlnVar) {
        return jeu.m12989m();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: s */
    public final String mo9913s() {
        return this.f26723b.mo9913s();
    }

    /* JADX INFO: renamed from: t */
    public final gyn m9936t() {
        return this.f26723b.f26679o;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: u */
    public final void mo9915u(gys gysVar) {
        this.f26723b.mo9915u(gysVar);
    }

    /* JADX INFO: renamed from: v */
    final mrm m9937v(hln hlnVar) {
        return this.f26723b.m9909o(hlnVar, null);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: w */
    public final void mo9917w(Throwable th) {
        this.f26723b.mo9917w(th);
    }

    /* JADX INFO: renamed from: x */
    public final nqf m9938x() {
        return this.f26723b.f26675k;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: y */
    public final void mo9919y() {
        this.f26723b.mo9919y();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: z */
    public final void mo9920z() {
        this.f26723b.mo9920z();
    }
}
