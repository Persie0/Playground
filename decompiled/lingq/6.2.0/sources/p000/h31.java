package p000;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.facebook.login.DeviceAuthDialog;
import com.google.android.material.datepicker.C1058f;
import com.lingq.core.achievements.RepairStreakFragment;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.web.WebViewFragment;
import com.lingq.feature.dictionary.DictionariesManageFragment;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment;
import com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h31 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f41743b;

    public /* synthetic */ h31(Object obj, int i) {
        this.f41742a = i;
        this.f41743b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f41742a;
        Object obj = this.f41743b;
        switch (i) {
            case 0:
                l31 l31Var = (l31) obj;
                EditText editText = l31Var.f48963i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    l31Var.f48963i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                l31Var.m14638p();
                return;
            case 1:
                ((DeviceAuthDialog) obj).m5207n0();
                return;
            case 2:
                bh4[] bh4VarArr = DictionariesManageFragment.f25721W0;
                ((DictionariesManageFragment) obj).mo3657c0();
                return;
            case 3:
                ((ym2) obj).m25198t();
                return;
            case 4:
                LessonDealWithWordsFragment lessonDealWithWordsFragment = (LessonDealWithWordsFragment) obj;
                lessonDealWithWordsFragment.f29493Y0 = true;
                hm5 hm5Var = lessonDealWithWordsFragment.f29492X0;
                if (hm5Var == null) {
                    fa4.m11636J("analytics");
                    throw null;
                }
                ((C1240a) hm5Var).m7025f("Paging prompt go back clicked", null);
                if (lessonDealWithWordsFragment.m9348B0().f29652h != -1) {
                    lessonDealWithWordsFragment.m9347A0().f29264B1.mo4677k(Integer.valueOf(lessonDealWithWordsFragment.m9348B0().f29652h));
                }
                b34.m3244j(lessonDealWithWordsFragment).m22689f();
                return;
            case 5:
                bh4[] bh4VarArr2 = LessonVocabularyFragment.f29676G0;
                b34.m3244j((LessonVocabularyFragment) obj).m22689f();
                return;
            case 6:
                ((C1058f) obj).m6126l0();
                throw null;
            case 7:
                b57 b57Var = (b57) obj;
                EditText editText2 = b57Var.f7968f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = b57Var.f7968f;
                boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText4 = b57Var.f7968f;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    b57Var.f7968f.setSelection(selectionEnd);
                }
                b57Var.m14638p();
                return;
            case 8:
                ReaderPageFragment readerPageFragment = (ReaderPageFragment) obj;
                vx7 vx7Var = ReaderPageFragment.Companion;
                if (readerPageFragment.m9298W0().f29340b.mo4595s1()) {
                    readerPageFragment.m9299X0().m9304Y2(readerPageFragment.m9298W0().m9332l3());
                    return;
                } else {
                    readerPageFragment.m9298W0().mo3737M1(UpgradeReason.SENTENCES_TRANSLATIONS);
                    return;
                }
            case 9:
                bh4[] bh4VarArr3 = RepairStreakFragment.f14177T0;
                ((RepairStreakFragment) obj).m3659e0(false, false);
                return;
            case 10:
                tx8 tx8Var = (tx8) obj;
                kw8 kw8Var = tx8Var.f63062b;
                if (kw8Var != null) {
                    kw8Var.mo9668a(tx8Var.getSentenceWord());
                    return;
                }
                return;
            case 11:
                ((gr9) ((te8) obj).f62199g).getClass();
                return;
            case 12:
                ((vg1) obj).mo10699a(xfa.f68157a);
                return;
            case 13:
                ((g3b) obj).cancel();
                return;
            default:
                bh4[] bh4VarArr4 = WebViewFragment.f24315V0;
                b34.m3244j((WebViewFragment) obj).m22689f();
                return;
        }
    }
}
