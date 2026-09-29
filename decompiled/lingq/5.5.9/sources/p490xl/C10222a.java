package p490xl;

import kotlin.coroutines.CoroutineContext;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: xl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10222a implements InterfaceC9968c<Object> {

    /* JADX INFO: renamed from: a */
    public static final C10222a f51641a = new C10222a();

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: y */
    public final void mo2031y(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
