package com.lingq.feature.review.views.unscrambler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.lingq.feature.review.R$id;
import com.lingq.feature.review.R$layout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000.C3386nv;
import p000.a45;
import p000.gw8;
import p000.hw8;
import p000.iw8;
import p000.jfa;
import p000.kw8;
import p000.lfa;
import p000.m25;
import p000.oaa;
import p000.p20;
import p000.qv7;
import p000.sx8;
import p000.tx8;
import p000.u91;
import p000.vk9;
import p000.y52;

/* JADX INFO: loaded from: classes3.dex */
public final class SentenceBuilderView extends LinearLayout {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f32801j = 0;

    /* JADX INFO: renamed from: a */
    public final SentenceView f32802a;

    /* JADX INFO: renamed from: b */
    public final SentenceView f32803b;

    /* JADX INFO: renamed from: c */
    public final SentenceView f32804c;

    /* JADX INFO: renamed from: d */
    public String f32805d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f32806e;

    /* JADX INFO: renamed from: f */
    public kw8 f32807f;

    /* JADX INFO: renamed from: g */
    public final HashSet f32808g;

    /* JADX INFO: renamed from: h */
    public final HashSet f32809h;

    /* JADX INFO: renamed from: i */
    public boolean f32810i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceBuilderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f32805d = "";
        this.f32806e = new ArrayList();
        this.f32808g = new HashSet();
        this.f32809h = new HashSet();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_sentence_builder, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R$id.viewBuilder;
        SentenceView sentenceView = (SentenceView) lfa.m16159c(viewInflate, i);
        if (sentenceView != null) {
            i = R$id.viewOriginalSentence;
            SentenceView sentenceView2 = (SentenceView) lfa.m16159c(viewInflate, i);
            if (sentenceView2 != null) {
                i = R$id.viewOriginalSentenceBackground;
                SentenceView sentenceView3 = (SentenceView) lfa.m16159c(viewInflate, i);
                if (sentenceView3 != null) {
                    this.f32802a = sentenceView;
                    sentenceView.setDrawLines(true);
                    sentenceView.setDragAndDrop(true);
                    this.f32803b = sentenceView2;
                    FlowLayout$Gravity flowLayout$Gravity = FlowLayout$Gravity.CENTER;
                    sentenceView2.setGravity(flowLayout$Gravity);
                    this.f32804c = sentenceView3;
                    sentenceView3.setGravity(flowLayout$Gravity);
                    sentenceView.setListener(new gw8(this));
                    sentenceView2.setListener(new hw8(this));
                    return;
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9662a() {
        String string = vk9.m23376L0(u91.m22596N0(this.f32806e, " ", null, null, new qv7(25), 30)).toString();
        if (string.length() == this.f32805d.length()) {
            return string.equalsIgnoreCase(this.f32805d);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m9663b(boolean z) {
        HashSet hashSet = this.f32809h;
        if (hashSet.size() == 1 || z) {
            boolean z2 = this.f32810i;
            SentenceView sentenceView = this.f32803b;
            if (z2) {
                sx8 sx8Var = (sx8) u91.m22588F0(hashSet);
                long jMax = Math.max(0L, 300 - ((long) ((hashSet.size() - 1) * 100)));
                if (this.f32810i) {
                    String str = sx8Var.f61555a;
                    sentenceView.getClass();
                    str.getClass();
                    tx8 tx8VarM9667j = SentenceView.m9667j(sentenceView, str, 0, false, 0, 4);
                    jfa.m14420c(tx8VarM9667j);
                    sentenceView.addView(tx8VarM9667j, 0);
                }
                sentenceView.getViewTreeObserver().addOnGlobalLayoutListener(new iw8(sentenceView, this, sx8Var, jMax, 0));
                return;
            }
            sx8 sx8Var2 = (sx8) u91.m22588F0(hashSet);
            long jMax2 = Math.max(0L, 300 - ((long) ((hashSet.size() - 1) * 100)));
            int i = sx8Var2.f61557c;
            SentenceView sentenceView2 = this.f32802a;
            View childAt = sentenceView2.getChildAt(i);
            int i2 = sx8Var2.f61556b;
            View childAt2 = sentenceView.getChildAt(i2);
            if (childAt == null || childAt2 == null) {
                hashSet.remove(sx8Var2);
                return;
            }
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            int[] iArr2 = new int[2];
            childAt2.getLocationOnScreen(iArr2);
            jfa.m14424g(childAt2, f - iArr2[0], f2 - iArr2[1], 0L, null, 24);
            oaa.m17884a(sentenceView2, new p20());
            jfa.m14429l(childAt2);
            jfa.m14420c(childAt);
            sentenceView2.removeViewAt(sx8Var2.f61557c);
            View childAt3 = this.f32804c.getChildAt(i2);
            if (childAt3 == null) {
                hashSet.remove(sx8Var2);
                return;
            }
            int[] iArr3 = new int[2];
            childAt3.getLocationOnScreen(iArr3);
            float f3 = iArr3[0];
            float f4 = iArr3[1];
            childAt2.getLocationOnScreen(iArr2);
            jfa.m14424g(childAt2, f3 - iArr2[0], f4 - iArr2[1], jMax2, new a45(24, this, sx8Var2), 8);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9664c(boolean z) {
        HashSet hashSet = this.f32808g;
        if (hashSet.size() == 1 || z) {
            sx8 sx8Var = (sx8) u91.m22588F0(hashSet);
            long jMax = Math.max(0L, 300 - ((long) ((hashSet.size() - 1) * 100)));
            String str = sx8Var.f61555a;
            SentenceView sentenceView = this.f32802a;
            int childCount = sentenceView.getChildCount();
            str.getClass();
            tx8 tx8VarM9667j = SentenceView.m9667j(sentenceView, str, childCount, false, 0, 12);
            jfa.m14420c(tx8VarM9667j);
            sentenceView.addView(tx8VarM9667j);
            sentenceView.getViewTreeObserver().addOnGlobalLayoutListener(new iw8(sentenceView, this, sx8Var, jMax, 1));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9665d(String str, boolean z) {
        str.getClass();
        if (this.f32805d.length() <= 0 || z) {
            SentenceView sentenceView = this.f32803b;
            SentenceView sentenceView2 = this.f32804c;
            if (z) {
                this.f32802a.removeAllViews();
                sentenceView.removeAllViews();
                sentenceView2.removeAllViews();
                this.f32806e.clear();
                this.f32808g.clear();
                this.f32809h.clear();
            }
            this.f32805d = str;
            ArrayList arrayList = new ArrayList(vk9.m23365A0(str, new String[]{" "}, 0, 6));
            int iMin = Math.min(arrayList.size(), 10);
            int size = arrayList.size() / iMin;
            int size2 = arrayList.size() % iMin;
            int i = iMin - size2;
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(Integer.valueOf(size));
            }
            ArrayList arrayList3 = new ArrayList(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(Integer.valueOf(size + 1));
            }
            ArrayList arrayListM22603U0 = u91.m22603U0(arrayList3, arrayList2);
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayListM22603U0.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                arrayList4.add(u91.m22596N0(arrayList.subList(0, iIntValue), " ", null, null, null, 62));
                arrayList.subList(0, iIntValue).clear();
            }
            List listM22625q1 = u91.m22625q1(arrayList4);
            Collections.shuffle(listM22625q1);
            SentenceView.m9666h(sentenceView, listM22625q1, 6);
            SentenceView.m9666h(sentenceView2, listM22625q1, 2);
            sentenceView2.getViewTreeObserver().addOnGlobalLayoutListener(new m25(2, sentenceView2, this));
        }
    }

    public final String getAnswer() {
        return vk9.m23376L0(u91.m22596N0(this.f32806e, " ", null, null, new qv7(24), 30)).toString();
    }

    public final String getSentence() {
        return this.f32805d;
    }

    public final void setIsRTL(boolean z) {
        SentenceView sentenceView = this.f32802a;
        if (z) {
            sentenceView.setGravity(FlowLayout$Gravity.RIGHT);
            sentenceView.setLayoutDirection(1);
        } else {
            sentenceView.setGravity(FlowLayout$Gravity.LEFT);
            sentenceView.setLayoutDirection(0);
        }
    }

    public final void setListener(kw8 kw8Var) {
        kw8Var.getClass();
        this.f32807f = kw8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SentenceBuilderView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ SentenceBuilderView(Context context, AttributeSet attributeSet, int i, y52 y52Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
