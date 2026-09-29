package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import p290o6.C7967l0;
import p338qd.C8547i1;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3112c {

    /* JADX INFO: renamed from: c */
    public static final C7967l0 f15905c = new C7967l0("AssetPackStorage");

    /* JADX INFO: renamed from: a */
    public final Context f15906a;

    /* JADX INFO: renamed from: b */
    public final C8547i1 f15907b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14L);
        timeUnit.toMillis(28L);
    }

    public C3112c(Context context, C8547i1 c8547i1) {
        this.f15906a = context;
        this.f15907b = c8547i1;
    }

    /* JADX INFO: renamed from: b */
    public static long m8965b(File file, boolean z10) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        C7967l0 c7967l0 = f15905c;
        if (z10 && file.listFiles().length > 1) {
            c7967l0.m15815p("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e10) {
            c7967l0.m15813n(e10, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m8966f(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long jM8965b = m8965b(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(jM8965b)) && !file2.getName().equals("stale.tmp")) {
                m8967g(file2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8967g(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zM8967g = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zM8967g &= m8967g(file2);
            }
        }
        if (file.delete()) {
            return zM8967g;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m8968a(String str, int i10, long j10) {
        File file = new File(m8970d(), str);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(i10)) && !file2.getName().equals("stale.tmp")) {
                    m8967g(file2);
                } else if (file2.getName().equals(String.valueOf(i10))) {
                    for (File file3 : file2.listFiles()) {
                        if (!file3.getName().equals(String.valueOf(j10))) {
                            m8967g(file3);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final File m8969c(String str, int i10, long j10) {
        return new File(new File(new File(new File(m8970d(), "_tmp"), str), String.valueOf(i10)), String.valueOf(j10));
    }

    /* JADX INFO: renamed from: d */
    public final File m8970d() {
        return new File(this.f15906a.getFilesDir(), "assetpacks");
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m8971e() {
        ArrayList arrayList = new ArrayList();
        try {
            if (!m8970d().exists() || m8970d().listFiles() == null) {
                return arrayList;
            }
            for (File file : m8970d().listFiles()) {
                if (!file.getCanonicalPath().equals(new File(m8970d(), "_tmp").getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
        } catch (IOException e10) {
            f15905c.m15812m("Could not process directory while scanning installed packs. %s", e10);
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final int m8972h(String str, int i10, long j10) throws IOException {
        File file = new File(new File(m8969c(str, i10, j10), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new zzck("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e10) {
                throw new zzck("Merge checkpoint file corrupt.", e10);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final long m8973i(String str) {
        return m8965b(new File(new File(m8970d(), str), String.valueOf((int) m8965b(new File(m8970d(), str), true))), true);
    }

    /* JADX INFO: renamed from: j */
    public final File m8974j(String str, int i10, long j10) {
        return new File(new File(new File(m8970d(), str), String.valueOf(i10)), String.valueOf(j10));
    }

    /* JADX INFO: renamed from: k */
    public final File m8975k(String str, int i10, long j10, String str2) {
        return new File(new File(new File(m8969c(str, i10, j10), "_slices"), "_unverified"), str2);
    }

    /* JADX INFO: renamed from: l */
    public final File m8976l(String str, int i10, long j10, String str2) {
        return new File(new File(new File(m8969c(str, i10, j10), "_slices"), "_verified"), str2);
    }

    /* JADX INFO: renamed from: m */
    public final String m8977m(String str) throws IOException {
        int length;
        File file = new File(m8970d(), str);
        boolean zExists = file.exists();
        C7967l0 c7967l0 = f15905c;
        if (!zExists) {
            c7967l0.m15811l("Pack not found with pack name: %s", str);
            return null;
        }
        C8547i1 c8547i1 = this.f15907b;
        File file2 = new File(file, String.valueOf(c8547i1.m16652a()));
        if (!file2.exists()) {
            c7967l0.m15811l("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(c8547i1.m16652a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            c7967l0.m15811l("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(c8547i1.m16652a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        c7967l0.m15812m("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(c8547i1.m16652a()));
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final HashMap m8978n() {
        HashMap map = new HashMap();
        Iterator it = m8971e().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int iM8965b = (int) m8965b(new File(m8970d(), name), true);
            long jM8965b = m8965b(new File(new File(m8970d(), name), String.valueOf(iM8965b)), true);
            if (m8974j(name, iM8965b, jM8965b).exists()) {
                map.put(name, Long.valueOf(jM8965b));
            }
        }
        return map;
    }
}
