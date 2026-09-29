package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p176ib.AbstractBinderC6265e1;
import p176ib.C6272i;
import p176ib.InterfaceC6269g0;
import p320pb.BinderC8215b;
import p320pb.InterfaceC8214a;

/* JADX INFO: renamed from: com.google.android.gms.common.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2564p extends AbstractBinderC6265e1 {

    /* JADX INFO: renamed from: b */
    public final int f13991b;

    public AbstractBinderC2564p(byte[] bArr) {
        C6272i.m12908b(bArr.length == 25);
        this.f13991b = Arrays.hashCode(bArr);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public static byte[] m7613j(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p176ib.InterfaceC6269g0
    /* JADX INFO: renamed from: a */
    public final InterfaceC8214a mo7614a() {
        return new BinderC8215b(mo7616h0());
    }

    @Override // p176ib.InterfaceC6269g0
    /* JADX INFO: renamed from: d */
    public final int mo7615d() {
        return this.f13991b;
    }

    public final boolean equals(Object obj) {
        InterfaceC8214a interfaceC8214aMo7614a;
        if (obj != null) {
            if (obj instanceof InterfaceC6269g0) {
                try {
                    InterfaceC6269g0 interfaceC6269g0 = (InterfaceC6269g0) obj;
                    if (interfaceC6269g0.mo7615d() == this.f13991b && (interfaceC8214aMo7614a = interfaceC6269g0.mo7614a()) != null) {
                        return Arrays.equals(mo7616h0(), (byte[]) BinderC8215b.m16362h0(interfaceC8214aMo7614a));
                    }
                    return false;
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public abstract byte[] mo7616h0();

    public final int hashCode() {
        return this.f13991b;
    }
}
