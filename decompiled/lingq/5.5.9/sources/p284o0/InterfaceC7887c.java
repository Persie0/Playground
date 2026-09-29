package p284o0;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: o0.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7887c extends CoroutineContext.InterfaceC6757a {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f43001C = 0;

    /* JADX INFO: renamed from: o0.c$a */
    public static final class a implements CoroutineContext.InterfaceC6758b<InterfaceC7887c> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f43002a = new a();
    }

    /* JADX INFO: renamed from: d0 */
    float mo1472d0();

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC6757a
    default CoroutineContext.InterfaceC6758b<?> getKey() {
        return a.f43002a;
    }
}
