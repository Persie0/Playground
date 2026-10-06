package com.google.android.apps.camera.p014ui.preference;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.function.Function;
import p000.emv;
import p000.ggf;
import p000.gzw;
import p000.had;
import p000.hah;
import p000.idx;
import p000.ieb;
import p000.iec;
import p000.ied;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ManagedSwitchPreference extends SwitchPreference implements Preference.OnPreferenceChangeListener, idx {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f7107n = 0;

    /* JADX INFO: renamed from: a */
    public had f7108a;

    /* JADX INFO: renamed from: b */
    public hah f7109b;

    /* JADX INFO: renamed from: c */
    public Preference.OnPreferenceChangeListener f7110c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f7111d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f7112e;

    /* JADX INFO: renamed from: f */
    public Integer f7113f;

    /* JADX INFO: renamed from: g */
    public Integer f7114g;

    /* JADX INFO: renamed from: h */
    public Integer f7115h;

    /* JADX INFO: renamed from: i */
    public Runnable f7116i;

    /* JADX INFO: renamed from: j */
    public String f7117j;

    /* JADX INFO: renamed from: k */
    public String f7118k;

    /* JADX INFO: renamed from: l */
    public View f7119l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f7120m;

    /* JADX INFO: renamed from: o */
    private Button f7121o;

    /* JADX INFO: renamed from: p */
    private LinearLayout f7122p;

    /* JADX INFO: renamed from: q */
    private String f7123q;

    /* JADX INFO: renamed from: r */
    private Switch f7124r;

    /* JADX INFO: renamed from: s */
    private TextView f7125s;

    /* JADX INFO: renamed from: t */
    private Function f7126t;

    public ManagedSwitchPreference(Context context) {
        super(context);
        this.f7110c = ieb.f30544a;
        m4415d(context);
    }

    /* JADX INFO: renamed from: c */
    public static final int m4414c(FrameLayout frameLayout) {
        return frameLayout.getVisibility() == 0 ? C0100R.drawable.quantum_gm_ic_expand_less_gm_grey_24 : C0100R.drawable.quantum_gm_ic_expand_more_gm_grey_24;
    }

    /* JADX INFO: renamed from: d */
    private final void m4415d(Context context) {
        ((ied) ((emv) context.getApplicationContext()).mo4193e(ied.class)).mo7827v(this);
        setPersistent(false);
        gzw gzwVarM10023a = gzw.m10023a(getKey());
        if (gzwVarM10023a != null) {
            setDefaultValue(this.f7109b.mo10031c(gzwVarM10023a));
        } else {
            setDefaultValue(Boolean.valueOf(this.f7108a.mo10046m(getKey())));
        }
        super.setOnPreferenceChangeListener(this);
    }

    @Override // p000.idx
    /* JADX INFO: renamed from: a */
    public final void mo4410a(Function function) {
        this.f7126t = function;
    }

    /* JADX INFO: renamed from: b */
    public final void m4416b(String str, Runnable runnable) {
        this.f7123q = str;
        this.f7116i = runnable;
    }

    @Override // android.preference.Preference
    public final Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return this.f7110c;
    }

    @Override // android.preference.Preference
    public final boolean getPersistedBoolean(boolean z) {
        return this.f7108a.mo10046m(getKey());
    }

    @Override // android.preference.SwitchPreference, android.preference.Preference
    protected final void onBindView(View view) {
        View viewFindViewById;
        TextView textView;
        super.onBindView(view);
        if (this.f7111d != null) {
            Switch r0 = (Switch) view.findViewById(R.id.switch_widget);
            this.f7124r = r0;
            if (r0 != null) {
                r0.setThumbTintList(this.f7111d);
                this.f7124r.setThumbTintMode(PorterDuff.Mode.MULTIPLY);
            }
        }
        if (this.f7112e != null) {
            Switch r1 = (Switch) view.findViewById(R.id.switch_widget);
            this.f7124r = r1;
            if (r1 != null) {
                r1.setTrackTintList(this.f7112e);
                this.f7124r.setTrackTintMode(PorterDuff.Mode.MULTIPLY);
            }
        }
        if (this.f7113f != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.background);
            this.f7122p = linearLayout;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(this.f7113f.intValue());
            }
        }
        if (this.f7114g != null) {
            TextView textView2 = (TextView) view.findViewById(R.id.title);
            this.f7125s = textView2;
            if (textView2 != null) {
                textView2.setTextColor(this.f7114g.intValue());
            }
        }
        if (this.f7118k != null && (textView = (TextView) view.findViewById(C0100R.id.subtitle)) != null) {
            textView.setText(this.f7118k);
            textView.setTextColor(this.f7115h.intValue());
        }
        Button button = (Button) view.findViewById(C0100R.id.action_button);
        this.f7121o = button;
        int i = 1;
        int i2 = 8;
        if (button != null) {
            String str = this.f7123q;
            if (str == null || this.f7116i == null) {
                button.setVisibility(8);
            } else {
                button.setText(str);
                this.f7121o.setOnClickListener(new iec(this, i));
            }
        }
        int i3 = 0;
        if (this.f7117j != null && this.f7119l != null) {
            Button button2 = (Button) view.findViewById(C0100R.id.expand_button);
            ImageView imageView = (ImageView) view.findViewById(C0100R.id.expand_icon);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0100R.id.expand_button_layout);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(C0100R.id.collapsible_layout);
            if (button2 != null && imageView != null && linearLayout2 != null && frameLayout != null) {
                button2.setText(this.f7117j);
                button2.setOnClickListener(new ggf(frameLayout, imageView, i2));
                imageView.setImageResource(m4414c(frameLayout));
                linearLayout2.setContentDescription(this.f7117j);
                linearLayout2.setOnClickListener(new iec(button2, i3));
                frameLayout.removeAllViews();
                frameLayout.addView(this.f7119l);
            }
        }
        if (this.f7120m == null || (viewFindViewById = view.findViewById(C0100R.id.helper_button)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(this.f7120m);
        viewFindViewById.setContentDescription(getContext().getString(C0100R.string.learn_more_about_setting, getTitle()));
    }

    @Override // android.preference.TwoStatePreference, android.preference.Preference
    protected final void onClick() {
        Function function = this.f7126t;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.onClick();
        }
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.f7108a.mo10045l(getKey(), ((Boolean) obj).booleanValue());
        return this.f7110c.onPreferenceChange(preference, obj);
    }

    @Override // android.preference.Preference
    public final void setOnPreferenceChangeListener(Preference.OnPreferenceChangeListener onPreferenceChangeListener) {
        this.f7110c = onPreferenceChangeListener;
    }

    public ManagedSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7110c = ieb.f30544a;
        m4415d(context);
    }

    public ManagedSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7110c = ieb.f30544a;
        m4415d(context);
    }
}
