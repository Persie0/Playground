package androidx.compose.p017ui.text.style;

import cm.InterfaceC2041a;
import dm.C5207g;
import p387t0.AbstractC9161o;
import p387t0.C9169u;
import p445w1.C9792b;

/* JADX INFO: loaded from: classes.dex */
public interface TextForegroundStyle {

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.TextForegroundStyle$a */
    public static final class C0710a implements TextForegroundStyle {

        /* JADX INFO: renamed from: a */
        public static final C0710a f4688a = new C0710a();

        @Override // androidx.compose.p017ui.text.style.TextForegroundStyle
        /* JADX INFO: renamed from: A */
        public final float mo2614A() {
            return Float.NaN;
        }

        @Override // androidx.compose.p017ui.text.style.TextForegroundStyle
        /* JADX INFO: renamed from: a */
        public final long mo2615a() {
            int i10 = C9169u.f47704g;
            return C9169u.f47703f;
        }

        @Override // androidx.compose.p017ui.text.style.TextForegroundStyle
        /* JADX INFO: renamed from: d */
        public final AbstractC9161o mo2618d() {
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    float mo2614A();

    /* JADX INFO: renamed from: a */
    long mo2615a();

    /* JADX INFO: renamed from: b */
    default TextForegroundStyle m2616b(InterfaceC2041a<? extends TextForegroundStyle> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "other");
        return !C5207g.m11106a(this, C0710a.f4688a) ? this : interfaceC2041a.mo807E();
    }

    /* JADX INFO: renamed from: c */
    default TextForegroundStyle m2617c(TextForegroundStyle textForegroundStyle) {
        C5207g.m11111f(textForegroundStyle, "other");
        boolean z10 = textForegroundStyle instanceof C9792b;
        if (!z10 || !(this instanceof C9792b)) {
            if (!z10 || (this instanceof C9792b)) {
                return (z10 || !(this instanceof C9792b)) ? textForegroundStyle.m2616b(new InterfaceC2041a<TextForegroundStyle>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$2
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final TextForegroundStyle mo807E() {
                        return this.f4690b;
                    }
                }) : this;
            }
            return textForegroundStyle;
        }
        C9792b c9792b = (C9792b) textForegroundStyle;
        float fMo2614A = textForegroundStyle.mo2614A();
        InterfaceC2041a<Float> interfaceC2041a = new InterfaceC2041a<Float>() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Float mo807E() {
                return Float.valueOf(this.f4689b.mo2614A());
            }
        };
        if (Float.isNaN(fMo2614A)) {
            fMo2614A = ((Number) interfaceC2041a.mo807E()).floatValue();
        }
        return new C9792b(c9792b.f49901a, fMo2614A);
    }

    /* JADX INFO: renamed from: d */
    AbstractC9161o mo2618d();
}
