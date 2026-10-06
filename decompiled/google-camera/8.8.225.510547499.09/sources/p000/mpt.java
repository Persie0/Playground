package p000;

import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import p021j$.nio.file.Path;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mpt {

    /* JADX INFO: renamed from: a */
    public final Optional f41295a;

    /* JADX INFO: renamed from: b */
    public final Optional f41296b;

    /* JADX INFO: renamed from: c */
    public final npu f41297c;

    /* JADX INFO: renamed from: d */
    public final Path f41298d;

    /* JADX INFO: renamed from: e */
    public final int f41299e;

    /* JADX INFO: renamed from: f */
    public final float f41300f;

    /* JADX INFO: renamed from: g */
    public final boolean f41301g;

    /* JADX INFO: renamed from: h */
    public final int f41302h;

    /* JADX INFO: renamed from: i */
    public final int f41303i;

    /* JADX INFO: renamed from: j */
    public final int f41304j;

    /* JADX INFO: renamed from: k */
    private final int f41305k;

    public mpt() {
    }

    public mpt(int i, int i2, Optional optional, Optional optional2, npu npuVar, Path path, int i3, float f, boolean z) {
        this.f41304j = i;
        this.f41302h = i2;
        this.f41303i = 1;
        this.f41295a = optional;
        this.f41296b = optional2;
        this.f41297c = npuVar;
        this.f41298d = path;
        this.f41299e = i3;
        this.f41300f = f;
        this.f41301g = z;
        this.f41305k = 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mpt)) {
            return false;
        }
        mpt mptVar = (mpt) obj;
        int i = this.f41304j;
        int i2 = mptVar.f41304j;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            int i3 = this.f41302h;
            int i4 = mptVar.f41302h;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4) {
                int i5 = this.f41303i;
                int i6 = mptVar.f41303i;
                if (i5 == 0) {
                    throw null;
                }
                if (i6 == 1 && this.f41295a.equals(mptVar.f41295a) && this.f41296b.equals(mptVar.f41296b) && this.f41297c.equals(mptVar.f41297c) && this.f41298d.equals(mptVar.f41298d) && this.f41299e == mptVar.f41299e && Float.floatToIntBits(this.f41300f) == Float.floatToIntBits(mptVar.f41300f) && this.f41301g == mptVar.f41301g) {
                    int i7 = this.f41305k;
                    int i8 = mptVar.f41305k;
                    if (i7 == 0) {
                        throw null;
                    }
                    if (i8 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41304j;
        if (i == 0) {
            throw null;
        }
        int i2 = i ^ 1000003;
        int i3 = this.f41302h;
        if (i3 == 0) {
            throw null;
        }
        int i4 = ((i2 * 1000003) ^ i3) * 1000003;
        if (this.f41303i == 0) {
            throw null;
        }
        int iHashCode = (((((((((((((((((i4 ^ 1) * 1000003) ^ this.f41295a.hashCode()) * 1000003) ^ this.f41296b.hashCode()) * 1000003) ^ this.f41297c.hashCode()) * 1000003) ^ this.f41298d.hashCode()) * 1000003) ^ this.f41299e) * 1000003) ^ Float.floatToIntBits(this.f41300f)) * 1000003) ^ 1237) * 1000003) ^ (true == this.f41301g ? 1231 : 1237)) * 1000003;
        if (this.f41305k != 0) {
            return iHashCode ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4 = "null";
        switch (this.f41304j) {
            case 1:
                str = JrxsYuVZZqnFC.Vib;
                break;
            case 2:
                str = "BATCH";
                break;
            default:
                str = "null";
                break;
        }
        switch (this.f41302h) {
            case 1:
                str2 = "INPUT_STREAM";
                break;
            case 2:
                str2 = "DIRECT";
                break;
            default:
                str2 = "null";
                break;
        }
        switch (this.f41303i) {
            case 1:
                str3 = "CALLBACK";
                break;
            default:
                str3 = "null";
                break;
        }
        String strValueOf = String.valueOf(this.f41295a);
        String strValueOf2 = String.valueOf(this.f41296b);
        String strValueOf3 = String.valueOf(this.f41297c);
        String strValueOf4 = String.valueOf(this.f41298d);
        int i = this.f41299e;
        float f = this.f41300f;
        boolean z = this.f41301g;
        switch (this.f41305k) {
            case 1:
                str4 = "ANDROID";
                break;
        }
        return HEePJw.BYU + str + ", rawAudioInterfaceType=" + str2 + ", processedAudioInterfaceType=" + str3 + ", callback=" + strValueOf + ", rawAudioInputStream=" + strValueOf2 + ", listeningExecutorService=" + strValueOf3 + ", modelDirectory=" + strValueOf4 + ", numberOfChannels=" + i + ", sampleRate=" + f + ", skipInitGoogle=false, useTpu=" + z + ", environmentType=" + str4 + "}";
    }
}
