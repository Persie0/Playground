package androidx.compose.material3;

import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import cm.InterfaceC2057q;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p036c0.C1655k;
import p081e0.C5304d1;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p387t0.C9144f0;
import p387t0.InterfaceC9154k0;
import p494y.AbstractC10270a;
import p494y.C10272c;
import p494y.C10275f;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ShapesKt {

    /* JADX INFO: renamed from: a */
    public static final C5304d1 f2783a = CompositionLocalKt.m1693c(new InterfaceC2041a<C1655k>() { // from class: androidx.compose.material3.ShapesKt$LocalShapes$1
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C1655k mo807E() {
            return new C1655k(0);
        }
    });

    /* JADX INFO: renamed from: androidx.compose.material3.ShapesKt$a */
    public /* synthetic */ class C0459a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2785a;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;
            iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;
            iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;
            iArr[ShapeKeyTokens.CornerFull.ordinal()] = 5;
            iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 6;
            iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;
            iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;
            iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 9;
            iArr[ShapeKeyTokens.CornerNone.ordinal()] = 10;
            iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 11;
            f2785a = iArr;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC9154k0 m1568a(ShapeKeyTokens shapeKeyTokens, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(shapeKeyTokens, "<this>");
        interfaceC0476a.mo1622c(-612531606);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C1655k c1655k = (C1655k) interfaceC0476a.mo1648p(f2783a);
        C5207g.m11111f(c1655k, "<this>");
        int i10 = C0459a.f2785a[shapeKeyTokens.ordinal()];
        AbstractC10270a abstractC10270a = c1655k.f9259a;
        AbstractC10270a abstractC10270a2 = c1655k.f9263e;
        AbstractC10270a abstractC10270a3 = c1655k.f9262d;
        InterfaceC9154k0 interfaceC9154k0M1569b = abstractC10270a;
        switch (i10) {
            case 1:
                interfaceC9154k0M1569b = abstractC10270a2;
                break;
            case 2:
                interfaceC9154k0M1569b = m1569b(abstractC10270a2);
                break;
            case 3:
                break;
            case 4:
                interfaceC9154k0M1569b = m1569b(abstractC10270a);
                break;
            case 5:
                interfaceC9154k0M1569b = C10275f.f51719a;
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                interfaceC9154k0M1569b = abstractC10270a3;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C5207g.m11111f(abstractC10270a3, "<this>");
                float f3 = (float) 0.0d;
                interfaceC9154k0M1569b = AbstractC10270a.m19240c(abstractC10270a3, new C10272c(f3), null, new C10272c(f3), 6);
                break;
            case 8:
                interfaceC9154k0M1569b = m1569b(abstractC10270a3);
                break;
            case 9:
                interfaceC9154k0M1569b = c1655k.f9261c;
                break;
            case 10:
                interfaceC9154k0M1569b = C9144f0.f47650a;
                break;
            case 11:
                interfaceC9154k0M1569b = c1655k.f9260b;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        interfaceC0476a.mo1661w();
        return interfaceC9154k0M1569b;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC10270a m1569b(AbstractC10270a abstractC10270a) {
        C5207g.m11111f(abstractC10270a, "<this>");
        float f3 = (float) 0.0d;
        return AbstractC10270a.m19240c(abstractC10270a, null, new C10272c(f3), new C10272c(f3), 3);
    }
}
