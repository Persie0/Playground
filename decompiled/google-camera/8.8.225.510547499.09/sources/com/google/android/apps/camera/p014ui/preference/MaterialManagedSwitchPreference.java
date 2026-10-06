package com.google.android.apps.camera.p014ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.function.Function;
import p000.ant;
import p000.aor;
import p000.emv;
import p000.ggf;
import p000.gzw;
import p000.had;
import p000.hah;
import p000.iec;
import p000.iee;
import p000.ieg;
import p000.iej;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MaterialManagedSwitchPreference extends SwitchPreference implements ant, iee {

    /* JADX INFO: renamed from: F */
    private Button f7138F;

    /* JADX INFO: renamed from: G */
    private String f7139G;

    /* JADX INFO: renamed from: H */
    private Function f7140H;

    /* JADX INFO: renamed from: c */
    public had f7141c;

    /* JADX INFO: renamed from: d */
    public hah f7142d;

    /* JADX INFO: renamed from: e */
    public ant f7143e;

    /* JADX INFO: renamed from: f */
    public Runnable f7144f;

    /* JADX INFO: renamed from: g */
    public String f7145g;

    /* JADX INFO: renamed from: h */
    public View f7146h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f7147i;

    public MaterialManagedSwitchPreference(Context context) {
        super(context);
        this.f7143e = ieg.f30549c;
        m4423ak(context);
    }

    /* JADX INFO: renamed from: aj */
    public static final int m4422aj(FrameLayout frameLayout) {
        return frameLayout.getVisibility() == 0 ? C0100R.drawable.quantum_gm_ic_expand_less_gm_grey_24 : C0100R.drawable.quantum_gm_ic_expand_more_gm_grey_24;
    }

    /* JADX INFO: renamed from: ak */
    private final void m4423ak(Context context) {
        ((iej) ((emv) context.getApplicationContext()).mo4193e(iej.class)).mo7830y(this);
        m1514ae();
        gzw gzwVarM10023a = gzw.m10023a(this.f1590r);
        if (gzwVarM10023a != null) {
            this.f1594v = this.f7142d.mo10031c(gzwVarM10023a);
            this.f7141c.mo10045l(this.f1590r, ((Boolean) this.f7142d.mo10031c(gzwVarM10023a)).booleanValue());
        } else {
            this.f1594v = Boolean.valueOf(this.f7141c.mo10046m(this.f1590r));
        }
        this.f1586n = this;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: O */
    public final void mo1497O(ant antVar) {
        this.f7143e = antVar;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: X */
    public final boolean mo1506X(boolean z) {
        return this.f7141c.mo10046m(this.f1590r);
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        View viewFindViewById;
        super.mo1466a(aorVar);
        Button button = (Button) aorVar.f41155a.findViewById(C0100R.id.action_button);
        this.f7138F = button;
        if (button != null) {
            String str = this.f7139G;
            if (str == null || this.f7144f == null) {
                button.setVisibility(8);
            } else {
                button.setText(str);
                this.f7138F.setOnClickListener(new iec(this, 2));
            }
        }
        if (this.f7145g != null && this.f7146h != null) {
            Button button2 = (Button) aorVar.f41155a.findViewById(C0100R.id.expand_button);
            ImageView imageView = (ImageView) aorVar.f41155a.findViewById(C0100R.id.expand_icon);
            LinearLayout linearLayout = (LinearLayout) aorVar.f41155a.findViewById(C0100R.id.expand_button_layout);
            FrameLayout frameLayout = (FrameLayout) aorVar.f41155a.findViewById(C0100R.id.collapsible_layout);
            if (button2 != null && imageView != null && linearLayout != null && frameLayout != null) {
                button2.setText(this.f7145g);
                button2.setOnClickListener(new ggf(frameLayout, imageView, 9));
                imageView.setImageResource(m4422aj(frameLayout));
                linearLayout.setContentDescription(this.f7145g);
                linearLayout.setOnClickListener(new iec(button2, 3));
                frameLayout.removeAllViews();
                frameLayout.addView(this.f7146h);
            }
        }
        if (this.f7147i == null || (viewFindViewById = aorVar.f41155a.findViewById(C0100R.id.helper_button)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(this.f7147i);
    }

    @Override // p000.iee
    /* JADX INFO: renamed from: ag */
    public final void mo4417ag(Function function) {
        this.f7140H = function;
    }

    /* JADX INFO: renamed from: ai */
    public final void m4424ai(String str, Runnable runnable) {
        this.f7139G = str;
        this.f7144f = runnable;
    }

    @Override // p000.ant
    /* JADX INFO: renamed from: b */
    public final boolean mo1734b(Preference preference, Object obj) {
        this.f7141c.mo10045l(this.f1590r, ((Boolean) obj).booleanValue());
        return this.f7143e.mo1734b(preference, obj);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    protected final void mo1468c() {
        Function function = this.f7140H;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.mo1468c();
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: u */
    public final ant mo1521u() {
        return this.f7143e;
    }

    public MaterialManagedSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7143e = ieg.f30549c;
        m4423ak(context);
    }

    public MaterialManagedSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7143e = ieg.f30549c;
        m4423ak(context);
    }
}
