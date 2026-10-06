package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgi {

    /* JADX INFO: renamed from: a */
    public final kgj f35899a;

    /* JADX INFO: renamed from: b */
    public final mrm f35900b;

    /* JADX INFO: renamed from: c */
    public final mrm f35901c;

    /* JADX INFO: renamed from: d */
    public final kbc f35902d;

    /* JADX INFO: renamed from: e */
    public final int f35903e;

    /* JADX INFO: renamed from: f */
    public final int f35904f;

    /* JADX INFO: renamed from: g */
    public final mrm f35905g;

    /* JADX INFO: renamed from: h */
    public final mrm f35906h;

    /* JADX INFO: renamed from: i */
    public final boolean f35907i;

    /* JADX INFO: renamed from: j */
    public final boolean f35908j;

    /* JADX INFO: renamed from: k */
    public final int f35909k;

    /* JADX INFO: renamed from: l */
    public final long f35910l;

    /* JADX INFO: renamed from: m */
    public final boolean f35911m;

    /* JADX INFO: renamed from: n */
    public final int f35912n;

    public kgi() {
    }

    public kgi(kgj kgjVar, mrm mrmVar, mrm mrmVar2, kbc kbcVar, int i, int i2, mrm mrmVar3, mrm mrmVar4, boolean z, boolean z2, int i3, long j, boolean z3) {
        this.f35899a = kgjVar;
        this.f35900b = mrmVar;
        this.f35901c = mrmVar2;
        this.f35902d = kbcVar;
        this.f35903e = i;
        this.f35904f = i2;
        this.f35905g = mrmVar3;
        this.f35906h = mrmVar4;
        this.f35907i = z;
        this.f35908j = z2;
        this.f35912n = 1;
        this.f35909k = i3;
        this.f35910l = j;
        this.f35911m = z3;
    }

    /* JADX INFO: renamed from: a */
    public static kgh m14208a() {
        kgh kghVar = new kgh(null);
        kghVar.m14203h(0);
        kghVar.m14198c(-1);
        kghVar.m14200e(false);
        kghVar.m14202g(false);
        kghVar.f35886c = 1;
        kghVar.f35884a = -1;
        kghVar.f35885b = (byte) (kghVar.f35885b | 16);
        kghVar.m14199d(-1L);
        kghVar.m14201f(true);
        return kghVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kgi)) {
            return false;
        }
        kgi kgiVar = (kgi) obj;
        if (this.f35899a.equals(kgiVar.f35899a) && this.f35900b.equals(kgiVar.f35900b) && this.f35901c.equals(kgiVar.f35901c) && this.f35902d.equals(kgiVar.f35902d) && this.f35903e == kgiVar.f35903e && this.f35904f == kgiVar.f35904f && this.f35905g.equals(kgiVar.f35905g) && this.f35906h.equals(kgiVar.f35906h) && this.f35907i == kgiVar.f35907i && this.f35908j == kgiVar.f35908j) {
            int i = this.f35912n;
            int i2 = kgiVar.f35912n;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1 && this.f35909k == kgiVar.f35909k && this.f35910l == kgiVar.f35910l && this.f35911m == kgiVar.f35911m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.f35899a.hashCode() ^ 1000003) * 1000003) ^ this.f35900b.hashCode()) * 1000003) ^ this.f35901c.hashCode()) * 1000003) ^ this.f35902d.hashCode()) * 1000003) ^ this.f35903e) * 1000003) ^ this.f35904f) * 1000003) ^ this.f35905g.hashCode();
        int i = true != this.f35907i ? 1237 : 1231;
        int i2 = true != this.f35908j ? 1237 : 1231;
        if (this.f35912n == 0) {
            throw null;
        }
        int i3 = ((((((((((iHashCode * 1000003) ^ 2040732332) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ 1) * 1000003) ^ this.f35909k) * 1000003;
        long j = this.f35910l;
        return ((i3 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true == this.f35911m ? 1231 : 1237);
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.f35899a);
        String strValueOf2 = String.valueOf(this.f35900b);
        String strValueOf3 = String.valueOf(this.f35901c);
        String strValueOf4 = String.valueOf(this.f35902d);
        int i = this.f35903e;
        int i2 = this.f35904f;
        String strValueOf5 = String.valueOf(this.f35905g);
        String strValueOf6 = String.valueOf(this.f35906h);
        boolean z = this.f35907i;
        boolean z2 = this.f35908j;
        switch (this.f35912n) {
            case 1:
                str = "NONE";
                break;
            default:
                str = "null";
                break;
        }
        return "StreamConfig{type=" + strValueOf + ", cameraId=" + strValueOf2 + ", surface=" + strValueOf3 + WIxTIdUIdfb.cfxgIKhhQqTQnW + strValueOf4 + ", imageFormat=" + i + ", capacity=" + i2 + ", usageFlags=" + strValueOf5 + BEeWZPor.gWQyFE + strValueOf6 + ", forCapture=" + z + NptsKnlVczSZ.LaZdkuSCGNkFNPi + z2 + ", preAllocType=" + str + ", preAllocSize=" + this.f35909k + ", dynamicRangeProfile=" + this.f35910l + ", halMemoryEstimationEnabled=" + this.f35911m + "}";
    }
}
