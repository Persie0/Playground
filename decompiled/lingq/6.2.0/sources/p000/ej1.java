package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$id;
import androidx.constraintlayout.widget.R$styleable;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ej1 extends View {

    /* JADX INFO: renamed from: a */
    public int[] f37318a;

    /* JADX INFO: renamed from: b */
    public int f37319b;

    /* JADX INFO: renamed from: c */
    public final Context f37320c;

    /* JADX INFO: renamed from: d */
    public os3 f37321d;

    /* JADX INFO: renamed from: e */
    public String f37322e;

    /* JADX INFO: renamed from: f */
    public String f37323f;

    /* JADX INFO: renamed from: g */
    public final HashMap f37324g;

    public ej1(Context context) {
        super(context);
        this.f37318a = new int[32];
        this.f37324g = new HashMap();
        this.f37320c = context;
        mo1930h(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m11166a(String str) {
        if (str.length() == 0 || this.f37320c == null) {
            return;
        }
        String strTrim = str.trim();
        int iM11171g = m11171g(strTrim);
        if (iM11171g != 0) {
            this.f37324g.put(Integer.valueOf(iM11171g), strTrim);
            m11167b(iM11171g);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11167b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f37319b + 1;
        int[] iArr = this.f37318a;
        if (i2 > iArr.length) {
            this.f37318a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f37318a;
        int i3 = this.f37319b;
        iArr2[i3] = i;
        this.f37319b = i3 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m11168c(String str) {
        if (str.length() == 0 || this.f37320c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof hj1) && strTrim.equals(((hj1) layoutParams).f42440Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m11167b(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11169d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f37319b; i++) {
            View view = (View) constraintLayout.f5449a.get(this.f37318a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo10705e(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: f */
    public final int m11170f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f37320c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX INFO: renamed from: g */
    public final int m11171g(String str) {
        int iM11170f;
        HashMap map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iM11170f = 0;
        } else {
            Object obj = (str == null || (map = constraintLayout.f5446H) == null || !map.containsKey(str)) ? null : constraintLayout.f5446H.get(str);
            if (obj instanceof Integer) {
                iM11170f = ((Integer) obj).intValue();
            } else {
                iM11170f = 0;
            }
        }
        if (iM11170f == 0 && constraintLayout != null) {
            iM11170f = m11170f(constraintLayout, str);
        }
        if (iM11170f == 0) {
            try {
                iM11170f = R$id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iM11170f != 0) {
            return iM11170f;
        }
        Context context = this.f37320c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f37318a, this.f37319b);
    }

    /* JADX INFO: renamed from: h */
    public void mo1930h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f37322e = string;
                    setIds(string);
                } else if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f37323f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo1931i(nj1 nj1Var, os3 os3Var, zj1 zj1Var, SparseArray sparseArray) {
        oj1 oj1Var = nj1Var.f52823e;
        int[] iArr = oj1Var.f54435j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = oj1Var.f54437k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = oj1Var.f54437k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int iM11171g = m11171g(str2.trim());
                        if (iM11171g != 0) {
                            iArrCopyOf[i2] = iM11171g;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    oj1Var.f54435j0 = iArrCopyOf;
                } else {
                    oj1Var.f54435j0 = null;
                }
            }
        }
        os3Var.f54931u0 = 0;
        Arrays.fill(os3Var.f54930t0, (Object) null);
        if (oj1Var.f54435j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = oj1Var.f54435j0;
            if (i >= iArr2.length) {
                return;
            }
            vj1 vj1Var = (vj1) sparseArray.get(iArr2[i]);
            if (vj1Var != null) {
                os3Var.m18460S(vj1Var);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo1932j(vj1 vj1Var, boolean z);

    /* JADX INFO: renamed from: k */
    public final void m11172k() {
        if (this.f37321d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof hj1) {
            ((hj1) layoutParams).f42473p0 = this.f37321d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f37322e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f37323f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f37322e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f37319b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m11166a(str.substring(i));
                return;
            } else {
                m11166a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f37323f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f37319b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m11168c(str.substring(i));
                return;
            } else {
                m11168c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f37322e = null;
        this.f37319b = 0;
        for (int i : iArr) {
            m11167b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f37322e == null) {
            m11167b(i);
        }
    }

    public ej1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37318a = new int[32];
        this.f37324g = new HashMap();
        this.f37320c = context;
        mo1930h(attributeSet);
    }

    public ej1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37318a = new int[32];
        this.f37324g = new HashMap();
        this.f37320c = context;
        mo1930h(attributeSet);
    }
}
