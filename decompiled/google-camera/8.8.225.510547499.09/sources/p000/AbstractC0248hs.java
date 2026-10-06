package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: hs */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0248hs extends ViewGroup {

    /* JADX INFO: renamed from: a */
    protected final C0247hr f29377a;

    /* JADX INFO: renamed from: b */
    public final Context f29378b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f29379c;

    /* JADX INFO: renamed from: d */
    public C0259ic f29380d;

    /* JADX INFO: renamed from: e */
    public int f29381e;

    /* JADX INFO: renamed from: f */
    protected bkn f29382f;

    /* JADX INFO: renamed from: g */
    private boolean f29383g;

    /* JADX INFO: renamed from: h */
    private boolean f29384h;

    AbstractC0248hs(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static int m10676a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: renamed from: e */
    public static final int m10679e(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: f */
    public static final int m10680f(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    /* JADX INFO: renamed from: c */
    public void mo1043c(int i) {
        throw null;
    }

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
    /* JADX INFO: renamed from: g */
    public final bkn m10681g(int i, long j) {
        bkn bknVar = this.f29382f;
        if (bknVar != null) {
            bknVar.m2593n();
        }
        if (i != 0) {
            bkn bknVarM551k = afq.m551k(this);
            bknVarM551k.m2594o(0.0f);
            bknVarM551k.m2595p(j);
            C0247hr c0247hr = this.f29377a;
            c0247hr.m10645d(bknVarM551k, i);
            bknVarM551k.m2596q(c0247hr);
            return bknVarM551k;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        bkn bknVarM551k2 = afq.m551k(this);
        bknVarM551k2.m2594o(1.0f);
        bknVarM551k2.m2595p(j);
        C0247hr c0247hr2 = this.f29377a;
        c0247hr2.m10645d(bknVarM551k2, 0);
        bknVarM551k2.m2596q(c0247hr2);
        return bknVarM551k2;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0193fr.f23257a, C0100R.attr.actionBarStyle, 0);
        mo1043c(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0259ic c0259ic = this.f29380d;
        if (c0259ic != null) {
            c0259ic.f30283h = C0138dq.m6567c(c0259ic.f25572b);
            C0225gw c0225gw = c0259ic.f25573c;
            if (c0225gw != null) {
                c0225gw.m9832l(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.f29384h = false;
            actionMasked = 9;
        }
        if (this.f29384h) {
            i = actionMasked;
        } else {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked != 9) {
                i = actionMasked;
            } else if (!zOnHoverEvent) {
                this.f29384h = true;
            }
        }
        if (i == 10 || i == 3) {
            this.f29384h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f29383g = false;
            actionMasked = 0;
        }
        if (!this.f29383g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.f29383g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f29383g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            bkn bknVar = this.f29382f;
            if (bknVar != null) {
                bknVar.m2593n();
            }
            super.setVisibility(i);
        }
    }

    public AbstractC0248hs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0248hs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29377a = new C0247hr(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0100R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f29378b = context;
        } else {
            this.f29378b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
