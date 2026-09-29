package p471x2;

import android.view.View;
import com.linguist.R;

/* JADX INFO: renamed from: x2.x */
/* JADX INFO: loaded from: classes.dex */
public final class C10070x extends C10029b0.b<Boolean> {
    public C10070x() {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: b */
    public final Boolean mo18642b(View view) {
        return Boolean.valueOf(C10029b0.m.m18761d(view));
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: c */
    public final void mo18643c(View view, Boolean bool) {
        C10029b0.m.m18766i(view, bool.booleanValue());
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: f */
    public final boolean mo18644f(Boolean bool, Boolean bool2) {
        return !C10029b0.b.m18660a(bool, bool2);
    }
}
