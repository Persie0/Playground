package androidx.datastore.core;

import java.io.File;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC3212b;
import p000.C3386nv;
import p000.c32;
import p000.ci2;
import p000.fa4;
import p000.kl7;
import p000.ll7;
import p000.ui3;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", m4291f = "MulticastFileObserver.android.kt", m4292l = {78, 79}, m4293m = "invokeSuspend", m4294v = 1)
public final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements zi3 {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, Continuation<? super MulticastFileObserver$Companion$observe$1> continuation) {
        super(2, continuation);
        this.$file = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xfa invokeSuspend$lambda$0(File file, ll7 ll7Var, String str) {
        boolean zM11650l = fa4.m11650l(str, file.getName());
        xfa xfaVar = xfa.f68157a;
        if (zM11650l) {
            AbstractC3212b.m15486c(ll7Var);
        }
        return xfaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xfa invokeSuspend$lambda$1(ci2 ci2Var) {
        ci2Var.mo125a();
        return xfa.f68157a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, continuation);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // p000.zi3
    public final Object invoke(ll7 ll7Var, Continuation<? super xfa> continuation) {
        return ((MulticastFileObserver$Companion$observe$1) create(ll7Var, continuation)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final ci2 ci2VarObserve;
        ll7 ll7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            final ll7 ll7Var2 = (ll7) this.L$0;
            final File file = this.$file;
            vi3 vi3Var = new vi3() { // from class: androidx.datastore.core.a
                @Override // p000.vi3
                public final Object invoke(Object obj2) {
                    return MulticastFileObserver$Companion$observe$1.invokeSuspend$lambda$0(file, ll7Var2, (String) obj2);
                }
            };
            MulticastFileObserver.Companion companion = MulticastFileObserver.Companion;
            File parentFile = file.getParentFile();
            parentFile.getClass();
            ci2VarObserve = companion.observe(parentFile, vi3Var);
            this.L$0 = ll7Var2;
            this.L$1 = ci2VarObserve;
            this.label = 1;
            if (((kl7) ll7Var2).f47495f.mo4678m(xfaVar, this) != coroutineSingletons) {
                ll7Var = ll7Var2;
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ci2VarObserve = (ci2) this.L$1;
        ll7Var = (ll7) this.L$0;
        AbstractC3193b.m15359b(obj);
        ui3 ui3Var = new ui3() { // from class: androidx.datastore.core.b
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return MulticastFileObserver$Companion$observe$1.invokeSuspend$lambda$1(ci2VarObserve);
            }
        };
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        return AbstractC3212b.m15484a(ll7Var, ui3Var, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
