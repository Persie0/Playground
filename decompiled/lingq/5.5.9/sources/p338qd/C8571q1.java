package p338qd;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.C3111b;
import com.google.android.play.core.assetpacks.C3112c;
import java.util.concurrent.Executor;
import p289o5.RunnableC7930j;
import p290o6.C7967l0;
import p413ud.C9519b;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: qd.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8571q1 {

    /* JADX INFO: renamed from: e */
    public static final C7967l0 f45948e = new C7967l0("AssetPackManager");

    /* JADX INFO: renamed from: a */
    public final C3112c f45949a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9268p f45950b;

    /* JADX INFO: renamed from: c */
    public final C3111b f45951c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9268p f45952d;

    public C8571q1(C3112c c3112c, InterfaceC9268p interfaceC9268p, C3111b c3111b, InterfaceC9268p interfaceC9268p2) {
        new Handler(Looper.getMainLooper());
        this.f45949a = c3112c;
        this.f45950b = interfaceC9268p;
        this.f45951c = c3111b;
        this.f45952d = interfaceC9268p2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m16660a(boolean z10) {
        C9519b c9519b;
        C3111b c3111b = this.f45951c;
        synchronized (c3111b) {
            c9519b = c3111b.f49027e;
        }
        boolean z11 = c9519b != null;
        C3111b c3111b2 = this.f45951c;
        synchronized (c3111b2) {
            c3111b2.f49028f = z10;
            c3111b2.m17981b();
        }
        if (!z10 || z11) {
            return;
        }
        ((Executor) this.f45952d.zza()).execute(new RunnableC7930j(7, this));
    }
}
