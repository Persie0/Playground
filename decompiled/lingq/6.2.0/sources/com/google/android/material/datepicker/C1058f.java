package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC3122is;
import p000.a3d;
import p000.a6a;
import p000.bca;
import p000.be2;
import p000.bna;
import p000.cc4;
import p000.dta;
import p000.fma;
import p000.fs5;
import p000.g6b;
import p000.g87;
import p000.h31;
import p000.h6b;
import p000.ho2;
import p000.j6b;
import p000.k64;
import p000.kaa;
import p000.ls5;
import p000.omd;
import p000.wsa;
import p000.xwc;
import p000.yh0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.f */
/* JADX INFO: loaded from: classes2.dex */
public class C1058f<S> extends be2 {

    /* JADX INFO: renamed from: M0 */
    public final LinkedHashSet f12911M0;

    /* JADX INFO: renamed from: N0 */
    public final LinkedHashSet f12912N0;

    /* JADX INFO: renamed from: O0 */
    public int f12913O0;

    /* JADX INFO: renamed from: P0 */
    public g87 f12914P0;

    /* JADX INFO: renamed from: Q0 */
    public CalendarConstraints f12915Q0;

    /* JADX INFO: renamed from: R0 */
    public MaterialCalendar f12916R0;

    /* JADX INFO: renamed from: S0 */
    public int f12917S0;

    /* JADX INFO: renamed from: T0 */
    public CharSequence f12918T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f12919U0;

    /* JADX INFO: renamed from: V0 */
    public int f12920V0;

    /* JADX INFO: renamed from: W0 */
    public int f12921W0;

    /* JADX INFO: renamed from: X0 */
    public CharSequence f12922X0;

    /* JADX INFO: renamed from: Y0 */
    public int f12923Y0;

    /* JADX INFO: renamed from: Z0 */
    public CharSequence f12924Z0;

    /* JADX INFO: renamed from: a1 */
    public int f12925a1;

    /* JADX INFO: renamed from: b1 */
    public CharSequence f12926b1;

    /* JADX INFO: renamed from: c1 */
    public int f12927c1;

    /* JADX INFO: renamed from: d1 */
    public CharSequence f12928d1;

    /* JADX INFO: renamed from: e1 */
    public TextView f12929e1;

    /* JADX INFO: renamed from: f1 */
    public CheckableImageButton f12930f1;

    /* JADX INFO: renamed from: g1 */
    public fs5 f12931g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f12932h1;

    /* JADX INFO: renamed from: i1 */
    public CharSequence f12933i1;

    /* JADX INFO: renamed from: j1 */
    public CharSequence f12934j1;

    public C1058f() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f12911M0 = new LinkedHashSet();
        this.f12912N0 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: m0 */
    public static int m6124m0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_content_padding);
        Month month = new Month(fma.m11944b());
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.f12902d;
        return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m6125n0(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(xwc.m24751X(R$attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f12919U0 ? R$layout.mtrl_picker_fullscreen : R$layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f12919U0) {
            viewInflate.findViewById(R$id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m6124m0(context), -2));
        } else {
            viewInflate.findViewById(R$id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m6124m0(context), -1));
        }
        ((TextView) viewInflate.findViewById(R$id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f12930f1 = (CheckableImageButton) viewInflate.findViewById(R$id.mtrl_picker_header_toggle);
        this.f12929e1 = (TextView) viewInflate.findViewById(R$id.mtrl_picker_title_text);
        this.f12930f1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f12930f1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, bna.m3932U(context, R$drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], bna.m3932U(context, R$drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f12930f1.setChecked(this.f12920V0 != 0);
        dta.m10640k(this.f12930f1, null);
        CheckableImageButton checkableImageButton2 = this.f12930f1;
        this.f12930f1.setContentDescription(this.f12920V0 == 1 ? checkableImageButton2.getContext().getString(R$string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R$string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.f12930f1;
        a6a.m135a(this.f12930f1, this.f12920V0 == 1 ? checkableImageButton3.getContext().getString(R$string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R$string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.f12930f1.setOnClickListener(new h31(this, 6));
        m6126l0();
        throw null;
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: I */
    public final void mo2082I(Bundle bundle) {
        super.mo2082I(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f12913O0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints calendarConstraints = this.f12915Q0;
        C1054b c1054b = new C1054b();
        long j = calendarConstraints.f12874a.f12904f;
        long j2 = calendarConstraints.f12875b.f12904f;
        c1054b.f12906a = Long.valueOf(calendarConstraints.f12877d.f12904f);
        int i = calendarConstraints.f12878e;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.f12876c;
        MaterialCalendar materialCalendar = this.f12916R0;
        Month month = materialCalendar == null ? null : materialCalendar.f12896z0;
        if (month != null) {
            c1054b.f12906a = Long.valueOf(month.f12904f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthM6119b = Month.m6119b(j);
        Month monthM6119b2 = Month.m6119b(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c1054b.f12906a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthM6119b, monthM6119b2, dateValidator2, l == null ? null : Month.m6119b(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f12917S0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f12918T0);
        bundle.putInt("INPUT_MODE_KEY", this.f12920V0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f12921W0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f12922X0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f12923Y0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f12924Z0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f12925a1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f12926b1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f12927c1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f12928d1);
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: J */
    public final void mo2083J() {
        g87 g87Var;
        g87 g87Var2;
        g87 g87Var3;
        bca h6bVar;
        bca h6bVar2;
        super.mo2083J();
        Window window = m3663i0().getWindow();
        if (this.f12919U0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f12931g1);
            if (!this.f12932h1) {
                View viewFindViewById = m2092T().findViewById(R$id.fullscreen_header);
                ColorStateList colorStateListM14107u = AbstractC3122is.m14107u(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM14107u != null ? Integer.valueOf(colorStateListM14107u.getDefaultColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                Integer numM18120H = omd.m18120H(window.getContext(), R.attr.colorBackground);
                int iIntValue = numM18120H != null ? numM18120H.intValue() : -16777216;
                if (z) {
                    numValueOf = Integer.valueOf(iIntValue);
                }
                kaa.m15044f(window, false);
                window.getContext();
                window.getContext();
                int i = Build.VERSION.SDK_INT;
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(0);
                }
                boolean z2 = omd.m18124N(0) || omd.m18124N(numValueOf.intValue());
                cc4 cc4Var = new cc4(window.getDecorView());
                if (i >= 35) {
                    h6bVar = new j6b(window, cc4Var);
                } else {
                    h6bVar = i >= 30 ? new h6b(window, cc4Var) : new g6b(window, cc4Var);
                }
                h6bVar.mo3618i(z2);
                boolean z3 = omd.m18124N(0) || omd.m18124N(iIntValue);
                cc4 cc4Var2 = new cc4(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    h6bVar2 = new j6b(window, cc4Var2);
                } else {
                    h6bVar2 = i2 >= 30 ? new h6b(window, cc4Var2) : new g6b(window, cc4Var2);
                }
                h6bVar2.mo3617h(z3);
                int paddingTop = viewFindViewById.getPaddingTop();
                int paddingLeft = viewFindViewById.getPaddingLeft();
                int paddingRight = viewFindViewById.getPaddingRight();
                int i3 = viewFindViewById.getLayoutParams().height;
                yh0 yh0Var = new yh0();
                yh0Var.f69834a = i3;
                yh0Var.f69838e = viewFindViewById;
                yh0Var.f69835b = paddingLeft;
                yh0Var.f69836c = paddingTop;
                yh0Var.f69837d = paddingRight;
                WeakHashMap weakHashMap = dta.f36217a;
                wsa.m24145c(viewFindViewById, yh0Var);
                this.f12932h1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m2110l().getDimensionPixelOffset(R$dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f12931g1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new k64(m3663i0(), rect));
        }
        m2090R();
        int i4 = this.f12913O0;
        if (i4 == 0) {
            m6126l0();
            throw null;
        }
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2137E = m2106h().m2137E(this.f12920V0 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        if (abstractComponentCallbacksC0635cM2137E instanceof g87) {
            g87Var3 = (g87) abstractComponentCallbacksC0635cM2137E;
        } else {
            g87Var = null;
        }
        if (g87Var == null) {
            if (this.f12920V0 == 1) {
                g87Var = g87Var3;
                m6126l0();
                CalendarConstraints calendarConstraints = this.f12915Q0;
                ls5 ls5Var = new ls5();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i4);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
                ls5Var.m2095W(bundle);
                g87Var2 = ls5Var;
            } else {
                g87Var = g87Var3;
                m6126l0();
                CalendarConstraints calendarConstraints2 = this.f12915Q0;
                MaterialCalendar materialCalendar = new MaterialCalendar();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i4);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", calendarConstraints2.f12877d);
                materialCalendar.m2095W(bundle2);
                this.f12916R0 = materialCalendar;
                g87Var2 = materialCalendar;
            }
            g87Var = g87Var2;
        }
        g87Var = g87Var3;
        this.f12914P0 = g87Var;
        g87Var.mo6108c0(new a3d());
        this.f12929e1.setText((this.f12920V0 == 1 && m2110l().getConfiguration().orientation == 2) ? this.f12934j1 : this.f12933i1);
        m6126l0();
        throw null;
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: L */
    public final void mo2084L() {
        this.f12914P0.f40389w0.clear();
        super.mo2084L();
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: h0 */
    public final Dialog mo3662h0(Bundle bundle) {
        Context contextM2090R = m2090R();
        m2090R();
        int i = this.f12913O0;
        if (i == 0) {
            m6126l0();
            throw null;
        }
        Dialog dialog = new Dialog(contextM2090R, i);
        Context context = dialog.getContext();
        this.f12919U0 = m6125n0(context, R.attr.windowFullscreen);
        this.f12931g1 = new fs5(context, null, R$attr.materialCalendarStyle, R$style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.MaterialCalendar, R$attr.materialCalendarStyle, R$style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f12931g1.m12072p(context);
        this.f12931g1.m12076t(ColorStateList.valueOf(color));
        this.f12931g1.m12075s(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m6126l0() {
        if (this.f5695f.getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        ho2.m13383c();
    }

    @Override // p000.be2, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f12911M0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p000.be2, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f12912N0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f5692d0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p000.be2, androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public final void mo2124z(Bundle bundle) {
        super.mo2124z(bundle);
        if (bundle == null) {
            bundle = this.f5695f;
        }
        this.f12913O0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            ho2.m13383c();
            return;
        }
        this.f12915Q0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            ho2.m13383c();
            return;
        }
        this.f12917S0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f12918T0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f12920V0 = bundle.getInt("INPUT_MODE_KEY");
        this.f12921W0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f12922X0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f12923Y0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f12924Z0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f12925a1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f12926b1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f12927c1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f12928d1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f12918T0;
        if (text == null) {
            text = m2090R().getResources().getText(this.f12917S0);
        }
        this.f12933i1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f12934j1 = text;
    }
}
