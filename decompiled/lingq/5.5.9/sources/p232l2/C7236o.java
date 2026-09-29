package p232l2;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.linguist.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7236o {

    /* JADX INFO: renamed from: a */
    public final Context f40641a;

    /* JADX INFO: renamed from: e */
    public CharSequence f40645e;

    /* JADX INFO: renamed from: f */
    public CharSequence f40646f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f40647g;

    /* JADX INFO: renamed from: h */
    public Bitmap f40648h;

    /* JADX INFO: renamed from: i */
    public int f40649i;

    /* JADX INFO: renamed from: j */
    public int f40650j;

    /* JADX INFO: renamed from: l */
    public AbstractC7237p f40652l;

    /* JADX INFO: renamed from: m */
    public CharSequence f40653m;

    /* JADX INFO: renamed from: o */
    public boolean f40655o;

    /* JADX INFO: renamed from: p */
    public boolean f40656p;

    /* JADX INFO: renamed from: q */
    public Bundle f40657q;

    /* JADX INFO: renamed from: t */
    public String f40660t;

    /* JADX INFO: renamed from: w */
    public final boolean f40663w;

    /* JADX INFO: renamed from: x */
    public final Notification f40664x;

    /* JADX INFO: renamed from: y */
    @Deprecated
    public final ArrayList<String> f40665y;

    /* JADX INFO: renamed from: b */
    public final ArrayList<C7233l> f40642b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<C7242u> f40643c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<C7233l> f40644d = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public boolean f40651k = true;

    /* JADX INFO: renamed from: n */
    public boolean f40654n = false;

    /* JADX INFO: renamed from: r */
    public int f40658r = 0;

    /* JADX INFO: renamed from: s */
    public int f40659s = 0;

    /* JADX INFO: renamed from: u */
    public int f40661u = 0;

    /* JADX INFO: renamed from: v */
    public int f40662v = 0;

    public C7236o(Context context, String str) {
        Notification notification = new Notification();
        this.f40664x = notification;
        this.f40641a = context;
        this.f40660t = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f40650j = 0;
        this.f40665y = new ArrayList<>();
        this.f40663w = true;
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m14576c(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    /* JADX INFO: renamed from: a */
    public final void m14577a(C7233l c7233l) {
        this.f40642b.add(c7233l);
    }

    /* JADX INFO: renamed from: b */
    public final Notification m14578b() {
        Bundle bundle;
        C7238q c7238q = new C7238q(this);
        C7236o c7236o = c7238q.f40671c;
        AbstractC7237p abstractC7237p = c7236o.f40652l;
        if (abstractC7237p != null) {
            abstractC7237p.mo60b(c7238q);
        }
        if (abstractC7237p != null) {
            abstractC7237p.mo62e();
        }
        Notification notificationBuild = c7238q.f40670b.build();
        if (abstractC7237p != null) {
            abstractC7237p.mo61d();
        }
        if (abstractC7237p != null) {
            c7236o.f40652l.getClass();
        }
        if (abstractC7237p != null && (bundle = notificationBuild.extras) != null) {
            abstractC7237p.mo14575a(bundle);
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: d */
    public final void m14579d(String str) {
        this.f40645e = m14576c(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m14580e(int i10, boolean z10) {
        Notification notification = this.f40664x;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14581f(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f40641a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
            }
        }
        this.f40648h = bitmap;
    }

    /* JADX INFO: renamed from: g */
    public final void m14582g(Uri uri) {
        Notification notification = this.f40664x;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    /* JADX INFO: renamed from: h */
    public final void m14583h(AbstractC7237p abstractC7237p) {
        if (this.f40652l != abstractC7237p) {
            this.f40652l = abstractC7237p;
            if (abstractC7237p != null) {
                abstractC7237p.m14584f(this);
            }
        }
    }
}
