package p000;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class r7a {

    /* JADX INFO: renamed from: b */
    public static WeakReference f58860b;

    /* JADX INFO: renamed from: a */
    public w41 f58861a;

    /* JADX INFO: renamed from: a */
    public final synchronized n7a m20436a() {
        String str;
        n7a n7aVar;
        w41 w41Var = this.f58861a;
        synchronized (((ArrayDeque) w41Var.f66368d)) {
            str = (String) ((ArrayDeque) w41Var.f66368d).peek();
        }
        Pattern pattern = n7a.f52464d;
        n7aVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                n7aVar = new n7a(strArrSplit[0], strArrSplit[1]);
            }
        }
        return n7aVar;
    }
}
