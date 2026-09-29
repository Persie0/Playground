package androidx.view;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import p355r4.C8729a;
import p355r4.InterfaceC8730b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lr4/b;", "Landroidx/lifecycle/q;", "<init>", "()V", "lifecycle-process_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ProcessLifecycleInitializer implements InterfaceC8730b<InterfaceC1051q> {
    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: a */
    public final List<Class<? extends InterfaceC8730b<?>>> mo3510a() {
        return EmptyList.f38032a;
    }

    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: b */
    public final InterfaceC1051q mo3511b(Context context) {
        C5207g.m11111f(context, "context");
        C8729a c8729aM16959c = C8729a.m16959c(context);
        C5207g.m11110e(c8729aM16959c, "getInstance(context)");
        if (!c8729aM16959c.f46322b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!C1047n.f6678a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            C5207g.m11109d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1047n.a());
        }
        C1060z c1060z = C1060z.f6693i;
        c1060z.getClass();
        c1060z.f6698e = new Handler();
        c1060z.f6699f.m3955f(Lifecycle.Event.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        C5207g.m11109d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C1020a0(c1060z));
        return c1060z;
    }
}
