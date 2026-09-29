package p502y7;

import android.support.v4.media.session.C0166e;
import com.facebook.appevents.p050ml.ModelManager;
import com.google.android.exoplayer2.InterfaceC2532v;
import dm.C5207g;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mo.C7653a;
import org.json.JSONArray;
import org.json.JSONObject;
import p173i8.C6205a;
import p382s7.C8969b;
import p476x7.AsyncTaskC10108g;
import p479xa.C10144m;

/* JADX INFO: renamed from: y7.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10302c implements AsyncTaskC10108g.a, C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f51831a;

    public /* synthetic */ C10302c(List list) {
        this.f51831a = list;
    }

    @Override // p476x7.AsyncTaskC10108g.a
    /* JADX INFO: renamed from: a */
    public final void mo17198a(File file) {
        HashMap map;
        int i10;
        HashMap map2;
        C10301b c10301b;
        HashMap map3;
        List<ModelManager.C2297a> list = this.f51831a;
        C5207g.m11111f(list, "$slaves");
        C5207g.m11111f(file, "file");
        HashMap map4 = C10301b.f51818m;
        C10304e c10304e = C10304e.f51833a;
        if (C6205a.m12742b(C10304e.class)) {
            map = null;
            break;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int iAvailable = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[iAvailable];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (iAvailable >= 4) {
                int i11 = 0;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i12 = byteBufferWrap.getInt();
                int i13 = i12 + 4;
                if (iAvailable >= i13) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i12, C7653a.f42116b));
                    JSONArray jSONArrayNames = jSONObject.names();
                    int length = jSONArrayNames.length();
                    String[] strArr = new String[length];
                    int i14 = length - 1;
                    if (i14 >= 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            strArr[i15] = jSONArrayNames.getString(i15);
                            if (i16 > i14) {
                                break;
                            } else {
                                i15 = i16;
                            }
                        }
                    }
                    if (length > 1) {
                        Arrays.sort(strArr);
                    }
                    map = new HashMap();
                    int i17 = 0;
                    while (i11 < length) {
                        String str = strArr[i11];
                        i11++;
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i18 = length2 - 1;
                            if (i18 >= 0) {
                                i10 = 1;
                                while (true) {
                                    int i19 = i17 + 1;
                                    int i20 = jSONArray.getInt(i17);
                                    iArr[i17] = i20;
                                    i10 *= i20;
                                    if (i19 > i18) {
                                        break;
                                    } else {
                                        i17 = i19;
                                    }
                                }
                            } else {
                                i10 = 1;
                            }
                            int i21 = i10;
                            int i22 = i21 * 4;
                            int i23 = i13 + i22;
                            if (i23 <= iAvailable) {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i13, i22);
                                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                C10300a c10300a = new C10300a(iArr);
                                byteBufferWrap2.asFloatBuffer().get(c10300a.f51817c, 0, i21);
                                map.put(str, c10300a);
                                i13 = i23;
                                i17 = 0;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C6205a.m12741a(C10304e.class, th2);
        }
        map = null;
        break;
        if (map == null) {
            map2 = null;
            break;
        }
        map2 = new HashMap();
        if (C6205a.m12742b(C10301b.class)) {
            map3 = null;
        } else {
            try {
                map3 = C10301b.f51818m;
            } catch (Throwable th3) {
                C6205a.m12741a(C10301b.class, th3);
                map3 = null;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (map3.containsKey(entry.getKey()) && (str2 = (String) map3.get(entry.getKey())) == null) {
                map2 = null;
                break;
            }
            map2.put(str2, entry.getValue());
        }
        if (map2 == null) {
            c10301b = null;
        } else {
            try {
                c10301b = new C10301b(map2);
            } catch (Exception unused2) {
                c10301b = null;
            }
        }
        if (c10301b != null) {
            for (ModelManager.C2297a c2297a : list) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c2297a.f11529a);
                sb2.append('_');
                ModelManager.C2297a.a.m6658b(c2297a.f11531c, C0166e.m768o(sb2, c2297a.f11532d, "_rule"), new C8969b(c2297a, 1, c10301b));
            }
        }
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        ((InterfaceC2532v.c) obj).mo7500h0(this.f51831a);
    }
}
