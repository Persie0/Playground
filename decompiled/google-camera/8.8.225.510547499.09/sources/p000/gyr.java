package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gyr {

    /* JADX INFO: renamed from: a */
    private final String f26869a;

    /* JADX INFO: renamed from: b */
    private final String f26870b;

    /* JADX INFO: renamed from: c */
    private File f26871c = null;

    /* JADX INFO: renamed from: d */
    private final gyg f26872d;

    public gyr(gyg gygVar, String str, String str2) {
        this.f26872d = gygVar;
        this.f26869a = str;
        this.f26870b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized File m9999a() {
        return this.f26871c;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m10000b() {
        return m9999a() != null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m10001c() {
        if (this.f26871c != null) {
            return true;
        }
        try {
            gyg gygVar = this.f26872d;
            String str = this.f26869a;
            String str2 = this.f26870b;
            File file = new File(new File(gygVar.m9975a(str), str2), str2.concat(yTyWiTtGtnBhy.yMaoi));
            nea.m17393g(file);
            if ((!file.createNewFile() || !file.canWrite()) && !file.canWrite()) {
                throw new IOException("Temporary output file is not writeable.");
            }
            this.f26871c = file;
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
