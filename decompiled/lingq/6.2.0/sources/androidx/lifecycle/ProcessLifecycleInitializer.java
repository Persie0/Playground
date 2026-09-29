package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.C3309ls;
import p000.C3386nv;
import p000.bl7;
import p000.c54;
import p000.cl7;
import p000.mb5;
import p000.nb5;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements c54 {
    @Override // p000.c54
    /* JADX INFO: renamed from: a */
    public final List mo2060a() {
        return EmptyList.f47638a;
    }

    @Override // p000.c54
    /* JADX INFO: renamed from: b */
    public final Object mo2061b(Context context) {
        context.getClass();
        C3309ls c3309lsM16482v = C3309ls.m16482v(context);
        c3309lsM16482v.getClass();
        if (!((HashSet) c3309lsM16482v.f50065c).contains(ProcessLifecycleInitializer.class)) {
            C3386nv.m17633t("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!nb5.f52569a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new mb5());
        }
        cl7 cl7Var = cl7.f10231h;
        cl7Var.getClass();
        cl7Var.f10236e = new Handler();
        cl7Var.f10237f.m23833G(Lifecycle$Event.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new bl7(cl7Var));
        return cl7Var;
    }
}
