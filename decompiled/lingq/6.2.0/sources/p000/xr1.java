package p000;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class xr1 {

    /* JADX INFO: renamed from: a */
    public byte[] f68560a;

    /* JADX INFO: renamed from: b */
    public byte[] f68561b;

    /* JADX INFO: renamed from: c */
    public int f68562c;

    /* JADX INFO: renamed from: d */
    public int[] f68563d;

    /* JADX INFO: renamed from: e */
    public int[] f68564e;

    /* JADX INFO: renamed from: f */
    public int f68565f;

    /* JADX INFO: renamed from: g */
    public int f68566g;

    /* JADX INFO: renamed from: h */
    public int f68567h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f68568i;

    /* JADX INFO: renamed from: j */
    public final b64 f68569j;

    public xr1() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f68568i = cryptoInfo;
        b64 b64Var = new b64();
        b64Var.f8006a = cryptoInfo;
        b64Var.f8007b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        this.f68569j = b64Var;
    }
}
