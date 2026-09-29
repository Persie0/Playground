package p066d7;

import android.content.Context;
import android.text.TextUtils;
import androidx.activity.result.C0204c;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: renamed from: d7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5050b {

    /* JADX INFO: renamed from: a */
    public final CleverTapInstanceConfig f32896a;

    /* JADX INFO: renamed from: b */
    public final Context f32897b;

    public C5050b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f32897b = context;
        this.f32896a = cleverTapInstanceConfig;
    }

    /* JADX INFO: renamed from: a */
    public final void m10727a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            synchronized (C5050b.class) {
                try {
                    File file = new File(this.f32897b.getFilesDir(), str);
                    if (file.exists()) {
                        if (file.delete()) {
                            C2181a c2181aM6433b = this.f32896a.m6433b();
                            c2181aM6433b.getClass();
                            C2181a.m6460m(this.f32896a.f10995a, "File Deleted:" + str);
                        } else {
                            C2181a c2181aM6433b2 = this.f32896a.m6433b();
                            c2181aM6433b2.getClass();
                            C2181a.m6460m(this.f32896a.f10995a, "Failed to delete file" + str);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            C2181a c2181aM6433b3 = this.f32896a.m6433b();
            String str2 = this.f32896a.f10995a;
            StringBuilder sbM854m = C0204c.m854m("writeFileOnInternalStorage: failed", str, " Error:");
            sbM854m.append(e10.getLocalizedMessage());
            String string = sbM854m.toString();
            c2181aM6433b3.getClass();
            C2181a.m6460m(str2, string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: b */
    public final String m10728b(String str) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        Exception e10;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f32896a;
        ?? r10 = 0;
        try {
            try {
                str = new FileInputStream(new File(this.f32897b.getFilesDir() + "/" + ((String) str)));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    inputStreamReader = new InputStreamReader(str);
                    try {
                        bufferedReader2 = new BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    str.close();
                                    String string = sb2.toString();
                                    str.close();
                                    inputStreamReader.close();
                                    bufferedReader2.close();
                                    return string;
                                }
                                sb2.append(line);
                            } catch (Exception e11) {
                                e10 = e11;
                                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                                String str2 = cleverTapInstanceConfig.f10995a;
                                String str3 = "[Exception While Reading: " + e10.getLocalizedMessage();
                                c2181aM6433b.getClass();
                                C2181a.m6460m(str2, str3);
                                if (str != 0) {
                                    str.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (bufferedReader2 != null) {
                                    bufferedReader2.close();
                                }
                                return "";
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        bufferedReader2 = null;
                        e10 = e;
                        C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
                        String str4 = cleverTapInstanceConfig.f10995a;
                        String str5 = "[Exception While Reading: " + e10.getLocalizedMessage();
                        c2181aM6433b2.getClass();
                        C2181a.m6460m(str4, str5);
                        if (str != 0) {
                            str.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = null;
                        r10 = str;
                        th = th;
                        if (r10 != 0) {
                            r10.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    inputStreamReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                    bufferedReader = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e14) {
            inputStreamReader = null;
            bufferedReader2 = null;
            e10 = e14;
            str = 0;
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = null;
            bufferedReader = null;
            if (r10 != 0) {
                r10.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005e */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10729c(String str, String str2, JSONObject jSONObject) throws IOException {
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        synchronized (C5050b.class) {
                            try {
                                File file = new File(this.f32897b.getFilesDir(), str);
                                if (file.exists() || file.mkdir()) {
                                    FileWriter fileWriter2 = new FileWriter(new File(file, str2), false);
                                    try {
                                        fileWriter2.append((CharSequence) jSONObject.toString());
                                        fileWriter2.flush();
                                        fileWriter2.close();
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileWriter = fileWriter2;
                                        while (true) {
                                            break;
                                        }
                                        throw th;
                                    }
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        try {
                            break;
                            throw th;
                        } catch (Exception e10) {
                            e = e10;
                        }
                        e.printStackTrace();
                        C2181a c2181aM6433b = this.f32896a.m6433b();
                        String str3 = this.f32896a.f10995a;
                        String str4 = "writeFileOnInternalStorage: failed" + e.getLocalizedMessage();
                        c2181aM6433b.getClass();
                        C2181a.m6460m(str3, str4);
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th4) {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                throw th4;
            }
        }
    }
}
