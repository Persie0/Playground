package p000;

import android.content.Context;
import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import net.danlew.android.joda.R$raw;
import org.joda.time.DateTimeZone;
import org.joda.time.p022tz.AbstractC3433a;

/* JADX INFO: loaded from: classes.dex */
public final class c88 implements to7 {

    /* JADX INFO: renamed from: a */
    public final Context f9717a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f9718b;

    public c88(Context context) throws IOException {
        if (context == null) {
            C3386nv.m17626m("Context must not be null");
            throw null;
        }
        this.f9717a = context.getApplicationContext();
        InputStream inputStreamM4401d = m4401d("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStreamM4401d);
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
                    this.f9718b = concurrentHashMap;
                }
            }
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.f54829a));
            this.f9718b = concurrentHashMap;
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
        if (str == null || (obj = this.f9718b.get(str)) == null) {
            return null;
        }
        if (str.equals(obj)) {
            return m4400c(str);
        }
        if (!(obj instanceof SoftReference)) {
            return mo3686a((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : m4400c(str);
    }

    @Override // p000.to7
    /* JADX INFO: renamed from: b */
    public final Set mo3687b() {
        return new TreeSet(this.f9718b.keySet());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX INFO: renamed from: c */
    public final DateTimeZone m4400c(String str) throws Throwable {
        ?? M4401d;
        ConcurrentHashMap concurrentHashMap = this.f9718b;
        ?? r1 = 0;
        try {
            try {
                M4401d = m4401d(str);
                try {
                    DateTimeZone dateTimeZoneM18456a = M4401d instanceof DataInput ? AbstractC3433a.m18456a((DataInput) M4401d, str) : AbstractC3433a.m18456a(new DataInputStream(M4401d), str);
                    concurrentHashMap.put(str, new SoftReference(dateTimeZoneM18456a));
                    if (M4401d != 0) {
                        try {
                            M4401d.close();
                        } catch (IOException unused) {
                        }
                    }
                    return dateTimeZoneM18456a;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (M4401d != 0) {
                        try {
                            M4401d.close();
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
            M4401d = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final InputStream m4401d(String str) throws IOException {
        Map concurrentHashMap;
        int iIntValue;
        Context context = this.f9717a;
        if (context == null) {
            ho2.m13385e("Need to call JodaTimeAndroid.init() before using joda-time-android");
            return null;
        }
        ConcurrentHashMap concurrentHashMap2 = o78.f53942a;
        StringBuilder sb = new StringBuilder("joda_");
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(file.getName());
            file = file.getParentFile();
        } while (file != null);
        StringBuffer stringBuffer = new StringBuffer();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("_");
            }
            stringBuffer.append((String) arrayList.get(size));
        }
        sb.append(stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US));
        String string = sb.toString();
        ConcurrentHashMap concurrentHashMap3 = o78.f53942a;
        if (concurrentHashMap3.containsKey(R$raw.class)) {
            concurrentHashMap = (Map) concurrentHashMap3.get(R$raw.class);
        } else {
            concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap3.put(R$raw.class, concurrentHashMap);
        }
        if (concurrentHashMap.containsKey(string)) {
            iIntValue = ((Integer) concurrentHashMap.get(string)).intValue();
        } else {
            try {
                iIntValue = R$raw.class.getField(string).getInt(null);
                if (iIntValue != 0) {
                    concurrentHashMap.put(string, Integer.valueOf(iIntValue));
                }
            } catch (Exception e) {
                Log.e("JodaTimeAndroid", "Failed to retrieve identifier: type=" + R$raw.class + " name=" + string, e);
                iIntValue = 0;
            }
        }
        if (iIntValue != 0) {
            return context.getResources().openRawResource(iIntValue);
        }
        v63.m23133k(ux5.m22991n("Resource not found: \"", str, "\" (resName: \"", string, "\")"));
        return null;
    }
}
