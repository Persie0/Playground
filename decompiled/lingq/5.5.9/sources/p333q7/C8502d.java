package p333q7;

import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.C7076b;
import org.json.JSONObject;
import p173i8.C6205a;

/* JADX INFO: renamed from: q7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8502d {

    /* JADX INFO: renamed from: d */
    public static final CopyOnWriteArraySet f45745d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public final String f45746a;

    /* JADX INFO: renamed from: b */
    public final String f45747b;

    /* JADX INFO: renamed from: c */
    public final List<String> f45748c;

    /* JADX INFO: renamed from: q7.d$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m16604a(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("k");
                    String strOptString2 = jSONObjectOptJSONObject.optString("v");
                    C5207g.m11110e(strOptString, "k");
                    if (!(strOptString.length() == 0)) {
                        CopyOnWriteArraySet copyOnWriteArraySetM16602a = C8502d.m16602a();
                        C5207g.m11110e(next, "key");
                        List listM14299s3 = C7076b.m14299s3(strOptString, new String[]{","}, 0, 6);
                        C5207g.m11110e(strOptString2, "v");
                        copyOnWriteArraySetM16602a.add(new C8502d(next, listM14299s3, strOptString2));
                    }
                }
            }
        }
    }

    public C8502d(String str, List list, String str2) {
        this.f45746a = str;
        this.f45747b = str2;
        this.f45748c = list;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ CopyOnWriteArraySet m16602a() {
        if (C6205a.m12742b(C8502d.class)) {
            return null;
        }
        try {
            return f45745d;
        } catch (Throwable th2) {
            C6205a.m12741a(C8502d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m16603b() {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            return this.f45746a;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }
}
