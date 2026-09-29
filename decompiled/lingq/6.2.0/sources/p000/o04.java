package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o04 {

    /* JADX INFO: renamed from: a */
    public final String f53510a;

    /* JADX INFO: renamed from: b */
    public final float f53511b;

    /* JADX INFO: renamed from: c */
    public final float f53512c;

    /* JADX INFO: renamed from: d */
    public final float f53513d;

    /* JADX INFO: renamed from: e */
    public final float f53514e;

    /* JADX INFO: renamed from: f */
    public final long f53515f;

    /* JADX INFO: renamed from: g */
    public final int f53516g;

    /* JADX INFO: renamed from: h */
    public final boolean f53517h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f53518i;

    /* JADX INFO: renamed from: j */
    public final n04 f53519j;

    /* JADX INFO: renamed from: k */
    public boolean f53520k;

    public o04(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? aa1.f412k : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.f53510a = str;
        this.f53511b = f;
        this.f53512c = f2;
        this.f53513d = f3;
        this.f53514e = f4;
        this.f53515f = j2;
        this.f53516g = i3;
        this.f53517h = z2;
        ArrayList arrayList = new ArrayList();
        this.f53518i = arrayList;
        n04 n04Var = new n04(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f53519j = n04Var;
        arrayList.add(n04Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m17720a(o04 o04Var, ArrayList arrayList, pd9 pd9Var) {
        if (o04Var.f53520k) {
            i54.m13663b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((n04) AbstractC3393o1.m17731f(1, o04Var.f53518i)).f52118j.add(new uoa("", arrayList, 0, pd9Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: b */
    public final p04 m17721b() {
        if (this.f53520k) {
            i54.m13663b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f53518i;
            if (arrayList.size() <= 1) {
                n04 n04Var = this.f53519j;
                p04 p04Var = new p04(this.f53510a, this.f53511b, this.f53512c, this.f53513d, this.f53514e, new roa(n04Var.f52109a, n04Var.f52110b, n04Var.f52111c, n04Var.f52112d, n04Var.f52113e, n04Var.f52114f, n04Var.f52115g, n04Var.f52116h, n04Var.f52117i, n04Var.f52118j), this.f53515f, this.f53516g, this.f53517h);
                this.f53520k = true;
                return p04Var;
            }
            if (this.f53520k) {
                i54.m13663b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            n04 n04Var2 = (n04) arrayList.remove(arrayList.size() - 1);
            ((n04) AbstractC3393o1.m17731f(1, arrayList)).f52118j.add(new roa(n04Var2.f52109a, n04Var2.f52110b, n04Var2.f52111c, n04Var2.f52112d, n04Var2.f52113e, n04Var2.f52114f, n04Var2.f52115g, n04Var2.f52116h, n04Var2.f52117i, n04Var2.f52118j));
        }
    }
}
