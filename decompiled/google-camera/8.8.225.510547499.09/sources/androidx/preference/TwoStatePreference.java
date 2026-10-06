package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p000.aor;
import p000.aow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: a */
    public boolean f1626a;

    /* JADX INFO: renamed from: b */
    public boolean f1627b;

    /* JADX INFO: renamed from: c */
    private CharSequence f1628c;

    /* JADX INFO: renamed from: d */
    private CharSequence f1629d;

    /* JADX INFO: renamed from: e */
    private boolean f1630e;

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ah */
    protected final void m1540ah(aor aorVar) {
        m1541cf(aorVar.m1781B(R.id.summary));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    protected void mo1468c() {
        boolean z = !this.f1626a;
        if (m1505W(Boolean.valueOf(z))) {
            mo1542k(z);
        }
    }

    /* JADX INFO: renamed from: cf */
    protected final void m1541cf(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.f1626a && !TextUtils.isEmpty(this.f1628c)) {
                textView.setText(this.f1628c);
            } else if (this.f1626a || TextUtils.isEmpty(this.f1629d)) {
                CharSequence charSequenceMo1478m = mo1478m();
                if (TextUtils.isEmpty(charSequenceMo1478m)) {
                    i = 8;
                } else {
                    textView.setText(charSequenceMo1478m);
                }
            } else {
                textView.setText(this.f1629d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: e */
    protected final Parcelable mo1470e() {
        Parcelable parcelableMo1470e = super.mo1470e();
        if (this.f1593u) {
            return parcelableMo1470e;
        }
        aow aowVar = new aow(parcelableMo1470e);
        aowVar.f1940a = this.f1626a;
        return aowVar;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: f */
    protected final Object mo1471f(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: g */
    protected final void mo1472g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aow.class)) {
            super.mo1472g(parcelable);
            return;
        }
        aow aowVar = (aow) parcelable;
        super.mo1472g(aowVar.getSuperState());
        mo1542k(aowVar.f1940a);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: h */
    protected final void mo1473h(Object obj) {
        if (obj == null) {
            obj = false;
        }
        mo1542k(mo1506X(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: j */
    public final boolean mo1475j() {
        if (this.f1627b) {
            if (this.f1626a) {
                return true;
            }
        } else if (!this.f1626a) {
            return true;
        }
        return super.mo1475j();
    }

    /* JADX INFO: renamed from: k */
    public void mo1542k(boolean z) {
        boolean z2 = this.f1626a != z;
        if (z2 || !this.f1630e) {
            this.f1626a = z;
            this.f1630e = true;
            if (m1510aa() && z != mo1506X(!z)) {
                SharedPreferences.Editor editorM1776b = this.f1583k.m1776b();
                editorM1776b.putBoolean(this.f1590r, z);
                super.m1503U(editorM1776b);
            }
            if (z2) {
                mo1484B(mo1475j());
                mo1469d();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1543l(CharSequence charSequence) {
        this.f1629d = charSequence;
        if (this.f1626a) {
            return;
        }
        mo1469d();
    }

    /* JADX INFO: renamed from: o */
    public final void m1544o(CharSequence charSequence) {
        this.f1628c = charSequence;
        if (this.f1626a) {
            mo1469d();
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
