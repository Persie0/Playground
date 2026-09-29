package p241le;

import com.google.firebase.crashlytics.internal.settings.C3215a;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: le.v */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7351v implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8996f f41092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7352w f41093b;

    public RunnableC7351v(C7352w c7352w, C3215a c3215a) {
        this.f41093b = c7352w;
        this.f41092a = c3215a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7352w.m14756a(this.f41093b, this.f41092a);
    }
}
