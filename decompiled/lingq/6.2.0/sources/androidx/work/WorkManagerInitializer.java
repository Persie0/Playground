package androidx.work;

import android.content.Context;
import androidx.work.impl.C0773b;
import java.util.Collections;
import java.util.List;
import p000.c54;
import p000.gh1;
import p000.hh1;
import p000.oj5;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkManagerInitializer implements c54 {

    /* JADX INFO: renamed from: a */
    public static final String f7164a = oj5.m18041h("WrkMgrInitializer");

    @Override // p000.c54
    /* JADX INFO: renamed from: a */
    public final List mo2060a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.c54
    /* JADX INFO: renamed from: b */
    public final Object mo2061b(Context context) {
        oj5.m18040f().m18042a(f7164a, "Initializing WorkManager with default configuration.");
        hh1 hh1Var = new hh1(new gh1(0));
        context.getClass();
        C0773b.m2911d(context, hh1Var);
        C0773b c0773bM2910c = C0773b.m2910c(context);
        c0773bM2910c.getClass();
        return c0773bM2910c;
    }
}
