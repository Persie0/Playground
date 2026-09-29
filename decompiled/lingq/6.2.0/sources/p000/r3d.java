package p000;

import com.lingq.feature.onboarding.R$string;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r3d {

    /* JADX INFO: renamed from: a */
    public static p04 f58584a;

    /* JADX INFO: renamed from: a */
    public static final void m20286a(Set set, vi3 vi3Var, boolean z, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        set.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1321453873);
        int i2 = i | (tj3Var.m22124i(set) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            List listM23605K = vz1.m23605K(new m99("listening", R$string.onboarding_v2_skills_listening, "🎧"), new m99("speaking", R$string.onboarding_v2_skills_speaking, "🗣️"), new m99("grammar", R$string.onboarding_v2_skills_grammar, "📝"), new m99("vocabulary", R$string.onboarding_v2_skills_vocabulary, "📕"), new m99("reading", R$string.onboarding_v2_skills_reading, "📚"), new m99("writing", R$string.onboarding_v2_skills_writing, "🖊️"));
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_skills_title);
            String strM23620a1 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_skills_subtitle);
            b16 b16Var = b16.f7762a;
            gxb.m12966b(strM23620a0, z, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue), ui3Var, b16Var, strM23620a1, ci8.m4703P(-560523363, new ie0(listM23605K, set, vi3Var, i3), tj3Var), tj3Var, (i2 & 7168) | ((i2 >> 3) & 112) | 1572864 | 24576, 0);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new n99(set, vi3Var, z, ui3Var, e16Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m20287b() {
        p04 p04Var = f58584a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("AutoMirrored.Rounded.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(19.0f, 11.0f);
        f57Var.m11549d(7.83f);
        f57Var.m11552g(4.88f, -4.88f);
        f57Var.m11548c(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        f57Var.m11552g(-6.59f, 6.59f);
        f57Var.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        f57Var.m11552g(6.59f, 6.59f);
        f57Var.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        f57Var.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        f57Var.m11551f(7.83f, 13.0f);
        f57Var.m11549d(19.0f);
        f57Var.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        f57Var.m11555j(-0.45f, -1.0f, -1.0f, -1.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f58584a = p04VarM17721b;
        return p04VarM17721b;
    }
}
