package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class vm6 {

    /* JADX INFO: renamed from: a */
    public final Context f65581a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f65582b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f65583c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f65584d;

    /* JADX INFO: renamed from: e */
    public CharSequence f65585e;

    /* JADX INFO: renamed from: f */
    public CharSequence f65586f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f65587g;

    /* JADX INFO: renamed from: h */
    public IconCompat f65588h;

    /* JADX INFO: renamed from: i */
    public int f65589i;

    /* JADX INFO: renamed from: j */
    public int f65590j;

    /* JADX INFO: renamed from: k */
    public boolean f65591k;

    /* JADX INFO: renamed from: l */
    public xm6 f65592l;

    /* JADX INFO: renamed from: m */
    public boolean f65593m;

    /* JADX INFO: renamed from: n */
    public Bundle f65594n;

    /* JADX INFO: renamed from: o */
    public int f65595o;

    /* JADX INFO: renamed from: p */
    public int f65596p;

    /* JADX INFO: renamed from: q */
    public String f65597q;

    /* JADX INFO: renamed from: r */
    public int f65598r;

    /* JADX INFO: renamed from: s */
    public final boolean f65599s;

    /* JADX INFO: renamed from: t */
    public final Notification f65600t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f65601u;

    public vm6(Context context, String str) {
        this.f65582b = new ArrayList();
        this.f65583c = new ArrayList();
        this.f65584d = new ArrayList();
        this.f65591k = true;
        this.f65593m = false;
        this.f65595o = 0;
        this.f65596p = 0;
        this.f65598r = 0;
        Notification notification = new Notification();
        this.f65600t = notification;
        this.f65581a = context;
        this.f65597q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f65590j = 0;
        this.f65601u = new ArrayList();
        this.f65599s = true;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m23410d(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final void m23411a(int i, PendingIntent pendingIntent, String str) {
        this.f65582b.add(new pm6(i, str, pendingIntent));
    }

    /* JADX INFO: renamed from: b */
    public final void m23412b(pm6 pm6Var) {
        this.f65582b.add(pm6Var);
    }

    /* JADX INFO: renamed from: c */
    public Notification mo15108c() {
        Bundle bundle;
        C3329mb c3329mb = new C3329mb(this);
        vm6 vm6Var = (vm6) c3329mb.f50862d;
        xm6 xm6Var = vm6Var.f65592l;
        if (xm6Var != null) {
            xm6Var.mo22233a(c3329mb);
        }
        Notification notificationBuild = ((Notification.Builder) c3329mb.f50861c).build();
        if (xm6Var != null) {
            vm6Var.f65592l.getClass();
        }
        if (xm6Var != null && (bundle = notificationBuild.extras) != null) {
            if (xm6Var.f68351c) {
                bundle.putCharSequence("android.summaryText", xm6Var.f68350b);
            }
            String strMo22234b = xm6Var.mo22234b();
            if (strMo22234b != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo22234b);
            }
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: e */
    public final void m23413e(boolean z) {
        m23418j(16, z);
    }

    /* JADX INFO: renamed from: f */
    public final void m23414f() {
        this.f65597q = "com.google.android.gms.availability";
    }

    /* JADX INFO: renamed from: g */
    public final void m23415g(PendingIntent pendingIntent) {
        this.f65587g = pendingIntent;
    }

    /* JADX INFO: renamed from: h */
    public final void m23416h(String str) {
        this.f65586f = m23410d(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m23417i(String str) {
        this.f65585e = m23410d(str);
    }

    /* JADX INFO: renamed from: j */
    public final void m23418j(int i, boolean z) {
        Notification notification = this.f65600t;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m23419k() {
        this.f65593m = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m23420l() {
        this.f65590j = 2;
    }

    /* JADX INFO: renamed from: m */
    public final void m23421m(int i) {
        this.f65600t.icon = i;
    }

    /* JADX INFO: renamed from: n */
    public final void m23422n(Uri uri) {
        Notification notification = this.f65600t;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    /* JADX INFO: renamed from: o */
    public final void m23423o(xm6 xm6Var) {
        if (this.f65592l != xm6Var) {
            this.f65592l = xm6Var;
            if (xm6Var.f68349a != this) {
                xm6Var.f68349a = this;
                m23423o(xm6Var);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m23424p(String str) {
        this.f65600t.tickerText = m23410d(str);
    }

    /* JADX INFO: renamed from: q */
    public final void m23425q(long j) {
        this.f65600t.when = j;
    }

    public vm6(Context context) {
        this(context, null);
    }
}
