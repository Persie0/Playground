package androidx.view.compose;

import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C0484f;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.view.C1052r;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import dm.C5207g;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.C7135p;
import p081e0.InterfaceC5312g0;

/* JADX INFO: renamed from: androidx.lifecycle.compose.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1026a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5312g0 m3932a(C7135p c7135p, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(c7135p, "<this>");
        interfaceC0476a.mo1622c(743249048);
        InterfaceC1051q interfaceC1051q = (InterfaceC1051q) interfaceC0476a.mo1648p(AndroidCompositionLocals_androidKt.f4086d);
        Lifecycle.State state = Lifecycle.State.STARTED;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f38093a;
        Object value = c7135p.getValue();
        C1052r c1052rMo786G = interfaceC1051q.mo786G();
        C5207g.m11111f(c1052rMo786G, "lifecycle");
        interfaceC0476a.mo1622c(1977777920);
        InterfaceC5312g0 interfaceC5312g0M1849a = C0484f.m1849a(value, new Object[]{c7135p, c1052rMo786G, state, emptyCoroutineContext}, new FlowExtKt$collectAsStateWithLifecycle$1(c1052rMo786G, state, emptyCoroutineContext, c7135p, null), interfaceC0476a);
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1661w();
        return interfaceC5312g0M1849a;
    }
}
