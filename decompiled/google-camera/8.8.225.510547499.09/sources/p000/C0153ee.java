package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: ee */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0153ee {

    /* JADX INFO: renamed from: A */
    public final int f13549A;

    /* JADX INFO: renamed from: B */
    public final int f13550B;

    /* JADX INFO: renamed from: C */
    final int f13551C;

    /* JADX INFO: renamed from: D */
    final int f13552D;

    /* JADX INFO: renamed from: E */
    final int f13553E;

    /* JADX INFO: renamed from: F */
    final int f13554F;

    /* JADX INFO: renamed from: G */
    public final boolean f13555G;

    /* JADX INFO: renamed from: H */
    public final Handler f13556H;

    /* JADX INFO: renamed from: a */
    public final Context f13558a;

    /* JADX INFO: renamed from: b */
    public final DialogC0181ff f13559b;

    /* JADX INFO: renamed from: c */
    public final Window f13560c;

    /* JADX INFO: renamed from: d */
    public CharSequence f13561d;

    /* JADX INFO: renamed from: e */
    public CharSequence f13562e;

    /* JADX INFO: renamed from: f */
    public ListView f13563f;

    /* JADX INFO: renamed from: g */
    public View f13564g;

    /* JADX INFO: renamed from: h */
    public int f13565h;

    /* JADX INFO: renamed from: j */
    public Button f13567j;

    /* JADX INFO: renamed from: k */
    public CharSequence f13568k;

    /* JADX INFO: renamed from: l */
    public Message f13569l;

    /* JADX INFO: renamed from: m */
    public Button f13570m;

    /* JADX INFO: renamed from: n */
    public CharSequence f13571n;

    /* JADX INFO: renamed from: o */
    public Message f13572o;

    /* JADX INFO: renamed from: p */
    public Button f13573p;

    /* JADX INFO: renamed from: q */
    public CharSequence f13574q;

    /* JADX INFO: renamed from: r */
    NestedScrollView f13575r;

    /* JADX INFO: renamed from: t */
    public Drawable f13577t;

    /* JADX INFO: renamed from: u */
    public ImageView f13578u;

    /* JADX INFO: renamed from: v */
    public TextView f13579v;

    /* JADX INFO: renamed from: w */
    public TextView f13580w;

    /* JADX INFO: renamed from: x */
    public View f13581x;

    /* JADX INFO: renamed from: y */
    ListAdapter f13582y;

    /* JADX INFO: renamed from: i */
    public boolean f13566i = false;

    /* JADX INFO: renamed from: s */
    public int f13576s = 0;

    /* JADX INFO: renamed from: z */
    int f13583z = -1;

    /* JADX INFO: renamed from: I */
    public final View.OnClickListener f13557I = new ViewOnClickListenerC0250hu(this, 1);

    public C0153ee(Context context, DialogC0181ff dialogC0181ff, Window window) {
        this.f13558a = context;
        this.f13559b = dialogC0181ff;
        this.f13560c = window;
        this.f13556H = new HandlerC0151ec(dialogC0181ff);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0193fr.f23261e, C0100R.attr.alertDialogStyle, 0);
        this.f13549A = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f13550B = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f13551C = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f13552D = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f13553E = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f13554F = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f13555G = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0181ff.m8323d();
    }

    /* JADX INFO: renamed from: b */
    static boolean m7197b(View view) {
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
            if (m7197b(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final void m7198c(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public static final ViewGroup m7199d(View view, View view2) {
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

    /* JADX INFO: renamed from: a */
    public final void m7200a(CharSequence charSequence) {
        this.f13561d = charSequence;
        TextView textView = this.f13579v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7201e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f13556H.obtainMessage(i, onClickListener) : null;
        switch (i) {
            case -2:
                this.f13571n = charSequence;
                this.f13572o = messageObtainMessage;
                break;
            default:
                this.f13568k = charSequence;
                this.f13569l = messageObtainMessage;
                break;
        }
    }
}
