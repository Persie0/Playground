package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import androidx.constraintlayout.motion.widget.C0476c;
import androidx.constraintlayout.widget.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class m36 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final n36 f50509a;

    /* JADX INFO: renamed from: b */
    public final int f50510b;

    /* JADX INFO: renamed from: c */
    public final int f50511c;

    public m36(Context context, n36 n36Var, XmlResourceParser xmlResourceParser) {
        this.f50510b = -1;
        this.f50511c = 17;
        this.f50509a = n36Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.OnClick);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.OnClick_targetId) {
                this.f50510b = typedArrayObtainStyledAttributes.getResourceId(index, this.f50510b);
            } else if (index == R$styleable.OnClick_clickAction) {
                this.f50511c = typedArrayObtainStyledAttributes.getInt(index, this.f50511c);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m16611a(AbstractC0475b abstractC0475b, int i, n36 n36Var) {
        boolean z;
        View viewFindViewById;
        int i2 = this.f50510b;
        View view = abstractC0475b;
        if (i2 != -1) {
            viewFindViewById = abstractC0475b.findViewById(i2);
        }
        if (view == null) {
            view = viewFindViewById;
            Log.e("MotionScene", "OnClick could not find id " + i2);
            return;
        }
        int i3 = n36Var.f52273d;
        int i4 = n36Var.f52272c;
        if (i3 == -1) {
            view = viewFindViewById;
            view.setOnClickListener(this);
            return;
        }
        int i5 = this.f50511c;
        int i6 = i5 & 1;
        boolean z2 = false;
        if (i6 == 0 || i != i3) {
            view = viewFindViewById;
            z = false;
        } else {
            z = true;
        }
        boolean z3 = (i6 != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & 4096) != 0 && i == i4) {
            z2 = true;
        }
        if (z3 || z2) {
            view.setOnClickListener(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16612b(AbstractC0475b abstractC0475b) {
        int i = this.f50510b;
        if (i == -1) {
            return;
        }
        View viewFindViewById = abstractC0475b.findViewById(i);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n36 n36Var = this.f50509a;
        C0476c c0476c = n36Var.f52279j;
        AbstractC0475b abstractC0475b = c0476c.f5423a;
        if (abstractC0475b.f5394U) {
            if (n36Var.f52273d == -1) {
                int currentState = abstractC0475b.getCurrentState();
                if (currentState == -1) {
                    abstractC0475b.m1949z(n36Var.f52272c);
                    return;
                }
                n36 n36Var2 = new n36(c0476c, n36Var);
                n36Var2.f52273d = currentState;
                n36Var2.f52272c = n36Var.f52272c;
                abstractC0475b.setTransition(n36Var2);
                abstractC0475b.m1939p(1.0f);
                abstractC0475b.f5376J0 = null;
                return;
            }
            n36 n36Var3 = c0476c.f5425c;
            int i = this.f50511c;
            int i2 = i & 1;
            boolean z = false;
            boolean z2 = true;
            boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
            int i3 = i & 16;
            if (i3 == 0 && (i & 4096) == 0) {
                z2 = false;
            }
            if (z3 && z2) {
                if (n36Var3 != n36Var) {
                    abstractC0475b.setTransition(n36Var);
                }
                if (abstractC0475b.getCurrentState() != abstractC0475b.getEndState() && abstractC0475b.getProgress() <= 0.5f) {
                    z2 = false;
                    z = z3;
                }
            } else {
                z = z3;
            }
            if (n36Var != n36Var3) {
                int i4 = n36Var.f52272c;
                int i5 = n36Var.f52273d;
                int i6 = abstractC0475b.f5388Q;
                if (i5 == -1) {
                    if (i6 == i4) {
                        return;
                    }
                } else if (i6 != i5 && i6 != i4) {
                    return;
                }
            }
            if (z && i2 != 0) {
                abstractC0475b.setTransition(n36Var);
                abstractC0475b.m1939p(1.0f);
                abstractC0475b.f5376J0 = null;
                return;
            }
            if (z2 && i3 != 0) {
                abstractC0475b.setTransition(n36Var);
                abstractC0475b.m1939p(0.0f);
            } else if (z && (i & 256) != 0) {
                abstractC0475b.setTransition(n36Var);
                abstractC0475b.setProgress(1.0f);
            } else {
                if (!z2 || (i & 4096) == 0) {
                    return;
                }
                abstractC0475b.setTransition(n36Var);
                abstractC0475b.setProgress(0.0f);
            }
        }
    }
}
