package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: zk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C1176zk extends View {

    /* JADX INFO: renamed from: c */
    public int[] f48359c;

    /* JADX INFO: renamed from: d */
    public int f48360d;

    /* JADX INFO: renamed from: e */
    protected final Context f48361e;

    /* JADX INFO: renamed from: f */
    public String f48362f;

    /* JADX INFO: renamed from: g */
    protected String f48363g;

    /* JADX INFO: renamed from: h */
    public final HashMap f48364h;

    /* JADX INFO: renamed from: i */
    public C1156yr f48365i;

    public C1176zk(Context context) {
        super(context);
        this.f48359c = new int[32];
        this.f48364h = new HashMap();
        this.f48361e = context;
        mo1403a(null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX INFO: renamed from: c */
    private final void m19789c(String str) {
        int iM19792d;
        if (str == null || str.length() == 0 || this.f48361e == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (!isInEditMode() || constraintLayout == null) {
            iM19792d = 0;
        } else {
            Object designInformation = constraintLayout.getDesignInformation(0, strTrim);
            if (designInformation instanceof Integer) {
                iM19792d = ((Integer) designInformation).intValue();
            } else {
                iM19792d = 0;
            }
        }
        if (iM19792d == 0) {
            iM19792d = constraintLayout != null ? m19792d(constraintLayout, strTrim) : 0;
        }
        if (iM19792d == 0) {
            try {
                identifier = aac.class.getField(strTrim).getInt(null);
            } catch (Exception e) {
            }
        } else {
            identifier = iM19792d;
        }
        if (identifier == 0) {
            identifier = this.f48361e.getResources().getIdentifier(strTrim, "id", this.f48361e.getPackageName());
        }
        if (identifier != 0) {
            this.f48364h.put(Integer.valueOf(identifier), strTrim);
            m19790i(identifier);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    /* JADX INFO: renamed from: i */
    private final void m19790i(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f48360d + 1;
        int[] iArr = this.f48359c;
        int length = iArr.length;
        if (i2 > length) {
            this.f48359c = Arrays.copyOf(iArr, length + length);
        }
        int[] iArr2 = this.f48359c;
        int i3 = this.f48360d;
        iArr2[i3] = i;
        this.f48360d = i3 + 1;
    }

    /* JADX INFO: renamed from: j */
    private final void m19791j(String str) {
        if (str == null || str.length() == 0 || this.f48361e == null) {
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
            if ((layoutParams instanceof C1178zm) && strTrim.equals(((C1178zm) layoutParams).f48396ac)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m19790i(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected void mo1403a(AttributeSet attributeSet) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public void mo1404b(C1152yn c1152yn, boolean z) {
    }

    /* JADX INFO: renamed from: d */
    public final int m19792d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || (resources = this.f48361e.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException e) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m19793e(String str) {
        this.f48362f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f48360d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m19789c(str.substring(i));
                return;
            } else {
                m19789c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    protected final void m19794f(String str) {
        this.f48363g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f48360d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m19791j(str.substring(i));
                return;
            } else {
                m19791j(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19795g(int[] iArr) {
        this.f48362f = null;
        this.f48360d = 0;
        for (int i : iArr) {
            m19790i(i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m19796h() {
        if (this.f48365i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1178zm) {
            ((C1178zm) layoutParams).f48415av = this.f48365i;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f48362f;
        if (str != null) {
            m19793e(str);
        }
        String str2 = this.f48363g;
        if (str2 != null) {
            m19794f(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f48362f == null) {
            m19790i(i);
        }
    }

    public C1176zk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48359c = new int[32];
        this.f48364h = new HashMap();
        this.f48361e = context;
        mo1403a(attributeSet);
    }

    public C1176zk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48359c = new int[32];
        this.f48364h = new HashMap();
        this.f48361e = context;
        mo1403a(attributeSet);
    }
}
