package p000;

import com.lingq.core.domain.model.lesson.LessonWord;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dz4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36456a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f36457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f36458c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f36459d;

    public /* synthetic */ dz4(vi3 vi3Var, vi3 vi3Var2, boolean z) {
        this.f36457b = vi3Var;
        this.f36459d = vi3Var2;
        this.f36458c = z;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f36456a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f36457b;
        Object obj = this.f36459d;
        boolean z = this.f36458c;
        switch (i) {
            case 0:
                LessonWord lessonWord = (LessonWord) obj;
                if (!z) {
                    vi3Var.invoke(sja.f60942a);
                } else {
                    vi3Var.invoke(new nja(lessonWord));
                }
                break;
            case 1:
                vi3 vi3Var2 = (vi3) obj;
                vi3Var.invoke(za7.f71289a);
                vi3Var2.invoke(z ? jbb.f45386a : lbb.f49418a);
                break;
            default:
                ui3 ui3Var = (ui3) obj;
                if (!z) {
                    vi3Var.invoke(o0b.f53564a);
                } else {
                    ui3Var.mo0a();
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ dz4(boolean z, ui3 ui3Var, vi3 vi3Var) {
        this.f36458c = z;
        this.f36459d = ui3Var;
        this.f36457b = vi3Var;
    }

    public /* synthetic */ dz4(boolean z, vi3 vi3Var, LessonWord lessonWord) {
        this.f36458c = z;
        this.f36457b = vi3Var;
        this.f36459d = lessonWord;
    }
}
