package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$attr;
import com.lingq.core.designsystem.R$dimen;
import com.lingq.feature.review.views.unscrambler.FlowLayout$Gravity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Triple;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v83 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f65005a;

    /* JADX INFO: renamed from: b */
    public final p52 f65006b;

    /* JADX INFO: renamed from: c */
    public boolean f65007c;

    /* JADX INFO: renamed from: d */
    public final HashMap f65008d;

    /* JADX INFO: renamed from: e */
    public final HashMap f65009e;

    /* JADX INFO: renamed from: f */
    public float f65010f;

    /* JADX INFO: renamed from: g */
    public float f65011g;

    public v83(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65006b = new p52(this);
        this.f65008d = new HashMap();
        this.f65009e = new HashMap();
        this.f65010f = -1.0f;
        this.f65011g = -1.0f;
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: e */
    public final View m23168e(float f, float f2) {
        Triple triple;
        Integer numValueOf;
        Triple triple2;
        HashMap map = this.f65008d;
        Float f3 = (Float) map.get(Integer.valueOf(map.size()));
        float fAbs = f3 != null ? Math.abs(f3.floatValue()) : getMeasuredHeight();
        int i = this.f65005a / 2;
        if (f2 <= fAbs + i && f2 >= (-i)) {
            int iM23169f = m23169f(f2);
            int itemSpacing = getItemSpacing() / 2;
            if (getLayoutDirection() == 1) {
                f = getWidth() - f;
            }
            Integer numValueOf2 = Integer.valueOf(iM23169f);
            HashMap map2 = this.f65009e;
            List list = (List) map2.get(numValueOf2);
            if (list != null) {
                Iterator it = list.iterator();
                boolean z = false;
                Object obj = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            break;
                        }
                        break;
                    }
                    Object next = it.next();
                    Triple triple3 = (Triple) next;
                    if (f >= ((Number) triple3.f47635c).intValue() - itemSpacing) {
                        if (f > ((Number) triple3.f47634b).intValue() + ((Number) triple3.f47635c).intValue() + itemSpacing) {
                            continue;
                        } else if (!z) {
                            z = true;
                            obj = next;
                        }
                    }
                    obj = null;
                    break;
                }
                triple = (Triple) obj;
            } else {
                triple = null;
            }
            if (triple != null) {
                numValueOf = Integer.valueOf(((Number) triple.f47633a).intValue());
            } else {
                List list2 = (List) map2.get(Integer.valueOf(iM23169f));
                numValueOf = (list2 == null || (triple2 = (Triple) u91.m22597O0(list2)) == null) ? null : (Integer) triple2.f47633a;
            }
            if (numValueOf != null) {
                return getChildAt(numValueOf.intValue());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final int m23169f(float f) {
        int i = this.f65005a / 2;
        HashMap map = this.f65008d;
        Float f2 = (Float) map.get(Integer.valueOf(map.size()));
        float fAbs = f2 != null ? Math.abs(f2.floatValue()) : getMeasuredHeight();
        float f3 = i + fAbs;
        if (f <= f3) {
            float f4 = -i;
            if (f >= f4) {
                if (f < 0.0f && f > f4) {
                    return 1;
                }
                if (f > fAbs && f < f3) {
                    return map.size();
                }
                int size = map.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Float f5 = (Float) map.get(Integer.valueOf(i2));
                    if (f >= (f5 != null ? f5.floatValue() : 0.0f)) {
                        int i3 = i2 + 1;
                        Float f6 = (Float) map.get(Integer.valueOf(i3));
                        if (f < (f6 != null ? f6.floatValue() : getMeasuredHeight())) {
                            return i3;
                        }
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m23170g(View view, float f) {
        Triple triple;
        List list = (List) this.f65009e.get(Integer.valueOf(m23169f(f)));
        Integer num = (list == null || (triple = (Triple) u91.m22589G0(list)) == null) ? null : (Integer) triple.f47633a;
        if (num == null) {
            return false;
        }
        return view.equals(getChildAt(num.intValue()));
    }

    public abstract FlowLayout$Gravity getGravity();

    public final int getItemSpacing() {
        return getResources().getDimensionPixelSize(R$dimen.spacing_standard);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.f65007c && getMeasuredHeight() > 0) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setAntiAlias(true);
            paint.setColor(-3355444);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(2.0f);
            try {
                if (getChildCount() == 0) {
                    height = (int) getResources().getDimension(R$dimen.sentence_builder_word_height);
                } else {
                    if (!(getChildCount() > 0)) {
                        throw new NoSuchElementException();
                    }
                    int i = 0 + 1;
                    View childAt = getChildAt(0);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    if (i < getChildCount()) {
                        int height2 = childAt.getHeight();
                        while (true) {
                            int i2 = i + 1;
                            View childAt2 = getChildAt(i);
                            if (childAt2 == null) {
                                throw new IndexOutOfBoundsException();
                            }
                            int height3 = childAt2.getHeight();
                            if (height2 < height3) {
                                childAt = childAt2;
                                height2 = height3;
                            }
                            if (!(i2 < getChildCount())) {
                                break;
                            } else {
                                i = i2;
                            }
                        }
                    }
                    height = childAt.getHeight();
                }
                int measuredHeight = getMeasuredHeight() / Math.max(getItemSpacing() + height, 1);
                float f = height;
                if (1 <= measuredHeight) {
                    float f2 = f;
                    int i3 = 1;
                    while (true) {
                        float itemSpacing = f2 + (i3 == 1 ? getItemSpacing() / 2.0f : getItemSpacing());
                        canvas.drawLine(0.0f, itemSpacing, getWidth(), itemSpacing, paint);
                        this.f65008d.put(Integer.valueOf(i3), Float.valueOf(itemSpacing));
                        f2 = itemSpacing + f;
                        if (i3 == measuredHeight) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f65010f < 0.0f || getMeasuredHeight() <= 0 || getChildCount() <= 1) {
            return;
        }
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setAntiAlias(true);
        Context context = getContext();
        context.getClass();
        paint2.setColor(jfa.m14431n(context, R$attr.colorOnSurface));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(2.0f);
        float f3 = this.f65010f - 2.0f;
        float fM23169f = (m23169f(this.f65011g) - 1) * this.f65005a;
        canvas.drawLine(f3, fM23169f + getItemSpacing(), f3, fM23169f + getItemSpacing() + (this.f65005a / 2), paint2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        p52 p52Var = this.f65006b;
        p52Var.f55590b = i5;
        ArrayList arrayList = (ArrayList) p52Var.f55593e;
        ArrayList arrayList2 = (ArrayList) p52Var.f55592d;
        ArrayList arrayList3 = (ArrayList) p52Var.f55591c;
        HashMap map = this.f65009e;
        map.clear();
        int i6 = 0;
        for (int childCount = getChildCount(); i6 < childCount; childCount = childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (paddingLeft + measuredWidth > i5) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.f65005a;
                    p52Var.m18898l();
                }
                p52Var.f55589a = paddingTop;
                arrayList3.add(childAt);
                arrayList2.add(Integer.valueOf(measuredWidth));
                arrayList.add(Integer.valueOf(measuredHeight));
                List arrayList4 = (List) map.get(Integer.valueOf((paddingTop / this.f65005a) + 1));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList4.add(new Triple(Integer.valueOf(i6), Integer.valueOf(measuredWidth), Integer.valueOf(paddingLeft)));
                map.put(Integer.valueOf((paddingTop / this.f65005a) + 1), arrayList4);
                paddingLeft = getItemSpacing() + measuredWidth + paddingLeft;
            }
            i6++;
        }
        p52Var.m18898l();
        arrayList3.clear();
        arrayList2.clear();
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View.MeasureSpec.getMode(i);
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                int itemSpacing = getItemSpacing() + childAt.getMeasuredHeight();
                if (i3 < itemSpacing) {
                    i3 = itemSpacing;
                }
                if (paddingLeft + measuredWidth > size) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += i3;
                }
                paddingLeft = getItemSpacing() + measuredWidth + paddingLeft;
            }
        }
        this.f65005a = i3;
        if (View.MeasureSpec.getMode(i2) == 0 || (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && paddingTop + i3 < size2)) {
            size2 = paddingTop + i3;
        }
        setMeasuredDimension(size, size2);
    }

    public final void setDrawLines(boolean z) {
        this.f65007c = z;
        invalidate();
    }
}
