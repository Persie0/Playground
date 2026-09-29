package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p058d.C4999a;
import p269n3.C7701f;

/* JADX INFO: renamed from: androidx.appcompat.widget.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0324k {

    /* JADX INFO: renamed from: a */
    public final TextView f1255a;

    /* JADX INFO: renamed from: b */
    public final C7701f f1256b;

    public C0324k(TextView textView) {
        this.f1255a = textView;
        this.f1256b = new C7701f(textView);
    }

    /* JADX INFO: renamed from: a */
    public final InputFilter[] m1232a(InputFilter[] inputFilterArr) {
        return this.f1256b.f42219a.mo15292a(inputFilterArr);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m1233b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1255a.getContext().obtainStyledAttributes(attributeSet, C4999a.f32595i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m1235d(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1234c(boolean z10) {
        this.f1256b.f42219a.mo15294c(z10);
    }

    /* JADX INFO: renamed from: d */
    public final void m1235d(boolean z10) {
        this.f1256b.f42219a.mo15295d(z10);
    }
}
