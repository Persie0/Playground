package p000;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zx5 {

    /* JADX INFO: renamed from: b */
    public static final Charset f72341b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final t33 f72342a;

    public zx5(t33 t33Var) {
        this.f72342a = t33Var;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m25836a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m25837b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(wh8.m23952a(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static String m25838e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(wh8.f66833a.m4509e(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    /* JADX INFO: renamed from: f */
    public static void m25839f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m25840g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", wq1.m24119o("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX INFO: renamed from: c */
    public final Map m25841c(String str, boolean z) throws Throwable {
        ?? r8;
        FileInputStream fileInputStream;
        Exception e;
        t33 t33Var = this.f72342a;
        File fileM21831b = z ? t33Var.m21831b(str, "internal-keys") : t33Var.m21831b(str, "keys");
        if (!fileM21831b.exists() || fileM21831b.length() == 0) {
            m25840g(fileM21831b, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        ?? r7 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(fileM21831b);
                try {
                    HashMap mapM25836a = m25836a(pb1.m19029Q(fileInputStream));
                    pb1.m19047q(fileInputStream, "Failed to close user metadata file.");
                    return mapM25836a;
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    m25839f(fileM21831b);
                    pb1.m19047q(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th) {
                th = th;
                r7 = r8;
                pb1.m19047q(r7, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            pb1.m19047q(r7, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: d */
    public final String m25842d(String str) {
        FileInputStream fileInputStream;
        File fileM21831b = this.f72342a.m21831b(str, "user-data");
        ?? r5 = 0;
        if (fileM21831b.exists()) {
            ?? r2 = (fileM21831b.length() > 0L ? 1 : (fileM21831b.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileM21831b);
                        try {
                            JSONObject jSONObject = new JSONObject(pb1.m19029Q(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            pb1.m19047q(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            m25839f(fileM21831b);
                            pb1.m19047q(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        pb1.m19047q(r5, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r5 = r2;
            }
        }
        String strM17734i = AbstractC3393o1.m17734i("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM17734i, null);
        }
        m25839f(fileM21831b);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m25843h(String str, Map map, boolean z) {
        BufferedWriter bufferedWriter;
        Exception e;
        t33 t33Var = this.f72342a;
        File fileM21831b = z ? t33Var.m21831b(str, "internal-keys") : t33Var.m21831b(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            String string = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM21831b), f72341b));
            try {
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    pb1.m19047q(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    m25839f(fileM21831b);
                    pb1.m19047q(bufferedWriter, "Failed to close key/value metadata file.");
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter2 = bufferedWriter;
                pb1.m19047q(bufferedWriter2, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            pb1.m19047q(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: i */
    public final void m25844i(String str, List list) {
        BufferedWriter bufferedWriter;
        Exception e;
        File fileM21831b = this.f72342a.m21831b(str, "rollouts-state");
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            m25840g(fileM21831b, "Rollout state is empty for session: " + str);
            return;
        }
        ?? r6 = 0;
        try {
            try {
                String strM25838e = m25838e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM21831b), f72341b));
                try {
                    bufferedWriter.write(strM25838e);
                    bufferedWriter.flush();
                    pb1.m19047q(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    m25839f(fileM21831b);
                    pb1.m19047q(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th) {
                th = th;
                r6 = IsEmpty;
                pb1.m19047q(r6, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            pb1.m19047q(r6, "Failed to close rollouts state file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m25845j(String str, String str2) {
        File fileM21831b = this.f72342a.m21831b(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                yx5 yx5Var = new yx5();
                yx5Var.put("userId", str2);
                String string = yx5Var.toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM21831b), f72341b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    pb1.m19047q(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    pb1.m19047q(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    pb1.m19047q(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
