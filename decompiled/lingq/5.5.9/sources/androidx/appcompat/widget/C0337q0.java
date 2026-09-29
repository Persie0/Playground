package androidx.appcompat.widget;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0227i;
import com.linguist.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0337q0 {

    /* JADX INFO: renamed from: a */
    public final C0224f f1316a;

    /* JADX INFO: renamed from: b */
    public final C0227i f1317b;

    /* JADX INFO: renamed from: c */
    public a f1318c;

    /* JADX INFO: renamed from: androidx.appcompat.widget.q0$a */
    public interface a {
    }

    public C0337q0(Context context, TextView textView) {
        C0224f c0224f = new C0224f(context);
        this.f1316a = c0224f;
        c0224f.f697e = new C0333o0(this);
        C0227i c0227i = new C0227i(R.attr.popupMenuStyle, 0, context, textView, c0224f, false);
        this.f1317b = c0227i;
        c0227i.f756g = 0;
        c0227i.f760k = new C0335p0(this);
    }
}
