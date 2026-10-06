package p000;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum dji {
    INSTANCE;


    /* JADX INFO: renamed from: b */
    public final File f11782b = new File("/sys/fs/selinux/enforce");

    /* JADX INFO: renamed from: a */
    final boolean m6210a() {
        return this.f11782b.exists();
    }
}
