package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a53 {

    /* JADX INFO: renamed from: a */
    public final String f260a;

    /* JADX INFO: renamed from: b */
    public final String f261b;

    /* JADX INFO: renamed from: c */
    public final String f262c;

    /* JADX INFO: renamed from: d */
    public final String f263d;

    /* JADX INFO: renamed from: e */
    public final String f264e;

    /* JADX INFO: renamed from: f */
    public final String f265f;

    /* JADX INFO: renamed from: g */
    public final String f266g;

    public a53(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = tk9.f62458a;
        lda.m16132r("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f261b = str;
        this.f260a = str2;
        this.f262c = str3;
        this.f263d = str4;
        this.f264e = str5;
        this.f265f = str6;
        this.f266g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static a53 m123a(Context context) {
        fs6 fs6Var = new fs6(context);
        String strM12117x = fs6Var.m12117x("google_app_id");
        if (TextUtils.isEmpty(strM12117x)) {
            return null;
        }
        return new a53(strM12117x, fs6Var.m12117x("google_api_key"), fs6Var.m12117x("firebase_database_url"), fs6Var.m12117x("ga_trackingId"), fs6Var.m12117x("gcm_defaultSenderId"), fs6Var.m12117x("google_storage_bucket"), fs6Var.m12117x("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a53)) {
            return false;
        }
        a53 a53Var = (a53) obj;
        return x74.m24360q(this.f261b, a53Var.f261b) && x74.m24360q(this.f260a, a53Var.f260a) && x74.m24360q(this.f262c, a53Var.f262c) && x74.m24360q(this.f263d, a53Var.f263d) && x74.m24360q(this.f264e, a53Var.f264e) && x74.m24360q(this.f265f, a53Var.f265f) && x74.m24360q(this.f266g, a53Var.f266g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f261b, this.f260a, this.f262c, this.f263d, this.f264e, this.f265f, this.f266g});
    }

    public final String toString() {
        y12 y12Var = new y12(this);
        y12Var.m24830a(this.f261b, "applicationId");
        y12Var.m24830a(this.f260a, "apiKey");
        y12Var.m24830a(this.f262c, "databaseUrl");
        y12Var.m24830a(this.f264e, "gcmSenderId");
        y12Var.m24830a(this.f265f, "storageBucket");
        y12Var.m24830a(this.f266g, "projectId");
        return y12Var.toString();
    }
}
