package p060d1;

import androidx.compose.p017ui.input.pointer.PointerEventPass;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import cm.InterfaceC2056p;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p375s0.C8944f;
import p464wl.InterfaceC9968c;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: d1.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5016c extends InterfaceC10015c {
    /* JADX INFO: renamed from: F */
    default <T> Object mo2025F(long j10, InterfaceC2056p<? super InterfaceC5016c, ? super InterfaceC9968c<? super T>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super T> interfaceC9968c) {
        return interfaceC2056p.mo1337m0(this, interfaceC9968c);
    }

    /* JADX INFO: renamed from: H */
    Object mo2026H(PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl);

    /* JADX INFO: renamed from: I */
    C5024k mo2027I();

    /* JADX INFO: renamed from: c */
    long mo2028c();

    InterfaceC0647n1 getViewConfiguration();

    /* JADX INFO: renamed from: n0 */
    default long mo2030n0() {
        int i10 = C8944f.f46908d;
        return C8944f.f46906b;
    }
}
