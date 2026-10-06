package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.common.p019io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxq {

    /* JADX INFO: renamed from: a */
    public static final nbh f26739a = nbh.m17259h("com/google/android/apps/camera/session/InflightFallbackSaver");

    /* JADX INFO: renamed from: d */
    private static final msi f26740d = lku.m15663q(ffw.f21759e);

    /* JADX INFO: renamed from: b */
    public final dhv f26741b;

    /* JADX INFO: renamed from: c */
    public final Executor f26742c;

    /* JADX INFO: renamed from: e */
    private final File f26743e;

    /* JADX INFO: renamed from: f */
    private final File f26744f;

    /* JADX INFO: renamed from: g */
    private final fcp f26745g;

    /* JADX INFO: renamed from: h */
    private final kqj f26746h;

    public gxq(File file, kqj kqjVar, dhv dhvVar, fcp fcpVar, Executor executor, byte[] bArr, byte[] bArr2) {
        this.f26743e = new File(file, "inflight");
        this.f26744f = new File(file, PMZiHihxLGEy.JZRXMa);
        this.f26746h = kqjVar;
        this.f26741b = dhvVar;
        this.f26745g = fcpVar;
        this.f26742c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m9939a(gyh gyhVar) {
        File file = gyhVar.mo9904j() == gyx.MARS_STORE ? this.f26744f : this.f26743e;
        gyhVar.mo9915u(new gxp(this, new File(file, WIxTIdUIdfb.dVjTEEnlrt + gyhVar.mo9898d() + ".jpg"), gyhVar));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x014c */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9940b(boolean z) {
        File[] fileArrListFiles;
        gyn gynVarM14705g;
        gyj gyjVar;
        File file = z ? this.f26744f : this.f26743e;
        file.getAbsolutePath();
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    try {
                        if (file2.length() != 0) {
                            Matcher matcher = ((Pattern) f26740d.mo6051a()).matcher(file2.getName());
                            if (!matcher.matches()) {
                                throw new IOException("Unknown fallback file format: ".concat(String.valueOf(file2.getName())));
                            }
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            long j = Long.parseLong(strGroup);
                            long jConvert = TimeUnit.SECONDS.convert(System.currentTimeMillis() - j, TimeUnit.MILLISECONDS);
                            dhv dhvVar = this.f26741b;
                            dhx dhxVar = dib.f11240a;
                            dhvVar.mo6177e();
                            gynVarM14705g = this.f26746h.m14705g(j, dzk.NONE, "RESTORED", z ? gyx.MARS_STORE : gyx.MEDIA_STORE);
                            try {
                                gyj gyjVarM9981a = gynVarM14705g.m9981a("jpg");
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(file2);
                                    FileOutputStream fileOutputStreamMo14685e = gyjVarM9981a.f26832a.mo14685e();
                                    try {
                                        if (ByteStreams.copy(fileInputStream, fileOutputStreamMo14685e) == 0) {
                                            throw new IOException("Copy returned 0 bytes");
                                        }
                                        fileOutputStreamMo14685e.close();
                                        fileInputStream.close();
                                        gyjVarM9981a.m9977b();
                                        gynVarM14705g.m9987g();
                                        ((nbe) ((nbe) f26739a.m17252c()).mo17276G(3348)).mo17293r("Restored %s", gyjVarM9981a.f26832a.mo14682b());
                                        fcp fcpVar = this.f26745g;
                                        nxl nxlVarM18137O = njp.f43055d.m18137O();
                                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                                            nxlVarM18137O.mo18106p();
                                        }
                                        nxq nxqVar = nxlVarM18137O.f44974b;
                                        njp njpVar = (njp) nxqVar;
                                        njpVar.f43057a |= 1;
                                        njpVar.f43058b = jConvert;
                                        if (!nxqVar.m18142ac()) {
                                            nxlVarM18137O.mo18106p();
                                        }
                                        njp njpVar2 = (njp) nxlVarM18137O.f44974b;
                                        njpVar2.f43059c = 1;
                                        njpVar2.f43057a |= 2;
                                        fcpVar.mo8189i((njp) nxlVarM18137O.mo18103l());
                                        try {
                                            file2.delete();
                                        } catch (Exception e) {
                                            ((nbe) ((nbe) ((nbe) f26739a.m17251b()).mo17283h(e)).mo17276G((char) 3349)).mo17293r("Failed to delete fallback file %s", file2);
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            fileOutputStreamMo14685e.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            throw th;
                                        }
                                    }
                                    try {
                                        fileInputStream.close();
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    gyjVar = gyjVarM9981a;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                gyjVar = null;
                            }
                            if (gyjVar != null) {
                                gyjVar.m9976a();
                            }
                            if (gynVarM14705g != null) {
                                gynVarM14705g.m9984d();
                            }
                            throw e;
                        }
                        ((nbe) ((nbe) f26739a.m17251b()).mo17276G(3352)).mo17293r("Failed to restore empty file: %s", file2);
                        try {
                            file2.delete();
                        } catch (Exception e4) {
                            ((nbe) ((nbe) ((nbe) f26739a.m17251b()).mo17283h(e4)).mo17276G((char) 3353)).mo17293r("Failed to delete fallback file %s", file2);
                        }
                    } catch (Throwable th3) {
                        try {
                            file2.delete();
                            throw th3;
                        } catch (Exception e5) {
                            ((nbe) ((nbe) ((nbe) f26739a.m17251b()).mo17283h(e5)).mo17276G((char) 3350)).mo17293r("Failed to delete fallback file %s", file2);
                            throw th3;
                        }
                    }
                } catch (IOException e6) {
                    e = e6;
                    gynVarM14705g = null;
                    gyjVar = null;
                }
            }
        }
    }
}
