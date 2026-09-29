package com.google.android.material.datepicker;

import ae.C0062b;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.internal.CheckableImageButton;
import com.kochava.tracker.BuildConfig;
import com.linguist.R;
import gd.C5768g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p072dd.C5149b;
import p104f.C5452a;
import p312p2.C8169a;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10057p0;
import p471x2.C10059q0;
import p471x2.C10067u0;
import p497y2.C10284f;
import tc.ViewOnTouchListenerC9248a;

/* JADX INFO: renamed from: com.google.android.material.datepicker.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3011m<S> extends DialogInterfaceOnCancelListenerC0962l {

    /* JADX INFO: renamed from: l1 */
    public static final /* synthetic */ int f15172l1 = 0;

    /* JADX INFO: renamed from: L0 */
    public final LinkedHashSet<InterfaceC3014p<? super S>> f15173L0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: M0 */
    public final LinkedHashSet<View.OnClickListener> f15174M0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: N0 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f15175N0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: O0 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f15176O0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: P0 */
    public int f15177P0;

    /* JADX INFO: renamed from: Q0 */
    public DateSelector<S> f15178Q0;

    /* JADX INFO: renamed from: R0 */
    public AbstractC3020v<S> f15179R0;

    /* JADX INFO: renamed from: S0 */
    public CalendarConstraints f15180S0;

    /* JADX INFO: renamed from: T0 */
    public DayViewDecorator f15181T0;

    /* JADX INFO: renamed from: U0 */
    public MaterialCalendar<S> f15182U0;

    /* JADX INFO: renamed from: V0 */
    public int f15183V0;

    /* JADX INFO: renamed from: W0 */
    public CharSequence f15184W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f15185X0;

    /* JADX INFO: renamed from: Y0 */
    public int f15186Y0;

    /* JADX INFO: renamed from: Z0 */
    public int f15187Z0;

    /* JADX INFO: renamed from: a1 */
    public CharSequence f15188a1;

    /* JADX INFO: renamed from: b1 */
    public int f15189b1;

    /* JADX INFO: renamed from: c1 */
    public CharSequence f15190c1;

    /* JADX INFO: renamed from: d1 */
    public TextView f15191d1;

    /* JADX INFO: renamed from: e1 */
    public TextView f15192e1;

    /* JADX INFO: renamed from: f1 */
    public CheckableImageButton f15193f1;

    /* JADX INFO: renamed from: g1 */
    public C5768g f15194g1;

    /* JADX INFO: renamed from: h1 */
    public Button f15195h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f15196i1;

    /* JADX INFO: renamed from: j1 */
    public CharSequence f15197j1;

    /* JADX INFO: renamed from: k1 */
    public CharSequence f15198k1;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.m$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C3011m c3011m = C3011m.this;
            for (InterfaceC3014p<? super S> interfaceC3014p : c3011m.f15173L0) {
                c3011m.m8743t0().m8725e0();
                interfaceC3014p.m8747a();
            }
            c3011m.m3767n0(false, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.m$b */
    public class b extends C10026a {
        public b() {
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: d */
        public final void mo2999d(View view, C10284f c10284f) {
            this.f50989a.onInitializeAccessibilityNodeInfo(view, c10284f.f51739a);
            StringBuilder sb2 = new StringBuilder();
            int i10 = C3011m.f15172l1;
            sb2.append(C3011m.this.m8743t0().m8726f());
            sb2.append(", ");
            sb2.append((Object) c10284f.m19263h());
            c10284f.m19267l(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.m$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C3011m c3011m = C3011m.this;
            Iterator<View.OnClickListener> it = c3011m.f15174M0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            c3011m.m3767n0(false, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.m$d */
    public class d extends AbstractC3019u<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.AbstractC3019u
        /* JADX INFO: renamed from: a */
        public final void mo8746a(S s10) {
            C3011m c3011m = C3011m.this;
            DateSelector<S> dateSelectorM8743t0 = c3011m.m8743t0();
            c3011m.mo471m();
            String strM8729y = dateSelectorM8743t0.m8729y();
            TextView textView = c3011m.f15192e1;
            DateSelector<S> dateSelectorM8743t1 = c3011m.m8743t0();
            c3011m.m3578a0();
            textView.setContentDescription(dateSelectorM8743t1.m8723b0());
            c3011m.f15192e1.setText(strM8729y);
            c3011m.f15195h1.setEnabled(c3011m.m8743t0().m8722a0());
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static int m8740u0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(C3024z.m8755d());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i10 = month.f15133d;
        return ((i10 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i10) + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m8741v0(Context context) {
        return m8742w0(android.R.attr.windowFullscreen, context);
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m8742w0(int i10, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C5149b.m10924c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: H */
    public final void mo3560H(Bundle bundle) {
        super.mo3560H(bundle);
        if (bundle == null) {
            bundle = this.f6101g;
        }
        this.f15177P0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f15178Q0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f15180S0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f15181T0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f15183V0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f15184W0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f15186Y0 = bundle.getInt("INPUT_MODE_KEY");
        this.f15187Z0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f15188a1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f15189b1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f15190c1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.f15184W0;
        if (text == null) {
            text = m3578a0().getResources().getText(this.f15183V0);
        }
        this.f15197j1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f15198k1 = text;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f15185X0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f15181T0;
        if (dayViewDecorator != null) {
            dayViewDecorator.getClass();
        }
        if (this.f15185X0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m8740u0(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m8740u0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f15192e1 = textView;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.g.m18702f(textView, 1);
        this.f15193f1 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f15191d1 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f15193f1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f15193f1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, C5452a.m11672a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C5452a.m11672a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f15193f1.setChecked(this.f15186Y0 != 0);
        C10029b0.m18658n(this.f15193f1, null);
        m8745y0(this.f15193f1);
        this.f15193f1.setOnClickListener(new ViewOnClickListenerC3013o(this));
        this.f15195h1 = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (m8743t0().m8722a0()) {
            this.f15195h1.setEnabled(true);
        } else {
            this.f15195h1.setEnabled(false);
        }
        this.f15195h1.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f15188a1;
        if (charSequence != null) {
            this.f15195h1.setText(charSequence);
        } else {
            int i10 = this.f15187Z0;
            if (i10 != 0) {
                this.f15195h1.setText(i10);
            }
        }
        this.f15195h1.setOnClickListener(new a());
        C10029b0.m18658n(this.f15195h1, new b());
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.f15190c1;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i11 = this.f15189b1;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        button.setOnClickListener(new c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public final void mo3569R(Bundle bundle) {
        super.mo3569R(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f15177P0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f15178Q0);
        CalendarConstraints.C2990b c2990b = new CalendarConstraints.C2990b(this.f15180S0);
        MaterialCalendar<S> materialCalendar = this.f15182U0;
        Month month = materialCalendar == null ? null : materialCalendar.f15112A0;
        if (month != null) {
            c2990b.f15107c = Long.valueOf(month.f15135f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c2990b.f15109e);
        Month monthM8736l = Month.m8736l(c2990b.f15105a);
        Month monthM8736l2 = Month.m8736l(c2990b.f15106b);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = c2990b.f15107c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthM8736l, monthM8736l2, dateValidator, l10 != null ? Month.m8736l(l10.longValue()) : null, c2990b.f15108d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f15181T0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f15183V0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f15184W0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f15187Z0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f15188a1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f15189b1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f15190c1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: S */
    public final void mo3570S() {
        super.mo3570S();
        Window window = m3770q0().getWindow();
        if (this.f15185X0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f15194g1);
            if (!this.f15196i1) {
                View viewFindViewById = m3580c0().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                int i10 = Build.VERSION.SDK_INT;
                boolean z10 = false;
                boolean z11 = numValueOf == null || numValueOf.intValue() == 0;
                int iM334b1 = C0062b.m334b1(android.R.attr.colorBackground, window.getContext(), -16777216);
                if (z11) {
                    numValueOf = Integer.valueOf(iM334b1);
                }
                Integer numValueOf2 = Integer.valueOf(iM334b1);
                if (i10 >= 30) {
                    C10059q0.m18850a(window, false);
                } else {
                    C10057p0.m18849a(window, false);
                }
                window.getContext();
                int iM16216h = i10 < 27 ? C8169a.m16216h(C0062b.m334b1(android.R.attr.navigationBarColor, window.getContext(), -16777216), BuildConfig.SDK_TRUNCATE_LENGTH) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iM16216h);
                (Build.VERSION.SDK_INT >= 30 ? new C10067u0.d(window) : new C10067u0.c(window, window.getDecorView())).mo18911d(C0062b.m402u1(0) || C0062b.m402u1(numValueOf.intValue()));
                boolean zM402u1 = C0062b.m402u1(numValueOf2.intValue());
                if (C0062b.m402u1(iM16216h) || (iM16216h == 0 && zM402u1)) {
                    z10 = true;
                }
                (Build.VERSION.SDK_INT >= 30 ? new C10067u0.d(window) : new C10067u0.c(window, window.getDecorView())).mo18912c(z10);
                C3012n c3012n = new C3012n(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop());
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.i.m18727u(viewFindViewById, c3012n);
                this.f15196i1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m3599s().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f15194g1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC9248a(m3770q0(), rect));
        }
        m8744x0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f15179R0.f15228v0.clear();
        super.mo3571T();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f15175N0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f15176O0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f6094c0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: p0 */
    public final Dialog mo3769p0(Bundle bundle) {
        Context contextM3578a0 = m3578a0();
        m3578a0();
        int iM8721X = this.f15177P0;
        if (iM8721X == 0) {
            iM8721X = m8743t0().m8721X();
        }
        Dialog dialog = new Dialog(contextM3578a0, iM8721X);
        Context context = dialog.getContext();
        this.f15185X0 = m8741v0(context);
        int i10 = C5149b.m10924c(context, R.attr.colorSurface, C3011m.class.getCanonicalName()).data;
        C5768g c5768g = new C5768g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f15194g1 = c5768g;
        c5768g.m12138j(context);
        this.f15194g1.m12141m(ColorStateList.valueOf(i10));
        C5768g c5768g2 = this.f15194g1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        c5768g2.m12140l(C10029b0.i.m18715i(decorView));
        return dialog;
    }

    /* JADX INFO: renamed from: t0 */
    public final DateSelector<S> m8743t0() {
        if (this.f15178Q0 == null) {
            this.f15178Q0 = (DateSelector) this.f6101g.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f15178Q0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a7  */
    /* JADX INFO: renamed from: x0 */
    public final void m8744x0() {
        AbstractC3020v<S> c3015q;
        CharSequence charSequence;
        m3578a0();
        int iM8721X = this.f15177P0;
        if (iM8721X == 0) {
            iM8721X = m8743t0().m8721X();
        }
        DateSelector<S> dateSelectorM8743t0 = m8743t0();
        CalendarConstraints calendarConstraints = this.f15180S0;
        DayViewDecorator dayViewDecorator = this.f15181T0;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iM8721X);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorM8743t0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f15099d);
        materialCalendar.m3583e0(bundle);
        this.f15182U0 = materialCalendar;
        boolean zIsChecked = this.f15193f1.isChecked();
        if (zIsChecked) {
            DateSelector<S> dateSelectorM8743t1 = m8743t0();
            CalendarConstraints calendarConstraints2 = this.f15180S0;
            c3015q = new C3015q<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iM8721X);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorM8743t1);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            c3015q.m3583e0(bundle2);
        } else {
            c3015q = this.f15182U0;
        }
        this.f15179R0 = c3015q;
        TextView textView = this.f15191d1;
        if (zIsChecked) {
            if (m3599s().getConfiguration().orientation == 2) {
                charSequence = this.f15198k1;
            } else {
                charSequence = this.f15197j1;
            }
        } else {
            charSequence = this.f15197j1;
        }
        textView.setText(charSequence);
        DateSelector<S> dateSelectorM8743t2 = m8743t0();
        mo471m();
        String strM8729y = dateSelectorM8743t2.m8729y();
        TextView textView2 = this.f15192e1;
        DateSelector<S> dateSelectorM8743t3 = m8743t0();
        m3578a0();
        textView2.setContentDescription(dateSelectorM8743t3.m8723b0());
        this.f15192e1.setText(strM8729y);
        FragmentManager fragmentManagerM3594l = m3594l();
        fragmentManagerM3594l.getClass();
        C0940a c0940a = new C0940a(fragmentManagerM3594l);
        c0940a.m3777g(R.id.mtrl_calendar_frame, this.f15179R0, null);
        c0940a.m3776e();
        c0940a.f6250q.m3668y(c0940a, false);
        this.f15179R0.mo8730m0(new d());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m8745y0(CheckableImageButton checkableImageButton) {
        this.f15193f1.setContentDescription(this.f15193f1.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }
}
