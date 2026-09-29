package p408u6;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0979t;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.inbox.C2246a;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.google.android.exoplayer2.ExoPlayer;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import p286o2.C7906f;

/* JADX INFO: renamed from: u6.f */
/* JADX INFO: loaded from: classes.dex */
public class C9467f extends RecyclerView.AbstractC1109b0 {

    /* JADX INFO: renamed from: A */
    public RelativeLayout f48521A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f48522B;

    /* JADX INFO: renamed from: C */
    public RelativeLayout f48523C;

    /* JADX INFO: renamed from: D */
    public CTInboxMessageContent f48524D;

    /* JADX INFO: renamed from: E */
    public CTInboxMessage f48525E;

    /* JADX INFO: renamed from: F */
    public ImageView f48526F;

    /* JADX INFO: renamed from: G */
    public WeakReference<C2246a> f48527G;

    /* JADX INFO: renamed from: H */
    public boolean f48528H;

    /* JADX INFO: renamed from: I */
    public final ImageView f48529I;

    /* JADX INFO: renamed from: u */
    public Context f48530u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f48531v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f48532w;

    /* JADX INFO: renamed from: x */
    public FrameLayout f48533x;

    /* JADX INFO: renamed from: y */
    public ImageView f48534y;

    /* JADX INFO: renamed from: z */
    public ImageView f48535z;

    /* JADX INFO: renamed from: u6.f$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f48536a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CTInboxMessage f48537b;

        /* JADX INFO: renamed from: u6.f$a$a, reason: collision with other inner class name */
        public class RunnableC10672a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C2246a f48539a;

            public RunnableC10672a(C2246a c2246a) {
                this.f48539a = c2246a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2246a.b bVar;
                a aVar = a.this;
                if (C9467f.this.f48529I.getVisibility() == 0) {
                    C2246a c2246a = this.f48539a;
                    c2246a.getClass();
                    try {
                        bVar = c2246a.f11304E0.get();
                    } catch (Throwable unused) {
                        bVar = null;
                    }
                    if (bVar == null) {
                        C2181a.m6455h("InboxListener is null for messages");
                    }
                    if (bVar != null) {
                        StringBuilder sb2 = new StringBuilder("CTInboxListViewFragment:didShow() called with: data = [null], position = [");
                        int i10 = aVar.f48536a;
                        sb2.append(i10);
                        sb2.append("]");
                        C2181a.m6455h(sb2.toString());
                        c2246a.m3582e().getBaseContext();
                        bVar.mo6539a(c2246a.f11309x0.get(i10));
                    }
                }
                C9467f.this.f48529I.setVisibility(8);
                aVar.f48537b.f11286k = true;
            }
        }

        public a(int i10, CTInboxMessage cTInboxMessage) {
            this.f48536a = i10;
            this.f48537b = cTInboxMessage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityC0979t activityC0979tM3582e;
            C2246a c2246a = C9467f.this.f48527G.get();
            if (c2246a != null && (activityC0979tM3582e = c2246a.m3582e()) != null) {
                activityC0979tM3582e.runOnUiThread(new RunnableC10672a(c2246a));
            }
        }
    }

    public C9467f(View view) {
        super(view);
        this.f48529I = (ImageView) view.findViewById(R.id.read_circle);
    }

    /* JADX INFO: renamed from: s */
    public static String m17880s(long j10) {
        StringBuilder sb2;
        String str;
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - j10;
        if (jCurrentTimeMillis < 60) {
            return "Just Now";
        }
        if (jCurrentTimeMillis > 60 && jCurrentTimeMillis < 3540) {
            return (jCurrentTimeMillis / 60) + " mins ago";
        }
        if (jCurrentTimeMillis <= 3540 || jCurrentTimeMillis >= 81420) {
            return (jCurrentTimeMillis <= 86400 || jCurrentTimeMillis >= 172800) ? new SimpleDateFormat("dd MMM").format(new Date(j10 * 1000)) : "Yesterday";
        }
        long j11 = jCurrentTimeMillis / 3600;
        if (j11 > 1) {
            sb2 = new StringBuilder();
            sb2.append(j11);
            str = " hours ago";
        } else {
            sb2 = new StringBuilder();
            sb2.append(j11);
            str = " hour ago";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public static void m17881u(Button button, Button button2, Button button3) {
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    /* JADX INFO: renamed from: v */
    public static void m17882v(Button button, Button button2, Button button3) {
        button2.setVisibility(8);
        button3.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 6.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
        button3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    /* JADX INFO: renamed from: x */
    public static void m17883x(ImageView[] imageViewArr, int i10, Context context, LinearLayout linearLayout) {
        for (int i11 = 0; i11 < i10; i11++) {
            ImageView imageView = new ImageView(context);
            imageViewArr[i11] = imageView;
            imageView.setVisibility(0);
            ImageView imageView2 = imageViewArr[i11];
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
            imageView2.setImageDrawable(C7906f.a.m15676a(resources, R.drawable.ct_unselected_dot, null));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(8, 6, 4, 6);
            layoutParams.gravity = 17;
            if (linearLayout.getChildCount() < i10) {
                linearLayout.addView(imageViewArr[i11], layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo17876t(CTInboxMessage cTInboxMessage, C2246a c2246a, int i10) {
        this.f48530u = c2246a.mo471m();
        this.f48527G = new WeakReference<>(c2246a);
        this.f48525E = cTInboxMessage;
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.f11285j.get(0);
        this.f48524D = cTInboxMessageContent;
        this.f48528H = cTInboxMessageContent.m6550j() || this.f48524D.m6553n();
    }

    /* JADX INFO: renamed from: w */
    public final void m17884w(CTInboxMessage cTInboxMessage, int i10) {
        new Handler().postDelayed(new a(i10, cTInboxMessage), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }
}
