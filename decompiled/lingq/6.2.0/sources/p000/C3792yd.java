package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yd */
/* JADX INFO: loaded from: classes2.dex */
public final class C3792yd {

    /* JADX INFO: renamed from: A */
    public final int f69639A;

    /* JADX INFO: renamed from: B */
    public final int f69640B;

    /* JADX INFO: renamed from: C */
    public final int f69641C;

    /* JADX INFO: renamed from: D */
    public final int f69642D;

    /* JADX INFO: renamed from: E */
    public final boolean f69643E;

    /* JADX INFO: renamed from: F */
    public final HandlerC3718wd f69644F;

    /* JADX INFO: renamed from: a */
    public final Context f69646a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0016ae f69647b;

    /* JADX INFO: renamed from: c */
    public final Window f69648c;

    /* JADX INFO: renamed from: d */
    public CharSequence f69649d;

    /* JADX INFO: renamed from: e */
    public CharSequence f69650e;

    /* JADX INFO: renamed from: f */
    public AlertController$RecycleListView f69651f;

    /* JADX INFO: renamed from: g */
    public View f69652g;

    /* JADX INFO: renamed from: i */
    public Button f69654i;

    /* JADX INFO: renamed from: j */
    public CharSequence f69655j;

    /* JADX INFO: renamed from: k */
    public Message f69656k;

    /* JADX INFO: renamed from: l */
    public Button f69657l;

    /* JADX INFO: renamed from: m */
    public CharSequence f69658m;

    /* JADX INFO: renamed from: n */
    public Message f69659n;

    /* JADX INFO: renamed from: o */
    public Button f69660o;

    /* JADX INFO: renamed from: p */
    public CharSequence f69661p;

    /* JADX INFO: renamed from: q */
    public Message f69662q;

    /* JADX INFO: renamed from: r */
    public NestedScrollView f69663r;

    /* JADX INFO: renamed from: t */
    public Drawable f69665t;

    /* JADX INFO: renamed from: u */
    public ImageView f69666u;

    /* JADX INFO: renamed from: v */
    public TextView f69667v;

    /* JADX INFO: renamed from: w */
    public TextView f69668w;

    /* JADX INFO: renamed from: x */
    public View f69669x;

    /* JADX INFO: renamed from: y */
    public ListAdapter f69670y;

    /* JADX INFO: renamed from: h */
    public boolean f69653h = false;

    /* JADX INFO: renamed from: s */
    public int f69664s = 0;

    /* JADX INFO: renamed from: z */
    public int f69671z = -1;

    /* JADX INFO: renamed from: G */
    public final ViewOnClickListenerC3135j5 f69645G = new ViewOnClickListenerC3135j5(this, 1);

    public C3792yd(Context context, DialogInterfaceC0016ae dialogInterfaceC0016ae, Window window) {
        this.f69646a = context;
        this.f69647b = dialogInterfaceC0016ae;
        this.f69648c = window;
        HandlerC3718wd handlerC3718wd = new HandlerC3718wd();
        handlerC3718wd.f66633b = new WeakReference(dialogInterfaceC0016ae);
        this.f69644F = handlerC3718wd;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.AlertDialog, R$attr.alertDialogStyle, 0);
        this.f69639A = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f69640B = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f69641C = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f69642D = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listItemLayout, 0);
        this.f69643E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AlertDialog_showTitle, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0016ae.m2975f().mo16970g(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m25073a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m25073a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ViewGroup m25074b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: c */
    public final void m25075c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f69644F.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f69661p = charSequence;
            this.f69662q = messageObtainMessage;
        } else if (i == -2) {
            this.f69658m = charSequence;
            this.f69659n = messageObtainMessage;
        } else if (i != -1) {
            C3386nv.m17626m("Button does not exist");
        } else {
            this.f69655j = charSequence;
            this.f69656k = messageObtainMessage;
        }
    }
}
