package p000;

import android.os.Environment;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyn {

    /* JADX INFO: renamed from: a */
    public static final nbh f20988a = nbh.m17259h("com/google/android/apps/camera/legacy/lightcycle/storage/LocalFileStorageManager");

    /* JADX INFO: renamed from: b */
    public File f20989b;

    /* JADX INFO: renamed from: c */
    public final File f20990c;

    /* JADX INFO: renamed from: d */
    public final File f20991d;

    /* JADX INFO: renamed from: e */
    public final fca f20992e;

    /* JADX INFO: renamed from: f */
    public final gyg f20993f;

    /* JADX INFO: renamed from: g */
    public final kqj f20994g;

    /* JADX INFO: renamed from: h */
    public final ihk f20995h;

    /* JADX INFO: renamed from: i */
    public final jfs f20996i;

    public eyn(gxa gxaVar, jfs jfsVar, ihk ihkVar, gyg gygVar, fca fcaVar, kqj kqjVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f20990c = gxaVar.mo9923c("");
        this.f20991d = gxaVar.mo9923c("panorama_sessions");
        File file = new File(Environment.getExternalStorageDirectory(), "panoramas");
        if (!file.mkdirs() && !file.exists()) {
            ((nbe) ((nbe) f20988a.m17251b()).mo17276G((char) 2052)).mo17290o("Panorama directory not created.");
            file = null;
        }
        this.f20989b = file;
        this.f20996i = jfsVar;
        this.f20995h = ihkVar;
        this.f20993f = gygVar;
        this.f20992e = fcaVar;
        this.f20994g = kqjVar;
    }

    /* JADX INFO: renamed from: a */
    public final File m8050a() {
        this.f20989b.getAbsolutePath();
        File file = new File(this.f20989b, wUzNh.QDqDkPDDkeUye);
        if (file.mkdirs() || file.exists()) {
            return file;
        }
        ((nbe) ((nbe) f20988a.m17251b()).mo17276G((char) 2053)).mo17290o("Thumbnails directory not created.");
        return null;
    }
}
