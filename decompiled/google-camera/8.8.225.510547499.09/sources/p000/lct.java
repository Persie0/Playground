package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lct {

    /* JADX INFO: renamed from: a */
    public static int f37940a = -1;

    /* JADX INFO: renamed from: b */
    public final int f37941b;

    /* JADX INFO: renamed from: c */
    public final lec f37942c;

    /* JADX INFO: renamed from: d */
    public final ldf f37943d;

    /* JADX INFO: renamed from: e */
    public final Map f37944e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Map f37945f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final List f37946g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int[] f37947h = null;

    /* JADX INFO: renamed from: i */
    public final List f37948i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public boolean f37949j = true;

    /* JADX INFO: renamed from: k */
    public final ldx f37950k;

    public lct(int i, lec lecVar, ldf ldfVar, ldx ldxVar, byte[] bArr) {
        boolean z = true;
        lku.m15669w(lecVar.f38019a.f37915b == ldxVar.f37915b);
        if (ldfVar != null && ldfVar.f37976a.f37915b != ldxVar.f37915b) {
            z = false;
        }
        lku.m15669w(z);
        this.f37941b = i;
        this.f37942c = lecVar;
        this.f37943d = ldfVar;
        this.f37950k = ldxVar;
    }

    /* JADX INFO: renamed from: i */
    public static lqq m15169i(lec lecVar) {
        lku.m15669w(lecVar.f38021c >= 3);
        return new lqq(5, lecVar, (ldf) null);
    }

    /* JADX INFO: renamed from: j */
    public static lqq m15170j(lec lecVar, ldf ldfVar) {
        lku.m15669w(ldfVar.f37977b % 3 == 0);
        return new lqq(4, lecVar, ldfVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m15171a(String str, int i) {
        lku.m15669w(i < this.f37942c.f38020b.length);
        this.f37945f.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public final void m15172b(lcy lcyVar) {
        lku.m15669w(lcyVar.f37915b == this.f37950k.f37915b);
        this.f37946g.add(new lcr(this, lcyVar, "uImgTex"));
    }

    /* JADX INFO: renamed from: c */
    public final void m15173c(String str, ldz ldzVar) {
        lku.m15669w(ldzVar.f37915b == this.f37950k.f37915b);
        this.f37946g.add(new lcr(this, ldzVar, str));
    }

    /* JADX INFO: renamed from: d */
    public final void m15174d(String str, float f) {
        this.f37944e.put(str, new lcn(str, f));
    }

    /* JADX INFO: renamed from: e */
    public final void m15175e(String str, float[] fArr) {
        this.f37944e.put(str, new lck(str, fArr, 0));
    }

    /* JADX INFO: renamed from: f */
    public final void m15176f(int i) {
        this.f37944e.put("weightLen", new lcm(i));
    }

    /* JADX INFO: renamed from: g */
    public final void m15177g(float[] fArr) {
        this.f37944e.put("uTransform", new lck(fArr, 1));
    }

    /* JADX INFO: renamed from: h */
    public final void m15178h(String str, float f, float f2) {
        this.f37944e.put(str, new lco(str, f, f2));
    }

    /* JADX INFO: renamed from: k */
    public final void m15179k(ldx ldxVar) {
        lku.m15669w(ldxVar.f37915b == this.f37950k.f37915b);
        ldxVar.m15166e(fse.f23453h, new lcl(this)).mo15109h(kzj.f37771a);
    }
}
