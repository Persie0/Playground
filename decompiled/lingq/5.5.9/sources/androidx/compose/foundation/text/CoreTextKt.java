package androidx.compose.foundation.text;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5652p;
import p127g1.InterfaceC5653q;
import p231l1.C7213g;
import p338qd.C8573r0;
import p470x1.C10013a;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextKt {

    /* JADX INFO: renamed from: a */
    public static final Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> f2526a;

    static {
        EmptyList emptyList = EmptyList.f38032a;
        f2526a = new Pair<>(emptyList, emptyList);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1534a(final C0689a c0689a, final List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>> list, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(c0689a, "text");
        C5207g.m11111f(list, "inlineContents");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-110905764);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>> bVar = list.get(i11);
            InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e> interfaceC2057q2 = bVar.f4536a;
            CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = new InterfaceC5652p() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2
                @Override // p127g1.InterfaceC5652p
                /* JADX INFO: renamed from: a */
                public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list2, long j10) {
                    C5207g.m11111f(interfaceC0524e, "$this$Layout");
                    final ArrayList arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        arrayList.add(list2.get(i12).mo2048w(j10));
                    }
                    return interfaceC0524e.m2043P(C10013a.m18603h(j10), C10013a.m18602g(j10), C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(AbstractC0526g.a aVar) {
                            AbstractC0526g.a aVar2 = aVar;
                            C5207g.m11111f(aVar2, "$this$layout");
                            List<AbstractC0526g> list3 = arrayList;
                            int size3 = list3.size();
                            for (int i13 = 0; i13 < size3; i13++) {
                                AbstractC0526g.a.m2059e(aVar2, list3.get(i13), 0, 0);
                            }
                            return C9072e.f47360a;
                        }
                    });
                }
            };
            composerImplMo1636j.mo1622c(-1323940314);
            InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
            InterfaceC10015c interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4137e);
            LayoutDirection layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
            InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
            ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(aVar);
            if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.mo1640l();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(interfaceC2041a);
            } else {
                composerImplMo1636j.mo1653s();
            }
            C8573r0.m16714a1(composerImplMo1636j, coreTextKt$InlineChildren$1$2, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            composableLambdaImplM2036a.mo1343M(new C5340u0(composerImplMo1636j), composerImplMo1636j, 0);
            composerImplMo1636j.mo1622c(2058660585);
            interfaceC2057q2.mo1343M(c0689a.subSequence(bVar.f4537b, bVar.f4538c).f4523a, composerImplMo1636j, 0);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
        }
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int iM16737l1 = C8573r0.m16737l1(i10 | 1);
                CoreTextKt.m1534a(c0689a, list, interfaceC0476a2, iM16737l1);
                return C9072e.f47360a;
            }
        };
    }
}
