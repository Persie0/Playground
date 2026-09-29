package p000;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes.dex */
public final class q83 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57377a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f57378b;

    public /* synthetic */ q83(int i, Ref$ObjectRef ref$ObjectRef) {
        this.f57377a = i;
        this.f57378b = ref$ObjectRef;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.f57377a;
        Ref$ObjectRef ref$ObjectRef = this.f57378b;
        switch (i) {
            case 0:
                ref$ObjectRef.f47718a = obj;
                throw new AbortFlowException(this);
            default:
                ref$ObjectRef.f47718a = obj;
                throw new AbortFlowException(this);
        }
    }
}
