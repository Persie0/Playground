package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.AbstractC3231a;

/* JADX INFO: loaded from: classes.dex */
public final class du0 extends AbstractC3231a {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36232f = AtomicIntegerFieldUpdater.newUpdater(du0.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d */
    public final cu0 f36233d;

    /* JADX INFO: renamed from: e */
    public final boolean f36234e;

    public /* synthetic */ du0(cu0 cu0Var, boolean z) {
        this(cu0Var, z, EmptyCoroutineContext.f47685a, -3, BufferOverflow.SUSPEND);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: c */
    public final String mo10647c() {
        return "channel=" + this.f36233d;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a, p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        if (this.f48134b == -3) {
            boolean z = this.f36234e;
            if (z && f36232f.getAndSet(this, 1) == 1) {
                C3386nv.m17633t("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objM15538q = AbstractC3224d.m15538q(e83Var, this.f36233d, z, continuation);
            if (objM15538q == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM15538q;
            }
        } else {
            Object objCollect = super.collect(e83Var, continuation);
            if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objCollect;
            }
        }
        return xfa.f68157a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: d */
    public final Object mo10648d(ll7 ll7Var, Continuation continuation) throws Throwable {
        Object objM15538q = AbstractC3224d.m15538q(new zv8(ll7Var), this.f36233d, this.f36234e, continuation);
        return objM15538q == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15538q : xfa.f68157a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: e */
    public final AbstractC3231a mo10649e(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return new du0(this.f36233d, this.f36234e, kn1Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: f */
    public final c83 mo10650f() {
        return new du0(this.f36233d, this.f36234e);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: g */
    public final cu0 mo10651g(un1 un1Var) {
        if (!this.f36234e || f36232f.getAndSet(this, 1) != 1) {
            return this.f48134b == -3 ? this.f36233d : super.mo10651g(un1Var);
        }
        C3386nv.m17633t("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public du0(cu0 cu0Var, boolean z, kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        super(kn1Var, i, bufferOverflow);
        this.f36233d = cu0Var;
        this.f36234e = z;
    }
}
