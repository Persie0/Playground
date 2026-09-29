package ae;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import p081e0.C5298b1;
import p176ib.C6268g;
import p176ib.C6272i;
import p262mb.C7532e;

/* JADX INFO: renamed from: ae.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0066f {

    /* JADX INFO: renamed from: a */
    public final String f183a;

    /* JADX INFO: renamed from: b */
    public final String f184b;

    /* JADX INFO: renamed from: c */
    public final String f185c;

    /* JADX INFO: renamed from: d */
    public final String f186d;

    /* JADX INFO: renamed from: e */
    public final String f187e;

    /* JADX INFO: renamed from: f */
    public final String f188f;

    /* JADX INFO: renamed from: g */
    public final String f189g;

    public C0066f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C6272i.m12917k("ApplicationId must be set.", !C7532e.m15044a(str));
        this.f184b = str;
        this.f183a = str2;
        this.f185c = str3;
        this.f186d = str4;
        this.f187e = str5;
        this.f188f = str6;
        this.f189g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static C0066f m442a(Context context) {
        C5298b1 c5298b1 = new C5298b1(context);
        String strM11438f = c5298b1.m11438f("google_app_id");
        if (TextUtils.isEmpty(strM11438f)) {
            return null;
        }
        return new C0066f(strM11438f, c5298b1.m11438f("google_api_key"), c5298b1.m11438f("firebase_database_url"), c5298b1.m11438f("ga_trackingId"), c5298b1.m11438f("gcm_defaultSenderId"), c5298b1.m11438f("google_storage_bucket"), c5298b1.m11438f("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0066f)) {
            return false;
        }
        C0066f c0066f = (C0066f) obj;
        return C6268g.m12905a(this.f184b, c0066f.f184b) && C6268g.m12905a(this.f183a, c0066f.f183a) && C6268g.m12905a(this.f185c, c0066f.f185c) && C6268g.m12905a(this.f186d, c0066f.f186d) && C6268g.m12905a(this.f187e, c0066f.f187e) && C6268g.m12905a(this.f188f, c0066f.f188f) && C6268g.m12905a(this.f189g, c0066f.f189g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f184b, this.f183a, this.f185c, this.f186d, this.f187e, this.f188f, this.f189g});
    }

    public final String toString() {
        C6268g.a aVar = new C6268g.a(this);
        aVar.m12906a(this.f184b, "applicationId");
        aVar.m12906a(this.f183a, "apiKey");
        aVar.m12906a(this.f185c, "databaseUrl");
        aVar.m12906a(this.f187e, "gcmSenderId");
        aVar.m12906a(this.f188f, "storageBucket");
        aVar.m12906a(this.f189g, "projectId");
        return aVar.toString();
    }
}
