package p000;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class veb {

    /* JADX INFO: renamed from: a */
    public static final C3299li f65285a = new C3299li("GoogleSignInCommon", new String[0]);

    /* JADX INFO: renamed from: a */
    public static void m23255a(Context context) {
        web.m23863P(context).m23876Q();
        Set set = vcb.f65200b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            so3.m21513a();
        } else {
            ((vcb) it.next()).getClass();
            ij6.m13946b();
        }
    }
}
