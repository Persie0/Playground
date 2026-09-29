package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.aq4;
import p000.ea4;
import p000.ts5;
import p000.tw4;
import p000.vi3;
import p000.xc9;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C0183x8f2ae8f3 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ tw4 f2930i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183x8f2ae8f3(tw4 tw4Var) {
        super(1, ea4.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f2930i = tw4Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        float[] fArr = ((ts5) obj).f62824a;
        aq4 aq4Var = (aq4) ((xc9) this.f2930i.f63009M).getValue();
        if (aq4Var != null) {
            if (!aq4Var.mo1691n()) {
                aq4Var = null;
            }
            if (aq4Var != null) {
                aq4Var.mo1682g(fArr);
            }
        }
        return xfa.f68157a;
    }
}
