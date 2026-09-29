package p000;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ae */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceC0016ae extends DialogC0782aq implements DialogInterface {

    /* JADX INFO: renamed from: g */
    public final C3792yd f530g;

    public DialogInterfaceC0016ae(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, m290h(contextThemeWrapper, i));
        this.f530g = new C3792yd(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: h */
    public static int m290h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000.DialogC0782aq, p000.xc1, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C3792yd c3792yd = this.f530g;
        c3792yd.f69647b.setContentView(c3792yd.f69639A);
        Context context = c3792yd.f69646a;
        Window window = c3792yd.f69648c;
        View viewFindViewById2 = window.findViewById(R$id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R$id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R$id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R$id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R$id.customPanel);
        View view = c3792yd.f69652g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !C3792yd.m25073a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R$id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c3792yd.f69653h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c3792yd.f69651f != null) {
                ((LinearLayout.LayoutParams) ((bd5) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R$id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R$id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R$id.buttonPanel);
        ViewGroup viewGroupM25074b = C3792yd.m25074b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM25074b2 = C3792yd.m25074b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM25074b3 = C3792yd.m25074b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R$id.scrollView);
        c3792yd.f69663r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c3792yd.f69663r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM25074b2.findViewById(R.id.message);
        c3792yd.f69668w = textView;
        if (textView != null) {
            CharSequence charSequence = c3792yd.f69650e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c3792yd.f69663r.removeView(c3792yd.f69668w);
                if (c3792yd.f69651f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c3792yd.f69663r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c3792yd.f69663r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c3792yd.f69651f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM25074b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM25074b3.findViewById(R.id.button1);
        c3792yd.f69654i = button;
        ViewOnClickListenerC3135j5 viewOnClickListenerC3135j5 = c3792yd.f69645G;
        button.setOnClickListener(viewOnClickListenerC3135j5);
        boolean zIsEmpty = TextUtils.isEmpty(c3792yd.f69655j);
        Button button2 = c3792yd.f69654i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(c3792yd.f69655j);
            c3792yd.f69654i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM25074b3.findViewById(R.id.button2);
        c3792yd.f69657l = button3;
        button3.setOnClickListener(viewOnClickListenerC3135j5);
        boolean zIsEmpty2 = TextUtils.isEmpty(c3792yd.f69658m);
        Button button4 = c3792yd.f69657l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(c3792yd.f69658m);
            c3792yd.f69657l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupM25074b3.findViewById(R.id.button3);
        c3792yd.f69660o = button5;
        button5.setOnClickListener(viewOnClickListenerC3135j5);
        boolean zIsEmpty3 = TextUtils.isEmpty(c3792yd.f69661p);
        Button button6 = c3792yd.f69660o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(c3792yd.f69661p);
            c3792yd.f69660o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = c3792yd.f69654i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = c3792yd.f69657l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = c3792yd.f69660o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM25074b3.setVisibility(8);
        }
        if (c3792yd.f69669x != null) {
            viewGroupM25074b.addView(c3792yd.f69669x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R$id.title_template).setVisibility(8);
        } else {
            c3792yd.f69666u = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(c3792yd.f69649d) || !c3792yd.f69643E) {
                window.findViewById(R$id.title_template).setVisibility(8);
                c3792yd.f69666u.setVisibility(8);
                viewGroupM25074b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R$id.alertTitle);
                c3792yd.f69667v = textView2;
                textView2.setText(c3792yd.f69649d);
                int i2 = c3792yd.f69664s;
                if (i2 != 0) {
                    c3792yd.f69666u.setImageResource(i2);
                } else {
                    Drawable drawable = c3792yd.f69665t;
                    if (drawable != null) {
                        c3792yd.f69666u.setImageDrawable(drawable);
                    } else {
                        c3792yd.f69667v.setPadding(c3792yd.f69666u.getPaddingLeft(), c3792yd.f69666u.getPaddingTop(), c3792yd.f69666u.getPaddingRight(), c3792yd.f69666u.getPaddingBottom());
                        c3792yd.f69666u.setVisibility(8);
                    }
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupM25074b == null || viewGroupM25074b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM25074b3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM25074b2.findViewById(R$id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c3792yd.f69663r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c3792yd.f69650e == null && c3792yd.f69651f == null) ? null : viewGroupM25074b.findViewById(R$id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM25074b2.findViewById(R$id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c3792yd.f69651f;
        if (alertController$RecycleListView != null && (!z3 || i3 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1015a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1016b);
        }
        if (!z2) {
            View view2 = c3792yd.f69651f;
            if (view2 == null) {
                view2 = c3792yd.f69663r;
            }
            if (view2 != null) {
                int i4 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R$id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R$id.scrollIndicatorDown);
                WeakHashMap weakHashMap = dta.f36217a;
                view2.setScrollIndicators(i3 | i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM25074b2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM25074b2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c3792yd.f69651f;
        if (alertController$RecycleListView2 == null || (listAdapter = c3792yd.f69670y) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = c3792yd.f69671z;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f530g.f69663r;
        if (nestedScrollView == null || !nestedScrollView.m2008j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f530g.f69663r;
        if (nestedScrollView == null || !nestedScrollView.m2008j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p000.DialogC0782aq, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C3792yd c3792yd = this.f530g;
        c3792yd.f69649d = charSequence;
        TextView textView = c3792yd.f69667v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
