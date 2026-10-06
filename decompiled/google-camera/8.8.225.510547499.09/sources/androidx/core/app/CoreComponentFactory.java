package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.pairip.StartupLauncher;
import p000.aaw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {
    static {
        StartupLauncher.launch();
    }

    /* JADX INFO: renamed from: a */
    static Object m1429a(Object obj) {
        Object objM65a;
        return (!(obj instanceof aaw) || (objM65a = ((aaw) obj).m65a()) == null) ? obj : objM65a;
    }

    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m1429a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m1429a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m1429a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m1429a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m1429a(super.instantiateService(classLoader, str, intent));
    }
}
