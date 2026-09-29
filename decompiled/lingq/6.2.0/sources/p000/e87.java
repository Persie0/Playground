package p000;

import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e87 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w65 f36841b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f36842c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f36843d;

    public /* synthetic */ e87(w65 w65Var, vi3 vi3Var, t66 t66Var, int i) {
        this.f36840a = i;
        this.f36841b = w65Var;
        this.f36842c = vi3Var;
        this.f36843d = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f36840a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f36843d;
        vi3 vi3Var = this.f36842c;
        w65 w65Var = this.f36841b;
        switch (i) {
            case 0:
                if (!(w65Var instanceof e05)) {
                    t66Var.setValue(Boolean.TRUE);
                } else {
                    vi3Var.invoke(w65Var);
                }
                break;
            default:
                if ((w65Var instanceof LessonWord) && fa4.m11650l(((LessonWord) w65Var).f19322i, WordStatus.New.getValue())) {
                    vi3Var.invoke(w65Var);
                } else {
                    t66Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return xfaVar;
    }
}
