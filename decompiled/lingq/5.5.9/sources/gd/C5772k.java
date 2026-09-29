package gd;

import ae.C0062b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import dm.C5206f;
import p153hc.C6031a;

/* JADX INFO: renamed from: gd.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5772k {

    /* JADX INFO: renamed from: a */
    public final C5206f f34895a;

    /* JADX INFO: renamed from: b */
    public final C5206f f34896b;

    /* JADX INFO: renamed from: c */
    public final C5206f f34897c;

    /* JADX INFO: renamed from: d */
    public final C5206f f34898d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5764c f34899e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5764c f34900f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5764c f34901g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5764c f34902h;

    /* JADX INFO: renamed from: i */
    public final C5766e f34903i;

    /* JADX INFO: renamed from: j */
    public final C5766e f34904j;

    /* JADX INFO: renamed from: k */
    public final C5766e f34905k;

    /* JADX INFO: renamed from: l */
    public final C5766e f34906l;

    /* JADX INFO: renamed from: gd.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public C5206f f34907a;

        /* JADX INFO: renamed from: b */
        public C5206f f34908b;

        /* JADX INFO: renamed from: c */
        public C5206f f34909c;

        /* JADX INFO: renamed from: d */
        public C5206f f34910d;

        /* JADX INFO: renamed from: e */
        public InterfaceC5764c f34911e;

        /* JADX INFO: renamed from: f */
        public InterfaceC5764c f34912f;

        /* JADX INFO: renamed from: g */
        public InterfaceC5764c f34913g;

        /* JADX INFO: renamed from: h */
        public InterfaceC5764c f34914h;

        /* JADX INFO: renamed from: i */
        public final C5766e f34915i;

        /* JADX INFO: renamed from: j */
        public final C5766e f34916j;

        /* JADX INFO: renamed from: k */
        public C5766e f34917k;

        /* JADX INFO: renamed from: l */
        public final C5766e f34918l;

        public a() {
            this.f34907a = new C5771j();
            this.f34908b = new C5771j();
            this.f34909c = new C5771j();
            this.f34910d = new C5771j();
            this.f34911e = new C5762a(0.0f);
            this.f34912f = new C5762a(0.0f);
            this.f34913g = new C5762a(0.0f);
            this.f34914h = new C5762a(0.0f);
            this.f34915i = new C5766e();
            this.f34916j = new C5766e();
            this.f34917k = new C5766e();
            this.f34918l = new C5766e();
        }

        public a(C5772k c5772k) {
            this.f34907a = new C5771j();
            this.f34908b = new C5771j();
            this.f34909c = new C5771j();
            this.f34910d = new C5771j();
            this.f34911e = new C5762a(0.0f);
            this.f34912f = new C5762a(0.0f);
            this.f34913g = new C5762a(0.0f);
            this.f34914h = new C5762a(0.0f);
            this.f34915i = new C5766e();
            this.f34916j = new C5766e();
            this.f34917k = new C5766e();
            this.f34918l = new C5766e();
            this.f34907a = c5772k.f34895a;
            this.f34908b = c5772k.f34896b;
            this.f34909c = c5772k.f34897c;
            this.f34910d = c5772k.f34898d;
            this.f34911e = c5772k.f34899e;
            this.f34912f = c5772k.f34900f;
            this.f34913g = c5772k.f34901g;
            this.f34914h = c5772k.f34902h;
            this.f34915i = c5772k.f34903i;
            this.f34916j = c5772k.f34904j;
            this.f34917k = c5772k.f34905k;
            this.f34918l = c5772k.f34906l;
        }

        /* JADX INFO: renamed from: b */
        public static float m12154b(C5206f c5206f) {
            if (c5206f instanceof C5771j) {
                return ((C5771j) c5206f).f34894k;
            }
            if (c5206f instanceof C5765d) {
                return ((C5765d) c5206f).f34844k;
            }
            return -1.0f;
        }

        /* JADX INFO: renamed from: a */
        public final C5772k m12155a() {
            return new C5772k(this);
        }

        /* JADX INFO: renamed from: c */
        public final void m12156c(float f3) {
            m12159f(f3);
            m12160g(f3);
            m12158e(f3);
            m12157d(f3);
        }

        /* JADX INFO: renamed from: d */
        public final void m12157d(float f3) {
            this.f34914h = new C5762a(f3);
        }

        /* JADX INFO: renamed from: e */
        public final void m12158e(float f3) {
            this.f34913g = new C5762a(f3);
        }

        /* JADX INFO: renamed from: f */
        public final void m12159f(float f3) {
            this.f34911e = new C5762a(f3);
        }

        /* JADX INFO: renamed from: g */
        public final void m12160g(float f3) {
            this.f34912f = new C5762a(f3);
        }
    }

    public C5772k() {
        this.f34895a = new C5771j();
        this.f34896b = new C5771j();
        this.f34897c = new C5771j();
        this.f34898d = new C5771j();
        this.f34899e = new C5762a(0.0f);
        this.f34900f = new C5762a(0.0f);
        this.f34901g = new C5762a(0.0f);
        this.f34902h = new C5762a(0.0f);
        this.f34903i = new C5766e();
        this.f34904j = new C5766e();
        this.f34905k = new C5766e();
        this.f34906l = new C5766e();
    }

    public C5772k(a aVar) {
        this.f34895a = aVar.f34907a;
        this.f34896b = aVar.f34908b;
        this.f34897c = aVar.f34909c;
        this.f34898d = aVar.f34910d;
        this.f34899e = aVar.f34911e;
        this.f34900f = aVar.f34912f;
        this.f34901g = aVar.f34913g;
        this.f34902h = aVar.f34914h;
        this.f34903i = aVar.f34915i;
        this.f34904j = aVar.f34916j;
        this.f34905k = aVar.f34917k;
        this.f34906l = aVar.f34918l;
    }

    /* JADX INFO: renamed from: a */
    public static a m12149a(Context context, int i10, int i11, C5762a c5762a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C6031a.f35639H);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            InterfaceC5764c interfaceC5764cM12151c = m12151c(typedArrayObtainStyledAttributes, 5, c5762a);
            InterfaceC5764c interfaceC5764cM12151c2 = m12151c(typedArrayObtainStyledAttributes, 8, interfaceC5764cM12151c);
            InterfaceC5764c interfaceC5764cM12151c3 = m12151c(typedArrayObtainStyledAttributes, 9, interfaceC5764cM12151c);
            InterfaceC5764c interfaceC5764cM12151c4 = m12151c(typedArrayObtainStyledAttributes, 7, interfaceC5764cM12151c);
            InterfaceC5764c interfaceC5764cM12151c5 = m12151c(typedArrayObtainStyledAttributes, 6, interfaceC5764cM12151c);
            a aVar = new a();
            C5206f c5206fM257D0 = C0062b.m257D0(i13);
            aVar.f34907a = c5206fM257D0;
            float fM12154b = a.m12154b(c5206fM257D0);
            if (fM12154b != -1.0f) {
                aVar.m12159f(fM12154b);
            }
            aVar.f34911e = interfaceC5764cM12151c2;
            C5206f c5206fM257D1 = C0062b.m257D0(i14);
            aVar.f34908b = c5206fM257D1;
            float fM12154b2 = a.m12154b(c5206fM257D1);
            if (fM12154b2 != -1.0f) {
                aVar.m12160g(fM12154b2);
            }
            aVar.f34912f = interfaceC5764cM12151c3;
            C5206f c5206fM257D2 = C0062b.m257D0(i15);
            aVar.f34909c = c5206fM257D2;
            float fM12154b3 = a.m12154b(c5206fM257D2);
            if (fM12154b3 != -1.0f) {
                aVar.m12158e(fM12154b3);
            }
            aVar.f34913g = interfaceC5764cM12151c4;
            C5206f c5206fM257D3 = C0062b.m257D0(i16);
            aVar.f34910d = c5206fM257D3;
            float fM12154b4 = a.m12154b(c5206fM257D3);
            if (fM12154b4 != -1.0f) {
                aVar.m12157d(fM12154b4);
            }
            aVar.f34914h = interfaceC5764cM12151c5;
            typedArrayObtainStyledAttributes.recycle();
            return aVar;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static a m12150b(Context context, AttributeSet attributeSet, int i10, int i11) {
        C5762a c5762a = new C5762a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35675y, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m12149a(context, resourceId, resourceId2, c5762a);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC5764c m12151c(TypedArray typedArray, int i10, InterfaceC5764c interfaceC5764c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return interfaceC5764c;
        }
        int i11 = typedValuePeekValue.type;
        if (i11 == 5) {
            return new C5762a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new C5770i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC5764c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12152d(RectF rectF) {
        boolean z10 = this.f34906l.getClass().equals(C5766e.class) && this.f34904j.getClass().equals(C5766e.class) && this.f34903i.getClass().equals(C5766e.class) && this.f34905k.getClass().equals(C5766e.class);
        float fMo12127a = this.f34899e.mo12127a(rectF);
        return z10 && ((this.f34900f.mo12127a(rectF) > fMo12127a ? 1 : (this.f34900f.mo12127a(rectF) == fMo12127a ? 0 : -1)) == 0 && (this.f34902h.mo12127a(rectF) > fMo12127a ? 1 : (this.f34902h.mo12127a(rectF) == fMo12127a ? 0 : -1)) == 0 && (this.f34901g.mo12127a(rectF) > fMo12127a ? 1 : (this.f34901g.mo12127a(rectF) == fMo12127a ? 0 : -1)) == 0) && ((this.f34896b instanceof C5771j) && (this.f34895a instanceof C5771j) && (this.f34897c instanceof C5771j) && (this.f34898d instanceof C5771j));
    }

    /* JADX INFO: renamed from: e */
    public final C5772k m12153e(float f3) {
        a aVar = new a(this);
        aVar.m12156c(f3);
        return new C5772k(aVar);
    }
}
