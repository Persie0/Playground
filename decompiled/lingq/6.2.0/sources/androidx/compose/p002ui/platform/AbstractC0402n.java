package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.Owner;
import p000.C3042gl;
import p000.a02;
import p000.ki5;
import p000.pk9;
import p000.pvc;
import p000.tj3;
import p000.vh9;
import p000.x18;
import p000.xfa;
import p000.ye1;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0402n {

    /* JADX INFO: renamed from: a */
    public static final vh9 f4809a = new vh9(CompositionLocalsKt$LocalAccessibilityManager$1.f4541b);

    /* JADX INFO: renamed from: b */
    public static final vh9 f4810b = new vh9(CompositionLocalsKt$LocalAutofill$1.f4542b);

    /* JADX INFO: renamed from: c */
    public static final vh9 f4811c = new vh9(CompositionLocalsKt$LocalAutofillTree$1.f4544b);

    /* JADX INFO: renamed from: d */
    public static final vh9 f4812d = new vh9(CompositionLocalsKt$LocalAutofillManager$1.f4543b);

    /* JADX INFO: renamed from: e */
    public static final vh9 f4813e = new vh9(CompositionLocalsKt$LocalClipboardManager$1.f4546b);

    /* JADX INFO: renamed from: f */
    public static final vh9 f4814f = new vh9(CompositionLocalsKt$LocalClipboard$1.f4545b);

    /* JADX INFO: renamed from: g */
    public static final vh9 f4815g = new vh9(CompositionLocalsKt$LocalGraphicsContext$1.f4552b);

    /* JADX INFO: renamed from: h */
    public static final vh9 f4816h = new vh9(CompositionLocalsKt$LocalDensity$1.f4548b);

    /* JADX INFO: renamed from: i */
    public static final vh9 f4817i = new vh9(CompositionLocalsKt$LocalFocusManager$1.f4549b);

    /* JADX INFO: renamed from: j */
    public static final vh9 f4818j = new vh9(CompositionLocalsKt$LocalFontLoader$1.f4551b);

    /* JADX INFO: renamed from: k */
    public static final vh9 f4819k = new vh9(CompositionLocalsKt$LocalFontFamilyResolver$1.f4550b);

    /* JADX INFO: renamed from: l */
    public static final vh9 f4820l = new vh9(CompositionLocalsKt$LocalHapticFeedback$1.f4553b);

    /* JADX INFO: renamed from: m */
    public static final vh9 f4821m = new vh9(CompositionLocalsKt$LocalInputModeManager$1.f4554b);

    /* JADX INFO: renamed from: n */
    public static final vh9 f4822n = new vh9(CompositionLocalsKt$LocalLayoutDirection$1.f4555b);

    /* JADX INFO: renamed from: o */
    public static final vh9 f4823o = new vh9(CompositionLocalsKt$LocalProvidableLocaleList$1.f4558b);

    /* JADX INFO: renamed from: p */
    public static final zf1 f4824p = new zf1(CompositionLocalsKt$LocalLocale$1.f4556b);

    /* JADX INFO: renamed from: q */
    public static final vh9 f4825q = new vh9(CompositionLocalsKt$LocalTextInputService$1.f4561b);

    /* JADX INFO: renamed from: r */
    public static final vh9 f4826r = new vh9(CompositionLocalsKt$LocalSoftwareKeyboardController$1.f4560b);

    /* JADX INFO: renamed from: s */
    public static final vh9 f4827s = new vh9(CompositionLocalsKt$LocalTextToolbar$1.f4562b);

    /* JADX INFO: renamed from: t */
    public static final vh9 f4828t = new vh9(CompositionLocalsKt$LocalUriHandler$1.f4563b);

    /* JADX INFO: renamed from: u */
    public static final vh9 f4829u = new vh9(CompositionLocalsKt$LocalViewConfiguration$1.f4564b);

    /* JADX INFO: renamed from: v */
    public static final vh9 f4830v = new vh9(CompositionLocalsKt$LocalWindowInfo$1.f4565b);

    /* JADX INFO: renamed from: w */
    public static final vh9 f4831w = new vh9(CompositionLocalsKt$LocalPointerIconService$1.f4557b);

    /* JADX INFO: renamed from: x */
    public static final zf1 f4832x = new zf1(CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1.f4559b);

    /* JADX INFO: renamed from: y */
    public static final vh9 f4833y = new vh9(CompositionLocalsKt$LocalCursorBlinkEnabled$1.f4547b);

    /* JADX INFO: renamed from: a */
    public static final void m1804a(final Owner owner, final C3042gl c3042gl, final zi3 zi3Var, ye1 ye1Var, final int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1925803616);
        int i2 = (tj3Var.m22120g(owner) ? 4 : 2) | i | (tj3Var.m22120g(c3042gl) ? 32 : 16) | (tj3Var.m22124i(zi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) owner;
            a02 a02VarMo1265a = f4809a.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getAccessibilityManager());
            a02 a02VarMo1265a2 = f4810b.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getAutofill());
            a02 a02VarMo1265a3 = f4812d.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getAutofillManager());
            a02 a02VarMo1265a4 = f4811c.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getAutofillTree());
            a02 a02VarMo1265a5 = f4813e.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getClipboardManager());
            a02 a02VarMo1265a6 = f4814f.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getClipboard());
            a02 a02VarMo1265a7 = f4816h.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getDensity());
            a02 a02VarMo1265a8 = f4817i.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getFocusOwner());
            a02 a02VarMo1265a9 = f4818j.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getFontLoader());
            a02VarMo1265a9.f13c = false;
            a02 a02VarMo1265a10 = f4819k.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getFontFamilyResolver());
            a02VarMo1265a10.f13c = false;
            pvc.m19508d(new a02[]{a02VarMo1265a, a02VarMo1265a2, a02VarMo1265a3, a02VarMo1265a4, a02VarMo1265a5, a02VarMo1265a6, a02VarMo1265a7, a02VarMo1265a8, a02VarMo1265a9, a02VarMo1265a10, f4820l.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getHapticFeedBack()), f4821m.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getInputModeManager()), f4822n.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getLayoutDirection()), f4825q.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getTextInputService()), f4826r.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getSoftwareKeyboardController()), f4827s.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getTextToolbar()), f4828t.mo1265a(c3042gl), f4829u.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getViewConfiguration()), f4830v.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getWindowInfo()), f4831w.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getPointerIconService()), f4815g.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getGraphicsContext()), ki5.f47345a.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getRetainedValuesStore()), f4823o.mo1265a(viewTreeObserverOnGlobalLayoutListenerC0391c.getLocaleList())}, zi3Var, tj3Var, ((i2 >> 3) & 112) | 8);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(c3042gl, zi3Var, i) { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C3042gl f4567c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ zi3 f4568d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC0402n.m1804a(this.f4566b, this.f4567c, this.f4568d, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1805b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
