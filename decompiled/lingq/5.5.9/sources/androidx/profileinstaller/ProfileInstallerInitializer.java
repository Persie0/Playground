package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p286o2.RunnableC7907g;
import p355r4.InterfaceC8730b;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC8730b<C1091c> {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    public static class C1089a {
        /* JADX INFO: renamed from: a */
        public static void m4043a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: i4.f
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C1090b {
        /* JADX INFO: renamed from: a */
        public static Handler m4044a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C1091c {
    }

    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: a */
    public final List<Class<? extends InterfaceC8730b<?>>> mo3510a() {
        return Collections.emptyList();
    }

    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: b */
    public final C1091c mo3511b(Context context) {
        C1089a.m4043a(new RunnableC7907g(this, 2, context.getApplicationContext()));
        return new C1091c();
    }
}
