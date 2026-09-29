package p080e;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import p058d.C4999a;
import p164i.AbstractC6100a;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5269a {

    /* JADX INFO: renamed from: e.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f33364a;

        public a() {
            super(-2, -2);
            this.f33364a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f33364a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4999a.f32588b);
            this.f33364a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f33364a = 0;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f33364a = 0;
            this.f33364a = aVar.f33364a;
        }
    }

    /* JADX INFO: renamed from: e.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m11325a();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo11309a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo11310b();

    /* JADX INFO: renamed from: c */
    public abstract void mo11311c(boolean z10);

    /* JADX INFO: renamed from: d */
    public abstract int mo11312d();

    /* JADX INFO: renamed from: e */
    public abstract Context mo11313e();

    /* JADX INFO: renamed from: f */
    public boolean mo11314f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo11315g();

    /* JADX INFO: renamed from: h */
    public void mo11316h() {
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo11317i(int i10, KeyEvent keyEvent);

    /* JADX INFO: renamed from: j */
    public boolean mo11318j(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo11319k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo11320l(boolean z10);

    /* JADX INFO: renamed from: m */
    public abstract void mo11321m(boolean z10);

    /* JADX INFO: renamed from: n */
    public abstract void mo11322n(String str);

    /* JADX INFO: renamed from: o */
    public abstract void mo11323o(CharSequence charSequence);

    /* JADX INFO: renamed from: p */
    public AbstractC6100a mo11324p(LayoutInflaterFactory2C5275g.d dVar) {
        return null;
    }
}
