package p411u9;

import com.android.installreferrer.api.InstallReferrerClient;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10145n;

/* JADX INFO: renamed from: u9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9489l {

    /* JADX INFO: renamed from: a */
    public final boolean f48740a;

    /* JADX INFO: renamed from: b */
    public final String f48741b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7522w.a f48742c;

    /* JADX INFO: renamed from: d */
    public final int f48743d;

    /* JADX INFO: renamed from: e */
    public final byte[] f48744e;

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public C9489l(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        byte b10 = 0;
        int i13 = 1;
        C10129a.m18990b((i10 == 0) ^ (bArr2 == null));
        this.f48740a = z10;
        this.f48741b = str;
        this.f48743d = i10;
        this.f48744e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b10 = -1;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                case 1:
                    i13 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    C10145n.m19099g("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f48742c = new InterfaceC7522w.a(i13, i11, i12, bArr);
    }
}
