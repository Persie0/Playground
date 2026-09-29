package p000;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R$styleable;

/* JADX INFO: renamed from: eq */
/* JADX INFO: loaded from: classes.dex */
public final class C2973eq {

    /* JADX INFO: renamed from: a */
    public final TextView f37698a;

    /* JADX INFO: renamed from: b */
    public final qn3 f37699b;

    public C2973eq(TextView textView) {
        this.f37698a = textView;
        qn3 qn3Var = new qn3();
        qn3Var.f57974a = new fr2(textView);
        this.f37699b = qn3Var;
    }

    /* JADX INFO: renamed from: a */
    public final InputFilter[] m11315a(InputFilter[] inputFilterArr) {
        return ((b34) this.f37699b.f57974a).mo3262n(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m11316b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f37698a.getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m11318d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11317c(boolean z) {
        ((b34) this.f37699b.f57974a).mo3259P(z);
    }

    /* JADX INFO: renamed from: d */
    public final void m11318d(boolean z) {
        ((b34) this.f37699b.f57974a).mo3260R(z);
    }
}
