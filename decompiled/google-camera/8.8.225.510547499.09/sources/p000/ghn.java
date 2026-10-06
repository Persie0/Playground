package p000;

import android.graphics.PointF;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghn implements cbu {

    /* JADX INFO: renamed from: a */
    public final ccs f24764a;

    /* JADX INFO: renamed from: b */
    public final kfk f24765b;

    /* JADX INFO: renamed from: c */
    public nqf f24766c;

    /* JADX INFO: renamed from: d */
    public final Runnable f24767d = new fzz(this, 19);

    /* JADX INFO: renamed from: e */
    public final drj f24768e;

    /* JADX INFO: renamed from: f */
    public final bkn f24769f;

    /* JADX INFO: renamed from: g */
    private final jvs f24770g;

    /* JADX INFO: renamed from: h */
    private final glu f24771h;

    /* JADX INFO: renamed from: i */
    private final jwf f24772i;

    /* JADX INFO: renamed from: j */
    private final jwn f24773j;

    /* JADX INFO: renamed from: k */
    private final dfn f24774k;

    public ghn(kfk kfkVar, jvs jvsVar, ccs ccsVar, drj drjVar, bkn bknVar, dfn dfnVar, glu gluVar, jwf jwfVar, jwn jwnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f24770g = jvsVar;
        this.f24764a = ccsVar;
        this.f24768e = drjVar;
        this.f24769f = bknVar;
        this.f24765b = kfkVar;
        this.f24774k = dfnVar;
        this.f24771h = gluVar;
        this.f24772i = jwfVar;
        this.f24773j = jwnVar;
    }

    /* JADX INFO: renamed from: c */
    private final void m9253c() {
        try {
            this.f24770g.execute(new fzz(this, 20));
        } catch (RejectedExecutionException e) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: b */
    public final void m9254b(boolean z, boolean z2) {
        if (z) {
            this.f24764a.m3466c(this.f24767d);
            this.f24769f.f3651a.mo3415bf(false);
        }
        if (z2) {
            this.f24771h.mo9463g();
            this.f24768e.m6626f();
        }
        this.f24765b.mo14126m(z, z2, false);
        kew kewVarMo14115b = this.f24765b.mo14115b();
        if (z) {
            kgo kgoVar = (kgo) kewVarMo14115b;
            kgoVar.f35937h = this.f24774k.m6072h();
            kgoVar.f35933d = Integer.valueOf(((gss) this.f24772i.f34942d).f26275h);
        }
        if (z2) {
            ((kgo) kewVarMo14115b).f35938i = this.f24774k.m6072h();
        }
        ((kgo) kewVarMo14115b).f35939j = this.f24774k.m6072h();
        this.f24765b.mo14127n(kewVarMo14115b.mo14090a());
    }

    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final cdj mo3409bh(bko bkoVar) {
        int i;
        this.f24770g.m13585b();
        nqf nqfVar = this.f24766c;
        if (nqfVar != null) {
            nqfVar.cancel(true);
        }
        this.f24764a.m3466c(this.f24767d);
        if (!((Boolean) ((jwf) this.f24768e.f12398d).f34942d).booleanValue()) {
            this.f24771h.mo9465i();
        }
        kew kewVarMo14115b = this.f24765b.mo14115b();
        int i2 = ((gss) this.f24772i.f34942d).f26275h;
        if (((Boolean) this.f24773j.mo3831be()).booleanValue()) {
            i = 4;
        } else {
            i = i2 != 0 ? 1 : 0;
        }
        boolean zBooleanValue = true ^ ((Boolean) ((jwf) this.f24768e.f12398d).f34942d).booleanValue();
        kgo kgoVar = (kgo) kewVarMo14115b;
        kgoVar.f35933d = Integer.valueOf(i);
        kgoVar.f35937h = this.f24774k.m6073i((PointF) bkoVar.f3652a);
        if (zBooleanValue) {
            kgoVar.f35938i = this.f24774k.m6073i((PointF) bkoVar.f3652a);
        }
        kex kexVarMo14090a = kewVarMo14115b.mo14090a();
        if (((Boolean) this.f24773j.mo3831be()).booleanValue()) {
            this.f24765b.mo14127n(kexVarMo14090a);
        } else {
            this.f24765b.mo14125l(kexVarMo14090a, bzq.m3271k());
        }
        nqf nqfVarM17621g = nqf.m17621g();
        this.f24766c = nqfVarM17621g;
        m9253c();
        return new ghm(this, nqfVarM17621g, bkoVar, null, null, null);
    }
}
