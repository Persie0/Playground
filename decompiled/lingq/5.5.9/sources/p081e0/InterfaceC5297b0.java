package p081e0;

import cm.InterfaceC2052l;
import kotlin.coroutines.CoroutineContext;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: e0.b0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5297b0 extends CoroutineContext.InterfaceC6757a {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f33570z = 0;

    /* JADX INFO: renamed from: e0.b0$a */
    public static final class a implements CoroutineContext.InterfaceC6758b<InterfaceC5297b0> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f33571a = new a();
    }

    /* JADX INFO: renamed from: U */
    <R> Object mo1581U(InterfaceC2052l<? super Long, ? extends R> interfaceC2052l, InterfaceC9968c<? super R> interfaceC9968c);

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC6757a
    default CoroutineContext.InterfaceC6758b<?> getKey() {
        return a.f33571a;
    }
}
