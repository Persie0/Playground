package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kui {

    /* JADX INFO: renamed from: a */
    private final Context f37224a;

    /* JADX INFO: renamed from: b */
    private final Object f37225b = new Object();

    /* JADX INFO: renamed from: c */
    private File f37226c;

    public kui(Context context) {
        this.f37224a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public final File m14891a() {
        File file;
        synchronized (this.f37225b) {
            if (this.f37226c == null) {
                this.f37226c = this.f37224a.getDataDir();
            }
            file = this.f37226c;
        }
        return file;
    }
}
