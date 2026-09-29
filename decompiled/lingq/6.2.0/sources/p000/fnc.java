package p000;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fnc extends qcb implements imd {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f39354h = 0;

    /* JADX INFO: renamed from: g */
    public final int f39355g;

    public fnc(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        lda.m16125k(bArr.length == 25);
        this.f39355g = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: I */
    public static byte[] m11962I(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.qcb
    /* JADX INFO: renamed from: G */
    public final boolean mo11371G(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            by3 by3VarMo4847e = mo4847e();
            parcel2.writeNoException();
            zrb.m25757b(parcel2, by3VarMo4847e);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f39355g);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public abstract byte[] mo10706H();

    @Override // p000.imd
    /* JADX INFO: renamed from: b */
    public final int mo4846b() {
        return this.f39355g;
    }

    @Override // p000.imd
    /* JADX INFO: renamed from: e */
    public final by3 mo4847e() {
        return new lp6(mo10706H());
    }

    public final boolean equals(Object obj) {
        by3 by3VarMo4847e;
        if (obj instanceof imd) {
            try {
                imd imdVar = (imd) obj;
                if (imdVar.mo4846b() == this.f39355g && (by3VarMo4847e = imdVar.mo4847e()) != null) {
                    return Arrays.equals(mo10706H(), (byte[]) lp6.m16422I(by3VarMo4847e));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39355g;
    }
}
