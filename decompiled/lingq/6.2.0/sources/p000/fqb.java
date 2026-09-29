package p000;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fqb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f39497a = new C0282a(-930433113, false, new nd1(25));

    /* JADX INFO: renamed from: b */
    public static final C0282a f39498b = new C0282a(1034546527, false, new od1(11));

    /* JADX INFO: renamed from: c */
    public static final C0282a f39499c = new C0282a(-1514648974, false, new od1(12));

    /* JADX INFO: renamed from: a */
    public static boolean m11999a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
