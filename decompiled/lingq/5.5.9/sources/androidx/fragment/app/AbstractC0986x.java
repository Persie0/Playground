package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v4.media.AbstractC0140a;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0986x<E> extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public final Activity f6428a;

    /* JADX INFO: renamed from: b */
    public final Context f6429b;

    /* JADX INFO: renamed from: c */
    public final Handler f6430c;

    /* JADX INFO: renamed from: d */
    public final C0949e0 f6431d;

    public AbstractC0986x(ActivityC0979t activityC0979t) {
        Handler handler = new Handler();
        this.f6431d = new C0949e0();
        this.f6428a = activityC0979t;
        if (activityC0979t == null) {
            throw new NullPointerException("context == null");
        }
        this.f6429b = activityC0979t;
        this.f6430c = handler;
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo3807k0(PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: l0 */
    public abstract ActivityC0979t mo3808l0();

    /* JADX INFO: renamed from: m0 */
    public abstract LayoutInflater mo3809m0();

    /* JADX INFO: renamed from: n0 */
    public abstract boolean mo3810n0(String str);

    /* JADX INFO: renamed from: o0 */
    public abstract void mo3811o0();
}
