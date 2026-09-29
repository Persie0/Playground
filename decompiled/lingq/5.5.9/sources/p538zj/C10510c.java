package p538zj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.linguist.R;
import dm.C5207g;
import ph.C8367u2;

/* JADX INFO: renamed from: zj.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10510c extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f52466d = 0;

    /* JADX INFO: renamed from: a */
    public final C8367u2 f52467a;

    /* JADX INFO: renamed from: b */
    public C10509b f52468b;

    /* JADX INFO: renamed from: c */
    public InterfaceC10508a f52469c;

    public C10510c(Context context) {
        super(context, null);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_sentence_word, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewInflate;
        this.f52467a = new C8367u2(textView, textView, 2);
        textView.setOnClickListener(new ViewOnClickListenerC2238x(27, this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final C10509b getSentenceWord() {
        C10509b c10509b = this.f52468b;
        if (c10509b != null) {
            return c10509b;
        }
        C5207g.m11117l("sentenceWord");
        throw null;
    }

    public final void setListener(InterfaceC10508a interfaceC10508a) {
        C5207g.m11111f(interfaceC10508a, "listener");
        this.f52469c = interfaceC10508a;
    }

    public final void setSentenceWord(C10509b c10509b) {
        C5207g.m11111f(c10509b, "<set-?>");
        this.f52468b = c10509b;
    }
}
