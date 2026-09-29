package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p024b3.C1296c;
import p024b3.C1297d;
import p058d.C4999a;
import p104f.C5452a;
import p329q2.C8488a;
import p471x2.C10029b0;

/* JADX INFO: renamed from: androidx.appcompat.widget.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0316h {

    /* JADX INFO: renamed from: a */
    public final CompoundButton f1209a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f1210b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f1211c = null;

    /* JADX INFO: renamed from: d */
    public boolean f1212d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1213e = false;

    /* JADX INFO: renamed from: f */
    public boolean f1214f;

    public C0316h(CompoundButton compoundButton) {
        this.f1209a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public final void m1198a() {
        CompoundButton compoundButton = this.f1209a;
        Drawable drawableM4808a = C1297d.m4808a(compoundButton);
        if (drawableM4808a != null && (this.f1212d || this.f1213e)) {
            Drawable drawableMutate = drawableM4808a.mutate();
            if (this.f1212d) {
                C8488a.b.m16570h(drawableMutate, this.f1210b);
            }
            if (this.f1213e) {
                C8488a.b.m16571i(drawableMutate, this.f1211c);
            }
            if (drawableMutate.isStateful()) {
                drawableMutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(drawableMutate);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1199b(AttributeSet attributeSet, int i10) {
        int iM1120i;
        int iM1120i2;
        CompoundButton compoundButton = this.f1209a;
        Context context = compoundButton.getContext();
        int[] iArr = C4999a.f32599m;
        C0300b1 c0300b1M1111m = C0300b1.m1111m(context, attributeSet, iArr, i10);
        C10029b0.m18657m(compoundButton, compoundButton.getContext(), iArr, attributeSet, c0300b1M1111m.f1134b, i10);
        boolean z10 = true;
        try {
            if (!c0300b1M1111m.m1123l(1) || (iM1120i2 = c0300b1M1111m.m1120i(1, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    compoundButton.setButtonDrawable(C5452a.m11672a(compoundButton.getContext(), iM1120i2));
                } catch (Resources.NotFoundException unused) {
                    z10 = false;
                }
            }
            if (!z10 && c0300b1M1111m.m1123l(0) && (iM1120i = c0300b1M1111m.m1120i(0, 0)) != 0) {
                compoundButton.setButtonDrawable(C5452a.m11672a(compoundButton.getContext(), iM1120i));
            }
            if (c0300b1M1111m.m1123l(2)) {
                C1296c.m4806c(compoundButton, c0300b1M1111m.m1113b(2));
            }
            if (c0300b1M1111m.m1123l(3)) {
                C1296c.m4807d(compoundButton, C0311f0.m1188c(c0300b1M1111m.m1119h(3, -1), null));
            }
            c0300b1M1111m.m1124n();
        } catch (Throwable th2) {
            c0300b1M1111m.m1124n();
            throw th2;
        }
    }
}
