package p000;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController$RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: eg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0155eg extends DialogC0181ff implements DialogInterface {

    /* JADX INFO: renamed from: a */
    public final C0153ee f13908a;

    protected DialogInterfaceC0155eg(Context context, int i) {
        super(context, m7290a(context, i));
        this.f13908a = new C0153ee(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: a */
    static int m7290a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0100R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c5  */
    @Override // p000.DialogC0181ff, p000.DialogC0908pm, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        int i;
        View viewFindViewById;
        ListAdapter listAdapter;
        int i2;
        View viewFindViewById2;
        Button button;
        super.onCreate(bundle);
        C0153ee c0153ee = this.f13908a;
        c0153ee.f13559b.setContentView(c0153ee.f13550B == 0 ? c0153ee.f13549A : c0153ee.f13549A);
        View viewFindViewById3 = c0153ee.f13560c.findViewById(C0100R.id.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(C0100R.id.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(C0100R.id.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(C0100R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C0100R.id.customPanel);
        View viewInflate = c0153ee.f13564g;
        if (viewInflate == null) {
            viewInflate = c0153ee.f13565h != 0 ? LayoutInflater.from(c0153ee.f13558a).inflate(c0153ee.f13565h, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (z && C0153ee.m7197b(viewInflate)) {
            ((FrameLayout) c0153ee.f13560c.findViewById(C0100R.id.custom)).addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            boolean z2 = c0153ee.f13566i;
            if (c0153ee.f13563f != null) {
                ((C0783kw) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            c0153ee.f13560c.setFlags(131072, 131072);
            if (z) {
                ((FrameLayout) c0153ee.f13560c.findViewById(C0100R.id.custom)).addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
                boolean z3 = c0153ee.f13566i;
                if (c0153ee.f13563f != null) {
                    ((C0783kw) viewGroup.getLayoutParams()).weight = 0.0f;
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        View viewFindViewById7 = viewGroup.findViewById(C0100R.id.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(C0100R.id.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(C0100R.id.buttonPanel);
        ViewGroup viewGroupM7199d = C0153ee.m7199d(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM7199d2 = C0153ee.m7199d(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM7199d3 = C0153ee.m7199d(viewFindViewById9, viewFindViewById6);
        c0153ee.f13575r = (NestedScrollView) c0153ee.f13560c.findViewById(C0100R.id.scrollView);
        c0153ee.f13575r.setFocusable(false);
        c0153ee.f13575r.setNestedScrollingEnabled(false);
        c0153ee.f13580w = (TextView) viewGroupM7199d2.findViewById(R.id.message);
        TextView textView = c0153ee.f13580w;
        if (textView != null) {
            CharSequence charSequence = c0153ee.f13562e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0153ee.f13575r.removeView(c0153ee.f13580w);
                if (c0153ee.f13563f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0153ee.f13575r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c0153ee.f13575r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c0153ee.f13563f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM7199d2.setVisibility(8);
                }
            }
        }
        c0153ee.f13567j = (Button) viewGroupM7199d3.findViewById(R.id.button1);
        c0153ee.f13567j.setOnClickListener(c0153ee.f13557I);
        if (TextUtils.isEmpty(c0153ee.f13568k)) {
            c0153ee.f13567j.setVisibility(8);
            i = 0;
        } else {
            c0153ee.f13567j.setText(c0153ee.f13568k);
            c0153ee.f13567j.setVisibility(0);
            i = 1;
        }
        c0153ee.f13570m = (Button) viewGroupM7199d3.findViewById(R.id.button2);
        c0153ee.f13570m.setOnClickListener(c0153ee.f13557I);
        if (TextUtils.isEmpty(c0153ee.f13571n)) {
            c0153ee.f13570m.setVisibility(8);
        } else {
            c0153ee.f13570m.setText(c0153ee.f13571n);
            c0153ee.f13570m.setVisibility(0);
            i |= 2;
        }
        c0153ee.f13573p = (Button) viewGroupM7199d3.findViewById(R.id.button3);
        c0153ee.f13573p.setOnClickListener(c0153ee.f13557I);
        CharSequence charSequence2 = c0153ee.f13574q;
        if (TextUtils.isEmpty(null)) {
            c0153ee.f13573p.setVisibility(8);
        } else {
            Button button2 = c0153ee.f13573p;
            CharSequence charSequence3 = c0153ee.f13574q;
            button2.setText((CharSequence) null);
            c0153ee.f13573p.setVisibility(0);
            i |= 4;
        }
        Context context = c0153ee.f13558a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0100R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                button = c0153ee.f13567j;
            } else if (i == 2) {
                button = c0153ee.f13570m;
            } else if (i == 4) {
                button = c0153ee.f13573p;
            } else if (i == 0) {
                viewGroupM7199d3.setVisibility(8);
            }
            C0153ee.m7198c(button);
        } else if (i == 0) {
            viewGroupM7199d3.setVisibility(8);
        }
        if (c0153ee.f13581x != null) {
            viewGroupM7199d.addView(c0153ee.f13581x, 0, new ViewGroup.LayoutParams(-1, -2));
            c0153ee.f13560c.findViewById(C0100R.id.title_template).setVisibility(8);
        } else {
            c0153ee.f13578u = (ImageView) c0153ee.f13560c.findViewById(R.id.icon);
            if (TextUtils.isEmpty(c0153ee.f13561d) || !c0153ee.f13555G) {
                c0153ee.f13560c.findViewById(C0100R.id.title_template).setVisibility(8);
                c0153ee.f13578u.setVisibility(8);
                viewGroupM7199d.setVisibility(8);
            } else {
                c0153ee.f13579v = (TextView) c0153ee.f13560c.findViewById(C0100R.id.alertTitle);
                c0153ee.f13579v.setText(c0153ee.f13561d);
                int i3 = c0153ee.f13576s;
                Drawable drawable = c0153ee.f13577t;
                if (drawable != null) {
                    c0153ee.f13578u.setImageDrawable(drawable);
                } else {
                    c0153ee.f13579v.setPadding(c0153ee.f13578u.getPaddingLeft(), c0153ee.f13578u.getPaddingTop(), c0153ee.f13578u.getPaddingRight(), c0153ee.f13578u.getPaddingBottom());
                    c0153ee.f13578u.setVisibility(8);
                }
            }
        }
        boolean z4 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        int i4 = (viewGroupM7199d == null || viewGroupM7199d.getVisibility() == 8) ? 0 : 1;
        boolean z5 = (viewGroupM7199d3 == null || viewGroupM7199d3.getVisibility() == 8) ? false : true;
        if (!z5 && viewGroupM7199d2 != null && (viewFindViewById2 = viewGroupM7199d2.findViewById(C0100R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView = c0153ee.f13575r;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (c0153ee.f13562e == null && c0153ee.f13563f == null) ? null : viewGroupM7199d.findViewById(C0100R.id.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM7199d2 != null && (viewFindViewById = viewGroupM7199d2.findViewById(C0100R.id.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = c0153ee.f13563f;
        if (listView instanceof AlertController$RecycleListView) {
            if (!z5) {
                i2 = i4;
            } else if (i4 == 0) {
                i2 = 0;
            }
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) listView;
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f902a, alertController$RecycleListView.getPaddingRight(), z5 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f903b);
        }
        if (!z4) {
            View view = c0153ee.f13563f;
            if (view == null) {
                view = c0153ee.f13575r;
            }
            if (view != null) {
                int i5 = true == z5 ? 2 : 0;
                View viewFindViewById11 = c0153ee.f13560c.findViewById(C0100R.id.scrollIndicatorUp);
                View viewFindViewById12 = c0153ee.f13560c.findViewById(C0100R.id.scrollIndicatorDown);
                afi.m499d(view, i4 | i5, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM7199d2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM7199d2.removeView(viewFindViewById12);
                }
            }
        }
        ListView listView2 = c0153ee.f13563f;
        if (listView2 == null || (listAdapter = c0153ee.f13582y) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i6 = c0153ee.f13583z;
        if (i6 >= 0) {
            listView2.setItemChecked(i6, true);
            listView2.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13908a.f13575r;
        if (nestedScrollView == null || !nestedScrollView.m1455l(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13908a.f13575r;
        if (nestedScrollView == null || !nestedScrollView.m1455l(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p000.DialogC0181ff, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f13908a.m7200a(charSequence);
    }
}
