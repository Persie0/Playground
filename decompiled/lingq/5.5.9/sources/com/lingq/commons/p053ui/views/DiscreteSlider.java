package com.lingq.commons.p053ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.slider.RangeSlider;
import com.lingq.commons.p053ui.views.DiscreteSlider;
import com.linguist.R;
import dm.C5207g;
import id.InterfaceC6316a;
import java.util.ArrayList;
import java.util.List;
import kh.C6694u;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import mo.C7661i;
import p225kk.C6716m;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u001d\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u000f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\bJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¨\u0006!"}, m13365d2 = {"Lcom/lingq/commons/ui/views/DiscreteSlider;", "Landroid/widget/LinearLayout;", "", "color", "Lsl/e;", "setLabelTextColor", "count", "setSectionCount", "", "", "values", "setRangeTextValues", "labels", "setLabels", "", "setValues", "margin", "setSideMargins", "", "status", "setDetectDragFinished", "title", "setTitle", "Lcom/lingq/commons/ui/views/DiscreteSlider$a;", "listener", "setDiscreteSliderListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@SuppressLint({"RtlHardcoded", "ClickableViewAccessibility"})
public final class DiscreteSlider extends LinearLayout {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f16712H = 0;

    /* JADX INFO: renamed from: a */
    public final LinearLayout f16713a;

    /* JADX INFO: renamed from: b */
    public final RangeSlider f16714b;

    /* JADX INFO: renamed from: c */
    public final TextView f16715c;

    /* JADX INFO: renamed from: d */
    public int f16716d;

    /* JADX INFO: renamed from: e */
    public int f16717e;

    /* JADX INFO: renamed from: f */
    public List<String> f16718f;

    /* JADX INFO: renamed from: g */
    public List<String> f16719g;

    /* JADX INFO: renamed from: h */
    public String f16720h;

    /* JADX INFO: renamed from: i */
    public boolean f16721i;

    /* JADX INFO: renamed from: j */
    public int f16722j;

    /* JADX INFO: renamed from: k */
    public int f16723k;

    /* JADX INFO: renamed from: l */
    public InterfaceC3277a f16724l;

    /* JADX INFO: renamed from: com.lingq.commons.ui.views.DiscreteSlider$a */
    public interface InterfaceC3277a {
        /* JADX INFO: renamed from: a */
        void mo9349a(int i10, int i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<java.lang.String>, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<java.lang.String>] */
    public DiscreteSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        List<Integer> list = C6716m.f37937a;
        this.f16717e = C6716m.m13333r(R.attr.primaryTextColor, context);
        ?? arrayList = EmptyList.f38032a;
        this.f16718f = arrayList;
        this.f16719g = arrayList;
        this.f16720h = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6694u.f37843a, 0, 0);
        C5207g.m11110e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…eteSlider, 0, 0\n        )");
        this.f16716d = typedArrayObtainStyledAttributes.getInt(2, 5);
        this.f16717e = typedArrayObtainStyledAttributes.getColor(0, this.f16717e);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(1);
        if (textArray != null) {
            arrayList = new ArrayList(textArray.length);
            for (CharSequence charSequence : textArray) {
                arrayList.add(charSequence.toString());
            }
        }
        this.f16719g = arrayList;
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(1);
        setGravity(16);
        Object systemService = context.getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.view_discrete_slider, (ViewGroup) this, true);
        View childAt = getChildAt(0);
        C5207g.m11109d(childAt, "null cannot be cast to non-null type android.widget.TextView");
        this.f16715c = (TextView) childAt;
        View childAt2 = getChildAt(1);
        C5207g.m11109d(childAt2, "null cannot be cast to non-null type com.google.android.material.slider.RangeSlider");
        RangeSlider rangeSlider = (RangeSlider) childAt2;
        this.f16714b = rangeSlider;
        rangeSlider.setValues(C9000b.m17252r(Float.valueOf(0.0f), Float.valueOf(0.0f)));
        rangeSlider.setStepSize(1.0f);
        rangeSlider.setValueFrom(0.0f);
        rangeSlider.setValueTo(this.f16716d - 1);
        View childAt3 = getChildAt(2);
        C5207g.m11109d(childAt3, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f16713a = (LinearLayout) childAt3;
        m9348a(context);
        rangeSlider.f15509l.add(new InterfaceC6316a() { // from class: oh.a
            @Override // id.InterfaceC6316a
            /* JADX INFO: renamed from: a */
            public final void mo12944a(Object obj, float f3, boolean z10) {
                String strM770q;
                DiscreteSlider.InterfaceC3277a interfaceC3277a;
                RangeSlider rangeSlider2 = (RangeSlider) obj;
                int i10 = DiscreteSlider.f16712H;
                DiscreteSlider discreteSlider = this.f43705a;
                C5207g.m11111f(discreteSlider, "this$0");
                C5207g.m11111f(rangeSlider2, "rangeSlider");
                if (z10) {
                    List<Float> values = rangeSlider2.getValues();
                    C5207g.m11110e(values, "rangeSlider.values");
                    discreteSlider.f16722j = (int) ((Number) C6752c.m13423Q(values)).floatValue();
                    int iFloatValue = (int) ((Number) C6752c.m13432Z(values)).floatValue();
                    discreteSlider.f16723k = iFloatValue;
                    if (!discreteSlider.f16721i && (interfaceC3277a = discreteSlider.f16724l) != null) {
                        interfaceC3277a.mo9349a(discreteSlider.f16722j, iFloatValue);
                    }
                    String str = discreteSlider.f16718f.get(discreteSlider.f16722j);
                    String str2 = discreteSlider.f16718f.get(discreteSlider.f16723k);
                    if (!C7661i.m15250P2(discreteSlider.f16720h)) {
                        strM770q = discreteSlider.f16720h;
                    } else {
                        strM770q = C5207g.m11106a(str, str2) ? C0166e.m770q(new Object[]{str}, 1, "%s", "format(format, *args)") : C0166e.m770q(new Object[]{str, str2}, 2, "%s - %s", "format(format, *args)");
                    }
                    discreteSlider.f16715c.setText(strM770q);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m9348a(Context context) {
        int i10 = 0;
        for (String str : this.f16719g) {
            int i11 = i10 + 1;
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextColor(this.f16717e);
            textView.setGravity(3);
            this.f16713a.addView(textView);
            textView.setLayoutParams(i10 == this.f16719g.size() + (-1) ? new LinearLayout.LayoutParams(-2, -2, 0.0f) : new LinearLayout.LayoutParams(-2, -2, 1.0f));
            i10 = i11;
        }
    }

    public final void setDetectDragFinished(boolean z10) {
        this.f16721i = z10;
        if (z10) {
            this.f16714b.f15471H.add(new C3285a(this));
        }
    }

    public final void setDiscreteSliderListener(InterfaceC3277a interfaceC3277a) {
        C5207g.m11111f(interfaceC3277a, "listener");
        this.f16724l = interfaceC3277a;
    }

    public final void setLabelTextColor(int i10) {
        this.f16717e = i10;
        this.f16713a.removeAllViews();
        Context context = getContext();
        C5207g.m11110e(context, "context");
        m9348a(context);
    }

    public final void setLabels(List<String> list) {
        C5207g.m11111f(list, "labels");
        this.f16719g = list;
        this.f16713a.removeAllViews();
        Context context = getContext();
        C5207g.m11110e(context, "context");
        m9348a(context);
    }

    public final void setRangeTextValues(List<String> list) {
        C5207g.m11111f(list, "values");
        this.f16718f = list;
    }

    public final void setSectionCount(int i10) {
        this.f16716d = i10;
        this.f16714b.setValueTo(i10 - 1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void setSideMargins(int i10) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) layoutParams;
        ((ViewGroup.MarginLayoutParams) c1121n).leftMargin = i10;
        ((ViewGroup.MarginLayoutParams) c1121n).rightMargin = i10;
        setLayoutParams(c1121n);
    }

    public final void setTitle(String str) {
        C5207g.m11111f(str, "title");
        this.f16720h = str;
        this.f16715c.setText(str);
    }

    public final void setValues(List<Float> list) {
        C5207g.m11111f(list, "values");
        this.f16714b.setValues(list);
        String strM770q = this.f16718f.get((int) ((Number) C6752c.m13423Q(list)).floatValue());
        String str = this.f16718f.get((int) ((Number) C6752c.m13432Z(list)).floatValue());
        if (C7661i.m15250P2(this.f16720h)) {
            if (!C5207g.m11106a(strM770q, str)) {
                strM770q = C0166e.m770q(new Object[]{strM770q, str}, 2, "%s - %s", "format(format, *args)");
            }
            this.f16715c.setText(strM770q);
        }
    }
}
