package p000;

import androidx.media3.common.C0713b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class eu2 implements dy5 {

    /* JADX INFO: renamed from: g */
    public static final C0713b f37855g;

    /* JADX INFO: renamed from: h */
    public static final C0713b f37856h;

    /* JADX INFO: renamed from: a */
    public final String f37857a;

    /* JADX INFO: renamed from: b */
    public final String f37858b;

    /* JADX INFO: renamed from: c */
    public final long f37859c;

    /* JADX INFO: renamed from: d */
    public final long f37860d;

    /* JADX INFO: renamed from: e */
    public final byte[] f37861e;

    /* JADX INFO: renamed from: f */
    public int f37862f;

    static {
        lc3 lc3Var = new lc3();
        lc3Var.f49453n = ez5.m11402l("application/id3");
        f37855g = new C0713b(lc3Var);
        lc3 lc3Var2 = new lc3();
        lc3Var2.f49453n = ez5.m11402l("application/x-scte35");
        f37856h = new C0713b(lc3Var2);
    }

    public eu2(String str, String str2, long j, long j2, byte[] bArr) {
        this.f37857a = str;
        this.f37858b = str2;
        this.f37859c = j;
        this.f37860d = j2;
        this.f37861e = bArr;
    }

    @Override // p000.dy5
    /* JADX INFO: renamed from: a */
    public final C0713b mo10746a() {
        switch (this.f37857a) {
            case "urn:scte:scte35:2014:bin":
                return f37856h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f37855g;
            default:
                return null;
        }
    }

    @Override // p000.dy5
    /* JADX INFO: renamed from: c */
    public final byte[] mo10747c() {
        if (mo10746a() != null) {
            return this.f37861e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eu2.class != obj.getClass()) {
            return false;
        }
        eu2 eu2Var = (eu2) obj;
        return this.f37859c == eu2Var.f37859c && this.f37860d == eu2Var.f37860d && this.f37857a.equals(eu2Var.f37857a) && this.f37858b.equals(eu2Var.f37858b) && Arrays.equals(this.f37861e, eu2Var.f37861e);
    }

    public final int hashCode() {
        if (this.f37862f == 0) {
            int iM22980c = ux5.m22980c(ux5.m22980c(527, this.f37857a, 31), this.f37858b, 31);
            long j = this.f37859c;
            int i = (iM22980c + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f37860d;
            this.f37862f = Arrays.hashCode(this.f37861e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f37862f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f37857a + ", id=" + this.f37860d + ", durationMs=" + this.f37859c + ", value=" + this.f37858b;
    }
}
