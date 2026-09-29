package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class h8a {

    /* JADX INFO: renamed from: a */
    public final boolean f41995a;

    /* JADX INFO: renamed from: b */
    public final String f41996b;

    /* JADX INFO: renamed from: c */
    public final m8a f41997c;

    /* JADX INFO: renamed from: d */
    public final int f41998d;

    /* JADX INFO: renamed from: e */
    public final byte[] f41999e;

    public h8a(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        bna.m3969q((i == 0) ^ (bArr2 == null));
        this.f41995a = z;
        this.f41996b = str;
        this.f41998d = i;
        this.f41999e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    b = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    ss5.m21707d0("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f41997c = new m8a(i4, bArr, i2, i3);
    }
}
