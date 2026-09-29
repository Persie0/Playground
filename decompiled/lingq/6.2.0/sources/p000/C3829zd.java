package p000;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: zd */
/* JADX INFO: loaded from: classes2.dex */
public class C3829zd {

    /* JADX INFO: renamed from: a */
    public final C3681vd f71376a;

    /* JADX INFO: renamed from: b */
    public final int f71377b;

    public C3829zd(Context context, int i) {
        this.f71376a = new C3681vd(new ContextThemeWrapper(context, DialogInterfaceC0016ae.m290h(context, i)));
        this.f71377b = i;
    }

    /* JADX INFO: renamed from: a */
    public final DialogInterfaceC0016ae m25557a() {
        DialogInterfaceC0016ae dialogInterfaceC0016aeCreate = create();
        dialogInterfaceC0016aeCreate.show();
        return dialogInterfaceC0016aeCreate;
    }

    public DialogInterfaceC0016ae create() {
        C3681vd c3681vd = this.f71376a;
        DialogInterfaceC0016ae dialogInterfaceC0016ae = new DialogInterfaceC0016ae(c3681vd.f65203a, this.f71377b);
        View view = c3681vd.f65208f;
        C3792yd c3792yd = dialogInterfaceC0016ae.f530g;
        int i = 0;
        if (view != null) {
            c3792yd.f69669x = view;
        } else {
            CharSequence charSequence = c3681vd.f65207e;
            if (charSequence != null) {
                c3792yd.f69649d = charSequence;
                TextView textView = c3792yd.f69667v;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c3681vd.f65206d;
            if (drawable != null) {
                c3792yd.f69665t = drawable;
                c3792yd.f69664s = 0;
                ImageView imageView = c3792yd.f69666u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c3792yd.f69666u.setImageDrawable(drawable);
                }
            }
            int i2 = c3681vd.f65205c;
            if (i2 != 0) {
                c3792yd.f69665t = null;
                c3792yd.f69664s = i2;
                ImageView imageView2 = c3792yd.f69666u;
                if (imageView2 != null) {
                    if (i2 != 0) {
                        imageView2.setVisibility(0);
                        c3792yd.f69666u.setImageResource(c3792yd.f69664s);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = c3681vd.f65209g;
        if (charSequence2 != null) {
            c3792yd.f69650e = charSequence2;
            TextView textView2 = c3792yd.f69668w;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c3681vd.f65210h;
        if (charSequence3 != null) {
            c3792yd.m25075c(-1, charSequence3, c3681vd.f65211i);
        }
        CharSequence charSequence4 = c3681vd.f65212j;
        if (charSequence4 != null) {
            c3792yd.m25075c(-2, charSequence4, c3681vd.f65213k);
        }
        CharSequence charSequence5 = c3681vd.f65214l;
        if (charSequence5 != null) {
            c3792yd.m25075c(-3, charSequence5, c3681vd.f65215m);
        }
        if (c3681vd.f65219q != null || c3681vd.f65220r != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c3681vd.f65204b.inflate(c3792yd.f69640B, (ViewGroup) null);
            int i3 = c3681vd.f65223u ? c3792yd.f69641C : c3792yd.f69642D;
            ListAdapter c3755xd = c3681vd.f65220r;
            if (c3755xd == null) {
                c3755xd = new C3755xd(c3681vd.f65203a, i3, R.id.text1, c3681vd.f65219q);
            }
            c3792yd.f69670y = c3755xd;
            c3792yd.f69671z = c3681vd.f65224v;
            if (c3681vd.f65221s != null) {
                alertController$RecycleListView.setOnItemClickListener(new C3644ud(i, c3681vd, c3792yd));
            }
            if (c3681vd.f65223u) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c3792yd.f69651f = alertController$RecycleListView;
        }
        View view2 = c3681vd.f65222t;
        if (view2 != null) {
            c3792yd.f69652g = view2;
            c3792yd.f69653h = false;
        }
        dialogInterfaceC0016ae.setCancelable(c3681vd.f65216n);
        if (c3681vd.f65216n) {
            dialogInterfaceC0016ae.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC0016ae.setOnCancelListener(null);
        dialogInterfaceC0016ae.setOnDismissListener(c3681vd.f65217o);
        jw5 jw5Var = c3681vd.f65218p;
        if (jw5Var != null) {
            dialogInterfaceC0016ae.setOnKeyListener(jw5Var);
        }
        return dialogInterfaceC0016ae;
    }

    public Context getContext() {
        return this.f71376a.f65203a;
    }

    public C3829zd setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C3681vd c3681vd = this.f71376a;
        c3681vd.f65212j = c3681vd.f65203a.getText(i);
        c3681vd.f65213k = onClickListener;
        return this;
    }

    public C3829zd setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C3681vd c3681vd = this.f71376a;
        c3681vd.f65210h = c3681vd.f65203a.getText(i);
        c3681vd.f65211i = onClickListener;
        return this;
    }

    public C3829zd setTitle(CharSequence charSequence) {
        this.f71376a.f65207e = charSequence;
        return this;
    }

    public C3829zd setView(View view) {
        this.f71376a.f65222t = view;
        return this;
    }

    public C3829zd(Context context) {
        this(context, DialogInterfaceC0016ae.m290h(context, 0));
    }
}
