package p000;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jhr extends cbr implements jhs {

    /* JADX INFO: renamed from: a */
    private int f34089a;

    protected jhr(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        jib.m13196a(bArr.length == 25);
        this.f34089a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m13189c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.jhs
    /* JADX INFO: renamed from: e */
    public final int mo13187e() {
        return this.f34089a;
    }

    public final boolean equals(Object obj) {
        jjc jjcVarMo13188f;
        if (obj == null || !(obj instanceof jhs)) {
            return false;
        }
        try {
            jhs jhsVar = (jhs) obj;
            if (jhsVar.mo13187e() == this.f34089a && (jjcVarMo13188f = jhsVar.mo13188f()) != null) {
                return Arrays.equals(mo12919w(), (byte[]) jjb.m13305c(jjcVarMo13188f));
            }
            return false;
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    @Override // p000.jhs
    /* JADX INFO: renamed from: f */
    public final jjc mo13188f() {
        return jjb.m13304b(mo12919w());
    }

    public final int hashCode() {
        return this.f34089a;
    }

    /* JADX INFO: renamed from: w */
    public abstract byte[] mo12919w();

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                jjc jjcVarMo13188f = mo13188f();
                parcel2.writeNoException();
                cbs.m3405d(parcel2, jjcVarMo13188f);
                return true;
            case 2:
                int i2 = this.f34089a;
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            default:
                return false;
        }
    }

    public jhr() {
        super("com.google.android.gms.common.internal.ICertData");
    }
}
