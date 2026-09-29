package p241le;

import ae.C0065e;
import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.C0322j;
import com.google.firebase.crashlytics.internal.common.C3213b;
import com.google.firebase.crashlytics.internal.settings.C3215a;
import ie.C6322c;
import ie.InterfaceC6320a;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import je.InterfaceC6465a;
import ke.InterfaceC6663a;
import ke.InterfaceC6664b;
import p118fe.C5509a;
import p136gc.AbstractC5751g;
import p136gc.C5761q;
import p289o5.C7940t;
import p339qe.C8597b;
import p402u0.C9371n;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: le.w */
/* JADX INFO: loaded from: classes.dex */
public final class C7352w {

    /* JADX INFO: renamed from: a */
    public final Context f41094a;

    /* JADX INFO: renamed from: b */
    public final C7323a0 f41095b;

    /* JADX INFO: renamed from: c */
    public final C7940t f41096c;

    /* JADX INFO: renamed from: d */
    public final long f41097d;

    /* JADX INFO: renamed from: e */
    public C0322j f41098e;

    /* JADX INFO: renamed from: f */
    public C0322j f41099f;

    /* JADX INFO: renamed from: g */
    public C3213b f41100g;

    /* JADX INFO: renamed from: h */
    public final C7331e0 f41101h;

    /* JADX INFO: renamed from: i */
    public final C8597b f41102i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC6664b f41103j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6465a f41104k;

    /* JADX INFO: renamed from: l */
    public final ExecutorService f41105l;

    /* JADX INFO: renamed from: m */
    public final C7332f f41106m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC6320a f41107n;

    /* JADX INFO: renamed from: le.w$a */
    public class a implements Callable<Boolean> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() throws Exception {
            try {
                C0322j c0322j = C7352w.this.f41098e;
                C8597b c8597b = (C8597b) c0322j.f1239c;
                String str = (String) c0322j.f1238b;
                c8597b.getClass();
                boolean zDelete = new File(c8597b.f46076b, str).delete();
                if (!zDelete) {
                    Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                }
                return Boolean.valueOf(zDelete);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    public C7352w(C0065e c0065e, C7331e0 c7331e0, C6322c c6322c, C7323a0 c7323a0, C5509a c5509a, C9371n c9371n, C8597b c8597b, ExecutorService executorService) {
        this.f41095b = c7323a0;
        c0065e.m437a();
        this.f41094a = c0065e.f171a;
        this.f41101h = c7331e0;
        this.f41107n = c6322c;
        this.f41103j = c5509a;
        this.f41104k = c9371n;
        this.f41105l = executorService;
        this.f41102i = c8597b;
        this.f41106m = new C7332f(executorService);
        this.f41097d = System.currentTimeMillis();
        this.f41096c = new C7940t(8);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC5751g m14756a(final C7352w c7352w, InterfaceC8996f interfaceC8996f) {
        AbstractC5751g abstractC5751gM9167f;
        if (!Boolean.TRUE.equals(c7352w.f41106m.f41053d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        c7352w.f41098e.m1217e();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                c7352w.f41103j.mo11739b(new InterfaceC6663a() { // from class: le.t
                    @Override // ke.InterfaceC6663a
                    /* JADX INFO: renamed from: a */
                    public final void mo13288a(String str) {
                        C7352w c7352w2 = this.f41089a;
                        c7352w2.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - c7352w2.f41097d;
                        C3213b c3213b = c7352w2.f41100g;
                        c3213b.getClass();
                        c3213b.f16209e.m14749a(new CallableC7345p(c3213b, jCurrentTimeMillis, str));
                    }
                });
                C3215a c3215a = (C3215a) interfaceC8996f;
                if (c3215a.m9171b().f47176b.f47181a) {
                    if (!c7352w.f41100g.m9165d(c3215a)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    abstractC5751gM9167f = c7352w.f41100g.m9167f(c3215a.f16234i.get().f34812a);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    RuntimeException runtimeException = new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                    C5761q c5761q = new C5761q();
                    c5761q.m12122p(runtimeException);
                    abstractC5751gM9167f = c5761q;
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                C5761q c5761q2 = new C5761q();
                c5761q2.m12122p(e10);
                abstractC5751gM9167f = c5761q2;
            }
            c7352w.m14758c();
            return abstractC5751gM9167f;
        } catch (Throwable th2) {
            c7352w.m14758c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14757b(C3215a c3215a) {
        Future<?> futureSubmit = this.f41105l.submit(new RunnableC7351v(this, c3215a));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14758c() {
        this.f41106m.m14749a(new a());
    }
}
