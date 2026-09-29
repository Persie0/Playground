package p220kb;

import android.util.Log;
import java.util.Locale;
import p176ib.C6263e;

/* JADX INFO: renamed from: kb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6653a {

    /* JADX INFO: renamed from: a */
    public final String f37720a;

    /* JADX INFO: renamed from: b */
    public final String f37721b;

    /* JADX INFO: renamed from: c */
    public final int f37722c;

    public C6653a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f37721b = string;
        this.f37720a = str;
        new C6263e(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f37720a, i10)) {
            i10++;
        }
        this.f37722c = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m13287a(String str, Object... objArr) {
        if (this.f37722c <= 3) {
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(this.f37720a, this.f37721b.concat(str));
        }
    }
}
