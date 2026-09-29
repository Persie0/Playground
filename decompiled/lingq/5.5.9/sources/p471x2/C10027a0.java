package p471x2;

import android.view.View;
import com.linguist.R;

/* JADX INFO: renamed from: x2.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10027a0 extends C10029b0.b<Boolean> {
    public C10027a0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: b */
    public final Boolean mo18642b(View view) {
        return Boolean.valueOf(C10029b0.m.m18760c(view));
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: c */
    public final void mo18643c(View view, Boolean bool) {
        C10029b0.m.m18764g(view, bool.booleanValue());
    }

    @Override // p471x2.C10029b0.b
    /* JADX INFO: renamed from: f */
    public final boolean mo18644f(Boolean bool, Boolean bool2) {
        return !C10029b0.b.m18660a(bool, bool2);
    }
}
