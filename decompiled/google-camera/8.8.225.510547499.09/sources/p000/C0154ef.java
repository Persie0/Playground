package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* JADX INFO: renamed from: ef */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0154ef {

    /* JADX INFO: renamed from: a */
    public final C0150eb f13785a;

    /* JADX INFO: renamed from: b */
    private final int f13786b;

    public C0154ef(Context context) {
        this(context, DialogInterfaceC0155eg.m7290a(context, 0));
    }

    /* JADX INFO: renamed from: a */
    public final Context m7255a() {
        return this.f13785a.f13163a;
    }

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0155eg mo7256b() {
        ListAdapter c0152ed;
        DialogInterfaceC0155eg dialogInterfaceC0155eg = new DialogInterfaceC0155eg(this.f13785a.f13163a, this.f13786b);
        C0150eb c0150eb = this.f13785a;
        C0153ee c0153ee = dialogInterfaceC0155eg.f13908a;
        View view = c0150eb.f13167e;
        if (view != null) {
            c0153ee.f13581x = view;
        } else {
            CharSequence charSequence = c0150eb.f13166d;
            if (charSequence != null) {
                c0153ee.m7200a(charSequence);
            }
            Drawable drawable = c0150eb.f13165c;
            if (drawable != null) {
                c0153ee.f13577t = drawable;
                c0153ee.f13576s = 0;
                ImageView imageView = c0153ee.f13578u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0153ee.f13578u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0150eb.f13168f;
        if (charSequence2 != null) {
            c0153ee.f13562e = charSequence2;
            TextView textView = c0153ee.f13580w;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0150eb.f13169g;
        if (charSequence3 != null) {
            c0153ee.m7201e(-1, charSequence3, c0150eb.f13170h);
        }
        CharSequence charSequence4 = c0150eb.f13171i;
        if (charSequence4 != null) {
            c0153ee.m7201e(-2, charSequence4, c0150eb.f13172j);
        }
        if (c0150eb.f13176n != null || c0150eb.f13177o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0150eb.f13164b.inflate(c0153ee.f13551C, (ViewGroup) null);
            if (c0150eb.f13182t) {
                c0152ed = new C0147dz(c0150eb, c0150eb.f13163a, c0153ee.f13552D, c0150eb.f13176n, alertController$RecycleListView);
            } else {
                int i = c0150eb.f13183u ? c0153ee.f13553E : c0153ee.f13554F;
                c0152ed = c0150eb.f13177o;
                if (c0152ed == null) {
                    c0152ed = new C0152ed(c0150eb.f13163a, i, c0150eb.f13176n);
                }
            }
            c0153ee.f13582y = c0152ed;
            c0153ee.f13583z = c0150eb.f13184v;
            if (c0150eb.f13178p != null) {
                alertController$RecycleListView.setOnItemClickListener(new idr(c0150eb, c0153ee, 1));
            } else if (c0150eb.f13185w != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0149ea(c0150eb, alertController$RecycleListView, c0153ee));
            }
            if (c0150eb.f13183u) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c0150eb.f13182t) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c0153ee.f13563f = alertController$RecycleListView;
        }
        View view2 = c0150eb.f13180r;
        if (view2 != null) {
            c0153ee.f13564g = view2;
            c0153ee.f13565h = 0;
            c0153ee.f13566i = false;
        } else {
            int i2 = c0150eb.f13179q;
            if (i2 != 0) {
                c0153ee.f13564g = null;
                c0153ee.f13565h = i2;
                c0153ee.f13566i = false;
            }
        }
        dialogInterfaceC0155eg.setCancelable(this.f13785a.f13173k);
        if (this.f13785a.f13173k) {
            dialogInterfaceC0155eg.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC0155eg.setOnCancelListener(null);
        dialogInterfaceC0155eg.setOnDismissListener(this.f13785a.f13174l);
        DialogInterface.OnKeyListener onKeyListener = this.f13785a.f13175m;
        if (onKeyListener != null) {
            dialogInterfaceC0155eg.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC0155eg;
    }

    /* JADX INFO: renamed from: c */
    public final DialogInterfaceC0155eg m7257c() {
        DialogInterfaceC0155eg dialogInterfaceC0155egMo7256b = mo7256b();
        dialogInterfaceC0155egMo7256b.show();
        return dialogInterfaceC0155egMo7256b;
    }

    /* JADX INFO: renamed from: d */
    public final void m7258d(Drawable drawable) {
        this.f13785a.f13165c = drawable;
    }

    /* JADX INFO: renamed from: e */
    public final void m7259e(CharSequence charSequence) {
        this.f13785a.f13168f = charSequence;
    }

    /* JADX INFO: renamed from: f */
    public final void m7260f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0150eb c0150eb = this.f13785a;
        c0150eb.f13171i = charSequence;
        c0150eb.f13172j = onClickListener;
    }

    /* JADX INFO: renamed from: g */
    public final void m7261g(DialogInterface.OnKeyListener onKeyListener) {
        this.f13785a.f13175m = onKeyListener;
    }

    /* JADX INFO: renamed from: h */
    public final void m7262h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0150eb c0150eb = this.f13785a;
        c0150eb.f13169g = charSequence;
        c0150eb.f13170h = onClickListener;
    }

    /* JADX INFO: renamed from: i */
    public final void m7263i(CharSequence charSequence) {
        this.f13785a.f13166d = charSequence;
    }

    /* JADX INFO: renamed from: j */
    public final void m7264j(View view) {
        C0150eb c0150eb = this.f13785a;
        c0150eb.f13180r = view;
        c0150eb.f13179q = 0;
    }

    public C0154ef(Context context, int i) {
        this.f13785a = new C0150eb(new ContextThemeWrapper(context, DialogInterfaceC0155eg.m7290a(context, i)));
        this.f13786b = i;
    }
}
