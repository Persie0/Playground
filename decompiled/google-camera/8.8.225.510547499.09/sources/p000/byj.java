package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byj extends byb implements bsw {
    public byj(byh byhVar) {
        super(byhVar);
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: a */
    public final int mo3014a() {
        byn bynVar = ((byh) this.f4734a).f4744a.f4743a;
        bqd bqdVar = (bqd) bynVar.f4759a;
        return bqdVar.f4161a.limit() + bqdVar.f4163c.length + (bqdVar.f4164d.length * 4) + bynVar.f4768j;
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: b */
    public final Class mo3015b() {
        return byh.class;
    }

    @Override // p000.byb, p000.bsw
    /* JADX INFO: renamed from: d */
    public final void mo3026d() {
        ((byh) this.f4734a).m3188a().prepareToDraw();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [btg, java.lang.Object] */
    @Override // p000.bsz
    /* JADX INFO: renamed from: e */
    public final void mo3018e() {
        ((byh) this.f4734a).stop();
        byh byhVar = (byh) this.f4734a;
        byhVar.f4745b = true;
        byn bynVar = byhVar.f4744a.f4743a;
        bynVar.f4760b.clear();
        bynVar.m3196d();
        bynVar.m3198f();
        byl bylVar = bynVar.f4763e;
        if (bylVar != null) {
            bynVar.f4761c.m2866f(bylVar);
            bynVar.f4763e = null;
        }
        byl bylVar2 = bynVar.f4765g;
        if (bylVar2 != null) {
            bynVar.f4761c.m2866f(bylVar2);
            bynVar.f4765g = null;
        }
        byl bylVar3 = bynVar.f4767i;
        if (bylVar3 != null) {
            bynVar.f4761c.m2866f(bylVar3);
            bynVar.f4767i = null;
        }
        bqd bqdVar = (bqd) bynVar.f4759a;
        bqdVar.f4166f = null;
        byte[] bArr = bqdVar.f4163c;
        if (bArr != null) {
            bqdVar.f4170j.m6709x(bArr);
        }
        int[] iArr = bqdVar.f4164d;
        if (iArr != null) {
            bqdVar.f4170j.f12521a.mo3036c(iArr);
        }
        Bitmap bitmap = bqdVar.f4167g;
        if (bitmap != null) {
            bqdVar.f4170j.m6708w(bitmap);
        }
        bqdVar.f4167g = null;
        bqdVar.f4161a = null;
        bqdVar.f4168h = null;
        byte[] bArr2 = bqdVar.f4162b;
        if (bArr2 != null) {
            bqdVar.f4170j.m6709x(bArr2);
        }
        bynVar.f4764f = true;
    }
}
