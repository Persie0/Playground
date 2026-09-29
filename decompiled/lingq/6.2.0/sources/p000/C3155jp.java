package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: jp */
/* JADX INFO: loaded from: classes2.dex */
public final class C3155jp {

    /* JADX INFO: renamed from: a */
    public ColorStateList f45940a = null;

    /* JADX INFO: renamed from: b */
    public PorterDuff.Mode f45941b = null;

    /* JADX INFO: renamed from: c */
    public boolean f45942c = false;

    /* JADX INFO: renamed from: d */
    public boolean f45943d = false;

    /* JADX INFO: renamed from: e */
    public boolean f45944e;

    /* JADX INFO: renamed from: f */
    public final TextView f45945f;

    public /* synthetic */ C3155jp(TextView textView) {
        this.f45945f = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m14574a() {
        CompoundButton compoundButton = (CompoundButton) this.f45945f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f45942c || this.f45943d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f45942c) {
                    drawableMutate.setTintList(this.f45940a);
                }
                if (this.f45943d) {
                    drawableMutate.setTintMode(this.f45941b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14575b() {
        C3119ip c3119ip = (C3119ip) this.f45945f;
        Drawable checkMarkDrawable = c3119ip.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f45942c || this.f45943d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f45942c) {
                    drawableMutate.setTintList(this.f45940a);
                }
                if (this.f45943d) {
                    drawableMutate.setTintMode(this.f45941b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c3119ip.getDrawableState());
                }
                c3119ip.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14576c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f45945f;
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, compoundButton.getContext(), attributeSet, R$styleable.CompoundButton);
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        Context context = compoundButton.getContext();
        int[] iArr = R$styleable.CompoundButton;
        TypedArray typedArray2 = (TypedArray) sq5VarM21551w.f61249c;
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3035b(compoundButton, context, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(R$styleable.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(R$styleable.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(bna.m3932U(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(R$styleable.CompoundButton_android_button)) {
                        compoundButton.setButtonDrawable(bna.m3932U(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(R$styleable.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(R$styleable.CompoundButton_android_button, 0)) != 0) {
                compoundButton.setButtonDrawable(bna.m3932U(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(R$styleable.CompoundButton_buttonTint)) {
                compoundButton.setButtonTintList(sq5VarM21551w.m21567i(R$styleable.CompoundButton_buttonTint));
            }
            if (typedArray.hasValue(R$styleable.CompoundButton_buttonTintMode)) {
                compoundButton.setButtonTintMode(wl2.m24048c(typedArray.getInt(R$styleable.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            sq5VarM21551w.m21582y();
        }
    }
}
