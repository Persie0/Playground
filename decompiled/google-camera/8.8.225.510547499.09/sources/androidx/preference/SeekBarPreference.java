package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aor;
import p000.aos;
import p000.aot;
import p000.aou;
import p000.hxg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: F */
    private final boolean f1608F;

    /* JADX INFO: renamed from: G */
    private final SeekBar.OnSeekBarChangeListener f1609G;

    /* JADX INFO: renamed from: H */
    private final View.OnKeyListener f1610H;

    /* JADX INFO: renamed from: a */
    public int f1611a;

    /* JADX INFO: renamed from: b */
    public int f1612b;

    /* JADX INFO: renamed from: c */
    public boolean f1613c;

    /* JADX INFO: renamed from: d */
    public SeekBar f1614d;

    /* JADX INFO: renamed from: e */
    public final boolean f1615e;

    /* JADX INFO: renamed from: f */
    public final boolean f1616f;

    /* JADX INFO: renamed from: g */
    private int f1617g;

    /* JADX INFO: renamed from: h */
    private int f1618h;

    /* JADX INFO: renamed from: i */
    private TextView f1619i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.seekBarPreferenceStyle, 0);
        this.f1609G = new hxg(this, 1);
        this.f1610H = new aot(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1931k, C0100R.attr.seekBarPreferenceStyle, 0);
        this.f1612b = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.f1612b;
        i = i < i2 ? i2 : i;
        if (i != this.f1617g) {
            this.f1617g = i;
            mo1469d();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f1618h) {
            this.f1618h = Math.min(this.f1617g - this.f1612b, Math.abs(i3));
            mo1469d();
        }
        this.f1615e = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f1608F = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f1616f = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: o */
    private final void m1535o(int i, boolean z) {
        int i2 = this.f1612b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f1617g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f1611a) {
            this.f1611a = i;
            m1537l(i);
            if (m1510aa() && i != m1517q(i ^ (-1))) {
                SharedPreferences.Editor editorM1776b = this.f1583k.m1776b();
                editorM1776b.putInt(this.f1590r, i);
                super.m1503U(editorM1776b);
            }
            if (z) {
                mo1469d();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        aorVar.f41155a.setOnKeyListener(this.f1610H);
        this.f1614d = (SeekBar) aorVar.m1781B(C0100R.id.seekbar);
        TextView textView = (TextView) aorVar.m1781B(C0100R.id.seekbar_value);
        this.f1619i = textView;
        if (this.f1608F) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f1619i = null;
        }
        SeekBar seekBar = this.f1614d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f1609G);
        this.f1614d.setMax(this.f1617g - this.f1612b);
        int i = this.f1618h;
        if (i != 0) {
            this.f1614d.setKeyProgressIncrement(i);
        } else {
            this.f1618h = this.f1614d.getKeyProgressIncrement();
        }
        this.f1614d.setProgress(this.f1611a - this.f1612b);
        m1537l(this.f1611a);
        this.f1614d.setEnabled(mo1508Z());
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: e */
    protected final Parcelable mo1470e() {
        Parcelable parcelableMo1470e = super.mo1470e();
        if (this.f1593u) {
            return parcelableMo1470e;
        }
        aou aouVar = new aou(parcelableMo1470e);
        aouVar.f1935a = this.f1611a;
        aouVar.f1936b = this.f1612b;
        aouVar.f1937c = this.f1617g;
        return aouVar;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: f */
    protected final Object mo1471f(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: g */
    protected final void mo1472g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aou.class)) {
            super.mo1472g(parcelable);
            return;
        }
        aou aouVar = (aou) parcelable;
        super.mo1472g(aouVar.getSuperState());
        this.f1611a = aouVar.f1935a;
        this.f1612b = aouVar.f1936b;
        this.f1617g = aouVar.f1937c;
        mo1469d();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: h */
    protected final void mo1473h(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m1535o(m1517q(((Integer) obj).intValue()), true);
    }

    /* JADX INFO: renamed from: k */
    public final void m1536k(SeekBar seekBar) {
        int progress = this.f1612b + seekBar.getProgress();
        if (progress != this.f1611a) {
            if (m1505W(Integer.valueOf(progress))) {
                m1535o(progress, false);
            } else {
                seekBar.setProgress(this.f1611a - this.f1612b);
                m1537l(this.f1611a);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1537l(int i) {
        TextView textView = this.f1619i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }
}
