package p000;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;
import org.joda.time.p022tz.AbstractC3433a;

/* JADX INFO: loaded from: classes2.dex */
public final class dcb implements to7 {

    /* JADX INFO: renamed from: a */
    public final File f35410a;

    /* JADX INFO: renamed from: b */
    public final String f35411b;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f35412c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f35413d;

    /* JADX INFO: renamed from: e */
    public final SortedSet f35414e;

    public dcb(File file) throws IOException {
        if (!file.exists()) {
            uk9.m22774h(file, "File directory doesn't exist: ");
            throw null;
        }
        if (!file.isDirectory()) {
            uk9.m22774h(file, "File doesn't refer to a directory: ");
            throw null;
        }
        this.f35410a = file;
        this.f35411b = null;
        this.f35412c = null;
        ConcurrentHashMap concurrentHashMapM10284d = m10284d(m10286e("ZoneInfoMap"));
        this.f35413d = concurrentHashMapM10284d;
        this.f35414e = Collections.unmodifiableSortedSet(new TreeSet(concurrentHashMapM10284d.keySet()));
    }

    /* JADX INFO: renamed from: d */
    public static ConcurrentHashMap m10284d(InputStream inputStream) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            int unsignedShort = dataInputStream.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i = 0; i < unsignedShort; i++) {
                strArr[i] = dataInputStream.readUTF().intern();
            }
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            for (int i2 = 0; i2 < unsignedShort2; i2++) {
                try {
                    concurrentHashMap.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    v63.m23133k("Corrupt zone info map");
                    dataInputStream.close();
                    concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.f54829a));
                    return concurrentHashMap;
                }
            }
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.f54829a));
            return concurrentHashMap;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    @Override // p000.to7
    /* JADX INFO: renamed from: a */
    public final DateTimeZone mo3686a(String str) {
        Object obj;
        if (str == null || (obj = this.f35413d.get(str)) == null) {
            return null;
        }
        if (!(obj instanceof SoftReference)) {
            return str.equals(obj) ? m10285c(str) : mo3686a((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : m10285c(str);
    }

    @Override // p000.to7
    /* JADX INFO: renamed from: b */
    public final Set mo3687b() {
        return this.f35414e;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX INFO: renamed from: c */
    public final DateTimeZone m10285c(String str) throws Throwable {
        ?? M10286e;
        ConcurrentHashMap concurrentHashMap = this.f35413d;
        ?? r1 = 0;
        try {
            try {
                M10286e = m10286e(str);
                try {
                    DateTimeZone dateTimeZoneM18456a = M10286e instanceof DataInput ? AbstractC3433a.m18456a((DataInput) M10286e, str) : AbstractC3433a.m18456a(new DataInputStream(M10286e), str);
                    concurrentHashMap.put(str, new SoftReference(dateTimeZoneM18456a));
                    try {
                        M10286e.close();
                    } catch (IOException unused) {
                    }
                    return dateTimeZoneM18456a;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (M10286e != 0) {
                        try {
                            M10286e.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r1 = this;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            M10286e = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final InputStream m10286e(String str) throws IOException {
        File file = this.f35410a;
        if (file != null) {
            return new FileInputStream(new File(file, str));
        }
        String strConcat = this.f35411b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new ccb(this, strConcat));
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(strConcat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader = this.f35412c;
        sb.append(classLoader != null ? classLoader.toString() : "system");
        throw new IOException(sb.toString());
    }

    public dcb() {
        String strConcat = "org/joda/time/tz/data".concat("/");
        this.f35410a = null;
        this.f35411b = strConcat;
        this.f35412c = dcb.class.getClassLoader();
        ConcurrentHashMap concurrentHashMapM10284d = m10284d(m10286e("ZoneInfoMap"));
        this.f35413d = concurrentHashMapM10284d;
        this.f35414e = Collections.unmodifiableSortedSet(new TreeSet(concurrentHashMapM10284d.keySet()));
    }
}
