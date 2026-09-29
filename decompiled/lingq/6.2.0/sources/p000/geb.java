package p000;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class geb extends no3 {

    /* JADX INFO: renamed from: m */
    public static final b64 f40640m = new b64("Auth.Api.Identity.SignIn.API", new ncb(5), new p84(7));

    /* JADX INFO: renamed from: l */
    public final String f40641l;

    public geb(Context context, afb afbVar) {
        super(context, f40640m, afbVar, mo3.f51630c);
        this.f40641l = ieb.m13815a();
    }

    /* JADX INFO: renamed from: d */
    public final Task m12517d() {
        this.f53045a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = vcb.f65200b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((vcb) it.next()).getClass();
            ij6.m13946b();
            return null;
        }
        so3.m21513a();
        i44 i44VarM13651b = i44.m13651b();
        i44VarM13651b.f43483d = new Feature[]{iyc.f44788a};
        i44VarM13651b.f43482c = new sua(this, 1);
        i44VarM13651b.f43480a = false;
        i44VarM13651b.f43481b = 1554;
        return m17569c(1, i44VarM13651b.m13652a());
    }
}
