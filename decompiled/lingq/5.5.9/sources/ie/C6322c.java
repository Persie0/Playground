package ie;

import android.util.Log;
import androidx.activity.result.C0204c;
import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import java.util.concurrent.atomic.AtomicReference;
import ne.AbstractC7747d0;
import p118fe.C5509a;
import p118fe.C5526r;

/* JADX INFO: renamed from: ie.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6322c implements InterfaceC6320a {

    /* JADX INFO: renamed from: c */
    public static final a f36547c = new a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC2004a<InterfaceC6320a> f36548a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<InterfaceC6320a> f36549b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: ie.c$a */
    public static final class a implements InterfaceC6324e {
    }

    public C6322c(InterfaceC2004a<InterfaceC6320a> interfaceC2004a) {
        this.f36548a = interfaceC2004a;
        ((C5526r) interfaceC2004a).m11764a(new C5509a(10, this));
    }

    @Override // ie.InterfaceC6320a
    /* JADX INFO: renamed from: a */
    public final InterfaceC6324e mo12945a(String str) {
        InterfaceC6320a interfaceC6320a = this.f36549b.get();
        return interfaceC6320a == null ? f36547c : interfaceC6320a.mo12945a(str);
    }

    @Override // ie.InterfaceC6320a
    /* JADX INFO: renamed from: b */
    public final boolean mo12946b() {
        InterfaceC6320a interfaceC6320a = this.f36549b.get();
        return interfaceC6320a != null && interfaceC6320a.mo12946b();
    }

    @Override // ie.InterfaceC6320a
    /* JADX INFO: renamed from: c */
    public final boolean mo12947c(String str) {
        InterfaceC6320a interfaceC6320a = this.f36549b.get();
        return interfaceC6320a != null && interfaceC6320a.mo12947c(str);
    }

    @Override // ie.InterfaceC6320a
    /* JADX INFO: renamed from: d */
    public final void mo12948d(final String str, final String str2, final long j10, final AbstractC7747d0 abstractC7747d0) {
        String strM852k = C0204c.m852k("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strM852k, null);
        }
        ((C5526r) this.f36548a).m11764a(new InterfaceC2004a.a() { // from class: ie.b
            @Override // cf.InterfaceC2004a.a
            /* JADX INFO: renamed from: f */
            public final void mo5937f(InterfaceC2005b interfaceC2005b) {
                ((InterfaceC6320a) interfaceC2005b.get()).mo12948d(str, str2, j10, abstractC7747d0);
            }
        });
    }
}
