package p000;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yq */
/* JADX INFO: loaded from: classes.dex */
public final class C3805yq extends AbstractC3584sr {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f70280s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f70281t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ WeakReference f70282u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C2937dr f70283v;

    public C3805yq(C2937dr c2937dr, int i, int i2, WeakReference weakReference) {
        this.f70283v = c2937dr;
        this.f70280s = i;
        this.f70281t = i2;
        this.f70282u = weakReference;
    }

    @Override // p000.AbstractC3584sr
    /* JADX INFO: renamed from: Q */
    public final void mo21648Q(int i) {
    }

    @Override // p000.AbstractC3584sr
    /* JADX INFO: renamed from: R */
    public final void mo21649R(Typeface typeface) {
        int i = this.f70280s;
        if (i != -1) {
            typeface = AbstractC2894cr.m9854a(typeface, i, (this.f70281t & 2) != 0);
        }
        C2937dr c2937dr = this.f70283v;
        if (c2937dr.f36073m) {
            c2937dr.f36072l = typeface;
            TextView textView = (TextView) this.f70282u.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = c2937dr.f36070j;
                if (zIsAttachedToWindow) {
                    textView.post(new RunnableC3842zq(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }
}
