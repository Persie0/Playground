package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msa {

    /* JADX INFO: renamed from: a */
    public final boolean f41501a;

    /* JADX INFO: renamed from: b */
    public final Object f41502b;

    /* JADX INFO: renamed from: c */
    public final Object f41503c;

    public msa(aoz aozVar, byte[] bArr, boolean z) {
        this.f41503c = aozVar;
        this.f41502b = bArr;
        this.f41501a = z;
    }

    public msa(dhv dhvVar, boolean z, hai haiVar) {
        this.f41501a = z;
        this.f41502b = dhvVar;
        this.f41503c = haiVar;
    }

    public msa(imu imuVar, kov kovVar, kmd kmdVar, inm inmVar, dhv dhvVar, jwn jwnVar) {
        boolean z = kmdVar.mo14558k() == kmq.f36557a;
        this.f41501a = z;
        this.f41503c = new cem(kovVar, inmVar, dhvVar, kmdVar.mo14553f(), z, jwnVar);
        this.f41502b = imuVar;
    }

    private msa(mrz mrzVar) {
        this(mrzVar, false, (mrc) mrb.f41462a);
    }

    private msa(mrz mrzVar, boolean z, mrc mrcVar) {
        this.f41503c = mrzVar;
        this.f41501a = z;
        this.f41502b = mrcVar;
    }

    /* JADX INFO: renamed from: b */
    public static msa m16846b(char c) {
        return new msa(new mrx(new mqz(c), 1));
    }

    /* JADX INFO: renamed from: c */
    public static msa m16847c(String str) {
        lku.m15670x(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? m16846b(str.charAt(0)) : new msa(new mrx(str, 0));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mrz] */
    /* JADX INFO: renamed from: a */
    public final msa m16848a() {
        return new msa((mrz) this.f41503c, true, (mrc) this.f41502b);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m16849d(CharSequence charSequence) {
        charSequence.getClass();
        return new mry(this, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mrz] */
    /* JADX INFO: renamed from: e */
    public final Iterator m16850e(CharSequence charSequence) {
        return this.f41503c.mo16835a(this, charSequence);
    }

    /* JADX INFO: renamed from: f */
    public final List m16851f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itM16850e = m16850e(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itM16850e.hasNext()) {
            arrayList.add((String) itM16850e.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final jwn m16852g() {
        return jwr.m13640j(m16853h(), new ceg(this, 13, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [hai, java.lang.Object] */
    /* JADX INFO: renamed from: h */
    public final jww m16853h() {
        ?? r0 = this.f41502b;
        dhx dhxVar = dib.f11240a;
        r0.mo6177e();
        return this.f41503c.mo10030b(gzy.f27034ar);
    }

    /* JADX INFO: renamed from: i */
    public final void m16854i() {
        if (this.f41501a) {
            m16853h().mo3415bf(Integer.valueOf(jbx.m12873r(1)));
        }
    }
}
