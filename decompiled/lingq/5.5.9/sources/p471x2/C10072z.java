package p471x2;

import android.text.TextUtils;
import android.view.View;
import com.linguist.R;

/* JADX INFO: renamed from: x2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C10072z extends C10029b0.b<CharSequence> {
    public C10072z() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: b */
    public final CharSequence mo18642b(View view) {
        return C10029b0.o.m18771a(view);
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: c */
    public final void mo18643c(View view, CharSequence charSequence) {
        C10029b0.o.m18772b(view, charSequence);
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: f */
    public final boolean mo18644f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
