package com.lingq.feature.review.views.unscrambler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.lingq.feature.review.R$layout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import p000.C3288l7;
import p000.C3386nv;
import p000.fa4;
import p000.gfa;
import p000.h31;
import p000.jfa;
import p000.kw8;
import p000.oaa;
import p000.p20;
import p000.sx8;
import p000.tx8;
import p000.v63;
import p000.v83;
import p000.vz1;
import p000.y52;

/* JADX INFO: loaded from: classes3.dex */
public final class SentenceView extends v83 implements kw8 {

    /* JADX INFO: renamed from: H */
    public float f32811H;

    /* JADX INFO: renamed from: I */
    public final int f32812I;

    /* JADX INFO: renamed from: J */
    public long f32813J;

    /* JADX INFO: renamed from: K */
    public boolean f32814K;

    /* JADX INFO: renamed from: L */
    public boolean f32815L;

    /* JADX INFO: renamed from: h */
    public FlowLayout$Gravity f32816h;

    /* JADX INFO: renamed from: i */
    public kw8 f32817i;

    /* JADX INFO: renamed from: j */
    public boolean f32818j;

    /* JADX INFO: renamed from: k */
    public tx8 f32819k;

    /* JADX INFO: renamed from: l */
    public float f32820l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f32816h = FlowLayout$Gravity.LEFT;
        this.f32812I = 200;
    }

    /* JADX INFO: renamed from: h */
    public static void m9666h(SentenceView sentenceView, List list, int i) {
        int i2 = 0;
        boolean z = (i & 4) == 0;
        sentenceView.getClass();
        Iterator it = list.iterator();
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return;
            }
            Object next = it.next();
            i2 = i3 + 1;
            if (i3 < 0) {
                vz1.m23628e0();
                throw null;
            }
            SentenceView sentenceView2 = sentenceView;
            sentenceView2.addView(m9667j(sentenceView2, (String) next, i3, z, 0, 8));
            sentenceView = sentenceView2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static tx8 m9667j(SentenceView sentenceView, String str, int i, boolean z, int i2, int i3) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        sentenceView.getClass();
        Context context = sentenceView.getContext();
        context.getClass();
        tx8 tx8Var = new tx8(context, null);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_sentence_word, (ViewGroup) tx8Var, false);
        tx8Var.addView(viewInflate);
        if (viewInflate == null) {
            C3386nv.m17635v("rootView");
            return null;
        }
        TextView textView = (TextView) viewInflate;
        textView.setOnClickListener(new h31(tx8Var, 10));
        if (i2 == -1) {
            i2 = sentenceView.getChildCount();
        }
        tx8Var.setSentenceWord(new sx8(str, i, i2));
        textView.setText(tx8Var.getSentenceWord().f61555a);
        if (z) {
            textView.setTextColor(0);
        }
        tx8Var.setListener(sentenceView);
        return tx8Var;
    }

    @Override // p000.kw8
    /* JADX INFO: renamed from: a */
    public final void mo9668a(sx8 sx8Var) {
        kw8 kw8Var;
        View childAt;
        sx8 sentenceWord;
        sx8Var.getClass();
        if (!this.f32815L) {
            int i = 0;
            while (true) {
                if (!(i < getChildCount())) {
                    childAt = null;
                    break;
                }
                int i2 = i + 1;
                childAt = getChildAt(i);
                if (childAt == null) {
                    v63.m23128b();
                    return;
                }
                tx8 tx8Var = childAt instanceof tx8 ? (tx8) childAt : null;
                if (tx8Var != null && (sentenceWord = tx8Var.getSentenceWord()) != null && sentenceWord.f61556b == sx8Var.f61556b) {
                    break;
                } else {
                    i = i2;
                }
            }
            if (childAt != null) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (!(i4 < getChildCount())) {
                        i3 = -1;
                        break;
                    }
                    int i5 = i4 + 1;
                    View childAt2 = getChildAt(i4);
                    if (childAt2 == null) {
                        v63.m23128b();
                        return;
                    } else {
                        if (i3 < 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        if (childAt.equals(childAt2)) {
                            break;
                        }
                        i3++;
                        i4 = i5;
                    }
                }
                if (i3 != -1) {
                    sx8Var.f61557c = i3;
                }
            }
        }
        if (this.f32818j || (kw8Var = this.f32817i) == null) {
            return;
        }
        kw8Var.mo9668a(sx8Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x0204  */
    /* JADX WARN: Code duplicated, block: B:117:0x0207  */
    /* JADX WARN: Code duplicated, block: B:136:0x0272  */
    /* JADX WARN: Code duplicated, block: B:138:0x0276  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        long timeInMillis;
        View viewM23168e;
        tx8 tx8Var;
        tx8 tx8Var2;
        sx8 sentenceWord;
        sx8 sentenceWord2;
        ViewParent parent;
        ViewGroup viewGroup;
        float x;
        float x2;
        int width;
        float width2;
        float f;
        motionEvent.getClass();
        if (this.f32814K) {
            float x3 = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                int i = this.f32812I;
                if (action == 1) {
                    this.f32818j = false;
                    if (this.f65010f == -1.0f || this.f65011g != -1.0f) {
                        this.f65010f = -1.0f;
                        this.f65011g = -1.0f;
                        invalidate();
                    }
                    if (motionEvent.getAction() == 1) {
                        parent = getParent();
                        if (parent instanceof ViewGroup) {
                            viewGroup = (ViewGroup) parent;
                        } else {
                            viewGroup = null;
                        }
                        if (viewGroup != null) {
                            viewGroup.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    timeInMillis = Calendar.getInstance().getTimeInMillis() - this.f32813J;
                    viewM23168e = m23168e(x3, y);
                    if (viewM23168e instanceof tx8) {
                        tx8Var = (tx8) viewM23168e;
                    } else {
                        tx8Var = null;
                    }
                    if (timeInMillis > i || tx8Var == null || this.f32819k == null) {
                        tx8Var2 = this.f32819k;
                        if (tx8Var2 != null && (sentenceWord = tx8Var2.getSentenceWord()) != null) {
                            mo9668a(sentenceWord);
                        }
                    } else {
                        p20 p20Var = new p20();
                        p20Var.mo10194O(60L);
                        oaa.m17884a(this, p20Var);
                        boolean zM9670k = m9670k(tx8Var, x3);
                        int iM9669i = m9669i(tx8Var, zM9670k);
                        if (zM9670k && !fa4.m11650l(this.f32819k, tx8Var)) {
                            removeView(tx8Var);
                            sx8 sentenceWord3 = tx8Var.getSentenceWord();
                            addView(m9667j(this, sentenceWord3.f61555a, sentenceWord3.f61556b, false, iM9669i, 4), iM9669i);
                        }
                        tx8 tx8Var3 = this.f32819k;
                        if (tx8Var3 != null) {
                            tx8Var3.setAlpha(0.0f);
                        }
                        removeView(this.f32819k);
                        tx8 tx8Var4 = this.f32819k;
                        if (tx8Var4 != null && (sentenceWord2 = tx8Var4.getSentenceWord()) != null) {
                            addView(m9667j(this, sentenceWord2.f61555a, sentenceWord2.f61556b, false, iM9669i, 4), iM9669i);
                        }
                    }
                    m9672m();
                    this.f32819k = null;
                } else if (action != 2) {
                    if (action == 3) {
                        this.f32818j = false;
                        if (this.f65010f == -1.0f) {
                            this.f65010f = -1.0f;
                            this.f65011g = -1.0f;
                            invalidate();
                        } else {
                            this.f65010f = -1.0f;
                            this.f65011g = -1.0f;
                            invalidate();
                        }
                        if (motionEvent.getAction() == 1) {
                            parent = getParent();
                            if (parent instanceof ViewGroup) {
                                viewGroup = (ViewGroup) parent;
                            } else {
                                viewGroup = null;
                            }
                            if (viewGroup != null) {
                                viewGroup.requestDisallowInterceptTouchEvent(false);
                            }
                        }
                        timeInMillis = Calendar.getInstance().getTimeInMillis() - this.f32813J;
                        viewM23168e = m23168e(x3, y);
                        if (viewM23168e instanceof tx8) {
                            tx8Var = (tx8) viewM23168e;
                        } else {
                            tx8Var = null;
                        }
                        if (timeInMillis > i) {
                            tx8Var2 = this.f32819k;
                            if (tx8Var2 != null) {
                                mo9668a(sentenceWord);
                            }
                        } else {
                            tx8Var2 = this.f32819k;
                            if (tx8Var2 != null) {
                                mo9668a(sentenceWord);
                            }
                        }
                        m9672m();
                        this.f32819k = null;
                    }
                } else if (Calendar.getInstance().getTimeInMillis() - this.f32813J > i) {
                    if (this.f32819k == null) {
                        View viewM23168e2 = m23168e(x3, y);
                        this.f32819k = viewM23168e2 instanceof tx8 ? (tx8) viewM23168e2 : null;
                    } else {
                        this.f32818j = true;
                        oaa.m17884a(this, new p20());
                        View viewM23168e3 = m23168e(x3, y);
                        tx8 tx8Var5 = this.f32819k;
                        if (tx8Var5 != null) {
                            if (viewM23168e3 == null) {
                                if (this.f65010f != -1.0f || this.f65011g != -1.0f) {
                                    this.f65010f = -1.0f;
                                    this.f65011g = -1.0f;
                                    invalidate();
                                }
                                f = 1.0f;
                            } else {
                                boolean zM9670k2 = m9670k(viewM23168e3, x3);
                                int iM9669i2 = m9669i(viewM23168e3, zM9670k2);
                                Context context = getContext();
                                context.getClass();
                                float fM14419b = jfa.m14419b(context, 4);
                                if (viewM23168e3.equals(this.f32819k)) {
                                    int i2 = iM9669i2 - 1;
                                    View childAt = getChildAt(i2 >= 0 ? i2 : 0);
                                    childAt.getClass();
                                    boolean zM9670k3 = m9670k(childAt, x3);
                                    if (getLayoutDirection() == 1 && m23170g(viewM23168e3, viewM23168e3.getY())) {
                                        x = getMeasuredWidth();
                                    } else if (!m23170g(viewM23168e3, viewM23168e3.getY())) {
                                        if (getLayoutDirection() == 1 && childAt.equals(this.f32819k)) {
                                            fM14419b = getMeasuredWidth() - (childAt.getWidth() + fM14419b);
                                        } else {
                                            if (childAt.equals(this.f32819k)) {
                                                width2 = childAt.getWidth();
                                            } else {
                                                if (getLayoutDirection() == 1 && zM9670k3) {
                                                    x2 = childAt.getX();
                                                    width = childAt.getWidth();
                                                } else if (getLayoutDirection() == 1 || zM9670k3) {
                                                    x = childAt.getX();
                                                } else {
                                                    x2 = childAt.getX();
                                                    width = childAt.getWidth();
                                                }
                                                width2 = x2 + width;
                                            }
                                            fM14419b += width2;
                                        }
                                    }
                                    fM14419b = x - fM14419b;
                                } else {
                                    if (getLayoutDirection() == 1 && zM9670k2) {
                                        x2 = viewM23168e3.getX();
                                        width = viewM23168e3.getWidth();
                                    } else if (getLayoutDirection() == 1 || zM9670k2) {
                                        x = viewM23168e3.getX();
                                        fM14419b = x - fM14419b;
                                    } else {
                                        x2 = viewM23168e3.getX();
                                        width = viewM23168e3.getWidth();
                                    }
                                    width2 = x2 + width;
                                    fM14419b += width2;
                                }
                                if (fM14419b < 0.0f) {
                                    fM14419b = 0.0f;
                                }
                                float y2 = viewM23168e3.getY();
                                if (y2 < 0.0f) {
                                    y2 = 0.0f;
                                }
                                if (fM14419b >= 0.0f && y2 >= 0.0f && (this.f65010f != fM14419b || this.f65011g != y2)) {
                                    this.f65010f = fM14419b;
                                    this.f65011g = y2;
                                    invalidate();
                                }
                                f = 0.6f;
                            }
                            tx8Var5.setAlpha(f);
                        }
                        tx8 tx8Var6 = this.f32819k;
                        if (tx8Var6 != null) {
                            Context context2 = getContext();
                            context2.getClass();
                            tx8Var6.setElevation(jfa.m14419b(context2, 5));
                        }
                        tx8 tx8Var7 = this.f32819k;
                        if (tx8Var7 != null) {
                            tx8Var7.animate().x(motionEvent.getRawX() + this.f32820l).y(motionEvent.getRawY() + this.f32811H).setDuration(0L).setStartDelay(0L).setListener(new gfa(1, new C3288l7(7))).start();
                        }
                    }
                }
            } else {
                this.f32818j = false;
                this.f32813J = Calendar.getInstance().getTimeInMillis();
                ViewParent parent2 = getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.requestDisallowInterceptTouchEvent(true);
                }
                View viewM23168e4 = m23168e(x3, y);
                tx8 tx8Var8 = viewM23168e4 instanceof tx8 ? (tx8) viewM23168e4 : null;
                if (tx8Var8 != null) {
                    this.f32820l = tx8Var8.getX() - motionEvent.getRawX();
                    this.f32811H = tx8Var8.getY() - motionEvent.getRawY();
                }
                this.f32819k = null;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getDragAndDrop() {
        return this.f32814K;
    }

    @Override // p000.v83
    public FlowLayout$Gravity getGravity() {
        return this.f32816h;
    }

    /* JADX INFO: renamed from: i */
    public final int m9669i(View view, boolean z) {
        int iIndexOfChild;
        if (getLayoutDirection() == 0 && z && indexOfChild(this.f32819k) < indexOfChild(view)) {
            iIndexOfChild = indexOfChild(view) - 1;
        } else if (getLayoutDirection() == 1 && z && indexOfChild(this.f32819k) < indexOfChild(view)) {
            iIndexOfChild = indexOfChild(this.f32819k);
        } else if (z || fa4.m11650l(this.f32819k, view) || indexOfChild(this.f32819k) < indexOfChild(view)) {
            iIndexOfChild = indexOfChild(view);
        } else {
            int iIndexOfChild2 = indexOfChild(view) + 1;
            iIndexOfChild = getChildCount() - 1;
            if (iIndexOfChild2 <= iIndexOfChild) {
                iIndexOfChild = iIndexOfChild2;
            }
        }
        if (iIndexOfChild < 0) {
            return 0;
        }
        return iIndexOfChild;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9670k(View view, float f) {
        if (getLayoutDirection() == 1) {
            if (f < view.getX() + (view.getWidth() / 2)) {
                return false;
            }
        } else if (f >= view.getX() + (view.getWidth() / 2)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m9671l() {
        int childCount = getChildCount();
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            View childAt = getChildAt(i);
            tx8 tx8Var = childAt instanceof tx8 ? (tx8) childAt : null;
            if (tx8Var != null) {
                sx8 sentenceWord = tx8Var.getSentenceWord();
                sentenceWord.f61557c = i;
                tx8Var.setSentenceWord(sentenceWord);
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m9672m() {
        sx8 sentenceWord;
        String str;
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            tx8 tx8Var = childAt instanceof tx8 ? (tx8) childAt : null;
            if (tx8Var != null && (sentenceWord = tx8Var.getSentenceWord()) != null && (str = sentenceWord.f61555a) != null) {
                arrayList.add(str);
            }
        }
        kw8 kw8Var = this.f32817i;
        if (kw8Var != null) {
            kw8Var.mo12933c(arrayList);
        }
    }

    public final void setDragAndDrop(boolean z) {
        this.f32814K = z;
    }

    public final void setGravity(FlowLayout$Gravity flowLayout$Gravity) {
        flowLayout$Gravity.getClass();
        this.f32816h = flowLayout$Gravity;
        invalidate();
    }

    public final void setListener(kw8 kw8Var) {
        kw8Var.getClass();
        this.f32817i = kw8Var;
    }

    public final void setOutlineDisabled(boolean z) {
        this.f32815L = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SentenceView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ SentenceView(Context context, AttributeSet attributeSet, int i, y52 y52Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
