package p349qo;

import dm.C5207g;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7142w;

/* JADX INFO: renamed from: qo.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C8666l extends C7138s<Integer> implements InterfaceC7142w<Integer> {
    public C8666l(int i10) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        mo14371k(Integer.valueOf(i10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7142w
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            try {
                Object[] objArr = this.f40375h;
                C5207g.m11108c(objArr);
                numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f40376i + ((long) ((int) ((m14395q() + ((long) this.f40378k)) - this.f40376i)))) - 1)) & (objArr.length - 1)]).intValue());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return numValueOf;
    }
}
