package com.lingq.p055ui.review.views.unscrambler;

import ae.C0062b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.text.C7076b;
import mo.C7661i;
import p385sf.C9000b;
import p406u4.C9400b;
import p406u4.C9419k0;
import p538zj.C10509b;
import p538zj.C10510c;
import p538zj.InterfaceC10508a;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\t¨\u0006\u0012"}, m13365d2 = {"Lcom/lingq/ui/review/views/unscrambler/SentenceBuilderView;", "Landroid/widget/LinearLayout;", "Lzj/a;", "listener", "Lsl/e;", "setListener", "", "isRTL", "setIsRTL", "", "getSentence", "getAnswer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SentenceBuilderView extends LinearLayout {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f30485j = 0;

    /* JADX INFO: renamed from: a */
    public final SentenceView f30486a;

    /* JADX INFO: renamed from: b */
    public final SentenceView f30487b;

    /* JADX INFO: renamed from: c */
    public final SentenceView f30488c;

    /* JADX INFO: renamed from: d */
    public String f30489d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f30490e;

    /* JADX INFO: renamed from: f */
    public InterfaceC10508a f30491f;

    /* JADX INFO: renamed from: g */
    public final HashSet<C10509b> f30492g;

    /* JADX INFO: renamed from: h */
    public final HashSet<C10509b> f30493h;

    /* JADX INFO: renamed from: i */
    public boolean f30494i;

    /* JADX INFO: renamed from: com.lingq.ui.review.views.unscrambler.SentenceBuilderView$a */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC4705a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f30500a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SentenceBuilderView f30501b;

        public ViewTreeObserverOnGlobalLayoutListenerC4705a(SentenceView sentenceView, SentenceBuilderView sentenceBuilderView) {
            this.f30500a = sentenceView;
            this.f30501b = sentenceBuilderView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            List<Triple<Integer, Integer, Integer>> list;
            ViewGroup viewGroup = this.f30500a;
            if (viewGroup.getMeasuredWidth() <= 0 || viewGroup.getMeasuredHeight() <= 0) {
                return;
            }
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            HashMap<Integer, List<Triple<Integer, Integer, Integer>>> map = ((SentenceView) viewGroup).f30475e;
            boolean z10 = true;
            int size = map.size() - 1;
            int i10 = 0;
            do {
                if (i10 >= size) {
                    z10 = false;
                    break;
                } else {
                    i10++;
                    list = map.get(Integer.valueOf(i10));
                }
            } while (!(list != null && list.size() == 1));
            SentenceBuilderView sentenceBuilderView = this.f30501b;
            sentenceBuilderView.f30494i = z10;
            if (sentenceBuilderView.f30494i) {
                sentenceBuilderView.f30488c.removeAllViews();
            }
            sentenceBuilderView.f30487b.setOutlineDisabled(sentenceBuilderView.f30494i);
            sentenceBuilderView.f30486a.setOutlineDisabled(sentenceBuilderView.f30494i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public SentenceBuilderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        this.f30489d = "";
        this.f30490e = new ArrayList();
        this.f30492g = new HashSet<>();
        this.f30493h = new HashSet<>();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_sentence_builder, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = R.id.viewBuilder;
        SentenceView sentenceView = (SentenceView) C0062b.m298P0(viewInflate, R.id.viewBuilder);
        if (sentenceView != null) {
            i10 = R.id.viewOriginalSentence;
            SentenceView sentenceView2 = (SentenceView) C0062b.m298P0(viewInflate, R.id.viewOriginalSentence);
            if (sentenceView2 != null) {
                i10 = R.id.viewOriginalSentenceBackground;
                SentenceView sentenceView3 = (SentenceView) C0062b.m298P0(viewInflate, R.id.viewOriginalSentenceBackground);
                if (sentenceView3 != null) {
                    this.f30486a = sentenceView;
                    sentenceView.setDrawLines(true);
                    sentenceView.setDragAndDrop(true);
                    this.f30487b = sentenceView2;
                    FlowLayout.Gravity gravity = FlowLayout.Gravity.CENTER;
                    sentenceView2.setGravity(gravity);
                    this.f30488c = sentenceView3;
                    sentenceView3.setGravity(gravity);
                    sentenceView.setListener(new InterfaceC10508a() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView.1
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
                            SentenceBuilderView sentenceBuilderView = SentenceBuilderView.this;
                            sentenceBuilderView.f30490e.clear();
                            ArrayList arrayList2 = sentenceBuilderView.f30490e;
                            arrayList2.addAll(arrayList);
                            String string = C7076b.m14277B3(C6752c.m13430X(arrayList2, " ", null, null, new InterfaceC2052l<String, CharSequence>() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView$1$onSentenceUpdated$currentSentence$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final CharSequence mo528n(String str) {
                                    String str2 = str;
                                    C5207g.m11111f(str2, "it");
                                    return C7076b.m14277B3(str2).toString();
                                }
                            }, 30)).toString();
                            InterfaceC10508a interfaceC10508a = sentenceBuilderView.f30491f;
                            if (interfaceC10508a != null) {
                                interfaceC10508a.mo10291a(string);
                            }
                        }

                        @Override // p538zj.InterfaceC10508a
                        /* JADX INFO: renamed from: d */
                        public final void mo10294d(C10509b c10509b) {
                            C5207g.m11111f(c10509b, "sentenceWord");
                            SentenceBuilderView sentenceBuilderView = SentenceBuilderView.this;
                            if (sentenceBuilderView.f30493h.contains(c10509b)) {
                                return;
                            }
                            sentenceBuilderView.f30493h.add(c10509b);
                            sentenceBuilderView.m10317b(false);
                            ArrayList arrayList = sentenceBuilderView.f30490e;
                            arrayList.remove(c10509b.f52465c);
                            String string = C7076b.m14277B3(C6752c.m13430X(arrayList, " ", null, null, new InterfaceC2052l<String, CharSequence>() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView$1$onWordSelected$currentSentence$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final CharSequence mo528n(String str) {
                                    String str2 = str;
                                    C5207g.m11111f(str2, "it");
                                    return C7076b.m14277B3(str2).toString();
                                }
                            }, 30)).toString();
                            InterfaceC10508a interfaceC10508a = sentenceBuilderView.f30491f;
                            if (interfaceC10508a != null) {
                                interfaceC10508a.mo10291a(string);
                            }
                            InterfaceC10508a interfaceC10508a2 = sentenceBuilderView.f30491f;
                            if (interfaceC10508a2 != null) {
                                interfaceC10508a2.mo10296f(c10509b);
                            }
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
                    });
                    sentenceView2.setListener(new InterfaceC10508a() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView.2
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

                        @Override // p538zj.InterfaceC10508a
                        /* JADX INFO: renamed from: d */
                        public final void mo10294d(C10509b c10509b) {
                            InterfaceC10508a interfaceC10508a;
                            C5207g.m11111f(c10509b, "sentenceWord");
                            SentenceBuilderView sentenceBuilderView = SentenceBuilderView.this;
                            if (sentenceBuilderView.f30492g.contains(c10509b)) {
                                return;
                            }
                            sentenceBuilderView.f30492g.add(c10509b);
                            sentenceBuilderView.m10318c(false);
                            ArrayList arrayList = sentenceBuilderView.f30490e;
                            String str = c10509b.f52463a;
                            arrayList.add(str);
                            InterfaceC10508a interfaceC10508a2 = sentenceBuilderView.f30491f;
                            if (interfaceC10508a2 != null) {
                                interfaceC10508a2.mo10297g(str);
                            }
                            String string = C7076b.m14277B3(C6752c.m13430X(arrayList, " ", null, null, new InterfaceC2052l<String, CharSequence>() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView$2$onWordSelected$currentSentence$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final CharSequence mo528n(String str2) {
                                    String str3 = str2;
                                    C5207g.m11111f(str3, "it");
                                    return C7076b.m14277B3(str3).toString();
                                }
                            }, 30)).toString();
                            InterfaceC10508a interfaceC10508a3 = sentenceBuilderView.f30491f;
                            if (interfaceC10508a3 != null) {
                                interfaceC10508a3.mo10291a(string);
                            }
                            if (string.length() == sentenceBuilderView.f30489d.length() && sentenceBuilderView.m10316a()) {
                                InterfaceC10508a interfaceC10508a4 = sentenceBuilderView.f30491f;
                                if (interfaceC10508a4 != null) {
                                    interfaceC10508a4.mo10292b();
                                    return;
                                }
                                return;
                            }
                            if (string.length() == sentenceBuilderView.f30489d.length() || (interfaceC10508a = sentenceBuilderView.f30491f) == null) {
                                return;
                            }
                            interfaceC10508a.mo10295e(c10509b);
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
                    });
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10316a() {
        String string = C7076b.m14277B3(C6752c.m13430X(this.f30490e, " ", null, null, new InterfaceC2052l<String, CharSequence>() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView$matches$currentSentence$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(String str) {
                String str2 = str;
                C5207g.m11111f(str2, "it");
                return C7076b.m14277B3(str2).toString();
            }
        }, 30)).toString();
        if (string.length() == this.f30489d.length()) {
            return C7661i.m15249O2(string, this.f30489d);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m10317b(boolean z10) {
        HashSet<C10509b> hashSet = this.f30493h;
        if (hashSet.size() == 1 || z10) {
            boolean z11 = this.f30494i;
            SentenceView sentenceView = this.f30487b;
            if (z11) {
                C10509b c10509b = (C10509b) C6752c.m13422P(hashSet);
                long jMax = Math.max(0L, 300 - ((long) ((hashSet.size() - 1) * 100)));
                if (this.f30494i) {
                    String str = c10509b.f52463a;
                    sentenceView.getClass();
                    C5207g.m11111f(str, "label");
                    C10510c c10510cM10321n = SentenceView.m10321n(sentenceView, str, 0, false, 0, 4);
                    C4924a.m10422A(c10510cM10321n);
                    sentenceView.addView(c10510cM10321n, 0);
                }
                sentenceView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC4707a(sentenceView, this, c10509b, jMax));
                return;
            }
            final C10509b c10509b2 = (C10509b) C6752c.m13422P(hashSet);
            long jMax2 = Math.max(0L, 300 - ((long) ((hashSet.size() - 1) * 100)));
            int i10 = c10509b2.f52465c;
            SentenceView sentenceView2 = this.f30486a;
            View childAt = sentenceView2.getChildAt(i10);
            int i11 = c10509b2.f52464b;
            View childAt2 = sentenceView.getChildAt(i11);
            if (childAt == null || childAt2 == null) {
                hashSet.remove(c10509b2);
                return;
            }
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f10 = iArr[1];
            int[] iArr2 = new int[2];
            childAt2.getLocationOnScreen(iArr2);
            C4924a.m10440S(childAt2, f3 - iArr2[0], f10 - iArr2[1], 0L, null, 24);
            C9419k0.m17819a(sentenceView2, new C9400b());
            C4924a.m10457e0(childAt2);
            C4924a.m10422A(childAt);
            sentenceView2.removeViewAt(c10509b2.f52465c);
            View childAt3 = this.f30488c.getChildAt(i11);
            if (childAt3 == null) {
                hashSet.remove(c10509b2);
                return;
            }
            int[] iArr3 = new int[2];
            childAt3.getLocationOnScreen(iArr3);
            float f11 = iArr3[0];
            float f12 = iArr3[1];
            childAt2.getLocationOnScreen(iArr2);
            C4924a.m10440S(childAt2, f11 - iArr2[0], f12 - iArr2[1], jMax2, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView$moveDown$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    SentenceBuilderView sentenceBuilderView = this.f30504b;
                    sentenceBuilderView.f30493h.remove(c10509b2);
                    if (!sentenceBuilderView.f30493h.isEmpty()) {
                        sentenceBuilderView.m10317b(true);
                    }
                    return C9072e.f47360a;
                }
            }, 8);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10318c(boolean z10) {
        HashSet<C10509b> hashSet = this.f30492g;
        if (hashSet.size() == 1 || z10) {
            C10509b c10509b = (C10509b) C6752c.m13422P(hashSet);
            long jMax = Math.max(0L, 300 - ((long) ((hashSet.size() - 1) * 100)));
            String str = c10509b.f52463a;
            SentenceView sentenceView = this.f30486a;
            int childCount = sentenceView.getChildCount();
            C5207g.m11111f(str, "word");
            C10510c c10510cM10321n = SentenceView.m10321n(sentenceView, str, childCount, false, 0, 12);
            C4924a.m10422A(c10510cM10321n);
            sentenceView.addView(c10510cM10321n);
            sentenceView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC4708b(sentenceView, this, c10509b, jMax));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10319d(String str, boolean z10) {
        C5207g.m11111f(str, "sentence");
        if (!(this.f30489d.length() > 0) || z10) {
            this.f30489d = str;
            ArrayList arrayListM13454v0 = C6752c.m13454v0(C7076b.m14299s3(str, new String[]{" "}, 0, 6));
            int iMin = Math.min(arrayListM13454v0.size(), 10);
            int size = arrayListM13454v0.size() / iMin;
            int size2 = arrayListM13454v0.size() % iMin;
            int i10 = iMin - size2;
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(Integer.valueOf(size));
            }
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(Integer.valueOf(size + 1));
            }
            ArrayList arrayListM13438f0 = C6752c.m13438f0(arrayList2, arrayList);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayListM13438f0.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                arrayList3.add(C6752c.m13430X(arrayListM13454v0.subList(0, iIntValue), " ", null, null, null, 62));
                arrayListM13454v0.subList(0, iIntValue).clear();
            }
            List listM17256v = C9000b.m17256v(arrayList3);
            SentenceView.m10320l(this.f30487b, listM17256v, false, 6);
            SentenceView sentenceView = this.f30488c;
            SentenceView.m10320l(sentenceView, listM17256v, true, 2);
            sentenceView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC4705a(sentenceView, this));
        }
    }

    public final String getAnswer() {
        return C7076b.m14277B3(C6752c.m13430X(this.f30490e, " ", null, null, new InterfaceC2052l<String, CharSequence>() { // from class: com.lingq.ui.review.views.unscrambler.SentenceBuilderView.getAnswer.1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(String str) {
                String str2 = str;
                C5207g.m11111f(str2, "it");
                return C7076b.m14277B3(str2).toString();
            }
        }, 30)).toString();
    }

    public final String getSentence() {
        return this.f30489d;
    }

    public final void setIsRTL(boolean z10) {
        SentenceView sentenceView = this.f30486a;
        if (z10) {
            sentenceView.setGravity(FlowLayout.Gravity.RIGHT);
            sentenceView.setLayoutDirection(1);
        } else {
            sentenceView.setGravity(FlowLayout.Gravity.LEFT);
            sentenceView.setLayoutDirection(0);
        }
    }

    public final void setListener(InterfaceC10508a interfaceC10508a) {
        C5207g.m11111f(interfaceC10508a, "listener");
        this.f30491f = interfaceC10508a;
    }
}
