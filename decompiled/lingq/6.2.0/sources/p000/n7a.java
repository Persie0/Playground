package p000;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class n7a {

    /* JADX INFO: renamed from: d */
    public static final Pattern f52464d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a */
    public final String f52465a;

    /* JADX INFO: renamed from: b */
    public final String f52466b;

    /* JADX INFO: renamed from: c */
    public final String f52467c;

    public n7a(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f52464d.matcher(strSubstring).matches()) {
            C3386nv.m17626m(wq1.m24118n("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.f52465a = strSubstring;
        this.f52466b = str;
        this.f52467c = AbstractC3393o1.m17735j(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n7a)) {
            return false;
        }
        n7a n7aVar = (n7a) obj;
        return this.f52465a.equals(n7aVar.f52465a) && this.f52466b.equals(n7aVar.f52466b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52466b, this.f52465a});
    }
}
