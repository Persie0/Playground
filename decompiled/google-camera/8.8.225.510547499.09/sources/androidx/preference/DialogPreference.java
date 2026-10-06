package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aar;
import p000.aol;
import p000.aos;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: a */
    public CharSequence f1540a;

    /* JADX INFO: renamed from: b */
    public CharSequence f1541b;

    /* JADX INFO: renamed from: c */
    public Drawable f1542c;

    /* JADX INFO: renamed from: d */
    public CharSequence f1543d;

    /* JADX INFO: renamed from: e */
    public CharSequence f1544e;

    /* JADX INFO: renamed from: f */
    public int f1545f;

    public DialogPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    protected void mo1468c() {
        aol aolVar = this.f1583k.f1905d;
        if (aolVar != null) {
            aolVar.mo1758z(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aar.m39c(context, C0100R.attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1923c, i, i2);
        String strM44h = aar.m44h(typedArrayObtainStyledAttributes, 9, 0);
        this.f1540a = strM44h;
        if (strM44h == null) {
            this.f1540a = this.f1589q;
        }
        this.f1541b = aar.m44h(typedArrayObtainStyledAttributes, 8, 1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f1542c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.f1543d = aar.m44h(typedArrayObtainStyledAttributes, 11, 3);
        this.f1544e = aar.m44h(typedArrayObtainStyledAttributes, 10, 4);
        this.f1545f = aar.m41e(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
