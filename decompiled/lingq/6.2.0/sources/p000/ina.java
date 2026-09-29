package p000;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ina {

    /* JADX INFO: renamed from: b */
    public static final Pattern f44329b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: c */
    public static ina f44330c;

    /* JADX INFO: renamed from: a */
    public final g9c f44331a;

    public ina(g9c g9cVar) {
        this.f44331a = g9cVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14039a(c50 c50Var) {
        if (TextUtils.isEmpty(c50Var.f9504c)) {
            return true;
        }
        long j = c50Var.f9507f + c50Var.f9506e;
        this.f44331a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
