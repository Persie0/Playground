package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import p021j$.nio.file.Paths;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class egd {

    /* JADX INFO: renamed from: a */
    private static final nbh f13910a = nbh.m17259h("com/google/android/apps/camera/hdrplus/debug/api/DebugDataSavers");

    /* JADX INFO: renamed from: a */
    public static void m7291a(byte[] bArr, mrm mrmVar) {
        mrm mrmVarMo16808b = mrmVar.mo16808b(ddu.f10593j);
        if (!mrmVarMo16808b.mo16813g() || ((String) mrmVarMo16808b.mo16809c()).isEmpty()) {
            return;
        }
        m7292b(bArr, (String) mrmVarMo16808b.mo16809c());
    }

    /* JADX INFO: renamed from: b */
    public static void m7292b(byte[] bArr, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Paths.get(str, "debug_3a.bin").toString());
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            ((nbe) ((nbe) f13910a.m17252c()).mo17276G((char) 1424)).mo17293r("3A_DEBUG, error putting 3a debug data to additional path. %s.", e2.getMessage());
        }
    }
}
