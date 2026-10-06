package p000;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gwv {

    /* JADX INFO: renamed from: a */
    public final kay f26645a;

    /* JADX INFO: renamed from: b */
    public final int f26646b;

    /* JADX INFO: renamed from: c */
    public final int f26647c;

    /* JADX INFO: renamed from: d */
    private final UUID f26648d;

    /* JADX INFO: renamed from: e */
    private final int f26649e;

    /* JADX INFO: renamed from: f */
    private final long f26650f;

    /* JADX INFO: renamed from: g */
    private final gpv f26651g;

    /* JADX INFO: renamed from: h */
    private final gyw f26652h;

    /* JADX INFO: renamed from: i */
    private final dhv f26653i;

    /* JADX INFO: renamed from: j */
    private final byte[] f26654j;

    /* JADX INFO: renamed from: k */
    private final ExifInterface f26655k;

    public gwv(int i, long j, UUID uuid, kay kayVar, int i2, int i3, byte[] bArr, ExifInterface exifInterface, gpv gpvVar, gyw gywVar, dhv dhvVar) {
        this.f26649e = i;
        this.f26650f = j;
        this.f26648d = uuid;
        this.f26645a = kayVar;
        this.f26646b = i2;
        this.f26647c = i3;
        this.f26654j = bArr;
        this.f26655k = exifInterface;
        this.f26651g = gpvVar;
        this.f26652h = gywVar;
        this.f26653i = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public final hln m9865a(gyj gyjVar, mrm mrmVar, mrm mrmVar2) throws IllegalAccessException, InvocationTargetException {
        kbc.m13903h(this.f26646b, this.f26647c);
        hln hlnVar = new hln(krd.JPEG);
        hlnVar.m10448b(this.f26645a);
        try {
            FileOutputStream fileOutputStreamMo14685e = gyjVar.f26832a.mo14685e();
            try {
                m9866b(mrmVar, mrmVar2, gyjVar.f26833b, gyjVar.f26834c.m6969d(), fileOutputStreamMo14685e);
                fileOutputStreamMo14685e.close();
                gyjVar.m9977b();
                return hlnVar;
            } catch (Throwable th) {
                try {
                    fileOutputStreamMo14685e.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (IOException e) {
            gyjVar.m9976a();
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9866b(mrm mrmVar, mrm mrmVar2, boolean z, String str, OutputStream outputStream) {
        bfd bfdVarM14796b;
        gyw gywVar;
        Object obj;
        Object obj2;
        ExifInterface exifInterface = this.f26655k;
        exifInterface.getClass();
        OutputStream outputStreamM4688m = exifInterface.m4688m(outputStream);
        try {
            byte[] bArr = this.f26654j;
            bfd bfdVarM2301a = null;
            if (this.f26651g.f26030c.mo16813g()) {
                byte[] bArrM4095d = DynamicDepthUtils.m4095d(this.f26654j, (DynamicDepthResult) this.f26651g.f26030c.mo16809c(), null);
                ((DynamicDepthResult) this.f26651g.f26030c.mo16809c()).close();
                if (bArrM4095d != null) {
                    bArr = bArrM4095d;
                }
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            if (this.f26651g.f26030c.mo16813g()) {
                mrn mrnVarM14799e = ksh.m14799e(new ksf(byteArrayInputStream));
                bfd bfdVar = (mrnVarM14799e == null || (obj2 = mrnVarM14799e.f41479a) == null) ? null : (bfd) obj2;
                if (mrnVarM14799e != null && (obj = mrnVarM14799e.f41480b) != null) {
                    bfdVarM2301a = (bfd) obj;
                }
                if (this.f26651g.f26029b.mo16813g()) {
                    bfdVarM2301a = ksh.m14796b(bfdVarM2301a, (bfd) this.f26651g.f26029b.mo16812f());
                }
                byteArrayInputStream.reset();
                bfdVarM14796b = bfdVarM2301a;
                bfdVarM2301a = bfdVar;
            } else if (this.f26651g.f26028a.mo16813g()) {
                bfdVarM2301a = (bfd) this.f26651g.f26028a.mo16809c();
                bfdVarM14796b = (bfd) this.f26651g.f26029b.mo16812f();
            } else {
                bfdVarM14796b = (bfd) this.f26651g.f26029b.mo16812f();
            }
            dhv dhvVar = this.f26653i;
            if (dhvVar != null && dhvVar.mo6184l(dio.f11652I) && (gywVar = this.f26652h) != null && gywVar == gyw.PORTRAIT) {
                if (bfdVarM2301a == null) {
                    int i = ksh.f37114a;
                    bfdVarM2301a = bff.m2301a();
                }
                ksh.m14804j(bfdVarM2301a, str);
            } else if (bfdVarM2301a == null) {
                int i2 = ksh.f37114a;
                bfd bfdVarM2301a2 = bff.m2301a();
                jbx.m12875t(this.f26648d, z, str, !z, bfdVarM2301a2);
                bfdVarM2301a = bfdVarM2301a2;
            } else {
                jbx.m12875t(this.f26648d, z, str, !z, bfdVarM2301a);
            }
            ExifInterface exifInterface2 = this.f26655k;
            if (exifInterface2 != null) {
                bfdVarM14796b = ksh.m14796b(bfdVarM14796b, (bfd) ksh.m14797c(exifInterface2.f7918bA).mo16812f());
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ksh.m14808n(new ksf(byteArrayInputStream), byteArrayOutputStream, bfdVarM2301a, bfdVarM14796b);
            outputStreamM4688m.write(byteArrayOutputStream.toByteArray());
            if (mrmVar.mo16813g()) {
                if (mrmVar2.mo16813g()) {
                    egd.m7292b((byte[]) mrmVar.mo16809c(), (String) mrmVar2.mo16809c());
                }
                outputStreamM4688m.write((byte[]) mrmVar.mo16809c());
            }
            outputStreamM4688m.close();
        } catch (Throwable th) {
            try {
                outputStreamM4688m.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gwv) {
            gwv gwvVar = (gwv) obj;
            if (this.f26650f == gwvVar.f26650f && this.f26646b == gwvVar.f26646b && this.f26647c == gwvVar.f26647c && this.f26649e == gwvVar.f26649e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return String.format("%d_%dx%d_%d", Long.valueOf(this.f26650f), Integer.valueOf(this.f26646b), Integer.valueOf(this.f26647c), Integer.valueOf(this.f26649e)).hashCode();
    }

    public final String toString() {
        return "BurstMemoryImage[" + this.f26650f + "]";
    }
}
