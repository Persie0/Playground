package com.lingq.p055ui.tooltips;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import com.lingq.p055ui.MainActivity;
import com.lingq.p055ui.home.collections.DialogInterfaceOnClickListenerC3570b;
import com.lingq.p055ui.session.DialogInterfaceOnClickListenerC4749a;
import com.lingq.p055ui.tooltips.C4911a;
import com.lingq.p055ui.tooltips.ToolTipsViewManager;
import com.linguist.R;
import dj.ViewOnTouchListenerC5188f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p003a2.C0009a;
import p118fe.C5509a;
import p183ik.C6343f;
import p183ik.C6344g;
import p183ik.C6345h;
import p183ik.C6346i;
import p183ik.C6347j;
import p183ik.C6349l;
import p183ik.C6351n;
import p183ik.C6352o;
import p183ik.C6353p;
import p183ik.InterfaceC6338a;
import p183ik.InterfaceC6339b;
import p183ik.InterfaceC6340c;
import p183ik.InterfaceC6342e;
import p225kk.C6704a;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import p378s3.C8954c;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8338o4;
import sl.C9072e;
import tc.C9249b;
import tl.C9327o;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ClickableViewAccessibility"})
public final class ToolTipsViewManager {

    /* JADX INFO: renamed from: a */
    public final Context f31909a;

    /* JADX INFO: renamed from: b */
    public final C6704a f31910b;

    /* JADX INFO: renamed from: c */
    public final View f31911c;

    /* JADX INFO: renamed from: d */
    public final TooltipContainer f31912d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6338a f31913e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC6340c f31914f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6339b f31915g;

    /* JADX INFO: renamed from: h */
    public final HashMap<TooltipStep, C4911a> f31916h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f31917i;

    /* JADX INFO: renamed from: j */
    public final HashMap<TooltipStep, InterfaceC6342e> f31918j;

    /* JADX INFO: renamed from: k */
    public C6344g f31919k;

    /* JADX INFO: renamed from: l */
    public C4911a f31920l;

    /* JADX INFO: renamed from: com.lingq.ui.tooltips.ToolTipsViewManager$a */
    public /* synthetic */ class C4905a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31921a;

        static {
            int[] iArr = new int[TooltipStep.HighlightType.values().length];
            try {
                iArr[TooltipStep.HighlightType.Hand.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipStep.HighlightType.HandCentered.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TooltipStep.HighlightType.Focus.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TooltipStep.HighlightType.Incentive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TooltipStep.HighlightType.Indicator.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TooltipStep.HighlightType.HandSwipe.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TooltipStep.HighlightType.HandSwipeTopDown.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TooltipStep.HighlightType.Nothing.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f31921a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.tooltips.ToolTipsViewManager$b */
    public static final class C4906b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6344g f31922a;

        public C4906b(C6344g c6344g) {
            this.f31922a = c6344g;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C5207g.m11111f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C5207g.m11111f(animator, "animation");
            this.f31922a.clearAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            C5207g.m11111f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C5207g.m11111f(animator, "animation");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.tooltips.ToolTipsViewManager$c */
    public static final class C4907c implements InterfaceC7774a<C9072e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6343f f31924b;

        public C4907c(C6343f c6343f) {
            this.f31924b = c6343f;
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(C9072e c9072e) {
            C5207g.m11111f(c9072e, "it");
            ToolTipsViewManager.this.m10400b(this.f31924b.f36654a);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.tooltips.ToolTipsViewManager$d */
    public static final class C4908d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4911a f31925a;

        public C4908d(C4911a c4911a) {
            this.f31925a = c4911a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            C5207g.m11111f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C5207g.m11111f(animator, "animation");
            this.f31925a.clearAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            C5207g.m11111f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C5207g.m11111f(animator, "animation");
        }
    }

    public ToolTipsViewManager(Context context, C6704a c6704a, View view, TooltipContainer tooltipContainer, MainActivity.C3421b c3421b, MainActivity.C3422c c3422c, MainActivity.C3423d c3423d) {
        C5207g.m11111f(context, "context");
        this.f31909a = context;
        this.f31910b = c6704a;
        this.f31911c = view;
        this.f31912d = tooltipContainer;
        this.f31913e = c3421b;
        this.f31914f = c3422c;
        this.f31915g = c3423d;
        this.f31916h = new HashMap<>();
        this.f31917i = new ArrayList();
        this.f31918j = new HashMap<>();
        tooltipContainer.setOnTouchListener(new ViewOnTouchListenerC5188f(1, this));
    }

    /* JADX INFO: renamed from: a */
    public final void m10399a() {
        for (TooltipStep tooltipStep : TooltipStep.values()) {
            m10401c(tooltipStep);
        }
        TooltipContainer tooltipContainer = this.f31912d;
        if (tooltipContainer.getWindowToken() == null && !tooltipContainer.isAttachedToWindow()) {
            return;
        }
        tooltipContainer.removeAllViews();
    }

    /* JADX INFO: renamed from: b */
    public final void m10400b(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        Context context = this.f31909a;
        C9249b c9249b = new C9249b(context);
        c9249b.setTitle(context.getString(R.string.tooltips_warning_title));
        String strM21i = C0009a.m21i(context.getString(R.string.tooltips_warning_title_desc), "\n\n", context.getString(R.string.tooltips_restart_tutorial_instructions));
        AlertController.C0211b c0211b = c9249b.f599a;
        c0211b.f579f = strM21i;
        int i10 = 1;
        c9249b.m17610c(context.getString(R.string.welcome_skip_this_step), new DialogInterfaceOnClickListenerC3570b(this, i10, tooltipStep));
        c9249b.m17612e(context.getString(R.string.ui_continue), null);
        String string = context.getString(R.string.ui_quit);
        DialogInterfaceOnClickListenerC4749a dialogInterfaceOnClickListenerC4749a = new DialogInterfaceOnClickListenerC4749a(this, i10, tooltipStep);
        c0211b.f584k = string;
        c0211b.f585l = dialogInterfaceOnClickListenerC4749a;
        c9249b.m876a();
    }

    /* JADX INFO: renamed from: c */
    public final void m10401c(final TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        HashMap<TooltipStep, C4911a> map = this.f31916h;
        C4911a c4911a = map.get(tooltipStep);
        if (c4911a != null) {
            map.put(tooltipStep, null);
            c4911a.clearAnimation();
            c4911a.setAlpha(0.0f);
            C6344g c6344g = this.f31919k;
            TooltipContainer tooltipContainer = this.f31912d;
            tooltipContainer.removeView(c6344g);
            tooltipContainer.removeView(c4911a);
        }
        C9327o.m17686F(this.f31917i, new InterfaceC2052l<C6343f, Boolean>() { // from class: com.lingq.ui.tooltips.ToolTipsViewManager$dismiss$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(C6343f c6343f) {
                C6343f c6343f2 = c6343f;
                C5207g.m11111f(c6343f2, "it");
                return Boolean.valueOf(c6343f2.f36654a == tooltipStep);
            }
        });
        HashMap<TooltipStep, InterfaceC6342e> map2 = this.f31918j;
        InterfaceC6342e interfaceC6342e = map2.get(tooltipStep);
        if (interfaceC6342e != null) {
            interfaceC6342e.mo12967a();
            map2.put(tooltipStep, null);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: d */
    public final void m10402d(final C6343f c6343f) {
        Object obj;
        Object next;
        FrameLayout.LayoutParams layoutParams;
        C5207g.m11111f(c6343f, "tooltipData");
        ArrayList arrayList = this.f31917i;
        Iterator it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            TooltipStep tooltipStep = ((C6343f) it.next()).f36654a;
            if (tooltipStep != TooltipStep.SentenceModeHighlight && tooltipStep != TooltipStep.ReviewMenuHighlight && tooltipStep != TooltipStep.PlayAudioHighlight) {
                z10 = false;
            }
        }
        HashMap<TooltipStep, C4911a> map = this.f31916h;
        TooltipStep tooltipStep2 = c6343f.f36654a;
        if (map.get(tooltipStep2) == null) {
            Iterator it2 = arrayList.iterator();
            do {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((C6343f) next).f36654a == tooltipStep2));
            if (next == null) {
                for (Object obj2 : arrayList) {
                    if (((C6343f) obj2).f36658e) {
                        obj = obj2;
                        break;
                    }
                }
                if (obj == null && z10) {
                    boolean z11 = c6343f.f36658e;
                    if (z11) {
                        m10399a();
                    }
                    C9327o.m17686F(arrayList, new InterfaceC2052l<C6343f, Boolean>() { // from class: com.lingq.ui.tooltips.ToolTipsViewManager$show$4
                        {
                            super(1);
                        }

                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(C6343f c6343f2) {
                            C6343f c6343f3 = c6343f2;
                            C5207g.m11111f(c6343f3, "it");
                            return Boolean.valueOf(c6343f3.f36654a == c6343f.f36654a);
                        }
                    });
                    arrayList.add(c6343f);
                    C5509a c5509a = new C5509a(22, c6343f);
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.i.m18727u(this.f31911c, c5509a);
                    List<Integer> list = C6716m.f37937a;
                    int iM13316a = (int) C6716m.m13316a(5);
                    Rect rect = c6343f.f36655b;
                    rect.left -= iM13316a;
                    rect.right += iM13316a;
                    Context context = this.f31909a;
                    TooltipContainer tooltipContainer = this.f31912d;
                    if (z11) {
                        this.f31919k = new C6344g(context, rect);
                        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
                        C6344g c6344g = this.f31919k;
                        if (c6344g != null) {
                            c6344g.setOnTouchListener(new View.OnTouchListener(this) { // from class: ik.d

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ ToolTipsViewManager f36653b;

                                {
                                    this.f36653b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    C8338o4 binding;
                                    C6343f c6343f2 = c6343f;
                                    C5207g.m11111f(c6343f2, "$tooltipData");
                                    ToolTipsViewManager toolTipsViewManager = this.f36653b;
                                    C5207g.m11111f(toolTipsViewManager, "this$0");
                                    int action = motionEvent.getAction();
                                    if (action != 0 && action != 1) {
                                        return false;
                                    }
                                    if (action == 1) {
                                        int x10 = (int) motionEvent.getX();
                                        int y10 = (int) motionEvent.getY();
                                        Rect rect2 = c6343f2.f36655b;
                                        if (x10 <= rect2.left || x10 >= rect2.right || y10 <= rect2.top || y10 >= rect2.bottom) {
                                            String strAlternativeMessage = c6343f2.f36654a.alternativeMessage(toolTipsViewManager.f31909a);
                                            if (strAlternativeMessage.length() > 0) {
                                                C4911a c4911a = toolTipsViewManager.f31920l;
                                                TextView textView = (c4911a == null || (binding = c4911a.getBinding()) == null) ? null : binding.f45118a;
                                                if (textView != null) {
                                                    textView.setText(strAlternativeMessage);
                                                }
                                            }
                                        } else {
                                            toolTipsViewManager.f31913e.mo9714a(c6343f2);
                                        }
                                    }
                                    return true;
                                }
                            });
                        }
                        tooltipContainer.addView(this.f31919k, layoutParams2);
                        C6344g c6344g2 = this.f31919k;
                        if (c6344g2 != null) {
                            c6344g2.setAlpha(0.0f);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c6344g2, "alpha", 0.0f, 1.0f);
                            C5207g.m11110e(objectAnimatorOfFloat, "ofFloat(overlay, \"alpha\", 0.0f, 1.0f)");
                            objectAnimatorOfFloat.setDuration(300L);
                            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                            objectAnimatorOfFloat.addListener(new C4906b(c6344g2));
                            objectAnimatorOfFloat.start();
                        }
                    }
                    TooltipStep tooltipStep3 = c6343f.f36654a;
                    Context context2 = this.f31909a;
                    C6704a c6704a = this.f31910b;
                    int i10 = C4905a.f31921a[TooltipStep.info$default(tooltipStep3, context2, c6704a.f37891b.getInt("tutorial_lingqs", 0), null, 4, null).f31931d.ordinal()];
                    HashMap<TooltipStep, InterfaceC6342e> map2 = this.f31918j;
                    switch (i10) {
                        case 1:
                            C6346i c6346i = new C6346i(context, rect);
                            tooltipContainer.addView(c6346i);
                            map2.put(tooltipStep2, c6346i);
                            break;
                        case 2:
                            C6347j c6347j = new C6347j(context, rect);
                            tooltipContainer.addView(c6347j);
                            map2.put(tooltipStep2, c6347j);
                            break;
                        case 3:
                            C6345h c6345h = new C6345h(context, rect);
                            tooltipContainer.addView(c6345h);
                            map2.put(tooltipStep2, c6345h);
                            break;
                        case 4:
                            C6352o c6352o = new C6352o(context, rect);
                            tooltipContainer.addView(c6352o);
                            map2.put(tooltipStep2, c6352o);
                            break;
                        case 5:
                            C6353p c6353p = new C6353p(context, rect);
                            tooltipContainer.addView(c6353p);
                            map2.put(tooltipStep2, c6353p);
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            C6349l c6349l = new C6349l(context, rect);
                            tooltipContainer.addView(c6349l);
                            map2.put(tooltipStep2, c6349l);
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            C6351n c6351n = new C6351n(context, rect);
                            tooltipContainer.addView(c6351n);
                            map2.put(tooltipStep2, c6351n);
                            break;
                    }
                    if (TooltipStep.info$default(c6343f.f36654a, this.f31909a, c6704a.f37891b.getInt("tutorial_lingqs", 0), null, 4, null).f31928a.length() > 0) {
                        int measuredWidth = tooltipContainer.getMeasuredWidth();
                        boolean z12 = c6343f.f36659f;
                        Rect rect2 = c6343f.f36656c;
                        if (z12) {
                            int iWidth = rect.width();
                            int iM13316a2 = (int) C6716m.m13316a(80);
                            if (iWidth < iM13316a2) {
                                iWidth = iM13316a2;
                            }
                            measuredWidth = iWidth + ((int) C6716m.m13316a(80));
                            int iM13316a3 = (int) C6716m.m13316a(300);
                            if (measuredWidth > iM13316a3) {
                                measuredWidth = iM13316a3;
                            }
                            layoutParams = new FrameLayout.LayoutParams(measuredWidth, -2);
                        } else {
                            int i11 = (measuredWidth - rect2.left) - rect2.right;
                            int iM13316a4 = (int) C6716m.m13316a(120);
                            if (i11 < iM13316a4) {
                                i11 = iM13316a4;
                            }
                            int iM13316a5 = (int) C6716m.m13316a(300);
                            if (i11 > iM13316a5) {
                                i11 = iM13316a5;
                            }
                            layoutParams = new FrameLayout.LayoutParams(i11, -2);
                        }
                        Rect rect3 = new Rect();
                        if (z12) {
                            rect3.left = rect.left;
                            rect3.right = rect.right;
                        } else {
                            int i12 = rect2.left;
                            layoutParams.leftMargin = i12;
                            int i13 = rect2.right;
                            layoutParams.rightMargin = i13;
                            if (i12 == 0 && i13 > 0) {
                                layoutParams.gravity = 8388613;
                            }
                        }
                        C4911a c4911a = new C4911a(context, tooltipStep2, new C4907c(c6343f));
                        this.f31920l = c4911a;
                        map.put(tooltipStep2, c4911a);
                        C4911a c4911a2 = this.f31920l;
                        if (c4911a2 != null) {
                            c4911a2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            if (rect2.bottom != 0) {
                                layoutParams.topMargin = rect.top - c4911a2.getMeasuredHeight();
                            } else {
                                layoutParams.topMargin = rect2.top;
                            }
                            if (rect3.left != 0 && rect3.right != 0) {
                                int measuredWidth2 = (c4911a2.getMeasuredWidth() - rect.width()) / 2;
                                if (rect3.left - measuredWidth2 > C6716m.m13316a(5)) {
                                    layoutParams.leftMargin = rect3.left - measuredWidth2;
                                } else {
                                    layoutParams.leftMargin = (int) C6716m.m13316a(5);
                                }
                                if (rect3.right + measuredWidth2 > tooltipContainer.getMeasuredWidth() - C6716m.m13316a(5)) {
                                    layoutParams.gravity = 8388613;
                                    layoutParams.rightMargin = (int) C6716m.m13316a(5);
                                } else {
                                    layoutParams.rightMargin = rect3.right + measuredWidth2;
                                }
                            }
                            tooltipContainer.addView(c4911a2, layoutParams);
                            c4911a2.setAlpha(0.0f);
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c4911a2, "alpha", 0.0f, 1.0f);
                            C5207g.m11110e(objectAnimatorOfFloat2, "ofFloat(tooltipView, \"alpha\", 0.0f, 1.0f)");
                            objectAnimatorOfFloat2.setDuration(500L);
                            objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                            objectAnimatorOfFloat2.addListener(new C4908d(c4911a2));
                            objectAnimatorOfFloat2.start();
                            if (c6343f.f36660g) {
                                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c4911a2, "translationY", 10.0f);
                                objectAnimatorOfFloat3.setDuration(1000L);
                                objectAnimatorOfFloat3.setRepeatMode(2);
                                objectAnimatorOfFloat3.setRepeatCount(-1);
                                objectAnimatorOfFloat3.setInterpolator(new C8954c());
                                objectAnimatorOfFloat3.start();
                            }
                        }
                    }
                }
            }
        }
    }
}
