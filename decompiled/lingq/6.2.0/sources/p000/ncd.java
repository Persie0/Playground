package p000;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ncd {
    /* JADX INFO: renamed from: a */
    public static final void m17374a() {
        File[] fileArrListFiles;
        sy2 sy2Var = sy2.f61585a;
        if (!ema.m11256c() || bna.m3941b0()) {
            return;
        }
        File fileM22058q = thb.m22058q();
        if (fileM22058q == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileM22058q.listFiles(new jt2(0));
            fileArrListFiles.getClass();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            file.getClass();
            it2 it2Var = new it2();
            String name = file.getName();
            name.getClass();
            it2Var.f44526a = name;
            JSONObject jSONObjectM22067z = thb.m22067z(name);
            if (jSONObjectM22067z != null) {
                it2Var.f44528c = Long.valueOf(jSONObjectM22067z.optLong("timestamp", 0L));
                it2Var.f44527b = jSONObjectM22067z.optString("error_message", null);
            }
            if (it2Var.f44527b != null && it2Var.f44528c != null) {
                arrayList.add(it2Var);
            }
        }
        x91.m24414t0(arrayList, new C3166k(11));
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        thb.m22037B("error_reports", jSONArray, new C3280l(arrayList, 2));
    }

    /* JADX INFO: renamed from: b */
    public static final int m17375b(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }
}
