package p000;

import com.lingq.core.common.AbstractC1261a;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class e01 extends wta {

    /* JADX INFO: renamed from: b */
    public final km7 f36478b;

    /* JADX INFO: renamed from: c */
    public final nn1 f36479c;

    /* JADX INFO: renamed from: d */
    public final c01 f36480d;

    /* JADX INFO: renamed from: e */
    public final C3244l f36481e;

    /* JADX INFO: renamed from: f */
    public final c18 f36482f;

    /* JADX INFO: renamed from: g */
    public final C3211a f36483g;

    /* JADX INFO: renamed from: h */
    public final du0 f36484h;

    public e01(km7 km7Var, nn1 nn1Var, nl8 nl8Var) {
        km7Var.getClass();
        nl8Var.getClass();
        this.f36478b = km7Var;
        this.f36479c = nn1Var;
        c01.Companion.getClass();
        if (!nl8Var.m17487a("email")) {
            C3386nv.m17626m("Required argument \"email\" is missing and does not have an android:defaultValue");
            throw null;
        }
        String str = (String) nl8Var.m17488b("email");
        if (str == null) {
            C3386nv.m17626m("Argument \"email\" is marked as non-null but was passed a null value");
            throw null;
        }
        this.f36480d = new c01(str);
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool);
        this.f36481e = c3244lM17114d;
        this.f36482f = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), xi9.f68262a, bool);
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f36483g = c3211aM7042a;
        this.f36484h = AbstractC3224d.m15519A(c3211aM7042a);
    }
}
