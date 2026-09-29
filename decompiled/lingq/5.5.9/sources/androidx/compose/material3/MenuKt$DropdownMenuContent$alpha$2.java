package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2057q;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import p374s.C8904e0;
import p374s.InterfaceC8929r;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
public final class MenuKt$DropdownMenuContent$alpha$2 extends Lambda implements InterfaceC2057q<Transition.InterfaceC0366b<Boolean>, InterfaceC0476a, Integer, InterfaceC8929r<Float>> {

    /* JADX INFO: renamed from: b */
    public static final MenuKt$DropdownMenuContent$alpha$2 f2777b = new MenuKt$DropdownMenuContent$alpha$2();

    public MenuKt$DropdownMenuContent$alpha$2() {
        super(3);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final InterfaceC8929r<Float> mo1343M(Transition.InterfaceC0366b<Boolean> interfaceC0366b, InterfaceC0476a interfaceC0476a, Integer num) {
        Transition.InterfaceC0366b<Boolean> interfaceC0366b2 = interfaceC0366b;
        InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
        num.intValue();
        C5207g.m11111f(interfaceC0366b2, "$this$animateFloat");
        interfaceC0476a2.mo1622c(896631233);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C8904e0 c8904e0M16734k1 = interfaceC0366b2.m1373b(Boolean.FALSE, Boolean.TRUE) ? C8573r0.m16734k1(30, 0, null, 6) : C8573r0.m16734k1(75, 0, null, 6);
        interfaceC0476a2.mo1661w();
        return c8904e0M16734k1;
    }
}
