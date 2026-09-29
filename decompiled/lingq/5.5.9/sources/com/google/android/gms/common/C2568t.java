package com.google.android.gms.common;

import ae.C0062b;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import p176ib.AbstractBinderC6277k0;
import p176ib.C6272i;
import p176ib.C6275j0;
import p176ib.InterfaceC6279l0;
import p320pb.BinderC8215b;

/* JADX INFO: renamed from: com.google.android.gms.common.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2568t {

    /* JADX INFO: renamed from: a */
    public static final BinderC2562n f13996a;

    /* JADX INFO: renamed from: b */
    public static final BinderC2563o f13997b;

    /* JADX INFO: renamed from: c */
    public static volatile InterfaceC6279l0 f13998c;

    /* JADX INFO: renamed from: d */
    public static final Object f13999d;

    /* JADX INFO: renamed from: e */
    public static Context f14000e;

    static {
        new BinderC2560l(AbstractBinderC2564p.m7613j("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC2561m(AbstractBinderC2564p.m7613j("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f13996a = new BinderC2562n(AbstractBinderC2564p.m7613j("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f13997b = new BinderC2563o(AbstractBinderC2564p.m7613j("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f13999d = new Object();
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.android.gms.common.k] */
    /* JADX INFO: renamed from: a */
    public static C2573y m7617a(final String str, final AbstractBinderC2564p abstractBinderC2564p, final boolean z10, boolean z11) {
        try {
            m7618b();
            C6272i.m12915i(f14000e);
            try {
                return f13998c.mo12920e0(new zzs(str, abstractBinderC2564p, z10, z11), new BinderC8215b(f14000e.getPackageManager())) ? C2573y.f14004d : new C2572x(new Callable() { // from class: com.google.android.gms.common.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        MessageDigest messageDigest;
                        boolean z12 = z10;
                        String str2 = str;
                        AbstractBinderC2564p abstractBinderC2564p2 = abstractBinderC2564p;
                        Object[] objArr = new Object[5];
                        objArr[0] = true != (!z12 && C2568t.m7617a(str2, abstractBinderC2564p2, true, false).f14005a) ? "not allowed" : "debug cert rejected";
                        objArr[1] = str2;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= 2) {
                                messageDigest = null;
                                break;
                            }
                            try {
                                messageDigest = MessageDigest.getInstance("SHA-256");
                                if (messageDigest != null) {
                                    break;
                                }
                                i10++;
                            } catch (NoSuchAlgorithmException unused) {
                            }
                        }
                        C6272i.m12915i(messageDigest);
                        byte[] bArrDigest = messageDigest.digest(abstractBinderC2564p2.mo7616h0());
                        int length = bArrDigest.length;
                        char[] cArr = new char[length + length];
                        int i11 = 0;
                        for (byte b10 : bArrDigest) {
                            int i12 = b10 & 255;
                            int i13 = i11 + 1;
                            char[] cArr2 = C0062b.f147I;
                            cArr[i11] = cArr2[i12 >>> 4];
                            cArr[i13] = cArr2[i12 & 15];
                            i11 = i13 + 1;
                        }
                        objArr[2] = new String(cArr);
                        objArr[3] = Boolean.valueOf(z12);
                        objArr[4] = "12451000.false";
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
                    }
                });
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C2573y.m7621c("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C2573y.m7621c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m7618b() throws DynamiteModule.LoadingException {
        InterfaceC6279l0 c6275j0;
        if (f13998c != null) {
            return;
        }
        C6272i.m12915i(f14000e);
        synchronized (f13999d) {
            if (f13998c == null) {
                IBinder iBinderM7631b = DynamiteModule.m7625c(f14000e, DynamiteModule.f14025c, "com.google.android.gms.googlecertificates").m7631b("com.google.android.gms.common.GoogleCertificatesImpl");
                int i10 = AbstractBinderC6277k0.f36473a;
                if (iBinderM7631b == null) {
                    c6275j0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderM7631b.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    c6275j0 = iInterfaceQueryLocalInterface instanceof InterfaceC6279l0 ? (InterfaceC6279l0) iInterfaceQueryLocalInterface : new C6275j0(iBinderM7631b);
                }
                f13998c = c6275j0;
            }
        }
    }
}
