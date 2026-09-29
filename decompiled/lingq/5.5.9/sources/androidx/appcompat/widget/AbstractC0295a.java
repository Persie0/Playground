package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0224f;
import com.linguist.R;
import p058d.C4999a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.InterfaceC10051m0;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0295a extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final a f1118a;

    /* JADX INFO: renamed from: b */
    public final Context f1119b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f1120c;

    /* JADX INFO: renamed from: d */
    public ActionMenuPresenter f1121d;

    /* JADX INFO: renamed from: e */
    public int f1122e;

    /* JADX INFO: renamed from: f */
    public C10049l0 f1123f;

    /* JADX INFO: renamed from: g */
    public boolean f1124g;

    /* JADX INFO: renamed from: h */
    public boolean f1125h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a */
    public class a implements InterfaceC10051m0 {

        /* JADX INFO: renamed from: a */
        public boolean f1126a = false;

        /* JADX INFO: renamed from: b */
        public int f1127b;

        public a() {
        }

        @Override // p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: a */
        public final void mo1078a() {
            if (this.f1126a) {
                return;
            }
            AbstractC0295a abstractC0295a = AbstractC0295a.this;
            abstractC0295a.f1123f = null;
            AbstractC0295a.super.setVisibility(this.f1127b);
        }

        @Override // p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: b */
        public final void mo1079b(View view) {
            this.f1126a = true;
        }

        @Override // p471x2.InterfaceC10051m0
        /* JADX INFO: renamed from: c */
        public final void mo1080c() {
            AbstractC0295a.super.setVisibility(0);
            this.f1126a = false;
        }
    }

    public AbstractC0295a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0295a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1118a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1119b = context;
        } else {
            this.f1119b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m1075c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    /* JADX INFO: renamed from: d */
    public static int m1076d(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            measuredWidth = -measuredWidth;
        }
        return measuredWidth;
    }

    /* JADX INFO: renamed from: e */
    public final C10049l0 m1077e(int i10, long j10) {
        C10049l0 c10049l0 = this.f1123f;
        if (c10049l0 != null) {
            c10049l0.m18836b();
        }
        a aVar = this.f1118a;
        if (i10 != 0) {
            C10049l0 c10049l0M18645a = C10029b0.m18645a(this);
            c10049l0M18645a.m18835a(0.0f);
            c10049l0M18645a.m18837c(j10);
            AbstractC0295a.this.f1123f = c10049l0M18645a;
            aVar.f1127b = i10;
            c10049l0M18645a.m18838d(aVar);
            return c10049l0M18645a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C10049l0 c10049l0M18645a2 = C10029b0.m18645a(this);
        c10049l0M18645a2.m18835a(1.0f);
        c10049l0M18645a2.m18837c(j10);
        AbstractC0295a.this.f1123f = c10049l0M18645a2;
        aVar.f1127b = i10;
        c10049l0M18645a2.m18838d(aVar);
        return c10049l0M18645a2;
    }

    public int getAnimatedVisibility() {
        return this.f1123f != null ? this.f1118a.f1127b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1122e;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        C0224f c0224f;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C4999a.f32587a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1121d;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f634b.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i11 <= 600 && (i11 <= 960 || i12 <= 720)) {
                if (i11 <= 720 || i12 <= 960) {
                    if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                        i10 = 4;
                    } else {
                        i10 = i11 >= 360 ? 3 : 2;
                    }
                }
                actionMenuPresenter.f845L = i10;
                c0224f = actionMenuPresenter.f635c;
                if (c0224f != null) {
                    c0224f.m932p(true);
                }
            }
            i10 = 5;
            actionMenuPresenter.f845L = i10;
            c0224f = actionMenuPresenter.f635c;
            if (c0224f != null) {
                c0224f.m932p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1125h = false;
        }
        if (!this.f1125h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1125h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1125h = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1124g = false;
        }
        if (!this.f1124g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1124g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1124g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1122e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C10049l0 c10049l0 = this.f1123f;
            if (c10049l0 != null) {
                c10049l0.m18836b();
            }
            super.setVisibility(i10);
        }
    }
}
