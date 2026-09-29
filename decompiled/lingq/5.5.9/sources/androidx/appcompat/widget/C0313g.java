package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import p329q2.C8488a;

/* JADX INFO: renamed from: androidx.appcompat.widget.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0313g {

    /* JADX INFO: renamed from: a */
    public final CheckedTextView f1183a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f1184b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f1185c = null;

    /* JADX INFO: renamed from: d */
    public boolean f1186d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1187e = false;

    /* JADX INFO: renamed from: f */
    public boolean f1188f;

    public C0313g(CheckedTextView checkedTextView) {
        this.f1183a = checkedTextView;
    }

    /* JADX INFO: renamed from: a */
    public final void m1192a() {
        CheckedTextView checkedTextView = this.f1183a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1186d || this.f1187e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f1186d) {
                    C8488a.b.m16570h(drawableMutate, this.f1184b);
                }
                if (this.f1187e) {
                    C8488a.b.m16571i(drawableMutate, this.f1185c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
