package p471x2;

import android.text.TextUtils;
import android.view.View;
import com.linguist.R;

/* JADX INFO: renamed from: x2.y */
/* JADX INFO: loaded from: classes.dex */
public final class C10071y extends C10029b0.b<CharSequence> {
    public C10071y() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: b */
    public final CharSequence mo18642b(View view) {
        return C10029b0.m.m18759b(view);
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: c */
    public final void mo18643c(View view, CharSequence charSequence) {
        C10029b0.m.m18765h(view, charSequence);
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: f */
    public final boolean mo18644f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
