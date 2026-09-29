package p000;

import android.util.Base64OutputStream;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m62 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50637a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n62 f50638b;

    public /* synthetic */ m62(n62 n62Var, int i) {
        this.f50637a = i;
        this.f50638b = n62Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f50637a) {
            case 0:
                n62 n62Var = this.f50638b;
                synchronized (n62Var) {
                    try {
                        wr3 wr3Var = (wr3) n62Var.f52389a.get();
                        ArrayList arrayListM24132a = wr3Var.m24132a();
                        synchronized (wr3Var) {
                            wr3Var.f67203a.m6686a(new C0011a9(wr3Var, 21));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListM24132a.size(); i++) {
                            q40 q40Var = (q40) arrayListM24132a.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", q40Var.m19635c());
                            jSONObject.put("dates", new JSONArray((Collection) q40Var.m19634b()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                n62 n62Var2 = this.f50638b;
                synchronized (n62Var2) {
                    wr3 wr3Var2 = (wr3) n62Var2.f52389a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strM17290a = ((n92) n62Var2.f52391c.get()).m17290a();
                    synchronized (wr3Var2) {
                        wr3Var2.f67203a.m6686a(new C3615tl(wr3Var2, wr3Var2.m24133b(jCurrentTimeMillis), strM17290a, PreferencesKeys.stringSetKey(strM17290a), 2));
                    }
                }
                return null;
        }
    }
}
