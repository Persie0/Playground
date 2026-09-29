package retrofit2;

import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7832g0;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinExtensions {

    /* JADX INFO: renamed from: retrofit2.KotlinExtensions$a */
    public static final class RunnableC8773a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9968c f46514a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Exception f46515b;

        public RunnableC8773a(Exception exc, InterfaceC9968c interfaceC9968c) {
            this.f46514a = interfaceC9968c;
            this.f46515b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8656b.m16874A(this.f46514a).mo2031y(C7499b.m14967u(this.f46515b));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    public static final Object m17021a(Exception exc, InterfaceC9968c<?> interfaceC9968c) throws Throwable {
        KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        if (interfaceC9968c instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) interfaceC9968c;
            int i10 = kotlinExtensions$suspendAndThrow$1.f46520e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.f46520e = i10 - Integer.MIN_VALUE;
            } else {
                kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(interfaceC9968c);
            }
        } else {
            kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(interfaceC9968c);
        }
        Object obj = kotlinExtensions$suspendAndThrow$1.f46519d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = kotlinExtensions$suspendAndThrow$1.f46520e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        kotlinExtensions$suspendAndThrow$1.getClass();
        kotlinExtensions$suspendAndThrow$1.f46520e = 1;
        C7178b c7178b = C7832g0.f42930a;
        CoroutineContext coroutineContext = kotlinExtensions$suspendAndThrow$1.f38105b;
        C5207g.m11108c(coroutineContext);
        c7178b.mo2307z1(coroutineContext, new RunnableC8773a(exc, kotlinExtensions$suspendAndThrow$1));
        return coroutineSingletons;
    }
}
