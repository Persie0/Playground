package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: jg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0740jg extends C0794lg implements InterfaceC0742ji {

    /* JADX INFO: renamed from: a */
    public CharSequence f33933a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f33934b;

    /* JADX INFO: renamed from: c */
    public final Rect f33935c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0743jj f33936d;

    /* JADX INFO: renamed from: s */
    private int f33937s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740jg(C0743jj c0743jj, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.spinnerStyle);
        this.f33936d = c0743jj;
        this.f33935c = new Rect();
        this.f38183l = c0743jj;
        m15311y();
        this.f38184m = new lrt(this, 1);
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: d */
    public final CharSequence mo12908d() {
        return this.f33933a;
    }

    @Override // p000.C0794lg, p000.InterfaceC0742ji
    /* JADX INFO: renamed from: e */
    public final void mo12909e(ListAdapter listAdapter) {
        super.mo12909e(listAdapter);
        this.f33934b = listAdapter;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: h */
    public final void mo12912h(int i) {
        this.f33937s = i;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: i */
    public final void mo12913i(CharSequence charSequence) {
        this.f33933a = charSequence;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: l */
    public final void mo12916l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zMo9636u = mo9636u();
        m13126n();
        m15310x();
        super.mo9634s();
        C0773km c0773km = this.f38176e;
        c0773km.setChoiceMode(1);
        C0735jb.m12826d(c0773km, i);
        C0735jb.m12825c(c0773km, i2);
        int selectedItemPosition = this.f33936d.getSelectedItemPosition();
        C0773km c0773km2 = this.f38176e;
        if (mo9636u() && c0773km2 != null) {
            c0773km2.f36511a = false;
            c0773km2.setSelection(selectedItemPosition);
            if (c0773km2.getChoiceMode() != 0) {
                c0773km2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zMo9636u || (viewTreeObserver = this.f33936d.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0244ho viewTreeObserverOnGlobalLayoutListenerC0244ho = new ViewTreeObserverOnGlobalLayoutListenerC0244ho(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0244ho);
        m15308v(new C0739jf(this, viewTreeObserverOnGlobalLayoutListenerC0244ho));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    public final void m13126n() {
        int i;
        Drawable drawableM15299c = m15299c();
        if (drawableM15299c != null) {
            drawableM15299c.getPadding(this.f33936d.f34158d);
            i = C0864nw.m17748a(this.f33936d) ? this.f33936d.f34158d.right : -this.f33936d.f34158d.left;
        } else {
            Rect rect = this.f33936d.f34158d;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.f33936d.getPaddingLeft();
        int paddingRight = this.f33936d.getPaddingRight();
        int width = this.f33936d.getWidth();
        C0743jj c0743jj = this.f33936d;
        int i2 = c0743jj.f34157c;
        if (i2 == -2) {
            int iM13302a = c0743jj.m13302a(this.f33934b, m15299c());
            int i3 = (this.f33936d.getContext().getResources().getDisplayMetrics().widthPixels - this.f33936d.f34158d.left) - this.f33936d.f34158d.right;
            if (iM13302a > i3) {
                iM13302a = i3;
            }
            m15306r(Math.max(iM13302a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m15306r((width - paddingLeft) - paddingRight);
        } else {
            m15306r(i2);
        }
        this.f38178g = C0864nw.m17748a(this.f33936d) ? i + (((width - paddingRight) - this.f38177f) - this.f33937s) : i + paddingLeft + this.f33937s;
    }
}
