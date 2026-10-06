package p000;

import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class btb implements bqn {

    /* JADX INFO: renamed from: b */
    private static final cbe f4409b = new cbe(50);

    /* JADX INFO: renamed from: c */
    private final btg f4410c;

    /* JADX INFO: renamed from: d */
    private final bqn f4411d;

    /* JADX INFO: renamed from: e */
    private final bqn f4412e;

    /* JADX INFO: renamed from: f */
    private final int f4413f;

    /* JADX INFO: renamed from: g */
    private final int f4414g;

    /* JADX INFO: renamed from: h */
    private final Class f4415h;

    /* JADX INFO: renamed from: i */
    private final bqr f4416i;

    /* JADX INFO: renamed from: j */
    private final bqv f4417j;

    public btb(btg btgVar, bqn bqnVar, bqn bqnVar2, int i, int i2, bqv bqvVar, Class cls, bqr bqrVar) {
        this.f4410c = btgVar;
        this.f4411d = bqnVar;
        this.f4412e = bqnVar2;
        this.f4413f = i;
        this.f4414g = i2;
        this.f4417j = bqvVar;
        this.f4415h = cls;
        this.f4416i = bqrVar;
    }

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f4410c.mo3038e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f4413f).putInt(this.f4414g).array();
        this.f4412e.mo2922a(messageDigest);
        this.f4411d.mo2922a(messageDigest);
        messageDigest.update(bArr);
        bqv bqvVar = this.f4417j;
        if (bqvVar != null) {
            bqvVar.mo2922a(messageDigest);
        }
        this.f4416i.mo2922a(messageDigest);
        cbe cbeVar = f4409b;
        byte[] bytes = (byte[]) cbeVar.m3372f(this.f4415h);
        if (bytes == null) {
            bytes = this.f4415h.getName().getBytes(f4192a);
            cbeVar.m3373g(this.f4415h, bytes);
        }
        messageDigest.update(bytes);
        this.f4410c.mo3036c(bArr);
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (obj instanceof btb) {
            btb btbVar = (btb) obj;
            if (this.f4414g == btbVar.f4414g && this.f4413f == btbVar.f4413f && cbi.m3389j(this.f4417j, btbVar.f4417j) && this.f4415h.equals(btbVar.f4415h) && this.f4411d.equals(btbVar.f4411d) && this.f4412e.equals(btbVar.f4412e) && this.f4416i.equals(btbVar.f4416i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.bqn
    public final int hashCode() {
        int iHashCode = (((((this.f4411d.hashCode() * 31) + this.f4412e.hashCode()) * 31) + this.f4413f) * 31) + this.f4414g;
        bqv bqvVar = this.f4417j;
        if (bqvVar != null) {
            iHashCode = (iHashCode * 31) + bqvVar.hashCode();
        }
        return (((iHashCode * 31) + this.f4415h.hashCode()) * 31) + this.f4416i.hashCode();
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.f4411d) + ", signature=" + String.valueOf(this.f4412e) + BcwGDRhrTsnlj.uJUh + this.f4413f + ", height=" + this.f4414g + ", decodedResourceClass=" + String.valueOf(this.f4415h) + ", transformation='" + String.valueOf(this.f4417j) + "', options=" + String.valueOf(this.f4416i) + "}";
    }
}
