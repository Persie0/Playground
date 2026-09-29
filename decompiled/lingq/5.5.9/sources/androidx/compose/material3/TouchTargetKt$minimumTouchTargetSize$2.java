package androidx.compose.material3;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2057q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m13365d2 = {"Landroidx/compose/ui/b;", "invoke", "(Landroidx/compose/ui/b;Landroidx/compose/runtime/a;I)Landroidx/compose/ui/b;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
final class TouchTargetKt$minimumTouchTargetSize$2 extends Lambda implements InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b> {

    /* JADX INFO: renamed from: b */
    public static final TouchTargetKt$minimumTouchTargetSize$2 f2856b = new TouchTargetKt$minimumTouchTargetSize$2();

    public TouchTargetKt$minimumTouchTargetSize$2() {
        super(3);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a, Integer num) {
        InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
        C0204c.m861u(num, interfaceC0500b, "$this$composed", interfaceC0476a2, -1937671640);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC0500b minimumTouchTargetModifier = ((Boolean) interfaceC0476a2.mo1648p(TouchTargetKt.f2854a)).booleanValue() ? new MinimumTouchTargetModifier(((InterfaceC0647n1) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4148p)).mo2138b()) : InterfaceC0500b.a.f3325a;
        interfaceC0476a2.mo1661w();
        return minimumTouchTargetModifier;
    }
}
