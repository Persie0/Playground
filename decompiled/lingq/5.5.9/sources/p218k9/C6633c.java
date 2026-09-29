package p218k9;

import android.media.MediaCodec;
import p479xa.C10134c0;

/* JADX INFO: renamed from: k9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6633c {

    /* JADX INFO: renamed from: a */
    public byte[] f37592a;

    /* JADX INFO: renamed from: b */
    public byte[] f37593b;

    /* JADX INFO: renamed from: c */
    public int f37594c;

    /* JADX INFO: renamed from: d */
    public int[] f37595d;

    /* JADX INFO: renamed from: e */
    public int[] f37596e;

    /* JADX INFO: renamed from: f */
    public int f37597f;

    /* JADX INFO: renamed from: g */
    public int f37598g;

    /* JADX INFO: renamed from: h */
    public int f37599h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f37600i;

    /* JADX INFO: renamed from: j */
    public final a f37601j;

    /* JADX INFO: renamed from: k9.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final MediaCodec.CryptoInfo f37602a;

        /* JADX INFO: renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f37603b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f37602a = cryptoInfo;
        }
    }

    public C6633c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f37600i = cryptoInfo;
        this.f37601j = C10134c0.f51354a >= 24 ? new a(cryptoInfo) : null;
    }
}
