package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p026b5.AbstractC1314g;
import p026b5.AbstractC1317j;
import p041c5.C1699a0;
import p355r4.InterfaceC8730b;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC8730b<AbstractC1317j> {

    /* JADX INFO: renamed from: a */
    public static final String f7797a = AbstractC1314g.m4868f("WrkMgrInitializer");

    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: a */
    public final List<Class<? extends InterfaceC8730b<?>>> mo3510a() {
        return Collections.emptyList();
    }

    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: b */
    public final AbstractC1317j mo3511b(Context context) {
        AbstractC1314g.m4867d().mo4869a(f7797a, "Initializing WorkManager with default configuration.");
        C1699a0.m5431e(context, new C1243a(new C1243a.a()));
        return C1699a0.m5430d(context);
    }
}
