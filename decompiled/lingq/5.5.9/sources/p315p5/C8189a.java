package p315p5;

import android.annotation.TargetApi;
import android.os.StrictMode;
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
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: p5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8189a implements Closeable {

    /* JADX INFO: renamed from: a */
    public final File f44334a;

    /* JADX INFO: renamed from: b */
    public final File f44335b;

    /* JADX INFO: renamed from: c */
    public final File f44336c;

    /* JADX INFO: renamed from: d */
    public final File f44337d;

    /* JADX INFO: renamed from: f */
    public final long f44339f;

    /* JADX INFO: renamed from: i */
    public BufferedWriter f44342i;

    /* JADX INFO: renamed from: k */
    public int f44344k;

    /* JADX INFO: renamed from: h */
    public long f44341h = 0;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap<String, d> f44343j = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: l */
    public long f44345l = 0;

    /* JADX INFO: renamed from: H */
    public final ThreadPoolExecutor f44332H = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* JADX INFO: renamed from: I */
    public final a f44333I = new a();

    /* JADX INFO: renamed from: e */
    public final int f44338e = 1;

    /* JADX INFO: renamed from: g */
    public final int f44340g = 1;

    /* JADX INFO: renamed from: p5.a$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (C8189a.this) {
                C8189a c8189a = C8189a.this;
                if (c8189a.f44342i != null) {
                    c8189a.m16307m0();
                    if (C8189a.this.m16302C()) {
                        C8189a.this.m16306U();
                        C8189a.this.f44344k = 0;
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: p5.a$b */
    public static final class b implements ThreadFactory {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: renamed from: p5.a$c */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final d f44347a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f44348b;

        /* JADX INFO: renamed from: c */
        public boolean f44349c;

        public c(d dVar) {
            this.f44347a = dVar;
            this.f44348b = dVar.f44355e ? null : new boolean[C8189a.this.f44340g];
        }

        /* JADX INFO: renamed from: a */
        public final void m16310a() throws IOException {
            C8189a.m16297a(C8189a.this, this, false);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final File m16311b() throws IOException {
            File file;
            synchronized (C8189a.this) {
                d dVar = this.f44347a;
                if (dVar.f44356f != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f44355e) {
                    this.f44348b[0] = true;
                }
                file = dVar.f44354d[0];
                C8189a.this.f44334a.mkdirs();
            }
            return file;
        }
    }

    /* JADX INFO: renamed from: p5.a$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final String f44351a;

        /* JADX INFO: renamed from: b */
        public final long[] f44352b;

        /* JADX INFO: renamed from: c */
        public final File[] f44353c;

        /* JADX INFO: renamed from: d */
        public final File[] f44354d;

        /* JADX INFO: renamed from: e */
        public boolean f44355e;

        /* JADX INFO: renamed from: f */
        public c f44356f;

        public d(String str) {
            this.f44351a = str;
            int i10 = C8189a.this.f44340g;
            this.f44352b = new long[i10];
            this.f44353c = new File[i10];
            this.f44354d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < C8189a.this.f44340g; i11++) {
                sb2.append(i11);
                File[] fileArr = this.f44353c;
                String string = sb2.toString();
                File file = C8189a.this.f44334a;
                fileArr[i11] = new File(file, string);
                sb2.append(".tmp");
                this.f44354d[i11] = new File(file, sb2.toString());
                sb2.setLength(length);
            }
        }

        /* JADX INFO: renamed from: a */
        public final String m16312a() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f44352b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: p5.a$e */
    public final class e {

        /* JADX INFO: renamed from: a */
        public final File[] f44358a;

        public e(File[] fileArr) {
            this.f44358a = fileArr;
        }
    }

    public C8189a(File file, long j10) {
        this.f44334a = file;
        this.f44335b = new File(file, "journal");
        this.f44336c = new File(file, "journal.tmp");
        this.f44337d = new File(file, "journal.bkp");
        this.f44339f = j10;
    }

    /* JADX INFO: renamed from: E */
    public static C8189a m16296E(File file, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m16299d0(file2, file3, false);
            }
        }
        C8189a c8189a = new C8189a(file, j10);
        if (c8189a.f44335b.exists()) {
            try {
                c8189a.m16304H();
                c8189a.m16303G();
                return c8189a;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c8189a.close();
                C8191c.m16314a(c8189a.f44334a);
            }
        }
        file.mkdirs();
        C8189a c8189a2 = new C8189a(file, j10);
        c8189a2.m16306U();
        return c8189a2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m16297a(C8189a c8189a, c cVar, boolean z10) throws IOException {
        synchronized (c8189a) {
            d dVar = cVar.f44347a;
            if (dVar.f44356f != cVar) {
                throw new IllegalStateException();
            }
            if (z10 && !dVar.f44355e) {
                for (int i10 = 0; i10 < c8189a.f44340g; i10++) {
                    if (!cVar.f44348b[i10]) {
                        cVar.m16310a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!dVar.f44354d[i10].exists()) {
                        cVar.m16310a();
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < c8189a.f44340g; i11++) {
                File file = dVar.f44354d[i11];
                if (z10) {
                    if (file.exists()) {
                        File file2 = dVar.f44353c[i11];
                        file.renameTo(file2);
                        long j10 = dVar.f44352b[i11];
                        long length = file2.length();
                        dVar.f44352b[i11] = length;
                        c8189a.f44341h = (c8189a.f44341h - j10) + length;
                    }
                } else {
                    m16300l(file);
                }
            }
            c8189a.f44344k++;
            dVar.f44356f = null;
            if (dVar.f44355e || z10) {
                dVar.f44355e = true;
                c8189a.f44342i.append((CharSequence) "CLEAN");
                c8189a.f44342i.append(' ');
                c8189a.f44342i.append((CharSequence) dVar.f44351a);
                c8189a.f44342i.append((CharSequence) dVar.m16312a());
                c8189a.f44342i.append('\n');
                if (z10) {
                    c8189a.f44345l++;
                    dVar.getClass();
                }
            } else {
                c8189a.f44343j.remove(dVar.f44351a);
                c8189a.f44342i.append((CharSequence) "REMOVE");
                c8189a.f44342i.append(' ');
                c8189a.f44342i.append((CharSequence) dVar.f44351a);
                c8189a.f44342i.append('\n');
            }
            m16301r(c8189a.f44342i);
            if (c8189a.f44341h > c8189a.f44339f || c8189a.m16302C()) {
                c8189a.f44332H.submit(c8189a.f44333I);
            }
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: b */
    public static void m16298b(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d0 */
    public static void m16299d0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            m16300l(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m16300l(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: r */
    public static void m16301r(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m16302C() {
        int i10 = this.f44344k;
        return i10 >= 2000 && i10 >= this.f44343j.size();
    }

    /* JADX INFO: renamed from: G */
    public final void m16303G() throws IOException {
        m16300l(this.f44336c);
        Iterator<d> it = this.f44343j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f44356f;
            int i10 = this.f44340g;
            int i11 = 0;
            if (cVar == null) {
                while (i11 < i10) {
                    this.f44341h += next.f44352b[i11];
                    i11++;
                }
            } else {
                next.f44356f = null;
                while (i11 < i10) {
                    m16300l(next.f44353c[i11]);
                    m16300l(next.f44354d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: H */
    public final void m16304H() throws IOException {
        File file = this.f44335b;
        C8190b c8190b = new C8190b(new FileInputStream(file), C8191c.f44365a);
        try {
            String strM16313a = c8190b.m16313a();
            String strM16313a2 = c8190b.m16313a();
            String strM16313a3 = c8190b.m16313a();
            String strM16313a4 = c8190b.m16313a();
            String strM16313a5 = c8190b.m16313a();
            if (!"libcore.io.DiskLruCache".equals(strM16313a) || !"1".equals(strM16313a2) || !Integer.toString(this.f44338e).equals(strM16313a3) || !Integer.toString(this.f44340g).equals(strM16313a4) || !"".equals(strM16313a5)) {
                throw new IOException("unexpected journal header: [" + strM16313a + ", " + strM16313a2 + ", " + strM16313a4 + ", " + strM16313a5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    m16305Q(c8190b.m16313a());
                    i10++;
                } catch (EOFException unused) {
                    this.f44344k = i10 - this.f44343j.size();
                    if (c8190b.f44363e == -1) {
                        m16306U();
                    } else {
                        this.f44342i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), C8191c.f44365a));
                    }
                    try {
                        c8190b.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                c8190b.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: Q */
    public final void m16305Q(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        LinkedHashMap<String, d> linkedHashMap = this.f44343j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f44356f = new c(dVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f44355e = true;
        dVar.f44356f = null;
        if (strArrSplit.length != C8189a.this.f44340g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                dVar.f44352b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final synchronized void m16306U() throws IOException {
        try {
            BufferedWriter bufferedWriter = this.f44342i;
            if (bufferedWriter != null) {
                m16298b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f44336c), C8191c.f44365a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f44338e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f44340g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.f44343j.values()) {
                    if (dVar.f44356f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.f44351a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.f44351a + dVar.m16312a() + '\n');
                    }
                }
                m16298b(bufferedWriter2);
                if (this.f44335b.exists()) {
                    m16299d0(this.f44335b, this.f44337d, true);
                }
                m16299d0(this.f44336c, this.f44335b, false);
                this.f44337d.delete();
                this.f44342i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f44335b, true), C8191c.f44365a));
            } catch (Throwable th2) {
                m16298b(bufferedWriter2);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.f44342i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f44343j.values()).iterator();
            while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        m16307m0();
                        m16298b(this.f44342i);
                        this.f44342i = null;
                        return;
                    } else {
                        c cVar = ((d) it.next()).f44356f;
                        if (cVar != null) {
                            cVar.m16310a();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m16307m0() throws IOException {
        while (this.f44341h > this.f44339f) {
            String key = this.f44343j.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f44342i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.f44343j.get(key);
                if (dVar != null && dVar.f44356f == null) {
                    for (int i10 = 0; i10 < this.f44340g; i10++) {
                        File file = dVar.f44353c[i10];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j10 = this.f44341h;
                        long[] jArr = dVar.f44352b;
                        this.f44341h = j10 - jArr[i10];
                        jArr[i10] = 0;
                    }
                    this.f44344k++;
                    this.f44342i.append((CharSequence) "REMOVE");
                    this.f44342i.append(' ');
                    this.f44342i.append((CharSequence) key);
                    this.f44342i.append('\n');
                    this.f44343j.remove(key);
                    if (m16302C()) {
                        this.f44332H.submit(this.f44333I);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final c m16308q(String str) throws IOException {
        synchronized (this) {
            try {
                if (this.f44342i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.f44343j.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.f44343j.put(str, dVar);
                } else if (dVar.f44356f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f44356f = cVar;
                this.f44342i.append((CharSequence) "DIRTY");
                this.f44342i.append(' ');
                this.f44342i.append((CharSequence) str);
                this.f44342i.append('\n');
                m16301r(this.f44342i);
                return cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final synchronized e m16309w(String str) throws IOException {
        if (this.f44342i == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.f44343j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f44355e) {
            return null;
        }
        for (File file : dVar.f44353c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f44344k++;
        this.f44342i.append((CharSequence) "READ");
        this.f44342i.append(' ');
        this.f44342i.append((CharSequence) str);
        this.f44342i.append('\n');
        if (m16302C()) {
            this.f44332H.submit(this.f44333I);
        }
        return new e(dVar.f44353c);
    }
}
