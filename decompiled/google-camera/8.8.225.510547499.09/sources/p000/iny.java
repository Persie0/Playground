package p000;

import android.app.Activity;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iny implements inx {

    /* JADX INFO: renamed from: a */
    public final Object f31619a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31620b;

    public iny(Activity activity, int i) {
        this.f31620b = i;
        this.f31619a = activity;
    }

    public iny(View view, int i) {
        this.f31620b = i;
        this.f31619a = view;
    }

    @Override // p000.inx
    /* JADX INFO: renamed from: a */
    public final View mo11550a(int i) {
        switch (this.f31620b) {
            case 0:
                return ((View) this.f31619a).findViewById(i);
            default:
                return ((Activity) this.f31619a).findViewById(i);
        }
    }
}
