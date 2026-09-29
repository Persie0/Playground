package p000;

import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;

/* JADX INFO: loaded from: classes2.dex */
public final class k28 implements cl1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46587a = 2;

    /* JADX INFO: renamed from: b */
    public final Object f46588b;

    /* JADX INFO: renamed from: c */
    public final C3763xl f46589c;

    /* JADX INFO: renamed from: d */
    public final boolean f46590d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2969em f46591e;

    /* JADX INFO: renamed from: f */
    public final Object f46592f;

    public k28(String str, C3763xl c3763xl, C3763xl c3763xl2, C0852cm c0852cm, boolean z) {
        this.f46588b = str;
        this.f46589c = c3763xl;
        this.f46591e = c3763xl2;
        this.f46592f = c0852cm;
        this.f46590d = z;
    }

    @Override // p000.cl1
    /* JADX INFO: renamed from: a */
    public final qk1 mo403a(C0868b c0868b, gl5 gl5Var, o90 o90Var) {
        switch (this.f46587a) {
            case 0:
                return new j28(c0868b, o90Var, this);
            case 1:
                return new k68(c0868b, o90Var, this);
            default:
                return new eca(o90Var, this);
        }
    }

    public String toString() {
        int i = this.f46587a;
        Object obj = this.f46592f;
        InterfaceC2969em interfaceC2969em = this.f46591e;
        switch (i) {
            case 0:
                return "RectangleShape{position=" + interfaceC2969em + ", size=" + ((InterfaceC2969em) obj) + '}';
            case 1:
            default:
                return super.toString();
            case 2:
                return "Trim Path: {start: " + this.f46589c + ", end: " + ((C3763xl) interfaceC2969em) + ", offset: " + ((C3763xl) obj) + "}";
        }
    }

    public k28(String str, InterfaceC2969em interfaceC2969em, C3726wl c3726wl, C3763xl c3763xl, boolean z) {
        this.f46588b = str;
        this.f46591e = interfaceC2969em;
        this.f46592f = c3726wl;
        this.f46589c = c3763xl;
        this.f46590d = z;
    }

    public k28(String str, ShapeTrimPath$Type shapeTrimPath$Type, C3763xl c3763xl, C3763xl c3763xl2, C3763xl c3763xl3, boolean z) {
        this.f46588b = shapeTrimPath$Type;
        this.f46589c = c3763xl;
        this.f46591e = c3763xl2;
        this.f46592f = c3763xl3;
        this.f46590d = z;
    }
}
