package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.RunnableC0191j;
import com.facebook.login.widget.ToolTipPopup;
import com.linguist.R;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import p173i8.C6205a;
import p274n8.ViewOnClickListenerC7718c;
import p292o8.ViewTreeObserverOnScrollChangedListenerC8018b;

/* JADX INFO: loaded from: classes.dex */
public final class ToolTipPopup {

    /* JADX INFO: renamed from: a */
    public final String f11697a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<View> f11698b;

    /* JADX INFO: renamed from: c */
    public final Context f11699c;

    /* JADX INFO: renamed from: d */
    public C2337a f11700d;

    /* JADX INFO: renamed from: e */
    public PopupWindow f11701e;

    /* JADX INFO: renamed from: f */
    public Style f11702f;

    /* JADX INFO: renamed from: g */
    public long f11703g;

    /* JADX INFO: renamed from: h */
    public final ViewTreeObserverOnScrollChangedListenerC8018b f11704h;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/facebook/login/widget/ToolTipPopup$Style;", "", "(Ljava/lang/String;I)V", "BLUE", "BLACK", "facebook-login_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum Style {
        BLUE,
        BLACK;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Style[] valuesCustom() {
            Style[] styleArrValuesCustom = values();
            return (Style[]) Arrays.copyOf(styleArrValuesCustom, styleArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ToolTipPopup$a */
    public final class C2337a extends FrameLayout {

        /* JADX INFO: renamed from: a */
        public final ImageView f11705a;

        /* JADX INFO: renamed from: b */
        public final ImageView f11706b;

        /* JADX INFO: renamed from: c */
        public final View f11707c;

        /* JADX INFO: renamed from: d */
        public final ImageView f11708d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        public C2337a(ToolTipPopup toolTipPopup, Context context) {
            super(context);
            C5207g.m11111f(toolTipPopup, "this$0");
            C5207g.m11111f(context, "context");
            LayoutInflater.from(context).inflate(R.layout.com_facebook_tooltip_bubble, this);
            View viewFindViewById = findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f11705a = (ImageView) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f11706b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = findViewById(R.id.com_facebook_body_frame);
            C5207g.m11110e(viewFindViewById3, "findViewById(R.id.com_facebook_body_frame)");
            this.f11707c = viewFindViewById3;
            View viewFindViewById4 = findViewById(R.id.com_facebook_button_xout);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f11708d = (ImageView) viewFindViewById4;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [o8.b] */
    public ToolTipPopup(View view, String str) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(view, "anchor");
        this.f11697a = str;
        this.f11698b = new WeakReference<>(view);
        Context context = view.getContext();
        C5207g.m11110e(context, "anchor.context");
        this.f11699c = context;
        this.f11702f = Style.BLUE;
        this.f11703g = 6000L;
        this.f11704h = new ViewTreeObserver.OnScrollChangedListener() { // from class: o8.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                ToolTipPopup toolTipPopup = this.f43611a;
                if (C6205a.m12742b(ToolTipPopup.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(toolTipPopup, "this$0");
                    if (toolTipPopup.f11698b.get() != null) {
                        PopupWindow popupWindow = toolTipPopup.f11701e;
                        if (popupWindow != null) {
                            if (popupWindow.isShowing()) {
                                if (popupWindow.isAboveAnchor()) {
                                    ToolTipPopup.C2337a c2337a = toolTipPopup.f11700d;
                                    if (c2337a != null) {
                                        c2337a.f11705a.setVisibility(4);
                                        c2337a.f11706b.setVisibility(0);
                                    }
                                } else {
                                    ToolTipPopup.C2337a c2337a2 = toolTipPopup.f11700d;
                                    if (c2337a2 != null) {
                                        c2337a2.f11705a.setVisibility(0);
                                        c2337a2.f11706b.setVisibility(4);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    C6205a.m12741a(ToolTipPopup.class, th2);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final void m6743a() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            m6745c();
            PopupWindow popupWindow = this.f11701e;
            if (popupWindow == null) {
                return;
            }
            popupWindow.dismiss();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6744b() {
        ViewTreeObserver viewTreeObserver;
        Context context = this.f11699c;
        if (C6205a.m12742b(this)) {
            return;
        }
        WeakReference<View> weakReference = this.f11698b;
        try {
            if (weakReference.get() != null) {
                C2337a c2337a = new C2337a(this, context);
                ImageView imageView = c2337a.f11708d;
                ImageView imageView2 = c2337a.f11705a;
                ImageView imageView3 = c2337a.f11706b;
                View view = c2337a.f11707c;
                this.f11700d = c2337a;
                View viewFindViewById = c2337a.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) viewFindViewById).setText(this.f11697a);
                if (this.f11702f == Style.BLUE) {
                    view.setBackgroundResource(R.drawable.com_facebook_tooltip_blue_background);
                    imageView3.setImageResource(R.drawable.com_facebook_tooltip_blue_bottomnub);
                    imageView2.setImageResource(R.drawable.com_facebook_tooltip_blue_topnub);
                    imageView.setImageResource(R.drawable.com_facebook_tooltip_blue_xout);
                } else {
                    view.setBackgroundResource(R.drawable.com_facebook_tooltip_black_background);
                    imageView3.setImageResource(R.drawable.com_facebook_tooltip_black_bottomnub);
                    imageView2.setImageResource(R.drawable.com_facebook_tooltip_black_topnub);
                    imageView.setImageResource(R.drawable.com_facebook_tooltip_black_xout);
                }
                View decorView = ((Activity) context).getWindow().getDecorView();
                C5207g.m11110e(decorView, "window.decorView");
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                if (!C6205a.m12742b(this)) {
                    try {
                        m6745c();
                        View view2 = weakReference.get();
                        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                            viewTreeObserver.addOnScrollChangedListener(this.f11704h);
                        }
                    } catch (Throwable th2) {
                        C6205a.m12741a(this, th2);
                    }
                }
                c2337a.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupWindow popupWindow = new PopupWindow(c2337a, c2337a.getMeasuredWidth(), c2337a.getMeasuredHeight());
                this.f11701e = popupWindow;
                popupWindow.showAsDropDown(weakReference.get());
                if (!C6205a.m12742b(this)) {
                    try {
                        PopupWindow popupWindow2 = this.f11701e;
                        if (popupWindow2 != null && popupWindow2.isShowing()) {
                            if (popupWindow2.isAboveAnchor()) {
                                C2337a c2337a2 = this.f11700d;
                                if (c2337a2 != null) {
                                    c2337a2.f11705a.setVisibility(4);
                                    c2337a2.f11706b.setVisibility(0);
                                }
                            } else {
                                C2337a c2337a3 = this.f11700d;
                                if (c2337a3 != null) {
                                    c2337a3.f11705a.setVisibility(0);
                                    c2337a3.f11706b.setVisibility(4);
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        C6205a.m12741a(this, th3);
                    }
                }
                long j10 = this.f11703g;
                if (j10 > 0) {
                    c2337a.postDelayed(new RunnableC0191j(9, this), j10);
                }
                popupWindow.setTouchable(true);
                c2337a.setOnClickListener(new ViewOnClickListenerC7718c(1, this));
            }
        } catch (Throwable th4) {
            C6205a.m12741a(this, th4);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6745c() {
        ViewTreeObserver viewTreeObserver;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            View view = this.f11698b.get();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.f11704h);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
