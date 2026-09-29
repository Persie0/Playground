package p429v5;

import ae.C0062b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p258m6.C7489i;
import p258m6.C7492l;
import p272n6.AbstractC7712d;
import p272n6.C7709a;
import p356r5.InterfaceC8732b;

/* JADX INFO: renamed from: v5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9654j {

    /* JADX INFO: renamed from: a */
    public final C7489i<InterfaceC8732b, String> f49443a = new C7489i<>(1000);

    /* JADX INFO: renamed from: b */
    public final C7709a.c f49444b = C7709a.m15302a(10, new a());

    /* JADX INFO: renamed from: v5.j$a */
    public class a implements C7709a.b<b> {
        @Override // p272n6.C7709a.b
        /* JADX INFO: renamed from: a */
        public final b mo6320a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: v5.j$b */
    public static final class b implements C7709a.d {

        /* JADX INFO: renamed from: a */
        public final MessageDigest f49445a;

        /* JADX INFO: renamed from: b */
        public final AbstractC7712d.a f49446b = new AbstractC7712d.a();

        public b(MessageDigest messageDigest) {
            this.f49445a = messageDigest;
        }

        @Override // p272n6.C7709a.d
        /* JADX INFO: renamed from: a */
        public final AbstractC7712d.a mo6281a() {
            return this.f49446b;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public final String m18116a(InterfaceC8732b interfaceC8732b) {
        String strM14873a;
        synchronized (this.f49443a) {
            strM14873a = this.f49443a.m14873a(interfaceC8732b);
        }
        if (strM14873a == null) {
            Object objMo11465b = this.f49444b.mo11465b();
            C0062b.m345f0(objMo11465b);
            b bVar = (b) objMo11465b;
            try {
                interfaceC8732b.mo162b(bVar.f49445a);
                byte[] bArrDigest = bVar.f49445a.digest();
                char[] cArr = C7492l.f41384b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                        try {
                            int i11 = bArrDigest[i10] & 255;
                            int i12 = i10 * 2;
                            char[] cArr2 = C7492l.f41383a;
                            cArr[i12] = cArr2[i11 >>> 4];
                            cArr[i12 + 1] = cArr2[i11 & 15];
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    strM14873a = new String(cArr);
                }
                this.f49444b.mo11464a(bVar);
            } catch (Throwable th3) {
                this.f49444b.mo11464a(bVar);
                throw th3;
            }
        }
        synchronized (this.f49443a) {
            this.f49443a.m14876d(interfaceC8732b, strM14873a);
        }
        return strM14873a;
    }
}
