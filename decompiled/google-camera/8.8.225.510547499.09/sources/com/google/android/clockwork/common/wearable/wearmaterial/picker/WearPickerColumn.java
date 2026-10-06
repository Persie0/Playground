package com.google.android.clockwork.common.wearable.wearmaterial.picker;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.TransitionInflater;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.AbstractC0806ls;
import p000.AbstractC0812ly;
import p000.C0078bx;
import p000.InterfaceC0816mb;
import p000.ixr;
import p000.ixx;
import p000.iyc;
import p000.iye;
import p000.iyf;
import p000.iyg;
import p000.iyi;
import p000.iyp;
import p000.jfs;
import p000.nax;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WearPickerColumn extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f7502a;

    /* JADX INFO: renamed from: b */
    public final jfs f7503b;

    /* JADX INFO: renamed from: c */
    private final iyg f7504c;

    /* JADX INFO: renamed from: d */
    private final Rect f7505d;

    /* JADX INFO: renamed from: e */
    private TextView f7506e;

    /* JADX INFO: renamed from: f */
    private boolean f7507f;

    /* JADX INFO: renamed from: g */
    private CenteredRecyclerView f7508g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC0816mb f7509h;

    /* JADX INFO: renamed from: i */
    private final iyi f7510i;

    /* JADX INFO: renamed from: j */
    private int f7511j;

    static {
        View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public WearPickerColumn(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    private final int m4614c() {
        int childCount = this.f7508g.getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return this.f7508g.getChildAt(childCount / 2).getMeasuredHeight();
    }

    /* JADX INFO: renamed from: d */
    private final void m4615d(Rect rect, int i, View view) {
        int i2;
        int i3;
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i4 = layoutParams.gravity;
            if (i4 == -1) {
                i4 = 8388659;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
            int measuredWidth = view.getMeasuredWidth();
            switch (absoluteGravity & 7) {
                case 1:
                    i2 = (((rect.left + (((rect.right - rect.left) - measuredWidth) / 2)) + layoutParams.leftMargin) - layoutParams.rightMargin) + (measuredWidth % 2);
                    break;
                case 5:
                    i2 = (rect.right - measuredWidth) - layoutParams.rightMargin;
                    break;
                default:
                    i2 = rect.left + layoutParams.leftMargin;
                    break;
            }
            int i5 = i4 & 112;
            int measuredHeight = view.getMeasuredHeight();
            switch (i5) {
                case 16:
                    i3 = (measuredHeight % 2) + (((rect.top + (((rect.bottom - rect.top) - measuredHeight) / 2)) + layoutParams.topMargin) - layoutParams.bottomMargin);
                    break;
                case 80:
                    i3 = (rect.bottom - measuredHeight) - layoutParams.bottomMargin;
                    break;
                default:
                    i3 = rect.top + layoutParams.topMargin;
                    break;
            }
            int i6 = i + i3;
            view.layout(i2, i6, measuredWidth + i2, measuredHeight + i6);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4616a(iyp iypVar) {
        if (this.f7507f || iypVar == null) {
            AbstractC0806ls abstractC0806ls = this.f7508g.f1123m;
            if (abstractC0806ls instanceof ixx) {
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetActivated(boolean z) {
        super.dispatchSetActivated(z);
        if (z) {
            this.f7506e.setActivated(false);
        }
        this.f7508g.setImportantForAccessibility(true != z ? 2 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0812ly abstractC0812ly = this.f7508g.f1124n;
        if (abstractC0812ly instanceof ixr) {
            int i5 = (i4 - i2) / 2;
            ixr ixrVar = (ixr) abstractC0812ly;
            if (ixrVar.f32602b != i5) {
                ixrVar.f32602b = i5;
                ixrVar.m16155aP();
            }
        }
        this.f7505d.left = getPaddingLeft();
        this.f7505d.right = (i3 - i) - getPaddingRight();
        this.f7505d.top = getPaddingTop();
        this.f7505d.bottom = (i4 - i2) - getPaddingBottom();
        m4615d(this.f7505d, 0, this.f7508g);
        m4615d(this.f7505d, ((getHeight() - m4614c()) / 2) - this.f7506e.getMeasuredHeight(), this.f7506e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        iyg iygVar = this.f7504c;
        int i3 = 0;
        iygVar.f32639a = 0;
        iygVar.f32640b = 0;
        iygVar.f32641c = 0;
        iygVar.f32642d = 0;
        iygVar.f32643e = 0;
        int i4 = true != this.f7503b.m13099e() ? -2 : -1;
        CenteredRecyclerView centeredRecyclerView = this.f7508g;
        ViewGroup.LayoutParams layoutParams = centeredRecyclerView.getLayoutParams();
        layoutParams.width = i4;
        centeredRecyclerView.setLayoutParams(layoutParams);
        this.f7504c.m11901a(this, i, i2, this.f7506e);
        if (this.f7506e.getVisibility() == 0) {
            int i5 = this.f7504c.f32642d;
            i3 = i5 + i5;
        }
        int iMax = i3 + Math.max(this.f7504c.m11901a(this, i, i2, this.f7508g), m4614c());
        iyg iygVar2 = this.f7504c;
        iygVar2.f32640b += iMax;
        iygVar2.f32639a += getPaddingLeft() + getPaddingRight();
        iygVar2.f32640b += getPaddingTop() + getPaddingBottom();
        iygVar2.f32639a = Math.max(iygVar2.f32639a, getSuggestedMinimumWidth());
        iygVar2.f32640b = Math.max(iygVar2.f32640b, getSuggestedMinimumHeight());
        int i6 = iygVar2.f32643e;
        setMeasuredDimension(View.resolveSizeAndState(iygVar2.f32639a, i, i6), View.resolveSizeAndState(iygVar2.f32640b, i2, i6 << 16));
    }

    public WearPickerColumn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearPickerColumn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.theme}, i, C0100R.style.WearPickerDefault);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                context.getTheme().applyStyle(resourceId, false);
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f7504c = new iyg();
            this.f7505d = new Rect();
            this.f7507f = true;
            this.f7511j = 2;
            iye iyeVar = new iye(this);
            this.f7509h = iyeVar;
            iyi iyiVar = new iyi(new C0078bx(this, 10));
            this.f7510i = iyiVar;
            this.f7503b = new jfs(context);
            this.f7502a = new GestureDetector(getContext(), new iyf());
            Context context2 = getContext();
            LayoutInflater.from(context2).inflate(C0100R.layout.wear_picker_column, (ViewGroup) this, true);
            this.f7506e = (TextView) findViewById(C0100R.id.wear_picker_column_label);
            CenteredRecyclerView centeredRecyclerView = (CenteredRecyclerView) findViewById(C0100R.id.wear_picker_column_expanded);
            this.f7508g = centeredRecyclerView;
            centeredRecyclerView.setOnGenericMotionListener(iyiVar);
            this.f7508g.m1243as();
            AbstractC0812ly abstractC0812ly = this.f7508g.f1124n;
            if (abstractC0812ly instanceof ixr) {
                ((ixr) abstractC0812ly).f32603c = new nax();
            }
            TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iyc.f32635c, i, 0);
            try {
                this.f7506e.setText(typedArrayObtainStyledAttributes2.getString(0));
                boolean z = typedArrayObtainStyledAttributes2.getBoolean(1, this.f7507f);
                if (z != this.f7507f) {
                    this.f7507f = z;
                    if (!z) {
                        m4616a(null);
                    }
                }
                typedArrayObtainStyledAttributes2.recycle();
                TransitionInflater transitionInflaterFrom = TransitionInflater.from(context2);
                transitionInflaterFrom.inflateTransition(C0100R.transition.wear_picker_column_collapse);
                transitionInflaterFrom.inflateTransition(C0100R.transition.wear_picker_column_expand);
                setWillNotDraw(true);
                this.f7508g.m1259p(iyeVar);
                if (this.f7511j == 2) {
                    CenteredRecyclerView centeredRecyclerView2 = this.f7508g;
                    PickerVignetteDrawable pickerVignetteDrawableM4612az = centeredRecyclerView2.m4612az();
                    if (pickerVignetteDrawableM4612az != null) {
                        Animator animator = centeredRecyclerView2.f7493ai;
                        pickerVignetteDrawableM4612az.setVignetteAlpha(255);
                    }
                } else {
                    CenteredRecyclerView centeredRecyclerView3 = this.f7508g;
                    PickerVignetteDrawable pickerVignetteDrawableM4612az2 = centeredRecyclerView3.m4612az();
                    if (pickerVignetteDrawableM4612az2 != null) {
                        Animator animator2 = centeredRecyclerView3.f7493ai;
                        pickerVignetteDrawableM4612az2.setVignetteAlpha(0);
                    }
                }
                this.f7506e.setVisibility(8);
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
