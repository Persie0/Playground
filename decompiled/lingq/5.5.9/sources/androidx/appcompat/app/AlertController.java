package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p058d.C4999a;
import p080e.DialogC5282n;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {

    /* JADX INFO: renamed from: A */
    public TextView f533A;

    /* JADX INFO: renamed from: B */
    public TextView f534B;

    /* JADX INFO: renamed from: C */
    public View f535C;

    /* JADX INFO: renamed from: D */
    public ListAdapter f536D;

    /* JADX INFO: renamed from: F */
    public final int f538F;

    /* JADX INFO: renamed from: G */
    public final int f539G;

    /* JADX INFO: renamed from: H */
    public final int f540H;

    /* JADX INFO: renamed from: I */
    public final int f541I;

    /* JADX INFO: renamed from: J */
    public final boolean f542J;

    /* JADX INFO: renamed from: K */
    public final HandlerC0212c f543K;

    /* JADX INFO: renamed from: a */
    public final Context f545a;

    /* JADX INFO: renamed from: b */
    public final DialogC5282n f546b;

    /* JADX INFO: renamed from: c */
    public final Window f547c;

    /* JADX INFO: renamed from: d */
    public final int f548d;

    /* JADX INFO: renamed from: e */
    public CharSequence f549e;

    /* JADX INFO: renamed from: f */
    public CharSequence f550f;

    /* JADX INFO: renamed from: g */
    public RecycleListView f551g;

    /* JADX INFO: renamed from: h */
    public View f552h;

    /* JADX INFO: renamed from: i */
    public int f553i;

    /* JADX INFO: renamed from: k */
    public Button f555k;

    /* JADX INFO: renamed from: l */
    public CharSequence f556l;

    /* JADX INFO: renamed from: m */
    public Message f557m;

    /* JADX INFO: renamed from: n */
    public Drawable f558n;

    /* JADX INFO: renamed from: o */
    public Button f559o;

    /* JADX INFO: renamed from: p */
    public CharSequence f560p;

    /* JADX INFO: renamed from: q */
    public Message f561q;

    /* JADX INFO: renamed from: r */
    public Drawable f562r;

    /* JADX INFO: renamed from: s */
    public Button f563s;

    /* JADX INFO: renamed from: t */
    public CharSequence f564t;

    /* JADX INFO: renamed from: u */
    public Message f565u;

    /* JADX INFO: renamed from: v */
    public Drawable f566v;

    /* JADX INFO: renamed from: w */
    public NestedScrollView f567w;

    /* JADX INFO: renamed from: y */
    public Drawable f569y;

    /* JADX INFO: renamed from: z */
    public ImageView f570z;

    /* JADX INFO: renamed from: j */
    public boolean f554j = false;

    /* JADX INFO: renamed from: x */
    public int f568x = 0;

    /* JADX INFO: renamed from: E */
    public int f537E = -1;

    /* JADX INFO: renamed from: L */
    public final ViewOnClickListenerC0210a f544L = new ViewOnClickListenerC0210a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a */
        public final int f571a;

        /* JADX INFO: renamed from: b */
        public final int f572b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4999a.f32606t);
            this.f572b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f571a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC0210a implements View.OnClickListener {
        public ViewOnClickListenerC0210a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f555k && (message3 = alertController.f557m) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f559o || (message2 = alertController.f561q) == null) {
                messageObtain = (view != alertController.f563s || (message = alertController.f565u) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            alertController.f543K.obtainMessage(1, alertController.f546b).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0211b {

        /* JADX INFO: renamed from: a */
        public final Context f574a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f575b;

        /* JADX INFO: renamed from: c */
        public Drawable f576c;

        /* JADX INFO: renamed from: d */
        public CharSequence f577d;

        /* JADX INFO: renamed from: e */
        public View f578e;

        /* JADX INFO: renamed from: f */
        public CharSequence f579f;

        /* JADX INFO: renamed from: g */
        public CharSequence f580g;

        /* JADX INFO: renamed from: h */
        public DialogInterface.OnClickListener f581h;

        /* JADX INFO: renamed from: i */
        public CharSequence f582i;

        /* JADX INFO: renamed from: j */
        public DialogInterface.OnClickListener f583j;

        /* JADX INFO: renamed from: k */
        public CharSequence f584k;

        /* JADX INFO: renamed from: l */
        public DialogInterface.OnClickListener f585l;

        /* JADX INFO: renamed from: n */
        public DialogInterface.OnDismissListener f587n;

        /* JADX INFO: renamed from: o */
        public DialogInterface.OnKeyListener f588o;

        /* JADX INFO: renamed from: p */
        public CharSequence[] f589p;

        /* JADX INFO: renamed from: q */
        public ListAdapter f590q;

        /* JADX INFO: renamed from: r */
        public DialogInterface.OnClickListener f591r;

        /* JADX INFO: renamed from: s */
        public View f592s;

        /* JADX INFO: renamed from: t */
        public boolean f593t;

        /* JADX INFO: renamed from: u */
        public int f594u = -1;

        /* JADX INFO: renamed from: m */
        public boolean f586m = true;

        public C0211b(ContextThemeWrapper contextThemeWrapper) {
            this.f574a = contextThemeWrapper;
            this.f575b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC0212c extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<DialogInterface> f595a;

        public HandlerC0212c(DialogInterface dialogInterface) {
            this.f595a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f595a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0213d extends ArrayAdapter<CharSequence> {
        public C0213d(Context context, int i10, CharSequence[] charSequenceArr) {
            super(context, i10, R.id.text1, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC5282n dialogC5282n, Window window) {
        this.f545a = context;
        this.f546b = dialogC5282n;
        this.f547c = window;
        this.f543K = new HandlerC0212c(dialogC5282n);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C4999a.f32591e, com.linguist.R.attr.alertDialogStyle, 0);
        this.f538F = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f539G = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f540H = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f541I = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f542J = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f548d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC5282n.m11394d().mo11344t(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m871a(View view) {
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
            if (m871a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m872b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public static ViewGroup m873c(View view, View view2) {
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

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m874d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f543K.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f564t = charSequence;
            this.f565u = messageObtainMessage;
            this.f566v = null;
        } else if (i10 == -2) {
            this.f560p = charSequence;
            this.f561q = messageObtainMessage;
            this.f562r = null;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f556l = charSequence;
            this.f557m = messageObtainMessage;
            this.f558n = null;
        }
    }
}
