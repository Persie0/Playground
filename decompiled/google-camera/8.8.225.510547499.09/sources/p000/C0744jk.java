package p000;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: jk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0744jk extends acl {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f34218a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f34219b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ WeakReference f34220c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C0749jp f34221d;

    public C0744jk(C0749jp c0749jp, int i, int i2, WeakReference weakReference) {
        this.f34221d = c0749jp;
        this.f34218a = i;
        this.f34219b = i2;
        this.f34220c = weakReference;
    }

    @Override // p000.acl
    /* JADX INFO: renamed from: a */
    public final void mo198a(Typeface typeface) {
        int i = this.f34218a;
        if (i != -1) {
            typeface = C0748jo.m13399a(typeface, i, (this.f34219b & 2) != 0);
        }
        C0749jp c0749jp = this.f34221d;
        WeakReference weakReference = this.f34220c;
        if (c0749jp.f34511c) {
            c0749jp.f34510b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (afe.m461e(textView)) {
                    textView.post(new RunnableC0904pi(textView, typeface, c0749jp.f34509a, 1));
                } else {
                    textView.setTypeface(typeface, c0749jp.f34509a);
                }
            }
        }
    }

    @Override // p000.acl
    /* JADX INFO: renamed from: b */
    public final void mo199b() {
    }
}
