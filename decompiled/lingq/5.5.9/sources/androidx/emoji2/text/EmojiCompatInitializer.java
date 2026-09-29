package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.view.C1052r;
import androidx.view.InterfaceC1029e;
import androidx.view.InterfaceC1051q;
import androidx.view.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p355r4.C8729a;
import p355r4.InterfaceC8730b;
import p389t2.C9191j;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC8730b<Boolean> {

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public static class C0884a extends C0892f.c {
        public C0884a(Context context) {
            super(new C0885b(context));
            this.f5998b = 1;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C0885b implements C0892f.h {

        /* JADX INFO: renamed from: a */
        public final Context f5977a;

        public C0885b(Context context) {
            this.f5977a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C0892f.h
        /* JADX INFO: renamed from: a */
        public final void mo3513a(C0892f.i iVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0887a("EmojiCompatInitializer", 0));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new RunnableC0893g(0, this, iVar, threadPoolExecutor));
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class RunnableC0886c implements Runnable {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i10 = C9191j.f47731a;
                C9191j.a.m17531a("EmojiCompat.EmojiCompatInitializer.run");
                if (C0892f.m3520c()) {
                    C0892f.m3519a().m3522d();
                }
                C9191j.a.m17532b();
            } catch (Throwable th2) {
                int i11 = C9191j.f47731a;
                C9191j.a.m17532b();
                throw th2;
            }
        }
    }

    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: a */
    public final List<Class<? extends InterfaceC8730b<?>>> mo3510a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p355r4.InterfaceC8730b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean mo3511b(Context context) {
        Object objM16961b;
        C0884a c0884a = new C0884a(context);
        if (C0892f.f5984k == null) {
            synchronized (C0892f.f5983j) {
                if (C0892f.f5984k == null) {
                    C0892f.f5984k = new C0892f(c0884a);
                }
            }
        }
        C8729a c8729aM16959c = C8729a.m16959c(context);
        c8729aM16959c.getClass();
        synchronized (C8729a.f46320e) {
            try {
                objM16961b = c8729aM16959c.f46321a.get(ProcessLifecycleInitializer.class);
                if (objM16961b == null) {
                    objM16961b = c8729aM16959c.m16961b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final C1052r c1052rMo786G = ((InterfaceC1051q) objM16961b).mo786G();
        c1052rMo786G.mo3883a(new InterfaceC1029e() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.view.InterfaceC1029e
            /* JADX INFO: renamed from: b */
            public final void mo2261b(InterfaceC1051q interfaceC1051q) {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? C0888b.m3514a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0886c(), 500L);
                c1052rMo786G.mo3885c(this);
            }
        });
        return Boolean.TRUE;
    }
}
