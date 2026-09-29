package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;
import p061d2.C5039b;
import p143h2.C5880c;
import p143h2.C5881d;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0761a extends View {

    /* JADX INFO: renamed from: a */
    public int[] f5366a;

    /* JADX INFO: renamed from: b */
    public int f5367b;

    /* JADX INFO: renamed from: c */
    public final Context f5368c;

    /* JADX INFO: renamed from: d */
    public C5039b f5369d;

    /* JADX INFO: renamed from: e */
    public String f5370e;

    /* JADX INFO: renamed from: f */
    public String f5371f;

    /* JADX INFO: renamed from: g */
    public View[] f5372g;

    /* JADX INFO: renamed from: h */
    public final HashMap<Integer, String> f5373h;

    public AbstractC0761a(Context context) {
        super(context);
        this.f5366a = new int[32];
        this.f5372g = null;
        this.f5373h = new HashMap<>();
        this.f5368c = context;
        mo2784l(null);
    }

    public AbstractC0761a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5366a = new int[32];
        this.f5372g = null;
        this.f5373h = new HashMap<>();
        this.f5368c = context;
        mo2784l(attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public final void m2874e(String str) {
        if (str != null && str.length() != 0 && this.f5368c != null) {
            String strTrim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
            }
            int iM2880k = m2880k(strTrim);
            if (iM2880k != 0) {
                this.f5373h.put(Integer.valueOf(iM2880k), strTrim);
                m2875f(iM2880k);
            } else {
                Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2875f(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f5367b + 1;
        int[] iArr = this.f5366a;
        if (i11 > iArr.length) {
            this.f5366a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f5366a;
        int i12 = this.f5367b;
        iArr2[i12] = i10;
        this.f5367b = i12 + 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m2876g(String str) {
        if (str != null) {
            if (str.length() != 0 && this.f5368c != null) {
                String strTrim = str.trim();
                ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
                if (constraintLayout == null) {
                    Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                    return;
                }
                int childCount = constraintLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = constraintLayout.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ConstraintLayout.C0759b) && strTrim.equals(((ConstraintLayout.C0759b) layoutParams).f5311Y)) {
                        if (childAt.getId() == -1) {
                            Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                        } else {
                            m2875f(childAt.getId());
                        }
                    }
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f5366a, this.f5367b);
    }

    /* JADX INFO: renamed from: h */
    public final void m2877h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f5367b; i10++) {
            View viewM2863d = constraintLayout.m2863d(this.f5366a[i10]);
            if (viewM2863d != null) {
                viewM2863d.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewM2863d.setTranslationZ(viewM2863d.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo2878i(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: j */
    public final int m2879j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f5368c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
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
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX INFO: renamed from: k */
    public final int m2880k(String str) {
        int iM2879j;
        HashMap<String, Integer> map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iM2879j = 0;
        } else {
            Integer num = ((str instanceof String) && (map = constraintLayout.f5271H) != null && map.containsKey(str)) ? constraintLayout.f5271H.get(str) : null;
            if (num instanceof Integer) {
                iM2879j = num.intValue();
            } else {
                iM2879j = 0;
            }
        }
        if (iM2879j == 0 && constraintLayout != null) {
            iM2879j = m2879j(constraintLayout, str);
        }
        if (iM2879j == 0) {
            try {
                iM2879j = C5880c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iM2879j != 0) {
            return iM2879j;
        }
        Context context = this.f5368c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    /* JADX INFO: renamed from: l */
    public void mo2784l(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5881d.f35168b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f5370e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f5371f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo2785m(C0762b.a aVar, C5039b c5039b, C0763c.a aVar2, SparseArray sparseArray) {
        C0762b.b bVar = aVar.f5387e;
        int[] iArr = bVar.f5449j0;
        int i10 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f5451k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = bVar.f5451k0.split(",");
                    getContext();
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i11 = 0;
                    for (String str2 : strArrSplit) {
                        int iM2880k = m2880k(str2.trim());
                        if (iM2880k != 0) {
                            iArrCopyOf[i11] = iM2880k;
                            i11++;
                        }
                    }
                    if (i11 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
                    }
                    bVar.f5449j0 = iArrCopyOf;
                } else {
                    bVar.f5449j0 = null;
                }
            }
        }
        c5039b.mo10719a();
        if (bVar.f5449j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = bVar.f5449j0;
            if (i10 >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr2[i10]);
            if (constraintWidget != null) {
                c5039b.mo10720b(constraintWidget);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo2786n(ConstraintWidget constraintWidget, boolean z10) {
    }

    /* JADX INFO: renamed from: o */
    public final void m2881o() {
        if (this.f5369d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0759b) {
            ((ConstraintLayout.C0759b) layoutParams).f5346q0 = this.f5369d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f5370e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f5371f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f5370e = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f5367b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                m2874e(str.substring(i10));
                return;
            } else {
                m2874e(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f5371f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f5367b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                m2876g(str.substring(i10));
                return;
            } else {
                m2876g(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f5370e = null;
        this.f5367b = 0;
        for (int i10 : iArr) {
            m2875f(i10);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f5370e == null) {
            m2875f(i10);
        }
    }
}
