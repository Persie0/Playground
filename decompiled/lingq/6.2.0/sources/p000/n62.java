package p000;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n62 implements ur3, vr3 {

    /* JADX INFO: renamed from: a */
    public final ds4 f52389a;

    /* JADX INFO: renamed from: b */
    public final Context f52390b;

    /* JADX INFO: renamed from: c */
    public final uo7 f52391c;

    /* JADX INFO: renamed from: d */
    public final Set f52392d;

    /* JADX INFO: renamed from: e */
    public final Executor f52393e;

    public n62(Context context, String str, Set set, uo7 uo7Var, Executor executor) {
        this.f52389a = new ds4(new dd1(1, context, str));
        this.f52392d = set;
        this.f52393e = executor;
        this.f52391c = uo7Var;
        this.f52390b = context;
    }

    /* JADX INFO: renamed from: a */
    public final tld m17247a() {
        return !bma.m3879a(this.f52390b) ? Tasks.m5975c("") : Tasks.m5973a(new m62(this, 0), this.f52393e);
    }

    /* JADX INFO: renamed from: b */
    public final void m17248b() {
        if (this.f52392d.size() <= 0) {
            Tasks.m5975c(null);
        } else if (bma.m3879a(this.f52390b)) {
            Tasks.m5973a(new m62(this, 1), this.f52393e);
        } else {
            Tasks.m5975c(null);
        }
    }
}
