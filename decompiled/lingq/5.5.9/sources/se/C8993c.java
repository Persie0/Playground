package se;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.C3215a;
import dm.C5212l;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import no.C7814a0;
import org.json.JSONObject;
import p115fb.C5502r;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5750f;
import p387t0.C9166r;
import pe.C8237a;

/* JADX INFO: renamed from: se.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8993c implements InterfaceC5750f<Void, Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3215a f47185a;

    public C8993c(C3215a c3215a) {
        this.f47185a = c3215a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.FileWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // p136gc.InterfaceC5750f
    /* JADX INFO: renamed from: f */
    public final AbstractC5751g<Void> mo428f(Void r15) throws Exception {
        JSONObject jSONObjectM11732d;
        Exception e10;
        ?? fileWriter;
        ?? r10;
        C3215a c3215a = this.f47185a;
        C5502r c5502r = c3215a.f16231f;
        C8997g c8997g = c3215a.f16227b;
        String str = c5502r.f34114a;
        Object obj = c5502r.f34116c;
        ?? r11 = 0;
        try {
            HashMap mapM11731c = C5502r.m11731c(c8997g);
            ((C7814a0) c5502r.f34115b).getClass();
            C8237a c8237a = new C8237a(str, mapM11731c);
            HashMap map = c8237a.f44505c;
            map.put("User-Agent", "Crashlytics Android SDK/18.3.6");
            map.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            C5502r.m11729a(c8237a, c8997g);
            ((C5212l) obj).m11188H("Requesting settings from " + str);
            ((C5212l) obj).m11193q0("Settings query params were: " + mapM11731c);
            jSONObjectM11732d = c5502r.m11732d(c8237a.m16379b());
        } catch (IOException e11) {
            if (((C5212l) obj).m11195w(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e11);
            }
            jSONObjectM11732d = null;
        }
        if (jSONObjectM11732d != null) {
            C8992b c8992bM17235a = c3215a.f16228c.m17235a(jSONObjectM11732d);
            long j10 = c8992bM17235a.f47177c;
            C9166r c9166r = c3215a.f16230e;
            c9166r.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObjectM11732d.put("expires_at", j10);
                fileWriter = new FileWriter((File) c9166r.f47694a);
                try {
                    try {
                        fileWriter.write(jSONObjectM11732d.toString());
                        fileWriter.flush();
                        r10 = fileWriter;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = fileWriter;
                        CommonUtils.m9149a(r11, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e12) {
                    e10 = e12;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e10);
                    r10 = fileWriter;
                }
            } catch (Exception e13) {
                e10 = e13;
                fileWriter = 0;
            } catch (Throwable th3) {
                th = th3;
                CommonUtils.m9149a(r11, "Failed to close settings writer.");
                throw th;
            }
            CommonUtils.m9149a(r10, "Failed to close settings writer.");
            C3215a.m9169d("Loaded settings: ", jSONObjectM11732d);
            String str2 = c8997g.f47192f;
            fileWriter = c3215a.f16226a;
            SharedPreferences.Editor editorEdit = fileWriter.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str2);
            editorEdit.apply();
            c3215a.f16233h.set(c8992bM17235a);
            c3215a.f16234i.get().m12116d(c8992bM17235a);
        }
        return Tasks.m8539c(null);
    }
}
