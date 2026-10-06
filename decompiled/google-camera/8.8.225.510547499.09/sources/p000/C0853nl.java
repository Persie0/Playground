package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: nl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0853nl implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f43434a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f43435b;

    public /* synthetic */ C0853nl(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd, int i) {
        this.f43435b = i;
        this.f43434a = layoutInflaterFactory2C0179fd;
    }

    public /* synthetic */ C0853nl(Runnable runnable, int i) {
        this.f43435b = i;
        this.f43434a = runnable;
    }

    public /* synthetic */ C0853nl(omx omxVar, int i) {
        this.f43435b = i;
        this.f43434a = omxVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, omx] */
    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f43435b) {
            case 0:
                this.f43434a.run();
                break;
            case 1:
                ((LayoutInflaterFactory2C0179fd) this.f43434a).m8240G();
                break;
            default:
                this.f43434a.mo2077a();
                break;
        }
    }
}
