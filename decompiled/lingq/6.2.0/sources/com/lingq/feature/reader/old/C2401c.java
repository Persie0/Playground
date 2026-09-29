package com.lingq.feature.reader.old;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import kotlinx.coroutines.flow.C3244l;
import p000.bh4;
import p000.gy9;
import p000.iy9;
import p000.jy9;
import p000.ky9;
import p000.lda;
import p000.ly9;
import p000.my9;
import p000.ny9;
import p000.ty9;
import p000.vi3;
import p000.vs3;
import p000.vx7;
import p000.w65;
import p000.wfb;
import p000.xfa;
import p000.xy9;
import p000.yz7;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2401c implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f29179b;

    public /* synthetic */ C2401c(int i, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f29178a = i;
        this.f29179b = abstractComponentCallbacksC0635c;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        int i = this.f29178a;
        xfa xfaVar = xfa.f68157a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f29179b;
        switch (i) {
            case 0:
                ReaderFragment readerFragment = (ReaderFragment) abstractComponentCallbacksC0635c;
                xy9 xy9Var = (xy9) obj;
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                xy9Var.getClass();
                if (xy9Var instanceof ny9) {
                    C2412n c2412nM9290W0 = readerFragment.m9290W0();
                    yz7 yz7Var = ((ny9) xy9Var).f53418a;
                    c2412nM9290W0.getClass();
                    yz7Var.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$setReaderTheme$1(c2412nM9290W0, yz7Var, null), 3);
                } else if (xy9Var instanceof ky9) {
                    C2412n c2412nM9290W1 = readerFragment.m9290W0();
                    int i2 = ((ky9) xy9Var).f48779a;
                    c2412nM9290W1.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W1), null, null, new ReaderViewModel$setLessonFontSize$1(c2412nM9290W1, i2, null), 3);
                } else if (xy9Var instanceof my9) {
                    C2412n c2412nM9290W2 = readerFragment.m9290W0();
                    double d = ((my9) xy9Var).f52046a;
                    c2412nM9290W2.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W2), null, null, new ReaderViewModel$setLessonLineSpacing$1(d, c2412nM9290W2, null), 3);
                } else if (xy9Var instanceof ly9) {
                    C2412n c2412nM9290W3 = readerFragment.m9290W0();
                    vs3 vs3Var = ((ly9) xy9Var).f50317a;
                    c2412nM9290W3.getClass();
                    vs3Var.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W3), null, null, new ReaderViewModel$setHighlightColorScheme$1(c2412nM9290W3, vs3Var, null), 3);
                } else if (xy9Var instanceof ty9) {
                    C2412n c2412nM9290W4 = readerFragment.m9290W0();
                    TextHighlightStyle textHighlightStyle = ((ty9) xy9Var).f63100a;
                    c2412nM9290W4.getClass();
                    textHighlightStyle.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W4), null, null, new ReaderViewModel$setTextHighlightStyle$1(c2412nM9290W4, textHighlightStyle, null), 3);
                } else if (xy9Var instanceof jy9) {
                    C2412n c2412nM9290W5 = readerFragment.m9290W0();
                    jy9 jy9Var = (jy9) xy9Var;
                    ReaderFont readerFont = jy9Var.f46409a;
                    boolean z = jy9Var.f46410b;
                    c2412nM9290W5.getClass();
                    readerFont.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W5), null, null, new ReaderViewModel$setFont$1(z, c2412nM9290W5, readerFont, null), 3);
                } else if (xy9Var instanceof iy9) {
                    C2412n c2412nM9290W6 = readerFragment.m9290W0();
                    boolean z2 = ((iy9) xy9Var).f44784a;
                    c2412nM9290W6.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W6), null, null, new ReaderViewModel$setDockTokenPopup$1(c2412nM9290W6, z2, null), 3);
                } else if (xy9Var.equals(gy9.f41534a)) {
                    C3244l c3244l = readerFragment.m9290W0().f29294L1;
                    do {
                        value = c3244l.getValue();
                        ((Boolean) value).getClass();
                    } while (!c3244l.m15570h(value, Boolean.FALSE));
                }
                break;
            default:
                w65 w65Var = (w65) obj;
                vx7 vx7Var = ReaderPageFragment.Companion;
                w65Var.getClass();
                C2411m c2411mM9299X0 = ((ReaderPageFragment) abstractComponentCallbacksC0635c).m9299X0();
                c2411mM9299X0.getClass();
                wfb.m23926u(lda.m16103C(c2411mM9299X0), null, null, new ReaderPageViewModel$speak$1(c2411mM9299X0, w65Var, null), 3);
                break;
        }
        return xfaVar;
    }
}
