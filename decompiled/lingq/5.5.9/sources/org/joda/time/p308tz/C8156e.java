package org.joda.time.p308tz;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;

/* JADX INFO: renamed from: org.joda.time.tz.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8156e implements InterfaceC8154c {

    /* JADX INFO: renamed from: a */
    public final File f44264a;

    /* JADX INFO: renamed from: b */
    public final String f44265b;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f44266c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f44267d;

    /* JADX INFO: renamed from: e */
    public final SortedSet f44268e;

    /* JADX INFO: renamed from: org.joda.time.tz.e$a */
    public class a implements PrivilegedAction<InputStream> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f44269a;

        public a(String str) {
            this.f44269a = str;
        }

        @Override // java.security.PrivilegedAction
        public final InputStream run() {
            ClassLoader classLoader = C8156e.this.f44266c;
            String str = this.f44269a;
            return classLoader != null ? classLoader.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
        }
    }

    public C8156e() throws IOException {
        String strConcat = "org/joda/time/tz/data".concat("/");
        this.f44264a = null;
        this.f44265b = strConcat;
        this.f44266c = C8156e.class.getClassLoader();
        ConcurrentHashMap concurrentHashMapM16178d = m16178d(m16181e("ZoneInfoMap"));
        this.f44267d = concurrentHashMapM16178d;
        this.f44268e = Collections.unmodifiableSortedSet(new TreeSet(concurrentHashMapM16178d.keySet()));
    }

    public C8156e(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("File directory doesn't exist: " + file);
        }
        if (!file.isDirectory()) {
            throw new IOException("File doesn't refer to a directory: " + file);
        }
        this.f44264a = file;
        this.f44265b = null;
        this.f44266c = null;
        ConcurrentHashMap concurrentHashMapM16178d = m16178d(m16181e("ZoneInfoMap"));
        this.f44267d = concurrentHashMapM16178d;
        this.f44268e = Collections.unmodifiableSortedSet(new TreeSet(concurrentHashMapM16178d.keySet()));
    }

    /* JADX INFO: renamed from: d */
    public static ConcurrentHashMap m16178d(InputStream inputStream) throws IOException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            m16179f(dataInputStream, concurrentHashMap);
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.f43949a));
            return concurrentHashMap;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m16179f(DataInputStream dataInputStream, ConcurrentHashMap concurrentHashMap) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        for (int i10 = 0; i10 < unsignedShort; i10++) {
            strArr[i10] = dataInputStream.readUTF().intern();
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i11 = 0; i11 < unsignedShort2; i11++) {
            try {
                concurrentHashMap.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    @Override // org.joda.time.p308tz.InterfaceC8154c
    /* JADX INFO: renamed from: a */
    public final DateTimeZone mo16176a(String str) {
        Object obj;
        if (str != null && (obj = this.f44267d.get(str)) != null) {
            if (!(obj instanceof SoftReference)) {
                return str.equals(obj) ? m16180c(str) : mo16176a((String) obj);
            }
            DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
            return dateTimeZone != null ? dateTimeZone : m16180c(str);
        }
        return null;
    }

    @Override // org.joda.time.p308tz.InterfaceC8154c
    /* JADX INFO: renamed from: b */
    public final Set<String> mo16177b() {
        return this.f44268e;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final DateTimeZone m16180c(String str) throws Throwable {
        ?? M16181e;
        ConcurrentHashMap concurrentHashMap = this.f44267d;
        ?? r10 = 0;
        try {
            M16181e = m16181e(str);
            try {
                try {
                    DateTimeZone dateTimeZoneM16161a = M16181e instanceof DataInput ? DateTimeZoneBuilder.m16161a((DataInput) M16181e, str) : DateTimeZoneBuilder.m16161a(new DataInputStream(M16181e), str);
                    concurrentHashMap.put(str, new SoftReference(dateTimeZoneM16161a));
                    try {
                        M16181e.close();
                    } catch (IOException unused) {
                    }
                    return dateTimeZoneM16161a;
                } catch (IOException e10) {
                    e = e10;
                    M16181e = M16181e;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (M16181e != 0) {
                        try {
                            M16181e.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = M16181e;
                if (r10 != 0) {
                    try {
                        r10.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            M16181e = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final InputStream m16181e(String str) throws IOException {
        File file = this.f44264a;
        if (file != null) {
            return new FileInputStream(new File(file, str));
        }
        String strConcat = this.f44265b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new a(strConcat));
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Resource not found: \"");
        sb2.append(strConcat);
        sb2.append("\" ClassLoader: ");
        ClassLoader classLoader = this.f44266c;
        sb2.append(classLoader != null ? classLoader.toString() : "system");
        throw new IOException(sb2.toString());
    }
}
