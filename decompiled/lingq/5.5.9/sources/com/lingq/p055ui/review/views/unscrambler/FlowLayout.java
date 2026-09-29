package com.lingq.p055ui.review.views.unscrambler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C6752c;
import p225kk.C6716m;
import p471x2.C10041h0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f30471a;

    /* JADX INFO: renamed from: b */
    public final C4702a f30472b;

    /* JADX INFO: renamed from: c */
    public boolean f30473c;

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, Float> f30474d;

    /* JADX INFO: renamed from: e */
    public final HashMap<Integer, List<Triple<Integer, Integer, Integer>>> f30475e;

    /* JADX INFO: renamed from: f */
    public float f30476f;

    /* JADX INFO: renamed from: g */
    public float f30477g;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/review/views/unscrambler/FlowLayout$Gravity;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum Gravity {
        LEFT,
        RIGHT,
        CENTER
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.views.unscrambler.FlowLayout$a */
    public final class C4702a {

        /* JADX INFO: renamed from: a */
        public int f30478a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f30479b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final ArrayList f30480c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final ArrayList f30481d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public int f30482e;

        /* JADX INFO: renamed from: com.lingq.ui.review.views.unscrambler.FlowLayout$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f30484a;

            static {
                int[] iArr = new int[Gravity.values().length];
                try {
                    iArr[Gravity.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Gravity.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Gravity.CENTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f30484a = iArr;
            }
        }

        public C4702a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m10315a() {
            FlowLayout flowLayout = FlowLayout.this;
            Gravity gravity = flowLayout.getGravity();
            int itemSpacing = flowLayout.getItemSpacing();
            int i10 = a.f30484a[gravity.ordinal()];
            ArrayList arrayList = this.f30481d;
            ArrayList arrayList2 = this.f30480c;
            ArrayList arrayList3 = this.f30479b;
            int i11 = 0;
            if (i10 == 1) {
                int paddingLeft = flowLayout.getPaddingLeft();
                while (i11 < arrayList3.size()) {
                    ((View) arrayList3.get(i11)).layout(paddingLeft, this.f30478a, ((Number) arrayList2.get(i11)).intValue() + paddingLeft, ((Number) arrayList.get(i11)).intValue() + this.f30478a);
                    paddingLeft += ((Number) arrayList2.get(i11)).intValue() + itemSpacing;
                    i11++;
                }
            } else if (i10 == 2) {
                int paddingRight = this.f30482e - flowLayout.getPaddingRight();
                if (flowLayout.getLayoutDirection() == 1) {
                    while (i11 < arrayList3.size()) {
                        int iIntValue = paddingRight - ((Number) arrayList2.get(i11)).intValue();
                        View view = (View) arrayList3.get(i11);
                        int i12 = this.f30478a;
                        view.layout(iIntValue, i12, paddingRight, ((Number) arrayList.get(i11)).intValue() + i12);
                        paddingRight = iIntValue - itemSpacing;
                        i11++;
                    }
                } else {
                    for (int size = arrayList3.size() - 1; size >= 0; size--) {
                        int iIntValue2 = paddingRight - ((Number) arrayList2.get(size)).intValue();
                        View view2 = (View) arrayList3.get(size);
                        int i13 = this.f30478a;
                        view2.layout(iIntValue2, i13, paddingRight, ((Number) arrayList.get(size)).intValue() + i13);
                        paddingRight = iIntValue2 - itemSpacing;
                    }
                }
            } else if (i10 == 3) {
                int size2 = arrayList2.size();
                int iIntValue3 = 0;
                for (int i14 = 0; i14 < size2; i14++) {
                    iIntValue3 += ((Number) arrayList2.get(i14)).intValue();
                }
                int paddingLeft2 = (((((this.f30482e - flowLayout.getPaddingLeft()) - flowLayout.getPaddingRight()) - iIntValue3) - ((arrayList3.size() - 1) * itemSpacing)) / 2) + flowLayout.getPaddingLeft();
                int size3 = arrayList3.size();
                while (i11 < size3) {
                    ((View) arrayList3.get(i11)).layout(paddingLeft2, this.f30478a, ((Number) arrayList2.get(i11)).intValue() + paddingLeft2, ((Number) arrayList.get(i11)).intValue() + this.f30478a);
                    paddingLeft2 += ((Number) arrayList2.get(i11)).intValue() + itemSpacing;
                    i11++;
                }
            }
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
        }
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30472b = new C4702a();
        this.f30474d = new HashMap<>();
        this.f30475e = new HashMap<>();
        this.f30476f = -1.0f;
        this.f30477g = -1.0f;
        setWillNotDraw(false);
    }

    public abstract Gravity getGravity();

    public final int getItemSpacing() {
        return getResources().getDimensionPixelSize(R.dimen.spacing_standard);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final View m10311h(float f3, float f10) {
        Triple triple;
        Integer numValueOf;
        Triple triple2;
        boolean z10;
        HashMap<Integer, Float> map = this.f30474d;
        Float f11 = map.get(Integer.valueOf(map.size()));
        float fAbs = f11 != null ? Math.abs(f11.floatValue()) : getMeasuredHeight();
        int i10 = this.f30471a / 2;
        if (f10 <= fAbs + i10 && f10 >= (-i10)) {
            int iM10312i = m10312i(f10);
            int itemSpacing = getItemSpacing() / 2;
            if (getLayoutDirection() == 1) {
                f3 = getWidth() - f3;
            }
            HashMap<Integer, List<Triple<Integer, Integer, Integer>>> map2 = this.f30475e;
            List<Triple<Integer, Integer, Integer>> list = map2.get(Integer.valueOf(iM10312i));
            if (list != null) {
                Iterator<T> it = list.iterator();
                Object obj = null;
                boolean z11 = false;
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            if (z11) {
                                break loop0;
                            }
                        } else {
                            Object next = it.next();
                            Triple triple3 = (Triple) next;
                            if (f3 < ((Number) triple3.f38023c).intValue() - itemSpacing) {
                                z10 = false;
                            } else if (f3 <= ((Number) triple3.f38022b).intValue() + ((Number) triple3.f38023c).intValue() + itemSpacing) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (!z11) {
                                    z11 = true;
                                    obj = next;
                                }
                            }
                        }
                        obj = null;
                        break loop0;
                    }
                }
                triple = (Triple) obj;
            } else {
                triple = null;
            }
            if (triple != null) {
                numValueOf = Integer.valueOf(((Number) triple.f38021a).intValue());
            } else {
                List<Triple<Integer, Integer, Integer>> list2 = map2.get(Integer.valueOf(iM10312i));
                numValueOf = (list2 == null || (triple2 = (Triple) C6752c.m13432Z(list2)) == null) ? null : (Integer) triple2.f38021a;
            }
            if (numValueOf == null) {
                return null;
            }
            return getChildAt(numValueOf.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final int m10312i(float f3) {
        int i10 = this.f30471a / 2;
        HashMap<Integer, Float> map = this.f30474d;
        Float f10 = map.get(Integer.valueOf(map.size()));
        float fAbs = f10 != null ? Math.abs(f10.floatValue()) : getMeasuredHeight();
        float f11 = i10 + fAbs;
        if (f3 <= f11) {
            float f12 = -i10;
            if (f3 >= f12) {
                if (f3 < 0.0f && f3 > f12) {
                    return 1;
                }
                if (f3 > fAbs && f3 < f11) {
                    return map.size();
                }
                int size = map.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Float fValueOf = map.get(Integer.valueOf(i11));
                    if (fValueOf == null) {
                        fValueOf = Float.valueOf(0.0f);
                    }
                    if (f3 >= fValueOf.floatValue()) {
                        int i12 = i11 + 1;
                        Float fValueOf2 = map.get(Integer.valueOf(i12));
                        if (fValueOf2 == null) {
                            fValueOf2 = Float.valueOf(getMeasuredHeight());
                        }
                        if (f3 < fValueOf2.floatValue()) {
                            return i12;
                        }
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final boolean m10313j(View view, float f3) {
        Triple triple;
        List<Triple<Integer, Integer, Integer>> list = this.f30475e.get(Integer.valueOf(m10312i(f3)));
        Integer num = (list == null || (triple = (Triple) C6752c.m13423Q(list)) == null) ? null : (Integer) triple.f38021a;
        if (num == null) {
            return false;
        }
        return C5207g.m11106a(view, getChildAt(num.intValue()));
    }

    /* JADX INFO: renamed from: k */
    public final void m10314k() {
        boolean z10 = true;
        if (this.f30476f == -1.0f) {
            if (this.f30477g != -1.0f) {
                z10 = false;
            }
            if (!z10) {
                this.f30476f = -1.0f;
                this.f30477g = -1.0f;
                invalidate();
            }
        } else {
            this.f30476f = -1.0f;
            this.f30477g = -1.0f;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height;
        C5207g.m11111f(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f30473c && getMeasuredHeight() > 0) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setAntiAlias(true);
            paint.setColor(-3355444);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(2.0f);
            try {
                if (getChildCount() == 0) {
                    height = (int) getResources().getDimension(R.dimen.sentence_builder_word_height);
                } else {
                    C10041h0 c10041h0 = new C10041h0(this);
                    if (!c10041h0.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next = c10041h0.next();
                    if (c10041h0.hasNext()) {
                        int height2 = ((View) next).getHeight();
                        do {
                            Object next2 = c10041h0.next();
                            int height3 = ((View) next2).getHeight();
                            if (height2 < height3) {
                                next = next2;
                                height2 = height3;
                            }
                        } while (c10041h0.hasNext());
                    }
                    height = ((View) next).getHeight();
                }
                int measuredHeight = getMeasuredHeight() / Math.max(getItemSpacing() + height, 1);
                float f3 = height;
                if (1 <= measuredHeight) {
                    int i10 = 1;
                    float f10 = f3;
                    while (true) {
                        float itemSpacing = f10 + (i10 == 1 ? getItemSpacing() / 2 : getItemSpacing());
                        canvas.drawLine(0.0f, itemSpacing, getWidth(), itemSpacing, paint);
                        this.f30474d.put(Integer.valueOf(i10), Float.valueOf(itemSpacing));
                        f10 = itemSpacing + f3;
                        if (i10 == measuredHeight) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (this.f30476f < 0.0f || getMeasuredHeight() <= 0 || getChildCount() <= 1) {
            return;
        }
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setAntiAlias(true);
        List<Integer> list = C6716m.f37937a;
        Context context = getContext();
        C5207g.m11110e(context, "context");
        paint2.setColor(C6716m.m13333r(R.attr.tertiaryTextColor, context));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(2.0f);
        float f11 = this.f30476f - 2;
        float fM10312i = (m10312i(this.f30477g) - 1) * this.f30471a;
        canvas.drawLine(f11, fM10312i + getItemSpacing(), f11, fM10312i + getItemSpacing() + (this.f30471a / 2), paint2);
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        C4702a c4702a = this.f30472b;
        c4702a.f30482e = i14;
        HashMap<Integer, List<Triple<Integer, Integer, Integer>>> map = this.f30475e;
        map.clear();
        int i15 = 0;
        while (true) {
            ArrayList arrayList = c4702a.f30481d;
            ArrayList arrayList2 = c4702a.f30480c;
            ArrayList arrayList3 = c4702a.f30479b;
            if (i15 >= childCount) {
                c4702a.m10315a();
                arrayList3.clear();
                arrayList2.clear();
                arrayList.clear();
                return;
            }
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (paddingLeft + measuredWidth > i14) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.f30471a;
                    c4702a.m10315a();
                }
                c4702a.f30478a = paddingTop;
                arrayList3.add(childAt);
                arrayList2.add(Integer.valueOf(measuredWidth));
                arrayList.add(Integer.valueOf(measuredHeight));
                List<Triple<Integer, Integer, Integer>> arrayList4 = map.get(Integer.valueOf((paddingTop / this.f30471a) + 1));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList<>();
                }
                arrayList4.add(new Triple<>(Integer.valueOf(i15), Integer.valueOf(measuredWidth), Integer.valueOf(paddingLeft)));
                map.put(Integer.valueOf((paddingTop / this.f30471a) + 1), arrayList4);
                paddingLeft = getItemSpacing() + measuredWidth + paddingLeft;
            }
            i15++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getMode(i10);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                int itemSpacing = getItemSpacing() + childAt.getMeasuredHeight();
                if (i12 < itemSpacing) {
                    i12 = itemSpacing;
                }
                if (paddingLeft + measuredWidth > size) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += i12;
                }
                paddingLeft = getItemSpacing() + measuredWidth + paddingLeft;
            }
        }
        this.f30471a = i12;
        if (View.MeasureSpec.getMode(i11) == 0 || (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && paddingTop + i12 < size2)) {
            size2 = paddingTop + i12;
        }
        setMeasuredDimension(size, size2);
    }

    public final void setDrawLines(boolean z10) {
        this.f30473c = z10;
        invalidate();
    }
}
