package com.lingq.p055ui.review.views.unscrambler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p225kk.C6716m;
import p385sf.C9000b;
import p406u4.C9400b;
import p406u4.C9419k0;
import p471x2.C10041h0;
import p538zj.C10509b;
import p538zj.C10510c;
import p538zj.InterfaceC10508a;
import ph.C8367u2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0003H\u0014R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001b"}, m13365d2 = {"Lcom/lingq/ui/review/views/unscrambler/SentenceView;", "Lcom/lingq/ui/review/views/unscrambler/FlowLayout;", "Lzj/a;", "Lcom/lingq/ui/review/views/unscrambler/FlowLayout$Gravity;", "gravity", "Lsl/e;", "setGravity", "listener", "setListener", "getGravity", "", "K", "Z", "getDragAndDrop", "()Z", "setDragAndDrop", "(Z)V", "dragAndDrop", "L", "isOutlineDisabled", "setOutlineDisabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SentenceView extends FlowLayout implements InterfaceC10508a {

    /* JADX INFO: renamed from: H */
    public float f30512H;

    /* JADX INFO: renamed from: I */
    public final int f30513I;

    /* JADX INFO: renamed from: J */
    public long f30514J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean dragAndDrop;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public boolean isOutlineDisabled;

    /* JADX INFO: renamed from: h */
    public FlowLayout.Gravity f30517h;

    /* JADX INFO: renamed from: i */
    public InterfaceC10508a f30518i;

    /* JADX INFO: renamed from: j */
    public boolean f30519j;

    /* JADX INFO: renamed from: k */
    public C10510c f30520k;

    /* JADX INFO: renamed from: l */
    public float f30521l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        this.f30517h = FlowLayout.Gravity.LEFT;
        this.f30513I = 200;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public static void m10320l(SentenceView sentenceView, List list, boolean z10, int i10) {
        int i11 = 0;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        sentenceView.getClass();
        Iterator it = list.iterator();
        while (true) {
            int i12 = i11;
            if (!it.hasNext()) {
                return;
            }
            Object next = it.next();
            i11 = i12 + 1;
            if (i12 < 0) {
                C9000b.m17257w();
                throw null;
            }
            sentenceView.addView(m10321n(sentenceView, (String) next, i12, z10, 0, 8));
        }
    }

    /* JADX INFO: renamed from: n */
    public static C10510c m10321n(SentenceView sentenceView, String str, int i10, boolean z10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        sentenceView.getClass();
        Context context = sentenceView.getContext();
        C5207g.m11110e(context, "context");
        C10510c c10510c = new C10510c(context);
        if (i11 == -1) {
            i11 = sentenceView.getChildCount();
        }
        c10510c.setSentenceWord(new C10509b(str, i10, i11));
        C8367u2 c8367u2 = c10510c.f52467a;
        c8367u2.f45316b.setText(c10510c.getSentenceWord().f52463a);
        if (z10) {
            c8367u2.f45316b.setTextColor(0);
        }
        c10510c.setListener(sentenceView);
        return c10510c;
    }

    @Override // p538zj.InterfaceC10508a
    /* JADX INFO: renamed from: a */
    public final void mo10291a(String str) {
        C5207g.m11111f(str, "sentence");
    }

    @Override // p538zj.InterfaceC10508a
    /* JADX INFO: renamed from: b */
    public final void mo10292b() {
    }

    @Override // p538zj.InterfaceC10508a
    /* JADX INFO: renamed from: c */
    public final void mo10293c(ArrayList arrayList) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p538zj.InterfaceC10508a
    /* JADX INFO: renamed from: d */
    public final void mo10294d(C10509b c10509b) {
        InterfaceC10508a interfaceC10508a;
        int i10;
        Object next;
        C10510c c10510c;
        C10509b sentenceWord;
        C5207g.m11111f(c10509b, "sentenceWord");
        if (!this.isOutlineDisabled) {
            C10041h0 c10041h0 = new C10041h0(this);
            do {
                i10 = 0;
                if (!c10041h0.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = c10041h0.next();
                    View view = (View) next;
                    c10510c = view instanceof C10510c ? (C10510c) view : null;
                }
            } while (!((c10510c == null || (sentenceWord = c10510c.getSentenceWord()) == null || sentenceWord.f52464b != c10509b.f52464b) ? false : true));
            View view2 = (View) next;
            if (view2 != null) {
                C10041h0 c10041h1 = new C10041h0(this);
                while (true) {
                    if (!c10041h1.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    Object next2 = c10041h1.next();
                    if (i10 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    if (C5207g.m11106a(view2, next2)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    c10509b.f52465c = i10;
                }
            }
        }
        if (this.f30519j || (interfaceC10508a = this.f30518i) == null) {
            return;
        }
        interfaceC10508a.mo10294d(c10509b);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019c  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:130:0x022b  */
    /* JADX WARN: Code duplicated, block: B:132:0x022f  */
    /* JADX WARN: Code duplicated, block: B:89:0x015e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        long timeInMillis;
        View viewM10311h;
        C10510c c10510c;
        C10510c c10510c2;
        C10509b sentenceWord;
        C10509b sentenceWord2;
        ViewParent parent;
        ViewGroup viewGroup;
        float x10;
        float x11;
        int width;
        float width2;
        float f3;
        C5207g.m11111f(motionEvent, "event");
        if (this.dragAndDrop) {
            float x12 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                int i10 = this.f30513I;
                if (action == 1) {
                    this.f30519j = false;
                    m10314k();
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
                    timeInMillis = Calendar.getInstance().getTimeInMillis() - this.f30514J;
                    viewM10311h = m10311h(x12, y10);
                    if (viewM10311h instanceof C10510c) {
                        c10510c = (C10510c) viewM10311h;
                    } else {
                        c10510c = null;
                    }
                    if (timeInMillis > i10 || c10510c == null || this.f30520k == null) {
                        c10510c2 = this.f30520k;
                        if (c10510c2 != null && (sentenceWord = c10510c2.getSentenceWord()) != null) {
                            mo10294d(sentenceWord);
                        }
                    } else {
                        C9400b c9400b = new C9400b();
                        c9400b.mo17783J(60L);
                        C9419k0.m17819a(this, c9400b);
                        boolean zM10323o = m10323o(c10510c, x12);
                        int iM10322m = m10322m(c10510c, zM10323o);
                        if (zM10323o && !C5207g.m11106a(this.f30520k, c10510c)) {
                            removeView(c10510c);
                            C10509b sentenceWord3 = c10510c.getSentenceWord();
                            addView(m10321n(this, sentenceWord3.f52463a, sentenceWord3.f52464b, false, iM10322m, 4), iM10322m);
                        }
                        C10510c c10510c3 = this.f30520k;
                        if (c10510c3 != null) {
                            c10510c3.setAlpha(0.0f);
                        }
                        removeView(this.f30520k);
                        C10510c c10510c4 = this.f30520k;
                        if (c10510c4 != null && (sentenceWord2 = c10510c4.getSentenceWord()) != null) {
                            addView(m10321n(this, sentenceWord2.f52463a, sentenceWord2.f52464b, false, iM10322m, 4), iM10322m);
                        }
                    }
                    m10325q();
                    this.f30520k = null;
                } else if (action != 2) {
                    if (action == 3) {
                        this.f30519j = false;
                        m10314k();
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
                        timeInMillis = Calendar.getInstance().getTimeInMillis() - this.f30514J;
                        viewM10311h = m10311h(x12, y10);
                        if (viewM10311h instanceof C10510c) {
                            c10510c = (C10510c) viewM10311h;
                        } else {
                            c10510c = null;
                        }
                        if (timeInMillis > i10) {
                            c10510c2 = this.f30520k;
                            if (c10510c2 != null) {
                                mo10294d(sentenceWord);
                            }
                        } else {
                            c10510c2 = this.f30520k;
                            if (c10510c2 != null) {
                                mo10294d(sentenceWord);
                            }
                        }
                        m10325q();
                        this.f30520k = null;
                    }
                } else if (Calendar.getInstance().getTimeInMillis() - this.f30514J > i10) {
                    if (this.f30520k == null) {
                        View viewM10311h2 = m10311h(x12, y10);
                        this.f30520k = viewM10311h2 instanceof C10510c ? (C10510c) viewM10311h2 : null;
                    } else {
                        this.f30519j = true;
                        C9419k0.m17819a(this, new C9400b());
                        View viewM10311h3 = m10311h(x12, y10);
                        C10510c c10510c5 = this.f30520k;
                        if (c10510c5 != null) {
                            if (viewM10311h3 == null) {
                                m10314k();
                                f3 = 1.0f;
                            } else {
                                boolean zM10323o2 = m10323o(viewM10311h3, x12);
                                int iM10322m2 = m10322m(viewM10311h3, zM10323o2);
                                List<Integer> list = C6716m.f37937a;
                                float fM13316a = C6716m.m13316a(4);
                                if (C5207g.m11106a(viewM10311h3, this.f30520k)) {
                                    int i11 = iM10322m2 - 1;
                                    if (i11 < 0) {
                                        i11 = 0;
                                    }
                                    View childAt = getChildAt(i11);
                                    C5207g.m11110e(childAt, "child");
                                    boolean zM10323o3 = m10323o(childAt, x12);
                                    if (getLayoutDirection() == 1 && m10313j(viewM10311h3, viewM10311h3.getY())) {
                                        x10 = getMeasuredWidth();
                                    } else if (!m10313j(viewM10311h3, viewM10311h3.getY())) {
                                        if (getLayoutDirection() == 1 && C5207g.m11106a(childAt, this.f30520k)) {
                                            fM13316a = getMeasuredWidth() - (childAt.getWidth() + fM13316a);
                                        } else {
                                            if (C5207g.m11106a(childAt, this.f30520k)) {
                                                width2 = childAt.getWidth();
                                            } else {
                                                if (getLayoutDirection() == 1 && zM10323o3) {
                                                    x11 = childAt.getX();
                                                    width = childAt.getWidth();
                                                } else if (getLayoutDirection() == 1 || zM10323o3) {
                                                    x10 = childAt.getX();
                                                } else {
                                                    x11 = childAt.getX();
                                                    width = childAt.getWidth();
                                                }
                                                width2 = x11 + width;
                                            }
                                            fM13316a += width2;
                                        }
                                    }
                                    fM13316a = x10 - fM13316a;
                                } else {
                                    if (getLayoutDirection() == 1 && zM10323o2) {
                                        x11 = viewM10311h3.getX();
                                        width = viewM10311h3.getWidth();
                                    } else if (getLayoutDirection() == 1 || zM10323o2) {
                                        x10 = viewM10311h3.getX();
                                        fM13316a = x10 - fM13316a;
                                    } else {
                                        x11 = viewM10311h3.getX();
                                        width = viewM10311h3.getWidth();
                                    }
                                    width2 = x11 + width;
                                    fM13316a += width2;
                                }
                                if (fM13316a < 0.0f) {
                                    fM13316a = 0.0f;
                                }
                                float y11 = viewM10311h3.getY();
                                if (y11 < 0.0f) {
                                    y11 = 0.0f;
                                }
                                if (fM13316a >= 0.0f && y11 >= 0.0f) {
                                    if (this.f30476f == fM13316a) {
                                        if (!(this.f30477g == y11)) {
                                            this.f30476f = fM13316a;
                                            this.f30477g = y11;
                                            invalidate();
                                        }
                                    } else {
                                        this.f30476f = fM13316a;
                                        this.f30477g = y11;
                                        invalidate();
                                    }
                                }
                                f3 = 0.6f;
                            }
                            c10510c5.setAlpha(f3);
                        }
                        C10510c c10510c6 = this.f30520k;
                        if (c10510c6 != null) {
                            List<Integer> list2 = C6716m.f37937a;
                            c10510c6.setElevation(C6716m.m13316a(5));
                        }
                        C10510c c10510c7 = this.f30520k;
                        if (c10510c7 != null) {
                            C4924a.m10441T(c10510c7, motionEvent.getRawX() + this.f30521l, motionEvent.getRawY() + this.f30512H);
                        }
                    }
                }
            } else {
                this.f30519j = false;
                this.f30514J = Calendar.getInstance().getTimeInMillis();
                ViewParent parent2 = getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.requestDisallowInterceptTouchEvent(true);
                }
                View viewM10311h4 = m10311h(x12, y10);
                C10510c c10510c8 = viewM10311h4 instanceof C10510c ? (C10510c) viewM10311h4 : null;
                if (c10510c8 != null) {
                    this.f30521l = c10510c8.getX() - motionEvent.getRawX();
                    this.f30512H = c10510c8.getY() - motionEvent.getRawY();
                }
                this.f30520k = null;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // p538zj.InterfaceC10508a
    /* JADX INFO: renamed from: e */
    public final void mo10295e(C10509b c10509b) {
        C5207g.m11111f(c10509b, "sentenceWord");
    }

    @Override // p538zj.InterfaceC10508a
    /* JADX INFO: renamed from: f */
    public final void mo10296f(C10509b c10509b) {
        C5207g.m11111f(c10509b, "sentenceWord");
    }

    @Override // p538zj.InterfaceC10508a
    /* JADX INFO: renamed from: g */
    public final void mo10297g(String str) {
        C5207g.m11111f(str, "word");
    }

    public final boolean getDragAndDrop() {
        return this.dragAndDrop;
    }

    @Override // com.lingq.p055ui.review.views.unscrambler.FlowLayout
    public FlowLayout.Gravity getGravity() {
        return this.f30517h;
    }

    /* JADX INFO: renamed from: m */
    public final int m10322m(View view, boolean z10) {
        int iIndexOfChild;
        if (getLayoutDirection() == 0 && z10 && indexOfChild(this.f30520k) < indexOfChild(view)) {
            iIndexOfChild = indexOfChild(view) - 1;
        } else if (getLayoutDirection() == 1 && z10 && indexOfChild(this.f30520k) < indexOfChild(view)) {
            iIndexOfChild = indexOfChild(this.f30520k);
        } else if (z10 || C5207g.m11106a(this.f30520k, view) || indexOfChild(this.f30520k) < indexOfChild(view)) {
            iIndexOfChild = indexOfChild(view);
        } else {
            iIndexOfChild = indexOfChild(view) + 1;
            int childCount = getChildCount() - 1;
            if (iIndexOfChild > childCount) {
                iIndexOfChild = childCount;
            }
        }
        if (iIndexOfChild < 0) {
            return 0;
        }
        return iIndexOfChild;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10323o(View view, float f3) {
        if (getLayoutDirection() == 1) {
            if (f3 >= view.getX() + (view.getWidth() / 2)) {
                return true;
            }
        } else if (f3 < view.getX() + (view.getWidth() / 2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m10324p() {
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i10 = 0;
            while (true) {
                View childAt = getChildAt(i10);
                C10510c c10510c = childAt instanceof C10510c ? (C10510c) childAt : null;
                if (c10510c != null) {
                    C10509b sentenceWord = c10510c.getSentenceWord();
                    sentenceWord.f52465c = i10;
                    c10510c.setSentenceWord(sentenceWord);
                }
                if (i10 == childCount) {
                    break;
                } else {
                    i10++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10325q() {
        C10509b sentenceWord;
        String str;
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C10510c c10510c = childAt instanceof C10510c ? (C10510c) childAt : null;
            if (c10510c != null && (sentenceWord = c10510c.getSentenceWord()) != null && (str = sentenceWord.f52463a) != null) {
                arrayList.add(str);
            }
        }
        InterfaceC10508a interfaceC10508a = this.f30518i;
        if (interfaceC10508a != null) {
            interfaceC10508a.mo10293c(arrayList);
        }
    }

    public final void setDragAndDrop(boolean z10) {
        this.dragAndDrop = z10;
    }

    public final void setGravity(FlowLayout.Gravity gravity) {
        C5207g.m11111f(gravity, "gravity");
        this.f30517h = gravity;
        invalidate();
    }

    public final void setListener(InterfaceC10508a interfaceC10508a) {
        C5207g.m11111f(interfaceC10508a, "listener");
        this.f30518i = interfaceC10508a;
    }

    public final void setOutlineDisabled(boolean z10) {
        this.isOutlineDisabled = z10;
    }
}
