package p000;

import android.content.SharedPreferences;
import android.graphics.Rect;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class f7a implements e7a {

    /* JADX INFO: renamed from: a */
    public final C3509qs f38587a;

    /* JADX INFO: renamed from: b */
    public Set f38588b;

    /* JADX INFO: renamed from: c */
    public final C3211a f38589c;

    /* JADX INFO: renamed from: d */
    public final du0 f38590d;

    /* JADX INFO: renamed from: e */
    public final C3211a f38591e;

    /* JADX INFO: renamed from: f */
    public final du0 f38592f;

    /* JADX INFO: renamed from: g */
    public final C3211a f38593g;

    /* JADX INFO: renamed from: h */
    public final du0 f38594h;

    /* JADX INFO: renamed from: i */
    public final C3211a f38595i;

    /* JADX INFO: renamed from: j */
    public final du0 f38596j;

    /* JADX INFO: renamed from: k */
    public final du0 f38597k;

    /* JADX INFO: renamed from: l */
    public final C3244l f38598l;

    /* JADX INFO: renamed from: m */
    public final c18 f38599m;

    /* JADX INFO: renamed from: n */
    public final C3244l f38600n;

    /* JADX INFO: renamed from: o */
    public final c18 f38601o;

    public f7a(C3509qs c3509qs) {
        c3509qs.getClass();
        this.f38587a = c3509qs;
        df4 df4Var = c3509qs.f58117a;
        SharedPreferences sharedPreferences = c3509qs.f58118b;
        TooltipStep tooltipStep = TooltipStep.Start;
        String string = sharedPreferences.getString("tooltips_current_step_7", df4Var.m10322b(new zs2("com.lingq.core.domain.model.onboarding.TooltipStep", TooltipStep.values()), tooltipStep));
        this.f38588b = u91.m22626r1(c3509qs.m20127a());
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f38589c = c3211aM10525a;
        this.f38590d = AbstractC3224d.m15519A(c3211aM10525a);
        AbstractC3224d.m15519A(do7.m10525a(-1, 6, null));
        C3211a c3211aM10525a2 = do7.m10525a(-1, 6, null);
        this.f38591e = c3211aM10525a2;
        this.f38592f = AbstractC3224d.m15519A(c3211aM10525a2);
        C3211a c3211aM10525a3 = do7.m10525a(-1, 6, null);
        this.f38593g = c3211aM10525a3;
        this.f38594h = AbstractC3224d.m15519A(c3211aM10525a3);
        C3211a c3211aM10525a4 = do7.m10525a(-1, 6, null);
        this.f38595i = c3211aM10525a4;
        this.f38596j = AbstractC3224d.m15519A(c3211aM10525a4);
        this.f38597k = AbstractC3224d.m15519A(do7.m10525a(-1, 6, null));
        Boolean bool = Boolean.TRUE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool);
        this.f38598l = c3244lM17114d;
        this.f38599m = AbstractC3224d.m15524c(c3244lM17114d);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(bool);
        this.f38600n = c3244lM17114d2;
        this.f38601o = AbstractC3224d.m15524c(c3244lM17114d2);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        if (!z) {
            mo8745Q();
        }
        ux5.m22977D(z, this.f38598l, null);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f38596j;
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f38593g.mo4677k(tooltipStep);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f38588b.add(tooltipStep);
        if (this.f38588b.size() == TooltipStep.values().length - 1) {
            this.f38588b.add(TooltipStep.Finished);
        }
        this.f38587a.m20139m(u91.m22622n1(this.f38588b));
        this.f38591e.mo4677k(tooltipStep);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f38588b.contains(tooltipStep) || this.f38588b.contains(TooltipStep.Finished);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f38595i.mo4677k(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0102 A[RETURN] */
    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        Set set = this.f38588b;
        int iM20129c = this.f38587a.m20129c();
        set.getClass();
        switch (w6a.f66459a[tooltipStep.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 9:
            case 11:
            case 14:
            case 15:
            case 18:
            case 21:
                return true;
            case 4:
                return set.contains(TooltipStep.TapBlueWord);
            case 5:
                if (set.contains(TooltipStep.TapTranslation) && d8d.m10165e(tooltipStep, iM20129c)) {
                    return true;
                }
                return false;
            case 6:
                if (set.contains(TooltipStep.FirstLingQ) || d8d.m10165e(tooltipStep, iM20129c)) {
                    return true;
                }
                return false;
            case 7:
                if (set.contains(TooltipStep.TapSecondBlueWord) && d8d.m10165e(tooltipStep, iM20129c)) {
                    return true;
                }
                return false;
            case 8:
                return d8d.m10165e(tooltipStep, iM20129c);
            case 10:
                return d8d.m10165e(tooltipStep, iM20129c);
            case 12:
                if (set.contains(TooltipStep.TapThirdBlueWord) && d8d.m10165e(tooltipStep, iM20129c)) {
                    return true;
                }
                return false;
            case 13:
                return d8d.m10165e(tooltipStep, iM20129c);
            case 16:
                if (set.contains(TooltipStep.TapThirdBlueWord) && d8d.m10165e(tooltipStep, iM20129c)) {
                    return true;
                }
                return false;
            case 17:
                if (set.contains(TooltipStep.FirstLingQ)) {
                    return true;
                }
                if (set.contains(TooltipStep.TapThirdBlueWord) && d8d.m10165e(tooltipStep, iM20129c)) {
                    return true;
                }
                return false;
            case 19:
                return set.contains(TooltipStep.TapSecondBlueWord);
            case 20:
                if (set.contains(TooltipStep.UpdateStatusHighlight) && d8d.m10165e(tooltipStep, iM20129c)) {
                    return true;
                }
                return false;
            case 22:
                if (set.contains(TooltipStep.MoveToKnown) && d8d.m10165e(tooltipStep, iM20129c)) {
                    return true;
                }
                return false;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                if (set.contains(TooltipStep.MoveToKnown) && d8d.m10165e(tooltipStep, iM20129c)) {
                    return true;
                }
                return false;
            case 24:
                return set.contains(TooltipStep.ChooseFirstLesson);
            case 25:
                return set.contains(TooltipStep.VisitAcademy);
            case 26:
                return set.containsAll(vz1.m23605K(TooltipStep.ChooseFirstLesson, TooltipStep.TapBlueWord, TooltipStep.TapTranslation, TooltipStep.FirstLingQ, TooltipStep.TapSecondBlueWord, TooltipStep.TapThirdBlueWord, TooltipStep.PlayAudio, TooltipStep.SentenceMode, TooltipStep.ReviewMenu, TooltipStep.MoveToKnown, TooltipStep.UpdateStatus, TooltipStep.LingQExpanded));
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return set.contains(TooltipStep.Finished);
            default:
                gm5.m12750e();
                return false;
        }
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        TooltipStep tooltipStep = TooltipStep.Finished;
        C3509qs c3509qs = this.f38587a;
        c3509qs.m20132f(tooltipStep);
        this.f38588b.add(tooltipStep);
        c3509qs.m20139m(u91.m22622n1(this.f38588b));
        this.f38595i.mo4677k(xfa.f68157a);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f38599m;
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        C3509qs c3509qs = this.f38587a;
        int iM20129c = c3509qs.m20129c() + 1;
        SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putInt("tutorial_lingqs", iM20129c);
        editorEdit.apply();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        if (!z) {
            mo8745Q();
        }
        ux5.m22977D(z, this.f38600n, null);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f38597k;
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        TooltipStep tooltipStepM24947b = y5aVar.m24947b();
        boolean zM10164d = d8d.m10164d(tooltipStepM24947b);
        C3509qs c3509qs = this.f38587a;
        if (zM10164d) {
            c3509qs.m20132f(tooltipStepM24947b);
            mo8742L(tooltipStepM24947b);
        } else {
            if (!((Boolean) ((C3244l) this.f38601o.f9311a).getValue()).booleanValue() || rect.isEmpty() || !mo8753Z0(tooltipStepM24947b) || this.f38588b.contains(tooltipStepM24947b) || this.f38588b.contains(TooltipStep.Finished)) {
                return;
            }
            c3509qs.m20132f(tooltipStepM24947b);
            this.f38589c.mo4677k(new b6a(y5aVar, rect, rect2, z, z2, z3, ui3Var));
        }
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f38588b = linkedHashSet;
        TooltipStep tooltipStep = TooltipStep.Start;
        linkedHashSet.add(tooltipStep);
        Boolean bool = Boolean.TRUE;
        C3244l c3244l = this.f38600n;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        C3509qs c3509qs = this.f38587a;
        SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putInt("tutorial_lingqs", 0);
        editorEdit.apply();
        SharedPreferences.Editor editorEdit2 = c3509qs.f58118b.edit();
        editorEdit2.getClass();
        editorEdit2.putInt("tutorial_known_words", 0);
        editorEdit2.apply();
        c3509qs.m20132f(tooltipStep);
        c3509qs.m20139m(u91.m22622n1(this.f38588b));
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f38594h;
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f38590d;
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f38592f;
    }
}
