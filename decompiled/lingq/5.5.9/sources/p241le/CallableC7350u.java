package p241le;

import com.google.firebase.crashlytics.internal.settings.C3215a;
import java.util.concurrent.Callable;
import p136gc.AbstractC5751g;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: le.u */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7350u implements Callable<AbstractC5751g<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8996f f41090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7352w f41091b;

    public CallableC7350u(C7352w c7352w, C3215a c3215a) {
        this.f41091b = c7352w;
        this.f41090a = c3215a;
    }

    @Override // java.util.concurrent.Callable
    public final AbstractC5751g<Void> call() throws Exception {
        return C7352w.m14756a(this.f41091b, this.f41090a);
    }
}
