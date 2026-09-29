package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import mk.C7572a;
import mk.C7575b;
import p385sf.C9000b;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: dagger.hilt.android.internal.managers.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5114a implements InterfaceC8405b<Object> {

    /* JADX INFO: renamed from: a */
    public volatile C7575b f33086a;

    /* JADX INFO: renamed from: b */
    public final Object f33087b = new Object();

    /* JADX INFO: renamed from: c */
    public final Activity f33088c;

    /* JADX INFO: renamed from: d */
    public final C5116c f33089d;

    /* JADX INFO: renamed from: dagger.hilt.android.internal.managers.a$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        C7572a mo10894b();
    }

    public C5114a(Activity activity) {
        this.f33088c = activity;
        this.f33089d = new C5116c((ComponentActivity) activity);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final Object m10893a() {
        String str;
        Activity activity = this.f33088c;
        if (activity.getApplication() instanceof InterfaceC8405b) {
            C7572a c7572aMo10894b = ((a) C9000b.m17245k(a.class, this.f33089d)).mo10894b();
            c7572aMo10894b.getClass();
            c7572aMo10894b.getClass();
            return new C7575b(c7572aMo10894b.f41753a, c7572aMo10894b.f41754b);
        }
        StringBuilder sb2 = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(activity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + activity.getApplication().getClass();
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f33086a == null) {
            synchronized (this.f33087b) {
                if (this.f33086a == null) {
                    this.f33086a = (C7575b) m10893a();
                }
            }
        }
        return this.f33086a;
    }
}
