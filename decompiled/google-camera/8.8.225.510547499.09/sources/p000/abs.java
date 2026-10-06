package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class abs {
    /* JADX INFO: renamed from: a */
    public static File[] m151a(Context context) {
        return context.getExternalCacheDirs();
    }

    /* JADX INFO: renamed from: b */
    static File[] m152b(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    /* JADX INFO: renamed from: c */
    static File[] m153c(Context context) {
        return context.getObbDirs();
    }
}
