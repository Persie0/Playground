package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.c83;
import p000.cu0;
import p000.do7;
import p000.e83;
import p000.fa4;
import p000.jj3;
import p000.kl7;
import p000.kn1;
import p000.ll7;
import p000.te1;
import p000.u91;
import p000.un1;
import p000.ux5;
import p000.vz1;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3231a implements jj3 {

    /* JADX INFO: renamed from: a */
    public final kn1 f48133a;

    /* JADX INFO: renamed from: b */
    public final int f48134b;

    /* JADX INFO: renamed from: c */
    public final BufferOverflow f48135c;

    public AbstractC3231a(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        this.f48133a = kn1Var;
        this.f48134b = i;
        this.f48135c = bufferOverflow;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // p000.jj3
    /* JADX INFO: renamed from: b */
    public final c83 mo38b(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        kn1 kn1Var2 = this.f48133a;
        kn1 kn1VarPlus = kn1Var.plus(kn1Var2);
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow3 = this.f48135c;
        int i2 = this.f48134b;
        if (bufferOverflow == bufferOverflow2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            bufferOverflow = bufferOverflow3;
        }
        return (fa4.m11650l(kn1VarPlus, kn1Var2) && i == i2 && bufferOverflow == bufferOverflow3) ? this : mo10649e(kn1VarPlus, i, bufferOverflow);
    }

    /* JADX INFO: renamed from: c */
    public String mo10647c() {
        return null;
    }

    @Override // p000.c83
    public Object collect(e83 e83Var, Continuation continuation) {
        Object objM23649s = vz1.m23649s(new ChannelFlow$collect$2(e83Var, this, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo10648d(ll7 ll7Var, Continuation continuation);

    /* JADX INFO: renamed from: e */
    public abstract AbstractC3231a mo10649e(kn1 kn1Var, int i, BufferOverflow bufferOverflow);

    /* JADX INFO: renamed from: f */
    public c83 mo10650f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public cu0 mo10651g(un1 un1Var) {
        int i = this.f48134b;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        kl7 kl7Var = new kl7(te1.m21970C(un1Var, this.f48133a), do7.m10525a(i, 4, this.f48135c));
        coroutineStart.invoke(channelFlow$collectToFun$1, kl7Var, kl7Var);
        return kl7Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo10647c = mo10647c();
        if (strMo10647c != null) {
            arrayList.add(strMo10647c);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f47685a;
        kn1 kn1Var = this.f48133a;
        if (kn1Var != emptyCoroutineContext) {
            arrayList.add("context=" + kn1Var);
        }
        int i = this.f48134b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.f48135c;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return ux5.m22992o(sb, u91.m22596N0(arrayList, ", ", null, null, null, 62), ']');
    }
}
