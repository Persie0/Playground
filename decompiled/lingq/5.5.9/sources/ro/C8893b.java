package ro;

import android.content.Context;
import android.support.v4.media.session.C0166e;
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
import org.joda.time.p308tz.DateTimeZoneBuilder;
import org.joda.time.p308tz.InterfaceC8154c;

/* JADX INFO: renamed from: ro.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8893b implements InterfaceC8154c {

    /* JADX INFO: renamed from: a */
    public final Context f46779a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f46780b;

    public C8893b(Context context) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.f46779a = context.getApplicationContext();
        InputStream inputStreamM17125d = m17125d("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStreamM17125d);
        try {
            m17123e(dataInputStream, concurrentHashMap);
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.f43949a));
            this.f46780b = concurrentHashMap;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static void m17123e(DataInputStream dataInputStream, ConcurrentHashMap concurrentHashMap) throws IOException {
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
        if (str == null || (obj = this.f46780b.get(str)) == null) {
            return null;
        }
        if (str.equals(obj)) {
            return m17124c(str);
        }
        if (!(obj instanceof SoftReference)) {
            return mo16176a((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : m17124c(str);
    }

    @Override // org.joda.time.p308tz.InterfaceC8154c
    /* JADX INFO: renamed from: b */
    public final Set<String> mo16177b() {
        return new TreeSet(this.f46780b.keySet());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0039: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:16:0x0039 */
    /* JADX INFO: renamed from: c */
    public final DateTimeZone m17124c(String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        ConcurrentHashMap concurrentHashMap = this.f46780b;
        InputStream inputStream3 = null;
        try {
            try {
                InputStream inputStreamM17125d = m17125d(str);
                try {
                    DateTimeZone dateTimeZoneM16161a = inputStreamM17125d instanceof DataInput ? DateTimeZoneBuilder.m16161a((DataInput) inputStreamM17125d, str) : DateTimeZoneBuilder.m16161a(new DataInputStream(inputStreamM17125d), str);
                    concurrentHashMap.put(str, new SoftReference(dateTimeZoneM16161a));
                    if (inputStreamM17125d != 0) {
                        try {
                            inputStreamM17125d.close();
                        } catch (IOException unused) {
                        }
                    }
                    return dateTimeZoneM16161a;
                } catch (IOException e10) {
                    e = e10;
                    inputStream = inputStreamM17125d;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream3 != null) {
                inputStream3.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final InputStream m17125d(String str) throws IOException {
        Map concurrentHashMap;
        int iIntValue;
        Context context = this.f46779a;
        if (context == null) {
            throw new RuntimeException("Need to call JodaTimeAndroid.init() before using joda-time-android");
        }
        ConcurrentHashMap concurrentHashMap2 = C8892a.f46778a;
        StringBuilder sb2 = new StringBuilder("joda_");
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(file.getName());
            file = file.getParentFile();
        } while (file != null);
        StringBuffer stringBuffer = new StringBuffer();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.append("_");
            }
            stringBuffer.append((String) arrayList.get(size));
        }
        sb2.append(stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US));
        String string = sb2.toString();
        ConcurrentHashMap concurrentHashMap3 = C8892a.f46778a;
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
            } catch (Exception e10) {
                Log.e("JodaTimeAndroid", "Failed to retrieve identifier: type=" + R$raw.class + " name=" + string, e10);
                iIntValue = 0;
            }
        }
        if (iIntValue != 0) {
            return context.getResources().openRawResource(iIntValue);
        }
        throw new IOException(C0166e.m766l("Resource not found: \"", str, "\" (resName: \"", string, "\")"));
    }
}
