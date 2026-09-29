package p210k1;

import androidx.compose.p017ui.semantics.C0685a;
import androidx.compose.p017ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1;
import androidx.compose.p017ui.text.C0689a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.util.List;
import p210k1.C6563a;
import p231l1.C7216j;
import sl.InterfaceC9068a;

/* JADX INFO: renamed from: k1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6571i {

    /* JADX INFO: renamed from: a */
    public static final C0685a<C6563a<InterfaceC2052l<List<C7216j>, Boolean>>> f37372a;

    /* JADX INFO: renamed from: b */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37373b;

    /* JADX INFO: renamed from: c */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37374c;

    /* JADX INFO: renamed from: d */
    public static final C0685a<C6563a<InterfaceC2056p<Float, Float, Boolean>>> f37375d;

    /* JADX INFO: renamed from: e */
    public static final C0685a<C6563a<InterfaceC2052l<Float, Boolean>>> f37376e;

    /* JADX INFO: renamed from: f */
    public static final C0685a<C6563a<InterfaceC2057q<Integer, Integer, Boolean, Boolean>>> f37377f;

    /* JADX INFO: renamed from: g */
    public static final C0685a<C6563a<InterfaceC2052l<C0689a, Boolean>>> f37378g;

    /* JADX INFO: renamed from: h */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37379h;

    /* JADX INFO: renamed from: i */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37380i;

    /* JADX INFO: renamed from: j */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37381j;

    /* JADX INFO: renamed from: k */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37382k;

    /* JADX INFO: renamed from: l */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37383l;

    /* JADX INFO: renamed from: m */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37384m;

    /* JADX INFO: renamed from: n */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37385n;

    /* JADX INFO: renamed from: o */
    public static final C0685a<List<C6566d>> f37386o;

    /* JADX INFO: renamed from: p */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37387p;

    /* JADX INFO: renamed from: q */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37388q;

    /* JADX INFO: renamed from: r */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37389r;

    /* JADX INFO: renamed from: s */
    public static final C0685a<C6563a<InterfaceC2041a<Boolean>>> f37390s;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new InterfaceC2056p<C6563a<InterfaceC9068a<? extends Boolean>>, C6563a<InterfaceC9068a<? extends Boolean>>, C6563a<InterfaceC9068a<? extends Boolean>>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C6563a<InterfaceC9068a<? extends Boolean>> mo1337m0(C6563a<InterfaceC9068a<? extends Boolean>> c6563a, C6563a<InterfaceC9068a<? extends Boolean>> c6563a2) {
                String str;
                InterfaceC9068a interfaceC9068a;
                C6563a<InterfaceC9068a<? extends Boolean>> c6563a3 = c6563a;
                C6563a<InterfaceC9068a<? extends Boolean>> c6563a4 = c6563a2;
                C5207g.m11111f(c6563a4, "childValue");
                if (c6563a3 == null || (str = c6563a3.f37362a) == null) {
                    str = c6563a4.f37362a;
                }
                if (c6563a3 == null || (interfaceC9068a = c6563a3.f37363b) == null) {
                    interfaceC9068a = c6563a4.f37363b;
                }
                return new C6563a<>(str, interfaceC9068a);
            }
        };
        f37372a = new C0685a<>("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        f37373b = new C0685a<>("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        f37374c = new C0685a<>("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        f37375d = new C0685a<>("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        f37376e = new C0685a<>("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        f37377f = new C0685a<>("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        f37378g = new C0685a<>("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        f37379h = new C0685a<>("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        f37380i = new C0685a<>("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        f37381j = new C0685a<>("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        f37382k = new C0685a<>("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        f37383l = new C0685a<>("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        f37384m = new C0685a<>("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        f37385n = new C0685a<>("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        f37386o = new C0685a<>("CustomActions");
        f37387p = new C0685a<>("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        f37388q = new C0685a<>("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        f37389r = new C0685a<>("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        f37390s = new C0685a<>("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
    }
}
