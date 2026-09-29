package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0323j0;
import androidx.core.widget.NestedScrollView;
import com.linguist.R;
import java.util.WeakHashMap;
import p080e.DialogC5282n;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.app.b */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0215b extends DialogC5282n implements DialogInterface {

    /* JADX INFO: renamed from: f */
    public final AlertController f598f;

    /* JADX INFO: renamed from: androidx.appcompat.app.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AlertController.C0211b f599a;

        /* JADX INFO: renamed from: b */
        public final int f600b;

        public a(Context context) {
            this(context, DialogInterfaceC0215b.m875f(0, context));
        }

        public a(Context context, int i10) {
            this.f599a = new AlertController.C0211b(new ContextThemeWrapper(context, DialogInterfaceC0215b.m875f(i10, context)));
            this.f600b = i10;
        }

        /* JADX INFO: renamed from: a */
        public final DialogInterfaceC0215b m876a() {
            DialogInterfaceC0215b dialogInterfaceC0215bCreate = create();
            dialogInterfaceC0215bCreate.show();
            return dialogInterfaceC0215bCreate;
        }

        public DialogInterfaceC0215b create() {
            AlertController.C0211b c0211b = this.f599a;
            DialogInterfaceC0215b dialogInterfaceC0215b = new DialogInterfaceC0215b(c0211b.f574a, this.f600b);
            View view = c0211b.f578e;
            AlertController alertController = dialogInterfaceC0215b.f598f;
            if (view != null) {
                alertController.f535C = view;
            } else {
                CharSequence charSequence = c0211b.f577d;
                if (charSequence != null) {
                    alertController.f549e = charSequence;
                    TextView textView = alertController.f533A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = c0211b.f576c;
                if (drawable != null) {
                    alertController.f569y = drawable;
                    alertController.f568x = 0;
                    ImageView imageView = alertController.f570z;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f570z.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = c0211b.f579f;
            if (charSequence2 != null) {
                alertController.f550f = charSequence2;
                TextView textView2 = alertController.f534B;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = c0211b.f580g;
            if (charSequence3 != null) {
                alertController.m874d(-1, charSequence3, c0211b.f581h);
            }
            CharSequence charSequence4 = c0211b.f582i;
            if (charSequence4 != null) {
                alertController.m874d(-2, charSequence4, c0211b.f583j);
            }
            CharSequence charSequence5 = c0211b.f584k;
            if (charSequence5 != null) {
                alertController.m874d(-3, charSequence5, c0211b.f585l);
            }
            if (c0211b.f589p != null || c0211b.f590q != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c0211b.f575b.inflate(alertController.f539G, (ViewGroup) null);
                int i10 = c0211b.f593t ? alertController.f540H : alertController.f541I;
                ListAdapter c0213d = c0211b.f590q;
                if (c0213d == null) {
                    c0213d = new AlertController.C0213d(c0211b.f574a, i10, c0211b.f589p);
                }
                alertController.f536D = c0213d;
                alertController.f537E = c0211b.f594u;
                if (c0211b.f591r != null) {
                    recycleListView.setOnItemClickListener(new C0214a(c0211b, alertController));
                }
                if (c0211b.f593t) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f551g = recycleListView;
            }
            View view2 = c0211b.f592s;
            if (view2 != null) {
                alertController.f552h = view2;
                alertController.f553i = 0;
                alertController.f554j = false;
            }
            dialogInterfaceC0215b.setCancelable(c0211b.f586m);
            if (c0211b.f586m) {
                dialogInterfaceC0215b.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0215b.setOnCancelListener(null);
            dialogInterfaceC0215b.setOnDismissListener(c0211b.f587n);
            DialogInterface.OnKeyListener onKeyListener = c0211b.f588o;
            if (onKeyListener != null) {
                dialogInterfaceC0215b.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0215b;
        }

        public Context getContext() {
            return this.f599a.f574a;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0211b c0211b = this.f599a;
            c0211b.f582i = c0211b.f574a.getText(i10);
            c0211b.f583j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0211b c0211b = this.f599a;
            c0211b.f580g = c0211b.f574a.getText(i10);
            c0211b.f581h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f599a.f577d = charSequence;
            return this;
        }

        public a setView(View view) {
            this.f599a.f592s = view;
            return this;
        }
    }

    public DialogInterfaceC0215b(Context context, int i10) {
        super(context, m875f(i10, context));
        this.f598f = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: f */
    public static int m875f(int i10, Context context) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p080e.DialogC5282n, androidx.activity.DialogC0192k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i10;
        View view;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f598f;
        alertController.f546b.setContentView(alertController.f538F);
        Window window = alertController.f547c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View viewInflate = alertController.f552h;
        Context context = alertController.f545a;
        if (viewInflate == null) {
            viewInflate = alertController.f553i != 0 ? LayoutInflater.from(context).inflate(alertController.f553i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !AlertController.m871a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f554j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f551g != null) {
                ((LinearLayout.LayoutParams) ((C0323j0.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM873c = AlertController.m873c(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM873c2 = AlertController.m873c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM873c3 = AlertController.m873c(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.f567w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f567w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM873c2.findViewById(android.R.id.message);
        alertController.f534B = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f550f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f567w.removeView(alertController.f534B);
                if (alertController.f551g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f567w.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.f567w);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f551g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM873c2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM873c3.findViewById(android.R.id.button1);
        alertController.f555k = button;
        AlertController.ViewOnClickListenerC0210a viewOnClickListenerC0210a = alertController.f544L;
        button.setOnClickListener(viewOnClickListenerC0210a);
        boolean zIsEmpty = TextUtils.isEmpty(alertController.f556l);
        int i11 = alertController.f548d;
        if (zIsEmpty && alertController.f558n == null) {
            alertController.f555k.setVisibility(8);
            i10 = 0;
        } else {
            alertController.f555k.setText(alertController.f556l);
            Drawable drawable = alertController.f558n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i11, i11);
                alertController.f555k.setCompoundDrawables(alertController.f558n, null, null, null);
            }
            alertController.f555k.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupM873c3.findViewById(android.R.id.button2);
        alertController.f559o = button2;
        button2.setOnClickListener(viewOnClickListenerC0210a);
        if (TextUtils.isEmpty(alertController.f560p) && alertController.f562r == null) {
            alertController.f559o.setVisibility(8);
        } else {
            alertController.f559o.setText(alertController.f560p);
            Drawable drawable2 = alertController.f562r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i11, i11);
                alertController.f559o.setCompoundDrawables(alertController.f562r, null, null, null);
            }
            alertController.f559o.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupM873c3.findViewById(android.R.id.button3);
        alertController.f563s = button3;
        button3.setOnClickListener(viewOnClickListenerC0210a);
        if (TextUtils.isEmpty(alertController.f564t) && alertController.f566v == null) {
            alertController.f563s.setVisibility(8);
            view = null;
        } else {
            alertController.f563s.setText(alertController.f564t);
            Drawable drawable3 = alertController.f566v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i11, i11);
                view = null;
                alertController.f563s.setCompoundDrawables(alertController.f566v, null, null, null);
            } else {
                view = null;
            }
            alertController.f563s.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                AlertController.m872b(alertController.f555k);
            } else if (i10 == 2) {
                AlertController.m872b(alertController.f559o);
            } else if (i10 == 4) {
                AlertController.m872b(alertController.f563s);
            }
        }
        if (!(i10 != 0)) {
            viewGroupM873c3.setVisibility(8);
        }
        if (alertController.f535C != null) {
            viewGroupM873c.addView(alertController.f535C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f570z = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f549e)) && alertController.f542J) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.f533A = textView2;
                textView2.setText(alertController.f549e);
                int i12 = alertController.f568x;
                if (i12 != 0) {
                    alertController.f570z.setImageResource(i12);
                } else {
                    Drawable drawable4 = alertController.f569y;
                    if (drawable4 != null) {
                        alertController.f570z.setImageDrawable(drawable4);
                    } else {
                        alertController.f533A.setPadding(alertController.f570z.getPaddingLeft(), alertController.f570z.getPaddingTop(), alertController.f570z.getPaddingRight(), alertController.f570z.getPaddingBottom());
                        alertController.f570z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.f570z.setVisibility(8);
                viewGroupM873c.setVisibility(8);
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        int i13 = (viewGroupM873c == null || viewGroupM873c.getVisibility() == 8) ? 0 : 1;
        boolean z12 = viewGroupM873c3.getVisibility() != 8;
        if (!z12 && (viewFindViewById = viewGroupM873c2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i13 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f567w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f550f == null && alertController.f551g == null) ? view : viewGroupM873c.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM873c2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f551g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.getClass();
            if (!z12 || i13 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i13 != 0 ? recycleListView.getPaddingTop() : recycleListView.f571a, recycleListView.getPaddingRight(), z12 ? recycleListView.getPaddingBottom() : recycleListView.f572b);
            }
        }
        if (!z11) {
            View view2 = alertController.f551g;
            if (view2 == null) {
                view2 = alertController.f567w;
            }
            if (view2 != null) {
                int i14 = z12 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.j.m18736d(view2, i13 | i14, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM873c2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM873c2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f551g;
        if (recycleListView2 == null || (listAdapter = alertController.f536D) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i15 = alertController.f537E;
        if (i15 > -1) {
            recycleListView2.setItemChecked(i15, true);
            recycleListView2.setSelection(i15);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f598f.f567w;
        if (nestedScrollView != null && nestedScrollView.m2986d(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f598f.f567w;
        if (nestedScrollView != null && nestedScrollView.m2986d(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // p080e.DialogC5282n, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f598f;
        alertController.f549e = charSequence;
        TextView textView = alertController.f533A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
