package p000;

import com.lingq.core.domain.model.lesson.Lesson;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wy7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67524a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f67525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lesson f67526c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hx7 f67527d;

    public /* synthetic */ wy7(vi3 vi3Var, Lesson lesson, hx7 hx7Var) {
        this.f67525b = vi3Var;
        this.f67526c = lesson;
        this.f67527d = hx7Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f67524a;
        xfa xfaVar = xfa.f68157a;
        hx7 hx7Var = this.f67527d;
        Lesson lesson = this.f67526c;
        vi3 vi3Var = this.f67525b;
        switch (i) {
            case 0:
                if (lesson != null) {
                    int i2 = lesson.f19142a;
                    v15 v15Var = hx7Var.f43113b;
                    vi3Var.invoke(new ru7(i2, v15Var.f64695b, v15Var.f64696c));
                }
                break;
            default:
                if (lesson != null) {
                    int i3 = lesson.f19142a;
                    v15 v15Var2 = hx7Var.f43113b;
                    vi3Var.invoke(new vra(i3, v15Var2.f64695b, v15Var2.f64696c));
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ wy7(Lesson lesson, vi3 vi3Var, hx7 hx7Var) {
        this.f67526c = lesson;
        this.f67525b = vi3Var;
        this.f67527d = hx7Var;
    }
}
