package p000;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eij {

    /* JADX INFO: renamed from: b */
    private static final nbh f14142b = nbh.m17259h("com/google/android/apps/camera/imax/ImaxDataset");

    /* JADX INFO: renamed from: a */
    public final String f14143a;

    /* JADX INFO: renamed from: c */
    private final File f14144c;

    /* JADX INFO: renamed from: d */
    private final hlw f14145d;

    public eij(Context context, hlw hlwVar, jfs jfsVar, Set set, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String strM13084T = jfsVar.m13084T(System.currentTimeMillis());
        File file = new File(context.getCacheDir(), "datasets");
        File file2 = new File(file, strM13084T);
        synchronized (set) {
            set.add(file2.toString());
        }
        if (!file.exists()) {
            file.mkdir();
        }
        if (!file2.mkdirs()) {
            ((nbe) ((nbe) f14142b.m17251b()).mo17276G((char) 1491)).mo17290o("Failed to create directory");
        }
        this.f14144c = file2;
        this.f14143a = file2.getName();
        this.f14145d = hlwVar;
    }

    /* JADX INFO: renamed from: a */
    public final String m7357a() {
        return this.f14144c.getParent() + File.separator + this.f14144c.getName();
    }

    /* JADX INFO: renamed from: b */
    public final String m7358b() {
        return m7357a() + File.separator + "capture.mp4";
    }

    /* JADX INFO: renamed from: c */
    public final void m7359c() {
        this.f14145d.m10452a().toString();
    }
}
