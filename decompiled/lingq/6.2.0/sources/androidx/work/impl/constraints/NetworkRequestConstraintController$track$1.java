package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import androidx.work.NetworkType;
import java.util.LinkedHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.channels.AbstractC3212b;
import p000.C3386nv;
import p000.a45;
import p000.ak1;
import p000.c32;
import p000.cl9;
import p000.d59;
import p000.fk1;
import p000.gk1;
import p000.h85;
import p000.j44;
import p000.kl7;
import p000.ll7;
import p000.oj5;
import p000.qk6;
import p000.ui3;
import p000.wfb;
import p000.xa0;
import p000.xfa;
import p000.zg0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", m4291f = "WorkConstraintsTracker.kt", m4292l = {191}, m4293m = "invokeSuspend")
final class NetworkRequestConstraintController$track$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7220a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f7221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ak1 f7222c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0775a f7223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1(ak1 ak1Var, C0775a c0775a, Continuation continuation) {
        super(2, continuation);
        this.f7222c = ak1Var;
        this.f7223d = c0775a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkRequestConstraintController$track$1 networkRequestConstraintController$track$1 = new NetworkRequestConstraintController$track$1(this.f7222c, this.f7223d, continuation);
        networkRequestConstraintController$track$1.f7221b = obj;
        return networkRequestConstraintController$track$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkRequestConstraintController$track$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        ui3 zg0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7220a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ll7 ll7Var = (ll7) this.f7221b;
            NetworkRequest networkRequestM516d = this.f7222c.m516d();
            int i2 = 18;
            int i3 = 13;
            boolean z = false;
            if (networkRequestM516d == null) {
                NetworkType networkType = this.f7222c.f752a;
                networkType.getClass();
                if (networkType == NetworkType.NOT_REQUIRED) {
                    networkRequestM516d = null;
                } else {
                    NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                    if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                        int i4 = qk6.f57870a[networkType.ordinal()];
                        if (i4 == 1) {
                            builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                        } else if (i4 == 2) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(11);
                        } else if (i4 == 3) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(18);
                        }
                        networkRequestM516d = builderRemoveCapability.build();
                    } else {
                        networkRequestM516d = builderRemoveCapability.addCapability(25).build();
                    }
                }
            }
            if (networkRequestM516d == null) {
                kl7 kl7Var = (kl7) ll7Var;
                kl7Var.getClass();
                kl7Var.mo15331i(null);
                return xfa.f68157a;
            }
            h85 h85Var = new h85(i2, wfb.m23926u(ll7Var, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.f7223d, ll7Var, null), 3), ll7Var);
            if (Build.VERSION.SDK_INT >= 30) {
                d59 d59Var = d59.f35017a;
                ConnectivityManager connectivityManager = this.f7223d.f7234a;
                d59Var.getClass();
                synchronized (d59.f35018b) {
                    try {
                        LinkedHashMap linkedHashMap = d59.f35019c;
                        boolean zIsEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(h85Var, networkRequestM516d);
                        if (zIsEmpty) {
                            oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController register shared callback");
                            connectivityManager.registerDefaultNetworkCallback(d59Var);
                        } else if (d59.f35021e && d59.f35022f != null) {
                            oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController send initial capabilities");
                            NetworkCapabilities networkCapabilities = d59.f35020d;
                            Boolean bool = d59.f35022f;
                            bool.getClass();
                            if (!bool.booleanValue() && networkRequestM516d.canBeSatisfiedBy(networkCapabilities)) {
                                z = true;
                            }
                            h85Var.invoke(z ? fk1.f39219a : new gk1(7));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zg0Var = new a45(26, h85Var, connectivityManager);
            } else {
                int i5 = j44.f45038c;
                ConnectivityManager connectivityManager2 = this.f7223d.f7234a;
                j44 j44Var = new j44(h85Var);
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                try {
                    oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequestM516d, j44Var);
                    ref$BooleanRef.f47713a = true;
                } catch (RuntimeException e) {
                    if (!cl9.m4833P(e.getClass().getName(), "TooManyRequestsException", false)) {
                        throw e;
                    }
                    oj5 oj5VarM18040f = oj5.m18040f();
                    String str = AbstractC0776b.f7235a;
                    if (oj5VarM18040f.f54464a <= 3) {
                        Log.d(str, "NetworkRequestConstraintController couldn't register callback", e);
                    }
                    h85Var.invoke(new gk1(7));
                }
                zg0Var = new zg0(ref$BooleanRef, connectivityManager2, j44Var, i3);
            }
            xa0 xa0Var = new xa0(13, zg0Var);
            this.f7220a = 1;
            if (AbstractC3212b.m15484a(ll7Var, xa0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
