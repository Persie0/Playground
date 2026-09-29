package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.p002ui.input.pointer.util.VelocityTracker1D$Strategy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cn5 {

    /* JADX INFO: renamed from: a */
    public long f10326a;

    /* JADX INFO: renamed from: b */
    public final Object f10327b;

    /* JADX INFO: renamed from: c */
    public final Object f10328c;

    public cn5(nnb nnbVar, String str, long j) {
        this.f10328c = nnbVar;
        lda.m16127m(str);
        this.f10327b = str;
        this.f10326a = nnbVar.m17541a0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    /* JADX INFO: renamed from: b */
    public static String m4894b(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static cn5 m4895c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new cn5(0L, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new cn5(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4896a(long j, long j2) {
        ((fpa) this.f10327b).m11988a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((fpa) this.f10328c).m11988a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX INFO: renamed from: d */
    public List m4897d() {
        List list;
        List list2;
        nnb nnbVar = (nnb) this.f10328c;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f10327b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = nnbVar.m17559u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f10326a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f10326a) {
                            this.f10326a = j;
                        }
                        try {
                            khc khcVar = (khc) dad.m10238o0(ohc.m18002I(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            khcVar.m15251o(string);
                            long j4 = cursorQuery.getLong(2);
                            khcVar.m22739b();
                            ((ohc) khcVar.f63950b).m18017P(j4);
                            khcVar.m22739b();
                            ((ohc) khcVar.f63950b).m18021s(j3);
                            arrayList.add(new bnb(j, j2, z, (ohc) khcVar.m22741d()));
                        } catch (IOException e) {
                            xcc xccVar = ((kjc) nnbVar.f60774a).f47438f;
                            kjc.m15280l(xccVar);
                            xccVar.f68080f.m17925c("Data loss. Failed to merge raw event. appId", xcc.m24449L(str), e);
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e2) {
            xcc xccVar2 = ((kjc) nnbVar.f60774a).f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17925c("Data loss. Error querying raw events batch. appId", xcc.m24449L(str), e2);
            list = arrayList;
        }
        list = list2;
        return list;
    }

    public cn5(nnb nnbVar, String str) {
        this.f10328c = nnbVar;
        lda.m16127m(str);
        this.f10327b = str;
        this.f10326a = -1L;
    }

    public cn5() {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy = VelocityTracker1D$Strategy.Lsq2;
        this.f10327b = new fpa(false, velocityTracker1D$Strategy);
        this.f10328c = new fpa(false, velocityTracker1D$Strategy);
    }

    public cn5(long j, String str, String str2) {
        this.f10327b = str;
        this.f10328c = str2;
        this.f10326a = j;
    }
}
