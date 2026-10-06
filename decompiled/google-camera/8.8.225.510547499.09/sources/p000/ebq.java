package p000;

import android.util.Log;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.imageio.ExifEncode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import p021j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebq {

    /* JADX INFO: renamed from: g */
    private final dhv f13281g;

    /* JADX INFO: renamed from: f */
    private static final nbh f13280f = nbh.m17259h("com/google/android/apps/camera/hdrplus/GcamUtils");

    /* JADX INFO: renamed from: a */
    public static final nrx f13275a = nrx.f44313f;

    /* JADX INFO: renamed from: b */
    public static final nrx f13276b = nrx.f44311d;

    /* JADX INFO: renamed from: c */
    public static final nrx f13277c = nrx.f44313f;

    /* JADX INFO: renamed from: d */
    public static final nrx f13278d = nrx.f44309b;

    /* JADX INFO: renamed from: e */
    public static final long f13279e = (GcamModuleJNI.DEBUG_SAVE_INPUT_METERING_get() | GcamModuleJNI.DEBUG_SAVE_INPUT_PAYLOAD_get()) | GcamModuleJNI.DEBUG_SAVE_METADATA_get();

    public ebq(dhv dhvVar) {
        this.f13281g = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public static ExifInterface m7069a(int i, int i2, ShotMetadata shotMetadata, mrm mrmVar) {
        byte[] bArrEncodeGcamExif = new ExifEncode().encodeGcamExif(i, i2, ShotMetadata.m5095a(shotMetadata));
        int length = bArrEncodeGcamExif != null ? bArrEncodeGcamExif.length : 0;
        byte[] bArr = new byte[length + 4];
        bArr[0] = -1;
        bArr[1] = -31;
        int i3 = length + 2;
        bArr[2] = (byte) ((i3 >> 8) & 255);
        bArr[3] = (byte) (i3 & 255);
        if (length > 0) {
            System.arraycopy(bArrEncodeGcamExif, 0, bArr, 4, length);
        }
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.m4691r(bArr);
        } catch (IOException e) {
            ((nbe) ((nbe) f13280f.m17252c()).mo17276G((char) 1261)).mo17293r("Unable to parse EXIF: %s", e.getMessage());
        }
        if (shotMetadata.m5100f() == nrw.f44301b || shotMetadata.m5100f() == nrw.f44300a || shotMetadata.m5100f() == nrw.f44303d) {
            exifInterface.f7924bz = 1;
        } else {
            exifInterface.f7924bz = 2;
        }
        shotMetadata.m5105k();
        String strM5104j = shotMetadata.m5104j();
        mrm mrmVarMo16808b = mrmVar.mo16808b(ddu.f10591h);
        if (mrmVarMo16808b.mo16813g() && !((String) mrmVarMo16808b.mo16809c()).isEmpty()) {
            mrm mrmVarM14797c = ksh.m14797c(strM5104j);
            if (mrmVarM14797c.mo16813g()) {
                bfd bfdVar = (bfd) mrmVarM14797c.mo16809c();
                String str = (String) mrmVarMo16808b.mo16809c();
                try {
                    bff.f3083a.m5628e("http://ns.google.com/photos/1.0/camera/", "GCamera");
                    bfdVar.mo2296g(BEeWZPor.qAqOBwvZGDYVd, new bge(512), str, new bge());
                } catch (bfc e2) {
                    Log.e("XmpUtil", "exception while appending disable suggested actions ".concat(String.valueOf(e2.getMessage())));
                }
                try {
                    bfd bfdVar2 = (bfd) mrmVarM14797c.mo16809c();
                    bgf bgfVar = new bgf();
                    bff.m2302b(bfdVar2);
                    bgfVar.m2382f(3, false);
                    bgfVar.m2382f(2, true);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
                    C0137dp.m6527x((bfr) bfdVar2, byteArrayOutputStream, bgfVar);
                    try {
                        strM5104j = byteArrayOutputStream.toString(bgfVar.m2406b());
                    } catch (UnsupportedEncodingException e3) {
                        strM5104j = byteArrayOutputStream.toString();
                    }
                } catch (bfc e4) {
                }
            } else {
                ((nbe) ((nbe) f13280f.m17252c()).mo17276G((char) 1259)).mo17290o("Extended XMP section not found to append slowraw directory");
            }
        }
        exifInterface.f7918bA = strM5104j;
        return exifInterface;
    }

    /* JADX INFO: renamed from: b */
    public static PostviewParams m7070b(kmd kmdVar, gdz gdzVar) {
        int iRound;
        int iRound2;
        PostviewParams postviewParams = new PostviewParams();
        kbc kbcVar = nta.m17664g(kmdVar).f36581b;
        postviewParams.m5083b(f13275a);
        float fM13877c = kan.m13873j(gdzVar.f24348b).m13877c();
        int i = kbcVar.f35517a;
        int i2 = kbcVar.f35518b;
        if (i > i2) {
            iRound2 = Math.round(i / 6.0f);
            iRound = Math.round((iRound2 / fM13877c) * 1.05f);
        } else {
            int iRound3 = Math.round(i2 / 6.0f);
            int iRound4 = Math.round(iRound3 * fM13877c * 1.05f);
            iRound = iRound3;
            iRound2 = iRound4;
        }
        kbc kbcVar2 = new kbc((iRound2 + 1) & (-2), (iRound + 1) & (-2));
        int i3 = kbcVar2.f35517a;
        if (i3 > kbcVar2.f35518b) {
            postviewParams.m5085d(i3);
            postviewParams.m5084c(0);
        } else {
            postviewParams.m5085d(0);
            postviewParams.m5084c(kbcVar2.f35518b);
        }
        return postviewParams;
    }

    /* JADX INFO: renamed from: d */
    public static String m7071d(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return "XXXX_".concat(String.valueOf(simpleDateFormat.format(Long.valueOf(j))));
    }

    /* JADX INFO: renamed from: c */
    public final String m7072c(File file, long j, String str) throws IOException {
        if (!file.exists() || !file.isDirectory()) {
            throw new RuntimeException("Gcam debug directory not valid or doesn't exist: ".concat(String.valueOf(file.getAbsolutePath())));
        }
        File file2 = new File(new File(new File(file, "gcam"), m7071d(j)), str);
        if (file2.exists()) {
            throw new IOException("Gcam debug data folder already exists: ".concat(String.valueOf(file2.getAbsolutePath())));
        }
        if (!file2.mkdirs()) {
            throw new IOException("Could not create Gcam debug data folder: ".concat(String.valueOf(file2.getAbsolutePath())));
        }
        file2.getAbsolutePath();
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7073e() {
        dhv dhvVar = this.f13281g;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6175c();
        return this.f13281g.mo6184l(dil.f11630p);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7074f(edk edkVar) {
        return edkVar != edk.MOTION_BLUR && m7073e();
    }
}
