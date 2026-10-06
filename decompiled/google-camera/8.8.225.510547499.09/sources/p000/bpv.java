package p000;

import android.os.StrictMode;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bpv implements Closeable {

    /* JADX INFO: renamed from: a */
    public final File f4110a;

    /* JADX INFO: renamed from: c */
    public Writer f4112c;

    /* JADX INFO: renamed from: d */
    public int f4113d;

    /* JADX INFO: renamed from: f */
    private final File f4115f;

    /* JADX INFO: renamed from: g */
    private final File f4116g;

    /* JADX INFO: renamed from: h */
    private final File f4117h;

    /* JADX INFO: renamed from: j */
    private final long f4119j;

    /* JADX INFO: renamed from: k */
    private long f4120k = 0;

    /* JADX INFO: renamed from: l */
    private final LinkedHashMap f4121l = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: m */
    private long f4122m = 0;

    /* JADX INFO: renamed from: e */
    final ThreadPoolExecutor f4114e = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bps());

    /* JADX INFO: renamed from: n */
    private final Callable f4123n = new bpr(this, 0);

    /* JADX INFO: renamed from: i */
    private final int f4118i = 1;

    /* JADX INFO: renamed from: b */
    public final int f4111b = 1;

    private bpv(File file, long j) {
        this.f4110a = file;
        this.f4115f = new File(file, "journal");
        this.f4116g = new File(file, "journal.tmp");
        this.f4117h = new File(file, "journal.bkp");
        this.f4119j = j;
    }

    /* JADX INFO: renamed from: f */
    public static bpv m2885f(File file, long j) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m2891n(file2, file3, false);
            }
        }
        bpv bpvVar = new bpv(file, j);
        if (bpvVar.f4115f.exists()) {
            try {
                bpvVar.m2890m();
                m2888k(bpvVar.f4116g);
                Iterator it = bpvVar.f4121l.values().iterator();
                while (it.hasNext()) {
                    bpu bpuVar = (bpu) it.next();
                    if (bpuVar.f4108f == null) {
                        for (int i = 0; i < bpvVar.f4111b; i = 1) {
                            bpvVar.f4120k += bpuVar.f4104b[0];
                        }
                    } else {
                        bpuVar.f4108f = null;
                        for (int i2 = 0; i2 < bpvVar.f4111b; i2 = 1) {
                            m2888k(bpuVar.m2883c());
                            m2888k(bpuVar.m2884d());
                        }
                        it.remove();
                    }
                }
                return bpvVar;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                bpvVar.close();
                bpy.m2902b(bpvVar.f4110a);
            }
        }
        file.mkdirs();
        bpv bpvVar2 = new bpv(file, j);
        bpvVar2.m2893b();
        return bpvVar2;
    }

    /* JADX INFO: renamed from: i */
    private final void m2886i() {
        if (this.f4112c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m2887j(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m2888k(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: l */
    private static void m2889l(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    private final void m2890m() {
        String strSubstring;
        bpx bpxVar = new bpx(new FileInputStream(this.f4115f), bpy.f4130a);
        try {
            String strM2900a = bpxVar.m2900a();
            String strM2900a2 = bpxVar.m2900a();
            String strM2900a3 = bpxVar.m2900a();
            String strM2900a4 = bpxVar.m2900a();
            String strM2900a5 = bpxVar.m2900a();
            if (!"libcore.io.DiskLruCache".equals(strM2900a) || !"1".equals(strM2900a2) || !Integer.toString(this.f4118i).equals(strM2900a3) || !Integer.toString(this.f4111b).equals(strM2900a4) || !"".equals(strM2900a5)) {
                throw new IOException("unexpected journal header: [" + strM2900a + ", " + strM2900a2 + ", " + strM2900a4 + ", " + strM2900a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    String strM2900a6 = bpxVar.m2900a();
                    int iIndexOf = strM2900a6.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(strM2900a6)));
                    }
                    int i2 = iIndexOf + 1;
                    int iIndexOf2 = strM2900a6.indexOf(32, i2);
                    if (iIndexOf2 == -1) {
                        strSubstring = strM2900a6.substring(i2);
                        if (iIndexOf == 6) {
                            if (strM2900a6.startsWith("REMOVE")) {
                                this.f4121l.remove(strSubstring);
                            } else {
                                iIndexOf = 6;
                            }
                        }
                        i++;
                    } else {
                        strSubstring = strM2900a6.substring(i2, iIndexOf2);
                    }
                    bpu bpuVar = (bpu) this.f4121l.get(strSubstring);
                    if (bpuVar == null) {
                        bpuVar = new bpu(this, strSubstring);
                        this.f4121l.put(strSubstring, bpuVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5) {
                        if (!strM2900a6.startsWith("CLEAN")) {
                            iIndexOf = 5;
                            if (iIndexOf2 != -1) {
                                if (iIndexOf2 == -1) {
                                }
                                throw new IOException("unexpected journal line: ".concat(String.valueOf(strM2900a6)));
                            }
                            if (iIndexOf2 == -1) {
                            }
                            throw new IOException("unexpected journal line: ".concat(String.valueOf(strM2900a6)));
                        }
                        String[] strArrSplit = strM2900a6.substring(iIndexOf2 + 1).split(HRLmc.ASHLcOgc);
                        bpuVar.f4107e = true;
                        bpuVar.f4108f = null;
                        if (strArrSplit.length != bpuVar.f4109g.f4111b) {
                            throw bpu.m2881e(strArrSplit);
                        }
                        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                            try {
                                bpuVar.f4104b[i3] = Long.parseLong(strArrSplit[i3]);
                            } catch (NumberFormatException e) {
                                throw bpu.m2881e(strArrSplit);
                            }
                        }
                    } else if (iIndexOf2 != -1 && iIndexOf == 5 && strM2900a6.startsWith("DIRTY")) {
                        bpuVar.f4108f = new bpt(this, bpuVar);
                    } else if (iIndexOf2 == -1 || iIndexOf != 4 || !strM2900a6.startsWith("READ")) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(strM2900a6)));
                    }
                    i++;
                } catch (EOFException e2) {
                    this.f4113d = i - this.f4121l.size();
                    if (bpxVar.f4126b == -1) {
                        m2893b();
                    } else {
                        this.f4112c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4115f, true), bpy.f4130a));
                    }
                    bpy.m2901a(bpxVar);
                    return;
                }
            }
        } catch (Throwable th) {
            bpy.m2901a(bpxVar);
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m2891n(File file, File file2, boolean z) throws IOException {
        if (z) {
            m2888k(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2892a(bpt bptVar, boolean z) {
        int i;
        bpu bpuVar = bptVar.f4099a;
        if (bpuVar.f4108f != bptVar) {
            throw new IllegalStateException();
        }
        if (!z || bpuVar.f4107e) {
            i = 0;
        } else {
            for (int i2 = 0; i2 < this.f4111b; i2 = 1) {
                if (!bptVar.f4100b[0]) {
                    bptVar.m2876a();
                    throw new IllegalStateException(PMZiHihxLGEy.IzSrAmN);
                }
                if (!bpuVar.m2884d().exists()) {
                    bptVar.m2876a();
                    return;
                }
            }
            i = 0;
        }
        while (i < this.f4111b) {
            File fileM2884d = bpuVar.m2884d();
            if (z) {
                if (fileM2884d.exists()) {
                    File fileM2883c = bpuVar.m2883c();
                    fileM2884d.renameTo(fileM2883c);
                    long j = bpuVar.f4104b[0];
                    long length = fileM2883c.length();
                    bpuVar.f4104b[0] = length;
                    this.f4120k = (this.f4120k - j) + length;
                }
                i = 1;
            } else {
                m2888k(fileM2884d);
                i = 1;
            }
        }
        this.f4113d++;
        bpuVar.f4108f = null;
        if (bpuVar.f4107e || z) {
            bpuVar.f4107e = true;
            this.f4112c.append((CharSequence) "CLEAN");
            this.f4112c.append(' ');
            this.f4112c.append((CharSequence) bpuVar.f4103a);
            this.f4112c.append((CharSequence) bpuVar.m2882a());
            this.f4112c.append('\n');
            if (z) {
                this.f4122m++;
            }
        } else {
            this.f4121l.remove(bpuVar.f4103a);
            this.f4112c.append((CharSequence) "REMOVE");
            this.f4112c.append(' ');
            this.f4112c.append((CharSequence) bpuVar.f4103a);
            this.f4112c.append('\n');
        }
        m2889l(this.f4112c);
        if (this.f4120k > this.f4119j || m2895d()) {
            this.f4114e.submit(this.f4123n);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2893b() {
        try {
            Writer writer = this.f4112c;
            if (writer != null) {
                m2887j(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4116g), bpy.f4130a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f4118i));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f4111b));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (bpu bpuVar : this.f4121l.values()) {
                    if (bpuVar.f4108f != null) {
                        bufferedWriter.write(zuAgeeF.eXF + bpuVar.f4103a + "\n");
                    } else {
                        bufferedWriter.write("CLEAN " + bpuVar.f4103a + bpuVar.m2882a() + "\n");
                    }
                }
                m2887j(bufferedWriter);
                if (this.f4115f.exists()) {
                    m2891n(this.f4115f, this.f4117h, true);
                }
                m2891n(this.f4116g, this.f4115f, false);
                this.f4117h.delete();
                this.f4112c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4115f, true), bpy.f4130a));
            } catch (Throwable th) {
                m2887j(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2894c() {
        while (this.f4120k > this.f4119j) {
            m2897g((String) ((Map.Entry) this.f4121l.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4112c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f4121l.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bpt bptVar = ((bpu) arrayList.get(i)).f4108f;
            if (bptVar != null) {
                bptVar.m2876a();
            }
        }
        m2894c();
        m2887j(this.f4112c);
        this.f4112c = null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2895d() {
        int i = this.f4113d;
        return i >= 2000 && i >= this.f4121l.size();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized bpt m2896e(String str) {
        m2886i();
        bpu bpuVar = (bpu) this.f4121l.get(str);
        if (bpuVar == null) {
            bpuVar = new bpu(this, str);
            this.f4121l.put(str, bpuVar);
        } else if (bpuVar.f4108f != null) {
            return null;
        }
        bpt bptVar = new bpt(this, bpuVar);
        bpuVar.f4108f = bptVar;
        this.f4112c.append((CharSequence) "DIRTY");
        this.f4112c.append(' ');
        this.f4112c.append((CharSequence) str);
        this.f4112c.append('\n');
        m2889l(this.f4112c);
        return bptVar;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m2897g(String str) {
        m2886i();
        bpu bpuVar = (bpu) this.f4121l.get(str);
        if (bpuVar == null || bpuVar.f4108f != null) {
            return;
        }
        for (int i = 0; i < this.f4111b; i = 1) {
            File fileM2883c = bpuVar.m2883c();
            if (fileM2883c.exists() && !fileM2883c.delete()) {
                throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(fileM2883c))));
            }
            long j = this.f4120k;
            long[] jArr = bpuVar.f4104b;
            this.f4120k = j - jArr[0];
            jArr[0] = 0;
        }
        this.f4113d++;
        this.f4112c.append((CharSequence) "REMOVE");
        this.f4112c.append(' ');
        this.f4112c.append((CharSequence) str);
        this.f4112c.append('\n');
        this.f4121l.remove(str);
        if (m2895d()) {
            this.f4114e.submit(this.f4123n);
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized bkn m2898h(String str) {
        m2886i();
        bpu bpuVar = (bpu) this.f4121l.get(str);
        if (bpuVar != null && bpuVar.f4107e) {
            File[] fileArr = bpuVar.f4105c;
            int length = fileArr.length;
            for (int i = 0; i < length; i = 1) {
                if (!fileArr[0].exists()) {
                    return null;
                }
            }
            this.f4113d++;
            this.f4112c.append((CharSequence) VzWFSVj.ttlmlXNEMutJw);
            this.f4112c.append(' ');
            this.f4112c.append((CharSequence) str);
            this.f4112c.append('\n');
            if (m2895d()) {
                this.f4114e.submit(this.f4123n);
            }
            return new bkn(bpuVar.f4105c);
        }
        return null;
    }
}
