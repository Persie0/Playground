package p000;

import com.google.android.material.snackbar.VMX.rgoX;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fua {

    /* JADX INFO: renamed from: a */
    public final int f23573a;

    /* JADX INFO: renamed from: b */
    public final fub f23574b;

    /* JADX INFO: renamed from: c */
    public final int f23575c;

    /* JADX INFO: renamed from: d */
    public final kmq f23576d;

    /* JADX INFO: renamed from: e */
    public final byte[] f23577e;

    /* JADX INFO: renamed from: f */
    public final jvb f23578f;

    /* JADX INFO: renamed from: g */
    public final jww f23579g;

    /* JADX INFO: renamed from: h */
    public final boolean f23580h;

    /* JADX INFO: renamed from: i */
    public final boolean f23581i;

    /* JADX INFO: renamed from: j */
    public final mrm f23582j;

    public fua() {
    }

    public fua(int i, fub fubVar, int i2, kmq kmqVar, byte[] bArr, jvb jvbVar, jww jwwVar, boolean z, boolean z2, mrm mrmVar) {
        this.f23573a = i;
        this.f23574b = fubVar;
        this.f23575c = i2;
        this.f23576d = kmqVar;
        this.f23577e = bArr;
        this.f23578f = jvbVar;
        this.f23579g = jwwVar;
        this.f23580h = z;
        this.f23581i = z2;
        this.f23582j = mrmVar;
    }

    /* JADX INFO: renamed from: a */
    public static ftz m8808a() {
        ftz ftzVar = new ftz((byte[]) null);
        ftzVar.m8806g(kay.CLOCKWISE_0.f35503e);
        ftzVar.m8801b(new fty());
        ftzVar.m8804e(-1);
        ftzVar.m8802c(kmq.BACK);
        ftzVar.f23561a = new byte[0];
        ftzVar.f23562b = new jvb();
        ftzVar.m8807h(jwv.m13644a(false));
        ftzVar.m8803d(false);
        ftzVar.m8805f(false);
        ftzVar.f23563c = mqu.f41450a;
        return ftzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fua) {
            fua fuaVar = (fua) obj;
            if (this.f23573a == fuaVar.f23573a && this.f23574b.equals(fuaVar.f23574b) && this.f23575c == fuaVar.f23575c && this.f23576d.equals(fuaVar.f23576d)) {
                if (Arrays.equals(this.f23577e, fuaVar instanceof fua ? fuaVar.f23577e : fuaVar.f23577e) && this.f23578f.equals(fuaVar.f23578f) && this.f23579g.equals(fuaVar.f23579g) && this.f23580h == fuaVar.f23580h && this.f23581i == fuaVar.f23581i && this.f23582j.equals(fuaVar.f23582j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.f23573a ^ 1000003) * 1000003) ^ this.f23574b.hashCode()) * 1000003) ^ this.f23575c) * 1000003) ^ this.f23576d.hashCode()) * 1000003) ^ Arrays.hashCode(this.f23577e)) * 1000003) ^ this.f23578f.hashCode()) * 1000003) ^ this.f23579g.hashCode();
        return (((((iHashCode * 1000003) ^ (true != this.f23580h ? 1237 : 1231)) * 1000003) ^ (true == this.f23581i ? 1231 : 1237)) * 1000003) ^ this.f23582j.hashCode();
    }

    public final String toString() {
        return "PhotoCaptureParameters{orientation=" + this.f23573a + ", callback=" + String.valueOf(this.f23574b) + ", heading=" + this.f23575c + ", facing=" + String.valueOf(this.f23576d) + rgoX.fhLkALAlTLZm + Arrays.toString(this.f23577e) + ", shotLifetime=" + String.valueOf(this.f23578f) + ", selfieFlashFired=" + String.valueOf(this.f23579g) + ", generateDngEnabled=" + this.f23580h + ", longPress=" + this.f23581i + ", mergedCropOverride=" + String.valueOf(this.f23582j) + "}";
    }
}
