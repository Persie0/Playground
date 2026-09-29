package androidx.compose.p017ui.semantics;

import androidx.compose.p017ui.state.ToggleableState;
import androidx.compose.p017ui.text.C0689a;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6752c;
import p210k1.C6564b;
import p210k1.C6565c;
import p210k1.C6567e;
import p210k1.C6568f;
import p210k1.C6569g;
import p210k1.C6570h;
import p231l1.C7217k;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsProperties {

    /* JADX INFO: renamed from: a */
    public static final C0685a<List<String>> f4408a = new C0685a<>("ContentDescription", new InterfaceC2056p<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final List<? extends String> mo1337m0(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            C5207g.m11111f(list4, "childValue");
            if (list3 != null) {
                ArrayList arrayListM13454v0 = C6752c.m13454v0(list3);
                arrayListM13454v0.addAll(list4);
                list4 = arrayListM13454v0;
            }
            return list4;
        }
    });

    /* JADX INFO: renamed from: b */
    public static final C0685a<String> f4409b = new C0685a<>("StateDescription");

    /* JADX INFO: renamed from: c */
    public static final C0685a<C6568f> f4410c = new C0685a<>("ProgressBarRangeInfo");

    /* JADX INFO: renamed from: d */
    public static final C0685a<String> f4411d = new C0685a<>("PaneTitle", new InterfaceC2056p<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final String mo1337m0(String str, String str2) {
            C5207g.m11111f(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });

    /* JADX INFO: renamed from: e */
    public static final C0685a<C9072e> f4412e = new C0685a<>("SelectableGroup");

    /* JADX INFO: renamed from: f */
    public static final C0685a<C6564b> f4413f = new C0685a<>("CollectionInfo");

    /* JADX INFO: renamed from: g */
    public static final C0685a<C6565c> f4414g = new C0685a<>("CollectionItemInfo");

    /* JADX INFO: renamed from: h */
    public static final C0685a<C9072e> f4415h = new C0685a<>("Heading");

    /* JADX INFO: renamed from: i */
    public static final C0685a<C9072e> f4416i = new C0685a<>("Disabled");

    /* JADX INFO: renamed from: j */
    public static final C0685a<C6567e> f4417j = new C0685a<>("LiveRegion");

    /* JADX INFO: renamed from: k */
    public static final C0685a<Boolean> f4418k = new C0685a<>("Focused");

    /* JADX INFO: renamed from: l */
    public static final C0685a<Boolean> f4419l = new C0685a<>("IsContainer");

    /* JADX INFO: renamed from: m */
    public static final C0685a<C9072e> f4420m = new C0685a<>("InvisibleToUser", new InterfaceC2056p<C9072e, C9072e, C9072e>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final C9072e mo1337m0(C9072e c9072e, C9072e c9072e2) {
            C9072e c9072e3 = c9072e;
            C5207g.m11111f(c9072e2, "<anonymous parameter 1>");
            return c9072e3;
        }
    });

    /* JADX INFO: renamed from: n */
    public static final C0685a<C6570h> f4421n = new C0685a<>("HorizontalScrollAxisRange");

    /* JADX INFO: renamed from: o */
    public static final C0685a<C6570h> f4422o = new C0685a<>("VerticalScrollAxisRange");

    /* JADX INFO: renamed from: p */
    public static final C0685a<C9072e> f4423p = new C0685a<>("IsPopup", new InterfaceC2056p<C9072e, C9072e, C9072e>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final C9072e mo1337m0(C9072e c9072e, C9072e c9072e2) {
            C5207g.m11111f(c9072e2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: q */
    public static final C0685a<C6569g> f4424q;

    /* JADX INFO: renamed from: r */
    public static final C0685a<String> f4425r;

    /* JADX INFO: renamed from: s */
    public static final C0685a<List<C0689a>> f4426s;

    /* JADX INFO: renamed from: t */
    public static final C0685a<C0689a> f4427t;

    /* JADX INFO: renamed from: u */
    public static final C0685a<C7217k> f4428u;

    /* JADX INFO: renamed from: v */
    public static final C0685a<Boolean> f4429v;

    /* JADX INFO: renamed from: w */
    public static final C0685a<ToggleableState> f4430w;

    /* JADX INFO: renamed from: x */
    public static final C0685a<C9072e> f4431x;

    /* JADX INFO: renamed from: y */
    public static final C0685a<String> f4432y;

    static {
        C5207g.m11111f(new InterfaceC2056p<C9072e, C9072e, C9072e>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(C9072e c9072e, C9072e c9072e2) {
                C5207g.m11111f(c9072e2, "<anonymous parameter 1>");
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            }
        }, "mergePolicy");
        f4424q = new C0685a<>("Role", new InterfaceC2056p<C6569g, C6569g, C6569g>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C6569g mo1337m0(C6569g c6569g, C6569g c6569g2) {
                C6569g c6569g3 = c6569g;
                int i10 = c6569g2.f37368a;
                return c6569g3;
            }
        });
        f4425r = new C0685a<>("TestTag", new InterfaceC2056p<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final String mo1337m0(String str, String str2) {
                String str3 = str;
                C5207g.m11111f(str2, "<anonymous parameter 1>");
                return str3;
            }
        });
        f4426s = new C0685a<>("Text", new InterfaceC2056p<List<? extends C0689a>, List<? extends C0689a>, List<? extends C0689a>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final List<? extends C0689a> mo1337m0(List<? extends C0689a> list, List<? extends C0689a> list2) {
                List<? extends C0689a> list3 = list;
                List<? extends C0689a> list4 = list2;
                C5207g.m11111f(list4, "childValue");
                if (list3 != null) {
                    ArrayList arrayListM13454v0 = C6752c.m13454v0(list3);
                    arrayListM13454v0.addAll(list4);
                    list4 = arrayListM13454v0;
                }
                return list4;
            }
        });
        f4427t = new C0685a<>("EditableText");
        f4428u = new C0685a<>("TextSelectionRange");
        C5207g.m11111f(SemanticsPropertyKey$1.f4444b, "mergePolicy");
        f4429v = new C0685a<>("Selected");
        f4430w = new C0685a<>("ToggleableState");
        f4431x = new C0685a<>("Password");
        f4432y = new C0685a<>("Error");
        C5207g.m11111f(SemanticsPropertyKey$1.f4444b, "mergePolicy");
    }
}
