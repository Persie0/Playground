package p349qo;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC7116c;

/* JADX INFO: renamed from: qo.g */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8661g<T> extends InterfaceC7116c<T> {

    /* JADX INFO: renamed from: qo.g$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ InterfaceC7116c m16923a(InterfaceC8661g interfaceC8661g, CoroutineDispatcher coroutineDispatcher, int i10, BufferOverflow bufferOverflow, int i11) {
            CoroutineContext coroutineContext = coroutineDispatcher;
            if ((i11 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.f38093a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return interfaceC8661g.mo14365b(coroutineContext, i10, bufferOverflow);
        }
    }

    /* JADX INFO: renamed from: b */
    InterfaceC7116c<T> mo14365b(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow);
}
