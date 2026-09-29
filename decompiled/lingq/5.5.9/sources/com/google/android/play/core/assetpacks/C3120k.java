package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import p290o6.C7967l0;
import p338qd.C8532d1;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3120k {

    /* JADX INFO: renamed from: b */
    public static final C7967l0 f15945b = new C7967l0("MergeSliceTaskHandler");

    /* JADX INFO: renamed from: a */
    public final C3112c f15946a;

    public C3120k(C3112c c3112c) {
        this.f15946a = c3112c;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public static void m8994b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                throw new zzck("File clashing with existing file from other slice: ".concat(file2.toString()));
            }
            if (!file.renameTo(file2)) {
                throw new zzck("Unable to move file: ".concat(String.valueOf(file)));
            }
            return;
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            m8994b(file3, new File(file2, file3.getName()));
        }
        if (!file.delete()) {
            throw new zzck("Unable to delete directory: ".concat(String.valueOf(file)));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m8995a(C8532d1 c8532d1) {
        C3112c c3112c = this.f15946a;
        Object obj = c8532d1.f33657b;
        File fileM8976l = c3112c.m8976l((String) obj, c8532d1.f45821c, c8532d1.f45822d, c8532d1.f45823e);
        if (!fileM8976l.exists()) {
            throw new zzck(String.format("Cannot find verified files for slice %s.", c8532d1.f45823e), c8532d1.f33656a);
        }
        C3112c c3112c2 = this.f15946a;
        c3112c2.getClass();
        int i10 = c8532d1.f45821c;
        long j10 = c8532d1.f45822d;
        File file = new File(c3112c2.m8969c((String) obj, i10, j10), "_packs");
        if (!file.exists()) {
            file.mkdirs();
        }
        m8994b(fileM8976l, file);
        try {
            int iM8972h = c3112c2.m8972h((String) obj, i10, j10);
            File file2 = new File(new File(c3112c2.m8969c((String) obj, i10, j10), "_packs"), "merge.tmp");
            Properties properties = new Properties();
            properties.put("numberOfMerges", String.valueOf(iM8972h + 1));
            file2.getParentFile().mkdirs();
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (IOException e10) {
            f15945b.m15812m("Writing merge checkpoint failed with %s.", e10.getMessage());
            throw new zzck("Writing merge checkpoint failed.", e10, c8532d1.f33656a);
        }
    }
}
