package p041c5;

import android.content.Context;
import dm.C5207g;
import java.io.File;

/* JADX INFO: renamed from: c5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1698a {

    /* JADX INFO: renamed from: a */
    public static final C1698a f9471a = new C1698a();

    /* JADX INFO: renamed from: a */
    public final File m5429a(Context context) {
        C5207g.m11111f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C5207g.m11110e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
