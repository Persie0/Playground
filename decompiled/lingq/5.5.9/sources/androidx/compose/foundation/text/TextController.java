package androidx.compose.foundation.text;

import android.support.v4.media.AbstractC0140a;
import androidx.activity.result.C0204c;
import androidx.compose.foundation.layout.FillModifier;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SizeModifier;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.draw.C0501a;
import androidx.compose.p017ui.graphics.C0512a;
import androidx.compose.p017ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.AlignmentLineKt;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.NodeCoordinator;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.text.C0692c;
import androidx.compose.p017ui.text.C0693d;
import androidx.compose.p017ui.text.C0694e;
import androidx.compose.p017ui.text.MultiParagraphIntrinsics;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.text.style.TextForegroundStyle;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import dm.C5207g;
import dm.C5212l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6753d;
import p001a0.C0003b;
import p001a0.InterfaceC0004c;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5336s0;
import p081e0.InterfaceC5338t0;
import p127g1.C5656t;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5652p;
import p127g1.InterfaceC5653q;
import p231l1.C7214h;
import p231l1.C7216j;
import p231l1.C7218l;
import p328q1.C8471h;
import p328q1.C8472i;
import p328q1.C8476m;
import p338qd.C8573r0;
import p338qd.C8584v;
import p375s0.C8941c;
import p375s0.C8942d;
import p387t0.AbstractC9161o;
import p387t0.C9152j0;
import p387t0.C9169u;
import p387t0.InterfaceC9165q;
import p424v0.C9623g;
import p424v0.InterfaceC9621e;
import p445w1.C9798h;
import p470x1.C10014b;
import p470x1.C10020h;
import p470x1.C10022j;
import p470x1.InterfaceC10015c;
import p519z.C10423b;
import p519z.C10425d;
import p519z.InterfaceC10424c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class TextController implements InterfaceC5338t0 {

    /* JADX INFO: renamed from: a */
    public final TextState f2539a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0004c f2540b;

    /* JADX INFO: renamed from: c */
    public InterfaceC10424c f2541c;

    /* JADX INFO: renamed from: d */
    public final TextController$measurePolicy$1 f2542d = new InterfaceC5652p() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: a */
        public final InterfaceC5653q mo1328a(InterfaceC0524e interfaceC0524e, List<? extends InterfaceC5651o> list, long j10) {
            Pair pair;
            InterfaceC0004c interfaceC0004c;
            C5207g.m11111f(interfaceC0524e, "$this$measure");
            TextController textController = this.f2555a;
            textController.f2539a.f2567h.getValue();
            C9072e c9072e = C9072e.f47360a;
            TextState textState = textController.f2539a;
            C7216j c7216j = textState.f2564e;
            C7216j c7216jM19401a = textState.f2563d.m19401a(j10, interfaceC0524e.getLayoutDirection(), c7216j);
            if (!C5207g.m11106a(c7216j, c7216jM19401a)) {
                textState.f2561b.mo528n(c7216jM19401a);
                if (c7216j != null && !C5207g.m11106a(c7216j.f40590a.f4564a, c7216jM19401a.f40590a.f4564a) && (interfaceC0004c = textController.f2540b) != null) {
                    long j11 = textState.f2560a;
                    interfaceC0004c.m11g();
                }
            }
            textState.getClass();
            textState.f2566g.setValue(C9072e.f47360a);
            textState.f2564e = c7216jM19401a;
            int size = list.size();
            ArrayList arrayList = c7216jM19401a.f40595f;
            if (!(size >= arrayList.size())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            final ArrayList arrayList2 = new ArrayList(arrayList.size());
            int i10 = 0;
            for (int size2 = arrayList.size(); i10 < size2; size2 = size2) {
                C8942d c8942d = (C8942d) arrayList.get(i10);
                if (c8942d != null) {
                    InterfaceC5651o interfaceC5651o = list.get(i10);
                    float f3 = c8942d.f46896c;
                    float f10 = c8942d.f46894a;
                    int iFloor = (int) Math.floor(f3 - f10);
                    float f11 = c8942d.f46897d;
                    float f12 = c8942d.f46895b;
                    pair = new Pair(interfaceC5651o.mo2048w(C10014b.m18612b(iFloor, (int) Math.floor(f11 - f12), 5)), new C10020h(C8573r0.m16752r(C8573r0.m16710Y0(f10), C8573r0.m16710Y0(f12))));
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList2.add(pair);
                }
                i10++;
                arrayList = arrayList;
            }
            long j12 = c7216jM19401a.f40592c;
            return interfaceC0524e.m2043P((int) (j12 >> 32), C10022j.m18628b(j12), C6753d.m13462O0(new Pair(AlignmentLineKt.f3660a, Integer.valueOf(C8573r0.m16710Y0(c7216jM19401a.f40593d))), new Pair(AlignmentLineKt.f3661b, Integer.valueOf(C8573r0.m16710Y0(c7216jM19401a.f40594e)))), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(AbstractC0526g.a aVar) {
                    C5207g.m11111f(aVar, "$this$layout");
                    List<Pair<AbstractC0526g, C10020h>> list2 = arrayList2;
                    int size3 = list2.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        Pair<AbstractC0526g, C10020h> pair2 = list2.get(i11);
                        AbstractC0526g.a.m2058d(pair2.f38012a, pair2.f38013b.f50975a, 0.0f);
                    }
                    return C9072e.f47360a;
                }
            });
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: b */
        public final int mo1329b(NodeCoordinator nodeCoordinator, List list, int i10) {
            C5207g.m11111f(nodeCoordinator, "<this>");
            TextController textController = this.f2555a;
            textController.f2539a.f2563d.m19402b(nodeCoordinator.f3844g.f3747J);
            MultiParagraphIntrinsics multiParagraphIntrinsics = textController.f2539a.f2563d.f52267j;
            if (multiParagraphIntrinsics != null) {
                return C5212l.m11186z(multiParagraphIntrinsics.mo2563b());
            }
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }

        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: c */
        public final int mo1330c(NodeCoordinator nodeCoordinator, List list, int i10) {
            C5207g.m11111f(nodeCoordinator, "<this>");
            return C10022j.m18628b(this.f2555a.f2539a.f2563d.m19401a(C10014b.m18611a(0, i10, 0, Integer.MAX_VALUE), nodeCoordinator.f3844g.f3747J, null).f40592c);
        }

        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: d */
        public final int mo1331d(NodeCoordinator nodeCoordinator, List list, int i10) {
            C5207g.m11111f(nodeCoordinator, "<this>");
            TextController textController = this.f2555a;
            textController.f2539a.f2563d.m19402b(nodeCoordinator.f3844g.f3747J);
            MultiParagraphIntrinsics multiParagraphIntrinsics = textController.f2539a.f2563d.f52267j;
            if (multiParagraphIntrinsics != null) {
                return C5212l.m11186z(multiParagraphIntrinsics.mo2564c());
            }
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }

        @Override // p127g1.InterfaceC5652p
        /* JADX INFO: renamed from: e */
        public final int mo1332e(NodeCoordinator nodeCoordinator, List list, int i10) {
            C5207g.m11111f(nodeCoordinator, "<this>");
            return C10022j.m18628b(this.f2555a.f2539a.f2563d.m19401a(C10014b.m18611a(0, i10, 0, Integer.MAX_VALUE), nodeCoordinator.f3844g.f3747J, null).f40592c);
        }
    };

    /* JADX INFO: renamed from: e */
    public final InterfaceC0500b f2543e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0500b f2544f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0500b f2545g;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextController$a */
    public static final class C0446a implements InterfaceC10424c {

        /* JADX INFO: renamed from: a */
        public long f2546a;

        /* JADX INFO: renamed from: b */
        public long f2547b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC0004c f2549d;

        public C0446a(InterfaceC0004c interfaceC0004c) {
            this.f2549d = interfaceC0004c;
            int i10 = C8941c.f46891e;
            long j10 = C8941c.f46888b;
            this.f2546a = j10;
            this.f2547b = j10;
        }

        @Override // p519z.InterfaceC10424c
        /* JADX INFO: renamed from: a */
        public final void mo1542a() {
            long j10 = TextController.this.f2539a.f2560a;
            InterfaceC0004c interfaceC0004c = this.f2549d;
            if (SelectionRegistrarKt.m1546a(interfaceC0004c, j10)) {
                interfaceC0004c.m10f();
            }
        }

        @Override // p519z.InterfaceC10424c
        /* JADX INFO: renamed from: b */
        public final void mo1543b() {
            long j10 = TextController.this.f2539a.f2560a;
            InterfaceC0004c interfaceC0004c = this.f2549d;
            if (SelectionRegistrarKt.m1546a(interfaceC0004c, j10)) {
                interfaceC0004c.m10f();
            }
        }

        @Override // p519z.InterfaceC10424c
        /* JADX INFO: renamed from: c */
        public final void mo1544c(long j10) {
            TextController textController = TextController.this;
            InterfaceC5647k interfaceC5647k = textController.f2539a.f2562c;
            TextState textState = textController.f2539a;
            InterfaceC0004c interfaceC0004c = this.f2549d;
            if (interfaceC5647k != null) {
                if (!interfaceC5647k.mo2190q()) {
                    return;
                }
                if (TextController.m1535d(textController, j10, j10)) {
                    long j11 = textState.f2560a;
                    interfaceC0004c.m13i();
                } else {
                    interfaceC0004c.m14j();
                }
                this.f2546a = j10;
            }
            if (SelectionRegistrarKt.m1546a(interfaceC0004c, textState.f2560a)) {
                this.f2547b = C8941c.f46888b;
            }
        }

        @Override // p519z.InterfaceC10424c
        /* JADX INFO: renamed from: d */
        public final void mo1545d(long j10) {
            TextController textController = TextController.this;
            InterfaceC5647k interfaceC5647k = textController.f2539a.f2562c;
            if (interfaceC5647k != null) {
                if (!interfaceC5647k.mo2190q()) {
                    return;
                }
                long j11 = textController.f2539a.f2560a;
                InterfaceC0004c interfaceC0004c = this.f2549d;
                if (!SelectionRegistrarKt.m1546a(interfaceC0004c, j11)) {
                    return;
                }
                long jM17167f = C8941c.m17167f(this.f2547b, j10);
                this.f2547b = jM17167f;
                long jM17167f2 = C8941c.m17167f(this.f2546a, jM17167f);
                if (!TextController.m1535d(textController, this.f2546a, jM17167f2) && interfaceC0004c.m9e()) {
                    this.f2546a = jM17167f2;
                    this.f2547b = C8941c.f46888b;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.TextController$measurePolicy$1] */
    public TextController(TextState textState) {
        this.f2539a = textState;
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        InterfaceC0500b interfaceC0500bM1948a = C0501a.m1948a(C0512a.m2001b(aVar, 0.0f, null, false, 131071), new InterfaceC2052l<InterfaceC9621e, C9072e>() { // from class: androidx.compose.foundation.text.TextController$drawTextAndSelectionBehind$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0096  */
            /* JADX WARN: Code duplicated, block: B:33:0x009d  */
            /* JADX WARN: Code duplicated, block: B:34:0x009f  */
            /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
            /* JADX WARN: Code duplicated, block: B:53:0x00ee A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:58:0x0105  */
            /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:50:0x00e1, B:55:0x00f1, B:57:0x00fb, B:60:0x0108, B:62:0x0110, B:61:0x010d), top: B:74:0x00e1 }] */
            /* JADX WARN: Code duplicated, block: B:61:0x010d A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:50:0x00e1, B:55:0x00f1, B:57:0x00fb, B:60:0x0108, B:62:0x0110, B:61:0x010d), top: B:74:0x00e1 }] */
            /* JADX WARN: Code duplicated, block: B:64:0x0119  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC9621e interfaceC9621e) {
                boolean z10;
                C0693d c0693d;
                boolean z11;
                C9798h c9798h;
                C9798h c9798h2;
                C9152j0 c9152j0;
                C9152j0 c9152j1;
                AbstractC0140a abstractC0140a;
                AbstractC0140a abstractC0140a2;
                AbstractC9161o abstractC9161oM14528a;
                TextForegroundStyle.C0710a c0710a;
                TextForegroundStyle textForegroundStyle;
                long jMo2615a;
                float fMo2614A;
                boolean z12;
                Map<Long, C0003b> mapM12h;
                InterfaceC9621e interfaceC9621e2 = interfaceC9621e;
                C5207g.m11111f(interfaceC9621e2, "$this$drawBehind");
                TextController textController = this.f2554b;
                TextState textState2 = textController.f2539a;
                C7216j c7216j = textState2.f2564e;
                if (c7216j != null) {
                    textState2.f2566g.getValue();
                    C9072e c9072e = C9072e.f47360a;
                    InterfaceC0004c interfaceC0004c = textController.f2540b;
                    TextState textState3 = textController.f2539a;
                    C0003b c0003b = (interfaceC0004c == null || (mapM12h = interfaceC0004c.m12h()) == null) ? null : mapM12h.get(Long.valueOf(textState3.f2560a));
                    textState3.getClass();
                    if (c0003b != null) {
                        throw null;
                    }
                    InterfaceC9165q interfaceC9165qMo18080b = interfaceC9621e2.mo12676l0().mo18080b();
                    C5207g.m11111f(interfaceC9165qMo18080b, "canvas");
                    long j10 = c7216j.f40592c;
                    float f3 = (int) (j10 >> 32);
                    C0692c c0692c = c7216j.f40591b;
                    try {
                        if (!(f3 < c0692c.f4559d)) {
                            if (!(c0692c.f4558c || ((float) C10022j.m18628b(j10)) < c0692c.f4560e)) {
                                z10 = false;
                            }
                            c0693d = c7216j.f40590a;
                            if (z10) {
                                if (c0693d.f4569f == 3) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                C8942d c8942dM11165l = C5212l.m11165l(C8941c.f46888b, C8584v.m16788m(f3, C10022j.m18628b(j10)));
                                interfaceC9165qMo18080b.mo17420d();
                                interfaceC9165qMo18080b.m17485j(c8942dM11165l, 1);
                            }
                            C7214h c7214h = c0693d.f4565b.f40600a;
                            c9798h = c7214h.f40582m;
                            if (c9798h == null) {
                                c9798h = C9798h.f49911b;
                            }
                            c9798h2 = c9798h;
                            c9152j0 = c7214h.f40583n;
                            if (c9152j0 == null) {
                                c9152j0 = C9152j0.f47679d;
                            }
                            c9152j1 = c9152j0;
                            abstractC0140a = c7214h.f40584o;
                            if (abstractC0140a == null) {
                                abstractC0140a = C9623g.f49295a;
                            }
                            abstractC0140a2 = abstractC0140a;
                            abstractC9161oM14528a = c7214h.m14528a();
                            c0710a = TextForegroundStyle.C0710a.f4688a;
                            textForegroundStyle = c7214h.f40570a;
                            if (abstractC9161oM14528a != null) {
                                if (textForegroundStyle != c0710a) {
                                    fMo2614A = textForegroundStyle.mo2614A();
                                } else {
                                    fMo2614A = 1.0f;
                                }
                                C0692c.m2585b(c7216j.f40591b, interfaceC9165qMo18080b, abstractC9161oM14528a, fMo2614A, c9152j1, c9798h2, abstractC0140a2);
                            } else {
                                if (textForegroundStyle != c0710a) {
                                    jMo2615a = textForegroundStyle.mo2615a();
                                } else {
                                    jMo2615a = C9169u.f47699b;
                                }
                                C0692c.m2584a(c7216j.f40591b, interfaceC9165qMo18080b, jMo2615a, c9152j1, c9798h2, abstractC0140a2);
                            }
                            if (z11) {
                                interfaceC9165qMo18080b.mo17428o();
                            }
                        }
                        abstractC9161oM14528a = c7214h.m14528a();
                        c0710a = TextForegroundStyle.C0710a.f4688a;
                        textForegroundStyle = c7214h.f40570a;
                        if (abstractC9161oM14528a != null) {
                            if (textForegroundStyle != c0710a) {
                                fMo2614A = textForegroundStyle.mo2614A();
                            } else {
                                fMo2614A = 1.0f;
                            }
                            C0692c.m2585b(c7216j.f40591b, interfaceC9165qMo18080b, abstractC9161oM14528a, fMo2614A, c9152j1, c9798h2, abstractC0140a2);
                        } else {
                            if (textForegroundStyle != c0710a) {
                                jMo2615a = textForegroundStyle.mo2615a();
                            } else {
                                jMo2615a = C9169u.f47699b;
                            }
                            C0692c.m2584a(c7216j.f40591b, interfaceC9165qMo18080b, jMo2615a, c9152j1, c9798h2, abstractC0140a2);
                        }
                        if (z11) {
                            interfaceC9165qMo18080b.mo17428o();
                        }
                    } catch (Throwable th2) {
                        if (z11) {
                            interfaceC9165qMo18080b.mo17428o();
                        }
                        throw th2;
                    }
                    z10 = true;
                    c0693d = c7216j.f40590a;
                    if (z10) {
                        z11 = false;
                    } else {
                        if (c0693d.f4569f == 3) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        C8942d c8942dM11165l2 = C5212l.m11165l(C8941c.f46888b, C8584v.m16788m(f3, C10022j.m18628b(j10)));
                        interfaceC9165qMo18080b.mo17420d();
                        interfaceC9165qMo18080b.m17485j(c8942dM11165l2, 1);
                    }
                    C7214h c7214h2 = c0693d.f4565b.f40600a;
                    c9798h = c7214h2.f40582m;
                    if (c9798h == null) {
                        c9798h = C9798h.f49911b;
                    }
                    c9798h2 = c9798h;
                    c9152j0 = c7214h2.f40583n;
                    if (c9152j0 == null) {
                        c9152j0 = C9152j0.f47679d;
                    }
                    c9152j1 = c9152j0;
                    abstractC0140a = c7214h2.f40584o;
                    if (abstractC0140a == null) {
                        abstractC0140a = C9623g.f49295a;
                    }
                    abstractC0140a2 = abstractC0140a;
                }
                return C9072e.f47360a;
            }
        });
        InterfaceC2052l<InterfaceC5647k, C9072e> interfaceC2052l = new InterfaceC2052l<InterfaceC5647k, C9072e>() { // from class: androidx.compose.foundation.text.TextController$coreModifiers$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
                InterfaceC0004c interfaceC0004c;
                InterfaceC5647k interfaceC5647k2 = interfaceC5647k;
                C5207g.m11111f(interfaceC5647k2, "it");
                TextController textController = this.f2550b;
                TextState textState2 = textController.f2539a;
                textState2.f2562c = interfaceC5647k2;
                if (SelectionRegistrarKt.m1546a(textController.f2540b, textState2.f2560a)) {
                    long jMo2173b = interfaceC5647k2.mo2173b(C8941c.f46888b);
                    TextState textState3 = textController.f2539a;
                    if (!C8941c.m17162a(jMo2173b, textState3.f2565f) && (interfaceC0004c = textController.f2540b) != null) {
                        interfaceC0004c.m7c();
                    }
                    textState3.f2565f = jMo2173b;
                }
                return C9072e.f47360a;
            }
        };
        C5207g.m11111f(interfaceC0500bM1948a, "<this>");
        this.f2543e = interfaceC0500bM1948a.mo1929K(new C5656t(interfaceC2052l, InspectableValueKt.f4184a));
        this.f2544f = C5212l.m11163j0(aVar, false, new TextController$createSemanticsModifierFor$1(textState.f2563d.f52258a, this));
        this.f2545g = aVar;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1535d(TextController textController, long j10, long j11) {
        C7216j c7216j = textController.f2539a.f2564e;
        if (c7216j != null) {
            int length = c7216j.f40590a.f4564a.f4523a.length();
            int iM14537f = c7216j.m14537f(j10);
            int iM14537f2 = c7216j.m14537f(j11);
            int i10 = length - 1;
            if (iM14537f >= i10 && iM14537f2 >= i10) {
                return true;
            }
            if (iM14537f < 0 && iM14537f2 < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: a */
    public final void mo1536a() {
        this.f2539a.getClass();
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: b */
    public final void mo1537b() {
        this.f2539a.getClass();
    }

    @Override // p081e0.InterfaceC5338t0
    /* JADX INFO: renamed from: c */
    public final void mo1538c() {
        InterfaceC0004c interfaceC0004c = this.f2540b;
        if (interfaceC0004c != null) {
            TextState textState = this.f2539a;
            long j10 = textState.f2560a;
            interfaceC0004c.m5a();
            textState.getClass();
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0500b m1539e() {
        C10423b c10423b = this.f2539a.f2563d;
        final C7218l c7218l = c10423b.f52259b;
        final int i10 = c10423b.f52261d;
        InterfaceC0500b interfaceC0500b = this.f2543e;
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(c7218l, "textStyle");
        final int i11 = Integer.MAX_VALUE;
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, 408240218);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                int i12 = i10;
                int i13 = i11;
                C8584v.m16781D(i12, i13);
                if (i12 == 1 && i13 == Integer.MAX_VALUE) {
                    InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                    interfaceC0476a2.mo1661w();
                    return aVar;
                }
                InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4137e);
                AbstractC0696b.a aVar2 = (AbstractC0696b.a) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4140h);
                LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a2.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0476a2.mo1622c(511388516);
                C7218l c7218l2 = c7218l;
                boolean zMo1665y = interfaceC0476a2.mo1665y(c7218l2) | interfaceC0476a2.mo1665y(layoutDirection);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                if (zMo1665y || objMo1624d == c10586a) {
                    objMo1624d = C0694e.m2587a(c7218l2, layoutDirection);
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                C7218l c7218l3 = (C7218l) objMo1624d;
                interfaceC0476a2.mo1622c(511388516);
                boolean zMo1665y2 = interfaceC0476a2.mo1665y(aVar2) | interfaceC0476a2.mo1665y(c7218l3);
                Object objMo1624d2 = interfaceC0476a2.mo1624d();
                if (zMo1665y2 || objMo1624d2 == c10586a) {
                    C7214h c7214h = c7218l3.f40600a;
                    AbstractC0696b abstractC0696b = c7214h.f40575f;
                    C8476m c8476m = c7214h.f40572c;
                    if (c8476m == null) {
                        c8476m = C8476m.f45650f;
                    }
                    C8471h c8471h = c7214h.f40573d;
                    int i14 = c8471h != null ? c8471h.f45643a : 0;
                    C8472i c8472i = c7214h.f40574e;
                    objMo1624d2 = aVar2.mo2595a(abstractC0696b, c8476m, i14, c8472i != null ? c8472i.f45644a : 1);
                    interfaceC0476a2.mo1655t(objMo1624d2);
                }
                interfaceC0476a2.mo1661w();
                InterfaceC5301c1 interfaceC5301c1 = (InterfaceC5301c1) objMo1624d2;
                Object[] objArr = {interfaceC10015c, aVar2, c7218l2, layoutDirection, interfaceC5301c1.getValue()};
                interfaceC0476a2.mo1622c(-568225417);
                boolean zMo1665y3 = false;
                for (int i15 = 0; i15 < 5; i15++) {
                    zMo1665y3 |= interfaceC0476a2.mo1665y(objArr[i15]);
                }
                Object objMo1624d3 = interfaceC0476a2.mo1624d();
                if (zMo1665y3 || objMo1624d3 == c10586a) {
                    objMo1624d3 = Integer.valueOf(C10022j.m18628b(C10425d.m19403a(c7218l3, interfaceC10015c, aVar2, C10425d.f52269a, 1)));
                    interfaceC0476a2.mo1655t(objMo1624d3);
                }
                interfaceC0476a2.mo1661w();
                int iIntValue = ((Number) objMo1624d3).intValue();
                Object[] objArr2 = {interfaceC10015c, aVar2, c7218l2, layoutDirection, interfaceC5301c1.getValue()};
                interfaceC0476a2.mo1622c(-568225417);
                boolean zMo1665y4 = false;
                for (int i16 = 0; i16 < 5; i16++) {
                    zMo1665y4 |= interfaceC0476a2.mo1665y(objArr2[i16]);
                }
                Object objMo1624d4 = interfaceC0476a2.mo1624d();
                if (zMo1665y4 || objMo1624d4 == c10586a) {
                    StringBuilder sb2 = new StringBuilder();
                    String str = C10425d.f52269a;
                    sb2.append(str);
                    sb2.append('\n');
                    sb2.append(str);
                    objMo1624d4 = Integer.valueOf(C10022j.m18628b(C10425d.m19403a(c7218l3, interfaceC10015c, aVar2, sb2.toString(), 2)));
                    interfaceC0476a2.mo1655t(objMo1624d4);
                }
                interfaceC0476a2.mo1661w();
                int iIntValue2 = ((Number) objMo1624d4).intValue() - iIntValue;
                Integer numValueOf = i12 == 1 ? null : Integer.valueOf(((i12 - 1) * iIntValue2) + iIntValue);
                Integer numValueOf2 = i13 != Integer.MAX_VALUE ? Integer.valueOf(((i13 - 1) * iIntValue2) + iIntValue) : null;
                float fMo1460W = numValueOf != null ? interfaceC10015c.mo1460W(numValueOf.intValue()) : Float.NaN;
                float fMo1460W2 = numValueOf2 != null ? interfaceC10015c.mo1460W(numValueOf2.intValue()) : Float.NaN;
                FillModifier fillModifier = SizeKt.f2390a;
                SizeModifier sizeModifier = new SizeModifier(0.0f, fMo1460W, 0.0f, fMo1460W2, InspectableValueKt.f4184a, 5);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                interfaceC0476a2.mo1661w();
                return sizeModifier;
            }
        }).mo1929K(this.f2544f).mo1929K(this.f2545g);
    }

    /* JADX INFO: renamed from: f */
    public final void m1540f(C10423b c10423b) {
        TextState textState = this.f2539a;
        if (textState.f2563d == c10423b) {
            return;
        }
        textState.f2567h.setValue(C9072e.f47360a);
        textState.f2563d = c10423b;
        this.f2544f = C5212l.m11163j0(InterfaceC0500b.a.f3325a, false, new TextController$createSemanticsModifierFor$1(c10423b.f52258a, this));
    }

    /* JADX INFO: renamed from: g */
    public final void m1541g(InterfaceC0004c interfaceC0004c) {
        this.f2540b = interfaceC0004c;
        InterfaceC0500b interfaceC0500bM2032a = InterfaceC0500b.a.f3325a;
        if (interfaceC0004c != null) {
            C0446a c0446a = new C0446a(interfaceC0004c);
            this.f2541c = c0446a;
            interfaceC0500bM2032a = SuspendingPointerInputFilterKt.m2032a(interfaceC0500bM2032a, c0446a, new TextController$update$2(this, null));
        }
        this.f2545g = interfaceC0500bM2032a;
    }
}
